package io.sentry;

import io.sentry.util.C9638i;
import io.sentry.util.C9646q;
import io.sentry.vendor.gson.stream.EnumC9666b;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: SentryLockReason.java */
/* renamed from: io.sentry.t4 */
/* loaded from: classes2.dex */
public final class C9594t4 implements InterfaceC9578r2 {

    /* renamed from: f */
    private int f36851f;

    /* renamed from: g */
    private String f36852g;

    /* renamed from: h */
    private String f36853h;

    /* renamed from: i */
    private String f36854i;

    /* renamed from: j */
    private Long f36855j;

    /* renamed from: k */
    private Map<String, Object> f36856k;

    /* compiled from: SentryLockReason.java */
    /* renamed from: io.sentry.t4$a */
    public static final class a implements InterfaceC9504l2<C9594t4> {
        @Override // io.sentry.InterfaceC9504l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9594t4 mo30683a(C9518n2 c9518n2, InterfaceC9670w1 interfaceC9670w1) throws Exception {
            String strM31879B;
            C9594t4 c9594t4 = new C9594t4();
            c9518n2.m31884b();
            ConcurrentHashMap concurrentHashMap = null;
            while (c9518n2.m31882N() == EnumC9666b.NAME) {
                strM31879B = c9518n2.m31879B();
                strM31879B.hashCode();
                switch (strM31879B) {
                    case "package_name":
                        c9594t4.f36853h = c9518n2.m31090N0();
                        break;
                    case "thread_id":
                        c9594t4.f36855j = c9518n2.m31086G0();
                        break;
                    case "address":
                        c9594t4.f36852g = c9518n2.m31090N0();
                        break;
                    case "class_name":
                        c9594t4.f36854i = c9518n2.m31090N0();
                        break;
                    case "type":
                        c9594t4.f36851f = c9518n2.m31894z();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c9518n2.m31092R0(interfaceC9670w1, concurrentHashMap, strM31879B);
                        break;
                }
            }
            c9594t4.m31648m(concurrentHashMap);
            c9518n2.m31889j();
            return c9594t4;
        }
    }

    public C9594t4() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9594t4.class != obj.getClass()) {
            return false;
        }
        return C9646q.m31800a(this.f36852g, ((C9594t4) obj).f36852g);
    }

    /* renamed from: f */
    public String m31641f() {
        return this.f36852g;
    }

    /* renamed from: g */
    public int m31642g() {
        return this.f36851f;
    }

    /* renamed from: h */
    public void m31643h(String str) {
        this.f36852g = str;
    }

    public int hashCode() {
        return C9646q.m31801b(this.f36852g);
    }

    /* renamed from: i */
    public void m31644i(String str) {
        this.f36854i = str;
    }

    /* renamed from: j */
    public void m31645j(String str) {
        this.f36853h = str;
    }

    /* renamed from: k */
    public void m31646k(Long l) {
        this.f36855j = l;
    }

    /* renamed from: l */
    public void m31647l(int i2) {
        this.f36851f = i2;
    }

    /* renamed from: m */
    public void m31648m(Map<String, Object> map) {
        this.f36856k = map;
    }

    @Override // io.sentry.InterfaceC9578r2
    public void serialize(InterfaceC9448h3 interfaceC9448h3, InterfaceC9670w1 interfaceC9670w1) throws IOException {
        interfaceC9448h3.mo30823f();
        interfaceC9448h3.mo30828k("type").mo30818a(this.f36851f);
        if (this.f36852g != null) {
            interfaceC9448h3.mo30828k("address").mo30819b(this.f36852g);
        }
        if (this.f36853h != null) {
            interfaceC9448h3.mo30828k("package_name").mo30819b(this.f36853h);
        }
        if (this.f36854i != null) {
            interfaceC9448h3.mo30828k("class_name").mo30819b(this.f36854i);
        }
        if (this.f36855j != null) {
            interfaceC9448h3.mo30828k("thread_id").mo30822e(this.f36855j);
        }
        Map<String, Object> map = this.f36856k;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f36856k.get(str);
                interfaceC9448h3.mo30828k(str);
                interfaceC9448h3.mo30824g(interfaceC9670w1, obj);
            }
        }
        interfaceC9448h3.mo30821d();
    }

    public C9594t4(C9594t4 c9594t4) {
        this.f36851f = c9594t4.f36851f;
        this.f36852g = c9594t4.f36852g;
        this.f36853h = c9594t4.f36853h;
        this.f36854i = c9594t4.f36854i;
        this.f36855j = c9594t4.f36855j;
        this.f36856k = C9638i.m31767b(c9594t4.f36856k);
    }
}
