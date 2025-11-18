package io.sentry.protocol;

import io.sentry.C9518n2;
import io.sentry.EnumC9587s4;
import io.sentry.InterfaceC9448h3;
import io.sentry.InterfaceC9504l2;
import io.sentry.InterfaceC9578r2;
import io.sentry.InterfaceC9670w1;
import io.sentry.vendor.gson.stream.EnumC9666b;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: MeasurementValue.java */
@ApiStatus.Internal
/* renamed from: io.sentry.protocol.h */
/* loaded from: classes2.dex */
public final class C9549h implements InterfaceC9578r2 {

    /* renamed from: f */
    private final Number f36667f;

    /* renamed from: g */
    private final String f36668g;

    /* renamed from: h */
    private Map<String, Object> f36669h;

    /* compiled from: MeasurementValue.java */
    /* renamed from: io.sentry.protocol.h$a */
    public static final class a implements InterfaceC9504l2<C9549h> {
        @Override // io.sentry.InterfaceC9504l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9549h mo30683a(C9518n2 c9518n2, InterfaceC9670w1 interfaceC9670w1) throws Exception {
            c9518n2.m31884b();
            Number number = null;
            String strM31090N0 = null;
            ConcurrentHashMap concurrentHashMap = null;
            while (c9518n2.m31882N() == EnumC9666b.NAME) {
                String strM31879B = c9518n2.m31879B();
                strM31879B.hashCode();
                if (strM31879B.equals("unit")) {
                    strM31090N0 = c9518n2.m31090N0();
                } else if (strM31879B.equals("value")) {
                    number = (Number) c9518n2.m31088K0();
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    c9518n2.m31092R0(interfaceC9670w1, concurrentHashMap, strM31879B);
                }
            }
            c9518n2.m31889j();
            if (number != null) {
                C9549h c9549h = new C9549h(number, strM31090N0);
                c9549h.m31361a(concurrentHashMap);
                return c9549h;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"value\"");
            interfaceC9670w1.mo30213b(EnumC9587s4.ERROR, "Missing required field \"value\"", illegalStateException);
            throw illegalStateException;
        }
    }

    public C9549h(Number number, String str) {
        this.f36667f = number;
        this.f36668g = str;
    }

    /* renamed from: a */
    public void m31361a(Map<String, Object> map) {
        this.f36669h = map;
    }

    @Override // io.sentry.InterfaceC9578r2
    public void serialize(InterfaceC9448h3 interfaceC9448h3, InterfaceC9670w1 interfaceC9670w1) throws IOException {
        interfaceC9448h3.mo30823f();
        interfaceC9448h3.mo30828k("value").mo30822e(this.f36667f);
        if (this.f36668g != null) {
            interfaceC9448h3.mo30828k("unit").mo30819b(this.f36668g);
        }
        Map<String, Object> map = this.f36669h;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f36669h.get(str);
                interfaceC9448h3.mo30828k(str);
                interfaceC9448h3.mo30824g(interfaceC9670w1, obj);
            }
        }
        interfaceC9448h3.mo30821d();
    }
}
