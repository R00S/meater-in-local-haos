package cm.aptoide.p092pt.home.more.appcoins;

import cm.aptoide.p092pt.home.bundles.apps.RewardApp;
import cm.aptoide.p092pt.home.more.base.ListAppsView;
import cm.aptoide.p092pt.promotions.WalletApp;
import kotlin.Metadata;
import okhttp3.HttpUrl;
import p456rx.C11234e;

/* compiled from: EarnAppcListView.kt */
@Metadata(m32266d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&J\b\u0010\u0006\u001a\u00020\u0007H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH&J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004H&J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u0012"}, m32267d2 = {"Lcm/aptoide/pt/home/more/appcoins/EarnAppcListView;", "Lcm/aptoide/pt/home/more/base/ListAppsView;", "Lcm/aptoide/pt/home/bundles/apps/RewardApp;", "cancelDownload", "Lrx/Observable;", "Ljava/lang/Void;", "hideWalletArea", HttpUrl.FRAGMENT_ENCODE_SET, "onWalletInstallClick", "pauseDownload", "resumeDownload", "setupWallet", "walletApp", "Lcm/aptoide/pt/promotions/WalletApp;", "showDownloadError", "showRootInstallWarningPopup", HttpUrl.FRAGMENT_ENCODE_SET, "updateState", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public interface EarnAppcListView extends ListAppsView<RewardApp> {
    C11234e<Void> cancelDownload();

    void hideWalletArea();

    C11234e<Void> onWalletInstallClick();

    C11234e<Void> pauseDownload();

    C11234e<Void> resumeDownload();

    void setupWallet(WalletApp walletApp);

    void showDownloadError(WalletApp walletApp);

    C11234e<Boolean> showRootInstallWarningPopup();

    void updateState(WalletApp walletApp);
}
