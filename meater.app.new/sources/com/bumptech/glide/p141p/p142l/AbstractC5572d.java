package com.bumptech.glide.p141p.p142l;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.p141p.p143m.InterfaceC5582d;

/* compiled from: ImageViewTarget.java */
/* renamed from: com.bumptech.glide.p.l.d */
/* loaded from: classes.dex */
public abstract class AbstractC5572d<Z> extends AbstractC5578j<ImageView, Z> implements InterfaceC5582d.a {

    /* renamed from: m */
    private Animatable f13990m;

    public AbstractC5572d(ImageView imageView) {
        super(imageView);
    }

    /* renamed from: g */
    private void m10980g(Z z) {
        if (!(z instanceof Animatable)) {
            this.f13990m = null;
            return;
        }
        Animatable animatable = (Animatable) z;
        this.f13990m = animatable;
        animatable.start();
    }

    /* renamed from: i */
    private void m10981i(Z z) {
        mo10977h(z);
        m10980g(z);
    }

    @Override // com.bumptech.glide.p141p.p143m.InterfaceC5582d.a
    /* renamed from: a */
    public void mo10982a(Drawable drawable) {
        ((ImageView) this.f13999h).setImageDrawable(drawable);
    }

    @Override // com.bumptech.glide.p141p.p143m.InterfaceC5582d.a
    /* renamed from: b */
    public Drawable mo10983b() {
        return ((ImageView) this.f13999h).getDrawable();
    }

    /* renamed from: h */
    protected abstract void mo10977h(Z z);

    @Override // com.bumptech.glide.p141p.p142l.AbstractC5578j, com.bumptech.glide.p141p.p142l.AbstractC5569a, com.bumptech.glide.p141p.p142l.InterfaceC5577i
    public void onLoadCleared(Drawable drawable) {
        super.onLoadCleared(drawable);
        Animatable animatable = this.f13990m;
        if (animatable != null) {
            animatable.stop();
        }
        m10981i(null);
        mo10982a(drawable);
    }

    @Override // com.bumptech.glide.p141p.p142l.AbstractC5569a, com.bumptech.glide.p141p.p142l.InterfaceC5577i
    public void onLoadFailed(Drawable drawable) {
        super.onLoadFailed(drawable);
        m10981i(null);
        mo10982a(drawable);
    }

    @Override // com.bumptech.glide.p141p.p142l.AbstractC5578j, com.bumptech.glide.p141p.p142l.AbstractC5569a, com.bumptech.glide.p141p.p142l.InterfaceC5577i
    public void onLoadStarted(Drawable drawable) {
        super.onLoadStarted(drawable);
        m10981i(null);
        mo10982a(drawable);
    }

    @Override // com.bumptech.glide.p141p.p142l.InterfaceC5577i
    public void onResourceReady(Z z, InterfaceC5582d<? super Z> interfaceC5582d) {
        if (interfaceC5582d == null || !interfaceC5582d.mo11005a(z, this)) {
            m10981i(z);
        } else {
            m10980g(z);
        }
    }

    @Override // com.bumptech.glide.p141p.p142l.AbstractC5569a, com.bumptech.glide.p138m.InterfaceC5540i
    public void onStart() {
        Animatable animatable = this.f13990m;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // com.bumptech.glide.p141p.p142l.AbstractC5569a, com.bumptech.glide.p138m.InterfaceC5540i
    public void onStop() {
        Animatable animatable = this.f13990m;
        if (animatable != null) {
            animatable.stop();
        }
    }
}
