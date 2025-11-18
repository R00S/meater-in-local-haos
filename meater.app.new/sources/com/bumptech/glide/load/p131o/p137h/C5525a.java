package com.bumptech.glide.load.p131o.p137h;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C5426i;
import com.bumptech.glide.load.engine.InterfaceC5404u;
import com.bumptech.glide.load.p131o.p133d.C5506b;
import java.io.ByteArrayOutputStream;

/* compiled from: BitmapBytesTranscoder.java */
/* renamed from: com.bumptech.glide.load.o.h.a */
/* loaded from: classes.dex */
public class C5525a implements InterfaceC5529e<Bitmap, byte[]> {

    /* renamed from: a */
    private final Bitmap.CompressFormat f13844a;

    /* renamed from: b */
    private final int f13845b;

    public C5525a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    @Override // com.bumptech.glide.load.p131o.p137h.InterfaceC5529e
    /* renamed from: a */
    public InterfaceC5404u<byte[]> mo10776a(InterfaceC5404u<Bitmap> interfaceC5404u, C5426i c5426i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        interfaceC5404u.get().compress(this.f13844a, this.f13845b, byteArrayOutputStream);
        interfaceC5404u.mo10340c();
        return new C5506b(byteArrayOutputStream.toByteArray());
    }

    public C5525a(Bitmap.CompressFormat compressFormat, int i2) {
        this.f13844a = compressFormat;
        this.f13845b = i2;
    }
}
