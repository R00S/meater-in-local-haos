package Gc;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

/* compiled from: ResourceBundleCatalog.java */
/* loaded from: classes3.dex */
public class n extends k {

    /* renamed from: b, reason: collision with root package name */
    private final ResourceBundle f5149b = ResourceBundle.getBundle("org.eclipse.paho.client.mqttv3.internal.nls.messages");

    @Override // Gc.k
    protected String a(int i10) {
        try {
            return this.f5149b.getString(Integer.toString(i10));
        } catch (MissingResourceException unused) {
            return "MqttException";
        }
    }
}
