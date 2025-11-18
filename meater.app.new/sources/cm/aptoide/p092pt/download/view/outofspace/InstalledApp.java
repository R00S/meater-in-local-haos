package cm.aptoide.p092pt.download.view.outofspace;

import cm.aptoide.p092pt.aab.C1152a;
import cm.aptoide.p092pt.database.room.RoomInstalled;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: InstalledApp.kt */
@Metadata(m32266d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010\u0017\u001a\u00020\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, m32267d2 = {"Lcm/aptoide/pt/download/view/outofspace/InstalledApp;", HttpUrl.FRAGMENT_ENCODE_SET, "appName", HttpUrl.FRAGMENT_ENCODE_SET, "packageName", RoomInstalled.ICON, "size", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getAppName", "()Ljava/lang/String;", "getIcon", "getPackageName", "getSize", "()J", "component1", "component2", "component3", "component4", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "getIdentifier", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final /* data */ class InstalledApp {
    private final String appName;
    private final String icon;
    private final String packageName;
    private final long size;

    public InstalledApp(String str, String str2, String str3, long j2) {
        C9801m.m32346f(str, "appName");
        C9801m.m32346f(str2, "packageName");
        C9801m.m32346f(str3, RoomInstalled.ICON);
        this.appName = str;
        this.packageName = str2;
        this.icon = str3;
        this.size = j2;
    }

    public static /* synthetic */ InstalledApp copy$default(InstalledApp installedApp, String str, String str2, String str3, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = installedApp.appName;
        }
        if ((i2 & 2) != 0) {
            str2 = installedApp.packageName;
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            str3 = installedApp.icon;
        }
        String str5 = str3;
        if ((i2 & 8) != 0) {
            j2 = installedApp.size;
        }
        return installedApp.copy(str, str4, str5, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* renamed from: component4, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    public final InstalledApp copy(String appName, String packageName, String icon, long size) {
        C9801m.m32346f(appName, "appName");
        C9801m.m32346f(packageName, "packageName");
        C9801m.m32346f(icon, RoomInstalled.ICON);
        return new InstalledApp(appName, packageName, icon, size);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstalledApp)) {
            return false;
        }
        InstalledApp installedApp = (InstalledApp) other;
        return C9801m.m32341a(this.appName, installedApp.appName) && C9801m.m32341a(this.packageName, installedApp.packageName) && C9801m.m32341a(this.icon, installedApp.icon) && this.size == installedApp.size;
    }

    public final String getAppName() {
        return this.appName;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getIdentifier() {
        return this.packageName;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final long getSize() {
        return this.size;
    }

    public int hashCode() {
        return (((((this.appName.hashCode() * 31) + this.packageName.hashCode()) * 31) + this.icon.hashCode()) * 31) + C1152a.m6829a(this.size);
    }

    public String toString() {
        return "InstalledApp(appName=" + this.appName + ", packageName=" + this.packageName + ", icon=" + this.icon + ", size=" + this.size + ')';
    }
}
