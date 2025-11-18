package oc;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oc.u;

/* compiled from: Response.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001CB}\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001c\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001a\u001a\u00020\u00062\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0006H\u0016¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u0010)R\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\b6\u0010E\u001a\u0004\bF\u0010GR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\bH\u0010E\u001a\u0004\bI\u0010GR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\bJ\u0010E\u001a\u0004\bK\u0010GR\u0017\u0010\u0014\u001a\u00020\u00138\u0007¢\u0006\f\n\u0004\bL\u0010H\u001a\u0004\bM\u0010NR\u0017\u0010\u0015\u001a\u00020\u00138\u0007¢\u0006\f\n\u0004\bO\u0010H\u001a\u0004\bP\u0010NR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0001X\u0080\u0004¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u0018\u0010X\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0011\u0010\\\u001a\u00020Y8F¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u0011\u0010_\u001a\u00020U8G¢\u0006\u0006\u001a\u0004\b]\u0010^¨\u0006`"}, d2 = {"Loc/D;", "Ljava/io/Closeable;", "Loc/B;", "request", "Loc/A;", "protocol", "", "message", "", "code", "Loc/t;", "handshake", "Loc/u;", "headers", "Loc/E;", "body", "networkResponse", "cacheResponse", "priorResponse", "", "sentRequestAtMillis", "receivedResponseAtMillis", "Ltc/c;", "exchange", "<init>", "(Loc/B;Loc/A;Ljava/lang/String;ILoc/t;Loc/u;Loc/E;Loc/D;Loc/D;Loc/D;JJLtc/c;)V", "name", "defaultValue", "j", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Loc/D$a;", "o", "()Loc/D$a;", "", "Loc/h;", "d", "()Ljava/util/List;", "Loa/F;", "close", "()V", "toString", "()Ljava/lang/String;", "B", "Loc/B;", "t", "()Loc/B;", "C", "Loc/A;", "q", "()Loc/A;", "D", "Ljava/lang/String;", "m", "E", "I", "e", "()I", "F", "Loc/t;", "g", "()Loc/t;", "G", "Loc/u;", "l", "()Loc/u;", "H", "Loc/E;", "a", "()Loc/E;", "Loc/D;", "n", "()Loc/D;", "J", "c", "K", "p", "L", "u", "()J", "M", "s", "N", "Ltc/c;", "f", "()Ltc/c;", "Loc/d;", "O", "Loc/d;", "lazyCacheControl", "", "f1", "()Z", "isSuccessful", "b", "()Loc/d;", "cacheControl", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: oc.D, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4180D implements Closeable {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final C4178B request;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final EnumC4177A protocol;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata and from toString */
    private final String message;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata and from toString */
    private final int code;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final t handshake;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private final u headers;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private final E body;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private final C4180D networkResponse;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private final C4180D cacheResponse;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private final C4180D priorResponse;

    /* renamed from: L, reason: collision with root package name and from kotlin metadata */
    private final long sentRequestAtMillis;

    /* renamed from: M, reason: collision with root package name and from kotlin metadata */
    private final long receivedResponseAtMillis;

    /* renamed from: N, reason: collision with root package name and from kotlin metadata */
    private final tc.c exchange;

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private C4184d lazyCacheControl;

    public C4180D(C4178B request, EnumC4177A protocol, String message, int i10, t tVar, u headers, E e10, C4180D c4180d, C4180D c4180d2, C4180D c4180d3, long j10, long j11, tc.c cVar) {
        C3862t.g(request, "request");
        C3862t.g(protocol, "protocol");
        C3862t.g(message, "message");
        C3862t.g(headers, "headers");
        this.request = request;
        this.protocol = protocol;
        this.message = message;
        this.code = i10;
        this.handshake = tVar;
        this.headers = headers;
        this.body = e10;
        this.networkResponse = c4180d;
        this.cacheResponse = c4180d2;
        this.priorResponse = c4180d3;
        this.sentRequestAtMillis = j10;
        this.receivedResponseAtMillis = j11;
        this.exchange = cVar;
    }

    public static /* synthetic */ String k(C4180D c4180d, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return c4180d.j(str, str2);
    }

    /* renamed from: a, reason: from getter */
    public final E getBody() {
        return this.body;
    }

    public final C4184d b() {
        C4184d c4184d = this.lazyCacheControl;
        if (c4184d != null) {
            return c4184d;
        }
        C4184d c4184dB = C4184d.INSTANCE.b(this.headers);
        this.lazyCacheControl = c4184dB;
        return c4184dB;
    }

    /* renamed from: c, reason: from getter */
    public final C4180D getCacheResponse() {
        return this.cacheResponse;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        E e10 = this.body;
        if (e10 == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        e10.close();
    }

    public final List<h> d() {
        String str;
        u uVar = this.headers;
        int i10 = this.code;
        if (i10 == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i10 != 407) {
                return kotlin.collections.r.m();
            }
            str = "Proxy-Authenticate";
        }
        return uc.e.a(uVar, str);
    }

    /* renamed from: e, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* renamed from: f, reason: from getter */
    public final tc.c getExchange() {
        return this.exchange;
    }

    public final boolean f1() {
        int i10 = this.code;
        return 200 <= i10 && i10 < 300;
    }

    /* renamed from: g, reason: from getter */
    public final t getHandshake() {
        return this.handshake;
    }

    public final String j(String name, String defaultValue) {
        C3862t.g(name, "name");
        String strC = this.headers.c(name);
        return strC == null ? defaultValue : strC;
    }

    /* renamed from: l, reason: from getter */
    public final u getHeaders() {
        return this.headers;
    }

    /* renamed from: m, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: n, reason: from getter */
    public final C4180D getNetworkResponse() {
        return this.networkResponse;
    }

    public final a o() {
        return new a(this);
    }

    /* renamed from: p, reason: from getter */
    public final C4180D getPriorResponse() {
        return this.priorResponse;
    }

    /* renamed from: q, reason: from getter */
    public final EnumC4177A getProtocol() {
        return this.protocol;
    }

    /* renamed from: s, reason: from getter */
    public final long getReceivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    /* renamed from: t, reason: from getter */
    public final C4178B getRequest() {
        return this.request;
    }

    public String toString() {
        return "Response{protocol=" + this.protocol + ", code=" + this.code + ", message=" + this.message + ", url=" + this.request.getUrl() + '}';
    }

    /* renamed from: u, reason: from getter */
    public final long getSentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    /* compiled from: Response.kt */
    @Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J!\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0006J\u0017\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010!\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0007H\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0007H\u0016¢\u0006\u0004\b#\u0010\"J\u0017\u0010&\u001a\u00020\u00002\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0019\u0010*\u001a\u00020\u00002\b\u0010)\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b*\u0010+J\u0019\u0010-\u001a\u00020\u00002\b\u0010,\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b-\u0010.J\u0019\u00100\u001a\u00020\u00002\b\u0010/\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b0\u0010.J\u0019\u00102\u001a\u00020\u00002\b\u00101\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b2\u0010.J\u0017\u00105\u001a\u00020\u00002\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u00020\u00002\u0006\u00107\u001a\u000203H\u0016¢\u0006\u0004\b8\u00106J\u0017\u0010;\u001a\u00020\t2\u0006\u0010:\u001a\u000209H\u0000¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u0004H\u0016¢\u0006\u0004\b=\u0010>R$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010\u0016\u001a\u00020\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR$\u0010\u0019\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR$\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010%\u001a\u00020X8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R$\u0010)\u001a\u0004\u0018\u00010(8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR$\u0010,\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bJ\u0010c\u001a\u0004\bd\u0010>\"\u0004\be\u0010\u0006R$\u0010/\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010c\u001a\u0004\bf\u0010>\"\u0004\bg\u0010\u0006R$\u00101\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010c\u001a\u0004\bh\u0010>\"\u0004\bi\u0010\u0006R\"\u00104\u001a\u0002038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b&\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\"\u00107\u001a\u0002038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b;\u0010j\u001a\u0004\bo\u0010l\"\u0004\bp\u0010nR$\u0010u\u001a\u0004\u0018\u0001098\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010<¨\u0006v"}, d2 = {"Loc/D$a;", "", "<init>", "()V", "Loc/D;", "response", "(Loc/D;)V", "", "name", "Loa/F;", "f", "(Ljava/lang/String;Loc/D;)V", "e", "Loc/B;", "request", "r", "(Loc/B;)Loc/D$a;", "Loc/A;", "protocol", "p", "(Loc/A;)Loc/D$a;", "", "code", "g", "(I)Loc/D$a;", "message", "m", "(Ljava/lang/String;)Loc/D$a;", "Loc/t;", "handshake", "i", "(Loc/t;)Loc/D$a;", "value", "j", "(Ljava/lang/String;Ljava/lang/String;)Loc/D$a;", "a", "Loc/u;", "headers", "k", "(Loc/u;)Loc/D$a;", "Loc/E;", "body", "b", "(Loc/E;)Loc/D$a;", "networkResponse", "n", "(Loc/D;)Loc/D$a;", "cacheResponse", "d", "priorResponse", "o", "", "sentRequestAtMillis", "s", "(J)Loc/D$a;", "receivedResponseAtMillis", "q", "Ltc/c;", "deferredTrailers", "l", "(Ltc/c;)V", "c", "()Loc/D;", "Loc/B;", "getRequest$okhttp", "()Loc/B;", "setRequest$okhttp", "(Loc/B;)V", "Loc/A;", "getProtocol$okhttp", "()Loc/A;", "setProtocol$okhttp", "(Loc/A;)V", "I", "h", "()I", "setCode$okhttp", "(I)V", "Ljava/lang/String;", "getMessage$okhttp", "()Ljava/lang/String;", "setMessage$okhttp", "(Ljava/lang/String;)V", "Loc/t;", "getHandshake$okhttp", "()Loc/t;", "setHandshake$okhttp", "(Loc/t;)V", "Loc/u$a;", "Loc/u$a;", "getHeaders$okhttp", "()Loc/u$a;", "setHeaders$okhttp", "(Loc/u$a;)V", "Loc/E;", "getBody$okhttp", "()Loc/E;", "setBody$okhttp", "(Loc/E;)V", "Loc/D;", "getNetworkResponse$okhttp", "setNetworkResponse$okhttp", "getCacheResponse$okhttp", "setCacheResponse$okhttp", "getPriorResponse$okhttp", "setPriorResponse$okhttp", "J", "getSentRequestAtMillis$okhttp", "()J", "setSentRequestAtMillis$okhttp", "(J)V", "getReceivedResponseAtMillis$okhttp", "setReceivedResponseAtMillis$okhttp", "Ltc/c;", "getExchange$okhttp", "()Ltc/c;", "setExchange$okhttp", "exchange", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: oc.D$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private C4178B request;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private EnumC4177A protocol;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int code;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private String message;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private t handshake;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private u.a headers;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private E body;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private C4180D networkResponse;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private C4180D cacheResponse;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private C4180D priorResponse;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        private long sentRequestAtMillis;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        private long receivedResponseAtMillis;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata */
        private tc.c exchange;

        public a() {
            this.code = -1;
            this.headers = new u.a();
        }

        private final void e(C4180D response) {
            if (response != null && response.getBody() != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        private final void f(String name, C4180D response) {
            if (response != null) {
                if (response.getBody() != null) {
                    throw new IllegalArgumentException((name + ".body != null").toString());
                }
                if (response.getNetworkResponse() != null) {
                    throw new IllegalArgumentException((name + ".networkResponse != null").toString());
                }
                if (response.getCacheResponse() != null) {
                    throw new IllegalArgumentException((name + ".cacheResponse != null").toString());
                }
                if (response.getPriorResponse() == null) {
                    return;
                }
                throw new IllegalArgumentException((name + ".priorResponse != null").toString());
            }
        }

        public a a(String name, String value) {
            C3862t.g(name, "name");
            C3862t.g(value, "value");
            this.headers.a(name, value);
            return this;
        }

        public a b(E body) {
            this.body = body;
            return this;
        }

        public C4180D c() {
            int i10 = this.code;
            if (i10 < 0) {
                throw new IllegalStateException(("code < 0: " + this.code).toString());
            }
            C4178B c4178b = this.request;
            if (c4178b == null) {
                throw new IllegalStateException("request == null");
            }
            EnumC4177A enumC4177A = this.protocol;
            if (enumC4177A == null) {
                throw new IllegalStateException("protocol == null");
            }
            String str = this.message;
            if (str != null) {
                return new C4180D(c4178b, enumC4177A, str, i10, this.handshake, this.headers.e(), this.body, this.networkResponse, this.cacheResponse, this.priorResponse, this.sentRequestAtMillis, this.receivedResponseAtMillis, this.exchange);
            }
            throw new IllegalStateException("message == null");
        }

        public a d(C4180D cacheResponse) {
            f("cacheResponse", cacheResponse);
            this.cacheResponse = cacheResponse;
            return this;
        }

        public a g(int code) {
            this.code = code;
            return this;
        }

        /* renamed from: h, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        public a i(t handshake) {
            this.handshake = handshake;
            return this;
        }

        public a j(String name, String value) {
            C3862t.g(name, "name");
            C3862t.g(value, "value");
            this.headers.i(name, value);
            return this;
        }

        public a k(u headers) {
            C3862t.g(headers, "headers");
            this.headers = headers.i();
            return this;
        }

        public final void l(tc.c deferredTrailers) {
            C3862t.g(deferredTrailers, "deferredTrailers");
            this.exchange = deferredTrailers;
        }

        public a m(String message) {
            C3862t.g(message, "message");
            this.message = message;
            return this;
        }

        public a n(C4180D networkResponse) {
            f("networkResponse", networkResponse);
            this.networkResponse = networkResponse;
            return this;
        }

        public a o(C4180D priorResponse) {
            e(priorResponse);
            this.priorResponse = priorResponse;
            return this;
        }

        public a p(EnumC4177A protocol) {
            C3862t.g(protocol, "protocol");
            this.protocol = protocol;
            return this;
        }

        public a q(long receivedResponseAtMillis) {
            this.receivedResponseAtMillis = receivedResponseAtMillis;
            return this;
        }

        public a r(C4178B request) {
            C3862t.g(request, "request");
            this.request = request;
            return this;
        }

        public a s(long sentRequestAtMillis) {
            this.sentRequestAtMillis = sentRequestAtMillis;
            return this;
        }

        public a(C4180D response) {
            C3862t.g(response, "response");
            this.code = -1;
            this.request = response.getRequest();
            this.protocol = response.getProtocol();
            this.code = response.getCode();
            this.message = response.getMessage();
            this.handshake = response.getHandshake();
            this.headers = response.getHeaders().i();
            this.body = response.getBody();
            this.networkResponse = response.getNetworkResponse();
            this.cacheResponse = response.getCacheResponse();
            this.priorResponse = response.getPriorResponse();
            this.sentRequestAtMillis = response.getSentRequestAtMillis();
            this.receivedResponseAtMillis = response.getReceivedResponseAtMillis();
            this.exchange = response.getExchange();
        }
    }
}
