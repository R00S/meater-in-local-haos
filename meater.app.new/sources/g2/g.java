package g2;

import h2.i;
import v2.C4801g;

/* compiled from: DashWrappingSegmentIndex.java */
/* loaded from: classes.dex */
public final class g implements e {

    /* renamed from: a, reason: collision with root package name */
    private final C4801g f41551a;

    /* renamed from: b, reason: collision with root package name */
    private final long f41552b;

    public g(C4801g c4801g, long j10) {
        this.f41551a = c4801g;
        this.f41552b = j10;
    }

    @Override // g2.e
    public long a(long j10) {
        return this.f41551a.f51166e[(int) j10] - this.f41552b;
    }

    @Override // g2.e
    public long b(long j10, long j11) {
        return this.f41551a.f51165d[(int) j10];
    }

    @Override // g2.e
    public long c(long j10, long j11) {
        return 0L;
    }

    @Override // g2.e
    public long d(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override // g2.e
    public i e(long j10) {
        return new i(null, this.f41551a.f51164c[(int) j10], r0.f51163b[r8]);
    }

    @Override // g2.e
    public long f(long j10, long j11) {
        return this.f41551a.b(j10 + this.f41552b);
    }

    @Override // g2.e
    public boolean g() {
        return true;
    }

    @Override // g2.e
    public long h() {
        return 0L;
    }

    @Override // g2.e
    public long i(long j10) {
        return this.f41551a.f51162a;
    }

    @Override // g2.e
    public long j(long j10, long j11) {
        return this.f41551a.f51162a;
    }
}
