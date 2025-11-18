package io.sentry;

import io.sentry.vendor.gson.stream.C9665a;
import io.sentry.vendor.gson.stream.EnumC9666b;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: JsonObjectReader.java */
@ApiStatus.Internal
/* renamed from: io.sentry.n2 */
/* loaded from: classes2.dex */
public final class C9518n2 extends C9665a {
    public C9518n2(Reader reader) {
        super(reader);
    }

    /* renamed from: n0 */
    public static Date m31083n0(String str, InterfaceC9670w1 interfaceC9670w1) {
        if (str == null) {
            return null;
        }
        try {
            try {
                return C9244a1.m30010e(str);
            } catch (Exception unused) {
                return C9244a1.m30011f(str);
            }
        } catch (Exception e2) {
            interfaceC9670w1.mo30213b(EnumC9587s4.ERROR, "Error when deserializing millis timestamp format.", e2);
            return null;
        }
    }

    /* renamed from: E0 */
    public Integer m31084E0() throws IOException {
        if (m31882N() != EnumC9666b.NULL) {
            return Integer.valueOf(m31894z());
        }
        m31880H();
        return null;
    }

    /* renamed from: F0 */
    public <T> List<T> m31085F0(InterfaceC9670w1 interfaceC9670w1, InterfaceC9504l2<T> interfaceC9504l2) throws IOException {
        if (m31882N() == EnumC9666b.NULL) {
            m31880H();
            return null;
        }
        m31883a();
        ArrayList arrayList = new ArrayList();
        if (m31890l()) {
            do {
                try {
                    arrayList.add(interfaceC9504l2.mo30683a(this, interfaceC9670w1));
                } catch (Exception e2) {
                    interfaceC9670w1.mo30213b(EnumC9587s4.WARNING, "Failed to deserialize object in list.", e2);
                }
            } while (m31882N() == EnumC9666b.BEGIN_OBJECT);
        }
        m31886f();
        return arrayList;
    }

    /* renamed from: G0 */
    public Long m31086G0() throws IOException {
        if (m31882N() != EnumC9666b.NULL) {
            return Long.valueOf(m31878A());
        }
        m31880H();
        return null;
    }

    /* renamed from: J0 */
    public <T> Map<String, T> m31087J0(InterfaceC9670w1 interfaceC9670w1, InterfaceC9504l2<T> interfaceC9504l2) throws IOException {
        if (m31882N() == EnumC9666b.NULL) {
            m31880H();
            return null;
        }
        m31884b();
        HashMap map = new HashMap();
        if (m31890l()) {
            while (true) {
                try {
                    map.put(m31879B(), interfaceC9504l2.mo30683a(this, interfaceC9670w1));
                } catch (Exception e2) {
                    interfaceC9670w1.mo30213b(EnumC9587s4.WARNING, "Failed to deserialize object in map.", e2);
                }
                if (m31882N() != EnumC9666b.BEGIN_OBJECT && m31882N() != EnumC9666b.NAME) {
                    break;
                }
            }
        }
        m31889j();
        return map;
    }

    /* renamed from: K0 */
    public Object m31088K0() throws IOException {
        return new C9511m2().m31028a(this);
    }

    /* renamed from: M0 */
    public <T> T m31089M0(InterfaceC9670w1 interfaceC9670w1, InterfaceC9504l2<T> interfaceC9504l2) throws Exception {
        if (m31882N() != EnumC9666b.NULL) {
            return interfaceC9504l2.mo30683a(this, interfaceC9670w1);
        }
        m31880H();
        return null;
    }

    /* renamed from: N0 */
    public String m31090N0() throws IOException {
        if (m31882N() != EnumC9666b.NULL) {
            return m31881J();
        }
        m31880H();
        return null;
    }

    /* renamed from: Q0 */
    public TimeZone m31091Q0(InterfaceC9670w1 interfaceC9670w1) throws IOException {
        if (m31882N() == EnumC9666b.NULL) {
            m31880H();
            return null;
        }
        try {
            return TimeZone.getTimeZone(m31881J());
        } catch (Exception e2) {
            interfaceC9670w1.mo30213b(EnumC9587s4.ERROR, "Error when deserializing TimeZone", e2);
            return null;
        }
    }

    /* renamed from: R0 */
    public void m31092R0(InterfaceC9670w1 interfaceC9670w1, Map<String, Object> map, String str) {
        try {
            map.put(str, m31088K0());
        } catch (Exception e2) {
            interfaceC9670w1.mo30212a(EnumC9587s4.ERROR, e2, "Error deserializing unknown key: %s", str);
        }
    }

    /* renamed from: p0 */
    public Boolean m31093p0() throws IOException {
        if (m31882N() != EnumC9666b.NULL) {
            return Boolean.valueOf(m31892x());
        }
        m31880H();
        return null;
    }

    /* renamed from: q0 */
    public Date m31094q0(InterfaceC9670w1 interfaceC9670w1) throws IOException {
        if (m31882N() != EnumC9666b.NULL) {
            return m31083n0(m31881J(), interfaceC9670w1);
        }
        m31880H();
        return null;
    }

    /* renamed from: t0 */
    public Double m31095t0() throws IOException {
        if (m31882N() != EnumC9666b.NULL) {
            return Double.valueOf(m31893y());
        }
        m31880H();
        return null;
    }

    /* renamed from: x0 */
    public Float m31096x0() throws IOException {
        return Float.valueOf((float) m31893y());
    }

    /* renamed from: y0 */
    public Float m31097y0() throws IOException {
        if (m31882N() != EnumC9666b.NULL) {
            return m31096x0();
        }
        m31880H();
        return null;
    }
}
