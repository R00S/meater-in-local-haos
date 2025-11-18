package io.sentry;

import io.sentry.protocol.C9540a0;
import java.io.IOException;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: Session.java */
/* renamed from: io.sentry.d5 */
/* loaded from: classes2.dex */
public final class C9422d5 implements InterfaceC9578r2 {

    /* renamed from: f */
    private final Date f36269f;

    /* renamed from: g */
    private Date f36270g;

    /* renamed from: h */
    private final AtomicInteger f36271h;

    /* renamed from: i */
    private final String f36272i;

    /* renamed from: j */
    private final UUID f36273j;

    /* renamed from: k */
    private Boolean f36274k;

    /* renamed from: l */
    private b f36275l;

    /* renamed from: m */
    private Long f36276m;

    /* renamed from: n */
    private Double f36277n;

    /* renamed from: o */
    private final String f36278o;

    /* renamed from: p */
    private String f36279p;

    /* renamed from: q */
    private final String f36280q;

    /* renamed from: r */
    private final String f36281r;

    /* renamed from: s */
    private String f36282s;

    /* renamed from: t */
    private final Object f36283t;

    /* renamed from: u */
    private Map<String, Object> f36284u;

    /* compiled from: Session.java */
    /* renamed from: io.sentry.d5$a */
    public static final class a implements InterfaceC9504l2<C9422d5> {
        /* renamed from: c */
        private Exception m30754c(String str, InterfaceC9670w1 interfaceC9670w1) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            interfaceC9670w1.mo30213b(EnumC9587s4.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:62:0x00fc  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0049  */
        @Override // io.sentry.InterfaceC9504l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public io.sentry.C9422d5 mo30683a(io.sentry.C9518n2 r28, io.sentry.InterfaceC9670w1 r29) throws java.lang.Exception {
            /*
                Method dump skipped, instructions count: 620
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.sentry.C9422d5.a.mo30683a(io.sentry.n2, io.sentry.w1):io.sentry.d5");
        }
    }

    /* compiled from: Session.java */
    /* renamed from: io.sentry.d5$b */
    public enum b {
        Ok,
        Exited,
        Crashed,
        Abnormal
    }

    public C9422d5(b bVar, Date date, Date date2, int i2, String str, UUID uuid, Boolean bool, Long l, Double d2, String str2, String str3, String str4, String str5, String str6) {
        this.f36283t = new Object();
        this.f36275l = bVar;
        this.f36269f = date;
        this.f36270g = date2;
        this.f36271h = new AtomicInteger(i2);
        this.f36272i = str;
        this.f36273j = uuid;
        this.f36274k = bool;
        this.f36276m = l;
        this.f36277n = d2;
        this.f36278o = str2;
        this.f36279p = str3;
        this.f36280q = str4;
        this.f36281r = str5;
        this.f36282s = str6;
    }

    /* renamed from: a */
    private double m30737a(Date date) {
        double dAbs = Math.abs(date.getTime() - this.f36269f.getTime());
        Double.isNaN(dAbs);
        return dAbs / 1000.0d;
    }

    /* renamed from: i */
    private long m30738i(Date date) {
        long time = date.getTime();
        return time < 0 ? Math.abs(time) : time;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C9422d5 clone() {
        return new C9422d5(this.f36275l, this.f36269f, this.f36270g, this.f36271h.get(), this.f36272i, this.f36273j, this.f36274k, this.f36276m, this.f36277n, this.f36278o, this.f36279p, this.f36280q, this.f36281r, this.f36282s);
    }

    /* renamed from: c */
    public void m30740c() {
        m30741d(C9244a1.m30008c());
    }

    /* renamed from: d */
    public void m30741d(Date date) {
        synchronized (this.f36283t) {
            this.f36274k = null;
            if (this.f36275l == b.Ok) {
                this.f36275l = b.Exited;
            }
            if (date != null) {
                this.f36270g = date;
            } else {
                this.f36270g = C9244a1.m30008c();
            }
            Date date2 = this.f36270g;
            if (date2 != null) {
                this.f36277n = Double.valueOf(m30737a(date2));
                this.f36276m = Long.valueOf(m30738i(this.f36270g));
            }
        }
    }

    /* renamed from: e */
    public int m30742e() {
        return this.f36271h.get();
    }

    /* renamed from: f */
    public String m30743f() {
        return this.f36282s;
    }

    /* renamed from: g */
    public Boolean m30744g() {
        return this.f36274k;
    }

    /* renamed from: h */
    public String m30745h() {
        return this.f36281r;
    }

    /* renamed from: j */
    public UUID m30746j() {
        return this.f36273j;
    }

    /* renamed from: k */
    public Date m30747k() {
        Date date = this.f36269f;
        if (date == null) {
            return null;
        }
        return (Date) date.clone();
    }

    /* renamed from: l */
    public b m30748l() {
        return this.f36275l;
    }

    /* renamed from: m */
    public boolean m30749m() {
        return this.f36275l != b.Ok;
    }

    @ApiStatus.Internal
    /* renamed from: n */
    public void m30750n() {
        this.f36274k = Boolean.TRUE;
    }

    /* renamed from: o */
    public void m30751o(Map<String, Object> map) {
        this.f36284u = map;
    }

    /* renamed from: p */
    public boolean m30752p(b bVar, String str, boolean z) {
        return m30753q(bVar, str, z, null);
    }

    /* renamed from: q */
    public boolean m30753q(b bVar, String str, boolean z, String str2) {
        boolean z2;
        synchronized (this.f36283t) {
            boolean z3 = false;
            z2 = true;
            if (bVar != null) {
                try {
                    this.f36275l = bVar;
                    z3 = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (str != null) {
                this.f36279p = str;
                z3 = true;
            }
            if (z) {
                this.f36271h.addAndGet(1);
                z3 = true;
            }
            if (str2 != null) {
                this.f36282s = str2;
            } else {
                z2 = z3;
            }
            if (z2) {
                this.f36274k = null;
                Date dateM30008c = C9244a1.m30008c();
                this.f36270g = dateM30008c;
                if (dateM30008c != null) {
                    this.f36276m = Long.valueOf(m30738i(dateM30008c));
                }
            }
        }
        return z2;
    }

    @Override // io.sentry.InterfaceC9578r2
    public void serialize(InterfaceC9448h3 interfaceC9448h3, InterfaceC9670w1 interfaceC9670w1) throws IOException {
        interfaceC9448h3.mo30823f();
        if (this.f36273j != null) {
            interfaceC9448h3.mo30828k("sid").mo30819b(this.f36273j.toString());
        }
        if (this.f36272i != null) {
            interfaceC9448h3.mo30828k("did").mo30819b(this.f36272i);
        }
        if (this.f36274k != null) {
            interfaceC9448h3.mo30828k("init").mo30825h(this.f36274k);
        }
        interfaceC9448h3.mo30828k("started").mo30824g(interfaceC9670w1, this.f36269f);
        interfaceC9448h3.mo30828k("status").mo30824g(interfaceC9670w1, this.f36275l.name().toLowerCase(Locale.ROOT));
        if (this.f36276m != null) {
            interfaceC9448h3.mo30828k("seq").mo30822e(this.f36276m);
        }
        interfaceC9448h3.mo30828k("errors").mo30818a(this.f36271h.intValue());
        if (this.f36277n != null) {
            interfaceC9448h3.mo30828k("duration").mo30822e(this.f36277n);
        }
        if (this.f36270g != null) {
            interfaceC9448h3.mo30828k("timestamp").mo30824g(interfaceC9670w1, this.f36270g);
        }
        if (this.f36282s != null) {
            interfaceC9448h3.mo30828k("abnormal_mechanism").mo30824g(interfaceC9670w1, this.f36282s);
        }
        interfaceC9448h3.mo30828k("attrs");
        interfaceC9448h3.mo30823f();
        interfaceC9448h3.mo30828k("release").mo30824g(interfaceC9670w1, this.f36281r);
        if (this.f36280q != null) {
            interfaceC9448h3.mo30828k("environment").mo30824g(interfaceC9670w1, this.f36280q);
        }
        if (this.f36278o != null) {
            interfaceC9448h3.mo30828k("ip_address").mo30824g(interfaceC9670w1, this.f36278o);
        }
        if (this.f36279p != null) {
            interfaceC9448h3.mo30828k("user_agent").mo30824g(interfaceC9670w1, this.f36279p);
        }
        interfaceC9448h3.mo30821d();
        Map<String, Object> map = this.f36284u;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f36284u.get(str);
                interfaceC9448h3.mo30828k(str);
                interfaceC9448h3.mo30824g(interfaceC9670w1, obj);
            }
        }
        interfaceC9448h3.mo30821d();
    }

    public C9422d5(String str, C9540a0 c9540a0, String str2, String str3) {
        this(b.Ok, C9244a1.m30008c(), C9244a1.m30008c(), 0, str, UUID.randomUUID(), Boolean.TRUE, null, null, c9540a0 != null ? c9540a0.m31217l() : null, null, str2, str3, null);
    }
}
