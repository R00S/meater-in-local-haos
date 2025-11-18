package com.aptoide.authentication;

import com.aptoide.authentication.model.CodeAuth;
import com.aptoide.authentication.model.OAuth2;
import com.aptoide.authentication.service.AuthenticationService;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C9801m;
import kotlin.text.C10546u;
import okhttp3.HttpUrl;

/* compiled from: AptoideAuthentication.kt */
@Metadata(m32266d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J)\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, m32267d2 = {"Lcom/aptoide/authentication/AptoideAuthentication;", HttpUrl.FRAGMENT_ENCODE_SET, "service", "Lcom/aptoide/authentication/service/AuthenticationService;", "(Lcom/aptoide/authentication/service/AuthenticationService;)V", "authenticate", "Lcom/aptoide/authentication/model/OAuth2;", "magicCode", HttpUrl.FRAGMENT_ENCODE_SET, "state", "agent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendMagicLink", "Lcom/aptoide/authentication/model/CodeAuth;", "email", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "aptoide-authentication-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class AptoideAuthentication {
    private final AuthenticationService service;

    public AptoideAuthentication(AuthenticationService authenticationService) {
        C9801m.m32346f(authenticationService, "service");
        this.service = authenticationService;
    }

    public final Object authenticate(String str, String str2, String str3, Continuation<? super OAuth2> continuation) {
        return this.service.authenticate(str, str2, str3, continuation);
    }

    public final Object sendMagicLink(String str, Continuation<? super CodeAuth> continuation) {
        if (C10546u.m37518t(str)) {
            throw new AuthenticationException("Email is blank", 0, 2, null);
        }
        return this.service.sendMagicLink(str, continuation);
    }
}
