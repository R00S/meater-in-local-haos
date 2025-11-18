package p024c.p044g.p048b.p049k;

import java.util.ArrayList;
import p024c.p044g.p048b.C0880c;

/* compiled from: WidgetContainer.java */
/* renamed from: c.g.b.k.l */
/* loaded from: classes.dex */
public class C0899l extends C0892e {

    /* renamed from: D0 */
    public ArrayList<C0892e> f6080D0 = new ArrayList<>();

    /* renamed from: a */
    public void m5796a(C0892e c0892e) {
        this.f6080D0.add(c0892e);
        if (c0892e.m5668I() != null) {
            ((C0899l) c0892e.m5668I()).m5798c1(c0892e);
        }
        c0892e.m5677M0(this);
    }

    /* renamed from: a1 */
    public ArrayList<C0892e> m5797a1() {
        return this.f6080D0;
    }

    /* renamed from: b1 */
    public void mo5758b1() {
        ArrayList<C0892e> arrayList = this.f6080D0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0892e c0892e = this.f6080D0.get(i2);
            if (c0892e instanceof C0899l) {
                ((C0899l) c0892e).mo5758b1();
            }
        }
    }

    /* renamed from: c1 */
    public void m5798c1(C0892e c0892e) {
        this.f6080D0.remove(c0892e);
        c0892e.mo5710h0();
    }

    /* renamed from: d1 */
    public void m5799d1() {
        this.f6080D0.clear();
    }

    @Override // p024c.p044g.p048b.p049k.C0892e
    /* renamed from: h0 */
    public void mo5710h0() {
        this.f6080D0.clear();
        super.mo5710h0();
    }

    @Override // p024c.p044g.p048b.p049k.C0892e
    /* renamed from: j0 */
    public void mo5713j0(C0880c c0880c) {
        super.mo5713j0(c0880c);
        int size = this.f6080D0.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f6080D0.get(i2).mo5713j0(c0880c);
        }
    }
}
