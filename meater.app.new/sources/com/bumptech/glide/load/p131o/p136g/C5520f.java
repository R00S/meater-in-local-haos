package com.bumptech.glide.load.p131o.p136g;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.ComponentCallbacks2C5349c;
import com.bumptech.glide.load.InterfaceC5429l;
import com.bumptech.glide.load.engine.InterfaceC5404u;
import com.bumptech.glide.load.p131o.p132c.C5483d;
import com.bumptech.glide.p145r.C5596j;
import java.security.MessageDigest;

/* compiled from: GifDrawableTransformation.java */
/* renamed from: com.bumptech.glide.load.o.g.f */
/* loaded from: classes.dex */
public class C5520f implements InterfaceC5429l<C5517c> {

    /* renamed from: b */
    private final InterfaceC5429l<Bitmap> f13816b;

    public C5520f(InterfaceC5429l<Bitmap> interfaceC5429l) {
        this.f13816b = (InterfaceC5429l) C5596j.m11042d(interfaceC5429l);
    }

    @Override // com.bumptech.glide.load.InterfaceC5423f
    public boolean equals(Object obj) {
        if (obj instanceof C5520f) {
            return this.f13816b.equals(((C5520f) obj).f13816b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.InterfaceC5423f
    public int hashCode() {
        return this.f13816b.hashCode();
    }

    @Override // com.bumptech.glide.load.InterfaceC5429l
    public InterfaceC5404u<C5517c> transform(Context context, InterfaceC5404u<C5517c> interfaceC5404u, int i2, int i3) {
        C5517c c5517c = interfaceC5404u.get();
        InterfaceC5404u<Bitmap> c5483d = new C5483d(c5517c.m10741e(), ComponentCallbacks2C5349c.m9972c(context).m9982f());
        InterfaceC5404u<Bitmap> interfaceC5404uTransform = this.f13816b.transform(context, c5483d, i2, i3);
        if (!c5483d.equals(interfaceC5404uTransform)) {
            c5483d.mo10340c();
        }
        c5517c.m10746m(this.f13816b, interfaceC5404uTransform.get());
        return interfaceC5404u;
    }

    @Override // com.bumptech.glide.load.InterfaceC5423f
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        this.f13816b.updateDiskCacheKey(messageDigest);
    }
}
