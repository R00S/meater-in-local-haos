package w6;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import m6.C3972g;
import m6.InterfaceC3974i;
import o6.InterfaceC4139c;
import p6.InterfaceC4237b;
import u6.C4682h;

/* compiled from: AnimatedImageDecoder.java */
/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final List<ImageHeaderParser> f51956a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4237b f51957b;

    /* compiled from: AnimatedImageDecoder.java */
    private static final class a implements InterfaceC4139c<Drawable> {

        /* renamed from: B, reason: collision with root package name */
        private final AnimatedImageDrawable f51958B;

        a(AnimatedImageDrawable animatedImageDrawable) {
            this.f51958B = animatedImageDrawable;
        }

        @Override // o6.InterfaceC4139c
        public int a() {
            return this.f51958B.getIntrinsicWidth() * this.f51958B.getIntrinsicHeight() * H6.l.i(Bitmap.Config.ARGB_8888) * 2;
        }

        @Override // o6.InterfaceC4139c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AnimatedImageDrawable get() {
            return this.f51958B;
        }

        @Override // o6.InterfaceC4139c
        public void c() {
            this.f51958B.stop();
            this.f51958B.clearAnimationCallbacks();
        }

        @Override // o6.InterfaceC4139c
        public Class<Drawable> d() {
            return Drawable.class;
        }
    }

    /* compiled from: AnimatedImageDecoder.java */
    private static final class b implements InterfaceC3974i<ByteBuffer, Drawable> {

        /* renamed from: a, reason: collision with root package name */
        private final h f51959a;

        b(h hVar) {
            this.f51959a = hVar;
        }

        @Override // m6.InterfaceC3974i
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC4139c<Drawable> a(ByteBuffer byteBuffer, int i10, int i11, C3972g c3972g) {
            return this.f51959a.b(ImageDecoder.createSource(byteBuffer), i10, i11, c3972g);
        }

        @Override // m6.InterfaceC3974i
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(ByteBuffer byteBuffer, C3972g c3972g) {
            return this.f51959a.d(byteBuffer);
        }
    }

    /* compiled from: AnimatedImageDecoder.java */
    private static final class c implements InterfaceC3974i<InputStream, Drawable> {

        /* renamed from: a, reason: collision with root package name */
        private final h f51960a;

        c(h hVar) {
            this.f51960a = hVar;
        }

        @Override // m6.InterfaceC3974i
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC4139c<Drawable> a(InputStream inputStream, int i10, int i11, C3972g c3972g) {
            return this.f51960a.b(ImageDecoder.createSource(H6.a.b(inputStream)), i10, i11, c3972g);
        }

        @Override // m6.InterfaceC3974i
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(InputStream inputStream, C3972g c3972g) {
            return this.f51960a.c(inputStream);
        }
    }

    private h(List<ImageHeaderParser> list, InterfaceC4237b interfaceC4237b) {
        this.f51956a = list;
        this.f51957b = interfaceC4237b;
    }

    public static InterfaceC3974i<ByteBuffer, Drawable> a(List<ImageHeaderParser> list, InterfaceC4237b interfaceC4237b) {
        return new b(new h(list, interfaceC4237b));
    }

    private boolean e(ImageHeaderParser.ImageType imageType) {
        return imageType == ImageHeaderParser.ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && imageType == ImageHeaderParser.ImageType.ANIMATED_AVIF);
    }

    public static InterfaceC3974i<InputStream, Drawable> f(List<ImageHeaderParser> list, InterfaceC4237b interfaceC4237b) {
        return new c(new h(list, interfaceC4237b));
    }

    InterfaceC4139c<Drawable> b(ImageDecoder.Source source, int i10, int i11, C3972g c3972g) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new C4682h(i10, i11, c3972g));
        if (C5001b.a(drawableDecodeDrawable)) {
            return new a(C5002c.a(drawableDecodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + drawableDecodeDrawable);
    }

    boolean c(InputStream inputStream) {
        return e(com.bumptech.glide.load.a.f(this.f51956a, inputStream, this.f51957b));
    }

    boolean d(ByteBuffer byteBuffer) {
        return e(com.bumptech.glide.load.a.g(this.f51956a, byteBuffer));
    }
}
