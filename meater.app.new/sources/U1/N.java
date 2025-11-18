package U1;

/* compiled from: VideoSize.java */
/* loaded from: classes.dex */
public final class N {

    /* renamed from: e, reason: collision with root package name */
    public static final N f16982e = new N(0, 0);

    /* renamed from: f, reason: collision with root package name */
    private static final String f16983f = X1.L.B0(0);

    /* renamed from: g, reason: collision with root package name */
    private static final String f16984g = X1.L.B0(1);

    /* renamed from: h, reason: collision with root package name */
    private static final String f16985h = X1.L.B0(3);

    /* renamed from: a, reason: collision with root package name */
    public final int f16986a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16987b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public final int f16988c;

    /* renamed from: d, reason: collision with root package name */
    public final float f16989d;

    public N(int i10, int i11) {
        this(i10, i11, 1.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n10 = (N) obj;
        return this.f16986a == n10.f16986a && this.f16987b == n10.f16987b && this.f16989d == n10.f16989d;
    }

    public int hashCode() {
        return ((((217 + this.f16986a) * 31) + this.f16987b) * 31) + Float.floatToRawIntBits(this.f16989d);
    }

    public N(int i10, int i11, float f10) {
        this.f16986a = i10;
        this.f16987b = i11;
        this.f16988c = 0;
        this.f16989d = f10;
    }
}
