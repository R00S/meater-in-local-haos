package Mc;

import Kc.c;
import java.util.Enumeration;
import java.util.Properties;

/* compiled from: Debug.java */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f12193a;

    /* renamed from: b, reason: collision with root package name */
    private static final Kc.b f12194b;

    /* renamed from: c, reason: collision with root package name */
    private static final String f12195c;

    static {
        String name = Gc.a.class.getName();
        f12193a = name;
        f12194b = c.a("org.eclipse.paho.client.mqttv3.internal.nls.logcat", name);
        f12195c = System.getProperty("line.separator", "\n");
    }

    public static String a(Properties properties, String str) {
        StringBuffer stringBuffer = new StringBuffer();
        Enumeration<?> enumerationPropertyNames = properties.propertyNames();
        StringBuilder sb2 = new StringBuilder();
        String str2 = f12195c;
        sb2.append(str2);
        sb2.append("==============");
        sb2.append(" ");
        sb2.append(str);
        sb2.append(" ");
        sb2.append("==============");
        sb2.append(str2);
        stringBuffer.append(sb2.toString());
        while (enumerationPropertyNames.hasMoreElements()) {
            String str3 = (String) enumerationPropertyNames.nextElement();
            stringBuffer.append(b(str3, 28, ' ') + ":  " + properties.get(str3) + f12195c);
        }
        stringBuffer.append("==========================================" + f12195c);
        return stringBuffer.toString();
    }

    public static String b(String str, int i10, char c10) {
        if (str.length() >= i10) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer(i10);
        stringBuffer.append(str);
        int length = i10 - str.length();
        while (true) {
            length--;
            if (length < 0) {
                return stringBuffer.toString();
            }
            stringBuffer.append(c10);
        }
    }
}
