package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0087g;
import androidx.appcompat.view.menu.C0089i;
import androidx.appcompat.view.menu.InterfaceC0093m;
import androidx.appcompat.view.menu.InterfaceC0094n;
import androidx.appcompat.widget.C0157c0;

/* loaded from: classes.dex */
public class ActionMenuView extends C0157c0 implements C0087g.b, InterfaceC0094n {

    /* renamed from: A */
    C0087g.a f779A;

    /* renamed from: B */
    private boolean f780B;

    /* renamed from: C */
    private int f781C;

    /* renamed from: D */
    private int f782D;

    /* renamed from: E */
    private int f783E;

    /* renamed from: F */
    InterfaceC0117e f784F;

    /* renamed from: u */
    private C0087g f785u;

    /* renamed from: v */
    private Context f786v;

    /* renamed from: w */
    private int f787w;

    /* renamed from: x */
    private boolean f788x;

    /* renamed from: y */
    private ActionMenuPresenter f789y;

    /* renamed from: z */
    private InterfaceC0093m.a f790z;

    /* renamed from: androidx.appcompat.widget.ActionMenuView$a */
    public interface InterfaceC0113a {
        /* renamed from: a */
        boolean mo469a();

        /* renamed from: b */
        boolean mo470b();
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$b */
    private static class C0114b implements InterfaceC0093m.a {
        C0114b() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0093m.a
        /* renamed from: b */
        public void mo366b(C0087g c0087g, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0093m.a
        /* renamed from: c */
        public boolean mo367c(C0087g c0087g) {
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$c */
    public static class C0115c extends C0157c0.a {

        /* renamed from: c */
        @ViewDebug.ExportedProperty
        public boolean f791c;

        /* renamed from: d */
        @ViewDebug.ExportedProperty
        public int f792d;

        /* renamed from: e */
        @ViewDebug.ExportedProperty
        public int f793e;

        /* renamed from: f */
        @ViewDebug.ExportedProperty
        public boolean f794f;

        /* renamed from: g */
        @ViewDebug.ExportedProperty
        public boolean f795g;

        /* renamed from: h */
        boolean f796h;

        public C0115c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0115c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0115c(C0115c c0115c) {
            super(c0115c);
            this.f791c = c0115c.f791c;
        }

        public C0115c(int i2, int i3) {
            super(i2, i3);
            this.f791c = false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$d */
    private class C0116d implements C0087g.a {
        C0116d() {
        }

        @Override // androidx.appcompat.view.menu.C0087g.a
        /* renamed from: a */
        public boolean mo347a(C0087g c0087g, MenuItem menuItem) {
            InterfaceC0117e interfaceC0117e = ActionMenuView.this.f784F;
            return interfaceC0117e != null && interfaceC0117e.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.C0087g.a
        /* renamed from: b */
        public void mo349b(C0087g c0087g) {
            C0087g.a aVar = ActionMenuView.this.f779A;
            if (aVar != null) {
                aVar.mo349b(c0087g);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$e */
    public interface InterfaceC0117e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    /* renamed from: L */
    static int m727L(View view, int i2, int i3, int i4, int i5) {
        C0115c c0115c = (C0115c) view.getLayoutParams();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i4) - i5, View.MeasureSpec.getMode(i4));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = actionMenuItemView != null && actionMenuItemView.m473f();
        int i6 = 2;
        if (i3 <= 0 || (z && i3 < 2)) {
            i6 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i3 * i2, Integer.MIN_VALUE), iMakeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i7 = measuredWidth / i2;
            if (measuredWidth % i2 != 0) {
                i7++;
            }
            if (!z || i7 >= 2) {
                i6 = i7;
            }
        }
        c0115c.f794f = !c0115c.f791c && z;
        c0115c.f792d = i6;
        view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i6, 1073741824), iMakeMeasureSpec);
        return i6;
    }

    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [boolean, int] */
    /* renamed from: M */
    private void m728M(int i2, int i3) {
        int i4;
        int i5;
        boolean z;
        int i6;
        boolean z2;
        boolean z3;
        int i7;
        ?? r14;
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, paddingTop, -2);
        int i8 = size - paddingLeft;
        int i9 = this.f782D;
        int i10 = i8 / i9;
        int i11 = i8 % i9;
        if (i10 == 0) {
            setMeasuredDimension(i8, 0);
            return;
        }
        int i12 = i9 + (i11 / i10);
        int childCount = getChildCount();
        int iMax = 0;
        int i13 = 0;
        boolean z4 = false;
        int i14 = 0;
        int iMax2 = 0;
        int i15 = 0;
        long j2 = 0;
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            int i16 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z5 = childAt instanceof ActionMenuItemView;
                int i17 = i14 + 1;
                if (z5) {
                    int i18 = this.f783E;
                    i7 = i17;
                    r14 = 0;
                    childAt.setPadding(i18, 0, i18, 0);
                } else {
                    i7 = i17;
                    r14 = 0;
                }
                C0115c c0115c = (C0115c) childAt.getLayoutParams();
                c0115c.f796h = r14;
                c0115c.f793e = r14;
                c0115c.f792d = r14;
                c0115c.f794f = r14;
                ((ViewGroup.MarginLayoutParams) c0115c).leftMargin = r14;
                ((ViewGroup.MarginLayoutParams) c0115c).rightMargin = r14;
                c0115c.f795g = z5 && ((ActionMenuItemView) childAt).m473f();
                int iM727L = m727L(childAt, i12, c0115c.f791c ? 1 : i10, childMeasureSpec, paddingTop);
                iMax2 = Math.max(iMax2, iM727L);
                if (c0115c.f794f) {
                    i15++;
                }
                if (c0115c.f791c) {
                    z4 = true;
                }
                i10 -= iM727L;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (iM727L == 1) {
                    j2 |= 1 << i13;
                    iMax = iMax;
                }
                i14 = i7;
            }
            i13++;
            size2 = i16;
        }
        int i19 = size2;
        boolean z6 = z4 && i14 == 2;
        boolean z7 = false;
        while (i15 > 0 && i10 > 0) {
            int i20 = 0;
            int i21 = 0;
            int i22 = Integer.MAX_VALUE;
            long j3 = 0;
            while (i21 < childCount) {
                boolean z8 = z7;
                C0115c c0115c2 = (C0115c) getChildAt(i21).getLayoutParams();
                int i23 = iMax;
                if (c0115c2.f794f) {
                    int i24 = c0115c2.f792d;
                    if (i24 < i22) {
                        j3 = 1 << i21;
                        i22 = i24;
                        i20 = 1;
                    } else if (i24 == i22) {
                        i20++;
                        j3 |= 1 << i21;
                    }
                }
                i21++;
                iMax = i23;
                z7 = z8;
            }
            z = z7;
            i6 = iMax;
            j2 |= j3;
            if (i20 > i10) {
                i4 = mode;
                i5 = i8;
                break;
            }
            int i25 = i22 + 1;
            int i26 = 0;
            while (i26 < childCount) {
                View childAt2 = getChildAt(i26);
                C0115c c0115c3 = (C0115c) childAt2.getLayoutParams();
                int i27 = i8;
                int i28 = mode;
                long j4 = 1 << i26;
                if ((j3 & j4) == 0) {
                    if (c0115c3.f792d == i25) {
                        j2 |= j4;
                    }
                    z3 = z6;
                } else {
                    if (z6 && c0115c3.f795g && i10 == 1) {
                        int i29 = this.f783E;
                        z3 = z6;
                        childAt2.setPadding(i29 + i12, 0, i29, 0);
                    } else {
                        z3 = z6;
                    }
                    c0115c3.f792d++;
                    c0115c3.f796h = true;
                    i10--;
                }
                i26++;
                mode = i28;
                i8 = i27;
                z6 = z3;
            }
            iMax = i6;
            z7 = true;
        }
        i4 = mode;
        i5 = i8;
        z = z7;
        i6 = iMax;
        boolean z9 = !z4 && i14 == 1;
        if (i10 <= 0 || j2 == 0 || (i10 >= i14 - 1 && !z9 && iMax2 <= 1)) {
            z2 = z;
        } else {
            float fBitCount = Long.bitCount(j2);
            if (!z9) {
                if ((j2 & 1) != 0 && !((C0115c) getChildAt(0).getLayoutParams()).f795g) {
                    fBitCount -= 0.5f;
                }
                int i30 = childCount - 1;
                if ((j2 & (1 << i30)) != 0 && !((C0115c) getChildAt(i30).getLayoutParams()).f795g) {
                    fBitCount -= 0.5f;
                }
            }
            int i31 = fBitCount > 0.0f ? (int) ((i10 * i12) / fBitCount) : 0;
            z2 = z;
            for (int i32 = 0; i32 < childCount; i32++) {
                if ((j2 & (1 << i32)) != 0) {
                    View childAt3 = getChildAt(i32);
                    C0115c c0115c4 = (C0115c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c0115c4.f793e = i31;
                        c0115c4.f796h = true;
                        if (i32 == 0 && !c0115c4.f795g) {
                            ((ViewGroup.MarginLayoutParams) c0115c4).leftMargin = (-i31) / 2;
                        }
                    } else if (c0115c4.f791c) {
                        c0115c4.f793e = i31;
                        c0115c4.f796h = true;
                        ((ViewGroup.MarginLayoutParams) c0115c4).rightMargin = (-i31) / 2;
                    } else {
                        if (i32 != 0) {
                            ((ViewGroup.MarginLayoutParams) c0115c4).leftMargin = i31 / 2;
                        }
                        if (i32 != childCount - 1) {
                            ((ViewGroup.MarginLayoutParams) c0115c4).rightMargin = i31 / 2;
                        }
                    }
                    z2 = true;
                }
            }
        }
        if (z2) {
            for (int i33 = 0; i33 < childCount; i33++) {
                View childAt4 = getChildAt(i33);
                C0115c c0115c5 = (C0115c) childAt4.getLayoutParams();
                if (c0115c5.f796h) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c0115c5.f792d * i12) + c0115c5.f793e, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i5, i4 != 1073741824 ? i6 : i19);
    }

    /* renamed from: B */
    public void m729B() {
        ActionMenuPresenter actionMenuPresenter = this.f789y;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.m712A();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.C0157c0
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public C0115c generateDefaultLayoutParams() {
        C0115c c0115c = new C0115c(-2, -2);
        c0115c.f1063b = 16;
        return c0115c;
    }

    @Override // androidx.appcompat.widget.C0157c0
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public C0115c generateLayoutParams(AttributeSet attributeSet) {
        return new C0115c(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.C0157c0
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public C0115c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        C0115c c0115c = layoutParams instanceof C0115c ? new C0115c((C0115c) layoutParams) : new C0115c(layoutParams);
        if (c0115c.f1063b <= 0) {
            c0115c.f1063b = 16;
        }
        return c0115c;
    }

    /* renamed from: F */
    public C0115c m733F() {
        C0115c c0115cGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        c0115cGenerateDefaultLayoutParams.f791c = true;
        return c0115cGenerateDefaultLayoutParams;
    }

    /* renamed from: G */
    protected boolean m734G(int i2) {
        boolean zMo469a = false;
        if (i2 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i2 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i2);
        if (i2 < getChildCount() && (childAt instanceof InterfaceC0113a)) {
            zMo469a = false | ((InterfaceC0113a) childAt).mo469a();
        }
        return (i2 <= 0 || !(childAt2 instanceof InterfaceC0113a)) ? zMo469a : zMo469a | ((InterfaceC0113a) childAt2).mo470b();
    }

    /* renamed from: H */
    public boolean m735H() {
        ActionMenuPresenter actionMenuPresenter = this.f789y;
        return actionMenuPresenter != null && actionMenuPresenter.m714D();
    }

    /* renamed from: I */
    public boolean m736I() {
        ActionMenuPresenter actionMenuPresenter = this.f789y;
        return actionMenuPresenter != null && actionMenuPresenter.m716F();
    }

    /* renamed from: J */
    public boolean m737J() {
        ActionMenuPresenter actionMenuPresenter = this.f789y;
        return actionMenuPresenter != null && actionMenuPresenter.m717G();
    }

    /* renamed from: K */
    public boolean m738K() {
        return this.f788x;
    }

    /* renamed from: N */
    public C0087g m739N() {
        return this.f785u;
    }

    /* renamed from: O */
    public void m740O(InterfaceC0093m.a aVar, C0087g.a aVar2) {
        this.f790z = aVar;
        this.f779A = aVar2;
    }

    /* renamed from: P */
    public boolean m741P() {
        ActionMenuPresenter actionMenuPresenter = this.f789y;
        return actionMenuPresenter != null && actionMenuPresenter.m723M();
    }

    @Override // androidx.appcompat.view.menu.C0087g.b
    /* renamed from: a */
    public boolean mo477a(C0089i c0089i) {
        return this.f785u.m568N(c0089i, 0);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0094n
    /* renamed from: b */
    public void mo478b(C0087g c0087g) {
        this.f785u = c0087g;
    }

    @Override // androidx.appcompat.widget.C0157c0, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0115c;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f785u == null) {
            Context context = getContext();
            C0087g c0087g = new C0087g(context);
            this.f785u = c0087g;
            c0087g.mo575V(new C0116d());
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.f789y = actionMenuPresenter;
            actionMenuPresenter.m722L(true);
            ActionMenuPresenter actionMenuPresenter2 = this.f789y;
            InterfaceC0093m.a c0114b = this.f790z;
            if (c0114b == null) {
                c0114b = new C0114b();
            }
            actionMenuPresenter2.mo496g(c0114b);
            this.f785u.m583c(this.f789y, this.f786v);
            this.f789y.m720J(this);
        }
        return this.f785u;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f789y.m713C();
    }

    public int getPopupTheme() {
        return this.f787w;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.f789y;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo493c(false);
            if (this.f789y.m717G()) {
                this.f789y.m714D();
                this.f789y.m723M();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m729B();
    }

    @Override // androidx.appcompat.widget.C0157c0, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int width;
        int paddingLeft;
        if (!this.f780B) {
            super.onLayout(z, i2, i3, i4, i5);
            return;
        }
        int childCount = getChildCount();
        int i6 = (i5 - i3) / 2;
        int dividerWidth = getDividerWidth();
        int i7 = i4 - i2;
        int paddingRight = (i7 - getPaddingRight()) - getPaddingLeft();
        boolean zM1231b = C0197w0.m1231b(this);
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C0115c c0115c = (C0115c) childAt.getLayoutParams();
                if (c0115c.f791c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m734G(i10)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zM1231b) {
                        paddingLeft = getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0115c).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0115c).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i11 = i6 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i11, width, measuredHeight + i11);
                    paddingRight -= measuredWidth;
                    i8 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0115c).leftMargin) + ((ViewGroup.MarginLayoutParams) c0115c).rightMargin;
                    m734G(i10);
                    i9++;
                }
            }
        }
        if (childCount == 1 && i8 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i12 = (i7 / 2) - (measuredWidth2 / 2);
            int i13 = i6 - (measuredHeight2 / 2);
            childAt2.layout(i12, i13, measuredWidth2 + i12, measuredHeight2 + i13);
            return;
        }
        int i14 = i9 - (i8 ^ 1);
        int iMax = Math.max(0, i14 > 0 ? paddingRight / i14 : 0);
        if (zM1231b) {
            int width2 = getWidth() - getPaddingRight();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt3 = getChildAt(i15);
                C0115c c0115c2 = (C0115c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0115c2.f791c) {
                    int i16 = width2 - ((ViewGroup.MarginLayoutParams) c0115c2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i17 = i6 - (measuredHeight3 / 2);
                    childAt3.layout(i16 - measuredWidth3, i17, i16, measuredHeight3 + i17);
                    width2 = i16 - ((measuredWidth3 + ((ViewGroup.MarginLayoutParams) c0115c2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt4 = getChildAt(i18);
            C0115c c0115c3 = (C0115c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0115c3.f791c) {
                int i19 = paddingLeft2 + ((ViewGroup.MarginLayoutParams) c0115c3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i6 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft2 = i19 + measuredWidth4 + ((ViewGroup.MarginLayoutParams) c0115c3).rightMargin + iMax;
            }
        }
    }

    @Override // androidx.appcompat.widget.C0157c0, android.view.View
    protected void onMeasure(int i2, int i3) {
        C0087g c0087g;
        boolean z = this.f780B;
        boolean z2 = View.MeasureSpec.getMode(i2) == 1073741824;
        this.f780B = z2;
        if (z != z2) {
            this.f781C = 0;
        }
        int size = View.MeasureSpec.getSize(i2);
        if (this.f780B && (c0087g = this.f785u) != null && size != this.f781C) {
            this.f781C = size;
            c0087g.m567M(true);
        }
        int childCount = getChildCount();
        if (this.f780B && childCount > 0) {
            m728M(i2, i3);
            return;
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            C0115c c0115c = (C0115c) getChildAt(i4).getLayoutParams();
            ((ViewGroup.MarginLayoutParams) c0115c).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) c0115c).leftMargin = 0;
        }
        super.onMeasure(i2, i3);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f789y.m719I(z);
    }

    public void setOnMenuItemClickListener(InterfaceC0117e interfaceC0117e) {
        this.f784F = interfaceC0117e;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f789y.m721K(drawable);
    }

    public void setOverflowReserved(boolean z) {
        this.f788x = z;
    }

    public void setPopupTheme(int i2) {
        if (this.f787w != i2) {
            this.f787w = i2;
            if (i2 == 0) {
                this.f786v = getContext();
            } else {
                this.f786v = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.f789y = actionMenuPresenter;
        actionMenuPresenter.m720J(this);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f782D = (int) (56.0f * f2);
        this.f783E = (int) (f2 * 4.0f);
        this.f786v = context;
        this.f787w = 0;
    }
}
