package androidx.recyclerview.widget;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.w;
import androidx.recyclerview.widget.z;

/* compiled from: NestedAdapterWrapper.java */
/* loaded from: classes.dex */
class o {

    /* renamed from: a, reason: collision with root package name */
    private final z.c f29000a;

    /* renamed from: b, reason: collision with root package name */
    private final w.d f29001b;

    /* renamed from: c, reason: collision with root package name */
    public final RecyclerView.h<RecyclerView.G> f29002c;

    /* renamed from: d, reason: collision with root package name */
    final b f29003d;

    /* renamed from: e, reason: collision with root package name */
    int f29004e;

    /* renamed from: f, reason: collision with root package name */
    private RecyclerView.j f29005f = new a();

    /* compiled from: NestedAdapterWrapper.java */
    class a extends RecyclerView.j {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            o oVar = o.this;
            oVar.f29004e = oVar.f29002c.h();
            o oVar2 = o.this;
            oVar2.f29003d.e(oVar2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void b(int i10, int i11) {
            o oVar = o.this;
            oVar.f29003d.b(oVar, i10, i11, null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void c(int i10, int i11, Object obj) {
            o oVar = o.this;
            oVar.f29003d.b(oVar, i10, i11, obj);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void d(int i10, int i11) {
            o oVar = o.this;
            oVar.f29004e += i11;
            oVar.f29003d.c(oVar, i10, i11);
            o oVar2 = o.this;
            if (oVar2.f29004e <= 0 || oVar2.f29002c.k() != RecyclerView.h.a.PREVENT_WHEN_EMPTY) {
                return;
            }
            o oVar3 = o.this;
            oVar3.f29003d.a(oVar3);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void e(int i10, int i11, int i12) {
            r1.i.b(i12 == 1, "moving more than 1 item is not supported in RecyclerView");
            o oVar = o.this;
            oVar.f29003d.d(oVar, i10, i11);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void f(int i10, int i11) {
            o oVar = o.this;
            oVar.f29004e -= i11;
            oVar.f29003d.f(oVar, i10, i11);
            o oVar2 = o.this;
            if (oVar2.f29004e >= 1 || oVar2.f29002c.k() != RecyclerView.h.a.PREVENT_WHEN_EMPTY) {
                return;
            }
            o oVar3 = o.this;
            oVar3.f29003d.a(oVar3);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void g() {
            o oVar = o.this;
            oVar.f29003d.a(oVar);
        }
    }

    /* compiled from: NestedAdapterWrapper.java */
    interface b {
        void a(o oVar);

        void b(o oVar, int i10, int i11, Object obj);

        void c(o oVar, int i10, int i11);

        void d(o oVar, int i10, int i11);

        void e(o oVar);

        void f(o oVar, int i10, int i11);
    }

    o(RecyclerView.h<RecyclerView.G> hVar, b bVar, z zVar, w.d dVar) {
        this.f29002c = hVar;
        this.f29003d = bVar;
        this.f29000a = zVar.b(this);
        this.f29001b = dVar;
        this.f29004e = hVar.h();
        hVar.E(this.f29005f);
    }

    int a() {
        return this.f29004e;
    }

    public long b(int i10) {
        return this.f29001b.a(this.f29002c.i(i10));
    }

    int c(int i10) {
        return this.f29000a.b(this.f29002c.j(i10));
    }

    void d(RecyclerView.G g10, int i10) {
        this.f29002c.d(g10, i10);
    }

    RecyclerView.G e(ViewGroup viewGroup, int i10) {
        return this.f29002c.y(viewGroup, this.f29000a.a(i10));
    }
}
