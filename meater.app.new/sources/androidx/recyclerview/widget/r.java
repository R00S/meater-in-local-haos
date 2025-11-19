package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: PagerSnapHelper.java */
/* loaded from: classes.dex */
public class r extends v {

    /* renamed from: d, reason: collision with root package name */
    private q f29011d;

    /* renamed from: e, reason: collision with root package name */
    private q f29012e;

    /* compiled from: PagerSnapHelper.java */
    class a extends m {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.m, androidx.recyclerview.widget.RecyclerView.B
        protected void o(View view, RecyclerView.C c10, RecyclerView.B.a aVar) {
            r rVar = r.this;
            int[] iArrC = rVar.c(rVar.f29019a.getLayoutManager(), view);
            int i10 = iArrC[0];
            int i11 = iArrC[1];
            int iW = w(Math.max(Math.abs(i10), Math.abs(i11)));
            if (iW > 0) {
                aVar.d(i10, i11, iW, this.f28993j);
            }
        }

        @Override // androidx.recyclerview.widget.m
        protected float v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.m
        protected int x(int i10) {
            return Math.min(100, super.x(i10));
        }
    }

    private int k(View view, q qVar) {
        return (qVar.g(view) + (qVar.e(view) / 2)) - (qVar.m() + (qVar.n() / 2));
    }

    private View l(RecyclerView.q qVar, q qVar2) {
        int iO = qVar.O();
        View view = null;
        if (iO == 0) {
            return null;
        }
        int iM = qVar2.m() + (qVar2.n() / 2);
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < iO; i11++) {
            View viewN = qVar.N(i11);
            int iAbs = Math.abs((qVar2.g(viewN) + (qVar2.e(viewN) / 2)) - iM);
            if (iAbs < i10) {
                view = viewN;
                i10 = iAbs;
            }
        }
        return view;
    }

    private q m(RecyclerView.q qVar) {
        q qVar2 = this.f29012e;
        if (qVar2 == null || qVar2.f29008a != qVar) {
            this.f29012e = q.a(qVar);
        }
        return this.f29012e;
    }

    private q n(RecyclerView.q qVar) {
        if (qVar.q()) {
            return o(qVar);
        }
        if (qVar.p()) {
            return m(qVar);
        }
        return null;
    }

    private q o(RecyclerView.q qVar) {
        q qVar2 = this.f29011d;
        if (qVar2 == null || qVar2.f29008a != qVar) {
            this.f29011d = q.c(qVar);
        }
        return this.f29011d;
    }

    private boolean p(RecyclerView.q qVar, int i10, int i11) {
        return qVar.p() ? i10 > 0 : i11 > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean q(RecyclerView.q qVar) {
        PointF pointFD;
        int iA = qVar.a();
        if (!(qVar instanceof RecyclerView.B.b) || (pointFD = ((RecyclerView.B.b) qVar).d(iA - 1)) == null) {
            return false;
        }
        return pointFD.x < 0.0f || pointFD.y < 0.0f;
    }

    @Override // androidx.recyclerview.widget.v
    public int[] c(RecyclerView.q qVar, View view) {
        int[] iArr = new int[2];
        if (qVar.p()) {
            iArr[0] = k(view, m(qVar));
        } else {
            iArr[0] = 0;
        }
        if (qVar.q()) {
            iArr[1] = k(view, o(qVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.v
    protected RecyclerView.B d(RecyclerView.q qVar) {
        if (qVar instanceof RecyclerView.B.b) {
            return new a(this.f29019a.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.v
    @SuppressLint({"UnknownNullness"})
    public View f(RecyclerView.q qVar) {
        if (qVar.q()) {
            return l(qVar, o(qVar));
        }
        if (qVar.p()) {
            return l(qVar, m(qVar));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.v
    @SuppressLint({"UnknownNullness"})
    public int g(RecyclerView.q qVar, int i10, int i11) {
        q qVarN;
        int iA = qVar.a();
        if (iA == 0 || (qVarN = n(qVar)) == null) {
            return -1;
        }
        int iO = qVar.O();
        View view = null;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i14 = 0; i14 < iO; i14++) {
            View viewN = qVar.N(i14);
            if (viewN != null) {
                int iK = k(viewN, qVarN);
                if (iK <= 0 && iK > i13) {
                    view2 = viewN;
                    i13 = iK;
                }
                if (iK >= 0 && iK < i12) {
                    view = viewN;
                    i12 = iK;
                }
            }
        }
        boolean zP = p(qVar, i10, i11);
        if (zP && view != null) {
            return qVar.l0(view);
        }
        if (!zP && view2 != null) {
            return qVar.l0(view2);
        }
        if (zP) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int iL0 = qVar.l0(view) + (q(qVar) == zP ? -1 : 1);
        if (iL0 < 0 || iL0 >= iA) {
            return -1;
        }
        return iL0;
    }
}
