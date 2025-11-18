package V2;

import S2.e;
import S2.r;
import W1.a;
import X1.InterfaceC1811h;
import X1.L;
import X1.y;
import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.Inflater;

/* compiled from: PgsParser.java */
/* loaded from: classes.dex */
public final class a implements r {

    /* renamed from: a, reason: collision with root package name */
    private final y f18001a = new y();

    /* renamed from: b, reason: collision with root package name */
    private final y f18002b = new y();

    /* renamed from: c, reason: collision with root package name */
    private final C0264a f18003c = new C0264a();

    /* renamed from: d, reason: collision with root package name */
    private Inflater f18004d;

    /* compiled from: PgsParser.java */
    /* renamed from: V2.a$a, reason: collision with other inner class name */
    private static final class C0264a {

        /* renamed from: a, reason: collision with root package name */
        private final y f18005a = new y();

        /* renamed from: b, reason: collision with root package name */
        private final int[] f18006b = new int[256];

        /* renamed from: c, reason: collision with root package name */
        private boolean f18007c;

        /* renamed from: d, reason: collision with root package name */
        private int f18008d;

        /* renamed from: e, reason: collision with root package name */
        private int f18009e;

        /* renamed from: f, reason: collision with root package name */
        private int f18010f;

        /* renamed from: g, reason: collision with root package name */
        private int f18011g;

        /* renamed from: h, reason: collision with root package name */
        private int f18012h;

        /* renamed from: i, reason: collision with root package name */
        private int f18013i;

        /* JADX INFO: Access modifiers changed from: private */
        public void e(y yVar, int i10) {
            int iK;
            if (i10 < 4) {
                return;
            }
            yVar.X(3);
            int i11 = i10 - 4;
            if ((yVar.H() & 128) != 0) {
                if (i11 < 7 || (iK = yVar.K()) < 4) {
                    return;
                }
                this.f18012h = yVar.P();
                this.f18013i = yVar.P();
                this.f18005a.S(iK - 4);
                i11 = i10 - 11;
            }
            int iF = this.f18005a.f();
            int iG = this.f18005a.g();
            if (iF >= iG || i11 <= 0) {
                return;
            }
            int iMin = Math.min(i11, iG - iF);
            yVar.l(this.f18005a.e(), iF, iMin);
            this.f18005a.W(iF + iMin);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(y yVar, int i10) {
            if (i10 < 19) {
                return;
            }
            this.f18008d = yVar.P();
            this.f18009e = yVar.P();
            yVar.X(11);
            this.f18010f = yVar.P();
            this.f18011g = yVar.P();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(y yVar, int i10) {
            if (i10 % 5 != 2) {
                return;
            }
            yVar.X(2);
            Arrays.fill(this.f18006b, 0);
            int i11 = i10 / 5;
            for (int i12 = 0; i12 < i11; i12++) {
                int iH = yVar.H();
                int iH2 = yVar.H();
                int iH3 = yVar.H();
                int iH4 = yVar.H();
                double d10 = iH2;
                double d11 = iH3 - 128;
                double d12 = iH4 - 128;
                this.f18006b[iH] = (L.p((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255) << 8) | (yVar.H() << 24) | (L.p((int) ((1.402d * d11) + d10), 0, 255) << 16) | L.p((int) (d10 + (d12 * 1.772d)), 0, 255);
            }
            this.f18007c = true;
        }

        public W1.a d() {
            int iH;
            if (this.f18008d == 0 || this.f18009e == 0 || this.f18012h == 0 || this.f18013i == 0 || this.f18005a.g() == 0 || this.f18005a.f() != this.f18005a.g() || !this.f18007c) {
                return null;
            }
            this.f18005a.W(0);
            int i10 = this.f18012h * this.f18013i;
            int[] iArr = new int[i10];
            int i11 = 0;
            while (i11 < i10) {
                int iH2 = this.f18005a.H();
                if (iH2 != 0) {
                    iH = i11 + 1;
                    iArr[i11] = this.f18006b[iH2];
                } else {
                    int iH3 = this.f18005a.H();
                    if (iH3 != 0) {
                        iH = ((iH3 & 64) == 0 ? iH3 & 63 : ((iH3 & 63) << 8) | this.f18005a.H()) + i11;
                        Arrays.fill(iArr, i11, iH, (iH3 & 128) == 0 ? this.f18006b[0] : this.f18006b[this.f18005a.H()]);
                    }
                }
                i11 = iH;
            }
            return new a.b().f(Bitmap.createBitmap(iArr, this.f18012h, this.f18013i, Bitmap.Config.ARGB_8888)).k(this.f18010f / this.f18008d).l(0).h(this.f18011g / this.f18009e, 0).i(0).n(this.f18012h / this.f18008d).g(this.f18013i / this.f18009e).a();
        }

        public void h() {
            this.f18008d = 0;
            this.f18009e = 0;
            this.f18010f = 0;
            this.f18011g = 0;
            this.f18012h = 0;
            this.f18013i = 0;
            this.f18005a.S(0);
            this.f18007c = false;
        }
    }

    private void e(y yVar) {
        if (yVar.a() <= 0 || yVar.j() != 120) {
            return;
        }
        if (this.f18004d == null) {
            this.f18004d = new Inflater();
        }
        if (L.A0(yVar, this.f18002b, this.f18004d)) {
            yVar.U(this.f18002b.e(), this.f18002b.g());
        }
    }

    private static W1.a f(y yVar, C0264a c0264a) {
        int iG = yVar.g();
        int iH = yVar.H();
        int iP = yVar.P();
        int iF = yVar.f() + iP;
        W1.a aVarD = null;
        if (iF > iG) {
            yVar.W(iG);
            return null;
        }
        if (iH != 128) {
            switch (iH) {
                case 20:
                    c0264a.g(yVar, iP);
                    break;
                case 21:
                    c0264a.e(yVar, iP);
                    break;
                case 22:
                    c0264a.f(yVar, iP);
                    break;
            }
        } else {
            aVarD = c0264a.d();
            c0264a.h();
        }
        yVar.W(iF);
        return aVarD;
    }

    @Override // S2.r
    public void c(byte[] bArr, int i10, int i11, r.b bVar, InterfaceC1811h<e> interfaceC1811h) {
        this.f18001a.U(bArr, i11 + i10);
        this.f18001a.W(i10);
        e(this.f18001a);
        this.f18003c.h();
        ArrayList arrayList = new ArrayList();
        while (this.f18001a.a() >= 3) {
            W1.a aVarF = f(this.f18001a, this.f18003c);
            if (aVarF != null) {
                arrayList.add(aVarF);
            }
        }
        interfaceC1811h.accept(new e(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    @Override // S2.r
    public int d() {
        return 2;
    }
}
