package I9;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: ApplicationInfo.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001b\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001f\u001a\u0004\b\u0016\u0010 ¨\u0006!"}, d2 = {"LI9/b;", "", "", "appId", "deviceModel", "sessionSdkVersion", "osVersion", "LI9/t;", "logEnvironment", "LI9/a;", "androidAppInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LI9/t;LI9/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "f", "d", "e", "LI9/t;", "()LI9/t;", "LI9/a;", "()LI9/a;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: I9.b, reason: case insensitive filesystem and from toString */
/* loaded from: classes2.dex */
public final /* data */ class ApplicationInfo {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String appId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deviceModel;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sessionSdkVersion;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String osVersion;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final t logEnvironment;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final AndroidApplicationInfo androidAppInfo;

    public ApplicationInfo(String appId, String deviceModel, String sessionSdkVersion, String osVersion, t logEnvironment, AndroidApplicationInfo androidAppInfo) {
        C3862t.g(appId, "appId");
        C3862t.g(deviceModel, "deviceModel");
        C3862t.g(sessionSdkVersion, "sessionSdkVersion");
        C3862t.g(osVersion, "osVersion");
        C3862t.g(logEnvironment, "logEnvironment");
        C3862t.g(androidAppInfo, "androidAppInfo");
        this.appId = appId;
        this.deviceModel = deviceModel;
        this.sessionSdkVersion = sessionSdkVersion;
        this.osVersion = osVersion;
        this.logEnvironment = logEnvironment;
        this.androidAppInfo = androidAppInfo;
    }

    /* renamed from: a, reason: from getter */
    public final AndroidApplicationInfo getAndroidAppInfo() {
        return this.androidAppInfo;
    }

    /* renamed from: b, reason: from getter */
    public final String getAppId() {
        return this.appId;
    }

    /* renamed from: c, reason: from getter */
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    /* renamed from: d, reason: from getter */
    public final t getLogEnvironment() {
        return this.logEnvironment;
    }

    /* renamed from: e, reason: from getter */
    public final String getOsVersion() {
        return this.osVersion;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApplicationInfo)) {
            return false;
        }
        ApplicationInfo applicationInfo = (ApplicationInfo) other;
        return C3862t.b(this.appId, applicationInfo.appId) && C3862t.b(this.deviceModel, applicationInfo.deviceModel) && C3862t.b(this.sessionSdkVersion, applicationInfo.sessionSdkVersion) && C3862t.b(this.osVersion, applicationInfo.osVersion) && this.logEnvironment == applicationInfo.logEnvironment && C3862t.b(this.androidAppInfo, applicationInfo.androidAppInfo);
    }

    /* renamed from: f, reason: from getter */
    public final String getSessionSdkVersion() {
        return this.sessionSdkVersion;
    }

    public int hashCode() {
        return (((((((((this.appId.hashCode() * 31) + this.deviceModel.hashCode()) * 31) + this.sessionSdkVersion.hashCode()) * 31) + this.osVersion.hashCode()) * 31) + this.logEnvironment.hashCode()) * 31) + this.androidAppInfo.hashCode();
    }

    public String toString() {
        return "ApplicationInfo(appId=" + this.appId + ", deviceModel=" + this.deviceModel + ", sessionSdkVersion=" + this.sessionSdkVersion + ", osVersion=" + this.osVersion + ", logEnvironment=" + this.logEnvironment + ", androidAppInfo=" + this.androidAppInfo + ')';
    }
}
