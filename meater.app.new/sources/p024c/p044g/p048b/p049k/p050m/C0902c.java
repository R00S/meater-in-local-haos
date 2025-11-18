package p024c.p044g.p048b.p049k.p050m;

import java.util.ArrayList;
import java.util.Iterator;
import p024c.p044g.p048b.p049k.C0891d;
import p024c.p044g.p048b.p049k.C0892e;
import p024c.p044g.p048b.p049k.C0893f;

/* compiled from: ChainRun.java */
/* renamed from: c.g.b.k.m.c */
/* loaded from: classes.dex */
public class C0902c extends AbstractC0915p {

    /* renamed from: k */
    ArrayList<AbstractC0915p> f6097k;

    /* renamed from: l */
    private int f6098l;

    public C0902c(C0892e c0892e, int i2) {
        super(c0892e);
        this.f6097k = new ArrayList<>();
        this.f6164f = i2;
        m5805q();
    }

    /* renamed from: q */
    private void m5805q() {
        C0892e c0892e;
        C0892e c0892e2 = this.f6160b;
        C0892e c0892eM5670J = c0892e2.m5670J(this.f6164f);
        while (true) {
            C0892e c0892e3 = c0892eM5670J;
            c0892e = c0892e2;
            c0892e2 = c0892e3;
            if (c0892e2 == null) {
                break;
            } else {
                c0892eM5670J = c0892e2.m5670J(this.f6164f);
            }
        }
        this.f6160b = c0892e;
        this.f6097k.add(c0892e.m5674L(this.f6164f));
        C0892e c0892eM5666H = c0892e.m5666H(this.f6164f);
        while (c0892eM5666H != null) {
            this.f6097k.add(c0892eM5666H.m5674L(this.f6164f));
            c0892eM5666H = c0892eM5666H.m5666H(this.f6164f);
        }
        Iterator<AbstractC0915p> it = this.f6097k.iterator();
        while (it.hasNext()) {
            AbstractC0915p next = it.next();
            int i2 = this.f6164f;
            if (i2 == 0) {
                next.f6160b.f5974d = this;
            } else if (i2 == 1) {
                next.f6160b.f5976e = this;
            }
        }
        if ((this.f6164f == 0 && ((C0893f) this.f6160b.m5668I()).m5774x1()) && this.f6097k.size() > 1) {
            ArrayList<AbstractC0915p> arrayList = this.f6097k;
            this.f6160b = arrayList.get(arrayList.size() - 1).f6160b;
        }
        this.f6098l = this.f6164f == 0 ? this.f6160b.m5740x() : this.f6160b.m5678N();
    }

    /* renamed from: r */
    private C0892e m5806r() {
        for (int i2 = 0; i2 < this.f6097k.size(); i2++) {
            AbstractC0915p abstractC0915p = this.f6097k.get(i2);
            if (abstractC0915p.f6160b.m5684Q() != 8) {
                return abstractC0915p.f6160b;
            }
        }
        return null;
    }

    /* renamed from: s */
    private C0892e m5807s() {
        for (int size = this.f6097k.size() - 1; size >= 0; size--) {
            AbstractC0915p abstractC0915p = this.f6097k.get(size);
            if (abstractC0915p.f6160b.m5684Q() != 8) {
                return abstractC0915p.f6160b;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x01ce A[PHI: r1 r22 r23 r24
      0x01ce: PHI (r1v61 int) = (r1v59 int), (r1v67 int) binds: [B:119:0x01cc, B:110:0x01a6] A[DONT_GENERATE, DONT_INLINE]
      0x01ce: PHI (r22v3 float) = (r22v2 float), (r22v5 float) binds: [B:119:0x01cc, B:110:0x01a6] A[DONT_GENERATE, DONT_INLINE]
      0x01ce: PHI (r23v6 boolean) = (r23v5 boolean), (r23v8 boolean) binds: [B:119:0x01cc, B:110:0x01a6] A[DONT_GENERATE, DONT_INLINE]
      0x01ce: PHI (r24v6 int) = (r24v5 int), (r24v8 int) binds: [B:119:0x01cc, B:110:0x01a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00eb  */
    @Override // p024c.p044g.p048b.p049k.p050m.AbstractC0915p, p024c.p044g.p048b.p049k.p050m.InterfaceC0903d
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo5808a(p024c.p044g.p048b.p049k.p050m.InterfaceC0903d r26) {
        /*
            Method dump skipped, instructions count: 1090
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p024c.p044g.p048b.p049k.p050m.C0902c.mo5808a(c.g.b.k.m.d):void");
    }

    @Override // p024c.p044g.p048b.p049k.p050m.AbstractC0915p
    /* renamed from: d */
    void mo5809d() {
        Iterator<AbstractC0915p> it = this.f6097k.iterator();
        while (it.hasNext()) {
            it.next().mo5809d();
        }
        int size = this.f6097k.size();
        if (size < 1) {
            return;
        }
        C0892e c0892e = this.f6097k.get(0).f6160b;
        C0892e c0892e2 = this.f6097k.get(size - 1).f6160b;
        if (this.f6164f == 0) {
            C0891d c0891d = c0892e.f5951I;
            C0891d c0891d2 = c0892e2.f5953K;
            C0905f c0905fM5868i = m5868i(c0891d, 0);
            int iM5634e = c0891d.m5634e();
            C0892e c0892eM5806r = m5806r();
            if (c0892eM5806r != null) {
                iM5634e = c0892eM5806r.f5951I.m5634e();
            }
            if (c0905fM5868i != null) {
                m5864b(this.f6166h, c0905fM5868i, iM5634e);
            }
            C0905f c0905fM5868i2 = m5868i(c0891d2, 0);
            int iM5634e2 = c0891d2.m5634e();
            C0892e c0892eM5807s = m5807s();
            if (c0892eM5807s != null) {
                iM5634e2 = c0892eM5807s.f5953K.m5634e();
            }
            if (c0905fM5868i2 != null) {
                m5864b(this.f6167i, c0905fM5868i2, -iM5634e2);
            }
        } else {
            C0891d c0891d3 = c0892e.f5952J;
            C0891d c0891d4 = c0892e2.f5954L;
            C0905f c0905fM5868i3 = m5868i(c0891d3, 1);
            int iM5634e3 = c0891d3.m5634e();
            C0892e c0892eM5806r2 = m5806r();
            if (c0892eM5806r2 != null) {
                iM5634e3 = c0892eM5806r2.f5952J.m5634e();
            }
            if (c0905fM5868i3 != null) {
                m5864b(this.f6166h, c0905fM5868i3, iM5634e3);
            }
            C0905f c0905fM5868i4 = m5868i(c0891d4, 1);
            int iM5634e4 = c0891d4.m5634e();
            C0892e c0892eM5807s2 = m5807s();
            if (c0892eM5807s2 != null) {
                iM5634e4 = c0892eM5807s2.f5954L.m5634e();
            }
            if (c0905fM5868i4 != null) {
                m5864b(this.f6167i, c0905fM5868i4, -iM5634e4);
            }
        }
        this.f6166h.f6108a = this;
        this.f6167i.f6108a = this;
    }

    @Override // p024c.p044g.p048b.p049k.p050m.AbstractC0915p
    /* renamed from: e */
    public void mo5810e() {
        for (int i2 = 0; i2 < this.f6097k.size(); i2++) {
            this.f6097k.get(i2).mo5810e();
        }
    }

    @Override // p024c.p044g.p048b.p049k.p050m.AbstractC0915p
    /* renamed from: f */
    void mo5811f() {
        this.f6161c = null;
        Iterator<AbstractC0915p> it = this.f6097k.iterator();
        while (it.hasNext()) {
            it.next().mo5811f();
        }
    }

    @Override // p024c.p044g.p048b.p049k.p050m.AbstractC0915p
    /* renamed from: j */
    public long mo5812j() {
        int size = this.f6097k.size();
        long jMo5812j = 0;
        for (int i2 = 0; i2 < size; i2++) {
            jMo5812j = jMo5812j + r4.f6166h.f6113f + this.f6097k.get(i2).mo5812j() + r4.f6167i.f6113f;
        }
        return jMo5812j;
    }

    @Override // p024c.p044g.p048b.p049k.p050m.AbstractC0915p
    /* renamed from: m */
    boolean mo5813m() {
        int size = this.f6097k.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!this.f6097k.get(i2).mo5813m()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChainRun ");
        sb.append(this.f6164f == 0 ? "horizontal : " : "vertical : ");
        String string = sb.toString();
        Iterator<AbstractC0915p> it = this.f6097k.iterator();
        while (it.hasNext()) {
            String str = string + "<";
            string = (str + it.next()) + "> ";
        }
        return string;
    }
}
