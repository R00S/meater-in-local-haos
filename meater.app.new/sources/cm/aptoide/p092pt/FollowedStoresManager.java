package cm.aptoide.p092pt;

import android.content.SharedPreferences;
import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.p092pt.dataprovider.WebService;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBody;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseRequestWithStore;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store.GetStoreMetaRequest;
import cm.aptoide.p092pt.store.StoreCredentialsProvider;
import cm.aptoide.p092pt.store.StoreUtilsProxy;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import p456rx.C11231b;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11256e;

/* compiled from: FollowedStoresManager.kt */
@Metadata(m32266d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m32267d2 = {"Lcm/aptoide/pt/FollowedStoresManager;", HttpUrl.FRAGMENT_ENCODE_SET, "storeCredentials", "Lcm/aptoide/pt/store/StoreCredentialsProvider;", "defaultFollowedStores", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "storeUtilsProxy", "Lcm/aptoide/pt/store/StoreUtilsProxy;", "accountSettingsBodyInterceptorPoolV7", "Lcm/aptoide/pt/dataprovider/ws/BodyInterceptor;", "Lcm/aptoide/pt/dataprovider/ws/v7/BaseBody;", "accountManager", "Lcm/aptoide/accountmanager/AptoideAccountManager;", "defaultClient", "Lokhttp3/OkHttpClient;", "tokenInvalidator", "Lcm/aptoide/pt/dataprovider/interfaces/TokenInvalidator;", "defaultSharedPreferences", "Landroid/content/SharedPreferences;", "(Lcm/aptoide/pt/store/StoreCredentialsProvider;Ljava/util/List;Lcm/aptoide/pt/store/StoreUtilsProxy;Lcm/aptoide/pt/dataprovider/ws/BodyInterceptor;Lcm/aptoide/accountmanager/AptoideAccountManager;Lokhttp3/OkHttpClient;Lcm/aptoide/pt/dataprovider/interfaces/TokenInvalidator;Landroid/content/SharedPreferences;)V", "setDefaultFollowedStores", "Lrx/Completable;", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class FollowedStoresManager {
    private final AptoideAccountManager accountManager;
    private final BodyInterceptor<BaseBody> accountSettingsBodyInterceptorPoolV7;
    private final OkHttpClient defaultClient;
    private final List<String> defaultFollowedStores;
    private final SharedPreferences defaultSharedPreferences;
    private final StoreCredentialsProvider storeCredentials;
    private final StoreUtilsProxy storeUtilsProxy;
    private final TokenInvalidator tokenInvalidator;

    public FollowedStoresManager(StoreCredentialsProvider storeCredentialsProvider, List<String> list, StoreUtilsProxy storeUtilsProxy, BodyInterceptor<BaseBody> bodyInterceptor, AptoideAccountManager aptoideAccountManager, OkHttpClient okHttpClient, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        C9801m.m32346f(storeCredentialsProvider, "storeCredentials");
        C9801m.m32346f(list, "defaultFollowedStores");
        C9801m.m32346f(storeUtilsProxy, "storeUtilsProxy");
        C9801m.m32346f(bodyInterceptor, "accountSettingsBodyInterceptorPoolV7");
        C9801m.m32346f(aptoideAccountManager, "accountManager");
        C9801m.m32346f(okHttpClient, "defaultClient");
        C9801m.m32346f(tokenInvalidator, "tokenInvalidator");
        C9801m.m32346f(sharedPreferences, "defaultSharedPreferences");
        this.storeCredentials = storeCredentialsProvider;
        this.defaultFollowedStores = list;
        this.storeUtilsProxy = storeUtilsProxy;
        this.accountSettingsBodyInterceptorPoolV7 = bodyInterceptor;
        this.accountManager = aptoideAccountManager;
        this.defaultClient = okHttpClient;
        this.tokenInvalidator = tokenInvalidator;
        this.defaultSharedPreferences = sharedPreferences;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setDefaultFollowedStores$lambda-0, reason: not valid java name */
    public static final C11231b m40697setDefaultFollowedStores$lambda0(FollowedStoresManager followedStoresManager, String str) {
        C9801m.m32346f(followedStoresManager, "this$0");
        BaseRequestWithStore.StoreCredentials storeCredentials = followedStoresManager.storeCredentials.get(str);
        return followedStoresManager.storeUtilsProxy.addDefaultStore(GetStoreMetaRequest.m7490of(storeCredentials, followedStoresManager.accountSettingsBodyInterceptorPoolV7, followedStoresManager.defaultClient, WebService.getDefaultConverter(), followedStoresManager.tokenInvalidator, followedStoresManager.defaultSharedPreferences), followedStoresManager.accountManager, storeCredentials);
    }

    public final C11231b setDefaultFollowedStores() {
        C11231b c11231bM39934z = C11234e.m40020N(this.defaultFollowedStores).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.j0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return FollowedStoresManager.m40697setDefaultFollowedStores$lambda0(this.f10284f, (String) obj);
            }
        }).m40084Y0().m40057E().m40085Z0().m39934z();
        C9801m.m32345e(c11231bM39934z, "from(defaultFollowedStor…\n        .toCompletable()");
        return c11231bM39934z;
    }
}
