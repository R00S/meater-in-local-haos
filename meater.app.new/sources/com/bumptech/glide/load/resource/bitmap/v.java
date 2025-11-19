package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.io.InputStream;
import m6.C3972g;
import m6.InterfaceC3974i;
import o6.InterfaceC4139c;

/* compiled from: InputStreamBitmapImageDecoderResourceDecoder.java */
/* loaded from: classes2.dex */
public final class v implements InterfaceC3974i<InputStream, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private final f f33375a = new f();

    @Override // m6.InterfaceC3974i
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC4139c<Bitmap> a(InputStream inputStream, int i10, int i11, C3972g c3972g) {
        return this.f33375a.c(ImageDecoder.createSource(H6.a.b(inputStream)), i10, i11, c3972g);
    }

    @Override // m6.InterfaceC3974i
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(InputStream inputStream, C3972g c3972g) {
        return true;
    }
}
