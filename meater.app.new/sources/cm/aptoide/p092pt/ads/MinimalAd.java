package cm.aptoide.p092pt.ads;

import cm.aptoide.p092pt.database.room.RoomStore;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: MinimalAd.kt */
@Metadata(m32266d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b4\u0018\u00002\u00020\u0001B¥\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003¢\u0006\u0002\u0010\u001aR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010&\"\u0004\b*\u0010(R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010&\"\u0004\b,\u0010(R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010&\"\u0004\b.\u0010(R\u001a\u0010\u0018\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010&\"\u0004\b0\u0010(R\u001a\u0010\u0017\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\"\"\u0004\b2\u0010$R\u001a\u0010\u0019\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010&\"\u0004\b4\u0010(R\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010&\"\u0004\b6\u0010(R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010&\"\u0004\b<\u0010(R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010=\"\u0004\b>\u0010?R\u001a\u0010\u0012\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u001c\"\u0004\bA\u0010\u001eR\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010&\"\u0004\bC\u0010(R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u001c\"\u0004\bE\u0010\u001eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010&\"\u0004\bG\u0010(R\u001a\u0010\u0011\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u00108\"\u0004\bI\u0010:¨\u0006J"}, m32267d2 = {"Lcm/aptoide/pt/ads/MinimalAd;", HttpUrl.FRAGMENT_ENCODE_SET, "packageName", HttpUrl.FRAGMENT_ENCODE_SET, "networkId", HttpUrl.FRAGMENT_ENCODE_SET, "clickUrl", "cpcUrl", "cpdUrl", "appId", "adId", "cpiUrl", "name", RoomStore.ICON_PATH, "description", RoomStore.DOWNLOADS, HttpUrl.FRAGMENT_ENCODE_SET, "stars", "modified", "isHasAppc", HttpUrl.FRAGMENT_ENCODE_SET, "appcAmount", HttpUrl.FRAGMENT_ENCODE_SET, "currencyAmount", "currency", "currencySymbol", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIJZDDLjava/lang/String;Ljava/lang/String;)V", "getAdId", "()J", "setAdId", "(J)V", "getAppId", "setAppId", "getAppcAmount", "()D", "setAppcAmount", "(D)V", "getClickUrl", "()Ljava/lang/String;", "setClickUrl", "(Ljava/lang/String;)V", "getCpcUrl", "setCpcUrl", "getCpdUrl", "setCpdUrl", "getCpiUrl", "setCpiUrl", "getCurrency", "setCurrency", "getCurrencyAmount", "setCurrencyAmount", "getCurrencySymbol", "setCurrencySymbol", "getDescription", "setDescription", "getDownloads", "()I", "setDownloads", "(I)V", "getIconPath", "setIconPath", "()Z", "setHasAppc", "(Z)V", "getModified", "setModified", "getName", "setName", "getNetworkId", "setNetworkId", "getPackageName", "setPackageName", "getStars", "setStars", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class MinimalAd {
    private long adId;
    private long appId;
    private double appcAmount;
    private String clickUrl;
    private String cpcUrl;
    private String cpdUrl;
    private String cpiUrl;
    private String currency;
    private double currencyAmount;
    private String currencySymbol;
    private String description;
    private int downloads;
    private String iconPath;
    private boolean isHasAppc;
    private long modified;
    private String name;
    private long networkId;
    private String packageName;
    private int stars;

    public MinimalAd(String str, long j2, String str2, String str3, String str4, long j3, long j4, String str5, String str6, String str7, String str8, int i2, int i3, long j5, boolean z, double d2, double d3, String str9, String str10) {
        C9801m.m32346f(str, "packageName");
        C9801m.m32346f(str6, "name");
        C9801m.m32346f(str7, RoomStore.ICON_PATH);
        C9801m.m32346f(str8, "description");
        C9801m.m32346f(str9, "currency");
        C9801m.m32346f(str10, "currencySymbol");
        this.packageName = str;
        this.networkId = j2;
        this.clickUrl = str2;
        this.cpcUrl = str3;
        this.cpdUrl = str4;
        this.appId = j3;
        this.adId = j4;
        this.cpiUrl = str5;
        this.name = str6;
        this.iconPath = str7;
        this.description = str8;
        this.downloads = i2;
        this.stars = i3;
        this.modified = j5;
        this.isHasAppc = z;
        this.appcAmount = d2;
        this.currencyAmount = d3;
        this.currency = str9;
        this.currencySymbol = str10;
    }

    public final long getAdId() {
        return this.adId;
    }

    public final long getAppId() {
        return this.appId;
    }

    public final double getAppcAmount() {
        return this.appcAmount;
    }

    public final String getClickUrl() {
        return this.clickUrl;
    }

    public final String getCpcUrl() {
        return this.cpcUrl;
    }

    public final String getCpdUrl() {
        return this.cpdUrl;
    }

    public final String getCpiUrl() {
        return this.cpiUrl;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final double getCurrencyAmount() {
        return this.currencyAmount;
    }

    public final String getCurrencySymbol() {
        return this.currencySymbol;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getDownloads() {
        return this.downloads;
    }

    public final String getIconPath() {
        return this.iconPath;
    }

    public final long getModified() {
        return this.modified;
    }

    public final String getName() {
        return this.name;
    }

    public final long getNetworkId() {
        return this.networkId;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final int getStars() {
        return this.stars;
    }

    /* renamed from: isHasAppc, reason: from getter */
    public final boolean getIsHasAppc() {
        return this.isHasAppc;
    }

    public final void setAdId(long j2) {
        this.adId = j2;
    }

    public final void setAppId(long j2) {
        this.appId = j2;
    }

    public final void setAppcAmount(double d2) {
        this.appcAmount = d2;
    }

    public final void setClickUrl(String str) {
        this.clickUrl = str;
    }

    public final void setCpcUrl(String str) {
        this.cpcUrl = str;
    }

    public final void setCpdUrl(String str) {
        this.cpdUrl = str;
    }

    public final void setCpiUrl(String str) {
        this.cpiUrl = str;
    }

    public final void setCurrency(String str) {
        C9801m.m32346f(str, "<set-?>");
        this.currency = str;
    }

    public final void setCurrencyAmount(double d2) {
        this.currencyAmount = d2;
    }

    public final void setCurrencySymbol(String str) {
        C9801m.m32346f(str, "<set-?>");
        this.currencySymbol = str;
    }

    public final void setDescription(String str) {
        C9801m.m32346f(str, "<set-?>");
        this.description = str;
    }

    public final void setDownloads(int i2) {
        this.downloads = i2;
    }

    public final void setHasAppc(boolean z) {
        this.isHasAppc = z;
    }

    public final void setIconPath(String str) {
        C9801m.m32346f(str, "<set-?>");
        this.iconPath = str;
    }

    public final void setModified(long j2) {
        this.modified = j2;
    }

    public final void setName(String str) {
        C9801m.m32346f(str, "<set-?>");
        this.name = str;
    }

    public final void setNetworkId(long j2) {
        this.networkId = j2;
    }

    public final void setPackageName(String str) {
        C9801m.m32346f(str, "<set-?>");
        this.packageName = str;
    }

    public final void setStars(int i2) {
        this.stars = i2;
    }
}
