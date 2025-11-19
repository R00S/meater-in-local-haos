package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
public final class W5 extends r {

    /* renamed from: C, reason: collision with root package name */
    private final C2454d f33935C;

    public W5(C2454d c2454d) {
        this.f33935C = c2454d;
    }

    @Override // com.google.android.gms.internal.measurement.r, com.google.android.gms.internal.measurement.InterfaceC2574s
    public final InterfaceC2574s v(String str, Z2 z22, List<InterfaceC2574s> list) {
        str.hashCode();
        switch (str) {
            case "getEventName":
                Y1.g("getEventName", 0, list);
                return new C2590u(this.f33935C.d().e());
            case "getTimestamp":
                Y1.g("getTimestamp", 0, list);
                return new C2511k(Double.valueOf(this.f33935C.d().a()));
            case "getParamValue":
                Y1.g("getParamValue", 1, list);
                return C2432a4.b(this.f33935C.d().b(z22.b(list.get(0)).i()));
            case "getParams":
                Y1.g("getParams", 0, list);
                Map<String, Object> mapG = this.f33935C.d().g();
                r rVar = new r();
                for (String str2 : mapG.keySet()) {
                    rVar.w(str2, C2432a4.b(mapG.get(str2)));
                }
                return rVar;
            case "setParamValue":
                Y1.g("setParamValue", 2, list);
                String strI = z22.b(list.get(0)).i();
                InterfaceC2574s interfaceC2574sB = z22.b(list.get(1));
                this.f33935C.d().d(strI, Y1.d(interfaceC2574sB));
                return interfaceC2574sB;
            case "setEventName":
                Y1.g("setEventName", 1, list);
                InterfaceC2574s interfaceC2574sB2 = z22.b(list.get(0));
                if (InterfaceC2574s.f34292p.equals(interfaceC2574sB2) || InterfaceC2574s.f34293q.equals(interfaceC2574sB2)) {
                    throw new IllegalArgumentException("Illegal event name");
                }
                this.f33935C.d().f(interfaceC2574sB2.i());
                return new C2590u(interfaceC2574sB2.i());
            default:
                return super.v(str, z22, list);
        }
    }
}
