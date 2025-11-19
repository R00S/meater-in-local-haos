package t6;

import java.io.InputStream;
import java.net.URL;
import m6.C3972g;
import s6.C4488h;
import s6.o;
import s6.p;
import s6.s;

/* compiled from: UrlLoader.java */
/* renamed from: t6.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4573g implements o<URL, InputStream> {

    /* renamed from: a, reason: collision with root package name */
    private final o<C4488h, InputStream> f49969a;

    /* compiled from: UrlLoader.java */
    /* renamed from: t6.g$a */
    public static class a implements p<URL, InputStream> {
        @Override // s6.p
        public o<URL, InputStream> c(s sVar) {
            return new C4573g(sVar.d(C4488h.class, InputStream.class));
        }
    }

    public C4573g(o<C4488h, InputStream> oVar) {
        this.f49969a = oVar;
    }

    @Override // s6.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<InputStream> b(URL url, int i10, int i11, C3972g c3972g) {
        return this.f49969a.b(new C4488h(url), i10, i11, c3972g);
    }

    @Override // s6.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(URL url) {
        return true;
    }
}
