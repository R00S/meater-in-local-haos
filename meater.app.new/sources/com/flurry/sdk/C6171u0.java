package com.flurry.sdk;

import android.text.TextUtils;

/* renamed from: com.flurry.sdk.u0 */
/* loaded from: classes2.dex */
public final class C6171u0 extends AbstractC6129p0 {
    public C6171u0() {
        super("Streaming", "FlurryStreamingWithFramesDataSender");
    }

    @Override // com.flurry.sdk.AbstractC6129p0
    /* renamed from: u */
    protected final void mo13245u(int i2, String str, String str2) {
        if (C6037e7.m13055a().f15832l.f15767r.get()) {
            C6013c2.m12989e(i2, str, str2, true);
            return;
        }
        C6131p2.m13253b("last_streaming_http_error_code", i2);
        C6131p2.m13255d("last_streaming_http_error_message", str);
        C6131p2.m13255d("last_streaming_http_report_identifier", str2);
    }

    @Override // com.flurry.sdk.AbstractC6129p0
    /* renamed from: z */
    protected final String mo13250z() {
        String strM13059b = C6040f1.m13059b();
        if (TextUtils.isEmpty(strM13059b)) {
            return "https://data.flurry.com/v1/flr.do";
        }
        return strM13059b + "/v1/flr.do";
    }
}
