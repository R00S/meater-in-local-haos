package x2;

import X1.L;
import X1.n;
import X1.y;

/* compiled from: AviStreamHeaderChunk.java */
/* loaded from: classes.dex */
final class d implements InterfaceC5052a {

    /* renamed from: a, reason: collision with root package name */
    public final int f52574a;

    /* renamed from: b, reason: collision with root package name */
    public final int f52575b;

    /* renamed from: c, reason: collision with root package name */
    public final int f52576c;

    /* renamed from: d, reason: collision with root package name */
    public final int f52577d;

    /* renamed from: e, reason: collision with root package name */
    public final int f52578e;

    /* renamed from: f, reason: collision with root package name */
    public final int f52579f;

    private d(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f52574a = i10;
        this.f52575b = i11;
        this.f52576c = i12;
        this.f52577d = i13;
        this.f52578e = i14;
        this.f52579f = i15;
    }

    public static d d(y yVar) {
        int iU = yVar.u();
        yVar.X(12);
        int iU2 = yVar.u();
        int iU3 = yVar.u();
        int iU4 = yVar.u();
        yVar.X(4);
        int iU5 = yVar.u();
        int iU6 = yVar.u();
        yVar.X(8);
        return new d(iU, iU2, iU3, iU4, iU5, iU6);
    }

    @Override // x2.InterfaceC5052a
    public int a() {
        return 1752331379;
    }

    public long b() {
        return L.d1(this.f52578e, this.f52576c * 1000000, this.f52577d);
    }

    public int c() {
        int i10 = this.f52574a;
        if (i10 == 1935960438) {
            return 2;
        }
        if (i10 == 1935963489) {
            return 1;
        }
        if (i10 == 1937012852) {
            return 3;
        }
        n.h("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(this.f52574a));
        return -1;
    }
}
