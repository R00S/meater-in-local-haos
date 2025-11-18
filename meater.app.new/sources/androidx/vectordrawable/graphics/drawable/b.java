package androidx.vectordrawable.graphics.drawable;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* compiled from: Animatable2Compat.java */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    Animatable2.AnimationCallback f29613a;

    /* compiled from: Animatable2Compat.java */
    class a extends Animatable2.AnimationCallback {
        a() {
        }

        @Override // android.graphics.drawable.Animatable2.AnimationCallback
        public void onAnimationEnd(Drawable drawable) {
            b.this.b(drawable);
        }

        @Override // android.graphics.drawable.Animatable2.AnimationCallback
        public void onAnimationStart(Drawable drawable) {
            b.this.c(drawable);
        }
    }

    Animatable2.AnimationCallback a() {
        if (this.f29613a == null) {
            this.f29613a = new a();
        }
        return this.f29613a;
    }

    public void b(Drawable drawable) {
    }

    public void c(Drawable drawable) {
    }
}
