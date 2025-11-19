package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;
import o6.InterfaceC4139c;
import p6.C4240e;
import p6.InterfaceC4239d;

/* compiled from: DrawableToBitmapConverter.java */
/* loaded from: classes2.dex */
final class p {

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC4239d f33354a = new a();

    static InterfaceC4139c<Bitmap> a(InterfaceC4239d interfaceC4239d, Drawable drawable, int i10, int i11) {
        Bitmap bitmapB;
        Drawable current = drawable.getCurrent();
        boolean z10 = false;
        if (current instanceof BitmapDrawable) {
            bitmapB = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmapB = null;
        } else {
            bitmapB = b(interfaceC4239d, current, i10, i11);
            z10 = true;
        }
        if (!z10) {
            interfaceC4239d = f33354a;
        }
        return g.f(bitmapB, interfaceC4239d);
    }

    private static Bitmap b(InterfaceC4239d interfaceC4239d, Drawable drawable, int i10, int i11) {
        if (i10 == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            return null;
        }
        if (i11 == Integer.MIN_VALUE && drawable.getIntrinsicHeight() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
            }
            return null;
        }
        if (drawable.getIntrinsicWidth() > 0) {
            i10 = drawable.getIntrinsicWidth();
        }
        if (drawable.getIntrinsicHeight() > 0) {
            i11 = drawable.getIntrinsicHeight();
        }
        Lock lockF = B.f();
        lockF.lock();
        Bitmap bitmapD = interfaceC4239d.d(i10, i11, Bitmap.Config.ARGB_8888);
        try {
            Canvas canvas = new Canvas(bitmapD);
            drawable.setBounds(0, 0, i10, i11);
            drawable.draw(canvas);
            canvas.setBitmap(null);
            return bitmapD;
        } finally {
            lockF.unlock();
        }
    }

    /* compiled from: DrawableToBitmapConverter.java */
    class a extends C4240e {
        a() {
        }

        @Override // p6.C4240e, p6.InterfaceC4239d
        public void c(Bitmap bitmap) {
        }
    }
}
