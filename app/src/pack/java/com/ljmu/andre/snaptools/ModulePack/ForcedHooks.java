package com.ljmu.andre.snaptools.ModulePack;

import android.app.Activity;

import com.ljmu.andre.snaptools.Fragments.FragmentHelper;
import com.ljmu.andre.snaptools.Utils.XposedUtils.ST_MethodHook;

import de.robv.android.xposed.XC_MethodReplacement;
import timber.log.Timber;

import static com.ljmu.andre.GsonPreferences.Preferences.getPref;
import static com.ljmu.andre.snaptools.ModulePack.HookDefinitions.HookDef.AB_TEST_CHECK_BOOLEAN;
import static com.ljmu.andre.snaptools.ModulePack.HookDefinitions.HookDef.AB_TEST_CHECK_FLOAT;
import static com.ljmu.andre.snaptools.ModulePack.HookDefinitions.HookDef.AB_TEST_CHECK_INT;
import static com.ljmu.andre.snaptools.ModulePack.HookDefinitions.HookDef.AB_TEST_CHECK_LONG;
import static com.ljmu.andre.snaptools.ModulePack.HookDefinitions.HookDef.AB_TEST_CHECK_STRING;
import static com.ljmu.andre.snaptools.ModulePack.HookDefinitions.HookDef.ERROR_SUPPRESS_DOWNLOADER_RUNNABLE;
import static com.ljmu.andre.snaptools.ModulePack.HookDefinitions.HookDef.NETWORK_EXECUTE_SYNC;
import static com.ljmu.andre.snaptools.ModulePack.Utils.ModulePreferenceDef.STORY_BLOCKER_ADVERTS_BLOCKED;
import static com.ljmu.andre.snaptools.ModulePack.Utils.ModulePreferenceDef.STORY_BLOCKER_DISCOVER_BLOCKED;
import static com.ljmu.andre.snaptools.Utils.FrameworkPreferencesDef.DISABLED_MODULES;
import static com.ljmu.andre.snaptools.Utils.PreferenceHelpers.collectionContains;
import static com.ljmu.andre.snaptools.Utils.StringEncryptor.decryptMsg;
import static de.robv.android.xposed.XposedHelpers.callMethod;
import static de.robv.android.xposed.XposedHelpers.findAndHookMethod;
import static de.robv.android.xposed.XposedHelpers.findClass;

/**
 * This class was created by Andre R M (SID: 701439)
 * It and its contents are free to use by all
 */

public class ForcedHooks extends ModuleHelper {
    private static final String DEVICE_ID;

    static {
        StringBuilder deviceIdBuilder = new StringBuilder();

        for (int i = 0; i < 16; i++)
            deviceIdBuilder.append((int) Math.floor(Math.random() * 10));

        DEVICE_ID = deviceIdBuilder.toString();
    }

    private boolean miscChangesEnabled;

    public ForcedHooks(String name, boolean canBeDisabled) {
        super(name, canBeDisabled);
    }

    @Override public FragmentHelper[] getUIFragments() {
        return new FragmentHelper[0];
    }

    @Override public void loadHooks(ClassLoader snapClassLoader, Activity snapActivity) {
        boolean blockDiscovery = getPref(STORY_BLOCKER_DISCOVER_BLOCKED);
        boolean blockAds = getPref(STORY_BLOCKER_ADVERTS_BLOCKED);

        miscChangesEnabled = !collectionContains(DISABLED_MODULES, /*Misc Changes*/ decryptMsg(new byte[]{-107, -91, -53, -59, -70, -40, -71, -32, 113, 120, 77, 33, 5, 83, -69, 0}));

        /**
         * ===========================================================================
         * Returns TRUE to mark SC as DEBUG build
         * ===========================================================================
         */
        findAndHookMethod(
                "aqly", snapClassLoader,
                "p", XC_MethodReplacement.returnConstant(true)
        );

        /**Device ID Spoofing, not needed since my support team are a bunch of cunts**/
//		findAndHookMethod(
//				Secure.class,
//				"getString", ContentResolver.class, String.class,
//				new HookWrapper((HookBefore) param -> {
//					if (param.args[1].equals(Secure.ANDROID_ID)) {
//						param.setResult(DEVICE_ID);
//					}
//				})
//		);


//		findAndHookMethod(
//				"tfj", snapClassLoader,
//				"a", findClass("tfj$c", snapClassLoader),
//				new ST_MethodHook() {
//					@Override protected void after(MethodHookParam param) throws Throwable {
//						Timber.d("Inbound debug item: " + param.args[0] + " | " + param.getResult());
//
//						Enum debugEnum = (Enum) param.args[0];
//
//						switch (debugEnum.name()) {
//							case "CROP_SNAP_ENABLED":
//								param.setResult(true);
//								break;
//						}
//					}
//				}
//		);

        //Forced Chronological Friends Feed
//		findAndHookMethod(
//				"ifj", snapClassLoader,
//				"a", List.class, findClass("sda", snapClassLoader),
//				new HookWrapper((HookBefore) param -> XposedHelpers.setObjectField(param.thisObject, "a", null))
//		);

        HookAfter experimentDebugHook = null;

//		if (Constants.getApkVersionCode() >= 73 && Constants.isApkDebug())
//			experimentDebugHook = this::handleExperimentPrinting;

        findAndHookMethod(
                "aqkk", snapClassLoader,
                "a", findClass("aqkl", snapClassLoader), Object.class,
                new HookWrapper(
                        param -> {
                            String key = (String) callMethod(param.args[0], "a");

                            switch (key) {

                                /**
                                 * ===========================================================================
                                 * Forced Enabled Settings
                                 * ===========================================================================
                                 */
                                case "nycEnableStreaming":
                                case "developerOptionsNycSearchStreamingAbtestOverride":
                                case "developerOptionsNycPublicStoryStreamingAbtestOverride":
                                    param.setResult("FALSE");
                                    break;
                                case "discover_feed_tab_mode":
                                    param.setResult("FORCE_ON");
                                    break;
                                case "discover_feed_should_show_subscribed_tab_nux":
                                    param.setResult(true);
                                    break;
                                case "enable geofilters":
                                    param.setResult(true);
                                    break;
                            }
                        },
                        experimentDebugHook
                )
        );

        ST_MethodHook abTestHook = new HookWrapper(
                (HookBefore) param -> {
                    String groupName = (String) param.args[0];
                    String experimentName = (String) param.args[1];

                    String key = groupName + ":" + experimentName;

                    switch (key) {

                        case "ADS_HOLDOUT_01:SHOW_ADS":
                        case "ADS_HOLDOUT_01:ADS_IN_AA":
                            if (blockAds)
                                param.setResult(false);
                            break;
                        case "CRASHLYTICS:USE_CRASHLYTICS":
                            param.setResult(false);
                            break;
                        case "PUBLIC_STORY_STREAMING_ANDROID:enable":
                        case "STREAMING_PROMOTED_STORIES_ANDROID:enable":
                            param.setResult(false);
                            break;
                    }
                },
//				(Constants.getApkVersionCode() >= 73 && Constants.isApkDebug()) ?
//						(HookAfter) param -> handleABTestPrinting(param) : null
                null
        );
        hookMethod(
                AB_TEST_CHECK_STRING,
                abTestHook
        );

        hookMethod(
                AB_TEST_CHECK_INT,
                abTestHook
        );

        hookMethod(
                AB_TEST_CHECK_LONG,
                abTestHook
        );

        hookMethod(
                AB_TEST_CHECK_BOOLEAN,
                abTestHook
        );

        hookMethod(
                AB_TEST_CHECK_FLOAT,
                abTestHook
        );

        hookMethod(
                NETWORK_EXECUTE_SYNC,
                new ST_MethodHook() {
                    @Override protected void before(MethodHookParam param) throws Throwable {
                        String url = (String) callMethod(param.thisObject, "getUrl");

                        Timber.d("Network URL: " + url);

                        if (url.contains("logout")) {
                            Timber.d("Blocking logout");
                            param.setResult(null);
                        }
                    }
                }
        );

        // Error suppression methods =================================================
        hookMethod(
                ERROR_SUPPRESS_DOWNLOADER_RUNNABLE,
                new HookWrapper((HookAfter) param -> {
                    if (param.getThrowable() != null) {
                        Timber.e(param.getThrowable());
                        param.setThrowable(null);
                    }
                })
        );


        /**
         * ===========================================================================
         * Just used as a fatal crash prevention... Likely just moves the issue
         * ===========================================================================
         */
//		XposedHelpers.findAndHookMethod(
//				"htt", snapClassLoader,
//				"a",
//				new ST_MethodHook() {
//					@Override protected void after(MethodHookParam param) throws Throwable {
//						if (param.getThrowable() != null) {
//							Timber.e(new Throwable(
//									"Error raised from lens: " +
//											XposedHelpers.getObjectField(param.thisObject, "d").toString(),
//									param.getThrowable()
//							));
//
//							param.setResult(false);
//						}
//					}
//				}
//		);

        /**
         * ===========================================================================
         * Just used as a fatal crash prevention... Likely just moves the issue
         * ===========================================================================
         */
//		XposedHelpers.findAndHookMethod(
//				"hto", snapClassLoader,
//				"c", String.class,
//				new ST_MethodHook() {
//					@Override protected void after(MethodHookParam param) throws Throwable {
//						if (param.getThrowable() != null) {
//							Timber.e(new Throwable(
//									"Error raised checking lens set content",
//									param.getThrowable()
//							));
//
//							param.setResult(false);
//						}
//					}
//				}
//		);
    }}