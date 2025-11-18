package cm.aptoide.p092pt.crashreports;

import cm.aptoide.analytics.implementation.CrashLogger;
import cm.aptoide.p092pt.logger.Logger;

/* loaded from: classes.dex */
public class ConsoleLogger implements CrashLogger {
    private static final String TAG = "cm.aptoide.pt.crashreports.ConsoleLogger";

    @Override // cm.aptoide.analytics.implementation.CrashLogger
    public void log(Throwable th) {
        Logger.getInstance().m8278e(TAG, "Exception found", th);
    }

    @Override // cm.aptoide.analytics.implementation.CrashLogger
    public void log(String str, String str2) {
        Logger.getInstance().m8285w(TAG, "logString : key: " + str + " , value: " + str2);
    }
}
