package Q3;

import s.C4413x;

/* compiled from: LottieCompositionCache.java */
/* loaded from: classes.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    private static final g f14316b = new g();

    /* renamed from: a, reason: collision with root package name */
    private final C4413x<String, L3.i> f14317a = new C4413x<>(20);

    g() {
    }

    public static g b() {
        return f14316b;
    }

    public L3.i a(String str) {
        if (str == null) {
            return null;
        }
        return this.f14317a.c(str);
    }

    public void c(String str, L3.i iVar) {
        if (str == null) {
            return;
        }
        this.f14317a.d(str, iVar);
    }
}
