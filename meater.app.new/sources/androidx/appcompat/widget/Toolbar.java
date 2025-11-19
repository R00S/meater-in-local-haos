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
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionMenuView;
import j.C3699a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import s1.C4456s;
import s1.C4468y;
import s1.InterfaceC4420A;
import s1.InterfaceC4464w;
import y1.AbstractC5121a;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements InterfaceC4464w {

    /* renamed from: B, reason: collision with root package name */
    ActionMenuView f21504B;

    /* renamed from: C, reason: collision with root package name */
    private TextView f21505C;

    /* renamed from: D, reason: collision with root package name */
    private TextView f21506D;

    /* renamed from: E, reason: collision with root package name */
    private ImageButton f21507E;

    /* renamed from: F, reason: collision with root package name */
    private ImageView f21508F;

    /* renamed from: G, reason: collision with root package name */
    private Drawable f21509G;

    /* renamed from: H, reason: collision with root package name */
    private CharSequence f21510H;

    /* renamed from: I, reason: collision with root package name */
    ImageButton f21511I;

    /* renamed from: J, reason: collision with root package name */
    View f21512J;

    /* renamed from: K, reason: collision with root package name */
    private Context f21513K;

    /* renamed from: L, reason: collision with root package name */
    private int f21514L;

    /* renamed from: M, reason: collision with root package name */
    private int f21515M;

    /* renamed from: N, reason: collision with root package name */
    private int f21516N;

    /* renamed from: O, reason: collision with root package name */
    int f21517O;

    /* renamed from: P, reason: collision with root package name */
    private int f21518P;

    /* renamed from: Q, reason: collision with root package name */
    private int f21519Q;

    /* renamed from: R, reason: collision with root package name */
    private int f21520R;

    /* renamed from: S, reason: collision with root package name */
    private int f21521S;

    /* renamed from: T, reason: collision with root package name */
    private int f21522T;

    /* renamed from: U, reason: collision with root package name */
    private S f21523U;

    /* renamed from: V, reason: collision with root package name */
    private int f21524V;

    /* renamed from: W, reason: collision with root package name */
    private int f21525W;

    /* renamed from: a0, reason: collision with root package name */
    private int f21526a0;

    /* renamed from: b0, reason: collision with root package name */
    private CharSequence f21527b0;

    /* renamed from: c0, reason: collision with root package name */
    private CharSequence f21528c0;

    /* renamed from: d0, reason: collision with root package name */
    private ColorStateList f21529d0;

    /* renamed from: e0, reason: collision with root package name */
    private ColorStateList f21530e0;

    /* renamed from: f0, reason: collision with root package name */
    private boolean f21531f0;

    /* renamed from: g0, reason: collision with root package name */
    private boolean f21532g0;

    /* renamed from: h0, reason: collision with root package name */
    private final ArrayList<View> f21533h0;

    /* renamed from: i0, reason: collision with root package name */
    private final ArrayList<View> f21534i0;

    /* renamed from: j0, reason: collision with root package name */
    private final int[] f21535j0;

    /* renamed from: k0, reason: collision with root package name */
    final C4468y f21536k0;

    /* renamed from: l0, reason: collision with root package name */
    private ArrayList<MenuItem> f21537l0;

    /* renamed from: m0, reason: collision with root package name */
    h f21538m0;

    /* renamed from: n0, reason: collision with root package name */
    private final ActionMenuView.e f21539n0;

    /* renamed from: o0, reason: collision with root package name */
    private e0 f21540o0;

    /* renamed from: p0, reason: collision with root package name */
    private C1981c f21541p0;

    /* renamed from: q0, reason: collision with root package name */
    private f f21542q0;

    /* renamed from: r0, reason: collision with root package name */
    private j.a f21543r0;

    /* renamed from: s0, reason: collision with root package name */
    e.a f21544s0;

    /* renamed from: t0, reason: collision with root package name */
    private boolean f21545t0;

    /* renamed from: u0, reason: collision with root package name */
    private OnBackInvokedCallback f21546u0;

    /* renamed from: v0, reason: collision with root package name */
    private OnBackInvokedDispatcher f21547v0;

    /* renamed from: w0, reason: collision with root package name */
    private boolean f21548w0;

    /* renamed from: x0, reason: collision with root package name */
    private final Runnable f21549x0;

    class a implements ActionMenuView.e {
        a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.f21536k0.g(menuItem)) {
                return true;
            }
            h hVar = Toolbar.this.f21538m0;
            if (hVar != null) {
                return hVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.T();
        }
    }

    class c implements e.a {
        c() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            e.a aVar = Toolbar.this.f21544s0;
            return aVar != null && aVar.a(eVar, menuItem);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (!Toolbar.this.f21504B.J()) {
                Toolbar.this.f21536k0.h(eVar);
            }
            e.a aVar = Toolbar.this.f21544s0;
            if (aVar != null) {
                aVar.b(eVar);
            }
        }
    }

    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.e();
        }
    }

    static class e {
        static OnBackInvokedDispatcher a(View view) {
            return view.findOnBackInvokedDispatcher();
        }

        static OnBackInvokedCallback b(final Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new OnBackInvokedCallback() { // from class: androidx.appcompat.widget.d0
                public final void onBackInvoked() {
                    runnable.run();
                }
            };
        }

        static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        static void d(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    public interface h {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.f42393P);
    }

    private boolean A(View view) {
        return view.getParent() == this || this.f21534i0.contains(view);
    }

    private int E(View view, int i10, int[] iArr, int i11) {
        g gVar = (g) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - iArr[0];
        int iMax = i10 + Math.max(0, i12);
        iArr[0] = Math.max(0, -i12);
        int iR = r(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iR, iMax + measuredWidth, view.getMeasuredHeight() + iR);
        return iMax + measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).rightMargin;
    }

    private int F(View view, int i10, int[] iArr, int i11) {
        g gVar = (g) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - iArr[1];
        int iMax = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int iR = r(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iR, iMax, view.getMeasuredHeight() + iR);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).leftMargin);
    }

    private int G(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i14) + Math.max(0, i15);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + iMax + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    private void H(View view, int i10, int i11, int i12, int i13, int i14) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i14 >= 0) {
            if (mode != 0) {
                i14 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i14);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void I() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.f21536k0.e(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f21537l0 = currentMenuItems2;
    }

    private void J() {
        removeCallbacks(this.f21549x0);
        post(this.f21549x0);
    }

    private boolean R() {
        if (!this.f21545t0) {
            return false;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (S(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean S(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private void b(List<View> list, int i10) {
        boolean z10 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int iB = C4456s.b(i10, getLayoutDirection());
        list.clear();
        if (!z10) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f21557b == 0 && S(childAt) && q(gVar.f20638a) == iB) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i12 = childCount - 1; i12 >= 0; i12--) {
            View childAt2 = getChildAt(i12);
            g gVar2 = (g) childAt2.getLayoutParams();
            if (gVar2.f21557b == 0 && S(childAt2) && q(gVar2.f20638a) == iB) {
                list.add(childAt2);
            }
        }
    }

    private void c(View view, boolean z10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        g gVarGenerateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (g) layoutParams;
        gVarGenerateDefaultLayoutParams.f21557b = 1;
        if (!z10 || this.f21512J == null) {
            addView(view, gVarGenerateDefaultLayoutParams);
        } else {
            view.setLayoutParams(gVarGenerateDefaultLayoutParams);
            this.f21534i0.add(view);
        }
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i10 = 0; i10 < menu.size(); i10++) {
            arrayList.add(menu.getItem(i10));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new androidx.appcompat.view.g(getContext());
    }

    private void h() {
        if (this.f21523U == null) {
            this.f21523U = new S();
        }
    }

    private void i() {
        if (this.f21508F == null) {
            this.f21508F = new AppCompatImageView(getContext());
        }
    }

    private void j() {
        k();
        if (this.f21504B.N() == null) {
            androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) this.f21504B.getMenu();
            if (this.f21542q0 == null) {
                this.f21542q0 = new f();
            }
            this.f21504B.setExpandedActionViewsExclusive(true);
            eVar.c(this.f21542q0, this.f21513K);
            U();
        }
    }

    private void k() {
        if (this.f21504B == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f21504B = actionMenuView;
            actionMenuView.setPopupTheme(this.f21514L);
            this.f21504B.setOnMenuItemClickListener(this.f21539n0);
            this.f21504B.O(this.f21543r0, new c());
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f20638a = (this.f21517O & 112) | 8388613;
            this.f21504B.setLayoutParams(gVarGenerateDefaultLayoutParams);
            c(this.f21504B, false);
        }
    }

    private void l() {
        if (this.f21507E == null) {
            this.f21507E = new C1991m(getContext(), null, i.a.f42392O);
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f20638a = (this.f21517O & 112) | 8388611;
            this.f21507E.setLayoutParams(gVarGenerateDefaultLayoutParams);
        }
    }

    private int q(int i10) {
        int layoutDirection = getLayoutDirection();
        int iB = C4456s.b(i10, layoutDirection) & 7;
        return (iB == 1 || iB == 3 || iB == 5) ? iB : layoutDirection == 1 ? 5 : 3;
    }

    private int r(View view, int i10) {
        g gVar = (g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i11 = i10 > 0 ? (measuredHeight - i10) / 2 : 0;
        int iS = s(gVar.f20638a);
        if (iS == 48) {
            return getPaddingTop() - i11;
        }
        if (iS == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin) - i11;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
        if (iMax < i12) {
            iMax = i12;
        } else {
            int i13 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i14 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
            if (i13 < i14) {
                iMax = Math.max(0, iMax - (i14 - i13));
            }
        }
        return paddingTop + iMax;
    }

    private int s(int i10) {
        int i11 = i10 & 112;
        return (i11 == 16 || i11 == 48 || i11 == 80) ? i11 : this.f21526a0 & 112;
    }

    private int t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    private int u(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int v(List<View> list, int[] iArr) {
        int i10 = iArr[0];
        int i11 = iArr[1];
        int size = list.size();
        int i12 = 0;
        int measuredWidth = 0;
        while (i12 < size) {
            View view = list.get(i12);
            g gVar = (g) view.getLayoutParams();
            int i13 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - i10;
            int i14 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - i11;
            int iMax = Math.max(0, i13);
            int iMax2 = Math.max(0, i14);
            int iMax3 = Math.max(0, -i13);
            int iMax4 = Math.max(0, -i14);
            measuredWidth += iMax + view.getMeasuredWidth() + iMax2;
            i12++;
            i11 = iMax4;
            i10 = iMax3;
        }
        return measuredWidth;
    }

    public boolean B() {
        ActionMenuView actionMenuView = this.f21504B;
        return actionMenuView != null && actionMenuView.I();
    }

    @Override // s1.InterfaceC4464w
    public void C(InterfaceC4420A interfaceC4420A) {
        this.f21536k0.b(interfaceC4420A);
    }

    public boolean D() {
        ActionMenuView actionMenuView = this.f21504B;
        return actionMenuView != null && actionMenuView.J();
    }

    void K() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((g) childAt.getLayoutParams()).f21557b != 2 && childAt != this.f21504B) {
                removeViewAt(childCount);
                this.f21534i0.add(childAt);
            }
        }
    }

    public void L(int i10, int i11) {
        h();
        this.f21523U.e(i10, i11);
    }

    public void M(int i10, int i11) {
        h();
        this.f21523U.g(i10, i11);
    }

    public void N(androidx.appcompat.view.menu.e eVar, C1981c c1981c) {
        if (eVar == null && this.f21504B == null) {
            return;
        }
        k();
        androidx.appcompat.view.menu.e eVarN = this.f21504B.N();
        if (eVarN == eVar) {
            return;
        }
        if (eVarN != null) {
            eVarN.R(this.f21541p0);
            eVarN.R(this.f21542q0);
        }
        if (this.f21542q0 == null) {
            this.f21542q0 = new f();
        }
        c1981c.J(true);
        if (eVar != null) {
            eVar.c(c1981c, this.f21513K);
            eVar.c(this.f21542q0, this.f21513K);
        } else {
            c1981c.j(this.f21513K, null);
            this.f21542q0.j(this.f21513K, null);
            c1981c.e(true);
            this.f21542q0.e(true);
        }
        this.f21504B.setPopupTheme(this.f21514L);
        this.f21504B.setPresenter(c1981c);
        this.f21541p0 = c1981c;
        U();
    }

    public void O(j.a aVar, e.a aVar2) {
        this.f21543r0 = aVar;
        this.f21544s0 = aVar2;
        ActionMenuView actionMenuView = this.f21504B;
        if (actionMenuView != null) {
            actionMenuView.O(aVar, aVar2);
        }
    }

    public void P(Context context, int i10) {
        this.f21516N = i10;
        TextView textView = this.f21506D;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public void Q(Context context, int i10) {
        this.f21515M = i10;
        TextView textView = this.f21505C;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public boolean T() {
        ActionMenuView actionMenuView = this.f21504B;
        return actionMenuView != null && actionMenuView.P();
    }

    void U() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = e.a(this);
            boolean z10 = w() && onBackInvokedDispatcherA != null && isAttachedToWindow() && this.f21548w0;
            if (z10 && this.f21547v0 == null) {
                if (this.f21546u0 == null) {
                    this.f21546u0 = e.b(new Runnable() { // from class: androidx.appcompat.widget.b0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f21617B.e();
                        }
                    });
                }
                e.c(onBackInvokedDispatcherA, this.f21546u0);
                this.f21547v0 = onBackInvokedDispatcherA;
                return;
            }
            if (z10 || (onBackInvokedDispatcher = this.f21547v0) == null) {
                return;
            }
            e.d(onBackInvokedDispatcher, this.f21546u0);
            this.f21547v0 = null;
        }
    }

    void a() {
        for (int size = this.f21534i0.size() - 1; size >= 0; size--) {
            addView(this.f21534i0.get(size));
        }
        this.f21534i0.clear();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof g);
    }

    public boolean d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f21504B) != null && actionMenuView.K();
    }

    public void e() {
        f fVar = this.f21542q0;
        androidx.appcompat.view.menu.g gVar = fVar == null ? null : fVar.f21555C;
        if (gVar != null) {
            gVar.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.f21504B;
        if (actionMenuView != null) {
            actionMenuView.B();
        }
    }

    void g() {
        if (this.f21511I == null) {
            C1991m c1991m = new C1991m(getContext(), null, i.a.f42392O);
            this.f21511I = c1991m;
            c1991m.setImageDrawable(this.f21509G);
            this.f21511I.setContentDescription(this.f21510H);
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f20638a = (this.f21517O & 112) | 8388611;
            gVarGenerateDefaultLayoutParams.f21557b = 2;
            this.f21511I.setLayoutParams(gVarGenerateDefaultLayoutParams);
            this.f21511I.setOnClickListener(new d());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f21511I;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f21511I;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        S s10 = this.f21523U;
        if (s10 != null) {
            return s10.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.f21525W;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        S s10 = this.f21523U;
        if (s10 != null) {
            return s10.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        S s10 = this.f21523U;
        if (s10 != null) {
            return s10.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        S s10 = this.f21523U;
        if (s10 != null) {
            return s10.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.f21524V;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.e eVarN;
        ActionMenuView actionMenuView = this.f21504B;
        return (actionMenuView == null || (eVarN = actionMenuView.N()) == null || !eVarN.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f21525W, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f21524V, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f21508F;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f21508F;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        j();
        return this.f21504B.getMenu();
    }

    View getNavButtonView() {
        return this.f21507E;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f21507E;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f21507E;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    C1981c getOuterActionMenuPresenter() {
        return this.f21541p0;
    }

    public Drawable getOverflowIcon() {
        j();
        return this.f21504B.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f21513K;
    }

    public int getPopupTheme() {
        return this.f21514L;
    }

    public CharSequence getSubtitle() {
        return this.f21528c0;
    }

    final TextView getSubtitleTextView() {
        return this.f21506D;
    }

    public CharSequence getTitle() {
        return this.f21527b0;
    }

    public int getTitleMarginBottom() {
        return this.f21522T;
    }

    public int getTitleMarginEnd() {
        return this.f21520R;
    }

    public int getTitleMarginStart() {
        return this.f21519Q;
    }

    public int getTitleMarginTop() {
        return this.f21521S;
    }

    final TextView getTitleTextView() {
        return this.f21505C;
    }

    public D getWrapper() {
        if (this.f21540o0 == null) {
            this.f21540o0 = new e0(this, true);
        }
        return this.f21540o0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public g generateDefaultLayoutParams() {
        return new g(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public g generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    @Override // s1.InterfaceC4464w
    public void o(InterfaceC4420A interfaceC4420A) {
        this.f21536k0.i(interfaceC4420A);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        U();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f21549x0);
        U();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f21532g0 = false;
        }
        if (!this.f21532g0) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f21532g0 = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f21532g0 = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x02a1 A[LOOP:0: B:106:0x029f->B:107:0x02a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02c3 A[LOOP:1: B:109:0x02c1->B:110:0x02c3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02fc A[LOOP:2: B:118:0x02fa->B:119:0x02fc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0227  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 785
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int measuredWidth;
        int iMax;
        int iCombineMeasuredStates;
        int measuredWidth2;
        int measuredHeight;
        int iCombineMeasuredStates2;
        int iMax2;
        int[] iArr = this.f21535j0;
        boolean zB = h0.b(this);
        int i12 = !zB ? 1 : 0;
        if (S(this.f21507E)) {
            H(this.f21507E, i10, 0, i11, 0, this.f21518P);
            measuredWidth = this.f21507E.getMeasuredWidth() + t(this.f21507E);
            iMax = Math.max(0, this.f21507E.getMeasuredHeight() + u(this.f21507E));
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f21507E.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (S(this.f21511I)) {
            H(this.f21511I, i10, 0, i11, 0, this.f21518P);
            measuredWidth = this.f21511I.getMeasuredWidth() + t(this.f21511I);
            iMax = Math.max(iMax, this.f21511I.getMeasuredHeight() + u(this.f21511I));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f21511I.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, measuredWidth);
        iArr[zB ? 1 : 0] = Math.max(0, currentContentInsetStart - measuredWidth);
        if (S(this.f21504B)) {
            H(this.f21504B, i10, iMax3, i11, 0, this.f21518P);
            measuredWidth2 = this.f21504B.getMeasuredWidth() + t(this.f21504B);
            iMax = Math.max(iMax, this.f21504B.getMeasuredHeight() + u(this.f21504B));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f21504B.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = iMax3 + Math.max(currentContentInsetEnd, measuredWidth2);
        iArr[i12] = Math.max(0, currentContentInsetEnd - measuredWidth2);
        if (S(this.f21512J)) {
            iMax4 += G(this.f21512J, i10, iMax4, i11, 0, iArr);
            iMax = Math.max(iMax, this.f21512J.getMeasuredHeight() + u(this.f21512J));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f21512J.getMeasuredState());
        }
        if (S(this.f21508F)) {
            iMax4 += G(this.f21508F, i10, iMax4, i11, 0, iArr);
            iMax = Math.max(iMax, this.f21508F.getMeasuredHeight() + u(this.f21508F));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f21508F.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (((g) childAt.getLayoutParams()).f21557b == 0 && S(childAt)) {
                iMax4 += G(childAt, i10, iMax4, i11, 0, iArr);
                iMax = Math.max(iMax, childAt.getMeasuredHeight() + u(childAt));
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i14 = this.f21521S + this.f21522T;
        int i15 = this.f21519Q + this.f21520R;
        if (S(this.f21505C)) {
            G(this.f21505C, i10, iMax4 + i15, i11, i14, iArr);
            int measuredWidth3 = this.f21505C.getMeasuredWidth() + t(this.f21505C);
            measuredHeight = this.f21505C.getMeasuredHeight() + u(this.f21505C);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f21505C.getMeasuredState());
            iMax2 = measuredWidth3;
        } else {
            measuredHeight = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (S(this.f21506D)) {
            iMax2 = Math.max(iMax2, G(this.f21506D, i10, iMax4 + i15, i11, measuredHeight + i14, iArr));
            measuredHeight += this.f21506D.getMeasuredHeight() + u(this.f21506D);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f21506D.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax4 + iMax2 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, (-16777216) & iCombineMeasuredStates2), R() ? 0 : View.resolveSizeAndState(Math.max(Math.max(iMax, measuredHeight) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.a());
        ActionMenuView actionMenuView = this.f21504B;
        androidx.appcompat.view.menu.e eVarN = actionMenuView != null ? actionMenuView.N() : null;
        int i10 = iVar.f21558D;
        if (i10 != 0 && this.f21542q0 != null && eVarN != null && (menuItemFindItem = eVarN.findItem(i10)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (iVar.f21559E) {
            J();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        h();
        this.f21523U.f(i10 == 1);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.g gVar;
        i iVar = new i(super.onSaveInstanceState());
        f fVar = this.f21542q0;
        if (fVar != null && (gVar = fVar.f21555C) != null) {
            iVar.f21558D = gVar.getItemId();
        }
        iVar.f21559E = D();
        return iVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f21531f0 = false;
        }
        if (!this.f21531f0) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f21531f0 = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f21531f0 = false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public g generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof g ? new g((g) layoutParams) : layoutParams instanceof a.C0299a ? new g((a.C0299a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new g((ViewGroup.MarginLayoutParams) layoutParams) : new g(layoutParams);
    }

    public void setBackInvokedCallbackEnabled(boolean z10) {
        if (this.f21548w0 != z10) {
            this.f21548w0 = z10;
            U();
        }
    }

    public void setCollapseContentDescription(int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseIcon(int i10) {
        setCollapseIcon(C3699a.b(getContext(), i10));
    }

    public void setCollapsible(boolean z10) {
        this.f21545t0 = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f21525W) {
            this.f21525W = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f21524V) {
            this.f21524V = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i10) {
        setLogo(C3699a.b(getContext(), i10));
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(C3699a.b(getContext(), i10));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        l();
        this.f21507E.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(h hVar) {
        this.f21538m0 = hVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        j();
        this.f21504B.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i10) {
        if (this.f21514L != i10) {
            this.f21514L = i10;
            if (i10 == 0) {
                this.f21513K = getContext();
            } else {
                this.f21513K = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitleTextColor(int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitle(int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitleMarginBottom(int i10) {
        this.f21522T = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.f21520R = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.f21519Q = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.f21521S = i10;
        requestLayout();
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    public boolean w() {
        f fVar = this.f21542q0;
        return (fVar == null || fVar.f21555C == null) ? false : true;
    }

    public boolean x() {
        ActionMenuView actionMenuView = this.f21504B;
        return actionMenuView != null && actionMenuView.H();
    }

    public void y(int i10) {
        getMenuInflater().inflate(i10, getMenu());
    }

    public void z() {
        Iterator<MenuItem> it = this.f21537l0.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        I();
    }

    public static class g extends a.C0299a {

        /* renamed from: b, reason: collision with root package name */
        int f21557b;

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f21557b = 0;
        }

        void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public g(int i10, int i11) {
            super(i10, i11);
            this.f21557b = 0;
            this.f20638a = 8388627;
        }

        public g(g gVar) {
            super((a.C0299a) gVar);
            this.f21557b = 0;
            this.f21557b = gVar.f21557b;
        }

        public g(a.C0299a c0299a) {
            super(c0299a);
            this.f21557b = 0;
        }

        public g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f21557b = 0;
            a(marginLayoutParams);
        }

        public g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f21557b = 0;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f21526a0 = 8388627;
        this.f21533h0 = new ArrayList<>();
        this.f21534i0 = new ArrayList<>();
        this.f21535j0 = new int[2];
        this.f21536k0 = new C4468y(new Runnable() { // from class: androidx.appcompat.widget.c0
            @Override // java.lang.Runnable
            public final void run() {
                this.f21648B.z();
            }
        });
        this.f21537l0 = new ArrayList<>();
        this.f21539n0 = new a();
        this.f21549x0 = new b();
        Context context2 = getContext();
        int[] iArr = i.j.f42703d3;
        a0 a0VarV = a0.v(context2, attributeSet, iArr, i10, 0);
        s1.X.l0(this, context, iArr, attributeSet, a0VarV.r(), i10, 0);
        this.f21515M = a0VarV.n(i.j.f42591F3, 0);
        this.f21516N = a0VarV.n(i.j.f42798w3, 0);
        this.f21526a0 = a0VarV.l(i.j.f42708e3, this.f21526a0);
        this.f21517O = a0VarV.l(i.j.f42713f3, 48);
        int iE = a0VarV.e(i.j.f42813z3, 0);
        int i11 = i.j.f42586E3;
        iE = a0VarV.s(i11) ? a0VarV.e(i11, iE) : iE;
        this.f21522T = iE;
        this.f21521S = iE;
        this.f21520R = iE;
        this.f21519Q = iE;
        int iE2 = a0VarV.e(i.j.f42576C3, -1);
        if (iE2 >= 0) {
            this.f21519Q = iE2;
        }
        int iE3 = a0VarV.e(i.j.f42571B3, -1);
        if (iE3 >= 0) {
            this.f21520R = iE3;
        }
        int iE4 = a0VarV.e(i.j.f42581D3, -1);
        if (iE4 >= 0) {
            this.f21521S = iE4;
        }
        int iE5 = a0VarV.e(i.j.f42566A3, -1);
        if (iE5 >= 0) {
            this.f21522T = iE5;
        }
        this.f21518P = a0VarV.f(i.j.f42768q3, -1);
        int iE6 = a0VarV.e(i.j.f42748m3, Integer.MIN_VALUE);
        int iE7 = a0VarV.e(i.j.f42728i3, Integer.MIN_VALUE);
        int iF = a0VarV.f(i.j.f42738k3, 0);
        int iF2 = a0VarV.f(i.j.f42743l3, 0);
        h();
        this.f21523U.e(iF, iF2);
        if (iE6 != Integer.MIN_VALUE || iE7 != Integer.MIN_VALUE) {
            this.f21523U.g(iE6, iE7);
        }
        this.f21524V = a0VarV.e(i.j.f42753n3, Integer.MIN_VALUE);
        this.f21525W = a0VarV.e(i.j.f42733j3, Integer.MIN_VALUE);
        this.f21509G = a0VarV.g(i.j.f42723h3);
        this.f21510H = a0VarV.p(i.j.f42718g3);
        CharSequence charSequenceP = a0VarV.p(i.j.f42808y3);
        if (!TextUtils.isEmpty(charSequenceP)) {
            setTitle(charSequenceP);
        }
        CharSequence charSequenceP2 = a0VarV.p(i.j.f42793v3);
        if (!TextUtils.isEmpty(charSequenceP2)) {
            setSubtitle(charSequenceP2);
        }
        this.f21513K = getContext();
        setPopupTheme(a0VarV.n(i.j.f42788u3, 0));
        Drawable drawableG = a0VarV.g(i.j.f42783t3);
        if (drawableG != null) {
            setNavigationIcon(drawableG);
        }
        CharSequence charSequenceP3 = a0VarV.p(i.j.f42778s3);
        if (!TextUtils.isEmpty(charSequenceP3)) {
            setNavigationContentDescription(charSequenceP3);
        }
        Drawable drawableG2 = a0VarV.g(i.j.f42758o3);
        if (drawableG2 != null) {
            setLogo(drawableG2);
        }
        CharSequence charSequenceP4 = a0VarV.p(i.j.f42763p3);
        if (!TextUtils.isEmpty(charSequenceP4)) {
            setLogoDescription(charSequenceP4);
        }
        int i12 = i.j.f42596G3;
        if (a0VarV.s(i12)) {
            setTitleTextColor(a0VarV.c(i12));
        }
        int i13 = i.j.f42803x3;
        if (a0VarV.s(i13)) {
            setSubtitleTextColor(a0VarV.c(i13));
        }
        int i14 = i.j.f42773r3;
        if (a0VarV.s(i14)) {
            y(a0VarV.n(i14, 0));
        }
        a0VarV.x();
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.f21511I;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            this.f21511I.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.f21511I;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f21509G);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!A(this.f21508F)) {
                c(this.f21508F, true);
            }
        } else {
            ImageView imageView = this.f21508F;
            if (imageView != null && A(imageView)) {
                removeView(this.f21508F);
                this.f21534i0.remove(this.f21508F);
            }
        }
        ImageView imageView2 = this.f21508F;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageView imageView = this.f21508F;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        ImageButton imageButton = this.f21507E;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            f0.a(this.f21507E, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            l();
            if (!A(this.f21507E)) {
                c(this.f21507E, true);
            }
        } else {
            ImageButton imageButton = this.f21507E;
            if (imageButton != null && A(imageButton)) {
                removeView(this.f21507E);
                this.f21534i0.remove(this.f21507E);
            }
        }
        ImageButton imageButton2 = this.f21507E;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f21506D;
            if (textView != null && A(textView)) {
                removeView(this.f21506D);
                this.f21534i0.remove(this.f21506D);
            }
        } else {
            if (this.f21506D == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f21506D = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f21506D.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f21516N;
                if (i10 != 0) {
                    this.f21506D.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.f21530e0;
                if (colorStateList != null) {
                    this.f21506D.setTextColor(colorStateList);
                }
            }
            if (!A(this.f21506D)) {
                c(this.f21506D, true);
            }
        }
        TextView textView2 = this.f21506D;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f21528c0 = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f21530e0 = colorStateList;
        TextView textView = this.f21506D;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f21505C;
            if (textView != null && A(textView)) {
                removeView(this.f21505C);
                this.f21534i0.remove(this.f21505C);
            }
        } else {
            if (this.f21505C == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f21505C = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f21505C.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f21515M;
                if (i10 != 0) {
                    this.f21505C.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.f21529d0;
                if (colorStateList != null) {
                    this.f21505C.setTextColor(colorStateList);
                }
            }
            if (!A(this.f21505C)) {
                c(this.f21505C, true);
            }
        }
        TextView textView2 = this.f21505C;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f21527b0 = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f21529d0 = colorStateList;
        TextView textView = this.f21505C;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public static class i extends AbstractC5121a {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* renamed from: D, reason: collision with root package name */
        int f21558D;

        /* renamed from: E, reason: collision with root package name */
        boolean f21559E;

        class a implements Parcelable.ClassLoaderCreator<i> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel) {
                return new i(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new i(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public i[] newArray(int i10) {
                return new i[i10];
            }
        }

        public i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f21558D = parcel.readInt();
            this.f21559E = parcel.readInt() != 0;
        }

        @Override // y1.AbstractC5121a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f21558D);
            parcel.writeInt(this.f21559E ? 1 : 0);
        }

        public i(Parcelable parcelable) {
            super(parcelable);
        }
    }

    private class f implements androidx.appcompat.view.menu.j {

        /* renamed from: B, reason: collision with root package name */
        androidx.appcompat.view.menu.e f21554B;

        /* renamed from: C, reason: collision with root package name */
        androidx.appcompat.view.menu.g f21555C;

        f() {
        }

        @Override // androidx.appcompat.view.menu.j
        public int c() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.j
        public void e(boolean z10) {
            if (this.f21555C != null) {
                androidx.appcompat.view.menu.e eVar = this.f21554B;
                if (eVar != null) {
                    int size = eVar.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (this.f21554B.getItem(i10) == this.f21555C) {
                            return;
                        }
                    }
                }
                g(this.f21554B, this.f21555C);
            }
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean f() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean g(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            KeyEvent.Callback callback = Toolbar.this.f21512J;
            if (callback instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) callback).f();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f21512J);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f21511I);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f21512J = null;
            toolbar3.a();
            this.f21555C = null;
            Toolbar.this.requestLayout();
            gVar.r(false);
            Toolbar.this.U();
            return true;
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean h(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            Toolbar.this.g();
            ViewParent parent = Toolbar.this.f21511I.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f21511I);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f21511I);
            }
            Toolbar.this.f21512J = gVar.getActionView();
            this.f21555C = gVar;
            ViewParent parent2 = Toolbar.this.f21512J.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f21512J);
                }
                g gVarGenerateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                gVarGenerateDefaultLayoutParams.f20638a = (toolbar4.f21517O & 112) | 8388611;
                gVarGenerateDefaultLayoutParams.f21557b = 2;
                toolbar4.f21512J.setLayoutParams(gVarGenerateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f21512J);
            }
            Toolbar.this.K();
            Toolbar.this.requestLayout();
            gVar.r(true);
            KeyEvent.Callback callback = Toolbar.this.f21512J;
            if (callback instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) callback).c();
            }
            Toolbar.this.U();
            return true;
        }

        @Override // androidx.appcompat.view.menu.j
        public void j(Context context, androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.g gVar;
            androidx.appcompat.view.menu.e eVar2 = this.f21554B;
            if (eVar2 != null && (gVar = this.f21555C) != null) {
                eVar2.f(gVar);
            }
            this.f21554B = eVar;
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean m(androidx.appcompat.view.menu.m mVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public Parcelable n() {
            return null;
        }

        @Override // androidx.appcompat.view.menu.j
        public void k(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.j
        public void d(androidx.appcompat.view.menu.e eVar, boolean z10) {
        }
    }
}
