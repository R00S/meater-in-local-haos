package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.core.content.C0255a;

/* compiled from: PreferenceManager.java */
/* renamed from: androidx.preference.j */
/* loaded from: classes.dex */
public class C0566j {

    /* renamed from: a */
    private Context f3702a;

    /* renamed from: c */
    private SharedPreferences f3704c;

    /* renamed from: d */
    private AbstractC0561e f3705d;

    /* renamed from: e */
    private SharedPreferences.Editor f3706e;

    /* renamed from: f */
    private boolean f3707f;

    /* renamed from: g */
    private String f3708g;

    /* renamed from: h */
    private int f3709h;

    /* renamed from: j */
    private PreferenceScreen f3711j;

    /* renamed from: k */
    private d f3712k;

    /* renamed from: l */
    private c f3713l;

    /* renamed from: m */
    private a f3714m;

    /* renamed from: n */
    private b f3715n;

    /* renamed from: b */
    private long f3703b = 0;

    /* renamed from: i */
    private int f3710i = 0;

    /* compiled from: PreferenceManager.java */
    /* renamed from: androidx.preference.j$a */
    public interface a {
        void onDisplayPreferenceDialog(Preference preference);
    }

    /* compiled from: PreferenceManager.java */
    /* renamed from: androidx.preference.j$b */
    public interface b {
        void onNavigateToScreen(PreferenceScreen preferenceScreen);
    }

    /* compiled from: PreferenceManager.java */
    /* renamed from: androidx.preference.j$c */
    public interface c {
        boolean onPreferenceTreeClick(Preference preference);
    }

    /* compiled from: PreferenceManager.java */
    /* renamed from: androidx.preference.j$d */
    public static abstract class d {
    }

    public C0566j(Context context) {
        this.f3702a = context;
        m4157q(m4141b(context));
    }

    /* renamed from: b */
    private static String m4141b(Context context) {
        return context.getPackageName() + "_preferences";
    }

    /* renamed from: l */
    private void m4142l(boolean z) {
        SharedPreferences.Editor editor;
        if (!z && (editor = this.f3706e) != null) {
            editor.apply();
        }
        this.f3707f = z;
    }

    /* renamed from: a */
    public <T extends Preference> T m4143a(CharSequence charSequence) {
        PreferenceScreen preferenceScreen = this.f3711j;
        if (preferenceScreen == null) {
            return null;
        }
        return (T) preferenceScreen.m4057b1(charSequence);
    }

    /* renamed from: c */
    SharedPreferences.Editor m4144c() {
        if (this.f3705d != null) {
            return null;
        }
        if (!this.f3707f) {
            return m4151j().edit();
        }
        if (this.f3706e == null) {
            this.f3706e = m4151j().edit();
        }
        return this.f3706e;
    }

    /* renamed from: d */
    long m4145d() {
        long j2;
        synchronized (this) {
            j2 = this.f3703b;
            this.f3703b = 1 + j2;
        }
        return j2;
    }

    /* renamed from: e */
    public b m4146e() {
        return this.f3715n;
    }

    /* renamed from: f */
    public c m4147f() {
        return this.f3713l;
    }

    /* renamed from: g */
    public d m4148g() {
        return this.f3712k;
    }

    /* renamed from: h */
    public AbstractC0561e m4149h() {
        return this.f3705d;
    }

    /* renamed from: i */
    public PreferenceScreen m4150i() {
        return this.f3711j;
    }

    /* renamed from: j */
    public SharedPreferences m4151j() {
        if (m4149h() != null) {
            return null;
        }
        if (this.f3704c == null) {
            this.f3704c = (this.f3710i != 1 ? this.f3702a : C0255a.m1673b(this.f3702a)).getSharedPreferences(this.f3708g, this.f3709h);
        }
        return this.f3704c;
    }

    /* renamed from: k */
    public PreferenceScreen m4152k(Context context, int i2, PreferenceScreen preferenceScreen) {
        m4142l(true);
        PreferenceScreen preferenceScreen2 = (PreferenceScreen) new C0565i(context, this).m4137d(i2, preferenceScreen);
        preferenceScreen2.m4032i0(this);
        m4142l(false);
        return preferenceScreen2;
    }

    /* renamed from: m */
    public void m4153m(a aVar) {
        this.f3714m = aVar;
    }

    /* renamed from: n */
    public void m4154n(b bVar) {
        this.f3715n = bVar;
    }

    /* renamed from: o */
    public void m4155o(c cVar) {
        this.f3713l = cVar;
    }

    /* renamed from: p */
    public boolean m4156p(PreferenceScreen preferenceScreen) {
        PreferenceScreen preferenceScreen2 = this.f3711j;
        if (preferenceScreen == preferenceScreen2) {
            return false;
        }
        if (preferenceScreen2 != null) {
            preferenceScreen2.mo4036n0();
        }
        this.f3711j = preferenceScreen;
        return true;
    }

    /* renamed from: q */
    public void m4157q(String str) {
        this.f3708g = str;
        this.f3704c = null;
    }

    /* renamed from: r */
    boolean m4158r() {
        return !this.f3707f;
    }

    /* renamed from: s */
    public void m4159s(Preference preference) {
        a aVar = this.f3714m;
        if (aVar != null) {
            aVar.onDisplayPreferenceDialog(preference);
        }
    }
}
