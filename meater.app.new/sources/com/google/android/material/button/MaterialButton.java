package com.google.android.material.button;

import C7.l;
import C7.m;
import X7.h;
import X7.k;
import X7.n;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.widget.j;
import b8.C2272a;
import com.google.android.material.internal.r;
import com.google.android.material.internal.u;
import j.C3699a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import k1.C3784a;
import s1.X;
import y1.AbstractC5121a;

/* loaded from: classes2.dex */
public class MaterialButton extends AppCompatButton implements Checkable, n {

    /* renamed from: S, reason: collision with root package name */
    private static final int[] f36111S = {R.attr.state_checkable};

    /* renamed from: T, reason: collision with root package name */
    private static final int[] f36112T = {R.attr.state_checked};

    /* renamed from: U, reason: collision with root package name */
    private static final int f36113U = l.f2583t;

    /* renamed from: E, reason: collision with root package name */
    private final com.google.android.material.button.a f36114E;

    /* renamed from: F, reason: collision with root package name */
    private final LinkedHashSet<a> f36115F;

    /* renamed from: G, reason: collision with root package name */
    private b f36116G;

    /* renamed from: H, reason: collision with root package name */
    private PorterDuff.Mode f36117H;

    /* renamed from: I, reason: collision with root package name */
    private ColorStateList f36118I;

    /* renamed from: J, reason: collision with root package name */
    private Drawable f36119J;

    /* renamed from: K, reason: collision with root package name */
    private String f36120K;

    /* renamed from: L, reason: collision with root package name */
    private int f36121L;

    /* renamed from: M, reason: collision with root package name */
    private int f36122M;

    /* renamed from: N, reason: collision with root package name */
    private int f36123N;

    /* renamed from: O, reason: collision with root package name */
    private int f36124O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f36125P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f36126Q;

    /* renamed from: R, reason: collision with root package name */
    private int f36127R;

    public interface a {
        void a(MaterialButton materialButton, boolean z10);
    }

    interface b {
        void a(MaterialButton materialButton, boolean z10);
    }

    static class c extends AbstractC5121a {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: D, reason: collision with root package name */
        boolean f36128D;

        class a implements Parcelable.ClassLoaderCreator<c> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public c createFromParcel(Parcel parcel) {
                return new c(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public c[] newArray(int i10) {
                return new c[i10];
            }
        }

        public c(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(Parcel parcel) {
            this.f36128D = parcel.readInt() == 1;
        }

        @Override // y1.AbstractC5121a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f36128D ? 1 : 0);
        }

        public c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            b(parcel);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7.c.f2341z);
    }

    private boolean b() {
        int i10 = this.f36127R;
        return i10 == 3 || i10 == 4;
    }

    private boolean c() {
        int i10 = this.f36127R;
        return i10 == 1 || i10 == 2;
    }

    private boolean d() {
        int i10 = this.f36127R;
        return i10 == 16 || i10 == 32;
    }

    private boolean e() {
        return X.z(this) == 1;
    }

    private boolean f() {
        com.google.android.material.button.a aVar = this.f36114E;
        return (aVar == null || aVar.o()) ? false : true;
    }

    private void g() {
        if (c()) {
            j.k(this, this.f36119J, null, null, null);
        } else if (b()) {
            j.k(this, null, null, this.f36119J, null);
        } else if (d()) {
            j.k(this, null, this.f36119J, null, null);
        }
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i10 = 0; i10 < lineCount; i10++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i10));
        }
        return (int) Math.ceil(fMax);
    }

    private void h(boolean z10) {
        Drawable drawable = this.f36119J;
        if (drawable != null) {
            Drawable drawableMutate = C3784a.r(drawable).mutate();
            this.f36119J = drawableMutate;
            C3784a.o(drawableMutate, this.f36118I);
            PorterDuff.Mode mode = this.f36117H;
            if (mode != null) {
                C3784a.p(this.f36119J, mode);
            }
            int intrinsicWidth = this.f36121L;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f36119J.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f36121L;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f36119J.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f36119J;
            int i10 = this.f36122M;
            int i11 = this.f36123N;
            drawable2.setBounds(i10, i11, intrinsicWidth + i10, intrinsicHeight + i11);
            this.f36119J.setVisible(true, z10);
        }
        if (z10) {
            g();
            return;
        }
        Drawable[] drawableArrA = j.a(this);
        Drawable drawable3 = drawableArrA[0];
        Drawable drawable4 = drawableArrA[1];
        Drawable drawable5 = drawableArrA[2];
        if ((!c() || drawable3 == this.f36119J) && ((!b() || drawable5 == this.f36119J) && (!d() || drawable4 == this.f36119J))) {
            return;
        }
        g();
    }

    private void i(int i10, int i11) {
        if (this.f36119J == null || getLayout() == null) {
            return;
        }
        if (!c() && !b()) {
            if (d()) {
                this.f36122M = 0;
                if (this.f36127R == 16) {
                    this.f36123N = 0;
                    h(false);
                    return;
                }
                int intrinsicHeight = this.f36121L;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f36119J.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i11 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f36124O) - getPaddingBottom()) / 2);
                if (this.f36123N != iMax) {
                    this.f36123N = iMax;
                    h(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f36123N = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i12 = this.f36127R;
        if (i12 == 1 || i12 == 3 || ((i12 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i12 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f36122M = 0;
            h(false);
            return;
        }
        int intrinsicWidth = this.f36121L;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f36119J.getIntrinsicWidth();
        }
        int textLayoutWidth = ((((i10 - getTextLayoutWidth()) - X.D(this)) - intrinsicWidth) - this.f36124O) - X.E(this);
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        if (e() != (this.f36127R == 4)) {
            textLayoutWidth = -textLayoutWidth;
        }
        if (this.f36122M != textLayoutWidth) {
            this.f36122M = textLayoutWidth;
            h(false);
        }
    }

    public boolean a() {
        com.google.android.material.button.a aVar = this.f36114E;
        return aVar != null && aVar.p();
    }

    String getA11yClassName() {
        if (TextUtils.isEmpty(this.f36120K)) {
            return (a() ? CompoundButton.class : Button.class).getName();
        }
        return this.f36120K;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (f()) {
            return this.f36114E.b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f36119J;
    }

    public int getIconGravity() {
        return this.f36127R;
    }

    public int getIconPadding() {
        return this.f36124O;
    }

    public int getIconSize() {
        return this.f36121L;
    }

    public ColorStateList getIconTint() {
        return this.f36118I;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f36117H;
    }

    public int getInsetBottom() {
        return this.f36114E.c();
    }

    public int getInsetTop() {
        return this.f36114E.d();
    }

    public ColorStateList getRippleColor() {
        if (f()) {
            return this.f36114E.h();
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        if (f()) {
            return this.f36114E.i();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (f()) {
            return this.f36114E.j();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (f()) {
            return this.f36114E.k();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public ColorStateList getSupportBackgroundTintList() {
        return f() ? this.f36114E.l() : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return f() ? this.f36114E.m() : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f36125P;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (f()) {
            h.f(this, this.f36114E.f());
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (a()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f36111S);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f36112T);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.a());
        setChecked(cVar.f36128D);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f36128D = this.f36125P;
        return cVar;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        if (this.f36114E.q()) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f36119J != null) {
            if (this.f36119J.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    void setA11yClassName(String str) {
        this.f36120K = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (f()) {
            this.f36114E.s(i10);
        } else {
            super.setBackgroundColor(i10);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!f()) {
            super.setBackgroundDrawable(drawable);
        } else {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            }
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            this.f36114E.t();
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i10) {
        setBackgroundDrawable(i10 != 0 ? C3699a.b(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z10) {
        if (f()) {
            this.f36114E.u(z10);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (a() && isEnabled() && this.f36125P != z10) {
            this.f36125P = z10;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                ((MaterialButtonToggleGroup) getParent()).m(this, this.f36125P);
            }
            if (this.f36126Q) {
                return;
            }
            this.f36126Q = true;
            Iterator<a> it = this.f36115F.iterator();
            while (it.hasNext()) {
                it.next().a(this, this.f36125P);
            }
            this.f36126Q = false;
        }
    }

    public void setCornerRadius(int i10) {
        if (f()) {
            this.f36114E.v(i10);
        }
    }

    public void setCornerRadiusResource(int i10) {
        if (f()) {
            setCornerRadius(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        if (f()) {
            this.f36114E.f().a0(f10);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f36119J != drawable) {
            this.f36119J = drawable;
            h(true);
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i10) {
        if (this.f36127R != i10) {
            this.f36127R = i10;
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i10) {
        if (this.f36124O != i10) {
            this.f36124O = i10;
            setCompoundDrawablePadding(i10);
        }
    }

    public void setIconResource(int i10) {
        setIcon(i10 != 0 ? C3699a.b(getContext(), i10) : null);
    }

    public void setIconSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f36121L != i10) {
            this.f36121L = i10;
            h(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f36118I != colorStateList) {
            this.f36118I = colorStateList;
            h(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f36117H != mode) {
            this.f36117H = mode;
            h(false);
        }
    }

    public void setIconTintResource(int i10) {
        setIconTint(C3699a.a(getContext(), i10));
    }

    public void setInsetBottom(int i10) {
        this.f36114E.w(i10);
    }

    public void setInsetTop(int i10) {
        this.f36114E.x(i10);
    }

    void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    void setOnPressedChangeListenerInternal(b bVar) {
        this.f36116G = bVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        b bVar = this.f36116G;
        if (bVar != null) {
            bVar.a(this, z10);
        }
        super.setPressed(z10);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (f()) {
            this.f36114E.y(colorStateList);
        }
    }

    public void setRippleColorResource(int i10) {
        if (f()) {
            setRippleColor(C3699a.a(getContext(), i10));
        }
    }

    @Override // X7.n
    public void setShapeAppearanceModel(k kVar) {
        if (!f()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f36114E.z(kVar);
    }

    void setShouldDrawSurfaceColorStroke(boolean z10) {
        if (f()) {
            this.f36114E.A(z10);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (f()) {
            this.f36114E.B(colorStateList);
        }
    }

    public void setStrokeColorResource(int i10) {
        if (f()) {
            setStrokeColor(C3699a.a(getContext(), i10));
        }
    }

    public void setStrokeWidth(int i10) {
        if (f()) {
            this.f36114E.C(i10);
        }
    }

    public void setStrokeWidthResource(int i10) {
        if (f()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (f()) {
            this.f36114E.D(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (f()) {
            this.f36114E.E(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i10) {
        super.setTextAlignment(i10);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z10) {
        this.f36114E.F(z10);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f36125P);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButton(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f36113U;
        super(C2272a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f36115F = new LinkedHashSet<>();
        this.f36125P = false;
        this.f36126Q = false;
        Context context2 = getContext();
        TypedArray typedArrayI = r.i(context2, attributeSet, m.f3052s3, i10, i11, new int[0]);
        this.f36124O = typedArrayI.getDimensionPixelSize(m.f2644F3, 0);
        this.f36117H = u.i(typedArrayI.getInt(m.f2674I3, -1), PorterDuff.Mode.SRC_IN);
        this.f36118I = U7.c.a(getContext(), typedArrayI, m.f2664H3);
        this.f36119J = U7.c.e(getContext(), typedArrayI, m.f2624D3);
        this.f36127R = typedArrayI.getInteger(m.f2634E3, 1);
        this.f36121L = typedArrayI.getDimensionPixelSize(m.f2654G3, 0);
        com.google.android.material.button.a aVar = new com.google.android.material.button.a(this, k.e(context2, attributeSet, i10, i11).m());
        this.f36114E = aVar;
        aVar.r(typedArrayI);
        typedArrayI.recycle();
        setCompoundDrawablePadding(this.f36124O);
        h(this.f36119J != null);
    }
}
