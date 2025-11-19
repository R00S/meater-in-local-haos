package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import k1.C3784a;
import s1.AbstractC4423b;

/* compiled from: ActionMenuPresenter.java */
/* renamed from: androidx.appcompat.widget.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C1981c extends androidx.appcompat.view.menu.a implements AbstractC4423b.a {

    /* renamed from: L, reason: collision with root package name */
    d f21618L;

    /* renamed from: M, reason: collision with root package name */
    private Drawable f21619M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f21620N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f21621O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f21622P;

    /* renamed from: Q, reason: collision with root package name */
    private int f21623Q;

    /* renamed from: R, reason: collision with root package name */
    private int f21624R;

    /* renamed from: S, reason: collision with root package name */
    private int f21625S;

    /* renamed from: T, reason: collision with root package name */
    private boolean f21626T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f21627U;

    /* renamed from: V, reason: collision with root package name */
    private boolean f21628V;

    /* renamed from: W, reason: collision with root package name */
    private boolean f21629W;

    /* renamed from: X, reason: collision with root package name */
    private int f21630X;

    /* renamed from: Y, reason: collision with root package name */
    private final SparseBooleanArray f21631Y;

    /* renamed from: Z, reason: collision with root package name */
    e f21632Z;

    /* renamed from: a0, reason: collision with root package name */
    a f21633a0;

    /* renamed from: b0, reason: collision with root package name */
    RunnableC0303c f21634b0;

    /* renamed from: c0, reason: collision with root package name */
    private b f21635c0;

    /* renamed from: d0, reason: collision with root package name */
    final f f21636d0;

    /* renamed from: e0, reason: collision with root package name */
    int f21637e0;

    /* compiled from: ActionMenuPresenter.java */
    /* renamed from: androidx.appcompat.widget.c$a */
    private class a extends androidx.appcompat.view.menu.i {
        public a(Context context, androidx.appcompat.view.menu.m mVar, View view) {
            super(context, mVar, view, false, i.a.f42405l);
            if (!((androidx.appcompat.view.menu.g) mVar.getItem()).l()) {
                View view2 = C1981c.this.f21618L;
                f(view2 == null ? (View) ((androidx.appcompat.view.menu.a) C1981c.this).f20956J : view2);
            }
            j(C1981c.this.f21636d0);
        }

        @Override // androidx.appcompat.view.menu.i
        protected void e() {
            C1981c c1981c = C1981c.this;
            c1981c.f21633a0 = null;
            c1981c.f21637e0 = 0;
            super.e();
        }
    }

    /* compiled from: ActionMenuPresenter.java */
    /* renamed from: androidx.appcompat.widget.c$b */
    private class b extends ActionMenuItemView.b {
        b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public n.e a() {
            a aVar = C1981c.this.f21633a0;
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }

    /* compiled from: ActionMenuPresenter.java */
    /* renamed from: androidx.appcompat.widget.c$c, reason: collision with other inner class name */
    private class RunnableC0303c implements Runnable {

        /* renamed from: B, reason: collision with root package name */
        private e f21640B;

        public RunnableC0303c(e eVar) {
            this.f21640B = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((androidx.appcompat.view.menu.a) C1981c.this).f20950D != null) {
                ((androidx.appcompat.view.menu.a) C1981c.this).f20950D.d();
            }
            View view = (View) ((androidx.appcompat.view.menu.a) C1981c.this).f20956J;
            if (view != null && view.getWindowToken() != null && this.f21640B.m()) {
                C1981c.this.f21632Z = this.f21640B;
            }
            C1981c.this.f21634b0 = null;
        }
    }

    /* compiled from: ActionMenuPresenter.java */
    /* renamed from: androidx.appcompat.widget.c$d */
    private class d extends AppCompatImageView implements ActionMenuView.a {

        /* compiled from: ActionMenuPresenter.java */
        /* renamed from: androidx.appcompat.widget.c$d$a */
        class a extends L {

            /* renamed from: K, reason: collision with root package name */
            final /* synthetic */ C1981c f21643K;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(View view, C1981c c1981c) {
                super(view);
                this.f21643K = c1981c;
            }

            @Override // androidx.appcompat.widget.L
            public n.e b() {
                e eVar = C1981c.this.f21632Z;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            @Override // androidx.appcompat.widget.L
            public boolean c() {
                C1981c.this.N();
                return true;
            }

            @Override // androidx.appcompat.widget.L
            public boolean d() {
                C1981c c1981c = C1981c.this;
                if (c1981c.f21634b0 != null) {
                    return false;
                }
                c1981c.E();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, i.a.f42404k);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            f0.a(this, getContentDescription());
            setOnTouchListener(new a(this, C1981c.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            C1981c.this.N();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i10, int i11, int i12, int i13) {
            boolean frame = super.setFrame(i10, i11, i12, i13);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C3784a.l(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    /* compiled from: ActionMenuPresenter.java */
    /* renamed from: androidx.appcompat.widget.c$e */
    private class e extends androidx.appcompat.view.menu.i {
        public e(Context context, androidx.appcompat.view.menu.e eVar, View view, boolean z10) {
            super(context, eVar, view, z10, i.a.f42405l);
            h(8388613);
            j(C1981c.this.f21636d0);
        }

        @Override // androidx.appcompat.view.menu.i
        protected void e() {
            if (((androidx.appcompat.view.menu.a) C1981c.this).f20950D != null) {
                ((androidx.appcompat.view.menu.a) C1981c.this).f20950D.close();
            }
            C1981c.this.f21632Z = null;
            super.e();
        }
    }

    /* compiled from: ActionMenuPresenter.java */
    /* renamed from: androidx.appcompat.widget.c$f */
    private class f implements j.a {
        f() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void d(androidx.appcompat.view.menu.e eVar, boolean z10) {
            if (eVar instanceof androidx.appcompat.view.menu.m) {
                eVar.F().e(false);
            }
            j.a aVarP = C1981c.this.p();
            if (aVarP != null) {
                aVarP.d(eVar, z10);
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean e(androidx.appcompat.view.menu.e eVar) {
            if (eVar == ((androidx.appcompat.view.menu.a) C1981c.this).f20950D) {
                return false;
            }
            C1981c.this.f21637e0 = ((androidx.appcompat.view.menu.m) eVar).getItem().getItemId();
            j.a aVarP = C1981c.this.p();
            if (aVarP != null) {
                return aVarP.e(eVar);
            }
            return false;
        }
    }

    /* compiled from: ActionMenuPresenter.java */
    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: androidx.appcompat.widget.c$g */
    private static class g implements Parcelable {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: B, reason: collision with root package name */
        public int f21647B;

        /* compiled from: ActionMenuPresenter.java */
        /* renamed from: androidx.appcompat.widget.c$g$a */
        class a implements Parcelable.Creator<g> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i10) {
                return new g[i10];
            }
        }

        g() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f21647B);
        }

        g(Parcel parcel) {
            this.f21647B = parcel.readInt();
        }
    }

    public C1981c(Context context) {
        super(context, i.g.f42528c, i.g.f42527b);
        this.f21631Y = new SparseBooleanArray();
        this.f21636d0 = new f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private View C(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f20956J;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof k.a) && ((k.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public boolean B() {
        return E() | F();
    }

    public Drawable D() {
        d dVar = this.f21618L;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f21620N) {
            return this.f21619M;
        }
        return null;
    }

    public boolean E() {
        Object obj;
        RunnableC0303c runnableC0303c = this.f21634b0;
        if (runnableC0303c != null && (obj = this.f20956J) != null) {
            ((View) obj).removeCallbacks(runnableC0303c);
            this.f21634b0 = null;
            return true;
        }
        e eVar = this.f21632Z;
        if (eVar == null) {
            return false;
        }
        eVar.b();
        return true;
    }

    public boolean F() {
        a aVar = this.f21633a0;
        if (aVar == null) {
            return false;
        }
        aVar.b();
        return true;
    }

    public boolean G() {
        return this.f21634b0 != null || H();
    }

    public boolean H() {
        e eVar = this.f21632Z;
        return eVar != null && eVar.d();
    }

    public void I(Configuration configuration) {
        if (!this.f21626T) {
            this.f21625S = androidx.appcompat.view.a.b(this.f20949C).d();
        }
        androidx.appcompat.view.menu.e eVar = this.f20950D;
        if (eVar != null) {
            eVar.N(true);
        }
    }

    public void J(boolean z10) {
        this.f21629W = z10;
    }

    public void K(ActionMenuView actionMenuView) {
        this.f20956J = actionMenuView;
        actionMenuView.b(this.f20950D);
    }

    public void L(Drawable drawable) {
        d dVar = this.f21618L;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            this.f21620N = true;
            this.f21619M = drawable;
        }
    }

    public void M(boolean z10) {
        this.f21621O = z10;
        this.f21622P = true;
    }

    public boolean N() {
        androidx.appcompat.view.menu.e eVar;
        if (!this.f21621O || H() || (eVar = this.f20950D) == null || this.f20956J == null || this.f21634b0 != null || eVar.B().isEmpty()) {
            return false;
        }
        RunnableC0303c runnableC0303c = new RunnableC0303c(new e(this.f20949C, this.f20950D, this.f21618L, true));
        this.f21634b0 = runnableC0303c;
        ((View) this.f20956J).post(runnableC0303c);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a
    public void b(androidx.appcompat.view.menu.g gVar, k.a aVar) {
        aVar.e(gVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f20956J);
        if (this.f21635c0 == null) {
            this.f21635c0 = new b();
        }
        actionMenuItemView.setPopupCallback(this.f21635c0);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void d(androidx.appcompat.view.menu.e eVar, boolean z10) {
        B();
        super.d(eVar, z10);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void e(boolean z10) {
        super.e(z10);
        ((View) this.f20956J).requestLayout();
        androidx.appcompat.view.menu.e eVar = this.f20950D;
        boolean z11 = false;
        if (eVar != null) {
            ArrayList<androidx.appcompat.view.menu.g> arrayListU = eVar.u();
            int size = arrayListU.size();
            for (int i10 = 0; i10 < size; i10++) {
                AbstractC4423b abstractC4423bB = arrayListU.get(i10).b();
                if (abstractC4423bB != null) {
                    abstractC4423bB.i(this);
                }
            }
        }
        androidx.appcompat.view.menu.e eVar2 = this.f20950D;
        ArrayList<androidx.appcompat.view.menu.g> arrayListB = eVar2 != null ? eVar2.B() : null;
        if (this.f21621O && arrayListB != null) {
            int size2 = arrayListB.size();
            if (size2 == 1) {
                z11 = !arrayListB.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z11 = true;
            }
        }
        if (z11) {
            if (this.f21618L == null) {
                this.f21618L = new d(this.f20948B);
            }
            ViewGroup viewGroup = (ViewGroup) this.f21618L.getParent();
            if (viewGroup != this.f20956J) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f21618L);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f20956J;
                actionMenuView.addView(this.f21618L, actionMenuView.F());
            }
        } else {
            d dVar = this.f21618L;
            if (dVar != null) {
                Object parent = dVar.getParent();
                Object obj = this.f20956J;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f21618L);
                }
            }
        }
        ((ActionMenuView) this.f20956J).setOverflowReserved(this.f21621O);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // androidx.appcompat.view.menu.j
    public boolean f() {
        ArrayList<androidx.appcompat.view.menu.g> arrayListG;
        int size;
        int i10;
        int iL;
        boolean z10;
        int i11;
        C1981c c1981c = this;
        androidx.appcompat.view.menu.e eVar = c1981c.f20950D;
        View view = null;
        ?? r32 = 0;
        if (eVar != null) {
            arrayListG = eVar.G();
            size = arrayListG.size();
        } else {
            arrayListG = null;
            size = 0;
        }
        int i12 = c1981c.f21625S;
        int i13 = c1981c.f21624R;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c1981c.f20956J;
        boolean z11 = false;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            androidx.appcompat.view.menu.g gVar = arrayListG.get(i16);
            if (gVar.o()) {
                i14++;
            } else if (gVar.n()) {
                i15++;
            } else {
                z11 = true;
            }
            if (c1981c.f21629W && gVar.isActionViewExpanded()) {
                i12 = 0;
            }
        }
        if (c1981c.f21621O && (z11 || i15 + i14 > i12)) {
            i12--;
        }
        int i17 = i12 - i14;
        SparseBooleanArray sparseBooleanArray = c1981c.f21631Y;
        sparseBooleanArray.clear();
        if (c1981c.f21627U) {
            int i18 = c1981c.f21630X;
            iL = i13 / i18;
            i10 = i18 + ((i13 % i18) / iL);
        } else {
            i10 = 0;
            iL = 0;
        }
        int i19 = 0;
        int i20 = 0;
        while (i19 < size) {
            androidx.appcompat.view.menu.g gVar2 = arrayListG.get(i19);
            if (gVar2.o()) {
                View viewQ = c1981c.q(gVar2, view, viewGroup);
                if (c1981c.f21627U) {
                    iL -= ActionMenuView.L(viewQ, i10, iL, iMakeMeasureSpec, r32);
                } else {
                    viewQ.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                }
                int measuredWidth = viewQ.getMeasuredWidth();
                i13 -= measuredWidth;
                if (i20 == 0) {
                    i20 = measuredWidth;
                }
                int groupId = gVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                gVar2.u(true);
                z10 = r32;
                i11 = size;
            } else if (gVar2.n()) {
                int groupId2 = gVar2.getGroupId();
                boolean z12 = sparseBooleanArray.get(groupId2);
                boolean z13 = (i17 > 0 || z12) && i13 > 0 && (!c1981c.f21627U || iL > 0);
                boolean z14 = z13;
                i11 = size;
                if (z13) {
                    View viewQ2 = c1981c.q(gVar2, null, viewGroup);
                    if (c1981c.f21627U) {
                        int iL2 = ActionMenuView.L(viewQ2, i10, iL, iMakeMeasureSpec, 0);
                        iL -= iL2;
                        if (iL2 == 0) {
                            z14 = false;
                        }
                    } else {
                        viewQ2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    }
                    boolean z15 = z14;
                    int measuredWidth2 = viewQ2.getMeasuredWidth();
                    i13 -= measuredWidth2;
                    if (i20 == 0) {
                        i20 = measuredWidth2;
                    }
                    z13 = z15 & (!c1981c.f21627U ? i13 + i20 <= 0 : i13 < 0);
                }
                if (z13 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z12) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i21 = 0; i21 < i19; i21++) {
                        androidx.appcompat.view.menu.g gVar3 = arrayListG.get(i21);
                        if (gVar3.getGroupId() == groupId2) {
                            if (gVar3.l()) {
                                i17++;
                            }
                            gVar3.u(false);
                        }
                    }
                }
                if (z13) {
                    i17--;
                }
                gVar2.u(z13);
                z10 = false;
            } else {
                z10 = r32;
                i11 = size;
                gVar2.u(z10);
            }
            i19++;
            r32 = z10;
            size = i11;
            view = null;
            c1981c = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void j(Context context, androidx.appcompat.view.menu.e eVar) {
        super.j(context, eVar);
        Resources resources = context.getResources();
        androidx.appcompat.view.a aVarB = androidx.appcompat.view.a.b(context);
        if (!this.f21622P) {
            this.f21621O = aVarB.h();
        }
        if (!this.f21628V) {
            this.f21623Q = aVarB.c();
        }
        if (!this.f21626T) {
            this.f21625S = aVarB.d();
        }
        int measuredWidth = this.f21623Q;
        if (this.f21621O) {
            if (this.f21618L == null) {
                d dVar = new d(this.f20948B);
                this.f21618L = dVar;
                if (this.f21620N) {
                    dVar.setImageDrawable(this.f21619M);
                    this.f21619M = null;
                    this.f21620N = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f21618L.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f21618L.getMeasuredWidth();
        } else {
            this.f21618L = null;
        }
        this.f21624R = measuredWidth;
        this.f21630X = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.j
    public void k(Parcelable parcelable) {
        int i10;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof g) && (i10 = ((g) parcelable).f21647B) > 0 && (menuItemFindItem = this.f20950D.findItem(i10)) != null) {
            m((androidx.appcompat.view.menu.m) menuItemFindItem.getSubMenu());
        }
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public boolean m(androidx.appcompat.view.menu.m mVar) {
        boolean z10 = false;
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        androidx.appcompat.view.menu.m mVar2 = mVar;
        while (mVar2.j0() != this.f20950D) {
            mVar2 = (androidx.appcompat.view.menu.m) mVar2.j0();
        }
        View viewC = C(mVar2.getItem());
        if (viewC == null) {
            return false;
        }
        this.f21637e0 = mVar.getItem().getItemId();
        int size = mVar.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            MenuItem item = mVar.getItem(i10);
            if (item.isVisible() && item.getIcon() != null) {
                z10 = true;
                break;
            }
            i10++;
        }
        a aVar = new a(this.f20949C, mVar, viewC);
        this.f21633a0 = aVar;
        aVar.g(z10);
        this.f21633a0.k();
        super.m(mVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public Parcelable n() {
        g gVar = new g();
        gVar.f21647B = this.f21637e0;
        return gVar;
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean o(ViewGroup viewGroup, int i10) {
        if (viewGroup.getChildAt(i10) == this.f21618L) {
            return false;
        }
        return super.o(viewGroup, i10);
    }

    @Override // androidx.appcompat.view.menu.a
    public View q(androidx.appcompat.view.menu.g gVar, View view, ViewGroup viewGroup) {
        View actionView = gVar.getActionView();
        if (actionView == null || gVar.j()) {
            actionView = super.q(gVar, view, viewGroup);
        }
        actionView.setVisibility(gVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.a
    public androidx.appcompat.view.menu.k r(ViewGroup viewGroup) {
        androidx.appcompat.view.menu.k kVar = this.f20956J;
        androidx.appcompat.view.menu.k kVarR = super.r(viewGroup);
        if (kVar != kVarR) {
            ((ActionMenuView) kVarR).setPresenter(this);
        }
        return kVarR;
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean t(int i10, androidx.appcompat.view.menu.g gVar) {
        return gVar.l();
    }
}
