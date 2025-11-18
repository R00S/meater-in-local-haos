package org.eclipse.paho.android.service;

import Jc.u;
import org.eclipse.paho.client.mqttv3.MqttException;

/* compiled from: MqttTokenAndroid.java */
/* loaded from: classes3.dex */
class h implements Fc.e {

    /* renamed from: a, reason: collision with root package name */
    private Fc.a f47299a;

    /* renamed from: b, reason: collision with root package name */
    private volatile boolean f47300b;

    /* renamed from: c, reason: collision with root package name */
    private volatile MqttException f47301c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f47302d;

    /* renamed from: e, reason: collision with root package name */
    private final d f47303e;

    /* renamed from: f, reason: collision with root package name */
    private Object f47304f;

    /* renamed from: g, reason: collision with root package name */
    private final String[] f47305g;

    /* renamed from: h, reason: collision with root package name */
    private Fc.e f47306h;

    /* renamed from: i, reason: collision with root package name */
    private MqttException f47307i;

    h(d dVar, Object obj, Fc.a aVar) {
        this(dVar, obj, aVar, null);
    }

    @Override // Fc.e
    public Fc.a a() {
        return this.f47299a;
    }

    @Override // Fc.e
    public Fc.b b() {
        return this.f47303e;
    }

    @Override // Fc.e
    public void c(Fc.a aVar) {
        this.f47299a = aVar;
    }

    @Override // Fc.e
    public u d() {
        return this.f47306h.d();
    }

    @Override // Fc.e
    public Object e() {
        return this.f47304f;
    }

    void f() {
        synchronized (this.f47302d) {
            try {
                this.f47300b = true;
                this.f47302d.notifyAll();
                Fc.a aVar = this.f47299a;
                if (aVar != null) {
                    aVar.a(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void g(Throwable th) {
        synchronized (this.f47302d) {
            try {
                this.f47300b = true;
                if (th instanceof MqttException) {
                    this.f47307i = (MqttException) th;
                } else {
                    this.f47307i = new MqttException(th);
                }
                this.f47302d.notifyAll();
                if (th instanceof MqttException) {
                    this.f47301c = (MqttException) th;
                }
                Fc.a aVar = this.f47299a;
                if (aVar != null) {
                    aVar.b(this, th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void h(Fc.e eVar) {
        this.f47306h = eVar;
    }

    h(d dVar, Object obj, Fc.a aVar, String[] strArr) {
        this.f47302d = new Object();
        this.f47303e = dVar;
        this.f47304f = obj;
        this.f47299a = aVar;
        this.f47305g = strArr;
    }
}
