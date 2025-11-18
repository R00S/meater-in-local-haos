package com.flurry.sdk;

import com.flurry.sdk.C6048g0;
import com.flurry.sdk.InterfaceC6042f3;
import com.flurry.sdk.InterfaceC6078j3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.flurry.sdk.v2 */
/* loaded from: classes2.dex */
final class C6181v2 extends AbstractC6014c3 {

    /* renamed from: s */
    protected List<InterfaceC6042f3> f16427s;

    /* renamed from: t */
    protected final Map<String, List<InterfaceC6177u6>> f16428t;

    /* renamed from: u */
    protected C6048g0.a f16429u;

    /* renamed from: com.flurry.sdk.v2$a */
    final class a extends AbstractRunnableC6041f2 {

        /* renamed from: h */
        final /* synthetic */ InterfaceC6177u6 f16430h;

        a(InterfaceC6177u6 interfaceC6177u6) {
            this.f16430h = interfaceC6177u6;
        }

        @Override // com.flurry.sdk.AbstractRunnableC6041f2
        /* renamed from: a */
        public final void mo12950a() {
            C6181v2.m13328z(C6181v2.this, C6181v2.m13327y(C6181v2.this, this.f16430h));
            C6181v2.m13324C(C6181v2.this, this.f16430h);
        }
    }

    C6181v2(InterfaceC6197x2 interfaceC6197x2) {
        super("DropModule", interfaceC6197x2);
        this.f16428t = new HashMap();
        ArrayList arrayList = new ArrayList();
        this.f16427s = arrayList;
        arrayList.add(new C6033e3());
        this.f16427s.add(new C6023d3());
        this.f16427s.add(new C6051g3());
        this.f16427s.add(new C6060h3());
        this.f16429u = new C6048g0.a();
    }

    /* renamed from: A */
    private void m13322A(InterfaceC6042f3.a aVar, InterfaceC6177u6 interfaceC6177u6) {
        this.f16429u.m13073b(interfaceC6177u6.mo12961a());
        if (aVar.f15861a.equals(InterfaceC6042f3.b.DROP_STANDARD_EVENTS_COUNT_EXCEEDED)) {
            return;
        }
        HashMap map = new HashMap();
        map.put("fl.drop.reason", aVar.f15861a.f15874q);
        map.put("fl.drop.frame.type", String.valueOf(interfaceC6177u6.mo12961a()));
        C6048g0.m13065a();
        C6048g0.m13067d("Flurry.SDKReport.DropFrame", map);
    }

    /* renamed from: B */
    private static void m13323B(InterfaceC6177u6 interfaceC6177u6, InterfaceC6177u6 interfaceC6177u62) {
        C6182v3 c6182v3 = (C6182v3) interfaceC6177u6.mo13298f();
        C6182v3 c6182v32 = (C6182v3) interfaceC6177u62.mo13298f();
        c6182v32.f16433c = c6182v3.f16433c;
        c6182v32.f16441k = c6182v32.f16439i - c6182v3.f16439i;
        Map<String, String> map = c6182v3.f16435e;
        Map<String, String> map2 = c6182v32.f16435e;
        if (map == null || map2 == null) {
            return;
        }
        Map<String, String> map3 = c6182v3.f16436f;
        Map<String, String> map4 = c6182v32.f16436f;
        if (map3.get(C6013c2.m12992h("fl.parameter.limit.exceeded")) != null) {
            map4.putAll(map3);
            map2.clear();
            return;
        }
        if (!map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (!map2.containsKey(entry.getKey())) {
                    map2.put(entry.getKey(), entry.getValue());
                }
            }
        }
        if (map2.size() > 10) {
            map4.put(C6013c2.m12992h("fl.parameter.limit.exceeded.on.endevent"), C6013c2.m12992h(String.valueOf(map2.size())));
            map2.clear();
            map2.putAll(map);
        }
    }

    /* renamed from: C */
    static /* synthetic */ void m13324C(C6181v2 c6181v2, InterfaceC6177u6 interfaceC6177u6) {
        if (m13326E(interfaceC6177u6)) {
            C6021d1.m13030c(4, "DropModule", "Resetting drop rules");
            Iterator<InterfaceC6042f3> it = c6181v2.f16427s.iterator();
            while (it.hasNext()) {
                it.next().mo13043a();
            }
            C6021d1.m13030c(4, "DropModule", "Reset start timed event record");
            c6181v2.f16428t.clear();
        }
    }

    /* renamed from: D */
    private List<InterfaceC6177u6> m13325D(InterfaceC6177u6 interfaceC6177u6) {
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, List<InterfaceC6177u6>>> it = this.f16428t.entrySet().iterator();
        while (it.hasNext()) {
            Iterator<InterfaceC6177u6> it2 = it.next().getValue().iterator();
            while (it2.hasNext()) {
                C6182v3 c6182v3 = (C6182v3) it2.next().mo13298f();
                String str = c6182v3.f16432b;
                int i2 = c6182v3.f16433c;
                long jCurrentTimeMillis = System.currentTimeMillis();
                arrayList.add(C6174u3.m13319i(str, i2, c6182v3.f16435e, c6182v3.f16436f, jCurrentTimeMillis, jCurrentTimeMillis - c6182v3.f16439i));
                this.f16429u.m13072a();
            }
        }
        arrayList.add(interfaceC6177u6);
        return arrayList;
    }

    /* renamed from: E */
    private static boolean m13326E(InterfaceC6177u6 interfaceC6177u6) {
        return interfaceC6177u6.mo12961a().equals(EnumC6161s6.FLUSH_FRAME) && ((C6160s5) interfaceC6177u6.mo13298f()).f16331c.equals(InterfaceC6078j3.a.REASON_SESSION_FINALIZE.f16030p);
    }

    /* renamed from: y */
    static /* synthetic */ List m13327y(C6181v2 c6181v2, InterfaceC6177u6 interfaceC6177u6) {
        if (!(interfaceC6177u6.mo12961a().equals(EnumC6161s6.ANALYTICS_EVENT) && ((C6182v3) interfaceC6177u6.mo13298f()).f16437g)) {
            if (m13326E(interfaceC6177u6)) {
                return c6181v2.m13325D(interfaceC6177u6);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(interfaceC6177u6);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        String str = ((C6182v3) interfaceC6177u6.mo13298f()).f16432b;
        List<InterfaceC6177u6> arrayList3 = c6181v2.f16428t.get(str);
        if (((C6182v3) interfaceC6177u6.mo13298f()).f16438h) {
            if (arrayList3 == null) {
                arrayList3 = new ArrayList<>();
            }
            arrayList3.add(interfaceC6177u6);
            c6181v2.f16428t.put(str, arrayList3);
            arrayList2.add(interfaceC6177u6);
            return arrayList2;
        }
        if (arrayList3 == null || arrayList3.isEmpty()) {
            c6181v2.m13322A(InterfaceC6042f3.f15856f, interfaceC6177u6);
            return arrayList2;
        }
        m13323B(arrayList3.remove(0), interfaceC6177u6);
        arrayList2.add(interfaceC6177u6);
        return arrayList2;
    }

    /* renamed from: z */
    static /* synthetic */ void m13328z(C6181v2 c6181v2, List list) {
        boolean z;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC6177u6 interfaceC6177u6 = (InterfaceC6177u6) it.next();
            Iterator<InterfaceC6042f3> it2 = c6181v2.f16427s.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z = false;
                    break;
                }
                InterfaceC6042f3.a aVarMo13044b = it2.next().mo13044b(interfaceC6177u6);
                if (!aVarMo13044b.f15861a.equals(InterfaceC6042f3.b.DO_NOT_DROP)) {
                    c6181v2.m13322A(aVarMo13044b, interfaceC6177u6);
                    z = true;
                    break;
                } else {
                    InterfaceC6177u6 interfaceC6177u62 = aVarMo13044b.f15862b;
                    if (interfaceC6177u62 != null) {
                        c6181v2.m13002w(interfaceC6177u62);
                    }
                }
            }
            if (z) {
                C6021d1.m13030c(4, "DropModule", "Dropping Frame: " + interfaceC6177u6.mo12961a() + ": " + interfaceC6177u6.mo13296d());
            } else {
                C6021d1.m13030c(4, "DropModule", "Adding Frame:" + interfaceC6177u6.mo13296d());
                c6181v2.m13002w(interfaceC6177u6);
            }
        }
    }

    @Override // com.flurry.sdk.AbstractC6014c3
    /* renamed from: b */
    public final void mo12956b(InterfaceC6177u6 interfaceC6177u6) {
        mo13007m(new a(interfaceC6177u6));
    }

    /* renamed from: x */
    public final C6048g0.a m13329x() {
        return this.f16429u;
    }
}
