package z6;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import m6.C3972g;
import o6.InterfaceC4139c;
import p6.InterfaceC4239d;
import y6.C5131c;

/* compiled from: DrawableBytesTranscoder.java */
/* loaded from: classes2.dex */
public final class c implements e<Drawable, byte[]> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4239d f53777a;

    /* renamed from: b, reason: collision with root package name */
    private final e<Bitmap, byte[]> f53778b;

    /* renamed from: c, reason: collision with root package name */
    private final e<C5131c, byte[]> f53779c;

    public c(InterfaceC4239d interfaceC4239d, e<Bitmap, byte[]> eVar, e<C5131c, byte[]> eVar2) {
        this.f53777a = interfaceC4239d;
        this.f53778b = eVar;
        this.f53779c = eVar2;
    }

    @Override // z6.e
    public InterfaceC4139c<byte[]> a(InterfaceC4139c<Drawable> interfaceC4139c, C3972g c3972g) {
        Drawable drawable = interfaceC4139c.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f53778b.a(com.bumptech.glide.load.resource.bitmap.g.f(((BitmapDrawable) drawable).getBitmap(), this.f53777a), c3972g);
        }
        if (drawable instanceof C5131c) {
            return this.f53779c.a(b(interfaceC4139c), c3972g);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static InterfaceC4139c<C5131c> b(InterfaceC4139c<Drawable> interfaceC4139c) {
        return interfaceC4139c;
    }
}
