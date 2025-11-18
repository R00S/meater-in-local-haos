package f6;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0016\u0010\u0004R\u001a\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0011\u0010\u0004R\u001a\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0015\u001a\u0004\b\f\u0010\u0004¨\u0006\u001a"}, d2 = {"Lf6/o;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "e", "()Z", "status", "b", "I", "c", "errorCode", "Ljava/lang/String;", "d", "message", "accountName", "accountEmail", "network_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: f6.o, reason: from toString */
/* loaded from: classes2.dex */
public final /* data */ class SignUpResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("status")
    private final boolean status;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("errorCode")
    private final int errorCode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("message")
    private final String message;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("accountName")
    private final String accountName;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("accountEmail")
    private final String accountEmail;

    /* renamed from: a, reason: from getter */
    public final String getAccountEmail() {
        return this.accountEmail;
    }

    /* renamed from: b, reason: from getter */
    public final String getAccountName() {
        return this.accountName;
    }

    /* renamed from: c, reason: from getter */
    public final int getErrorCode() {
        return this.errorCode;
    }

    /* renamed from: d, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getStatus() {
        return this.status;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SignUpResponse)) {
            return false;
        }
        SignUpResponse signUpResponse = (SignUpResponse) other;
        return this.status == signUpResponse.status && this.errorCode == signUpResponse.errorCode && C3862t.b(this.message, signUpResponse.message) && C3862t.b(this.accountName, signUpResponse.accountName) && C3862t.b(this.accountEmail, signUpResponse.accountEmail);
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.status) * 31) + Integer.hashCode(this.errorCode)) * 31) + this.message.hashCode()) * 31) + this.accountName.hashCode()) * 31) + this.accountEmail.hashCode();
    }

    public String toString() {
        return "SignUpResponse(status=" + this.status + ", errorCode=" + this.errorCode + ", message=" + this.message + ", accountName=" + this.accountName + ", accountEmail=" + this.accountEmail + ")";
    }
}
