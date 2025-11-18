package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

/* compiled from: WrappedDrawableApi21.java */
/* renamed from: androidx.core.graphics.drawable.e */
/* loaded from: classes.dex */
class C0269e extends C0268d {

    /* renamed from: m */
    private static Method f2246m;

    C0269e(Drawable drawable) {
        super(drawable);
        m1828g();
    }

    /* renamed from: g */
    private void m1828g() {
        if (f2246m == null) {
            try {
                f2246m = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e2) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e2);
            }
        }
    }

    @Override // androidx.core.graphics.drawable.C0268d
    /* renamed from: c */
    protected boolean mo1827c() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f2245l;
        return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
    }

    @Override // android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        return this.f2245l.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f2245l.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isProjected() {
        Method method;
        Drawable drawable = this.f2245l;
        if (drawable != null && (method = f2246m) != null) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception e2) {
                Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e2);
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f2, float f3) {
        this.f2245l.setHotspot(f2, f3);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i2, int i3, int i4, int i5) {
        this.f2245l.setHotspotBounds(i2, i3, i4, i5);
    }

    @Override // androidx.core.graphics.drawable.C0268d, android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // androidx.core.graphics.drawable.C0268d, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0266b
    public void setTint(int i2) {
        if (mo1827c()) {
            super.setTint(i2);
        } else {
            this.f2245l.setTint(i2);
        }
    }

    @Override // androidx.core.graphics.drawable.C0268d, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0266b
    public void setTintList(ColorStateList colorStateList) {
        if (mo1827c()) {
            super.setTintList(colorStateList);
        } else {
            this.f2245l.setTintList(colorStateList);
        }
    }

    @Override // androidx.core.graphics.drawable.C0268d, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0266b
    public void setTintMode(PorterDuff.Mode mode) {
        if (mo1827c()) {
            super.setTintMode(mode);
        } else {
            this.f2245l.setTintMode(mode);
        }
    }

    C0269e(C0270f c0270f, Resources resources) {
        super(c0270f, resources);
        m1828g();
    }
}
