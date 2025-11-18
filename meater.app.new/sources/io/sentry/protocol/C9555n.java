package io.sentry.protocol;

import io.sentry.C9518n2;
import io.sentry.InterfaceC9448h3;
import io.sentry.InterfaceC9504l2;
import io.sentry.InterfaceC9578r2;
import io.sentry.InterfaceC9670w1;
import io.sentry.vendor.gson.stream.EnumC9666b;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: SdkInfo.java */
/* renamed from: io.sentry.protocol.n */
/* loaded from: classes2.dex */
public final class C9555n implements InterfaceC9578r2 {

    /* renamed from: f */
    private String f36708f;

    /* renamed from: g */
    private Integer f36709g;

    /* renamed from: h */
    private Integer f36710h;

    /* renamed from: i */
    private Integer f36711i;

    /* renamed from: j */
    private Map<String, Object> f36712j;

    /* compiled from: SdkInfo.java */
    /* renamed from: io.sentry.protocol.n$a */
    public static final class a implements InterfaceC9504l2<C9555n> {
        @Override // io.sentry.InterfaceC9504l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9555n mo30683a(C9518n2 c9518n2, InterfaceC9670w1 interfaceC9670w1) throws Exception {
            String strM31879B;
            C9555n c9555n = new C9555n();
            c9518n2.m31884b();
            HashMap map = null;
            while (c9518n2.m31882N() == EnumC9666b.NAME) {
                strM31879B = c9518n2.m31879B();
                strM31879B.hashCode();
                switch (strM31879B) {
                    case "sdk_name":
                        c9555n.f36708f = c9518n2.m31090N0();
                        break;
                    case "version_patchlevel":
                        c9555n.f36711i = c9518n2.m31084E0();
                        break;
                    case "version_major":
                        c9555n.f36709g = c9518n2.m31084E0();
                        break;
                    case "version_minor":
                        c9555n.f36710h = c9518n2.m31084E0();
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
            c9555n.m31421e(map);
            return c9555n;
        }
    }

    /* renamed from: e */
    public void m31421e(Map<String, Object> map) {
        this.f36712j = map;
    }

    @Override // io.sentry.InterfaceC9578r2
    public void serialize(InterfaceC9448h3 interfaceC9448h3, InterfaceC9670w1 interfaceC9670w1) throws IOException {
        interfaceC9448h3.mo30823f();
        if (this.f36708f != null) {
            interfaceC9448h3.mo30828k("sdk_name").mo30819b(this.f36708f);
        }
        if (this.f36709g != null) {
            interfaceC9448h3.mo30828k("version_major").mo30822e(this.f36709g);
        }
        if (this.f36710h != null) {
            interfaceC9448h3.mo30828k("version_minor").mo30822e(this.f36710h);
        }
        if (this.f36711i != null) {
            interfaceC9448h3.mo30828k("version_patchlevel").mo30822e(this.f36711i);
        }
        Map<String, Object> map = this.f36712j;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC9448h3.mo30828k(str).mo30824g(interfaceC9670w1, this.f36712j.get(str));
            }
        }
        interfaceC9448h3.mo30821d();
    }
}
