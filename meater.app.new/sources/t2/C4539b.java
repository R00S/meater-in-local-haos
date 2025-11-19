package t2;

import X1.C1804a;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import androidx.media3.common.util.GlUtil;

/* compiled from: PlaceholderSurface.java */
/* renamed from: t2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4539b extends Surface {

    /* renamed from: E, reason: collision with root package name */
    private static int f49824E;

    /* renamed from: F, reason: collision with root package name */
    private static boolean f49825F;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f49826B;

    /* renamed from: C, reason: collision with root package name */
    private final HandlerThreadC0706b f49827C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f49828D;

    /* compiled from: PlaceholderSurface.java */
    /* renamed from: t2.b$b, reason: collision with other inner class name */
    private static class HandlerThreadC0706b extends HandlerThread implements Handler.Callback {

        /* renamed from: B, reason: collision with root package name */
        private androidx.media3.common.util.a f49829B;

        /* renamed from: C, reason: collision with root package name */
        private Handler f49830C;

        /* renamed from: D, reason: collision with root package name */
        private Error f49831D;

        /* renamed from: E, reason: collision with root package name */
        private RuntimeException f49832E;

        /* renamed from: F, reason: collision with root package name */
        private C4539b f49833F;

        public HandlerThreadC0706b() {
            super("ExoPlayer:PlaceholderSurface");
        }

        private void b(int i10) throws GlUtil.GlException {
            C1804a.e(this.f49829B);
            this.f49829B.h(i10);
            this.f49833F = new C4539b(this, this.f49829B.g(), i10 != 0);
        }

        private void d() {
            C1804a.e(this.f49829B);
            this.f49829B.i();
        }

        public C4539b a(int i10) {
            boolean z10;
            start();
            this.f49830C = new Handler(getLooper(), this);
            this.f49829B = new androidx.media3.common.util.a(this.f49830C);
            synchronized (this) {
                z10 = false;
                this.f49830C.obtainMessage(1, i10, 0).sendToTarget();
                while (this.f49833F == null && this.f49832E == null && this.f49831D == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z10 = true;
                    }
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f49832E;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = this.f49831D;
            if (error == null) {
                return (C4539b) C1804a.e(this.f49833F);
            }
            throw error;
        }

        public void c() {
            C1804a.e(this.f49830C);
            this.f49830C.sendEmptyMessage(2);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            try {
                if (i10 != 1) {
                    if (i10 != 2) {
                        return true;
                    }
                    try {
                        d();
                    } finally {
                        try {
                            return true;
                        } finally {
                        }
                    }
                    return true;
                }
                try {
                    b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (GlUtil.GlException e10) {
                    X1.n.d("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                    this.f49832E = new IllegalStateException(e10);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e11) {
                    X1.n.d("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                    this.f49831D = e11;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e12) {
                    X1.n.d("PlaceholderSurface", "Failed to initialize placeholder surface", e12);
                    this.f49832E = e12;
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th) {
                synchronized (this) {
                    notify();
                    throw th;
                }
            }
        }
    }

    private static int a(Context context) {
        if (GlUtil.i(context)) {
            return GlUtil.j() ? 1 : 2;
        }
        return 0;
    }

    public static synchronized boolean b(Context context) {
        try {
            if (!f49825F) {
                f49824E = a(context);
                f49825F = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f49824E != 0;
    }

    public static C4539b c(Context context, boolean z10) {
        C1804a.g(!z10 || b(context));
        return new HandlerThreadC0706b().a(z10 ? f49824E : 0);
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.f49827C) {
            try {
                if (!this.f49828D) {
                    this.f49827C.c();
                    this.f49828D = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private C4539b(HandlerThreadC0706b handlerThreadC0706b, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f49827C = handlerThreadC0706b;
        this.f49826B = z10;
    }
}
