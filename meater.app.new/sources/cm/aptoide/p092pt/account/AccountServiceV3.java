package cm.aptoide.p092pt.account;

import android.content.SharedPreferences;
import cm.aptoide.accountmanager.Account;
import cm.aptoide.accountmanager.AccountException;
import cm.aptoide.accountmanager.AccountFactory;
import cm.aptoide.accountmanager.AccountService;
import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.accountmanager.Store;
import cm.aptoide.p092pt.dataprovider.exception.AptoideWsV3Exception;
import cm.aptoide.p092pt.dataprovider.exception.AptoideWsV7Exception;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.model.p095v3.BaseV3Response;
import cm.aptoide.p092pt.dataprovider.model.p095v3.OAuth;
import cm.aptoide.p092pt.dataprovider.model.p095v3.TermsAndConditionsResponse;
import cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response;
import cm.aptoide.p092pt.dataprovider.model.p096v7.GetMySubscribedStoresResponse;
import cm.aptoide.p092pt.dataprovider.model.p096v7.GetUserInfo;
import cm.aptoide.p092pt.dataprovider.model.p096v7.GetUserMeta;
import cm.aptoide.p092pt.dataprovider.model.p096v7.GetUserSettings;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p100v3.AbstractC2225V3;
import cm.aptoide.p092pt.dataprovider.p097ws.p100v3.CreateUserRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p100v3.GetTermsAndConditionsStatusRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p100v3.OAuth2AuthenticationRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p100v3.UpdateTermsAndConditionsRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.AbstractC2229V7;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBody;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.ChangeStoreSubscriptionResponse;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.GetMySubscribedStoresRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.GetUserInfoRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.SetUserMultipartRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.SetUserRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.SetUserSettings;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store.ChangeStoreSubscriptionRequest;
import cm.aptoide.p092pt.dataprovider.util.HashMapNotNull;
import cm.aptoide.p092pt.logger.Logger;
import cm.aptoide.p092pt.networking.Authentication;
import cm.aptoide.p092pt.networking.AuthenticationPersistence;
import com.aptoide.authentication.model.CodeAuth;
import com.aptoide.authentication.model.OAuth2;
import com.aptoide.authenticationrx.AptoideAuthenticationRx;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import p024c.p052i.p059j.C0955e;
import p319g.p320a.p321a.p322a.C9059d;
import p456rx.C11231b;
import p456rx.C11234e;
import p456rx.Single;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;
import p456rx.p460m.InterfaceC11257f;
import p456rx.p460m.InterfaceC11258g;
import retrofit2.Converter;

/* loaded from: classes.dex */
public class AccountServiceV3 implements AccountService {
    private final AccountFactory accountFactory;
    private final AptoideAuthenticationRx aptoideAuthentication;
    private final AuthenticationPersistence authenticationPersistence;
    private final BodyInterceptor<BaseBody> bodyInterceptorPoolV7;
    private final BodyInterceptor<BaseBody> bodyInterceptorWebV7;
    private final Converter.Factory converterFactory;
    private final BodyInterceptor<cm.aptoide.p092pt.dataprovider.p097ws.p100v3.BaseBody> defaultBodyInterceptorV3;
    private final String extraId;
    private final OkHttpClient httpClient;
    private final OkHttpClient longTimeoutHttpClient;
    private final BodyInterceptor<HashMapNotNull<String, RequestBody>> multipartBodyInterceptorV7;
    private final OAuthModeProvider oAuthModeProvider;
    private final ObjectMapper serializer;
    private final SharedPreferences sharedPreferences;
    private final TokenInvalidator tokenInvalidator;
    private final BodyInterceptor<cm.aptoide.p092pt.dataprovider.p097ws.p100v3.BaseBody> v3NoAuthorizationBodyInterceptor;

    public AccountServiceV3(AccountFactory accountFactory, OkHttpClient okHttpClient, OkHttpClient okHttpClient2, Converter.Factory factory, ObjectMapper objectMapper, SharedPreferences sharedPreferences, String str, TokenInvalidator tokenInvalidator, AuthenticationPersistence authenticationPersistence, BodyInterceptor<cm.aptoide.p092pt.dataprovider.p097ws.p100v3.BaseBody> bodyInterceptor, BodyInterceptor<cm.aptoide.p092pt.dataprovider.p097ws.p100v3.BaseBody> bodyInterceptor2, BodyInterceptor<HashMapNotNull<String, RequestBody>> bodyInterceptor3, BodyInterceptor<BaseBody> bodyInterceptor4, BodyInterceptor<BaseBody> bodyInterceptor5, OAuthModeProvider oAuthModeProvider, AptoideAuthenticationRx aptoideAuthenticationRx) {
        this.accountFactory = accountFactory;
        this.httpClient = okHttpClient;
        this.longTimeoutHttpClient = okHttpClient2;
        this.converterFactory = factory;
        this.serializer = objectMapper;
        this.sharedPreferences = sharedPreferences;
        this.extraId = str;
        this.tokenInvalidator = tokenInvalidator;
        this.authenticationPersistence = authenticationPersistence;
        this.v3NoAuthorizationBodyInterceptor = bodyInterceptor;
        this.defaultBodyInterceptorV3 = bodyInterceptor2;
        this.multipartBodyInterceptorV7 = bodyInterceptor3;
        this.bodyInterceptorWebV7 = bodyInterceptor4;
        this.bodyInterceptorPoolV7 = bodyInterceptor5;
        this.oAuthModeProvider = oAuthModeProvider;
        this.aptoideAuthentication = aptoideAuthenticationRx;
    }

    private C11231b changeSubscription(String str, String str2, String str3, ChangeStoreSubscriptionResponse.StoreSubscriptionState storeSubscriptionState) {
        return ChangeStoreSubscriptionRequest.m7484of(str, storeSubscriptionState, str2, str3, this.bodyInterceptorPoolV7, this.httpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences).observe().m40085Z0().m39934z();
    }

    private String getRemoteOrLocalEmail(String str, GetUserMeta.Data data) {
        return (data.getIdentity().getEmail() == null || data.getIdentity().getEmail().isEmpty()) ? str : data.getIdentity().getEmail();
    }

    private Single<GetUserInfo> getServerAccount() {
        return GetUserInfoRequest.m7447of(this.httpClient, this.converterFactory, this.bodyInterceptorWebV7, this.tokenInvalidator).observe(true, false).m40085Z0().m39920i(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.n
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return AccountServiceV3.lambda$getServerAccount$22((GetUserInfo) obj);
            }
        }).m39927s(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.g
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7249f.m6848g((C11234e) obj);
            }
        });
    }

    private Single<List<Store>> getSubscribedStores() {
        return new GetMySubscribedStoresRequest(this.bodyInterceptorPoolV7, this.httpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences).observe().m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.b
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return ((GetMySubscribedStoresResponse) obj).getDataList().getList();
            }
        }).m40066J(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.w
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                List list = (List) obj;
                AccountServiceV3.lambda$getSubscribedStores$20(list);
                return list;
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.z
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7504f.m6849h((cm.aptoide.p092pt.dataprovider.model.p096v7.store.Store) obj);
            }
        }).m40084Y0().m40085Z0();
    }

    private Single<TermsAndConditionsResponse> getTermsAndConditionsForAccount() {
        return GetTermsAndConditionsStatusRequest.m7430of(this.defaultBodyInterceptorV3, this.converterFactory, this.httpClient, this.tokenInvalidator, this.sharedPreferences).observe(true).m40085Z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$createAccount$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m6842a(Authentication authentication) {
        return getAccount(authentication.getEmail());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$createAccount$5, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m6843b(String str, String str2, String str3, OAuth oAuth) {
        return !oAuth.hasErrors() ? this.authenticationPersistence.createAuthentication(str, str2, oAuth.getRefreshToken(), oAuth.getAccessToken(), str3).m39975c(this.authenticationPersistence.getAuthentication().m39920i(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.u
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7285f.m6842a((Authentication) obj);
            }
        })) : Single.m39911h(new AccountException(oAuth));
    }

    static /* synthetic */ Single lambda$createAccount$6(Throwable th) {
        return th instanceof AptoideWsV3Exception ? Single.m39911h(new AccountException((AptoideWsV3Exception) th)) : Single.m39911h(th);
    }

    static /* synthetic */ Account lambda$createAccount$7(C0955e c0955e) {
        return (Account) c0955e.f6405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$createAccount$8, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m6844c(String str, String str2, BaseV3Response baseV3Response) {
        return baseV3Response.hasErrors() ? Single.m39911h(new AccountException(baseV3Response.getErrors())) : getAccount(str, str2, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET).m39923n(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.l
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return AccountServiceV3.lambda$createAccount$7((C0955e) obj);
            }
        });
    }

    static /* synthetic */ Single lambda$createAccount$9(Throwable th) {
        return th instanceof AptoideWsV3Exception ? Single.m39911h(new AccountException((AptoideWsV3Exception) th)) : Single.m39911h(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getAccount$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m6845d(final OAuth2 oAuth2, Authentication authentication) {
        return getAccount(authentication.getEmail()).m39923n(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.r
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return C0955e.m6059a((Account) obj, Boolean.valueOf(oAuth2.getSignup()));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getAccount$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m6847f(String str, String str2, final OAuth2 oAuth2) {
        return this.authenticationPersistence.createAuthentication(str, str2, oAuth2.getData().getRefreshToken(), oAuth2.getData().getAccessToken(), AptoideAccountManager.APTOIDE_SIGN_UP_TYPE).m39975c(this.authenticationPersistence.getAuthentication().m39920i(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.f
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7241f.m6845d(oAuth2, (Authentication) obj);
            }
        }));
    }

    static /* synthetic */ Single lambda$getAccount$3(Throwable th) {
        return th instanceof AptoideWsV3Exception ? Single.m39911h(new AccountException((AptoideWsV3Exception) th)) : Single.m39911h(th);
    }

    static /* synthetic */ Single lambda$getServerAccount$22(GetUserInfo getUserInfo) {
        return getUserInfo.isOk() ? Single.m39913m(getUserInfo) : Single.m39911h(new Exception(AbstractC2229V7.getErrorMessage(getUserInfo)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getServerAccount$24, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m6848g(C11234e c11234e) {
        return retryOnTicket(c11234e).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.account.j
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                Logger.getInstance().m8285w("AccountManagerService", "retryOnTicket() doOnNext()");
            }
        });
    }

    static /* synthetic */ Iterable lambda$getSubscribedStores$20(List list) {
        return list;
    }

    static /* synthetic */ Throwable lambda$retryOnTicket$16(Long l) {
        return null;
    }

    static /* synthetic */ C11234e lambda$retryOnTicket$17(Throwable th, Integer num) {
        try {
            List<BaseV7Response.Error> errors = ((AptoideWsV7Exception) th).getBaseResponse().getErrors();
            if (errors != null && !errors.isEmpty() && errors.get(0).getCode().equalsIgnoreCase("user-1")) {
                return C11234e.m40028U0((long) Math.pow(5.0d, num.intValue()), TimeUnit.SECONDS).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.v
                    @Override // p456rx.p460m.InterfaceC11256e
                    public final Object call(Object obj) {
                        AccountServiceV3.lambda$retryOnTicket$16((Long) obj);
                        return null;
                    }
                });
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return C11234e.m40017C(th);
    }

    static /* synthetic */ C11234e lambda$retryOnTicket$18(C11234e c11234e) {
        return c11234e;
    }

    static /* synthetic */ C11231b lambda$updateAccount$12(BaseV7Response baseV7Response) {
        return baseV7Response.isOk() ? C11231b.m39946e() : C11231b.m39951s(new Exception(AbstractC2229V7.getErrorMessage(baseV7Response)));
    }

    static /* synthetic */ C11231b lambda$updateAccount$13(BaseV7Response baseV7Response) {
        return baseV7Response.isOk() ? C11231b.m39946e() : C11231b.m39951s(new Exception(AbstractC2229V7.getErrorMessage(baseV7Response)));
    }

    static /* synthetic */ C11231b lambda$updateAccount$15(BaseV7Response baseV7Response) {
        return baseV7Response.isOk() ? C11231b.m39946e() : C11231b.m39951s(new Exception(AbstractC2229V7.getErrorMessage(baseV7Response)));
    }

    static /* synthetic */ C11231b lambda$updateAccountUsername$14(BaseV7Response baseV7Response) {
        return baseV7Response.isOk() ? C11231b.m39946e() : C11231b.m39951s(new Exception(AbstractC2229V7.getErrorMessage(baseV7Response)));
    }

    static /* synthetic */ C11231b lambda$updateTermsAndConditions$10(BaseV3Response baseV3Response) {
        return baseV3Response.isOk() ? C11231b.m39946e() : C11231b.m39951s(new Exception(AbstractC2225V3.getErrorMessage(baseV3Response)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mapServerAccountToAccount, reason: merged with bridge method [inline-methods] */
    public Account m6846e(GetUserInfo getUserInfo, List<Store> list, TermsAndConditionsResponse termsAndConditionsResponse, String str) {
        GetUserMeta.Data data = getUserInfo.getNodes().getMeta().getData();
        GetUserSettings.Data data2 = getUserInfo.getNodes().getSettings().getData();
        return this.accountFactory.createAccount(data.getAccess(), list, String.valueOf(data.getId()), getRemoteOrLocalEmail(str, data), data.getName(), data.getAvatar(), lambda$getSubscribedStores$21(data.getStore()), data2.isMature(), data2.getAccess().isConfirmed(), termsAndConditionsResponse.isOk() && termsAndConditionsResponse.isPrivacy(), termsAndConditionsResponse.isOk() && termsAndConditionsResponse.isTos());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mapToStore, reason: merged with bridge method [inline-methods] */
    public Store m6849h(cm.aptoide.p092pt.dataprovider.model.p096v7.store.Store store) {
        if (store == null) {
            return Store.emptyStore();
        }
        return new Store(store.getStats() == null ? 0L : store.getStats().getDownloads(), store.getAvatar(), store.getId(), store.getName(), store.getAppearance() == null ? "DEFAULT" : store.getAppearance().getTheme(), null, null, cm.aptoide.p092pt.dataprovider.model.p096v7.store.Store.PUBLIC_ACCESS.equalsIgnoreCase(store.getAccess()));
    }

    private C11234e<Throwable> retryOnTicket(C11234e<? extends Throwable> c11234e) {
        return c11234e.m40090e1(C11234e.m40050r0(2, 4), new InterfaceC11257f() { // from class: cm.aptoide.pt.account.y
            @Override // p456rx.p460m.InterfaceC11257f
            /* renamed from: a */
            public final Object mo6865a(Object obj, Object obj2) {
                return AccountServiceV3.lambda$retryOnTicket$17((Throwable) obj, (Integer) obj2);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.e
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                C11234e c11234e2 = (C11234e) obj;
                AccountServiceV3.lambda$retryOnTicket$18(c11234e2);
                return c11234e2;
            }
        });
    }

    @Override // cm.aptoide.accountmanager.AccountService
    public Single<Account> createAccount(final String str, final String str2, final String str3) {
        return OAuth2AuthenticationRequest.m7432of(str, str2, str3, this.v3NoAuthorizationBodyInterceptor, this.httpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences, this.extraId, this.oAuthModeProvider.getAuthMode(str3)).observe().m40085Z0().m39920i(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.k
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7258f.m6843b(str, str2, str3, (OAuth) obj);
            }
        }).m39925q(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.i
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return AccountServiceV3.lambda$createAccount$6((Throwable) obj);
            }
        });
    }

    @Override // cm.aptoide.accountmanager.AccountService
    public Single<C0955e<Account, Boolean>> getAccount(final String str, final String str2, String str3, String str4) {
        return C9059d.m29126d(this.aptoideAuthentication.authenticate(str2, str3, str4)).m39920i(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.p
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7272f.m6847f(str, str2, (OAuth2) obj);
            }
        }).m39925q(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.q
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return AccountServiceV3.lambda$getAccount$3((Throwable) obj);
            }
        });
    }

    @Override // cm.aptoide.accountmanager.AccountService
    public C11231b removeAccount() {
        return this.authenticationPersistence.removeAuthentication();
    }

    @Override // cm.aptoide.accountmanager.AccountService
    public Single<CodeAuth> sendMagicLink(String str) {
        return C9059d.m29126d(this.aptoideAuthentication.sendMagicLink(str));
    }

    @Override // cm.aptoide.accountmanager.AccountService
    public C11231b subscribeStore(String str, String str2, String str3) {
        return changeSubscription(str, str2, str3, ChangeStoreSubscriptionResponse.StoreSubscriptionState.SUBSCRIBED);
    }

    @Override // cm.aptoide.accountmanager.AccountService
    public C11231b unsubscribeStore(String str, String str2, String str3) {
        return changeSubscription(str, str2, str3, ChangeStoreSubscriptionResponse.StoreSubscriptionState.UNSUBSCRIBED);
    }

    @Override // cm.aptoide.accountmanager.AccountService
    public C11231b updateAccount(String str, String str2) {
        return SetUserMultipartRequest.m7462of(str, str2, this.multipartBodyInterceptorV7, this.longTimeoutHttpClient, this.converterFactory, this.serializer, this.tokenInvalidator).observe(true, false).m40085Z0().m39921j(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.h
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return AccountServiceV3.lambda$updateAccount$12((BaseV7Response) obj);
            }
        });
    }

    @Override // cm.aptoide.accountmanager.AccountService
    public C11231b updateAccountUsername(String str) {
        return SetUserRequest.ofWithName(str, this.bodyInterceptorPoolV7, this.httpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences).observe(true, false).m40085Z0().m39921j(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.c
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return AccountServiceV3.lambda$updateAccountUsername$14((BaseV7Response) obj);
            }
        });
    }

    @Override // cm.aptoide.accountmanager.AccountService
    public C11231b updateTermsAndConditions() {
        return UpdateTermsAndConditionsRequest.m7434of(this.defaultBodyInterceptorV3, this.converterFactory, this.httpClient, this.tokenInvalidator, this.sharedPreferences).observe(true).m40085Z0().m39921j(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.m
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return AccountServiceV3.lambda$updateTermsAndConditions$10((BaseV3Response) obj);
            }
        });
    }

    @Override // cm.aptoide.accountmanager.AccountService
    public Single<Account> getAccount(final String str) {
        return Single.m39906B(getServerAccount(), getSubscribedStores(), getTermsAndConditionsForAccount(), new InterfaceC11258g() { // from class: cm.aptoide.pt.account.o
            @Override // p456rx.p460m.InterfaceC11258g
            /* renamed from: a */
            public final Object mo6864a(Object obj, Object obj2, Object obj3) {
                return this.f7269a.m6846e(str, (GetUserInfo) obj, (List) obj2, (TermsAndConditionsResponse) obj3);
            }
        });
    }

    @Override // cm.aptoide.accountmanager.AccountService
    public C11231b updateAccount(String str) {
        return SetUserRequest.m7463of(str, this.bodyInterceptorPoolV7, this.httpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences).observe(true, false).m40085Z0().m39921j(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.d
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return AccountServiceV3.lambda$updateAccount$13((BaseV7Response) obj);
            }
        });
    }

    @Override // cm.aptoide.accountmanager.AccountService
    public Single<Account> createAccount(final String str, final String str2) {
        return CreateUserRequest.m7429of(str.toLowerCase(), str2, this.v3NoAuthorizationBodyInterceptor, this.httpClient, this.tokenInvalidator, this.sharedPreferences, this.extraId).observe(true).m40085Z0().m39920i(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.x
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7500f.m6844c(str, str2, (BaseV3Response) obj);
            }
        }).m39925q(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.s
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return AccountServiceV3.lambda$createAccount$9((Throwable) obj);
            }
        });
    }

    @Override // cm.aptoide.accountmanager.AccountService
    public C11231b updateAccount(boolean z) {
        return SetUserSettings.m7464of(z, this.httpClient, this.converterFactory, this.bodyInterceptorPoolV7, this.tokenInvalidator).observe(true, false).m40085Z0().m39921j(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.t
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return AccountServiceV3.lambda$updateAccount$15((BaseV7Response) obj);
            }
        });
    }
}
