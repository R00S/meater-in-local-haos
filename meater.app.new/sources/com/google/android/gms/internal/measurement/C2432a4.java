package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.a4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2432a4 {
    public static InterfaceC2574s a(Q2 q22) {
        if (q22 == null) {
            return InterfaceC2574s.f34292p;
        }
        int i10 = C2634z3.f34461a[q22.L().ordinal()];
        if (i10 == 1) {
            return q22.T() ? new C2590u(q22.O()) : InterfaceC2574s.f34299w;
        }
        if (i10 == 2) {
            return q22.S() ? new C2511k(Double.valueOf(q22.K())) : new C2511k(null);
        }
        if (i10 == 3) {
            return q22.R() ? new C2487h(Boolean.valueOf(q22.Q())) : new C2487h(null);
        }
        if (i10 != 4) {
            if (i10 == 5) {
                throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
            }
            throw new IllegalStateException("Invalid entity: " + String.valueOf(q22));
        }
        List<Q2> listP = q22.P();
        ArrayList arrayList = new ArrayList();
        Iterator<Q2> it = listP.iterator();
        while (it.hasNext()) {
            arrayList.add(a(it.next()));
        }
        return new C2598v(q22.N(), arrayList);
    }

    public static InterfaceC2574s b(Object obj) {
        if (obj == null) {
            return InterfaceC2574s.f34293q;
        }
        if (obj instanceof String) {
            return new C2590u((String) obj);
        }
        if (obj instanceof Double) {
            return new C2511k((Double) obj);
        }
        if (obj instanceof Long) {
            return new C2511k(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new C2511k(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new C2487h((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            C2479g c2479g = new C2479g();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                c2479g.A(b(it.next()));
            }
            return c2479g;
        }
        r rVar = new r();
        Map map = (Map) obj;
        for (Object string : map.keySet()) {
            InterfaceC2574s interfaceC2574sB = b(map.get(string));
            if (string != null) {
                if (!(string instanceof String)) {
                    string = string.toString();
                }
                rVar.w((String) string, interfaceC2574sB);
            }
        }
        return rVar;
    }
}
