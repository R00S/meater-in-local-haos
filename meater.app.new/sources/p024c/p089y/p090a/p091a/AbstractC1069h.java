package p024c.p089y.p090a.p091a;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.C0265a;
import androidx.core.graphics.drawable.InterfaceC0266b;

/* compiled from: VectorDrawableCommon.java */
/* renamed from: c.y.a.a.h */
/* loaded from: classes.dex */
abstract class AbstractC1069h extends Drawable implements InterfaceC0266b {

    /* renamed from: f */
    Drawable f6983f;

    AbstractC1069h() {
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f6983f;
        if (drawable != null) {
            C0265a.m1804a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        Drawable drawable = this.f6983f;
        if (drawable != null) {
            drawable.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        Drawable drawable = this.f6983f;
        return drawable != null ? drawable.getCurrent() : super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        Drawable drawable = this.f6983f;
        return drawable != null ? drawable.getMinimumHeight() : super.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        Drawable drawable = this.f6983f;
        return drawable != null ? drawable.getMinimumWidth() : super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Drawable drawable = this.f6983f;
        return drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        Drawable drawable = this.f6983f;
        return drawable != null ? drawable.getState() : super.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        Drawable drawable = this.f6983f;
        return drawable != null ? drawable.getTransparentRegion() : super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        Drawable drawable = this.f6983f;
        if (drawable != null) {
            C0265a.m1812i(drawable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i2) {
        Drawable drawable = this.f6983f;
        return drawable != null ? drawable.setLevel(i2) : super.onLevelChange(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i2) {
        Drawable drawable = this.f6983f;
        if (drawable != null) {
            drawable.setChangingConfigurations(i2);
        } else {
            super.setChangingConfigurations(i2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i2, PorterDuff.Mode mode) {
        Drawable drawable = this.f6983f;
        if (drawable != null) {
            drawable.setColorFilter(i2, mode);
        } else {
            super.setColorFilter(i2, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        Drawable drawable = this.f6983f;
        if (drawable != null) {
            drawable.setFilterBitmap(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f2, float f3) {
        Drawable drawable = this.f6983f;
        if (drawable != null) {
            C0265a.m1814k(drawable, f2, f3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i2, int i3, int i4, int i5) {
        Drawable drawable = this.f6983f;
        if (drawable != null) {
            C0265a.m1815l(drawable, i2, i3, i4, i5);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        Drawable drawable = this.f6983f;
        return drawable != null ? drawable.setState(iArr) : super.setState(iArr);
    }
}
