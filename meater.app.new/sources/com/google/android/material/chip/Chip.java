package com.google.android.material.chip;

import android.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.C0160e;
import androidx.core.view.C0311u;
import androidx.core.view.p004d0.C0289c;
import com.google.android.material.chip.C7985a;
import com.google.android.material.internal.C8032j;
import com.google.android.material.internal.C8033k;
import com.google.android.material.theme.p178a.C8079a;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import okhttp3.HttpUrl;
import p024c.p062k.p063a.AbstractC0964a;
import p241e.p254e.p256b.p271c.C8908b;
import p241e.p254e.p256b.p271c.C8916j;
import p241e.p254e.p256b.p271c.C8917k;
import p241e.p254e.p256b.p271c.C8918l;
import p241e.p254e.p256b.p271c.p272a0.C8901h;
import p241e.p254e.p256b.p271c.p272a0.C8904k;
import p241e.p254e.p256b.p271c.p272a0.InterfaceC8907n;
import p241e.p254e.p256b.p271c.p273m.C8926h;
import p241e.p254e.p256b.p271c.p285x.AbstractC8950f;
import p241e.p254e.p256b.p271c.p285x.C8947c;
import p241e.p254e.p256b.p271c.p285x.C8948d;
import p241e.p254e.p256b.p271c.p286y.C8952b;

/* loaded from: classes2.dex */
public class Chip extends C0160e implements C7985a.a, InterfaceC8907n {

    /* renamed from: i */
    private static final int f29964i = C8917k.f33994s;

    /* renamed from: j */
    private static final Rect f29965j = new Rect();

    /* renamed from: k */
    private static final int[] f29966k = {R.attr.state_selected};

    /* renamed from: l */
    private static final int[] f29967l = {R.attr.state_checkable};

    /* renamed from: A */
    private final RectF f29968A;

    /* renamed from: B */
    private final AbstractC8950f f29969B;

    /* renamed from: m */
    private C7985a f29970m;

    /* renamed from: n */
    private InsetDrawable f29971n;

    /* renamed from: o */
    private RippleDrawable f29972o;

    /* renamed from: p */
    private View.OnClickListener f29973p;

    /* renamed from: q */
    private CompoundButton.OnCheckedChangeListener f29974q;

    /* renamed from: r */
    private boolean f29975r;

    /* renamed from: s */
    private boolean f29976s;

    /* renamed from: t */
    private boolean f29977t;

    /* renamed from: u */
    private boolean f29978u;

    /* renamed from: v */
    private boolean f29979v;

    /* renamed from: w */
    private int f29980w;

    /* renamed from: x */
    private int f29981x;

    /* renamed from: y */
    private final C7979c f29982y;

    /* renamed from: z */
    private final Rect f29983z;

    /* renamed from: com.google.android.material.chip.Chip$a */
    class C7977a extends AbstractC8950f {
        C7977a() {
        }

        @Override // p241e.p254e.p256b.p271c.p285x.AbstractC8950f
        /* renamed from: a */
        public void mo24151a(int i2) {
        }

        @Override // p241e.p254e.p256b.p271c.p285x.AbstractC8950f
        /* renamed from: b */
        public void mo24152b(Typeface typeface, boolean z) {
            Chip chip = Chip.this;
            chip.setText(chip.f29970m.m24227K2() ? Chip.this.f29970m.m24269g1() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    /* renamed from: com.google.android.material.chip.Chip$b */
    class C7978b extends ViewOutlineProvider {
        C7978b() {
        }

        @Override // android.view.ViewOutlineProvider
        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            if (Chip.this.f29970m != null) {
                Chip.this.f29970m.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    /* renamed from: com.google.android.material.chip.Chip$c */
    private class C7979c extends AbstractC0964a {
        C7979c(Chip chip) {
            super(chip);
        }

        @Override // p024c.p062k.p063a.AbstractC0964a
        /* renamed from: B */
        protected int mo6091B(float f2, float f3) {
            return (Chip.this.m24136n() && Chip.this.getCloseIconTouchBounds().contains(f2, f3)) ? 1 : 0;
        }

        @Override // p024c.p062k.p063a.AbstractC0964a
        /* renamed from: C */
        protected void mo6092C(List<Integer> list) {
            list.add(0);
            if (Chip.this.m24136n() && Chip.this.m24148s() && Chip.this.f29973p != null) {
                list.add(1);
            }
        }

        @Override // p024c.p062k.p063a.AbstractC0964a
        /* renamed from: J */
        protected boolean mo6095J(int i2, int i3, Bundle bundle) {
            if (i3 != 16) {
                return false;
            }
            if (i2 == 0) {
                return Chip.this.performClick();
            }
            if (i2 == 1) {
                return Chip.this.m24149t();
            }
            return false;
        }

        @Override // p024c.p062k.p063a.AbstractC0964a
        /* renamed from: M */
        protected void mo6098M(C0289c c0289c) {
            c0289c.m1968W(Chip.this.m24147r());
            c0289c.m1971Z(Chip.this.isClickable());
            if (Chip.this.m24147r() || Chip.this.isClickable()) {
                c0289c.m1970Y(Chip.this.m24147r() ? "android.widget.CompoundButton" : "android.widget.Button");
            } else {
                c0289c.m1970Y("android.view.View");
            }
            CharSequence text = Chip.this.getText();
            if (Build.VERSION.SDK_INT >= 23) {
                c0289c.m2007v0(text);
            } else {
                c0289c.m1977c0(text);
            }
        }

        @Override // p024c.p062k.p063a.AbstractC0964a
        /* renamed from: N */
        protected void mo6099N(int i2, C0289c c0289c) {
            CharSequence charSequence = HttpUrl.FRAGMENT_ENCODE_SET;
            if (i2 != 1) {
                c0289c.m1977c0(HttpUrl.FRAGMENT_ENCODE_SET);
                c0289c.m1966U(Chip.f29965j);
                return;
            }
            CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                c0289c.m1977c0(closeIconContentDescription);
            } else {
                CharSequence text = Chip.this.getText();
                Context context = Chip.this.getContext();
                int i3 = C8916j.f33965i;
                Object[] objArr = new Object[1];
                if (!TextUtils.isEmpty(text)) {
                    charSequence = text;
                }
                objArr[0] = charSequence;
                c0289c.m1977c0(context.getString(i3, objArr).trim());
            }
            c0289c.m1966U(Chip.this.getCloseIconTouchBoundsInt());
            c0289c.m1974b(C0289c.a.f2352e);
            c0289c.m1980e0(Chip.this.isEnabled());
        }

        @Override // p024c.p062k.p063a.AbstractC0964a
        /* renamed from: O */
        protected void mo6100O(int i2, boolean z) {
            if (i2 == 1) {
                Chip.this.f29978u = z;
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C8908b.f33819i);
    }

    /* renamed from: A */
    private void m24122A() {
        C7985a c7985a;
        if (TextUtils.isEmpty(getText()) || (c7985a = this.f29970m) == null) {
            return;
        }
        int iM24225K0 = (int) (c7985a.m24225K0() + this.f29970m.m24273i1() + this.f29970m.m24289r0());
        int iM24236P0 = (int) (this.f29970m.m24236P0() + this.f29970m.m24275j1() + this.f29970m.m24281n0());
        if (this.f29971n != null) {
            Rect rect = new Rect();
            this.f29971n.getPadding(rect);
            iM24236P0 += rect.left;
            iM24225K0 += rect.right;
        }
        C0311u.m2159w0(this, iM24236P0, getPaddingTop(), iM24225K0, getPaddingBottom());
    }

    /* renamed from: B */
    private void m24123B() {
        TextPaint paint = getPaint();
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            paint.drawableState = c7985a.getState();
        }
        C8948d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.m28513i(getContext(), paint, this.f29969B);
        }
    }

    /* renamed from: C */
    private void m24124C(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.f29968A.setEmpty();
        if (m24136n()) {
            this.f29970m.m24256Z0(this.f29968A);
        }
        return this.f29968A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f29983z.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f29983z;
    }

    private C8948d getTextAppearance() {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            return c7985a.m24271h1();
        }
        return null;
    }

    /* renamed from: i */
    private void m24132i(C7985a c7985a) {
        c7985a.m24285o2(this);
    }

    /* renamed from: j */
    private int[] m24133j() {
        int i2 = 0;
        int i3 = isEnabled() ? 1 : 0;
        if (this.f29978u) {
            i3++;
        }
        if (this.f29977t) {
            i3++;
        }
        if (this.f29976s) {
            i3++;
        }
        if (isChecked()) {
            i3++;
        }
        int[] iArr = new int[i3];
        if (isEnabled()) {
            iArr[0] = 16842910;
            i2 = 1;
        }
        if (this.f29978u) {
            iArr[i2] = 16842908;
            i2++;
        }
        if (this.f29977t) {
            iArr[i2] = 16843623;
            i2++;
        }
        if (this.f29976s) {
            iArr[i2] = 16842919;
            i2++;
        }
        if (isChecked()) {
            iArr[i2] = 16842913;
        }
        return iArr;
    }

    /* renamed from: l */
    private void m24134l() {
        if (getBackgroundDrawable() == this.f29971n && this.f29970m.getCallback() == null) {
            this.f29970m.setCallback(this.f29971n);
        }
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: m */
    private boolean m24135m(MotionEvent motionEvent) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (motionEvent.getAction() == 10) {
            try {
                Field declaredField = AbstractC0964a.class.getDeclaredField("p");
                declaredField.setAccessible(true);
                if (((Integer) declaredField.get(this.f29982y)).intValue() != Integer.MIN_VALUE) {
                    Method declaredMethod = AbstractC0964a.class.getDeclaredMethod("V", Integer.TYPE);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this.f29982y, Integer.MIN_VALUE);
                    return true;
                }
            } catch (IllegalAccessException e2) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e2);
            } catch (NoSuchFieldException e3) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e3);
            } catch (NoSuchMethodException e4) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e4);
            } catch (InvocationTargetException e5) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e5);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public boolean m24136n() {
        C7985a c7985a = this.f29970m;
        return (c7985a == null || c7985a.m24242S0() == null) ? false : true;
    }

    /* renamed from: o */
    private void m24137o(Context context, AttributeSet attributeSet, int i2) {
        TypedArray typedArrayM24694h = C8032j.m24694h(context, attributeSet, C8918l.f34238h0, i2, f29964i, new int[0]);
        this.f29979v = typedArrayM24694h.getBoolean(C8918l.f34092N0, false);
        this.f29981x = (int) Math.ceil(typedArrayM24694h.getDimension(C8918l.f34008B0, (float) Math.ceil(C8033k.m24697b(getContext(), 48))));
        typedArrayM24694h.recycle();
    }

    /* renamed from: p */
    private void m24138p() {
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new C7978b());
        }
    }

    /* renamed from: q */
    private void m24139q(int i2, int i3, int i4, int i5) {
        this.f29971n = new InsetDrawable((Drawable) this.f29970m, i2, i3, i4, i5);
    }

    private void setCloseIconHovered(boolean z) {
        if (this.f29977t != z) {
            this.f29977t = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.f29976s != z) {
            this.f29976s = z;
            refreshDrawableState();
        }
    }

    /* renamed from: u */
    private void m24140u() {
        if (this.f29971n != null) {
            this.f29971n = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            m24143y();
        }
    }

    /* renamed from: w */
    private void m24141w(C7985a c7985a) {
        if (c7985a != null) {
            c7985a.m24285o2(null);
        }
    }

    /* renamed from: x */
    private void m24142x() {
        if (m24136n() && m24148s() && this.f29973p != null) {
            C0311u.m2131i0(this, this.f29982y);
        } else {
            C0311u.m2131i0(this, null);
        }
    }

    /* renamed from: y */
    private void m24143y() {
        if (C8952b.f34450a) {
            m24144z();
            return;
        }
        this.f29970m.m24224J2(true);
        C0311u.m2139m0(this, getBackgroundDrawable());
        m24122A();
        m24134l();
    }

    /* renamed from: z */
    private void m24144z() {
        this.f29972o = new RippleDrawable(C8952b.m28522d(this.f29970m.m24265e1()), getBackgroundDrawable(), null);
        this.f29970m.m24224J2(false);
        C0311u.m2139m0(this, this.f29972o);
        m24122A();
    }

    @Override // com.google.android.material.chip.C7985a.a
    /* renamed from: a */
    public void mo24145a() {
        m24146k(this.f29981x);
        requestLayout();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return m24135m(motionEvent) || this.f29982y.m6105v(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f29982y.m6106w(keyEvent) || this.f29982y.m6090A() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // androidx.appcompat.widget.C0160e, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C7985a c7985a = this.f29970m;
        if ((c7985a == null || !c7985a.m24284o1()) ? false : this.f29970m.m24277k2(m24133j())) {
            invalidate();
        }
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f29971n;
        return insetDrawable == null ? this.f29970m : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            return c7985a.m24213G0();
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            return c7985a.m24216H0();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            return c7985a.m24219I0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            return Math.max(0.0f, c7985a.m24222J0());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f29970m;
    }

    public float getChipEndPadding() {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            return c7985a.m24225K0();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            return c7985a.m24228L0();
        }
        return null;
    }

    public float getChipIconSize() {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            return c7985a.m24230M0();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            return c7985a.m24232N0();
        }
        return null;
    }

    public float getChipMinHeight() {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            return c7985a.m24234O0();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            return c7985a.m24236P0();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            return c7985a.m24238Q0();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            return c7985a.m24240R0();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            return c7985a.m24242S0();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            return c7985a.m24244T0();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            return c7985a.m24246U0();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            return c7985a.m24248V0();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            return c7985a.m24250W0();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            return c7985a.m24254Y0();
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            return c7985a.m24258a1();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        if (this.f29982y.m6090A() == 1 || this.f29982y.m6107x() == 1) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public C8926h getHideMotionSpec() {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            return c7985a.m24259b1();
        }
        return null;
    }

    public float getIconEndPadding() {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            return c7985a.m24261c1();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            return c7985a.m24263d1();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            return c7985a.m24265e1();
        }
        return null;
    }

    public C8904k getShapeAppearanceModel() {
        return this.f29970m.m28272D();
    }

    public C8926h getShowMotionSpec() {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            return c7985a.m24267f1();
        }
        return null;
    }

    public float getTextEndPadding() {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            return c7985a.m24273i1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            return c7985a.m24275j1();
        }
        return 0.0f;
    }

    /* renamed from: k */
    public boolean m24146k(int i2) {
        this.f29981x = i2;
        if (!m24150v()) {
            if (this.f29971n != null) {
                m24140u();
            } else {
                m24143y();
            }
            return false;
        }
        int iMax = Math.max(0, i2 - this.f29970m.getIntrinsicHeight());
        int iMax2 = Math.max(0, i2 - this.f29970m.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            if (this.f29971n != null) {
                m24140u();
            } else {
                m24143y();
            }
            return false;
        }
        int i3 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i4 = iMax > 0 ? iMax / 2 : 0;
        if (this.f29971n != null) {
            Rect rect = new Rect();
            this.f29971n.getPadding(rect);
            if (rect.top == i4 && rect.bottom == i4 && rect.left == i3 && rect.right == i3) {
                m24143y();
                return true;
            }
        }
        if (Build.VERSION.SDK_INT >= 16) {
            if (getMinHeight() != i2) {
                setMinHeight(i2);
            }
            if (getMinWidth() != i2) {
                setMinWidth(i2);
            }
        } else {
            setMinHeight(i2);
            setMinWidth(i2);
        }
        m24139q(i3, i4, i3, i4);
        m24143y();
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C8901h.m28312f(this, this.f29970m);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(iArrOnCreateDrawableState, f29966k);
        }
        if (m24147r()) {
            CheckBox.mergeDrawableStates(iArrOnCreateDrawableState, f29967l);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z, int i2, Rect rect) {
        super.onFocusChanged(z, i2, rect);
        this.f29982y.m6094I(z, i2, rect);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (m24147r() || isClickable()) {
            accessibilityNodeInfo.setClassName(m24147r() ? "android.widget.CompoundButton" : "android.widget.Button");
        } else {
            accessibilityNodeInfo.setClassName("android.view.View");
        }
        accessibilityNodeInfo.setCheckable(m24147r());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            C0289c.m1949y0(accessibilityNodeInfo).m1975b0(C0289c.c.m2017f(chipGroup.m24661b(this), 1, chipGroup.mo24163c() ? chipGroup.m24165n(this) : -1, 1, false, isChecked()));
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i2) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(17)
    public void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        if (this.f29980w != i2) {
            this.f29980w = i2;
            m24122A();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 != 3) goto L22;
     */
    @Override // android.widget.TextView, android.view.View
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L39
            if (r0 == r3) goto L2b
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L34
            goto L40
        L21:
            boolean r0 = r5.f29976s
            if (r0 == 0) goto L40
            if (r1 != 0) goto L3e
            r5.setCloseIconPressed(r2)
            goto L3e
        L2b:
            boolean r0 = r5.f29976s
            if (r0 == 0) goto L34
            r5.m24149t()
            r0 = 1
            goto L35
        L34:
            r0 = 0
        L35:
            r5.setCloseIconPressed(r2)
            goto L41
        L39:
            if (r1 == 0) goto L40
            r5.setCloseIconPressed(r3)
        L3e:
            r0 = 1
            goto L41
        L40:
            r0 = 0
        L41:
            if (r0 != 0) goto L49
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L4a
        L49:
            r2 = 1
        L4a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: r */
    public boolean m24147r() {
        C7985a c7985a = this.f29970m;
        return c7985a != null && c7985a.m24282n1();
    }

    /* renamed from: s */
    public boolean m24148s() {
        C7985a c7985a = this.f29970m;
        return c7985a != null && c7985a.m24286p1();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f29972o) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.C0160e, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f29972o) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.C0160e, android.view.View
    public void setBackgroundResource(int i2) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            c7985a.m24297w1(z);
        }
    }

    public void setCheckableResource(int i2) {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            c7985a.m24299x1(i2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        C7985a c7985a = this.f29970m;
        if (c7985a == null) {
            this.f29975r = z;
            return;
        }
        if (c7985a.m24282n1()) {
            boolean zIsChecked = isChecked();
            super.setChecked(z);
            if (zIsChecked == z || (onCheckedChangeListener = this.f29974q) == null) {
                return;
            }
            onCheckedChangeListener.onCheckedChanged(this, z);
        }
    }

    public void setCheckedIcon(Drawable drawable) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            c7985a.m24301y1(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        setCheckedIconVisible(i2);
    }

    public void setCheckedIconResource(int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            c7985a.m24303z1(i2);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            c7985a.m24201A1(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i2) {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            c7985a.m24203B1(i2);
        }
    }

    public void setCheckedIconVisible(int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            c7985a.m24205C1(i2);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            c7985a.m24209E1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i2) {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            c7985a.m24211F1(i2);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f2) {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            c7985a.m24214G1(f2);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i2) {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            c7985a.m24217H1(i2);
        }
    }

    public void setChipDrawable(C7985a c7985a) {
        C7985a c7985a2 = this.f29970m;
        if (c7985a2 != c7985a) {
            m24141w(c7985a2);
            this.f29970m = c7985a;
            c7985a.m24304z2(false);
            m24132i(this.f29970m);
            m24146k(this.f29981x);
        }
    }

    public void setChipEndPadding(float f2) {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            c7985a.m24220I1(f2);
        }
    }

    public void setChipEndPaddingResource(int i2) {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            c7985a.m24223J1(i2);
        }
    }

    public void setChipIcon(Drawable drawable) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            c7985a.m24226K1(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        setChipIconVisible(i2);
    }

    public void setChipIconResource(int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            c7985a.m24229L1(i2);
        }
    }

    public void setChipIconSize(float f2) {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            c7985a.m24231M1(f2);
        }
    }

    public void setChipIconSizeResource(int i2) {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            c7985a.m24233N1(i2);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            c7985a.m24235O1(colorStateList);
        }
    }

    public void setChipIconTintResource(int i2) {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            c7985a.m24237P1(i2);
        }
    }

    public void setChipIconVisible(int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            c7985a.m24239Q1(i2);
        }
    }

    public void setChipMinHeight(float f2) {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            c7985a.m24243S1(f2);
        }
    }

    public void setChipMinHeightResource(int i2) {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            c7985a.m24245T1(i2);
        }
    }

    public void setChipStartPadding(float f2) {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            c7985a.m24247U1(f2);
        }
    }

    public void setChipStartPaddingResource(int i2) {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            c7985a.m24249V1(i2);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            c7985a.m24251W1(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i2) {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            c7985a.m24253X1(i2);
        }
    }

    public void setChipStrokeWidth(float f2) {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            c7985a.m24255Y1(f2);
        }
    }

    public void setChipStrokeWidthResource(int i2) {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            c7985a.m24257Z1(i2);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i2) {
        setText(getResources().getString(i2));
    }

    public void setCloseIcon(Drawable drawable) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            c7985a.m24260b2(drawable);
        }
        m24142x();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            c7985a.m24262c2(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        setCloseIconVisible(i2);
    }

    public void setCloseIconEndPadding(float f2) {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            c7985a.m24264d2(f2);
        }
    }

    public void setCloseIconEndPaddingResource(int i2) {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            c7985a.m24266e2(i2);
        }
    }

    public void setCloseIconResource(int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            c7985a.m24268f2(i2);
        }
        m24142x();
    }

    public void setCloseIconSize(float f2) {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            c7985a.m24270g2(f2);
        }
    }

    public void setCloseIconSizeResource(int i2) {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            c7985a.m24272h2(i2);
        }
    }

    public void setCloseIconStartPadding(float f2) {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            c7985a.m24274i2(f2);
        }
    }

    public void setCloseIconStartPaddingResource(int i2) {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            c7985a.m24276j2(i2);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            c7985a.m24279l2(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i2) {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            c7985a.m24280m2(i2);
        }
    }

    public void setCloseIconVisible(int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        setCloseIconVisible(getResources().getBoolean(i2));
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i4 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i2, i3, i4, i5);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i4 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i2, i3, i4, i5);
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            c7985a.m28283W(f2);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f29970m == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            c7985a.m24287p2(truncateAt);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.f29979v = z;
        m24146k(this.f29981x);
    }

    @Override // android.widget.TextView
    public void setGravity(int i2) {
        if (i2 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i2);
        }
    }

    public void setHideMotionSpec(C8926h c8926h) {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            c7985a.m24288q2(c8926h);
        }
    }

    public void setHideMotionSpecResource(int i2) {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            c7985a.m24290r2(i2);
        }
    }

    public void setIconEndPadding(float f2) {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            c7985a.m24291s2(f2);
        }
    }

    public void setIconEndPaddingResource(int i2) {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            c7985a.m24292t2(i2);
        }
    }

    public void setIconStartPadding(float f2) {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            c7985a.m24295u2(f2);
        }
    }

    public void setIconStartPaddingResource(int i2) {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            c7985a.m24296v2(i2);
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i2) {
        if (this.f29970m != null && Build.VERSION.SDK_INT >= 17) {
            super.setLayoutDirection(i2);
        }
    }

    @Override // android.widget.TextView
    public void setLines(int i2) {
        if (i2 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i2);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i2) {
        if (i2 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i2);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i2) {
        super.setMaxWidth(i2);
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            c7985a.m24298w2(i2);
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i2) {
        if (i2 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i2);
    }

    void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f29974q = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f29973p = onClickListener;
        m24142x();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            c7985a.m24300x2(colorStateList);
        }
        if (this.f29970m.m24278l1()) {
            return;
        }
        m24144z();
    }

    public void setRippleColorResource(int i2) {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            c7985a.m24302y2(i2);
            if (this.f29970m.m24278l1()) {
                return;
            }
            m24144z();
        }
    }

    @Override // p241e.p254e.p256b.p271c.p272a0.InterfaceC8907n
    public void setShapeAppearanceModel(C8904k c8904k) {
        this.f29970m.setShapeAppearanceModel(c8904k);
    }

    public void setShowMotionSpec(C8926h c8926h) {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            c7985a.m24202A2(c8926h);
        }
    }

    public void setShowMotionSpecResource(int i2) {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            c7985a.m24204B2(i2);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (!z) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        C7985a c7985a = this.f29970m;
        if (c7985a == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        super.setText(c7985a.m24227K2() ? null : charSequence, bufferType);
        C7985a c7985a2 = this.f29970m;
        if (c7985a2 != null) {
            c7985a2.m24206C2(charSequence);
        }
    }

    public void setTextAppearance(C8948d c8948d) {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            c7985a.m24208D2(c8948d);
        }
        m24123B();
    }

    public void setTextAppearanceResource(int i2) {
        setTextAppearance(getContext(), i2);
    }

    public void setTextEndPadding(float f2) {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            c7985a.m24212F2(f2);
        }
    }

    public void setTextEndPaddingResource(int i2) {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            c7985a.m24215G2(i2);
        }
    }

    public void setTextStartPadding(float f2) {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            c7985a.m24218H2(f2);
        }
    }

    public void setTextStartPaddingResource(int i2) {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            c7985a.m24221I2(i2);
        }
    }

    /* renamed from: t */
    public boolean m24149t() {
        boolean z = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f29973p;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z = true;
        }
        this.f29982y.m6103U(1, 1);
        return z;
    }

    /* renamed from: v */
    public boolean m24150v() {
        return this.f29979v;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Chip(Context context, AttributeSet attributeSet, int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i3 = f29964i;
        super(C8079a.m24906c(context, attributeSet, i2, i3), attributeSet, i2);
        this.f29983z = new Rect();
        this.f29968A = new RectF();
        this.f29969B = new C7977a();
        Context context2 = getContext();
        m24124C(attributeSet);
        C7985a c7985aM24197w0 = C7985a.m24197w0(context2, attributeSet, i2, i3);
        m24137o(context2, attributeSet, i2);
        setChipDrawable(c7985aM24197w0);
        c7985aM24197w0.m28283W(C0311u.m2152t(this));
        TypedArray typedArrayM24694h = C8032j.m24694h(context2, attributeSet, C8918l.f34238h0, i2, i3, new int[0]);
        if (Build.VERSION.SDK_INT < 23) {
            setTextColor(C8947c.m28499a(context2, typedArrayM24694h, C8918l.f34252j0));
        }
        boolean zHasValue = typedArrayM24694h.hasValue(C8918l.f34127S0);
        typedArrayM24694h.recycle();
        this.f29982y = new C7979c(this);
        m24142x();
        if (!zHasValue) {
            m24138p();
        }
        setChecked(this.f29975r);
        setText(c7985aM24197w0.m24269g1());
        setEllipsize(c7985aM24197w0.m24258a1());
        setIncludeFontPadding(false);
        m24123B();
        if (!this.f29970m.m24227K2()) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        m24122A();
        if (m24150v()) {
            setMinHeight(this.f29981x);
        }
        this.f29980w = C0311u.m2162y(this);
    }

    public void setCloseIconVisible(boolean z) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            c7985a.m24283n2(z);
        }
        m24142x();
    }

    public void setCheckedIconVisible(boolean z) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            c7985a.m24207D1(z);
        }
    }

    public void setChipIconVisible(boolean z) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            c7985a.m24241R1(z);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            c7985a.m24210E2(i2);
        }
        m24123B();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i2) {
        super.setTextAppearance(i2);
        C7985a c7985a = this.f29970m;
        if (c7985a != null) {
            c7985a.m24210E2(i2);
        }
        m24123B();
    }
}
