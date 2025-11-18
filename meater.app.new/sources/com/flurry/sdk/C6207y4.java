package com.flurry.sdk;

/* renamed from: com.flurry.sdk.y4 */
/* loaded from: classes2.dex */
public final class C6207y4 implements InterfaceC6046f7<C6011c0> {
    @Override // com.flurry.sdk.InterfaceC6046f7
    /* renamed from: a */
    public final /* synthetic */ void mo12962a(C6011c0 c6011c0) {
        C6011c0 c6011c02 = c6011c0;
        if (c6011c02 == null) {
            C6021d1.m13030c(2, "ReportingFrame", "Reporting data is null, do not send the frame.");
        } else {
            C6104m2.m13180a().m13181b(new C6034e4(new C6043f4(c6011c02)));
        }
    }
}
