package O2;

import v2.C4802h;
import v2.F;

/* compiled from: ConstantBitrateSeeker.java */
/* loaded from: classes.dex */
final class a extends C4802h implements g {

    /* renamed from: h, reason: collision with root package name */
    private final long f13113h;

    /* renamed from: i, reason: collision with root package name */
    private final int f13114i;

    /* renamed from: j, reason: collision with root package name */
    private final int f13115j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f13116k;

    /* renamed from: l, reason: collision with root package name */
    private final long f13117l;

    public a(long j10, long j11, F.a aVar, boolean z10) {
        this(j10, j11, aVar.f51046f, aVar.f51043c, z10);
    }

    @Override // O2.g
    public long a(long j10) {
        return c(j10);
    }

    public a e(long j10) {
        return new a(j10, this.f13113h, this.f13114i, this.f13115j, this.f13116k);
    }

    @Override // O2.g
    public long f() {
        return this.f13117l;
    }

    @Override // O2.g
    public int l() {
        return this.f13114i;
    }

    public a(long j10, long j11, int i10, int i11, boolean z10) {
        super(j10, j11, i10, i11, z10);
        this.f13113h = j11;
        this.f13114i = i10;
        this.f13115j = i11;
        this.f13116k = z10;
        this.f13117l = j10 == -1 ? -1L : j10;
    }
}
