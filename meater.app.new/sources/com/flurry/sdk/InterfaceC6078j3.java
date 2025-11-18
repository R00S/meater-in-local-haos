package com.flurry.sdk;

/* renamed from: com.flurry.sdk.j3 */
/* loaded from: classes2.dex */
public interface InterfaceC6078j3 {

    /* renamed from: com.flurry.sdk.j3$a */
    public enum a {
        DO_NOT_FLUSH("DO_NOT_FLUSH"),
        REASON_STICKY_SET_COMPLETE("Sticky set is complete"),
        REASON_APP_STATE_CHANGE("App State has changed"),
        REASON_SESSION_FINALIZE("Session Finalized"),
        REASON_APP_CRASH("App crashed"),
        REASON_FORCE_FLUSH("Force to Flush"),
        REASON_STARTUP("App Started"),
        REASON_PUSH_TOKEN_REFRESH("Push Token Refreshed"),
        REASON_DATA_DELETION("Delete Data");


        /* renamed from: p */
        public final String f16030p;

        a(String str) {
            this.f16030p = str;
        }
    }

    /* renamed from: b */
    void mo13137b(InterfaceC6177u6 interfaceC6177u6);
}
