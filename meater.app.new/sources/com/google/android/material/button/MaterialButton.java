package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.drawable.C0265a;
import androidx.core.view.C0311u;
import androidx.core.widget.C0330k;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.C8032j;
import com.google.android.material.internal.C8033k;
import com.google.android.material.theme.p178a.C8079a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p024c.p025a.p026k.p027a.C0833a;
import p241e.p254e.p256b.p271c.C8908b;
import p241e.p254e.p256b.p271c.C8917k;
import p241e.p254e.p256b.p271c.C8918l;
import p241e.p254e.p256b.p271c.p272a0.C8901h;
import p241e.p254e.p256b.p271c.p272a0.C8904k;
import p241e.p254e.p256b.p271c.p272a0.InterfaceC8907n;
import p241e.p254e.p256b.p271c.p285x.C8947c;

/* loaded from: classes2.dex */
public class MaterialButton extends AppCompatButton implements Checkable, InterfaceC8907n {

    /* renamed from: h */
    private static final int[] f29898h = {R.attr.state_checkable};

    /* renamed from: i */
    private static final int[] f29899i = {R.attr.state_checked};

    /* renamed from: j */
    private static final int f29900j = C8917k.f33991p;

    /* renamed from: k */
    private final C7974a f29901k;

    /* renamed from: l */
    private final LinkedHashSet<InterfaceC7972a> f29902l;

    /* renamed from: m */
    private InterfaceC7973b f29903m;

    /* renamed from: n */
    private PorterDuff.Mode f29904n;

    /* renamed from: o */
    private ColorStateList f29905o;

    /* renamed from: p */
    private Drawable f29906p;

    /* renamed from: q */
    private int f29907q;

    /* renamed from: r */
    private int f29908r;

    /* renamed from: s */
    private int f29909s;

    /* renamed from: t */
    private boolean f29910t;

    /* renamed from: u */
    private boolean f29911u;

    /* renamed from: v */
    private int f29912v;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C7971a();

        /* renamed from: h */
        boolean f29913h;

        /* renamed from: com.google.android.material.button.MaterialButton$SavedState$a */
        static class C7971a implements Parcelable.ClassLoaderCreator<SavedState> {
            C7971a() {
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

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: b */
        private void m24028b(Parcel parcel) {
            this.f29913h = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f29913h ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m24028b(parcel);
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButton$a */
    public interface InterfaceC7972a {
        /* renamed from: a */
        void m24032a(MaterialButton materialButton, boolean z);
    }

    /* renamed from: com.google.android.material.button.MaterialButton$b */
    interface InterfaceC7973b {
        /* renamed from: a */
        void m24033a(MaterialButton materialButton, boolean z);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C8908b.f33831u);
    }

    /* renamed from: b */
    private boolean m24022b() {
        return C0311u.m2162y(this) == 1;
    }

    /* renamed from: c */
    private boolean m24023c() {
        C7974a c7974a = this.f29901k;
        return (c7974a == null || c7974a.m24050m()) ? false : true;
    }

    /* renamed from: d */
    private void m24024d(boolean z) {
        if (z) {
            C0330k.m2328i(this, this.f29906p, null, null, null);
        } else {
            C0330k.m2328i(this, null, null, this.f29906p, null);
        }
    }

    /* renamed from: e */
    private void m24025e(boolean z) {
        Drawable drawable = this.f29906p;
        boolean z2 = false;
        if (drawable != null) {
            Drawable drawableMutate = C0265a.m1821r(drawable).mutate();
            this.f29906p = drawableMutate;
            C0265a.m1818o(drawableMutate, this.f29905o);
            PorterDuff.Mode mode = this.f29904n;
            if (mode != null) {
                C0265a.m1819p(this.f29906p, mode);
            }
            int intrinsicWidth = this.f29907q;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f29906p.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f29907q;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f29906p.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f29906p;
            int i2 = this.f29908r;
            drawable2.setBounds(i2, 0, intrinsicWidth + i2, intrinsicHeight);
        }
        int i3 = this.f29912v;
        boolean z3 = i3 == 1 || i3 == 2;
        if (z) {
            m24024d(z3);
            return;
        }
        Drawable[] drawableArrM2320a = C0330k.m2320a(this);
        Drawable drawable3 = drawableArrM2320a[0];
        Drawable drawable4 = drawableArrM2320a[2];
        if ((z3 && drawable3 != this.f29906p) || (!z3 && drawable4 != this.f29906p)) {
            z2 = true;
        }
        if (z2) {
            m24024d(z3);
        }
    }

    /* renamed from: f */
    private void m24026f() {
        if (this.f29906p == null || getLayout() == null) {
            return;
        }
        int i2 = this.f29912v;
        if (i2 == 1 || i2 == 3) {
            this.f29908r = 0;
            m24025e(false);
            return;
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        int iMin = Math.min((int) paint.measureText(string), getLayout().getEllipsizedWidth());
        int intrinsicWidth = this.f29907q;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f29906p.getIntrinsicWidth();
        }
        int measuredWidth = (((((getMeasuredWidth() - iMin) - C0311u.m2088C(this)) - intrinsicWidth) - this.f29909s) - C0311u.m2090D(this)) / 2;
        if (m24022b() != (this.f29912v == 4)) {
            measuredWidth = -measuredWidth;
        }
        if (this.f29908r != measuredWidth) {
            this.f29908r = measuredWidth;
            m24025e(false);
        }
    }

    private String getA11yClassName() {
        return (m24027a() ? CompoundButton.class : Button.class).getName();
    }

    /* renamed from: a */
    public boolean m24027a() {
        C7974a c7974a = this.f29901k;
        return c7974a != null && c7974a.m24051n();
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
        if (m24023c()) {
            return this.f29901k.m24041b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f29906p;
    }

    public int getIconGravity() {
        return this.f29912v;
    }

    public int getIconPadding() {
        return this.f29909s;
    }

    public int getIconSize() {
        return this.f29907q;
    }

    public ColorStateList getIconTint() {
        return this.f29905o;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f29904n;
    }

    public ColorStateList getRippleColor() {
        if (m24023c()) {
            return this.f29901k.m24044f();
        }
        return null;
    }

    public C8904k getShapeAppearanceModel() {
        if (m24023c()) {
            return this.f29901k.m24045g();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m24023c()) {
            return this.f29901k.m24046h();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m24023c()) {
            return this.f29901k.m24047i();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.InterfaceC0310t
    public ColorStateList getSupportBackgroundTintList() {
        return m24023c() ? this.f29901k.m24048j() : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.InterfaceC0310t
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return m24023c() ? this.f29901k.m24049k() : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f29910t;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m24023c()) {
            C8901h.m28312f(this, this.f29901k.m24043d());
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (m24027a()) {
            Button.mergeDrawableStates(iArrOnCreateDrawableState, f29898h);
        }
        if (isChecked()) {
            Button.mergeDrawableStates(iArrOnCreateDrawableState, f29899i);
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
        accessibilityNodeInfo.setCheckable(m24027a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        C7974a c7974a;
        super.onLayout(z, i2, i3, i4, i5);
        if (Build.VERSION.SDK_INT != 21 || (c7974a = this.f29901k) == null) {
            return;
        }
        c7974a.m24040B(i5 - i3, i4 - i2);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        m24026f();
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m2342a());
        setChecked(savedState.f29913h);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f29913h = this.f29910t;
        return savedState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        m24026f();
    }

    @Override // android.view.View
    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        if (m24023c()) {
            this.f29901k.m24053p(i2);
        } else {
            super.setBackgroundColor(i2);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!m24023c()) {
            super.setBackgroundDrawable(drawable);
        } else {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            }
            Log.w("MaterialButton", "Do not set the background; MaterialButton manages its own background drawable.");
            this.f29901k.m24054q();
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i2) {
        setBackgroundDrawable(i2 != 0 ? C0833a.m5262d(getContext(), i2) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (m24023c()) {
            this.f29901k.m24055r(z);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (m24027a() && isEnabled() && this.f29910t != z) {
            this.f29910t = z;
            refreshDrawableState();
            if (this.f29911u) {
                return;
            }
            this.f29911u = true;
            Iterator<InterfaceC7972a> it = this.f29902l.iterator();
            while (it.hasNext()) {
                it.next().m24032a(this, this.f29910t);
            }
            this.f29911u = false;
        }
    }

    public void setCornerRadius(int i2) {
        if (m24023c()) {
            this.f29901k.m24056s(i2);
        }
    }

    public void setCornerRadiusResource(int i2) {
        if (m24023c()) {
            setCornerRadius(getResources().getDimensionPixelSize(i2));
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        if (m24023c()) {
            this.f29901k.m24043d().m28283W(f2);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f29906p != drawable) {
            this.f29906p = drawable;
            m24025e(true);
        }
    }

    public void setIconGravity(int i2) {
        if (this.f29912v != i2) {
            this.f29912v = i2;
            m24026f();
        }
    }

    public void setIconPadding(int i2) {
        if (this.f29909s != i2) {
            this.f29909s = i2;
            setCompoundDrawablePadding(i2);
        }
    }

    public void setIconResource(int i2) {
        setIcon(i2 != 0 ? C0833a.m5262d(getContext(), i2) : null);
    }

    public void setIconSize(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f29907q != i2) {
            this.f29907q = i2;
            m24025e(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f29905o != colorStateList) {
            this.f29905o = colorStateList;
            m24025e(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f29904n != mode) {
            this.f29904n = mode;
            m24025e(false);
        }
    }

    public void setIconTintResource(int i2) {
        setIconTint(C0833a.m5261c(getContext(), i2));
    }

    void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    void setOnPressedChangeListenerInternal(InterfaceC7973b interfaceC7973b) {
        this.f29903m = interfaceC7973b;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        InterfaceC7973b interfaceC7973b = this.f29903m;
        if (interfaceC7973b != null) {
            interfaceC7973b.m24033a(this, z);
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m24023c()) {
            this.f29901k.m24057t(colorStateList);
        }
    }

    public void setRippleColorResource(int i2) {
        if (m24023c()) {
            setRippleColor(C0833a.m5261c(getContext(), i2));
        }
    }

    @Override // p241e.p254e.p256b.p271c.p272a0.InterfaceC8907n
    public void setShapeAppearanceModel(C8904k c8904k) {
        if (!m24023c()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f29901k.m24058u(c8904k);
    }

    void setShouldDrawSurfaceColorStroke(boolean z) {
        if (m24023c()) {
            this.f29901k.m24059v(z);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m24023c()) {
            this.f29901k.m24060w(colorStateList);
        }
    }

    public void setStrokeColorResource(int i2) {
        if (m24023c()) {
            setStrokeColor(C0833a.m5261c(getContext(), i2));
        }
    }

    public void setStrokeWidth(int i2) {
        if (m24023c()) {
            this.f29901k.m24061x(i2);
        }
    }

    public void setStrokeWidthResource(int i2) {
        if (m24023c()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i2));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.InterfaceC0310t
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (m24023c()) {
            this.f29901k.m24062y(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.InterfaceC0310t
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (m24023c()) {
            this.f29901k.m24063z(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f29910t);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButton(Context context, AttributeSet attributeSet, int i2) {
        int i3 = f29900j;
        super(C8079a.m24906c(context, attributeSet, i2, i3), attributeSet, i2);
        this.f29902l = new LinkedHashSet<>();
        this.f29910t = false;
        this.f29911u = false;
        Context context2 = getContext();
        TypedArray typedArrayM24694h = C8032j.m24694h(context2, attributeSet, C8918l.f34324t2, i2, i3, new int[0]);
        this.f29909s = typedArrayM24694h.getDimensionPixelSize(C8918l.f34045G2, 0);
        this.f29904n = C8033k.m24700e(typedArrayM24694h.getInt(C8918l.f34066J2, -1), PorterDuff.Mode.SRC_IN);
        this.f29905o = C8947c.m28499a(getContext(), typedArrayM24694h, C8918l.f34059I2);
        this.f29906p = C8947c.m28502d(getContext(), typedArrayM24694h, C8918l.f34031E2);
        this.f29912v = typedArrayM24694h.getInteger(C8918l.f34038F2, 1);
        this.f29907q = typedArrayM24694h.getDimensionPixelSize(C8918l.f34052H2, 0);
        C7974a c7974a = new C7974a(this, C8904k.m28317e(context2, attributeSet, i2, i3).m28355m());
        this.f29901k = c7974a;
        c7974a.m24052o(typedArrayM24694h);
        typedArrayM24694h.recycle();
        setCompoundDrawablePadding(this.f29909s);
        m24025e(this.f29906p != null);
    }
}
