package p024c.p044g.p048b.p049k;

import java.util.ArrayList;
import java.util.Arrays;
import p024c.p044g.p048b.p049k.p050m.C0908i;
import p024c.p044g.p048b.p049k.p050m.C0914o;

/* compiled from: HelperWidget.java */
/* renamed from: c.g.b.k.i */
/* loaded from: classes.dex */
public class C0896i extends C0892e implements InterfaceC0895h {

    /* renamed from: D0 */
    public C0892e[] f6064D0 = new C0892e[4];

    /* renamed from: E0 */
    public int f6065E0 = 0;

    @Override // p024c.p044g.p048b.p049k.InterfaceC0895h
    /* renamed from: a */
    public void mo5787a(C0892e c0892e) {
        if (c0892e == this || c0892e == null) {
            return;
        }
        int i2 = this.f6065E0 + 1;
        C0892e[] c0892eArr = this.f6064D0;
        if (i2 > c0892eArr.length) {
            this.f6064D0 = (C0892e[]) Arrays.copyOf(c0892eArr, c0892eArr.length * 2);
        }
        C0892e[] c0892eArr2 = this.f6064D0;
        int i3 = this.f6065E0;
        c0892eArr2[i3] = c0892e;
        this.f6065E0 = i3 + 1;
    }

    /* renamed from: a1 */
    public void m5790a1(ArrayList<C0914o> arrayList, int i2, C0914o c0914o) {
        for (int i3 = 0; i3 < this.f6065E0; i3++) {
            c0914o.m5855a(this.f6064D0[i3]);
        }
        for (int i4 = 0; i4 < this.f6065E0; i4++) {
            C0908i.m5840a(this.f6064D0[i4], i2, arrayList, c0914o);
        }
    }

    @Override // p024c.p044g.p048b.p049k.InterfaceC0895h
    /* renamed from: b */
    public void mo5788b() {
        this.f6065E0 = 0;
        Arrays.fill(this.f6064D0, (Object) null);
    }

    /* renamed from: b1 */
    public int m5791b1(int i2) {
        int i3;
        int i4;
        for (int i5 = 0; i5 < this.f6065E0; i5++) {
            C0892e c0892e = this.f6064D0[i5];
            if (i2 == 0 && (i4 = c0892e.f5943B0) != -1) {
                return i4;
            }
            if (i2 == 1 && (i3 = c0892e.f5945C0) != -1) {
                return i3;
            }
        }
        return -1;
    }

    @Override // p024c.p044g.p048b.p049k.InterfaceC0895h
    /* renamed from: c */
    public void mo5789c(C0893f c0893f) {
    }
}
