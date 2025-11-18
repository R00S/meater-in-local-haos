package com.bumptech.glide.load.p131o.p132c;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.ComponentCallbacks2C5349c;
import com.bumptech.glide.load.InterfaceC5429l;
import com.bumptech.glide.load.engine.InterfaceC5404u;
import com.bumptech.glide.load.engine.p126z.InterfaceC5413e;
import java.security.MessageDigest;

/* compiled from: DrawableTransformation.java */
/* renamed from: com.bumptech.glide.load.o.c.n */
/* loaded from: classes.dex */
public class C5493n implements InterfaceC5429l<Drawable> {

    /* renamed from: b */
    private final InterfaceC5429l<Bitmap> f13752b;

    /* renamed from: c */
    private final boolean f13753c;

    public C5493n(InterfaceC5429l<Bitmap> interfaceC5429l, boolean z) {
        this.f13752b = interfaceC5429l;
        this.f13753c = z;
    }

    /* renamed from: b */
    private InterfaceC5404u<Drawable> m10656b(Context context, InterfaceC5404u<Bitmap> interfaceC5404u) {
        return C5497r.m10661f(context.getResources(), interfaceC5404u);
    }

    /* renamed from: a */
    public InterfaceC5429l<BitmapDrawable> m10657a() {
        return this;
    }

    @Override // com.bumptech.glide.load.InterfaceC5423f
    public boolean equals(Object obj) {
        if (obj instanceof C5493n) {
            return this.f13752b.equals(((C5493n) obj).f13752b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.InterfaceC5423f
    public int hashCode() {
        return this.f13752b.hashCode();
    }

    @Override // com.bumptech.glide.load.InterfaceC5429l
    public InterfaceC5404u<Drawable> transform(Context context, InterfaceC5404u<Drawable> interfaceC5404u, int i2, int i3) {
        InterfaceC5413e interfaceC5413eM9982f = ComponentCallbacks2C5349c.m9972c(context).m9982f();
        Drawable drawable = interfaceC5404u.get();
        InterfaceC5404u<Bitmap> interfaceC5404uM10654a = C5492m.m10654a(interfaceC5413eM9982f, drawable, i2, i3);
        if (interfaceC5404uM10654a != null) {
            InterfaceC5404u<Bitmap> interfaceC5404uTransform = this.f13752b.transform(context, interfaceC5404uM10654a, i2, i3);
            if (!interfaceC5404uTransform.equals(interfaceC5404uM10654a)) {
                return m10656b(context, interfaceC5404uTransform);
            }
            interfaceC5404uTransform.mo10340c();
            return interfaceC5404u;
        }
        if (!this.f13753c) {
            return interfaceC5404u;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // com.bumptech.glide.load.InterfaceC5423f
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        this.f13752b.updateDiskCacheKey(messageDigest);
    }
}
