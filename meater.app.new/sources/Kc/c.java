package Kc;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/* compiled from: LoggerFactory.java */
/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f8879a = "Kc.c";

    /* renamed from: b, reason: collision with root package name */
    private static String f8880b;

    /* renamed from: c, reason: collision with root package name */
    private static final String f8881c = a.class.getName();

    public static b a(String str, String str2) {
        String str3 = f8880b;
        if (str3 == null) {
            str3 = f8881c;
        }
        b bVarB = b(str3, ResourceBundle.getBundle("org.eclipse.paho.client.mqttv3.internal.nls.logcat", Locale.US), str2, null);
        if (bVarB != null) {
            return bVarB;
        }
        throw new MissingResourceException("Error locating the logging class", f8879a, str2);
    }

    private static b b(String str, ResourceBundle resourceBundle, String str2, String str3) {
        try {
            b bVar = (b) Class.forName(str).newInstance();
            bVar.b(resourceBundle, str2, str3);
            return bVar;
        } catch (ClassNotFoundException | ExceptionInInitializerError | IllegalAccessException | InstantiationException | NoClassDefFoundError | SecurityException unused) {
            return null;
        }
    }
}
