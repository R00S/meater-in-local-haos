package cm.aptoide.p092pt.autoupdate;

import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import cm.aptoide.p092pt.database.room.RoomInstalled;
import kotlin.Metadata;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: AutoUpdateModel.kt */
@Metadata(m32266d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\"\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007BK\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003J\t\u0010\"\u001a\u00020\u000bHÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003JY\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010(\u001a\u00020\u00062\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\tHÖ\u0001J\t\u0010+\u001a\u00020\u000bHÖ\u0001J\u0006\u0010,\u001a\u00020\u0006R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0007R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\r\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u000f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u0004R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006-"}, m32267d2 = {"Lcm/aptoide/pt/autoupdate/AutoUpdateModel;", HttpUrl.FRAGMENT_ENCODE_SET, "status", "Lcm/aptoide/pt/autoupdate/Status;", "(Lcm/aptoide/pt/autoupdate/Status;)V", "loading", HttpUrl.FRAGMENT_ENCODE_SET, "(Z)V", RoomInstalled.VERSION_CODE, HttpUrl.FRAGMENT_ENCODE_SET, DeepLinkIntentReceiver.DeepLinksKeys.URI, HttpUrl.FRAGMENT_ENCODE_SET, "md5", "minSdk", "packageName", "shouldUpdate", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcm/aptoide/pt/autoupdate/Status;Z)V", "getLoading", "()Z", "setLoading", "getMd5", "()Ljava/lang/String;", "getMinSdk", "getPackageName", "getShouldUpdate", "getStatus", "()Lcm/aptoide/pt/autoupdate/Status;", "setStatus", "getUri", "getVersionCode", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "wasSuccess", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AutoUpdateModel {
    private boolean loading;
    private final String md5;
    private final String minSdk;
    private final String packageName;
    private final boolean shouldUpdate;
    private Status status;
    private final String uri;
    private final int versionCode;

    public AutoUpdateModel(int i2, String str, String str2, String str3, String str4, boolean z, Status status, boolean z2) {
        C9801m.m32346f(str, DeepLinkIntentReceiver.DeepLinksKeys.URI);
        C9801m.m32346f(str2, "md5");
        C9801m.m32346f(str3, "minSdk");
        C9801m.m32346f(str4, "packageName");
        C9801m.m32346f(status, "status");
        this.versionCode = i2;
        this.uri = str;
        this.md5 = str2;
        this.minSdk = str3;
        this.packageName = str4;
        this.shouldUpdate = z;
        this.status = status;
        this.loading = z2;
    }

    /* renamed from: component1, reason: from getter */
    public final int getVersionCode() {
        return this.versionCode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMd5() {
        return this.md5;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMinSdk() {
        return this.minSdk;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getShouldUpdate() {
        return this.shouldUpdate;
    }

    /* renamed from: component7, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
    }

    public final AutoUpdateModel copy(int versionCode, String uri, String md5, String minSdk, String packageName, boolean shouldUpdate, Status status, boolean loading) {
        C9801m.m32346f(uri, DeepLinkIntentReceiver.DeepLinksKeys.URI);
        C9801m.m32346f(md5, "md5");
        C9801m.m32346f(minSdk, "minSdk");
        C9801m.m32346f(packageName, "packageName");
        C9801m.m32346f(status, "status");
        return new AutoUpdateModel(versionCode, uri, md5, minSdk, packageName, shouldUpdate, status, loading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoUpdateModel)) {
            return false;
        }
        AutoUpdateModel autoUpdateModel = (AutoUpdateModel) other;
        return this.versionCode == autoUpdateModel.versionCode && C9801m.m32341a(this.uri, autoUpdateModel.uri) && C9801m.m32341a(this.md5, autoUpdateModel.md5) && C9801m.m32341a(this.minSdk, autoUpdateModel.minSdk) && C9801m.m32341a(this.packageName, autoUpdateModel.packageName) && this.shouldUpdate == autoUpdateModel.shouldUpdate && this.status == autoUpdateModel.status && this.loading == autoUpdateModel.loading;
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public final String getMd5() {
        return this.md5;
    }

    public final String getMinSdk() {
        return this.minSdk;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final boolean getShouldUpdate() {
        return this.shouldUpdate;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final String getUri() {
        return this.uri;
    }

    public final int getVersionCode() {
        return this.versionCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = ((((((((this.versionCode * 31) + this.uri.hashCode()) * 31) + this.md5.hashCode()) * 31) + this.minSdk.hashCode()) * 31) + this.packageName.hashCode()) * 31;
        boolean z = this.shouldUpdate;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int iHashCode2 = (((iHashCode + i2) * 31) + this.status.hashCode()) * 31;
        boolean z2 = this.loading;
        return iHashCode2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public final void setLoading(boolean z) {
        this.loading = z;
    }

    public final void setStatus(Status status) {
        C9801m.m32346f(status, "<set-?>");
        this.status = status;
    }

    public String toString() {
        return "AutoUpdateModel(versionCode=" + this.versionCode + ", uri=" + this.uri + ", md5=" + this.md5 + ", minSdk=" + this.minSdk + ", packageName=" + this.packageName + ", shouldUpdate=" + this.shouldUpdate + ", status=" + this.status + ", loading=" + this.loading + ')';
    }

    public final boolean wasSuccess() {
        return this.status == Status.SUCCESS;
    }

    public /* synthetic */ AutoUpdateModel(int i2, String str, String str2, String str3, String str4, boolean z, Status status, boolean z2, int i3, C9789g c9789g) {
        this(i2, str, str2, str3, str4, (i3 & 32) != 0 ? false : z, (i3 & 64) != 0 ? Status.SUCCESS : status, (i3 & 128) != 0 ? false : z2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AutoUpdateModel(Status status) {
        this(-1, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, false, status, false, 160, null);
        C9801m.m32346f(status, "status");
    }

    public AutoUpdateModel(boolean z) {
        this(-1, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, false, null, z, 96, null);
    }
}
