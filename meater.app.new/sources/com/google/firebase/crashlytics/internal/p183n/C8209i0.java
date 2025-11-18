package com.google.firebase.crashlytics.internal.p183n;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.google.firebase.crashlytics.internal.C8179h;
import com.google.firebase.crashlytics.internal.p183n.InterfaceC8211j0;
import com.google.firebase.installations.InterfaceC8385i;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;

/* compiled from: IdManager.java */
/* renamed from: com.google.firebase.crashlytics.h.n.i0 */
/* loaded from: classes2.dex */
public class C8209i0 implements InterfaceC8211j0 {

    /* renamed from: a */
    private static final Pattern f30920a = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: b */
    private static final String f30921b = Pattern.quote("/");

    /* renamed from: c */
    private final C8213k0 f30922c;

    /* renamed from: d */
    private final Context f30923d;

    /* renamed from: e */
    private final String f30924e;

    /* renamed from: f */
    private final InterfaceC8385i f30925f;

    /* renamed from: g */
    private final C8201e0 f30926g;

    /* renamed from: h */
    private InterfaceC8211j0.a f30927h;

    public C8209i0(Context context, String str, InterfaceC8385i interfaceC8385i, C8201e0 c8201e0) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.f30923d = context;
        this.f30924e = str;
        this.f30925f = interfaceC8385i;
        this.f30926g = c8201e0;
        this.f30922c = new C8213k0();
    }

    /* renamed from: b */
    private synchronized String m25254b(String str, SharedPreferences sharedPreferences) {
        String strM25256e;
        strM25256e = m25256e(UUID.randomUUID().toString());
        C8179h.m25176f().m25183i("Created new Crashlytics installation ID: " + strM25256e + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", strM25256e).putString("firebase.installation.id", str).apply();
        return strM25256e;
    }

    /* renamed from: c */
    static String m25255c() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    /* renamed from: e */
    private static String m25256e(String str) {
        if (str == null) {
            return null;
        }
        return f30920a.matcher(str).replaceAll(HttpUrl.FRAGMENT_ENCODE_SET).toLowerCase(Locale.US);
    }

    /* renamed from: k */
    static boolean m25257k(String str) {
        return str != null && str.startsWith("SYN_");
    }

    /* renamed from: l */
    private String m25258l(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", null);
    }

    /* renamed from: m */
    private String m25259m(String str) {
        return str.replaceAll(f30921b, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    /* renamed from: n */
    private boolean m25260n() {
        InterfaceC8211j0.a aVar = this.f30927h;
        return aVar == null || (aVar.mo25271d() == null && this.f30926g.m25239d());
    }

    @Override // com.google.firebase.crashlytics.internal.p183n.InterfaceC8211j0
    /* renamed from: a */
    public synchronized InterfaceC8211j0.a mo25261a() {
        if (!m25260n()) {
            return this.f30927h;
        }
        C8179h.m25176f().m25183i("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferencesM25346q = C8228t.m25346q(this.f30923d);
        String string = sharedPreferencesM25346q.getString("firebase.installation.id", null);
        C8179h.m25176f().m25183i("Cached Firebase Installation ID: " + string);
        if (this.f30926g.m25239d()) {
            String strM25262d = m25262d();
            C8179h.m25176f().m25183i("Fetched Firebase Installation ID: " + strM25262d);
            if (strM25262d == null) {
                strM25262d = string == null ? m25255c() : string;
            }
            if (strM25262d.equals(string)) {
                this.f30927h = InterfaceC8211j0.a.m25268a(m25258l(sharedPreferencesM25346q), strM25262d);
            } else {
                this.f30927h = InterfaceC8211j0.a.m25268a(m25254b(strM25262d, sharedPreferencesM25346q), strM25262d);
            }
        } else if (m25257k(string)) {
            this.f30927h = InterfaceC8211j0.a.m25269b(m25258l(sharedPreferencesM25346q));
        } else {
            this.f30927h = InterfaceC8211j0.a.m25269b(m25254b(m25255c(), sharedPreferencesM25346q));
        }
        C8179h.m25176f().m25183i("Install IDs: " + this.f30927h);
        return this.f30927h;
    }

    /* renamed from: d */
    public String m25262d() {
        try {
            return (String) C8225q0.m25312a(this.f30925f.getId());
        } catch (Exception e2) {
            C8179h.m25176f().m25186l("Failed to retrieve Firebase Installation ID.", e2);
            return null;
        }
    }

    /* renamed from: f */
    public String m25263f() {
        return this.f30924e;
    }

    /* renamed from: g */
    public String m25264g() {
        return this.f30922c.m25273a(this.f30923d);
    }

    /* renamed from: h */
    public String m25265h() {
        return String.format(Locale.US, "%s/%s", m25259m(Build.MANUFACTURER), m25259m(Build.MODEL));
    }

    /* renamed from: i */
    public String m25266i() {
        return m25259m(Build.VERSION.INCREMENTAL);
    }

    /* renamed from: j */
    public String m25267j() {
        return m25259m(Build.VERSION.RELEASE);
    }
}
