package b2;

import X1.C1804a;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ContentMetadataMutations.java */
/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, Object> f30106a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final List<String> f30107b = new ArrayList();

    private f a(String str, Object obj) {
        this.f30106a.put((String) C1804a.e(str), C1804a.e(obj));
        this.f30107b.remove(str);
        return this;
    }

    public static f g(f fVar, long j10) {
        return fVar.e("exo_len", j10);
    }

    public static f h(f fVar, Uri uri) {
        return uri == null ? fVar.d("exo_redir") : fVar.f("exo_redir", uri.toString());
    }

    public Map<String, Object> b() {
        HashMap map = new HashMap(this.f30106a);
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        return Collections.unmodifiableMap(map);
    }

    public List<String> c() {
        return Collections.unmodifiableList(new ArrayList(this.f30107b));
    }

    public f d(String str) {
        this.f30107b.add(str);
        this.f30106a.remove(str);
        return this;
    }

    public f e(String str, long j10) {
        return a(str, Long.valueOf(j10));
    }

    public f f(String str, String str2) {
        return a(str, str2);
    }
}
