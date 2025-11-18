package com.google.firebase.sessions;

import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: ApplicationInfo.kt */
@Metadata(m32266d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006\""}, m32267d2 = {"Lcom/google/firebase/sessions/ApplicationInfo;", HttpUrl.FRAGMENT_ENCODE_SET, "appId", HttpUrl.FRAGMENT_ENCODE_SET, "deviceModel", "sessionSdkVersion", "osVersion", "logEnvironment", "Lcom/google/firebase/sessions/LogEnvironment;", "androidAppInfo", "Lcom/google/firebase/sessions/AndroidApplicationInfo;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/firebase/sessions/LogEnvironment;Lcom/google/firebase/sessions/AndroidApplicationInfo;)V", "getAndroidAppInfo", "()Lcom/google/firebase/sessions/AndroidApplicationInfo;", "getAppId", "()Ljava/lang/String;", "getDeviceModel", "getLogEnvironment", "()Lcom/google/firebase/sessions/LogEnvironment;", "getOsVersion", "getSessionSdkVersion", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "com.google.firebase-firebase-sessions"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: com.google.firebase.sessions.j, reason: from Kotlin metadata and from toString */
/* loaded from: classes2.dex */
public final /* data */ class ApplicationInfo {

    /* renamed from: a, reason: from toString */
    private final String appId;

    /* renamed from: b, reason: from toString */
    private final String deviceModel;

    /* renamed from: c, reason: from toString */
    private final String sessionSdkVersion;

    /* renamed from: d, reason: from toString */
    private final String osVersion;

    /* renamed from: e, reason: from toString */
    private final LogEnvironment logEnvironment;

    /* renamed from: f, reason: from toString */
    private final AndroidApplicationInfo androidAppInfo;

    public ApplicationInfo(String str, String str2, String str3, String str4, LogEnvironment logEnvironment, AndroidApplicationInfo androidApplicationInfo) {
        C9801m.m32346f(str, "appId");
        C9801m.m32346f(str2, "deviceModel");
        C9801m.m32346f(str3, "sessionSdkVersion");
        C9801m.m32346f(str4, "osVersion");
        C9801m.m32346f(logEnvironment, "logEnvironment");
        C9801m.m32346f(androidApplicationInfo, "androidAppInfo");
        this.appId = str;
        this.deviceModel = str2;
        this.sessionSdkVersion = str3;
        this.osVersion = str4;
        this.logEnvironment = logEnvironment;
        this.androidAppInfo = androidApplicationInfo;
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
    public final LogEnvironment getLogEnvironment() {
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
        return C9801m.m32341a(this.appId, applicationInfo.appId) && C9801m.m32341a(this.deviceModel, applicationInfo.deviceModel) && C9801m.m32341a(this.sessionSdkVersion, applicationInfo.sessionSdkVersion) && C9801m.m32341a(this.osVersion, applicationInfo.osVersion) && this.logEnvironment == applicationInfo.logEnvironment && C9801m.m32341a(this.androidAppInfo, applicationInfo.androidAppInfo);
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
