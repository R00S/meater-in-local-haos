package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.view.InterfaceC0310t;
import androidx.core.widget.InterfaceC0333n;

/* loaded from: classes.dex */
public class AppCompatImageView extends ImageView implements InterfaceC0310t, InterfaceC0333n {

    /* renamed from: f */
    private final C0158d f801f;

    /* renamed from: g */
    private final C0174l f802g;

    public AppCompatImageView(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0158d c0158d = this.f801f;
        if (c0158d != null) {
            c0158d.m918b();
        }
        C0174l c0174l = this.f802g;
        if (c0174l != null) {
            c0174l.m1060b();
        }
    }

    @Override // androidx.core.view.InterfaceC0310t
    public ColorStateList getSupportBackgroundTintList() {
        C0158d c0158d = this.f801f;
        if (c0158d != null) {
            return c0158d.m919c();
        }
        return null;
    }

    @Override // androidx.core.view.InterfaceC0310t
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0158d c0158d = this.f801f;
        if (c0158d != null) {
            return c0158d.m920d();
        }
        return null;
    }

    @Override // androidx.core.widget.InterfaceC0333n
    public ColorStateList getSupportImageTintList() {
        C0174l c0174l = this.f802g;
        if (c0174l != null) {
            return c0174l.m1061c();
        }
        return null;
    }

    @Override // androidx.core.widget.InterfaceC0333n
    public PorterDuff.Mode getSupportImageTintMode() {
        C0174l c0174l = this.f802g;
        if (c0174l != null) {
            return c0174l.m1062d();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f802g.m1063e() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0158d c0158d = this.f801f;
        if (c0158d != null) {
            c0158d.m922f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0158d c0158d = this.f801f;
        if (c0158d != null) {
            c0158d.m923g(i2);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0174l c0174l = this.f802g;
        if (c0174l != null) {
            c0174l.m1060b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C0174l c0174l = this.f802g;
        if (c0174l != null) {
            c0174l.m1060b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i2) {
        C0174l c0174l = this.f802g;
        if (c0174l != null) {
            c0174l.m1065g(i2);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0174l c0174l = this.f802g;
        if (c0174l != null) {
            c0174l.m1060b();
        }
    }

    @Override // androidx.core.view.InterfaceC0310t
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0158d c0158d = this.f801f;
        if (c0158d != null) {
            c0158d.m925i(colorStateList);
        }
    }

    @Override // androidx.core.view.InterfaceC0310t
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0158d c0158d = this.f801f;
        if (c0158d != null) {
            c0158d.m926j(mode);
        }
    }

    @Override // androidx.core.widget.InterfaceC0333n
    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0174l c0174l = this.f802g;
        if (c0174l != null) {
            c0174l.m1066h(colorStateList);
        }
    }

    @Override // androidx.core.widget.InterfaceC0333n
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0174l c0174l = this.f802g;
        if (c0174l != null) {
            c0174l.m1067i(mode);
        }
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet, int i2) {
        super(C0179n0.m1077b(context), attributeSet, i2);
        C0175l0.m1068a(this, getContext());
        C0158d c0158d = new C0158d(this);
        this.f801f = c0158d;
        c0158d.m921e(attributeSet, i2);
        C0174l c0174l = new C0174l(this);
        this.f802g = c0174l;
        c0174l.m1064f(attributeSet, i2);
    }
}
