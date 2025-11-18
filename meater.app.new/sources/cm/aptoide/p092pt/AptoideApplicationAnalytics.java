package cm.aptoide.p092pt;

import android.os.Bundle;
import cm.aptoide.analytics.AnalyticsManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.rakam.api.C9230f;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p241e.p252d.p253a.C8776b;
import p241e.p291f.p292a.p293a.C8956a;

/* loaded from: classes.dex */
public class AptoideApplicationAnalytics {
    private static final String APTOIDE_PACKAGE = "aptoide_package";
    private static final String CONTEXT = "APPLICATION";
    public static final String IS_ANDROID_TV = "Is_Android_Tv";
    private static final String IS_ANDROID_TV_FIELD = "is_android_tv";
    private final AnalyticsManager analyticsManager;
    private final FirebaseAnalytics firebaseAnalytics;

    public AptoideApplicationAnalytics(AnalyticsManager analyticsManager, FirebaseAnalytics firebaseAnalytics) {
        this.analyticsManager = analyticsManager;
        this.firebaseAnalytics = firebaseAnalytics;
    }

    private JSONObject addJsonLoginSuperProperty(boolean z, JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("logged_in", z);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    public void sendIsTvEvent(boolean z) {
        HashMap map = new HashMap();
        map.put(IS_ANDROID_TV_FIELD, Boolean.valueOf(z));
        this.analyticsManager.logEvent(map, IS_ANDROID_TV, AnalyticsManager.Action.AUTO, CONTEXT);
    }

    public void setPackageDimension(String str) {
        new Bundle().putString(APTOIDE_PACKAGE, str);
        C8776b.b.m27938a(APTOIDE_PACKAGE, str);
    }

    public void setVersionCodeDimension(String str) {
        new Bundle().putString("version code", str);
        C8776b.b.m27938a("version code", str);
    }

    public void updateDimension(boolean z) {
        new Bundle().putString("Logged In", z ? "Logged In" : "Not Logged In");
        C8776b.b.m27938a("Logged In", z ? "Logged In" : "Not Logged In");
        C9230f.m29891a().m29950c0(addJsonLoginSuperProperty(z, C9230f.m29891a().m29962x()));
        C8956a.m28533f("logged_in", z);
        this.firebaseAnalytics.m24949b("logged_in", String.valueOf(z));
    }
}
