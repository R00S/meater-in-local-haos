package io.sentry;

import io.sentry.AbstractC9375c4;
import io.sentry.EnumC9587s4;
import io.sentry.protocol.C9551j;
import io.sentry.protocol.C9557p;
import io.sentry.protocol.C9558q;
import io.sentry.protocol.C9564w;
import io.sentry.util.C9638i;
import io.sentry.vendor.gson.stream.EnumC9666b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: SentryEvent.java */
/* renamed from: io.sentry.l4 */
/* loaded from: classes2.dex */
public final class C9506l4 extends AbstractC9375c4 implements InterfaceC9578r2 {

    /* renamed from: A */
    private String f36451A;

    /* renamed from: B */
    private List<String> f36452B;

    /* renamed from: C */
    private Map<String, Object> f36453C;

    /* renamed from: D */
    private Map<String, String> f36454D;

    /* renamed from: u */
    private Date f36455u;

    /* renamed from: v */
    private C9551j f36456v;

    /* renamed from: w */
    private String f36457w;

    /* renamed from: x */
    private C9376c5<C9564w> f36458x;

    /* renamed from: y */
    private C9376c5<C9557p> f36459y;

    /* renamed from: z */
    private EnumC9587s4 f36460z;

    /* compiled from: SentryEvent.java */
    /* renamed from: io.sentry.l4$a */
    public static final class a implements InterfaceC9504l2<C9506l4> {
        @Override // io.sentry.InterfaceC9504l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9506l4 mo30683a(C9518n2 c9518n2, InterfaceC9670w1 interfaceC9670w1) throws Exception {
            String strM31879B;
            c9518n2.m31884b();
            C9506l4 c9506l4 = new C9506l4();
            AbstractC9375c4.a aVar = new AbstractC9375c4.a();
            ConcurrentHashMap concurrentHashMap = null;
            while (c9518n2.m31882N() == EnumC9666b.NAME) {
                strM31879B = c9518n2.m31879B();
                strM31879B.hashCode();
                switch (strM31879B) {
                    case "fingerprint":
                        List list = (List) c9518n2.m31088K0();
                        if (list == null) {
                            break;
                        } else {
                            c9506l4.f36452B = list;
                            break;
                        }
                    case "threads":
                        c9518n2.m31884b();
                        c9518n2.m31879B();
                        c9506l4.f36458x = new C9376c5(c9518n2.m31085F0(interfaceC9670w1, new C9564w.a()));
                        c9518n2.m31889j();
                        break;
                    case "logger":
                        c9506l4.f36457w = c9518n2.m31090N0();
                        break;
                    case "timestamp":
                        Date dateM31094q0 = c9518n2.m31094q0(interfaceC9670w1);
                        if (dateM31094q0 == null) {
                            break;
                        } else {
                            c9506l4.f36455u = dateM31094q0;
                            break;
                        }
                    case "level":
                        c9506l4.f36460z = (EnumC9587s4) c9518n2.m31089M0(interfaceC9670w1, new EnumC9587s4.a());
                        break;
                    case "message":
                        c9506l4.f36456v = (C9551j) c9518n2.m31089M0(interfaceC9670w1, new C9551j.a());
                        break;
                    case "modules":
                        c9506l4.f36454D = C9638i.m31767b((Map) c9518n2.m31088K0());
                        break;
                    case "exception":
                        c9518n2.m31884b();
                        c9518n2.m31879B();
                        c9506l4.f36459y = new C9376c5(c9518n2.m31085F0(interfaceC9670w1, new C9557p.a()));
                        c9518n2.m31889j();
                        break;
                    case "transaction":
                        c9506l4.f36451A = c9518n2.m31090N0();
                        break;
                    default:
                        if (!aVar.m30604a(c9506l4, strM31879B, c9518n2, interfaceC9670w1)) {
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            c9518n2.m31092R0(interfaceC9670w1, concurrentHashMap, strM31879B);
                            break;
                        } else {
                            break;
                        }
                }
            }
            c9506l4.m30999F0(concurrentHashMap);
            c9518n2.m31889j();
            return c9506l4;
        }
    }

    C9506l4(C9558q c9558q, Date date) {
        super(c9558q);
        this.f36455u = date;
    }

    /* renamed from: A0 */
    public void m30994A0(C9551j c9551j) {
        this.f36456v = c9551j;
    }

    /* renamed from: B0 */
    public void m30995B0(Map<String, String> map) {
        this.f36454D = C9638i.m31768c(map);
    }

    /* renamed from: C0 */
    public void m30996C0(List<C9564w> list) {
        this.f36458x = new C9376c5<>(list);
    }

    /* renamed from: D0 */
    public void m30997D0(Date date) {
        this.f36455u = date;
    }

    /* renamed from: E0 */
    public void m30998E0(String str) {
        this.f36451A = str;
    }

    /* renamed from: F0 */
    public void m30999F0(Map<String, Object> map) {
        this.f36453C = map;
    }

    /* renamed from: o0 */
    public List<C9557p> m31000o0() {
        C9376c5<C9557p> c9376c5 = this.f36459y;
        if (c9376c5 == null) {
            return null;
        }
        return c9376c5.m30606a();
    }

    /* renamed from: p0 */
    public List<String> m31001p0() {
        return this.f36452B;
    }

    /* renamed from: q0 */
    public EnumC9587s4 m31002q0() {
        return this.f36460z;
    }

    /* renamed from: r0 */
    Map<String, String> m31003r0() {
        return this.f36454D;
    }

    /* renamed from: s0 */
    public List<C9564w> m31004s0() {
        C9376c5<C9564w> c9376c5 = this.f36458x;
        if (c9376c5 != null) {
            return c9376c5.m30606a();
        }
        return null;
    }

    @Override // io.sentry.InterfaceC9578r2
    public void serialize(InterfaceC9448h3 interfaceC9448h3, InterfaceC9670w1 interfaceC9670w1) throws IOException {
        interfaceC9448h3.mo30823f();
        interfaceC9448h3.mo30828k("timestamp").mo30824g(interfaceC9670w1, this.f36455u);
        if (this.f36456v != null) {
            interfaceC9448h3.mo30828k("message").mo30824g(interfaceC9670w1, this.f36456v);
        }
        if (this.f36457w != null) {
            interfaceC9448h3.mo30828k("logger").mo30819b(this.f36457w);
        }
        C9376c5<C9564w> c9376c5 = this.f36458x;
        if (c9376c5 != null && !c9376c5.m30606a().isEmpty()) {
            interfaceC9448h3.mo30828k("threads");
            interfaceC9448h3.mo30823f();
            interfaceC9448h3.mo30828k("values").mo30824g(interfaceC9670w1, this.f36458x.m30606a());
            interfaceC9448h3.mo30821d();
        }
        C9376c5<C9557p> c9376c52 = this.f36459y;
        if (c9376c52 != null && !c9376c52.m30606a().isEmpty()) {
            interfaceC9448h3.mo30828k("exception");
            interfaceC9448h3.mo30823f();
            interfaceC9448h3.mo30828k("values").mo30824g(interfaceC9670w1, this.f36459y.m30606a());
            interfaceC9448h3.mo30821d();
        }
        if (this.f36460z != null) {
            interfaceC9448h3.mo30828k("level").mo30824g(interfaceC9670w1, this.f36460z);
        }
        if (this.f36451A != null) {
            interfaceC9448h3.mo30828k("transaction").mo30819b(this.f36451A);
        }
        if (this.f36452B != null) {
            interfaceC9448h3.mo30828k("fingerprint").mo30824g(interfaceC9670w1, this.f36452B);
        }
        if (this.f36454D != null) {
            interfaceC9448h3.mo30828k("modules").mo30824g(interfaceC9670w1, this.f36454D);
        }
        new AbstractC9375c4.b().m30605a(this, interfaceC9448h3, interfaceC9670w1);
        Map<String, Object> map = this.f36453C;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f36453C.get(str);
                interfaceC9448h3.mo30828k(str);
                interfaceC9448h3.mo30824g(interfaceC9670w1, obj);
            }
        }
        interfaceC9448h3.mo30821d();
    }

    /* renamed from: t0 */
    public String m31005t0() {
        return this.f36451A;
    }

    /* renamed from: u0 */
    public C9557p m31006u0() {
        C9376c5<C9557p> c9376c5 = this.f36459y;
        if (c9376c5 == null) {
            return null;
        }
        for (C9557p c9557p : c9376c5.m30606a()) {
            if (c9557p.m31441g() != null && c9557p.m31441g().m31370h() != null && !c9557p.m31441g().m31370h().booleanValue()) {
                return c9557p;
            }
        }
        return null;
    }

    /* renamed from: v0 */
    public boolean m31007v0() {
        return m31006u0() != null;
    }

    /* renamed from: w0 */
    public boolean m31008w0() {
        C9376c5<C9557p> c9376c5 = this.f36459y;
        return (c9376c5 == null || c9376c5.m30606a().isEmpty()) ? false : true;
    }

    /* renamed from: x0 */
    public void m31009x0(List<C9557p> list) {
        this.f36459y = new C9376c5<>(list);
    }

    /* renamed from: y0 */
    public void m31010y0(List<String> list) {
        this.f36452B = list != null ? new ArrayList(list) : null;
    }

    /* renamed from: z0 */
    public void m31011z0(EnumC9587s4 enumC9587s4) {
        this.f36460z = enumC9587s4;
    }

    public C9506l4(Throwable th) {
        this();
        this.f36196o = th;
    }

    public C9506l4() {
        this(new C9558q(), C9244a1.m30008c());
    }
}
