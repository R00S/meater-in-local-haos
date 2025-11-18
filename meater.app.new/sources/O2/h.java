package O2;

import X1.L;
import X1.n;
import X1.y;
import v2.F;
import v2.J;
import v2.K;

/* compiled from: VbriSeeker.java */
/* loaded from: classes.dex */
final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f13147a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f13148b;

    /* renamed from: c, reason: collision with root package name */
    private final long f13149c;

    /* renamed from: d, reason: collision with root package name */
    private final long f13150d;

    /* renamed from: e, reason: collision with root package name */
    private final int f13151e;

    private h(long[] jArr, long[] jArr2, long j10, long j11, int i10) {
        this.f13147a = jArr;
        this.f13148b = jArr2;
        this.f13149c = j10;
        this.f13150d = j11;
        this.f13151e = i10;
    }

    public static h b(long j10, long j11, F.a aVar, y yVar) {
        int iH;
        yVar.X(6);
        long jQ = j11 + aVar.f51043c + yVar.q();
        int iQ = yVar.q();
        if (iQ <= 0) {
            return null;
        }
        int i10 = aVar.f51044d;
        long jD1 = L.d1(iQ, (i10 >= 32000 ? 1152 : 576) * 1000000, i10);
        int iP = yVar.P();
        int iP2 = yVar.P();
        int iP3 = yVar.P();
        yVar.X(2);
        long j12 = j11 + aVar.f51043c;
        long[] jArr = new long[iP];
        long[] jArr2 = new long[iP];
        int i11 = 0;
        while (i11 < iP) {
            int i12 = iP2;
            long j13 = j12;
            jArr[i11] = (i11 * jD1) / iP;
            jArr2[i11] = j13;
            if (iP3 == 1) {
                iH = yVar.H();
            } else if (iP3 == 2) {
                iH = yVar.P();
            } else if (iP3 == 3) {
                iH = yVar.K();
            } else {
                if (iP3 != 4) {
                    return null;
                }
                iH = yVar.L();
            }
            j12 = j13 + (iH * i12);
            i11++;
            iP2 = i12;
            iP = iP;
        }
        if (j10 != -1 && j10 != jQ) {
            n.h("VbriSeeker", "VBRI data size mismatch: " + j10 + ", " + jQ);
        }
        if (jQ != j12) {
            n.h("VbriSeeker", "VBRI bytes and ToC mismatch (using max): " + jQ + ", " + j12 + "\nSeeking will be inaccurate.");
            jQ = Math.max(jQ, j12);
        }
        return new h(jArr, jArr2, jD1, jQ, aVar.f51046f);
    }

    @Override // O2.g
    public long a(long j10) {
        return this.f13147a[L.h(this.f13148b, j10, true, true)];
    }

    @Override // O2.g
    public long f() {
        return this.f13150d;
    }

    @Override // v2.J
    public boolean g() {
        return true;
    }

    @Override // v2.J
    public J.a k(long j10) {
        int iH = L.h(this.f13147a, j10, true, true);
        K k10 = new K(this.f13147a[iH], this.f13148b[iH]);
        if (k10.f51054a >= j10 || iH == this.f13147a.length - 1) {
            return new J.a(k10);
        }
        int i10 = iH + 1;
        return new J.a(k10, new K(this.f13147a[i10], this.f13148b[i10]));
    }

    @Override // O2.g
    public int l() {
        return this.f13151e;
    }

    @Override // v2.J
    public long m() {
        return this.f13149c;
    }
}
