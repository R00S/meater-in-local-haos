package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* compiled from: WrappedDrawableApi14.java */
/* renamed from: androidx.core.graphics.drawable.d */
/* loaded from: classes.dex */
class C0268d extends Drawable implements Drawable.Callback, InterfaceC0267c, InterfaceC0266b {

    /* renamed from: f */
    static final PorterDuff.Mode f2239f = PorterDuff.Mode.SRC_IN;

    /* renamed from: g */
    private int f2240g;

    /* renamed from: h */
    private PorterDuff.Mode f2241h;

    /* renamed from: i */
    private boolean f2242i;

    /* renamed from: j */
    C0270f f2243j;

    /* renamed from: k */
    private boolean f2244k;

    /* renamed from: l */
    Drawable f2245l;

    C0268d(C0270f c0270f, Resources resources) {
        this.f2243j = c0270f;
        m1825e(resources);
    }

    /* renamed from: d */
    private C0270f m1824d() {
        return new C0270f(this.f2243j);
    }

    /* renamed from: e */
    private void m1825e(Resources resources) {
        Drawable.ConstantState constantState;
        C0270f c0270f = this.f2243j;
        if (c0270f == null || (constantState = c0270f.f2248b) == null) {
            return;
        }
        mo1822a(constantState.newDrawable(resources));
    }

    /* renamed from: f */
    private boolean m1826f(int[] iArr) {
        if (!mo1827c()) {
            return false;
        }
        C0270f c0270f = this.f2243j;
        ColorStateList colorStateList = c0270f.f2249c;
        PorterDuff.Mode mode = c0270f.f2250d;
        if (colorStateList == null || mode == null) {
            this.f2242i = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.f2242i || colorForState != this.f2240g || mode != this.f2241h) {
                setColorFilter(colorForState, mode);
                this.f2240g = colorForState;
                this.f2241h = mode;
                this.f2242i = true;
                return true;
            }
        }
        return false;
    }

    @Override // androidx.core.graphics.drawable.InterfaceC0267c
    /* renamed from: a */
    public final void mo1822a(Drawable drawable) {
        Drawable drawable2 = this.f2245l;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f2245l = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            C0270f c0270f = this.f2243j;
            if (c0270f != null) {
                c0270f.f2248b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    @Override // androidx.core.graphics.drawable.InterfaceC0267c
    /* renamed from: b */
    public final Drawable mo1823b() {
        return this.f2245l;
    }

    /* renamed from: c */
    protected boolean mo1827c() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f2245l.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        C0270f c0270f = this.f2243j;
        return changingConfigurations | (c0270f != null ? c0270f.getChangingConfigurations() : 0) | this.f2245l.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        C0270f c0270f = this.f2243j;
        if (c0270f == null || !c0270f.m1829a()) {
            return null;
        }
        this.f2243j.f2247a = getChangingConfigurations();
        return this.f2243j;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f2245l.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f2245l.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f2245l.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getLayoutDirection() {
        return C0265a.m1809f(this.f2245l);
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f2245l.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f2245l.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f2245l.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f2245l.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.f2245l.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f2245l.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return C0265a.m1811h(this.f2245l);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        C0270f c0270f;
        ColorStateList colorStateList = (!mo1827c() || (c0270f = this.f2243j) == null) ? null : c0270f.f2249c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f2245l.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f2245l.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f2244k && super.mutate() == this) {
            this.f2243j = m1824d();
            Drawable drawable = this.f2245l;
            if (drawable != null) {
                drawable.mutate();
            }
            C0270f c0270f = this.f2243j;
            if (c0270f != null) {
                Drawable drawable2 = this.f2245l;
                c0270f.f2248b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f2244k = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2245l;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i2) {
        return C0265a.m1816m(this.f2245l, i2);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i2) {
        return this.f2245l.setLevel(i2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        scheduleSelf(runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f2245l.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        C0265a.m1813j(this.f2245l, z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i2) {
        this.f2245l.setChangingConfigurations(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f2245l.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f2245l.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f2245l.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return m1826f(iArr) || this.f2245l.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0266b
    public void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0266b
    public void setTintList(ColorStateList colorStateList) {
        this.f2243j.f2249c = colorStateList;
        m1826f(getState());
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0266b
    public void setTintMode(PorterDuff.Mode mode) {
        this.f2243j.f2250d = mode;
        m1826f(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f2245l.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    C0268d(Drawable drawable) {
        this.f2243j = m1824d();
        mo1822a(drawable);
    }
}
