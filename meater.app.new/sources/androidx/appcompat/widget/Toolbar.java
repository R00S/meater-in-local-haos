package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC0064a;
import androidx.appcompat.view.menu.C0087g;
import androidx.appcompat.view.menu.C0089i;
import androidx.appcompat.view.menu.InterfaceC0093m;
import androidx.appcompat.view.menu.SubMenuC0098r;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.C0286d;
import androidx.core.view.C0297g;
import androidx.core.view.C0311u;
import androidx.customview.view.AbsSavedState;
import java.util.ArrayList;
import java.util.List;
import p024c.p025a.C0823a;
import p024c.p025a.C0832j;
import p024c.p025a.p026k.p027a.C0833a;
import p024c.p025a.p032o.C0847g;
import p024c.p025a.p032o.InterfaceC0843c;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: A */
    private int f966A;

    /* renamed from: B */
    private int f967B;

    /* renamed from: C */
    private CharSequence f968C;

    /* renamed from: D */
    private CharSequence f969D;

    /* renamed from: E */
    private ColorStateList f970E;

    /* renamed from: F */
    private ColorStateList f971F;

    /* renamed from: G */
    private boolean f972G;

    /* renamed from: H */
    private boolean f973H;

    /* renamed from: I */
    private final ArrayList<View> f974I;

    /* renamed from: J */
    private final ArrayList<View> f975J;

    /* renamed from: K */
    private final int[] f976K;

    /* renamed from: L */
    InterfaceC0150f f977L;

    /* renamed from: M */
    private final ActionMenuView.InterfaceC0117e f978M;

    /* renamed from: N */
    private C0187r0 f979N;

    /* renamed from: O */
    private ActionMenuPresenter f980O;

    /* renamed from: P */
    private C0148d f981P;

    /* renamed from: Q */
    private InterfaceC0093m.a f982Q;

    /* renamed from: R */
    private C0087g.a f983R;

    /* renamed from: S */
    private boolean f984S;

    /* renamed from: T */
    private final Runnable f985T;

    /* renamed from: f */
    private ActionMenuView f986f;

    /* renamed from: g */
    private TextView f987g;

    /* renamed from: h */
    private TextView f988h;

    /* renamed from: i */
    private ImageButton f989i;

    /* renamed from: j */
    private ImageView f990j;

    /* renamed from: k */
    private Drawable f991k;

    /* renamed from: l */
    private CharSequence f992l;

    /* renamed from: m */
    ImageButton f993m;

    /* renamed from: n */
    View f994n;

    /* renamed from: o */
    private Context f995o;

    /* renamed from: p */
    private int f996p;

    /* renamed from: q */
    private int f997q;

    /* renamed from: r */
    private int f998r;

    /* renamed from: s */
    int f999s;

    /* renamed from: t */
    private int f1000t;

    /* renamed from: u */
    private int f1001u;

    /* renamed from: v */
    private int f1002v;

    /* renamed from: w */
    private int f1003w;

    /* renamed from: x */
    private int f1004x;

    /* renamed from: y */
    private C0169i0 f1005y;

    /* renamed from: z */
    private int f1006z;

    /* renamed from: androidx.appcompat.widget.Toolbar$a */
    class C0145a implements ActionMenuView.InterfaceC0117e {
        C0145a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0117e
        public boolean onMenuItemClick(MenuItem menuItem) {
            InterfaceC0150f interfaceC0150f = Toolbar.this.f977L;
            if (interfaceC0150f != null) {
                return interfaceC0150f.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$b */
    class RunnableC0146b implements Runnable {
        RunnableC0146b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.m866O();
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$c */
    class ViewOnClickListenerC0147c implements View.OnClickListener {
        ViewOnClickListenerC0147c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.m869e();
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$d */
    private class C0148d implements InterfaceC0093m {

        /* renamed from: f */
        C0087g f1012f;

        /* renamed from: g */
        C0089i f1013g;

        C0148d() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0093m
        /* renamed from: b */
        public void mo492b(C0087g c0087g, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0093m
        /* renamed from: c */
        public void mo493c(boolean z) {
            if (this.f1013g != null) {
                C0087g c0087g = this.f1012f;
                boolean z2 = false;
                if (c0087g != null) {
                    int size = c0087g.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            break;
                        }
                        if (this.f1012f.getItem(i2) == this.f1013g) {
                            z2 = true;
                            break;
                        }
                        i2++;
                    }
                }
                if (z2) {
                    return;
                }
                mo494e(this.f1012f, this.f1013g);
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0093m
        /* renamed from: d */
        public boolean mo520d() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0093m
        /* renamed from: e */
        public boolean mo494e(C0087g c0087g, C0089i c0089i) {
            KeyEvent.Callback callback = Toolbar.this.f994n;
            if (callback instanceof InterfaceC0843c) {
                ((InterfaceC0843c) callback).mo645f();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f994n);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f993m);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f994n = null;
            toolbar3.m867a();
            this.f1013g = null;
            Toolbar.this.requestLayout();
            c0089i.m625r(false);
            return true;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0093m
        /* renamed from: f */
        public boolean mo495f(C0087g c0087g, C0089i c0089i) {
            Toolbar.this.m871g();
            ViewParent parent = Toolbar.this.f993m.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f993m);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f993m);
            }
            Toolbar.this.f994n = c0089i.getActionView();
            this.f1013g = c0089i;
            ViewParent parent2 = Toolbar.this.f994n.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f994n);
                }
                C0149e c0149eGenerateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                c0149eGenerateDefaultLayoutParams.f264a = 8388611 | (toolbar4.f999s & 112);
                c0149eGenerateDefaultLayoutParams.f1015b = 2;
                toolbar4.f994n.setLayoutParams(c0149eGenerateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f994n);
            }
            Toolbar.this.m860G();
            Toolbar.this.requestLayout();
            c0089i.m625r(true);
            KeyEvent.Callback callback = Toolbar.this.f994n;
            if (callback instanceof InterfaceC0843c) {
                ((InterfaceC0843c) callback).mo644c();
            }
            return true;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0093m
        public int getId() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0093m
        /* renamed from: h */
        public void mo497h(Context context, C0087g c0087g) {
            C0089i c0089i;
            C0087g c0087g2 = this.f1012f;
            if (c0087g2 != null && (c0089i = this.f1013g) != null) {
                c0087g2.mo589f(c0089i);
            }
            this.f1012f = c0087g;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0093m
        /* renamed from: i */
        public void mo521i(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0093m
        /* renamed from: k */
        public boolean mo499k(SubMenuC0098r subMenuC0098r) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0093m
        /* renamed from: l */
        public Parcelable mo523l() {
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$f */
    public interface InterfaceC0150f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0823a.f5026O);
    }

    /* renamed from: B */
    private int m838B(View view, int i2, int[] iArr, int i3) {
        C0149e c0149e = (C0149e) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) c0149e).leftMargin - iArr[0];
        int iMax = i2 + Math.max(0, i4);
        iArr[0] = Math.max(0, -i4);
        int iM853q = m853q(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iM853q, iMax + measuredWidth, view.getMeasuredHeight() + iM853q);
        return iMax + measuredWidth + ((ViewGroup.MarginLayoutParams) c0149e).rightMargin;
    }

    /* renamed from: C */
    private int m839C(View view, int i2, int[] iArr, int i3) {
        C0149e c0149e = (C0149e) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) c0149e).rightMargin - iArr[1];
        int iMax = i2 - Math.max(0, i4);
        iArr[1] = Math.max(0, -i4);
        int iM853q = m853q(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iM853q, iMax, view.getMeasuredHeight() + iM853q);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) c0149e).leftMargin);
    }

    /* renamed from: D */
    private int m840D(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i6 = marginLayoutParams.leftMargin - iArr[0];
        int i7 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i7);
        iArr[0] = Math.max(0, -i6);
        iArr[1] = Math.max(0, -i7);
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + iMax + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    /* renamed from: E */
    private void m841E(View view, int i2, int i3, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i6 >= 0) {
            if (mode != 0) {
                i6 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i6);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: F */
    private void m842F() {
        removeCallbacks(this.f985T);
        post(this.f985T);
    }

    /* renamed from: M */
    private boolean m843M() {
        if (!this.f984S) {
            return false;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (m844N(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: N */
    private boolean m844N(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: b */
    private void m845b(List<View> list, int i2) {
        boolean z = C0311u.m2162y(this) == 1;
        int childCount = getChildCount();
        int iM1932b = C0286d.m1932b(i2, C0311u.m2162y(this));
        list.clear();
        if (!z) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                C0149e c0149e = (C0149e) childAt.getLayoutParams();
                if (c0149e.f1015b == 0 && m844N(childAt) && m852p(c0149e.f264a) == iM1932b) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            C0149e c0149e2 = (C0149e) childAt2.getLayoutParams();
            if (c0149e2.f1015b == 0 && m844N(childAt2) && m852p(c0149e2.f264a) == iM1932b) {
                list.add(childAt2);
            }
        }
    }

    /* renamed from: c */
    private void m846c(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C0149e c0149eGenerateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (C0149e) layoutParams;
        c0149eGenerateDefaultLayoutParams.f1015b = 1;
        if (!z || this.f994n == null) {
            addView(view, c0149eGenerateDefaultLayoutParams);
        } else {
            view.setLayoutParams(c0149eGenerateDefaultLayoutParams);
            this.f975J.add(view);
        }
    }

    private MenuInflater getMenuInflater() {
        return new C0847g(getContext());
    }

    /* renamed from: h */
    private void m847h() {
        if (this.f1005y == null) {
            this.f1005y = new C0169i0();
        }
    }

    /* renamed from: i */
    private void m848i() {
        if (this.f990j == null) {
            this.f990j = new AppCompatImageView(getContext());
        }
    }

    /* renamed from: j */
    private void m849j() {
        m850k();
        if (this.f986f.m739N() == null) {
            C0087g c0087g = (C0087g) this.f986f.getMenu();
            if (this.f981P == null) {
                this.f981P = new C0148d();
            }
            this.f986f.setExpandedActionViewsExclusive(true);
            c0087g.m583c(this.f981P, this.f995o);
        }
    }

    /* renamed from: k */
    private void m850k() {
        if (this.f986f == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f986f = actionMenuView;
            actionMenuView.setPopupTheme(this.f996p);
            this.f986f.setOnMenuItemClickListener(this.f978M);
            this.f986f.m740O(this.f982Q, this.f983R);
            C0149e c0149eGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            c0149eGenerateDefaultLayoutParams.f264a = 8388613 | (this.f999s & 112);
            this.f986f.setLayoutParams(c0149eGenerateDefaultLayoutParams);
            m846c(this.f986f, false);
        }
    }

    /* renamed from: l */
    private void m851l() {
        if (this.f989i == null) {
            this.f989i = new C0172k(getContext(), null, C0823a.f5025N);
            C0149e c0149eGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            c0149eGenerateDefaultLayoutParams.f264a = 8388611 | (this.f999s & 112);
            this.f989i.setLayoutParams(c0149eGenerateDefaultLayoutParams);
        }
    }

    /* renamed from: p */
    private int m852p(int i2) {
        int iM2162y = C0311u.m2162y(this);
        int iM1932b = C0286d.m1932b(i2, iM2162y) & 7;
        return (iM1932b == 1 || iM1932b == 3 || iM1932b == 5) ? iM1932b : iM2162y == 1 ? 5 : 3;
    }

    /* renamed from: q */
    private int m853q(View view, int i2) {
        C0149e c0149e = (C0149e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i3 = i2 > 0 ? (measuredHeight - i2) / 2 : 0;
        int iM854r = m854r(c0149e.f264a);
        if (iM854r == 48) {
            return getPaddingTop() - i3;
        }
        if (iM854r == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c0149e).bottomMargin) - i3;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) c0149e).topMargin;
        if (iMax < i4) {
            iMax = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) c0149e).bottomMargin;
            if (i5 < i6) {
                iMax = Math.max(0, iMax - (i6 - i5));
            }
        }
        return paddingTop + iMax;
    }

    /* renamed from: r */
    private int m854r(int i2) {
        int i3 = i2 & 112;
        return (i3 == 16 || i3 == 48 || i3 == 80) ? i3 : this.f967B & 112;
    }

    /* renamed from: s */
    private int m855s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return C0297g.m2045b(marginLayoutParams) + C0297g.m2044a(marginLayoutParams);
    }

    /* renamed from: t */
    private int m856t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: u */
    private int m857u(List<View> list, int[] iArr) {
        int i2 = iArr[0];
        int i3 = iArr[1];
        int size = list.size();
        int i4 = 0;
        int measuredWidth = 0;
        while (i4 < size) {
            View view = list.get(i4);
            C0149e c0149e = (C0149e) view.getLayoutParams();
            int i5 = ((ViewGroup.MarginLayoutParams) c0149e).leftMargin - i2;
            int i6 = ((ViewGroup.MarginLayoutParams) c0149e).rightMargin - i3;
            int iMax = Math.max(0, i5);
            int iMax2 = Math.max(0, i6);
            int iMax3 = Math.max(0, -i5);
            int iMax4 = Math.max(0, -i6);
            measuredWidth += iMax + view.getMeasuredWidth() + iMax2;
            i4++;
            i3 = iMax4;
            i2 = iMax3;
        }
        return measuredWidth;
    }

    /* renamed from: y */
    private boolean m858y(View view) {
        return view.getParent() == this || this.f975J.contains(view);
    }

    /* renamed from: A */
    public boolean m859A() {
        ActionMenuView actionMenuView = this.f986f;
        return actionMenuView != null && actionMenuView.m737J();
    }

    /* renamed from: G */
    void m860G() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((C0149e) childAt.getLayoutParams()).f1015b != 2 && childAt != this.f986f) {
                removeViewAt(childCount);
                this.f975J.add(childAt);
            }
        }
    }

    /* renamed from: H */
    public void m861H(int i2, int i3) {
        m847h();
        this.f1005y.m1029g(i2, i3);
    }

    /* renamed from: I */
    public void m862I(C0087g c0087g, ActionMenuPresenter actionMenuPresenter) {
        if (c0087g == null && this.f986f == null) {
            return;
        }
        m850k();
        C0087g c0087gM739N = this.f986f.m739N();
        if (c0087gM739N == c0087g) {
            return;
        }
        if (c0087gM739N != null) {
            c0087gM739N.m570Q(this.f980O);
            c0087gM739N.m570Q(this.f981P);
        }
        if (this.f981P == null) {
            this.f981P = new C0148d();
        }
        actionMenuPresenter.m719I(true);
        if (c0087g != null) {
            c0087g.m583c(actionMenuPresenter, this.f995o);
            c0087g.m583c(this.f981P, this.f995o);
        } else {
            actionMenuPresenter.mo497h(this.f995o, null);
            this.f981P.mo497h(this.f995o, null);
            actionMenuPresenter.mo493c(true);
            this.f981P.mo493c(true);
        }
        this.f986f.setPopupTheme(this.f996p);
        this.f986f.setPresenter(actionMenuPresenter);
        this.f980O = actionMenuPresenter;
    }

    /* renamed from: J */
    public void m863J(InterfaceC0093m.a aVar, C0087g.a aVar2) {
        this.f982Q = aVar;
        this.f983R = aVar2;
        ActionMenuView actionMenuView = this.f986f;
        if (actionMenuView != null) {
            actionMenuView.m740O(aVar, aVar2);
        }
    }

    /* renamed from: K */
    public void m864K(Context context, int i2) {
        this.f998r = i2;
        TextView textView = this.f988h;
        if (textView != null) {
            textView.setTextAppearance(context, i2);
        }
    }

    /* renamed from: L */
    public void m865L(Context context, int i2) {
        this.f997q = i2;
        TextView textView = this.f987g;
        if (textView != null) {
            textView.setTextAppearance(context, i2);
        }
    }

    /* renamed from: O */
    public boolean m866O() {
        ActionMenuView actionMenuView = this.f986f;
        return actionMenuView != null && actionMenuView.m741P();
    }

    /* renamed from: a */
    void m867a() {
        for (int size = this.f975J.size() - 1; size >= 0; size--) {
            addView(this.f975J.get(size));
        }
        this.f975J.clear();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0149e);
    }

    /* renamed from: d */
    public boolean m868d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f986f) != null && actionMenuView.m738K();
    }

    /* renamed from: e */
    public void m869e() {
        C0148d c0148d = this.f981P;
        C0089i c0089i = c0148d == null ? null : c0148d.f1013g;
        if (c0089i != null) {
            c0089i.collapseActionView();
        }
    }

    /* renamed from: f */
    public void m870f() {
        ActionMenuView actionMenuView = this.f986f;
        if (actionMenuView != null) {
            actionMenuView.m729B();
        }
    }

    /* renamed from: g */
    void m871g() {
        if (this.f993m == null) {
            C0172k c0172k = new C0172k(getContext(), null, C0823a.f5025N);
            this.f993m = c0172k;
            c0172k.setImageDrawable(this.f991k);
            this.f993m.setContentDescription(this.f992l);
            C0149e c0149eGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            c0149eGenerateDefaultLayoutParams.f264a = 8388611 | (this.f999s & 112);
            c0149eGenerateDefaultLayoutParams.f1015b = 2;
            this.f993m.setLayoutParams(c0149eGenerateDefaultLayoutParams);
            this.f993m.setOnClickListener(new ViewOnClickListenerC0147c());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f993m;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f993m;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C0169i0 c0169i0 = this.f1005y;
        if (c0169i0 != null) {
            return c0169i0.m1023a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i2 = this.f966A;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C0169i0 c0169i0 = this.f1005y;
        if (c0169i0 != null) {
            return c0169i0.m1024b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        C0169i0 c0169i0 = this.f1005y;
        if (c0169i0 != null) {
            return c0169i0.m1025c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        C0169i0 c0169i0 = this.f1005y;
        if (c0169i0 != null) {
            return c0169i0.m1026d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i2 = this.f1006z;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        C0087g c0087gM739N;
        ActionMenuView actionMenuView = this.f986f;
        return actionMenuView != null && (c0087gM739N = actionMenuView.m739N()) != null && c0087gM739N.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.f966A, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        return C0311u.m2162y(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return C0311u.m2162y(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f1006z, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f990j;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f990j;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m849j();
        return this.f986f.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f989i;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f989i;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.f980O;
    }

    public Drawable getOverflowIcon() {
        m849j();
        return this.f986f.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f995o;
    }

    public int getPopupTheme() {
        return this.f996p;
    }

    public CharSequence getSubtitle() {
        return this.f969D;
    }

    final TextView getSubtitleTextView() {
        return this.f988h;
    }

    public CharSequence getTitle() {
        return this.f968C;
    }

    public int getTitleMarginBottom() {
        return this.f1004x;
    }

    public int getTitleMarginEnd() {
        return this.f1002v;
    }

    public int getTitleMarginStart() {
        return this.f1001u;
    }

    public int getTitleMarginTop() {
        return this.f1003w;
    }

    final TextView getTitleTextView() {
        return this.f987g;
    }

    public InterfaceC0198x getWrapper() {
        if (this.f979N == null) {
            this.f979N = new C0187r0(this, true);
        }
        return this.f979N;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public C0149e generateDefaultLayoutParams() {
        return new C0149e(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public C0149e generateLayoutParams(AttributeSet attributeSet) {
        return new C0149e(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public C0149e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0149e ? new C0149e((C0149e) layoutParams) : layoutParams instanceof AbstractC0064a.a ? new C0149e((AbstractC0064a.a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0149e((ViewGroup.MarginLayoutParams) layoutParams) : new C0149e(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f985T);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f973H = false;
        }
        if (!this.f973H) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f973H = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f973H = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x029f A[LOOP:0: B:104:0x029d->B:105:0x029f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02c1 A[LOOP:1: B:107:0x02bf->B:108:0x02c1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02fa A[LOOP:2: B:116:0x02f8->B:117:0x02fa, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0227  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onLayout(boolean r20, int r21, int r22, int r23, int r24) throws java.lang.NoSuchFieldException {
        /*
            Method dump skipped, instructions count: 783
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        char c2;
        char c3;
        int measuredWidth;
        int iMax;
        int iCombineMeasuredStates;
        int measuredWidth2;
        int iCombineMeasuredStates2;
        int iMax2;
        int measuredHeight;
        int[] iArr = this.f976K;
        if (C0197w0.m1231b(this)) {
            c2 = 1;
            c3 = 0;
        } else {
            c2 = 0;
            c3 = 1;
        }
        if (m844N(this.f989i)) {
            m841E(this.f989i, i2, 0, i3, 0, this.f1000t);
            measuredWidth = this.f989i.getMeasuredWidth() + m855s(this.f989i);
            iMax = Math.max(0, this.f989i.getMeasuredHeight() + m856t(this.f989i));
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f989i.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (m844N(this.f993m)) {
            m841E(this.f993m, i2, 0, i3, 0, this.f1000t);
            measuredWidth = this.f993m.getMeasuredWidth() + m855s(this.f993m);
            iMax = Math.max(iMax, this.f993m.getMeasuredHeight() + m856t(this.f993m));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f993m.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = 0 + Math.max(currentContentInsetStart, measuredWidth);
        iArr[c2] = Math.max(0, currentContentInsetStart - measuredWidth);
        if (m844N(this.f986f)) {
            m841E(this.f986f, i2, iMax3, i3, 0, this.f1000t);
            measuredWidth2 = this.f986f.getMeasuredWidth() + m855s(this.f986f);
            iMax = Math.max(iMax, this.f986f.getMeasuredHeight() + m856t(this.f986f));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f986f.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = iMax3 + Math.max(currentContentInsetEnd, measuredWidth2);
        iArr[c3] = Math.max(0, currentContentInsetEnd - measuredWidth2);
        if (m844N(this.f994n)) {
            iMax4 += m840D(this.f994n, i2, iMax4, i3, 0, iArr);
            iMax = Math.max(iMax, this.f994n.getMeasuredHeight() + m856t(this.f994n));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f994n.getMeasuredState());
        }
        if (m844N(this.f990j)) {
            iMax4 += m840D(this.f990j, i2, iMax4, i3, 0, iArr);
            iMax = Math.max(iMax, this.f990j.getMeasuredHeight() + m856t(this.f990j));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f990j.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (((C0149e) childAt.getLayoutParams()).f1015b == 0 && m844N(childAt)) {
                iMax4 += m840D(childAt, i2, iMax4, i3, 0, iArr);
                iMax = Math.max(iMax, childAt.getMeasuredHeight() + m856t(childAt));
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i5 = this.f1003w + this.f1004x;
        int i6 = this.f1001u + this.f1002v;
        if (m844N(this.f987g)) {
            m840D(this.f987g, i2, iMax4 + i6, i3, i5, iArr);
            int measuredWidth3 = this.f987g.getMeasuredWidth() + m855s(this.f987g);
            measuredHeight = this.f987g.getMeasuredHeight() + m856t(this.f987g);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f987g.getMeasuredState());
            iMax2 = measuredWidth3;
        } else {
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
            measuredHeight = 0;
        }
        if (m844N(this.f988h)) {
            iMax2 = Math.max(iMax2, m840D(this.f988h, i2, iMax4 + i6, i3, measuredHeight + i5, iArr));
            measuredHeight += this.f988h.getMeasuredHeight() + m856t(this.f988h);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f988h.getMeasuredState());
        }
        int iMax5 = Math.max(iMax, measuredHeight);
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax4 + iMax2 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i2, (-16777216) & iCombineMeasuredStates2), m843M() ? 0 : View.resolveSizeAndState(Math.max(iMax5 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i3, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m2342a());
        ActionMenuView actionMenuView = this.f986f;
        C0087g c0087gM739N = actionMenuView != null ? actionMenuView.m739N() : null;
        int i2 = savedState.f1007h;
        if (i2 != 0 && this.f981P != null && c0087gM739N != null && (menuItemFindItem = c0087gM739N.findItem(i2)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (savedState.f1008i) {
            m842F();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i2) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i2);
        }
        m847h();
        this.f1005y.m1028f(i2 == 1);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        C0089i c0089i;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        C0148d c0148d = this.f981P;
        if (c0148d != null && (c0089i = c0148d.f1013g) != null) {
            savedState.f1007h = c0089i.getItemId();
        }
        savedState.f1008i = m859A();
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f972G = false;
        }
        if (!this.f972G) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f972G = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f972G = false;
        }
        return true;
    }

    public void setCollapseContentDescription(int i2) {
        setCollapseContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setCollapseIcon(int i2) {
        setCollapseIcon(C0833a.m5262d(getContext(), i2));
    }

    public void setCollapsible(boolean z) {
        this.f984S = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.f966A) {
            this.f966A = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.f1006z) {
            this.f1006z = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i2) {
        setLogo(C0833a.m5262d(getContext(), i2));
    }

    public void setLogoDescription(int i2) {
        setLogoDescription(getContext().getText(i2));
    }

    public void setNavigationContentDescription(int i2) {
        setNavigationContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setNavigationIcon(int i2) {
        setNavigationIcon(C0833a.m5262d(getContext(), i2));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m851l();
        this.f989i.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(InterfaceC0150f interfaceC0150f) {
        this.f977L = interfaceC0150f;
    }

    public void setOverflowIcon(Drawable drawable) {
        m849j();
        this.f986f.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i2) {
        if (this.f996p != i2) {
            this.f996p = i2;
            if (i2 == 0) {
                this.f995o = getContext();
            } else {
                this.f995o = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setSubtitle(int i2) {
        setSubtitle(getContext().getText(i2));
    }

    public void setSubtitleTextColor(int i2) {
        setSubtitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setTitle(int i2) {
        setTitle(getContext().getText(i2));
    }

    public void setTitleMarginBottom(int i2) {
        this.f1004x = i2;
        requestLayout();
    }

    public void setTitleMarginEnd(int i2) {
        this.f1002v = i2;
        requestLayout();
    }

    public void setTitleMarginStart(int i2) {
        this.f1001u = i2;
        requestLayout();
    }

    public void setTitleMarginTop(int i2) {
        this.f1003w = i2;
        requestLayout();
    }

    public void setTitleTextColor(int i2) {
        setTitleTextColor(ColorStateList.valueOf(i2));
    }

    /* renamed from: v */
    public boolean m875v() {
        C0148d c0148d = this.f981P;
        return (c0148d == null || c0148d.f1013g == null) ? false : true;
    }

    /* renamed from: w */
    public boolean m876w() {
        ActionMenuView actionMenuView = this.f986f;
        return actionMenuView != null && actionMenuView.m735H();
    }

    /* renamed from: x */
    public void m877x(int i2) {
        getMenuInflater().inflate(i2, getMenu());
    }

    /* renamed from: z */
    public boolean m878z() {
        ActionMenuView actionMenuView = this.f986f;
        return actionMenuView != null && actionMenuView.m736I();
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$e */
    public static class C0149e extends AbstractC0064a.a {

        /* renamed from: b */
        int f1015b;

        public C0149e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1015b = 0;
        }

        /* renamed from: a */
        void m882a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public C0149e(int i2, int i3) {
            super(i2, i3);
            this.f1015b = 0;
            this.f264a = 8388627;
        }

        public C0149e(C0149e c0149e) {
            super((AbstractC0064a.a) c0149e);
            this.f1015b = 0;
            this.f1015b = c0149e.f1015b;
        }

        public C0149e(AbstractC0064a.a aVar) {
            super(aVar);
            this.f1015b = 0;
        }

        public C0149e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1015b = 0;
            m882a(marginLayoutParams);
        }

        public C0149e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1015b = 0;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f967B = 8388627;
        this.f974I = new ArrayList<>();
        this.f975J = new ArrayList<>();
        this.f976K = new int[2];
        this.f978M = new C0145a();
        this.f985T = new RunnableC0146b();
        Context context2 = getContext();
        int[] iArr = C0832j.f5382k3;
        C0185q0 c0185q0M1091v = C0185q0.m1091v(context2, attributeSet, iArr, i2, 0);
        C0311u.m2127g0(this, context, iArr, attributeSet, c0185q0M1091v.m1109r(), i2, 0);
        this.f997q = c0185q0M1091v.m1105n(C0832j.f5263M3, 0);
        this.f998r = c0185q0M1091v.m1105n(C0832j.f5218D3, 0);
        this.f967B = c0185q0M1091v.m1103l(C0832j.f5387l3, this.f967B);
        this.f999s = c0185q0M1091v.m1103l(C0832j.f5392m3, 48);
        int iM1096e = c0185q0M1091v.m1096e(C0832j.f5233G3, 0);
        int i3 = C0832j.f5258L3;
        iM1096e = c0185q0M1091v.m1110s(i3) ? c0185q0M1091v.m1096e(i3, iM1096e) : iM1096e;
        this.f1004x = iM1096e;
        this.f1003w = iM1096e;
        this.f1002v = iM1096e;
        this.f1001u = iM1096e;
        int iM1096e2 = c0185q0M1091v.m1096e(C0832j.f5248J3, -1);
        if (iM1096e2 >= 0) {
            this.f1001u = iM1096e2;
        }
        int iM1096e3 = c0185q0M1091v.m1096e(C0832j.f5243I3, -1);
        if (iM1096e3 >= 0) {
            this.f1002v = iM1096e3;
        }
        int iM1096e4 = c0185q0M1091v.m1096e(C0832j.f5253K3, -1);
        if (iM1096e4 >= 0) {
            this.f1003w = iM1096e4;
        }
        int iM1096e5 = c0185q0M1091v.m1096e(C0832j.f5238H3, -1);
        if (iM1096e5 >= 0) {
            this.f1004x = iM1096e5;
        }
        this.f1000t = c0185q0M1091v.m1097f(C0832j.f5447x3, -1);
        int iM1096e6 = c0185q0M1091v.m1096e(C0832j.f5427t3, Integer.MIN_VALUE);
        int iM1096e7 = c0185q0M1091v.m1096e(C0832j.f5407p3, Integer.MIN_VALUE);
        int iM1097f = c0185q0M1091v.m1097f(C0832j.f5417r3, 0);
        int iM1097f2 = c0185q0M1091v.m1097f(C0832j.f5422s3, 0);
        m847h();
        this.f1005y.m1027e(iM1097f, iM1097f2);
        if (iM1096e6 != Integer.MIN_VALUE || iM1096e7 != Integer.MIN_VALUE) {
            this.f1005y.m1029g(iM1096e6, iM1096e7);
        }
        this.f1006z = c0185q0M1091v.m1096e(C0832j.f5432u3, Integer.MIN_VALUE);
        this.f966A = c0185q0M1091v.m1096e(C0832j.f5412q3, Integer.MIN_VALUE);
        this.f991k = c0185q0M1091v.m1098g(C0832j.f5402o3);
        this.f992l = c0185q0M1091v.m1107p(C0832j.f5397n3);
        CharSequence charSequenceM1107p = c0185q0M1091v.m1107p(C0832j.f5228F3);
        if (!TextUtils.isEmpty(charSequenceM1107p)) {
            setTitle(charSequenceM1107p);
        }
        CharSequence charSequenceM1107p2 = c0185q0M1091v.m1107p(C0832j.f5213C3);
        if (!TextUtils.isEmpty(charSequenceM1107p2)) {
            setSubtitle(charSequenceM1107p2);
        }
        this.f995o = getContext();
        setPopupTheme(c0185q0M1091v.m1105n(C0832j.f5208B3, 0));
        Drawable drawableM1098g = c0185q0M1091v.m1098g(C0832j.f5203A3);
        if (drawableM1098g != null) {
            setNavigationIcon(drawableM1098g);
        }
        CharSequence charSequenceM1107p3 = c0185q0M1091v.m1107p(C0832j.f5457z3);
        if (!TextUtils.isEmpty(charSequenceM1107p3)) {
            setNavigationContentDescription(charSequenceM1107p3);
        }
        Drawable drawableM1098g2 = c0185q0M1091v.m1098g(C0832j.f5437v3);
        if (drawableM1098g2 != null) {
            setLogo(drawableM1098g2);
        }
        CharSequence charSequenceM1107p4 = c0185q0M1091v.m1107p(C0832j.f5442w3);
        if (!TextUtils.isEmpty(charSequenceM1107p4)) {
            setLogoDescription(charSequenceM1107p4);
        }
        int i4 = C0832j.f5268N3;
        if (c0185q0M1091v.m1110s(i4)) {
            setTitleTextColor(c0185q0M1091v.m1094c(i4));
        }
        int i5 = C0832j.f5223E3;
        if (c0185q0M1091v.m1110s(i5)) {
            setSubtitleTextColor(c0185q0M1091v.m1094c(i5));
        }
        int i6 = C0832j.f5452y3;
        if (c0185q0M1091v.m1110s(i6)) {
            m877x(c0185q0M1091v.m1105n(i6, 0));
        }
        c0185q0M1091v.m1111w();
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m871g();
        }
        ImageButton imageButton = this.f993m;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            m871g();
            this.f993m.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.f993m;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f991k);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            m848i();
            if (!m858y(this.f990j)) {
                m846c(this.f990j, true);
            }
        } else {
            ImageView imageView = this.f990j;
            if (imageView != null && m858y(imageView)) {
                removeView(this.f990j);
                this.f975J.remove(this.f990j);
            }
        }
        ImageView imageView2 = this.f990j;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m848i();
        }
        ImageView imageView = this.f990j;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m851l();
        }
        ImageButton imageButton = this.f989i;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m851l();
            if (!m858y(this.f989i)) {
                m846c(this.f989i, true);
            }
        } else {
            ImageButton imageButton = this.f989i;
            if (imageButton != null && m858y(imageButton)) {
                removeView(this.f989i);
                this.f975J.remove(this.f989i);
            }
        }
        ImageButton imageButton2 = this.f989i;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f988h;
            if (textView != null && m858y(textView)) {
                removeView(this.f988h);
                this.f975J.remove(this.f988h);
            }
        } else {
            if (this.f988h == null) {
                Context context = getContext();
                C0190t c0190t = new C0190t(context);
                this.f988h = c0190t;
                c0190t.setSingleLine();
                this.f988h.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f998r;
                if (i2 != 0) {
                    this.f988h.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.f971F;
                if (colorStateList != null) {
                    this.f988h.setTextColor(colorStateList);
                }
            }
            if (!m858y(this.f988h)) {
                m846c(this.f988h, true);
            }
        }
        TextView textView2 = this.f988h;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f969D = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f971F = colorStateList;
        TextView textView = this.f988h;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f987g;
            if (textView != null && m858y(textView)) {
                removeView(this.f987g);
                this.f975J.remove(this.f987g);
            }
        } else {
            if (this.f987g == null) {
                Context context = getContext();
                C0190t c0190t = new C0190t(context);
                this.f987g = c0190t;
                c0190t.setSingleLine();
                this.f987g.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f997q;
                if (i2 != 0) {
                    this.f987g.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.f970E;
                if (colorStateList != null) {
                    this.f987g.setTextColor(colorStateList);
                }
            }
            if (!m858y(this.f987g)) {
                m846c(this.f987g, true);
            }
        }
        TextView textView2 = this.f987g;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f968C = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f970E = colorStateList;
        TextView textView = this.f987g;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0144a();

        /* renamed from: h */
        int f1007h;

        /* renamed from: i */
        boolean f1008i;

        /* renamed from: androidx.appcompat.widget.Toolbar$SavedState$a */
        class C0144a implements Parcelable.ClassLoaderCreator<SavedState> {
            C0144a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1007h = parcel.readInt();
            this.f1008i = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f1007h);
            parcel.writeInt(this.f1008i ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
