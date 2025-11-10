package com.apptionlabs.meater_app.versions;

import android.app.Activity;
import com.apptionlabs.meater_app.views.e0;
import f8.l0;
import j6.e;

/* loaded from: /tmp/meat/meat/classes.dex */
public class AppVersion {
    private static boolean appVersionChecked = false;

    public static void appVersionCheck(final Activity activity, String str, int i10) {
        e0.AlertPair alertPair;
        if (!appVersionChecked) {
            appVersionChecked = true;
            final String trim = str.trim();
            if (l0.d("4.3.1", trim) < 0 && !activity.isFinishing()) {
                int h10 = com.apptionlabs.meater_app.app.a.u().h(trim);
                e0.Companion companion = e0.INSTANCE;
                String string = activity.getString(2132017622);
                String string2 = activity.getString(2132017621);
                e0.AlertPair alertPair2 = new e0.AlertPair(activity.getString(2132018340), new e() { // from class: com.apptionlabs.meater_app.versions.a
                    @Override // j6.e
                    public final void a() {
                        l0.C(activity);
                    }
                });
                if (i10 > 0 && h10 < i10) {
                    alertPair = new e0.AlertPair(activity.getString(2132018727), new e() { // from class: com.apptionlabs.meater_app.versions.b
                        @Override // j6.e
                        public final void a() {
                            AppVersion.lambda$appVersionCheck$1(trim);
                        }
                    });
                } else {
                    alertPair = null;
                }
                companion.e(activity, string, string2, false, alertPair2, alertPair, null).show();
            }
        }
    }

    public static boolean hasAppUpdate(String str) {
        if (str == null || l0.d("4.3.1", str.trim()) >= 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$appVersionCheck$1(String str) {
        com.apptionlabs.meater_app.app.a.u().W(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$tellUserAboutUpdatedVersionOfMEATERIfPossible$3(String str) {
        com.apptionlabs.meater_app.app.a.u().W(str);
    }

    public static void promptToUpdateApp(Activity activity) {
        tellUserAboutUpdatedVersionOfMEATERIfPossible(activity);
    }

    public static void resetAppVersion() {
        appVersionChecked = false;
    }

    public static void tellUserAboutUpdatedVersionOfMEATERIfPossible(final Activity activity) {
        e0.AlertPair alertPair;
        if (!appVersionChecked) {
            appVersionChecked = true;
            final String trim = FirmwareVersion.sharedInstance().getmVersions().app.version.trim();
            int i10 = FirmwareVersion.sharedInstance().getmVersions().app.permittedSkips;
            if (!activity.isFinishing()) {
                int h10 = com.apptionlabs.meater_app.app.a.u().h(trim);
                e0.Companion companion = e0.INSTANCE;
                String string = activity.getString(2132017622);
                String string2 = activity.getString(2132017621);
                e0.AlertPair alertPair2 = new e0.AlertPair(activity.getString(2132018340), new e() { // from class: com.apptionlabs.meater_app.versions.c
                    @Override // j6.e
                    public final void a() {
                        l0.C(activity);
                    }
                });
                if (i10 > 0 && h10 < i10) {
                    alertPair = new e0.AlertPair(activity.getString(2132018727), new e() { // from class: com.apptionlabs.meater_app.versions.d
                        @Override // j6.e
                        public final void a() {
                            AppVersion.lambda$tellUserAboutUpdatedVersionOfMEATERIfPossible$3(trim);
                        }
                    });
                } else {
                    alertPair = null;
                }
                companion.e(activity, string, string2, false, alertPair2, alertPair, null).show();
            }
        }
    }
}
