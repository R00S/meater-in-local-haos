package p355k.p357b.p360g;

import cm.aptoide.p092pt.dataprovider.model.p096v7.Malware;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import p355k.p357b.p359f.AbstractC9740b;
import p355k.p357b.p359f.C9739a;
import p355k.p357b.p359f.C9741c;
import p355k.p357b.p359f.C9747i;

/* compiled from: SimpleLogger.java */
/* renamed from: k.b.g.a */
/* loaded from: classes3.dex */
public class C9748a extends AbstractC9740b {

    /* renamed from: g */
    private static long f37144g = System.currentTimeMillis();

    /* renamed from: h */
    private static final Properties f37145h = new Properties();

    /* renamed from: i */
    private static boolean f37146i = false;

    /* renamed from: j */
    private static int f37147j = 20;

    /* renamed from: k */
    private static boolean f37148k = false;

    /* renamed from: l */
    private static String f37149l = null;

    /* renamed from: m */
    private static DateFormat f37150m = null;

    /* renamed from: n */
    private static boolean f37151n = true;

    /* renamed from: o */
    private static boolean f37152o = true;

    /* renamed from: p */
    private static boolean f37153p = false;

    /* renamed from: q */
    private static String f37154q = "System.err";

    /* renamed from: r */
    private static PrintStream f37155r = null;

    /* renamed from: s */
    private static boolean f37156s = false;

    /* renamed from: t */
    private static String f37157t = "WARN";

    /* renamed from: u */
    protected int f37158u;

    /* renamed from: v */
    private transient String f37159v = null;

    /* compiled from: SimpleLogger.java */
    /* renamed from: k.b.g.a$a */
    static class a implements PrivilegedAction<InputStream> {
        a() {
        }

        @Override // java.security.PrivilegedAction
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public InputStream run() {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            return contextClassLoader != null ? contextClassLoader.getResourceAsStream("simplelogger.properties") : ClassLoader.getSystemResourceAsStream("simplelogger.properties");
        }
    }

    C9748a(String str) {
        this.f37158u = 20;
        this.f37133f = str;
        String strM32259v = m32259v();
        if (strM32259v != null) {
            this.f37158u = m32257w(strM32259v);
        } else {
            this.f37158u = f37147j;
        }
    }

    /* renamed from: k */
    private String m32247k() {
        String str = this.f37133f;
        return str.substring(str.lastIndexOf(".") + 1);
    }

    /* renamed from: l */
    private static PrintStream m32248l(String str) {
        if ("System.err".equalsIgnoreCase(str)) {
            return System.err;
        }
        if ("System.out".equalsIgnoreCase(str)) {
            return System.out;
        }
        try {
            return new PrintStream(new FileOutputStream(str));
        } catch (FileNotFoundException e2) {
            C9747i.m32244b("Could not open [" + str + "]. Defaulting to System.err", e2);
            return System.err;
        }
    }

    /* renamed from: m */
    private void m32249m(int i2, String str, Object obj, Object obj2) {
        if (m32258s(i2)) {
            C9739a c9739aM32221i = C9741c.m32221i(str, obj, obj2);
            m32256u(i2, c9739aM32221i.m32210a(), c9739aM32221i.m32211b());
        }
    }

    /* renamed from: n */
    private static boolean m32250n(String str, boolean z) {
        String strM32252p = m32252p(str);
        return strM32252p == null ? z : "true".equalsIgnoreCase(strM32252p);
    }

    /* renamed from: o */
    private String m32251o() {
        String str;
        Date date = new Date();
        synchronized (f37150m) {
            str = f37150m.format(date);
        }
        return str;
    }

    /* renamed from: p */
    private static String m32252p(String str) {
        String property;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        return property == null ? f37145h.getProperty(str) : property;
    }

    /* renamed from: q */
    private static String m32253q(String str, String str2) {
        String strM32252p = m32252p(str);
        return strM32252p == null ? str2 : strM32252p;
    }

    /* renamed from: r */
    static void m32254r() throws IOException {
        if (f37146i) {
            return;
        }
        f37146i = true;
        m32255t();
        String strM32253q = m32253q("org.slf4j.simpleLogger.defaultLogLevel", null);
        if (strM32253q != null) {
            f37147j = m32257w(strM32253q);
        }
        f37152o = m32250n("org.slf4j.simpleLogger.showLogName", f37152o);
        f37153p = m32250n("org.slf4j.simpleLogger.showShortLogName", f37153p);
        f37148k = m32250n("org.slf4j.simpleLogger.showDateTime", f37148k);
        f37151n = m32250n("org.slf4j.simpleLogger.showThreadName", f37151n);
        f37149l = m32253q("org.slf4j.simpleLogger.dateTimeFormat", f37149l);
        f37156s = m32250n("org.slf4j.simpleLogger.levelInBrackets", f37156s);
        f37157t = m32253q("org.slf4j.simpleLogger.warnLevelString", f37157t);
        String strM32253q2 = m32253q("org.slf4j.simpleLogger.logFile", f37154q);
        f37154q = strM32253q2;
        f37155r = m32248l(strM32253q2);
        if (f37149l != null) {
            try {
                f37150m = new SimpleDateFormat(f37149l);
            } catch (IllegalArgumentException e2) {
                C9747i.m32244b("Bad date format in simplelogger.properties; will output relative time", e2);
            }
        }
    }

    /* renamed from: t */
    private static void m32255t() throws IOException {
        InputStream inputStream = (InputStream) AccessController.doPrivileged(new a());
        if (inputStream != null) {
            try {
                f37145h.load(inputStream);
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: u */
    private void m32256u(int i2, String str, Throwable th) {
        if (m32258s(i2)) {
            StringBuilder sb = new StringBuilder(32);
            if (f37148k) {
                if (f37150m != null) {
                    sb.append(m32251o());
                    sb.append(' ');
                } else {
                    sb.append(System.currentTimeMillis() - f37144g);
                    sb.append(' ');
                }
            }
            if (f37151n) {
                sb.append('[');
                sb.append(Thread.currentThread().getName());
                sb.append("] ");
            }
            if (f37156s) {
                sb.append('[');
            }
            if (i2 == 0) {
                sb.append("TRACE");
            } else if (i2 == 10) {
                sb.append("DEBUG");
            } else if (i2 == 20) {
                sb.append("INFO");
            } else if (i2 == 30) {
                sb.append(f37157t);
            } else if (i2 == 40) {
                sb.append("ERROR");
            }
            if (f37156s) {
                sb.append(']');
            }
            sb.append(' ');
            if (f37153p) {
                if (this.f37159v == null) {
                    this.f37159v = m32247k();
                }
                sb.append(String.valueOf(this.f37159v));
                sb.append(" - ");
            } else if (f37152o) {
                sb.append(String.valueOf(this.f37133f));
                sb.append(" - ");
            }
            sb.append(str);
            m32260x(sb, th);
        }
    }

    /* renamed from: w */
    private static int m32257w(String str) {
        if ("trace".equalsIgnoreCase(str)) {
            return 0;
        }
        if ("debug".equalsIgnoreCase(str)) {
            return 10;
        }
        if ("info".equalsIgnoreCase(str)) {
            return 20;
        }
        if (Malware.WARN.equalsIgnoreCase(str)) {
            return 30;
        }
        return "error".equalsIgnoreCase(str) ? 40 : 20;
    }

    @Override // p355k.p357b.InterfaceC9732b
    /* renamed from: a */
    public void mo32172a(String str, Object obj, Object obj2) {
        m32249m(10, str, obj, obj2);
    }

    @Override // p355k.p357b.InterfaceC9732b
    /* renamed from: b */
    public boolean mo32173b() {
        return m32258s(10);
    }

    @Override // p355k.p357b.InterfaceC9732b
    /* renamed from: c */
    public void mo32174c(String str) {
        m32256u(10, str, null);
    }

    @Override // p355k.p357b.InterfaceC9732b
    /* renamed from: d */
    public boolean mo32175d() {
        return m32258s(0);
    }

    @Override // p355k.p357b.InterfaceC9732b
    /* renamed from: e */
    public void mo32176e(String str, Throwable th) {
        m32256u(20, str, th);
    }

    @Override // p355k.p357b.InterfaceC9732b
    /* renamed from: f */
    public void mo32177f(String str, Throwable th) {
        m32256u(30, str, th);
    }

    @Override // p355k.p357b.InterfaceC9732b
    /* renamed from: g */
    public void mo32178g(String str, Throwable th) {
        m32256u(10, str, th);
    }

    @Override // p355k.p357b.InterfaceC9732b
    /* renamed from: h */
    public void mo32179h(String str) {
        m32256u(30, str, null);
    }

    @Override // p355k.p357b.InterfaceC9732b
    /* renamed from: i */
    public void mo32180i(String str) {
        m32256u(0, str, null);
    }

    /* renamed from: s */
    protected boolean m32258s(int i2) {
        return i2 >= this.f37158u;
    }

    /* renamed from: v */
    String m32259v() {
        String strSubstring = this.f37133f;
        int length = strSubstring.length();
        String strM32253q = null;
        while (strM32253q == null && length > -1) {
            strSubstring = strSubstring.substring(0, length);
            strM32253q = m32253q("org.slf4j.simpleLogger.log." + strSubstring, null);
            length = String.valueOf(strSubstring).lastIndexOf(".");
        }
        return strM32253q;
    }

    /* renamed from: x */
    void m32260x(StringBuilder sb, Throwable th) {
        f37155r.println(sb.toString());
        if (th != null) {
            th.printStackTrace(f37155r);
        }
        f37155r.flush();
    }
}
