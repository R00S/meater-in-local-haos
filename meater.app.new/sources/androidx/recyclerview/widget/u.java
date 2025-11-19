package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SimpleItemAnimator.java */
/* loaded from: classes.dex */
public abstract class u extends RecyclerView.n {

    /* renamed from: g, reason: collision with root package name */
    boolean f29018g = true;

    @SuppressLint({"UnknownNullness"})
    public final void A(RecyclerView.G g10) {
        I(g10);
        h(g10);
    }

    @SuppressLint({"UnknownNullness"})
    public final void B(RecyclerView.G g10) {
        J(g10);
    }

    @SuppressLint({"UnknownNullness"})
    public final void C(RecyclerView.G g10, boolean z10) {
        K(g10, z10);
        h(g10);
    }

    @SuppressLint({"UnknownNullness"})
    public final void D(RecyclerView.G g10, boolean z10) {
        L(g10, z10);
    }

    @SuppressLint({"UnknownNullness"})
    public final void E(RecyclerView.G g10) {
        M(g10);
        h(g10);
    }

    @SuppressLint({"UnknownNullness"})
    public final void F(RecyclerView.G g10) {
        N(g10);
    }

    @SuppressLint({"UnknownNullness"})
    public final void G(RecyclerView.G g10) {
        O(g10);
        h(g10);
    }

    @SuppressLint({"UnknownNullness"})
    public final void H(RecyclerView.G g10) {
        P(g10);
    }

    public void Q(boolean z10) {
        this.f29018g = z10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean a(RecyclerView.G g10, RecyclerView.n.c cVar, RecyclerView.n.c cVar2) {
        int i10;
        int i11;
        return (cVar == null || ((i10 = cVar.f28703a) == (i11 = cVar2.f28703a) && cVar.f28704b == cVar2.f28704b)) ? w(g10) : y(g10, i10, cVar.f28704b, i11, cVar2.f28704b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean b(RecyclerView.G g10, RecyclerView.G g11, RecyclerView.n.c cVar, RecyclerView.n.c cVar2) {
        int i10;
        int i11;
        int i12 = cVar.f28703a;
        int i13 = cVar.f28704b;
        if (g11.shouldIgnore()) {
            int i14 = cVar.f28703a;
            i11 = cVar.f28704b;
            i10 = i14;
        } else {
            i10 = cVar2.f28703a;
            i11 = cVar2.f28704b;
        }
        return x(g10, g11, i12, i13, i10, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean c(RecyclerView.G g10, RecyclerView.n.c cVar, RecyclerView.n.c cVar2) {
        int i10 = cVar.f28703a;
        int i11 = cVar.f28704b;
        View view = g10.itemView;
        int left = cVar2 == null ? view.getLeft() : cVar2.f28703a;
        int top = cVar2 == null ? view.getTop() : cVar2.f28704b;
        if (g10.isRemoved() || (i10 == left && i11 == top)) {
            return z(g10);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return y(g10, i10, i11, left, top);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean d(RecyclerView.G g10, RecyclerView.n.c cVar, RecyclerView.n.c cVar2) {
        int i10 = cVar.f28703a;
        int i11 = cVar2.f28703a;
        if (i10 != i11 || cVar.f28704b != cVar2.f28704b) {
            return y(g10, i10, cVar.f28704b, i11, cVar2.f28704b);
        }
        E(g10);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean f(RecyclerView.G g10) {
        return !this.f29018g || g10.isInvalid();
    }

    @SuppressLint({"UnknownNullness"})
    public abstract boolean w(RecyclerView.G g10);

    @SuppressLint({"UnknownNullness"})
    public abstract boolean x(RecyclerView.G g10, RecyclerView.G g11, int i10, int i11, int i12, int i13);

    @SuppressLint({"UnknownNullness"})
    public abstract boolean y(RecyclerView.G g10, int i10, int i11, int i12, int i13);

    @SuppressLint({"UnknownNullness"})
    public abstract boolean z(RecyclerView.G g10);

    @SuppressLint({"UnknownNullness"})
    public void I(RecyclerView.G g10) {
    }

    @SuppressLint({"UnknownNullness"})
    public void J(RecyclerView.G g10) {
    }

    @SuppressLint({"UnknownNullness"})
    public void M(RecyclerView.G g10) {
    }

    @SuppressLint({"UnknownNullness"})
    public void N(RecyclerView.G g10) {
    }

    @SuppressLint({"UnknownNullness"})
    public void O(RecyclerView.G g10) {
    }

    @SuppressLint({"UnknownNullness"})
    public void P(RecyclerView.G g10) {
    }

    @SuppressLint({"UnknownNullness"})
    public void K(RecyclerView.G g10, boolean z10) {
    }

    @SuppressLint({"UnknownNullness"})
    public void L(RecyclerView.G g10, boolean z10) {
    }
}
