package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;
import m6.C3972g;
import m6.InterfaceC3974i;
import o6.InterfaceC4139c;
import p6.C4240e;
import p6.InterfaceC4239d;
import u6.C4682h;

/* compiled from: BitmapImageDecoderResourceDecoder.java */
/* loaded from: classes2.dex */
public final class f implements InterfaceC3974i<ImageDecoder.Source, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4239d f33321a = new C4240e();

    @Override // m6.InterfaceC3974i
    public /* bridge */ /* synthetic */ InterfaceC4139c<Bitmap> a(ImageDecoder.Source source, int i10, int i11, C3972g c3972g) {
        return c(C2425d.a(source), i10, i11, c3972g);
    }

    @Override // m6.InterfaceC3974i
    public /* bridge */ /* synthetic */ boolean b(ImageDecoder.Source source, C3972g c3972g) {
        return d(C2425d.a(source), c3972g);
    }

    public InterfaceC4139c<Bitmap> c(ImageDecoder.Source source, int i10, int i11, C3972g c3972g) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new C4682h(i10, i11, c3972g));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + bitmapDecodeBitmap.getWidth() + "x" + bitmapDecodeBitmap.getHeight() + "] for [" + i10 + "x" + i11 + "]");
        }
        return new g(bitmapDecodeBitmap, this.f33321a);
    }

    public boolean d(ImageDecoder.Source source, C3972g c3972g) {
        return true;
    }
}
