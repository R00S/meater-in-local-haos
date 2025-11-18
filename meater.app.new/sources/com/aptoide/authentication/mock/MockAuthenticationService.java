package com.aptoide.authentication.mock;

import com.aptoide.authentication.service.AuthenticationService;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.p442j.internal.ContinuationImpl;
import kotlin.coroutines.p442j.internal.DebugMetadata;
import okhttp3.HttpUrl;

/* compiled from: MockAuthenticationService.kt */
@Metadata(m32266d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J)\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, m32267d2 = {"Lcom/aptoide/authentication/mock/MockAuthenticationService;", "Lcom/aptoide/authentication/service/AuthenticationService;", "()V", "authenticate", "Lcom/aptoide/authentication/model/OAuth2;", "magicToken", HttpUrl.FRAGMENT_ENCODE_SET, "state", "agent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendMagicLink", "Lcom/aptoide/authentication/model/CodeAuth;", "email", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "aptoide-authentication-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class MockAuthenticationService implements AuthenticationService {

    /* compiled from: MockAuthenticationService.kt */
    @Metadata(m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
    @DebugMetadata(m39049c = "com.aptoide.authentication.mock.MockAuthenticationService", m39050f = "MockAuthenticationService.kt", m39051l = {19}, m39052m = "authenticate")
    /* renamed from: com.aptoide.authentication.mock.MockAuthenticationService$authenticate$1 */
    static final class C53301 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C53301(Continuation<? super C53301> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MockAuthenticationService.this.authenticate(null, null, null, this);
        }
    }

    /* compiled from: MockAuthenticationService.kt */
    @Metadata(m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
    @DebugMetadata(m39049c = "com.aptoide.authentication.mock.MockAuthenticationService", m39050f = "MockAuthenticationService.kt", m39051l = {11}, m39052m = "sendMagicLink")
    /* renamed from: com.aptoide.authentication.mock.MockAuthenticationService$sendMagicLink$1 */
    static final class C53311 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C53311(Continuation<? super C53311> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MockAuthenticationService.this.sendMagicLink(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.aptoide.authentication.service.AuthenticationService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object authenticate(java.lang.String r7, java.lang.String r8, java.lang.String r9, kotlin.coroutines.Continuation<? super com.aptoide.authentication.model.OAuth2> r10) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r7 = r10 instanceof com.aptoide.authentication.mock.MockAuthenticationService.C53301
            if (r7 == 0) goto L13
            r7 = r10
            com.aptoide.authentication.mock.MockAuthenticationService$authenticate$1 r7 = (com.aptoide.authentication.mock.MockAuthenticationService.C53301) r7
            int r8 = r7.label
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r8 & r9
            if (r0 == 0) goto L13
            int r8 = r8 - r9
            r7.label = r8
            goto L18
        L13:
            com.aptoide.authentication.mock.MockAuthenticationService$authenticate$1 r7 = new com.aptoide.authentication.mock.MockAuthenticationService$authenticate$1
            r7.<init>(r10)
        L18:
            java.lang.Object r8 = r7.result
            java.lang.Object r9 = kotlin.coroutines.intrinsics.C10853b.m39042c()
            int r10 = r7.label
            r0 = 1
            if (r10 == 0) goto L31
            if (r10 != r0) goto L29
            kotlin.C10568o.m37655b(r8)
            goto L3f
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            kotlin.C10568o.m37655b(r8)
            r1 = 200(0xc8, double:9.9E-322)
            r7.label = r0
            java.lang.Object r7 = kotlinx.coroutines.C11069y0.m39710a(r1, r7)
            if (r7 != r9) goto L3f
            return r9
        L3f:
            com.aptoide.authentication.model.OAuth2 r7 = new com.aptoide.authentication.model.OAuth2
            r8 = 0
            com.aptoide.authentication.model.OAuth2$Data r9 = new com.aptoide.authentication.model.OAuth2$Data
            r2 = 3000(0xbb8, float:4.204E-42)
            r5 = 0
            java.lang.String r1 = "accesst0k3nF4k3"
            java.lang.String r3 = "r3fr3shT0k3nF4k3"
            java.lang.String r4 = "Bearer"
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            java.lang.String r10 = "OAUTH2"
            r7.<init>(r10, r8, r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aptoide.authentication.mock.MockAuthenticationService.authenticate(java.lang.String, java.lang.String, java.lang.String, kotlin.y.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.aptoide.authentication.service.AuthenticationService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object sendMagicLink(java.lang.String r9, kotlin.coroutines.Continuation<? super com.aptoide.authentication.model.CodeAuth> r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r9 = r10 instanceof com.aptoide.authentication.mock.MockAuthenticationService.C53311
            if (r9 == 0) goto L13
            r9 = r10
            com.aptoide.authentication.mock.MockAuthenticationService$sendMagicLink$1 r9 = (com.aptoide.authentication.mock.MockAuthenticationService.C53311) r9
            int r0 = r9.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r9.label = r0
            goto L18
        L13:
            com.aptoide.authentication.mock.MockAuthenticationService$sendMagicLink$1 r9 = new com.aptoide.authentication.mock.MockAuthenticationService$sendMagicLink$1
            r9.<init>(r10)
        L18:
            java.lang.Object r10 = r9.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C10853b.m39042c()
            int r1 = r9.label
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            kotlin.C10568o.m37655b(r10)
            goto L3f
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L31:
            kotlin.C10568o.m37655b(r10)
            r3 = 200(0xc8, double:9.9E-322)
            r9.label = r2
            java.lang.Object r9 = kotlinx.coroutines.C11069y0.m39710a(r3, r9)
            if (r9 != r0) goto L3f
            return r0
        L3f:
            com.aptoide.authentication.model.CodeAuth r9 = new com.aptoide.authentication.model.CodeAuth
            r5 = 0
            com.aptoide.authentication.model.CodeAuth$Data r6 = new com.aptoide.authentication.model.CodeAuth$Data
            java.lang.String r10 = "TOKEN"
            java.lang.String r0 = "EMAIL"
            r6.<init>(r10, r0)
            java.lang.String r2 = "code"
            java.lang.String r3 = "estado de arte"
            java.lang.String r4 = "agente da pejota"
            java.lang.String r7 = "filipo@emailo.como"
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aptoide.authentication.mock.MockAuthenticationService.sendMagicLink(java.lang.String, kotlin.y.d):java.lang.Object");
    }
}
