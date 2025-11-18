package com.flurry.sdk;

/* renamed from: com.flurry.sdk.m2 */
/* loaded from: classes2.dex */
public final class C6104m2 {

    /* renamed from: a */
    static C6104m2 f16132a;

    /* renamed from: b */
    public C6165t2 f16133b = new C6165t2();

    /* renamed from: c */
    public C6217z6 f16134c;

    /* renamed from: d */
    public InterfaceC6185v6 f16135d;

    private C6104m2() {
        int iM13058a = C6040f1.m13058a();
        this.f16135d = (iM13058a == 0 || iM13058a == 2) ? C6040f1.m13060c() ? new C6086k2() : new C6077j2() : null;
        this.f16134c = new C6217z6(this.f16135d);
    }

    /* renamed from: a */
    public static synchronized C6104m2 m13180a() {
        if (f16132a == null) {
            f16132a = new C6104m2();
        }
        return f16132a;
    }

    /* renamed from: b */
    public final void m13181b(InterfaceC6177u6 interfaceC6177u6) {
        if (interfaceC6177u6 != null) {
            this.f16133b.m13307a(interfaceC6177u6);
        } else {
            C6021d1.m13030c(5, "StreamingManager", "sendFrameToStreaming failed -- message is null");
        }
    }
}
