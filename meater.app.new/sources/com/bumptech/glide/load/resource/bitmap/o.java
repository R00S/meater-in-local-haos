package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.n;
import com.bumptech.glide.load.resource.bitmap.u;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import m6.C3971f;
import m6.C3972g;
import m6.EnumC3967b;
import m6.EnumC3973h;
import o6.InterfaceC4139c;
import p6.InterfaceC4237b;
import p6.InterfaceC4239d;

/* compiled from: Downsampler.java */
/* loaded from: classes2.dex */
public final class o {

    /* renamed from: f, reason: collision with root package name */
    public static final C3971f<EnumC3967b> f33340f = C3971f.f("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", EnumC3967b.f45111D);

    /* renamed from: g, reason: collision with root package name */
    public static final C3971f<EnumC3973h> f33341g = C3971f.e("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");

    /* renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final C3971f<n> f33342h = n.f33335h;

    /* renamed from: i, reason: collision with root package name */
    public static final C3971f<Boolean> f33343i;

    /* renamed from: j, reason: collision with root package name */
    public static final C3971f<Boolean> f33344j;

    /* renamed from: k, reason: collision with root package name */
    private static final Set<String> f33345k;

    /* renamed from: l, reason: collision with root package name */
    private static final b f33346l;

    /* renamed from: m, reason: collision with root package name */
    private static final Set<ImageHeaderParser.ImageType> f33347m;

    /* renamed from: n, reason: collision with root package name */
    private static final Queue<BitmapFactory.Options> f33348n;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4239d f33349a;

    /* renamed from: b, reason: collision with root package name */
    private final DisplayMetrics f33350b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4237b f33351c;

    /* renamed from: d, reason: collision with root package name */
    private final List<ImageHeaderParser> f33352d;

    /* renamed from: e, reason: collision with root package name */
    private final t f33353e = t.b();

    /* compiled from: Downsampler.java */
    public interface b {
        void a(InterfaceC4239d interfaceC4239d, Bitmap bitmap);

        void b();
    }

    static {
        Boolean bool = Boolean.FALSE;
        f33343i = C3971f.f("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f33344j = C3971f.f("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        f33345k = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f33346l = new a();
        f33347m = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        f33348n = H6.l.f(0);
    }

    public o(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, InterfaceC4239d interfaceC4239d, InterfaceC4237b interfaceC4237b) {
        this.f33352d = list;
        this.f33350b = (DisplayMetrics) H6.k.d(displayMetrics);
        this.f33349a = (InterfaceC4239d) H6.k.d(interfaceC4239d);
        this.f33351c = (InterfaceC4237b) H6.k.d(interfaceC4237b);
    }

    private static int a(double d10) {
        return x((d10 / (r1 / r0)) * x(l(d10) * d10));
    }

    private void b(u uVar, EnumC3967b enumC3967b, boolean z10, boolean z11, BitmapFactory.Options options, int i10, int i11) {
        boolean zHasAlpha;
        if (this.f33353e.g(i10, i11, options, z10, z11)) {
            return;
        }
        if (enumC3967b == EnumC3967b.PREFER_ARGB_8888) {
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            return;
        }
        try {
            zHasAlpha = uVar.d().hasAlpha();
        } catch (IOException e10) {
            if (Log.isLoggable("Downsampler", 3)) {
                Log.d("Downsampler", "Cannot determine whether the image has alpha or not from header, format " + enumC3967b, e10);
            }
            zHasAlpha = false;
        }
        Bitmap.Config config = zHasAlpha ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
        options.inPreferredConfig = config;
        if (config == Bitmap.Config.RGB_565) {
            options.inDither = true;
        }
    }

    private static void c(ImageHeaderParser.ImageType imageType, u uVar, b bVar, InterfaceC4239d interfaceC4239d, n nVar, int i10, int i11, int i12, int i13, int i14, BitmapFactory.Options options) {
        int i15;
        int i16;
        int iFloor;
        int iFloor2;
        if (i11 <= 0 || i12 <= 0) {
            if (Log.isLoggable("Downsampler", 3)) {
                Log.d("Downsampler", "Unable to determine dimensions for: " + imageType + " with target [" + i13 + "x" + i14 + "]");
                return;
            }
            return;
        }
        if (r(i10)) {
            i16 = i11;
            i15 = i12;
        } else {
            i15 = i11;
            i16 = i12;
        }
        float fB = nVar.b(i15, i16, i13, i14);
        if (fB <= 0.0f) {
            throw new IllegalArgumentException("Cannot scale with factor: " + fB + " from: " + nVar + ", source: [" + i11 + "x" + i12 + "], target: [" + i13 + "x" + i14 + "]");
        }
        n.g gVarA = nVar.a(i15, i16, i13, i14);
        if (gVarA == null) {
            throw new IllegalArgumentException("Cannot round with null rounding");
        }
        float f10 = i15;
        float f11 = i16;
        int iX = i15 / x(fB * f10);
        int iX2 = i16 / x(fB * f11);
        n.g gVar = n.g.MEMORY;
        int iMax = Math.max(1, Integer.highestOneBit(gVarA == gVar ? Math.max(iX, iX2) : Math.min(iX, iX2)));
        if (gVarA == gVar && iMax < 1.0f / fB) {
            iMax <<= 1;
        }
        options.inSampleSize = iMax;
        if (imageType == ImageHeaderParser.ImageType.JPEG) {
            float fMin = Math.min(iMax, 8);
            iFloor = (int) Math.ceil(f10 / fMin);
            iFloor2 = (int) Math.ceil(f11 / fMin);
            int i17 = iMax / 8;
            if (i17 > 0) {
                iFloor /= i17;
                iFloor2 /= i17;
            }
        } else if (imageType == ImageHeaderParser.ImageType.PNG || imageType == ImageHeaderParser.ImageType.PNG_A) {
            float f12 = iMax;
            iFloor = (int) Math.floor(f10 / f12);
            iFloor2 = (int) Math.floor(f11 / f12);
        } else if (imageType.isWebp()) {
            float f13 = iMax;
            iFloor = Math.round(f10 / f13);
            iFloor2 = Math.round(f11 / f13);
        } else if (i15 % iMax == 0 && i16 % iMax == 0) {
            iFloor = i15 / iMax;
            iFloor2 = i16 / iMax;
        } else {
            int[] iArrM = m(uVar, options, bVar, interfaceC4239d);
            iFloor = iArrM[0];
            iFloor2 = iArrM[1];
        }
        double dB = nVar.b(iFloor, iFloor2, i13, i14);
        options.inTargetDensity = a(dB);
        options.inDensity = l(dB);
        if (s(options)) {
            options.inScaled = true;
        } else {
            options.inTargetDensity = 0;
            options.inDensity = 0;
        }
        if (Log.isLoggable("Downsampler", 2)) {
            Log.v("Downsampler", "Calculate scaling, source: [" + i11 + "x" + i12 + "], degreesToRotate: " + i10 + ", target: [" + i13 + "x" + i14 + "], power of two scaled: [" + iFloor + "x" + iFloor2 + "], exact scale factor: " + fB + ", power of 2 sample size: " + iMax + ", adjusted scale factor: " + dB + ", target density: " + options.inTargetDensity + ", density: " + options.inDensity);
        }
    }

    private InterfaceC4139c<Bitmap> e(u uVar, int i10, int i11, C3972g c3972g, b bVar) {
        byte[] bArr = (byte[]) this.f33351c.e(65536, byte[].class);
        BitmapFactory.Options optionsK = k();
        optionsK.inTempStorage = bArr;
        EnumC3967b enumC3967b = (EnumC3967b) c3972g.c(f33340f);
        EnumC3973h enumC3973h = (EnumC3973h) c3972g.c(f33341g);
        n nVar = (n) c3972g.c(n.f33335h);
        boolean zBooleanValue = ((Boolean) c3972g.c(f33343i)).booleanValue();
        C3971f<Boolean> c3971f = f33344j;
        try {
            return g.f(h(uVar, optionsK, nVar, enumC3967b, enumC3973h, c3972g.c(c3971f) != null && ((Boolean) c3972g.c(c3971f)).booleanValue(), i10, i11, zBooleanValue, bVar), this.f33349a);
        } finally {
            v(optionsK);
            this.f33351c.d(bArr);
        }
    }

    private Bitmap h(u uVar, BitmapFactory.Options options, n nVar, EnumC3967b enumC3967b, EnumC3973h enumC3973h, boolean z10, int i10, int i11, boolean z11, b bVar) {
        int i12;
        int i13;
        String str;
        int i14;
        ColorSpace colorSpace;
        int iRound;
        int i15;
        int i16;
        long jB = H6.g.b();
        int[] iArrM = m(uVar, options, bVar, this.f33349a);
        int i17 = iArrM[0];
        int i18 = iArrM[1];
        String str2 = options.outMimeType;
        boolean z12 = (i17 == -1 || i18 == -1) ? false : z10;
        int iA = uVar.a();
        int iG = B.g(iA);
        boolean zJ = B.j(iA);
        if (i10 == Integer.MIN_VALUE) {
            i12 = i11;
            i13 = r(iG) ? i18 : i17;
        } else {
            i12 = i11;
            i13 = i10;
        }
        int i19 = i12 == Integer.MIN_VALUE ? r(iG) ? i17 : i18 : i12;
        ImageHeaderParser.ImageType imageTypeD = uVar.d();
        c(imageTypeD, uVar, bVar, this.f33349a, nVar, iG, i17, i18, i13, i19, options);
        b(uVar, enumC3967b, z12, zJ, options, i13, i19);
        int i20 = Build.VERSION.SDK_INT;
        if (z(imageTypeD)) {
            if (i17 < 0 || i18 < 0 || !z11) {
                float f10 = s(options) ? options.inTargetDensity / options.inDensity : 1.0f;
                int i21 = options.inSampleSize;
                float f11 = i21;
                int iCeil = (int) Math.ceil(i17 / f11);
                int iCeil2 = (int) Math.ceil(i18 / f11);
                int iRound2 = Math.round(iCeil * f10);
                iRound = Math.round(iCeil2 * f10);
                str = "Downsampler";
                if (Log.isLoggable(str, 2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Calculated target [");
                    sb2.append(iRound2);
                    sb2.append("x");
                    sb2.append(iRound);
                    i15 = iRound2;
                    sb2.append("] for source [");
                    sb2.append(i17);
                    sb2.append("x");
                    sb2.append(i18);
                    sb2.append("], sampleSize: ");
                    sb2.append(i21);
                    sb2.append(", targetDensity: ");
                    sb2.append(options.inTargetDensity);
                    sb2.append(", density: ");
                    sb2.append(options.inDensity);
                    sb2.append(", density multiplier: ");
                    sb2.append(f10);
                    Log.v(str, sb2.toString());
                } else {
                    i15 = iRound2;
                }
                i16 = i15;
            } else {
                str = "Downsampler";
                i16 = i13;
                iRound = i19;
            }
            if (i16 > 0 && iRound > 0) {
                y(options, this.f33349a, i16, iRound);
            }
        } else {
            str = "Downsampler";
        }
        if (enumC3973h != null) {
            if (i20 >= 28) {
                options.inPreferredColorSpace = ColorSpace.get((enumC3973h == EnumC3973h.DISPLAY_P3 && (colorSpace = options.outColorSpace) != null && colorSpace.isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
            } else {
                options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
        }
        Bitmap bitmapI = i(uVar, options, bVar, this.f33349a);
        bVar.a(this.f33349a, bitmapI);
        if (Log.isLoggable(str, 2)) {
            i14 = iA;
            t(i17, i18, str2, options, bitmapI, i10, i11, jB);
        } else {
            i14 = iA;
        }
        if (bitmapI == null) {
            return null;
        }
        bitmapI.setDensity(this.f33350b.densityDpi);
        Bitmap bitmapK = B.k(this.f33349a, bitmapI, i14);
        if (bitmapI.equals(bitmapK)) {
            return bitmapK;
        }
        this.f33349a.c(bitmapI);
        return bitmapK;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
    
        throw r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Bitmap i(com.bumptech.glide.load.resource.bitmap.u r5, android.graphics.BitmapFactory.Options r6, com.bumptech.glide.load.resource.bitmap.o.b r7, p6.InterfaceC4239d r8) {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r6.inJustDecodeBounds
            if (r1 != 0) goto Lc
            r7.b()
            r5.c()
        Lc:
            int r1 = r6.outWidth
            int r2 = r6.outHeight
            java.lang.String r3 = r6.outMimeType
            java.util.concurrent.locks.Lock r4 = com.bumptech.glide.load.resource.bitmap.B.f()
            r4.lock()
            android.graphics.Bitmap r5 = r5.b(r6)     // Catch: java.lang.Throwable -> L25 java.lang.IllegalArgumentException -> L27
            java.util.concurrent.locks.Lock r6 = com.bumptech.glide.load.resource.bitmap.B.f()
            r6.unlock()
            return r5
        L25:
            r5 = move-exception
            goto L50
        L27:
            r4 = move-exception
            java.io.IOException r1 = u(r4, r1, r2, r3, r6)     // Catch: java.lang.Throwable -> L25
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L38
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch: java.lang.Throwable -> L25
        L38:
            android.graphics.Bitmap r0 = r6.inBitmap     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L4f
            r8.c(r0)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L4e
            r0 = 0
            r6.inBitmap = r0     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L4e
            android.graphics.Bitmap r5 = i(r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L4e
            java.util.concurrent.locks.Lock r6 = com.bumptech.glide.load.resource.bitmap.B.f()
            r6.unlock()
            return r5
        L4e:
            throw r1     // Catch: java.lang.Throwable -> L25
        L4f:
            throw r1     // Catch: java.lang.Throwable -> L25
        L50:
            java.util.concurrent.locks.Lock r6 = com.bumptech.glide.load.resource.bitmap.B.f()
            r6.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.o.i(com.bumptech.glide.load.resource.bitmap.u, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.resource.bitmap.o$b, p6.d):android.graphics.Bitmap");
    }

    @TargetApi(19)
    private static String j(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    private static synchronized BitmapFactory.Options k() {
        BitmapFactory.Options optionsPoll;
        Queue<BitmapFactory.Options> queue = f33348n;
        synchronized (queue) {
            optionsPoll = queue.poll();
        }
        if (optionsPoll == null) {
            optionsPoll = new BitmapFactory.Options();
            w(optionsPoll);
        }
        return optionsPoll;
    }

    private static int l(double d10) {
        if (d10 > 1.0d) {
            d10 = 1.0d / d10;
        }
        return (int) Math.round(d10 * 2.147483647E9d);
    }

    private static int[] m(u uVar, BitmapFactory.Options options, b bVar, InterfaceC4239d interfaceC4239d) {
        options.inJustDecodeBounds = true;
        i(uVar, options, bVar, interfaceC4239d);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    private static String n(BitmapFactory.Options options) {
        return j(options.inBitmap);
    }

    private static boolean r(int i10) {
        return i10 == 90 || i10 == 270;
    }

    private static boolean s(BitmapFactory.Options options) {
        int i10;
        int i11 = options.inTargetDensity;
        return i11 > 0 && (i10 = options.inDensity) > 0 && i11 != i10;
    }

    private static void t(int i10, int i11, String str, BitmapFactory.Options options, Bitmap bitmap, int i12, int i13, long j10) {
        Log.v("Downsampler", "Decoded " + j(bitmap) + " from [" + i10 + "x" + i11 + "] " + str + " with inBitmap " + n(options) + " for [" + i12 + "x" + i13 + "], sample size: " + options.inSampleSize + ", density: " + options.inDensity + ", target density: " + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + H6.g.a(j10));
    }

    private static IOException u(IllegalArgumentException illegalArgumentException, int i10, int i11, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i10 + ", outHeight: " + i11 + ", outMimeType: " + str + ", inBitmap: " + n(options), illegalArgumentException);
    }

    private static void v(BitmapFactory.Options options) {
        w(options);
        Queue<BitmapFactory.Options> queue = f33348n;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    private static void w(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.inPreferredColorSpace = null;
        options.outColorSpace = null;
        options.outConfig = null;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    private static int x(double d10) {
        return (int) (d10 + 0.5d);
    }

    @TargetApi(26)
    private static void y(BitmapFactory.Options options, InterfaceC4239d interfaceC4239d, int i10, int i11) {
        Bitmap.Config config = options.inPreferredConfig;
        if (config == Bitmap.Config.HARDWARE) {
            return;
        }
        Bitmap.Config config2 = options.outConfig;
        if (config2 != null) {
            config = config2;
        }
        options.inBitmap = interfaceC4239d.e(i10, i11, config);
    }

    private boolean z(ImageHeaderParser.ImageType imageType) {
        return true;
    }

    public InterfaceC4139c<Bitmap> d(ParcelFileDescriptor parcelFileDescriptor, int i10, int i11, C3972g c3972g) {
        return e(new u.c(parcelFileDescriptor, this.f33352d, this.f33351c), i10, i11, c3972g, f33346l);
    }

    public InterfaceC4139c<Bitmap> f(InputStream inputStream, int i10, int i11, C3972g c3972g, b bVar) {
        return e(new u.b(inputStream, this.f33352d, this.f33351c), i10, i11, c3972g, bVar);
    }

    public InterfaceC4139c<Bitmap> g(ByteBuffer byteBuffer, int i10, int i11, C3972g c3972g) {
        return e(new u.a(byteBuffer, this.f33352d, this.f33351c), i10, i11, c3972g, f33346l);
    }

    public boolean o(ParcelFileDescriptor parcelFileDescriptor) {
        return ParcelFileDescriptorRewinder.c();
    }

    public boolean p(InputStream inputStream) {
        return true;
    }

    public boolean q(ByteBuffer byteBuffer) {
        return true;
    }

    /* compiled from: Downsampler.java */
    class a implements b {
        a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.o.b
        public void b() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.o.b
        public void a(InterfaceC4239d interfaceC4239d, Bitmap bitmap) {
        }
    }
}
