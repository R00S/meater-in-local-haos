package z6;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import m6.C3972g;
import o6.InterfaceC4139c;

/* compiled from: BitmapBytesTranscoder.java */
/* renamed from: z6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5197a implements e<Bitmap, byte[]> {

    /* renamed from: a, reason: collision with root package name */
    private final Bitmap.CompressFormat f53774a;

    /* renamed from: b, reason: collision with root package name */
    private final int f53775b;

    public C5197a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    @Override // z6.e
    public InterfaceC4139c<byte[]> a(InterfaceC4139c<Bitmap> interfaceC4139c, C3972g c3972g) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        interfaceC4139c.get().compress(this.f53774a, this.f53775b, byteArrayOutputStream);
        interfaceC4139c.c();
        return new v6.b(byteArrayOutputStream.toByteArray());
    }

    public C5197a(Bitmap.CompressFormat compressFormat, int i10) {
        this.f53774a = compressFormat;
        this.f53775b = i10;
    }
}
