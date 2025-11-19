package d2;

import X1.C1804a;
import android.os.HandlerThread;
import android.os.Looper;

/* compiled from: PlaybackLooperProvider.java */
/* renamed from: d2.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3028F {

    /* renamed from: a, reason: collision with root package name */
    private final Object f39669a;

    /* renamed from: b, reason: collision with root package name */
    private Looper f39670b;

    /* renamed from: c, reason: collision with root package name */
    private HandlerThread f39671c;

    /* renamed from: d, reason: collision with root package name */
    private int f39672d;

    public C3028F() {
        this(null);
    }

    public Looper a() {
        Looper looper;
        synchronized (this.f39669a) {
            try {
                if (this.f39670b == null) {
                    C1804a.g(this.f39672d == 0 && this.f39671c == null);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    this.f39671c = handlerThread;
                    handlerThread.start();
                    this.f39670b = this.f39671c.getLooper();
                }
                this.f39672d++;
                looper = this.f39670b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return looper;
    }

    public void b() {
        HandlerThread handlerThread;
        synchronized (this.f39669a) {
            try {
                C1804a.g(this.f39672d > 0);
                int i10 = this.f39672d - 1;
                this.f39672d = i10;
                if (i10 == 0 && (handlerThread = this.f39671c) != null) {
                    handlerThread.quit();
                    this.f39671c = null;
                    this.f39670b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C3028F(Looper looper) {
        this.f39669a = new Object();
        this.f39670b = looper;
        this.f39671c = null;
        this.f39672d = 0;
    }
}
