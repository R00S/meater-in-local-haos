package cm.aptoide.p092pt.home.apps.model;

import cm.aptoide.p092pt.aab.C1152a;
import cm.aptoide.p092pt.database.room.RoomInstalled;
import cm.aptoide.p092pt.home.apps.App;
import cm.aptoide.p092pt.home.apps.model.StateApp;
import kotlin.Metadata;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: UpdateApp.kt */
@Metadata(m32266d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0010HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\bHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010+\u001a\u00020\u000eHÆ\u0003Jo\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\u0013\u0010-\u001a\u00020\u00102\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\b\u00100\u001a\u00020\u0003H\u0016J\b\u00101\u001a\u000202H\u0016J\t\u00103\u001a\u00020\bHÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0014\u0010\n\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001b¨\u00065"}, m32267d2 = {"Lcm/aptoide/pt/home/apps/model/UpdateApp;", "Lcm/aptoide/pt/home/apps/model/StateApp;", "name", HttpUrl.FRAGMENT_ENCODE_SET, "md5", RoomInstalled.ICON, "packageName", "progress", HttpUrl.FRAGMENT_ENCODE_SET, "version", RoomInstalled.VERSION_CODE, "status", "Lcm/aptoide/pt/home/apps/model/StateApp$Status;", "appId", HttpUrl.FRAGMENT_ENCODE_SET, "isInstalledWithAptoide", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILcm/aptoide/pt/home/apps/model/StateApp$Status;JZ)V", "getAppId", "()J", "getIcon", "()Ljava/lang/String;", "()Z", "getMd5", "getName", "getPackageName", "getProgress", "()I", "getStatus", "()Lcm/aptoide/pt/home/apps/model/StateApp$Status;", "setStatus", "(Lcm/aptoide/pt/home/apps/model/StateApp$Status;)V", "getVersion", "getVersionCode", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "getIdentifier", "getType", "Lcm/aptoide/pt/home/apps/App$Type;", "hashCode", "toString", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final /* data */ class UpdateApp implements StateApp {
    private final long appId;
    private final String icon;
    private final boolean isInstalledWithAptoide;
    private final String md5;
    private final String name;
    private final String packageName;
    private final int progress;
    private StateApp.Status status;
    private final String version;
    private final int versionCode;

    public UpdateApp(String str, String str2, String str3, String str4, int i2, String str5, int i3, StateApp.Status status, long j2, boolean z) {
        C9801m.m32346f(str, "name");
        C9801m.m32346f(str2, "md5");
        C9801m.m32346f(str3, RoomInstalled.ICON);
        C9801m.m32346f(str4, "packageName");
        C9801m.m32346f(str5, "version");
        this.name = str;
        this.md5 = str2;
        this.icon = str3;
        this.packageName = str4;
        this.progress = i2;
        this.version = str5;
        this.versionCode = i3;
        this.status = status;
        this.appId = j2;
        this.isInstalledWithAptoide = z;
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsInstalledWithAptoide() {
        return this.isInstalledWithAptoide;
    }

    public final String component2() {
        return getMd5();
    }

    /* renamed from: component3, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    public final String component4() {
        return getPackageName();
    }

    public final int component5() {
        return getProgress();
    }

    /* renamed from: component6, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    public final int component7() {
        return getVersionCode();
    }

    public final StateApp.Status component8() {
        return getStatus();
    }

    /* renamed from: component9, reason: from getter */
    public final long getAppId() {
        return this.appId;
    }

    public final UpdateApp copy(String name, String md5, String icon, String packageName, int progress, String version, int versionCode, StateApp.Status status, long appId, boolean isInstalledWithAptoide) {
        C9801m.m32346f(name, "name");
        C9801m.m32346f(md5, "md5");
        C9801m.m32346f(icon, RoomInstalled.ICON);
        C9801m.m32346f(packageName, "packageName");
        C9801m.m32346f(version, "version");
        return new UpdateApp(name, md5, icon, packageName, progress, version, versionCode, status, appId, isInstalledWithAptoide);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateApp)) {
            return false;
        }
        UpdateApp updateApp = (UpdateApp) other;
        return C9801m.m32341a(this.name, updateApp.name) && C9801m.m32341a(getMd5(), updateApp.getMd5()) && C9801m.m32341a(this.icon, updateApp.icon) && C9801m.m32341a(getPackageName(), updateApp.getPackageName()) && getProgress() == updateApp.getProgress() && C9801m.m32341a(this.version, updateApp.version) && getVersionCode() == updateApp.getVersionCode() && getStatus() == updateApp.getStatus() && this.appId == updateApp.appId && this.isInstalledWithAptoide == updateApp.isInstalledWithAptoide;
    }

    public final long getAppId() {
        return this.appId;
    }

    public final String getIcon() {
        return this.icon;
    }

    @Override // cm.aptoide.p092pt.home.apps.App
    public String getIdentifier() {
        return getMd5();
    }

    @Override // cm.aptoide.p092pt.home.apps.model.StateApp
    public String getMd5() {
        return this.md5;
    }

    public final String getName() {
        return this.name;
    }

    @Override // cm.aptoide.p092pt.home.apps.model.StateApp
    public String getPackageName() {
        return this.packageName;
    }

    @Override // cm.aptoide.p092pt.home.apps.model.StateApp
    public int getProgress() {
        return this.progress;
    }

    @Override // cm.aptoide.p092pt.home.apps.model.StateApp
    public StateApp.Status getStatus() {
        return this.status;
    }

    @Override // cm.aptoide.p092pt.home.apps.App
    public App.Type getType() {
        return App.Type.UPDATE;
    }

    public final String getVersion() {
        return this.version;
    }

    @Override // cm.aptoide.p092pt.home.apps.model.StateApp
    public int getVersionCode() {
        return this.versionCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = ((((((((((((((((this.name.hashCode() * 31) + getMd5().hashCode()) * 31) + this.icon.hashCode()) * 31) + getPackageName().hashCode()) * 31) + getProgress()) * 31) + this.version.hashCode()) * 31) + getVersionCode()) * 31) + (getStatus() == null ? 0 : getStatus().hashCode())) * 31) + C1152a.m6829a(this.appId)) * 31;
        boolean z = this.isInstalledWithAptoide;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return iHashCode + i2;
    }

    public final boolean isInstalledWithAptoide() {
        return this.isInstalledWithAptoide;
    }

    public void setStatus(StateApp.Status status) {
        this.status = status;
    }

    public String toString() {
        return "UpdateApp(name=" + this.name + ", md5=" + getMd5() + ", icon=" + this.icon + ", packageName=" + getPackageName() + ", progress=" + getProgress() + ", version=" + this.version + ", versionCode=" + getVersionCode() + ", status=" + getStatus() + ", appId=" + this.appId + ", isInstalledWithAptoide=" + this.isInstalledWithAptoide + ')';
    }

    public /* synthetic */ UpdateApp(String str, String str2, String str3, String str4, int i2, String str5, int i3, StateApp.Status status, long j2, boolean z, int i4, C9789g c9789g) {
        this(str, str2, str3, str4, i2, str5, i3, (i4 & 128) != 0 ? null : status, j2, z);
    }
}
