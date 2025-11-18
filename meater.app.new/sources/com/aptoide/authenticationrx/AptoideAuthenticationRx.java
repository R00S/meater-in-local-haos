package com.aptoide.authenticationrx;

import com.aptoide.authentication.AptoideAuthentication;
import com.aptoide.authentication.model.CodeAuth;
import com.aptoide.authentication.model.OAuth2;
import kotlin.C10568o;
import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C10855d;
import kotlin.coroutines.p442j.internal.DebugMetadata;
import kotlin.coroutines.p442j.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9801m;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.C10892h;
import okhttp3.HttpUrl;
import p323h.p324a.AbstractC9082s;

/* compiled from: AptoideAuthenticationRx.kt */
@Metadata(m32266d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tJ\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\u000e\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m32267d2 = {"Lcom/aptoide/authenticationrx/AptoideAuthenticationRx;", HttpUrl.FRAGMENT_ENCODE_SET, "aptoideAuthentication", "Lcom/aptoide/authentication/AptoideAuthentication;", "(Lcom/aptoide/authentication/AptoideAuthentication;)V", "authenticate", "Lio/reactivex/Single;", "Lcom/aptoide/authentication/model/OAuth2;", "magicCode", HttpUrl.FRAGMENT_ENCODE_SET, "state", "agent", "sendMagicLink", "Lcom/aptoide/authentication/model/CodeAuth;", "email", "aptoide-authentication-rx"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class AptoideAuthenticationRx {
    private final AptoideAuthentication aptoideAuthentication;

    /* compiled from: AptoideAuthenticationRx.kt */
    @Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m32267d2 = {"<anonymous>", "Lcom/aptoide/authentication/model/OAuth2;", "Lkotlinx/coroutines/CoroutineScope;"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
    @DebugMetadata(m39049c = "com.aptoide.authenticationrx.AptoideAuthenticationRx$authenticate$1", m39050f = "AptoideAuthenticationRx.kt", m39051l = {15}, m39052m = "invokeSuspend")
    /* renamed from: com.aptoide.authenticationrx.AptoideAuthenticationRx$authenticate$1 */
    static final class C53341 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super OAuth2>, Object> {
        final /* synthetic */ String $agent;
        final /* synthetic */ String $magicCode;
        final /* synthetic */ String $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C53341(String str, String str2, String str3, Continuation<? super C53341> continuation) {
            super(2, continuation);
            this.$magicCode = str;
            this.$state = str2;
            this.$agent = str3;
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Continuation<C10775u> create(Object obj, Continuation<?> continuation) {
            return AptoideAuthenticationRx.this.new C53341(this.$magicCode, this.$state, this.$agent, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super OAuth2> continuation) {
            return ((C53341) create(coroutineScope, continuation)).invokeSuspend(C10775u.f41439a);
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM39045c = C10855d.m39045c();
            int i2 = this.label;
            if (i2 == 0) {
                C10568o.m37655b(obj);
                AptoideAuthentication aptoideAuthentication = AptoideAuthenticationRx.this.aptoideAuthentication;
                String str = this.$magicCode;
                String str2 = this.$state;
                String str3 = this.$agent;
                this.label = 1;
                obj = aptoideAuthentication.authenticate(str, str2, str3, this);
                if (obj == objM39045c) {
                    return objM39045c;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C10568o.m37655b(obj);
            }
            return obj;
        }
    }

    /* compiled from: AptoideAuthenticationRx.kt */
    @Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m32267d2 = {"<anonymous>", "Lcom/aptoide/authentication/model/CodeAuth;", "Lkotlinx/coroutines/CoroutineScope;"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
    @DebugMetadata(m39049c = "com.aptoide.authenticationrx.AptoideAuthenticationRx$sendMagicLink$1", m39050f = "AptoideAuthenticationRx.kt", m39051l = {11}, m39052m = "invokeSuspend")
    /* renamed from: com.aptoide.authenticationrx.AptoideAuthenticationRx$sendMagicLink$1 */
    static final class C53351 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super CodeAuth>, Object> {
        final /* synthetic */ String $email;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C53351(String str, Continuation<? super C53351> continuation) {
            super(2, continuation);
            this.$email = str;
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Continuation<C10775u> create(Object obj, Continuation<?> continuation) {
            return AptoideAuthenticationRx.this.new C53351(this.$email, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super CodeAuth> continuation) {
            return ((C53351) create(coroutineScope, continuation)).invokeSuspend(C10775u.f41439a);
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM39045c = C10855d.m39045c();
            int i2 = this.label;
            if (i2 == 0) {
                C10568o.m37655b(obj);
                AptoideAuthentication aptoideAuthentication = AptoideAuthenticationRx.this.aptoideAuthentication;
                String str = this.$email;
                this.label = 1;
                obj = aptoideAuthentication.sendMagicLink(str, this);
                if (obj == objM39045c) {
                    return objM39045c;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C10568o.m37655b(obj);
            }
            return obj;
        }
    }

    public AptoideAuthenticationRx(AptoideAuthentication aptoideAuthentication) {
        C9801m.m32346f(aptoideAuthentication, "aptoideAuthentication");
        this.aptoideAuthentication = aptoideAuthentication;
    }

    public final AbstractC9082s<OAuth2> authenticate(String str, String str2, String str3) {
        C9801m.m32346f(str, "magicCode");
        C9801m.m32346f(str2, "state");
        C9801m.m32346f(str3, "agent");
        return C10892h.m39135c(null, new C53341(str, str2, str3, null), 1, null);
    }

    public final AbstractC9082s<CodeAuth> sendMagicLink(String str) {
        C9801m.m32346f(str, "email");
        return C10892h.m39135c(null, new C53351(str, null), 1, null);
    }
}
