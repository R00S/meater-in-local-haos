package v2;

import U1.s;
import java.util.Collections;
import java.util.List;

/* compiled from: FlacStreamMetadata.java */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final int f51229a;

    /* renamed from: b, reason: collision with root package name */
    public final int f51230b;

    /* renamed from: c, reason: collision with root package name */
    public final int f51231c;

    /* renamed from: d, reason: collision with root package name */
    public final int f51232d;

    /* renamed from: e, reason: collision with root package name */
    public final int f51233e;

    /* renamed from: f, reason: collision with root package name */
    public final int f51234f;

    /* renamed from: g, reason: collision with root package name */
    public final int f51235g;

    /* renamed from: h, reason: collision with root package name */
    public final int f51236h;

    /* renamed from: i, reason: collision with root package name */
    public final int f51237i;

    /* renamed from: j, reason: collision with root package name */
    public final long f51238j;

    /* renamed from: k, reason: collision with root package name */
    public final a f51239k;

    /* renamed from: l, reason: collision with root package name */
    private final U1.y f51240l;

    /* compiled from: FlacStreamMetadata.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final long[] f51241a;

        /* renamed from: b, reason: collision with root package name */
        public final long[] f51242b;

        public a(long[] jArr, long[] jArr2) {
            this.f51241a = jArr;
            this.f51242b = jArr2;
        }
    }

    public y(byte[] bArr, int i10) {
        X1.x xVar = new X1.x(bArr);
        xVar.p(i10 * 8);
        this.f51229a = xVar.h(16);
        this.f51230b = xVar.h(16);
        this.f51231c = xVar.h(24);
        this.f51232d = xVar.h(24);
        int iH = xVar.h(20);
        this.f51233e = iH;
        this.f51234f = j(iH);
        this.f51235g = xVar.h(3) + 1;
        int iH2 = xVar.h(5) + 1;
        this.f51236h = iH2;
        this.f51237i = e(iH2);
        this.f51238j = xVar.j(36);
        this.f51239k = null;
        this.f51240l = null;
    }

    private static int e(int i10) {
        if (i10 == 8) {
            return 1;
        }
        if (i10 == 12) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 != 20) {
            return i10 != 24 ? -1 : 6;
        }
        return 5;
    }

    private static int j(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public y a(List<H2.a> list) {
        return new y(this.f51229a, this.f51230b, this.f51231c, this.f51232d, this.f51233e, this.f51235g, this.f51236h, this.f51238j, this.f51239k, h(new U1.y(list)));
    }

    public y b(a aVar) {
        return new y(this.f51229a, this.f51230b, this.f51231c, this.f51232d, this.f51233e, this.f51235g, this.f51236h, this.f51238j, aVar, this.f51240l);
    }

    public y c(List<String> list) {
        return new y(this.f51229a, this.f51230b, this.f51231c, this.f51232d, this.f51233e, this.f51235g, this.f51236h, this.f51238j, this.f51239k, h(S.d(list)));
    }

    public long d() {
        long j10;
        long j11;
        int i10 = this.f51232d;
        if (i10 > 0) {
            j10 = (i10 + this.f51231c) / 2;
            j11 = 1;
        } else {
            int i11 = this.f51229a;
            j10 = ((((i11 != this.f51230b || i11 <= 0) ? 4096L : i11) * this.f51235g) * this.f51236h) / 8;
            j11 = 64;
        }
        return j10 + j11;
    }

    public long f() {
        long j10 = this.f51238j;
        if (j10 == 0) {
            return -9223372036854775807L;
        }
        return (j10 * 1000000) / this.f51233e;
    }

    public U1.s g(byte[] bArr, U1.y yVar) {
        bArr[4] = -128;
        int i10 = this.f51232d;
        if (i10 <= 0) {
            i10 = -1;
        }
        return new s.b().s0("audio/flac").j0(i10).Q(this.f51235g).t0(this.f51233e).m0(X1.L.g0(this.f51236h)).f0(Collections.singletonList(bArr)).l0(h(yVar)).M();
    }

    public U1.y h(U1.y yVar) {
        U1.y yVar2 = this.f51240l;
        return yVar2 == null ? yVar : yVar2.b(yVar);
    }

    public long i(long j10) {
        return X1.L.q((j10 * this.f51233e) / 1000000, 0L, this.f51238j - 1);
    }

    private y(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, a aVar, U1.y yVar) {
        this.f51229a = i10;
        this.f51230b = i11;
        this.f51231c = i12;
        this.f51232d = i13;
        this.f51233e = i14;
        this.f51234f = j(i14);
        this.f51235g = i15;
        this.f51236h = i16;
        this.f51237i = e(i16);
        this.f51238j = j10;
        this.f51239k = aVar;
        this.f51240l = yVar;
    }
}
