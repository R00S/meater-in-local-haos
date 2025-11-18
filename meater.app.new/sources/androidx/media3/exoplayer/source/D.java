package androidx.media3.exoplayer.source;

import U1.InterfaceC1734j;
import X1.C1804a;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.source.F;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import r2.C4342a;
import r2.b;
import v2.O;

/* compiled from: SampleDataQueue.java */
/* loaded from: classes.dex */
class D {

    /* renamed from: a, reason: collision with root package name */
    private final r2.b f27596a;

    /* renamed from: b, reason: collision with root package name */
    private final int f27597b;

    /* renamed from: c, reason: collision with root package name */
    private final X1.y f27598c;

    /* renamed from: d, reason: collision with root package name */
    private a f27599d;

    /* renamed from: e, reason: collision with root package name */
    private a f27600e;

    /* renamed from: f, reason: collision with root package name */
    private a f27601f;

    /* renamed from: g, reason: collision with root package name */
    private long f27602g;

    /* compiled from: SampleDataQueue.java */
    private static final class a implements b.a {

        /* renamed from: a, reason: collision with root package name */
        public long f27603a;

        /* renamed from: b, reason: collision with root package name */
        public long f27604b;

        /* renamed from: c, reason: collision with root package name */
        public C4342a f27605c;

        /* renamed from: d, reason: collision with root package name */
        public a f27606d;

        public a(long j10, int i10) {
            d(j10, i10);
        }

        @Override // r2.b.a
        public C4342a a() {
            return (C4342a) C1804a.e(this.f27605c);
        }

        public a b() {
            this.f27605c = null;
            a aVar = this.f27606d;
            this.f27606d = null;
            return aVar;
        }

        public void c(C4342a c4342a, a aVar) {
            this.f27605c = c4342a;
            this.f27606d = aVar;
        }

        public void d(long j10, int i10) {
            C1804a.g(this.f27605c == null);
            this.f27603a = j10;
            this.f27604b = j10 + i10;
        }

        public int e(long j10) {
            return ((int) (j10 - this.f27603a)) + this.f27605c.f48345b;
        }

        @Override // r2.b.a
        public b.a next() {
            a aVar = this.f27606d;
            if (aVar == null || aVar.f27605c == null) {
                return null;
            }
            return aVar;
        }
    }

    public D(r2.b bVar) {
        this.f27596a = bVar;
        int iE = bVar.e();
        this.f27597b = iE;
        this.f27598c = new X1.y(32);
        a aVar = new a(0L, iE);
        this.f27599d = aVar;
        this.f27600e = aVar;
        this.f27601f = aVar;
    }

    private void a(a aVar) {
        if (aVar.f27605c == null) {
            return;
        }
        this.f27596a.d(aVar);
        aVar.b();
    }

    private static a d(a aVar, long j10) {
        while (j10 >= aVar.f27604b) {
            aVar = aVar.f27606d;
        }
        return aVar;
    }

    private void g(int i10) {
        long j10 = this.f27602g + i10;
        this.f27602g = j10;
        a aVar = this.f27601f;
        if (j10 == aVar.f27604b) {
            this.f27601f = aVar.f27606d;
        }
    }

    private int h(int i10) {
        a aVar = this.f27601f;
        if (aVar.f27605c == null) {
            aVar.c(this.f27596a.b(), new a(this.f27601f.f27604b, this.f27597b));
        }
        return Math.min(i10, (int) (this.f27601f.f27604b - this.f27602g));
    }

    private static a i(a aVar, long j10, ByteBuffer byteBuffer, int i10) {
        a aVarD = d(aVar, j10);
        while (i10 > 0) {
            int iMin = Math.min(i10, (int) (aVarD.f27604b - j10));
            byteBuffer.put(aVarD.f27605c.f48344a, aVarD.e(j10), iMin);
            i10 -= iMin;
            j10 += iMin;
            if (j10 == aVarD.f27604b) {
                aVarD = aVarD.f27606d;
            }
        }
        return aVarD;
    }

    private static a j(a aVar, long j10, byte[] bArr, int i10) {
        a aVarD = d(aVar, j10);
        int i11 = i10;
        while (i11 > 0) {
            int iMin = Math.min(i11, (int) (aVarD.f27604b - j10));
            System.arraycopy(aVarD.f27605c.f48344a, aVarD.e(j10), bArr, i10 - i11, iMin);
            i11 -= iMin;
            j10 += iMin;
            if (j10 == aVarD.f27604b) {
                aVarD = aVarD.f27606d;
            }
        }
        return aVarD;
    }

    private static a k(a aVar, DecoderInputBuffer decoderInputBuffer, F.b bVar, X1.y yVar) {
        long j10 = bVar.f27641b;
        int iP = 1;
        yVar.S(1);
        a aVarJ = j(aVar, j10, yVar.e(), 1);
        long j11 = j10 + 1;
        byte b10 = yVar.e()[0];
        boolean z10 = (b10 & 128) != 0;
        int i10 = b10 & 127;
        c2.c cVar = decoderInputBuffer.f26292D;
        byte[] bArr = cVar.f30917a;
        if (bArr == null) {
            cVar.f30917a = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        a aVarJ2 = j(aVarJ, j11, cVar.f30917a, i10);
        long j12 = j11 + i10;
        if (z10) {
            yVar.S(2);
            aVarJ2 = j(aVarJ2, j12, yVar.e(), 2);
            j12 += 2;
            iP = yVar.P();
        }
        int i11 = iP;
        int[] iArr = cVar.f30920d;
        if (iArr == null || iArr.length < i11) {
            iArr = new int[i11];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = cVar.f30921e;
        if (iArr3 == null || iArr3.length < i11) {
            iArr3 = new int[i11];
        }
        int[] iArr4 = iArr3;
        if (z10) {
            int i12 = i11 * 6;
            yVar.S(i12);
            aVarJ2 = j(aVarJ2, j12, yVar.e(), i12);
            j12 += i12;
            yVar.W(0);
            for (int i13 = 0; i13 < i11; i13++) {
                iArr2[i13] = yVar.P();
                iArr4[i13] = yVar.L();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = bVar.f27640a - ((int) (j12 - bVar.f27641b));
        }
        O.a aVar2 = (O.a) X1.L.i(bVar.f27642c);
        cVar.c(i11, iArr2, iArr4, aVar2.f51066b, cVar.f30917a, aVar2.f51065a, aVar2.f51067c, aVar2.f51068d);
        long j13 = bVar.f27641b;
        int i14 = (int) (j12 - j13);
        bVar.f27641b = j13 + i14;
        bVar.f27640a -= i14;
        return aVarJ2;
    }

    private static a l(a aVar, DecoderInputBuffer decoderInputBuffer, F.b bVar, X1.y yVar) {
        if (decoderInputBuffer.F()) {
            aVar = k(aVar, decoderInputBuffer, bVar, yVar);
        }
        if (!decoderInputBuffer.v()) {
            decoderInputBuffer.D(bVar.f27640a);
            return i(aVar, bVar.f27641b, decoderInputBuffer.f26293E, bVar.f27640a);
        }
        yVar.S(4);
        a aVarJ = j(aVar, bVar.f27641b, yVar.e(), 4);
        int iL = yVar.L();
        bVar.f27641b += 4;
        bVar.f27640a -= 4;
        decoderInputBuffer.D(iL);
        a aVarI = i(aVarJ, bVar.f27641b, decoderInputBuffer.f26293E, iL);
        bVar.f27641b += iL;
        int i10 = bVar.f27640a - iL;
        bVar.f27640a = i10;
        decoderInputBuffer.H(i10);
        return i(aVarI, bVar.f27641b, decoderInputBuffer.f26296H, bVar.f27640a);
    }

    public void b(long j10) {
        a aVar;
        if (j10 == -1) {
            return;
        }
        while (true) {
            aVar = this.f27599d;
            if (j10 < aVar.f27604b) {
                break;
            }
            this.f27596a.a(aVar.f27605c);
            this.f27599d = this.f27599d.b();
        }
        if (this.f27600e.f27603a < aVar.f27603a) {
            this.f27600e = aVar;
        }
    }

    public void c(long j10) {
        C1804a.a(j10 <= this.f27602g);
        this.f27602g = j10;
        if (j10 != 0) {
            a aVar = this.f27599d;
            if (j10 != aVar.f27603a) {
                while (this.f27602g > aVar.f27604b) {
                    aVar = aVar.f27606d;
                }
                a aVar2 = (a) C1804a.e(aVar.f27606d);
                a(aVar2);
                a aVar3 = new a(aVar.f27604b, this.f27597b);
                aVar.f27606d = aVar3;
                if (this.f27602g == aVar.f27604b) {
                    aVar = aVar3;
                }
                this.f27601f = aVar;
                if (this.f27600e == aVar2) {
                    this.f27600e = aVar3;
                    return;
                }
                return;
            }
        }
        a(this.f27599d);
        a aVar4 = new a(this.f27602g, this.f27597b);
        this.f27599d = aVar4;
        this.f27600e = aVar4;
        this.f27601f = aVar4;
    }

    public long e() {
        return this.f27602g;
    }

    public void f(DecoderInputBuffer decoderInputBuffer, F.b bVar) {
        l(this.f27600e, decoderInputBuffer, bVar, this.f27598c);
    }

    public void m(DecoderInputBuffer decoderInputBuffer, F.b bVar) {
        this.f27600e = l(this.f27600e, decoderInputBuffer, bVar, this.f27598c);
    }

    public void n() {
        a(this.f27599d);
        this.f27599d.d(0L, this.f27597b);
        a aVar = this.f27599d;
        this.f27600e = aVar;
        this.f27601f = aVar;
        this.f27602g = 0L;
        this.f27596a.c();
    }

    public void o() {
        this.f27600e = this.f27599d;
    }

    public int p(InterfaceC1734j interfaceC1734j, int i10, boolean z10) throws EOFException {
        int iH = h(i10);
        a aVar = this.f27601f;
        int iE = interfaceC1734j.e(aVar.f27605c.f48344a, aVar.e(this.f27602g), iH);
        if (iE != -1) {
            g(iE);
            return iE;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    public void q(X1.y yVar, int i10) {
        while (i10 > 0) {
            int iH = h(i10);
            a aVar = this.f27601f;
            yVar.l(aVar.f27605c.f48344a, aVar.e(this.f27602g), iH);
            i10 -= iH;
            g(iH);
        }
    }
}
