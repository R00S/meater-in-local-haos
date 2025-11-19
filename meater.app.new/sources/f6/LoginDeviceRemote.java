package f6;

import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import p4.DeviceInput;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u001c\b\u0086\b\u0018\u0000 ,2\u00020\u0001:\u0001\u0017BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0018\u001a\u0004\b!\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010\u0010R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\u001c\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b+\u0010'¨\u0006-"}, d2 = {"Lf6/f;", "", "", "id", "appVersion", "model", "osVersion", "osName", "locale", "", "supportsBle52mbitConnections", "supportsBle5LongDistanceConnections", "supportsBle5Advertising", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "getAppVersion", "c", "getModel", "d", "getOsVersion", "e", "getOsName", "f", "getLocale", "g", "Ljava/lang/Boolean;", "getSupportsBle52mbitConnections", "()Ljava/lang/Boolean;", "h", "getSupportsBle5LongDistanceConnections", "i", "getSupportsBle5Advertising", "j", "network_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: f6.f, reason: from toString */
/* loaded from: classes2.dex */
public final /* data */ class LoginDeviceRemote {

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("id")
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("app_version")
    private final String appVersion;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("model")
    private final String model;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("os_version")
    private final String osVersion;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("os_name")
    private final String osName;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("locale")
    private final String locale;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("supports_ble5_2mbit_connections")
    private final Boolean supportsBle52mbitConnections;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("supports_ble5_long_distance_connections")
    private final Boolean supportsBle5LongDistanceConnections;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("supports_ble5_advertising")
    private final Boolean supportsBle5Advertising;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lf6/f$a;", "", "<init>", "()V", "Lp4/e;", "deviceInput", "Lf6/f;", "a", "(Lp4/e;)Lf6/f;", "network_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: f6.f$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final LoginDeviceRemote a(DeviceInput deviceInput) {
            C3862t.g(deviceInput, "deviceInput");
            return new LoginDeviceRemote(deviceInput.getDeviceId(), deviceInput.getAppVersion(), deviceInput.getDeviceModel(), deviceInput.getOsVersion(), deviceInput.getOsName(), deviceInput.getLocale(), deviceInput.getSupportsBle52mbitConnections(), deviceInput.getSupportsBle5LongDistanceConnections(), deviceInput.getSupportsBle5Advertising());
        }

        private Companion() {
        }
    }

    public LoginDeviceRemote(String id2, String appVersion, String model, String osVersion, String osName, String locale, Boolean bool, Boolean bool2, Boolean bool3) {
        C3862t.g(id2, "id");
        C3862t.g(appVersion, "appVersion");
        C3862t.g(model, "model");
        C3862t.g(osVersion, "osVersion");
        C3862t.g(osName, "osName");
        C3862t.g(locale, "locale");
        this.id = id2;
        this.appVersion = appVersion;
        this.model = model;
        this.osVersion = osVersion;
        this.osName = osName;
        this.locale = locale;
        this.supportsBle52mbitConnections = bool;
        this.supportsBle5LongDistanceConnections = bool2;
        this.supportsBle5Advertising = bool3;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoginDeviceRemote)) {
            return false;
        }
        LoginDeviceRemote loginDeviceRemote = (LoginDeviceRemote) other;
        return C3862t.b(this.id, loginDeviceRemote.id) && C3862t.b(this.appVersion, loginDeviceRemote.appVersion) && C3862t.b(this.model, loginDeviceRemote.model) && C3862t.b(this.osVersion, loginDeviceRemote.osVersion) && C3862t.b(this.osName, loginDeviceRemote.osName) && C3862t.b(this.locale, loginDeviceRemote.locale) && C3862t.b(this.supportsBle52mbitConnections, loginDeviceRemote.supportsBle52mbitConnections) && C3862t.b(this.supportsBle5LongDistanceConnections, loginDeviceRemote.supportsBle5LongDistanceConnections) && C3862t.b(this.supportsBle5Advertising, loginDeviceRemote.supportsBle5Advertising);
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.id.hashCode() * 31) + this.appVersion.hashCode()) * 31) + this.model.hashCode()) * 31) + this.osVersion.hashCode()) * 31) + this.osName.hashCode()) * 31) + this.locale.hashCode()) * 31;
        Boolean bool = this.supportsBle52mbitConnections;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.supportsBle5LongDistanceConnections;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.supportsBle5Advertising;
        return iHashCode3 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public String toString() {
        return "LoginDeviceRemote(id=" + this.id + ", appVersion=" + this.appVersion + ", model=" + this.model + ", osVersion=" + this.osVersion + ", osName=" + this.osName + ", locale=" + this.locale + ", supportsBle52mbitConnections=" + this.supportsBle52mbitConnections + ", supportsBle5LongDistanceConnections=" + this.supportsBle5LongDistanceConnections + ", supportsBle5Advertising=" + this.supportsBle5Advertising + ")";
    }
}
