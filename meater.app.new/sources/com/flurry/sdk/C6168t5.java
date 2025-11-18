package com.flurry.sdk;

/* renamed from: com.flurry.sdk.t5 */
/* loaded from: classes2.dex */
public final class C6168t5 extends AbstractC6153r6 {
    private C6168t5(InterfaceC6169t6 interfaceC6169t6) {
        super(interfaceC6169t6);
    }

    /* renamed from: h */
    public static C6168t5 m13308h() {
        long jM13257f = C6131p2.m13257f("frame.counter", 0L) + 1;
        C6131p2.m13254c("frame.counter", jM13257f);
        return new C6168t5(new C6176u5(jM13257f));
    }

    @Override // com.flurry.sdk.InterfaceC6177u6
    /* renamed from: a */
    public final EnumC6161s6 mo12961a() {
        return EnumC6161s6.FRAME_COUNTER;
    }
}
