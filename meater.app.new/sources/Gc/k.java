package Gc;

/* compiled from: MessageCatalog.java */
/* loaded from: classes3.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    private static k f5141a;

    public static final String b(int i10) {
        if (f5141a == null) {
            if (h.c("java.util.ResourceBundle")) {
                try {
                    f5141a = (k) n.class.newInstance();
                } catch (Exception unused) {
                    return "";
                }
            } else if (h.c("org.eclipse.paho.client.mqttv3.internal.MIDPCatalog")) {
                try {
                    f5141a = (k) Class.forName("org.eclipse.paho.client.mqttv3.internal.MIDPCatalog").newInstance();
                } catch (Exception unused2) {
                    return "";
                }
            }
        }
        return f5141a.a(i10);
    }

    protected abstract String a(int i10);
}
