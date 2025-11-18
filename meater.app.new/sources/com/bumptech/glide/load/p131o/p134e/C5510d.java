package com.bumptech.glide.load.p131o.p134e;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.InterfaceC5404u;

/* compiled from: NonOwnedDrawableResource.java */
/* renamed from: com.bumptech.glide.load.o.e.d */
/* loaded from: classes.dex */
final class C5510d extends AbstractC5508b<Drawable> {
    private C5510d(Drawable drawable) {
        super(drawable);
    }

    /* renamed from: f */
    static InterfaceC5404u<Drawable> m10714f(Drawable drawable) {
        if (drawable != null) {
            return new C5510d(drawable);
        }
        return null;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5404u
    /* renamed from: c */
    public void mo10340c() {
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5404u
    /* renamed from: d */
    public int mo10341d() {
        return Math.max(1, this.f13792f.getIntrinsicWidth() * this.f13792f.getIntrinsicHeight() * 4);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5404u
    /* renamed from: e */
    public Class<Drawable> mo10342e() {
        return this.f13792f.getClass();
    }
}
