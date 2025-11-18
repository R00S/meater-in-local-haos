package com.google.android.gms.internal.base;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* loaded from: classes2.dex */
public final class zae extends Drawable implements Drawable.Callback {

    /* renamed from: f */
    private int f27574f;

    /* renamed from: g */
    private long f27575g;

    /* renamed from: h */
    private int f27576h;

    /* renamed from: i */
    private int f27577i;

    /* renamed from: j */
    private int f27578j;

    /* renamed from: k */
    private int f27579k;

    /* renamed from: l */
    private boolean f27580l;

    /* renamed from: m */
    private boolean f27581m;

    /* renamed from: n */
    private Drawable f27582n;

    /* renamed from: o */
    private Drawable f27583o;

    /* renamed from: p */
    private boolean f27584p;

    /* renamed from: q */
    private boolean f27585q;

    /* renamed from: r */
    private boolean f27586r;

    /* renamed from: s */
    private int f27587s;

    /* renamed from: a */
    private final boolean m20897a() {
        if (!this.f27584p) {
            this.f27585q = (this.f27582n.getConstantState() == null || this.f27583o.getConstantState() == null) ? false : true;
            this.f27584p = true;
        }
        return this.f27585q;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i2 = this.f27574f;
        boolean z = false;
        if (i2 == 1) {
            this.f27575g = SystemClock.uptimeMillis();
            this.f27574f = 2;
        } else if (i2 == 2 && this.f27575g >= 0) {
            float fUptimeMillis = (SystemClock.uptimeMillis() - this.f27575g) / this.f27578j;
            boolean z2 = fUptimeMillis >= 1.0f;
            if (z2) {
                this.f27574f = 0;
            }
            this.f27579k = (int) ((this.f27576h * Math.min(fUptimeMillis, 1.0f)) + 0.0f);
            z = z2;
        } else {
            z = true;
        }
        int i3 = this.f27579k;
        boolean z3 = this.f27580l;
        Drawable drawable = this.f27582n;
        Drawable drawable2 = this.f27583o;
        if (z) {
            if (!z3 || i3 == 0) {
                drawable.draw(canvas);
            }
            int i4 = this.f27577i;
            if (i3 == i4) {
                drawable2.setAlpha(i4);
                drawable2.draw(canvas);
                return;
            }
            return;
        }
        if (z3) {
            drawable.setAlpha(this.f27577i - i3);
        }
        drawable.draw(canvas);
        if (z3) {
            drawable.setAlpha(this.f27577i);
        }
        if (i3 > 0) {
            drawable2.setAlpha(i3);
            drawable2.draw(canvas);
            drawable2.setAlpha(this.f27577i);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        super.getChangingConfigurations();
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (!m20897a()) {
            return null;
        }
        getChangingConfigurations();
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return Math.max(this.f27582n.getIntrinsicHeight(), this.f27583o.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.max(this.f27582n.getIntrinsicWidth(), this.f27583o.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (!this.f27586r) {
            this.f27587s = Drawable.resolveOpacity(this.f27582n.getOpacity(), this.f27583o.getOpacity());
            this.f27586r = true;
        }
        return this.f27587s;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f27581m && super.mutate() == this) {
            if (!m20897a()) {
                throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
            }
            this.f27582n.mutate();
            this.f27583o.mutate();
            this.f27581m = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        this.f27582n.setBounds(rect);
        this.f27583o.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        if (this.f27579k == this.f27577i) {
            this.f27579k = i2;
        }
        this.f27577i = i2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f27582n.setColorFilter(colorFilter);
        this.f27583o.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
