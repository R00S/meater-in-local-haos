package cm.aptoide.p092pt.crashreports;

import android.util.Log;
import cm.aptoide.analytics.implementation.CrashLogger;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class CrashReport implements CrashLogger {
    private static final String TAG = "cm.aptoide.pt.crashreports.CrashReport";
    private static CrashReport singleton = new CrashReport();
    private ArrayList<CrashLogger> crashLoggers = new ArrayList<>();

    private CrashReport() {
    }

    public static CrashReport getInstance() {
        return singleton;
    }

    private boolean isInitialized() {
        ArrayList<CrashLogger> arrayList = this.crashLoggers;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    public CrashReport addLogger(CrashLogger crashLogger) {
        this.crashLoggers.add(crashLogger);
        return this;
    }

    public CrashLogger getLogger(Class<? extends CrashLogger> cls) {
        if (!isInitialized()) {
            Log.e(TAG, "not initialized");
            return null;
        }
        for (int i2 = 0; i2 < this.crashLoggers.size(); i2++) {
            if (cls.isAssignableFrom(this.crashLoggers.get(i2).getClass())) {
                return this.crashLoggers.get(i2);
            }
        }
        return null;
    }

    @Override // cm.aptoide.analytics.implementation.CrashLogger
    public void log(Throwable th) {
        if (!isInitialized()) {
            Log.e(TAG, "not initialized");
            return;
        }
        for (int i2 = 0; i2 < this.crashLoggers.size(); i2++) {
            this.crashLoggers.get(i2).log(th);
        }
    }

    @Override // cm.aptoide.analytics.implementation.CrashLogger
    public void log(String str, String str2) {
        if (!isInitialized()) {
            Log.e(TAG, "not initialized");
            return;
        }
        for (int i2 = 0; i2 < this.crashLoggers.size(); i2++) {
            this.crashLoggers.get(i2).log(str, str2);
        }
    }
}
