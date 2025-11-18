package p4;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: DeviceInput.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u0017\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001d\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001b\u0010\u0010R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010 R\u0019\u0010\f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b!\u0010 ¨\u0006#"}, d2 = {"Lp4/e;", "", "", "deviceId", "appVersion", "deviceModel", "osVersion", "osName", "locale", "", "supportsBle52mbitConnections", "supportsBle5LongDistanceConnections", "supportsBle5Advertising", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "f", "e", "g", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "h", "i", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: p4.e, reason: from toString */
/* loaded from: classes.dex */
public final /* data */ class DeviceInput {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deviceId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String appVersion;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deviceModel;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String osVersion;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String osName;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String locale;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean supportsBle52mbitConnections;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean supportsBle5LongDistanceConnections;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean supportsBle5Advertising;

    public DeviceInput(String deviceId, String appVersion, String deviceModel, String osVersion, String osName, String locale, Boolean bool, Boolean bool2, Boolean bool3) {
        C3862t.g(deviceId, "deviceId");
        C3862t.g(appVersion, "appVersion");
        C3862t.g(deviceModel, "deviceModel");
        C3862t.g(osVersion, "osVersion");
        C3862t.g(osName, "osName");
        C3862t.g(locale, "locale");
        this.deviceId = deviceId;
        this.appVersion = appVersion;
        this.deviceModel = deviceModel;
        this.osVersion = osVersion;
        this.osName = osName;
        this.locale = locale;
        this.supportsBle52mbitConnections = bool;
        this.supportsBle5LongDistanceConnections = bool2;
        this.supportsBle5Advertising = bool3;
    }

    /* renamed from: a, reason: from getter */
    public final String getAppVersion() {
        return this.appVersion;
    }

    /* renamed from: b, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* renamed from: c, reason: from getter */
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    /* renamed from: d, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    /* renamed from: e, reason: from getter */
    public final String getOsName() {
        return this.osName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceInput)) {
            return false;
        }
        DeviceInput deviceInput = (DeviceInput) other;
        return C3862t.b(this.deviceId, deviceInput.deviceId) && C3862t.b(this.appVersion, deviceInput.appVersion) && C3862t.b(this.deviceModel, deviceInput.deviceModel) && C3862t.b(this.osVersion, deviceInput.osVersion) && C3862t.b(this.osName, deviceInput.osName) && C3862t.b(this.locale, deviceInput.locale) && C3862t.b(this.supportsBle52mbitConnections, deviceInput.supportsBle52mbitConnections) && C3862t.b(this.supportsBle5LongDistanceConnections, deviceInput.supportsBle5LongDistanceConnections) && C3862t.b(this.supportsBle5Advertising, deviceInput.supportsBle5Advertising);
    }

    /* renamed from: f, reason: from getter */
    public final String getOsVersion() {
        return this.osVersion;
    }

    /* renamed from: g, reason: from getter */
    public final Boolean getSupportsBle52mbitConnections() {
        return this.supportsBle52mbitConnections;
    }

    /* renamed from: h, reason: from getter */
    public final Boolean getSupportsBle5Advertising() {
        return this.supportsBle5Advertising;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.deviceId.hashCode() * 31) + this.appVersion.hashCode()) * 31) + this.deviceModel.hashCode()) * 31) + this.osVersion.hashCode()) * 31) + this.osName.hashCode()) * 31) + this.locale.hashCode()) * 31;
        Boolean bool = this.supportsBle52mbitConnections;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.supportsBle5LongDistanceConnections;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.supportsBle5Advertising;
        return iHashCode3 + (bool3 != null ? bool3.hashCode() : 0);
    }

    /* renamed from: i, reason: from getter */
    public final Boolean getSupportsBle5LongDistanceConnections() {
        return this.supportsBle5LongDistanceConnections;
    }

    public String toString() {
        return "DeviceInput(deviceId=" + this.deviceId + ", appVersion=" + this.appVersion + ", deviceModel=" + this.deviceModel + ", osVersion=" + this.osVersion + ", osName=" + this.osName + ", locale=" + this.locale + ", supportsBle52mbitConnections=" + this.supportsBle52mbitConnections + ", supportsBle5LongDistanceConnections=" + this.supportsBle5LongDistanceConnections + ", supportsBle5Advertising=" + this.supportsBle5Advertising + ")";
    }
}
