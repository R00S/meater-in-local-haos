package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.InterfaceC0096p;
import androidx.core.view.C0311u;
import androidx.core.widget.C0329j;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p024c.p025a.C0823a;
import p024c.p025a.C0832j;

/* compiled from: ListPopupWindow.java */
/* renamed from: androidx.appcompat.widget.d0 */
/* loaded from: classes.dex */
public class C0159d0 implements InterfaceC0096p {

    /* renamed from: f */
    private static Method f1070f;

    /* renamed from: g */
    private static Method f1071g;

    /* renamed from: h */
    private static Method f1072h;

    /* renamed from: A */
    private View f1073A;

    /* renamed from: B */
    private Drawable f1074B;

    /* renamed from: C */
    private AdapterView.OnItemClickListener f1075C;

    /* renamed from: D */
    private AdapterView.OnItemSelectedListener f1076D;

    /* renamed from: E */
    final g f1077E;

    /* renamed from: F */
    private final f f1078F;

    /* renamed from: G */
    private final e f1079G;

    /* renamed from: H */
    private final c f1080H;

    /* renamed from: I */
    private Runnable f1081I;

    /* renamed from: J */
    final Handler f1082J;

    /* renamed from: K */
    private final Rect f1083K;

    /* renamed from: L */
    private Rect f1084L;

    /* renamed from: M */
    private boolean f1085M;

    /* renamed from: N */
    PopupWindow f1086N;

    /* renamed from: i */
    private Context f1087i;

    /* renamed from: j */
    private ListAdapter f1088j;

    /* renamed from: k */
    C0201z f1089k;

    /* renamed from: l */
    private int f1090l;

    /* renamed from: m */
    private int f1091m;

    /* renamed from: n */
    private int f1092n;

    /* renamed from: o */
    private int f1093o;

    /* renamed from: p */
    private int f1094p;

    /* renamed from: q */
    private boolean f1095q;

    /* renamed from: r */
    private boolean f1096r;

    /* renamed from: s */
    private boolean f1097s;

    /* renamed from: t */
    private int f1098t;

    /* renamed from: u */
    private boolean f1099u;

    /* renamed from: v */
    private boolean f1100v;

    /* renamed from: w */
    int f1101w;

    /* renamed from: x */
    private View f1102x;

    /* renamed from: y */
    private int f1103y;

    /* renamed from: z */
    private DataSetObserver f1104z;

    /* compiled from: ListPopupWindow.java */
    /* renamed from: androidx.appcompat.widget.d0$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View viewM953s = C0159d0.this.m953s();
            if (viewM953s == null || viewM953s.getWindowToken() == null) {
                return;
            }
            C0159d0.this.show();
        }
    }

    /* compiled from: ListPopupWindow.java */
    /* renamed from: androidx.appcompat.widget.d0$b */
    class b implements AdapterView.OnItemSelectedListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
            C0201z c0201z;
            if (i2 == -1 || (c0201z = C0159d0.this.f1089k) == null) {
                return;
            }
            c0201z.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* compiled from: ListPopupWindow.java */
    /* renamed from: androidx.appcompat.widget.d0$c */
    private class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0159d0.this.m951q();
        }
    }

    /* compiled from: ListPopupWindow.java */
    /* renamed from: androidx.appcompat.widget.d0$d */
    private class d extends DataSetObserver {
        d() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (C0159d0.this.mo519a()) {
                C0159d0.this.show();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            C0159d0.this.dismiss();
        }
    }

    /* compiled from: ListPopupWindow.java */
    /* renamed from: androidx.appcompat.widget.d0$e */
    private class e implements AbsListView.OnScrollListener {
        e() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i2) {
            if (i2 != 1 || C0159d0.this.m959z() || C0159d0.this.f1086N.getContentView() == null) {
                return;
            }
            C0159d0 c0159d0 = C0159d0.this;
            c0159d0.f1082J.removeCallbacks(c0159d0.f1077E);
            C0159d0.this.f1077E.run();
        }
    }

    /* compiled from: ListPopupWindow.java */
    /* renamed from: androidx.appcompat.widget.d0$f */
    private class f implements View.OnTouchListener {
        f() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = C0159d0.this.f1086N) != null && popupWindow.isShowing() && x >= 0 && x < C0159d0.this.f1086N.getWidth() && y >= 0 && y < C0159d0.this.f1086N.getHeight()) {
                C0159d0 c0159d0 = C0159d0.this;
                c0159d0.f1082J.postDelayed(c0159d0.f1077E, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            C0159d0 c0159d02 = C0159d0.this;
            c0159d02.f1082J.removeCallbacks(c0159d02.f1077E);
            return false;
        }
    }

    /* compiled from: ListPopupWindow.java */
    /* renamed from: androidx.appcompat.widget.d0$g */
    private class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0201z c0201z = C0159d0.this.f1089k;
            if (c0201z == null || !C0311u.m2101N(c0201z) || C0159d0.this.f1089k.getCount() <= C0159d0.this.f1089k.getChildCount()) {
                return;
            }
            int childCount = C0159d0.this.f1089k.getChildCount();
            C0159d0 c0159d0 = C0159d0.this;
            if (childCount <= c0159d0.f1101w) {
                c0159d0.f1086N.setInputMethodMode(2);
                C0159d0.this.show();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f1070f = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f1072h = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f1071g = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public C0159d0(Context context) {
        this(context, null, C0823a.f5016E);
    }

    /* renamed from: B */
    private void m927B() {
        View view = this.f1102x;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f1102x);
            }
        }
    }

    /* renamed from: M */
    private void m928M(boolean z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT > 28) {
            this.f1086N.setIsClippedToScreen(z);
            return;
        }
        Method method = f1070f;
        if (method != null) {
            try {
                method.invoke(this.f1086N, Boolean.valueOf(z));
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    /* renamed from: p */
    private int m929p() {
        int measuredHeight;
        int i2;
        int iMakeMeasureSpec;
        int i3;
        if (this.f1089k == null) {
            Context context = this.f1087i;
            this.f1081I = new a();
            C0201z c0201zMo952r = mo952r(context, !this.f1085M);
            this.f1089k = c0201zMo952r;
            Drawable drawable = this.f1074B;
            if (drawable != null) {
                c0201zMo952r.setSelector(drawable);
            }
            this.f1089k.setAdapter(this.f1088j);
            this.f1089k.setOnItemClickListener(this.f1075C);
            this.f1089k.setFocusable(true);
            this.f1089k.setFocusableInTouchMode(true);
            this.f1089k.setOnItemSelectedListener(new b());
            this.f1089k.setOnScrollListener(this.f1079G);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f1076D;
            if (onItemSelectedListener != null) {
                this.f1089k.setOnItemSelectedListener(onItemSelectedListener);
            }
            View view = this.f1089k;
            View view2 = this.f1102x;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i4 = this.f1103y;
                if (i4 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(view, layoutParams);
                } else if (i4 != 1) {
                    Log.e("ListPopupWindow", "Invalid hint position " + this.f1103y);
                } else {
                    linearLayout.addView(view, layoutParams);
                    linearLayout.addView(view2);
                }
                int i5 = this.f1091m;
                if (i5 >= 0) {
                    i3 = Integer.MIN_VALUE;
                } else {
                    i5 = 0;
                    i3 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i5, i3), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                measuredHeight = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                measuredHeight = 0;
            }
            this.f1086N.setContentView(view);
        } else {
            View view3 = this.f1102x;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                measuredHeight = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                measuredHeight = 0;
            }
        }
        Drawable background = this.f1086N.getBackground();
        if (background != null) {
            background.getPadding(this.f1083K);
            Rect rect = this.f1083K;
            int i6 = rect.top;
            i2 = rect.bottom + i6;
            if (!this.f1095q) {
                this.f1093o = -i6;
            }
        } else {
            this.f1083K.setEmpty();
            i2 = 0;
        }
        int iM930t = m930t(m953s(), this.f1093o, this.f1086N.getInputMethodMode() == 2);
        if (this.f1099u || this.f1090l == -1) {
            return iM930t + i2;
        }
        int i7 = this.f1091m;
        if (i7 == -2) {
            int i8 = this.f1087i.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.f1083K;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8 - (rect2.left + rect2.right), Integer.MIN_VALUE);
        } else if (i7 != -1) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
        } else {
            int i9 = this.f1087i.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.f1083K;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9 - (rect3.left + rect3.right), 1073741824);
        }
        int iMo964d = this.f1089k.mo964d(iMakeMeasureSpec, 0, -1, iM930t - measuredHeight, -1);
        if (iMo964d > 0) {
            measuredHeight += i2 + this.f1089k.getPaddingTop() + this.f1089k.getPaddingBottom();
        }
        return iMo964d + measuredHeight;
    }

    /* renamed from: t */
    private int m930t(View view, int i2, boolean z) {
        if (Build.VERSION.SDK_INT > 23) {
            return this.f1086N.getMaxAvailableHeight(view, i2, z);
        }
        Method method = f1071g;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.f1086N, view, Integer.valueOf(i2), Boolean.valueOf(z))).intValue();
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.f1086N.getMaxAvailableHeight(view, i2);
    }

    /* renamed from: A */
    public boolean m931A() {
        return this.f1085M;
    }

    /* renamed from: C */
    public void m932C(View view) {
        this.f1073A = view;
    }

    /* renamed from: D */
    public void m933D(int i2) {
        this.f1086N.setAnimationStyle(i2);
    }

    /* renamed from: E */
    public void m934E(int i2) {
        Drawable background = this.f1086N.getBackground();
        if (background == null) {
            m944P(i2);
            return;
        }
        background.getPadding(this.f1083K);
        Rect rect = this.f1083K;
        this.f1091m = rect.left + rect.right + i2;
    }

    /* renamed from: F */
    public void m935F(int i2) {
        this.f1098t = i2;
    }

    /* renamed from: G */
    public void m936G(Rect rect) {
        this.f1084L = rect != null ? new Rect(rect) : null;
    }

    /* renamed from: H */
    public void m937H(int i2) {
        this.f1086N.setInputMethodMode(i2);
    }

    /* renamed from: I */
    public void m938I(boolean z) {
        this.f1085M = z;
        this.f1086N.setFocusable(z);
    }

    /* renamed from: J */
    public void m939J(PopupWindow.OnDismissListener onDismissListener) {
        this.f1086N.setOnDismissListener(onDismissListener);
    }

    /* renamed from: K */
    public void m940K(AdapterView.OnItemClickListener onItemClickListener) {
        this.f1075C = onItemClickListener;
    }

    /* renamed from: L */
    public void m941L(boolean z) {
        this.f1097s = true;
        this.f1096r = z;
    }

    /* renamed from: N */
    public void m942N(int i2) {
        this.f1103y = i2;
    }

    /* renamed from: O */
    public void m943O(int i2) {
        C0201z c0201z = this.f1089k;
        if (!mo519a() || c0201z == null) {
            return;
        }
        c0201z.setListSelectionHidden(false);
        c0201z.setSelection(i2);
        if (c0201z.getChoiceMode() != 0) {
            c0201z.setItemChecked(i2, true);
        }
    }

    /* renamed from: P */
    public void m944P(int i2) {
        this.f1091m = i2;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0096p
    /* renamed from: a */
    public boolean mo519a() {
        return this.f1086N.isShowing();
    }

    /* renamed from: b */
    public void m945b(Drawable drawable) {
        this.f1086N.setBackgroundDrawable(drawable);
    }

    /* renamed from: c */
    public int m946c() {
        return this.f1092n;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0096p
    public void dismiss() {
        this.f1086N.dismiss();
        m927B();
        this.f1086N.setContentView(null);
        this.f1089k = null;
        this.f1082J.removeCallbacks(this.f1077E);
    }

    /* renamed from: e */
    public void m947e(int i2) {
        this.f1092n = i2;
    }

    /* renamed from: h */
    public Drawable m948h() {
        return this.f1086N.getBackground();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0096p
    /* renamed from: j */
    public ListView mo522j() {
        return this.f1089k;
    }

    /* renamed from: k */
    public void m949k(int i2) {
        this.f1093o = i2;
        this.f1095q = true;
    }

    /* renamed from: n */
    public int m950n() {
        if (this.f1095q) {
            return this.f1093o;
        }
        return 0;
    }

    /* renamed from: o */
    public void mo764o(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f1104z;
        if (dataSetObserver == null) {
            this.f1104z = new d();
        } else {
            ListAdapter listAdapter2 = this.f1088j;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1088j = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f1104z);
        }
        C0201z c0201z = this.f1089k;
        if (c0201z != null) {
            c0201z.setAdapter(this.f1088j);
        }
    }

    /* renamed from: q */
    public void m951q() {
        C0201z c0201z = this.f1089k;
        if (c0201z != null) {
            c0201z.setListSelectionHidden(true);
            c0201z.requestLayout();
        }
    }

    /* renamed from: r */
    C0201z mo952r(Context context, boolean z) {
        return new C0201z(context, z);
    }

    /* renamed from: s */
    public View m953s() {
        return this.f1073A;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0096p
    public void show() {
        int iM929p = m929p();
        boolean zM959z = m959z();
        C0329j.m2318b(this.f1086N, this.f1094p);
        if (this.f1086N.isShowing()) {
            if (C0311u.m2101N(m953s())) {
                int width = this.f1091m;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = m953s().getWidth();
                }
                int i2 = this.f1090l;
                if (i2 == -1) {
                    if (!zM959z) {
                        iM929p = -1;
                    }
                    if (zM959z) {
                        this.f1086N.setWidth(this.f1091m == -1 ? -1 : 0);
                        this.f1086N.setHeight(0);
                    } else {
                        this.f1086N.setWidth(this.f1091m == -1 ? -1 : 0);
                        this.f1086N.setHeight(-1);
                    }
                } else if (i2 != -2) {
                    iM929p = i2;
                }
                this.f1086N.setOutsideTouchable((this.f1100v || this.f1099u) ? false : true);
                this.f1086N.update(m953s(), this.f1092n, this.f1093o, width < 0 ? -1 : width, iM929p < 0 ? -1 : iM929p);
                return;
            }
            return;
        }
        int width2 = this.f1091m;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = m953s().getWidth();
        }
        int i3 = this.f1090l;
        if (i3 == -1) {
            iM929p = -1;
        } else if (i3 != -2) {
            iM929p = i3;
        }
        this.f1086N.setWidth(width2);
        this.f1086N.setHeight(iM929p);
        m928M(true);
        this.f1086N.setOutsideTouchable((this.f1100v || this.f1099u) ? false : true);
        this.f1086N.setTouchInterceptor(this.f1078F);
        if (this.f1097s) {
            C0329j.m2317a(this.f1086N, this.f1096r);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f1072h;
            if (method != null) {
                try {
                    method.invoke(this.f1086N, this.f1084L);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            this.f1086N.setEpicenterBounds(this.f1084L);
        }
        C0329j.m2319c(this.f1086N, m953s(), this.f1092n, this.f1093o, this.f1098t);
        this.f1089k.setSelection(-1);
        if (!this.f1085M || this.f1089k.isInTouchMode()) {
            m951q();
        }
        if (this.f1085M) {
            return;
        }
        this.f1082J.post(this.f1080H);
    }

    /* renamed from: u */
    public Object m954u() {
        if (mo519a()) {
            return this.f1089k.getSelectedItem();
        }
        return null;
    }

    /* renamed from: v */
    public long m955v() {
        if (mo519a()) {
            return this.f1089k.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    /* renamed from: w */
    public int m956w() {
        if (mo519a()) {
            return this.f1089k.getSelectedItemPosition();
        }
        return -1;
    }

    /* renamed from: x */
    public View m957x() {
        if (mo519a()) {
            return this.f1089k.getSelectedView();
        }
        return null;
    }

    /* renamed from: y */
    public int m958y() {
        return this.f1091m;
    }

    /* renamed from: z */
    public boolean m959z() {
        return this.f1086N.getInputMethodMode() == 2;
    }

    public C0159d0(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public C0159d0(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.f1090l = -2;
        this.f1091m = -2;
        this.f1094p = 1002;
        this.f1098t = 0;
        this.f1099u = false;
        this.f1100v = false;
        this.f1101w = Integer.MAX_VALUE;
        this.f1103y = 0;
        this.f1077E = new g();
        this.f1078F = new f();
        this.f1079G = new e();
        this.f1080H = new c();
        this.f1083K = new Rect();
        this.f1087i = context;
        this.f1082J = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0832j.f5400o1, i2, i3);
        this.f1092n = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C0832j.f5405p1, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C0832j.f5410q1, 0);
        this.f1093o = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1095q = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C0178n c0178n = new C0178n(context, attributeSet, i2, i3);
        this.f1086N = c0178n;
        c0178n.setInputMethodMode(1);
    }
}
