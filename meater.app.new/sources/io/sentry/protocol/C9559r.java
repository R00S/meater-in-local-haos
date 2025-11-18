package io.sentry.protocol;

import io.sentry.C9518n2;
import io.sentry.EnumC9587s4;
import io.sentry.InterfaceC9448h3;
import io.sentry.InterfaceC9504l2;
import io.sentry.InterfaceC9578r2;
import io.sentry.InterfaceC9670w1;
import io.sentry.util.C9646q;
import io.sentry.vendor.gson.stream.EnumC9666b;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import p024c.p052i.p059j.C0953c;

/* compiled from: SentryPackage.java */
/* renamed from: io.sentry.protocol.r */
/* loaded from: classes2.dex */
public final class C9559r implements InterfaceC9578r2 {

    /* renamed from: f */
    private String f36727f;

    /* renamed from: g */
    private String f36728g;

    /* renamed from: h */
    private Map<String, Object> f36729h;

    /* compiled from: SentryPackage.java */
    /* renamed from: io.sentry.protocol.r$a */
    public static final class a implements InterfaceC9504l2<C9559r> {
        @Override // io.sentry.InterfaceC9504l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9559r mo30683a(C9518n2 c9518n2, InterfaceC9670w1 interfaceC9670w1) throws Exception {
            c9518n2.m31884b();
            String strM31881J = null;
            String strM31881J2 = null;
            HashMap map = null;
            while (c9518n2.m31882N() == EnumC9666b.NAME) {
                String strM31879B = c9518n2.m31879B();
                strM31879B.hashCode();
                if (strM31879B.equals("name")) {
                    strM31881J = c9518n2.m31881J();
                } else if (strM31879B.equals("version")) {
                    strM31881J2 = c9518n2.m31881J();
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    c9518n2.m31092R0(interfaceC9670w1, map, strM31879B);
                }
            }
            c9518n2.m31889j();
            if (strM31881J == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"name\"");
                interfaceC9670w1.mo30213b(EnumC9587s4.ERROR, "Missing required field \"name\"", illegalStateException);
                throw illegalStateException;
            }
            if (strM31881J2 != null) {
                C9559r c9559r = new C9559r(strM31881J, strM31881J2);
                c9559r.m31454a(map);
                return c9559r;
            }
            IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"version\"");
            interfaceC9670w1.mo30213b(EnumC9587s4.ERROR, "Missing required field \"version\"", illegalStateException2);
            throw illegalStateException2;
        }
    }

    public C9559r(String str, String str2) {
        this.f36727f = (String) C9646q.m31802c(str, "name is required.");
        this.f36728g = (String) C9646q.m31802c(str2, "version is required.");
    }

    /* renamed from: a */
    public void m31454a(Map<String, Object> map) {
        this.f36729h = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9559r.class != obj.getClass()) {
            return false;
        }
        C9559r c9559r = (C9559r) obj;
        return C0953c.m6055a(this.f36727f, c9559r.f36727f) && C0953c.m6055a(this.f36728g, c9559r.f36728g);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f36727f, this.f36728g});
    }

    @Override // io.sentry.InterfaceC9578r2
    public void serialize(InterfaceC9448h3 interfaceC9448h3, InterfaceC9670w1 interfaceC9670w1) throws IOException {
        interfaceC9448h3.mo30823f();
        interfaceC9448h3.mo30828k("name").mo30819b(this.f36727f);
        interfaceC9448h3.mo30828k("version").mo30819b(this.f36728g);
        Map<String, Object> map = this.f36729h;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC9448h3.mo30828k(str).mo30824g(interfaceC9670w1, this.f36729h.get(str));
            }
        }
        interfaceC9448h3.mo30821d();
    }
}
