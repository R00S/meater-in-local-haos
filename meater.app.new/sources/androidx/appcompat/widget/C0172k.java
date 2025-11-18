package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import androidx.core.view.InterfaceC0310t;
import androidx.core.widget.InterfaceC0333n;
import p024c.p025a.C0823a;

/* compiled from: AppCompatImageButton.java */
/* renamed from: androidx.appcompat.widget.k */
/* loaded from: classes.dex */
public class C0172k extends ImageButton implements InterfaceC0310t, InterfaceC0333n {

    /* renamed from: f */
    private final C0158d f1180f;

    /* renamed from: g */
    private final C0174l f1181g;

    public C0172k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0823a.f5014C);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0158d c0158d = this.f1180f;
        if (c0158d != null) {
            c0158d.m918b();
        }
        C0174l c0174l = this.f1181g;
        if (c0174l != null) {
            c0174l.m1060b();
        }
    }

    @Override // androidx.core.view.InterfaceC0310t
    public ColorStateList getSupportBackgroundTintList() {
        C0158d c0158d = this.f1180f;
        if (c0158d != null) {
            return c0158d.m919c();
        }
        return null;
    }

    @Override // androidx.core.view.InterfaceC0310t
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0158d c0158d = this.f1180f;
        if (c0158d != null) {
            return c0158d.m920d();
        }
        return null;
    }

    @Override // androidx.core.widget.InterfaceC0333n
    public ColorStateList getSupportImageTintList() {
        C0174l c0174l = this.f1181g;
        if (c0174l != null) {
            return c0174l.m1061c();
        }
        return null;
    }

    @Override // androidx.core.widget.InterfaceC0333n
    public PorterDuff.Mode getSupportImageTintMode() {
        C0174l c0174l = this.f1181g;
        if (c0174l != null) {
            return c0174l.m1062d();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f1181g.m1063e() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0158d c0158d = this.f1180f;
        if (c0158d != null) {
            c0158d.m922f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0158d c0158d = this.f1180f;
        if (c0158d != null) {
            c0158d.m923g(i2);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0174l c0174l = this.f1181g;
        if (c0174l != null) {
            c0174l.m1060b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C0174l c0174l = this.f1181g;
        if (c0174l != null) {
            c0174l.m1060b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i2) {
        this.f1181g.m1065g(i2);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0174l c0174l = this.f1181g;
        if (c0174l != null) {
            c0174l.m1060b();
        }
    }

    @Override // androidx.core.view.InterfaceC0310t
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0158d c0158d = this.f1180f;
        if (c0158d != null) {
            c0158d.m925i(colorStateList);
        }
    }

    @Override // androidx.core.view.InterfaceC0310t
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0158d c0158d = this.f1180f;
        if (c0158d != null) {
            c0158d.m926j(mode);
        }
    }

    @Override // androidx.core.widget.InterfaceC0333n
    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0174l c0174l = this.f1181g;
        if (c0174l != null) {
            c0174l.m1066h(colorStateList);
        }
    }

    @Override // androidx.core.widget.InterfaceC0333n
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0174l c0174l = this.f1181g;
        if (c0174l != null) {
            c0174l.m1067i(mode);
        }
    }

    public C0172k(Context context, AttributeSet attributeSet, int i2) {
        super(C0179n0.m1077b(context), attributeSet, i2);
        C0175l0.m1068a(this, getContext());
        C0158d c0158d = new C0158d(this);
        this.f1180f = c0158d;
        c0158d.m921e(attributeSet, i2);
        C0174l c0174l = new C0174l(this);
        this.f1181g = c0174l;
        c0174l.m1064f(attributeSet, i2);
    }
}
