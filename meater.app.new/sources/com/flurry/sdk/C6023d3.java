package com.flurry.sdk;

import com.flurry.sdk.InterfaceC6042f3;

/* renamed from: com.flurry.sdk.d3 */
/* loaded from: classes2.dex */
public final class C6023d3 implements InterfaceC6042f3 {

    /* renamed from: k */
    private int f15790k = 0;

    @Override // com.flurry.sdk.InterfaceC6042f3
    /* renamed from: a */
    public final void mo13043a() {
        this.f15790k = 0;
    }

    @Override // com.flurry.sdk.InterfaceC6042f3
    /* renamed from: b */
    public final InterfaceC6042f3.a mo13044b(InterfaceC6177u6 interfaceC6177u6) {
        if (interfaceC6177u6.mo12961a().equals(EnumC6161s6.FLUSH_FRAME)) {
            return new InterfaceC6042f3.a(InterfaceC6042f3.b.DO_NOT_DROP, new C6015c4(new C6024d4(this.f15790k)));
        }
        if (!interfaceC6177u6.mo12961a().equals(EnumC6161s6.ANALYTICS_ERROR)) {
            return InterfaceC6042f3.f15851a;
        }
        if (EnumC6136p7.UNCAUGHT_EXCEPTION_ID.f16268i.equals(((C6166t3) interfaceC6177u6.mo13298f()).f16379c)) {
            return InterfaceC6042f3.f15851a;
        }
        int i2 = this.f15790k;
        this.f15790k = i2 + 1;
        return i2 >= 50 ? InterfaceC6042f3.f15858h : InterfaceC6042f3.f15851a;
    }
}
