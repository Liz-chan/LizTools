package com.ljmu.andre.snaptools.ModulePack.HookDefinitions;

import android.support.annotation.NonNull;

import com.ljmu.andre.ConstantDefiner.Constant;
import com.ljmu.andre.ConstantDefiner.ConstantDefiner;
import com.ljmu.andre.snaptools.ModulePack.HookDefinitions.HookClassDef.HookClass;

/**
 * ===========================================================================
 * Hook Generation | Contains: Classes, Methods/Constructors, Variables
 * ===========================================================================
 */
@SuppressWarnings({"WeakerAccess"})
public class HookClassDef extends ConstantDefiner<HookClass> {
	public static final HookClassDef INST = new HookClassDef();

	public static final HookClass SCREENSHOT_DETECTOR = new HookClass(
			"SCREENSHOT_DETECTOR",
			"aplj"
	);// qtz
	//	public static final HookClass SNAP_DATA_JSON = new HookClass(
//			/*SNAP_DATA_JSON*/ decryptMsg(new byte[]{-93, 21, 88, -115, -63, 105, -59, -35, -5, 104, -29, 64, 117, -100, 76, 87}),
//			/*umf*/ decryptMsg(new byte[]{25, -90, 33, -88, -30, 1, 58, -113, 73, -119, -15, 78, 51, 30, -51, -51})
//	);
	public static final HookClass TEXTURE_VIDEO_VIEW = new HookClass(
			"TEXTURE_VIDEO_VIEW",
			"com.snap.opera.shared.view.TextureVideoView"
	); // com.snapchat.opera.shared.view.TextureVideoView
	public static final HookClass SNAP_COUNTDOWN_CONTROLLER = new HookClass(
			"SNAP_COUNTDOWN_CONTROLLER",
			"anaq"
	);// okm
	public static final HookClass ENCRYPTION_ALGORITHM = new HookClass(
			"ENCRYPTION_ALGORITHM",
			"com.snapchat.android.framework.crypto.CbcEncryptionAlgorithm"
	); // com.snapchat.android.framework.crypto.CbcEncryptionAlgorithm
	public static final HookClass ENCRYPTED_STREAM_BUILDER = new HookClass(
			"ENCRYPTED_STREAM_BUILDER",
			"aoxn"
	); // qgr
	public static final HookClass STORY_METADATA = new HookClass(
			"STORY_METADATA",
			"svq"
	); // tul
	public static final HookClass SNAP_BASE = new HookClass(
			"SNAP_BASE",
			"aisv"
	); // kxs
	public static final HookClass SNAP_STATUS = new HookClass(
			"SNAP_STATUS",
			"aisv$a"
	); // kxs$a
	public static final HookClass RECEIVED_SNAP = new HookClass(
			"RECEIVED_SNAP",
			"antc"
	); // pcb
	public static final HookClass RECEIVED_SNAP_ENCRYPTION = new HookClass(
			"RECEIVED_SNAP_ENCRYPTION",
			"aiue"
	); // kyr
	public static final HookClass GROUP_SNAP_METADATA = new HookClass(
			"GROUP_SNAP_METADATA",
			"aicy"
	); // kiz  - Changed a bit
	public static final HookClass STORY_SNAP = new HookClass(
			"STORY_SNAP",
			"ankl"
	); // oud
	public static final HookClass STORY_METADATA_LOADER = new HookClass(
			"STORY_METADATA_LOADER",
			"aaic"
	); // dye
	public static final HookClass STORY_ADVANCER = new HookClass(
			"STORY_ADVANCER",
			"sdl"
	); // tka
	public static final HookClass SENT_IMAGE = new HookClass(
			"SENT_IMAGE",
			"antf"
	); // pcf
	public static final HookClass SENT_VIDEO = new HookClass(
			"SENT_VIDEO",
			"antt"
	); // pct
	public static final HookClass SENT_BATCHED_VIDEO = new HookClass(
			"SENT_BATCHED_VIDEO",
			"abbh"
	); // eoo
	public static final HookClass ENUM_BATCHED_SNAP_POSITION = new HookClass(
			"ENUM_BATCHED_SNAP_POSITION",
			"ymq"
	); // cjh
	public static final HookClass SENT_SNAP_BASE = new HookClass(
			"SENT_SNAP_BASE",
			"ansh"
	); // pbk
	public static final HookClass META_DATA_BUILDER = new HookClass(
			"META_DATA_BUILDER",
			"ajly"
	); // ljn
	public static final HookClass CHAT_IMAGE_METADATA = new HookClass(
			"CHAT_IMAGE_METADATA",
			"aicf"
	); // kin
	public static final HookClass CHAT_VIDEO_METADATA = new HookClass(
			"CHAT_VIDEO_METADATA",
			"aivv"
	); // lam
	public static final HookClass CHAT_VIDEO = new HookClass(
			"CHAT_VIDEO",
			"aipr"
	); // kun
	public static final HookClass NEW_CONCENTRIC_TIMERVIEW = new HookClass(
			"NEW_CONCENTRIC_TIMERVIEW",
			"com.snap.opera.view.NewConcentricTimerView"
	); // com.snapchat.android.framework.ui.views.NewConcentricTimerView
	public static final HookClass COUNTDOWNTIMER_VIEW = new HookClass(
			"COUNTDOWNTIMER_VIEW",
			"com.snap.opera.view.CountdownTimerView"
	); // com.snapchat.android.framework.ui.views.CountdownTimerView*
	public static final HookClass ENUM_SNAP_ADVANCE_MODES = new HookClass(
			"ENUM_SNAP_ADVANCE_MODES",
			"slz"
	); // tpt
	public static final HookClass STORY_LOADER = new HookClass(
			"STORY_LOADER",
			"zul"
	); // dir
	public static final HookClass STORY_SPONSORED = new HookClass(
			"STORY_ADVERT",
			"ajen"
	); // dwm
	public static final HookClass STORY_FRIEND_RECENT = new HookClass(
			"STORY_FRIEND_RECENT",
			"adtz"
	); // dux
	public static final HookClass STORY_FRIEND_VIEWED = new HookClass(
			"STORY_FRIEND_VIEWED",
			"aafy"
	); // dud
	public static final HookClass STORY_SNAP_AD_LOADER = new HookClass(
			"STORY_SNAP_AD_LOADER",
			"zwf"
	); // dlv
	public static final HookClass FRIEND_PROFILE_POPUP_FRAGMENT = new HookClass(
			"FRIEND_PROFILE_POPUP_FRAGMENT",
			"com.snapchat.android.app.feature.miniprofile.internal.friend.FriendMiniProfilePopupFragment"
	); // com.snapchat.android.app.feature.miniprofile.internal.friend.FriendMiniProfilePopupFragment
	public static final HookClass USER_PREFS = new HookClass(
			"USER_PREFS",
			"com.snapchat.android.core.user.UserPrefsImpl"
	); // com.snapchat.android.core.user.UserPrefs
	public static final HookClass CAMERA_FRAGMENT = new HookClass(
			"CAMERA_FRAGMENT",
			"com.snapchat.android.app.feature.camera.CameraFragmentV2"
	); // com.snapchat.android.app.main.camera.CameraFragmentV1
	public static final HookClass PICTURE_SHARING = new HookClass(
			"PICTURE_SHARING",
			"aavx"
	);
	public static final HookClass VIDEO_SHARING  = new HookClass(
			"VIDEO_SHARING",
			"aawc"
	);
	public static final HookClass FONT_CLASS = new HookClass(
			"FONT_CLASS",
			"android.graphics.Typeface"
	); // android.graphics.Typeface
	public static final HookClass SNAPCHAT_CAPTION_VIEW_CLASS = new HookClass(
			"SNAPCHAT_CAPTION_VIEW_CLASS",
			"com.snapchat.android.app.feature.creativetools.caption.SnapCaptionView"
	); // com.snapchat.android.app.feature.creativetools.caption.SnapCaptionView
	public static final HookClass CAPTION_MANAGER_CLASS = new HookClass(
			"CAPTION_MANAGER_CLASS",
			"tvp"
	); // eyr
	public static final HookClass CHAT_MESSAGE_VIEW_HOLDER = new HookClass(
			"CHAT_MESSAGE_VIEW_HOLDER",
			"aimh"
	); // krr
	public static final HookClass OPERA_PAGE_VIEW = new HookClass(
			"OPERA_PAGE_VIEW",
			"com.snap.opera.view.OperaPageView"
	); // com.snapchat.opera.view.OperaPageView
	public static final HookClass CHAT_METADATA_JSON_PARSER = new HookClass(
			"CHAT_METADATA_JSON_PARSER",
			"auij"
	); // ulu
	public static final HookClass CHAT_METADATA_JSON_PARSER_SECOND = new HookClass(
			"CHAT_METADATA_JSON_PARSER_SECOND",
			"auvg"
	); // uxi
	public static final HookClass CHAT_METADATA = new HookClass(
			"CHAT_METADATA",
			"auii"
	); // ult
	public static final HookClass CHAT_HEADER_METADATA = new HookClass(
			"CHAT_HEADER_METADATA",
			"auqf"
	); // usz
	public static final HookClass CHAT_BODY_METADATA = new HookClass(
			"CHAT_BODY_METADATA",
			"auuq"
	); // uwu
	public static final HookClass CHAT_NOTIFICATION_CREATOR = new HookClass(
			"CHAT_NOTIFICATION_CREATOR",
			"ahnj"
	); // jvy
	//	public static final HookClass CHAT_MESSAGE_METADATA = new HookClass(
//			/*CHAT_MESSAGE_METADATA*/ decryptMsg(new byte[]{-50, 44, 120, -82, 113, -65, 81, -120, 5, -126, -76, -93, 71, -33, -116, -17, 35, 108, 78, -36, 77, -82, 21, 99, -117, 72, 87, 32, 49, 74, 108, -30}),
//			/*ktw*/ decryptMsg(new byte[]{123, 84, -31, -44, -43, 3, -88, 68, 30, 56, -104, 107, 47, -128, 23, 71})
//	);
	public static final HookClass CHAT_V3_FRAGMENT = new HookClass(
			"CHAT_V3_FRAGMENT",
			"com.snapchat.android.app.feature.messaging.chat.fragment.ChatV3Fragment"
	); // com.snapchat.android.app.feature.messaging.chat.fragment.ChatV3Fragment
	public static final HookClass CHAT_V10_BUILDER = new HookClass(
			"CHAT_V10_BUILDER",
			"ahvq"
	); // kdd
	public static final HookClass STORY_MANAGER = new HookClass(
			"STORY_MANAGER",
			"aadm"
	); // dru
	public static final HookClass STORY_DATA_DISCOVER = new HookClass(
			"STORY_DATA_DISCOVER",
			"ivb"
	); // yph
	public static final HookClass STORY_DATA_DYNAMIC = new HookClass(
			"STORY_DATA_DYNAMIC",
			"ivc"
	); // ypi
	public static final HookClass STORY_DATA_MAP = new HookClass(
			"STORY_DATA_MAP",
			"ivd"
	); // ypj
	public static final HookClass STORY_DATA_PROMOTED = new HookClass(
			"STORY_DATA_PROMOTED",
			"ive"
	); // ypk
	public static final HookClass STORY_DATA_MOMENT = new HookClass(
			"STORY_DATA_MOMENT",
			"ivr"
	); // ypt
	public static final HookClass DOWNLOADER_RUNNABLE = new HookClass(
			"DOWNLOADER_RUNNABLE",
			"apeh$2"
	);
	/*public static final HookClass GEOFILTER_VIEW = new HookClass(
			"GEOFILTER_VIEW",
			"com.snapchat.android.app.shared.feature.preview.ui.smartfilters.geofilterview.GeofilterViewV2"
	); // com.snapchat.android.app.shared.feature.preview.ui.smartfilters.GeofilterView // TODO: DONE
	public static final HookClass IMAGE_GEOFILTER_VIEW = new HookClass(
			"IMAGE_GEOFILTER_VIEW",
			"com.snapchat.android.app.shared.feature.preview.ui.smartfilters.geofilterview.GeofilterViewV2"
	); // com.snapchat.android.app.shared.feature.preview.ui.smartfilters.ImageGeofilterView // TODO: DONE
	public static final HookClass FILTER_METADATA = new HookClass(
			"FILTER_METADATA",
			"anlt"
	); // ovk // TODO: DONE
	public static final HookClass SERIALIZABLE_FILTER_METADATA = new HookClass(
			"SERIALIZABLE_FILTER_METADATA",
			"aups"
	); // usn // TODO: DONE
	public static final HookClass FILTER_METADATA_LOADER = new HookClass(
			"FILTER_METADATA_LOADER",
			"GeoFilterViewV2"
	); // fek // FIXME private GeofilterViewV2(Context context, anlt anlt, dyl<anmb> dyl_anmb, angz angz, aoxc aoxc, anbn anbn) {
	public static final HookClass FILTER_METADATA_CREATOR = new HookClass(
			"FILTER_METADATA_CREATOR",
			"annh$2"
	); // owp$2 // TODO: DONE
	public static final HookClass GEOFILTER_VIEW_CREATOR = new HookClass(
			"GEOFILTER_VIEW_CREATOR",
			"anbn"
	); // fdr // TODO: FIX*/
	public static final HookClass RECEIVED_SNAP_PAYLOAD_BUILDER = new HookClass(
            "RECEIVED_SNAP_PAYLOAD_BUILDER",
            "zly"
    ); // dfy // TODO: DONE
    public static final HookClass STORY_SNAP_PAYLOAD_BUILDER = new HookClass(
            "STORY_SNAP_PAYLOAD_BUILDER",
            "zxm"
    ); // dnj // TODO: DONE
	public static final HookClass STORY_STATUS_UPDATER = new HookClass(
            "STORY_STATUS_UPDATER",
            "zyc"
    ); // dnu // TODO: DONE
	public static final HookClass NETWORK_MANAGER = new HookClass(
            "NETWORK_MANAGER",
            "apbv"
    ); // qlc // TODO: DONE
    public static final HookClass NETWORK_DISPATCHER = new HookClass(
            "NETWORK_DISPATCHER",
            "ahql"
    ); // jyp // TODO: DONE
	public static final HookClass CHAT_GROUP_VIEW_MARKER = new HookClass(
            "CHAT_GROUP_VIEW_MARKER",
            "ahsh"
    ); // kal // TODO: DONE
    public static final HookClass CHAT_DIRECT_VIEW_MARKER = new HookClass(
            "CHAT_DIRECT_VIEW_MARKER",
            "ahrf"
    ); // jzh // TODO: DONE
	public static final HookClass CHEETAH_PROFILE_SETTINGS_CREATOR = new HookClass(
            "CHEETAH_PROFILE_SETTINGS_CREATOR",
            "aeiu"
    ); // hgr // TODO: DONE

	public static class HookClass extends Constant {
		private String strClass;

		public HookClass(String name, @NonNull String value) {
			super(name);
			this.strClass = value;
		}

		public String getStrClass() {
			return strClass;
		}
	}
}