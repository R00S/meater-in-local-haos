package com.aptoide.authentication.network;

import com.aptoide.authentication.AuthenticationException;
import com.aptoide.authentication.model.CodeAuth;
import com.aptoide.authentication.model.OAuth2;
import com.aptoide.authentication.service.AuthenticationService;
import com.squareup.moshi.C8728r;
import com.squareup.moshi.InterfaceC8717g;
import com.squareup.moshi.p232x.reflect.KotlinJsonAdapterFactory;
import java.util.Arrays;
import kotlin.C10568o;
import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C10855d;
import kotlin.coroutines.p442j.internal.DebugMetadata;
import kotlin.coroutines.p442j.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9801m;
import kotlinx.coroutines.C10961h;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* compiled from: RemoteAuthenticationService.kt */
@Metadata(m32266d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0013\u0014B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J)\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, m32267d2 = {"Lcom/aptoide/authentication/network/RemoteAuthenticationService;", "Lcom/aptoide/authentication/service/AuthenticationService;", "authenticationBaseHost", HttpUrl.FRAGMENT_ENCODE_SET, "okHttpClient", "Lokhttp3/OkHttpClient;", "(Ljava/lang/String;Lokhttp3/OkHttpClient;)V", "authorizationV7", "Lcom/aptoide/authentication/network/RemoteAuthenticationService$AuthorizationV7;", "authenticate", "Lcom/aptoide/authentication/model/OAuth2;", "magicToken", "state", "agent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendMagicLink", "Lcom/aptoide/authentication/model/CodeAuth;", "email", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "AuthorizationV7", "Credentials", "aptoide-authentication-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class RemoteAuthenticationService implements AuthenticationService {
    private final String authenticationBaseHost;
    private final AuthorizationV7 authorizationV7;

    /* compiled from: RemoteAuthenticationService.kt */
    @Metadata(m32266d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JO\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\b2\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\b\b\u0001\u0010\f\u001a\u00020\rH§@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ;\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\b\b\u0001\u0010\f\u001a\u00020\rH§@ø\u0001\u0000¢\u0006\u0002\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, m32267d2 = {"Lcom/aptoide/authentication/network/RemoteAuthenticationService$AuthorizationV7;", HttpUrl.FRAGMENT_ENCODE_SET, "authenticate", "Lretrofit2/Response;", "Lcom/aptoide/authentication/model/OAuth2;", "type", "Lcom/aptoide/authentication/network/Type;", "state", HttpUrl.FRAGMENT_ENCODE_SET, "agent", "accepted", HttpUrl.FRAGMENT_ENCODE_SET, "credentials", "Lcom/aptoide/authentication/network/RemoteAuthenticationService$Credentials;", "(Lcom/aptoide/authentication/network/Type;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Lcom/aptoide/authentication/network/RemoteAuthenticationService$Credentials;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendMagicLink", "Lcom/aptoide/authentication/model/CodeAuth;", "(Lcom/aptoide/authentication/network/Type;[Ljava/lang/String;Lcom/aptoide/authentication/network/RemoteAuthenticationService$Credentials;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "aptoide-authentication-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    public interface AuthorizationV7 {
        @POST("user/authorize")
        Object authenticate(@Query("type") Type type, @Query("state") String str, @Query("agent") String str2, @Query(encoded = true, value = "accepted[]") String[] strArr, @Body Credentials credentials, Continuation<? super Response<OAuth2>> continuation);

        @POST("user/authorize")
        Object sendMagicLink(@Query("type") Type type, @Query(encoded = true, value = "accepted[]") String[] strArr, @Body Credentials credentials, Continuation<? super Response<CodeAuth>> continuation);
    }

    /* compiled from: RemoteAuthenticationService.kt */
    @InterfaceC8717g(generateAdapter = true)
    @Metadata(m32266d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ(\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m32267d2 = {"Lcom/aptoide/authentication/network/RemoteAuthenticationService$Credentials;", HttpUrl.FRAGMENT_ENCODE_SET, "credential", HttpUrl.FRAGMENT_ENCODE_SET, "supported", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;[Ljava/lang/String;)V", "getCredential", "()Ljava/lang/String;", "getSupported", "()[Ljava/lang/String;", "[Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/String;[Ljava/lang/String;)Lcom/aptoide/authentication/network/RemoteAuthenticationService$Credentials;", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "aptoide-authentication-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    public static final /* data */ class Credentials {
        private final String credential;
        private final String[] supported;

        public Credentials(String str, String[] strArr) {
            C9801m.m32346f(str, "credential");
            C9801m.m32346f(strArr, "supported");
            this.credential = str;
            this.supported = strArr;
        }

        public static /* synthetic */ Credentials copy$default(Credentials credentials, String str, String[] strArr, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = credentials.credential;
            }
            if ((i2 & 2) != 0) {
                strArr = credentials.supported;
            }
            return credentials.copy(str, strArr);
        }

        /* renamed from: component1, reason: from getter */
        public final String getCredential() {
            return this.credential;
        }

        /* renamed from: component2, reason: from getter */
        public final String[] getSupported() {
            return this.supported;
        }

        public final Credentials copy(String credential, String[] supported) {
            C9801m.m32346f(credential, "credential");
            C9801m.m32346f(supported, "supported");
            return new Credentials(credential, supported);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Credentials)) {
                return false;
            }
            Credentials credentials = (Credentials) other;
            return C9801m.m32341a(this.credential, credentials.credential) && C9801m.m32341a(this.supported, credentials.supported);
        }

        public final String getCredential() {
            return this.credential;
        }

        public final String[] getSupported() {
            return this.supported;
        }

        public int hashCode() {
            return (this.credential.hashCode() * 31) + Arrays.hashCode(this.supported);
        }

        public String toString() {
            return "Credentials(credential=" + this.credential + ", supported=" + Arrays.toString(this.supported) + ')';
        }
    }

    /* compiled from: RemoteAuthenticationService.kt */
    @Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m32267d2 = {"<anonymous>", "Lcom/aptoide/authentication/model/OAuth2;", "Lkotlinx/coroutines/CoroutineScope;"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
    @DebugMetadata(m39049c = "com.aptoide.authentication.network.RemoteAuthenticationService$authenticate$2", m39050f = "RemoteAuthenticationService.kt", m39051l = {53}, m39052m = "invokeSuspend")
    /* renamed from: com.aptoide.authentication.network.RemoteAuthenticationService$authenticate$2 */
    static final class C53322 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super OAuth2>, Object> {
        final /* synthetic */ String $agent;
        final /* synthetic */ String $magicToken;
        final /* synthetic */ String $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C53322(String str, String str2, String str3, Continuation<? super C53322> continuation) {
            super(2, continuation);
            this.$state = str;
            this.$agent = str2;
            this.$magicToken = str3;
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Continuation<C10775u> create(Object obj, Continuation<?> continuation) {
            return RemoteAuthenticationService.this.new C53322(this.$state, this.$agent, this.$magicToken, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super OAuth2> continuation) {
            return ((C53322) create(coroutineScope, continuation)).invokeSuspend(C10775u.f41439a);
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM39045c = C10855d.m39045c();
            int i2 = this.label;
            if (i2 == 0) {
                C10568o.m37655b(obj);
                Credentials credentials = new Credentials(this.$magicToken, new String[]{"OAUTH2"});
                this.label = 1;
                obj = RemoteAuthenticationService.this.authorizationV7.authenticate(Type.CODE, this.$state, this.$agent, new String[]{"TOS", "PRIVACY", "DISTRIBUTION"}, credentials, this);
                if (obj == objM39045c) {
                    return objM39045c;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C10568o.m37655b(obj);
            }
            Response response = (Response) obj;
            OAuth2 oAuth2 = (OAuth2) response.body();
            if (response.isSuccessful() && oAuth2 != null) {
                return oAuth2;
            }
            String strMessage = response.message();
            C9801m.m32345e(strMessage, "authenticateResponse.message()");
            throw new AuthenticationException(strMessage, response.code());
        }
    }

    /* compiled from: RemoteAuthenticationService.kt */
    @Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m32267d2 = {"<anonymous>", "Lcom/aptoide/authentication/model/CodeAuth;", "Lkotlinx/coroutines/CoroutineScope;"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
    @DebugMetadata(m39049c = "com.aptoide.authentication.network.RemoteAuthenticationService$sendMagicLink$2", m39050f = "RemoteAuthenticationService.kt", m39051l = {37}, m39052m = "invokeSuspend")
    /* renamed from: com.aptoide.authentication.network.RemoteAuthenticationService$sendMagicLink$2 */
    static final class C53332 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super CodeAuth>, Object> {
        final /* synthetic */ String $email;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C53332(String str, Continuation<? super C53332> continuation) {
            super(2, continuation);
            this.$email = str;
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Continuation<C10775u> create(Object obj, Continuation<?> continuation) {
            return RemoteAuthenticationService.this.new C53332(this.$email, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super CodeAuth> continuation) {
            return ((C53332) create(coroutineScope, continuation)).invokeSuspend(C10775u.f41439a);
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM39045c = C10855d.m39045c();
            int i2 = this.label;
            if (i2 == 0) {
                C10568o.m37655b(obj);
                Credentials credentials = new Credentials(this.$email, new String[]{"CODE:TOKEN:EMAIL"});
                this.label = 1;
                obj = RemoteAuthenticationService.this.authorizationV7.sendMagicLink(Type.EMAIL, new String[]{"TOS", "PRIVACY", "DISTRIBUTION"}, credentials, this);
                if (obj == objM39045c) {
                    return objM39045c;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C10568o.m37655b(obj);
            }
            Response response = (Response) obj;
            CodeAuth codeAuth = (CodeAuth) response.body();
            if (response.isSuccessful() && codeAuth != null) {
                codeAuth.setEmail(this.$email);
                return codeAuth;
            }
            String strMessage = response.message();
            C9801m.m32345e(strMessage, "sendMagicLinkResponse.message()");
            throw new AuthenticationException(strMessage, response.code());
        }
    }

    public RemoteAuthenticationService(String str, OkHttpClient okHttpClient) throws SecurityException {
        C9801m.m32346f(str, "authenticationBaseHost");
        C9801m.m32346f(okHttpClient, "okHttpClient");
        this.authenticationBaseHost = str;
        Object objCreate = new Retrofit.Builder().baseUrl(str).addConverterFactory(MoshiConverterFactory.create(new C8728r.a().m27814a(new KotlinJsonAdapterFactory()).m27815b())).client(okHttpClient).build().create(AuthorizationV7.class);
        C9801m.m32345e(objCreate, "Builder().baseUrl(authen…horizationV7::class.java)");
        this.authorizationV7 = (AuthorizationV7) objCreate;
    }

    @Override // com.aptoide.authentication.service.AuthenticationService
    public Object authenticate(String str, String str2, String str3, Continuation<? super OAuth2> continuation) {
        return C10961h.m39412e(Dispatchers.m39301b(), new C53322(str2, str3, str, null), continuation);
    }

    @Override // com.aptoide.authentication.service.AuthenticationService
    public Object sendMagicLink(String str, Continuation<? super CodeAuth> continuation) {
        return C10961h.m39412e(Dispatchers.m39301b(), new C53332(str, null), continuation);
    }
}
