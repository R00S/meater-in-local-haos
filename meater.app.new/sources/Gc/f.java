package Gc;

import Jc.u;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.eclipse.paho.client.mqttv3.MqttException;

/* compiled from: CommsTokenStore.java */
/* loaded from: classes3.dex */
public class f {

    /* renamed from: d, reason: collision with root package name */
    private static final String f5120d = "Gc.f";

    /* renamed from: e, reason: collision with root package name */
    private static final Kc.b f5121e = Kc.c.a("org.eclipse.paho.client.mqttv3.internal.nls.logcat", f.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final Hashtable<String, Fc.p> f5122a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5123b;

    /* renamed from: c, reason: collision with root package name */
    private MqttException f5124c = null;

    public f(String str) {
        Kc.b bVar = f5121e;
        bVar.d(str);
        this.f5122a = new Hashtable<>();
        this.f5123b = str;
        bVar.c(f5120d, "<Init>", "308");
    }

    public void a() {
        f5121e.g(f5120d, "clear", "305", new Object[]{Integer.valueOf(this.f5122a.size())});
        synchronized (this.f5122a) {
            this.f5122a.clear();
        }
    }

    public int b() {
        int size;
        synchronized (this.f5122a) {
            size = this.f5122a.size();
        }
        return size;
    }

    public Fc.l[] c() {
        Fc.l[] lVarArr;
        synchronized (this.f5122a) {
            try {
                f5121e.c(f5120d, "getOutstandingDelTokens", "311");
                Vector vector = new Vector();
                Enumeration<Fc.p> enumerationElements = this.f5122a.elements();
                while (enumerationElements.hasMoreElements()) {
                    Fc.p pVarNextElement = enumerationElements.nextElement();
                    if (pVarNextElement != null && (pVarNextElement instanceof Fc.l) && !pVarNextElement.f4754a.k()) {
                        vector.addElement(pVarNextElement);
                    }
                }
                lVarArr = (Fc.l[]) vector.toArray(new Fc.l[vector.size()]);
            } catch (Throwable th) {
                throw th;
            }
        }
        return lVarArr;
    }

    public Vector<Fc.p> d() {
        Vector<Fc.p> vector;
        synchronized (this.f5122a) {
            try {
                f5121e.c(f5120d, "getOutstandingTokens", "312");
                vector = new Vector<>();
                Enumeration<Fc.p> enumerationElements = this.f5122a.elements();
                while (enumerationElements.hasMoreElements()) {
                    Fc.p pVarNextElement = enumerationElements.nextElement();
                    if (pVarNextElement != null) {
                        vector.addElement(pVarNextElement);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return vector;
    }

    public Fc.p e(u uVar) {
        return this.f5122a.get(uVar.o());
    }

    public Fc.p f(String str) {
        return this.f5122a.get(str);
    }

    public void g() {
        synchronized (this.f5122a) {
            f5121e.c(f5120d, "open", "310");
            this.f5124c = null;
        }
    }

    protected void h(MqttException mqttException) {
        synchronized (this.f5122a) {
            f5121e.g(f5120d, "quiesce", "309", new Object[]{mqttException});
            this.f5124c = mqttException;
        }
    }

    public Fc.p i(u uVar) {
        if (uVar != null) {
            return j(uVar.o());
        }
        return null;
    }

    public Fc.p j(String str) {
        f5121e.g(f5120d, "removeToken", "306", new Object[]{str});
        if (str != null) {
            return this.f5122a.remove(str);
        }
        return null;
    }

    protected Fc.l k(Jc.o oVar) {
        Fc.l lVar;
        synchronized (this.f5122a) {
            try {
                String string = Integer.valueOf(oVar.p()).toString();
                if (this.f5122a.containsKey(string)) {
                    lVar = (Fc.l) this.f5122a.get(string);
                    f5121e.g(f5120d, "restoreToken", "302", new Object[]{string, oVar, lVar});
                } else {
                    lVar = new Fc.l(this.f5123b);
                    lVar.f4754a.r(string);
                    this.f5122a.put(string, lVar);
                    f5121e.g(f5120d, "restoreToken", "303", new Object[]{string, oVar, lVar});
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return lVar;
    }

    protected void l(Fc.p pVar, u uVar) {
        synchronized (this.f5122a) {
            try {
                MqttException mqttException = this.f5124c;
                if (mqttException != null) {
                    throw mqttException;
                }
                String strO = uVar.o();
                f5121e.g(f5120d, "saveToken", "300", new Object[]{strO, uVar});
                m(pVar, strO);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected void m(Fc.p pVar, String str) {
        synchronized (this.f5122a) {
            f5121e.g(f5120d, "saveToken", "307", new Object[]{str, pVar.toString()});
            pVar.f4754a.r(str);
            this.f5122a.put(str, pVar);
        }
    }

    public String toString() {
        String string;
        String property = System.getProperty("line.separator", "\n");
        StringBuffer stringBuffer = new StringBuffer();
        synchronized (this.f5122a) {
            try {
                Enumeration<Fc.p> enumerationElements = this.f5122a.elements();
                while (enumerationElements.hasMoreElements()) {
                    stringBuffer.append("{" + enumerationElements.nextElement().f4754a + "}" + property);
                }
                string = stringBuffer.toString();
            } catch (Throwable th) {
                throw th;
            }
        }
        return string;
    }
}
