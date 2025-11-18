package cm.aptoide.accountmanager;

import android.text.TextUtils;
import cm.aptoide.accountmanager.Account;
import java.util.Collections;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class LocalAccount implements Account {
    private final Store store;

    public LocalAccount(Store store) {
        this.store = store;
    }

    @Override // cm.aptoide.accountmanager.Account
    public boolean acceptedPrivacyPolicy() {
        return false;
    }

    @Override // cm.aptoide.accountmanager.Account
    public boolean acceptedTermsAndConditions() {
        return false;
    }

    @Override // cm.aptoide.accountmanager.Account
    public Account.Access getAccess() {
        return Account.Access.UNLISTED;
    }

    @Override // cm.aptoide.accountmanager.Account
    public String getAvatar() {
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    @Override // cm.aptoide.accountmanager.Account
    public String getEmail() {
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    @Override // cm.aptoide.accountmanager.Account
    public String getId() {
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    @Override // cm.aptoide.accountmanager.Account
    public String getNickname() {
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    @Override // cm.aptoide.accountmanager.Account
    public Store getStore() {
        return this.store;
    }

    @Override // cm.aptoide.accountmanager.Account
    public List<Store> getSubscribedStores() {
        return Collections.emptyList();
    }

    @Override // cm.aptoide.accountmanager.Account
    public boolean hasStore() {
        Store store = this.store;
        return (store == null || TextUtils.isEmpty(store.getName())) ? false : true;
    }

    @Override // cm.aptoide.accountmanager.Account
    public boolean isAccessConfirmed() {
        return false;
    }

    @Override // cm.aptoide.accountmanager.Account
    public boolean isAdultContentEnabled() {
        return false;
    }

    @Override // cm.aptoide.accountmanager.Account
    public boolean isLoggedIn() {
        return false;
    }

    @Override // cm.aptoide.accountmanager.Account
    public boolean isPublicStore() {
        Store store = this.store;
        return store != null && store.hasPublicAccess();
    }

    @Override // cm.aptoide.accountmanager.Account
    public boolean isPublicUser() {
        return getAccess() == Account.Access.PUBLIC;
    }
}
