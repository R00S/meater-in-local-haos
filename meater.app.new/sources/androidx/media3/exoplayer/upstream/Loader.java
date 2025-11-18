package androidx.media3.exoplayer.upstream;

import X1.C1804a;
import X1.F;
import X1.InterfaceC1811h;
import X1.L;
import X1.n;
import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import r2.k;
import s2.InterfaceExecutorC4472a;

/* loaded from: classes.dex */
public final class Loader implements k {

    /* renamed from: d, reason: collision with root package name */
    public static final c f27839d = h(false, -9223372036854775807L);

    /* renamed from: e, reason: collision with root package name */
    public static final c f27840e = h(true, -9223372036854775807L);

    /* renamed from: f, reason: collision with root package name */
    public static final c f27841f;

    /* renamed from: g, reason: collision with root package name */
    public static final c f27842g;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorC4472a f27843a;

    /* renamed from: b, reason: collision with root package name */
    private d<? extends e> f27844b;

    /* renamed from: c, reason: collision with root package name */
    private IOException f27845c;

    public static final class UnexpectedLoaderException extends IOException {
        public UnexpectedLoaderException(Throwable th) {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unexpected ");
            sb2.append(th.getClass().getSimpleName());
            if (th.getMessage() != null) {
                str = ": " + th.getMessage();
            } else {
                str = "";
            }
            sb2.append(str);
            super(sb2.toString(), th);
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final int f27846a;

        /* renamed from: b, reason: collision with root package name */
        private final long f27847b;

        public boolean c() {
            int i10 = this.f27846a;
            return i10 == 0 || i10 == 1;
        }

        private c(int i10, long j10) {
            this.f27846a = i10;
            this.f27847b = j10;
        }
    }

    @SuppressLint({"HandlerLeak"})
    private final class d<T extends e> extends Handler implements Runnable {

        /* renamed from: B, reason: collision with root package name */
        public final int f27848B;

        /* renamed from: C, reason: collision with root package name */
        private final T f27849C;

        /* renamed from: D, reason: collision with root package name */
        private final long f27850D;

        /* renamed from: E, reason: collision with root package name */
        private b<T> f27851E;

        /* renamed from: F, reason: collision with root package name */
        private IOException f27852F;

        /* renamed from: G, reason: collision with root package name */
        private int f27853G;

        /* renamed from: H, reason: collision with root package name */
        private Thread f27854H;

        /* renamed from: I, reason: collision with root package name */
        private boolean f27855I;

        /* renamed from: J, reason: collision with root package name */
        private volatile boolean f27856J;

        public d(Looper looper, T t10, b<T> bVar, int i10, long j10) {
            super(looper);
            this.f27849C = t10;
            this.f27851E = bVar;
            this.f27848B = i10;
            this.f27850D = j10;
        }

        private void b() {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            ((b) C1804a.e(this.f27851E)).o(this.f27849C, jElapsedRealtime, jElapsedRealtime - this.f27850D, this.f27853G);
            this.f27852F = null;
            Loader.this.f27843a.execute((Runnable) C1804a.e(Loader.this.f27844b));
        }

        private void c() {
            Loader.this.f27844b = null;
        }

        private long d() {
            return Math.min((this.f27853G - 1) * 1000, 5000);
        }

        public void a(boolean z10) {
            this.f27856J = z10;
            this.f27852F = null;
            if (hasMessages(1)) {
                this.f27855I = true;
                removeMessages(1);
                if (!z10) {
                    sendEmptyMessage(2);
                }
            } else {
                synchronized (this) {
                    try {
                        this.f27855I = true;
                        this.f27849C.b();
                        Thread thread = this.f27854H;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (z10) {
                c();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                ((b) C1804a.e(this.f27851E)).v(this.f27849C, jElapsedRealtime, jElapsedRealtime - this.f27850D, true);
                this.f27851E = null;
            }
        }

        public void e(int i10) throws IOException {
            IOException iOException = this.f27852F;
            if (iOException != null && this.f27853G > i10) {
                throw iOException;
            }
        }

        public void f(long j10) {
            C1804a.g(Loader.this.f27844b == null);
            Loader.this.f27844b = this;
            if (j10 > 0) {
                sendEmptyMessageDelayed(1, j10);
            } else {
                b();
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.f27856J) {
                return;
            }
            int i10 = message.what;
            if (i10 == 1) {
                b();
                return;
            }
            if (i10 == 4) {
                throw ((Error) message.obj);
            }
            c();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = jElapsedRealtime - this.f27850D;
            b bVar = (b) C1804a.e(this.f27851E);
            if (this.f27855I) {
                bVar.v(this.f27849C, jElapsedRealtime, j10, false);
                return;
            }
            int i11 = message.what;
            if (i11 == 2) {
                try {
                    bVar.t(this.f27849C, jElapsedRealtime, j10);
                    return;
                } catch (RuntimeException e10) {
                    n.d("LoadTask", "Unexpected exception handling load completed", e10);
                    Loader.this.f27845c = new UnexpectedLoaderException(e10);
                    return;
                }
            }
            if (i11 != 3) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f27852F = iOException;
            int i12 = this.f27853G + 1;
            this.f27853G = i12;
            c cVarK = bVar.k(this.f27849C, jElapsedRealtime, j10, iOException, i12);
            if (cVarK.f27846a == 3) {
                Loader.this.f27845c = this.f27852F;
            } else if (cVarK.f27846a != 2) {
                if (cVarK.f27846a == 1) {
                    this.f27853G = 1;
                }
                f(cVarK.f27847b != -9223372036854775807L ? cVarK.f27847b : d());
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            try {
                synchronized (this) {
                    z10 = this.f27855I;
                    this.f27854H = Thread.currentThread();
                }
                if (!z10) {
                    F.a("load:" + this.f27849C.getClass().getSimpleName());
                    try {
                        this.f27849C.a();
                        F.b();
                    } catch (Throwable th) {
                        F.b();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.f27854H = null;
                    Thread.interrupted();
                }
                if (this.f27856J) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (IOException e10) {
                if (this.f27856J) {
                    return;
                }
                obtainMessage(3, e10).sendToTarget();
            } catch (Exception e11) {
                if (this.f27856J) {
                    return;
                }
                n.d("LoadTask", "Unexpected exception loading stream", e11);
                obtainMessage(3, new UnexpectedLoaderException(e11)).sendToTarget();
            } catch (OutOfMemoryError e12) {
                if (this.f27856J) {
                    return;
                }
                n.d("LoadTask", "OutOfMemory error loading stream", e12);
                obtainMessage(3, new UnexpectedLoaderException(e12)).sendToTarget();
            } catch (Error e13) {
                if (!this.f27856J) {
                    n.d("LoadTask", "Unexpected error loading stream", e13);
                    obtainMessage(4, e13).sendToTarget();
                }
                throw e13;
            }
        }
    }

    public interface e {
        void a();

        void b();
    }

    public interface f {
        void i();
    }

    private static final class g implements Runnable {

        /* renamed from: B, reason: collision with root package name */
        private final f f27858B;

        public g(f fVar) {
            this.f27858B = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f27858B.i();
        }
    }

    static {
        long j10 = -9223372036854775807L;
        f27841f = new c(2, j10);
        f27842g = new c(3, j10);
    }

    public Loader(String str) {
        this(InterfaceExecutorC4472a.t(L.R0("ExoPlayer:Loader:" + str), new InterfaceC1811h() { // from class: r2.j
            @Override // X1.InterfaceC1811h
            public final void accept(Object obj) {
                ((ExecutorService) obj).shutdown();
            }
        }));
    }

    public static c h(boolean z10, long j10) {
        return new c(z10 ? 1 : 0, j10);
    }

    @Override // r2.k
    public void a() throws IOException {
        k(Integer.MIN_VALUE);
    }

    public void f() {
        ((d) C1804a.i(this.f27844b)).a(false);
    }

    public void g() {
        this.f27845c = null;
    }

    public boolean i() {
        return this.f27845c != null;
    }

    public boolean j() {
        return this.f27844b != null;
    }

    public void k(int i10) throws IOException {
        IOException iOException = this.f27845c;
        if (iOException != null) {
            throw iOException;
        }
        d<? extends e> dVar = this.f27844b;
        if (dVar != null) {
            if (i10 == Integer.MIN_VALUE) {
                i10 = dVar.f27848B;
            }
            dVar.e(i10);
        }
    }

    public void l() {
        m(null);
    }

    public void m(f fVar) {
        d<? extends e> dVar = this.f27844b;
        if (dVar != null) {
            dVar.a(true);
        }
        if (fVar != null) {
            this.f27843a.execute(new g(fVar));
        }
        this.f27843a.c();
    }

    public <T extends e> long n(T t10, b<T> bVar, int i10) {
        Looper looper = (Looper) C1804a.i(Looper.myLooper());
        this.f27845c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new d(looper, t10, bVar, i10, jElapsedRealtime).f(0L);
        return jElapsedRealtime;
    }

    public Loader(InterfaceExecutorC4472a interfaceExecutorC4472a) {
        this.f27843a = interfaceExecutorC4472a;
    }

    public interface b<T extends e> {
        c k(T t10, long j10, long j11, IOException iOException, int i10);

        void t(T t10, long j10, long j11);

        void v(T t10, long j10, long j11, boolean z10);

        default void o(T t10, long j10, long j11, int i10) {
        }
    }
}
