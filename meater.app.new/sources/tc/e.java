package tc;

import Cc.C0980c;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import oa.C4158c;
import oc.C4178B;
import oc.C4180D;
import oc.C4181a;
import oc.C4187g;
import oc.InterfaceC4185e;
import oc.InterfaceC4186f;
import oc.p;
import oc.r;
import oc.v;
import oc.z;
import yc.j;

/* compiled from: RealCall.kt */
@Metadata(d1 = {"\u0000\u009f\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e*\u0001U\u0018\u00002\u00020\u0001:\u0002}~B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00028\u0000\"\n\b\u0000\u0010\u000e*\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u000e\u001a\u00028\u0000\"\n\b\u0000\u0010\u000e*\u0004\u0018\u00010\r2\u0006\u0010\u0012\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001f\u0010\fJ\u000f\u0010 \u001a\u00020\u0006H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\n2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\"H\u0000¢\u0006\u0004\b)\u0010$J\u001d\u0010+\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u0006¢\u0006\u0004\b+\u0010,J\u0017\u00100\u001a\u00020/2\u0006\u0010.\u001a\u00020-H\u0000¢\u0006\u0004\b0\u00101J\u0015\u00104\u001a\u00020\n2\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105J;\u00109\u001a\u00028\u0000\"\n\b\u0000\u0010\u000e*\u0004\u0018\u00010\r2\u0006\u00106\u001a\u00020/2\u0006\u00107\u001a\u00020\u00062\u0006\u00108\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00028\u0000H\u0000¢\u0006\u0004\b9\u0010:J\u001b\u0010;\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b;\u0010\u0011J\u0011\u0010=\u001a\u0004\u0018\u00010<H\u0000¢\u0006\u0004\b=\u0010>J\r\u0010?\u001a\u00020\n¢\u0006\u0004\b?\u0010\fJ\u0017\u0010A\u001a\u00020\n2\u0006\u0010@\u001a\u00020\u0006H\u0000¢\u0006\u0004\bA\u0010BJ\r\u0010C\u001a\u00020\u0006¢\u0006\u0004\bC\u0010!J\u000f\u0010D\u001a\u00020\u0018H\u0000¢\u0006\u0004\bD\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bC\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b?\u0010K\u001a\u0004\bL\u0010!R\u0014\u0010O\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010NR\u001a\u0010T\u001a\u00020P8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010Q\u001a\u0004\bR\u0010SR\u0014\u0010X\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\\\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0018\u0010`\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0018\u0010d\u001a\u0004\u0018\u00010a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR(\u00103\u001a\u0004\u0018\u0001022\b\u0010e\u001a\u0004\u0018\u0001028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR\u0016\u0010k\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010KR(\u0010p\u001a\u0004\u0018\u00010/2\b\u0010e\u001a\u0004\u0018\u00010/8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bn\u0010oR\u0016\u0010r\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010KR\u0016\u0010t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010KR\u0016\u0010v\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010KR\u0016\u0010x\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010KR\u0018\u00106\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010mR$\u0010|\u001a\u0004\u0018\u0001028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bz\u0010g\u001a\u0004\b{\u0010i\"\u0004\bH\u00105¨\u0006\u007f"}, d2 = {"Ltc/e;", "Loc/e;", "Loc/z;", "client", "Loc/B;", "originalRequest", "", "forWebSocket", "<init>", "(Loc/z;Loc/B;Z)V", "Loa/F;", "g", "()V", "Ljava/io/IOException;", "E", "e", "f", "(Ljava/io/IOException;)Ljava/io/IOException;", "cause", "Loc/v;", "url", "Loc/a;", "i", "(Loc/v;)Loc/a;", "", "F", "()Ljava/lang/String;", "h", "()Ltc/e;", "request", "()Loc/B;", "cancel", "isCanceled", "()Z", "Loc/D;", "execute", "()Loc/D;", "Loc/f;", "responseCallback", "v0", "(Loc/f;)V", "s", "newExchangeFinder", "k", "(Loc/B;Z)V", "Luc/g;", "chain", "Ltc/c;", "t", "(Luc/g;)Ltc/c;", "Ltc/f;", "connection", "d", "(Ltc/f;)V", "exchange", "requestDone", "responseDone", "u", "(Ltc/c;ZZLjava/io/IOException;)Ljava/io/IOException;", "v", "Ljava/net/Socket;", "A", "()Ljava/net/Socket;", "D", "closeExchange", "l", "(Z)V", "B", "w", "Loc/z;", "m", "()Loc/z;", "C", "Loc/B;", "r", "Z", "p", "Ltc/g;", "Ltc/g;", "connectionPool", "Loc/r;", "Loc/r;", "o", "()Loc/r;", "eventListener", "tc/e$c", "G", "Ltc/e$c;", "timeout", "Ljava/util/concurrent/atomic/AtomicBoolean;", "H", "Ljava/util/concurrent/atomic/AtomicBoolean;", "executed", "", "I", "Ljava/lang/Object;", "callStackTrace", "Ltc/d;", "J", "Ltc/d;", "exchangeFinder", "<set-?>", "K", "Ltc/f;", "n", "()Ltc/f;", "L", "timeoutEarlyExit", "M", "Ltc/c;", "q", "()Ltc/c;", "interceptorScopedExchange", "N", "requestBodyOpen", "O", "responseBodyOpen", "P", "expectMoreExchanges", "Q", "canceled", "R", "S", "getConnectionToCancel", "connectionToCancel", "a", "b", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements InterfaceC4185e {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final z client;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final C4178B originalRequest;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final boolean forWebSocket;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final g connectionPool;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final r eventListener;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private final c timeout;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean executed;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private Object callStackTrace;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private d exchangeFinder;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private f connection;

    /* renamed from: L, reason: collision with root package name and from kotlin metadata */
    private boolean timeoutEarlyExit;

    /* renamed from: M, reason: collision with root package name and from kotlin metadata */
    private tc.c interceptorScopedExchange;

    /* renamed from: N, reason: collision with root package name and from kotlin metadata */
    private boolean requestBodyOpen;

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private boolean responseBodyOpen;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private boolean expectMoreExchanges;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private volatile boolean canceled;

    /* renamed from: R, reason: collision with root package name and from kotlin metadata */
    private volatile tc.c exchange;

    /* renamed from: S, reason: collision with root package name and from kotlin metadata */
    private volatile f connectionToCancel;

    /* compiled from: RealCall.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\n\u0010\u0007\u001a\u00060\u0000R\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R$\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001d\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010 \u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Ltc/e$a;", "Ljava/lang/Runnable;", "Loc/f;", "responseCallback", "<init>", "(Ltc/e;Loc/f;)V", "Ltc/e;", "other", "Loa/F;", "e", "(Ltc/e$a;)V", "Ljava/util/concurrent/ExecutorService;", "executorService", "a", "(Ljava/util/concurrent/ExecutorService;)V", "run", "()V", "B", "Loc/f;", "Ljava/util/concurrent/atomic/AtomicInteger;", "<set-?>", "C", "Ljava/util/concurrent/atomic/AtomicInteger;", "c", "()Ljava/util/concurrent/atomic/AtomicInteger;", "callsPerHost", "", "d", "()Ljava/lang/String;", "host", "b", "()Ltc/e;", "call", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class a implements Runnable {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC4186f responseCallback;

        /* renamed from: C, reason: collision with root package name and from kotlin metadata */
        private volatile AtomicInteger callsPerHost;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ e f50109D;

        public a(e eVar, InterfaceC4186f responseCallback) {
            C3862t.g(responseCallback, "responseCallback");
            this.f50109D = eVar;
            this.responseCallback = responseCallback;
            this.callsPerHost = new AtomicInteger(0);
        }

        public final void a(ExecutorService executorService) {
            C3862t.g(executorService, "executorService");
            p dispatcher = this.f50109D.getClient().getDispatcher();
            if (pc.d.f47758h && Thread.holdsLock(dispatcher)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + dispatcher);
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e10) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e10);
                    this.f50109D.v(interruptedIOException);
                    this.responseCallback.a(this.f50109D, interruptedIOException);
                    this.f50109D.getClient().getDispatcher().f(this);
                }
            } catch (Throwable th) {
                this.f50109D.getClient().getDispatcher().f(this);
                throw th;
            }
        }

        /* renamed from: b, reason: from getter */
        public final e getF50109D() {
            return this.f50109D;
        }

        /* renamed from: c, reason: from getter */
        public final AtomicInteger getCallsPerHost() {
            return this.callsPerHost;
        }

        public final String d() {
            return this.f50109D.getOriginalRequest().getUrl().getHost();
        }

        public final void e(a other) {
            C3862t.g(other, "other");
            this.callsPerHost = other.callsPerHost;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            Throwable th;
            IOException e10;
            p dispatcher;
            String str = "OkHttp " + this.f50109D.w();
            e eVar = this.f50109D;
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            threadCurrentThread.setName(str);
            try {
                eVar.timeout.v();
                try {
                    try {
                        z10 = true;
                    } catch (IOException e11) {
                        z10 = false;
                        e10 = e11;
                    } catch (Throwable th2) {
                        z10 = false;
                        th = th2;
                    }
                    try {
                        this.responseCallback.b(eVar, eVar.s());
                        dispatcher = eVar.getClient().getDispatcher();
                    } catch (IOException e12) {
                        e10 = e12;
                        if (z10) {
                            j.INSTANCE.g().k("Callback failure for " + eVar.F(), 4, e10);
                        } else {
                            this.responseCallback.a(eVar, e10);
                        }
                        dispatcher = eVar.getClient().getDispatcher();
                        dispatcher.f(this);
                    } catch (Throwable th3) {
                        th = th3;
                        eVar.cancel();
                        if (!z10) {
                            IOException iOException = new IOException("canceled due to " + th);
                            C4158c.a(iOException, th);
                            this.responseCallback.a(eVar, iOException);
                        }
                        throw th;
                    }
                    dispatcher.f(this);
                } catch (Throwable th4) {
                    eVar.getClient().getDispatcher().f(this);
                    throw th4;
                }
            } finally {
                threadCurrentThread.setName(name);
            }
        }
    }

    /* compiled from: RealCall.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Ltc/e$b;", "Ljava/lang/ref/WeakReference;", "Ltc/e;", "referent", "", "callStackTrace", "<init>", "(Ltc/e;Ljava/lang/Object;)V", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends WeakReference<e> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Object callStackTrace;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e referent, Object obj) {
            super(referent);
            C3862t.g(referent, "referent");
            this.callStackTrace = obj;
        }

        /* renamed from: a, reason: from getter */
        public final Object getCallStackTrace() {
            return this.callStackTrace;
        }
    }

    /* compiled from: RealCall.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"tc/e$c", "LCc/c;", "Loa/F;", "B", "()V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c extends C0980c {
        c() {
        }

        @Override // Cc.C0980c
        protected void B() {
            e.this.cancel();
        }
    }

    public e(z client, C4178B originalRequest, boolean z10) {
        C3862t.g(client, "client");
        C3862t.g(originalRequest, "originalRequest");
        this.client = client;
        this.originalRequest = originalRequest;
        this.forWebSocket = z10;
        this.connectionPool = client.getConnectionPool().getDelegate();
        this.eventListener = client.getEventListenerFactory().a(this);
        c cVar = new c();
        cVar.g(client.getCallTimeoutMillis(), TimeUnit.MILLISECONDS);
        this.timeout = cVar;
        this.executed = new AtomicBoolean();
        this.expectMoreExchanges = true;
    }

    private final <E extends IOException> E E(E cause) {
        if (this.timeoutEarlyExit || !this.timeout.w()) {
            return cause;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (cause != null) {
            interruptedIOException.initCause(cause);
        }
        return interruptedIOException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String F() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getCanceled() ? "canceled " : "");
        sb2.append(this.forWebSocket ? "web socket" : "call");
        sb2.append(" to ");
        sb2.append(w());
        return sb2.toString();
    }

    private final <E extends IOException> E f(E e10) throws IOException {
        Socket socketA;
        boolean z10 = pc.d.f47758h;
        if (z10 && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        f fVar = this.connection;
        if (fVar != null) {
            if (z10 && Thread.holdsLock(fVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + fVar);
            }
            synchronized (fVar) {
                socketA = A();
            }
            if (this.connection == null) {
                if (socketA != null) {
                    pc.d.n(socketA);
                }
                this.eventListener.l(this, fVar);
            } else if (socketA != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        E e11 = (E) E(e10);
        if (e10 != null) {
            r rVar = this.eventListener;
            C3862t.d(e11);
            rVar.e(this, e11);
        } else {
            this.eventListener.d(this);
        }
        return e11;
    }

    private final void g() {
        this.callStackTrace = j.INSTANCE.g().i("response.body().close()");
        this.eventListener.f(this);
    }

    private final C4181a i(v url) {
        SSLSocketFactory sSLSocketFactoryI;
        HostnameVerifier hostnameVerifier;
        C4187g certificatePinner;
        if (url.getIsHttps()) {
            sSLSocketFactoryI = this.client.I();
            hostnameVerifier = this.client.getHostnameVerifier();
            certificatePinner = this.client.getCertificatePinner();
        } else {
            sSLSocketFactoryI = null;
            hostnameVerifier = null;
            certificatePinner = null;
        }
        return new C4181a(url.getHost(), url.getPort(), this.client.getDns(), this.client.getSocketFactory(), sSLSocketFactoryI, hostnameVerifier, certificatePinner, this.client.getProxyAuthenticator(), this.client.getProxy(), this.client.B(), this.client.m(), this.client.getProxySelector());
    }

    public final Socket A() {
        f fVar = this.connection;
        C3862t.d(fVar);
        if (pc.d.f47758h && !Thread.holdsLock(fVar)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + fVar);
        }
        List<Reference<e>> listN = fVar.n();
        Iterator<Reference<e>> it = listN.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (C3862t.b(it.next().get(), this)) {
                break;
            }
            i10++;
        }
        if (i10 == -1) {
            throw new IllegalStateException("Check failed.");
        }
        listN.remove(i10);
        this.connection = null;
        if (listN.isEmpty()) {
            fVar.B(System.nanoTime());
            if (this.connectionPool.c(fVar)) {
                return fVar.D();
            }
        }
        return null;
    }

    public final boolean B() {
        d dVar = this.exchangeFinder;
        C3862t.d(dVar);
        return dVar.e();
    }

    public final void C(f fVar) {
        this.connectionToCancel = fVar;
    }

    public final void D() {
        if (this.timeoutEarlyExit) {
            throw new IllegalStateException("Check failed.");
        }
        this.timeoutEarlyExit = true;
        this.timeout.w();
    }

    @Override // oc.InterfaceC4185e
    public void cancel() {
        if (this.canceled) {
            return;
        }
        this.canceled = true;
        tc.c cVar = this.exchange;
        if (cVar != null) {
            cVar.b();
        }
        f fVar = this.connectionToCancel;
        if (fVar != null) {
            fVar.d();
        }
        this.eventListener.g(this);
    }

    public final void d(f connection) {
        C3862t.g(connection, "connection");
        if (!pc.d.f47758h || Thread.holdsLock(connection)) {
            if (this.connection != null) {
                throw new IllegalStateException("Check failed.");
            }
            this.connection = connection;
            connection.n().add(new b(this, this.callStackTrace));
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
    }

    @Override // oc.InterfaceC4185e
    public C4180D execute() {
        if (!this.executed.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.timeout.v();
        g();
        try {
            this.client.getDispatcher().b(this);
            return s();
        } finally {
            this.client.getDispatcher().g(this);
        }
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public e clone() {
        return new e(this.client, this.originalRequest, this.forWebSocket);
    }

    @Override // oc.InterfaceC4185e
    /* renamed from: isCanceled, reason: from getter */
    public boolean getCanceled() {
        return this.canceled;
    }

    public final void k(C4178B request, boolean newExchangeFinder) {
        C3862t.g(request, "request");
        if (this.interceptorScopedExchange != null) {
            throw new IllegalStateException("Check failed.");
        }
        synchronized (this) {
            if (this.responseBodyOpen) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
            }
            if (this.requestBodyOpen) {
                throw new IllegalStateException("Check failed.");
            }
            C4153F c4153f = C4153F.f46609a;
        }
        if (newExchangeFinder) {
            this.exchangeFinder = new d(this.connectionPool, i(request.getUrl()), this, this.eventListener);
        }
    }

    public final void l(boolean closeExchange) {
        tc.c cVar;
        synchronized (this) {
            if (!this.expectMoreExchanges) {
                throw new IllegalStateException("released");
            }
            C4153F c4153f = C4153F.f46609a;
        }
        if (closeExchange && (cVar = this.exchange) != null) {
            cVar.d();
        }
        this.interceptorScopedExchange = null;
    }

    /* renamed from: m, reason: from getter */
    public final z getClient() {
        return this.client;
    }

    /* renamed from: n, reason: from getter */
    public final f getConnection() {
        return this.connection;
    }

    /* renamed from: o, reason: from getter */
    public final r getEventListener() {
        return this.eventListener;
    }

    /* renamed from: p, reason: from getter */
    public final boolean getForWebSocket() {
        return this.forWebSocket;
    }

    /* renamed from: q, reason: from getter */
    public final tc.c getInterceptorScopedExchange() {
        return this.interceptorScopedExchange;
    }

    /* renamed from: r, reason: from getter */
    public final C4178B getOriginalRequest() {
        return this.originalRequest;
    }

    @Override // oc.InterfaceC4185e
    public C4178B request() {
        return this.originalRequest;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final oc.C4180D s() throws java.lang.Throwable {
        /*
            r11 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            oc.z r0 = r11.client
            java.util.List r0 = r0.v()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            kotlin.collections.r.D(r2, r0)
            uc.j r0 = new uc.j
            oc.z r1 = r11.client
            r0.<init>(r1)
            r2.add(r0)
            uc.a r0 = new uc.a
            oc.z r1 = r11.client
            oc.n r1 = r1.getCookieJar()
            r0.<init>(r1)
            r2.add(r0)
            rc.a r0 = new rc.a
            oc.z r1 = r11.client
            oc.c r1 = r1.getCache()
            r0.<init>(r1)
            r2.add(r0)
            tc.a r0 = tc.a.f50056a
            r2.add(r0)
            boolean r0 = r11.forWebSocket
            if (r0 != 0) goto L4a
            oc.z r0 = r11.client
            java.util.List r0 = r0.w()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            kotlin.collections.r.D(r2, r0)
        L4a:
            uc.b r0 = new uc.b
            boolean r1 = r11.forWebSocket
            r0.<init>(r1)
            r2.add(r0)
            uc.g r9 = new uc.g
            oc.B r5 = r11.originalRequest
            oc.z r0 = r11.client
            int r6 = r0.getConnectTimeoutMillis()
            oc.z r0 = r11.client
            int r7 = r0.getReadTimeoutMillis()
            oc.z r0 = r11.client
            int r8 = r0.getWriteTimeoutMillis()
            r3 = 0
            r4 = 0
            r0 = r9
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            r1 = 0
            oc.B r2 = r11.originalRequest     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            oc.D r2 = r9.a(r2)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            boolean r3 = r11.getCanceled()     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            if (r3 != 0) goto L83
            r11.v(r0)
            return r2
        L83:
            pc.d.m(r2)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            throw r2     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
        L8e:
            r2 = move-exception
            goto La0
        L90:
            r1 = move-exception
            r2 = 1
            java.io.IOException r1 = r11.v(r1)     // Catch: java.lang.Throwable -> L9c
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Throwable"
            kotlin.jvm.internal.C3862t.e(r1, r3)     // Catch: java.lang.Throwable -> L9c
            throw r1     // Catch: java.lang.Throwable -> L9c
        L9c:
            r1 = move-exception
            r10 = r2
            r2 = r1
            r1 = r10
        La0:
            if (r1 != 0) goto La5
            r11.v(r0)
        La5:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: tc.e.s():oc.D");
    }

    public final tc.c t(uc.g chain) throws IOException {
        C3862t.g(chain, "chain");
        synchronized (this) {
            if (!this.expectMoreExchanges) {
                throw new IllegalStateException("released");
            }
            if (this.responseBodyOpen) {
                throw new IllegalStateException("Check failed.");
            }
            if (this.requestBodyOpen) {
                throw new IllegalStateException("Check failed.");
            }
            C4153F c4153f = C4153F.f46609a;
        }
        d dVar = this.exchangeFinder;
        C3862t.d(dVar);
        tc.c cVar = new tc.c(this, this.eventListener, dVar, dVar.a(this.client, chain));
        this.interceptorScopedExchange = cVar;
        this.exchange = cVar;
        synchronized (this) {
            this.requestBodyOpen = true;
            this.responseBodyOpen = true;
        }
        if (this.canceled) {
            throw new IOException("Canceled");
        }
        return cVar;
    }

    public final <E extends IOException> E u(tc.c exchange, boolean requestDone, boolean responseDone, E e10) {
        boolean z10;
        boolean z11;
        C3862t.g(exchange, "exchange");
        if (!C3862t.b(exchange, this.exchange)) {
            return e10;
        }
        synchronized (this) {
            z10 = false;
            if (requestDone) {
                try {
                    if (!this.requestBodyOpen) {
                        if (responseDone || !this.responseBodyOpen) {
                            z11 = false;
                        }
                    }
                    if (requestDone) {
                        this.requestBodyOpen = false;
                    }
                    if (responseDone) {
                        this.responseBodyOpen = false;
                    }
                    boolean z12 = this.requestBodyOpen;
                    boolean z13 = (z12 || this.responseBodyOpen) ? false : true;
                    if (!z12 && !this.responseBodyOpen && !this.expectMoreExchanges) {
                        z10 = true;
                    }
                    z11 = z10;
                    z10 = z13;
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                if (responseDone) {
                }
                z11 = false;
            }
            C4153F c4153f = C4153F.f46609a;
        }
        if (z10) {
            this.exchange = null;
            f fVar = this.connection;
            if (fVar != null) {
                fVar.s();
            }
        }
        return z11 ? (E) f(e10) : e10;
    }

    public final IOException v(IOException e10) {
        boolean z10;
        synchronized (this) {
            try {
                z10 = false;
                if (this.expectMoreExchanges) {
                    this.expectMoreExchanges = false;
                    if (!this.requestBodyOpen && !this.responseBodyOpen) {
                        z10 = true;
                    }
                }
                C4153F c4153f = C4153F.f46609a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10 ? f(e10) : e10;
    }

    @Override // oc.InterfaceC4185e
    public void v0(InterfaceC4186f responseCallback) {
        C3862t.g(responseCallback, "responseCallback");
        if (!this.executed.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        g();
        this.client.getDispatcher().a(new a(this, responseCallback));
    }

    public final String w() {
        return this.originalRequest.getUrl().q();
    }
}
