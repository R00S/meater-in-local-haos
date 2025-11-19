package uc;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oc.C4178B;
import oc.C4180D;
import oc.InterfaceC4185e;
import oc.w;

/* compiled from: RealInterceptorChain.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011JM\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0003\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0003\u0010\u0017J\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\f\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0018R\u001a\u0010\r\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b%\u0010\u0015R\u001a\u0010\u000e\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010!\u001a\u0004\b(\u0010\u0015R\u001a\u0010\u000f\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010!\u001a\u0004\b)\u0010\u0015R\u0016\u0010*\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010!¨\u0006+"}, d2 = {"Luc/g;", "Loc/w$a;", "Ltc/e;", "call", "", "Loc/w;", "interceptors", "", "index", "Ltc/c;", "exchange", "Loc/B;", "request", "connectTimeoutMillis", "readTimeoutMillis", "writeTimeoutMillis", "<init>", "(Ltc/e;Ljava/util/List;ILtc/c;Loc/B;III)V", "b", "(ILtc/c;Loc/B;III)Luc/g;", "j", "()I", "Loc/e;", "()Loc/e;", "()Loc/B;", "Loc/D;", "a", "(Loc/B;)Loc/D;", "Ltc/e;", "d", "()Ltc/e;", "Ljava/util/List;", "c", "I", "Ltc/c;", "f", "()Ltc/c;", "e", "Loc/B;", "h", "g", "i", "calls", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g implements w.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final tc.e call;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<w> interceptors;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int index;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final tc.c exchange;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final C4178B request;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int connectTimeoutMillis;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int readTimeoutMillis;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int writeTimeoutMillis;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int calls;

    /* JADX WARN: Multi-variable type inference failed */
    public g(tc.e call, List<? extends w> interceptors, int i10, tc.c cVar, C4178B request, int i11, int i12, int i13) {
        C3862t.g(call, "call");
        C3862t.g(interceptors, "interceptors");
        C3862t.g(request, "request");
        this.call = call;
        this.interceptors = interceptors;
        this.index = i10;
        this.exchange = cVar;
        this.request = request;
        this.connectTimeoutMillis = i11;
        this.readTimeoutMillis = i12;
        this.writeTimeoutMillis = i13;
    }

    public static /* synthetic */ g c(g gVar, int i10, tc.c cVar, C4178B c4178b, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = gVar.index;
        }
        if ((i14 & 2) != 0) {
            cVar = gVar.exchange;
        }
        tc.c cVar2 = cVar;
        if ((i14 & 4) != 0) {
            c4178b = gVar.request;
        }
        C4178B c4178b2 = c4178b;
        if ((i14 & 8) != 0) {
            i11 = gVar.connectTimeoutMillis;
        }
        int i15 = i11;
        if ((i14 & 16) != 0) {
            i12 = gVar.readTimeoutMillis;
        }
        int i16 = i12;
        if ((i14 & 32) != 0) {
            i13 = gVar.writeTimeoutMillis;
        }
        return gVar.b(i10, cVar2, c4178b2, i15, i16, i13);
    }

    @Override // oc.w.a
    public C4180D a(C4178B request) {
        C3862t.g(request, "request");
        if (this.index >= this.interceptors.size()) {
            throw new IllegalStateException("Check failed.");
        }
        this.calls++;
        tc.c cVar = this.exchange;
        if (cVar != null) {
            if (!cVar.getFinder().g(request.getUrl())) {
                throw new IllegalStateException(("network interceptor " + this.interceptors.get(this.index - 1) + " must retain the same host and port").toString());
            }
            if (this.calls != 1) {
                throw new IllegalStateException(("network interceptor " + this.interceptors.get(this.index - 1) + " must call proceed() exactly once").toString());
            }
        }
        g gVarC = c(this, this.index + 1, null, request, 0, 0, 0, 58, null);
        w wVar = this.interceptors.get(this.index);
        C4180D c4180dA = wVar.a(gVarC);
        if (c4180dA == null) {
            throw new NullPointerException("interceptor " + wVar + " returned null");
        }
        if (this.exchange != null && this.index + 1 < this.interceptors.size() && gVarC.calls != 1) {
            throw new IllegalStateException(("network interceptor " + wVar + " must call proceed() exactly once").toString());
        }
        if (c4180dA.getBody() != null) {
            return c4180dA;
        }
        throw new IllegalStateException(("interceptor " + wVar + " returned a response with no body").toString());
    }

    public final g b(int index, tc.c exchange, C4178B request, int connectTimeoutMillis, int readTimeoutMillis, int writeTimeoutMillis) {
        C3862t.g(request, "request");
        return new g(this.call, this.interceptors, index, exchange, request, connectTimeoutMillis, readTimeoutMillis, writeTimeoutMillis);
    }

    @Override // oc.w.a
    public InterfaceC4185e call() {
        return this.call;
    }

    /* renamed from: d, reason: from getter */
    public final tc.e getCall() {
        return this.call;
    }

    /* renamed from: e, reason: from getter */
    public final int getConnectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    /* renamed from: f, reason: from getter */
    public final tc.c getExchange() {
        return this.exchange;
    }

    /* renamed from: g, reason: from getter */
    public final int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    /* renamed from: h, reason: from getter */
    public final C4178B getRequest() {
        return this.request;
    }

    /* renamed from: i, reason: from getter */
    public final int getWriteTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    public int j() {
        return this.readTimeoutMillis;
    }

    @Override // oc.w.a
    public C4178B request() {
        return this.request;
    }
}
