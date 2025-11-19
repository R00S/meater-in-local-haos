package T8;

import T8.G;

/* compiled from: AutoValue_StaticSessionData_DeviceData.java */
/* loaded from: classes2.dex */
final class D extends G.b {

    /* renamed from: a, reason: collision with root package name */
    private final int f16247a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16248b;

    /* renamed from: c, reason: collision with root package name */
    private final int f16249c;

    /* renamed from: d, reason: collision with root package name */
    private final long f16250d;

    /* renamed from: e, reason: collision with root package name */
    private final long f16251e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f16252f;

    /* renamed from: g, reason: collision with root package name */
    private final int f16253g;

    /* renamed from: h, reason: collision with root package name */
    private final String f16254h;

    /* renamed from: i, reason: collision with root package name */
    private final String f16255i;

    D(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3) {
        this.f16247a = i10;
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.f16248b = str;
        this.f16249c = i11;
        this.f16250d = j10;
        this.f16251e = j11;
        this.f16252f = z10;
        this.f16253g = i12;
        if (str2 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        this.f16254h = str2;
        if (str3 == null) {
            throw new NullPointerException("Null modelClass");
        }
        this.f16255i = str3;
    }

    @Override // T8.G.b
    public int a() {
        return this.f16247a;
    }

    @Override // T8.G.b
    public int b() {
        return this.f16249c;
    }

    @Override // T8.G.b
    public long d() {
        return this.f16251e;
    }

    @Override // T8.G.b
    public boolean e() {
        return this.f16252f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof G.b)) {
            return false;
        }
        G.b bVar = (G.b) obj;
        return this.f16247a == bVar.a() && this.f16248b.equals(bVar.g()) && this.f16249c == bVar.b() && this.f16250d == bVar.j() && this.f16251e == bVar.d() && this.f16252f == bVar.e() && this.f16253g == bVar.i() && this.f16254h.equals(bVar.f()) && this.f16255i.equals(bVar.h());
    }

    @Override // T8.G.b
    public String f() {
        return this.f16254h;
    }

    @Override // T8.G.b
    public String g() {
        return this.f16248b;
    }

    @Override // T8.G.b
    public String h() {
        return this.f16255i;
    }

    public int hashCode() {
        int iHashCode = (((((this.f16247a ^ 1000003) * 1000003) ^ this.f16248b.hashCode()) * 1000003) ^ this.f16249c) * 1000003;
        long j10 = this.f16250d;
        int i10 = (iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f16251e;
        return ((((((((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ (this.f16252f ? 1231 : 1237)) * 1000003) ^ this.f16253g) * 1000003) ^ this.f16254h.hashCode()) * 1000003) ^ this.f16255i.hashCode();
    }

    @Override // T8.G.b
    public int i() {
        return this.f16253g;
    }

    @Override // T8.G.b
    public long j() {
        return this.f16250d;
    }

    public String toString() {
        return "DeviceData{arch=" + this.f16247a + ", model=" + this.f16248b + ", availableProcessors=" + this.f16249c + ", totalRam=" + this.f16250d + ", diskSpace=" + this.f16251e + ", isEmulator=" + this.f16252f + ", state=" + this.f16253g + ", manufacturer=" + this.f16254h + ", modelClass=" + this.f16255i + "}";
    }
}
