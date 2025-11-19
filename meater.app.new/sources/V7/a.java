package V7;

import X7.g;
import X7.k;
import X7.n;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: RippleDrawableCompat.java */
/* loaded from: classes2.dex */
public class a extends Drawable implements n {

    /* renamed from: B, reason: collision with root package name */
    private b f18149B;

    @Override // android.graphics.drawable.Drawable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public a mutate() {
        this.f18149B = new b(this.f18149B);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        b bVar = this.f18149B;
        if (bVar.f18151b) {
            bVar.f18150a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f18149B;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f18149B.f18150a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f18149B.f18150a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        if (this.f18149B.f18150a.setState(iArr)) {
            zOnStateChange = true;
        }
        boolean zE = V7.b.e(iArr);
        b bVar = this.f18149B;
        if (bVar.f18151b == zE) {
            return zOnStateChange;
        }
        bVar.f18151b = zE;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f18149B.f18150a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f18149B.f18150a.setColorFilter(colorFilter);
    }

    @Override // X7.n
    public void setShapeAppearanceModel(k kVar) {
        this.f18149B.f18150a.setShapeAppearanceModel(kVar);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        this.f18149B.f18150a.setTint(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f18149B.f18150a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f18149B.f18150a.setTintMode(mode);
    }

    public a(k kVar) {
        this(new b(new g(kVar)));
    }

    /* compiled from: RippleDrawableCompat.java */
    static final class b extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        g f18150a;

        /* renamed from: b, reason: collision with root package name */
        boolean f18151b;

        public b(g gVar) {
            this.f18150a = gVar;
            this.f18151b = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a newDrawable() {
            return new a(new b(this));
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        public b(b bVar) {
            this.f18150a = (g) bVar.f18150a.getConstantState().newDrawable();
            this.f18151b = bVar.f18151b;
        }
    }

    private a(b bVar) {
        this.f18149B = bVar;
    }
}
