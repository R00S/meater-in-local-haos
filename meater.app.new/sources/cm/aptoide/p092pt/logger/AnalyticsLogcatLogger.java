package cm.aptoide.p092pt.logger;

import cm.aptoide.analytics.AnalyticsLogger;

/* loaded from: classes.dex */
public class AnalyticsLogcatLogger implements AnalyticsLogger {
    @Override // cm.aptoide.analytics.AnalyticsLogger
    public void logDebug(String str, String str2) {
        Logger.getInstance().m8273d(str, str2);
    }

    @Override // cm.aptoide.analytics.AnalyticsLogger
    public void logWarningDebug(String str, String str2) {
        Logger.getInstance().m8285w(str, str2);
    }
}
