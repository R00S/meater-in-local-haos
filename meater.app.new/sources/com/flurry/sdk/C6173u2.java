package com.flurry.sdk;

/* renamed from: com.flurry.sdk.u2 */
/* loaded from: classes2.dex */
final class C6173u2 extends AbstractC6014c3 implements InterfaceC6197x2 {

    /* renamed from: com.flurry.sdk.u2$a */
    final class a extends AbstractRunnableC6041f2 {

        /* renamed from: h */
        final /* synthetic */ InterfaceC6177u6 f16404h;

        a(InterfaceC6177u6 interfaceC6177u6) {
            this.f16404h = interfaceC6177u6;
        }

        @Override // com.flurry.sdk.AbstractRunnableC6041f2
        /* renamed from: a */
        public final void mo12950a() {
            C6173u2.this.m13002w(this.f16404h);
        }
    }

    C6173u2(InterfaceC6197x2 interfaceC6197x2) {
        super("BufferModule", interfaceC6197x2);
    }

    @Override // com.flurry.sdk.AbstractC6014c3
    /* renamed from: b */
    protected final void mo12956b(InterfaceC6177u6 interfaceC6177u6) {
        mo13007m(new a(interfaceC6177u6));
    }
}
