package i8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* compiled from: com.google.android.play:review@@2.0.2 */
/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private static final Map f43163a;

    static {
        new HashSet(Arrays.asList("native", "unity"));
        f43163a = new HashMap();
        new j8.i("PlayCoreVersion");
    }

    public static synchronized Map a() {
        Map map;
        map = f43163a;
        map.put("java", 20002);
        return map;
    }
}
