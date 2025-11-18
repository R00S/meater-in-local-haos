package com.bumptech.glide.load.p131o.p132c;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C5426i;
import com.bumptech.glide.load.InterfaceC5427j;
import com.bumptech.glide.load.engine.InterfaceC5404u;
import com.bumptech.glide.p145r.C5597k;

/* compiled from: UnitBitmapDecoder.java */
/* renamed from: com.bumptech.glide.load.o.c.x */
/* loaded from: classes.dex */
public final class C5503x implements InterfaceC5427j<Bitmap, Bitmap> {

    /* compiled from: UnitBitmapDecoder.java */
    /* renamed from: com.bumptech.glide.load.o.c.x$a */
    private static final class a implements InterfaceC5404u<Bitmap> {

        /* renamed from: f */
        private final Bitmap f13780f;

        a(Bitmap bitmap) {
            this.f13780f = bitmap;
        }

        @Override // com.bumptech.glide.load.engine.InterfaceC5404u
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Bitmap get() {
            return this.f13780f;
        }

        @Override // com.bumptech.glide.load.engine.InterfaceC5404u
        /* renamed from: c */
        public void mo10340c() {
        }

        @Override // com.bumptech.glide.load.engine.InterfaceC5404u
        /* renamed from: d */
        public int mo10341d() {
            return C5597k.m11051h(this.f13780f);
        }

        @Override // com.bumptech.glide.load.engine.InterfaceC5404u
        /* renamed from: e */
        public Class<Bitmap> mo10342e() {
            return Bitmap.class;
        }
    }

    @Override // com.bumptech.glide.load.InterfaceC5427j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC5404u<Bitmap> mo10453b(Bitmap bitmap, int i2, int i3, C5426i c5426i) {
        return new a(bitmap);
    }

    @Override // com.bumptech.glide.load.InterfaceC5427j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo10452a(Bitmap bitmap, C5426i c5426i) {
        return true;
    }
}
