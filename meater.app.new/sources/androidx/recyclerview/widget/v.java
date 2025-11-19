package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SnapHelper.java */
/* loaded from: classes.dex */
public abstract class v extends RecyclerView.t {

    /* renamed from: a, reason: collision with root package name */
    RecyclerView f29019a;

    /* renamed from: b, reason: collision with root package name */
    private Scroller f29020b;

    /* renamed from: c, reason: collision with root package name */
    private final RecyclerView.v f29021c = new a();

    /* compiled from: SnapHelper.java */
    class a extends RecyclerView.v {

        /* renamed from: a, reason: collision with root package name */
        boolean f29022a = false;

        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.v
        public void a(RecyclerView recyclerView, int i10) {
            super.a(recyclerView, i10);
            if (i10 == 0 && this.f29022a) {
                this.f29022a = false;
                v.this.j();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.v
        public void b(RecyclerView recyclerView, int i10, int i11) {
            if (i10 == 0 && i11 == 0) {
                return;
            }
            this.f29022a = true;
        }
    }

    private void e() {
        this.f29019a.l1(this.f29021c);
        this.f29019a.setOnFlingListener(null);
    }

    private void h() {
        if (this.f29019a.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.f29019a.n(this.f29021c);
        this.f29019a.setOnFlingListener(this);
    }

    private boolean i(RecyclerView.q qVar, int i10, int i11) {
        RecyclerView.B bD;
        int iG;
        if (!(qVar instanceof RecyclerView.B.b) || (bD = d(qVar)) == null || (iG = g(qVar, i10, i11)) == -1) {
            return false;
        }
        bD.p(iG);
        qVar.O1(bD);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public boolean a(int i10, int i11) {
        RecyclerView.q layoutManager = this.f29019a.getLayoutManager();
        if (layoutManager == null || this.f29019a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f29019a.getMinFlingVelocity();
        return (Math.abs(i11) > minFlingVelocity || Math.abs(i10) > minFlingVelocity) && i(layoutManager, i10, i11);
    }

    public void b(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f29019a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            e();
        }
        this.f29019a = recyclerView;
        if (recyclerView != null) {
            h();
            this.f29020b = new Scroller(this.f29019a.getContext(), new DecelerateInterpolator());
            j();
        }
    }

    public abstract int[] c(RecyclerView.q qVar, View view);

    protected abstract RecyclerView.B d(RecyclerView.q qVar);

    @SuppressLint({"UnknownNullness"})
    public abstract View f(RecyclerView.q qVar);

    @SuppressLint({"UnknownNullness"})
    public abstract int g(RecyclerView.q qVar, int i10, int i11);

    void j() {
        RecyclerView.q layoutManager;
        View viewF;
        RecyclerView recyclerView = this.f29019a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewF = f(layoutManager)) == null) {
            return;
        }
        int[] iArrC = c(layoutManager, viewF);
        int i10 = iArrC[0];
        if (i10 == 0 && iArrC[1] == 0) {
            return;
        }
        this.f29019a.z1(i10, iArrC[1]);
    }
}
