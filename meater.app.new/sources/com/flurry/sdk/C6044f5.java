package com.flurry.sdk;

/* renamed from: com.flurry.sdk.f5 */
/* loaded from: classes2.dex */
public final class C6044f5 extends AbstractC6153r6 {

    /* renamed from: e */
    private static int f15881e;

    private C6044f5(InterfaceC6169t6 interfaceC6169t6) {
        super(interfaceC6169t6);
    }

    /* renamed from: h */
    public static void m13061h(int i2) {
        if (i2 == 0 || f15881e == i2) {
            return;
        }
        f15881e = i2;
        C6104m2.m13180a().m13181b(new C6044f5(new C6053g5(i2)));
    }

    @Override // com.flurry.sdk.InterfaceC6177u6
    /* renamed from: a */
    public final EnumC6161s6 mo12961a() {
        return EnumC6161s6.APP_ORIENTATION;
    }
}
