package b3;

import b3.L;

/* compiled from: SectionReader.java */
/* loaded from: classes.dex */
public final class E implements L {

    /* renamed from: a, reason: collision with root package name */
    private final D f30142a;

    /* renamed from: b, reason: collision with root package name */
    private final X1.y f30143b = new X1.y(32);

    /* renamed from: c, reason: collision with root package name */
    private int f30144c;

    /* renamed from: d, reason: collision with root package name */
    private int f30145d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f30146e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f30147f;

    public E(D d10) {
        this.f30142a = d10;
    }

    @Override // b3.L
    public void a() {
        this.f30147f = true;
    }

    @Override // b3.L
    public void b(X1.y yVar, int i10) {
        boolean z10 = (i10 & 1) != 0;
        int iF = z10 ? yVar.f() + yVar.H() : -1;
        if (this.f30147f) {
            if (!z10) {
                return;
            }
            this.f30147f = false;
            yVar.W(iF);
            this.f30145d = 0;
        }
        while (yVar.a() > 0) {
            int i11 = this.f30145d;
            if (i11 < 3) {
                if (i11 == 0) {
                    int iH = yVar.H();
                    yVar.W(yVar.f() - 1);
                    if (iH == 255) {
                        this.f30147f = true;
                        return;
                    }
                }
                int iMin = Math.min(yVar.a(), 3 - this.f30145d);
                yVar.l(this.f30143b.e(), this.f30145d, iMin);
                int i12 = this.f30145d + iMin;
                this.f30145d = i12;
                if (i12 == 3) {
                    this.f30143b.W(0);
                    this.f30143b.V(3);
                    this.f30143b.X(1);
                    int iH2 = this.f30143b.H();
                    int iH3 = this.f30143b.H();
                    this.f30146e = (iH2 & 128) != 0;
                    this.f30144c = (((iH2 & 15) << 8) | iH3) + 3;
                    int iB = this.f30143b.b();
                    int i13 = this.f30144c;
                    if (iB < i13) {
                        this.f30143b.c(Math.min(4098, Math.max(i13, this.f30143b.b() * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(yVar.a(), this.f30144c - this.f30145d);
                yVar.l(this.f30143b.e(), this.f30145d, iMin2);
                int i14 = this.f30145d + iMin2;
                this.f30145d = i14;
                int i15 = this.f30144c;
                if (i14 != i15) {
                    continue;
                } else {
                    if (!this.f30146e) {
                        this.f30143b.V(i15);
                    } else {
                        if (X1.L.x(this.f30143b.e(), 0, this.f30144c, -1) != 0) {
                            this.f30147f = true;
                            return;
                        }
                        this.f30143b.V(this.f30144c - 4);
                    }
                    this.f30143b.W(0);
                    this.f30142a.b(this.f30143b);
                    this.f30145d = 0;
                }
            }
        }
    }

    @Override // b3.L
    public void c(X1.E e10, v2.r rVar, L.d dVar) {
        this.f30142a.c(e10, rVar, dVar);
        this.f30147f = true;
    }
}
