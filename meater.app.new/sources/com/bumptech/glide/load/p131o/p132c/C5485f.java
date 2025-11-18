package com.bumptech.glide.load.p131o.p132c;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C5426i;
import com.bumptech.glide.load.InterfaceC5427j;
import com.bumptech.glide.load.engine.InterfaceC5404u;
import com.bumptech.glide.p145r.C5587a;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: ByteBufferBitmapDecoder.java */
/* renamed from: com.bumptech.glide.load.o.c.f */
/* loaded from: classes.dex */
public class C5485f implements InterfaceC5427j<ByteBuffer, Bitmap> {

    /* renamed from: a */
    private final C5491l f13718a;

    public C5485f(C5491l c5491l) {
        this.f13718a = c5491l;
    }

    @Override // com.bumptech.glide.load.InterfaceC5427j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC5404u<Bitmap> mo10453b(ByteBuffer byteBuffer, int i2, int i3, C5426i c5426i) throws IOException {
        return this.f13718a.m10648d(C5587a.m11018e(byteBuffer), i2, i3, c5426i);
    }

    @Override // com.bumptech.glide.load.InterfaceC5427j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo10452a(ByteBuffer byteBuffer, C5426i c5426i) {
        return this.f13718a.m10651n(byteBuffer);
    }
}
