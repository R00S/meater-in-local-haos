package cm.aptoide.accountmanager;

import android.text.TextUtils;
import cm.aptoide.accountmanager.Account;
import java.util.List;

/* loaded from: classes.dex */
public final class AptoideAccount implements Account {
    private final Account.Access access;
    private final boolean accessConfirmed;
    private final boolean adultContentEnabled;
    private final String avatar;
    private final String email;

    /* renamed from: id */
    private final String f7053id;
    private final String nickname;
    private final boolean privacyPolicy;
    private final Store store;
    private final List<Store> subscribedStores;
    private final boolean termsAndConditions;

    public AptoideAccount(String str, String str2, String str3, String str4, Store store, boolean z, Account.Access access, boolean z2, List<Store> list, boolean z3, boolean z4) {
        this.f7053id = str;
        this.email = str2;
        this.nickname = str3;
        this.avatar = str4;
        this.store = store;
        this.adultContentEnabled = z;
        this.access = access;
        this.accessConfirmed = z2;
        this.subscribedStores = list;
        this.privacyPolicy = z3;
        this.termsAndConditions = z4;
    }

    @Override // cm.aptoide.accountmanager.Account
    public boolean acceptedPrivacyPolicy() {
        return this.privacyPolicy;
    }

    @Override // cm.aptoide.accountmanager.Account
    public boolean acceptedTermsAndConditions() {
        return this.termsAndConditions;
    }

    @Override // cm.aptoide.accountmanager.Account
    public Account.Access getAccess() {
        return this.access;
    }

    @Override // cm.aptoide.accountmanager.Account
    public String getAvatar() {
        return this.avatar;
    }

    @Override // cm.aptoide.accountmanager.Account
    public String getEmail() {
        return this.email;
    }

    @Override // cm.aptoide.accountmanager.Account
    public String getId() {
        return this.f7053id;
    }

    @Override // cm.aptoide.accountmanager.Account
    public String getNickname() {
        return this.nickname;
    }

    @Override // cm.aptoide.accountmanager.Account
    public Store getStore() {
        return this.store;
    }

    @Override // cm.aptoide.accountmanager.Account
    public List<Store> getSubscribedStores() {
        return this.subscribedStores;
    }

    @Override // cm.aptoide.accountmanager.Account
    public boolean hasStore() {
        Store store = this.store;
        return (store == null || TextUtils.isEmpty(store.getName())) ? false : true;
    }

    @Override // cm.aptoide.accountmanager.Account
    public boolean isAccessConfirmed() {
        return this.accessConfirmed;
    }

    @Override // cm.aptoide.accountmanager.Account
    public boolean isAdultContentEnabled() {
        return this.adultContentEnabled;
    }

    @Override // cm.aptoide.accountmanager.Account
    public boolean isLoggedIn() {
        return true;
    }

    @Override // cm.aptoide.accountmanager.Account
    public boolean isPublicStore() {
        Store store = this.store;
        return store != null && store.hasPublicAccess();
    }

    @Override // cm.aptoide.accountmanager.Account
    public boolean isPublicUser() {
        return this.access == Account.Access.PUBLIC;
    }
}
