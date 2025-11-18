package com.facebook;

import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: FacebookGraphResponseException.kt */
@Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001b\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, m32267d2 = {"Lcom/facebook/FacebookGraphResponseException;", "Lcom/facebook/FacebookException;", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "()Ljava/lang/String;", "Lcom/facebook/d0;", "g", "Lcom/facebook/d0;", "getGraphResponse", "()Lcom/facebook/d0;", "graphResponse", "errorMessage", "<init>", "(Lcom/facebook/d0;Ljava/lang/String;)V", "facebook-core_release"}, m32268k = 1, m32269mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class FacebookGraphResponseException extends FacebookException {

    /* renamed from: g, reason: from kotlin metadata */
    private final C5653d0 graphResponse;

    public FacebookGraphResponseException(C5653d0 c5653d0, String str) {
        super(str);
        this.graphResponse = c5653d0;
    }

    @Override // com.facebook.FacebookException, java.lang.Throwable
    public String toString() {
        C5653d0 c5653d0 = this.graphResponse;
        FacebookRequestError facebookRequestErrorM11338b = c5653d0 == null ? null : c5653d0.m11338b();
        StringBuilder sb = new StringBuilder();
        sb.append("{FacebookGraphResponseException: ");
        String message = getMessage();
        if (message != null) {
            sb.append(message);
            sb.append(" ");
        }
        if (facebookRequestErrorM11338b != null) {
            sb.append("httpResponseCode: ");
            sb.append(facebookRequestErrorM11338b.m11144f());
            sb.append(", facebookErrorCode: ");
            sb.append(facebookRequestErrorM11338b.m11140b());
            sb.append(", facebookErrorType: ");
            sb.append(facebookRequestErrorM11338b.m11142d());
            sb.append(", message: ");
            sb.append(facebookRequestErrorM11338b.m11141c());
            sb.append("}");
        }
        String string = sb.toString();
        C9801m.m32345e(string, "errorStringBuilder.toString()");
        return string;
    }
}
