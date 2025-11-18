package cm.aptoide.p092pt.app;

import kotlin.Metadata;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: AppCoinsAdvertisingModel.kt */
@Metadata(m32266d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\bHÖ\u0001R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, m32267d2 = {"Lcm/aptoide/pt/app/AppCoinsAdvertisingModel;", HttpUrl.FRAGMENT_ENCODE_SET, "appcReward", HttpUrl.FRAGMENT_ENCODE_SET, "hasAdvertising", HttpUrl.FRAGMENT_ENCODE_SET, "fiatReward", "fiatCurrency", HttpUrl.FRAGMENT_ENCODE_SET, "appcBudget", "endDate", "(DZDLjava/lang/String;DLjava/lang/String;)V", "getAppcBudget", "()D", "getAppcReward", "getEndDate", "()Ljava/lang/String;", "getFiatCurrency", "getFiatReward", "getHasAdvertising", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AppCoinsAdvertisingModel {
    private final double appcBudget;
    private final double appcReward;
    private final String endDate;
    private final String fiatCurrency;
    private final double fiatReward;
    private final boolean hasAdvertising;

    public AppCoinsAdvertisingModel() {
        this(0.0d, false, 0.0d, null, 0.0d, null, 63, null);
    }

    public AppCoinsAdvertisingModel(double d2, boolean z, double d3, String str, double d4, String str2) {
        C9801m.m32346f(str, "fiatCurrency");
        C9801m.m32346f(str2, "endDate");
        this.appcReward = d2;
        this.hasAdvertising = z;
        this.fiatReward = d3;
        this.fiatCurrency = str;
        this.appcBudget = d4;
        this.endDate = str2;
    }

    /* renamed from: component1, reason: from getter */
    public final double getAppcReward() {
        return this.appcReward;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getHasAdvertising() {
        return this.hasAdvertising;
    }

    /* renamed from: component3, reason: from getter */
    public final double getFiatReward() {
        return this.fiatReward;
    }

    /* renamed from: component4, reason: from getter */
    public final String getFiatCurrency() {
        return this.fiatCurrency;
    }

    /* renamed from: component5, reason: from getter */
    public final double getAppcBudget() {
        return this.appcBudget;
    }

    /* renamed from: component6, reason: from getter */
    public final String getEndDate() {
        return this.endDate;
    }

    public final AppCoinsAdvertisingModel copy(double appcReward, boolean hasAdvertising, double fiatReward, String fiatCurrency, double appcBudget, String endDate) {
        C9801m.m32346f(fiatCurrency, "fiatCurrency");
        C9801m.m32346f(endDate, "endDate");
        return new AppCoinsAdvertisingModel(appcReward, hasAdvertising, fiatReward, fiatCurrency, appcBudget, endDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppCoinsAdvertisingModel)) {
            return false;
        }
        AppCoinsAdvertisingModel appCoinsAdvertisingModel = (AppCoinsAdvertisingModel) other;
        return C9801m.m32341a(Double.valueOf(this.appcReward), Double.valueOf(appCoinsAdvertisingModel.appcReward)) && this.hasAdvertising == appCoinsAdvertisingModel.hasAdvertising && C9801m.m32341a(Double.valueOf(this.fiatReward), Double.valueOf(appCoinsAdvertisingModel.fiatReward)) && C9801m.m32341a(this.fiatCurrency, appCoinsAdvertisingModel.fiatCurrency) && C9801m.m32341a(Double.valueOf(this.appcBudget), Double.valueOf(appCoinsAdvertisingModel.appcBudget)) && C9801m.m32341a(this.endDate, appCoinsAdvertisingModel.endDate);
    }

    public final double getAppcBudget() {
        return this.appcBudget;
    }

    public final double getAppcReward() {
        return this.appcReward;
    }

    public final String getEndDate() {
        return this.endDate;
    }

    public final String getFiatCurrency() {
        return this.fiatCurrency;
    }

    public final double getFiatReward() {
        return this.fiatReward;
    }

    public final boolean getHasAdvertising() {
        return this.hasAdvertising;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iM7316a = C1965x0.m7316a(this.appcReward) * 31;
        boolean z = this.hasAdvertising;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return ((((((((iM7316a + i2) * 31) + C1965x0.m7316a(this.fiatReward)) * 31) + this.fiatCurrency.hashCode()) * 31) + C1965x0.m7316a(this.appcBudget)) * 31) + this.endDate.hashCode();
    }

    public String toString() {
        return "AppCoinsAdvertisingModel(appcReward=" + this.appcReward + ", hasAdvertising=" + this.hasAdvertising + ", fiatReward=" + this.fiatReward + ", fiatCurrency=" + this.fiatCurrency + ", appcBudget=" + this.appcBudget + ", endDate=" + this.endDate + ')';
    }

    public /* synthetic */ AppCoinsAdvertisingModel(double d2, boolean z, double d3, String str, double d4, String str2, int i2, C9789g c9789g) {
        this((i2 & 1) != 0 ? -1.0d : d2, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? -1.0d : d3, (i2 & 8) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str, (i2 & 16) == 0 ? d4 : -1.0d, (i2 & 32) == 0 ? str2 : HttpUrl.FRAGMENT_ENCODE_SET);
    }
}
