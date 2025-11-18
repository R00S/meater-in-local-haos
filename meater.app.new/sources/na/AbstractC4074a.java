package na;

import H6.l;
import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.load.resource.bitmap.g;
import m6.InterfaceC3976k;
import o6.InterfaceC4139c;
import p6.InterfaceC4239d;

/* compiled from: BitmapTransformation.java */
/* renamed from: na.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4074a implements InterfaceC3976k<Bitmap> {
    @Override // m6.InterfaceC3976k
    public final InterfaceC4139c<Bitmap> a(Context context, InterfaceC4139c<Bitmap> interfaceC4139c, int i10, int i11) {
        if (!l.t(i10, i11)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i10 + " or height: " + i11 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        InterfaceC4239d interfaceC4239dF = com.bumptech.glide.b.c(context).f();
        Bitmap bitmap = interfaceC4139c.get();
        if (i10 == Integer.MIN_VALUE) {
            i10 = bitmap.getWidth();
        }
        int i12 = i10;
        if (i11 == Integer.MIN_VALUE) {
            i11 = bitmap.getHeight();
        }
        Bitmap bitmapD = d(context.getApplicationContext(), interfaceC4239dF, bitmap, i12, i11);
        return bitmap.equals(bitmapD) ? interfaceC4139c : g.f(bitmapD, interfaceC4239dF);
    }

    void c(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setDensity(bitmap.getDensity());
    }

    protected abstract Bitmap d(Context context, InterfaceC4239d interfaceC4239d, Bitmap bitmap, int i10, int i11);
}
