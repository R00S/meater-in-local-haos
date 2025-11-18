package cm.aptoide.p092pt.analytics;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Bundle;
import cm.aptoide.analytics.AnalyticsLogger;
import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.p092pt.GmsStatusValueProvider;
import cm.aptoide.p092pt.account.AdultContentAnalytics;
import cm.aptoide.p092pt.networking.IdsRepository;
import cm.aptoide.p092pt.preferences.secure.SecurePreferences;
import com.facebook.p157o0.C5813a0;
import com.google.android.gms.safetynet.HarmfulAppsData;
import com.google.android.gms.safetynet.SafetyNetApi;
import com.google.android.gms.safetynet.SafetyNetClient;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.rakam.api.C9230f;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p241e.p252d.p253a.C8776b;
import p241e.p291f.p292a.p293a.C8956a;
import p456rx.C11231b;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;
import p456rx.schedulers.Schedulers;

/* loaded from: classes.dex */
public class FirstLaunchAnalytics {
    private static final String APTOIDE_PACKAGE = "aptoide_package";
    private static final String CATEGORY = "category";
    private static final String CONTEXT = "APPLICATION";
    private static final String ENTRY_POINT = "Entry Point";
    private static final String ENTRY_POINT_RAKAM = "entry_point";
    public static final String FIRST_LAUNCH = "Aptoide_First_Launch";
    public static final String FIRST_LAUNCH_RAKAM = "aptoide_first_launch";
    private static final String FLAGGED = "flagged";
    private static final String GMS = "GMS";
    private static final String GMS_RAKAM = "gms";
    private static final String IS_ACTIVE = "is_active";
    public static final String PLAY_PROTECT_EVENT = "Google_Play_Protect";
    private static final String TAG = "FirstLaunchAnalytics";
    private static final String UNKNOWN = "unknown";
    private static final String UTM_CAMPAIGN = "UTM Campaign";
    private static final String UTM_CAMPAIGN_RAKAM = "utm_campaign";
    private static final String UTM_CONTENT = "UTM Content";
    private static final String UTM_CONTENT_RAKAM = "utm_content";
    private static final String UTM_MEDIUM = "UTM Medium";
    private static final String UTM_MEDIUM_RAKAM = "utm_medium";
    private static final String UTM_PACKAGE_NAME = "utm_package_name";
    private static final String UTM_SOURCE = "UTM Source";
    private static final String UTM_SOURCE_RAKAM = "utm_source";
    private static final String UTM_TERM_RAKAM = "utm_term";
    private final AnalyticsManager analyticsManager;
    private final GmsStatusValueProvider gmsStatusValueProvider;
    private final AnalyticsLogger logger;
    private final String packageName;
    private final SafetyNetClient safetyNetClient;
    private String utmSource = UNKNOWN;
    private String utmMedium = UNKNOWN;
    private String utmCampaign = UNKNOWN;
    private String utmContent = UNKNOWN;
    private String entryPoint = UNKNOWN;

    public FirstLaunchAnalytics(AnalyticsManager analyticsManager, AnalyticsLogger analyticsLogger, SafetyNetClient safetyNetClient, String str, GmsStatusValueProvider gmsStatusValueProvider) {
        this.analyticsManager = analyticsManager;
        this.logger = analyticsLogger;
        this.safetyNetClient = safetyNetClient;
        this.packageName = str;
        this.gmsStatusValueProvider = gmsStatusValueProvider;
    }

    private JSONObject addFirstLaunchProperties(boolean z, JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("first_session", z);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    private Map<String, Object> createFacebookFirstLaunchDataMap(String str, String str2, String str3, String str4, String str5) {
        HashMap map = new HashMap();
        map.put(UTM_SOURCE, str);
        map.put(UTM_MEDIUM, str2);
        map.put(UTM_CAMPAIGN, str3);
        map.put(UTM_CONTENT, str4);
        map.put(ENTRY_POINT, str5);
        return map;
    }

    private String getCategoryFlaggedByPlayProtect(List<HarmfulAppsData> list) {
        for (HarmfulAppsData harmfulAppsData : list) {
            if (harmfulAppsData.f29439f.equals(this.packageName)) {
                return getPlayProtectCategoryName(harmfulAppsData.f29441h);
            }
        }
        return null;
    }

    private String getPlayProtectCategoryName(int i2) {
        switch (i2) {
            case 1:
                return "RANSOMWARE";
            case 2:
                return "PHISHING";
            case 3:
                return "TROJAN";
            case 4:
                return "UNCOMMON";
            case 5:
                return "FRAUDWARE";
            case 6:
                return "TOLL_FRAUD";
            case 7:
                return "WAP_FRAUD";
            case 8:
                return "CALL_FRAUD";
            case 9:
                return "BACKDOOR";
            case 10:
                return "SPYWARE";
            case 11:
                return "GENERIC_MALWARE";
            case 12:
                return "HARMFUL_SITE";
            case 13:
                return "WINDOWS_MALWARE";
            case 14:
                return "HOSTILE_DOWNLOADER";
            case 15:
                return "NON_ANDROID_THREAT";
            case 16:
                return "ROOTING";
            case 17:
                return "PRIVILEGE_ESCALATION";
            case 18:
                return "TRACKING";
            case 19:
                return "SPAM";
            case 20:
                return "DENIAL_OF_SERVICE";
            case 21:
                return "DATA_COLLECTION";
            default:
                return "UNKNOWN_CATEGORY";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$sendAppStart$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7015a(SharedPreferences sharedPreferences, String str) {
        setupFirstLaunchSuperProperty(SecurePreferences.isFirstRun(sharedPreferences));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$sendAppStart$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7016b(String str) {
        sendPlayProtectEvent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$sendAppStart$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7017c(String str) {
        sendFirstLaunchEvent(this.utmSource, this.utmMedium, this.utmCampaign, this.utmContent, this.entryPoint);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$sendPlayProtectEvent$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7018d(Task task) {
        String categoryFlaggedByPlayProtect;
        boolean z = true;
        boolean z2 = false;
        if (task.mo23651n()) {
            categoryFlaggedByPlayProtect = getCategoryFlaggedByPlayProtect(((SafetyNetApi.HarmfulAppsResponse) task.mo23647j()).m23602h());
            if (categoryFlaggedByPlayProtect != null) {
                z2 = true;
            }
        } else {
            categoryFlaggedByPlayProtect = null;
            z = false;
        }
        HashMap map = new HashMap();
        map.put(IS_ACTIVE, z ? "true" : AdultContentAnalytics.UNLOCK);
        map.put(FLAGGED, z2 ? "true" : AdultContentAnalytics.UNLOCK);
        map.put(CATEGORY, categoryFlaggedByPlayProtect);
        this.analyticsManager.logEvent(map, PLAY_PROTECT_EVENT, AnalyticsManager.Action.OPEN, CONTEXT);
    }

    private void sendFirstLaunchEvent(String str, String str2, String str3, String str4, String str5) {
        AnalyticsManager analyticsManager = this.analyticsManager;
        Map<String, Object> mapCreateFacebookFirstLaunchDataMap = createFacebookFirstLaunchDataMap(str, str2, str3, str4, str5);
        AnalyticsManager.Action action = AnalyticsManager.Action.OPEN;
        analyticsManager.logEvent(mapCreateFacebookFirstLaunchDataMap, FIRST_LAUNCH, action, CONTEXT);
        this.analyticsManager.logEvent(new HashMap(), FIRST_LAUNCH_RAKAM, action, CONTEXT);
    }

    private void sendPlayProtectEvent() {
        this.safetyNetClient.m23603m().mo23639b(new OnCompleteListener() { // from class: cm.aptoide.pt.analytics.a
            @Override // com.google.android.gms.tasks.OnCompleteListener
            /* renamed from: a */
            public final void mo7019a(Task task) {
                this.f7560a.m7018d(task);
            }
        });
    }

    private void setUserProperties(String str, String str2) {
        new Bundle().putString(str, str2);
        C8776b.b.m27938a(str, str2);
    }

    private void setupFirstLaunchSuperProperty(boolean z) {
        C9230f.m29891a().m29950c0(addFirstLaunchProperties(z, C9230f.m29891a().m29962x()));
        HashMap map = new HashMap();
        map.put("first_session", Boolean.valueOf(z));
        map.put(APTOIDE_PACKAGE, this.packageName);
        C8956a.m28530c(map);
    }

    public C11231b sendAppStart(Application application, final SharedPreferences sharedPreferences, IdsRepository idsRepository) {
        return idsRepository.getUniqueIdentifier().m39919g(new InterfaceC11253b() { // from class: cm.aptoide.pt.analytics.f
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                C5813a0.m12163f((String) obj);
            }
        }).m39915A().m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.analytics.e
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7564f.m7015a(sharedPreferences, (String) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.analytics.c
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7562f.m7016b((String) obj);
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.analytics.b
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(SecurePreferences.isFirstRun(sharedPreferences));
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.analytics.d
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7563f.m7017c((String) obj);
            }
        }).m40083X0().m39967K(Schedulers.m40658io());
    }

    public void sendIndicativeFirstLaunchSourceUserProperties(String str, String str2, String str3, String str4, String str5, String str6) {
        HashMap map = new HashMap();
        map.put(GMS_RAKAM, this.gmsStatusValueProvider.getGmsValue());
        map.put(UTM_CONTENT_RAKAM, str);
        map.put(UTM_SOURCE_RAKAM, str2);
        map.put(UTM_CAMPAIGN_RAKAM, str3);
        map.put(UTM_MEDIUM_RAKAM, str4);
        map.put(UTM_TERM_RAKAM, str5);
        map.put(UTM_PACKAGE_NAME, str6);
        C8956a.m28530c(map);
    }

    public void setGmsPresent() {
        setUserProperties(GMS, this.gmsStatusValueProvider.getGmsValue());
    }
}
