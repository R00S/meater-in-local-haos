package p4;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import m4.AbstractC3949a;

/* compiled from: UserData.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0018\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0015\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\u000e¨\u0006\""}, d2 = {"Lp4/m;", "Lm4/a;", "", "accountName", "accountEmail", "accessToken", "", "status", "", "errorCode", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "d", "Z", "getStatus", "()Z", "e", "I", "getErrorCode", "f", "getMessage", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: p4.m, reason: from toString */
/* loaded from: classes.dex */
public final /* data */ class UserData extends AbstractC3949a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String accountName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String accountEmail;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String accessToken;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean status;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final int errorCode;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String message;

    public UserData(String str, String str2, String str3, boolean z10, int i10, String message) {
        C3862t.g(message, "message");
        this.accountName = str;
        this.accountEmail = str2;
        this.accessToken = str3;
        this.status = z10;
        this.errorCode = i10;
        this.message = message;
    }

    /* renamed from: a, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    /* renamed from: b, reason: from getter */
    public final String getAccountEmail() {
        return this.accountEmail;
    }

    /* renamed from: c, reason: from getter */
    public final String getAccountName() {
        return this.accountName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserData)) {
            return false;
        }
        UserData userData = (UserData) other;
        return C3862t.b(this.accountName, userData.accountName) && C3862t.b(this.accountEmail, userData.accountEmail) && C3862t.b(this.accessToken, userData.accessToken) && this.status == userData.status && this.errorCode == userData.errorCode && C3862t.b(this.message, userData.message);
    }

    public int hashCode() {
        String str = this.accountName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.accountEmail;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.accessToken;
        return ((((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Boolean.hashCode(this.status)) * 31) + Integer.hashCode(this.errorCode)) * 31) + this.message.hashCode();
    }

    public String toString() {
        return "UserData(accountName=" + this.accountName + ", accountEmail=" + this.accountEmail + ", accessToken=" + this.accessToken + ", status=" + this.status + ", errorCode=" + this.errorCode + ", message=" + this.message + ")";
    }
}
