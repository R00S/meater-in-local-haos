package com.google.firebase.crashlytics.internal.p190t;

import com.google.firebase.crashlytics.internal.p183n.InterfaceC8199d0;
import com.google.firebase.crashlytics.internal.p190t.C8307d;
import org.json.JSONObject;

/* compiled from: DefaultSettingsJsonTransform.java */
/* renamed from: com.google.firebase.crashlytics.h.t.b */
/* loaded from: classes2.dex */
class C8305b implements InterfaceC8311h {
    C8305b() {
    }

    /* renamed from: b */
    static C8307d m26035b(InterfaceC8199d0 interfaceC8199d0) {
        return new C8307d(3600000 + interfaceC8199d0.mo25232a(), new C8307d.b(8, 4), new C8307d.a(true, false, false), 0, 3600, 10.0d, 1.2d, 60);
    }

    @Override // com.google.firebase.crashlytics.internal.p190t.InterfaceC8311h
    /* renamed from: a */
    public C8307d mo26036a(InterfaceC8199d0 interfaceC8199d0, JSONObject jSONObject) {
        return m26035b(interfaceC8199d0);
    }
}
