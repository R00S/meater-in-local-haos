package nd;

import Cc.B;
import Cc.C0982e;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.util.Objects;
import oc.C4178B;
import oc.C4180D;
import oc.E;
import oc.InterfaceC4185e;
import oc.InterfaceC4186f;

/* compiled from: OkHttpCall.java */
/* loaded from: classes3.dex */
final class m<T> implements nd.b<T> {

    /* renamed from: B, reason: collision with root package name */
    private final r f45904B;

    /* renamed from: C, reason: collision with root package name */
    private final Object[] f45905C;

    /* renamed from: D, reason: collision with root package name */
    private final InterfaceC4185e.a f45906D;

    /* renamed from: E, reason: collision with root package name */
    private final f<E, T> f45907E;

    /* renamed from: F, reason: collision with root package name */
    private volatile boolean f45908F;

    /* renamed from: G, reason: collision with root package name */
    private InterfaceC4185e f45909G;

    /* renamed from: H, reason: collision with root package name */
    private Throwable f45910H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f45911I;

    /* compiled from: OkHttpCall.java */
    class a implements InterfaceC4186f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f45912a;

        a(d dVar) {
            this.f45912a = dVar;
        }

        private void c(Throwable th) {
            try {
                this.f45912a.onFailure(m.this, th);
            } catch (Throwable th2) {
                x.s(th2);
                th2.printStackTrace();
            }
        }

        @Override // oc.InterfaceC4186f
        public void a(InterfaceC4185e interfaceC4185e, IOException iOException) {
            c(iOException);
        }

        @Override // oc.InterfaceC4186f
        public void b(InterfaceC4185e interfaceC4185e, C4180D c4180d) {
            try {
                try {
                    this.f45912a.onResponse(m.this, m.this.f(c4180d));
                } catch (Throwable th) {
                    x.s(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                x.s(th2);
                c(th2);
            }
        }
    }

    /* compiled from: OkHttpCall.java */
    static final class b extends E {

        /* renamed from: D, reason: collision with root package name */
        private final E f45914D;

        /* renamed from: E, reason: collision with root package name */
        private final Cc.g f45915E;

        /* renamed from: F, reason: collision with root package name */
        IOException f45916F;

        /* compiled from: OkHttpCall.java */
        class a extends Cc.j {
            a(B b10) {
                super(b10);
            }

            @Override // Cc.j, Cc.B
            public long I0(C0982e c0982e, long j10) throws IOException {
                try {
                    return super.I0(c0982e, j10);
                } catch (IOException e10) {
                    b.this.f45916F = e10;
                    throw e10;
                }
            }
        }

        b(E e10) {
            this.f45914D = e10;
            this.f45915E = Cc.o.d(new a(e10.getSource()));
        }

        @Override // oc.E, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f45914D.close();
        }

        @Override // oc.E
        /* renamed from: d */
        public long getContentLength() {
            return this.f45914D.getContentLength();
        }

        @Override // oc.E
        /* renamed from: e */
        public oc.x getF46807D() {
            return this.f45914D.getF46807D();
        }

        @Override // oc.E
        /* renamed from: g */
        public Cc.g getSource() {
            return this.f45915E;
        }

        void k() throws IOException {
            IOException iOException = this.f45916F;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    /* compiled from: OkHttpCall.java */
    static final class c extends E {

        /* renamed from: D, reason: collision with root package name */
        private final oc.x f45918D;

        /* renamed from: E, reason: collision with root package name */
        private final long f45919E;

        c(oc.x xVar, long j10) {
            this.f45918D = xVar;
            this.f45919E = j10;
        }

        @Override // oc.E
        /* renamed from: d */
        public long getContentLength() {
            return this.f45919E;
        }

        @Override // oc.E
        /* renamed from: e */
        public oc.x getF46807D() {
            return this.f45918D;
        }

        @Override // oc.E
        /* renamed from: g */
        public Cc.g getSource() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    m(r rVar, Object[] objArr, InterfaceC4185e.a aVar, f<E, T> fVar) {
        this.f45904B = rVar;
        this.f45905C = objArr;
        this.f45906D = aVar;
        this.f45907E = fVar;
    }

    private InterfaceC4185e c() {
        InterfaceC4185e interfaceC4185eB = this.f45906D.b(this.f45904B.a(this.f45905C));
        if (interfaceC4185eB != null) {
            return interfaceC4185eB;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    private InterfaceC4185e d() throws IOException {
        InterfaceC4185e interfaceC4185e = this.f45909G;
        if (interfaceC4185e != null) {
            return interfaceC4185e;
        }
        Throwable th = this.f45910H;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            InterfaceC4185e interfaceC4185eC = c();
            this.f45909G = interfaceC4185eC;
            return interfaceC4185eC;
        } catch (IOException | Error | RuntimeException e10) {
            x.s(e10);
            this.f45910H = e10;
            throw e10;
        }
    }

    @Override // nd.b
    /* renamed from: b, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public m<T> clone2() {
        return new m<>(this.f45904B, this.f45905C, this.f45906D, this.f45907E);
    }

    @Override // nd.b
    public void cancel() {
        InterfaceC4185e interfaceC4185e;
        this.f45908F = true;
        synchronized (this) {
            interfaceC4185e = this.f45909G;
        }
        if (interfaceC4185e != null) {
            interfaceC4185e.cancel();
        }
    }

    @Override // nd.b
    public void enqueue(d<T> dVar) {
        InterfaceC4185e interfaceC4185e;
        Throwable th;
        Objects.requireNonNull(dVar, "callback == null");
        synchronized (this) {
            try {
                if (this.f45911I) {
                    throw new IllegalStateException("Already executed.");
                }
                this.f45911I = true;
                interfaceC4185e = this.f45909G;
                th = this.f45910H;
                if (interfaceC4185e == null && th == null) {
                    try {
                        InterfaceC4185e interfaceC4185eC = c();
                        this.f45909G = interfaceC4185eC;
                        interfaceC4185e = interfaceC4185eC;
                    } catch (Throwable th2) {
                        th = th2;
                        x.s(th);
                        this.f45910H = th;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (th != null) {
            dVar.onFailure(this, th);
            return;
        }
        if (this.f45908F) {
            interfaceC4185e.cancel();
        }
        FirebasePerfOkHttpClient.enqueue(interfaceC4185e, new a(dVar));
    }

    @Override // nd.b
    public s<T> execute() {
        InterfaceC4185e interfaceC4185eD;
        synchronized (this) {
            if (this.f45911I) {
                throw new IllegalStateException("Already executed.");
            }
            this.f45911I = true;
            interfaceC4185eD = d();
        }
        if (this.f45908F) {
            interfaceC4185eD.cancel();
        }
        return f(FirebasePerfOkHttpClient.execute(interfaceC4185eD));
    }

    s<T> f(C4180D c4180d) throws IOException {
        E body = c4180d.getBody();
        C4180D c4180dC = c4180d.o().b(new c(body.getF46807D(), body.getContentLength())).c();
        int code = c4180dC.getCode();
        if (code < 200 || code >= 300) {
            try {
                return s.c(x.a(body), c4180dC);
            } finally {
                body.close();
            }
        }
        if (code == 204 || code == 205) {
            body.close();
            return s.i(null, c4180dC);
        }
        b bVar = new b(body);
        try {
            return s.i(this.f45907E.a(bVar), c4180dC);
        } catch (RuntimeException e10) {
            bVar.k();
            throw e10;
        }
    }

    @Override // nd.b
    public boolean isCanceled() {
        boolean z10 = true;
        if (this.f45908F) {
            return true;
        }
        synchronized (this) {
            try {
                InterfaceC4185e interfaceC4185e = this.f45909G;
                if (interfaceC4185e == null || !interfaceC4185e.getCanceled()) {
                    z10 = false;
                }
            } finally {
            }
        }
        return z10;
    }

    @Override // nd.b
    public synchronized C4178B request() {
        try {
        } catch (IOException e10) {
            throw new RuntimeException("Unable to create request.", e10);
        }
        return d().request();
    }
}
