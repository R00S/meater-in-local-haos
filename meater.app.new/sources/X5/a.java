package X5;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000b¨\u0006\u000e"}, d2 = {"LX5/a;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "key", "a", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences;", "preferences", "b", "network_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SharedPreferences preferences;

    public a(Context context) {
        C3862t.g(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences(context.getPackageName() + ".settings.pref", 0);
        C3862t.f(sharedPreferences, "getSharedPreferences(...)");
        this.preferences = sharedPreferences;
    }

    public final String a(String key) {
        C3862t.g(key, "key");
        return this.preferences.getString(key, null);
    }
}
