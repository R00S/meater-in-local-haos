package p6;

import android.graphics.Bitmap;

/* compiled from: BitmapPoolAdapter.java */
/* renamed from: p6.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4240e implements InterfaceC4239d {
    @Override // p6.InterfaceC4239d
    public void c(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // p6.InterfaceC4239d
    public Bitmap d(int i10, int i11, Bitmap.Config config) {
        return Bitmap.createBitmap(i10, i11, config);
    }

    @Override // p6.InterfaceC4239d
    public Bitmap e(int i10, int i11, Bitmap.Config config) {
        return d(i10, i11, config);
    }

    @Override // p6.InterfaceC4239d
    public void b() {
    }

    @Override // p6.InterfaceC4239d
    public void a(int i10) {
    }
}
