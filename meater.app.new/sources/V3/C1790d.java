package V3;

import java.util.List;

/* compiled from: AnimatableValueParser.java */
/* renamed from: V3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1790d {
    private static <T> List<Y3.a<T>> a(W3.c cVar, float f10, L3.i iVar, N<T> n10) {
        return u.a(cVar, iVar, f10, n10, false);
    }

    private static <T> List<Y3.a<T>> b(W3.c cVar, L3.i iVar, N<T> n10) {
        return u.a(cVar, iVar, 1.0f, n10, false);
    }

    static R3.a c(W3.c cVar, L3.i iVar) {
        return new R3.a(b(cVar, iVar, C1793g.f18037a));
    }

    static R3.j d(W3.c cVar, L3.i iVar) {
        return new R3.j(a(cVar, X3.j.e(), iVar, C1795i.f18039a));
    }

    public static R3.b e(W3.c cVar, L3.i iVar) {
        return f(cVar, iVar, true);
    }

    public static R3.b f(W3.c cVar, L3.i iVar, boolean z10) {
        return new R3.b(a(cVar, z10 ? X3.j.e() : 1.0f, iVar, C1798l.f18053a));
    }

    static R3.c g(W3.c cVar, L3.i iVar, int i10) {
        return new R3.c(b(cVar, iVar, new o(i10)));
    }

    static R3.d h(W3.c cVar, L3.i iVar) {
        return new R3.d(b(cVar, iVar, r.f18063a));
    }

    static R3.f i(W3.c cVar, L3.i iVar) {
        return new R3.f(u.a(cVar, iVar, X3.j.e(), B.f18015a, true));
    }

    static R3.g j(W3.c cVar, L3.i iVar) {
        return new R3.g(b(cVar, iVar, G.f18020a));
    }

    static R3.h k(W3.c cVar, L3.i iVar) {
        return new R3.h(a(cVar, X3.j.e(), iVar, H.f18021a));
    }
}
