package cm.aptoide.p092pt.install;

import android.content.SharedPreferences;
import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import cm.aptoide.p092pt.install.installer.RootCommandOnSubscribe;
import cm.aptoide.p092pt.root.RootAvailabilityManager;
import java.util.HashMap;

/* loaded from: classes.dex */
public class InstallEvents implements InstallerAnalytics {
    private static final String CONCAT = "CONCAT";
    private static final String INSTALLFABRICCONTEXT = "Install_Fabric_Event";
    public static final String IS_INSTALLATION_TYPE_EVENT_NAME = "INSTALLATION_TYPE";
    private static final String IS_ROOT = "IS_ROOT";
    public static final String ROOT_V2_COMPLETE = "Root_v2_Complete";
    public static final String ROOT_V2_START = "Root_v2_Start";
    private static final String SETTING_ROOT = "SETTING_ROOT";
    private final AnalyticsManager analyticsManager;
    private final InstallAnalytics installAnalytics;
    private final NavigationTracker navigationTracker;
    private final RootAvailabilityManager rootAvailabilityManager;
    private final SharedPreferences sharedPreferences;

    public InstallEvents(AnalyticsManager analyticsManager, InstallAnalytics installAnalytics, SharedPreferences sharedPreferences, RootAvailabilityManager rootAvailabilityManager, NavigationTracker navigationTracker) {
        this.analyticsManager = analyticsManager;
        this.installAnalytics = installAnalytics;
        this.sharedPreferences = sharedPreferences;
        this.rootAvailabilityManager = rootAvailabilityManager;
        this.navigationTracker = navigationTracker;
    }

    @Override // cm.aptoide.p092pt.install.InstallerAnalytics
    public void installationType(boolean z, boolean z2) {
        HashMap map = new HashMap();
        map.put(IS_ROOT, String.valueOf(z2));
        map.put(SETTING_ROOT, String.valueOf(z));
        map.put(CONCAT, z + "_" + z2);
        this.analyticsManager.logEvent(map, IS_INSTALLATION_TYPE_EVENT_NAME, AnalyticsManager.Action.ROOT, INSTALLFABRICCONTEXT);
    }

    @Override // cm.aptoide.p092pt.install.InstallerAnalytics
    public void logInstallCancelEvent(String str, int i2) {
        this.installAnalytics.logInstallCancelEvent(str, i2);
    }

    @Override // cm.aptoide.p092pt.install.InstallerAnalytics
    public void rootInstallCancelled() {
        HashMap map = new HashMap();
        map.put("Result", "cancel");
        this.analyticsManager.logEvent(map, ROOT_V2_COMPLETE, AnalyticsManager.Action.ROOT, INSTALLFABRICCONTEXT);
    }

    @Override // cm.aptoide.p092pt.install.InstallerAnalytics
    public void rootInstallCompleted(int i2) {
        HashMap map = new HashMap();
        map.put("Result", RootCommandOnSubscribe.SUCCESS_OUTPUT_CONFIRMATION);
        map.put("Exit_Code", String.valueOf(i2));
        this.analyticsManager.logEvent(map, ROOT_V2_COMPLETE, AnalyticsManager.Action.ROOT, INSTALLFABRICCONTEXT);
    }

    @Override // cm.aptoide.p092pt.install.InstallerAnalytics
    public void rootInstallFail(Exception exc) {
        HashMap map = new HashMap();
        map.put("Result", "fail");
        map.put("Error", exc.getMessage());
        this.analyticsManager.logEvent(map, ROOT_V2_COMPLETE, AnalyticsManager.Action.ROOT, INSTALLFABRICCONTEXT);
    }

    @Override // cm.aptoide.p092pt.install.InstallerAnalytics
    public void rootInstallStart() {
        this.analyticsManager.logEvent(null, ROOT_V2_START, AnalyticsManager.Action.ROOT, INSTALLFABRICCONTEXT);
    }

    @Override // cm.aptoide.p092pt.install.InstallerAnalytics
    public void rootInstallTimeout() {
        HashMap map = new HashMap();
        map.put("Result", "timeout");
        this.analyticsManager.logEvent(map, ROOT_V2_COMPLETE, AnalyticsManager.Action.ROOT, INSTALLFABRICCONTEXT);
    }
}
