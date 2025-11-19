package vc;

import Cc.B;
import Cc.C;
import Cc.C0982e;
import Cc.k;
import Ub.n;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oc.C4178B;
import oc.C4180D;
import oc.u;
import oc.v;
import oc.z;
import uc.d;
import uc.i;

/* compiled from: Http1ExchangeCodec.kt */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 '2\u00020\u0001:\u0007#0:@/+-B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010#\u001a\u00020\f2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0010H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001dH\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u00102\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u00122\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u001dH\u0016¢\u0006\u0004\b/\u0010&J\u000f\u00100\u001a\u00020\u001dH\u0016¢\u0006\u0004\b0\u0010&J\u001d\u00105\u001a\u00020\u001d2\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J\u0019\u0010:\u001a\u0004\u0018\u0001092\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\b:\u0010;J\u0015\u0010<\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b<\u0010=R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010>R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u0010?\u001a\u0004\b@\u0010AR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010BR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010CR\u0016\u0010F\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010ER\u0014\u0010I\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010HR\u0018\u0010K\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010JR\u0018\u0010N\u001a\u000207*\u00020)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0018\u0010N\u001a\u000207*\u00020 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bO\u0010P¨\u0006Q"}, d2 = {"Lvc/b;", "Luc/d;", "Loc/z;", "client", "Ltc/f;", "connection", "LCc/g;", "source", "LCc/f;", "sink", "<init>", "(Loc/z;Ltc/f;LCc/g;LCc/f;)V", "LCc/z;", "u", "()LCc/z;", "x", "", "length", "LCc/B;", "w", "(J)LCc/B;", "Loc/v;", "url", "v", "(Loc/v;)LCc/B;", "y", "()LCc/B;", "LCc/k;", "timeout", "Loa/F;", "r", "(LCc/k;)V", "Loc/B;", "request", "contentLength", "a", "(Loc/B;J)LCc/z;", "cancel", "()V", "h", "(Loc/B;)V", "Loc/D;", "response", "f", "(Loc/D;)J", "g", "(Loc/D;)LCc/B;", "e", "b", "Loc/u;", "headers", "", "requestLine", "A", "(Loc/u;Ljava/lang/String;)V", "", "expectContinue", "Loc/D$a;", "c", "(Z)Loc/D$a;", "z", "(Loc/D;)V", "Loc/z;", "Ltc/f;", "d", "()Ltc/f;", "LCc/g;", "LCc/f;", "", "I", "state", "Lvc/a;", "Lvc/a;", "headersReader", "Loc/u;", "trailers", "t", "(Loc/D;)Z", "isChunked", "s", "(Loc/B;)Z", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: vc.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4947b implements d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final z client;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final tc.f connection;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Cc.g source;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Cc.f sink;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int state;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final C4946a headersReader;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private u trailers;

    /* compiled from: Http1ExchangeCodec.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b¢\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00108\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lvc/b$a;", "LCc/B;", "<init>", "(Lvc/b;)V", "LCc/C;", "r", "()LCc/C;", "LCc/e;", "sink", "", "byteCount", "I0", "(LCc/e;J)J", "Loa/F;", "b", "()V", "LCc/k;", "B", "LCc/k;", "getTimeout", "()LCc/k;", "timeout", "", "C", "Z", "a", "()Z", "c", "(Z)V", "closed", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: vc.b$a */
    private abstract class a implements B {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private final k timeout;

        /* renamed from: C, reason: collision with root package name and from kotlin metadata */
        private boolean closed;

        public a() {
            this.timeout = new k(C4947b.this.source.getTimeout());
        }

        @Override // Cc.B
        public long I0(C0982e sink, long byteCount) throws IOException {
            C3862t.g(sink, "sink");
            try {
                return C4947b.this.source.I0(sink, byteCount);
            } catch (IOException e10) {
                C4947b.this.getConnection().y();
                b();
                throw e10;
            }
        }

        /* renamed from: a, reason: from getter */
        protected final boolean getClosed() {
            return this.closed;
        }

        public final void b() {
            if (C4947b.this.state == 6) {
                return;
            }
            if (C4947b.this.state == 5) {
                C4947b.this.r(this.timeout);
                C4947b.this.state = 6;
            } else {
                throw new IllegalStateException("state: " + C4947b.this.state);
            }
        }

        protected final void c(boolean z10) {
            this.closed = z10;
        }

        @Override // Cc.B
        /* renamed from: r */
        public C getTimeout() {
            return this.timeout;
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lvc/b$b;", "LCc/z;", "<init>", "(Lvc/b;)V", "LCc/C;", "r", "()LCc/C;", "LCc/e;", "source", "", "byteCount", "Loa/F;", "n0", "(LCc/e;J)V", "flush", "()V", "close", "LCc/k;", "B", "LCc/k;", "timeout", "", "C", "Z", "closed", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: vc.b$b, reason: collision with other inner class name */
    private final class C0743b implements Cc.z {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private final k timeout;

        /* renamed from: C, reason: collision with root package name and from kotlin metadata */
        private boolean closed;

        public C0743b() {
            this.timeout = new k(C4947b.this.sink.getTimeout());
        }

        @Override // Cc.z, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            C4947b.this.sink.A0("0\r\n\r\n");
            C4947b.this.r(this.timeout);
            C4947b.this.state = 3;
        }

        @Override // Cc.z, java.io.Flushable
        public synchronized void flush() {
            if (this.closed) {
                return;
            }
            C4947b.this.sink.flush();
        }

        @Override // Cc.z
        public void n0(C0982e source, long byteCount) {
            C3862t.g(source, "source");
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            if (byteCount == 0) {
                return;
            }
            C4947b.this.sink.K0(byteCount);
            C4947b.this.sink.A0("\r\n");
            C4947b.this.sink.n0(source, byteCount);
            C4947b.this.sink.A0("\r\n");
        }

        @Override // Cc.z
        /* renamed from: r */
        public C getTimeout() {
            return this.timeout;
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\tR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lvc/b$c;", "Lvc/b$a;", "Lvc/b;", "Loc/v;", "url", "<init>", "(Lvc/b;Loc/v;)V", "Loa/F;", "d", "()V", "LCc/e;", "sink", "", "byteCount", "I0", "(LCc/e;J)J", "close", "E", "Loc/v;", "F", "J", "bytesRemainingInChunk", "", "G", "Z", "hasMoreChunks", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: vc.b$c */
    private final class c extends a {

        /* renamed from: E, reason: collision with root package name and from kotlin metadata */
        private final v url;

        /* renamed from: F, reason: collision with root package name and from kotlin metadata */
        private long bytesRemainingInChunk;

        /* renamed from: G, reason: collision with root package name and from kotlin metadata */
        private boolean hasMoreChunks;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ C4947b f51646H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C4947b c4947b, v url) {
            super();
            C3862t.g(url, "url");
            this.f51646H = c4947b;
            this.url = url;
            this.bytesRemainingInChunk = -1L;
            this.hasMoreChunks = true;
        }

        private final void d() throws ProtocolException {
            if (this.bytesRemainingInChunk != -1) {
                this.f51646H.source.Y0();
            }
            try {
                this.bytesRemainingInChunk = this.f51646H.source.x1();
                String string = n.U0(this.f51646H.source.Y0()).toString();
                if (this.bytesRemainingInChunk < 0 || (string.length() > 0 && !n.G(string, ";", false, 2, null))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.bytesRemainingInChunk + string + '\"');
                }
                if (this.bytesRemainingInChunk == 0) {
                    this.hasMoreChunks = false;
                    C4947b c4947b = this.f51646H;
                    c4947b.trailers = c4947b.headersReader.a();
                    z zVar = this.f51646H.client;
                    C3862t.d(zVar);
                    oc.n cookieJar = zVar.getCookieJar();
                    v vVar = this.url;
                    u uVar = this.f51646H.trailers;
                    C3862t.d(uVar);
                    uc.e.f(cookieJar, vVar, uVar);
                    b();
                }
            } catch (NumberFormatException e10) {
                throw new ProtocolException(e10.getMessage());
            }
        }

        @Override // vc.C4947b.a, Cc.B
        public long I0(C0982e sink, long byteCount) throws IOException {
            C3862t.g(sink, "sink");
            if (byteCount < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
            }
            if (getClosed()) {
                throw new IllegalStateException("closed");
            }
            if (!this.hasMoreChunks) {
                return -1L;
            }
            long j10 = this.bytesRemainingInChunk;
            if (j10 == 0 || j10 == -1) {
                d();
                if (!this.hasMoreChunks) {
                    return -1L;
                }
            }
            long jI0 = super.I0(sink, Math.min(byteCount, this.bytesRemainingInChunk));
            if (jI0 != -1) {
                this.bytesRemainingInChunk -= jI0;
                return jI0;
            }
            this.f51646H.getConnection().y();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            b();
            throw protocolException;
        }

        @Override // Cc.B, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (this.hasMoreChunks && !pc.d.s(this, 100, TimeUnit.MILLISECONDS)) {
                this.f51646H.getConnection().y();
                b();
            }
            c(true);
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lvc/b$e;", "Lvc/b$a;", "Lvc/b;", "", "bytesRemaining", "<init>", "(Lvc/b;J)V", "LCc/e;", "sink", "byteCount", "I0", "(LCc/e;J)J", "Loa/F;", "close", "()V", "E", "J", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: vc.b$e */
    private final class e extends a {

        /* renamed from: E, reason: collision with root package name and from kotlin metadata */
        private long bytesRemaining;

        public e(long j10) {
            super();
            this.bytesRemaining = j10;
            if (j10 == 0) {
                b();
            }
        }

        @Override // vc.C4947b.a, Cc.B
        public long I0(C0982e sink, long byteCount) throws IOException {
            C3862t.g(sink, "sink");
            if (byteCount < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
            }
            if (getClosed()) {
                throw new IllegalStateException("closed");
            }
            long j10 = this.bytesRemaining;
            if (j10 == 0) {
                return -1L;
            }
            long jI0 = super.I0(sink, Math.min(j10, byteCount));
            if (jI0 == -1) {
                C4947b.this.getConnection().y();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                b();
                throw protocolException;
            }
            long j11 = this.bytesRemaining - jI0;
            this.bytesRemaining = j11;
            if (j11 == 0) {
                b();
            }
            return jI0;
        }

        @Override // Cc.B, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (this.bytesRemaining != 0 && !pc.d.s(this, 100, TimeUnit.MILLISECONDS)) {
                C4947b.this.getConnection().y();
                b();
            }
            c(true);
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lvc/b$f;", "LCc/z;", "<init>", "(Lvc/b;)V", "LCc/C;", "r", "()LCc/C;", "LCc/e;", "source", "", "byteCount", "Loa/F;", "n0", "(LCc/e;J)V", "flush", "()V", "close", "LCc/k;", "B", "LCc/k;", "timeout", "", "C", "Z", "closed", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: vc.b$f */
    private final class f implements Cc.z {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private final k timeout;

        /* renamed from: C, reason: collision with root package name and from kotlin metadata */
        private boolean closed;

        public f() {
            this.timeout = new k(C4947b.this.sink.getTimeout());
        }

        @Override // Cc.z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            C4947b.this.r(this.timeout);
            C4947b.this.state = 3;
        }

        @Override // Cc.z, java.io.Flushable
        public void flush() {
            if (this.closed) {
                return;
            }
            C4947b.this.sink.flush();
        }

        @Override // Cc.z
        public void n0(C0982e source, long byteCount) {
            C3862t.g(source, "source");
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            pc.d.l(source.getSize(), 0L, byteCount);
            C4947b.this.sink.n0(source, byteCount);
        }

        @Override // Cc.z
        /* renamed from: r */
        public C getTimeout() {
            return this.timeout;
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lvc/b$g;", "Lvc/b$a;", "Lvc/b;", "<init>", "(Lvc/b;)V", "LCc/e;", "sink", "", "byteCount", "I0", "(LCc/e;J)J", "Loa/F;", "close", "()V", "", "E", "Z", "inputExhausted", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: vc.b$g */
    private final class g extends a {

        /* renamed from: E, reason: collision with root package name and from kotlin metadata */
        private boolean inputExhausted;

        public g() {
            super();
        }

        @Override // vc.C4947b.a, Cc.B
        public long I0(C0982e sink, long byteCount) throws IOException {
            C3862t.g(sink, "sink");
            if (byteCount < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
            }
            if (getClosed()) {
                throw new IllegalStateException("closed");
            }
            if (this.inputExhausted) {
                return -1L;
            }
            long jI0 = super.I0(sink, byteCount);
            if (jI0 != -1) {
                return jI0;
            }
            this.inputExhausted = true;
            b();
            return -1L;
        }

        @Override // Cc.B, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (!this.inputExhausted) {
                b();
            }
            c(true);
        }
    }

    public C4947b(z zVar, tc.f connection, Cc.g source, Cc.f sink) {
        C3862t.g(connection, "connection");
        C3862t.g(source, "source");
        C3862t.g(sink, "sink");
        this.client = zVar;
        this.connection = connection;
        this.source = source;
        this.sink = sink;
        this.headersReader = new C4946a(source);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(k timeout) {
        C delegate = timeout.getDelegate();
        timeout.j(C.f3205e);
        delegate.a();
        delegate.b();
    }

    private final boolean s(C4178B c4178b) {
        return n.t("chunked", c4178b.d("Transfer-Encoding"), true);
    }

    private final boolean t(C4180D c4180d) {
        return n.t("chunked", C4180D.k(c4180d, "Transfer-Encoding", null, 2, null), true);
    }

    private final Cc.z u() {
        if (this.state == 1) {
            this.state = 2;
            return new C0743b();
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    private final B v(v url) {
        if (this.state == 4) {
            this.state = 5;
            return new c(this, url);
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    private final B w(long length) {
        if (this.state == 4) {
            this.state = 5;
            return new e(length);
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    private final Cc.z x() {
        if (this.state == 1) {
            this.state = 2;
            return new f();
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    private final B y() {
        if (this.state == 4) {
            this.state = 5;
            getConnection().y();
            return new g();
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    public final void A(u headers, String requestLine) {
        C3862t.g(headers, "headers");
        C3862t.g(requestLine, "requestLine");
        if (this.state != 0) {
            throw new IllegalStateException(("state: " + this.state).toString());
        }
        this.sink.A0(requestLine).A0("\r\n");
        int size = headers.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.sink.A0(headers.h(i10)).A0(": ").A0(headers.w(i10)).A0("\r\n");
        }
        this.sink.A0("\r\n");
        this.state = 1;
    }

    @Override // uc.d
    public Cc.z a(C4178B request, long contentLength) throws ProtocolException {
        C3862t.g(request, "request");
        if (request.getBody() != null && request.getBody().f()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (s(request)) {
            return u();
        }
        if (contentLength != -1) {
            return x();
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // uc.d
    public void b() {
        this.sink.flush();
    }

    @Override // uc.d
    public C4180D.a c(boolean expectContinue) {
        int i10 = this.state;
        if (i10 != 1 && i10 != 2 && i10 != 3) {
            throw new IllegalStateException(("state: " + this.state).toString());
        }
        try {
            uc.k kVarA = uc.k.INSTANCE.a(this.headersReader.b());
            C4180D.a aVarK = new C4180D.a().p(kVarA.protocol).g(kVarA.code).m(kVarA.message).k(this.headersReader.a());
            if (expectContinue && kVarA.code == 100) {
                return null;
            }
            int i11 = kVarA.code;
            if (i11 == 100) {
                this.state = 3;
                return aVarK;
            }
            if (102 > i11 || i11 >= 200) {
                this.state = 4;
                return aVarK;
            }
            this.state = 3;
            return aVarK;
        } catch (EOFException e10) {
            throw new IOException("unexpected end of stream on " + getConnection().getRoute().getAddress().getUrl().q(), e10);
        }
    }

    @Override // uc.d
    public void cancel() {
        getConnection().d();
    }

    @Override // uc.d
    /* renamed from: d, reason: from getter */
    public tc.f getConnection() {
        return this.connection;
    }

    @Override // uc.d
    public void e() {
        this.sink.flush();
    }

    @Override // uc.d
    public long f(C4180D response) {
        C3862t.g(response, "response");
        if (!uc.e.b(response)) {
            return 0L;
        }
        if (t(response)) {
            return -1L;
        }
        return pc.d.v(response);
    }

    @Override // uc.d
    public B g(C4180D response) {
        C3862t.g(response, "response");
        if (!uc.e.b(response)) {
            return w(0L);
        }
        if (t(response)) {
            return v(response.getRequest().getUrl());
        }
        long jV = pc.d.v(response);
        return jV != -1 ? w(jV) : y();
    }

    @Override // uc.d
    public void h(C4178B request) {
        C3862t.g(request, "request");
        i iVar = i.f50550a;
        Proxy.Type type = getConnection().getRoute().getProxy().type();
        C3862t.f(type, "connection.route().proxy.type()");
        A(request.getHeaders(), iVar.a(request, type));
    }

    public final void z(C4180D response) {
        C3862t.g(response, "response");
        long jV = pc.d.v(response);
        if (jV == -1) {
            return;
        }
        B bW = w(jV);
        pc.d.M(bW, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        bW.close();
    }
}
