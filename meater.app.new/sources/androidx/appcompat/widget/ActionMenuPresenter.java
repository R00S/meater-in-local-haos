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
import androidx.appcompat.view.menu.AbstractC0082b;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0087g;
import androidx.appcompat.view.menu.C0089i;
import androidx.appcompat.view.menu.C0092l;
import androidx.appcompat.view.menu.InterfaceC0093m;
import androidx.appcompat.view.menu.InterfaceC0094n;
import androidx.appcompat.view.menu.InterfaceC0096p;
import androidx.appcompat.view.menu.SubMenuC0098r;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.graphics.drawable.C0265a;
import androidx.core.view.AbstractC0282b;
import java.util.ArrayList;
import p024c.p025a.C0823a;
import p024c.p025a.C0829g;
import p024c.p025a.p032o.C0841a;

/* loaded from: classes.dex */
class ActionMenuPresenter extends AbstractC0082b implements AbstractC0282b.a {

    /* renamed from: A */
    private boolean f749A;

    /* renamed from: B */
    private int f750B;

    /* renamed from: C */
    private final SparseBooleanArray f751C;

    /* renamed from: D */
    C0111e f752D;

    /* renamed from: E */
    C0107a f753E;

    /* renamed from: F */
    RunnableC0109c f754F;

    /* renamed from: G */
    private C0108b f755G;

    /* renamed from: H */
    final C0112f f756H;

    /* renamed from: I */
    int f757I;

    /* renamed from: p */
    C0110d f758p;

    /* renamed from: q */
    private Drawable f759q;

    /* renamed from: r */
    private boolean f760r;

    /* renamed from: s */
    private boolean f761s;

    /* renamed from: t */
    private boolean f762t;

    /* renamed from: u */
    private int f763u;

    /* renamed from: v */
    private int f764v;

    /* renamed from: w */
    private int f765w;

    /* renamed from: x */
    private boolean f766x;

    /* renamed from: y */
    private boolean f767y;

    /* renamed from: z */
    private boolean f768z;

    @SuppressLint({"BanParcelableUsage"})
    private static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0106a();

        /* renamed from: f */
        public int f769f;

        /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$SavedState$a */
        class C0106a implements Parcelable.Creator<SavedState> {
            C0106a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        }

        SavedState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f769f);
        }

        SavedState(Parcel parcel) {
            this.f769f = parcel.readInt();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$a */
    private class C0107a extends C0092l {
        public C0107a(Context context, SubMenuC0098r subMenuC0098r, View view) {
            super(context, subMenuC0098r, view, false, C0823a.f5038l);
            if (!((C0089i) subMenuC0098r.getItem()).m619l()) {
                View view2 = ActionMenuPresenter.this.f758p;
                m657f(view2 == null ? (View) ((AbstractC0082b) ActionMenuPresenter.this).f516n : view2);
            }
            m661j(ActionMenuPresenter.this.f756H);
        }

        @Override // androidx.appcompat.view.menu.C0092l
        /* renamed from: e */
        protected void mo656e() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.f753E = null;
            actionMenuPresenter.f757I = 0;
            super.mo656e();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$b */
    private class C0108b extends ActionMenuItemView.AbstractC0080b {
        C0108b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.AbstractC0080b
        /* renamed from: a */
        public InterfaceC0096p mo476a() {
            C0107a c0107a = ActionMenuPresenter.this.f753E;
            if (c0107a != null) {
                return c0107a.m654c();
            }
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$c */
    private class RunnableC0109c implements Runnable {

        /* renamed from: f */
        private C0111e f772f;

        public RunnableC0109c(C0111e c0111e) {
            this.f772f = c0111e;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((AbstractC0082b) ActionMenuPresenter.this).f510h != null) {
                ((AbstractC0082b) ActionMenuPresenter.this).f510h.m585d();
            }
            View view = (View) ((AbstractC0082b) ActionMenuPresenter.this).f516n;
            if (view != null && view.getWindowToken() != null && this.f772f.m663m()) {
                ActionMenuPresenter.this.f752D = this.f772f;
            }
            ActionMenuPresenter.this.f754F = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$d */
    private class C0110d extends AppCompatImageView implements ActionMenuView.InterfaceC0113a {

        /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$d$a */
        class a extends AbstractViewOnTouchListenerC0155b0 {

            /* renamed from: o */
            final /* synthetic */ ActionMenuPresenter f775o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(View view, ActionMenuPresenter actionMenuPresenter) {
                super(view);
                this.f775o = actionMenuPresenter;
            }

            @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0155b0
            /* renamed from: b */
            public InterfaceC0096p mo474b() {
                C0111e c0111e = ActionMenuPresenter.this.f752D;
                if (c0111e == null) {
                    return null;
                }
                return c0111e.m654c();
            }

            @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0155b0
            /* renamed from: c */
            public boolean mo475c() {
                ActionMenuPresenter.this.m723M();
                return true;
            }

            @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0155b0
            /* renamed from: d */
            public boolean mo726d() {
                ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                if (actionMenuPresenter.f754F != null) {
                    return false;
                }
                actionMenuPresenter.m714D();
                return true;
            }
        }

        public C0110d(Context context) {
            super(context, null, C0823a.f5037k);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C0189s0.m1179a(this, getContentDescription());
            setOnTouchListener(new a(this, ActionMenuPresenter.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0113a
        /* renamed from: a */
        public boolean mo469a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0113a
        /* renamed from: b */
        public boolean mo470b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.m723M();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i2, int i3, int i4, int i5) {
            boolean frame = super.setFrame(i2, i3, i4, i5);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C0265a.m1815l(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$e */
    private class C0111e extends C0092l {
        public C0111e(Context context, C0087g c0087g, View view, boolean z) {
            super(context, c0087g, view, z, C0823a.f5038l);
            m659h(8388613);
            m661j(ActionMenuPresenter.this.f756H);
        }

        @Override // androidx.appcompat.view.menu.C0092l
        /* renamed from: e */
        protected void mo656e() {
            if (((AbstractC0082b) ActionMenuPresenter.this).f510h != null) {
                ((AbstractC0082b) ActionMenuPresenter.this).f510h.close();
            }
            ActionMenuPresenter.this.f752D = null;
            super.mo656e();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$f */
    private class C0112f implements InterfaceC0093m.a {
        C0112f() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0093m.a
        /* renamed from: b */
        public void mo366b(C0087g c0087g, boolean z) {
            if (c0087g instanceof SubMenuC0098r) {
                c0087g.mo560F().m587e(false);
            }
            InterfaceC0093m.a aVarM502o = ActionMenuPresenter.this.m502o();
            if (aVarM502o != null) {
                aVarM502o.mo366b(c0087g, z);
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0093m.a
        /* renamed from: c */
        public boolean mo367c(C0087g c0087g) {
            if (c0087g == ((AbstractC0082b) ActionMenuPresenter.this).f510h) {
                return false;
            }
            ActionMenuPresenter.this.f757I = ((SubMenuC0098r) c0087g).getItem().getItemId();
            InterfaceC0093m.a aVarM502o = ActionMenuPresenter.this.m502o();
            if (aVarM502o != null) {
                return aVarM502o.mo367c(c0087g);
            }
            return false;
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context, C0829g.f5164c, C0829g.f5163b);
        this.f751C = new SparseBooleanArray();
        this.f756H = new C0112f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: B */
    private View m704B(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f516n;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof InterfaceC0094n.a) && ((InterfaceC0094n.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: A */
    public boolean m712A() {
        return m714D() | m715E();
    }

    /* renamed from: C */
    public Drawable m713C() {
        C0110d c0110d = this.f758p;
        if (c0110d != null) {
            return c0110d.getDrawable();
        }
        if (this.f760r) {
            return this.f759q;
        }
        return null;
    }

    /* renamed from: D */
    public boolean m714D() {
        Object obj;
        RunnableC0109c runnableC0109c = this.f754F;
        if (runnableC0109c != null && (obj = this.f516n) != null) {
            ((View) obj).removeCallbacks(runnableC0109c);
            this.f754F = null;
            return true;
        }
        C0111e c0111e = this.f752D;
        if (c0111e == null) {
            return false;
        }
        c0111e.m653b();
        return true;
    }

    /* renamed from: E */
    public boolean m715E() {
        C0107a c0107a = this.f753E;
        if (c0107a == null) {
            return false;
        }
        c0107a.m653b();
        return true;
    }

    /* renamed from: F */
    public boolean m716F() {
        return this.f754F != null || m717G();
    }

    /* renamed from: G */
    public boolean m717G() {
        C0111e c0111e = this.f752D;
        return c0111e != null && c0111e.m655d();
    }

    /* renamed from: H */
    public void m718H(Configuration configuration) {
        if (!this.f766x) {
            this.f765w = C0841a.m5331b(this.f509g).m5334d();
        }
        C0087g c0087g = this.f510h;
        if (c0087g != null) {
            c0087g.m567M(true);
        }
    }

    /* renamed from: I */
    public void m719I(boolean z) {
        this.f749A = z;
    }

    /* renamed from: J */
    public void m720J(ActionMenuView actionMenuView) {
        this.f516n = actionMenuView;
        actionMenuView.mo478b(this.f510h);
    }

    /* renamed from: K */
    public void m721K(Drawable drawable) {
        C0110d c0110d = this.f758p;
        if (c0110d != null) {
            c0110d.setImageDrawable(drawable);
        } else {
            this.f760r = true;
            this.f759q = drawable;
        }
    }

    /* renamed from: L */
    public void m722L(boolean z) {
        this.f761s = z;
        this.f762t = true;
    }

    /* renamed from: M */
    public boolean m723M() {
        C0087g c0087g;
        if (!this.f761s || m717G() || (c0087g = this.f510h) == null || this.f516n == null || this.f754F != null || c0087g.m557B().isEmpty()) {
            return false;
        }
        RunnableC0109c runnableC0109c = new RunnableC0109c(new C0111e(this.f509g, this.f510h, this.f758p, true));
        this.f754F = runnableC0109c;
        ((View) this.f516n).post(runnableC0109c);
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0082b, androidx.appcompat.view.menu.InterfaceC0093m
    /* renamed from: b */
    public void mo492b(C0087g c0087g, boolean z) {
        m712A();
        super.mo492b(c0087g, z);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0082b, androidx.appcompat.view.menu.InterfaceC0093m
    /* renamed from: c */
    public void mo493c(boolean z) {
        super.mo493c(z);
        ((View) this.f516n).requestLayout();
        C0087g c0087g = this.f510h;
        boolean z2 = false;
        if (c0087g != null) {
            ArrayList<C0089i> arrayListM600u = c0087g.m600u();
            int size = arrayListM600u.size();
            for (int i2 = 0; i2 < size; i2++) {
                AbstractC0282b abstractC0282bMo487b = arrayListM600u.get(i2).mo487b();
                if (abstractC0282bMo487b != null) {
                    abstractC0282bMo487b.m1865i(this);
                }
            }
        }
        C0087g c0087g2 = this.f510h;
        ArrayList<C0089i> arrayListM557B = c0087g2 != null ? c0087g2.m557B() : null;
        if (this.f761s && arrayListM557B != null) {
            int size2 = arrayListM557B.size();
            if (size2 == 1) {
                z2 = !arrayListM557B.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f758p == null) {
                this.f758p = new C0110d(this.f508f);
            }
            ViewGroup viewGroup = (ViewGroup) this.f758p.getParent();
            if (viewGroup != this.f516n) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f758p);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f516n;
                actionMenuView.addView(this.f758p, actionMenuView.m733F());
            }
        } else {
            C0110d c0110d = this.f758p;
            if (c0110d != null) {
                Object parent = c0110d.getParent();
                Object obj = this.f516n;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f758p);
                }
            }
        }
        ((ActionMenuView) this.f516n).setOverflowReserved(this.f761s);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0093m
    /* renamed from: d */
    public boolean mo520d() {
        ArrayList<C0089i> arrayListM561G;
        int size;
        int i2;
        int iM727L;
        int i3;
        ActionMenuPresenter actionMenuPresenter = this;
        C0087g c0087g = actionMenuPresenter.f510h;
        View view = null;
        int i4 = 0;
        if (c0087g != null) {
            arrayListM561G = c0087g.m561G();
            size = arrayListM561G.size();
        } else {
            arrayListM561G = null;
            size = 0;
        }
        int i5 = actionMenuPresenter.f765w;
        int i6 = actionMenuPresenter.f764v;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.f516n;
        boolean z = false;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            C0089i c0089i = arrayListM561G.get(i9);
            if (c0089i.m622o()) {
                i7++;
            } else if (c0089i.m621n()) {
                i8++;
            } else {
                z = true;
            }
            if (actionMenuPresenter.f749A && c0089i.isActionViewExpanded()) {
                i5 = 0;
            }
        }
        if (actionMenuPresenter.f761s && (z || i8 + i7 > i5)) {
            i5--;
        }
        int i10 = i5 - i7;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.f751C;
        sparseBooleanArray.clear();
        if (actionMenuPresenter.f767y) {
            int i11 = actionMenuPresenter.f750B;
            iM727L = i6 / i11;
            i2 = i11 + ((i6 % i11) / iM727L);
        } else {
            i2 = 0;
            iM727L = 0;
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < size) {
            C0089i c0089i2 = arrayListM561G.get(i12);
            if (c0089i2.m622o()) {
                View viewMo503p = actionMenuPresenter.mo503p(c0089i2, view, viewGroup);
                if (actionMenuPresenter.f767y) {
                    iM727L -= ActionMenuView.m727L(viewMo503p, i2, iM727L, iMakeMeasureSpec, i4);
                } else {
                    viewMo503p.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                }
                int measuredWidth = viewMo503p.getMeasuredWidth();
                i6 -= measuredWidth;
                if (i13 == 0) {
                    i13 = measuredWidth;
                }
                int groupId = c0089i2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                c0089i2.m628u(true);
                i3 = size;
            } else if (c0089i2.m621n()) {
                int groupId2 = c0089i2.getGroupId();
                boolean z2 = sparseBooleanArray.get(groupId2);
                boolean z3 = (i10 > 0 || z2) && i6 > 0 && (!actionMenuPresenter.f767y || iM727L > 0);
                boolean z4 = z3;
                i3 = size;
                if (z3) {
                    View viewMo503p2 = actionMenuPresenter.mo503p(c0089i2, null, viewGroup);
                    if (actionMenuPresenter.f767y) {
                        int iM727L2 = ActionMenuView.m727L(viewMo503p2, i2, iM727L, iMakeMeasureSpec, 0);
                        iM727L -= iM727L2;
                        if (iM727L2 == 0) {
                            z4 = false;
                        }
                    } else {
                        viewMo503p2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    }
                    boolean z5 = z4;
                    int measuredWidth2 = viewMo503p2.getMeasuredWidth();
                    i6 -= measuredWidth2;
                    if (i13 == 0) {
                        i13 = measuredWidth2;
                    }
                    z3 = z5 & (!actionMenuPresenter.f767y ? i6 + i13 <= 0 : i6 < 0);
                }
                if (z3 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z2) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i14 = 0; i14 < i12; i14++) {
                        C0089i c0089i3 = arrayListM561G.get(i14);
                        if (c0089i3.getGroupId() == groupId2) {
                            if (c0089i3.m619l()) {
                                i10++;
                            }
                            c0089i3.m628u(false);
                        }
                    }
                }
                if (z3) {
                    i10--;
                }
                c0089i2.m628u(z3);
            } else {
                i3 = size;
                c0089i2.m628u(false);
                i12++;
                view = null;
                actionMenuPresenter = this;
                size = i3;
                i4 = 0;
            }
            i12++;
            view = null;
            actionMenuPresenter = this;
            size = i3;
            i4 = 0;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0082b, androidx.appcompat.view.menu.InterfaceC0093m
    /* renamed from: h */
    public void mo497h(Context context, C0087g c0087g) {
        super.mo497h(context, c0087g);
        Resources resources = context.getResources();
        C0841a c0841aM5331b = C0841a.m5331b(context);
        if (!this.f762t) {
            this.f761s = c0841aM5331b.m5338h();
        }
        if (!this.f768z) {
            this.f763u = c0841aM5331b.m5333c();
        }
        if (!this.f766x) {
            this.f765w = c0841aM5331b.m5334d();
        }
        int measuredWidth = this.f763u;
        if (this.f761s) {
            if (this.f758p == null) {
                C0110d c0110d = new C0110d(this.f508f);
                this.f758p = c0110d;
                if (this.f760r) {
                    c0110d.setImageDrawable(this.f759q);
                    this.f759q = null;
                    this.f760r = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f758p.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f758p.getMeasuredWidth();
        } else {
            this.f758p = null;
        }
        this.f764v = measuredWidth;
        this.f750B = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0093m
    /* renamed from: i */
    public void mo521i(Parcelable parcelable) {
        int i2;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof SavedState) && (i2 = ((SavedState) parcelable).f769f) > 0 && (menuItemFindItem = this.f510h.findItem(i2)) != null) {
            mo499k((SubMenuC0098r) menuItemFindItem.getSubMenu());
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0082b
    /* renamed from: j */
    public void mo498j(C0089i c0089i, InterfaceC0094n.a aVar) {
        aVar.mo472e(c0089i, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f516n);
        if (this.f755G == null) {
            this.f755G = new C0108b();
        }
        actionMenuItemView.setPopupCallback(this.f755G);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0082b, androidx.appcompat.view.menu.InterfaceC0093m
    /* renamed from: k */
    public boolean mo499k(SubMenuC0098r subMenuC0098r) {
        boolean z = false;
        if (!subMenuC0098r.hasVisibleItems()) {
            return false;
        }
        SubMenuC0098r subMenuC0098r2 = subMenuC0098r;
        while (subMenuC0098r2.m666i0() != this.f510h) {
            subMenuC0098r2 = (SubMenuC0098r) subMenuC0098r2.m666i0();
        }
        View viewM704B = m704B(subMenuC0098r2.getItem());
        if (viewM704B == null) {
            return false;
        }
        this.f757I = subMenuC0098r.getItem().getItemId();
        int size = subMenuC0098r.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            MenuItem item = subMenuC0098r.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i2++;
        }
        C0107a c0107a = new C0107a(this.f509g, subMenuC0098r, viewM704B);
        this.f753E = c0107a;
        c0107a.m658g(z);
        this.f753E.m662k();
        super.mo499k(subMenuC0098r);
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0093m
    /* renamed from: l */
    public Parcelable mo523l() {
        SavedState savedState = new SavedState();
        savedState.f769f = this.f757I;
        return savedState;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0082b
    /* renamed from: n */
    public boolean mo501n(ViewGroup viewGroup, int i2) {
        if (viewGroup.getChildAt(i2) == this.f758p) {
            return false;
        }
        return super.mo501n(viewGroup, i2);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0082b
    /* renamed from: p */
    public View mo503p(C0089i c0089i, View view, ViewGroup viewGroup) {
        View actionView = c0089i.getActionView();
        if (actionView == null || c0089i.m617j()) {
            actionView = super.mo503p(c0089i, view, viewGroup);
        }
        actionView.setVisibility(c0089i.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0082b
    /* renamed from: q */
    public InterfaceC0094n mo504q(ViewGroup viewGroup) {
        InterfaceC0094n interfaceC0094n = this.f516n;
        InterfaceC0094n interfaceC0094nMo504q = super.mo504q(viewGroup);
        if (interfaceC0094n != interfaceC0094nMo504q) {
            ((ActionMenuView) interfaceC0094nMo504q).setPresenter(this);
        }
        return interfaceC0094nMo504q;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0082b
    /* renamed from: s */
    public boolean mo506s(int i2, C0089i c0089i) {
        return c0089i.m619l();
    }
}
