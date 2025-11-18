package cm.aptoide.p092pt.account.view.store;

import android.content.SharedPreferences;
import android.text.TextUtils;
import cm.aptoide.p092pt.account.view.exception.InvalidImageException;
import cm.aptoide.p092pt.account.view.exception.StoreCreationException;
import cm.aptoide.p092pt.dataprovider.exception.AptoideWsV7Exception;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.model.p095v3.CheckUserCredentialsJson;
import cm.aptoide.p092pt.dataprovider.model.p095v3.ErrorResponse;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p100v3.BaseBody;
import cm.aptoide.p092pt.dataprovider.p097ws.p100v3.CheckUserCredentialsRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.SetStoreImageRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.SimpleSetStoreRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store.RequestBodyFactory;
import cm.aptoide.p092pt.dataprovider.util.HashMapNotNull;
import cm.aptoide.p092pt.store.RoomStoreRepository;
import cm.aptoide.p092pt.themes.StoreTheme;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Collections;
import java.util.List;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import p456rx.C11231b;
import p456rx.C11234e;
import p456rx.Single;
import p456rx.p460m.InterfaceC11256e;
import p456rx.p460m.InterfaceCallableC11255d;
import retrofit2.Converter;

/* loaded from: classes.dex */
public class StoreManager implements cm.aptoide.accountmanager.StoreManager {
    private static final String ERROR_API_1 = "API-1";
    private static final String ERROR_CODE_2 = "WOP-2";
    private static final String ERROR_CODE_3 = "WOP-3";
    private final BodyInterceptor<BaseBody> bodyInterceptorV3;
    private final BodyInterceptor<cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBody> bodyInterceptorV7;
    private final Converter.Factory converterFactory;
    private final OkHttpClient httpClient;
    private final BodyInterceptor<HashMapNotNull<String, RequestBody>> multipartBodyInterceptor;
    private final ObjectMapper objectMapper;
    private final RequestBodyFactory requestBodyFactory;
    private final SharedPreferences sharedPreferences;
    private final RoomStoreRepository storeRepository;
    private final TokenInvalidator tokenInvalidator;

    public StoreManager(OkHttpClient okHttpClient, Converter.Factory factory, BodyInterceptor<HashMapNotNull<String, RequestBody>> bodyInterceptor, BodyInterceptor<BaseBody> bodyInterceptor2, BodyInterceptor<cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBody> bodyInterceptor3, SharedPreferences sharedPreferences, TokenInvalidator tokenInvalidator, RequestBodyFactory requestBodyFactory, ObjectMapper objectMapper, RoomStoreRepository roomStoreRepository) {
        this.httpClient = okHttpClient;
        this.converterFactory = factory;
        this.multipartBodyInterceptor = bodyInterceptor;
        this.bodyInterceptorV3 = bodyInterceptor2;
        this.bodyInterceptorV7 = bodyInterceptor3;
        this.sharedPreferences = sharedPreferences;
        this.tokenInvalidator = tokenInvalidator;
        this.requestBodyFactory = requestBodyFactory;
        this.objectMapper = objectMapper;
        this.storeRepository = roomStoreRepository;
    }

    private C11231b createStore(final String str, final String str2, final String str3, final boolean z, final String str4) {
        return TextUtils.isEmpty(str) ? C11231b.m39951s(new StoreValidationException(0)) : CheckUserCredentialsRequest.toCreateStore(this.bodyInterceptorV3, this.httpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences, str).observe().m40085Z0().m39920i(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.store.c0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return StoreManager.lambda$createStore$2((CheckUserCredentialsJson) obj);
            }
        }).m39921j(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.store.z
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7403f.m6946c(str2, str3, z, str4, str, (CheckUserCredentialsJson) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getOnErrorCompletable, reason: merged with bridge method [inline-methods] */
    public C11231b m6945b(Throwable th) {
        return ((th instanceof StoreCreationException) || (th instanceof InvalidImageException)) ? C11231b.m39951s(th) : th instanceof AptoideWsV7Exception ? ((AptoideWsV7Exception) th).getBaseResponse().getErrors().get(0).getCode().equals(ERROR_API_1) ? C11231b.m39951s(new InvalidImageException(Collections.singletonList(InvalidImageException.ImageError.API_ERROR))) : C11231b.m39951s(new InvalidImageException(Collections.singletonList(InvalidImageException.ImageError.API_ERROR), th.getMessage())) : C11231b.m39951s(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$createOrUpdate$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m6944a(boolean z, String str, String str2, String str3, boolean z2, String str4) {
        return z ? updateStore(str, str2, str3, z2, str4) : createStore(str, str2, str3, z2, str4);
    }

    static /* synthetic */ Single lambda$createStore$2(CheckUserCredentialsJson checkUserCredentialsJson) {
        List<ErrorResponse> errors = checkUserCredentialsJson.getErrors();
        return (errors == null || errors.isEmpty() || !errors.get(0).code.equals(ERROR_CODE_2)) ? (errors == null || errors.size() <= 0 || !errors.get(0).code.equals(ERROR_CODE_3)) ? Single.m39913m(checkUserCredentialsJson) : Single.m39911h(new StoreCreationException(errors.get(0).code)) : Single.m39911h(new StoreCreationException());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$createStore$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m6946c(String str, String str2, boolean z, String str3, String str4, CheckUserCredentialsJson checkUserCredentialsJson) {
        return needToUploadMoreStoreData(str, str2, z, str3) ? updateStore(str4, str, str2, z, str3) : C11231b.m39946e();
    }

    private boolean needToUploadMoreStoreData(String str, String str2, boolean z, String str3) {
        return !TextUtils.isEmpty(str) || (z && !TextUtils.isEmpty(str2)) || !str3.equals(StoreTheme.DEFAULT.toString().toLowerCase());
    }

    private C11231b updateStore(String str, String str2, String str3, boolean z, String str4) {
        return TextUtils.isEmpty(str) ? C11231b.m39951s(new StoreValidationException(0)) : (z && TextUtils.isEmpty(str3)) ? C11231b.m39951s(new StoreValidationException(1)) : z ? updateStoreWithAvatar(str, str2, str4, str3) : updateStoreWithoutAvatar(str, str2, str4);
    }

    private C11231b updateStoreWithAvatar(String str, String str2, String str3, String str4) {
        return SetStoreImageRequest.m7461of(str, str3, str2, str4, this.multipartBodyInterceptor, this.httpClient, this.converterFactory, this.requestBodyFactory, this.objectMapper, this.sharedPreferences, this.tokenInvalidator).observe().m40085Z0().m39934z();
    }

    private C11231b updateStoreWithoutAvatar(String str, String str2, String str3) {
        return SimpleSetStoreRequest.m7465of(str, str3, str2, this.bodyInterceptorV7, this.httpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences).observe().m40083X0();
    }

    @Override // cm.aptoide.accountmanager.StoreManager
    public C11231b createOrUpdate(final String str, final String str2, final String str3, final boolean z, final String str4, final boolean z2) {
        return C11231b.m39949i(new InterfaceCallableC11255d() { // from class: cm.aptoide.pt.account.view.store.b0
            @Override // p456rx.p460m.InterfaceCallableC11255d, java.util.concurrent.Callable
            public final Object call() {
                return this.f7366f.m6944a(z2, str, str2, str3, z, str4);
            }
        }).m39960C(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.store.a0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7364f.m6945b((Throwable) obj);
            }
        });
    }

    public C11234e<Boolean> isSubscribed(long j2) {
        return this.storeRepository.isSubscribed(j2);
    }
}
