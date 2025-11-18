package io.sentry;

import io.sentry.C9528o5;
import io.sentry.protocol.C9556o;
import io.sentry.protocol.C9558q;
import io.sentry.vendor.gson.stream.EnumC9666b;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: SentryEnvelopeHeader.java */
@ApiStatus.Internal
/* renamed from: io.sentry.i4 */
/* loaded from: classes2.dex */
public final class C9473i4 implements InterfaceC9578r2 {

    /* renamed from: f */
    private final C9558q f36355f;

    /* renamed from: g */
    private final C9556o f36356g;

    /* renamed from: h */
    private final C9528o5 f36357h;

    /* renamed from: i */
    private Date f36358i;

    /* renamed from: j */
    private Map<String, Object> f36359j;

    /* compiled from: SentryEnvelopeHeader.java */
    /* renamed from: io.sentry.i4$a */
    public static final class a implements InterfaceC9504l2<C9473i4> {
        @Override // io.sentry.InterfaceC9504l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9473i4 mo30683a(C9518n2 c9518n2, InterfaceC9670w1 interfaceC9670w1) throws Exception {
            String strM31879B;
            c9518n2.m31884b();
            C9558q c9558q = null;
            C9556o c9556o = null;
            C9528o5 c9528o5 = null;
            Date dateM31094q0 = null;
            HashMap map = null;
            while (c9518n2.m31882N() == EnumC9666b.NAME) {
                strM31879B = c9518n2.m31879B();
                strM31879B.hashCode();
                switch (strM31879B) {
                    case "sdk":
                        c9556o = (C9556o) c9518n2.m31089M0(interfaceC9670w1, new C9556o.a());
                        break;
                    case "trace":
                        c9528o5 = (C9528o5) c9518n2.m31089M0(interfaceC9670w1, new C9528o5.b());
                        break;
                    case "event_id":
                        c9558q = (C9558q) c9518n2.m31089M0(interfaceC9670w1, new C9558q.a());
                        break;
                    case "sent_at":
                        dateM31094q0 = c9518n2.m31094q0(interfaceC9670w1);
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        c9518n2.m31092R0(interfaceC9670w1, map, strM31879B);
                        break;
                }
            }
            C9473i4 c9473i4 = new C9473i4(c9558q, c9556o, c9528o5);
            c9473i4.m30852d(dateM31094q0);
            c9473i4.m30853e(map);
            c9518n2.m31889j();
            return c9473i4;
        }
    }

    public C9473i4(C9558q c9558q, C9556o c9556o) {
        this(c9558q, c9556o, null);
    }

    /* renamed from: a */
    public C9558q m30849a() {
        return this.f36355f;
    }

    /* renamed from: b */
    public C9556o m30850b() {
        return this.f36356g;
    }

    /* renamed from: c */
    public C9528o5 m30851c() {
        return this.f36357h;
    }

    /* renamed from: d */
    public void m30852d(Date date) {
        this.f36358i = date;
    }

    /* renamed from: e */
    public void m30853e(Map<String, Object> map) {
        this.f36359j = map;
    }

    @Override // io.sentry.InterfaceC9578r2
    public void serialize(InterfaceC9448h3 interfaceC9448h3, InterfaceC9670w1 interfaceC9670w1) throws IOException {
        interfaceC9448h3.mo30823f();
        if (this.f36355f != null) {
            interfaceC9448h3.mo30828k("event_id").mo30824g(interfaceC9670w1, this.f36355f);
        }
        if (this.f36356g != null) {
            interfaceC9448h3.mo30828k("sdk").mo30824g(interfaceC9670w1, this.f36356g);
        }
        if (this.f36357h != null) {
            interfaceC9448h3.mo30828k("trace").mo30824g(interfaceC9670w1, this.f36357h);
        }
        if (this.f36358i != null) {
            interfaceC9448h3.mo30828k("sent_at").mo30824g(interfaceC9670w1, C9244a1.m30012g(this.f36358i));
        }
        Map<String, Object> map = this.f36359j;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f36359j.get(str);
                interfaceC9448h3.mo30828k(str);
                interfaceC9448h3.mo30824g(interfaceC9670w1, obj);
            }
        }
        interfaceC9448h3.mo30821d();
    }

    public C9473i4(C9558q c9558q, C9556o c9556o, C9528o5 c9528o5) {
        this.f36355f = c9558q;
        this.f36356g = c9556o;
        this.f36357h = c9528o5;
    }

    public C9473i4(C9558q c9558q) {
        this(c9558q, null);
    }

    public C9473i4() {
        this(new C9558q());
    }
}
