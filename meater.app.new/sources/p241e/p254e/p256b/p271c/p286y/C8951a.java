package p241e.p254e.p256b.p271c.p286y;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.InterfaceC0266b;
import p241e.p254e.p256b.p271c.p272a0.C8900g;
import p241e.p254e.p256b.p271c.p272a0.C8904k;
import p241e.p254e.p256b.p271c.p272a0.InterfaceC8907n;

/* compiled from: RippleDrawableCompat.java */
/* renamed from: e.e.b.c.y.a */
/* loaded from: classes2.dex */
public class C8951a extends Drawable implements InterfaceC8907n, InterfaceC0266b {

    /* renamed from: f */
    private b f34447f;

    @Override // android.graphics.drawable.Drawable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8951a mutate() {
        this.f34447f = new b(this.f34447f);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        b bVar = this.f34447f;
        if (bVar.f34449b) {
            bVar.f34448a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f34447f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f34447f.f34448a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f34447f.f34448a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        if (this.f34447f.f34448a.setState(iArr)) {
            zOnStateChange = true;
        }
        boolean zM28523e = C8952b.m28523e(iArr);
        b bVar = this.f34447f;
        if (bVar.f34449b == zM28523e) {
            return zOnStateChange;
        }
        bVar.f34449b = zM28523e;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f34447f.f34448a.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f34447f.f34448a.setColorFilter(colorFilter);
    }

    @Override // p241e.p254e.p256b.p271c.p272a0.InterfaceC8907n
    public void setShapeAppearanceModel(C8904k c8904k) {
        this.f34447f.f34448a.setShapeAppearanceModel(c8904k);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0266b
    public void setTint(int i2) {
        this.f34447f.f34448a.setTint(i2);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0266b
    public void setTintList(ColorStateList colorStateList) {
        this.f34447f.f34448a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0266b
    public void setTintMode(PorterDuff.Mode mode) {
        this.f34447f.f34448a.setTintMode(mode);
    }

    public C8951a(C8904k c8904k) {
        this(new b(new C8900g(c8904k)));
    }

    /* compiled from: RippleDrawableCompat.java */
    /* renamed from: e.e.b.c.y.a$b */
    static final class b extends Drawable.ConstantState {

        /* renamed from: a */
        C8900g f34448a;

        /* renamed from: b */
        boolean f34449b;

        public b(C8900g c8900g) {
            this.f34448a = c8900g;
            this.f34449b = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C8951a newDrawable() {
            return new C8951a(new b(this));
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        public b(b bVar) {
            this.f34448a = (C8900g) bVar.f34448a.getConstantState().newDrawable();
            this.f34449b = bVar.f34449b;
        }
    }

    private C8951a(b bVar) {
        this.f34447f = bVar;
    }
}
