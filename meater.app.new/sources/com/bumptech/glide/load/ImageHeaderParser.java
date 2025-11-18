package com.bumptech.glide.load;

import java.io.InputStream;
import java.nio.ByteBuffer;
import p6.InterfaceC4237b;

/* loaded from: classes2.dex */
public interface ImageHeaderParser {

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        ANIMATED_WEBP(true),
        AVIF(true),
        ANIMATED_AVIF(true),
        UNKNOWN(false);


        /* renamed from: B, reason: collision with root package name */
        private final boolean f33018B;

        ImageType(boolean z10) {
            this.f33018B = z10;
        }

        public boolean hasAlpha() {
            return this.f33018B;
        }

        public boolean isWebp() {
            int i10 = a.f33019a[ordinal()];
            return i10 == 1 || i10 == 2 || i10 == 3;
        }
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f33019a;

        static {
            int[] iArr = new int[ImageType.values().length];
            f33019a = iArr;
            try {
                iArr[ImageType.WEBP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33019a[ImageType.WEBP_A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33019a[ImageType.ANIMATED_WEBP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    ImageType a(ByteBuffer byteBuffer);

    int b(ByteBuffer byteBuffer, InterfaceC4237b interfaceC4237b);

    ImageType c(InputStream inputStream);

    int d(InputStream inputStream, InterfaceC4237b interfaceC4237b);
}
