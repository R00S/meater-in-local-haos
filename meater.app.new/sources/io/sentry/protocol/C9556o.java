package io.sentry.protocol;

import io.sentry.C9518n2;
import io.sentry.C9573q4;
import io.sentry.EnumC9587s4;
import io.sentry.InterfaceC9448h3;
import io.sentry.InterfaceC9504l2;
import io.sentry.InterfaceC9578r2;
import io.sentry.InterfaceC9670w1;
import io.sentry.protocol.C9559r;
import io.sentry.util.C9646q;
import io.sentry.vendor.gson.stream.EnumC9666b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: SdkVersion.java */
/* renamed from: io.sentry.protocol.o */
/* loaded from: classes2.dex */
public final class C9556o implements InterfaceC9578r2 {

    /* renamed from: f */
    private String f36713f;

    /* renamed from: g */
    private String f36714g;

    /* renamed from: h */
    private Set<C9559r> f36715h;

    /* renamed from: i */
    private Set<String> f36716i;

    /* renamed from: j */
    private Map<String, Object> f36717j;

    /* compiled from: SdkVersion.java */
    /* renamed from: io.sentry.protocol.o$a */
    public static final class a implements InterfaceC9504l2<C9556o> {
        @Override // io.sentry.InterfaceC9504l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9556o mo30683a(C9518n2 c9518n2, InterfaceC9670w1 interfaceC9670w1) throws Exception {
            String strM31879B;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            c9518n2.m31884b();
            String strM31881J = null;
            String strM31881J2 = null;
            HashMap map = null;
            while (c9518n2.m31882N() == EnumC9666b.NAME) {
                strM31879B = c9518n2.m31879B();
                strM31879B.hashCode();
                switch (strM31879B) {
                    case "name":
                        strM31881J = c9518n2.m31881J();
                        break;
                    case "version":
                        strM31881J2 = c9518n2.m31881J();
                        break;
                    case "packages":
                        List listM31085F0 = c9518n2.m31085F0(interfaceC9670w1, new C9559r.a());
                        if (listM31085F0 == null) {
                            break;
                        } else {
                            arrayList.addAll(listM31085F0);
                            break;
                        }
                    case "integrations":
                        List list = (List) c9518n2.m31088K0();
                        if (list == null) {
                            break;
                        } else {
                            arrayList2.addAll(list);
                            break;
                        }
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        c9518n2.m31092R0(interfaceC9670w1, map, strM31879B);
                        break;
                }
            }
            c9518n2.m31889j();
            if (strM31881J == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"name\"");
                interfaceC9670w1.mo30213b(EnumC9587s4.ERROR, "Missing required field \"name\"", illegalStateException);
                throw illegalStateException;
            }
            if (strM31881J2 == null) {
                IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"version\"");
                interfaceC9670w1.mo30213b(EnumC9587s4.ERROR, "Missing required field \"version\"", illegalStateException2);
                throw illegalStateException2;
            }
            C9556o c9556o = new C9556o(strM31881J, strM31881J2);
            c9556o.f36715h = new CopyOnWriteArraySet(arrayList);
            c9556o.f36716i = new CopyOnWriteArraySet(arrayList2);
            c9556o.m31432i(map);
            return c9556o;
        }
    }

    public C9556o(String str, String str2) {
        this.f36713f = (String) C9646q.m31802c(str, "name is required.");
        this.f36714g = (String) C9646q.m31802c(str2, "version is required.");
    }

    /* renamed from: k */
    public static C9556o m31425k(C9556o c9556o, String str, String str2) {
        C9646q.m31802c(str, "name is required.");
        C9646q.m31802c(str2, "version is required.");
        if (c9556o == null) {
            return new C9556o(str, str2);
        }
        c9556o.m31431h(str);
        c9556o.m31433j(str2);
        return c9556o;
    }

    /* renamed from: c */
    public void m31426c(String str, String str2) {
        C9573q4.m31555c().m31557b(str, str2);
    }

    /* renamed from: d */
    public Set<String> m31427d() {
        Set<String> set = this.f36716i;
        return set != null ? set : C9573q4.m31555c().m31558d();
    }

    /* renamed from: e */
    public String m31428e() {
        return this.f36713f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9556o.class != obj.getClass()) {
            return false;
        }
        C9556o c9556o = (C9556o) obj;
        return this.f36713f.equals(c9556o.f36713f) && this.f36714g.equals(c9556o.f36714g);
    }

    /* renamed from: f */
    public Set<C9559r> m31429f() {
        Set<C9559r> set = this.f36715h;
        return set != null ? set : C9573q4.m31555c().m31559e();
    }

    /* renamed from: g */
    public String m31430g() {
        return this.f36714g;
    }

    /* renamed from: h */
    public void m31431h(String str) {
        this.f36713f = (String) C9646q.m31802c(str, "name is required.");
    }

    public int hashCode() {
        return C9646q.m31801b(this.f36713f, this.f36714g);
    }

    /* renamed from: i */
    public void m31432i(Map<String, Object> map) {
        this.f36717j = map;
    }

    /* renamed from: j */
    public void m31433j(String str) {
        this.f36714g = (String) C9646q.m31802c(str, "version is required.");
    }

    @Override // io.sentry.InterfaceC9578r2
    public void serialize(InterfaceC9448h3 interfaceC9448h3, InterfaceC9670w1 interfaceC9670w1) throws IOException {
        interfaceC9448h3.mo30823f();
        interfaceC9448h3.mo30828k("name").mo30819b(this.f36713f);
        interfaceC9448h3.mo30828k("version").mo30819b(this.f36714g);
        Set<C9559r> setM31429f = m31429f();
        Set<String> setM31427d = m31427d();
        if (!setM31429f.isEmpty()) {
            interfaceC9448h3.mo30828k("packages").mo30824g(interfaceC9670w1, setM31429f);
        }
        if (!setM31427d.isEmpty()) {
            interfaceC9448h3.mo30828k("integrations").mo30824g(interfaceC9670w1, setM31427d);
        }
        Map<String, Object> map = this.f36717j;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC9448h3.mo30828k(str).mo30824g(interfaceC9670w1, this.f36717j.get(str));
            }
        }
        interfaceC9448h3.mo30821d();
    }
}
