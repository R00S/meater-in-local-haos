package io.sentry.protocol;

import io.sentry.C9518n2;
import io.sentry.InterfaceC9448h3;
import io.sentry.InterfaceC9504l2;
import io.sentry.InterfaceC9578r2;
import io.sentry.InterfaceC9670w1;
import io.sentry.protocol.C9555n;
import io.sentry.protocol.DebugImage;
import io.sentry.vendor.gson.stream.EnumC9666b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: DebugMeta.java */
/* renamed from: io.sentry.protocol.d */
/* loaded from: classes2.dex */
public final class C9545d implements InterfaceC9578r2 {

    /* renamed from: f */
    private C9555n f36615f;

    /* renamed from: g */
    private List<DebugImage> f36616g;

    /* renamed from: h */
    private Map<String, Object> f36617h;

    /* compiled from: DebugMeta.java */
    /* renamed from: io.sentry.protocol.d$a */
    public static final class a implements InterfaceC9504l2<C9545d> {
        @Override // io.sentry.InterfaceC9504l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9545d mo30683a(C9518n2 c9518n2, InterfaceC9670w1 interfaceC9670w1) throws Exception {
            C9545d c9545d = new C9545d();
            c9518n2.m31884b();
            HashMap map = null;
            while (c9518n2.m31882N() == EnumC9666b.NAME) {
                String strM31879B = c9518n2.m31879B();
                strM31879B.hashCode();
                if (strM31879B.equals("images")) {
                    c9545d.f36616g = c9518n2.m31085F0(interfaceC9670w1, new DebugImage.C9538a());
                } else if (strM31879B.equals("sdk_info")) {
                    c9545d.f36615f = (C9555n) c9518n2.m31089M0(interfaceC9670w1, new C9555n.a());
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    c9518n2.m31092R0(interfaceC9670w1, map, strM31879B);
                }
            }
            c9518n2.m31889j();
            c9545d.m31270e(map);
            return c9545d;
        }
    }

    /* renamed from: c */
    public List<DebugImage> m31268c() {
        return this.f36616g;
    }

    /* renamed from: d */
    public void m31269d(List<DebugImage> list) {
        this.f36616g = list != null ? new ArrayList(list) : null;
    }

    /* renamed from: e */
    public void m31270e(Map<String, Object> map) {
        this.f36617h = map;
    }

    @Override // io.sentry.InterfaceC9578r2
    public void serialize(InterfaceC9448h3 interfaceC9448h3, InterfaceC9670w1 interfaceC9670w1) throws IOException {
        interfaceC9448h3.mo30823f();
        if (this.f36615f != null) {
            interfaceC9448h3.mo30828k("sdk_info").mo30824g(interfaceC9670w1, this.f36615f);
        }
        if (this.f36616g != null) {
            interfaceC9448h3.mo30828k("images").mo30824g(interfaceC9670w1, this.f36616g);
        }
        Map<String, Object> map = this.f36617h;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC9448h3.mo30828k(str).mo30824g(interfaceC9670w1, this.f36617h.get(str));
            }
        }
        interfaceC9448h3.mo30821d();
    }
}
