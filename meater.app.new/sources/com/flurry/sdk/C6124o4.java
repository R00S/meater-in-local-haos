package com.flurry.sdk;

import p241e.p252d.p253a.AbstractC8775a;

/* renamed from: com.flurry.sdk.o4 */
/* loaded from: classes2.dex */
public final class C6124o4 implements InterfaceC6046f7<AbstractC8775a> {
    @Override // com.flurry.sdk.InterfaceC6046f7
    /* renamed from: a */
    public final /* synthetic */ void mo12962a(AbstractC8775a abstractC8775a) {
        AbstractC8775a abstractC8775a2 = abstractC8775a;
        if (abstractC8775a2 == null) {
            C6021d1.m13041n("ConsentFrame", "Consent is null, do not send the frame.");
        } else {
            C6104m2.m13180a().m13181b(new C6098l5(new C6107m5(abstractC8775a2.m27925b(), abstractC8775a2.m27924a())));
        }
    }
}
