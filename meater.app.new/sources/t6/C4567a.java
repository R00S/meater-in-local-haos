package t6;

import com.bumptech.glide.load.data.j;
import java.io.InputStream;
import m6.C3971f;
import m6.C3972g;
import s6.C4488h;
import s6.n;
import s6.o;
import s6.p;
import s6.s;

/* compiled from: HttpGlideUrlLoader.java */
/* renamed from: t6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4567a implements o<C4488h, InputStream> {

    /* renamed from: b, reason: collision with root package name */
    public static final C3971f<Integer> f49945b = C3971f.f("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* renamed from: a, reason: collision with root package name */
    private final n<C4488h, C4488h> f49946a;

    /* compiled from: HttpGlideUrlLoader.java */
    /* renamed from: t6.a$a, reason: collision with other inner class name */
    public static class C0708a implements p<C4488h, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final n<C4488h, C4488h> f49947a = new n<>(500);

        @Override // s6.p
        public o<C4488h, InputStream> c(s sVar) {
            return new C4567a(this.f49947a);
        }
    }

    public C4567a(n<C4488h, C4488h> nVar) {
        this.f49946a = nVar;
    }

    @Override // s6.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<InputStream> b(C4488h c4488h, int i10, int i11, C3972g c3972g) {
        n<C4488h, C4488h> nVar = this.f49946a;
        if (nVar != null) {
            C4488h c4488hA = nVar.a(c4488h, 0, 0);
            if (c4488hA == null) {
                this.f49946a.b(c4488h, 0, 0, c4488h);
            } else {
                c4488h = c4488hA;
            }
        }
        return new o.a<>(c4488h, new j(c4488h, ((Integer) c3972g.c(f49945b)).intValue()));
    }

    @Override // s6.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(C4488h c4488h) {
        return true;
    }
}
