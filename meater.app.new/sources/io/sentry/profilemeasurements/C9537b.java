package io.sentry.profilemeasurements;

import io.sentry.C9518n2;
import io.sentry.InterfaceC9448h3;
import io.sentry.InterfaceC9504l2;
import io.sentry.InterfaceC9578r2;
import io.sentry.InterfaceC9670w1;
import io.sentry.util.C9646q;
import io.sentry.vendor.gson.stream.EnumC9666b;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: ProfileMeasurementValue.java */
@ApiStatus.Internal
/* renamed from: io.sentry.profilemeasurements.b */
/* loaded from: classes2.dex */
public final class C9537b implements InterfaceC9578r2 {

    /* renamed from: f */
    private Map<String, Object> f36573f;

    /* renamed from: g */
    private String f36574g;

    /* renamed from: h */
    private double f36575h;

    /* compiled from: ProfileMeasurementValue.java */
    /* renamed from: io.sentry.profilemeasurements.b$a */
    public static final class a implements InterfaceC9504l2<C9537b> {
        @Override // io.sentry.InterfaceC9504l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9537b mo30683a(C9518n2 c9518n2, InterfaceC9670w1 interfaceC9670w1) throws Exception {
            c9518n2.m31884b();
            C9537b c9537b = new C9537b();
            ConcurrentHashMap concurrentHashMap = null;
            while (c9518n2.m31882N() == EnumC9666b.NAME) {
                String strM31879B = c9518n2.m31879B();
                strM31879B.hashCode();
                if (strM31879B.equals("elapsed_since_start_ns")) {
                    String strM31090N0 = c9518n2.m31090N0();
                    if (strM31090N0 != null) {
                        c9537b.f36574g = strM31090N0;
                    }
                } else if (strM31879B.equals("value")) {
                    Double dM31095t0 = c9518n2.m31095t0();
                    if (dM31095t0 != null) {
                        c9537b.f36575h = dM31095t0.doubleValue();
                    }
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    c9518n2.m31092R0(interfaceC9670w1, concurrentHashMap, strM31879B);
                }
            }
            c9537b.m31183c(concurrentHashMap);
            c9518n2.m31889j();
            return c9537b;
        }
    }

    public C9537b() {
        this(0L, 0);
    }

    /* renamed from: c */
    public void m31183c(Map<String, Object> map) {
        this.f36573f = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9537b.class != obj.getClass()) {
            return false;
        }
        C9537b c9537b = (C9537b) obj;
        return C9646q.m31800a(this.f36573f, c9537b.f36573f) && this.f36574g.equals(c9537b.f36574g) && this.f36575h == c9537b.f36575h;
    }

    public int hashCode() {
        return C9646q.m31801b(this.f36573f, this.f36574g, Double.valueOf(this.f36575h));
    }

    @Override // io.sentry.InterfaceC9578r2
    public void serialize(InterfaceC9448h3 interfaceC9448h3, InterfaceC9670w1 interfaceC9670w1) throws IOException {
        interfaceC9448h3.mo30823f();
        interfaceC9448h3.mo30828k("value").mo30824g(interfaceC9670w1, Double.valueOf(this.f36575h));
        interfaceC9448h3.mo30828k("elapsed_since_start_ns").mo30824g(interfaceC9670w1, this.f36574g);
        Map<String, Object> map = this.f36573f;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f36573f.get(str);
                interfaceC9448h3.mo30828k(str);
                interfaceC9448h3.mo30824g(interfaceC9670w1, obj);
            }
        }
        interfaceC9448h3.mo30821d();
    }

    public C9537b(Long l, Number number) {
        this.f36574g = l.toString();
        this.f36575h = number.doubleValue();
    }
}
