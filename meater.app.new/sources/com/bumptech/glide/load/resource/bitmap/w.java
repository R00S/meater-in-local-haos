package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import o6.InterfaceC4138b;
import o6.InterfaceC4139c;

/* compiled from: LazyBitmapDrawableResource.java */
/* loaded from: classes2.dex */
public final class w implements InterfaceC4139c<BitmapDrawable>, InterfaceC4138b {

    /* renamed from: B, reason: collision with root package name */
    private final Resources f33376B;

    /* renamed from: C, reason: collision with root package name */
    private final InterfaceC4139c<Bitmap> f33377C;

    private w(Resources resources, InterfaceC4139c<Bitmap> interfaceC4139c) {
        this.f33376B = (Resources) H6.k.d(resources);
        this.f33377C = (InterfaceC4139c) H6.k.d(interfaceC4139c);
    }

    public static InterfaceC4139c<BitmapDrawable> f(Resources resources, InterfaceC4139c<Bitmap> interfaceC4139c) {
        if (interfaceC4139c == null) {
            return null;
        }
        return new w(resources, interfaceC4139c);
    }

    @Override // o6.InterfaceC4139c
    public int a() {
        return this.f33377C.a();
    }

    @Override // o6.InterfaceC4138b
    public void b() {
        InterfaceC4139c<Bitmap> interfaceC4139c = this.f33377C;
        if (interfaceC4139c instanceof InterfaceC4138b) {
            ((InterfaceC4138b) interfaceC4139c).b();
        }
    }

    @Override // o6.InterfaceC4139c
    public void c() {
        this.f33377C.c();
    }

    @Override // o6.InterfaceC4139c
    public Class<BitmapDrawable> d() {
        return BitmapDrawable.class;
    }

    @Override // o6.InterfaceC4139c
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f33376B, this.f33377C.get());
    }
}
