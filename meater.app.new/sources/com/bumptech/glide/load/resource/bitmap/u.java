package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p6.InterfaceC4237b;

/* compiled from: ImageReader.java */
/* loaded from: classes2.dex */
interface u {

    /* compiled from: ImageReader.java */
    public static final class b implements u {

        /* renamed from: a, reason: collision with root package name */
        private final com.bumptech.glide.load.data.k f33369a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC4237b f33370b;

        /* renamed from: c, reason: collision with root package name */
        private final List<ImageHeaderParser> f33371c;

        b(InputStream inputStream, List<ImageHeaderParser> list, InterfaceC4237b interfaceC4237b) {
            this.f33370b = (InterfaceC4237b) H6.k.d(interfaceC4237b);
            this.f33371c = (List) H6.k.d(list);
            this.f33369a = new com.bumptech.glide.load.data.k(inputStream, interfaceC4237b);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.u
        public int a() {
            return com.bumptech.glide.load.a.b(this.f33371c, this.f33369a.a(), this.f33370b);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.u
        public Bitmap b(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(this.f33369a.a(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.u
        public void c() {
            this.f33369a.c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.u
        public ImageHeaderParser.ImageType d() {
            return com.bumptech.glide.load.a.f(this.f33371c, this.f33369a.a(), this.f33370b);
        }
    }

    int a();

    Bitmap b(BitmapFactory.Options options);

    void c();

    ImageHeaderParser.ImageType d();

    /* compiled from: ImageReader.java */
    public static final class a implements u {

        /* renamed from: a, reason: collision with root package name */
        private final ByteBuffer f33366a;

        /* renamed from: b, reason: collision with root package name */
        private final List<ImageHeaderParser> f33367b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC4237b f33368c;

        a(ByteBuffer byteBuffer, List<ImageHeaderParser> list, InterfaceC4237b interfaceC4237b) {
            this.f33366a = byteBuffer;
            this.f33367b = list;
            this.f33368c = interfaceC4237b;
        }

        private InputStream e() {
            return H6.a.g(H6.a.d(this.f33366a));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.u
        public int a() {
            return com.bumptech.glide.load.a.c(this.f33367b, H6.a.d(this.f33366a), this.f33368c);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.u
        public Bitmap b(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(e(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.u
        public ImageHeaderParser.ImageType d() {
            return com.bumptech.glide.load.a.g(this.f33367b, H6.a.d(this.f33366a));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.u
        public void c() {
        }
    }

    /* compiled from: ImageReader.java */
    public static final class c implements u {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC4237b f33372a;

        /* renamed from: b, reason: collision with root package name */
        private final List<ImageHeaderParser> f33373b;

        /* renamed from: c, reason: collision with root package name */
        private final ParcelFileDescriptorRewinder f33374c;

        c(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, InterfaceC4237b interfaceC4237b) {
            this.f33372a = (InterfaceC4237b) H6.k.d(interfaceC4237b);
            this.f33373b = (List) H6.k.d(list);
            this.f33374c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.u
        public int a() {
            return com.bumptech.glide.load.a.a(this.f33373b, this.f33374c, this.f33372a);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.u
        public Bitmap b(BitmapFactory.Options options) {
            return BitmapFactory.decodeFileDescriptor(this.f33374c.a().getFileDescriptor(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.u
        public ImageHeaderParser.ImageType d() {
            return com.bumptech.glide.load.a.e(this.f33373b, this.f33374c, this.f33372a);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.u
        public void c() {
        }
    }
}
