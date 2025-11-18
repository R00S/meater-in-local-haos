package com.bumptech.glide.load.p131o.p132c;

import android.media.ExifInterface;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.p126z.InterfaceC5410b;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: ExifInterfaceImageHeaderParser.java */
/* renamed from: com.bumptech.glide.load.o.c.o */
/* loaded from: classes.dex */
public final class C5494o implements ImageHeaderParser {
    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: a */
    public ImageHeaderParser.ImageType mo10152a(ByteBuffer byteBuffer) throws IOException {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: b */
    public ImageHeaderParser.ImageType mo10153b(InputStream inputStream) throws IOException {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: c */
    public int mo10154c(InputStream inputStream, InterfaceC5410b interfaceC5410b) throws IOException {
        int attributeInt = new ExifInterface(inputStream).getAttributeInt("Orientation", 1);
        if (attributeInt == 0) {
            return -1;
        }
        return attributeInt;
    }
}
