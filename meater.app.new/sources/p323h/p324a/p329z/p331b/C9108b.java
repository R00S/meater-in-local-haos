package p323h.p324a.p329z.p331b;

import p323h.p324a.p328y.InterfaceC9095c;

/* compiled from: ObjectHelper.java */
/* renamed from: h.a.z.b.b */
/* loaded from: classes2.dex */
public final class C9108b {

    /* renamed from: a */
    static final InterfaceC9095c<Object, Object> f34960a = new a();

    /* compiled from: ObjectHelper.java */
    /* renamed from: h.a.z.b.b$a */
    static final class a implements InterfaceC9095c<Object, Object> {
        a() {
        }
    }

    /* renamed from: a */
    public static int m29269a(int i2, int i3) {
        if (i2 < i3) {
            return -1;
        }
        return i2 > i3 ? 1 : 0;
    }

    /* renamed from: b */
    public static int m29270b(long j2, long j3) {
        if (j2 < j3) {
            return -1;
        }
        return j2 > j3 ? 1 : 0;
    }

    /* renamed from: c */
    public static <T> T m29271c(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: d */
    public static int m29272d(int i2, String str) {
        if (i2 > 0) {
            return i2;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + i2);
    }
}
