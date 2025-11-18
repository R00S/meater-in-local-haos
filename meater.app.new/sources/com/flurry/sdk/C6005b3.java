package com.flurry.sdk;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.flurry.sdk.b3 */
/* loaded from: classes2.dex */
final class C6005b3 extends AbstractC6014c3 {

    /* renamed from: s */
    protected static EnumC6161s6[] f15681s = {EnumC6161s6.SESSION_INFO, EnumC6161s6.APP_INFO, EnumC6161s6.REPORTED_ID, EnumC6161s6.DEVICE_PROPERTIES, EnumC6161s6.NOTIFICATION, EnumC6161s6.REFERRER, EnumC6161s6.LAUNCH_OPTIONS, EnumC6161s6.CONSENT, EnumC6161s6.APP_STATE, EnumC6161s6.NETWORK, EnumC6161s6.LOCALE, EnumC6161s6.TIMEZONE, EnumC6161s6.APP_ORIENTATION, EnumC6161s6.DYNAMIC_SESSION_INFO, EnumC6161s6.LOCATION, EnumC6161s6.USER_ID, EnumC6161s6.BIRTHDATE, EnumC6161s6.GENDER};

    /* renamed from: t */
    protected static EnumC6161s6[] f15682t = {EnumC6161s6.ORIGIN_ATTRIBUTE};

    /* renamed from: u */
    private EnumMap<EnumC6161s6, InterfaceC6177u6> f15683u;

    /* renamed from: v */
    private EnumMap<EnumC6161s6, List<InterfaceC6177u6>> f15684v;

    /* renamed from: com.flurry.sdk.b3$a */
    final class a extends AbstractRunnableC6041f2 {

        /* renamed from: h */
        final /* synthetic */ InterfaceC6177u6 f15685h;

        a(InterfaceC6177u6 interfaceC6177u6) {
            this.f15685h = interfaceC6177u6;
        }

        @Override // com.flurry.sdk.AbstractRunnableC6041f2
        /* renamed from: a */
        public final void mo12950a() {
            C6005b3.this.m13002w(this.f15685h);
            C6005b3.m12974y(C6005b3.this, this.f15685h);
            if (EnumC6161s6.FLUSH_FRAME.equals(this.f15685h.mo12961a())) {
                Iterator it = C6005b3.this.f15683u.entrySet().iterator();
                while (it.hasNext()) {
                    InterfaceC6177u6 interfaceC6177u6 = (InterfaceC6177u6) ((Map.Entry) it.next()).getValue();
                    if (interfaceC6177u6 != null) {
                        C6005b3.this.m13002w(interfaceC6177u6);
                    }
                }
                Iterator it2 = C6005b3.this.f15684v.entrySet().iterator();
                while (it2.hasNext()) {
                    List list = (List) ((Map.Entry) it2.next()).getValue();
                    if (list != null && list.size() != 0) {
                        for (int i2 = 0; i2 < list.size(); i2++) {
                            C6005b3.this.m13002w((InterfaceC6177u6) list.get(i2));
                        }
                    }
                }
            }
        }
    }

    C6005b3(InterfaceC6197x2 interfaceC6197x2) {
        super("StickyModule", interfaceC6197x2);
        this.f15683u = new EnumMap<>(EnumC6161s6.class);
        this.f15684v = new EnumMap<>(EnumC6161s6.class);
        for (EnumC6161s6 enumC6161s6 : f15681s) {
            this.f15683u.put((EnumMap<EnumC6161s6, InterfaceC6177u6>) enumC6161s6, (EnumC6161s6) null);
        }
        for (EnumC6161s6 enumC6161s62 : f15682t) {
            this.f15684v.put((EnumMap<EnumC6161s6, List<InterfaceC6177u6>>) enumC6161s62, (EnumC6161s6) null);
        }
    }

    /* renamed from: y */
    static /* synthetic */ void m12974y(C6005b3 c6005b3, InterfaceC6177u6 interfaceC6177u6) {
        EnumC6161s6 enumC6161s6Mo12961a = interfaceC6177u6.mo12961a();
        List<InterfaceC6177u6> arrayList = new ArrayList<>();
        if (c6005b3.f15683u.containsKey(enumC6161s6Mo12961a)) {
            c6005b3.f15683u.put((EnumMap<EnumC6161s6, InterfaceC6177u6>) enumC6161s6Mo12961a, (EnumC6161s6) interfaceC6177u6);
        }
        if (c6005b3.f15684v.containsKey(enumC6161s6Mo12961a)) {
            if (c6005b3.f15684v.get(enumC6161s6Mo12961a) != null) {
                arrayList = c6005b3.f15684v.get(enumC6161s6Mo12961a);
            }
            arrayList.add(interfaceC6177u6);
            c6005b3.f15684v.put((EnumMap<EnumC6161s6, List<InterfaceC6177u6>>) enumC6161s6Mo12961a, (EnumC6161s6) arrayList);
        }
    }

    @Override // com.flurry.sdk.AbstractC6014c3
    /* renamed from: b */
    public final void mo12956b(InterfaceC6177u6 interfaceC6177u6) {
        mo13007m(new a(interfaceC6177u6));
    }
}
