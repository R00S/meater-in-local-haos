package v2;

import X1.C1804a;
import v2.J;

/* compiled from: IndexSeekMap.java */
/* loaded from: classes.dex */
public final class E implements J {

    /* renamed from: a, reason: collision with root package name */
    private final X1.o f51031a;

    /* renamed from: b, reason: collision with root package name */
    private final X1.o f51032b;

    /* renamed from: c, reason: collision with root package name */
    private long f51033c;

    public E(long[] jArr, long[] jArr2, long j10) {
        C1804a.a(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            this.f51031a = new X1.o(length);
            this.f51032b = new X1.o(length);
        } else {
            int i10 = length + 1;
            X1.o oVar = new X1.o(i10);
            this.f51031a = oVar;
            X1.o oVar2 = new X1.o(i10);
            this.f51032b = oVar2;
            oVar.a(0L);
            oVar2.a(0L);
        }
        this.f51031a.b(jArr);
        this.f51032b.b(jArr2);
        this.f51033c = j10;
    }

    public long a(long j10) {
        if (this.f51032b.d() == 0) {
            return -9223372036854775807L;
        }
        return this.f51032b.c(X1.L.f(this.f51031a, j10, true, true));
    }

    public void b(long j10, long j11) {
        if (this.f51032b.d() == 0 && j10 > 0) {
            this.f51031a.a(0L);
            this.f51032b.a(0L);
        }
        this.f51031a.a(j11);
        this.f51032b.a(j10);
    }

    public boolean c(long j10, long j11) {
        if (this.f51032b.d() == 0) {
            return false;
        }
        X1.o oVar = this.f51032b;
        return j10 - oVar.c(oVar.d() - 1) < j11;
    }

    public void d(long j10) {
        this.f51033c = j10;
    }

    @Override // v2.J
    public boolean g() {
        return this.f51032b.d() > 0;
    }

    @Override // v2.J
    public J.a k(long j10) {
        if (this.f51032b.d() == 0) {
            return new J.a(K.f51053c);
        }
        int iF = X1.L.f(this.f51032b, j10, true, true);
        K k10 = new K(this.f51032b.c(iF), this.f51031a.c(iF));
        if (k10.f51054a == j10 || iF == this.f51032b.d() - 1) {
            return new J.a(k10);
        }
        int i10 = iF + 1;
        return new J.a(k10, new K(this.f51032b.c(i10), this.f51031a.c(i10)));
    }

    @Override // v2.J
    public long m() {
        return this.f51033c;
    }
}
