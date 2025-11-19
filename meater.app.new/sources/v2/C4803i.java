package v2;

import U1.InterfaceC1734j;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* compiled from: DefaultExtractorInput.java */
/* renamed from: v2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4803i implements InterfaceC4811q {

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1734j f51176b;

    /* renamed from: c, reason: collision with root package name */
    private final long f51177c;

    /* renamed from: d, reason: collision with root package name */
    private long f51178d;

    /* renamed from: f, reason: collision with root package name */
    private int f51180f;

    /* renamed from: g, reason: collision with root package name */
    private int f51181g;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f51179e = new byte[65536];

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f51175a = new byte[4096];

    static {
        U1.w.a("media3.extractor");
    }

    public C4803i(InterfaceC1734j interfaceC1734j, long j10, long j11) {
        this.f51176b = interfaceC1734j;
        this.f51178d = j10;
        this.f51177c = j11;
    }

    private void q(int i10) {
        if (i10 != -1) {
            this.f51178d += i10;
        }
    }

    private void r(int i10) {
        int i11 = this.f51180f + i10;
        byte[] bArr = this.f51179e;
        if (i11 > bArr.length) {
            this.f51179e = Arrays.copyOf(this.f51179e, X1.L.p(bArr.length * 2, 65536 + i11, i11 + 524288));
        }
    }

    private int s(byte[] bArr, int i10, int i11) {
        int i12 = this.f51181g;
        if (i12 == 0) {
            return 0;
        }
        int iMin = Math.min(i12, i11);
        System.arraycopy(this.f51179e, 0, bArr, i10, iMin);
        w(iMin);
        return iMin;
    }

    private int t(byte[] bArr, int i10, int i11, int i12, boolean z10) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int iE = this.f51176b.e(bArr, i10 + i12, i11 - i12);
        if (iE != -1) {
            return i12 + iE;
        }
        if (i12 == 0 && z10) {
            return -1;
        }
        throw new EOFException();
    }

    private int u(int i10) {
        int iMin = Math.min(this.f51181g, i10);
        w(iMin);
        return iMin;
    }

    private void w(int i10) {
        int i11 = this.f51181g - i10;
        this.f51181g = i11;
        this.f51180f = 0;
        byte[] bArr = this.f51179e;
        byte[] bArr2 = i11 < bArr.length - 524288 ? new byte[65536 + i11] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.f51179e = bArr2;
    }

    @Override // v2.InterfaceC4811q
    public long a() {
        return this.f51177c;
    }

    @Override // v2.InterfaceC4811q
    public int b(int i10) throws EOFException, InterruptedIOException {
        int iU = u(i10);
        if (iU == 0) {
            byte[] bArr = this.f51175a;
            iU = t(bArr, 0, Math.min(i10, bArr.length), 0, true);
        }
        q(iU);
        return iU;
    }

    @Override // v2.InterfaceC4811q, U1.InterfaceC1734j
    public int e(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        int iS = s(bArr, i10, i11);
        if (iS == 0) {
            iS = t(bArr, i10, i11, 0, true);
        }
        q(iS);
        return iS;
    }

    @Override // v2.InterfaceC4811q
    public boolean f(byte[] bArr, int i10, int i11, boolean z10) throws EOFException, InterruptedIOException {
        int iS = s(bArr, i10, i11);
        while (iS < i11 && iS != -1) {
            iS = t(bArr, i10, i11, iS, z10);
        }
        q(iS);
        return iS != -1;
    }

    @Override // v2.InterfaceC4811q
    public long getPosition() {
        return this.f51178d;
    }

    @Override // v2.InterfaceC4811q
    public boolean h(byte[] bArr, int i10, int i11, boolean z10) {
        if (!o(i11, z10)) {
            return false;
        }
        System.arraycopy(this.f51179e, this.f51180f - i11, bArr, i10, i11);
        return true;
    }

    @Override // v2.InterfaceC4811q
    public long i() {
        return this.f51178d + this.f51180f;
    }

    @Override // v2.InterfaceC4811q
    public void j(int i10) throws EOFException, InterruptedIOException {
        o(i10, false);
    }

    @Override // v2.InterfaceC4811q
    public int k(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        int iMin;
        r(i11);
        int i12 = this.f51181g;
        int i13 = this.f51180f;
        int i14 = i12 - i13;
        if (i14 == 0) {
            iMin = t(this.f51179e, i13, i11, 0, true);
            if (iMin == -1) {
                return -1;
            }
            this.f51181g += iMin;
        } else {
            iMin = Math.min(i11, i14);
        }
        System.arraycopy(this.f51179e, this.f51180f, bArr, i10, iMin);
        this.f51180f += iMin;
        return iMin;
    }

    @Override // v2.InterfaceC4811q
    public void m() {
        this.f51180f = 0;
    }

    @Override // v2.InterfaceC4811q
    public void n(int i10) throws EOFException, InterruptedIOException {
        v(i10, false);
    }

    @Override // v2.InterfaceC4811q
    public boolean o(int i10, boolean z10) throws EOFException, InterruptedIOException {
        r(i10);
        int iT = this.f51181g - this.f51180f;
        while (iT < i10) {
            iT = t(this.f51179e, this.f51180f, i10, iT, z10);
            if (iT == -1) {
                return false;
            }
            this.f51181g = this.f51180f + iT;
        }
        this.f51180f += i10;
        return true;
    }

    @Override // v2.InterfaceC4811q
    public void p(byte[] bArr, int i10, int i11) {
        h(bArr, i10, i11, false);
    }

    @Override // v2.InterfaceC4811q
    public void readFully(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        f(bArr, i10, i11, false);
    }

    public boolean v(int i10, boolean z10) throws EOFException, InterruptedIOException {
        int iU = u(i10);
        while (iU < i10 && iU != -1) {
            iU = t(this.f51175a, -iU, Math.min(i10, this.f51175a.length + iU), iU, z10);
        }
        q(iU);
        return iU != -1;
    }
}
