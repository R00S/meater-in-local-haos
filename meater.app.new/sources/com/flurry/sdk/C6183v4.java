package com.flurry.sdk;

import java.util.Collections;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.flurry.sdk.v4 */
/* loaded from: classes2.dex */
public final class C6183v4 implements InterfaceC6046f7<C6194x> {

    /* renamed from: a */
    private String f16451a;

    C6183v4() {
    }

    @Override // com.flurry.sdk.InterfaceC6046f7
    /* renamed from: a */
    public final /* synthetic */ void mo12962a(C6194x c6194x) {
        C6194x c6194x2 = c6194x;
        String str = c6194x2.f16504a;
        boolean z = c6194x2.f16505b;
        if (str == null || str.equals(this.f16451a) || !z) {
            return;
        }
        C6048g0.m13065a();
        C6048g0.m13068f("Log Notification Frame", Collections.emptyMap());
        this.f16451a = str;
        C6104m2.m13180a().m13181b(new C6216z5(new C5999a6(str, z)));
    }
}
