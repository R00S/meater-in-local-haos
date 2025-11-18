package l6;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

/* compiled from: GifDecoder.java */
/* renamed from: l6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC3902a {

    /* compiled from: GifDecoder.java */
    /* renamed from: l6.a$a, reason: collision with other inner class name */
    public interface InterfaceC0591a {
        Bitmap a(int i10, int i11, Bitmap.Config config);

        int[] b(int i10);

        void c(Bitmap bitmap);

        void d(byte[] bArr);

        byte[] e(int i10);

        void f(int[] iArr);
    }

    Bitmap a();

    void b();

    int c();

    void clear();

    int d();

    void e(Bitmap.Config config);

    ByteBuffer f();

    void g();

    int h();

    int i();
}
