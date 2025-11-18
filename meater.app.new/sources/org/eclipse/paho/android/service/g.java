package org.eclipse.paho.android.service;

import android.os.Binder;

/* compiled from: MqttServiceBinder.java */
/* loaded from: classes3.dex */
class g extends Binder {

    /* renamed from: B, reason: collision with root package name */
    private final MqttService f47297B;

    /* renamed from: C, reason: collision with root package name */
    private String f47298C;

    g(MqttService mqttService) {
        this.f47297B = mqttService;
    }

    public MqttService a() {
        return this.f47297B;
    }

    void b(String str) {
        this.f47298C = str;
    }
}
