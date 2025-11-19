package tc;

import Cc.B;
import Cc.C0982e;
import Cc.j;
import Cc.o;
import Cc.z;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oc.AbstractC4179C;
import oc.C4178B;
import oc.C4180D;
import oc.E;
import oc.r;

/* compiled from: Exchange.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u00020)B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\r\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001d\u001a\u00020\u0015¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\u00020%2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u000e¢\u0006\u0004\b(\u0010\u001bJ\r\u0010)\u001a\u00020\u000e¢\u0006\u0004\b)\u0010\u001bJ\r\u0010*\u001a\u00020\u000e¢\u0006\u0004\b*\u0010\u001bJ9\u00100\u001a\u00028\u0000\"\n\b\u0000\u0010+*\u0004\u0018\u00010\f2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\u00152\u0006\u0010/\u001a\u00020\u00152\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b0\u00101J\r\u00102\u001a\u00020\u000e¢\u0006\u0004\b2\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b0\u00103\u001a\u0004\b4\u00105R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u00106\u001a\u0004\b7\u00108R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u00109\u001a\u0004\b:\u0010;R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010<R$\u0010A\u001a\u00020\u00152\u0006\u0010=\u001a\u00020\u00158\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\r\u0010>\u001a\u0004\b?\u0010@R$\u0010C\u001a\u00020\u00152\u0006\u0010=\u001a\u00020\u00158\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u001a\u0010>\u001a\u0004\bB\u0010@R\u001a\u0010H\u001a\u00020D8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b4\u0010E\u001a\u0004\bF\u0010GR\u0014\u0010J\u001a\u00020\u00158@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bI\u0010@¨\u0006K"}, d2 = {"Ltc/c;", "", "Ltc/e;", "call", "Loc/r;", "eventListener", "Ltc/d;", "finder", "Luc/d;", "codec", "<init>", "(Ltc/e;Loc/r;Ltc/d;Luc/d;)V", "Ljava/io/IOException;", "e", "Loa/F;", "t", "(Ljava/io/IOException;)V", "Loc/B;", "request", "u", "(Loc/B;)V", "", "duplex", "LCc/z;", "c", "(Loc/B;Z)LCc/z;", "f", "()V", "s", "expectContinue", "Loc/D$a;", "q", "(Z)Loc/D$a;", "Loc/D;", "response", "r", "(Loc/D;)V", "Loc/E;", "p", "(Loc/D;)Loc/E;", "n", "b", "d", "E", "", "bytesRead", "responseDone", "requestDone", "a", "(JZZLjava/io/IOException;)Ljava/io/IOException;", "o", "Ltc/e;", "g", "()Ltc/e;", "Loc/r;", "i", "()Loc/r;", "Ltc/d;", "j", "()Ltc/d;", "Luc/d;", "<set-?>", "Z", "m", "()Z", "isDuplex", "k", "hasFailure", "Ltc/f;", "Ltc/f;", "h", "()Ltc/f;", "connection", "l", "isCoalescedConnection", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e call;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final r eventListener;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final d finder;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final uc.d codec;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean isDuplex;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean hasFailure;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final f connection;

    /* compiled from: Exchange.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u00028\u0000\"\n\b\u0000\u0010\t*\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0017R\u0016\u0010\u001e\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001a¨\u0006\u001f"}, d2 = {"Ltc/c$a;", "LCc/i;", "LCc/z;", "delegate", "", "contentLength", "<init>", "(Ltc/c;LCc/z;J)V", "Ljava/io/IOException;", "E", "e", "a", "(Ljava/io/IOException;)Ljava/io/IOException;", "LCc/e;", "source", "byteCount", "Loa/F;", "n0", "(LCc/e;J)V", "flush", "()V", "close", "C", "J", "", "D", "Z", "completed", "bytesReceived", "F", "closed", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class a extends Cc.i {

        /* renamed from: C, reason: collision with root package name and from kotlin metadata */
        private final long contentLength;

        /* renamed from: D, reason: collision with root package name and from kotlin metadata */
        private boolean completed;

        /* renamed from: E, reason: collision with root package name and from kotlin metadata */
        private long bytesReceived;

        /* renamed from: F, reason: collision with root package name and from kotlin metadata */
        private boolean closed;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ c f50072G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c cVar, z delegate, long j10) {
            super(delegate);
            C3862t.g(delegate, "delegate");
            this.f50072G = cVar;
            this.contentLength = j10;
        }

        private final <E extends IOException> E a(E e10) {
            if (this.completed) {
                return e10;
            }
            this.completed = true;
            return (E) this.f50072G.a(this.bytesReceived, false, true, e10);
        }

        @Override // Cc.i, Cc.z, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            this.closed = true;
            long j10 = this.contentLength;
            if (j10 != -1 && this.bytesReceived != j10) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                a(null);
            } catch (IOException e10) {
                throw a(e10);
            }
        }

        @Override // Cc.i, Cc.z, java.io.Flushable
        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e10) {
                throw a(e10);
            }
        }

        @Override // Cc.i, Cc.z
        public void n0(C0982e source, long byteCount) throws IOException {
            C3862t.g(source, "source");
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            long j10 = this.contentLength;
            if (j10 == -1 || this.bytesReceived + byteCount <= j10) {
                try {
                    super.n0(source, byteCount);
                    this.bytesReceived += byteCount;
                    return;
                } catch (IOException e10) {
                    throw a(e10);
                }
            }
            throw new ProtocolException("expected " + this.contentLength + " bytes but received " + (this.bytesReceived + byteCount));
        }
    }

    /* compiled from: Exchange.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0013\u001a\u00028\u0000\"\n\b\u0000\u0010\u0011*\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001a¨\u0006 "}, d2 = {"Ltc/c$b;", "LCc/j;", "LCc/B;", "delegate", "", "contentLength", "<init>", "(Ltc/c;LCc/B;J)V", "LCc/e;", "sink", "byteCount", "I0", "(LCc/e;J)J", "Loa/F;", "close", "()V", "Ljava/io/IOException;", "E", "e", "b", "(Ljava/io/IOException;)Ljava/io/IOException;", "C", "J", "D", "bytesReceived", "", "Z", "invokeStartEvent", "F", "completed", "G", "closed", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class b extends j {

        /* renamed from: C, reason: collision with root package name and from kotlin metadata */
        private final long contentLength;

        /* renamed from: D, reason: collision with root package name and from kotlin metadata */
        private long bytesReceived;

        /* renamed from: E, reason: collision with root package name and from kotlin metadata */
        private boolean invokeStartEvent;

        /* renamed from: F, reason: collision with root package name and from kotlin metadata */
        private boolean completed;

        /* renamed from: G, reason: collision with root package name and from kotlin metadata */
        private boolean closed;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ c f50078H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c cVar, B delegate, long j10) {
            super(delegate);
            C3862t.g(delegate, "delegate");
            this.f50078H = cVar;
            this.contentLength = j10;
            this.invokeStartEvent = true;
            if (j10 == 0) {
                b(null);
            }
        }

        @Override // Cc.j, Cc.B
        public long I0(C0982e sink, long byteCount) throws IOException {
            C3862t.g(sink, "sink");
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            try {
                long jI0 = getDelegate().I0(sink, byteCount);
                if (this.invokeStartEvent) {
                    this.invokeStartEvent = false;
                    this.f50078H.getEventListener().w(this.f50078H.getCall());
                }
                if (jI0 == -1) {
                    b(null);
                    return -1L;
                }
                long j10 = this.bytesReceived + jI0;
                long j11 = this.contentLength;
                if (j11 != -1 && j10 > j11) {
                    throw new ProtocolException("expected " + this.contentLength + " bytes but received " + j10);
                }
                this.bytesReceived = j10;
                if (j10 == j11) {
                    b(null);
                }
                return jI0;
            } catch (IOException e10) {
                throw b(e10);
            }
        }

        public final <E extends IOException> E b(E e10) {
            if (this.completed) {
                return e10;
            }
            this.completed = true;
            if (e10 == null && this.invokeStartEvent) {
                this.invokeStartEvent = false;
                this.f50078H.getEventListener().w(this.f50078H.getCall());
            }
            return (E) this.f50078H.a(this.bytesReceived, true, false, e10);
        }

        @Override // Cc.j, Cc.B, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            this.closed = true;
            try {
                super.close();
                b(null);
            } catch (IOException e10) {
                throw b(e10);
            }
        }
    }

    public c(e call, r eventListener, d finder, uc.d codec) {
        C3862t.g(call, "call");
        C3862t.g(eventListener, "eventListener");
        C3862t.g(finder, "finder");
        C3862t.g(codec, "codec");
        this.call = call;
        this.eventListener = eventListener;
        this.finder = finder;
        this.codec = codec;
        this.connection = codec.getConnection();
    }

    private final void t(IOException e10) {
        this.hasFailure = true;
        this.finder.h(e10);
        this.codec.getConnection().G(this.call, e10);
    }

    public final <E extends IOException> E a(long bytesRead, boolean responseDone, boolean requestDone, E e10) {
        if (e10 != null) {
            t(e10);
        }
        if (requestDone) {
            if (e10 != null) {
                this.eventListener.s(this.call, e10);
            } else {
                this.eventListener.q(this.call, bytesRead);
            }
        }
        if (responseDone) {
            if (e10 != null) {
                this.eventListener.x(this.call, e10);
            } else {
                this.eventListener.v(this.call, bytesRead);
            }
        }
        return (E) this.call.u(this, requestDone, responseDone, e10);
    }

    public final void b() {
        this.codec.cancel();
    }

    public final z c(C4178B request, boolean duplex) {
        C3862t.g(request, "request");
        this.isDuplex = duplex;
        AbstractC4179C body = request.getBody();
        C3862t.d(body);
        long jA = body.a();
        this.eventListener.r(this.call);
        return new a(this, this.codec.a(request, jA), jA);
    }

    public final void d() {
        this.codec.cancel();
        this.call.u(this, true, true, null);
    }

    public final void e() throws IOException {
        try {
            this.codec.b();
        } catch (IOException e10) {
            this.eventListener.s(this.call, e10);
            t(e10);
            throw e10;
        }
    }

    public final void f() throws IOException {
        try {
            this.codec.e();
        } catch (IOException e10) {
            this.eventListener.s(this.call, e10);
            t(e10);
            throw e10;
        }
    }

    /* renamed from: g, reason: from getter */
    public final e getCall() {
        return this.call;
    }

    /* renamed from: h, reason: from getter */
    public final f getConnection() {
        return this.connection;
    }

    /* renamed from: i, reason: from getter */
    public final r getEventListener() {
        return this.eventListener;
    }

    /* renamed from: j, reason: from getter */
    public final d getFinder() {
        return this.finder;
    }

    /* renamed from: k, reason: from getter */
    public final boolean getHasFailure() {
        return this.hasFailure;
    }

    public final boolean l() {
        return !C3862t.b(this.finder.getAddress().getUrl().getHost(), this.connection.getRoute().getAddress().getUrl().getHost());
    }

    /* renamed from: m, reason: from getter */
    public final boolean getIsDuplex() {
        return this.isDuplex;
    }

    public final void n() {
        this.codec.getConnection().y();
    }

    public final void o() {
        this.call.u(this, true, false, null);
    }

    public final E p(C4180D response) throws IOException {
        C3862t.g(response, "response");
        try {
            String strK = C4180D.k(response, "Content-Type", null, 2, null);
            long jF = this.codec.f(response);
            return new uc.h(strK, jF, o.d(new b(this, this.codec.g(response), jF)));
        } catch (IOException e10) {
            this.eventListener.x(this.call, e10);
            t(e10);
            throw e10;
        }
    }

    public final C4180D.a q(boolean expectContinue) throws IOException {
        try {
            C4180D.a aVarC = this.codec.c(expectContinue);
            if (aVarC != null) {
                aVarC.l(this);
            }
            return aVarC;
        } catch (IOException e10) {
            this.eventListener.x(this.call, e10);
            t(e10);
            throw e10;
        }
    }

    public final void r(C4180D response) {
        C3862t.g(response, "response");
        this.eventListener.y(this.call, response);
    }

    public final void s() {
        this.eventListener.z(this.call);
    }

    public final void u(C4178B request) throws IOException {
        C3862t.g(request, "request");
        try {
            this.eventListener.u(this.call);
            this.codec.h(request);
            this.eventListener.t(this.call, request);
        } catch (IOException e10) {
            this.eventListener.s(this.call, e10);
            t(e10);
            throw e10;
        }
    }
}
