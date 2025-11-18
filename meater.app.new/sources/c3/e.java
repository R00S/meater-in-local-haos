package c3;

import X1.L;
import v2.J;
import v2.K;

/* compiled from: WavSeekMap.java */
/* loaded from: classes.dex */
final class e implements J {

    /* renamed from: a, reason: collision with root package name */
    private final C2311c f30992a;

    /* renamed from: b, reason: collision with root package name */
    private final int f30993b;

    /* renamed from: c, reason: collision with root package name */
    private final long f30994c;

    /* renamed from: d, reason: collision with root package name */
    private final long f30995d;

    /* renamed from: e, reason: collision with root package name */
    private final long f30996e;

    public e(C2311c c2311c, int i10, long j10, long j11) {
        this.f30992a = c2311c;
        this.f30993b = i10;
        this.f30994c = j10;
        long j12 = (j11 - j10) / c2311c.f30987e;
        this.f30995d = j12;
        this.f30996e = b(j12);
    }

    private long b(long j10) {
        return L.d1(j10 * this.f30993b, 1000000L, this.f30992a.f30985c);
    }

    @Override // v2.J
    public boolean g() {
        return true;
    }

    @Override // v2.J
    public J.a k(long j10) {
        long jQ = L.q((this.f30992a.f30985c * j10) / (this.f30993b * 1000000), 0L, this.f30995d - 1);
        long j11 = this.f30994c + (this.f30992a.f30987e * jQ);
        long jB = b(jQ);
        K k10 = new K(jB, j11);
        if (jB >= j10 || jQ == this.f30995d - 1) {
            return new J.a(k10);
        }
        long j12 = jQ + 1;
        return new J.a(k10, new K(b(j12), this.f30994c + (this.f30992a.f30987e * j12)));
    }

    @Override // v2.J
    public long m() {
        return this.f30996e;
    }
}
