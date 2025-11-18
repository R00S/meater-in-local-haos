package Jc;

import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttPersistenceException;

/* compiled from: MqttPersistableWireMessage.java */
/* loaded from: classes3.dex */
public abstract class h extends u implements Fc.n {
    public h(byte b10) {
        super(b10);
    }

    @Override // Fc.n
    public int a() {
        return 0;
    }

    @Override // Fc.n
    public byte[] b() throws MqttPersistenceException {
        try {
            return n();
        } catch (MqttException e10) {
            throw new MqttPersistenceException(e10.getCause());
        }
    }

    @Override // Fc.n
    public int c() {
        return 0;
    }

    @Override // Fc.n
    public byte[] d() throws MqttPersistenceException {
        try {
            return r();
        } catch (MqttException e10) {
            throw new MqttPersistenceException(e10.getCause());
        }
    }

    @Override // Fc.n
    public int e() {
        return 0;
    }

    @Override // Fc.n
    public int f() {
        return b().length;
    }
}
