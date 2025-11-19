package wc;

import Cc.B;
import Cc.C;
import Cc.C0980c;
import Cc.C0982e;
import Cc.z;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import oc.u;
import okhttp3.internal.http2.StreamResetException;

/* compiled from: Http2Stream.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 T2\u00020\u0001:\u0004.*0\u001eB3\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0017J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\u001d2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b \u0010!J\u001d\u0010%\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0002¢\u0006\u0004\b%\u0010&J\u001d\u0010'\u001a\u00020\u001d2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u00020\u001d2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b)\u0010!J\u000f\u0010*\u001a\u00020\u001dH\u0000¢\u0006\u0004\b*\u0010+J\u0015\u0010.\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u001dH\u0000¢\u0006\u0004\b0\u0010+J\u000f\u00101\u001a\u00020\u001dH\u0000¢\u0006\u0004\b1\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u00105\u001a\u0004\b6\u00107R*\u0010=\u001a\u00020,2\u0006\u00108\u001a\u00020,8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010/R*\u0010@\u001a\u00020,2\u0006\u00108\u001a\u00020,8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u00109\u001a\u0004\b>\u0010;\"\u0004\b?\u0010/R*\u0010C\u001a\u00020,2\u0006\u00108\u001a\u00020,8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u00109\u001a\u0004\bA\u0010;\"\u0004\bB\u0010/R*\u0010F\u001a\u00020,2\u0006\u00108\u001a\u00020,8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b \u00109\u001a\u0004\bD\u0010;\"\u0004\bE\u0010/R\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020\t0G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010HR\u0016\u0010L\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u001e\u0010#\u001a\u00060MR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u001e\u0010V\u001a\u00060RR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b3\u0010S\u001a\u0004\bT\u0010UR\u001e\u0010[\u001a\u00060WR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b>\u0010X\u001a\u0004\bY\u0010ZR\u001e\u0010]\u001a\u00060WR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b:\u0010X\u001a\u0004\b\\\u0010ZR$\u0010\u000e\u001a\u0004\u0018\u00010\r8@@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bY\u0010^\u001a\u0004\bJ\u0010_\"\u0004\b`\u0010!R$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010a\u001a\u0004\bN\u0010b\"\u0004\bc\u0010dR\u0011\u0010g\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\be\u0010fR\u0011\u0010i\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bh\u0010f¨\u0006j"}, d2 = {"Lwc/h;", "", "", "id", "Lwc/e;", "connection", "", "outFinished", "inFinished", "Loc/u;", "headers", "<init>", "(ILwc/e;ZZLoc/u;)V", "Lwc/a;", "errorCode", "Ljava/io/IOException;", "errorException", "e", "(Lwc/a;Ljava/io/IOException;)Z", "C", "()Loc/u;", "LCc/C;", "v", "()LCc/C;", "E", "LCc/z;", "n", "()LCc/z;", "rstStatusCode", "Loa/F;", "d", "(Lwc/a;Ljava/io/IOException;)V", "f", "(Lwc/a;)V", "LCc/g;", "source", "length", "w", "(LCc/g;I)V", "x", "(Loc/u;Z)V", "y", "b", "()V", "", "delta", "a", "(J)V", "c", "D", "I", "j", "()I", "Lwc/e;", "g", "()Lwc/e;", "<set-?>", "J", "l", "()J", "A", "readBytesTotal", "k", "z", "readBytesAcknowledged", "r", "B", "writeBytesTotal", "q", "setWriteBytesMaximum$okhttp", "writeBytesMaximum", "Ljava/util/ArrayDeque;", "Ljava/util/ArrayDeque;", "headersQueue", "h", "Z", "hasResponseHeaders", "Lwc/h$c;", "i", "Lwc/h$c;", "p", "()Lwc/h$c;", "Lwc/h$b;", "Lwc/h$b;", "o", "()Lwc/h$b;", "sink", "Lwc/h$d;", "Lwc/h$d;", "m", "()Lwc/h$d;", "readTimeout", "s", "writeTimeout", "Lwc/a;", "()Lwc/a;", "setErrorCode$okhttp", "Ljava/io/IOException;", "()Ljava/io/IOException;", "setErrorException$okhttp", "(Ljava/io/IOException;)V", "u", "()Z", "isOpen", "t", "isLocallyInitiated", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e connection;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private long readBytesTotal;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long readBytesAcknowledged;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private long writeBytesTotal;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private long writeBytesMaximum;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ArrayDeque<u> headersQueue;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean hasResponseHeaders;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final c source;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final b sink;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final d readTimeout;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final d writeTimeout;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private a errorCode;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private IOException errorException;

    /* compiled from: Http2Stream.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u0011R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\tR\u0014\u0010\u001d\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR$\u0010%\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010)\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u0017\u001a\u0004\b'\u0010\u0019\"\u0004\b(\u0010\t¨\u0006*"}, d2 = {"Lwc/h$b;", "LCc/z;", "", "finished", "<init>", "(Lwc/h;Z)V", "outFinishedOnLastFrame", "Loa/F;", "a", "(Z)V", "LCc/e;", "source", "", "byteCount", "n0", "(LCc/e;J)V", "flush", "()V", "LCc/C;", "r", "()LCc/C;", "close", "B", "Z", "c", "()Z", "setFinished", "C", "LCc/e;", "sendBuffer", "Loc/u;", "D", "Loc/u;", "getTrailers", "()Loc/u;", "setTrailers", "(Loc/u;)V", "trailers", "E", "b", "setClosed", "closed", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class b implements z {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private boolean finished;

        /* renamed from: C, reason: collision with root package name and from kotlin metadata */
        private final C0982e sendBuffer = new C0982e();

        /* renamed from: D, reason: collision with root package name and from kotlin metadata */
        private u trailers;

        /* renamed from: E, reason: collision with root package name and from kotlin metadata */
        private boolean closed;

        public b(boolean z10) {
            this.finished = z10;
        }

        private final void a(boolean outFinishedOnLastFrame) throws IOException {
            long jMin;
            boolean z10;
            h hVar = h.this;
            synchronized (hVar) {
                try {
                    hVar.getWriteTimeout().v();
                    while (hVar.getWriteBytesTotal() >= hVar.getWriteBytesMaximum() && !this.finished && !this.closed && hVar.h() == null) {
                        try {
                            hVar.D();
                        } finally {
                            hVar.getWriteTimeout().C();
                        }
                    }
                    hVar.getWriteTimeout().C();
                    hVar.c();
                    jMin = Math.min(hVar.getWriteBytesMaximum() - hVar.getWriteBytesTotal(), this.sendBuffer.getSize());
                    hVar.B(hVar.getWriteBytesTotal() + jMin);
                    z10 = outFinishedOnLastFrame && jMin == this.sendBuffer.getSize();
                    C4153F c4153f = C4153F.f46609a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            h.this.getWriteTimeout().v();
            try {
                h.this.getConnection().a1(h.this.getId(), z10, this.sendBuffer, jMin);
            } finally {
                hVar = h.this;
            }
        }

        /* renamed from: b, reason: from getter */
        public final boolean getClosed() {
            return this.closed;
        }

        /* renamed from: c, reason: from getter */
        public final boolean getFinished() {
            return this.finished;
        }

        @Override // Cc.z, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            h hVar = h.this;
            if (pc.d.f47758h && Thread.holdsLock(hVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + hVar);
            }
            h hVar2 = h.this;
            synchronized (hVar2) {
                if (this.closed) {
                    return;
                }
                boolean z10 = hVar2.h() == null;
                C4153F c4153f = C4153F.f46609a;
                if (!h.this.getSink().finished) {
                    boolean z11 = this.sendBuffer.getSize() > 0;
                    if (this.trailers != null) {
                        while (this.sendBuffer.getSize() > 0) {
                            a(false);
                        }
                        e connection = h.this.getConnection();
                        int id2 = h.this.getId();
                        u uVar = this.trailers;
                        C3862t.d(uVar);
                        connection.g1(id2, z10, pc.d.P(uVar));
                    } else if (z11) {
                        while (this.sendBuffer.getSize() > 0) {
                            a(true);
                        }
                    } else if (z10) {
                        h.this.getConnection().a1(h.this.getId(), true, null, 0L);
                    }
                }
                synchronized (h.this) {
                    this.closed = true;
                    C4153F c4153f2 = C4153F.f46609a;
                }
                h.this.getConnection().flush();
                h.this.b();
            }
        }

        @Override // Cc.z, java.io.Flushable
        public void flush() throws IOException {
            h hVar = h.this;
            if (pc.d.f47758h && Thread.holdsLock(hVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + hVar);
            }
            h hVar2 = h.this;
            synchronized (hVar2) {
                hVar2.c();
                C4153F c4153f = C4153F.f46609a;
            }
            while (this.sendBuffer.getSize() > 0) {
                a(false);
                h.this.getConnection().flush();
            }
        }

        @Override // Cc.z
        public void n0(C0982e source, long byteCount) throws IOException {
            C3862t.g(source, "source");
            h hVar = h.this;
            if (!pc.d.f47758h || !Thread.holdsLock(hVar)) {
                this.sendBuffer.n0(source, byteCount);
                while (this.sendBuffer.getSize() >= 16384) {
                    a(false);
                }
            } else {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + hVar);
            }
        }

        @Override // Cc.z
        /* renamed from: r */
        public C getTimeout() {
            return h.this.getWriteTimeout();
        }
    }

    /* compiled from: Http2Stream.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\"\u0010\u0005\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0017\u0010&\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010)\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010%R$\u00101\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00105\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b2\u0010\u001d\u001a\u0004\b3\u0010\u001f\"\u0004\b4\u0010!¨\u00066"}, d2 = {"Lwc/h$c;", "LCc/B;", "", "maxByteCount", "", "finished", "<init>", "(Lwc/h;JZ)V", "read", "Loa/F;", "f", "(J)V", "LCc/e;", "sink", "byteCount", "I0", "(LCc/e;J)J", "LCc/g;", "source", "c", "(LCc/g;J)V", "LCc/C;", "r", "()LCc/C;", "close", "()V", "B", "J", "C", "Z", "b", "()Z", "d", "(Z)V", "D", "LCc/e;", "getReceiveBuffer", "()LCc/e;", "receiveBuffer", "E", "getReadBuffer", "readBuffer", "Loc/u;", "F", "Loc/u;", "getTrailers", "()Loc/u;", "e", "(Loc/u;)V", "trailers", "G", "a", "setClosed$okhttp", "closed", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class c implements B {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private final long maxByteCount;

        /* renamed from: C, reason: collision with root package name and from kotlin metadata */
        private boolean finished;

        /* renamed from: D, reason: collision with root package name and from kotlin metadata */
        private final C0982e receiveBuffer = new C0982e();

        /* renamed from: E, reason: collision with root package name and from kotlin metadata */
        private final C0982e readBuffer = new C0982e();

        /* renamed from: F, reason: collision with root package name and from kotlin metadata */
        private u trailers;

        /* renamed from: G, reason: collision with root package name and from kotlin metadata */
        private boolean closed;

        public c(long j10, boolean z10) {
            this.maxByteCount = j10;
            this.finished = z10;
        }

        private final void f(long read) {
            h hVar = h.this;
            if (!pc.d.f47758h || !Thread.holdsLock(hVar)) {
                h.this.getConnection().X0(read);
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + hVar);
        }

        @Override // Cc.B
        public long I0(C0982e sink, long byteCount) throws IOException {
            IOException errorException;
            boolean z10;
            long jI0;
            C3862t.g(sink, "sink");
            long j10 = 0;
            if (byteCount < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
            }
            while (true) {
                h hVar = h.this;
                synchronized (hVar) {
                    hVar.getReadTimeout().v();
                    try {
                        if (hVar.h() == null || this.finished) {
                            errorException = null;
                        } else {
                            errorException = hVar.getErrorException();
                            if (errorException == null) {
                                a aVarH = hVar.h();
                                C3862t.d(aVarH);
                                errorException = new StreamResetException(aVarH);
                            }
                        }
                        if (this.closed) {
                            throw new IOException("stream closed");
                        }
                        z10 = false;
                        if (this.readBuffer.getSize() > j10) {
                            C0982e c0982e = this.readBuffer;
                            jI0 = c0982e.I0(sink, Math.min(byteCount, c0982e.getSize()));
                            hVar.A(hVar.getReadBytesTotal() + jI0);
                            long readBytesTotal = hVar.getReadBytesTotal() - hVar.getReadBytesAcknowledged();
                            if (errorException == null && readBytesTotal >= hVar.getConnection().getOkHttpSettings().c() / 2) {
                                hVar.getConnection().q1(hVar.getId(), readBytesTotal);
                                hVar.z(hVar.getReadBytesTotal());
                            }
                        } else {
                            if (!this.finished && errorException == null) {
                                hVar.D();
                                z10 = true;
                            }
                            jI0 = -1;
                        }
                        hVar.getReadTimeout().C();
                        C4153F c4153f = C4153F.f46609a;
                    } finally {
                    }
                }
                if (!z10) {
                    if (jI0 != -1) {
                        return jI0;
                    }
                    if (errorException == null) {
                        return -1L;
                    }
                    throw errorException;
                }
                j10 = 0;
            }
        }

        /* renamed from: a, reason: from getter */
        public final boolean getClosed() {
            return this.closed;
        }

        /* renamed from: b, reason: from getter */
        public final boolean getFinished() {
            return this.finished;
        }

        public final void c(Cc.g source, long byteCount) throws EOFException {
            boolean z10;
            boolean z11;
            C3862t.g(source, "source");
            h hVar = h.this;
            if (pc.d.f47758h && Thread.holdsLock(hVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + hVar);
            }
            long j10 = byteCount;
            while (j10 > 0) {
                synchronized (h.this) {
                    z10 = this.finished;
                    z11 = this.readBuffer.getSize() + j10 > this.maxByteCount;
                    C4153F c4153f = C4153F.f46609a;
                }
                if (z11) {
                    source.w(j10);
                    h.this.f(a.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z10) {
                    source.w(j10);
                    return;
                }
                long jI0 = source.I0(this.receiveBuffer, j10);
                if (jI0 == -1) {
                    throw new EOFException();
                }
                j10 -= jI0;
                h hVar2 = h.this;
                synchronized (hVar2) {
                    try {
                        if (this.closed) {
                            this.receiveBuffer.b();
                        } else {
                            boolean z12 = this.readBuffer.getSize() == 0;
                            this.readBuffer.S(this.receiveBuffer);
                            if (z12) {
                                C3862t.e(hVar2, "null cannot be cast to non-null type java.lang.Object");
                                hVar2.notifyAll();
                            }
                        }
                    } finally {
                    }
                }
            }
            f(byteCount);
        }

        @Override // Cc.B, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            long size;
            h hVar = h.this;
            synchronized (hVar) {
                this.closed = true;
                size = this.readBuffer.getSize();
                this.readBuffer.b();
                C3862t.e(hVar, "null cannot be cast to non-null type java.lang.Object");
                hVar.notifyAll();
                C4153F c4153f = C4153F.f46609a;
            }
            if (size > 0) {
                f(size);
            }
            h.this.b();
        }

        public final void d(boolean z10) {
            this.finished = z10;
        }

        public final void e(u uVar) {
            this.trailers = uVar;
        }

        @Override // Cc.B
        /* renamed from: r */
        public C getTimeout() {
            return h.this.getReadTimeout();
        }
    }

    /* compiled from: Http2Stream.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lwc/h$d;", "LCc/c;", "<init>", "(Lwc/h;)V", "Loa/F;", "B", "()V", "Ljava/io/IOException;", "cause", "x", "(Ljava/io/IOException;)Ljava/io/IOException;", "C", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class d extends C0980c {
        public d() {
        }

        @Override // Cc.C0980c
        protected void B() {
            h.this.f(a.CANCEL);
            h.this.getConnection().L0();
        }

        public final void C() throws IOException {
            if (w()) {
                throw x(null);
            }
        }

        @Override // Cc.C0980c
        protected IOException x(IOException cause) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (cause != null) {
                socketTimeoutException.initCause(cause);
            }
            return socketTimeoutException;
        }
    }

    public h(int i10, e connection, boolean z10, boolean z11, u uVar) {
        C3862t.g(connection, "connection");
        this.id = i10;
        this.connection = connection;
        this.writeBytesMaximum = connection.getPeerSettings().c();
        ArrayDeque<u> arrayDeque = new ArrayDeque<>();
        this.headersQueue = arrayDeque;
        this.source = new c(connection.getOkHttpSettings().c(), z11);
        this.sink = new b(z10);
        this.readTimeout = new d();
        this.writeTimeout = new d();
        if (uVar == null) {
            if (!t()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (t()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(uVar);
        }
    }

    private final boolean e(a errorCode, IOException errorException) {
        if (pc.d.f47758h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            if (this.errorCode != null) {
                return false;
            }
            this.errorCode = errorCode;
            this.errorException = errorException;
            C3862t.e(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
            if (this.source.getFinished() && this.sink.getFinished()) {
                return false;
            }
            C4153F c4153f = C4153F.f46609a;
            this.connection.G0(this.id);
            return true;
        }
    }

    public final void A(long j10) {
        this.readBytesTotal = j10;
    }

    public final void B(long j10) {
        this.writeBytesTotal = j10;
    }

    public final synchronized u C() {
        u uVarRemoveFirst;
        this.readTimeout.v();
        while (this.headersQueue.isEmpty() && this.errorCode == null) {
            try {
                D();
            } catch (Throwable th) {
                this.readTimeout.C();
                throw th;
            }
        }
        this.readTimeout.C();
        if (this.headersQueue.isEmpty()) {
            IOException iOException = this.errorException;
            if (iOException != null) {
                throw iOException;
            }
            a aVar = this.errorCode;
            C3862t.d(aVar);
            throw new StreamResetException(aVar);
        }
        uVarRemoveFirst = this.headersQueue.removeFirst();
        C3862t.f(uVarRemoveFirst, "headersQueue.removeFirst()");
        return uVarRemoveFirst;
    }

    public final void D() throws InterruptedException, InterruptedIOException {
        try {
            C3862t.e(this, "null cannot be cast to non-null type java.lang.Object");
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final C E() {
        return this.writeTimeout;
    }

    public final void a(long delta) {
        this.writeBytesMaximum += delta;
        if (delta > 0) {
            C3862t.e(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    public final void b() {
        boolean z10;
        boolean zU;
        if (pc.d.f47758h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                z10 = !this.source.getFinished() && this.source.getClosed() && (this.sink.getFinished() || this.sink.getClosed());
                zU = u();
                C4153F c4153f = C4153F.f46609a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z10) {
            d(a.CANCEL, null);
        } else {
            if (zU) {
                return;
            }
            this.connection.G0(this.id);
        }
    }

    public final void c() throws IOException {
        if (this.sink.getClosed()) {
            throw new IOException("stream closed");
        }
        if (this.sink.getFinished()) {
            throw new IOException("stream finished");
        }
        if (this.errorCode != null) {
            IOException iOException = this.errorException;
            if (iOException != null) {
                throw iOException;
            }
            a aVar = this.errorCode;
            C3862t.d(aVar);
            throw new StreamResetException(aVar);
        }
    }

    public final void d(a rstStatusCode, IOException errorException) {
        C3862t.g(rstStatusCode, "rstStatusCode");
        if (e(rstStatusCode, errorException)) {
            this.connection.k1(this.id, rstStatusCode);
        }
    }

    public final void f(a errorCode) {
        C3862t.g(errorCode, "errorCode");
        if (e(errorCode, null)) {
            this.connection.n1(this.id, errorCode);
        }
    }

    /* renamed from: g, reason: from getter */
    public final e getConnection() {
        return this.connection;
    }

    public final synchronized a h() {
        return this.errorCode;
    }

    /* renamed from: i, reason: from getter */
    public final IOException getErrorException() {
        return this.errorException;
    }

    /* renamed from: j, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: k, reason: from getter */
    public final long getReadBytesAcknowledged() {
        return this.readBytesAcknowledged;
    }

    /* renamed from: l, reason: from getter */
    public final long getReadBytesTotal() {
        return this.readBytesTotal;
    }

    /* renamed from: m, reason: from getter */
    public final d getReadTimeout() {
        return this.readTimeout;
    }

    public final z n() {
        synchronized (this) {
            try {
                if (!this.hasResponseHeaders && !t()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
                C4153F c4153f = C4153F.f46609a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.sink;
    }

    /* renamed from: o, reason: from getter */
    public final b getSink() {
        return this.sink;
    }

    /* renamed from: p, reason: from getter */
    public final c getSource() {
        return this.source;
    }

    /* renamed from: q, reason: from getter */
    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    /* renamed from: r, reason: from getter */
    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    /* renamed from: s, reason: from getter */
    public final d getWriteTimeout() {
        return this.writeTimeout;
    }

    public final boolean t() {
        return this.connection.getClient() == ((this.id & 1) == 1);
    }

    public final synchronized boolean u() {
        try {
            if (this.errorCode != null) {
                return false;
            }
            if (this.source.getFinished() || this.source.getClosed()) {
                if (this.sink.getFinished() || this.sink.getClosed()) {
                    if (this.hasResponseHeaders) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final C v() {
        return this.readTimeout;
    }

    public final void w(Cc.g source, int length) {
        C3862t.g(source, "source");
        if (!pc.d.f47758h || !Thread.holdsLock(this)) {
            this.source.c(source, length);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    public final void x(u headers, boolean inFinished) {
        boolean zU;
        C3862t.g(headers, "headers");
        if (pc.d.f47758h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                if (this.hasResponseHeaders && inFinished) {
                    this.source.e(headers);
                } else {
                    this.hasResponseHeaders = true;
                    this.headersQueue.add(headers);
                }
                if (inFinished) {
                    this.source.d(true);
                }
                zU = u();
                C3862t.e(this, "null cannot be cast to non-null type java.lang.Object");
                notifyAll();
                C4153F c4153f = C4153F.f46609a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zU) {
            return;
        }
        this.connection.G0(this.id);
    }

    public final synchronized void y(a errorCode) {
        C3862t.g(errorCode, "errorCode");
        if (this.errorCode == null) {
            this.errorCode = errorCode;
            C3862t.e(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    public final void z(long j10) {
        this.readBytesAcknowledged = j10;
    }
}
