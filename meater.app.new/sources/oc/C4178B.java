package oc;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.C3862t;
import oa.C4170o;
import oc.u;

/* compiled from: Request.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u001eBC\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0016\u0010\f\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0017\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00152\u000e\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000b¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0007¢\u0006\f\n\u0004\b\u0010\u0010)\u001a\u0004\b\u001e\u0010*R*\u0010\f\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\u0004\u0012\u00020\u00010\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010+\u001a\u0004\b%\u0010,R\u0018\u0010/\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010.R\u0011\u00103\u001a\u0002008F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0011\u00105\u001a\u00020-8G¢\u0006\u0006\u001a\u0004\b\"\u00104¨\u00066"}, d2 = {"Loc/B;", "", "Loc/v;", "url", "", "method", "Loc/u;", "headers", "Loc/C;", "body", "", "Ljava/lang/Class;", "tags", "<init>", "(Loc/v;Ljava/lang/String;Loc/u;Loc/C;Ljava/util/Map;)V", "name", "d", "(Ljava/lang/String;)Ljava/lang/String;", "", "e", "(Ljava/lang/String;)Ljava/util/List;", "T", "type", "j", "(Ljava/lang/Class;)Ljava/lang/Object;", "Loc/B$a;", "i", "()Loc/B$a;", "toString", "()Ljava/lang/String;", "a", "Loc/v;", "k", "()Loc/v;", "b", "Ljava/lang/String;", "h", "c", "Loc/u;", "f", "()Loc/u;", "Loc/C;", "()Loc/C;", "Ljava/util/Map;", "()Ljava/util/Map;", "Loc/d;", "Loc/d;", "lazyCacheControl", "", "g", "()Z", "isHttps", "()Loc/d;", "cacheControl", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: oc.B, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4178B {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v url;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String method;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final u headers;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AbstractC4179C body;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Map<Class<?>, Object> tags;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private C4184d lazyCacheControl;

    public C4178B(v url, String method, u headers, AbstractC4179C abstractC4179C, Map<Class<?>, ? extends Object> tags) {
        C3862t.g(url, "url");
        C3862t.g(method, "method");
        C3862t.g(headers, "headers");
        C3862t.g(tags, "tags");
        this.url = url;
        this.method = method;
        this.headers = headers;
        this.body = abstractC4179C;
        this.tags = tags;
    }

    /* renamed from: a, reason: from getter */
    public final AbstractC4179C getBody() {
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

    public final Map<Class<?>, Object> c() {
        return this.tags;
    }

    public final String d(String name) {
        C3862t.g(name, "name");
        return this.headers.c(name);
    }

    public final List<String> e(String name) {
        C3862t.g(name, "name");
        return this.headers.x(name);
    }

    /* renamed from: f, reason: from getter */
    public final u getHeaders() {
        return this.headers;
    }

    public final boolean g() {
        return this.url.getIsHttps();
    }

    /* renamed from: h, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    public final a i() {
        return new a(this);
    }

    public final <T> T j(Class<? extends T> type) {
        C3862t.g(type, "type");
        return type.cast(this.tags.get(type));
    }

    /* renamed from: k, reason: from getter */
    public final v getUrl() {
        return this.url;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Request{method=");
        sb2.append(this.method);
        sb2.append(", url=");
        sb2.append(this.url);
        if (this.headers.size() != 0) {
            sb2.append(", headers=[");
            int i10 = 0;
            for (C4170o<? extends String, ? extends String> c4170o : this.headers) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    kotlin.collections.r.w();
                }
                C4170o<? extends String, ? extends String> c4170o2 = c4170o;
                String strA = c4170o2.a();
                String strB = c4170o2.b();
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(strA);
                sb2.append(':');
                sb2.append(strB);
                i10 = i11;
            }
            sb2.append(']');
        }
        if (!this.tags.isEmpty()) {
            sb2.append(", tags=");
            sb2.append(this.tags);
        }
        sb2.append('}');
        String string = sb2.toString();
        C3862t.f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* compiled from: Request.kt */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010%\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\rJ\u0017\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J/\u0010%\u001a\u00020\u0000\"\u0004\b\u0000\u0010!2\u000e\u0010#\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\"2\b\u0010$\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0004H\u0016¢\u0006\u0004\b'\u0010(R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u0010\u001c\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010\u0015\u001a\u0002038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R$\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R2\u0010D\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\"\u0012\u0004\u0012\u00020\u00010>8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010C¨\u0006E"}, d2 = {"Loc/B$a;", "", "<init>", "()V", "Loc/B;", "request", "(Loc/B;)V", "Loc/v;", "url", "j", "(Loc/v;)Loc/B$a;", "", "i", "(Ljava/lang/String;)Loc/B$a;", "name", "value", "d", "(Ljava/lang/String;Ljava/lang/String;)Loc/B$a;", "a", "g", "Loc/u;", "headers", "e", "(Loc/u;)Loc/B$a;", "Loc/d;", "cacheControl", "c", "(Loc/d;)Loc/B$a;", "method", "Loc/C;", "body", "f", "(Ljava/lang/String;Loc/C;)Loc/B$a;", "T", "Ljava/lang/Class;", "type", "tag", "h", "(Ljava/lang/Class;Ljava/lang/Object;)Loc/B$a;", "b", "()Loc/B;", "Loc/v;", "getUrl$okhttp", "()Loc/v;", "setUrl$okhttp", "(Loc/v;)V", "Ljava/lang/String;", "getMethod$okhttp", "()Ljava/lang/String;", "setMethod$okhttp", "(Ljava/lang/String;)V", "Loc/u$a;", "Loc/u$a;", "getHeaders$okhttp", "()Loc/u$a;", "setHeaders$okhttp", "(Loc/u$a;)V", "Loc/C;", "getBody$okhttp", "()Loc/C;", "setBody$okhttp", "(Loc/C;)V", "", "Ljava/util/Map;", "getTags$okhttp", "()Ljava/util/Map;", "setTags$okhttp", "(Ljava/util/Map;)V", "tags", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: oc.B$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private v url;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private String method;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private u.a headers;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private AbstractC4179C body;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private Map<Class<?>, Object> tags;

        public a() {
            this.tags = new LinkedHashMap();
            this.method = "GET";
            this.headers = new u.a();
        }

        public a a(String name, String value) {
            C3862t.g(name, "name");
            C3862t.g(value, "value");
            this.headers.a(name, value);
            return this;
        }

        public C4178B b() {
            v vVar = this.url;
            if (vVar != null) {
                return new C4178B(vVar, this.method, this.headers.e(), this.body, pc.d.U(this.tags));
            }
            throw new IllegalStateException("url == null");
        }

        public a c(C4184d cacheControl) {
            C3862t.g(cacheControl, "cacheControl");
            String string = cacheControl.toString();
            return string.length() == 0 ? g("Cache-Control") : d("Cache-Control", string);
        }

        public a d(String name, String value) {
            C3862t.g(name, "name");
            C3862t.g(value, "value");
            this.headers.i(name, value);
            return this;
        }

        public a e(u headers) {
            C3862t.g(headers, "headers");
            this.headers = headers.i();
            return this;
        }

        public a f(String method, AbstractC4179C body) {
            C3862t.g(method, "method");
            if (method.length() <= 0) {
                throw new IllegalArgumentException("method.isEmpty() == true");
            }
            if (body == null) {
                if (uc.f.e(method)) {
                    throw new IllegalArgumentException(("method " + method + " must have a request body.").toString());
                }
            } else if (!uc.f.b(method)) {
                throw new IllegalArgumentException(("method " + method + " must not have a request body.").toString());
            }
            this.method = method;
            this.body = body;
            return this;
        }

        public a g(String name) {
            C3862t.g(name, "name");
            this.headers.h(name);
            return this;
        }

        public <T> a h(Class<? super T> type, T tag) {
            C3862t.g(type, "type");
            if (tag == null) {
                this.tags.remove(type);
            } else {
                if (this.tags.isEmpty()) {
                    this.tags = new LinkedHashMap();
                }
                Map<Class<?>, Object> map = this.tags;
                T tCast = type.cast(tag);
                C3862t.d(tCast);
                map.put(type, tCast);
            }
            return this;
        }

        public a i(String url) {
            C3862t.g(url, "url");
            if (Ub.n.E(url, "ws:", true)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("http:");
                String strSubstring = url.substring(3);
                C3862t.f(strSubstring, "this as java.lang.String).substring(startIndex)");
                sb2.append(strSubstring);
                url = sb2.toString();
            } else if (Ub.n.E(url, "wss:", true)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("https:");
                String strSubstring2 = url.substring(4);
                C3862t.f(strSubstring2, "this as java.lang.String).substring(startIndex)");
                sb3.append(strSubstring2);
                url = sb3.toString();
            }
            return j(v.INSTANCE.d(url));
        }

        public a j(v url) {
            C3862t.g(url, "url");
            this.url = url;
            return this;
        }

        public a(C4178B request) {
            Map<Class<?>, Object> mapT;
            C3862t.g(request, "request");
            this.tags = new LinkedHashMap();
            this.url = request.getUrl();
            this.method = request.getMethod();
            this.body = request.getBody();
            if (request.c().isEmpty()) {
                mapT = new LinkedHashMap<>();
            } else {
                mapT = M.t(request.c());
            }
            this.tags = mapT;
            this.headers = request.getHeaders().i();
        }
    }
}
