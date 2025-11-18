package com.bumptech.glide.load.p131o.p132c;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.util.Log;
import com.bumptech.glide.load.engine.p126z.InterfaceC5413e;
import com.bumptech.glide.p145r.C5596j;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: TransformationUtils.java */
/* renamed from: com.bumptech.glide.load.o.c.w */
/* loaded from: classes.dex */
public final class C5502w {

    /* renamed from: a */
    private static final Paint f13775a = new Paint(6);

    /* renamed from: b */
    private static final Paint f13776b = new Paint(7);

    /* renamed from: c */
    private static final Paint f13777c;

    /* renamed from: d */
    private static final Set<String> f13778d;

    /* renamed from: e */
    private static final Lock f13779e;

    /* compiled from: TransformationUtils.java */
    /* renamed from: com.bumptech.glide.load.o.c.w$a */
    private static final class a implements Lock {
        a() {
        }

        @Override // java.util.concurrent.locks.Lock
        public void lock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
        }

        @Override // java.util.concurrent.locks.Lock
        public Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock() {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock(long j2, TimeUnit timeUnit) throws InterruptedException {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public void unlock() {
        }
    }

    static {
        HashSet hashSet = new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"));
        f13778d = hashSet;
        f13779e = hashSet.contains(Build.MODEL) ? new ReentrantLock() : new a();
        Paint paint = new Paint(7);
        f13777c = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    /* renamed from: a */
    private static void m10671a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        Lock lock = f13779e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f13775a);
            m10675e(canvas);
            lock.unlock();
        } catch (Throwable th) {
            f13779e.unlock();
            throw th;
        }
    }

    /* renamed from: b */
    public static Bitmap m10672b(InterfaceC5413e interfaceC5413e, Bitmap bitmap, int i2, int i3) {
        float width;
        float height;
        if (bitmap.getWidth() == i2 && bitmap.getHeight() == i3) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width2 = 0.0f;
        if (bitmap.getWidth() * i3 > bitmap.getHeight() * i2) {
            width = i3 / bitmap.getHeight();
            width2 = (i2 - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i2 / bitmap.getWidth();
            height = (i3 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (width2 + 0.5f), (int) (height + 0.5f));
        Bitmap bitmapMo10388d = interfaceC5413e.mo10388d(i2, i3, m10681k(bitmap));
        m10686p(bitmap, bitmapMo10388d);
        m10671a(bitmap, bitmapMo10388d, matrix);
        return bitmapMo10388d;
    }

    /* renamed from: c */
    public static Bitmap m10673c(InterfaceC5413e interfaceC5413e, Bitmap bitmap, int i2, int i3) {
        if (bitmap.getWidth() > i2 || bitmap.getHeight() > i3) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return m10676f(interfaceC5413e, bitmap, i2, i3);
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
        }
        return bitmap;
    }

    /* renamed from: d */
    public static Bitmap m10674d(InterfaceC5413e interfaceC5413e, Bitmap bitmap, int i2, int i3) {
        int iMin = Math.min(i2, i3);
        float f2 = iMin;
        float f3 = f2 / 2.0f;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float fMax = Math.max(f2 / width, f2 / height);
        float f4 = width * fMax;
        float f5 = fMax * height;
        float f6 = (f2 - f4) / 2.0f;
        float f7 = (f2 - f5) / 2.0f;
        RectF rectF = new RectF(f6, f7, f4 + f6, f5 + f7);
        Bitmap bitmapM10677g = m10677g(interfaceC5413e, bitmap);
        Bitmap bitmapMo10388d = interfaceC5413e.mo10388d(iMin, iMin, m10678h(bitmap));
        bitmapMo10388d.setHasAlpha(true);
        Lock lock = f13779e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapMo10388d);
            canvas.drawCircle(f3, f3, f3, f13776b);
            canvas.drawBitmap(bitmapM10677g, (Rect) null, rectF, f13777c);
            m10675e(canvas);
            lock.unlock();
            if (!bitmapM10677g.equals(bitmap)) {
                interfaceC5413e.mo10387c(bitmapM10677g);
            }
            return bitmapMo10388d;
        } catch (Throwable th) {
            f13779e.unlock();
            throw th;
        }
    }

    /* renamed from: e */
    private static void m10675e(Canvas canvas) {
        canvas.setBitmap(null);
    }

    /* renamed from: f */
    public static Bitmap m10676f(InterfaceC5413e interfaceC5413e, Bitmap bitmap, int i2, int i3) {
        if (bitmap.getWidth() == i2 && bitmap.getHeight() == i3) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size matches input, returning input");
            }
            return bitmap;
        }
        float fMin = Math.min(i2 / bitmap.getWidth(), i3 / bitmap.getHeight());
        int iRound = Math.round(bitmap.getWidth() * fMin);
        int iRound2 = Math.round(bitmap.getHeight() * fMin);
        if (bitmap.getWidth() == iRound && bitmap.getHeight() == iRound2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "adjusted target size matches input, returning input");
            }
            return bitmap;
        }
        Bitmap bitmapMo10388d = interfaceC5413e.mo10388d((int) (bitmap.getWidth() * fMin), (int) (bitmap.getHeight() * fMin), m10681k(bitmap));
        m10686p(bitmap, bitmapMo10388d);
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "request: " + i2 + "x" + i3);
            Log.v("TransformationUtils", "toFit:   " + bitmap.getWidth() + "x" + bitmap.getHeight());
            Log.v("TransformationUtils", "toReuse: " + bitmapMo10388d.getWidth() + "x" + bitmapMo10388d.getHeight());
            StringBuilder sb = new StringBuilder();
            sb.append("minPct:   ");
            sb.append(fMin);
            Log.v("TransformationUtils", sb.toString());
        }
        Matrix matrix = new Matrix();
        matrix.setScale(fMin, fMin);
        m10671a(bitmap, bitmapMo10388d, matrix);
        return bitmapMo10388d;
    }

    /* renamed from: g */
    private static Bitmap m10677g(InterfaceC5413e interfaceC5413e, Bitmap bitmap) {
        Bitmap.Config configM10678h = m10678h(bitmap);
        if (configM10678h.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap bitmapMo10388d = interfaceC5413e.mo10388d(bitmap.getWidth(), bitmap.getHeight(), configM10678h);
        new Canvas(bitmapMo10388d).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return bitmapMo10388d;
    }

    /* renamed from: h */
    private static Bitmap.Config m10678h(Bitmap bitmap) {
        return (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(bitmap.getConfig())) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGBA_F16;
    }

    /* renamed from: i */
    public static Lock m10679i() {
        return f13779e;
    }

    /* renamed from: j */
    public static int m10680j(int i2) {
        switch (i2) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    /* renamed from: k */
    private static Bitmap.Config m10681k(Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
    }

    /* renamed from: l */
    static void m10682l(int i2, Matrix matrix) {
        switch (i2) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.setRotate(180.0f);
                break;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 6:
                matrix.setRotate(90.0f);
                break;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 8:
                matrix.setRotate(-90.0f);
                break;
        }
    }

    /* renamed from: m */
    public static boolean m10683m(int i2) {
        switch (i2) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: n */
    public static Bitmap m10684n(InterfaceC5413e interfaceC5413e, Bitmap bitmap, int i2) {
        if (!m10683m(i2)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        m10682l(i2, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap bitmapMo10388d = interfaceC5413e.mo10388d(Math.round(rectF.width()), Math.round(rectF.height()), m10681k(bitmap));
        matrix.postTranslate(-rectF.left, -rectF.top);
        bitmapMo10388d.setHasAlpha(bitmap.hasAlpha());
        m10671a(bitmap, bitmapMo10388d, matrix);
        return bitmapMo10388d;
    }

    /* renamed from: o */
    public static Bitmap m10685o(InterfaceC5413e interfaceC5413e, Bitmap bitmap, int i2) {
        C5596j.m11039a(i2 > 0, "roundingRadius must be greater than 0.");
        Bitmap.Config configM10678h = m10678h(bitmap);
        Bitmap bitmapM10677g = m10677g(interfaceC5413e, bitmap);
        Bitmap bitmapMo10388d = interfaceC5413e.mo10388d(bitmapM10677g.getWidth(), bitmapM10677g.getHeight(), configM10678h);
        bitmapMo10388d.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmapM10677g, tileMode, tileMode);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, bitmapMo10388d.getWidth(), bitmapMo10388d.getHeight());
        Lock lock = f13779e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapMo10388d);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            float f2 = i2;
            canvas.drawRoundRect(rectF, f2, f2, paint);
            m10675e(canvas);
            lock.unlock();
            if (!bitmapM10677g.equals(bitmap)) {
                interfaceC5413e.mo10387c(bitmapM10677g);
            }
            return bitmapMo10388d;
        } catch (Throwable th) {
            f13779e.unlock();
            throw th;
        }
    }

    /* renamed from: p */
    public static void m10686p(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }
}
