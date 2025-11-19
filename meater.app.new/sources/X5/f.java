package X5;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.security.crypto.a;
import androidx.security.crypto.b;
import java.io.IOException;
import java.security.GeneralSecurityException;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00122\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0010¨\u0006\u0013"}, d2 = {"LX5/f;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "key", "b", "(Ljava/lang/String;)Ljava/lang/String;", "value", "Loa/F;", "a", "(Ljava/lang/String;Ljava/lang/String;)Loa/F;", "Landroid/content/Context;", "Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences;", "preferences", "c", "network_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final SharedPreferences preferences;

    public f(Context context) {
        SharedPreferences sharedPreferencesA;
        C3862t.g(context, "context");
        this.context = context;
        try {
            androidx.security.crypto.b bVarA = new b.C0404b(context, "_androidx_security_master_key_").b(b.c.AES256_GCM).a();
            C3862t.f(bVarA, "build(...)");
            sharedPreferencesA = androidx.security.crypto.a.a(context, "secure.pref", bVarA, a.d.AES256_SIV, a.e.AES256_GCM);
        } catch (IOException e10) {
            e10.printStackTrace();
            sharedPreferencesA = null;
            this.preferences = sharedPreferencesA;
        } catch (GeneralSecurityException e11) {
            e11.printStackTrace();
            sharedPreferencesA = null;
            this.preferences = sharedPreferencesA;
        }
        this.preferences = sharedPreferencesA;
    }

    public final C4153F a(String key, String value) {
        C3862t.g(key, "key");
        SharedPreferences sharedPreferences = this.preferences;
        if (sharedPreferences == null) {
            return null;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString(key, value);
        editorEdit.commit();
        return C4153F.f46609a;
    }

    public final String b(String key) {
        C3862t.g(key, "key");
        SharedPreferences sharedPreferences = this.preferences;
        if (sharedPreferences != null) {
            return sharedPreferences.getString(key, null);
        }
        return null;
    }
}
