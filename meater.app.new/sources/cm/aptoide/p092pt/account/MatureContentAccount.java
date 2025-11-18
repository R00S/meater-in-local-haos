package cm.aptoide.p092pt.account;

import cm.aptoide.accountmanager.Account;
import cm.aptoide.accountmanager.AdultContent;
import cm.aptoide.accountmanager.Store;
import java.util.List;

/* loaded from: classes.dex */
public class MatureContentAccount implements Account {
    private final AdultContent adultContent;
    private final Account wrappedAccount;

    public MatureContentAccount(Account account, AdultContent adultContent) {
        this.wrappedAccount = account;
        this.adultContent = adultContent;
    }

    @Override // cm.aptoide.accountmanager.Account
    public boolean acceptedPrivacyPolicy() {
        return this.wrappedAccount.acceptedPrivacyPolicy();
    }

    @Override // cm.aptoide.accountmanager.Account
    public boolean acceptedTermsAndConditions() {
        return this.wrappedAccount.acceptedTermsAndConditions();
    }

    @Override // cm.aptoide.accountmanager.Account
    public Account.Access getAccess() {
        return this.wrappedAccount.getAccess();
    }

    @Override // cm.aptoide.accountmanager.Account
    public String getAvatar() {
        return this.wrappedAccount.getAvatar();
    }

    @Override // cm.aptoide.accountmanager.Account
    public String getEmail() {
        return this.wrappedAccount.getEmail();
    }

    @Override // cm.aptoide.accountmanager.Account
    public String getId() {
        return this.wrappedAccount.getId();
    }

    @Override // cm.aptoide.accountmanager.Account
    public String getNickname() {
        return this.wrappedAccount.getNickname();
    }

    @Override // cm.aptoide.accountmanager.Account
    public Store getStore() {
        return this.wrappedAccount.getStore();
    }

    @Override // cm.aptoide.accountmanager.Account
    public List<Store> getSubscribedStores() {
        return this.wrappedAccount.getSubscribedStores();
    }

    @Override // cm.aptoide.accountmanager.Account
    public boolean hasStore() {
        return this.wrappedAccount.hasStore();
    }

    @Override // cm.aptoide.accountmanager.Account
    public boolean isAccessConfirmed() {
        return this.wrappedAccount.isAccessConfirmed();
    }

    @Override // cm.aptoide.accountmanager.Account
    public boolean isAdultContentEnabled() {
        return this.adultContent.enabled().m40057E().m40085Z0().m39933y().m40633b().booleanValue();
    }

    @Override // cm.aptoide.accountmanager.Account
    public boolean isLoggedIn() {
        return this.wrappedAccount.isLoggedIn();
    }

    @Override // cm.aptoide.accountmanager.Account
    public boolean isPublicStore() {
        return this.wrappedAccount.isPublicStore();
    }

    @Override // cm.aptoide.accountmanager.Account
    public boolean isPublicUser() {
        return this.wrappedAccount.isPublicUser();
    }
}
