package N2;

import X1.y;
import v2.InterfaceC4811q;

/* compiled from: Sniffer.java */
/* loaded from: classes.dex */
final class f {

    /* renamed from: a, reason: collision with root package name */
    private final y f12353a = new y(8);

    /* renamed from: b, reason: collision with root package name */
    private int f12354b;

    private long a(InterfaceC4811q interfaceC4811q) {
        int i10 = 0;
        interfaceC4811q.p(this.f12353a.e(), 0, 1);
        int i11 = this.f12353a.e()[0] & 255;
        if (i11 == 0) {
            return Long.MIN_VALUE;
        }
        int i12 = 128;
        int i13 = 0;
        while ((i11 & i12) == 0) {
            i12 >>= 1;
            i13++;
        }
        int i14 = i11 & (~i12);
        interfaceC4811q.p(this.f12353a.e(), 1, i13);
        while (i10 < i13) {
            i10++;
            i14 = (this.f12353a.e()[i10] & 255) + (i14 << 8);
        }
        this.f12354b += i13 + 1;
        return i14;
    }

    public boolean b(InterfaceC4811q interfaceC4811q) {
        long jA = interfaceC4811q.a();
        long j10 = 1024;
        if (jA != -1 && jA <= 1024) {
            j10 = jA;
        }
        int i10 = (int) j10;
        interfaceC4811q.p(this.f12353a.e(), 0, 4);
        long J10 = this.f12353a.J();
        this.f12354b = 4;
        while (J10 != 440786851) {
            int i11 = this.f12354b + 1;
            this.f12354b = i11;
            if (i11 == i10) {
                return false;
            }
            interfaceC4811q.p(this.f12353a.e(), 0, 1);
            J10 = ((J10 << 8) & (-256)) | (this.f12353a.e()[0] & 255);
        }
        long jA2 = a(interfaceC4811q);
        long j11 = this.f12354b;
        if (jA2 == Long.MIN_VALUE) {
            return false;
        }
        if (jA != -1 && j11 + jA2 >= jA) {
            return false;
        }
        while (true) {
            int i12 = this.f12354b;
            long j12 = j11 + jA2;
            if (i12 >= j12) {
                return ((long) i12) == j12;
            }
            if (a(interfaceC4811q) == Long.MIN_VALUE) {
                return false;
            }
            long jA3 = a(interfaceC4811q);
            if (jA3 < 0 || jA3 > 2147483647L) {
                break;
            }
            if (jA3 != 0) {
                int i13 = (int) jA3;
                interfaceC4811q.j(i13);
                this.f12354b += i13;
            }
        }
        return false;
    }
}
