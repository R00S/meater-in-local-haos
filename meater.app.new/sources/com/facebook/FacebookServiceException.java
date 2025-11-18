package com.facebook;

import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: FacebookServiceException.kt */
@Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u0019\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0019\u0010\n\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u0010"}, m32267d2 = {"Lcom/facebook/FacebookServiceException;", "Lcom/facebook/FacebookException;", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "()Ljava/lang/String;", "Lcom/facebook/FacebookRequestError;", "h", "Lcom/facebook/FacebookRequestError;", "c", "()Lcom/facebook/FacebookRequestError;", "requestError", "errorMessage", "<init>", "(Lcom/facebook/FacebookRequestError;Ljava/lang/String;)V", "g", "a", "facebook-core_release"}, m32268k = 1, m32269mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class FacebookServiceException extends FacebookException {

    /* renamed from: h, reason: from kotlin metadata */
    private final FacebookRequestError requestError;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FacebookServiceException(FacebookRequestError facebookRequestError, String str) {
        super(str);
        C9801m.m32346f(facebookRequestError, "requestError");
        this.requestError = facebookRequestError;
    }

    /* renamed from: c, reason: from getter */
    public final FacebookRequestError getRequestError() {
        return this.requestError;
    }

    @Override // com.facebook.FacebookException, java.lang.Throwable
    public String toString() {
        String str = "{FacebookServiceException: httpResponseCode: " + this.requestError.m11144f() + ", facebookErrorCode: " + this.requestError.m11140b() + ", facebookErrorType: " + this.requestError.m11142d() + ", message: " + this.requestError.m11141c() + "}";
        C9801m.m32345e(str, "StringBuilder()\n        .append(\"{FacebookServiceException: \")\n        .append(\"httpResponseCode: \")\n        .append(requestError.requestStatusCode)\n        .append(\", facebookErrorCode: \")\n        .append(requestError.errorCode)\n        .append(\", facebookErrorType: \")\n        .append(requestError.errorType)\n        .append(\", message: \")\n        .append(requestError.errorMessage)\n        .append(\"}\")\n        .toString()");
        return str;
    }
}
