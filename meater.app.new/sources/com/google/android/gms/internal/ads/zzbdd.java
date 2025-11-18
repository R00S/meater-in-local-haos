package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

@zzard
@TargetApi(14)
/* loaded from: classes2.dex */
public final class zzbdd extends Thread implements SurfaceTexture.OnFrameAvailableListener, InterfaceC6627e8 {

    /* renamed from: f */
    private static final float[] f22812f = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};

    /* renamed from: A */
    private final Object f22813A;

    /* renamed from: B */
    private EGL10 f22814B;

    /* renamed from: C */
    private EGLDisplay f22815C;

    /* renamed from: D */
    private EGLContext f22816D;

    /* renamed from: E */
    private EGLSurface f22817E;

    /* renamed from: F */
    private volatile boolean f22818F;

    /* renamed from: G */
    private volatile boolean f22819G;

    /* renamed from: g */
    private final C6553c8 f22820g;

    /* renamed from: h */
    private final float[] f22821h;

    /* renamed from: i */
    private final float[] f22822i;

    /* renamed from: j */
    private final float[] f22823j;

    /* renamed from: k */
    private final float[] f22824k;

    /* renamed from: l */
    private final float[] f22825l;

    /* renamed from: m */
    private final float[] f22826m;

    /* renamed from: n */
    private final float[] f22827n;

    /* renamed from: o */
    private float f22828o;

    /* renamed from: p */
    private float f22829p;

    /* renamed from: q */
    private float f22830q;

    /* renamed from: r */
    private int f22831r;

    /* renamed from: s */
    private int f22832s;

    /* renamed from: t */
    private SurfaceTexture f22833t;

    /* renamed from: u */
    private SurfaceTexture f22834u;

    /* renamed from: v */
    private int f22835v;

    /* renamed from: w */
    private int f22836w;

    /* renamed from: x */
    private int f22837x;

    /* renamed from: y */
    private FloatBuffer f22838y;

    /* renamed from: z */
    private final CountDownLatch f22839z;

    public zzbdd(Context context) {
        super("SphericalVideoProcessor");
        float[] fArr = f22812f;
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(fArr.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f22838y = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr).position(0);
        this.f22821h = new float[9];
        this.f22822i = new float[9];
        this.f22823j = new float[9];
        this.f22824k = new float[9];
        this.f22825l = new float[9];
        this.f22826m = new float[9];
        this.f22827n = new float[9];
        this.f22828o = Float.NaN;
        C6553c8 c6553c8 = new C6553c8(context);
        this.f22820g = c6553c8;
        c6553c8.m14969c(this);
        this.f22839z = new CountDownLatch(1);
        this.f22813A = new Object();
    }

    /* renamed from: c */
    private static void m17468c(float[] fArr, float f2) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d2 = f2;
        fArr[4] = (float) Math.cos(d2);
        fArr[5] = (float) (-Math.sin(d2));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d2);
        fArr[8] = (float) Math.cos(d2);
    }

    /* renamed from: d */
    private static void m17469d(float[] fArr, float[] fArr2, float[] fArr3) {
        fArr[0] = (fArr2[0] * fArr3[0]) + (fArr2[1] * fArr3[3]) + (fArr2[2] * fArr3[6]);
        fArr[1] = (fArr2[0] * fArr3[1]) + (fArr2[1] * fArr3[4]) + (fArr2[2] * fArr3[7]);
        fArr[2] = (fArr2[0] * fArr3[2]) + (fArr2[1] * fArr3[5]) + (fArr2[2] * fArr3[8]);
        fArr[3] = (fArr2[3] * fArr3[0]) + (fArr2[4] * fArr3[3]) + (fArr2[5] * fArr3[6]);
        fArr[4] = (fArr2[3] * fArr3[1]) + (fArr2[4] * fArr3[4]) + (fArr2[5] * fArr3[7]);
        fArr[5] = (fArr2[3] * fArr3[2]) + (fArr2[4] * fArr3[5]) + (fArr2[5] * fArr3[8]);
        fArr[6] = (fArr2[6] * fArr3[0]) + (fArr2[7] * fArr3[3]) + (fArr2[8] * fArr3[6]);
        fArr[7] = (fArr2[6] * fArr3[1]) + (fArr2[7] * fArr3[4]) + (fArr2[8] * fArr3[7]);
        fArr[8] = (fArr2[6] * fArr3[2]) + (fArr2[7] * fArr3[5]) + (fArr2[8] * fArr3[8]);
    }

    /* renamed from: f */
    private static void m17470f(float[] fArr, float f2) {
        double d2 = f2;
        fArr[0] = (float) Math.cos(d2);
        fArr[1] = (float) (-Math.sin(d2));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d2);
        fArr[4] = (float) Math.cos(d2);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    /* renamed from: g */
    private static int m17471g(int i2, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i2);
        m17472h("createShader");
        if (iGlCreateShader == 0) {
            return iGlCreateShader;
        }
        GLES20.glShaderSource(iGlCreateShader, str);
        m17472h("shaderSource");
        GLES20.glCompileShader(iGlCreateShader);
        m17472h("compileShader");
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        m17472h("getShaderiv");
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Could not compile shader ");
        sb.append(i2);
        sb.append(":");
        Log.e("SphericalVideoRenderer", sb.toString());
        Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(iGlCreateShader));
        GLES20.glDeleteShader(iGlCreateShader);
        m17472h("deleteShader");
        return 0;
    }

    /* renamed from: h */
    private static void m17472h(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21);
            sb.append(str);
            sb.append(": glError ");
            sb.append(iGlGetError);
            Log.e("SphericalVideoRenderer", sb.toString());
        }
    }

    @VisibleForTesting
    /* renamed from: l */
    private final boolean m17473l() {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = this.f22817E;
        boolean zEglDestroyContext = false;
        if (eGLSurface2 != null && eGLSurface2 != (eGLSurface = EGL10.EGL_NO_SURFACE)) {
            zEglDestroyContext = this.f22814B.eglDestroySurface(this.f22815C, this.f22817E) | this.f22814B.eglMakeCurrent(this.f22815C, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT) | false;
            this.f22817E = null;
        }
        EGLContext eGLContext = this.f22816D;
        if (eGLContext != null) {
            zEglDestroyContext |= this.f22814B.eglDestroyContext(this.f22815C, eGLContext);
            this.f22816D = null;
        }
        EGLDisplay eGLDisplay = this.f22815C;
        if (eGLDisplay == null) {
            return zEglDestroyContext;
        }
        boolean zEglTerminate = zEglDestroyContext | this.f22814B.eglTerminate(eGLDisplay);
        this.f22815C = null;
        return zEglTerminate;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6627e8
    /* renamed from: a */
    public final void mo15104a() {
        synchronized (this.f22813A) {
            this.f22813A.notifyAll();
        }
    }

    /* renamed from: b */
    public final void m17474b(SurfaceTexture surfaceTexture, int i2, int i3) {
        this.f22832s = i2;
        this.f22831r = i3;
        this.f22834u = surfaceTexture;
    }

    /* renamed from: e */
    public final void m17475e(float f2, float f3) {
        float f4;
        float f5;
        float f6;
        int i2 = this.f22832s;
        int i3 = this.f22831r;
        if (i2 > i3) {
            f4 = (f2 * 1.7453293f) / i2;
            f5 = f3 * 1.7453293f;
            f6 = i2;
        } else {
            f4 = (f2 * 1.7453293f) / i3;
            f5 = f3 * 1.7453293f;
            f6 = i3;
        }
        this.f22829p -= f4;
        float f7 = this.f22830q - (f5 / f6);
        this.f22830q = f7;
        if (f7 < -1.5707964f) {
            this.f22830q = -1.5707964f;
        }
        if (this.f22830q > 1.5707964f) {
            this.f22830q = 1.5707964f;
        }
    }

    /* renamed from: i */
    public final void m17476i(int i2, int i3) {
        synchronized (this.f22813A) {
            this.f22832s = i2;
            this.f22831r = i3;
            this.f22818F = true;
            this.f22813A.notifyAll();
        }
    }

    /* renamed from: j */
    public final void m17477j() {
        synchronized (this.f22813A) {
            this.f22819G = true;
            this.f22834u = null;
            this.f22813A.notifyAll();
        }
    }

    /* renamed from: k */
    public final SurfaceTexture m17478k() throws InterruptedException {
        if (this.f22834u == null) {
            return null;
        }
        try {
            this.f22839z.await();
        } catch (InterruptedException unused) {
        }
        return this.f22833t;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f22837x++;
        synchronized (this.f22813A) {
            this.f22813A.notifyAll();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1020
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbdd.run():void");
    }
}
