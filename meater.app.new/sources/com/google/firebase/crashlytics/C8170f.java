package com.google.firebase.crashlytics;

import android.os.Bundle;
import com.google.firebase.analytics.p179a.InterfaceC8095a;
import com.google.firebase.crashlytics.internal.C8179h;
import com.google.firebase.crashlytics.internal.p181l.InterfaceC8184b;
import java.util.Locale;

/* compiled from: CrashlyticsAnalyticsListener.java */
/* renamed from: com.google.firebase.crashlytics.f */
/* loaded from: classes2.dex */
class C8170f implements InterfaceC8095a.b {

    /* renamed from: a */
    private InterfaceC8184b f30839a;

    /* renamed from: b */
    private InterfaceC8184b f30840b;

    C8170f() {
    }

    /* renamed from: b */
    private static void m25147b(InterfaceC8184b interfaceC8184b, String str, Bundle bundle) {
        if (interfaceC8184b == null) {
            return;
        }
        interfaceC8184b.mo25195J0(str, bundle);
    }

    /* renamed from: c */
    private void m25148c(String str, Bundle bundle) {
        m25147b("clx".equals(bundle.getString("_o")) ? this.f30839a : this.f30840b, str, bundle);
    }

    @Override // com.google.firebase.analytics.p179a.InterfaceC8095a.b
    /* renamed from: a */
    public void mo24953a(int i2, Bundle bundle) {
        String string;
        C8179h.m25176f().m25183i(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", Integer.valueOf(i2), bundle));
        if (bundle == null || (string = bundle.getString("name")) == null) {
            return;
        }
        Bundle bundle2 = bundle.getBundle("params");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        m25148c(string, bundle2);
    }

    /* renamed from: d */
    public void m25149d(InterfaceC8184b interfaceC8184b) {
        this.f30840b = interfaceC8184b;
    }

    /* renamed from: e */
    public void m25150e(InterfaceC8184b interfaceC8184b) {
        this.f30839a = interfaceC8184b;
    }
}
