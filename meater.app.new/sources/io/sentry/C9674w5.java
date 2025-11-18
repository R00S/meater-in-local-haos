package io.sentry;

import io.sentry.protocol.C9558q;
import io.sentry.vendor.gson.stream.EnumC9666b;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: UserFeedback.java */
/* renamed from: io.sentry.w5 */
/* loaded from: classes2.dex */
public final class C9674w5 implements InterfaceC9578r2 {

    /* renamed from: f */
    private final C9558q f37005f;

    /* renamed from: g */
    private String f37006g;

    /* renamed from: h */
    private String f37007h;

    /* renamed from: i */
    private String f37008i;

    /* renamed from: j */
    private Map<String, Object> f37009j;

    /* compiled from: UserFeedback.java */
    /* renamed from: io.sentry.w5$a */
    public static final class a implements InterfaceC9504l2<C9674w5> {
        @Override // io.sentry.InterfaceC9504l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9674w5 mo30683a(C9518n2 c9518n2, InterfaceC9670w1 interfaceC9670w1) throws Exception {
            String strM31879B;
            c9518n2.m31884b();
            C9558q c9558qMo30683a = null;
            String strM31090N0 = null;
            String strM31090N02 = null;
            String strM31090N03 = null;
            HashMap map = null;
            while (c9518n2.m31882N() == EnumC9666b.NAME) {
                strM31879B = c9518n2.m31879B();
                strM31879B.hashCode();
                switch (strM31879B) {
                    case "comments":
                        strM31090N03 = c9518n2.m31090N0();
                        break;
                    case "name":
                        strM31090N0 = c9518n2.m31090N0();
                        break;
                    case "email":
                        strM31090N02 = c9518n2.m31090N0();
                        break;
                    case "event_id":
                        c9558qMo30683a = new C9558q.a().mo30683a(c9518n2, interfaceC9670w1);
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
            if (c9558qMo30683a != null) {
                C9674w5 c9674w5 = new C9674w5(c9558qMo30683a, strM31090N0, strM31090N02, strM31090N03);
                c9674w5.m31935a(map);
                return c9674w5;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"event_id\"");
            interfaceC9670w1.mo30213b(EnumC9587s4.ERROR, "Missing required field \"event_id\"", illegalStateException);
            throw illegalStateException;
        }
    }

    public C9674w5(C9558q c9558q, String str, String str2, String str3) {
        this.f37005f = c9558q;
        this.f37006g = str;
        this.f37007h = str2;
        this.f37008i = str3;
    }

    /* renamed from: a */
    public void m31935a(Map<String, Object> map) {
        this.f37009j = map;
    }

    @Override // io.sentry.InterfaceC9578r2
    public void serialize(InterfaceC9448h3 interfaceC9448h3, InterfaceC9670w1 interfaceC9670w1) throws IOException {
        interfaceC9448h3.mo30823f();
        interfaceC9448h3.mo30828k("event_id");
        this.f37005f.serialize(interfaceC9448h3, interfaceC9670w1);
        if (this.f37006g != null) {
            interfaceC9448h3.mo30828k("name").mo30819b(this.f37006g);
        }
        if (this.f37007h != null) {
            interfaceC9448h3.mo30828k("email").mo30819b(this.f37007h);
        }
        if (this.f37008i != null) {
            interfaceC9448h3.mo30828k("comments").mo30819b(this.f37008i);
        }
        Map<String, Object> map = this.f37009j;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC9448h3.mo30828k(str).mo30824g(interfaceC9670w1, this.f37009j.get(str));
            }
        }
        interfaceC9448h3.mo30821d();
    }

    public String toString() {
        return "UserFeedback{eventId=" + this.f37005f + ", name='" + this.f37006g + "', email='" + this.f37007h + "', comments='" + this.f37008i + "'}";
    }
}
