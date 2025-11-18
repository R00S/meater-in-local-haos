package P2;

/* compiled from: Track.java */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final int f13873a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13874b;

    /* renamed from: c, reason: collision with root package name */
    public final long f13875c;

    /* renamed from: d, reason: collision with root package name */
    public final long f13876d;

    /* renamed from: e, reason: collision with root package name */
    public final long f13877e;

    /* renamed from: f, reason: collision with root package name */
    public final long f13878f;

    /* renamed from: g, reason: collision with root package name */
    public final U1.s f13879g;

    /* renamed from: h, reason: collision with root package name */
    public final int f13880h;

    /* renamed from: i, reason: collision with root package name */
    public final long[] f13881i;

    /* renamed from: j, reason: collision with root package name */
    public final long[] f13882j;

    /* renamed from: k, reason: collision with root package name */
    public final int f13883k;

    /* renamed from: l, reason: collision with root package name */
    private final t[] f13884l;

    public s(int i10, int i11, long j10, long j11, long j12, long j13, U1.s sVar, int i12, t[] tVarArr, int i13, long[] jArr, long[] jArr2) {
        this.f13873a = i10;
        this.f13874b = i11;
        this.f13875c = j10;
        this.f13876d = j11;
        this.f13877e = j12;
        this.f13878f = j13;
        this.f13879g = sVar;
        this.f13880h = i12;
        this.f13884l = tVarArr;
        this.f13883k = i13;
        this.f13881i = jArr;
        this.f13882j = jArr2;
    }

    public s a(U1.s sVar) {
        return new s(this.f13873a, this.f13874b, this.f13875c, this.f13876d, this.f13877e, this.f13878f, sVar, this.f13880h, this.f13884l, this.f13883k, this.f13881i, this.f13882j);
    }

    public t b(int i10) {
        t[] tVarArr = this.f13884l;
        if (tVarArr == null) {
            return null;
        }
        return tVarArr[i10];
    }
}
