package Kc;

import java.text.MessageFormat;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* compiled from: JSR47Logger.java */
/* loaded from: classes3.dex */
public class a implements b {

    /* renamed from: a, reason: collision with root package name */
    private Logger f8873a = null;

    /* renamed from: b, reason: collision with root package name */
    private ResourceBundle f8874b = null;

    /* renamed from: c, reason: collision with root package name */
    private ResourceBundle f8875c = null;

    /* renamed from: d, reason: collision with root package name */
    private String f8876d = null;

    /* renamed from: e, reason: collision with root package name */
    private String f8877e = null;

    /* renamed from: f, reason: collision with root package name */
    private String f8878f = null;

    private String i(ResourceBundle resourceBundle, String str) {
        try {
            return resourceBundle.getString(str);
        } catch (MissingResourceException unused) {
            return str;
        }
    }

    private void k(Level level, String str, String str2, String str3, ResourceBundle resourceBundle, String str4, Object[] objArr, Throwable th) {
        if (str4.indexOf("=====") == -1) {
            str4 = MessageFormat.format(i(resourceBundle, str4), objArr);
        }
        LogRecord logRecord = new LogRecord(level, this.f8877e + ": " + str4);
        logRecord.setSourceClassName(str);
        logRecord.setSourceMethodName(str2);
        logRecord.setLoggerName(this.f8878f);
        if (th != null) {
            logRecord.setThrown(th);
        }
        this.f8873a.log(logRecord);
    }

    private Level l(int i10) {
        switch (i10) {
            case 1:
                return Level.SEVERE;
            case 2:
                return Level.WARNING;
            case 3:
                return Level.INFO;
            case 4:
                return Level.CONFIG;
            case 5:
                return Level.FINE;
            case 6:
                return Level.FINER;
            case 7:
                return Level.FINEST;
            default:
                return null;
        }
    }

    @Override // Kc.b
    public void a(String str, String str2, String str3) {
        m(6, str, str2, str3, null, null);
    }

    @Override // Kc.b
    public void b(ResourceBundle resourceBundle, String str, String str2) {
        this.f8875c = this.f8874b;
        this.f8877e = str2;
        this.f8878f = str;
        this.f8873a = Logger.getLogger(str);
        this.f8874b = resourceBundle;
        this.f8875c = resourceBundle;
        this.f8876d = resourceBundle.getString("0");
    }

    @Override // Kc.b
    public void c(String str, String str2, String str3) {
        m(5, str, str2, str3, null, null);
    }

    @Override // Kc.b
    public void d(String str) {
        this.f8877e = str;
    }

    @Override // Kc.b
    public void e(String str, String str2, String str3, Object[] objArr, Throwable th) {
        m(5, str, str2, str3, objArr, th);
    }

    @Override // Kc.b
    public void f(String str, String str2, String str3, Object[] objArr) {
        j(1, str, str2, str3, objArr, null);
    }

    @Override // Kc.b
    public void g(String str, String str2, String str3, Object[] objArr) {
        m(5, str, str2, str3, objArr, null);
    }

    @Override // Kc.b
    public boolean h(int i10) {
        return this.f8873a.isLoggable(l(i10));
    }

    public void j(int i10, String str, String str2, String str3, Object[] objArr, Throwable th) {
        Level levelL = l(i10);
        if (this.f8873a.isLoggable(levelL)) {
            k(levelL, str, str2, this.f8876d, this.f8874b, str3, objArr, th);
        }
    }

    public void m(int i10, String str, String str2, String str3, Object[] objArr, Throwable th) {
        Level levelL = l(i10);
        if (this.f8873a.isLoggable(levelL)) {
            k(levelL, str, str2, this.f8876d, this.f8875c, str3, objArr, th);
        }
    }
}
