package p456rx.p461n.p466e.p468o;

/* compiled from: Pow2.java */
/* renamed from: rx.n.e.o.j */
/* loaded from: classes3.dex */
public final class C11382j {
    /* renamed from: a */
    public static boolean m40535a(int i2) {
        return (i2 & (i2 + (-1))) == 0;
    }

    /* renamed from: b */
    public static int m40536b(int i2) {
        return 1 << (32 - Integer.numberOfLeadingZeros(i2 - 1));
    }
}
