package p024c.p044g.p048b.p049k;

import p024c.p044g.p048b.C0881d;
import p024c.p044g.p048b.p049k.C0892e;

/* compiled from: Optimizer.java */
/* renamed from: c.g.b.k.j */
/* loaded from: classes.dex */
public class C0897j {

    /* renamed from: a */
    static boolean[] f6066a = new boolean[3];

    /* renamed from: a */
    static void m5792a(C0893f c0893f, C0881d c0881d, C0892e c0892e) {
        c0892e.f5996o = -1;
        c0892e.f5998p = -1;
        C0892e.b bVar = c0893f.f5962T[0];
        C0892e.b bVar2 = C0892e.b.WRAP_CONTENT;
        if (bVar != bVar2 && c0892e.f5962T[0] == C0892e.b.MATCH_PARENT) {
            int i2 = c0892e.f5951I.f5925g;
            int iM5686R = c0893f.m5686R() - c0892e.f5953K.f5925g;
            C0891d c0891d = c0892e.f5951I;
            c0891d.f5927i = c0881d.m5580q(c0891d);
            C0891d c0891d2 = c0892e.f5953K;
            c0891d2.f5927i = c0881d.m5580q(c0891d2);
            c0881d.m5571f(c0892e.f5951I.f5927i, i2);
            c0881d.m5571f(c0892e.f5953K.f5927i, iM5686R);
            c0892e.f5996o = 2;
            c0892e.m5743y0(i2, iM5686R);
        }
        if (c0893f.f5962T[1] == bVar2 || c0892e.f5962T[1] != C0892e.b.MATCH_PARENT) {
            return;
        }
        int i3 = c0892e.f5952J.f5925g;
        int iM5736v = c0893f.m5736v() - c0892e.f5954L.f5925g;
        C0891d c0891d3 = c0892e.f5952J;
        c0891d3.f5927i = c0881d.m5580q(c0891d3);
        C0891d c0891d4 = c0892e.f5954L;
        c0891d4.f5927i = c0881d.m5580q(c0891d4);
        c0881d.m5571f(c0892e.f5952J.f5927i, i3);
        c0881d.m5571f(c0892e.f5954L.f5927i, iM5736v);
        if (c0892e.f5979f0 > 0 || c0892e.m5684Q() == 8) {
            C0891d c0891d5 = c0892e.f5955M;
            c0891d5.f5927i = c0881d.m5580q(c0891d5);
            c0881d.m5571f(c0892e.f5955M.f5927i, c0892e.f5979f0 + i3);
        }
        c0892e.f5998p = 2;
        c0892e.m5683P0(i3, iM5736v);
    }

    /* renamed from: b */
    public static final boolean m5793b(int i2, int i3) {
        return (i2 & i3) == i3;
    }
}
