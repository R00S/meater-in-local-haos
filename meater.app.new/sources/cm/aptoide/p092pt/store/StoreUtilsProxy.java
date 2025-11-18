package cm.aptoide.p092pt.store;

import android.content.SharedPreferences;
import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.database.room.RoomStore;
import cm.aptoide.p092pt.dataprovider.interfaces.ErrorRequestListener;
import cm.aptoide.p092pt.dataprovider.interfaces.SuccessRequestListener;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response;
import cm.aptoide.p092pt.dataprovider.model.p096v7.store.GetStoreMeta;
import cm.aptoide.p092pt.dataprovider.model.p096v7.store.Store;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBody;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseRequestWithStore;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store.GetHomeMetaRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store.GetStoreMetaRequest;
import okhttp3.OkHttpClient;
import p456rx.C11231b;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;
import retrofit2.Converter;

/* loaded from: classes.dex */
public class StoreUtilsProxy {
    private final AptoideAccountManager accountManager;
    private final BodyInterceptor<BaseBody> bodyInterceptor;
    private final Converter.Factory converterFactory;
    private final OkHttpClient httpClient;
    private final SharedPreferences sharedPreferences;
    private final StoreCredentialsProvider storeCredentialsProvider;
    private final RoomStoreRepository storeRepository;
    private TokenInvalidator tokenInvalidator;

    public StoreUtilsProxy(AptoideAccountManager aptoideAccountManager, BodyInterceptor<BaseBody> bodyInterceptor, StoreCredentialsProvider storeCredentialsProvider, RoomStoreRepository roomStoreRepository, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        this.accountManager = aptoideAccountManager;
        this.bodyInterceptor = bodyInterceptor;
        this.storeCredentialsProvider = storeCredentialsProvider;
        this.storeRepository = roomStoreRepository;
        this.httpClient = okHttpClient;
        this.converterFactory = factory;
        this.tokenInvalidator = tokenInvalidator;
        this.sharedPreferences = sharedPreferences;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean isPrivateCredentialsSet(GetStoreMetaRequest getStoreMetaRequest) {
        return (((GetHomeMetaRequest.Body) getStoreMetaRequest.getBody()).getStoreUser() == null || ((GetHomeMetaRequest.Body) getStoreMetaRequest.getBody()).getStorePassSha1() == null) ? false : true;
    }

    static /* synthetic */ C11234e lambda$addDefaultStore$0(AptoideAccountManager aptoideAccountManager, BaseRequestWithStore.StoreCredentials storeCredentials, GetStoreMeta getStoreMeta) {
        return BaseV7Response.Info.Status.OK.equals(getStoreMeta.getInfo().getStatus()) ? aptoideAccountManager.isLoggedIn() ? aptoideAccountManager.subscribeStore(getStoreMeta.getData().getName(), storeCredentials.getUsername(), storeCredentials.getPasswordSha1()).m39974b(C11234e.m40025S(getStoreMeta)) : C11234e.m40025S(getStoreMeta) : C11234e.m40017C(new Exception("Something went wrong while getting store meta"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$addDefaultStore$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m8772a(GetStoreMetaRequest getStoreMetaRequest, GetStoreMeta getStoreMeta) {
        return saveStore(getStoreMeta.getData(), getStoreMetaRequest);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C11231b saveStore(Store store, GetStoreMetaRequest getStoreMetaRequest) {
        RoomStore roomStore = new RoomStore();
        roomStore.setStoreId(store.getId());
        roomStore.setStoreName(store.getName());
        roomStore.setDownloads(store.getStats().getDownloads());
        roomStore.setIconPath(store.getAvatar());
        roomStore.setTheme(store.getAppearance().getTheme());
        if (isPrivateCredentialsSet(getStoreMetaRequest)) {
            roomStore.setUsername(((GetHomeMetaRequest.Body) getStoreMetaRequest.getBody()).getStoreUser());
            roomStore.setPasswordSha1(((GetHomeMetaRequest.Body) getStoreMetaRequest.getBody()).getStorePassSha1());
        }
        return this.storeRepository.save(roomStore);
    }

    public C11231b addDefaultStore(final GetStoreMetaRequest getStoreMetaRequest, final AptoideAccountManager aptoideAccountManager, final BaseRequestWithStore.StoreCredentials storeCredentials) {
        return getStoreMetaRequest.observe().m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.store.k
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return StoreUtilsProxy.lambda$addDefaultStore$0(aptoideAccountManager, storeCredentials, (GetStoreMeta) obj);
            }
        }).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.store.i
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11298f.m8772a(getStoreMetaRequest, (GetStoreMeta) obj);
            }
        }).m40117w(new InterfaceC11253b() { // from class: cm.aptoide.pt.store.j
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                CrashReport.getInstance().log((Throwable) obj);
            }
        }).m40083X0();
    }

    public void subscribeStore(String str) {
        subscribeStore(GetStoreMetaRequest.m7490of(StoreUtils.getStoreCredentials(str, this.storeCredentialsProvider), this.bodyInterceptor, this.httpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences), null, null, str, this.accountManager);
    }

    public C11234e<GetStoreMeta> subscribeStoreObservable(String str) {
        return StoreUtils.subscribeStore(GetStoreMetaRequest.m7490of(StoreUtils.getStoreCredentials(str, this.storeCredentialsProvider), this.bodyInterceptor, this.httpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences), this.accountManager, null, null, this.storeRepository);
    }

    public void unSubscribeStore(String str) {
        StoreUtils.unSubscribeStore(str, this.accountManager, this.storeCredentialsProvider, this.storeRepository);
    }

    public void subscribeStore(GetStoreMetaRequest getStoreMetaRequest, SuccessRequestListener<GetStoreMeta> successRequestListener, ErrorRequestListener errorRequestListener, String str, AptoideAccountManager aptoideAccountManager) {
        subscribeStore(getStoreMetaRequest, successRequestListener, errorRequestListener, str, aptoideAccountManager, null, null);
    }

    public void subscribeStore(GetStoreMetaRequest getStoreMetaRequest, SuccessRequestListener<GetStoreMeta> successRequestListener, ErrorRequestListener errorRequestListener, String str, AptoideAccountManager aptoideAccountManager, String str2, String str3) {
        StoreUtils.subscribeStore(getStoreMetaRequest, successRequestListener, errorRequestListener, aptoideAccountManager, str2, str3, this.storeRepository);
    }

    public void subscribeStore(String str, SuccessRequestListener<GetStoreMeta> successRequestListener, ErrorRequestListener errorRequestListener, AptoideAccountManager aptoideAccountManager) {
        subscribeStore(GetStoreMetaRequest.m7490of(StoreUtils.getStoreCredentials(str, this.storeCredentialsProvider), this.bodyInterceptor, this.httpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences), successRequestListener, errorRequestListener, str, aptoideAccountManager);
    }
}
