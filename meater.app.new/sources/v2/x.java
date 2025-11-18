package v2;

import X1.C1804a;
import v2.J;
import v2.y;

/* compiled from: FlacSeekTableSeekMap.java */
/* loaded from: classes.dex */
public final class x implements J {

    /* renamed from: a, reason: collision with root package name */
    private final y f51227a;

    /* renamed from: b, reason: collision with root package name */
    private final long f51228b;

    public x(y yVar, long j10) {
        this.f51227a = yVar;
        this.f51228b = j10;
    }

    private K b(long j10, long j11) {
        return new K((j10 * 1000000) / this.f51227a.f51233e, this.f51228b + j11);
    }

    @Override // v2.J
    public boolean g() {
        return true;
    }

    @Override // v2.J
    public J.a k(long j10) {
        C1804a.i(this.f51227a.f51239k);
        y yVar = this.f51227a;
        y.a aVar = yVar.f51239k;
        long[] jArr = aVar.f51241a;
        long[] jArr2 = aVar.f51242b;
        int iH = X1.L.h(jArr, yVar.i(j10), true, false);
        K kB = b(iH == -1 ? 0L : jArr[iH], iH != -1 ? jArr2[iH] : 0L);
        if (kB.f51054a == j10 || iH == jArr.length - 1) {
            return new J.a(kB);
        }
        int i10 = iH + 1;
        return new J.a(kB, b(jArr[i10], jArr2[i10]));
    }

    @Override // v2.J
    public long m() {
        return this.f51227a.f();
    }
}
