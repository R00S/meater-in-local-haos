package p345i.p346a;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.util.Collection;
import java.util.Properties;
import p345i.p346a.p347g.C9199l;

/* compiled from: JmDNS.java */
/* renamed from: i.a.a */
/* loaded from: classes2.dex */
public abstract class AbstractC9182a implements Closeable {

    /* renamed from: f */
    public static String f35287f;

    /* compiled from: JmDNS.java */
    /* renamed from: i.a.a$a */
    public interface a {
        /* renamed from: a */
        void m29405a(AbstractC9182a abstractC9182a, Collection<AbstractC9185d> collection);
    }

    static {
        try {
            InputStream resourceAsStream = AbstractC9182a.class.getClassLoader().getResourceAsStream("version.properties");
            try {
                Properties properties = new Properties();
                properties.load(resourceAsStream);
                f35287f = properties.getProperty("jmdns.version");
                resourceAsStream.close();
            } catch (Throwable th) {
                resourceAsStream.close();
                throw th;
            }
        } catch (Exception unused) {
            f35287f = "VERSION MISSING";
        }
    }

    /* renamed from: A */
    public static AbstractC9182a m29402A(InetAddress inetAddress, String str) throws IOException {
        return new C9199l(inetAddress, str);
    }

    /* renamed from: B */
    public abstract void mo29403B();

    /* renamed from: z */
    public abstract void mo29404z(String str, InterfaceC9186e interfaceC9186e);
}
