package com.bumptech.glide.load.p131o.p132c;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.InterfaceC5400q;
import com.bumptech.glide.load.engine.InterfaceC5404u;
import com.bumptech.glide.load.engine.p126z.InterfaceC5413e;
import com.bumptech.glide.p145r.C5596j;
import com.bumptech.glide.p145r.C5597k;

/* compiled from: BitmapResource.java */
/* renamed from: com.bumptech.glide.load.o.c.d */
/* loaded from: classes.dex */
public class C5483d implements InterfaceC5404u<Bitmap>, InterfaceC5400q {

    /* renamed from: f */
    private final Bitmap f13716f;

    /* renamed from: g */
    private final InterfaceC5413e f13717g;

    public C5483d(Bitmap bitmap, InterfaceC5413e interfaceC5413e) {
        this.f13716f = (Bitmap) C5596j.m11043e(bitmap, "Bitmap must not be null");
        this.f13717g = (InterfaceC5413e) C5596j.m11043e(interfaceC5413e, "BitmapPool must not be null");
    }

    /* renamed from: f */
    public static C5483d m10607f(Bitmap bitmap, InterfaceC5413e interfaceC5413e) {
        if (bitmap == null) {
            return null;
        }
        return new C5483d(bitmap, interfaceC5413e);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5400q
    /* renamed from: a */
    public void mo10346a() {
        this.f13716f.prepareToDraw();
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5404u
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Bitmap get() {
        return this.f13716f;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5404u
    /* renamed from: c */
    public void mo10340c() {
        this.f13717g.mo10387c(this.f13716f);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5404u
    /* renamed from: d */
    public int mo10341d() {
        return C5597k.m11051h(this.f13716f);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5404u
    /* renamed from: e */
    public Class<Bitmap> mo10342e() {
        return Bitmap.class;
    }
}
