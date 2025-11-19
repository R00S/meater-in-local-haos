package Q2;

import X1.C1804a;
import X1.y;
import java.util.Arrays;
import v2.C4812s;
import v2.InterfaceC4811q;

/* compiled from: OggPacket.java */
/* loaded from: classes.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    private final f f14238a = new f();

    /* renamed from: b, reason: collision with root package name */
    private final y f14239b = new y(new byte[65025], 0);

    /* renamed from: c, reason: collision with root package name */
    private int f14240c = -1;

    /* renamed from: d, reason: collision with root package name */
    private int f14241d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f14242e;

    e() {
    }

    private int a(int i10) {
        int i11;
        int i12 = 0;
        this.f14241d = 0;
        do {
            int i13 = this.f14241d;
            int i14 = i10 + i13;
            f fVar = this.f14238a;
            if (i14 >= fVar.f14249g) {
                break;
            }
            int[] iArr = fVar.f14252j;
            this.f14241d = i13 + 1;
            i11 = iArr[i13 + i10];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }

    public f b() {
        return this.f14238a;
    }

    public y c() {
        return this.f14239b;
    }

    public boolean d(InterfaceC4811q interfaceC4811q) {
        int i10;
        C1804a.g(interfaceC4811q != null);
        if (this.f14242e) {
            this.f14242e = false;
            this.f14239b.S(0);
        }
        while (!this.f14242e) {
            if (this.f14240c < 0) {
                if (!this.f14238a.c(interfaceC4811q) || !this.f14238a.a(interfaceC4811q, true)) {
                    return false;
                }
                f fVar = this.f14238a;
                int iA = fVar.f14250h;
                if ((fVar.f14244b & 1) == 1 && this.f14239b.g() == 0) {
                    iA += a(0);
                    i10 = this.f14241d;
                } else {
                    i10 = 0;
                }
                if (!C4812s.e(interfaceC4811q, iA)) {
                    return false;
                }
                this.f14240c = i10;
            }
            int iA2 = a(this.f14240c);
            int i11 = this.f14240c + this.f14241d;
            if (iA2 > 0) {
                y yVar = this.f14239b;
                yVar.c(yVar.g() + iA2);
                if (!C4812s.d(interfaceC4811q, this.f14239b.e(), this.f14239b.g(), iA2)) {
                    return false;
                }
                y yVar2 = this.f14239b;
                yVar2.V(yVar2.g() + iA2);
                this.f14242e = this.f14238a.f14252j[i11 + (-1)] != 255;
            }
            if (i11 == this.f14238a.f14249g) {
                i11 = -1;
            }
            this.f14240c = i11;
        }
        return true;
    }

    public void e() {
        this.f14238a.b();
        this.f14239b.S(0);
        this.f14240c = -1;
        this.f14242e = false;
    }

    public void f() {
        if (this.f14239b.e().length == 65025) {
            return;
        }
        y yVar = this.f14239b;
        yVar.U(Arrays.copyOf(yVar.e(), Math.max(65025, this.f14239b.g())), this.f14239b.g());
    }
}
