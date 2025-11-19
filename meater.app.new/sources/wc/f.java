package wc;

import Cc.B;
import Cc.C;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oc.C4178B;
import oc.C4180D;
import oc.EnumC4177A;
import oc.u;
import oc.z;

/* compiled from: Http2ExchangeCodec.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 #2\u00020\u0001:\u0001\u0011B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0013H\u0016¢\u0006\u0004\b%\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010*R\u0018\u0010-\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010,R\u0014\u00100\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010/R\u0016\u00102\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u00101¨\u00063"}, d2 = {"Lwc/f;", "Luc/d;", "Loc/z;", "client", "Ltc/f;", "connection", "Luc/g;", "chain", "Lwc/e;", "http2Connection", "<init>", "(Loc/z;Ltc/f;Luc/g;Lwc/e;)V", "Loc/B;", "request", "", "contentLength", "LCc/z;", "a", "(Loc/B;J)LCc/z;", "Loa/F;", "h", "(Loc/B;)V", "e", "()V", "b", "", "expectContinue", "Loc/D$a;", "c", "(Z)Loc/D$a;", "Loc/D;", "response", "f", "(Loc/D;)J", "LCc/B;", "g", "(Loc/D;)LCc/B;", "cancel", "Ltc/f;", "d", "()Ltc/f;", "Luc/g;", "Lwc/e;", "Lwc/h;", "Lwc/h;", "stream", "Loc/A;", "Loc/A;", "protocol", "Z", "canceled", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements uc.d {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: h, reason: collision with root package name */
    private static final List<String> f52147h = pc.d.w("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: i, reason: collision with root package name */
    private static final List<String> f52148i = pc.d.w("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final tc.f connection;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final uc.g chain;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final e http2Connection;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private volatile h stream;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final EnumC4177A protocol;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private volatile boolean canceled;

    /* compiled from: Http2ExchangeCodec.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0013R\u0014\u0010\u001b\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0013R\u0014\u0010\u001c\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0013R\u0014\u0010\u001d\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0013¨\u0006\u001e"}, d2 = {"Lwc/f$a;", "", "<init>", "()V", "Loc/B;", "request", "", "Lwc/b;", "a", "(Loc/B;)Ljava/util/List;", "Loc/u;", "headerBlock", "Loc/A;", "protocol", "Loc/D$a;", "b", "(Loc/u;Loc/A;)Loc/D$a;", "", "CONNECTION", "Ljava/lang/String;", "ENCODING", "HOST", "HTTP_2_SKIPPED_REQUEST_HEADERS", "Ljava/util/List;", "HTTP_2_SKIPPED_RESPONSE_HEADERS", "KEEP_ALIVE", "PROXY_CONNECTION", "TE", "TRANSFER_ENCODING", "UPGRADE", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: wc.f$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final List<b> a(C4178B request) {
            C3862t.g(request, "request");
            u headers = request.getHeaders();
            ArrayList arrayList = new ArrayList(headers.size() + 4);
            arrayList.add(new b(b.f52036g, request.getMethod()));
            arrayList.add(new b(b.f52037h, uc.i.f50550a.c(request.getUrl())));
            String strD = request.d("Host");
            if (strD != null) {
                arrayList.add(new b(b.f52039j, strD));
            }
            arrayList.add(new b(b.f52038i, request.getUrl().getScheme()));
            int size = headers.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strH = headers.h(i10);
                Locale US = Locale.US;
                C3862t.f(US, "US");
                String lowerCase = strH.toLowerCase(US);
                C3862t.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (!f.f52147h.contains(lowerCase) || (C3862t.b(lowerCase, "te") && C3862t.b(headers.w(i10), "trailers"))) {
                    arrayList.add(new b(lowerCase, headers.w(i10)));
                }
            }
            return arrayList;
        }

        public final C4180D.a b(u headerBlock, EnumC4177A protocol) throws ProtocolException, NumberFormatException {
            C3862t.g(headerBlock, "headerBlock");
            C3862t.g(protocol, "protocol");
            u.a aVar = new u.a();
            int size = headerBlock.size();
            uc.k kVarA = null;
            for (int i10 = 0; i10 < size; i10++) {
                String strH = headerBlock.h(i10);
                String strW = headerBlock.w(i10);
                if (C3862t.b(strH, ":status")) {
                    kVarA = uc.k.INSTANCE.a("HTTP/1.1 " + strW);
                } else if (!f.f52148i.contains(strH)) {
                    aVar.d(strH, strW);
                }
            }
            if (kVarA != null) {
                return new C4180D.a().p(protocol).g(kVarA.code).m(kVarA.message).k(aVar.e());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }

        private Companion() {
        }
    }

    public f(z client, tc.f connection, uc.g chain, e http2Connection) {
        C3862t.g(client, "client");
        C3862t.g(connection, "connection");
        C3862t.g(chain, "chain");
        C3862t.g(http2Connection, "http2Connection");
        this.connection = connection;
        this.chain = chain;
        this.http2Connection = http2Connection;
        List<EnumC4177A> listB = client.B();
        EnumC4177A enumC4177A = EnumC4177A.H2_PRIOR_KNOWLEDGE;
        this.protocol = listB.contains(enumC4177A) ? enumC4177A : EnumC4177A.HTTP_2;
    }

    @Override // uc.d
    public Cc.z a(C4178B request, long contentLength) {
        C3862t.g(request, "request");
        h hVar = this.stream;
        C3862t.d(hVar);
        return hVar.n();
    }

    @Override // uc.d
    public void b() {
        h hVar = this.stream;
        C3862t.d(hVar);
        hVar.n().close();
    }

    @Override // uc.d
    public C4180D.a c(boolean expectContinue) throws NumberFormatException, IOException {
        h hVar = this.stream;
        if (hVar == null) {
            throw new IOException("stream wasn't created");
        }
        C4180D.a aVarB = INSTANCE.b(hVar.C(), this.protocol);
        if (expectContinue && aVarB.getCode() == 100) {
            return null;
        }
        return aVarB;
    }

    @Override // uc.d
    public void cancel() {
        this.canceled = true;
        h hVar = this.stream;
        if (hVar != null) {
            hVar.f(a.CANCEL);
        }
    }

    @Override // uc.d
    /* renamed from: d, reason: from getter */
    public tc.f getConnection() {
        return this.connection;
    }

    @Override // uc.d
    public void e() {
        this.http2Connection.flush();
    }

    @Override // uc.d
    public long f(C4180D response) {
        C3862t.g(response, "response");
        if (uc.e.b(response)) {
            return pc.d.v(response);
        }
        return 0L;
    }

    @Override // uc.d
    public B g(C4180D response) {
        C3862t.g(response, "response");
        h hVar = this.stream;
        C3862t.d(hVar);
        return hVar.getSource();
    }

    @Override // uc.d
    public void h(C4178B request) throws IOException {
        C3862t.g(request, "request");
        if (this.stream != null) {
            return;
        }
        this.stream = this.http2Connection.i0(INSTANCE.a(request), request.getBody() != null);
        if (this.canceled) {
            h hVar = this.stream;
            C3862t.d(hVar);
            hVar.f(a.CANCEL);
            throw new IOException("Canceled");
        }
        h hVar2 = this.stream;
        C3862t.d(hVar2);
        C cV = hVar2.v();
        long readTimeoutMillis = this.chain.getReadTimeoutMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        cV.g(readTimeoutMillis, timeUnit);
        h hVar3 = this.stream;
        C3862t.d(hVar3);
        hVar3.E().g(this.chain.getWriteTimeoutMillis(), timeUnit);
    }
}
