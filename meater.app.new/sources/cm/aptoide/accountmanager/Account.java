package cm.aptoide.accountmanager;

import java.util.List;

/* loaded from: classes.dex */
public interface Account {

    public enum Access {
        PUBLIC,
        PRIVATE,
        UNLISTED
    }

    boolean acceptedPrivacyPolicy();

    boolean acceptedTermsAndConditions();

    Access getAccess();

    String getAvatar();

    String getEmail();

    String getId();

    String getNickname();

    Store getStore();

    List<Store> getSubscribedStores();

    boolean hasStore();

    boolean isAccessConfirmed();

    boolean isAdultContentEnabled();

    boolean isLoggedIn();

    boolean isPublicStore();

    boolean isPublicUser();
}
