package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.y;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p6.InterfaceC4237b;

/* compiled from: ImageHeaderParserUtils.java */
/* loaded from: classes2.dex */
public final class a {

    /* compiled from: ImageHeaderParserUtils.java */
    /* renamed from: com.bumptech.glide.load.a$a, reason: collision with other inner class name */
    class C0453a implements h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InputStream f33020a;

        C0453a(InputStream inputStream) {
            this.f33020a = inputStream;
        }

        @Override // com.bumptech.glide.load.a.h
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.c(this.f33020a);
            } finally {
                this.f33020a.reset();
            }
        }
    }

    /* compiled from: ImageHeaderParserUtils.java */
    class b implements h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f33021a;

        b(ByteBuffer byteBuffer) {
            this.f33021a = byteBuffer;
        }

        @Override // com.bumptech.glide.load.a.h
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.a(this.f33021a);
            } finally {
                H6.a.d(this.f33021a);
            }
        }
    }

    /* compiled from: ImageHeaderParserUtils.java */
    class c implements h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ParcelFileDescriptorRewinder f33022a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC4237b f33023b;

        c(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, InterfaceC4237b interfaceC4237b) {
            this.f33022a = parcelFileDescriptorRewinder;
            this.f33023b = interfaceC4237b;
        }

        @Override // com.bumptech.glide.load.a.h
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws Throwable {
            y yVar;
            y yVar2 = null;
            try {
                yVar = new y(new FileInputStream(this.f33022a.a().getFileDescriptor()), this.f33023b);
            } catch (Throwable th) {
                th = th;
            }
            try {
                ImageHeaderParser.ImageType imageTypeC = imageHeaderParser.c(yVar);
                yVar.c();
                this.f33022a.a();
                return imageTypeC;
            } catch (Throwable th2) {
                th = th2;
                yVar2 = yVar;
                if (yVar2 != null) {
                    yVar2.c();
                }
                this.f33022a.a();
                throw th;
            }
        }
    }

    /* compiled from: ImageHeaderParserUtils.java */
    class d implements g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f33024a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC4237b f33025b;

        d(ByteBuffer byteBuffer, InterfaceC4237b interfaceC4237b) {
            this.f33024a = byteBuffer;
            this.f33025b = interfaceC4237b;
        }

        @Override // com.bumptech.glide.load.a.g
        public int a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.b(this.f33024a, this.f33025b);
            } finally {
                H6.a.d(this.f33024a);
            }
        }
    }

    /* compiled from: ImageHeaderParserUtils.java */
    class e implements g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InputStream f33026a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC4237b f33027b;

        e(InputStream inputStream, InterfaceC4237b interfaceC4237b) {
            this.f33026a = inputStream;
            this.f33027b = interfaceC4237b;
        }

        @Override // com.bumptech.glide.load.a.g
        public int a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.d(this.f33026a, this.f33027b);
            } finally {
                this.f33026a.reset();
            }
        }
    }

    /* compiled from: ImageHeaderParserUtils.java */
    class f implements g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ParcelFileDescriptorRewinder f33028a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC4237b f33029b;

        f(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, InterfaceC4237b interfaceC4237b) {
            this.f33028a = parcelFileDescriptorRewinder;
            this.f33029b = interfaceC4237b;
        }

        @Override // com.bumptech.glide.load.a.g
        public int a(ImageHeaderParser imageHeaderParser) throws Throwable {
            y yVar;
            y yVar2 = null;
            try {
                yVar = new y(new FileInputStream(this.f33028a.a().getFileDescriptor()), this.f33029b);
            } catch (Throwable th) {
                th = th;
            }
            try {
                int iD = imageHeaderParser.d(yVar, this.f33029b);
                yVar.c();
                this.f33028a.a();
                return iD;
            } catch (Throwable th2) {
                th = th2;
                yVar2 = yVar;
                if (yVar2 != null) {
                    yVar2.c();
                }
                this.f33028a.a();
                throw th;
            }
        }
    }

    /* compiled from: ImageHeaderParserUtils.java */
    private interface g {
        int a(ImageHeaderParser imageHeaderParser);
    }

    /* compiled from: ImageHeaderParserUtils.java */
    private interface h {
        ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser);
    }

    public static int a(List<ImageHeaderParser> list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, InterfaceC4237b interfaceC4237b) {
        return d(list, new f(parcelFileDescriptorRewinder, interfaceC4237b));
    }

    public static int b(List<ImageHeaderParser> list, InputStream inputStream, InterfaceC4237b interfaceC4237b) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new y(inputStream, interfaceC4237b);
        }
        inputStream.mark(5242880);
        return d(list, new e(inputStream, interfaceC4237b));
    }

    public static int c(List<ImageHeaderParser> list, ByteBuffer byteBuffer, InterfaceC4237b interfaceC4237b) {
        if (byteBuffer == null) {
            return -1;
        }
        return d(list, new d(byteBuffer, interfaceC4237b));
    }

    private static int d(List<ImageHeaderParser> list, g gVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            int iA = gVar.a(list.get(i10));
            if (iA != -1) {
                return iA;
            }
        }
        return -1;
    }

    public static ImageHeaderParser.ImageType e(List<ImageHeaderParser> list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, InterfaceC4237b interfaceC4237b) {
        return h(list, new c(parcelFileDescriptorRewinder, interfaceC4237b));
    }

    public static ImageHeaderParser.ImageType f(List<ImageHeaderParser> list, InputStream inputStream, InterfaceC4237b interfaceC4237b) {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new y(inputStream, interfaceC4237b);
        }
        inputStream.mark(5242880);
        return h(list, new C0453a(inputStream));
    }

    public static ImageHeaderParser.ImageType g(List<ImageHeaderParser> list, ByteBuffer byteBuffer) {
        return byteBuffer == null ? ImageHeaderParser.ImageType.UNKNOWN : h(list, new b(byteBuffer));
    }

    private static ImageHeaderParser.ImageType h(List<ImageHeaderParser> list, h hVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ImageHeaderParser.ImageType imageTypeA = hVar.a(list.get(i10));
            if (imageTypeA != ImageHeaderParser.ImageType.UNKNOWN) {
                return imageTypeA;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
