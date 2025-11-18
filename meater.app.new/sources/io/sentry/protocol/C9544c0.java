package io.sentry.protocol;

import cm.aptoide.p092pt.store.view.StoreTabGridRecyclerFragment;
import io.sentry.C9518n2;
import io.sentry.InterfaceC9448h3;
import io.sentry.InterfaceC9504l2;
import io.sentry.InterfaceC9578r2;
import io.sentry.InterfaceC9670w1;
import io.sentry.vendor.gson.stream.EnumC9666b;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ViewHierarchyNode.java */
/* renamed from: io.sentry.protocol.c0 */
/* loaded from: classes2.dex */
public final class C9544c0 implements InterfaceC9578r2 {

    /* renamed from: f */
    private String f36603f;

    /* renamed from: g */
    private String f36604g;

    /* renamed from: h */
    private String f36605h;

    /* renamed from: i */
    private String f36606i;

    /* renamed from: j */
    private Double f36607j;

    /* renamed from: k */
    private Double f36608k;

    /* renamed from: l */
    private Double f36609l;

    /* renamed from: m */
    private Double f36610m;

    /* renamed from: n */
    private String f36611n;

    /* renamed from: o */
    private Double f36612o;

    /* renamed from: p */
    private List<C9544c0> f36613p;

    /* renamed from: q */
    private Map<String, Object> f36614q;

    /* compiled from: ViewHierarchyNode.java */
    /* renamed from: io.sentry.protocol.c0$a */
    public static final class a implements InterfaceC9504l2<C9544c0> {
        @Override // io.sentry.InterfaceC9504l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9544c0 mo30683a(C9518n2 c9518n2, InterfaceC9670w1 interfaceC9670w1) throws Exception {
            String strM31879B;
            C9544c0 c9544c0 = new C9544c0();
            c9518n2.m31884b();
            HashMap map = null;
            while (c9518n2.m31882N() == EnumC9666b.NAME) {
                strM31879B = c9518n2.m31879B();
                strM31879B.hashCode();
                switch (strM31879B) {
                    case "rendering_system":
                        c9544c0.f36603f = c9518n2.m31090N0();
                        break;
                    case "identifier":
                        c9544c0.f36605h = c9518n2.m31090N0();
                        break;
                    case "height":
                        c9544c0.f36608k = c9518n2.m31095t0();
                        break;
                    case "x":
                        c9544c0.f36609l = c9518n2.m31095t0();
                        break;
                    case "y":
                        c9544c0.f36610m = c9518n2.m31095t0();
                        break;
                    case "tag":
                        c9544c0.f36606i = c9518n2.m31090N0();
                        break;
                    case "type":
                        c9544c0.f36604g = c9518n2.m31090N0();
                        break;
                    case "alpha":
                        c9544c0.f36612o = c9518n2.m31095t0();
                        break;
                    case "width":
                        c9544c0.f36607j = c9518n2.m31095t0();
                        break;
                    case "children":
                        c9544c0.f36613p = c9518n2.m31085F0(interfaceC9670w1, this);
                        break;
                    case "visibility":
                        c9544c0.f36611n = c9518n2.m31090N0();
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
            c9544c0.m31260q(map);
            return c9544c0;
        }
    }

    /* renamed from: l */
    public void m31255l(Double d2) {
        this.f36612o = d2;
    }

    /* renamed from: m */
    public void m31256m(List<C9544c0> list) {
        this.f36613p = list;
    }

    /* renamed from: n */
    public void m31257n(Double d2) {
        this.f36608k = d2;
    }

    /* renamed from: o */
    public void m31258o(String str) {
        this.f36605h = str;
    }

    /* renamed from: p */
    public void m31259p(String str) {
        this.f36604g = str;
    }

    /* renamed from: q */
    public void m31260q(Map<String, Object> map) {
        this.f36614q = map;
    }

    /* renamed from: r */
    public void m31261r(String str) {
        this.f36611n = str;
    }

    /* renamed from: s */
    public void m31262s(Double d2) {
        this.f36607j = d2;
    }

    @Override // io.sentry.InterfaceC9578r2
    public void serialize(InterfaceC9448h3 interfaceC9448h3, InterfaceC9670w1 interfaceC9670w1) throws IOException {
        interfaceC9448h3.mo30823f();
        if (this.f36603f != null) {
            interfaceC9448h3.mo30828k("rendering_system").mo30819b(this.f36603f);
        }
        if (this.f36604g != null) {
            interfaceC9448h3.mo30828k("type").mo30819b(this.f36604g);
        }
        if (this.f36605h != null) {
            interfaceC9448h3.mo30828k("identifier").mo30819b(this.f36605h);
        }
        if (this.f36606i != null) {
            interfaceC9448h3.mo30828k(StoreTabGridRecyclerFragment.BundleCons.TAG).mo30819b(this.f36606i);
        }
        if (this.f36607j != null) {
            interfaceC9448h3.mo30828k("width").mo30822e(this.f36607j);
        }
        if (this.f36608k != null) {
            interfaceC9448h3.mo30828k("height").mo30822e(this.f36608k);
        }
        if (this.f36609l != null) {
            interfaceC9448h3.mo30828k("x").mo30822e(this.f36609l);
        }
        if (this.f36610m != null) {
            interfaceC9448h3.mo30828k("y").mo30822e(this.f36610m);
        }
        if (this.f36611n != null) {
            interfaceC9448h3.mo30828k("visibility").mo30819b(this.f36611n);
        }
        if (this.f36612o != null) {
            interfaceC9448h3.mo30828k("alpha").mo30822e(this.f36612o);
        }
        List<C9544c0> list = this.f36613p;
        if (list != null && !list.isEmpty()) {
            interfaceC9448h3.mo30828k("children").mo30824g(interfaceC9670w1, this.f36613p);
        }
        Map<String, Object> map = this.f36614q;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC9448h3.mo30828k(str).mo30824g(interfaceC9670w1, this.f36614q.get(str));
            }
        }
        interfaceC9448h3.mo30821d();
    }

    /* renamed from: t */
    public void m31263t(Double d2) {
        this.f36609l = d2;
    }

    /* renamed from: u */
    public void m31264u(Double d2) {
        this.f36610m = d2;
    }
}
