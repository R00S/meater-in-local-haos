package z6;

import H6.k;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.resource.bitmap.w;
import m6.C3972g;
import o6.InterfaceC4139c;

/* compiled from: BitmapDrawableTranscoder.java */
/* loaded from: classes2.dex */
public class b implements e<Bitmap, BitmapDrawable> {

    /* renamed from: a, reason: collision with root package name */
    private final Resources f53776a;

    public b(Resources resources) {
        this.f53776a = (Resources) k.d(resources);
    }

    @Override // z6.e
    public InterfaceC4139c<BitmapDrawable> a(InterfaceC4139c<Bitmap> interfaceC4139c, C3972g c3972g) {
        return w.f(this.f53776a, interfaceC4139c);
    }
}
