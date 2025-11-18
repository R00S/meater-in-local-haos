package cm.aptoide.p092pt.app.aptoideinstall;

import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: ComingSoonApp.kt */
@Metadata(m32266d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, m32267d2 = {"Lcm/aptoide/pt/app/aptoideinstall/ComingSoonApp;", HttpUrl.FRAGMENT_ENCODE_SET, "appName", HttpUrl.FRAGMENT_ENCODE_SET, "appIcon", "md5", "storeName", "packageName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppIcon", "()Ljava/lang/String;", "getAppName", "getMd5", "getPackageName", "getStoreName", "component1", "component2", "component3", "component4", "component5", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ComingSoonApp {
    private final String appIcon;
    private final String appName;
    private final String md5;
    private final String packageName;
    private final String storeName;

    public ComingSoonApp(String str, String str2, String str3, String str4, String str5) {
        C9801m.m32346f(str, "appName");
        C9801m.m32346f(str2, "appIcon");
        C9801m.m32346f(str3, "md5");
        C9801m.m32346f(str4, "storeName");
        C9801m.m32346f(str5, "packageName");
        this.appName = str;
        this.appIcon = str2;
        this.md5 = str3;
        this.storeName = str4;
        this.packageName = str5;
    }

    public static /* synthetic */ ComingSoonApp copy$default(ComingSoonApp comingSoonApp, String str, String str2, String str3, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = comingSoonApp.appName;
        }
        if ((i2 & 2) != 0) {
            str2 = comingSoonApp.appIcon;
        }
        String str6 = str2;
        if ((i2 & 4) != 0) {
            str3 = comingSoonApp.md5;
        }
        String str7 = str3;
        if ((i2 & 8) != 0) {
            str4 = comingSoonApp.storeName;
        }
        String str8 = str4;
        if ((i2 & 16) != 0) {
            str5 = comingSoonApp.packageName;
        }
        return comingSoonApp.copy(str, str6, str7, str8, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAppIcon() {
        return this.appIcon;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMd5() {
        return this.md5;
    }

    /* renamed from: component4, reason: from getter */
    public final String getStoreName() {
        return this.storeName;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    public final ComingSoonApp copy(String appName, String appIcon, String md5, String storeName, String packageName) {
        C9801m.m32346f(appName, "appName");
        C9801m.m32346f(appIcon, "appIcon");
        C9801m.m32346f(md5, "md5");
        C9801m.m32346f(storeName, "storeName");
        C9801m.m32346f(packageName, "packageName");
        return new ComingSoonApp(appName, appIcon, md5, storeName, packageName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComingSoonApp)) {
            return false;
        }
        ComingSoonApp comingSoonApp = (ComingSoonApp) other;
        return C9801m.m32341a(this.appName, comingSoonApp.appName) && C9801m.m32341a(this.appIcon, comingSoonApp.appIcon) && C9801m.m32341a(this.md5, comingSoonApp.md5) && C9801m.m32341a(this.storeName, comingSoonApp.storeName) && C9801m.m32341a(this.packageName, comingSoonApp.packageName);
    }

    public final String getAppIcon() {
        return this.appIcon;
    }

    public final String getAppName() {
        return this.appName;
    }

    public final String getMd5() {
        return this.md5;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getStoreName() {
        return this.storeName;
    }

    public int hashCode() {
        return (((((((this.appName.hashCode() * 31) + this.appIcon.hashCode()) * 31) + this.md5.hashCode()) * 31) + this.storeName.hashCode()) * 31) + this.packageName.hashCode();
    }

    public String toString() {
        return "ComingSoonApp(appName=" + this.appName + ", appIcon=" + this.appIcon + ", md5=" + this.md5 + ", storeName=" + this.storeName + ", packageName=" + this.packageName + ')';
    }
}
