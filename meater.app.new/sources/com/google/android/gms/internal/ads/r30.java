package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;

/* loaded from: classes2.dex */
final class r30 extends HandlerThread implements SurfaceTexture.OnFrameAvailableListener, Handler.Callback {

    /* renamed from: f */
    private final int[] f20427f;

    /* renamed from: g */
    private Handler f20428g;

    /* renamed from: h */
    private SurfaceTexture f20429h;

    /* renamed from: i */
    private Error f20430i;

    /* renamed from: j */
    private RuntimeException f20431j;

    /* renamed from: k */
    private zztd f20432k;

    public r30() {
        super("dummySurface");
        this.f20427f = new int[1];
    }

    /* renamed from: a */
    public final void m15816a() {
        this.f20428g.sendEmptyMessage(3);
    }

    /* renamed from: b */
    public final zztd m15817b(boolean z) {
        boolean z2;
        start();
        this.f20428g = new Handler(getLooper(), this);
        synchronized (this) {
            z2 = false;
            this.f20428g.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
            while (this.f20432k == null && this.f20431j == null && this.f20430i == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.f20431j;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = this.f20430i;
        if (error == null) {
            return this.f20432k;
        }
        throw error;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i2 = message.what;
        try {
            if (i2 != 1) {
                if (i2 == 2) {
                    this.f20429h.updateTexImage();
                    return true;
                }
                if (i2 != 3) {
                    return true;
                }
                try {
                    try {
                        this.f20429h.release();
                    } catch (Throwable th) {
                        try {
                            Log.e("DummySurface", "Failed to release dummy surface", th);
                        } finally {
                            quit();
                        }
                    }
                    return true;
                } finally {
                    this.f20432k = null;
                    this.f20429h = null;
                    GLES20.glDeleteTextures(1, this.f20427f, 0);
                }
            }
            try {
                try {
                    boolean z = message.arg1 != 0;
                    EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
                    zzsk.m20482f(eGLDisplayEglGetDisplay != null, "eglGetDisplay failed");
                    int[] iArr = new int[2];
                    zzsk.m20482f(EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    int[] iArr2 = new int[1];
                    zzsk.m20482f(EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] > 0 && eGLConfigArr[0] != null, "eglChooseConfig failed");
                    EGLConfig eGLConfig = eGLConfigArr[0];
                    EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplayEglGetDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, z ? new int[]{12440, 2, 12992, 1, 12344} : new int[]{12440, 2, 12344}, 0);
                    zzsk.m20482f(eGLContextEglCreateContext != null, "eglCreateContext failed");
                    EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplayEglGetDisplay, eGLConfig, z ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                    zzsk.m20482f(eGLSurfaceEglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
                    zzsk.m20482f(EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext), "eglMakeCurrent failed");
                    GLES20.glGenTextures(1, this.f20427f, 0);
                    SurfaceTexture surfaceTexture = new SurfaceTexture(this.f20427f[0]);
                    this.f20429h = surfaceTexture;
                    surfaceTexture.setOnFrameAvailableListener(this);
                    this.f20432k = new zztd(this, this.f20429h, z);
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e2) {
                    Log.e("DummySurface", "Failed to initialize dummy surface", e2);
                    this.f20431j = e2;
                    synchronized (this) {
                        notify();
                    }
                }
            } catch (Error e3) {
                Log.e("DummySurface", "Failed to initialize dummy surface", e3);
                this.f20430i = e3;
                synchronized (this) {
                    notify();
                }
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f20428g.sendEmptyMessage(2);
    }
}
