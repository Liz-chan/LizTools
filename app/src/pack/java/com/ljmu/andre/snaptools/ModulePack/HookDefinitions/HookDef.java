package com.ljmu.andre.snaptools.ModulePack.HookDefinitions;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import com.ljmu.andre.ConstantDefiner.Constant;
import com.ljmu.andre.ConstantDefiner.ConstantDefiner;
import com.ljmu.andre.snaptools.ModulePack.HookDefinitions.HookClassDef.HookClass;
import com.ljmu.andre.snaptools.ModulePack.HookDefinitions.HookDef.Hook;

import java.io.InputStream;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import static com.ljmu.andre.snaptools.ModulePack.HookDefinitions.HookClassDef.AB_TEST_MANAGER;
import static com.ljmu.andre.snaptools.ModulePack.HookDefinitions.HookClassDef.CAMERA_FRAGMENT;
import static com.ljmu.andre.snaptools.ModulePack.HookDefinitions.HookClassDef.CAPTION_MANAGER_CLASS;
import static com.ljmu.andre.snaptools.ModulePack.HookDefinitions.HookClassDef.CHAT_IMAGE_METADATA;
import static com.ljmu.andre.snaptools.ModulePack.HookDefinitions.HookClassDef.CHAT_MESSAGE_VIEW_HOLDER;
import static com.ljmu.andre.snaptools.ModulePack.HookDefinitions.HookClassDef.CHAT_METADATA;
import static com.ljmu.andre.snaptools.ModulePack.HookDefinitions.HookClassDef.CHAT_METADATA_JSON_PARSER;
import static com.ljmu.andre.snaptools.ModulePack.HookDefinitions.HookClassDef.CHAT_METADATA_JSON_PARSER_SECOND;
import static com.ljmu.andre.snaptools.ModulePack.HookDefinitions.HookClassDef.CHAT_NOTIFICATION_CREATOR;
import static com.ljmu.andre.snaptools.ModulePack.HookDefinitions.HookClassDef.CHAT_VIDEO;
import static com.ljmu.andre.snaptools.ModulePack.HookDefinitions.HookClassDef.CHAT_VIDEO_METADATA;
import static com.ljmu.andre.snaptools.ModulePack.HookDefinitions.HookClassDef.COUNTDOWNTIMER_VIEW;
import static com.ljmu.andre.snaptools.ModulePack.HookDefinitions.HookClassDef.DOWNLOADER_RUNNABLE;
import static com.ljmu.andre.snaptools.ModulePack.HookDefinitions.HookClassDef.ENCRYPTED_STREAM_BUILDER;
import static com.ljmu.andre.snaptools.ModulePack.HookDefinitions.HookClassDef.ENCRYPTION_ALGORITHM;
import static com.ljmu.andre.snaptools.ModulePack.HookDefinitions.HookClassDef.EXPERIMENT_BASE;
import static com.ljmu.andre.snaptools.ModulePack.HookDefinitions.HookClassDef.FONT_CLASS;
import static com.ljmu.andre.snaptools.ModulePack.HookDefinitions.HookClassDef.FRIEND_PROFILE_POPUP_FRAGMENT;
import static com.ljmu.andre.snaptools.ModulePack.HookDefinitions.HookClassDef.GROUP_SNAP_METADATA;
import static com.ljmu.andre.snaptools.ModulePack.HookDefinitions.HookClassDef.META_DATA_BUILDER;
import static com.ljmu.andre.snaptools.ModulePack.HookDefinitions.HookClassDef.NEW_CONCENTRIC_TIMERVIEW;
import static com.ljmu.andre.snaptools.ModulePack.HookDefinitions.HookClassDef.OPERA_PAGE_VIEW;
import static com.ljmu.andre.snaptools.ModulePack.HookDefinitions.HookClassDef.RECEIVED_SNAP;
import static com.ljmu.andre.snaptools.ModulePack.HookDefinitions.HookClassDef.RECEIVED_SNAP_ENCRYPTION;
import static com.ljmu.andre.snaptools.ModulePack.HookDefinitions.HookClassDef.SCREENSHOT_DETECTOR;
import static com.ljmu.andre.snaptools.ModulePack.HookDefinitions.HookClassDef.SENT_BATCHED_VIDEO;
import static com.ljmu.andre.snaptools.ModulePack.HookDefinitions.HookClassDef.SENT_SNAP_BASE;
import static com.ljmu.andre.snaptools.ModulePack.HookDefinitions.HookClassDef.SENT_VIDEO;
import static com.ljmu.andre.snaptools.ModulePack.HookDefinitions.HookClassDef.SNAP_BASE;
import static com.ljmu.andre.snaptools.ModulePack.HookDefinitions.HookClassDef.SNAP_COUNTDOWN_CONTROLLER;
import static com.ljmu.andre.snaptools.ModulePack.HookDefinitions.HookClassDef.SNAP_STATUS;
import static com.ljmu.andre.snaptools.ModulePack.HookDefinitions.HookClassDef.STORY_ADVANCER;
import static com.ljmu.andre.snaptools.ModulePack.HookDefinitions.HookClassDef.STORY_FRIEND_VIEWED;
import static com.ljmu.andre.snaptools.ModulePack.HookDefinitions.HookClassDef.STORY_LOADER;
import static com.ljmu.andre.snaptools.ModulePack.HookDefinitions.HookClassDef.STORY_MANAGER;
import static com.ljmu.andre.snaptools.ModulePack.HookDefinitions.HookClassDef.STORY_METADATA;
import static com.ljmu.andre.snaptools.ModulePack.HookDefinitions.HookClassDef.STORY_METADATA_LOADER;
import static com.ljmu.andre.snaptools.ModulePack.HookDefinitions.HookClassDef.STORY_SNAP;
import static com.ljmu.andre.snaptools.ModulePack.HookDefinitions.HookClassDef.STORY_SNAP_AD_LOADER;
import static com.ljmu.andre.snaptools.ModulePack.HookDefinitions.HookClassDef.TEXTURE_VIDEO_VIEW;
import static com.ljmu.andre.snaptools.ModulePack.HookDefinitions.HookClassDef.USER_PREFS;

/**
 * This class was created by Andre R M (SID: 701439)
 * It and its contents are free to use by all
 */
public class HookDef extends ConstantDefiner<Hook> {
	public static final HookDef INST = new HookDef();

	// SAVING ====================================================================
	public static final Hook ENCRYPTION_ALGORITHM_STREAM = new Hook(
			"ENCRYPTION_ALGORITHM_STREAM",
			ENCRYPTION_ALGORITHM, "b", InputStream.class
	);
	public static final Hook STREAM_TYPE_CHECK_BYPASS = new Hook(
			"STREAM_TYPE_CHECK_BYPASS",
			ENCRYPTED_STREAM_BUILDER, "a", "ws", int.class, int.class
	);
	public static final Hook STORY_GET_ALGORITHM = new Hook(
			"STORY_GET_ALGORITHM",
			STORY_SNAP, "ar"
	);
	public static final Hook DIRECT_GET_ALGORITHM = new Hook(
			"DIRECT_GET_ALGORITHM",
			RECEIVED_SNAP_ENCRYPTION, "a", RECEIVED_SNAP.getStrClass(), String.class
	);
	public static final Hook CHAT_IMAGE_GET_ALGORITHM = new Hook(
			"CHAT_IMAGE_GET_ALGORITHM",
			CHAT_IMAGE_METADATA, "b", CHAT_VIDEO.getStrClass()
	);
	public static final Hook CHAT_VIDEO_GET_ALGORITHM = new Hook(
			"CHAT_VIDEO_GET_ALGORITHM",
			CHAT_VIDEO_METADATA, "e"
	);
	public static final Hook CHAT_VIDEO_PATH = new Hook(
			"CHAT_VIDEO_PATH",
			CHAT_VIDEO, "eG_"
	);
	public static final Hook GROUP_GET_ALGORITHM = new Hook(
			"GROUP_GET_ALGORITHM",
			GROUP_SNAP_METADATA, "a", "aisw"
	);
	public static final Hook SENT_SNAP = new Hook(
			"SENT_SNAP",
			META_DATA_BUILDER, "a", SENT_SNAP_BASE.getStrClass()
	);
	public static final Hook SENT_BATCHED_SNAP = new Hook(
			"SENT_BATCHED_SNAP",
			SENT_BATCHED_VIDEO, "a", "ansq$b"
	);
	public static final Hook CONSTRUCTOR_OPERA_PAGE_VIEW = new Hook(
			"CONSTRUCTOR_OPERA_PAGE_VIEW",
			OPERA_PAGE_VIEW, null, Context.class
	);
	// ===========================================================================

	// UNLIMITED VIEWING =========================================================
	public static final Hook STORY_METADATA_INSERT_OBJECT = new Hook(
			"STORY_METADATA_INSERT_OBJECT",
			STORY_METADATA, "b", String.class, Object.class
	);
	public static final Hook SNAP_COUNTDOWN_POSTER = new Hook(
			"SNAP_COUNTDOWN_POSTER",
			SNAP_COUNTDOWN_CONTROLLER, "a", long.class
	);
	public static final Hook TEXTURE_VIDVIEW_START = new Hook(
			"TEXTURE_VIDVIEW_START",
			TEXTURE_VIDEO_VIEW, "start"
	);
	public static final Hook TEXTURE_VIDVIEW_SETLOOPING = new Hook(
			"TEXTURE_VIDVIEW_SETLOOPING",
			TEXTURE_VIDEO_VIEW, "setLooping", boolean.class
	);
	// ===========================================================================
	
	// ===========================================================================

	// STORY BLOCKING ============================================================
	public static final Hook LOAD_STORIES = new Hook(
			"LOAD_STORIES",
			STORY_LOADER, "a", List.class
	);
	public static final Hook LOAD_STORY_SNAP_ADVERT = new Hook(
			"LOAD_STORY_SNAP_ADVERT",
			STORY_SNAP_AD_LOADER, "a", "zwf", "eyr"
	);
	public static final Hook FRIEND_STORY_TILE_USERNAME = new Hook(
			"FRIEND_STORY_TILE_USERNAME",
			STORY_FRIEND_VIEWED, "a"
	);
	public static final Hook FRIEND_PROFILE_POPUP_CREATED = new Hook(
			"FRIEND_PROFILE_POPUP_CREATED",
			FRIEND_PROFILE_POPUP_FRAGMENT, "onViewCreated", View.class, Bundle.class
	);
	public static final Hook LOAD_INITIAL_STORIES = new Hook(
			"LOAD_INITIAL_STORIES",
			STORY_MANAGER, "a", STORY_MANAGER.getStrClass(), int.class, int.class, int.class, HashMap.class, HashMap.class, List.class
	);
	public static final Hook LOAD_NEW_STORY = new Hook(
			"LOAD_NEW_STORY",
			STORY_MANAGER, "a", "anju"
	);
	// ===========================================================================

	// CHAT MANAGER ===============================================================
	public static final Hook CHAT_METADATA_READ = new Hook(
			"CHAT_METADATA_READ",
			CHAT_METADATA_JSON_PARSER, "a", "com.google.gson.stream.JsonReader"
	);
	public static final Hook CHAT_METADATA_WRITE = new Hook(
			"CHAT_METADATA_WRITE",
			CHAT_METADATA_JSON_PARSER, "a", "com.google.gson.stream.JsonWriter",
			CHAT_METADATA.getStrClass()
	);
	public static final Hook CHAT_METADATA_READ_SECOND = new Hook(
			"CHAT_METADATA_READ_SECOND",
			CHAT_METADATA_JSON_PARSER_SECOND, "a", "com.google.gson.stream.JsonReader"
	);
	public static final Hook CHAT_METADATA_WRITE_SECOND = new Hook(
			"CHAT_METADATA_WRITE_SECOND",
			CHAT_METADATA_JSON_PARSER_SECOND, "a", "com.google.gson.stream.JsonWriter",
			"auvf"
	);
	public static final Hook CHAT_MESSAGE_VIEW_MEASURE = new Hook(
			"CHAT_MESSAGE_VIEW_MEASURE",
			CHAT_MESSAGE_VIEW_HOLDER, "F"
	);
	public static final Hook CHAT_ISSAVED_INAPP = new Hook(
			"CHAT_ISSAVED_INAPP",
			null, "eq_"
			/** FOUND IN -> abstract class mlk*/
	);
	public static final Hook CHAT_SAVE_INAPP = new Hook(
			"CHAT_SAVE_INAPP",
			CHAT_MESSAGE_VIEW_HOLDER, "x"
	);
	public static final Hook CHAT_NOTIFICATION = new Hook(
			"CHAT_NOTIFICATION",
			CHAT_NOTIFICATION_CREATOR, "a", "apgz", "apgs"
	);

	// SCREENSHOT BYPASS =========================================================
	public static final Hook SCREENSHOT_BYPASS = new Hook(
			"SCREENSHOT_BYPASS",
			SCREENSHOT_DETECTOR, "a", LinkedHashMap.class
	);
//	public static final Hook SET_SCREENSHOT_COUNT = new Hook(
//			/*SET_SCREENSHOT_COUNT*/ decryptMsg(new byte[]{-72, 57, 67, 112, -126, 37, -17, 89, -116, -100, -92, -3, -9, -45, 14, -70, -56, -55, 116, -20, 73, -9, 36, 77, 47, -85, -58, 83, 84, -14, 4, -68}),
//			SNAP_DATA_JSON, "a", Long.class
//	);
//	public static final Hook SET_VIDEO_SCREENSHOT_COUNT = new Hook(
//			/*SET_VIDEO_SCREENSHOT_COUNT*/ decryptMsg(new byte[]{110, -68, -53, 62, 106, -55, 17, 22, -65, 53, -98, -122, -1, 117, 102, 7, 84, -27, 83, -117, -72, 23, 68, 23, 68, -73, -8, -74, -5, 87, -69, -10}),
//			SNAP_DATA_JSON, "c", Long.class
//	);
//	public static final Hook SET_SCREENSHOT_COUNT3 = new Hook(
//			/*SET_SCREENSHOT_COUNT*/ decryptMsg(new byte[]{-72, 57, 67, 112, -126, 37, -17, 89, -116, -100, -92, -3, -9, -45, 14, -70, -56, -55, 116, -20, 73, -9, 36, 77, 47, -85, -58, 83, 84, -14, 4, -68}),
//			SNAP_DATA_JSON, "d", Long.class
//	);
	// ===========================================================================

	// ===========================================================================

	// MISC HOOKS ================================================================
	public static final Hook FONT_HOOK = new Hook(
			"FONT_HOOK",
			FONT_CLASS, "createFromFile", String.class
	);
	public static final Hook CAPTION_CREATE_HOOK = new Hook(
			"CAPTION_CREATE_HOOK",
			CAPTION_MANAGER_CLASS, "onCreateActionMode", ActionMode.class, Menu.class
	);

	// ===========================================================================
	// ===========================================================================

	// ===========================================================================

	// ERROR SUPPRESSION (FORCED HOOKS) ==========================================
	public static final Hook ERROR_SUPPRESS_DOWNLOADER_RUNNABLE = new Hook(
			"ERROR_SUPPRESS_DOWNLOADER_RUNNABLE",
			DOWNLOADER_RUNNABLE, "run"
	);
	// ===========================================================================

	public static final Hook SNAP_GET_USERNAME = new Hook(
			"SNAP_GET_USERNAME",
			RECEIVED_SNAP, "s"
	);
	public static final Hook SNAP_GET_TIMESTAMP = new Hook(
			"SNAP_GET_TIMESTAMP",
			STORY_SNAP, "aF_"
	);
	public static final Hook SNAP_GET_MEDIA_TYPE = new Hook(
			"SNAP_GET_MEDIA_TYPE",
			SNAP_BASE, "bb_"
	);
	public static final Hook STORY_METADATA_GET_OBJECT = new Hook(
			"STORY_METADATA_GET_OBJECT",
			STORY_METADATA, "a", String.class
	);
	public static final Hook STORY_METADATA_BUILDER = new Hook(
			"STORY_METADATA_BUILDER",
			STORY_METADATA_LOADER, "a", STORY_SNAP.getStrClass(), "apkx", "apkw", "ankk"
	);
	public static final Hook STORY_DISPLAYED = new Hook(
			"STORY_DISPLAYED",
			STORY_ADVANCER, "F"
	);
	public static final Hook OPENED_SNAP = new Hook(
			"OPENED_SNAP",
			RECEIVED_SNAP, "e", boolean.class
	);
	public static final Hook NEW_CONCENTRIC_TIMERVIEW_ONDRAW = new Hook(
			"NEW_CONCENTRIC_TIMERVIEW_ONDRAW",
			NEW_CONCENTRIC_TIMERVIEW, "onDraw", Canvas.class
	);
	public static final Hook COUNTDOWNTIMER_VIEW_ONDRAW = new Hook(
			"COUNTDOWNTIMER_VIEW_ONDRAW",
			COUNTDOWNTIMER_VIEW, "onDraw", Canvas.class
	);
	public static final Hook GET_USERNAME = new Hook(
			"GET_USERNAME",
			USER_PREFS, "N"
	);

	// CONSTRUCTORS ==============================================================


	// ===========================================================================

	public static class Hook extends Constant {
		private final HookClass hookClass;
		@Nullable private final String hookMethod;
		private final Object[] hookParams;

		Hook(String name, HookClass hookClass, @Nullable String hookMethod, Object... hookParams) {
			super(name);

			this.hookClass = hookClass;
			this.hookMethod = hookMethod;
			this.hookParams = hookParams;
		}

		// ===========================================================================

		public HookClass getHookClass() {
			return hookClass;
		}

		@Nullable public String getHookMethod() {
			return hookMethod;
		}

		public Object[] getHookParams() {
			return hookParams;
		}
	}
}
