package n1;

import android.os.Build;
import android.os.ext.SdkExtensions;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: BuildCompat.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\rR\u0014\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0012\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0014\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\r¨\u0006\u0015"}, d2 = {"Ln1/a;", "", "<init>", "()V", "", "codename", "buildCodename", "", "a", "(Ljava/lang/String;Ljava/lang/String;)Z", "b", "()Z", "", "I", "R_EXTENSION_INT", "c", "S_EXTENSION_INT", "d", "T_EXTENSION_INT", "e", "AD_SERVICES_EXTENSION_INT", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: n1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4052a {

    /* renamed from: a, reason: collision with root package name */
    public static final C4052a f45586a = new C4052a();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final int R_EXTENSION_INT;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final int S_EXTENSION_INT;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final int T_EXTENSION_INT;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final int AD_SERVICES_EXTENSION_INT;

    /* compiled from: BuildCompat.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ln1/a$a;", "", "<init>", "()V", "", "extension", "a", "(I)I", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: n1.a$a, reason: collision with other inner class name */
    private static final class C0618a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0618a f45591a = new C0618a();

        private C0618a() {
        }

        public final int a(int extension) {
            return SdkExtensions.getExtensionVersion(extension);
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        R_EXTENSION_INT = i10 >= 30 ? C0618a.f45591a.a(30) : 0;
        S_EXTENSION_INT = i10 >= 30 ? C0618a.f45591a.a(31) : 0;
        T_EXTENSION_INT = i10 >= 30 ? C0618a.f45591a.a(33) : 0;
        AD_SERVICES_EXTENSION_INT = i10 >= 30 ? C0618a.f45591a.a(1000000) : 0;
    }

    private C4052a() {
    }

    public static final boolean a(String codename, String buildCodename) {
        C3862t.g(codename, "codename");
        C3862t.g(buildCodename, "buildCodename");
        if (C3862t.b("REL", buildCodename)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String upperCase = buildCodename.toUpperCase(locale);
        C3862t.f(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String upperCase2 = codename.toUpperCase(locale);
        C3862t.f(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase.compareTo(upperCase2) >= 0;
    }

    public static final boolean b() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 35) {
            if (i10 >= 34) {
                String CODENAME = Build.VERSION.CODENAME;
                C3862t.f(CODENAME, "CODENAME");
                if (a("VanillaIceCream", CODENAME)) {
                }
            }
            return false;
        }
        return true;
    }
}
