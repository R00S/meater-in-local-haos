package cm.aptoide.p092pt.networking;

import android.content.SharedPreferences;
import cm.aptoide.accountmanager.AccountException;
import cm.aptoide.p092pt.dataprovider.exception.AptoideWsV3Exception;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.model.p095v3.OAuth;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p100v3.BaseBody;
import cm.aptoide.p092pt.dataprovider.p097ws.p100v3.OAuth2AuthenticationRequest;
import okhttp3.OkHttpClient;
import p456rx.C11231b;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11256e;
import p456rx.p460m.InterfaceC11257f;
import p456rx.p473s.C11418b;
import retrofit2.Converter;

/* loaded from: classes.dex */
public class RefreshTokenInvalidator implements TokenInvalidator {
    private final int MAX_REFRESH_TOKEN_RETRIES = 3;
    private final AuthenticationPersistence authenticationPersistence;
    private final BodyInterceptor<BaseBody> bodyInterceptor;
    private final Converter.Factory converterFactory;
    private final String extraId;
    private final OkHttpClient httpClient;
    private final C11418b<Void> logoutSubject;
    private final SharedPreferences sharedPreferences;
    private final TokenInvalidator tokenInvalidator;

    public RefreshTokenInvalidator(BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, SharedPreferences sharedPreferences, String str, TokenInvalidator tokenInvalidator, AuthenticationPersistence authenticationPersistence, C11418b<Void> c11418b) {
        this.bodyInterceptor = bodyInterceptor;
        this.httpClient = okHttpClient;
        this.converterFactory = factory;
        this.sharedPreferences = sharedPreferences;
        this.extraId = str;
        this.tokenInvalidator = tokenInvalidator;
        this.authenticationPersistence = authenticationPersistence;
        this.logoutSubject = c11418b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$invalidateAccessToken$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m8303a(OAuth oAuth) {
        return !oAuth.hasErrors() ? this.authenticationPersistence.updateAuthentication(oAuth.getAccessToken()) : C11231b.m39951s(new AccountException(oAuth));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$invalidateAccessToken$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m8304b(Authentication authentication) {
        return OAuth2AuthenticationRequest.m7431of(authentication.getRefreshToken(), this.bodyInterceptor, this.httpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences, this.extraId).observe().m40085Z0().m39921j(new InterfaceC11256e() { // from class: cm.aptoide.pt.networking.u
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10341f.m8303a((OAuth) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$invalidateAccessToken$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m8305c(Throwable th, Integer num) {
        if (num.intValue() < 3) {
            if (th instanceof AptoideWsV3Exception) {
                return null;
            }
        } else if (th instanceof AptoideWsV3Exception) {
            this.logoutSubject.onNext(null);
            return C11231b.m39946e();
        }
        this.logoutSubject.onNext(null);
        return C11231b.m39951s(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$invalidateAccessToken$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8306d(C11234e c11234e) {
        return c11234e.m40090e1(C11234e.m40050r0(1, 3), new InterfaceC11257f() { // from class: cm.aptoide.pt.networking.r
            @Override // p456rx.p460m.InterfaceC11257f
            /* renamed from: a */
            public final Object mo6865a(Object obj, Object obj2) {
                return this.f10338f.m8305c((Throwable) obj, (Integer) obj2);
            }
        });
    }

    public C11418b<Void> getLogoutSubject() {
        return this.logoutSubject;
    }

    @Override // cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator
    public C11231b invalidateAccessToken() {
        return this.authenticationPersistence.getAuthentication().m39921j(new InterfaceC11256e() { // from class: cm.aptoide.pt.networking.s
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10339f.m8304b((Authentication) obj);
            }
        }).m39962F(new InterfaceC11256e() { // from class: cm.aptoide.pt.networking.t
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10340f.m8306d((C11234e) obj);
            }
        });
    }
}
