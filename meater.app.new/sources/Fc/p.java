package Fc;

import Jc.u;
import org.eclipse.paho.client.mqttv3.MqttException;

/* compiled from: MqttToken.java */
/* loaded from: classes3.dex */
public class p implements e {

    /* renamed from: a, reason: collision with root package name */
    public Gc.q f4754a;

    public p() {
        this.f4754a = null;
    }

    @Override // Fc.e
    public a a() {
        return this.f4754a.a();
    }

    @Override // Fc.e
    public b b() {
        return this.f4754a.b();
    }

    @Override // Fc.e
    public void c(a aVar) {
        this.f4754a.o(aVar);
    }

    @Override // Fc.e
    public u d() {
        return this.f4754a.e();
    }

    @Override // Fc.e
    public Object e() {
        return this.f4754a.g();
    }

    public MqttException f() {
        return this.f4754a.c();
    }

    public boolean g() {
        return this.f4754a.i();
    }

    public void h(Object obj) {
        this.f4754a.w(obj);
    }

    public p(String str) {
        this.f4754a = null;
        this.f4754a = new Gc.q(str);
    }
}
