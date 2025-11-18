package com.bumptech.glide.load.p131o.p132c;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.engine.InterfaceC5400q;
import com.bumptech.glide.load.engine.InterfaceC5404u;
import com.bumptech.glide.p145r.C5596j;

/* compiled from: LazyBitmapDrawableResource.java */
/* renamed from: com.bumptech.glide.load.o.c.r */
/* loaded from: classes.dex */
public final class C5497r implements InterfaceC5404u<BitmapDrawable>, InterfaceC5400q {

    /* renamed from: f */
    private final Resources f13759f;

    /* renamed from: g */
    private final InterfaceC5404u<Bitmap> f13760g;

    private C5497r(Resources resources, InterfaceC5404u<Bitmap> interfaceC5404u) {
        this.f13759f = (Resources) C5596j.m11042d(resources);
        this.f13760g = (InterfaceC5404u) C5596j.m11042d(interfaceC5404u);
    }

    /* renamed from: f */
    public static InterfaceC5404u<BitmapDrawable> m10661f(Resources resources, InterfaceC5404u<Bitmap> interfaceC5404u) {
        if (interfaceC5404u == null) {
            return null;
        }
        return new C5497r(resources, interfaceC5404u);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5400q
    /* renamed from: a */
    public void mo10346a() {
        InterfaceC5404u<Bitmap> interfaceC5404u = this.f13760g;
        if (interfaceC5404u instanceof InterfaceC5400q) {
            ((InterfaceC5400q) interfaceC5404u).mo10346a();
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5404u
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f13759f, this.f13760g.get());
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5404u
    /* renamed from: c */
    public void mo10340c() {
        this.f13760g.mo10340c();
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5404u
    /* renamed from: d */
    public int mo10341d() {
        return this.f13760g.mo10341d();
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5404u
    /* renamed from: e */
    public Class<BitmapDrawable> mo10342e() {
        return BitmapDrawable.class;
    }
}
