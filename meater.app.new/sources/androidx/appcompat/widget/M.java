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
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: ListPopupWindow.java */
/* loaded from: classes.dex */
public class M implements n.e {

    /* renamed from: h0, reason: collision with root package name */
    private static Method f21296h0;

    /* renamed from: i0, reason: collision with root package name */
    private static Method f21297i0;

    /* renamed from: B, reason: collision with root package name */
    private Context f21298B;

    /* renamed from: C, reason: collision with root package name */
    private ListAdapter f21299C;

    /* renamed from: D, reason: collision with root package name */
    J f21300D;

    /* renamed from: E, reason: collision with root package name */
    private int f21301E;

    /* renamed from: F, reason: collision with root package name */
    private int f21302F;

    /* renamed from: G, reason: collision with root package name */
    private int f21303G;

    /* renamed from: H, reason: collision with root package name */
    private int f21304H;

    /* renamed from: I, reason: collision with root package name */
    private int f21305I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f21306J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f21307K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f21308L;

    /* renamed from: M, reason: collision with root package name */
    private int f21309M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f21310N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f21311O;

    /* renamed from: P, reason: collision with root package name */
    int f21312P;

    /* renamed from: Q, reason: collision with root package name */
    private View f21313Q;

    /* renamed from: R, reason: collision with root package name */
    private int f21314R;

    /* renamed from: S, reason: collision with root package name */
    private DataSetObserver f21315S;

    /* renamed from: T, reason: collision with root package name */
    private View f21316T;

    /* renamed from: U, reason: collision with root package name */
    private Drawable f21317U;

    /* renamed from: V, reason: collision with root package name */
    private AdapterView.OnItemClickListener f21318V;

    /* renamed from: W, reason: collision with root package name */
    private AdapterView.OnItemSelectedListener f21319W;

    /* renamed from: X, reason: collision with root package name */
    final i f21320X;

    /* renamed from: Y, reason: collision with root package name */
    private final h f21321Y;

    /* renamed from: Z, reason: collision with root package name */
    private final g f21322Z;

    /* renamed from: a0, reason: collision with root package name */
    private final e f21323a0;

    /* renamed from: b0, reason: collision with root package name */
    private Runnable f21324b0;

    /* renamed from: c0, reason: collision with root package name */
    final Handler f21325c0;

    /* renamed from: d0, reason: collision with root package name */
    private final Rect f21326d0;

    /* renamed from: e0, reason: collision with root package name */
    private Rect f21327e0;

    /* renamed from: f0, reason: collision with root package name */
    private boolean f21328f0;

    /* renamed from: g0, reason: collision with root package name */
    PopupWindow f21329g0;

    /* compiled from: ListPopupWindow.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            View viewT = M.this.t();
            if (viewT == null || viewT.getWindowToken() == null) {
                return;
            }
            M.this.b();
        }
    }

    /* compiled from: ListPopupWindow.java */
    static class c {
        static int a(PopupWindow popupWindow, View view, int i10, boolean z10) {
            return popupWindow.getMaxAvailableHeight(view, i10, z10);
        }
    }

    /* compiled from: ListPopupWindow.java */
    static class d {
        static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        static void b(PopupWindow popupWindow, boolean z10) {
            popupWindow.setIsClippedToScreen(z10);
        }
    }

    /* compiled from: ListPopupWindow.java */
    private class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            M.this.r();
        }
    }

    /* compiled from: ListPopupWindow.java */
    private class f extends DataSetObserver {
        f() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (M.this.a()) {
                M.this.b();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            M.this.dismiss();
        }
    }

    /* compiled from: ListPopupWindow.java */
    private class h implements View.OnTouchListener {
        h() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = M.this.f21329g0) != null && popupWindow.isShowing() && x10 >= 0 && x10 < M.this.f21329g0.getWidth() && y10 >= 0 && y10 < M.this.f21329g0.getHeight()) {
                M m10 = M.this;
                m10.f21325c0.postDelayed(m10.f21320X, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            M m11 = M.this;
            m11.f21325c0.removeCallbacks(m11.f21320X);
            return false;
        }
    }

    /* compiled from: ListPopupWindow.java */
    private class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            J j10 = M.this.f21300D;
            if (j10 == null || !j10.isAttachedToWindow() || M.this.f21300D.getCount() <= M.this.f21300D.getChildCount()) {
                return;
            }
            int childCount = M.this.f21300D.getChildCount();
            M m10 = M.this;
            if (childCount <= m10.f21312P) {
                m10.f21329g0.setInputMethodMode(2);
                M.this.b();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f21296h0 = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f21297i0 = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public M(Context context) {
        this(context, null, i.a.f42383F);
    }

    private void C() {
        View view = this.f21313Q;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f21313Q);
            }
        }
    }

    private void O(boolean z10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT > 28) {
            d.b(this.f21329g0, z10);
            return;
        }
        Method method = f21296h0;
        if (method != null) {
            try {
                method.invoke(this.f21329g0, Boolean.valueOf(z10));
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    private int q() {
        int measuredHeight;
        int i10;
        int iMakeMeasureSpec;
        int i11;
        if (this.f21300D == null) {
            Context context = this.f21298B;
            this.f21324b0 = new a();
            J jS = s(context, !this.f21328f0);
            this.f21300D = jS;
            Drawable drawable = this.f21317U;
            if (drawable != null) {
                jS.setSelector(drawable);
            }
            this.f21300D.setAdapter(this.f21299C);
            this.f21300D.setOnItemClickListener(this.f21318V);
            this.f21300D.setFocusable(true);
            this.f21300D.setFocusableInTouchMode(true);
            this.f21300D.setOnItemSelectedListener(new b());
            this.f21300D.setOnScrollListener(this.f21322Z);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f21319W;
            if (onItemSelectedListener != null) {
                this.f21300D.setOnItemSelectedListener(onItemSelectedListener);
            }
            View view = this.f21300D;
            View view2 = this.f21313Q;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i12 = this.f21314R;
                if (i12 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(view, layoutParams);
                } else if (i12 != 1) {
                    Log.e("ListPopupWindow", "Invalid hint position " + this.f21314R);
                } else {
                    linearLayout.addView(view, layoutParams);
                    linearLayout.addView(view2);
                }
                int i13 = this.f21302F;
                if (i13 >= 0) {
                    i11 = Integer.MIN_VALUE;
                } else {
                    i13 = 0;
                    i11 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i13, i11), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                measuredHeight = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                measuredHeight = 0;
            }
            this.f21329g0.setContentView(view);
        } else {
            View view3 = this.f21313Q;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                measuredHeight = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                measuredHeight = 0;
            }
        }
        Drawable background = this.f21329g0.getBackground();
        if (background != null) {
            background.getPadding(this.f21326d0);
            Rect rect = this.f21326d0;
            int i14 = rect.top;
            i10 = rect.bottom + i14;
            if (!this.f21306J) {
                this.f21304H = -i14;
            }
        } else {
            this.f21326d0.setEmpty();
            i10 = 0;
        }
        int iU = u(t(), this.f21304H, this.f21329g0.getInputMethodMode() == 2);
        if (this.f21310N || this.f21301E == -1) {
            return iU + i10;
        }
        int i15 = this.f21302F;
        if (i15 == -2) {
            int i16 = this.f21298B.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.f21326d0;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16 - (rect2.left + rect2.right), Integer.MIN_VALUE);
        } else if (i15 != -1) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
        } else {
            int i17 = this.f21298B.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.f21326d0;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i17 - (rect3.left + rect3.right), 1073741824);
        }
        int iD = this.f21300D.d(iMakeMeasureSpec, 0, -1, iU - measuredHeight, -1);
        if (iD > 0) {
            measuredHeight += i10 + this.f21300D.getPaddingTop() + this.f21300D.getPaddingBottom();
        }
        return iD + measuredHeight;
    }

    private int u(View view, int i10, boolean z10) {
        return c.a(this.f21329g0, view, i10, z10);
    }

    public boolean A() {
        return this.f21329g0.getInputMethodMode() == 2;
    }

    public boolean B() {
        return this.f21328f0;
    }

    public void D(View view) {
        this.f21316T = view;
    }

    public void E(int i10) {
        this.f21329g0.setAnimationStyle(i10);
    }

    public void F(int i10) {
        Drawable background = this.f21329g0.getBackground();
        if (background == null) {
            R(i10);
            return;
        }
        background.getPadding(this.f21326d0);
        Rect rect = this.f21326d0;
        this.f21302F = rect.left + rect.right + i10;
    }

    public void G(int i10) {
        this.f21309M = i10;
    }

    public void H(Rect rect) {
        this.f21327e0 = rect != null ? new Rect(rect) : null;
    }

    public void I(int i10) {
        this.f21329g0.setInputMethodMode(i10);
    }

    public void J(boolean z10) {
        this.f21328f0 = z10;
        this.f21329g0.setFocusable(z10);
    }

    public void K(PopupWindow.OnDismissListener onDismissListener) {
        this.f21329g0.setOnDismissListener(onDismissListener);
    }

    public void L(AdapterView.OnItemClickListener onItemClickListener) {
        this.f21318V = onItemClickListener;
    }

    public void M(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f21319W = onItemSelectedListener;
    }

    public void N(boolean z10) {
        this.f21308L = true;
        this.f21307K = z10;
    }

    public void P(int i10) {
        this.f21314R = i10;
    }

    public void Q(int i10) {
        J j10 = this.f21300D;
        if (!a() || j10 == null) {
            return;
        }
        j10.setListSelectionHidden(false);
        j10.setSelection(i10);
        if (j10.getChoiceMode() != 0) {
            j10.setItemChecked(i10, true);
        }
    }

    public void R(int i10) {
        this.f21302F = i10;
    }

    @Override // n.e
    public boolean a() {
        return this.f21329g0.isShowing();
    }

    @Override // n.e
    public void b() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int iQ = q();
        boolean zA = A();
        androidx.core.widget.i.b(this.f21329g0, this.f21305I);
        if (this.f21329g0.isShowing()) {
            if (t().isAttachedToWindow()) {
                int width = this.f21302F;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = t().getWidth();
                }
                int i10 = this.f21301E;
                if (i10 == -1) {
                    if (!zA) {
                        iQ = -1;
                    }
                    if (zA) {
                        this.f21329g0.setWidth(this.f21302F == -1 ? -1 : 0);
                        this.f21329g0.setHeight(0);
                    } else {
                        this.f21329g0.setWidth(this.f21302F == -1 ? -1 : 0);
                        this.f21329g0.setHeight(-1);
                    }
                } else if (i10 != -2) {
                    iQ = i10;
                }
                this.f21329g0.setOutsideTouchable((this.f21311O || this.f21310N) ? false : true);
                this.f21329g0.update(t(), this.f21303G, this.f21304H, width < 0 ? -1 : width, iQ < 0 ? -1 : iQ);
                return;
            }
            return;
        }
        int width2 = this.f21302F;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = t().getWidth();
        }
        int i11 = this.f21301E;
        if (i11 == -1) {
            iQ = -1;
        } else if (i11 != -2) {
            iQ = i11;
        }
        this.f21329g0.setWidth(width2);
        this.f21329g0.setHeight(iQ);
        O(true);
        this.f21329g0.setOutsideTouchable((this.f21311O || this.f21310N) ? false : true);
        this.f21329g0.setTouchInterceptor(this.f21321Y);
        if (this.f21308L) {
            androidx.core.widget.i.a(this.f21329g0, this.f21307K);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f21297i0;
            if (method != null) {
                try {
                    method.invoke(this.f21329g0, this.f21327e0);
                } catch (Exception e10) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e10);
                }
            }
        } else {
            d.a(this.f21329g0, this.f21327e0);
        }
        androidx.core.widget.i.c(this.f21329g0, t(), this.f21303G, this.f21304H, this.f21309M);
        this.f21300D.setSelection(-1);
        if (!this.f21328f0 || this.f21300D.isInTouchMode()) {
            r();
        }
        if (this.f21328f0) {
            return;
        }
        this.f21325c0.post(this.f21323a0);
    }

    public void c(Drawable drawable) {
        this.f21329g0.setBackgroundDrawable(drawable);
    }

    public int d() {
        return this.f21303G;
    }

    @Override // n.e
    public void dismiss() {
        this.f21329g0.dismiss();
        C();
        this.f21329g0.setContentView(null);
        this.f21300D = null;
        this.f21325c0.removeCallbacks(this.f21320X);
    }

    public void f(int i10) {
        this.f21303G = i10;
    }

    public Drawable i() {
        return this.f21329g0.getBackground();
    }

    public void k(int i10) {
        this.f21304H = i10;
        this.f21306J = true;
    }

    @Override // n.e
    public ListView l() {
        return this.f21300D;
    }

    public int o() {
        if (this.f21306J) {
            return this.f21304H;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f21315S;
        if (dataSetObserver == null) {
            this.f21315S = new f();
        } else {
            ListAdapter listAdapter2 = this.f21299C;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f21299C = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f21315S);
        }
        J j10 = this.f21300D;
        if (j10 != null) {
            j10.setAdapter(this.f21299C);
        }
    }

    public void r() {
        J j10 = this.f21300D;
        if (j10 != null) {
            j10.setListSelectionHidden(true);
            j10.requestLayout();
        }
    }

    J s(Context context, boolean z10) {
        return new J(context, z10);
    }

    public View t() {
        return this.f21316T;
    }

    public Object v() {
        if (a()) {
            return this.f21300D.getSelectedItem();
        }
        return null;
    }

    public long w() {
        if (a()) {
            return this.f21300D.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    public int x() {
        if (a()) {
            return this.f21300D.getSelectedItemPosition();
        }
        return -1;
    }

    public View y() {
        if (a()) {
            return this.f21300D.getSelectedView();
        }
        return null;
    }

    public int z() {
        return this.f21302F;
    }

    public M(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public M(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f21301E = -2;
        this.f21302F = -2;
        this.f21305I = 1002;
        this.f21309M = 0;
        this.f21310N = false;
        this.f21311O = false;
        this.f21312P = Integer.MAX_VALUE;
        this.f21314R = 0;
        this.f21320X = new i();
        this.f21321Y = new h();
        this.f21322Z = new g();
        this.f21323a0 = new e();
        this.f21326d0 = new Rect();
        this.f21298B = context;
        this.f21325c0 = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.j.f42741l1, i10, i11);
        this.f21303G = typedArrayObtainStyledAttributes.getDimensionPixelOffset(i.j.f42746m1, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(i.j.f42751n1, 0);
        this.f21304H = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f21306J = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C1994p c1994p = new C1994p(context, attributeSet, i10, i11);
        this.f21329g0 = c1994p;
        c1994p.setInputMethodMode(1);
    }

    /* compiled from: ListPopupWindow.java */
    class b implements AdapterView.OnItemSelectedListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            J j11;
            if (i10 == -1 || (j11 = M.this.f21300D) == null) {
                return;
            }
            j11.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* compiled from: ListPopupWindow.java */
    private class g implements AbsListView.OnScrollListener {
        g() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (i10 != 1 || M.this.A() || M.this.f21329g0.getContentView() == null) {
                return;
            }
            M m10 = M.this;
            m10.f21325c0.removeCallbacks(m10.f21320X);
            M.this.f21320X.run();
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        }
    }
}
