package cm.aptoide.p092pt.store.view.recommended;

import android.content.Context;
import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.dataprovider.model.p096v7.store.Store;
import cm.aptoide.p092pt.navigator.FragmentNavigator;
import cm.aptoide.p092pt.store.RoomStoreRepository;
import cm.aptoide.p092pt.store.StoreCredentialsProvider;
import cm.aptoide.p092pt.store.StoreUtils;
import cm.aptoide.p092pt.store.StoreUtilsProxy;
import cm.aptoide.p092pt.view.recycler.displayable.Displayable;
import cm.aptoide.p092pt.view.recycler.displayable.DisplayablePojo;
import okhttp3.HttpUrl;
import p456rx.C11234e;

/* loaded from: classes.dex */
public class RecommendedStoreDisplayable extends DisplayablePojo<Store> {
    private AptoideAccountManager accountManager;
    private String origin;
    private StoreCredentialsProvider storeCredentialsProvider;
    private RoomStoreRepository storeRepository;
    private StoreUtilsProxy storeUtilsProxy;

    public RecommendedStoreDisplayable() {
        this.origin = HttpUrl.FRAGMENT_ENCODE_SET;
    }

    @Override // cm.aptoide.p092pt.view.recycler.displayable.Displayable
    protected Displayable.Configs getConfig() {
        return new Displayable.Configs(1, false);
    }

    public String getOrigin() {
        return this.origin;
    }

    @Override // cm.aptoide.p092pt.view.recycler.displayable.Displayable
    public int getViewLayout() {
        return C1146R.layout.displayable_recommended_store;
    }

    C11234e<Boolean> isFollowing() {
        return this.storeRepository.isSubscribed(getPojo().getId());
    }

    void openStoreFragment(FragmentNavigator fragmentNavigator) {
        fragmentNavigator.navigateTo(AptoideApplication.getFragmentProvider().newStoreFragment(getPojo().getName(), getPojo().getAppearance().getTheme()), true);
    }

    public void subscribeStore() {
        this.storeUtilsProxy.subscribeStore(getPojo().getName());
    }

    void unsubscribeStore(Context context) {
        if (this.accountManager.isLoggedIn()) {
            this.accountManager.unsubscribeStore(getPojo().getName(), this.storeCredentialsProvider.get(getPojo().getName()).getName(), this.storeCredentialsProvider.get(getPojo().getName()).getPasswordSha1());
        }
        StoreUtils.unSubscribeStore(getPojo().getName(), this.accountManager, this.storeCredentialsProvider, this.storeRepository);
    }

    public RecommendedStoreDisplayable(Store store, RoomStoreRepository roomStoreRepository, AptoideAccountManager aptoideAccountManager, StoreUtilsProxy storeUtilsProxy, StoreCredentialsProvider storeCredentialsProvider) {
        super(store);
        this.origin = HttpUrl.FRAGMENT_ENCODE_SET;
        this.storeRepository = roomStoreRepository;
        this.accountManager = aptoideAccountManager;
        this.storeUtilsProxy = storeUtilsProxy;
        this.storeCredentialsProvider = storeCredentialsProvider;
    }

    public RecommendedStoreDisplayable(Store store, RoomStoreRepository roomStoreRepository, AptoideAccountManager aptoideAccountManager, StoreUtilsProxy storeUtilsProxy, StoreCredentialsProvider storeCredentialsProvider, String str) {
        super(store);
        this.origin = HttpUrl.FRAGMENT_ENCODE_SET;
        this.storeRepository = roomStoreRepository;
        this.accountManager = aptoideAccountManager;
        this.storeUtilsProxy = storeUtilsProxy;
        this.storeCredentialsProvider = storeCredentialsProvider;
        this.origin = str;
    }
}
