package com.ljmu.andre.snaptools.ModulePack.Utils;

import android.support.annotation.NonNull;
import android.widget.ImageView.ScaleType;

import com.ljmu.andre.ConstantDefiner.ConstantDefiner;
import com.ljmu.andre.GsonPreferences.Preferences.ConditionalCheck;
import com.ljmu.andre.GsonPreferences.Preferences.Preference;
import com.ljmu.andre.snaptools.ModulePack.Notifications.DotNotification.DotLocation;
import com.ljmu.andre.snaptools.ModulePack.Notifications.SaveNotification.NotificationType;
import com.ljmu.andre.snaptools.ModulePack.Notifications.StackingDotNotification.StackingOrientation;

import java.util.HashMap;
import java.util.HashSet;

import hugo.weaving.DebugLog;

import static com.ljmu.andre.GsonPreferences.Preferences.getPref;
import static com.ljmu.andre.snaptools.Utils.FrameworkPreferencesDef.CONTENT_PATH;

/**
 * This class was created by Andre R M (SID: 701439)
 * It and its contents are free to use by all
 */

public class ModulePreferenceDef extends ConstantDefiner<Preference> {
	/**
	 * ===========================================================================
	 * Strings
	 * ===========================================================================
	 */
	public static final Preference STORAGE_FORMAT = new Preference(
			"STORAGE_FORMAT",
			"SnapType->Username->Snaps", String.class
	);

	public static final Preference MEDIA_PATH = new Preference(
			"MEDIA_PATH",
			null, String.class, new ConditionalCheck() {
		@DebugLog @NonNull @Override protected Object performConditionCheck(Preference preference, Object preferenceVal) {
			return getPref(CONTENT_PATH) + "Media/";
		}
	});


	public static final Preference FONTS_PATH = new Preference(
			"FONT_PATH",
			null, String.class, new ConditionalCheck() {
		@NonNull @Override protected Object performConditionCheck(Preference preference, Object preferenceVal) {
			return getPref(CONTENT_PATH) + "Fonts/";
		}
	});

	public static final Preference CHAT_EXPORT_PATH = new Preference(
			"CHAT_EXPORT_PATH",
			null, String.class, new ConditionalCheck() {
		@DebugLog @NonNull @Override protected Object performConditionCheck(Preference preference, Object preferenceVal) {
			return getPref(CONTENT_PATH) + "ExportedChats/";
		}
	});

	public static final Preference BACKUPS_PATH = new Preference(
			"BACKUPS_PATH",
			null, String.class, new ConditionalCheck() {
		@DebugLog @NonNull @Override protected Object performConditionCheck(Preference preference, Object preferenceVal) {
			return getPref(CONTENT_PATH) + "Backups/";
		}
	});

	public static final Preference ACCOUNTS_PATH = new Preference(
			"ACCOUNTS_PATH",
			null, String.class, new ConditionalCheck() {
		@DebugLog @NonNull @Override protected Object performConditionCheck(Preference preference, Object preferenceVal) {
			return getPref(CONTENT_PATH) + "Accounts/";
		}
	});

	public static final Preference RECEIVED_FOLDER_NAME = new Preference(
			"RECEIVED_FOLDER_NAME",
			"Received", String.class
	);

	public static final Preference STORY_FOLDER_NAME = new Preference(
			"STORY_FOLDER_NAME",
			"Stories", String.class
	);

	public static final Preference CHAT_FOLDER_NAME = new Preference(
			"CHAT_FOLDER_NAME",
			"ChatMedia", String.class
	);

	public static final Preference GROUP_FOLDER_NAME = new Preference(
			"GROUP_FOLDER_NAME",
			"Groups", String.class
	);

	public static final Preference SENT_FOLDER_NAME = new Preference(
			"SENT_FOLDER_NAME",
			"Sent", String.class
	);

	public static final Preference SAVE_NOTIFICATION_TYPE = new Preference(
			"SAVE_NOTIFICATION_TYPE",
			NotificationType.DOT.getDisplayText(), String.class
	);

	public static final Preference DOT_LOCATION = new Preference(
			"DOT_LOCATION",
			DotLocation.BOTTOM_LEFT.getDisplayText(), String.class
	);

	public static final Preference STACKED_ORIENTATION = new Preference(
			"STACKED_ORIENTATION",
			StackingOrientation.HORIZONTAL.getDisplayText(), String.class
	);
	
	public static final Preference CURRENT_FONT = new Preference(
			"CURRENT_FONT",
			"Default", String.class
	);

	public static final Preference SC_USERNAME = new Preference(
			"SC_USERNAME",
			"", String.class
	);

	// ===========================================================================

	// ===========================================================================

	/**
	 * ===========================================================================
	 * Maps
	 * ===========================================================================
	 */
	public static final Preference SAVING_MODES = new Preference(
			"SAVING_MODES",
			new HashMap<String, String>(), HashMap.class
	);

	public static final Preference SAVE_BUTTON_LOCATIONS = new Preference(
			"SAVE_BUTTON_LOCATIONS",
			new HashMap<String, String>(), HashMap.class
	);

	public static final Preference SAVE_BUTTON_WIDTHS = new Preference(
			"SAVE_BUTTON_WIDTHS",
			new HashMap<String, Integer>(), HashMap.class
	);

	public static final Preference SAVE_BUTTON_RELATIVE_HEIGHTS = new Preference(
			"SAVE_BUTTON_RELATIVE_HEIGHTS",
			new HashMap<String, Integer>(), HashMap.class
	);

	public static final Preference SAVE_BUTTON_OPACITIES = new Preference(
			"SAVE_BUTTON_OPACITIES",
			new HashMap<String, Integer>(), HashMap.class
	);

	public static final Preference FLING_VELOCITY = new Preference(
			"FLING_VELOCITY",
			new HashMap<String, Integer>(), HashMap.class
	);

	// ===========================================================================

	/**
	 * ===========================================================================
	 * Sets
	 * ===========================================================================
	 */
	public static final Preference BLOCKED_STORIES = new Preference(
			"BLOCKED_STORIES",
			new HashSet<String>(), HashSet.class
	);

	// ===========================================================================

	/**
	 * ===========================================================================
	 * Booleans
	 * ===========================================================================
	 */
	public static final Preference SAVE_SENT_SNAPS = new Preference(
			"SAVE_SENT_SNAPS",
			true, Boolean.class
	);


	public static final Preference SAVE_CHAT_IN_SC = new Preference(
			"SAVE_CHAT_IN_SC",
			false, Boolean.class
	);

	public static final Preference STORE_CHAT_MESSAGES = new Preference(
			"STORE_CHAT_MESSAGES",
			true, Boolean.class
	);

	public static final Preference VIBRATE_ON_SAVE = new Preference(
			"VIBRATE_ON_SAVE",
			true, Boolean.class
	);

	public static final Preference LED_INFO_ALREADY_SENT = new Preference(
			"LED_INFO_ALREADY_SENT",
			false, Boolean.class
	);

	public static final Preference STORY_BLOCKER_DISCOVER_BLOCKED = new Preference(
			"STORY_BLOCKER_DISCOVER_BLOCKED",
			true, Boolean.class
	);

	public static final Preference STORY_BLOCKER_ADVERTS_BLOCKED = new Preference(
			"STORY_BLOCKER_ADVERTS_BLOCKED",
			true, Boolean.class
	);

	public static final Preference STORY_BLOCKER_SHOW_BUTTON = new Preference(
			"STORY_BLOCKER_SHOW_BUTTON",
			true, Boolean.class
	);

	public static final Preference FORCE_MULTILINE = new Preference(
			"FORCE_MULTILINE",
			true, Boolean.class
	);

	public static final Preference CUT_BUTTON = new Preference(
			"CUT_BUTTON",
			true, Boolean.class
	);

	public static final Preference COPY_BUTTON = new Preference(
			"COPY_BUTTON",
			true, Boolean.class
	);

	public static final Preference PASTE_BUTTON = new Preference(
			"PASTE_BUTTON",
			true, Boolean.class
	);

	public static final Preference UNLIMITED_VIEWING_VIDEOS = new Preference(
			"UNLIMITED_VIEWING_VIDEOS",
			true, Boolean.class
	);

	public static final Preference UNLIMITED_VIEWING_IMAGES = new Preference(
			"UNLIMITED_VIEWING_IMAGES",
			true, Boolean.class
	);

	public static final Preference BLOCK_TYPING_NOTIFICATIONS = new Preference(
			"BLOCK_TYPING_NOTIFICATIONS",
			false, Boolean.class
	);

	/**
	 * ===========================================================================
	 * Integers
	 * ===========================================================================
	 */
	public static final Preference BATCHED_MEDIA_CAP = new Preference(
			"BATCHED_MEDIA_CAP",
			6, Integer.class
	);

	/**
	 * ===========================================================================
	 * Longs
	 * ===========================================================================
	 */
	public static final Preference LAST_CHECK_KNOWN_BUGS = new Preference(
			"LAST_CHECK_KNOWN_BUGS",
			0L, Long.class
	);
}
