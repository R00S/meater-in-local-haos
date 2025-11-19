package d7;

import C9.h;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* renamed from: d7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3047a {
    public static String a(int i10) {
        switch (i10) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            default:
                return "unknown status code: " + i10;
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return "DEVELOPER_ERROR";
            case h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            case 19:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case 21:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
        }
    }
}
