package rc;

import Ub.n;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oc.C4178B;
import oc.C4180D;
import oc.C4184d;
import oc.u;

/* compiled from: CacheStrategy.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u000e2\u00020\u0001:\u0002\b\nB\u001d\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000f"}, d2 = {"Lrc/c;", "", "Loc/B;", "networkRequest", "Loc/D;", "cacheResponse", "<init>", "(Loc/B;Loc/D;)V", "a", "Loc/B;", "b", "()Loc/B;", "Loc/D;", "()Loc/D;", "c", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C4178B networkRequest;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C4180D cacheResponse;

    /* compiled from: CacheStrategy.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lrc/c$a;", "", "<init>", "()V", "Loc/D;", "response", "Loc/B;", "request", "", "a", "(Loc/D;Loc/B;)Z", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: rc.c$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean a(oc.C4180D r5, oc.C4178B r6) {
            /*
                r4 = this;
                java.lang.String r0 = "response"
                kotlin.jvm.internal.C3862t.g(r5, r0)
                java.lang.String r0 = "request"
                kotlin.jvm.internal.C3862t.g(r6, r0)
                int r0 = r5.getCode()
                r1 = 200(0xc8, float:2.8E-43)
                r2 = 0
                if (r0 == r1) goto L65
                r1 = 410(0x19a, float:5.75E-43)
                if (r0 == r1) goto L65
                r1 = 414(0x19e, float:5.8E-43)
                if (r0 == r1) goto L65
                r1 = 501(0x1f5, float:7.02E-43)
                if (r0 == r1) goto L65
                r1 = 203(0xcb, float:2.84E-43)
                if (r0 == r1) goto L65
                r1 = 204(0xcc, float:2.86E-43)
                if (r0 == r1) goto L65
                r1 = 307(0x133, float:4.3E-43)
                if (r0 == r1) goto L3b
                r1 = 308(0x134, float:4.32E-43)
                if (r0 == r1) goto L65
                r1 = 404(0x194, float:5.66E-43)
                if (r0 == r1) goto L65
                r1 = 405(0x195, float:5.68E-43)
                if (r0 == r1) goto L65
                switch(r0) {
                    case 300: goto L65;
                    case 301: goto L65;
                    case 302: goto L3b;
                    default: goto L3a;
                }
            L3a:
                return r2
            L3b:
                java.lang.String r0 = "Expires"
                r1 = 2
                r3 = 0
                java.lang.String r0 = oc.C4180D.k(r5, r0, r3, r1, r3)
                if (r0 != 0) goto L65
                oc.d r0 = r5.b()
                int r0 = r0.getMaxAgeSeconds()
                r1 = -1
                if (r0 != r1) goto L65
                oc.d r0 = r5.b()
                boolean r0 = r0.getIsPublic()
                if (r0 != 0) goto L65
                oc.d r0 = r5.b()
                boolean r0 = r0.getIsPrivate()
                if (r0 != 0) goto L65
                return r2
            L65:
                oc.d r5 = r5.b()
                boolean r5 = r5.getNoStore()
                if (r5 != 0) goto L7a
                oc.d r5 = r6.b()
                boolean r5 = r5.getNoStore()
                if (r5 != 0) goto L7a
                r2 = 1
            L7a:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: rc.c.Companion.a(oc.D, oc.B):boolean");
        }

        private Companion() {
        }
    }

    /* compiled from: CacheStrategy.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001aR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001cR\u0018\u0010 \u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001cR\u0018\u0010#\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001fR\u0018\u0010%\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\u001cR\u0016\u0010'\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\u0016R\u0016\u0010)\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010\u0016R\u0018\u0010+\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010\u001fR\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, d2 = {"Lrc/c$b;", "", "", "nowMillis", "Loc/B;", "request", "Loc/D;", "cacheResponse", "<init>", "(JLoc/B;Loc/D;)V", "", "f", "()Z", "Lrc/c;", "c", "()Lrc/c;", "d", "()J", "a", "e", "(Loc/B;)Z", "b", "J", "Loc/B;", "getRequest$okhttp", "()Loc/B;", "Loc/D;", "Ljava/util/Date;", "Ljava/util/Date;", "servedDate", "", "Ljava/lang/String;", "servedDateString", "lastModified", "g", "lastModifiedString", "h", "expires", "i", "sentRequestMillis", "j", "receivedResponseMillis", "k", "etag", "", "l", "I", "ageSeconds", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final long nowMillis;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final C4178B request;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final C4180D cacheResponse;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private Date servedDate;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private String servedDateString;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private Date lastModified;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private String lastModifiedString;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private Date expires;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private long sentRequestMillis;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private long receivedResponseMillis;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        private String etag;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        private int ageSeconds;

        public b(long j10, C4178B request, C4180D c4180d) {
            C3862t.g(request, "request");
            this.nowMillis = j10;
            this.request = request;
            this.cacheResponse = c4180d;
            this.ageSeconds = -1;
            if (c4180d != null) {
                this.sentRequestMillis = c4180d.getSentRequestAtMillis();
                this.receivedResponseMillis = c4180d.getReceivedResponseAtMillis();
                u headers = c4180d.getHeaders();
                int size = headers.size();
                for (int i10 = 0; i10 < size; i10++) {
                    String strH = headers.h(i10);
                    String strW = headers.w(i10);
                    if (n.t(strH, "Date", true)) {
                        this.servedDate = uc.c.a(strW);
                        this.servedDateString = strW;
                    } else if (n.t(strH, "Expires", true)) {
                        this.expires = uc.c.a(strW);
                    } else if (n.t(strH, "Last-Modified", true)) {
                        this.lastModified = uc.c.a(strW);
                        this.lastModifiedString = strW;
                    } else if (n.t(strH, "ETag", true)) {
                        this.etag = strW;
                    } else if (n.t(strH, "Age", true)) {
                        this.ageSeconds = pc.d.W(strW, -1);
                    }
                }
            }
        }

        private final long a() {
            Date date = this.servedDate;
            long jMax = date != null ? Math.max(0L, this.receivedResponseMillis - date.getTime()) : 0L;
            int i10 = this.ageSeconds;
            if (i10 != -1) {
                jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i10));
            }
            long j10 = this.receivedResponseMillis;
            return jMax + (j10 - this.sentRequestMillis) + (this.nowMillis - j10);
        }

        private final c c() {
            String str;
            if (this.cacheResponse == null) {
                return new c(this.request, null);
            }
            if (this.request.g() && this.cacheResponse.getHandshake() == null) {
                return new c(this.request, null);
            }
            if (!c.INSTANCE.a(this.cacheResponse, this.request)) {
                return new c(this.request, null);
            }
            C4184d c4184dB = this.request.b();
            if (c4184dB.getNoCache() || e(this.request)) {
                return new c(this.request, null);
            }
            C4184d c4184dB2 = this.cacheResponse.b();
            long jA = a();
            long jD = d();
            if (c4184dB.getMaxAgeSeconds() != -1) {
                jD = Math.min(jD, TimeUnit.SECONDS.toMillis(c4184dB.getMaxAgeSeconds()));
            }
            long millis = 0;
            long millis2 = c4184dB.getMinFreshSeconds() != -1 ? TimeUnit.SECONDS.toMillis(c4184dB.getMinFreshSeconds()) : 0L;
            if (!c4184dB2.getMustRevalidate() && c4184dB.getMaxStaleSeconds() != -1) {
                millis = TimeUnit.SECONDS.toMillis(c4184dB.getMaxStaleSeconds());
            }
            if (!c4184dB2.getNoCache()) {
                long j10 = millis2 + jA;
                if (j10 < millis + jD) {
                    C4180D.a aVarO = this.cacheResponse.o();
                    if (j10 >= jD) {
                        aVarO.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (jA > 86400000 && f()) {
                        aVarO.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new c(null, aVarO.c());
                }
            }
            String str2 = this.etag;
            if (str2 != null) {
                str = "If-None-Match";
            } else {
                if (this.lastModified != null) {
                    str2 = this.lastModifiedString;
                } else {
                    if (this.servedDate == null) {
                        return new c(this.request, null);
                    }
                    str2 = this.servedDateString;
                }
                str = "If-Modified-Since";
            }
            u.a aVarI = this.request.getHeaders().i();
            C3862t.d(str2);
            aVarI.d(str, str2);
            return new c(this.request.i().e(aVarI.e()).b(), this.cacheResponse);
        }

        private final long d() {
            C4180D c4180d = this.cacheResponse;
            C3862t.d(c4180d);
            if (c4180d.b().getMaxAgeSeconds() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.getMaxAgeSeconds());
            }
            Date date = this.expires;
            if (date != null) {
                Date date2 = this.servedDate;
                long time = date.getTime() - (date2 != null ? date2.getTime() : this.receivedResponseMillis);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.lastModified == null || this.cacheResponse.getRequest().getUrl().p() != null) {
                return 0L;
            }
            Date date3 = this.servedDate;
            long time2 = date3 != null ? date3.getTime() : this.sentRequestMillis;
            Date date4 = this.lastModified;
            C3862t.d(date4);
            long time3 = time2 - date4.getTime();
            if (time3 > 0) {
                return time3 / 10;
            }
            return 0L;
        }

        private final boolean e(C4178B request) {
            return (request.d("If-Modified-Since") == null && request.d("If-None-Match") == null) ? false : true;
        }

        private final boolean f() {
            C4180D c4180d = this.cacheResponse;
            C3862t.d(c4180d);
            return c4180d.b().getMaxAgeSeconds() == -1 && this.expires == null;
        }

        public final c b() {
            c cVarC = c();
            return (cVarC.getNetworkRequest() == null || !this.request.b().getOnlyIfCached()) ? cVarC : new c(null, null);
        }
    }

    public c(C4178B c4178b, C4180D c4180d) {
        this.networkRequest = c4178b;
        this.cacheResponse = c4180d;
    }

    /* renamed from: a, reason: from getter */
    public final C4180D getCacheResponse() {
        return this.cacheResponse;
    }

    /* renamed from: b, reason: from getter */
    public final C4178B getNetworkRequest() {
        return this.networkRequest;
    }
}
