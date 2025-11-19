package androidx.media3.exoplayer.drm;

import U1.C1732h;
import U1.C1738n;
import X1.C1804a;
import X1.C1812i;
import X1.InterfaceC1811h;
import X1.L;
import android.annotation.SuppressLint;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.h;
import androidx.media3.exoplayer.drm.m;
import androidx.media3.exoplayer.upstream.b;
import e2.v1;
import i2.t;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
class DefaultDrmSession implements DrmSession {

    /* renamed from: a, reason: collision with root package name */
    public final List<C1738n.b> f27031a;

    /* renamed from: b, reason: collision with root package name */
    private final m f27032b;

    /* renamed from: c, reason: collision with root package name */
    private final a f27033c;

    /* renamed from: d, reason: collision with root package name */
    private final b f27034d;

    /* renamed from: e, reason: collision with root package name */
    private final int f27035e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f27036f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f27037g;

    /* renamed from: h, reason: collision with root package name */
    private final HashMap<String, String> f27038h;

    /* renamed from: i, reason: collision with root package name */
    private final C1812i<h.a> f27039i;

    /* renamed from: j, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.b f27040j;

    /* renamed from: k, reason: collision with root package name */
    private final v1 f27041k;

    /* renamed from: l, reason: collision with root package name */
    private final p f27042l;

    /* renamed from: m, reason: collision with root package name */
    private final UUID f27043m;

    /* renamed from: n, reason: collision with root package name */
    private final Looper f27044n;

    /* renamed from: o, reason: collision with root package name */
    private final e f27045o;

    /* renamed from: p, reason: collision with root package name */
    private int f27046p;

    /* renamed from: q, reason: collision with root package name */
    private int f27047q;

    /* renamed from: r, reason: collision with root package name */
    private HandlerThread f27048r;

    /* renamed from: s, reason: collision with root package name */
    private c f27049s;

    /* renamed from: t, reason: collision with root package name */
    private c2.b f27050t;

    /* renamed from: u, reason: collision with root package name */
    private DrmSession.DrmSessionException f27051u;

    /* renamed from: v, reason: collision with root package name */
    private byte[] f27052v;

    /* renamed from: w, reason: collision with root package name */
    private byte[] f27053w;

    /* renamed from: x, reason: collision with root package name */
    private m.a f27054x;

    /* renamed from: y, reason: collision with root package name */
    private m.d f27055y;

    public static final class UnexpectedDrmSessionException extends IOException {
        public UnexpectedDrmSessionException(Throwable th) {
            super(th);
        }
    }

    public interface a {
        void a(Exception exc, boolean z10);

        void b();

        void c(DefaultDrmSession defaultDrmSession);
    }

    public interface b {
        void a(DefaultDrmSession defaultDrmSession, int i10);

        void b(DefaultDrmSession defaultDrmSession, int i10);
    }

    @SuppressLint({"HandlerLeak"})
    private class c extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private boolean f27056a;

        public c(Looper looper) {
            super(looper);
        }

        private boolean a(Message message, MediaDrmCallbackException mediaDrmCallbackException) {
            d dVar = (d) message.obj;
            if (!dVar.f27059b) {
                return false;
            }
            int i10 = dVar.f27062e + 1;
            dVar.f27062e = i10;
            if (i10 > DefaultDrmSession.this.f27040j.c(3)) {
                return false;
            }
            long jA = DefaultDrmSession.this.f27040j.a(new b.c(new n2.i(dVar.f27058a, mediaDrmCallbackException.f27107B, mediaDrmCallbackException.f27108C, mediaDrmCallbackException.f27109D, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - dVar.f27060c, mediaDrmCallbackException.f27110E), new n2.j(3), mediaDrmCallbackException.getCause() instanceof IOException ? (IOException) mediaDrmCallbackException.getCause() : new UnexpectedDrmSessionException(mediaDrmCallbackException.getCause()), dVar.f27062e));
            if (jA == -9223372036854775807L) {
                return false;
            }
            synchronized (this) {
                try {
                    if (this.f27056a) {
                        return false;
                    }
                    sendMessageDelayed(Message.obtain(message), jA);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        void b(int i10, Object obj, boolean z10) {
            obtainMessage(i10, new d(n2.i.a(), z10, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        public synchronized void c() {
            removeCallbacksAndMessages(null);
            this.f27056a = true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Throwable thA;
            d dVar = (d) message.obj;
            try {
                int i10 = message.what;
                if (i10 == 1) {
                    thA = DefaultDrmSession.this.f27042l.a(DefaultDrmSession.this.f27043m, (m.d) dVar.f27061d);
                } else {
                    if (i10 != 2) {
                        throw new RuntimeException();
                    }
                    thA = DefaultDrmSession.this.f27042l.b(DefaultDrmSession.this.f27043m, (m.a) dVar.f27061d);
                }
            } catch (MediaDrmCallbackException e10) {
                boolean zA = a(message, e10);
                thA = e10;
                if (zA) {
                    return;
                }
            } catch (Exception e11) {
                X1.n.i("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e11);
                thA = e11;
            }
            DefaultDrmSession.this.f27040j.b(dVar.f27058a);
            synchronized (this) {
                try {
                    if (!this.f27056a) {
                        DefaultDrmSession.this.f27045o.obtainMessage(message.what, Pair.create(dVar.f27061d, thA)).sendToTarget();
                    }
                } finally {
                }
            }
        }
    }

    private static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final long f27058a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f27059b;

        /* renamed from: c, reason: collision with root package name */
        public final long f27060c;

        /* renamed from: d, reason: collision with root package name */
        public final Object f27061d;

        /* renamed from: e, reason: collision with root package name */
        public int f27062e;

        public d(long j10, boolean z10, long j11, Object obj) {
            this.f27058a = j10;
            this.f27059b = z10;
            this.f27060c = j11;
            this.f27061d = obj;
        }
    }

    @SuppressLint({"HandlerLeak"})
    private class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i10 = message.what;
            if (i10 == 1) {
                DefaultDrmSession.this.F(obj, obj2);
            } else {
                if (i10 != 2) {
                    return;
                }
                DefaultDrmSession.this.z(obj, obj2);
            }
        }
    }

    public DefaultDrmSession(UUID uuid, m mVar, a aVar, b bVar, List<C1738n.b> list, int i10, boolean z10, boolean z11, byte[] bArr, HashMap<String, String> map, p pVar, Looper looper, androidx.media3.exoplayer.upstream.b bVar2, v1 v1Var) {
        if (i10 == 1 || i10 == 3) {
            C1804a.e(bArr);
        }
        this.f27043m = uuid;
        this.f27033c = aVar;
        this.f27034d = bVar;
        this.f27032b = mVar;
        this.f27035e = i10;
        this.f27036f = z10;
        this.f27037g = z11;
        if (bArr != null) {
            this.f27053w = bArr;
            this.f27031a = null;
        } else {
            this.f27031a = Collections.unmodifiableList((List) C1804a.e(list));
        }
        this.f27038h = map;
        this.f27042l = pVar;
        this.f27039i = new C1812i<>();
        this.f27040j = bVar2;
        this.f27041k = v1Var;
        this.f27046p = 2;
        this.f27044n = looper;
        this.f27045o = new e(looper);
    }

    private void A(Throwable th, boolean z10) {
        if ((th instanceof NotProvisionedException) || j.d(th)) {
            this.f27033c.c(this);
        } else {
            y(th, z10 ? 1 : 2);
        }
    }

    private void B() {
        if (this.f27035e == 0 && this.f27046p == 4) {
            L.i(this.f27052v);
            s(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F(Object obj, Object obj2) {
        if (obj == this.f27055y) {
            if (this.f27046p == 2 || v()) {
                this.f27055y = null;
                if (obj2 instanceof Exception) {
                    this.f27033c.a((Exception) obj2, false);
                    return;
                }
                try {
                    this.f27032b.k((byte[]) obj2);
                    this.f27033c.b();
                } catch (Exception e10) {
                    this.f27033c.a(e10, true);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean G() {
        /*
            r4 = this;
            boolean r0 = r4.v()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            androidx.media3.exoplayer.drm.m r0 = r4.f27032b     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            byte[] r0 = r0.e()     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            r4.f27052v = r0     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            androidx.media3.exoplayer.drm.m r2 = r4.f27032b     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            e2.v1 r3 = r4.f27041k     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            r2.m(r0, r3)     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            androidx.media3.exoplayer.drm.m r0 = r4.f27032b     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            byte[] r2 = r4.f27052v     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            c2.b r0 = r0.d(r2)     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            r4.f27050t = r0     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            r0 = 3
            r4.f27046p = r0     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            androidx.media3.exoplayer.drm.b r2 = new androidx.media3.exoplayer.drm.b     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            r2.<init>()     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            r4.r(r2)     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            byte[] r0 = r4.f27052v     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            X1.C1804a.e(r0)     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            return r1
        L32:
            r0 = move-exception
            goto L35
        L34:
            r0 = move-exception
        L35:
            boolean r2 = androidx.media3.exoplayer.drm.j.d(r0)
            if (r2 == 0) goto L41
            androidx.media3.exoplayer.drm.DefaultDrmSession$a r0 = r4.f27033c
            r0.c(r4)
            goto L4a
        L41:
            r4.y(r0, r1)
            goto L4a
        L45:
            androidx.media3.exoplayer.drm.DefaultDrmSession$a r0 = r4.f27033c
            r0.c(r4)
        L4a:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.drm.DefaultDrmSession.G():boolean");
    }

    private void H(byte[] bArr, int i10, boolean z10) {
        try {
            this.f27054x = this.f27032b.l(bArr, this.f27031a, i10, this.f27038h);
            ((c) L.i(this.f27049s)).b(2, C1804a.e(this.f27054x), z10);
        } catch (Exception | NoSuchMethodError e10) {
            A(e10, true);
        }
    }

    private boolean J() {
        try {
            this.f27032b.g(this.f27052v, this.f27053w);
            return true;
        } catch (Exception | NoSuchMethodError e10) {
            y(e10, 1);
            return false;
        }
    }

    private void K() {
        if (Thread.currentThread() != this.f27044n.getThread()) {
            X1.n.i("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f27044n.getThread().getName(), new IllegalStateException());
        }
    }

    private void r(InterfaceC1811h<h.a> interfaceC1811h) {
        Iterator<h.a> it = this.f27039i.N().iterator();
        while (it.hasNext()) {
            interfaceC1811h.accept(it.next());
        }
    }

    private void s(boolean z10) {
        if (this.f27037g) {
            return;
        }
        byte[] bArr = (byte[]) L.i(this.f27052v);
        int i10 = this.f27035e;
        if (i10 != 0 && i10 != 1) {
            if (i10 == 2) {
                if (this.f27053w == null || J()) {
                    H(bArr, 2, z10);
                    return;
                }
                return;
            }
            if (i10 != 3) {
                return;
            }
            C1804a.e(this.f27053w);
            C1804a.e(this.f27052v);
            H(this.f27053w, 3, z10);
            return;
        }
        if (this.f27053w == null) {
            H(bArr, 1, z10);
            return;
        }
        if (this.f27046p == 4 || J()) {
            long jT = t();
            if (this.f27035e != 0 || jT > 60) {
                if (jT <= 0) {
                    y(new KeysExpiredException(), 2);
                    return;
                } else {
                    this.f27046p = 4;
                    r(new InterfaceC1811h() { // from class: i2.c
                        @Override // X1.InterfaceC1811h
                        public final void accept(Object obj) {
                            ((h.a) obj).j();
                        }
                    });
                    return;
                }
            }
            X1.n.b("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + jT);
            H(bArr, 2, z10);
        }
    }

    private long t() {
        if (!C1732h.f17050d.equals(this.f27043m)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) C1804a.e(t.b(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    private boolean v() {
        int i10 = this.f27046p;
        return i10 == 3 || i10 == 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void w(Throwable th, h.a aVar) {
        aVar.l((Exception) th);
    }

    private void y(final Throwable th, int i10) {
        this.f27051u = new DrmSession.DrmSessionException(th, j.b(th, i10));
        X1.n.d("DefaultDrmSession", "DRM session error", th);
        if (th instanceof Exception) {
            r(new InterfaceC1811h() { // from class: androidx.media3.exoplayer.drm.c
                @Override // X1.InterfaceC1811h
                public final void accept(Object obj) {
                    DefaultDrmSession.w(th, (h.a) obj);
                }
            });
        } else {
            if (!(th instanceof Error)) {
                throw new IllegalStateException("Unexpected Throwable subclass", th);
            }
            if (!j.e(th) && !j.d(th)) {
                throw ((Error) th);
            }
        }
        if (this.f27046p != 4) {
            this.f27046p = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(Object obj, Object obj2) {
        if (obj == this.f27054x && v()) {
            this.f27054x = null;
            if ((obj2 instanceof Exception) || (obj2 instanceof NoSuchMethodError)) {
                A((Throwable) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f27035e == 3) {
                    this.f27032b.i((byte[]) L.i(this.f27053w), bArr);
                    r(new InterfaceC1811h() { // from class: i2.a
                        @Override // X1.InterfaceC1811h
                        public final void accept(Object obj3) {
                            ((h.a) obj3).i();
                        }
                    });
                    return;
                }
                byte[] bArrI = this.f27032b.i(this.f27052v, bArr);
                int i10 = this.f27035e;
                if ((i10 == 2 || (i10 == 0 && this.f27053w != null)) && bArrI != null && bArrI.length != 0) {
                    this.f27053w = bArrI;
                }
                this.f27046p = 4;
                r(new InterfaceC1811h() { // from class: i2.b
                    @Override // X1.InterfaceC1811h
                    public final void accept(Object obj3) {
                        ((h.a) obj3).h();
                    }
                });
            } catch (Exception e10) {
                e = e10;
                A(e, true);
            } catch (NoSuchMethodError e11) {
                e = e11;
                A(e, true);
            }
        }
    }

    void C(int i10) {
        if (i10 != 2) {
            return;
        }
        B();
    }

    void D() {
        if (G()) {
            s(true);
        }
    }

    void E(Exception exc, boolean z10) {
        y(exc, z10 ? 1 : 3);
    }

    void I() {
        this.f27055y = this.f27032b.b();
        ((c) L.i(this.f27049s)).b(1, C1804a.e(this.f27055y), true);
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public void a(h.a aVar) {
        K();
        if (this.f27047q < 0) {
            X1.n.c("DefaultDrmSession", "Session reference count less than zero: " + this.f27047q);
            this.f27047q = 0;
        }
        if (aVar != null) {
            this.f27039i.c(aVar);
        }
        int i10 = this.f27047q + 1;
        this.f27047q = i10;
        if (i10 == 1) {
            C1804a.g(this.f27046p == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f27048r = handlerThread;
            handlerThread.start();
            this.f27049s = new c(this.f27048r.getLooper());
            if (G()) {
                s(true);
            }
        } else if (aVar != null && v() && this.f27039i.f(aVar) == 1) {
            aVar.k(this.f27046p);
        }
        this.f27034d.a(this, this.f27047q);
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final UUID b() {
        K();
        return this.f27043m;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public boolean c() {
        K();
        return this.f27036f;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public Map<String, String> d() {
        K();
        byte[] bArr = this.f27052v;
        if (bArr == null) {
            return null;
        }
        return this.f27032b.a(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public void e(h.a aVar) {
        K();
        int i10 = this.f27047q;
        if (i10 <= 0) {
            X1.n.c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.f27047q = i11;
        if (i11 == 0) {
            this.f27046p = 0;
            ((e) L.i(this.f27045o)).removeCallbacksAndMessages(null);
            ((c) L.i(this.f27049s)).c();
            this.f27049s = null;
            ((HandlerThread) L.i(this.f27048r)).quit();
            this.f27048r = null;
            this.f27050t = null;
            this.f27051u = null;
            this.f27054x = null;
            this.f27055y = null;
            byte[] bArr = this.f27052v;
            if (bArr != null) {
                this.f27032b.h(bArr);
                this.f27052v = null;
            }
        }
        if (aVar != null) {
            this.f27039i.h(aVar);
            if (this.f27039i.f(aVar) == 0) {
                aVar.m();
            }
        }
        this.f27034d.b(this, this.f27047q);
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public boolean g(String str) {
        K();
        return this.f27032b.f((byte[]) C1804a.i(this.f27052v), str);
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final int getState() {
        K();
        return this.f27046p;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final DrmSession.DrmSessionException h() {
        K();
        if (this.f27046p == 1) {
            return this.f27051u;
        }
        return null;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final c2.b i() {
        K();
        return this.f27050t;
    }

    public boolean u(byte[] bArr) {
        K();
        return Arrays.equals(this.f27052v, bArr);
    }
}
