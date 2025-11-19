package androidx.recyclerview.widget;

import android.util.Log;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.o;
import androidx.recyclerview.widget.w;
import androidx.recyclerview.widget.z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: ConcatAdapterController.java */
/* loaded from: classes.dex */
class f implements o.b {

    /* renamed from: a, reason: collision with root package name */
    private final e f28841a;

    /* renamed from: b, reason: collision with root package name */
    private final z f28842b;

    /* renamed from: c, reason: collision with root package name */
    private List<WeakReference<RecyclerView>> f28843c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final IdentityHashMap<RecyclerView.G, o> f28844d = new IdentityHashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private List<o> f28845e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private a f28846f = new a();

    /* renamed from: g, reason: collision with root package name */
    private final e.a.EnumC0390a f28847g;

    /* renamed from: h, reason: collision with root package name */
    private final w f28848h;

    /* compiled from: ConcatAdapterController.java */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        o f28849a;

        /* renamed from: b, reason: collision with root package name */
        int f28850b;

        /* renamed from: c, reason: collision with root package name */
        boolean f28851c;

        a() {
        }
    }

    f(e eVar, e.a aVar) {
        this.f28841a = eVar;
        if (aVar.f28835a) {
            this.f28842b = new z.a();
        } else {
            this.f28842b = new z.b();
        }
        e.a.EnumC0390a enumC0390a = aVar.f28836b;
        this.f28847g = enumC0390a;
        if (enumC0390a == e.a.EnumC0390a.NO_STABLE_IDS) {
            this.f28848h = new w.b();
        } else if (enumC0390a == e.a.EnumC0390a.ISOLATED_STABLE_IDS) {
            this.f28848h = new w.a();
        } else {
            if (enumC0390a != e.a.EnumC0390a.SHARED_STABLE_IDS) {
                throw new IllegalArgumentException("unknown stable id mode");
            }
            this.f28848h = new w.c();
        }
    }

    private void D(a aVar) {
        aVar.f28851c = false;
        aVar.f28849a = null;
        aVar.f28850b = -1;
        this.f28846f = aVar;
    }

    private void i() {
        RecyclerView.h.a aVarJ = j();
        if (aVarJ != this.f28841a.k()) {
            this.f28841a.J(aVarJ);
        }
    }

    private RecyclerView.h.a j() {
        for (o oVar : this.f28845e) {
            RecyclerView.h.a aVarK = oVar.f29002c.k();
            RecyclerView.h.a aVar = RecyclerView.h.a.PREVENT;
            if (aVarK == aVar) {
                return aVar;
            }
            if (aVarK == RecyclerView.h.a.PREVENT_WHEN_EMPTY && oVar.a() == 0) {
                return aVar;
            }
        }
        return RecyclerView.h.a.ALLOW;
    }

    private int k(o oVar) {
        o next;
        Iterator<o> it = this.f28845e.iterator();
        int iA = 0;
        while (it.hasNext() && (next = it.next()) != oVar) {
            iA += next.a();
        }
        return iA;
    }

    private a l(int i10) {
        a aVar = this.f28846f;
        if (aVar.f28851c) {
            aVar = new a();
        } else {
            aVar.f28851c = true;
        }
        Iterator<o> it = this.f28845e.iterator();
        int iA = i10;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            o next = it.next();
            if (next.a() > iA) {
                aVar.f28849a = next;
                aVar.f28850b = iA;
                break;
            }
            iA -= next.a();
        }
        if (aVar.f28849a != null) {
            return aVar;
        }
        throw new IllegalArgumentException("Cannot find wrapper for " + i10);
    }

    private o m(RecyclerView.h<RecyclerView.G> hVar) {
        int iT = t(hVar);
        if (iT == -1) {
            return null;
        }
        return this.f28845e.get(iT);
    }

    private o r(RecyclerView.G g10) {
        o oVar = this.f28844d.get(g10);
        if (oVar != null) {
            return oVar;
        }
        throw new IllegalStateException("Cannot find wrapper for " + g10 + ", seems like it is not bound by this adapter: " + this);
    }

    private int t(RecyclerView.h<RecyclerView.G> hVar) {
        int size = this.f28845e.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f28845e.get(i10).f29002c == hVar) {
                return i10;
            }
        }
        return -1;
    }

    private boolean u(RecyclerView recyclerView) {
        Iterator<WeakReference<RecyclerView>> it = this.f28843c.iterator();
        while (it.hasNext()) {
            if (it.next().get() == recyclerView) {
                return true;
            }
        }
        return false;
    }

    public void A(RecyclerView.G g10) {
        r(g10).f29002c.B(g10);
    }

    public void B(RecyclerView.G g10) {
        r(g10).f29002c.C(g10);
    }

    public void C(RecyclerView.G g10) {
        o oVar = this.f28844d.get(g10);
        if (oVar != null) {
            oVar.f29002c.D(g10);
            this.f28844d.remove(g10);
            return;
        }
        throw new IllegalStateException("Cannot find wrapper for " + g10 + ", seems like it is not bound by this adapter: " + this);
    }

    @Override // androidx.recyclerview.widget.o.b
    public void a(o oVar) {
        i();
    }

    @Override // androidx.recyclerview.widget.o.b
    public void b(o oVar, int i10, int i11, Object obj) {
        this.f28841a.r(i10 + k(oVar), i11, obj);
    }

    @Override // androidx.recyclerview.widget.o.b
    public void c(o oVar, int i10, int i11) {
        this.f28841a.s(i10 + k(oVar), i11);
    }

    @Override // androidx.recyclerview.widget.o.b
    public void d(o oVar, int i10, int i11) {
        int iK = k(oVar);
        this.f28841a.p(i10 + iK, i11 + iK);
    }

    @Override // androidx.recyclerview.widget.o.b
    public void e(o oVar) {
        this.f28841a.n();
        i();
    }

    @Override // androidx.recyclerview.widget.o.b
    public void f(o oVar, int i10, int i11) {
        this.f28841a.t(i10 + k(oVar), i11);
    }

    boolean g(int i10, RecyclerView.h<RecyclerView.G> hVar) {
        if (i10 < 0 || i10 > this.f28845e.size()) {
            throw new IndexOutOfBoundsException("Index must be between 0 and " + this.f28845e.size() + ". Given:" + i10);
        }
        if (s()) {
            r1.i.b(hVar.m(), "All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS");
        } else if (hVar.m()) {
            Log.w("ConcatAdapter", "Stable ids in the adapter will be ignored as the ConcatAdapter is configured not to have stable ids");
        }
        if (m(hVar) != null) {
            return false;
        }
        o oVar = new o(hVar, this, this.f28842b, this.f28848h.a());
        this.f28845e.add(i10, oVar);
        Iterator<WeakReference<RecyclerView>> it = this.f28843c.iterator();
        while (it.hasNext()) {
            RecyclerView recyclerView = it.next().get();
            if (recyclerView != null) {
                hVar.v(recyclerView);
            }
        }
        if (oVar.a() > 0) {
            this.f28841a.s(k(oVar), oVar.a());
        }
        i();
        return true;
    }

    boolean h(RecyclerView.h<RecyclerView.G> hVar) {
        return g(this.f28845e.size(), hVar);
    }

    public long n(int i10) {
        a aVarL = l(i10);
        long jB = aVarL.f28849a.b(aVarL.f28850b);
        D(aVarL);
        return jB;
    }

    public int o(int i10) {
        a aVarL = l(i10);
        int iC = aVarL.f28849a.c(aVarL.f28850b);
        D(aVarL);
        return iC;
    }

    public int p(RecyclerView.h<? extends RecyclerView.G> hVar, RecyclerView.G g10, int i10) {
        o oVar = this.f28844d.get(g10);
        if (oVar == null) {
            return -1;
        }
        int iK = i10 - k(oVar);
        int iH = oVar.f29002c.h();
        if (iK >= 0 && iK < iH) {
            return oVar.f29002c.g(hVar, g10, iK);
        }
        throw new IllegalStateException("Detected inconsistent adapter updates. The local position of the view holder maps to " + iK + " which is out of bounds for the adapter with size " + iH + ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:" + g10 + "adapter:" + hVar);
    }

    public int q() {
        Iterator<o> it = this.f28845e.iterator();
        int iA = 0;
        while (it.hasNext()) {
            iA += it.next().a();
        }
        return iA;
    }

    public boolean s() {
        return this.f28847g != e.a.EnumC0390a.NO_STABLE_IDS;
    }

    public void v(RecyclerView recyclerView) {
        if (u(recyclerView)) {
            return;
        }
        this.f28843c.add(new WeakReference<>(recyclerView));
        Iterator<o> it = this.f28845e.iterator();
        while (it.hasNext()) {
            it.next().f29002c.v(recyclerView);
        }
    }

    public void w(RecyclerView.G g10, int i10) {
        a aVarL = l(i10);
        this.f28844d.put(g10, aVarL.f28849a);
        aVarL.f28849a.d(g10, aVarL.f28850b);
        D(aVarL);
    }

    public RecyclerView.G x(ViewGroup viewGroup, int i10) {
        return this.f28842b.a(i10).e(viewGroup, i10);
    }

    public void y(RecyclerView recyclerView) {
        int size = this.f28843c.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            WeakReference<RecyclerView> weakReference = this.f28843c.get(size);
            if (weakReference.get() == null) {
                this.f28843c.remove(size);
            } else if (weakReference.get() == recyclerView) {
                this.f28843c.remove(size);
                break;
            }
            size--;
        }
        Iterator<o> it = this.f28845e.iterator();
        while (it.hasNext()) {
            it.next().f29002c.z(recyclerView);
        }
    }

    public boolean z(RecyclerView.G g10) {
        o oVar = this.f28844d.get(g10);
        if (oVar != null) {
            boolean zA = oVar.f29002c.A(g10);
            this.f28844d.remove(g10);
            return zA;
        }
        throw new IllegalStateException("Cannot find wrapper for " + g10 + ", seems like it is not bound by this adapter: " + this);
    }
}
