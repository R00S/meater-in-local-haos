package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import r1.C4340g;
import r1.InterfaceC4339f;
import s.C4411v;
import s.X;

/* compiled from: ViewInfoStore.java */
/* loaded from: classes.dex */
class y {

    /* renamed from: a, reason: collision with root package name */
    final X<RecyclerView.G, a> f29038a = new X<>();

    /* renamed from: b, reason: collision with root package name */
    final C4411v<RecyclerView.G> f29039b = new C4411v<>();

    /* compiled from: ViewInfoStore.java */
    static class a {

        /* renamed from: d, reason: collision with root package name */
        static InterfaceC4339f<a> f29040d = new C4340g(20);

        /* renamed from: a, reason: collision with root package name */
        int f29041a;

        /* renamed from: b, reason: collision with root package name */
        RecyclerView.n.c f29042b;

        /* renamed from: c, reason: collision with root package name */
        RecyclerView.n.c f29043c;

        private a() {
        }

        static void a() {
            while (f29040d.b() != null) {
            }
        }

        static a b() {
            a aVarB = f29040d.b();
            return aVarB == null ? new a() : aVarB;
        }

        static void c(a aVar) {
            aVar.f29041a = 0;
            aVar.f29042b = null;
            aVar.f29043c = null;
            f29040d.a(aVar);
        }
    }

    /* compiled from: ViewInfoStore.java */
    interface b {
        void a(RecyclerView.G g10);

        void b(RecyclerView.G g10, RecyclerView.n.c cVar, RecyclerView.n.c cVar2);

        void c(RecyclerView.G g10, RecyclerView.n.c cVar, RecyclerView.n.c cVar2);

        void d(RecyclerView.G g10, RecyclerView.n.c cVar, RecyclerView.n.c cVar2);
    }

    y() {
    }

    private RecyclerView.n.c l(RecyclerView.G g10, int i10) {
        a aVarL;
        RecyclerView.n.c cVar;
        int iD = this.f29038a.d(g10);
        if (iD >= 0 && (aVarL = this.f29038a.l(iD)) != null) {
            int i11 = aVarL.f29041a;
            if ((i11 & i10) != 0) {
                int i12 = (~i10) & i11;
                aVarL.f29041a = i12;
                if (i10 == 4) {
                    cVar = aVarL.f29042b;
                } else {
                    if (i10 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    cVar = aVarL.f29043c;
                }
                if ((i12 & 12) == 0) {
                    this.f29038a.j(iD);
                    a.c(aVarL);
                }
                return cVar;
            }
        }
        return null;
    }

    void a(RecyclerView.G g10, RecyclerView.n.c cVar) {
        a aVarB = this.f29038a.get(g10);
        if (aVarB == null) {
            aVarB = a.b();
            this.f29038a.put(g10, aVarB);
        }
        aVarB.f29041a |= 2;
        aVarB.f29042b = cVar;
    }

    void b(RecyclerView.G g10) {
        a aVarB = this.f29038a.get(g10);
        if (aVarB == null) {
            aVarB = a.b();
            this.f29038a.put(g10, aVarB);
        }
        aVarB.f29041a |= 1;
    }

    void c(long j10, RecyclerView.G g10) {
        this.f29039b.k(j10, g10);
    }

    void d(RecyclerView.G g10, RecyclerView.n.c cVar) {
        a aVarB = this.f29038a.get(g10);
        if (aVarB == null) {
            aVarB = a.b();
            this.f29038a.put(g10, aVarB);
        }
        aVarB.f29043c = cVar;
        aVarB.f29041a |= 8;
    }

    void e(RecyclerView.G g10, RecyclerView.n.c cVar) {
        a aVarB = this.f29038a.get(g10);
        if (aVarB == null) {
            aVarB = a.b();
            this.f29038a.put(g10, aVarB);
        }
        aVarB.f29042b = cVar;
        aVarB.f29041a |= 4;
    }

    void f() {
        this.f29038a.clear();
        this.f29039b.b();
    }

    RecyclerView.G g(long j10) {
        return this.f29039b.f(j10);
    }

    boolean h(RecyclerView.G g10) {
        a aVar = this.f29038a.get(g10);
        return (aVar == null || (aVar.f29041a & 1) == 0) ? false : true;
    }

    boolean i(RecyclerView.G g10) {
        a aVar = this.f29038a.get(g10);
        return (aVar == null || (aVar.f29041a & 4) == 0) ? false : true;
    }

    void j() {
        a.a();
    }

    public void k(RecyclerView.G g10) {
        p(g10);
    }

    RecyclerView.n.c m(RecyclerView.G g10) {
        return l(g10, 8);
    }

    RecyclerView.n.c n(RecyclerView.G g10) {
        return l(g10, 4);
    }

    void o(b bVar) {
        for (int size = this.f29038a.getSize() - 1; size >= 0; size--) {
            RecyclerView.G gH = this.f29038a.h(size);
            a aVarJ = this.f29038a.j(size);
            int i10 = aVarJ.f29041a;
            if ((i10 & 3) == 3) {
                bVar.a(gH);
            } else if ((i10 & 1) != 0) {
                RecyclerView.n.c cVar = aVarJ.f29042b;
                if (cVar == null) {
                    bVar.a(gH);
                } else {
                    bVar.c(gH, cVar, aVarJ.f29043c);
                }
            } else if ((i10 & 14) == 14) {
                bVar.b(gH, aVarJ.f29042b, aVarJ.f29043c);
            } else if ((i10 & 12) == 12) {
                bVar.d(gH, aVarJ.f29042b, aVarJ.f29043c);
            } else if ((i10 & 4) != 0) {
                bVar.c(gH, aVarJ.f29042b, null);
            } else if ((i10 & 8) != 0) {
                bVar.b(gH, aVarJ.f29042b, aVarJ.f29043c);
            }
            a.c(aVarJ);
        }
    }

    void p(RecyclerView.G g10) {
        a aVar = this.f29038a.get(g10);
        if (aVar == null) {
            return;
        }
        aVar.f29041a &= -2;
    }

    void q(RecyclerView.G g10) {
        int iN = this.f29039b.n() - 1;
        while (true) {
            if (iN < 0) {
                break;
            }
            if (g10 == this.f29039b.o(iN)) {
                this.f29039b.m(iN);
                break;
            }
            iN--;
        }
        a aVarRemove = this.f29038a.remove(g10);
        if (aVarRemove != null) {
            a.c(aVarRemove);
        }
    }
}
