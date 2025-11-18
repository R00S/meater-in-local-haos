package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

/* compiled from: ScrollEventAdapter.java */
/* loaded from: classes.dex */
final class e extends RecyclerView.v {

    /* renamed from: a, reason: collision with root package name */
    private ViewPager2.i f29829a;

    /* renamed from: b, reason: collision with root package name */
    private final ViewPager2 f29830b;

    /* renamed from: c, reason: collision with root package name */
    private final RecyclerView f29831c;

    /* renamed from: d, reason: collision with root package name */
    private final LinearLayoutManager f29832d;

    /* renamed from: e, reason: collision with root package name */
    private int f29833e;

    /* renamed from: f, reason: collision with root package name */
    private int f29834f;

    /* renamed from: g, reason: collision with root package name */
    private a f29835g;

    /* renamed from: h, reason: collision with root package name */
    private int f29836h;

    /* renamed from: i, reason: collision with root package name */
    private int f29837i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f29838j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f29839k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f29840l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f29841m;

    /* compiled from: ScrollEventAdapter.java */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        int f29842a;

        /* renamed from: b, reason: collision with root package name */
        float f29843b;

        /* renamed from: c, reason: collision with root package name */
        int f29844c;

        a() {
        }

        void a() {
            this.f29842a = -1;
            this.f29843b = 0.0f;
            this.f29844c = 0;
        }
    }

    e(ViewPager2 viewPager2) {
        this.f29830b = viewPager2;
        RecyclerView recyclerView = viewPager2.f29789K;
        this.f29831c = recyclerView;
        this.f29832d = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.f29835g = new a();
        n();
    }

    private void c(int i10, float f10, int i11) {
        ViewPager2.i iVar = this.f29829a;
        if (iVar != null) {
            iVar.b(i10, f10, i11);
        }
    }

    private void d(int i10) {
        ViewPager2.i iVar = this.f29829a;
        if (iVar != null) {
            iVar.c(i10);
        }
    }

    private void e(int i10) {
        if ((this.f29833e == 3 && this.f29834f == 0) || this.f29834f == i10) {
            return;
        }
        this.f29834f = i10;
        ViewPager2.i iVar = this.f29829a;
        if (iVar != null) {
            iVar.a(i10);
        }
    }

    private int f() {
        return this.f29832d.e2();
    }

    private boolean k() {
        int i10 = this.f29833e;
        return i10 == 1 || i10 == 4;
    }

    private void n() {
        this.f29833e = 0;
        this.f29834f = 0;
        this.f29835g.a();
        this.f29836h = -1;
        this.f29837i = -1;
        this.f29838j = false;
        this.f29839k = false;
        this.f29841m = false;
        this.f29840l = false;
    }

    private void p(boolean z10) {
        this.f29841m = z10;
        this.f29833e = z10 ? 4 : 1;
        int i10 = this.f29837i;
        if (i10 != -1) {
            this.f29836h = i10;
            this.f29837i = -1;
        } else if (this.f29836h == -1) {
            this.f29836h = f();
        }
        e(1);
    }

    private void q() {
        int top;
        a aVar = this.f29835g;
        int iE2 = this.f29832d.e2();
        aVar.f29842a = iE2;
        if (iE2 == -1) {
            aVar.a();
            return;
        }
        View viewH = this.f29832d.H(iE2);
        if (viewH == null) {
            aVar.a();
            return;
        }
        int iE0 = this.f29832d.e0(viewH);
        int iN0 = this.f29832d.n0(viewH);
        int iQ0 = this.f29832d.q0(viewH);
        int iM = this.f29832d.M(viewH);
        ViewGroup.LayoutParams layoutParams = viewH.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            iE0 += marginLayoutParams.leftMargin;
            iN0 += marginLayoutParams.rightMargin;
            iQ0 += marginLayoutParams.topMargin;
            iM += marginLayoutParams.bottomMargin;
        }
        int height = viewH.getHeight() + iQ0 + iM;
        int width = viewH.getWidth() + iE0 + iN0;
        if (this.f29832d.r2() == 0) {
            top = (viewH.getLeft() - iE0) - this.f29831c.getPaddingLeft();
            if (this.f29830b.d()) {
                top = -top;
            }
            height = width;
        } else {
            top = (viewH.getTop() - iQ0) - this.f29831c.getPaddingTop();
        }
        int i10 = -top;
        aVar.f29844c = i10;
        if (i10 >= 0) {
            aVar.f29843b = height == 0 ? 0.0f : i10 / height;
        } else {
            if (!new androidx.viewpager2.widget.a(this.f29832d).d()) {
                throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(aVar.f29844c)));
            }
            throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.v
    public void a(RecyclerView recyclerView, int i10) {
        if (!(this.f29833e == 1 && this.f29834f == 1) && i10 == 1) {
            p(false);
            return;
        }
        if (k() && i10 == 2) {
            if (this.f29839k) {
                e(2);
                this.f29838j = true;
                return;
            }
            return;
        }
        if (k() && i10 == 0) {
            q();
            if (this.f29839k) {
                a aVar = this.f29835g;
                if (aVar.f29844c == 0) {
                    int i11 = this.f29836h;
                    int i12 = aVar.f29842a;
                    if (i11 != i12) {
                        d(i12);
                    }
                }
            } else {
                int i13 = this.f29835g.f29842a;
                if (i13 != -1) {
                    c(i13, 0.0f, 0);
                }
            }
            e(0);
            n();
        }
        if (this.f29833e == 2 && i10 == 0 && this.f29840l) {
            q();
            a aVar2 = this.f29835g;
            if (aVar2.f29844c == 0) {
                int i14 = this.f29837i;
                int i15 = aVar2.f29842a;
                if (i14 != i15) {
                    if (i15 == -1) {
                        i15 = 0;
                    }
                    d(i15);
                }
                e(0);
                n();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    @Override // androidx.recyclerview.widget.RecyclerView.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(androidx.recyclerview.widget.RecyclerView r4, int r5, int r6) {
        /*
            r3 = this;
            r4 = 1
            r3.f29839k = r4
            r3.q()
            boolean r0 = r3.f29838j
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L37
            r3.f29838j = r2
            if (r6 > 0) goto L1f
            if (r6 != 0) goto L29
            if (r5 >= 0) goto L16
            r5 = r4
            goto L17
        L16:
            r5 = r2
        L17:
            androidx.viewpager2.widget.ViewPager2 r6 = r3.f29830b
            boolean r6 = r6.d()
            if (r5 != r6) goto L29
        L1f:
            androidx.viewpager2.widget.e$a r5 = r3.f29835g
            int r6 = r5.f29844c
            if (r6 == 0) goto L29
            int r5 = r5.f29842a
            int r5 = r5 + r4
            goto L2d
        L29:
            androidx.viewpager2.widget.e$a r5 = r3.f29835g
            int r5 = r5.f29842a
        L2d:
            r3.f29837i = r5
            int r6 = r3.f29836h
            if (r6 == r5) goto L45
            r3.d(r5)
            goto L45
        L37:
            int r5 = r3.f29833e
            if (r5 != 0) goto L45
            androidx.viewpager2.widget.e$a r5 = r3.f29835g
            int r5 = r5.f29842a
            if (r5 != r1) goto L42
            r5 = r2
        L42:
            r3.d(r5)
        L45:
            androidx.viewpager2.widget.e$a r5 = r3.f29835g
            int r6 = r5.f29842a
            if (r6 != r1) goto L4c
            r6 = r2
        L4c:
            float r0 = r5.f29843b
            int r5 = r5.f29844c
            r3.c(r6, r0, r5)
            androidx.viewpager2.widget.e$a r5 = r3.f29835g
            int r6 = r5.f29842a
            int r0 = r3.f29837i
            if (r6 == r0) goto L5d
            if (r0 != r1) goto L6b
        L5d:
            int r5 = r5.f29844c
            if (r5 != 0) goto L6b
            int r5 = r3.f29834f
            if (r5 == r4) goto L6b
            r3.e(r2)
            r3.n()
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.e.b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    double g() {
        q();
        a aVar = this.f29835g;
        return aVar.f29842a + aVar.f29843b;
    }

    int h() {
        return this.f29834f;
    }

    boolean i() {
        return this.f29841m;
    }

    boolean j() {
        return this.f29834f == 0;
    }

    void l() {
        this.f29840l = true;
    }

    void m(int i10, boolean z10) {
        this.f29833e = z10 ? 2 : 3;
        this.f29841m = false;
        boolean z11 = this.f29837i != i10;
        this.f29837i = i10;
        e(2);
        if (z11) {
            d(i10);
        }
    }

    void o(ViewPager2.i iVar) {
        this.f29829a = iVar;
    }
}
