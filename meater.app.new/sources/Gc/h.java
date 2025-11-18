package Gc;

import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttSecurityException;

/* compiled from: ExceptionHelper.java */
/* loaded from: classes3.dex */
public class h {
    public static MqttException a(int i10) {
        return (i10 == 4 || i10 == 5) ? new MqttSecurityException(i10) : new MqttException(i10);
    }

    public static MqttException b(Throwable th) {
        return th.getClass().getName().equals("java.security.GeneralSecurityException") ? new MqttSecurityException(th) : new MqttException(th);
    }

    public static boolean c(String str) throws ClassNotFoundException {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
