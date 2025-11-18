package Q2;

import Q2.i;
import X1.C1804a;
import X1.L;
import java.util.Arrays;
import v2.InterfaceC4811q;
import v2.J;
import v2.v;
import v2.w;
import v2.x;
import v2.y;

/* compiled from: FlacReader.java */
/* loaded from: classes.dex */
final class b extends i {

    /* renamed from: n, reason: collision with root package name */
    private y f14228n;

    /* renamed from: o, reason: collision with root package name */
    private a f14229o;

    /* compiled from: FlacReader.java */
    private static final class a implements g {

        /* renamed from: a, reason: collision with root package name */
        private y f14230a;

        /* renamed from: b, reason: collision with root package name */
        private y.a f14231b;

        /* renamed from: c, reason: collision with root package name */
        private long f14232c = -1;

        /* renamed from: d, reason: collision with root package name */
        private long f14233d = -1;

        public a(y yVar, y.a aVar) {
            this.f14230a = yVar;
            this.f14231b = aVar;
        }

        @Override // Q2.g
        public J a() {
            C1804a.g(this.f14232c != -1);
            return new x(this.f14230a, this.f14232c);
        }

        @Override // Q2.g
        public void b(long j10) {
            long[] jArr = this.f14231b.f51241a;
            this.f14233d = jArr[L.h(jArr, j10, true, true)];
        }

        public void c(long j10) {
            this.f14232c = j10;
        }

        @Override // Q2.g
        public long d(InterfaceC4811q interfaceC4811q) {
            long j10 = this.f14233d;
            if (j10 < 0) {
                return -1L;
            }
            long j11 = -(j10 + 2);
            this.f14233d = -1L;
            return j11;
        }
    }

    b() {
    }

    private int n(X1.y yVar) {
        int i10 = (yVar.e()[2] & 255) >> 4;
        if (i10 == 6 || i10 == 7) {
            yVar.X(4);
            yVar.Q();
        }
        int iJ = v.j(yVar, i10);
        yVar.W(0);
        return iJ;
    }

    private static boolean o(byte[] bArr) {
        return bArr[0] == -1;
    }

    public static boolean p(X1.y yVar) {
        return yVar.a() >= 5 && yVar.H() == 127 && yVar.J() == 1179402563;
    }

    @Override // Q2.i
    protected long f(X1.y yVar) {
        if (o(yVar.e())) {
            return n(yVar);
        }
        return -1L;
    }

    @Override // Q2.i
    protected boolean h(X1.y yVar, long j10, i.b bVar) {
        byte[] bArrE = yVar.e();
        y yVar2 = this.f14228n;
        if (yVar2 == null) {
            y yVar3 = new y(bArrE, 17);
            this.f14228n = yVar3;
            bVar.f14270a = yVar3.g(Arrays.copyOfRange(bArrE, 9, yVar.g()), null);
            return true;
        }
        if ((bArrE[0] & 127) == 3) {
            y.a aVarF = w.f(yVar);
            y yVarB = yVar2.b(aVarF);
            this.f14228n = yVarB;
            this.f14229o = new a(yVarB, aVarF);
            return true;
        }
        if (!o(bArrE)) {
            return true;
        }
        a aVar = this.f14229o;
        if (aVar != null) {
            aVar.c(j10);
            bVar.f14271b = this.f14229o;
        }
        C1804a.e(bVar.f14270a);
        return false;
    }

    @Override // Q2.i
    protected void l(boolean z10) {
        super.l(z10);
        if (z10) {
            this.f14228n = null;
            this.f14229o = null;
        }
    }
}
