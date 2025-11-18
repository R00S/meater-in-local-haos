package m4;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: CommonResponse.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, d2 = {"Lm4/c;", "Lm4/a;", "", "status", "", "errorCode", "", "message", "<init>", "(ZILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "getStatus", "()Z", "b", "I", "getErrorCode", "c", "Ljava/lang/String;", "getMessage", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: m4.c, reason: case insensitive filesystem and from toString */
/* loaded from: classes.dex */
public final /* data */ class CommonResponse extends AbstractC3949a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean status;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int errorCode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String message;

    public CommonResponse(boolean z10, int i10, String message) {
        C3862t.g(message, "message");
        this.status = z10;
        this.errorCode = i10;
        this.message = message;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonResponse)) {
            return false;
        }
        CommonResponse commonResponse = (CommonResponse) other;
        return this.status == commonResponse.status && this.errorCode == commonResponse.errorCode && C3862t.b(this.message, commonResponse.message);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.status) * 31) + Integer.hashCode(this.errorCode)) * 31) + this.message.hashCode();
    }

    public String toString() {
        return "CommonResponse(status=" + this.status + ", errorCode=" + this.errorCode + ", message=" + this.message + ")";
    }
}
