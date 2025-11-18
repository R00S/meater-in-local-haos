package p024c.p044g.p048b.p049k.p050m;

import java.util.ArrayList;
import p024c.p044g.p048b.p049k.C0893f;

/* compiled from: RunGroup.java */
/* renamed from: c.g.b.k.m.m */
/* loaded from: classes.dex */
class C0912m {

    /* renamed from: a */
    public static int f6133a;

    /* renamed from: d */
    AbstractC0915p f6136d;

    /* renamed from: e */
    AbstractC0915p f6137e;

    /* renamed from: g */
    int f6139g;

    /* renamed from: h */
    int f6140h;

    /* renamed from: b */
    public int f6134b = 0;

    /* renamed from: c */
    public boolean f6135c = false;

    /* renamed from: f */
    ArrayList<AbstractC0915p> f6138f = new ArrayList<>();

    public C0912m(AbstractC0915p abstractC0915p, int i2) {
        this.f6136d = null;
        this.f6137e = null;
        this.f6139g = 0;
        int i3 = f6133a;
        this.f6139g = i3;
        f6133a = i3 + 1;
        this.f6136d = abstractC0915p;
        this.f6137e = abstractC0915p;
        this.f6140h = i2;
    }

    /* renamed from: c */
    private long m5848c(C0905f c0905f, long j2) {
        AbstractC0915p abstractC0915p = c0905f.f6111d;
        if (abstractC0915p instanceof C0910k) {
            return j2;
        }
        int size = c0905f.f6118k.size();
        long jMin = j2;
        for (int i2 = 0; i2 < size; i2++) {
            InterfaceC0903d interfaceC0903d = c0905f.f6118k.get(i2);
            if (interfaceC0903d instanceof C0905f) {
                C0905f c0905f2 = (C0905f) interfaceC0903d;
                if (c0905f2.f6111d != abstractC0915p) {
                    jMin = Math.min(jMin, m5848c(c0905f2, c0905f2.f6113f + j2));
                }
            }
        }
        if (c0905f != abstractC0915p.f6167i) {
            return jMin;
        }
        long jMo5812j = j2 - abstractC0915p.mo5812j();
        return Math.min(Math.min(jMin, m5848c(abstractC0915p.f6166h, jMo5812j)), jMo5812j - abstractC0915p.f6166h.f6113f);
    }

    /* renamed from: d */
    private long m5849d(C0905f c0905f, long j2) {
        AbstractC0915p abstractC0915p = c0905f.f6111d;
        if (abstractC0915p instanceof C0910k) {
            return j2;
        }
        int size = c0905f.f6118k.size();
        long jMax = j2;
        for (int i2 = 0; i2 < size; i2++) {
            InterfaceC0903d interfaceC0903d = c0905f.f6118k.get(i2);
            if (interfaceC0903d instanceof C0905f) {
                C0905f c0905f2 = (C0905f) interfaceC0903d;
                if (c0905f2.f6111d != abstractC0915p) {
                    jMax = Math.max(jMax, m5849d(c0905f2, c0905f2.f6113f + j2));
                }
            }
        }
        if (c0905f != abstractC0915p.f6166h) {
            return jMax;
        }
        long jMo5812j = j2 + abstractC0915p.mo5812j();
        return Math.max(Math.max(jMax, m5849d(abstractC0915p.f6167i, jMo5812j)), jMo5812j - abstractC0915p.f6167i.f6113f);
    }

    /* renamed from: a */
    public void m5850a(AbstractC0915p abstractC0915p) {
        this.f6138f.add(abstractC0915p);
        this.f6137e = abstractC0915p;
    }

    /* renamed from: b */
    public long m5851b(C0893f c0893f, int i2) {
        long jMo5812j;
        int i3;
        AbstractC0915p abstractC0915p = this.f6136d;
        if (abstractC0915p instanceof C0902c) {
            if (((C0902c) abstractC0915p).f6164f != i2) {
                return 0L;
            }
        } else if (i2 == 0) {
            if (!(abstractC0915p instanceof C0911l)) {
                return 0L;
            }
        } else if (!(abstractC0915p instanceof C0913n)) {
            return 0L;
        }
        C0905f c0905f = (i2 == 0 ? c0893f.f5978f : c0893f.f5980g).f6166h;
        C0905f c0905f2 = (i2 == 0 ? c0893f.f5978f : c0893f.f5980g).f6167i;
        boolean zContains = abstractC0915p.f6166h.f6119l.contains(c0905f);
        boolean zContains2 = this.f6136d.f6167i.f6119l.contains(c0905f2);
        long jMo5812j2 = this.f6136d.mo5812j();
        if (zContains && zContains2) {
            long jM5849d = m5849d(this.f6136d.f6166h, 0L);
            long jM5848c = m5848c(this.f6136d.f6167i, 0L);
            long j2 = jM5849d - jMo5812j2;
            AbstractC0915p abstractC0915p2 = this.f6136d;
            int i4 = abstractC0915p2.f6167i.f6113f;
            if (j2 >= (-i4)) {
                j2 += i4;
            }
            int i5 = abstractC0915p2.f6166h.f6113f;
            long j3 = ((-jM5848c) - jMo5812j2) - i5;
            if (j3 >= i5) {
                j3 -= i5;
            }
            float fM5722o = abstractC0915p2.f6160b.m5722o(i2);
            float f2 = fM5722o > 0.0f ? (long) ((j3 / fM5722o) + (j2 / (1.0f - fM5722o))) : 0L;
            long j4 = ((long) ((f2 * fM5722o) + 0.5f)) + jMo5812j2 + ((long) ((f2 * (1.0f - fM5722o)) + 0.5f));
            jMo5812j = r13.f6166h.f6113f + j4;
            i3 = this.f6136d.f6167i.f6113f;
        } else {
            if (zContains) {
                return Math.max(m5849d(this.f6136d.f6166h, r13.f6113f), this.f6136d.f6166h.f6113f + jMo5812j2);
            }
            if (zContains2) {
                return Math.max(-m5848c(this.f6136d.f6167i, r13.f6113f), (-this.f6136d.f6167i.f6113f) + jMo5812j2);
            }
            jMo5812j = r13.f6166h.f6113f + this.f6136d.mo5812j();
            i3 = this.f6136d.f6167i.f6113f;
        }
        return jMo5812j - i3;
    }
}
