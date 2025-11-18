package cm.aptoide.p092pt.home.bundles.apps;

import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.p092pt.app.C1965x0;
import cm.aptoide.p092pt.store.view.StoreTabGridRecyclerFragment;
import cm.aptoide.p092pt.view.app.Application;
import com.google.android.gms.ads.AdRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: RewardApp.kt */
@Metadata(m32266d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0002\u001b\u001cBs\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0014R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, m32267d2 = {"Lcm/aptoide/pt/home/bundles/apps/RewardApp;", "Lcm/aptoide/pt/view/app/Application;", "appName", HttpUrl.FRAGMENT_ENCODE_SET, "appIcon", "ratingAverage", HttpUrl.FRAGMENT_ENCODE_SET, "downloadsNumber", HttpUrl.FRAGMENT_ENCODE_SET, "packageName", "appId", HttpUrl.FRAGMENT_ENCODE_SET, StoreTabGridRecyclerFragment.BundleCons.TAG, "hasBilling", HttpUrl.FRAGMENT_ENCODE_SET, "clickUrl", "downloadUrl", "reward", "Lcm/aptoide/pt/home/bundles/apps/RewardApp$Reward;", "featureGraphic", "(Ljava/lang/String;Ljava/lang/String;FILjava/lang/String;JLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcm/aptoide/pt/home/bundles/apps/RewardApp$Reward;Ljava/lang/String;)V", "getClickUrl", "()Ljava/lang/String;", "getDownloadUrl", "getFeatureGraphic", "getReward", "()Lcm/aptoide/pt/home/bundles/apps/RewardApp$Reward;", "Fiat", "Reward", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class RewardApp extends Application {
    private final String clickUrl;
    private final String downloadUrl;
    private final String featureGraphic;
    private final Reward reward;

    /* compiled from: RewardApp.kt */
    @Metadata(m32266d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f¨\u0006\u001c"}, m32267d2 = {"Lcm/aptoide/pt/home/bundles/apps/RewardApp$Fiat;", HttpUrl.FRAGMENT_ENCODE_SET, "amount", HttpUrl.FRAGMENT_ENCODE_SET, "currency", HttpUrl.FRAGMENT_ENCODE_SET, "symbol", "(DLjava/lang/String;Ljava/lang/String;)V", "getAmount", "()D", "setAmount", "(D)V", "getCurrency", "()Ljava/lang/String;", "setCurrency", "(Ljava/lang/String;)V", "getSymbol", "setSymbol", "component1", "component2", "component3", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    public static final /* data */ class Fiat {
        private double amount;
        private String currency;
        private String symbol;

        public Fiat() {
            this(0.0d, null, null, 7, null);
        }

        public Fiat(double d2, String str, String str2) {
            C9801m.m32346f(str, "currency");
            C9801m.m32346f(str2, "symbol");
            this.amount = d2;
            this.currency = str;
            this.symbol = str2;
        }

        public static /* synthetic */ Fiat copy$default(Fiat fiat, double d2, String str, String str2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                d2 = fiat.amount;
            }
            if ((i2 & 2) != 0) {
                str = fiat.currency;
            }
            if ((i2 & 4) != 0) {
                str2 = fiat.symbol;
            }
            return fiat.copy(d2, str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final double getAmount() {
            return this.amount;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCurrency() {
            return this.currency;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        public final Fiat copy(double amount, String currency, String symbol) {
            C9801m.m32346f(currency, "currency");
            C9801m.m32346f(symbol, "symbol");
            return new Fiat(amount, currency, symbol);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Fiat)) {
                return false;
            }
            Fiat fiat = (Fiat) other;
            return C9801m.m32341a(Double.valueOf(this.amount), Double.valueOf(fiat.amount)) && C9801m.m32341a(this.currency, fiat.currency) && C9801m.m32341a(this.symbol, fiat.symbol);
        }

        public final double getAmount() {
            return this.amount;
        }

        public final String getCurrency() {
            return this.currency;
        }

        public final String getSymbol() {
            return this.symbol;
        }

        public int hashCode() {
            return (((C1965x0.m7316a(this.amount) * 31) + this.currency.hashCode()) * 31) + this.symbol.hashCode();
        }

        public final void setAmount(double d2) {
            this.amount = d2;
        }

        public final void setCurrency(String str) {
            C9801m.m32346f(str, "<set-?>");
            this.currency = str;
        }

        public final void setSymbol(String str) {
            C9801m.m32346f(str, "<set-?>");
            this.symbol = str;
        }

        public String toString() {
            return "Fiat(amount=" + this.amount + ", currency=" + this.currency + ", symbol=" + this.symbol + ')';
        }

        public /* synthetic */ Fiat(double d2, String str, String str2, int i2, C9789g c9789g) {
            this((i2 & 1) != 0 ? -1.0d : d2, (i2 & 2) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str, (i2 & 4) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str2);
        }
    }

    /* compiled from: RewardApp.kt */
    @Metadata(m32266d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m32267d2 = {"Lcm/aptoide/pt/home/bundles/apps/RewardApp$Reward;", HttpUrl.FRAGMENT_ENCODE_SET, "appc", HttpUrl.FRAGMENT_ENCODE_SET, "fiat", "Lcm/aptoide/pt/home/bundles/apps/RewardApp$Fiat;", "(DLcm/aptoide/pt/home/bundles/apps/RewardApp$Fiat;)V", "getAppc", "()D", "getFiat", "()Lcm/aptoide/pt/home/bundles/apps/RewardApp$Fiat;", "component1", "component2", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    public static final /* data */ class Reward {
        private final double appc;
        private final Fiat fiat;

        public Reward(double d2, Fiat fiat) {
            C9801m.m32346f(fiat, "fiat");
            this.appc = d2;
            this.fiat = fiat;
        }

        public static /* synthetic */ Reward copy$default(Reward reward, double d2, Fiat fiat, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                d2 = reward.appc;
            }
            if ((i2 & 2) != 0) {
                fiat = reward.fiat;
            }
            return reward.copy(d2, fiat);
        }

        /* renamed from: component1, reason: from getter */
        public final double getAppc() {
            return this.appc;
        }

        /* renamed from: component2, reason: from getter */
        public final Fiat getFiat() {
            return this.fiat;
        }

        public final Reward copy(double appc, Fiat fiat) {
            C9801m.m32346f(fiat, "fiat");
            return new Reward(appc, fiat);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Reward)) {
                return false;
            }
            Reward reward = (Reward) other;
            return C9801m.m32341a(Double.valueOf(this.appc), Double.valueOf(reward.appc)) && C9801m.m32341a(this.fiat, reward.fiat);
        }

        public final double getAppc() {
            return this.appc;
        }

        public final Fiat getFiat() {
            return this.fiat;
        }

        public int hashCode() {
            return (C1965x0.m7316a(this.appc) * 31) + this.fiat.hashCode();
        }

        public String toString() {
            return "Reward(appc=" + this.appc + ", fiat=" + this.fiat + ')';
        }
    }

    public /* synthetic */ RewardApp(String str, String str2, float f2, int i2, String str3, long j2, String str4, boolean z, String str5, String str6, Reward reward, String str7, int i3, C9789g c9789g) {
        this(str, str2, f2, i2, str3, j2, str4, z, (i3 & 256) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str5, (i3 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str6, reward, (i3 & RecyclerView.AbstractC0599l.FLAG_MOVED) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str7);
    }

    public final String getClickUrl() {
        return this.clickUrl;
    }

    public final String getDownloadUrl() {
        return this.downloadUrl;
    }

    public final String getFeatureGraphic() {
        return this.featureGraphic;
    }

    public final Reward getReward() {
        return this.reward;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardApp(String str, String str2, float f2, int i2, String str3, long j2, String str4, boolean z, String str5, String str6, Reward reward, String str7) {
        super(str, str2, f2, i2, str3, j2, str4, z);
        C9801m.m32346f(str, "appName");
        C9801m.m32346f(str2, "appIcon");
        C9801m.m32346f(str3, "packageName");
        C9801m.m32346f(str4, StoreTabGridRecyclerFragment.BundleCons.TAG);
        this.clickUrl = str5;
        this.downloadUrl = str6;
        this.reward = reward;
        this.featureGraphic = str7;
    }
}
