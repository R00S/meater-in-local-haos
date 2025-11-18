package androidx.media3.common.util;

import X1.C1804a;
import X1.L;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import androidx.media3.common.util.GlUtil;

/* compiled from: EGLSurfaceTexture.java */
/* loaded from: classes.dex */
public final class a implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: H, reason: collision with root package name */
    private static final int[] f26101H = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: B, reason: collision with root package name */
    private final Handler f26102B;

    /* renamed from: C, reason: collision with root package name */
    private final int[] f26103C;

    /* renamed from: D, reason: collision with root package name */
    private EGLDisplay f26104D;

    /* renamed from: E, reason: collision with root package name */
    private EGLContext f26105E;

    /* renamed from: F, reason: collision with root package name */
    private EGLSurface f26106F;

    /* renamed from: G, reason: collision with root package name */
    private SurfaceTexture f26107G;

    /* compiled from: EGLSurfaceTexture.java */
    /* renamed from: androidx.media3.common.util.a$a, reason: collision with other inner class name */
    public interface InterfaceC0369a {
    }

    public a(Handler handler) {
        this(handler, null);
    }

    private static EGLConfig a(EGLDisplay eGLDisplay) throws GlUtil.GlException {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, f26101H, 0, eGLConfigArr, 0, 1, iArr, 0);
        GlUtil.c(zEglChooseConfig && iArr[0] > 0 && eGLConfigArr[0] != null, L.G("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
        return eGLConfigArr[0];
    }

    private static EGLContext b(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i10) throws GlUtil.GlException {
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, i10 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        GlUtil.c(eGLContextEglCreateContext != null, "eglCreateContext failed");
        return eGLContextEglCreateContext;
    }

    private static EGLSurface c(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i10) throws GlUtil.GlException {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        if (i10 == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i10 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            GlUtil.c(eGLSurfaceEglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
        }
        GlUtil.c(EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContext), "eglMakeCurrent failed");
        return eGLSurfaceEglCreatePbufferSurface;
    }

    private static void e(int[] iArr) throws GlUtil.GlException {
        GLES20.glGenTextures(1, iArr, 0);
        GlUtil.b();
    }

    private static EGLDisplay f() throws GlUtil.GlException {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        GlUtil.c(eGLDisplayEglGetDisplay != null, "eglGetDisplay failed");
        int[] iArr = new int[2];
        GlUtil.c(EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
        return eGLDisplayEglGetDisplay;
    }

    public SurfaceTexture g() {
        return (SurfaceTexture) C1804a.e(this.f26107G);
    }

    public void h(int i10) throws GlUtil.GlException {
        EGLDisplay eGLDisplayF = f();
        this.f26104D = eGLDisplayF;
        EGLConfig eGLConfigA = a(eGLDisplayF);
        EGLContext eGLContextB = b(this.f26104D, eGLConfigA, i10);
        this.f26105E = eGLContextB;
        this.f26106F = c(this.f26104D, eGLConfigA, eGLContextB, i10);
        e(this.f26103C);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f26103C[0]);
        this.f26107G = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    public void i() {
        this.f26102B.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f26107G;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f26103C, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f26104D;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f26104D;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f26106F;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f26104D, this.f26106F);
            }
            EGLContext eGLContext = this.f26105E;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f26104D, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = this.f26104D;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f26104D);
            }
            this.f26104D = null;
            this.f26105E = null;
            this.f26106F = null;
            this.f26107G = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f26102B.post(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        d();
        SurfaceTexture surfaceTexture = this.f26107G;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    public a(Handler handler, InterfaceC0369a interfaceC0369a) {
        this.f26102B = handler;
        this.f26103C = new int[1];
    }

    private void d() {
    }
}
