package com.flurry.sdk;

/* renamed from: com.flurry.sdk.t0 */
/* loaded from: classes2.dex */
public final class C6163t0 extends AbstractC6129p0 {
    public C6163t0() {
        super("Analytics", "FlurryStreamingUpdateDataSender");
    }

    @Override // com.flurry.sdk.AbstractC6129p0
    /* renamed from: u */
    protected final void mo13245u(int i2, String str, String str2) {
        if (C6037e7.m13055a().f15832l.f15767r.get()) {
            C6013c2.m12989e(i2, str, str2, true);
            return;
        }
        C6131p2.m13253b("last_legacy_http_error_code", i2);
        C6131p2.m13255d("last_legacy_http_error_message", str);
        C6131p2.m13255d("last_legacy_http_report_identifier", str2);
    }

    @Override // com.flurry.sdk.AbstractC6129p0
    /* renamed from: z */
    protected final String mo13250z() {
        return "https://data.flurry.com/aap.do";
    }
}
