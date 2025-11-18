package cm.aptoide.p092pt.wallet;

import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: WalletInstallConfiguration.kt */
@Metadata(m32266d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m32267d2 = {"Lcm/aptoide/pt/wallet/WalletInstallConfiguration;", HttpUrl.FRAGMENT_ENCODE_SET, "appPackageName", HttpUrl.FRAGMENT_ENCODE_SET, "walletPackageName", "(Ljava/lang/String;Ljava/lang/String;)V", "getAppPackageName", "()Ljava/lang/String;", "getWalletPackageName", "component1", "component2", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final /* data */ class WalletInstallConfiguration {
    private final String appPackageName;
    private final String walletPackageName;

    public WalletInstallConfiguration(String str, String str2) {
        C9801m.m32346f(str2, "walletPackageName");
        this.appPackageName = str;
        this.walletPackageName = str2;
    }

    public static /* synthetic */ WalletInstallConfiguration copy$default(WalletInstallConfiguration walletInstallConfiguration, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = walletInstallConfiguration.appPackageName;
        }
        if ((i2 & 2) != 0) {
            str2 = walletInstallConfiguration.walletPackageName;
        }
        return walletInstallConfiguration.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAppPackageName() {
        return this.appPackageName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getWalletPackageName() {
        return this.walletPackageName;
    }

    public final WalletInstallConfiguration copy(String appPackageName, String walletPackageName) {
        C9801m.m32346f(walletPackageName, "walletPackageName");
        return new WalletInstallConfiguration(appPackageName, walletPackageName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WalletInstallConfiguration)) {
            return false;
        }
        WalletInstallConfiguration walletInstallConfiguration = (WalletInstallConfiguration) other;
        return C9801m.m32341a(this.appPackageName, walletInstallConfiguration.appPackageName) && C9801m.m32341a(this.walletPackageName, walletInstallConfiguration.walletPackageName);
    }

    public final String getAppPackageName() {
        return this.appPackageName;
    }

    public final String getWalletPackageName() {
        return this.walletPackageName;
    }

    public int hashCode() {
        String str = this.appPackageName;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.walletPackageName.hashCode();
    }

    public String toString() {
        return "WalletInstallConfiguration(appPackageName=" + this.appPackageName + ", walletPackageName=" + this.walletPackageName + ')';
    }
}
