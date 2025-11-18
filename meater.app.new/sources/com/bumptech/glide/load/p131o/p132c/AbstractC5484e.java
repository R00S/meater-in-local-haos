package com.bumptech.glide.load.p131o.p132c;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.ComponentCallbacks2C5349c;
import com.bumptech.glide.load.InterfaceC5429l;
import com.bumptech.glide.load.engine.InterfaceC5404u;
import com.bumptech.glide.load.engine.p126z.InterfaceC5413e;
import com.bumptech.glide.p145r.C5597k;

/* compiled from: BitmapTransformation.java */
/* renamed from: com.bumptech.glide.load.o.c.e */
/* loaded from: classes.dex */
public abstract class AbstractC5484e implements InterfaceC5429l<Bitmap> {
    protected abstract Bitmap transform(InterfaceC5413e interfaceC5413e, Bitmap bitmap, int i2, int i3);

    @Override // com.bumptech.glide.load.InterfaceC5429l
    public final InterfaceC5404u<Bitmap> transform(Context context, InterfaceC5404u<Bitmap> interfaceC5404u, int i2, int i3) {
        if (!C5597k.m11063t(i2, i3)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i2 + " or height: " + i3 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        InterfaceC5413e interfaceC5413eM9982f = ComponentCallbacks2C5349c.m9972c(context).m9982f();
        Bitmap bitmap = interfaceC5404u.get();
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getWidth();
        }
        if (i3 == Integer.MIN_VALUE) {
            i3 = bitmap.getHeight();
        }
        Bitmap bitmapTransform = transform(interfaceC5413eM9982f, bitmap, i2, i3);
        return bitmap.equals(bitmapTransform) ? interfaceC5404u : C5483d.m10607f(bitmapTransform, interfaceC5413eM9982f);
    }
}
