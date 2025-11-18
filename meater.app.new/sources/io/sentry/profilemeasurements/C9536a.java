package io.sentry.profilemeasurements;

import io.sentry.C9518n2;
import io.sentry.InterfaceC9448h3;
import io.sentry.InterfaceC9504l2;
import io.sentry.InterfaceC9578r2;
import io.sentry.InterfaceC9670w1;
import io.sentry.profilemeasurements.C9537b;
import io.sentry.util.C9646q;
import io.sentry.vendor.gson.stream.EnumC9666b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: ProfileMeasurement.java */
@ApiStatus.Internal
/* renamed from: io.sentry.profilemeasurements.a */
/* loaded from: classes2.dex */
public final class C9536a implements InterfaceC9578r2 {

    /* renamed from: f */
    private Map<String, Object> f36570f;

    /* renamed from: g */
    private String f36571g;

    /* renamed from: h */
    private Collection<C9537b> f36572h;

    /* compiled from: ProfileMeasurement.java */
    /* renamed from: io.sentry.profilemeasurements.a$a */
    public static final class a implements InterfaceC9504l2<C9536a> {
        @Override // io.sentry.InterfaceC9504l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9536a mo30683a(C9518n2 c9518n2, InterfaceC9670w1 interfaceC9670w1) throws Exception {
            c9518n2.m31884b();
            C9536a c9536a = new C9536a();
            ConcurrentHashMap concurrentHashMap = null;
            while (c9518n2.m31882N() == EnumC9666b.NAME) {
                String strM31879B = c9518n2.m31879B();
                strM31879B.hashCode();
                if (strM31879B.equals("values")) {
                    List listM31085F0 = c9518n2.m31085F0(interfaceC9670w1, new C9537b.a());
                    if (listM31085F0 != null) {
                        c9536a.f36572h = listM31085F0;
                    }
                } else if (strM31879B.equals("unit")) {
                    String strM31090N0 = c9518n2.m31090N0();
                    if (strM31090N0 != null) {
                        c9536a.f36571g = strM31090N0;
                    }
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    c9518n2.m31092R0(interfaceC9670w1, concurrentHashMap, strM31879B);
                }
            }
            c9536a.m31179c(concurrentHashMap);
            c9518n2.m31889j();
            return c9536a;
        }
    }

    public C9536a() {
        this("unknown", new ArrayList());
    }

    /* renamed from: c */
    public void m31179c(Map<String, Object> map) {
        this.f36570f = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9536a.class != obj.getClass()) {
            return false;
        }
        C9536a c9536a = (C9536a) obj;
        return C9646q.m31800a(this.f36570f, c9536a.f36570f) && this.f36571g.equals(c9536a.f36571g) && new ArrayList(this.f36572h).equals(new ArrayList(c9536a.f36572h));
    }

    public int hashCode() {
        return C9646q.m31801b(this.f36570f, this.f36571g, this.f36572h);
    }

    @Override // io.sentry.InterfaceC9578r2
    public void serialize(InterfaceC9448h3 interfaceC9448h3, InterfaceC9670w1 interfaceC9670w1) throws IOException {
        interfaceC9448h3.mo30823f();
        interfaceC9448h3.mo30828k("unit").mo30824g(interfaceC9670w1, this.f36571g);
        interfaceC9448h3.mo30828k("values").mo30824g(interfaceC9670w1, this.f36572h);
        Map<String, Object> map = this.f36570f;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f36570f.get(str);
                interfaceC9448h3.mo30828k(str);
                interfaceC9448h3.mo30824g(interfaceC9670w1, obj);
            }
        }
        interfaceC9448h3.mo30821d();
    }

    public C9536a(String str, Collection<C9537b> collection) {
        this.f36571g = str;
        this.f36572h = collection;
    }
}
