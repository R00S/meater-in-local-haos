package y6;

import android.graphics.Bitmap;
import l6.InterfaceC3902a;
import p6.InterfaceC4237b;
import p6.InterfaceC4239d;

/* compiled from: GifBitmapProvider.java */
/* renamed from: y6.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5130b implements InterfaceC3902a.InterfaceC0591a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4239d f53150a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4237b f53151b;

    public C5130b(InterfaceC4239d interfaceC4239d, InterfaceC4237b interfaceC4237b) {
        this.f53150a = interfaceC4239d;
        this.f53151b = interfaceC4237b;
    }

    @Override // l6.InterfaceC3902a.InterfaceC0591a
    public Bitmap a(int i10, int i11, Bitmap.Config config) {
        return this.f53150a.e(i10, i11, config);
    }

    @Override // l6.InterfaceC3902a.InterfaceC0591a
    public int[] b(int i10) {
        InterfaceC4237b interfaceC4237b = this.f53151b;
        return interfaceC4237b == null ? new int[i10] : (int[]) interfaceC4237b.e(i10, int[].class);
    }

    @Override // l6.InterfaceC3902a.InterfaceC0591a
    public void c(Bitmap bitmap) {
        this.f53150a.c(bitmap);
    }

    @Override // l6.InterfaceC3902a.InterfaceC0591a
    public void d(byte[] bArr) {
        InterfaceC4237b interfaceC4237b = this.f53151b;
        if (interfaceC4237b == null) {
            return;
        }
        interfaceC4237b.d(bArr);
    }

    @Override // l6.InterfaceC3902a.InterfaceC0591a
    public byte[] e(int i10) {
        InterfaceC4237b interfaceC4237b = this.f53151b;
        return interfaceC4237b == null ? new byte[i10] : (byte[]) interfaceC4237b.e(i10, byte[].class);
    }

    @Override // l6.InterfaceC3902a.InterfaceC0591a
    public void f(int[] iArr) {
        InterfaceC4237b interfaceC4237b = this.f53151b;
        if (interfaceC4237b == null) {
            return;
        }
        interfaceC4237b.d(iArr);
    }
}
