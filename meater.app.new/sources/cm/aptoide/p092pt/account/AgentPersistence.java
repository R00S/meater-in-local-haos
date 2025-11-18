package cm.aptoide.p092pt.account;

import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: AgentPersistence.kt */
@Metadata(m32266d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\"\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m32267d2 = {"Lcm/aptoide/pt/account/AgentPersistence;", HttpUrl.FRAGMENT_ENCODE_SET, "secureSharedPreferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "getAgent", HttpUrl.FRAGMENT_ENCODE_SET, "getEmail", "getState", "persistAgent", HttpUrl.FRAGMENT_ENCODE_SET, "agent", "state", "email", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public class AgentPersistence {
    private final SharedPreferences secureSharedPreferences;

    public AgentPersistence(SharedPreferences sharedPreferences) {
        C9801m.m32346f(sharedPreferences, "secureSharedPreferences");
        this.secureSharedPreferences = sharedPreferences;
    }

    public final String getAgent() {
        return this.secureSharedPreferences.getString("AGENT", HttpUrl.FRAGMENT_ENCODE_SET);
    }

    public final String getEmail() {
        return this.secureSharedPreferences.getString("EMAIL", HttpUrl.FRAGMENT_ENCODE_SET);
    }

    public final String getState() {
        return this.secureSharedPreferences.getString("STATE", HttpUrl.FRAGMENT_ENCODE_SET);
    }

    public final void persistAgent(String agent, String state, String email) {
        C9801m.m32346f(state, "state");
        this.secureSharedPreferences.edit().putString("AGENT", agent).putString("STATE", state).putString("EMAIL", email).apply();
    }
}
