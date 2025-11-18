package com.aptoide.authentication;

import kotlin.Metadata;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: AuthenticationException.kt */
@Metadata(m32266d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m32267d2 = {"Lcom/aptoide/authentication/AuthenticationException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "message", HttpUrl.FRAGMENT_ENCODE_SET, "code", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;I)V", "getCode", "()I", "aptoide-authentication-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class AuthenticationException extends RuntimeException {
    private final int code;

    public /* synthetic */ AuthenticationException(String str, int i2, int i3, C9789g c9789g) {
        this(str, (i3 & 2) != 0 ? 0 : i2);
    }

    public final int getCode() {
        return this.code;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthenticationException(String str, int i2) {
        super(str + i2);
        C9801m.m32346f(str, "message");
        this.code = i2;
    }
}
