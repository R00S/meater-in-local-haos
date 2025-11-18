package Q8;

import Q8.M;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import k9.InterfaceC3810e;
import z7.C5211m;

/* compiled from: IdManager.java */
/* loaded from: classes2.dex */
public class L implements M {

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f14410g = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: h, reason: collision with root package name */
    private static final String f14411h = Pattern.quote("/");

    /* renamed from: a, reason: collision with root package name */
    private final N f14412a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f14413b;

    /* renamed from: c, reason: collision with root package name */
    private final String f14414c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3810e f14415d;

    /* renamed from: e, reason: collision with root package name */
    private final G f14416e;

    /* renamed from: f, reason: collision with root package name */
    private M.a f14417f;

    public L(Context context, String str, InterfaceC3810e interfaceC3810e, G g10) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.f14413b = context;
        this.f14414c = str;
        this.f14415d = interfaceC3810e;
        this.f14416e = g10;
        this.f14412a = new N();
    }

    private synchronized String b(String str, SharedPreferences sharedPreferences) {
        String strE;
        strE = e(UUID.randomUUID().toString());
        N8.g.f().i("Created new Crashlytics installation ID: " + strE + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", strE).putString("firebase.installation.id", str).apply();
        return strE;
    }

    static String c() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    private static String e(String str) {
        return f14410g.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    static boolean k(String str) {
        return str != null && str.startsWith("SYN_");
    }

    private String l(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", null);
    }

    private String m(String str) {
        return str.replaceAll(f14411h, "");
    }

    private boolean n() {
        M.a aVar = this.f14417f;
        return aVar == null || (aVar.e() == null && this.f14416e.d());
    }

    @Override // Q8.M
    public synchronized M.a a() {
        if (!n()) {
            return this.f14417f;
        }
        N8.g.f().i("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferencesQ = C1622j.q(this.f14413b);
        String string = sharedPreferencesQ.getString("firebase.installation.id", null);
        N8.g.f().i("Cached Firebase Installation ID: " + string);
        if (this.f14416e.d()) {
            FirebaseInstallationId firebaseInstallationIdD = d(false);
            N8.g.f().i("Fetched Firebase Installation ID: " + firebaseInstallationIdD.getFid());
            if (firebaseInstallationIdD.getFid() == null) {
                firebaseInstallationIdD = new FirebaseInstallationId(string == null ? c() : string, null);
            }
            if (Objects.equals(firebaseInstallationIdD.getFid(), string)) {
                this.f14417f = M.a.a(l(sharedPreferencesQ), firebaseInstallationIdD);
            } else {
                this.f14417f = M.a.a(b(firebaseInstallationIdD.getFid(), sharedPreferencesQ), firebaseInstallationIdD);
            }
        } else if (k(string)) {
            this.f14417f = M.a.b(l(sharedPreferencesQ));
        } else {
            this.f14417f = M.a.b(b(c(), sharedPreferencesQ));
        }
        N8.g.f().i("Install IDs: " + this.f14417f);
        return this.f14417f;
    }

    public FirebaseInstallationId d(boolean z10) {
        String strB;
        R8.f.e();
        String str = null;
        if (z10) {
            try {
                strB = ((com.google.firebase.installations.f) C5211m.b(this.f14415d.a(false), 10000L, TimeUnit.MILLISECONDS)).b();
            } catch (Exception e10) {
                N8.g.f().l("Error getting Firebase authentication token.", e10);
            }
        } else {
            strB = null;
        }
        try {
            str = (String) C5211m.b(this.f14415d.c(), 10000L, TimeUnit.MILLISECONDS);
        } catch (Exception e11) {
            N8.g.f().l("Error getting Firebase installation id.", e11);
        }
        return new FirebaseInstallationId(str, strB);
    }

    public String f() {
        return this.f14414c;
    }

    public String g() {
        return this.f14412a.a(this.f14413b);
    }

    public String h() {
        return String.format(Locale.US, "%s/%s", m(Build.MANUFACTURER), m(Build.MODEL));
    }

    public String i() {
        return m(Build.VERSION.INCREMENTAL);
    }

    public String j() {
        return m(Build.VERSION.RELEASE);
    }
}
