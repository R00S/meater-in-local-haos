package io.sentry.clientreport;

import io.sentry.C9244a1;
import io.sentry.C9518n2;
import io.sentry.EnumC9587s4;
import io.sentry.InterfaceC9448h3;
import io.sentry.InterfaceC9504l2;
import io.sentry.InterfaceC9578r2;
import io.sentry.InterfaceC9670w1;
import io.sentry.clientreport.C9402f;
import io.sentry.vendor.gson.stream.EnumC9666b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: ClientReport.java */
@ApiStatus.Internal
/* renamed from: io.sentry.clientreport.b */
/* loaded from: classes2.dex */
public final class C9398b implements InterfaceC9578r2 {

    /* renamed from: f */
    private final Date f36240f;

    /* renamed from: g */
    private final List<C9402f> f36241g;

    /* renamed from: h */
    private Map<String, Object> f36242h;

    /* compiled from: ClientReport.java */
    /* renamed from: io.sentry.clientreport.b$a */
    public static final class a implements InterfaceC9504l2<C9398b> {
        /* renamed from: c */
        private Exception m30682c(String str, InterfaceC9670w1 interfaceC9670w1) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            interfaceC9670w1.mo30213b(EnumC9587s4.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        @Override // io.sentry.InterfaceC9504l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9398b mo30683a(C9518n2 c9518n2, InterfaceC9670w1 interfaceC9670w1) throws Exception {
            ArrayList arrayList = new ArrayList();
            c9518n2.m31884b();
            Date dateM31094q0 = null;
            HashMap map = null;
            while (c9518n2.m31882N() == EnumC9666b.NAME) {
                String strM31879B = c9518n2.m31879B();
                strM31879B.hashCode();
                if (strM31879B.equals("discarded_events")) {
                    arrayList.addAll(c9518n2.m31085F0(interfaceC9670w1, new C9402f.a()));
                } else if (strM31879B.equals("timestamp")) {
                    dateM31094q0 = c9518n2.m31094q0(interfaceC9670w1);
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    c9518n2.m31092R0(interfaceC9670w1, map, strM31879B);
                }
            }
            c9518n2.m31889j();
            if (dateM31094q0 == null) {
                throw m30682c("timestamp", interfaceC9670w1);
            }
            if (arrayList.isEmpty()) {
                throw m30682c("discarded_events", interfaceC9670w1);
            }
            C9398b c9398b = new C9398b(dateM31094q0, arrayList);
            c9398b.m30681b(map);
            return c9398b;
        }
    }

    public C9398b(Date date, List<C9402f> list) {
        this.f36240f = date;
        this.f36241g = list;
    }

    /* renamed from: a */
    public List<C9402f> m30680a() {
        return this.f36241g;
    }

    /* renamed from: b */
    public void m30681b(Map<String, Object> map) {
        this.f36242h = map;
    }

    @Override // io.sentry.InterfaceC9578r2
    public void serialize(InterfaceC9448h3 interfaceC9448h3, InterfaceC9670w1 interfaceC9670w1) throws IOException {
        interfaceC9448h3.mo30823f();
        interfaceC9448h3.mo30828k("timestamp").mo30819b(C9244a1.m30012g(this.f36240f));
        interfaceC9448h3.mo30828k("discarded_events").mo30824g(interfaceC9670w1, this.f36241g);
        Map<String, Object> map = this.f36242h;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC9448h3.mo30828k(str).mo30824g(interfaceC9670w1, this.f36242h.get(str));
            }
        }
        interfaceC9448h3.mo30821d();
    }
}
