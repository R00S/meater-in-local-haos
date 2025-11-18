package com.flurry.sdk;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.flurry.sdk.s4 */
/* loaded from: classes2.dex */
public final class C6159s4 implements InterfaceC6046f7<C6146r> {
    C6159s4() {
    }

    @Override // com.flurry.sdk.InterfaceC6046f7
    /* renamed from: a */
    public final /* synthetic */ void mo12962a(C6146r c6146r) {
        C6146r c6146r2 = c6146r;
        String str = c6146r2.f16297a;
        String str2 = c6146r2.f16298b;
        if ((str == null || str.isEmpty()) && (str2 == null || str2.isEmpty())) {
            C6021d1.m13030c(2, "LocaleFrame", "Locale is empty, do not send the frame.");
        } else {
            C6104m2.m13180a().m13181b(new C6206y3(new C6214z3(str, str2)));
        }
        C6021d1.m13030c(4, "LocaleObserver", "Locale language: " + c6146r2.f16297a + ". Locale country: " + c6146r2.f16298b);
    }
}
