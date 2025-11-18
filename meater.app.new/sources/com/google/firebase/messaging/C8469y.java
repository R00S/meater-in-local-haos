package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.InterfaceC8327c;
import com.google.firebase.encoders.InterfaceC8328d;
import java.io.IOException;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
@KeepForSdk
/* renamed from: com.google.firebase.messaging.y */
/* loaded from: classes2.dex */
final class C8469y {

    /* renamed from: a */
    private final String f32087a = Preconditions.m14369h("MESSAGE_DELIVERED", "evenType must be non-null");

    /* renamed from: b */
    private final Intent f32088b;

    /* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
    /* renamed from: com.google.firebase.messaging.y$a */
    static class a implements InterfaceC8327c<C8469y> {
        a() {
        }

        @Override // com.google.firebase.encoders.InterfaceC8327c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13444a(C8469y c8469y, InterfaceC8328d interfaceC8328d) throws EncodingException, IOException {
            Intent intentM26667b = c8469y.m26667b();
            interfaceC8328d.mo26086e("ttl", C8432f0.m26529q(intentM26667b));
            interfaceC8328d.mo26087h("event", c8469y.m26666a());
            interfaceC8328d.mo26087h("instanceId", C8432f0.m26517e(intentM26667b));
            interfaceC8328d.mo26086e("priority", C8432f0.m26526n(intentM26667b));
            interfaceC8328d.mo26087h("packageName", C8432f0.m26525m());
            interfaceC8328d.mo26087h("sdkPlatform", "ANDROID");
            interfaceC8328d.mo26087h("messageType", C8432f0.m26523k(intentM26667b));
            String strM26519g = C8432f0.m26519g(intentM26667b);
            if (strM26519g != null) {
                interfaceC8328d.mo26087h("messageId", strM26519g);
            }
            String strM26528p = C8432f0.m26528p(intentM26667b);
            if (strM26528p != null) {
                interfaceC8328d.mo26087h("topic", strM26528p);
            }
            String strM26514b = C8432f0.m26514b(intentM26667b);
            if (strM26514b != null) {
                interfaceC8328d.mo26087h("collapseKey", strM26514b);
            }
            if (C8432f0.m26520h(intentM26667b) != null) {
                interfaceC8328d.mo26087h("analyticsLabel", C8432f0.m26520h(intentM26667b));
            }
            if (C8432f0.m26516d(intentM26667b) != null) {
                interfaceC8328d.mo26087h("composerLabel", C8432f0.m26516d(intentM26667b));
            }
            String strM26527o = C8432f0.m26527o(intentM26667b);
            if (strM26527o != null) {
                interfaceC8328d.mo26087h("projectNumber", strM26527o);
            }
        }
    }

    /* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
    /* renamed from: com.google.firebase.messaging.y$b */
    static final class b {

        /* renamed from: a */
        private final C8469y f32089a;

        b(C8469y c8469y) {
            this.f32089a = (C8469y) Preconditions.m14372k(c8469y);
        }

        /* renamed from: a */
        C8469y m26669a() {
            return this.f32089a;
        }
    }

    /* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
    /* renamed from: com.google.firebase.messaging.y$c */
    static final class c implements InterfaceC8327c<b> {
        c() {
        }

        @Override // com.google.firebase.encoders.InterfaceC8327c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13444a(b bVar, InterfaceC8328d interfaceC8328d) throws EncodingException, IOException {
            interfaceC8328d.mo26087h("messaging_client_event", bVar.m26669a());
        }
    }

    C8469y(String str, Intent intent) {
        this.f32088b = (Intent) Preconditions.m14373l(intent, "intent must be non-null");
    }

    /* renamed from: a */
    String m26666a() {
        return this.f32087a;
    }

    /* renamed from: b */
    Intent m26667b() {
        return this.f32088b;
    }
}
