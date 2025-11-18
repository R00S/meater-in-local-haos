package com.facebook;

import kotlin.Metadata;
import okhttp3.HttpUrl;

/* compiled from: FacebookAuthorizationException.kt */
@Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00072\u00020\u0001:\u0001\bB\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0013\b\u0016\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0002\u0010\u0006¨\u0006\t"}, m32267d2 = {"Lcom/facebook/FacebookAuthorizationException;", "Lcom/facebook/FacebookException;", "<init>", "()V", HttpUrl.FRAGMENT_ENCODE_SET, "message", "(Ljava/lang/String;)V", "g", "a", "facebook-common_release"}, m32268k = 1, m32269mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class FacebookAuthorizationException extends FacebookException {
    public FacebookAuthorizationException() {
    }

    public FacebookAuthorizationException(String str) {
        super(str);
    }
}
