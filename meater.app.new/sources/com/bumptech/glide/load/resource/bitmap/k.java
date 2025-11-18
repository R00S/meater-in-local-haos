package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.nio.ByteBuffer;
import m6.C3972g;
import m6.InterfaceC3974i;
import o6.InterfaceC4139c;

/* compiled from: ByteBufferBitmapImageDecoderResourceDecoder.java */
/* loaded from: classes2.dex */
public final class k implements InterfaceC3974i<ByteBuffer, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private final f f33325a = new f();

    @Override // m6.InterfaceC3974i
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC4139c<Bitmap> a(ByteBuffer byteBuffer, int i10, int i11, C3972g c3972g) {
        return this.f33325a.c(ImageDecoder.createSource(byteBuffer), i10, i11, c3972g);
    }

    @Override // m6.InterfaceC3974i
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(ByteBuffer byteBuffer, C3972g c3972g) {
        return true;
    }
}
