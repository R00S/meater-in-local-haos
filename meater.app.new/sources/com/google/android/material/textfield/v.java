package com.google.android.material.textfield;

import android.R;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.C1982d;
import androidx.appcompat.widget.M;
import b8.C2272a;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import k1.C3784a;
import s1.X;

/* compiled from: MaterialAutoCompleteTextView.java */
/* loaded from: classes2.dex */
public class v extends C1982d {

    /* renamed from: F, reason: collision with root package name */
    private final M f37438F;

    /* renamed from: G, reason: collision with root package name */
    private final AccessibilityManager f37439G;

    /* renamed from: H, reason: collision with root package name */
    private final Rect f37440H;

    /* renamed from: I, reason: collision with root package name */
    private final int f37441I;

    /* renamed from: J, reason: collision with root package name */
    private final float f37442J;

    /* renamed from: K, reason: collision with root package name */
    private ColorStateList f37443K;

    /* renamed from: L, reason: collision with root package name */
    private int f37444L;

    /* renamed from: M, reason: collision with root package name */
    private ColorStateList f37445M;

    /* compiled from: MaterialAutoCompleteTextView.java */
    class a implements AdapterView.OnItemClickListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            v vVar = v.this;
            v.this.l(i10 < 0 ? vVar.f37438F.v() : vVar.getAdapter().getItem(i10));
            AdapterView.OnItemClickListener onItemClickListener = v.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i10 < 0) {
                    view = v.this.f37438F.y();
                    i10 = v.this.f37438F.x();
                    j10 = v.this.f37438F.w();
                }
                onItemClickListener.onItemClick(v.this.f37438F.l(), view, i10, j10);
            }
            v.this.f37438F.dismiss();
        }
    }

    /* compiled from: MaterialAutoCompleteTextView.java */
    private class b<T> extends ArrayAdapter<String> {

        /* renamed from: B, reason: collision with root package name */
        private ColorStateList f37447B;

        /* renamed from: C, reason: collision with root package name */
        private ColorStateList f37448C;

        b(Context context, int i10, String[] strArr) {
            super(context, i10, strArr);
            f();
        }

        private ColorStateList a() {
            if (!c() || !d()) {
                return null;
            }
            int[] iArr = {R.attr.state_hovered, -16842919};
            int[] iArr2 = {R.attr.state_selected, -16842919};
            int colorForState = v.this.f37445M.getColorForState(iArr2, 0);
            int colorForState2 = v.this.f37445M.getColorForState(iArr, 0);
            return new ColorStateList(new int[][]{iArr2, iArr, new int[0]}, new int[]{M7.a.i(v.this.f37444L, colorForState), M7.a.i(v.this.f37444L, colorForState2), v.this.f37444L});
        }

        private Drawable b() {
            if (!c()) {
                return null;
            }
            ColorDrawable colorDrawable = new ColorDrawable(v.this.f37444L);
            if (this.f37448C == null) {
                return colorDrawable;
            }
            C3784a.o(colorDrawable, this.f37447B);
            return new RippleDrawable(this.f37448C, colorDrawable, null);
        }

        private boolean c() {
            return v.this.f37444L != 0;
        }

        private boolean d() {
            return v.this.f37445M != null;
        }

        private ColorStateList e() {
            if (!d()) {
                return null;
            }
            int[] iArr = {R.attr.state_pressed};
            return new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{v.this.f37445M.getColorForState(iArr, 0), 0});
        }

        void f() {
            this.f37448C = e();
            this.f37447B = a();
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i10, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                X.r0(textView, v.this.getText().toString().contentEquals(textView.getText()) ? b() : null);
            }
            return view2;
        }
    }

    public v(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7.c.f2305b);
    }

    private TextInputLayout f() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private boolean g() {
        return i() || h();
    }

    private boolean h() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f37439G;
        if (accessibilityManager != null && accessibilityManager.isEnabled() && (enabledAccessibilityServiceList = this.f37439G.getEnabledAccessibilityServiceList(16)) != null) {
            for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean i() {
        AccessibilityManager accessibilityManager = this.f37439G;
        return accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled();
    }

    private int j() {
        ListAdapter adapter = getAdapter();
        TextInputLayout textInputLayoutF = f();
        int i10 = 0;
        if (adapter == null || textInputLayoutF == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMin = Math.min(adapter.getCount(), Math.max(0, this.f37438F.x()) + 15);
        View view = null;
        int iMax = 0;
        for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
            int itemViewType = adapter.getItemViewType(iMax2);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = adapter.getView(iMax2, view, textInputLayoutF);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax = Math.max(iMax, view.getMeasuredWidth());
        }
        Drawable drawableI = this.f37438F.i();
        if (drawableI != null) {
            drawableI.getPadding(this.f37440H);
            Rect rect = this.f37440H;
            iMax += rect.left + rect.right;
        }
        return iMax + textInputLayoutF.getEndIconView().getMeasuredWidth();
    }

    private void k() {
        TextInputLayout textInputLayoutF = f();
        if (textInputLayoutF != null) {
            textInputLayoutF.r0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T extends ListAdapter & Filterable> void l(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    @Override // android.widget.AutoCompleteTextView
    public void dismissDropDown() {
        if (g()) {
            this.f37438F.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f37443K;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutF = f();
        return (textInputLayoutF == null || !textInputLayoutF.R()) ? super.getHint() : textInputLayoutF.getHint();
    }

    public float getPopupElevation() {
        return this.f37442J;
    }

    public int getSimpleItemSelectedColor() {
        return this.f37444L;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f37445M;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutF = f();
        if (textInputLayoutF != null && textInputLayoutF.R() && super.getHint() == null && com.google.android.material.internal.i.b()) {
            setHint("");
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f37438F.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), j()), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z10) {
        if (g()) {
            return;
        }
        super.onWindowFocusChanged(z10);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t10) {
        super.setAdapter(t10);
        this.f37438F.p(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        M m10 = this.f37438F;
        if (m10 != null) {
            m10.c(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i10) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i10));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f37443K = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof X7.g) {
            ((X7.g) dropDownBackground).b0(this.f37443K);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f37438F.M(getOnItemSelectedListener());
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i10) {
        super.setRawInputType(i10);
        k();
    }

    public void setSimpleItemSelectedColor(int i10) {
        this.f37444L = i10;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).f();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f37445M = colorStateList;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).f();
        }
    }

    public void setSimpleItems(int i10) {
        setSimpleItems(getResources().getStringArray(i10));
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (g()) {
            this.f37438F.b();
        } else {
            super.showDropDown();
        }
    }

    public v(Context context, AttributeSet attributeSet, int i10) {
        super(C2272a.c(context, attributeSet, i10, 0), attributeSet, i10);
        this.f37440H = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayI = com.google.android.material.internal.r.i(context2, attributeSet, C7.m.f2964k3, i10, C7.l.f2570g, new int[0]);
        int i11 = C7.m.f2975l3;
        if (typedArrayI.hasValue(i11) && typedArrayI.getInt(i11, 0) == 0) {
            setKeyListener(null);
        }
        this.f37441I = typedArrayI.getResourceId(C7.m.f3008o3, C7.i.f2518p);
        this.f37442J = typedArrayI.getDimensionPixelOffset(C7.m.f2986m3, C7.e.f2406n0);
        int i12 = C7.m.f2997n3;
        if (typedArrayI.hasValue(i12)) {
            this.f37443K = ColorStateList.valueOf(typedArrayI.getColor(i12, 0));
        }
        this.f37444L = typedArrayI.getColor(C7.m.f3019p3, 0);
        this.f37445M = U7.c.a(context2, typedArrayI, C7.m.f3030q3);
        this.f37439G = (AccessibilityManager) context2.getSystemService("accessibility");
        M m10 = new M(context2);
        this.f37438F = m10;
        m10.J(true);
        m10.D(this);
        m10.I(2);
        m10.p(getAdapter());
        m10.L(new a());
        int i13 = C7.m.f3041r3;
        if (typedArrayI.hasValue(i13)) {
            setSimpleItems(typedArrayI.getResourceId(i13, 0));
        }
        typedArrayI.recycle();
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new b(getContext(), this.f37441I, strArr));
    }
}
