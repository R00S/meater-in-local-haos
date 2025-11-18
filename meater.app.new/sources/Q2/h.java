package Q2;

import Q2.i;
import U1.s;
import X1.C1804a;
import X1.y;
import java.util.Arrays;
import java.util.List;
import m8.AbstractC4009y;
import v2.H;
import v2.S;

/* compiled from: OpusReader.java */
/* loaded from: classes.dex */
final class h extends i {

    /* renamed from: o, reason: collision with root package name */
    private static final byte[] f14254o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p, reason: collision with root package name */
    private static final byte[] f14255p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: n, reason: collision with root package name */
    private boolean f14256n;

    h() {
    }

    private static boolean n(y yVar, byte[] bArr) {
        if (yVar.a() < bArr.length) {
            return false;
        }
        int iF = yVar.f();
        byte[] bArr2 = new byte[bArr.length];
        yVar.l(bArr2, 0, bArr.length);
        yVar.W(iF);
        return Arrays.equals(bArr2, bArr);
    }

    public static boolean o(y yVar) {
        return n(yVar, f14254o);
    }

    @Override // Q2.i
    protected long f(y yVar) {
        return c(H.e(yVar.e()));
    }

    @Override // Q2.i
    protected boolean h(y yVar, long j10, i.b bVar) {
        if (n(yVar, f14254o)) {
            byte[] bArrCopyOf = Arrays.copyOf(yVar.e(), yVar.g());
            int iC = H.c(bArrCopyOf);
            List<byte[]> listA = H.a(bArrCopyOf);
            if (bVar.f14270a != null) {
                return true;
            }
            bVar.f14270a = new s.b().s0("audio/opus").Q(iC).t0(48000).f0(listA).M();
            return true;
        }
        byte[] bArr = f14255p;
        if (!n(yVar, bArr)) {
            C1804a.i(bVar.f14270a);
            return false;
        }
        C1804a.i(bVar.f14270a);
        if (this.f14256n) {
            return true;
        }
        this.f14256n = true;
        yVar.X(bArr.length);
        U1.y yVarD = S.d(AbstractC4009y.D(S.k(yVar, false, false).f51081b));
        if (yVarD == null) {
            return true;
        }
        bVar.f14270a = bVar.f14270a.b().l0(yVarD.b(bVar.f14270a.f17159l)).M();
        return true;
    }

    @Override // Q2.i
    protected void l(boolean z10) {
        super.l(z10);
        if (z10) {
            this.f14256n = false;
        }
    }
}
