package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import m6.C3972g;
import m6.InterfaceC3974i;
import o6.InterfaceC4139c;

/* compiled from: UnitBitmapDecoder.java */
/* loaded from: classes2.dex */
public final class C implements InterfaceC3974i<Bitmap, Bitmap> {
    @Override // m6.InterfaceC3974i
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC4139c<Bitmap> a(Bitmap bitmap, int i10, int i11, C3972g c3972g) {
        return new a(bitmap);
    }

    @Override // m6.InterfaceC3974i
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Bitmap bitmap, C3972g c3972g) {
        return true;
    }

    /* compiled from: UnitBitmapDecoder.java */
    private static final class a implements InterfaceC4139c<Bitmap> {

        /* renamed from: B, reason: collision with root package name */
        private final Bitmap f33297B;

        a(Bitmap bitmap) {
            this.f33297B = bitmap;
        }

        @Override // o6.InterfaceC4139c
        public int a() {
            return H6.l.h(this.f33297B);
        }

        @Override // o6.InterfaceC4139c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Bitmap get() {
            return this.f33297B;
        }

        @Override // o6.InterfaceC4139c
        public Class<Bitmap> d() {
            return Bitmap.class;
        }

        @Override // o6.InterfaceC4139c
        public void c() {
        }
    }
}
