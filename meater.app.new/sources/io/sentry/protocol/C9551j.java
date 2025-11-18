package io.sentry.protocol;

import io.sentry.C9518n2;
import io.sentry.InterfaceC9448h3;
import io.sentry.InterfaceC9504l2;
import io.sentry.InterfaceC9578r2;
import io.sentry.InterfaceC9670w1;
import io.sentry.vendor.gson.stream.EnumC9666b;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Message.java */
/* renamed from: io.sentry.protocol.j */
/* loaded from: classes2.dex */
public final class C9551j implements InterfaceC9578r2 {

    /* renamed from: f */
    private String f36679f;

    /* renamed from: g */
    private String f36680g;

    /* renamed from: h */
    private List<String> f36681h;

    /* renamed from: i */
    private Map<String, Object> f36682i;

    /* compiled from: Message.java */
    /* renamed from: io.sentry.protocol.j$a */
    public static final class a implements InterfaceC9504l2<C9551j> {
        @Override // io.sentry.InterfaceC9504l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9551j mo30683a(C9518n2 c9518n2, InterfaceC9670w1 interfaceC9670w1) throws Exception {
            String strM31879B;
            c9518n2.m31884b();
            C9551j c9551j = new C9551j();
            ConcurrentHashMap concurrentHashMap = null;
            while (c9518n2.m31882N() == EnumC9666b.NAME) {
                strM31879B = c9518n2.m31879B();
                strM31879B.hashCode();
                switch (strM31879B) {
                    case "params":
                        List list = (List) c9518n2.m31088K0();
                        if (list == null) {
                            break;
                        } else {
                            c9551j.f36681h = list;
                            break;
                        }
                    case "message":
                        c9551j.f36680g = c9518n2.m31090N0();
                        break;
                    case "formatted":
                        c9551j.f36679f = c9518n2.m31090N0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c9518n2.m31092R0(interfaceC9670w1, concurrentHashMap, strM31879B);
                        break;
                }
            }
            c9551j.m31380f(concurrentHashMap);
            c9518n2.m31889j();
            return c9551j;
        }
    }

    /* renamed from: d */
    public void m31378d(String str) {
        this.f36679f = str;
    }

    /* renamed from: e */
    public void m31379e(String str) {
        this.f36680g = str;
    }

    /* renamed from: f */
    public void m31380f(Map<String, Object> map) {
        this.f36682i = map;
    }

    @Override // io.sentry.InterfaceC9578r2
    public void serialize(InterfaceC9448h3 interfaceC9448h3, InterfaceC9670w1 interfaceC9670w1) throws IOException {
        interfaceC9448h3.mo30823f();
        if (this.f36679f != null) {
            interfaceC9448h3.mo30828k("formatted").mo30819b(this.f36679f);
        }
        if (this.f36680g != null) {
            interfaceC9448h3.mo30828k("message").mo30819b(this.f36680g);
        }
        List<String> list = this.f36681h;
        if (list != null && !list.isEmpty()) {
            interfaceC9448h3.mo30828k("params").mo30824g(interfaceC9670w1, this.f36681h);
        }
        Map<String, Object> map = this.f36682i;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f36682i.get(str);
                interfaceC9448h3.mo30828k(str);
                interfaceC9448h3.mo30824g(interfaceC9670w1, obj);
            }
        }
        interfaceC9448h3.mo30821d();
    }
}
