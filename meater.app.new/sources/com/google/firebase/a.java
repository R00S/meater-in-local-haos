package com.google.firebase;

/* compiled from: AutoValue_StartupTime.java */
/* loaded from: classes2.dex */
final class a extends n {

    /* renamed from: a, reason: collision with root package name */
    private final long f38070a;

    /* renamed from: b, reason: collision with root package name */
    private final long f38071b;

    /* renamed from: c, reason: collision with root package name */
    private final long f38072c;

    a(long j10, long j11, long j12) {
        this.f38070a = j10;
        this.f38071b = j11;
        this.f38072c = j12;
    }

    @Override // com.google.firebase.n
    public long b() {
        return this.f38071b;
    }

    @Override // com.google.firebase.n
    public long c() {
        return this.f38070a;
    }

    @Override // com.google.firebase.n
    public long d() {
        return this.f38072c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f38070a == nVar.c() && this.f38071b == nVar.b() && this.f38072c == nVar.d();
    }

    public int hashCode() {
        long j10 = this.f38070a;
        long j11 = this.f38071b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f38072c;
        return i10 ^ ((int) ((j12 >>> 32) ^ j12));
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.f38070a + ", elapsedRealtime=" + this.f38071b + ", uptimeMillis=" + this.f38072c + "}";
    }
}
