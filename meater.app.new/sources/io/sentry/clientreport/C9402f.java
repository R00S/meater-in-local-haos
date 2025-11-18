package io.sentry.clientreport;

import io.sentry.C9518n2;
import io.sentry.EnumC9587s4;
import io.sentry.InterfaceC9448h3;
import io.sentry.InterfaceC9504l2;
import io.sentry.InterfaceC9578r2;
import io.sentry.InterfaceC9670w1;
import io.sentry.vendor.gson.stream.EnumC9666b;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: DiscardedEvent.java */
@ApiStatus.Internal
/* renamed from: io.sentry.clientreport.f */
/* loaded from: classes2.dex */
public final class C9402f implements InterfaceC9578r2 {

    /* renamed from: f */
    private final String f36247f;

    /* renamed from: g */
    private final String f36248g;

    /* renamed from: h */
    private final Long f36249h;

    /* renamed from: i */
    private Map<String, Object> f36250i;

    /* compiled from: DiscardedEvent.java */
    /* renamed from: io.sentry.clientreport.f$a */
    public static final class a implements InterfaceC9504l2<C9402f> {
        /* renamed from: c */
        private Exception m30699c(String str, InterfaceC9670w1 interfaceC9670w1) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            interfaceC9670w1.mo30213b(EnumC9587s4.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        @Override // io.sentry.InterfaceC9504l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9402f mo30683a(C9518n2 c9518n2, InterfaceC9670w1 interfaceC9670w1) throws Exception {
            String strM31879B;
            c9518n2.m31884b();
            String strM31090N0 = null;
            String strM31090N02 = null;
            Long lM31086G0 = null;
            HashMap map = null;
            while (c9518n2.m31882N() == EnumC9666b.NAME) {
                strM31879B = c9518n2.m31879B();
                strM31879B.hashCode();
                switch (strM31879B) {
                    case "quantity":
                        lM31086G0 = c9518n2.m31086G0();
                        break;
                    case "reason":
                        strM31090N0 = c9518n2.m31090N0();
                        break;
                    case "category":
                        strM31090N02 = c9518n2.m31090N0();
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        c9518n2.m31092R0(interfaceC9670w1, map, strM31879B);
                        break;
                }
            }
            c9518n2.m31889j();
            if (strM31090N0 == null) {
                throw m30699c("reason", interfaceC9670w1);
            }
            if (strM31090N02 == null) {
                throw m30699c("category", interfaceC9670w1);
            }
            if (lM31086G0 == null) {
                throw m30699c("quantity", interfaceC9670w1);
            }
            C9402f c9402f = new C9402f(strM31090N0, strM31090N02, lM31086G0);
            c9402f.m30698d(map);
            return c9402f;
        }
    }

    public C9402f(String str, String str2, Long l) {
        this.f36247f = str;
        this.f36248g = str2;
        this.f36249h = l;
    }

    /* renamed from: a */
    public String m30695a() {
        return this.f36248g;
    }

    /* renamed from: b */
    public Long m30696b() {
        return this.f36249h;
    }

    /* renamed from: c */
    public String m30697c() {
        return this.f36247f;
    }

    /* renamed from: d */
    public void m30698d(Map<String, Object> map) {
        this.f36250i = map;
    }

    @Override // io.sentry.InterfaceC9578r2
    public void serialize(InterfaceC9448h3 interfaceC9448h3, InterfaceC9670w1 interfaceC9670w1) throws IOException {
        interfaceC9448h3.mo30823f();
        interfaceC9448h3.mo30828k("reason").mo30819b(this.f36247f);
        interfaceC9448h3.mo30828k("category").mo30819b(this.f36248g);
        interfaceC9448h3.mo30828k("quantity").mo30822e(this.f36249h);
        Map<String, Object> map = this.f36250i;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC9448h3.mo30828k(str).mo30824g(interfaceC9670w1, this.f36250i.get(str));
            }
        }
        interfaceC9448h3.mo30821d();
    }

    public String toString() {
        return "DiscardedEvent{reason='" + this.f36247f + "', category='" + this.f36248g + "', quantity=" + this.f36249h + '}';
    }
}
