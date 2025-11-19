package org.eclipse.paho.client.mqttv3;

import Gc.k;

/* loaded from: classes3.dex */
public class MqttException extends Exception {

    /* renamed from: B, reason: collision with root package name */
    private final int f47313B;

    /* renamed from: C, reason: collision with root package name */
    private Throwable f47314C;

    public MqttException(int i10) {
        this.f47313B = i10;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f47314C;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return k.b(this.f47313B);
    }

    @Override // java.lang.Throwable
    public String toString() {
        String str = getMessage() + " (" + this.f47313B + ")";
        if (this.f47314C == null) {
            return str;
        }
        return str + " - " + this.f47314C.toString();
    }

    public MqttException(Throwable th) {
        this.f47313B = 0;
        this.f47314C = th;
    }

    public MqttException(int i10, Throwable th) {
        this.f47313B = i10;
        this.f47314C = th;
    }
}
