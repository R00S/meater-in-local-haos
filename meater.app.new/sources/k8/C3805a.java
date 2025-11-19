package k8;

import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.play:review@@2.0.2 */
/* renamed from: k8.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3805a {

    /* renamed from: a, reason: collision with root package name */
    private static final Map f43821a;

    /* renamed from: b, reason: collision with root package name */
    private static final Map f43822b;

    static {
        HashMap map = new HashMap();
        f43821a = map;
        HashMap map2 = new HashMap();
        f43822b = map2;
        map.put(-1, "The Play Store app is either not installed or not the official version.");
        map.put(-2, "Call first requestReviewFlow to get the ReviewInfo.");
        map.put(-100, "Retry with an exponential backoff. Consider filing a bug if fails consistently.");
        map2.put(-1, "PLAY_STORE_NOT_FOUND");
        map2.put(-2, "INVALID_REQUEST");
        map2.put(-100, "INTERNAL_ERROR");
    }

    public static String a(int i10) {
        Map map = f43821a;
        Integer numValueOf = Integer.valueOf(i10);
        if (!map.containsKey(numValueOf)) {
            return "";
        }
        return ((String) map.get(numValueOf)) + " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#" + ((String) f43822b.get(numValueOf)) + ")";
    }
}
