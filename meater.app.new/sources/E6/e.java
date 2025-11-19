package E6;

import F6.b;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: ImageViewTarget.java */
/* loaded from: classes2.dex */
public abstract class e<Z> extends j<ImageView, Z> implements b.a {

    /* renamed from: I, reason: collision with root package name */
    private Animatable f3995I;

    public e(ImageView imageView) {
        super(imageView);
    }

    private void p(Z z10) {
        if (!(z10 instanceof Animatable)) {
            this.f3995I = null;
            return;
        }
        Animatable animatable = (Animatable) z10;
        this.f3995I = animatable;
        animatable.start();
    }

    private void s(Z z10) {
        r(z10);
        p(z10);
    }

    @Override // E6.a, A6.l
    public void a() {
        Animatable animatable = this.f3995I;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // E6.a, A6.l
    public void b() {
        Animatable animatable = this.f3995I;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // E6.a, E6.i
    public void g(Drawable drawable) {
        super.g(drawable);
        s(null);
        q(drawable);
    }

    @Override // E6.j, E6.a, E6.i
    public void h(Drawable drawable) {
        super.h(drawable);
        s(null);
        q(drawable);
    }

    @Override // E6.i
    public void j(Z z10, F6.b<? super Z> bVar) {
        if (bVar == null || !bVar.a(z10, this)) {
            s(z10);
        } else {
            p(z10);
        }
    }

    @Override // E6.j, E6.a, E6.i
    public void k(Drawable drawable) {
        super.k(drawable);
        Animatable animatable = this.f3995I;
        if (animatable != null) {
            animatable.stop();
        }
        s(null);
        q(drawable);
    }

    public void q(Drawable drawable) {
        ((ImageView) this.f4000B).setImageDrawable(drawable);
    }

    protected abstract void r(Z z10);
}
