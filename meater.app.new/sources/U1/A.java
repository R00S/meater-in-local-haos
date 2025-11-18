package U1;

import X1.C1804a;

/* compiled from: PlaybackParameters.java */
/* loaded from: classes.dex */
public final class A {

    /* renamed from: d, reason: collision with root package name */
    public static final A f16772d = new A(1.0f);

    /* renamed from: e, reason: collision with root package name */
    private static final String f16773e = X1.L.B0(0);

    /* renamed from: f, reason: collision with root package name */
    private static final String f16774f = X1.L.B0(1);

    /* renamed from: a, reason: collision with root package name */
    public final float f16775a;

    /* renamed from: b, reason: collision with root package name */
    public final float f16776b;

    /* renamed from: c, reason: collision with root package name */
    private final int f16777c;

    public A(float f10) {
        this(f10, 1.0f);
    }

    public long a(long j10) {
        return j10 * this.f16777c;
    }

    public A b(float f10) {
        return new A(f10, this.f16776b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || A.class != obj.getClass()) {
            return false;
        }
        A a10 = (A) obj;
        return this.f16775a == a10.f16775a && this.f16776b == a10.f16776b;
    }

    public int hashCode() {
        return ((527 + Float.floatToRawIntBits(this.f16775a)) * 31) + Float.floatToRawIntBits(this.f16776b);
    }

    public String toString() {
        return X1.L.G("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f16775a), Float.valueOf(this.f16776b));
    }

    public A(float f10, float f11) {
        C1804a.a(f10 > 0.0f);
        C1804a.a(f11 > 0.0f);
        this.f16775a = f10;
        this.f16776b = f11;
        this.f16777c = Math.round(f10 * 1000.0f);
    }
}
