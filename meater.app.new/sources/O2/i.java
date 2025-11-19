package O2;

import X1.L;
import X1.y;
import v2.F;

/* compiled from: XingFrame.java */
/* loaded from: classes.dex */
final class i {

    /* renamed from: a, reason: collision with root package name */
    public final F.a f13152a;

    /* renamed from: b, reason: collision with root package name */
    public final long f13153b;

    /* renamed from: c, reason: collision with root package name */
    public final long f13154c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13155d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13156e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f13157f;

    private i(F.a aVar, long j10, long j11, long[] jArr, int i10, int i11) {
        this.f13152a = new F.a(aVar);
        this.f13153b = j10;
        this.f13154c = j11;
        this.f13157f = jArr;
        this.f13155d = i10;
        this.f13156e = i11;
    }

    public static i b(F.a aVar, y yVar) {
        long[] jArr;
        int i10;
        int i11;
        int iQ = yVar.q();
        int iL = (iQ & 1) != 0 ? yVar.L() : -1;
        long J10 = (iQ & 2) != 0 ? yVar.J() : -1L;
        if ((iQ & 4) == 4) {
            long[] jArr2 = new long[100];
            for (int i12 = 0; i12 < 100; i12++) {
                jArr2[i12] = yVar.H();
            }
            jArr = jArr2;
        } else {
            jArr = null;
        }
        if ((iQ & 8) != 0) {
            yVar.X(4);
        }
        if (yVar.a() >= 24) {
            yVar.X(21);
            int iK = yVar.K();
            i11 = iK & 4095;
            i10 = (16773120 & iK) >> 12;
        } else {
            i10 = -1;
            i11 = -1;
        }
        return new i(aVar, iL, J10, jArr, i10, i11);
    }

    public long a() {
        long j10 = this.f13153b;
        if (j10 == -1 || j10 == 0) {
            return -9223372036854775807L;
        }
        return L.c1((j10 * r2.f51047g) - 1, this.f13152a.f51044d);
    }
}
