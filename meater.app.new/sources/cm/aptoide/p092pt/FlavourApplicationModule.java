package cm.aptoide.p092pt;

import cm.aptoide.accountmanager.AccountService;
import cm.aptoide.accountmanager.AdultContent;
import cm.aptoide.p092pt.account.LoginPreferences;
import cm.aptoide.p092pt.ads.WalletAdsOfferCardManager;
import cm.aptoide.p092pt.ads.WalletAdsOfferManager;
import cm.aptoide.p092pt.blacklist.BlacklistManager;
import cm.aptoide.p092pt.install.PackageRepository;
import cm.aptoide.p092pt.preferences.AdultContentManager;
import cm.aptoide.p092pt.preferences.LocalPersistenceAdultContent;
import cm.aptoide.p092pt.preferences.Preferences;
import cm.aptoide.p092pt.preferences.SecurePreferences;
import com.google.android.gms.common.GoogleApiAvailability;
import javax.inject.Named;
import javax.inject.Singleton;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class FlavourApplicationModule {
    private final AptoideApplication application;

    public FlavourApplicationModule(AptoideApplication aptoideApplication) {
        this.application = aptoideApplication;
    }

    @Singleton
    AdultContent provideAdultContent(LocalPersistenceAdultContent localPersistenceAdultContent, AccountService accountService) {
        return new AdultContentManager(localPersistenceAdultContent, accountService);
    }

    @Singleton
    @Named
    String provideAutoUpdateStoreName() {
        return "v9";
    }

    @Singleton
    LocalPersistenceAdultContent provideLocalAdultContent(Preferences preferences, @Named("secure") SecurePreferences securePreferences) {
        return new LocalPersistenceAdultContent(preferences, securePreferences);
    }

    @Singleton
    LoginPreferences provideLoginPreferences() {
        return new LoginPreferences(this.application, GoogleApiAvailability.m13803q());
    }

    @Singleton
    @Named
    String providePartnerID() {
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    @Singleton
    @Named
    String providesSupportEmail() {
        return this.application.getString(C1146R.string.aptoide_email);
    }

    @Singleton
    WalletAdsOfferCardManager providesWalletAdsOfferCardManager(BlacklistManager blacklistManager, PackageRepository packageRepository) {
        return new WalletAdsOfferCardManager(blacklistManager, packageRepository);
    }

    @Singleton
    WalletAdsOfferManager providesWalletAdsOfferManager() {
        return new WalletAdsOfferManager(this.application.getApplicationContext().getPackageManager());
    }
}
