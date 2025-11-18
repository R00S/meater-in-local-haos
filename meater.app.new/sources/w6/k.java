package w6;

import android.graphics.drawable.Drawable;
import o6.InterfaceC4139c;

/* compiled from: NonOwnedDrawableResource.java */
/* loaded from: classes2.dex */
final class k extends j<Drawable> {
    private k(Drawable drawable) {
        super(drawable);
    }

    static InterfaceC4139c<Drawable> f(Drawable drawable) {
        if (drawable != null) {
            return new k(drawable);
        }
        return null;
    }

    @Override // o6.InterfaceC4139c
    public int a() {
        return Math.max(1, this.f51962B.getIntrinsicWidth() * this.f51962B.getIntrinsicHeight() * 4);
    }

    @Override // o6.InterfaceC4139c
    public Class<Drawable> d() {
        return this.f51962B.getClass();
    }

    @Override // o6.InterfaceC4139c
    public void c() {
    }
}
