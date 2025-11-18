package cm.aptoide.p092pt.store.view;

import android.content.SharedPreferences;
import cm.aptoide.accountmanager.Account;
import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.p092pt.BuildConfig;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.database.room.RoomStore;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.model.p096v7.store.GetHomeMeta;
import cm.aptoide.p092pt.dataprovider.model.p096v7.store.HomeUser;
import cm.aptoide.p092pt.dataprovider.model.p096v7.store.Store;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBody;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store.GetHomeMetaRequest;
import cm.aptoide.p092pt.navigator.FragmentNavigator;
import cm.aptoide.p092pt.navigator.Result;
import cm.aptoide.p092pt.store.RoomStoreRepository;
import cm.aptoide.p092pt.store.StoreAnalytics;
import cm.aptoide.p092pt.store.StoreCredentialsProvider;
import cm.aptoide.p092pt.store.StoreUtilsProxy;
import cm.aptoide.p092pt.store.view.GridStoreMetaWidget;
import cm.aptoide.p092pt.themes.ThemeManager;
import cm.aptoide.p092pt.view.recycler.displayable.Displayable;
import cm.aptoide.p092pt.view.recycler.displayable.DisplayablePojo;
import java.util.Iterator;
import java.util.List;
import okhttp3.OkHttpClient;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;
import retrofit2.Converter;

/* loaded from: classes.dex */
public class GridStoreMetaDisplayable extends DisplayablePojo<GetHomeMeta> {
    public static final int REQUEST_CODE = 53298475;
    private AptoideAccountManager aptoideAccountManager;
    private BadgeDialogFactory badgeDialogFactory;
    private BodyInterceptor<BaseBody> bodyInterceptorV7;
    private OkHttpClient client;
    private Converter.Factory converter;
    private FragmentNavigator fragmentNavigator;
    private SharedPreferences sharedPreferences;
    private StoreAnalytics storeAnalytics;
    private StoreCredentialsProvider storeCredentialsProvider;
    private RoomStoreRepository storeRepository;
    private StoreUtilsProxy storeUtilsProxy;
    private ThemeManager themeManager;
    private TokenInvalidator tokenInvalidator;

    /* renamed from: cm.aptoide.pt.store.view.GridStoreMetaDisplayable$1 */
    static /* synthetic */ class C44461 {

        /* renamed from: $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$store$Store$BadgeType */
        static final /* synthetic */ int[] f11305x6cf1c276;

        static {
            int[] iArr = new int[Store.BadgeType.values().length];
            f11305x6cf1c276 = iArr;
            try {
                iArr[Store.BadgeType.BRONZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11305x6cf1c276[Store.BadgeType.SILVER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11305x6cf1c276[Store.BadgeType.GOLD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11305x6cf1c276[Store.BadgeType.PLATINUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11305x6cf1c276[Store.BadgeType.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public GridStoreMetaDisplayable() {
    }

    private Store getStore() {
        return getPojo().getData().getStore();
    }

    private HomeUser getUser() {
        return getPojo().getData().getUser();
    }

    private String getUserName() {
        if (getUser() == null) {
            return null;
        }
        return getUser().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getHomeMeta$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8790a(GetHomeMeta getHomeMeta) {
        return isFollowingStore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getHomeMeta$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ GridStoreMetaWidget.HomeMeta m8791b(Boolean bool, Boolean bool2) {
        return new GridStoreMetaWidget.HomeMeta(getMainIcon(), getSecondaryIcon(), getMainName(), getSecondaryName(), bool2.booleanValue(), hasStore(), bool.booleanValue(), getAppsCount(), getFollowersCount(), getFollowingsCount(), getDescription(), this.themeManager.getStoreTheme(getStoreThemeName()), this.themeManager.getAttributeForTheme(C1146R.attr.themeTextColor).data, getStoreId(), hasStore(), getBadge());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getHomeMeta$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8792c(AptoideAccountManager aptoideAccountManager, final Boolean bool) {
        return isStoreOwner(aptoideAccountManager).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.store.view.i0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11342f.m8791b(bool, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$isFollowingStore$7, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Boolean m8793d(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((RoomStore) it.next()).getStoreName().equals(getStoreName())) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$isStoreOwner$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Boolean m8794e(Account account) {
        return Boolean.valueOf((getStore() == null || account.getStore() == null || !account.getStore().getName().equals(getStore().getName())) ? false : true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$updateStoreMeta$5, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8795f(Result result) {
        return GetHomeMetaRequest.m7485of(this.storeCredentialsProvider.get(getStoreId()), this.bodyInterceptorV7, this.client, this.converter, this.tokenInvalidator, this.sharedPreferences).observe(true, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$updateStoreMeta$6, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8796g(GetHomeMeta getHomeMeta) {
        setPojo(getHomeMeta);
    }

    private C11234e<GetHomeMeta> updateStoreMeta() {
        return this.fragmentNavigator.results(REQUEST_CODE).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.store.view.h0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((Result) obj).getResultCode() == -1);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.store.view.g0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11336f.m8795f((Result) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.store.view.j0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11346f.m8796g((GetHomeMeta) obj);
            }
        });
    }

    public long getAppsCount() {
        if (getStore() != null) {
            return r0.getStats().getApps();
        }
        return 0L;
    }

    public AptoideAccountManager getAptoideAccountManager() {
        return this.aptoideAccountManager;
    }

    public GridStoreMetaWidget.HomeMeta.Badge getBadge() {
        if (!hasStore()) {
            return GridStoreMetaWidget.HomeMeta.Badge.NONE;
        }
        int i2 = C44461.f11305x6cf1c276[getPojo().getData().getStore().getBadge().getName().ordinal()];
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? GridStoreMetaWidget.HomeMeta.Badge.NONE : GridStoreMetaWidget.HomeMeta.Badge.TIN : GridStoreMetaWidget.HomeMeta.Badge.PLATINUM : GridStoreMetaWidget.HomeMeta.Badge.GOLD : GridStoreMetaWidget.HomeMeta.Badge.SILVER : GridStoreMetaWidget.HomeMeta.Badge.BRONZE;
    }

    public BadgeDialogFactory getBadgeDialogFactory() {
        return this.badgeDialogFactory;
    }

    @Override // cm.aptoide.p092pt.view.recycler.displayable.Displayable
    protected Displayable.Configs getConfig() {
        return new Displayable.Configs(1, true);
    }

    public String getDescription() {
        Store store = getStore();
        if (store != null) {
            return store.getAppearance().getDescription();
        }
        return null;
    }

    public long getFollowersCount() {
        return getPojo().getData().getStats().getFollowers();
    }

    public long getFollowingsCount() {
        return getPojo().getData().getStats().getFollowing();
    }

    public C11234e<GridStoreMetaWidget.HomeMeta> getHomeMeta(final AptoideAccountManager aptoideAccountManager) {
        return C11234e.m40033a0(isFollowingStore(), updateStoreMeta().m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.store.view.l0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11352f.m8790a((GetHomeMeta) obj);
            }
        }).m40057E()).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.store.view.e0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11322f.m8792c(aptoideAccountManager, (Boolean) obj);
            }
        });
    }

    public String getMainIcon() {
        return getStore() != null ? getStore().getAvatar() : getUserIcon();
    }

    public String getMainName() {
        Store store = getStore();
        return store != null ? store.getName() : getUserName();
    }

    public int getRaisedButtonBackground() {
        return this.themeManager.getAttributeForTheme(C1146R.attr.raisedButtonSecondaryBackground).resourceId;
    }

    public int getRequestCode() {
        return REQUEST_CODE;
    }

    public String getSecondaryIcon() {
        if (getStore() == null) {
            return null;
        }
        return getUserIcon();
    }

    public String getSecondaryName() {
        if (getStore() != null) {
            return getUserName();
        }
        return null;
    }

    public StoreAnalytics getStoreAnalytics() {
        return this.storeAnalytics;
    }

    public StoreCredentialsProvider getStoreCredentialsProvider() {
        return this.storeCredentialsProvider;
    }

    public long getStoreId() {
        if (getStore() == null) {
            return 0L;
        }
        return getStore().getId();
    }

    public String getStoreName() {
        return getStore().getName();
    }

    public String getStoreThemeName() {
        Store store = getStore();
        return (store == null || store.getAppearance() == null) ? BuildConfig.APTOIDE_THEME : store.getAppearance().getTheme();
    }

    public StoreUtilsProxy getStoreUtilsProxy() {
        return this.storeUtilsProxy;
    }

    public String getUserIcon() {
        if (getUser() != null) {
            return getUser().getAvatar();
        }
        return null;
    }

    public long getUserId() {
        return getUser().getId();
    }

    @Override // cm.aptoide.p092pt.view.recycler.displayable.Displayable
    public int getViewLayout() {
        return C1146R.layout.displayable_store_meta;
    }

    public boolean hasStore() {
        return getStore() != null;
    }

    public boolean hasUser() {
        return getUser() != null;
    }

    public C11234e<Boolean> isFollowingStore() {
        return getStore() != null ? this.storeRepository.getAll().m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.store.view.k0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11349f.m8793d((List) obj);
            }
        }).m40111t() : C11234e.m40025S(Boolean.FALSE);
    }

    public C11234e<Boolean> isStoreOwner(AptoideAccountManager aptoideAccountManager) {
        return aptoideAccountManager.accountStatus().m40057E().m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.store.view.f0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11326f.m8794e((Account) obj);
            }
        });
    }

    public GridStoreMetaDisplayable(GetHomeMeta getHomeMeta, StoreCredentialsProvider storeCredentialsProvider, StoreAnalytics storeAnalytics, BadgeDialogFactory badgeDialogFactory, FragmentNavigator fragmentNavigator, RoomStoreRepository roomStoreRepository, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, ThemeManager themeManager, StoreUtilsProxy storeUtilsProxy, AptoideAccountManager aptoideAccountManager) {
        super(getHomeMeta);
        this.storeCredentialsProvider = storeCredentialsProvider;
        this.storeAnalytics = storeAnalytics;
        this.badgeDialogFactory = badgeDialogFactory;
        this.fragmentNavigator = fragmentNavigator;
        this.storeRepository = roomStoreRepository;
        this.bodyInterceptorV7 = bodyInterceptor;
        this.client = okHttpClient;
        this.converter = factory;
        this.tokenInvalidator = tokenInvalidator;
        this.sharedPreferences = sharedPreferences;
        this.themeManager = themeManager;
        this.storeUtilsProxy = storeUtilsProxy;
        this.aptoideAccountManager = aptoideAccountManager;
    }
}
