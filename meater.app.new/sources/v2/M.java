package v2;

import v2.J;

/* compiled from: SingleSampleSeekMap.java */
/* loaded from: classes.dex */
public final class M implements J {

    /* renamed from: a, reason: collision with root package name */
    private final long f51063a;

    /* renamed from: b, reason: collision with root package name */
    private final long f51064b;

    public M(long j10) {
        this(j10, 0L);
    }

    @Override // v2.J
    public boolean g() {
        return true;
    }

    @Override // v2.J
    public J.a k(long j10) {
        return new J.a(new K(j10, this.f51064b));
    }

    @Override // v2.J
    public long m() {
        return this.f51063a;
    }

    public M(long j10, long j11) {
        this.f51063a = j10;
        this.f51064b = j11;
    }
}
