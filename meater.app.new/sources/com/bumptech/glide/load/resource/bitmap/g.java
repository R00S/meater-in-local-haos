package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import o6.InterfaceC4138b;
import o6.InterfaceC4139c;
import p6.InterfaceC4239d;

/* compiled from: BitmapResource.java */
/* loaded from: classes2.dex */
public class g implements InterfaceC4139c<Bitmap>, InterfaceC4138b {

    /* renamed from: B, reason: collision with root package name */
    private final Bitmap f33322B;

    /* renamed from: C, reason: collision with root package name */
    private final InterfaceC4239d f33323C;

    public g(Bitmap bitmap, InterfaceC4239d interfaceC4239d) {
        this.f33322B = (Bitmap) H6.k.e(bitmap, "Bitmap must not be null");
        this.f33323C = (InterfaceC4239d) H6.k.e(interfaceC4239d, "BitmapPool must not be null");
    }

    public static g f(Bitmap bitmap, InterfaceC4239d interfaceC4239d) {
        if (bitmap == null) {
            return null;
        }
        return new g(bitmap, interfaceC4239d);
    }

    @Override // o6.InterfaceC4139c
    public int a() {
        return H6.l.h(this.f33322B);
    }

    @Override // o6.InterfaceC4138b
    public void b() {
        this.f33322B.prepareToDraw();
    }

    @Override // o6.InterfaceC4139c
    public void c() {
        this.f33323C.c(this.f33322B);
    }

    @Override // o6.InterfaceC4139c
    public Class<Bitmap> d() {
        return Bitmap.class;
    }

    @Override // o6.InterfaceC4139c
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Bitmap get() {
        return this.f33322B;
    }
}
