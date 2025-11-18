package com.facebook;

import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: FacebookDialogException.kt */
@Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B#\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001b\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u0019\u0010\u000e\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, m32267d2 = {"Lcom/facebook/FacebookDialogException;", "Lcom/facebook/FacebookException;", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "()Ljava/lang/String;", "i", "Ljava/lang/String;", "getFailingUrl", "failingUrl", HttpUrl.FRAGMENT_ENCODE_SET, "h", "I", "getErrorCode", "()I", "errorCode", "message", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "g", "a", "facebook-common_release"}, m32268k = 1, m32269mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class FacebookDialogException extends FacebookException {

    /* renamed from: h, reason: from kotlin metadata */
    private final int errorCode;

    /* renamed from: i, reason: from kotlin metadata */
    private final String failingUrl;

    public FacebookDialogException(String str, int i2, String str2) {
        super(str);
        this.errorCode = i2;
        this.failingUrl = str2;
    }

    @Override // com.facebook.FacebookException, java.lang.Throwable
    public String toString() {
        String str = "{FacebookDialogException: errorCode: " + this.errorCode + ", message: " + getMessage() + ", url: " + this.failingUrl + "}";
        C9801m.m32345e(str, "StringBuilder()\n        .append(\"{FacebookDialogException: \")\n        .append(\"errorCode: \")\n        .append(errorCode)\n        .append(\", message: \")\n        .append(message)\n        .append(\", url: \")\n        .append(failingUrl)\n        .append(\"}\")\n        .toString()");
        return str;
    }
}
