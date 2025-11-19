package y6;

import H6.k;
import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;
import m6.InterfaceC3976k;
import o6.InterfaceC4139c;

/* compiled from: GifDrawableTransformation.java */
/* loaded from: classes2.dex */
public class f implements InterfaceC3976k<C5131c> {

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3976k<Bitmap> f53164b;

    public f(InterfaceC3976k<Bitmap> interfaceC3976k) {
        this.f53164b = (InterfaceC3976k) k.d(interfaceC3976k);
    }

    @Override // m6.InterfaceC3976k
    public InterfaceC4139c<C5131c> a(Context context, InterfaceC4139c<C5131c> interfaceC4139c, int i10, int i11) {
        C5131c c5131c = interfaceC4139c.get();
        InterfaceC4139c<Bitmap> gVar = new com.bumptech.glide.load.resource.bitmap.g(c5131c.e(), com.bumptech.glide.b.c(context).f());
        InterfaceC4139c<Bitmap> interfaceC4139cA = this.f53164b.a(context, gVar, i10, i11);
        if (!gVar.equals(interfaceC4139cA)) {
            gVar.c();
        }
        c5131c.m(this.f53164b, interfaceC4139cA.get());
        return interfaceC4139c;
    }

    @Override // m6.InterfaceC3970e
    public void b(MessageDigest messageDigest) {
        this.f53164b.b(messageDigest);
    }

    @Override // m6.InterfaceC3970e
    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f53164b.equals(((f) obj).f53164b);
        }
        return false;
    }

    @Override // m6.InterfaceC3970e
    public int hashCode() {
        return this.f53164b.hashCode();
    }
}
