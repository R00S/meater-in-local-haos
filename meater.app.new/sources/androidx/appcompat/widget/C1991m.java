package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* compiled from: AppCompatImageButton.java */
/* renamed from: androidx.appcompat.widget.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1991m extends ImageButton {

    /* renamed from: B, reason: collision with root package name */
    private final C1983e f21716B;

    /* renamed from: C, reason: collision with root package name */
    private final C1992n f21717C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f21718D;

    public C1991m(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.f42381D);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C1983e c1983e = this.f21716B;
        if (c1983e != null) {
            c1983e.b();
        }
        C1992n c1992n = this.f21717C;
        if (c1992n != null) {
            c1992n.c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1983e c1983e = this.f21716B;
        if (c1983e != null) {
            return c1983e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1983e c1983e = this.f21716B;
        if (c1983e != null) {
            return c1983e.d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C1992n c1992n = this.f21717C;
        if (c1992n != null) {
            return c1992n.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C1992n c1992n = this.f21717C;
        if (c1992n != null) {
            return c1992n.e();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f21717C.f() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1983e c1983e = this.f21716B;
        if (c1983e != null) {
            c1983e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C1983e c1983e = this.f21716B;
        if (c1983e != null) {
            c1983e.g(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C1992n c1992n = this.f21717C;
        if (c1992n != null) {
            c1992n.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C1992n c1992n = this.f21717C;
        if (c1992n != null && drawable != null && !this.f21718D) {
            c1992n.h(drawable);
        }
        super.setImageDrawable(drawable);
        C1992n c1992n2 = this.f21717C;
        if (c1992n2 != null) {
            c1992n2.c();
            if (this.f21718D) {
                return;
            }
            this.f21717C.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.f21718D = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        this.f21717C.i(i10);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C1992n c1992n = this.f21717C;
        if (c1992n != null) {
            c1992n.c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1983e c1983e = this.f21716B;
        if (c1983e != null) {
            c1983e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1983e c1983e = this.f21716B;
        if (c1983e != null) {
            c1983e.j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C1992n c1992n = this.f21717C;
        if (c1992n != null) {
            c1992n.j(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C1992n c1992n = this.f21717C;
        if (c1992n != null) {
            c1992n.k(mode);
        }
    }

    public C1991m(Context context, AttributeSet attributeSet, int i10) {
        super(X.b(context), attributeSet, i10);
        this.f21718D = false;
        V.a(this, getContext());
        C1983e c1983e = new C1983e(this);
        this.f21716B = c1983e;
        c1983e.e(attributeSet, i10);
        C1992n c1992n = new C1992n(this);
        this.f21717C = c1992n;
        c1992n.g(attributeSet, i10);
    }
}
