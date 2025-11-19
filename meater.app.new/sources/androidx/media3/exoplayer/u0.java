package androidx.media3.exoplayer;

import android.annotation.SuppressLint;

/* compiled from: RendererCapabilities.java */
/* loaded from: classes.dex */
public interface u0 {

    /* compiled from: RendererCapabilities.java */
    public interface a {
        void a(t0 t0Var);
    }

    @SuppressLint({"WrongConstant"})
    static int F(int i10) {
        return i10 & 24;
    }

    static int G(int i10) {
        return y(i10, 0, 0, 0);
    }

    @SuppressLint({"WrongConstant"})
    static int N(int i10) {
        return i10 & 3584;
    }

    @SuppressLint({"WrongConstant"})
    static int T(int i10) {
        return i10 & 7;
    }

    @SuppressLint({"WrongConstant"})
    static int o(int i10, int i11, int i12, int i13, int i14, int i15) {
        return i10 | i11 | i12 | i13 | i14 | i15;
    }

    @SuppressLint({"WrongConstant"})
    static int q(int i10) {
        return i10 & 384;
    }

    static boolean s(int i10, boolean z10) {
        int iT = T(i10);
        return iT == 4 || (z10 && iT == 3);
    }

    static int w(int i10, int i11, int i12, int i13, int i14) {
        return o(i10, i11, i12, i13, i14, 0);
    }

    @SuppressLint({"WrongConstant"})
    static int x(int i10) {
        return i10 & 64;
    }

    static int y(int i10, int i11, int i12, int i13) {
        return o(i10, i11, i12, 0, 128, i13);
    }

    @SuppressLint({"WrongConstant"})
    static int z(int i10) {
        return i10 & 32;
    }

    int I();

    int a(U1.s sVar);

    String getName();

    int l();

    default void n() {
    }

    default void B(a aVar) {
    }
}
