package s6;

import android.net.Uri;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import m6.C3972g;
import s6.o;

/* compiled from: UrlUriLoader.java */
/* loaded from: classes2.dex */
public class z<Data> implements o<Uri, Data> {

    /* renamed from: b, reason: collision with root package name */
    private static final Set<String> f49391b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* renamed from: a, reason: collision with root package name */
    private final o<C4488h, Data> f49392a;

    /* compiled from: UrlUriLoader.java */
    public static class a implements p<Uri, InputStream> {
        @Override // s6.p
        public o<Uri, InputStream> c(s sVar) {
            return new z(sVar.d(C4488h.class, InputStream.class));
        }
    }

    public z(o<C4488h, Data> oVar) {
        this.f49392a = oVar;
    }

    @Override // s6.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<Data> b(Uri uri, int i10, int i11, C3972g c3972g) {
        return this.f49392a.b(new C4488h(uri.toString()), i10, i11, c3972g);
    }

    @Override // s6.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return f49391b.contains(uri.getScheme());
    }
}
