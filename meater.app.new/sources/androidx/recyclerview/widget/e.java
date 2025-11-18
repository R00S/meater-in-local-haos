package androidx.recyclerview.widget;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: ConcatAdapter.java */
/* loaded from: classes.dex */
public final class e extends RecyclerView.h<RecyclerView.G> {

    /* renamed from: E, reason: collision with root package name */
    private final f f28833E;

    /* compiled from: ConcatAdapter.java */
    public static final class a {

        /* renamed from: c, reason: collision with root package name */
        public static final a f28834c = new a(true, EnumC0390a.NO_STABLE_IDS);

        /* renamed from: a, reason: collision with root package name */
        public final boolean f28835a;

        /* renamed from: b, reason: collision with root package name */
        public final EnumC0390a f28836b;

        /* compiled from: ConcatAdapter.java */
        /* renamed from: androidx.recyclerview.widget.e$a$a, reason: collision with other inner class name */
        public enum EnumC0390a {
            NO_STABLE_IDS,
            ISOLATED_STABLE_IDS,
            SHARED_STABLE_IDS
        }

        a(boolean z10, EnumC0390a enumC0390a) {
            this.f28835a = z10;
            this.f28836b = enumC0390a;
        }
    }

    @SafeVarargs
    public e(RecyclerView.h<? extends RecyclerView.G>... hVarArr) {
        this(a.f28834c, hVarArr);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public boolean A(RecyclerView.G g10) {
        return this.f28833E.z(g10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void B(RecyclerView.G g10) {
        this.f28833E.A(g10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void C(RecyclerView.G g10) {
        this.f28833E.B(g10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void D(RecyclerView.G g10) {
        this.f28833E.C(g10);
    }

    public boolean I(RecyclerView.h<? extends RecyclerView.G> hVar) {
        return this.f28833E.h(hVar);
    }

    void J(RecyclerView.h.a aVar) {
        super.G(aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int g(RecyclerView.h<? extends RecyclerView.G> hVar, RecyclerView.G g10, int i10) {
        return this.f28833E.p(hVar, g10, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int h() {
        return this.f28833E.q();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long i(int i10) {
        return this.f28833E.n(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int j(int i10) {
        return this.f28833E.o(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void v(RecyclerView recyclerView) {
        this.f28833E.v(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void w(RecyclerView.G g10, int i10) {
        this.f28833E.w(g10, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.G y(ViewGroup viewGroup, int i10) {
        return this.f28833E.x(viewGroup, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void z(RecyclerView recyclerView) {
        this.f28833E.y(recyclerView);
    }

    @SafeVarargs
    public e(a aVar, RecyclerView.h<? extends RecyclerView.G>... hVarArr) {
        this(aVar, (List<? extends RecyclerView.h<? extends RecyclerView.G>>) Arrays.asList(hVarArr));
    }

    public e(a aVar, List<? extends RecyclerView.h<? extends RecyclerView.G>> list) {
        this.f28833E = new f(this, aVar);
        Iterator<? extends RecyclerView.h<? extends RecyclerView.G>> it = list.iterator();
        while (it.hasNext()) {
            I(it.next());
        }
        super.F(this.f28833E.s());
    }
}
