package Hc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.Hashtable;
import java.util.Properties;
import java.util.Vector;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import org.eclipse.paho.client.mqttv3.MqttSecurityException;

/* compiled from: SSLSocketFactoryFactory.java */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    private static final String[] f5823d = {"com.ibm.ssl.protocol", "com.ibm.ssl.contextProvider", "com.ibm.ssl.keyStore", "com.ibm.ssl.keyStorePassword", "com.ibm.ssl.keyStoreType", "com.ibm.ssl.keyStoreProvider", "com.ibm.ssl.keyManager", "com.ibm.ssl.trustStore", "com.ibm.ssl.trustStorePassword", "com.ibm.ssl.trustStoreType", "com.ibm.ssl.trustStoreProvider", "com.ibm.ssl.trustManager", "com.ibm.ssl.enabledCipherSuites", "com.ibm.ssl.clientAuthentication"};

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f5824e = {-99, -89, -39, -128, 5, -72, -119, -100};

    /* renamed from: b, reason: collision with root package name */
    private Properties f5826b;

    /* renamed from: c, reason: collision with root package name */
    private Kc.b f5827c = null;

    /* renamed from: a, reason: collision with root package name */
    private final Hashtable<String, Properties> f5825a = new Hashtable<>();

    private void a(Properties properties) {
        for (String str : properties.keySet()) {
            if (!u(str)) {
                throw new IllegalArgumentException(str + " is not a valid IBM SSL property key.");
            }
        }
    }

    private void b(Properties properties) {
        String property = properties.getProperty("com.ibm.ssl.keyStorePassword");
        if (property != null && !property.startsWith("{xor}")) {
            properties.put("com.ibm.ssl.keyStorePassword", v(property.toCharArray()));
        }
        String property2 = properties.getProperty("com.ibm.ssl.trustStorePassword");
        if (property2 == null || property2.startsWith("{xor}")) {
            return;
        }
        properties.put("com.ibm.ssl.trustStorePassword", v(property2.toCharArray()));
    }

    public static char[] d(String str) {
        if (str == null) {
            return null;
        }
        try {
            byte[] bArrA = b.a(str.substring(5));
            for (int i10 = 0; i10 < bArrA.length; i10++) {
                byte b10 = bArrA[i10];
                byte[] bArr = f5824e;
                bArrA[i10] = (byte) ((b10 ^ bArr[i10 % bArr.length]) & 255);
            }
            return x(bArrA);
        } catch (Exception unused) {
            return null;
        }
    }

    private String k(String str, String str2, String str3) {
        String strL = l(str, str2);
        return (strL == null && str3 != null) ? System.getProperty(str3) : strL;
    }

    private String l(String str, String str2) {
        String property = null;
        Properties properties = str != null ? this.f5825a.get(str) : null;
        if (properties != null && (property = properties.getProperty(str2)) != null) {
            return property;
        }
        Properties properties2 = this.f5826b;
        if (properties2 == null || (property = properties2.getProperty(str2)) != null) {
        }
        return property;
    }

    private SSLContext m(String str) throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyStoreException, CertificateException, KeyManagementException, MqttSecurityException {
        KeyManager[] keyManagers;
        TrustManager[] trustManagers;
        String strN = n(str);
        if (strN == null) {
            strN = "TLS";
        }
        Kc.b bVar = this.f5827c;
        if (bVar != null) {
            bVar.g("org.eclipse.paho.client.mqttv3.internal.security.SSLSocketFactoryFactory", "getSSLContext", "12000", new Object[]{str != null ? str : "null (broker defaults)", strN});
        }
        String strF = f(str);
        try {
            SSLContext sSLContext = strF == null ? SSLContext.getInstance(strN) : SSLContext.getInstance(strN, strF);
            Kc.b bVar2 = this.f5827c;
            if (bVar2 != null) {
                bVar2.g("org.eclipse.paho.client.mqttv3.internal.security.SSLSocketFactoryFactory", "getSSLContext", "12001", new Object[]{str != null ? str : "null (broker defaults)", sSLContext.getProvider().getName()});
            }
            String strK = k(str, "com.ibm.ssl.keyStore", null);
            if (strK == null) {
                strK = k(str, "com.ibm.ssl.keyStore", "javax.net.ssl.keyStore");
            }
            Kc.b bVar3 = this.f5827c;
            if (bVar3 != null) {
                bVar3.g("org.eclipse.paho.client.mqttv3.internal.security.SSLSocketFactoryFactory", "getSSLContext", "12004", new Object[]{str != null ? str : "null (broker defaults)", strK != null ? strK : "null"});
            }
            char[] cArrH = h(str);
            Kc.b bVar4 = this.f5827c;
            if (bVar4 != null) {
                bVar4.g("org.eclipse.paho.client.mqttv3.internal.security.SSLSocketFactoryFactory", "getSSLContext", "12005", new Object[]{str != null ? str : "null (broker defaults)", cArrH != null ? v(cArrH) : "null"});
            }
            String strJ = j(str);
            if (strJ == null) {
                strJ = KeyStore.getDefaultType();
            }
            Kc.b bVar5 = this.f5827c;
            if (bVar5 != null) {
                bVar5.g("org.eclipse.paho.client.mqttv3.internal.security.SSLSocketFactoryFactory", "getSSLContext", "12006", new Object[]{str != null ? str : "null (broker defaults)", strJ != null ? strJ : "null"});
            }
            String defaultAlgorithm = KeyManagerFactory.getDefaultAlgorithm();
            String strI = i(str);
            String strG = g(str);
            if (strG != null) {
                defaultAlgorithm = strG;
            }
            if (strK == null || strJ == null || defaultAlgorithm == null) {
                keyManagers = null;
            } else {
                try {
                    KeyStore keyStore = KeyStore.getInstance(strJ);
                    keyStore.load(new FileInputStream(strK), cArrH);
                    KeyManagerFactory keyManagerFactory = strI != null ? KeyManagerFactory.getInstance(defaultAlgorithm, strI) : KeyManagerFactory.getInstance(defaultAlgorithm);
                    Kc.b bVar6 = this.f5827c;
                    if (bVar6 != null) {
                        bVar6.g("org.eclipse.paho.client.mqttv3.internal.security.SSLSocketFactoryFactory", "getSSLContext", "12010", new Object[]{str != null ? str : "null (broker defaults)", defaultAlgorithm});
                        this.f5827c.g("org.eclipse.paho.client.mqttv3.internal.security.SSLSocketFactoryFactory", "getSSLContext", "12009", new Object[]{str != null ? str : "null (broker defaults)", keyManagerFactory.getProvider().getName()});
                    }
                    keyManagerFactory.init(keyStore, cArrH);
                    keyManagers = keyManagerFactory.getKeyManagers();
                } catch (FileNotFoundException e10) {
                    throw new MqttSecurityException(e10);
                } catch (IOException e11) {
                    throw new MqttSecurityException(e11);
                } catch (KeyStoreException e12) {
                    throw new MqttSecurityException(e12);
                } catch (UnrecoverableKeyException e13) {
                    throw new MqttSecurityException(e13);
                } catch (CertificateException e14) {
                    throw new MqttSecurityException(e14);
                }
            }
            String strP = p(str);
            Kc.b bVar7 = this.f5827c;
            if (bVar7 != null) {
                bVar7.g("org.eclipse.paho.client.mqttv3.internal.security.SSLSocketFactoryFactory", "getSSLContext", "12011", new Object[]{str != null ? str : "null (broker defaults)", strP != null ? strP : "null"});
            }
            char[] cArrQ = q(str);
            Kc.b bVar8 = this.f5827c;
            if (bVar8 != null) {
                bVar8.g("org.eclipse.paho.client.mqttv3.internal.security.SSLSocketFactoryFactory", "getSSLContext", "12012", new Object[]{str != null ? str : "null (broker defaults)", cArrQ != null ? v(cArrQ) : "null"});
            }
            String strS = s(str);
            if (strS == null) {
                strS = KeyStore.getDefaultType();
            }
            Kc.b bVar9 = this.f5827c;
            if (bVar9 != null) {
                bVar9.g("org.eclipse.paho.client.mqttv3.internal.security.SSLSocketFactoryFactory", "getSSLContext", "12013", new Object[]{str != null ? str : "null (broker defaults)", strS != null ? strS : "null"});
            }
            String defaultAlgorithm2 = TrustManagerFactory.getDefaultAlgorithm();
            String strR = r(str);
            String strO = o(str);
            if (strO != null) {
                defaultAlgorithm2 = strO;
            }
            if (strP == null || strS == null || defaultAlgorithm2 == null) {
                trustManagers = null;
            } else {
                try {
                    KeyStore keyStore2 = KeyStore.getInstance(strS);
                    keyStore2.load(new FileInputStream(strP), cArrQ);
                    TrustManagerFactory trustManagerFactory = strR != null ? TrustManagerFactory.getInstance(defaultAlgorithm2, strR) : TrustManagerFactory.getInstance(defaultAlgorithm2);
                    Kc.b bVar10 = this.f5827c;
                    if (bVar10 != null) {
                        bVar10.g("org.eclipse.paho.client.mqttv3.internal.security.SSLSocketFactoryFactory", "getSSLContext", "12017", new Object[]{str != null ? str : "null (broker defaults)", defaultAlgorithm2});
                        Kc.b bVar11 = this.f5827c;
                        if (str == null) {
                            str = "null (broker defaults)";
                        }
                        bVar11.g("org.eclipse.paho.client.mqttv3.internal.security.SSLSocketFactoryFactory", "getSSLContext", "12016", new Object[]{str, trustManagerFactory.getProvider().getName()});
                    }
                    trustManagerFactory.init(keyStore2);
                    trustManagers = trustManagerFactory.getTrustManagers();
                } catch (FileNotFoundException e15) {
                    throw new MqttSecurityException(e15);
                } catch (IOException e16) {
                    throw new MqttSecurityException(e16);
                } catch (KeyStoreException e17) {
                    throw new MqttSecurityException(e17);
                } catch (CertificateException e18) {
                    throw new MqttSecurityException(e18);
                }
            }
            sSLContext.init(keyManagers, trustManagers, null);
            return sSLContext;
        } catch (KeyManagementException e19) {
            throw new MqttSecurityException(e19);
        } catch (NoSuchAlgorithmException e20) {
            throw new MqttSecurityException(e20);
        } catch (NoSuchProviderException e21) {
            throw new MqttSecurityException(e21);
        }
    }

    private boolean u(String str) {
        String[] strArr;
        int i10 = 0;
        while (true) {
            strArr = f5823d;
            if (i10 >= strArr.length || strArr[i10].equals(str)) {
                break;
            }
            i10++;
        }
        return i10 < strArr.length;
    }

    public static String v(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        byte[] bArrW = w(cArr);
        for (int i10 = 0; i10 < bArrW.length; i10++) {
            byte b10 = bArrW[i10];
            byte[] bArr = f5824e;
            bArrW[i10] = (byte) ((b10 ^ bArr[i10 % bArr.length]) & 255);
        }
        return "{xor}" + b.b(bArrW);
    }

    public static byte[] w(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        byte[] bArr = new byte[cArr.length * 2];
        int i10 = 0;
        int i11 = 0;
        while (i10 < cArr.length) {
            int i12 = i11 + 1;
            char c10 = cArr[i10];
            bArr[i11] = (byte) (c10 & 255);
            i11 += 2;
            i10++;
            bArr[i12] = (byte) ((c10 >> '\b') & 255);
        }
        return bArr;
    }

    public static char[] x(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        char[] cArr = new char[bArr.length / 2];
        int i10 = 0;
        int i11 = 0;
        while (i10 < bArr.length) {
            int i12 = i10 + 1;
            int i13 = bArr[i10] & 255;
            i10 += 2;
            cArr[i11] = (char) (i13 + ((bArr[i12] & 255) << 8));
            i11++;
        }
        return cArr;
    }

    public static String[] y(String str) {
        if (str == null) {
            return null;
        }
        Vector vector = new Vector();
        int iIndexOf = str.indexOf(44);
        int i10 = 0;
        while (iIndexOf > -1) {
            vector.add(str.substring(i10, iIndexOf));
            i10 = iIndexOf + 1;
            iIndexOf = str.indexOf(44, i10);
        }
        vector.add(str.substring(i10));
        String[] strArr = new String[vector.size()];
        vector.toArray(strArr);
        return strArr;
    }

    public SSLSocketFactory c(String str) throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyStoreException, CertificateException, KeyManagementException, MqttSecurityException {
        SSLContext sSLContextM = m(str);
        Kc.b bVar = this.f5827c;
        if (bVar != null) {
            bVar.g("org.eclipse.paho.client.mqttv3.internal.security.SSLSocketFactoryFactory", "createSocketFactory", "12020", new Object[]{str != null ? str : "null (broker defaults)", e(str) != null ? k(str, "com.ibm.ssl.enabledCipherSuites", null) : "null (using platform-enabled cipher suites)"});
        }
        return sSLContextM.getSocketFactory();
    }

    public String[] e(String str) {
        return y(k(str, "com.ibm.ssl.enabledCipherSuites", null));
    }

    public String f(String str) {
        return k(str, "com.ibm.ssl.contextProvider", null);
    }

    public String g(String str) {
        return k(str, "com.ibm.ssl.keyManager", "ssl.KeyManagerFactory.algorithm");
    }

    public char[] h(String str) {
        String strK = k(str, "com.ibm.ssl.keyStorePassword", "javax.net.ssl.keyStorePassword");
        if (strK != null) {
            return strK.startsWith("{xor}") ? d(strK) : strK.toCharArray();
        }
        return null;
    }

    public String i(String str) {
        return k(str, "com.ibm.ssl.keyStoreProvider", null);
    }

    public String j(String str) {
        return k(str, "com.ibm.ssl.keyStoreType", "javax.net.ssl.keyStoreType");
    }

    public String n(String str) {
        return k(str, "com.ibm.ssl.protocol", null);
    }

    public String o(String str) {
        return k(str, "com.ibm.ssl.trustManager", "ssl.TrustManagerFactory.algorithm");
    }

    public String p(String str) {
        return k(str, "com.ibm.ssl.trustStore", "javax.net.ssl.trustStore");
    }

    public char[] q(String str) {
        String strK = k(str, "com.ibm.ssl.trustStorePassword", "javax.net.ssl.trustStorePassword");
        if (strK != null) {
            return strK.startsWith("{xor}") ? d(strK) : strK.toCharArray();
        }
        return null;
    }

    public String r(String str) {
        return k(str, "com.ibm.ssl.trustStoreProvider", null);
    }

    public String s(String str) {
        return k(str, "com.ibm.ssl.trustStoreType", null);
    }

    public void t(Properties properties, String str) {
        a(properties);
        Properties properties2 = new Properties();
        properties2.putAll(properties);
        b(properties2);
        if (str != null) {
            this.f5825a.put(str, properties2);
        } else {
            this.f5826b = properties2;
        }
    }
}
