package io.sentry.protocol;

import io.sentry.C9518n2;
import io.sentry.InterfaceC9448h3;
import io.sentry.InterfaceC9504l2;
import io.sentry.InterfaceC9578r2;
import io.sentry.InterfaceC9670w1;
import io.sentry.vendor.gson.stream.EnumC9666b;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: TransactionInfo.java */
@ApiStatus.Internal
/* renamed from: io.sentry.protocol.y */
/* loaded from: classes2.dex */
public final class C9566y implements InterfaceC9578r2 {

    /* renamed from: f */
    private final String f36787f;

    /* renamed from: g */
    private Map<String, Object> f36788g;

    /* compiled from: TransactionInfo.java */
    /* renamed from: io.sentry.protocol.y$a */
    public static final class a implements InterfaceC9504l2<C9566y> {
        @Override // io.sentry.InterfaceC9504l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9566y mo30683a(C9518n2 c9518n2, InterfaceC9670w1 interfaceC9670w1) throws Exception {
            c9518n2.m31884b();
            String strM31090N0 = null;
            ConcurrentHashMap concurrentHashMap = null;
            while (c9518n2.m31882N() == EnumC9666b.NAME) {
                String strM31879B = c9518n2.m31879B();
                strM31879B.hashCode();
                if (strM31879B.equals("source")) {
                    strM31090N0 = c9518n2.m31090N0();
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    c9518n2.m31092R0(interfaceC9670w1, concurrentHashMap, strM31879B);
                }
            }
            C9566y c9566y = new C9566y(strM31090N0);
            c9566y.m31546a(concurrentHashMap);
            c9518n2.m31889j();
            return c9566y;
        }
    }

    public C9566y(String str) {
        this.f36787f = str;
    }

    /* renamed from: a */
    public void m31546a(Map<String, Object> map) {
        this.f36788g = map;
    }

    @Override // io.sentry.InterfaceC9578r2
    public void serialize(InterfaceC9448h3 interfaceC9448h3, InterfaceC9670w1 interfaceC9670w1) throws IOException {
        interfaceC9448h3.mo30823f();
        if (this.f36787f != null) {
            interfaceC9448h3.mo30828k("source").mo30824g(interfaceC9670w1, this.f36787f);
        }
        Map<String, Object> map = this.f36788g;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f36788g.get(str);
                interfaceC9448h3.mo30828k(str);
                interfaceC9448h3.mo30824g(interfaceC9670w1, obj);
            }
        }
        interfaceC9448h3.mo30821d();
    }
}
