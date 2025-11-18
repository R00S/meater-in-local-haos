package androidx.media3.exoplayer.upstream;

import X1.C1804a;
import X1.L;
import a2.e;
import a2.g;
import a2.l;
import android.net.Uri;
import androidx.media3.exoplayer.upstream.Loader;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import n2.i;

/* compiled from: ParsingLoadable.java */
/* loaded from: classes.dex */
public final class c<T> implements Loader.e {

    /* renamed from: a, reason: collision with root package name */
    public final long f27870a;

    /* renamed from: b, reason: collision with root package name */
    public final g f27871b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27872c;

    /* renamed from: d, reason: collision with root package name */
    private final l f27873d;

    /* renamed from: e, reason: collision with root package name */
    private final a<? extends T> f27874e;

    /* renamed from: f, reason: collision with root package name */
    private volatile T f27875f;

    /* compiled from: ParsingLoadable.java */
    public interface a<T> {
        T a(Uri uri, InputStream inputStream);
    }

    public c(androidx.media3.datasource.a aVar, Uri uri, int i10, a<? extends T> aVar2) {
        this(aVar, new g.b().i(uri).b(1).a(), i10, aVar2);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.e
    public final void a() throws IOException {
        this.f27873d.t();
        e eVar = new e(this.f27873d, this.f27871b);
        try {
            eVar.b();
            this.f27875f = this.f27874e.a((Uri) C1804a.e(this.f27873d.d()), eVar);
        } finally {
            L.m(eVar);
        }
    }

    public long c() {
        return this.f27873d.q();
    }

    public Map<String, List<String>> d() {
        return this.f27873d.s();
    }

    public final T e() {
        return this.f27875f;
    }

    public Uri f() {
        return this.f27873d.r();
    }

    public c(androidx.media3.datasource.a aVar, g gVar, int i10, a<? extends T> aVar2) {
        this.f27873d = new l(aVar);
        this.f27871b = gVar;
        this.f27872c = i10;
        this.f27874e = aVar2;
        this.f27870a = i.a();
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.e
    public final void b() {
    }
}
