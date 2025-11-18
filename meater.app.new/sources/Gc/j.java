package Gc;

import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.paho.client.mqttv3.MqttException;

/* compiled from: LocalNetworkModule.java */
/* loaded from: classes3.dex */
public class j implements m {

    /* renamed from: a, reason: collision with root package name */
    private Class f5138a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5139b;

    /* renamed from: c, reason: collision with root package name */
    private Object f5140c;

    public j(String str) {
        this.f5139b = str;
    }

    @Override // Gc.m
    public String a() {
        return "local://" + this.f5139b;
    }

    @Override // Gc.m
    public OutputStream b() {
        try {
            return (OutputStream) this.f5138a.getMethod("getClientOutputStream", null).invoke(this.f5140c, null);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // Gc.m
    public InputStream c() {
        try {
            return (InputStream) this.f5138a.getMethod("getClientInputStream", null).invoke(this.f5140c, null);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // Gc.m
    public void start() throws MqttException, ClassNotFoundException {
        if (!h.c("com.ibm.mqttdirect.modules.local.bindings.localListener")) {
            throw h.a(32103);
        }
        try {
            Class<?> cls = Class.forName("com.ibm.mqttdirect.modules.local.bindings.localListener");
            this.f5138a = cls;
            this.f5140c = cls.getMethod("connect", String.class).invoke(null, this.f5139b);
        } catch (Exception unused) {
        }
        if (this.f5140c == null) {
            throw h.a(32103);
        }
    }

    @Override // Gc.m
    public void stop() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (this.f5140c != null) {
            try {
                this.f5138a.getMethod("close", null).invoke(this.f5140c, null);
            } catch (Exception unused) {
            }
        }
    }
}
