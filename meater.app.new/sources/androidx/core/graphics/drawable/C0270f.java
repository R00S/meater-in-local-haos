package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* compiled from: WrappedDrawableState.java */
/* renamed from: androidx.core.graphics.drawable.f */
/* loaded from: classes.dex */
final class C0270f extends Drawable.ConstantState {

    /* renamed from: a */
    int f2247a;

    /* renamed from: b */
    Drawable.ConstantState f2248b;

    /* renamed from: c */
    ColorStateList f2249c;

    /* renamed from: d */
    PorterDuff.Mode f2250d;

    C0270f(C0270f c0270f) {
        this.f2249c = null;
        this.f2250d = C0268d.f2239f;
        if (c0270f != null) {
            this.f2247a = c0270f.f2247a;
            this.f2248b = c0270f.f2248b;
            this.f2249c = c0270f.f2249c;
            this.f2250d = c0270f.f2250d;
        }
    }

    /* renamed from: a */
    boolean m1829a() {
        return this.f2248b != null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i2 = this.f2247a;
        Drawable.ConstantState constantState = this.f2248b;
        return i2 | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        return Build.VERSION.SDK_INT >= 21 ? new C0269e(this, resources) : new C0268d(this, resources);
    }
}
