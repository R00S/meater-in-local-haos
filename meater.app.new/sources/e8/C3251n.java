package e8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* renamed from: e8.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3251n {

    /* renamed from: a, reason: collision with root package name */
    private static final Set f40765a = new HashSet(Arrays.asList("app_update", "review"));

    /* renamed from: b, reason: collision with root package name */
    private static final Set f40766b = new HashSet(Arrays.asList("native", "unity"));

    /* renamed from: c, reason: collision with root package name */
    private static final Map f40767c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private static final C3253p f40768d = new C3253p("PlayCoreVersion");

    public static synchronized Map a(String str) {
        Map map;
        try {
            map = f40767c;
            if (!map.containsKey("app_update")) {
                HashMap map2 = new HashMap();
                map2.put("java", 11004);
                map.put("app_update", map2);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Map) map.get("app_update");
    }
}
