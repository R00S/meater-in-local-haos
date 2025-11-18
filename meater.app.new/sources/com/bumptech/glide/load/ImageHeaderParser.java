package com.bumptech.glide.load;

import com.bumptech.glide.load.engine.p126z.InterfaceC5410b;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface ImageHeaderParser {

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        UNKNOWN(false);


        /* renamed from: f */
        private final boolean f13216f;

        ImageType(boolean z) {
            this.f13216f = z;
        }

        public boolean hasAlpha() {
            return this.f13216f;
        }
    }

    /* renamed from: a */
    ImageType mo10152a(ByteBuffer byteBuffer) throws IOException;

    /* renamed from: b */
    ImageType mo10153b(InputStream inputStream) throws IOException;

    /* renamed from: c */
    int mo10154c(InputStream inputStream, InterfaceC5410b interfaceC5410b) throws IOException;
}
