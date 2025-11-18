package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import m6.InterfaceC3976k;
import o6.InterfaceC4139c;
import p6.InterfaceC4239d;

/* compiled from: BitmapTransformation.java */
/* loaded from: classes2.dex */
public abstract class h implements InterfaceC3976k<Bitmap> {
    @Override // m6.InterfaceC3976k
    public final InterfaceC4139c<Bitmap> a(Context context, InterfaceC4139c<Bitmap> interfaceC4139c, int i10, int i11) {
        if (!H6.l.t(i10, i11)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i10 + " or height: " + i11 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        InterfaceC4239d interfaceC4239dF = com.bumptech.glide.b.c(context).f();
        Bitmap bitmap = interfaceC4139c.get();
        if (i10 == Integer.MIN_VALUE) {
            i10 = bitmap.getWidth();
        }
        if (i11 == Integer.MIN_VALUE) {
            i11 = bitmap.getHeight();
        }
        Bitmap bitmapC = c(interfaceC4239dF, bitmap, i10, i11);
        return bitmap.equals(bitmapC) ? interfaceC4139c : g.f(bitmapC, interfaceC4239dF);
    }

    protected abstract Bitmap c(InterfaceC4239d interfaceC4239d, Bitmap bitmap, int i10, int i11);
}
