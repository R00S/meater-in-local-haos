package G5;

import android.content.SharedPreferences;
import androidx.security.crypto.a;
import androidx.security.crypto.b;
import java.io.IOException;
import java.security.GeneralSecurityException;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import x4.g;

/* compiled from: SecurePreferences.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\u00020\u00072\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ#\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0014¨\u0006\u0016"}, d2 = {"LG5/b;", "", "<init>", "()V", "", "", "keys", "Loa/F;", "b", "([Ljava/lang/String;)V", "key", "value", "c", "(Ljava/lang/String;Ljava/lang/String;)Loa/F;", "d", "(Ljava/lang/String;)Ljava/lang/String;", "", "a", "(Ljava/lang/String;)Z", "Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences;", "preferences", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f4955a = new b();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final SharedPreferences preferences;

    /* renamed from: c, reason: collision with root package name */
    public static final int f4957c;

    static {
        SharedPreferences sharedPreferencesA;
        try {
            androidx.security.crypto.b bVarA = new b.C0404b(g.h(), "_androidx_security_master_key_").b(b.c.AES256_GCM).a();
            C3862t.f(bVarA, "build(...)");
            sharedPreferencesA = androidx.security.crypto.a.a(g.h(), "secure.pref", bVarA, a.d.AES256_SIV, a.e.AES256_GCM);
        } catch (IOException e10) {
            e10.printStackTrace();
            sharedPreferencesA = null;
            preferences = sharedPreferencesA;
            f4957c = 8;
        } catch (GeneralSecurityException e11) {
            e11.printStackTrace();
            sharedPreferencesA = null;
            preferences = sharedPreferencesA;
            f4957c = 8;
        }
        preferences = sharedPreferencesA;
        f4957c = 8;
    }

    private b() {
    }

    public static final boolean a(String key) {
        C3862t.g(key, "key");
        SharedPreferences sharedPreferences = preferences;
        return sharedPreferences != null && sharedPreferences.contains(key);
    }

    public static final void b(String... keys) {
        C3862t.g(keys, "keys");
        SharedPreferences sharedPreferences = preferences;
        SharedPreferences.Editor editorEdit = sharedPreferences != null ? sharedPreferences.edit() : null;
        if (editorEdit != null) {
            for (String str : keys) {
                editorEdit.remove(str);
            }
            editorEdit.apply();
        }
    }

    public static final C4153F c(String key, String value) {
        C3862t.g(key, "key");
        SharedPreferences sharedPreferences = preferences;
        if (sharedPreferences == null) {
            return null;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString(key, value);
        editorEdit.commit();
        return C4153F.f46609a;
    }

    public static final String d(String key) {
        C3862t.g(key, "key");
        SharedPreferences sharedPreferences = preferences;
        if (sharedPreferences != null) {
            return sharedPreferences.getString(key, null);
        }
        return null;
    }
}
