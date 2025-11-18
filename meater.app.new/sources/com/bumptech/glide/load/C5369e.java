package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.p126z.InterfaceC5410b;
import com.bumptech.glide.load.p131o.p132c.C5498s;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: ImageHeaderParserUtils.java */
/* renamed from: com.bumptech.glide.load.e */
/* loaded from: classes.dex */
public final class C5369e {
    /* renamed from: a */
    public static int m10156a(List<ImageHeaderParser> list, InputStream inputStream, InterfaceC5410b interfaceC5410b) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C5498s(inputStream, interfaceC5410b);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                int iMo10154c = list.get(i2).mo10154c(inputStream, interfaceC5410b);
                if (iMo10154c != -1) {
                    return iMo10154c;
                }
                inputStream.reset();
            } finally {
                inputStream.reset();
            }
        }
        return -1;
    }

    /* renamed from: b */
    public static ImageHeaderParser.ImageType m10157b(List<ImageHeaderParser> list, InputStream inputStream, InterfaceC5410b interfaceC5410b) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C5498s(inputStream, interfaceC5410b);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                ImageHeaderParser.ImageType imageTypeMo10153b = list.get(i2).mo10153b(inputStream);
                if (imageTypeMo10153b != ImageHeaderParser.ImageType.UNKNOWN) {
                    return imageTypeMo10153b;
                }
                inputStream.reset();
            } finally {
                inputStream.reset();
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    /* renamed from: c */
    public static ImageHeaderParser.ImageType m10158c(List<ImageHeaderParser> list, ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ImageHeaderParser.ImageType imageTypeMo10152a = list.get(i2).mo10152a(byteBuffer);
            if (imageTypeMo10152a != ImageHeaderParser.ImageType.UNKNOWN) {
                return imageTypeMo10152a;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
