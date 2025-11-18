package com.flurry.sdk;

/* renamed from: com.flurry.sdk.a5 */
/* loaded from: classes2.dex */
public final class C5998a5 implements InterfaceC6046f7<C6057h0> {
    @Override // com.flurry.sdk.InterfaceC6046f7
    /* renamed from: a */
    public final /* synthetic */ void mo12962a(C6057h0 c6057h0) {
        C6057h0 c6057h02 = c6057h0;
        C6021d1.m13030c(3, "SessionPropertyObserver", "Log session property frame");
        if (c6057h02 == null) {
            C6021d1.m13030c(2, "SessionPropertiesFrame", "Session property data is null, do not send the frame.");
        } else {
            C6104m2.m13180a().m13181b(new C6070i4(new C6079j4(C6070i4.m13114h(c6057h02))));
        }
    }
}
