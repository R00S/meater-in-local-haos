package cm.aptoide.analytics.implementation;

/* loaded from: classes.dex */
public interface CrashLogger {
    void log(String str, String str2);

    void log(Throwable th);
}
