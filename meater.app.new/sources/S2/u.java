package S2;

import S2.r;
import U1.InterfaceC1734j;
import U1.z;
import X1.C1804a;
import X1.InterfaceC1811h;
import X1.L;
import X1.y;
import java.io.EOFException;
import v2.O;

/* compiled from: SubtitleTranscodingTrackOutput.java */
/* loaded from: classes.dex */
final class u implements O {

    /* renamed from: a, reason: collision with root package name */
    private final O f15302a;

    /* renamed from: b, reason: collision with root package name */
    private final r.a f15303b;

    /* renamed from: h, reason: collision with root package name */
    private r f15309h;

    /* renamed from: i, reason: collision with root package name */
    private U1.s f15310i;

    /* renamed from: c, reason: collision with root package name */
    private final d f15304c = new d();

    /* renamed from: e, reason: collision with root package name */
    private int f15306e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f15307f = 0;

    /* renamed from: g, reason: collision with root package name */
    private byte[] f15308g = L.f18631f;

    /* renamed from: d, reason: collision with root package name */
    private final y f15305d = new y();

    public u(O o10, r.a aVar) {
        this.f15302a = o10;
        this.f15303b = aVar;
    }

    private void h(int i10) {
        int length = this.f15308g.length;
        int i11 = this.f15307f;
        if (length - i11 >= i10) {
            return;
        }
        int i12 = i11 - this.f15306e;
        int iMax = Math.max(i12 * 2, i10 + i12);
        byte[] bArr = this.f15308g;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.f15306e, bArr2, 0, i12);
        this.f15306e = 0;
        this.f15307f = i12;
        this.f15308g = bArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public void i(e eVar, long j10, int i10) {
        C1804a.i(this.f15310i);
        byte[] bArrA = this.f15304c.a(eVar.f15265a, eVar.f15267c);
        this.f15305d.T(bArrA);
        this.f15302a.d(this.f15305d, bArrA.length);
        long j11 = eVar.f15266b;
        if (j11 == -9223372036854775807L) {
            C1804a.g(this.f15310i.f17167t == Long.MAX_VALUE);
        } else {
            long j12 = this.f15310i.f17167t;
            j10 = j12 == Long.MAX_VALUE ? j10 + j11 : j11 + j12;
        }
        this.f15302a.e(j10, i10, bArrA.length, 0, null);
    }

    @Override // v2.O
    public int a(InterfaceC1734j interfaceC1734j, int i10, boolean z10, int i11) throws EOFException {
        if (this.f15309h == null) {
            return this.f15302a.a(interfaceC1734j, i10, z10, i11);
        }
        h(i10);
        int iE = interfaceC1734j.e(this.f15308g, this.f15307f, i10);
        if (iE != -1) {
            this.f15307f += iE;
            return iE;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // v2.O
    public void b(y yVar, int i10, int i11) {
        if (this.f15309h == null) {
            this.f15302a.b(yVar, i10, i11);
            return;
        }
        h(i10);
        yVar.l(this.f15308g, this.f15307f, i10);
        this.f15307f += i10;
    }

    @Override // v2.O
    public void e(final long j10, final int i10, int i11, int i12, O.a aVar) {
        if (this.f15309h == null) {
            this.f15302a.e(j10, i10, i11, i12, aVar);
            return;
        }
        C1804a.b(aVar == null, "DRM on subtitles is not supported");
        int i13 = (this.f15307f - i12) - i11;
        this.f15309h.c(this.f15308g, i13, i11, r.b.b(), new InterfaceC1811h() { // from class: S2.t
            @Override // X1.InterfaceC1811h
            public final void accept(Object obj) {
                this.f15299a.i(j10, i10, (e) obj);
            }
        });
        int i14 = i13 + i11;
        this.f15306e = i14;
        if (i14 == this.f15307f) {
            this.f15306e = 0;
            this.f15307f = 0;
        }
    }

    @Override // v2.O
    public void f(U1.s sVar) {
        C1804a.e(sVar.f17162o);
        C1804a.a(z.k(sVar.f17162o) == 3);
        if (!sVar.equals(this.f15310i)) {
            this.f15310i = sVar;
            this.f15309h = this.f15303b.a(sVar) ? this.f15303b.b(sVar) : null;
        }
        if (this.f15309h == null) {
            this.f15302a.f(sVar);
        } else {
            this.f15302a.f(sVar.b().s0("application/x-media3-cues").R(sVar.f17162o).w0(Long.MAX_VALUE).V(this.f15303b.c(sVar)).M());
        }
    }
}
