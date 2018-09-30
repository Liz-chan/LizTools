package com.ljmu.andre.snaptools.ModulePack;

import android.app.Activity;

import com.ljmu.andre.GsonPreferences.Preferences.Preference;
import com.ljmu.andre.snaptools.Fragments.FragmentHelper;
import com.ljmu.andre.snaptools.Utils.XposedUtils.ST_MethodHook;

import de.robv.android.xposed.XC_MethodHook.MethodHookParam;
import de.robv.android.xposed.XC_MethodReplacement;
import timber.log.Timber;

import static com.ljmu.andre.GsonPreferences.Preferences.getPref;
import static com.ljmu.andre.snaptools.ModulePack.HookDefinitions.HookDef.ERROR_SUPPRESS_DOWNLOADER_RUNNABLE;
import static com.ljmu.andre.snaptools.Utils.FrameworkPreferencesDef.DISABLED_MODULES;
import static com.ljmu.andre.snaptools.Utils.PreferenceHelpers.collectionContains;
import static de.robv.android.xposed.XposedHelpers.callMethod;
import static de.robv.android.xposed.XposedHelpers.findAndHookMethod;
import static de.robv.android.xposed.XposedHelpers.findClass;

/**
 * This class was created by Andre R M (SID: 701439)
 * It and its contents are free to use by all
 */

public class ForcedHooks extends ModuleHelper {
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

		miscChangesEnabled = !collectionContains(DISABLED_MODULES, "Misc Changes");

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
						case "DOWNSCALE_TAKE_PICTURE_API_PHOTO_BEFORE_SEND:ENABLED":
							handleExperiment(param, camera2ModeBool);
							break;
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
