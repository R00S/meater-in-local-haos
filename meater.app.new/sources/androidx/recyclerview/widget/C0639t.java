package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import p024c.p041e.C0870d;
import p024c.p041e.C0873g;
import p024c.p052i.p059j.C0957g;
import p024c.p052i.p059j.InterfaceC0956f;

/* compiled from: ViewInfoStore.java */
/* renamed from: androidx.recyclerview.widget.t */
/* loaded from: classes.dex */
class C0639t {

    /* renamed from: a */
    final C0873g<RecyclerView.AbstractC0590c0, a> f4224a = new C0873g<>();

    /* renamed from: b */
    final C0870d<RecyclerView.AbstractC0590c0> f4225b = new C0870d<>();

    /* compiled from: ViewInfoStore.java */
    /* renamed from: androidx.recyclerview.widget.t$a */
    static class a {

        /* renamed from: a */
        static InterfaceC0956f<a> f4226a = new C0957g(20);

        /* renamed from: b */
        int f4227b;

        /* renamed from: c */
        RecyclerView.AbstractC0599l.c f4228c;

        /* renamed from: d */
        RecyclerView.AbstractC0599l.c f4229d;

        private a() {
        }

        /* renamed from: a */
        static void m4579a() {
            while (f4226a.mo6061b() != null) {
            }
        }

        /* renamed from: b */
        static a m4580b() {
            a aVarMo6061b = f4226a.mo6061b();
            return aVarMo6061b == null ? new a() : aVarMo6061b;
        }

        /* renamed from: c */
        static void m4581c(a aVar) {
            aVar.f4227b = 0;
            aVar.f4228c = null;
            aVar.f4229d = null;
            f4226a.mo6060a(aVar);
        }
    }

    /* compiled from: ViewInfoStore.java */
    /* renamed from: androidx.recyclerview.widget.t$b */
    interface b {
        /* renamed from: a */
        void mo4195a(RecyclerView.AbstractC0590c0 abstractC0590c0);

        /* renamed from: b */
        void mo4196b(RecyclerView.AbstractC0590c0 abstractC0590c0, RecyclerView.AbstractC0599l.c cVar, RecyclerView.AbstractC0599l.c cVar2);

        /* renamed from: c */
        void mo4197c(RecyclerView.AbstractC0590c0 abstractC0590c0, RecyclerView.AbstractC0599l.c cVar, RecyclerView.AbstractC0599l.c cVar2);

        /* renamed from: d */
        void mo4198d(RecyclerView.AbstractC0590c0 abstractC0590c0, RecyclerView.AbstractC0599l.c cVar, RecyclerView.AbstractC0599l.c cVar2);
    }

    C0639t() {
    }

    /* renamed from: l */
    private RecyclerView.AbstractC0599l.c m4562l(RecyclerView.AbstractC0590c0 abstractC0590c0, int i2) {
        a aVarM5477n;
        RecyclerView.AbstractC0599l.c cVar;
        int iM5470f = this.f4224a.m5470f(abstractC0590c0);
        if (iM5470f >= 0 && (aVarM5477n = this.f4224a.m5477n(iM5470f)) != null) {
            int i3 = aVarM5477n.f4227b;
            if ((i3 & i2) != 0) {
                int i4 = (i2 ^ (-1)) & i3;
                aVarM5477n.f4227b = i4;
                if (i2 == 4) {
                    cVar = aVarM5477n.f4228c;
                } else {
                    if (i2 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    cVar = aVarM5477n.f4229d;
                }
                if ((i4 & 12) == 0) {
                    this.f4224a.mo5475l(iM5470f);
                    a.m4581c(aVarM5477n);
                }
                return cVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    void m4563a(RecyclerView.AbstractC0590c0 abstractC0590c0, RecyclerView.AbstractC0599l.c cVar) {
        a aVarM4580b = this.f4224a.get(abstractC0590c0);
        if (aVarM4580b == null) {
            aVarM4580b = a.m4580b();
            this.f4224a.put(abstractC0590c0, aVarM4580b);
        }
        aVarM4580b.f4227b |= 2;
        aVarM4580b.f4228c = cVar;
    }

    /* renamed from: b */
    void m4564b(RecyclerView.AbstractC0590c0 abstractC0590c0) {
        a aVarM4580b = this.f4224a.get(abstractC0590c0);
        if (aVarM4580b == null) {
            aVarM4580b = a.m4580b();
            this.f4224a.put(abstractC0590c0, aVarM4580b);
        }
        aVarM4580b.f4227b |= 1;
    }

    /* renamed from: c */
    void m4565c(long j2, RecyclerView.AbstractC0590c0 abstractC0590c0) {
        this.f4225b.m5442k(j2, abstractC0590c0);
    }

    /* renamed from: d */
    void m4566d(RecyclerView.AbstractC0590c0 abstractC0590c0, RecyclerView.AbstractC0599l.c cVar) {
        a aVarM4580b = this.f4224a.get(abstractC0590c0);
        if (aVarM4580b == null) {
            aVarM4580b = a.m4580b();
            this.f4224a.put(abstractC0590c0, aVarM4580b);
        }
        aVarM4580b.f4229d = cVar;
        aVarM4580b.f4227b |= 8;
    }

    /* renamed from: e */
    void m4567e(RecyclerView.AbstractC0590c0 abstractC0590c0, RecyclerView.AbstractC0599l.c cVar) {
        a aVarM4580b = this.f4224a.get(abstractC0590c0);
        if (aVarM4580b == null) {
            aVarM4580b = a.m4580b();
            this.f4224a.put(abstractC0590c0, aVarM4580b);
        }
        aVarM4580b.f4228c = cVar;
        aVarM4580b.f4227b |= 4;
    }

    /* renamed from: f */
    void m4568f() {
        this.f4224a.clear();
        this.f4225b.m5436d();
    }

    /* renamed from: g */
    RecyclerView.AbstractC0590c0 m4569g(long j2) {
        return this.f4225b.m5438g(j2);
    }

    /* renamed from: h */
    boolean m4570h(RecyclerView.AbstractC0590c0 abstractC0590c0) {
        a aVar = this.f4224a.get(abstractC0590c0);
        return (aVar == null || (aVar.f4227b & 1) == 0) ? false : true;
    }

    /* renamed from: i */
    boolean m4571i(RecyclerView.AbstractC0590c0 abstractC0590c0) {
        a aVar = this.f4224a.get(abstractC0590c0);
        return (aVar == null || (aVar.f4227b & 4) == 0) ? false : true;
    }

    /* renamed from: j */
    void m4572j() {
        a.m4579a();
    }

    /* renamed from: k */
    public void m4573k(RecyclerView.AbstractC0590c0 abstractC0590c0) {
        m4577p(abstractC0590c0);
    }

    /* renamed from: m */
    RecyclerView.AbstractC0599l.c m4574m(RecyclerView.AbstractC0590c0 abstractC0590c0) {
        return m4562l(abstractC0590c0, 8);
    }

    /* renamed from: n */
    RecyclerView.AbstractC0599l.c m4575n(RecyclerView.AbstractC0590c0 abstractC0590c0) {
        return m4562l(abstractC0590c0, 4);
    }

    /* renamed from: o */
    void m4576o(b bVar) {
        for (int size = this.f4224a.size() - 1; size >= 0; size--) {
            RecyclerView.AbstractC0590c0 abstractC0590c0M5473j = this.f4224a.m5473j(size);
            a aVarMo5475l = this.f4224a.mo5475l(size);
            int i2 = aVarMo5475l.f4227b;
            if ((i2 & 3) == 3) {
                bVar.mo4195a(abstractC0590c0M5473j);
            } else if ((i2 & 1) != 0) {
                RecyclerView.AbstractC0599l.c cVar = aVarMo5475l.f4228c;
                if (cVar == null) {
                    bVar.mo4195a(abstractC0590c0M5473j);
                } else {
                    bVar.mo4197c(abstractC0590c0M5473j, cVar, aVarMo5475l.f4229d);
                }
            } else if ((i2 & 14) == 14) {
                bVar.mo4196b(abstractC0590c0M5473j, aVarMo5475l.f4228c, aVarMo5475l.f4229d);
            } else if ((i2 & 12) == 12) {
                bVar.mo4198d(abstractC0590c0M5473j, aVarMo5475l.f4228c, aVarMo5475l.f4229d);
            } else if ((i2 & 4) != 0) {
                bVar.mo4197c(abstractC0590c0M5473j, aVarMo5475l.f4228c, null);
            } else if ((i2 & 8) != 0) {
                bVar.mo4196b(abstractC0590c0M5473j, aVarMo5475l.f4228c, aVarMo5475l.f4229d);
            }
            a.m4581c(aVarMo5475l);
        }
    }

    /* renamed from: p */
    void m4577p(RecyclerView.AbstractC0590c0 abstractC0590c0) {
        a aVar = this.f4224a.get(abstractC0590c0);
        if (aVar == null) {
            return;
        }
        aVar.f4227b &= -2;
    }

    /* renamed from: q */
    void m4578q(RecyclerView.AbstractC0590c0 abstractC0590c0) {
        int iM5445n = this.f4225b.m5445n() - 1;
        while (true) {
            if (iM5445n < 0) {
                break;
            }
            if (abstractC0590c0 == this.f4225b.m5446o(iM5445n)) {
                this.f4225b.m5444m(iM5445n);
                break;
            }
            iM5445n--;
        }
        a aVarRemove = this.f4224a.remove(abstractC0590c0);
        if (aVarRemove != null) {
            a.m4581c(aVarRemove);
        }
    }
}
