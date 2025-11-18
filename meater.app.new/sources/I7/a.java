package I7;

import C7.f;
import C7.g;
import C7.k;
import C7.l;
import C7.m;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.a0;
import b8.C2272a;
import com.google.android.material.internal.r;
import com.google.android.material.internal.u;
import j.C3699a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import k1.C3784a;

/* compiled from: MaterialCheckBox.java */
/* loaded from: classes2.dex */
public class a extends AppCompatCheckBox {

    /* renamed from: c0, reason: collision with root package name */
    private static final int f6708c0 = l.f2587x;

    /* renamed from: d0, reason: collision with root package name */
    private static final int[] f6709d0 = {C7.c.f2310d0};

    /* renamed from: e0, reason: collision with root package name */
    private static final int[] f6710e0;

    /* renamed from: f0, reason: collision with root package name */
    private static final int[][] f6711f0;

    /* renamed from: g0, reason: collision with root package name */
    @SuppressLint({"DiscouragedApi"})
    private static final int f6712g0;

    /* renamed from: F, reason: collision with root package name */
    private final LinkedHashSet<c> f6713F;

    /* renamed from: G, reason: collision with root package name */
    private final LinkedHashSet<b> f6714G;

    /* renamed from: H, reason: collision with root package name */
    private ColorStateList f6715H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f6716I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f6717J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f6718K;

    /* renamed from: L, reason: collision with root package name */
    private CharSequence f6719L;

    /* renamed from: M, reason: collision with root package name */
    private Drawable f6720M;

    /* renamed from: N, reason: collision with root package name */
    private Drawable f6721N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f6722O;

    /* renamed from: P, reason: collision with root package name */
    ColorStateList f6723P;

    /* renamed from: Q, reason: collision with root package name */
    ColorStateList f6724Q;

    /* renamed from: R, reason: collision with root package name */
    private PorterDuff.Mode f6725R;

    /* renamed from: S, reason: collision with root package name */
    private int f6726S;

    /* renamed from: T, reason: collision with root package name */
    private int[] f6727T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f6728U;

    /* renamed from: V, reason: collision with root package name */
    private CharSequence f6729V;

    /* renamed from: W, reason: collision with root package name */
    private CompoundButton.OnCheckedChangeListener f6730W;

    /* renamed from: a0, reason: collision with root package name */
    private final androidx.vectordrawable.graphics.drawable.c f6731a0;

    /* renamed from: b0, reason: collision with root package name */
    private final androidx.vectordrawable.graphics.drawable.b f6732b0;

    /* compiled from: MaterialCheckBox.java */
    /* renamed from: I7.a$a, reason: collision with other inner class name */
    class C0134a extends androidx.vectordrawable.graphics.drawable.b {
        C0134a() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.b
        public void b(Drawable drawable) {
            super.b(drawable);
            ColorStateList colorStateList = a.this.f6723P;
            if (colorStateList != null) {
                C3784a.o(drawable, colorStateList);
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.b
        public void c(Drawable drawable) {
            super.c(drawable);
            a aVar = a.this;
            ColorStateList colorStateList = aVar.f6723P;
            if (colorStateList != null) {
                C3784a.n(drawable, colorStateList.getColorForState(aVar.f6727T, a.this.f6723P.getDefaultColor()));
            }
        }
    }

    /* compiled from: MaterialCheckBox.java */
    public interface b {
        void a(a aVar, int i10);
    }

    /* compiled from: MaterialCheckBox.java */
    public interface c {
        void a(a aVar, boolean z10);
    }

    /* compiled from: MaterialCheckBox.java */
    static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = new C0135a();

        /* renamed from: B, reason: collision with root package name */
        int f6734B;

        /* compiled from: MaterialCheckBox.java */
        /* renamed from: I7.a$d$a, reason: collision with other inner class name */
        class C0135a implements Parcelable.Creator<d> {
            C0135a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public d[] newArray(int i10) {
                return new d[i10];
            }
        }

        /* synthetic */ d(Parcel parcel, C0134a c0134a) {
            this(parcel);
        }

        private String a() {
            int i10 = this.f6734B;
            return i10 != 1 ? i10 != 2 ? "unchecked" : "indeterminate" : "checked";
        }

        public String toString() {
            return "MaterialCheckBox.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " CheckedState=" + a() + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Integer.valueOf(this.f6734B));
        }

        d(Parcelable parcelable) {
            super(parcelable);
        }

        private d(Parcel parcel) {
            super(parcel);
            this.f6734B = ((Integer) parcel.readValue(getClass().getClassLoader())).intValue();
        }
    }

    static {
        int i10 = C7.c.f2308c0;
        f6710e0 = new int[]{i10};
        f6711f0 = new int[][]{new int[]{R.attr.state_enabled, i10}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
        f6712g0 = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7.c.f2315g);
    }

    private boolean c(a0 a0Var) {
        return a0Var.n(m.f3126z4, 0) == f6712g0 && a0Var.n(m.f2595A4, 0) == 0;
    }

    private void e() {
        this.f6720M = com.google.android.material.drawable.d.c(this.f6720M, this.f6723P, androidx.core.widget.d.c(this));
        this.f6721N = com.google.android.material.drawable.d.c(this.f6721N, this.f6724Q, this.f6725R);
        g();
        h();
        super.setButtonDrawable(com.google.android.material.drawable.d.a(this.f6720M, this.f6721N));
        refreshDrawableState();
    }

    private void f() {
        if (Build.VERSION.SDK_INT < 30 || this.f6729V != null) {
            return;
        }
        super.setStateDescription(getButtonStateDescription());
    }

    private void g() {
        androidx.vectordrawable.graphics.drawable.c cVar;
        if (this.f6722O) {
            androidx.vectordrawable.graphics.drawable.c cVar2 = this.f6731a0;
            if (cVar2 != null) {
                cVar2.f(this.f6732b0);
                this.f6731a0.b(this.f6732b0);
            }
            Drawable drawable = this.f6720M;
            if (!(drawable instanceof AnimatedStateListDrawable) || (cVar = this.f6731a0) == null) {
                return;
            }
            int i10 = g.f2472b;
            int i11 = g.f2477d0;
            ((AnimatedStateListDrawable) drawable).addTransition(i10, i11, cVar, false);
            ((AnimatedStateListDrawable) this.f6720M).addTransition(g.f2483j, i11, this.f6731a0, false);
        }
    }

    private String getButtonStateDescription() {
        int i10 = this.f6726S;
        return i10 == 1 ? getResources().getString(k.f2542k) : i10 == 0 ? getResources().getString(k.f2544m) : getResources().getString(k.f2543l);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f6715H == null) {
            int[][] iArr = f6711f0;
            int[] iArr2 = new int[iArr.length];
            int iD = M7.a.d(this, C7.c.f2319i);
            int iD2 = M7.a.d(this, C7.c.f2323k);
            int iD3 = M7.a.d(this, C7.c.f2331p);
            int iD4 = M7.a.d(this, C7.c.f2325l);
            iArr2[0] = M7.a.j(iD3, iD2, 1.0f);
            iArr2[1] = M7.a.j(iD3, iD, 1.0f);
            iArr2[2] = M7.a.j(iD3, iD4, 0.54f);
            iArr2[3] = M7.a.j(iD3, iD4, 0.38f);
            iArr2[4] = M7.a.j(iD3, iD4, 0.38f);
            this.f6715H = new ColorStateList(iArr, iArr2);
        }
        return this.f6715H;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f6723P;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    private void h() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Drawable drawable = this.f6720M;
        if (drawable != null && (colorStateList2 = this.f6723P) != null) {
            C3784a.o(drawable, colorStateList2);
        }
        Drawable drawable2 = this.f6721N;
        if (drawable2 == null || (colorStateList = this.f6724Q) == null) {
            return;
        }
        C3784a.o(drawable2, colorStateList);
    }

    public boolean d() {
        return this.f6718K;
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f6720M;
    }

    public Drawable getButtonIconDrawable() {
        return this.f6721N;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f6724Q;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f6725R;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f6723P;
    }

    public int getCheckedState() {
        return this.f6726S;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f6719L;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public boolean isChecked() {
        return this.f6726S == 1;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f6716I && this.f6723P == null && this.f6724Q == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f6709d0);
        }
        if (d()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f6710e0);
        }
        this.f6727T = com.google.android.material.drawable.d.e(iArrOnCreateDrawableState);
        i();
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        Drawable drawableA;
        if (!this.f6717J || !TextUtils.isEmpty(getText()) || (drawableA = androidx.core.widget.d.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - drawableA.getIntrinsicWidth()) / 2) * (u.g(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = drawableA.getBounds();
            C3784a.l(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && d()) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f6719L));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        setCheckedState(dVar.f6734B);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.f6734B = getCheckedState();
        return dVar;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(C3699a.b(getContext(), i10));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f6721N = drawable;
        e();
    }

    public void setButtonIconDrawableResource(int i10) {
        setButtonIconDrawable(C3699a.b(getContext(), i10));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f6724Q == colorStateList) {
            return;
        }
        this.f6724Q = colorStateList;
        e();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f6725R == mode) {
            return;
        }
        this.f6725R = mode;
        e();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f6723P == colorStateList) {
            return;
        }
        this.f6723P = colorStateList;
        e();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        e();
    }

    public void setCenterIfNoTextEnabled(boolean z10) {
        this.f6717J = z10;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        setCheckedState(z10 ? 1 : 0);
    }

    public void setCheckedState(int i10) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f6726S != i10) {
            this.f6726S = i10;
            super.setChecked(i10 == 1);
            refreshDrawableState();
            f();
            if (this.f6728U) {
                return;
            }
            this.f6728U = true;
            LinkedHashSet<b> linkedHashSet = this.f6714G;
            if (linkedHashSet != null) {
                Iterator<b> it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    it.next().a(this, this.f6726S);
                }
            }
            if (this.f6726S != 2 && (onCheckedChangeListener = this.f6730W) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f6728U = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        i();
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f6719L = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i10) {
        setErrorAccessibilityLabel(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setErrorShown(boolean z10) {
        if (this.f6718K == z10) {
            return;
        }
        this.f6718K = z10;
        refreshDrawableState();
        Iterator<c> it = this.f6713F.iterator();
        while (it.hasNext()) {
            it.next().a(this, this.f6718K);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f6730W = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f6729V = charSequence;
        if (charSequence == null) {
            f();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f6716I = z10;
        if (z10) {
            androidx.core.widget.d.d(this, getMaterialThemeColorsTintList());
        } else {
            androidx.core.widget.d.d(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f6708c0;
        super(C2272a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f6713F = new LinkedHashSet<>();
        this.f6714G = new LinkedHashSet<>();
        this.f6731a0 = androidx.vectordrawable.graphics.drawable.c.a(getContext(), f.f2437g);
        this.f6732b0 = new C0134a();
        Context context2 = getContext();
        this.f6720M = androidx.core.widget.d.a(this);
        this.f6723P = getSuperButtonTintList();
        setSupportButtonTintList(null);
        a0 a0VarJ = r.j(context2, attributeSet, m.f3116y4, i10, i11, new int[0]);
        this.f6721N = a0VarJ.g(m.f2605B4);
        if (this.f6720M != null && r.g(context2) && c(a0VarJ)) {
            super.setButtonDrawable((Drawable) null);
            this.f6720M = C3699a.b(context2, f.f2436f);
            this.f6722O = true;
            if (this.f6721N == null) {
                this.f6721N = C3699a.b(context2, f.f2438h);
            }
        }
        this.f6724Q = U7.c.b(context2, a0VarJ, m.f2615C4);
        this.f6725R = u.i(a0VarJ.k(m.f2625D4, -1), PorterDuff.Mode.SRC_IN);
        this.f6716I = a0VarJ.a(m.f2675I4, false);
        this.f6717J = a0VarJ.a(m.f2635E4, true);
        this.f6718K = a0VarJ.a(m.f2665H4, false);
        this.f6719L = a0VarJ.p(m.f2655G4);
        int i12 = m.f2645F4;
        if (a0VarJ.s(i12)) {
            setCheckedState(a0VarJ.k(i12, 0));
        }
        a0VarJ.x();
        e();
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f6720M = drawable;
        this.f6722O = false;
        e();
    }

    private void i() {
    }
}
