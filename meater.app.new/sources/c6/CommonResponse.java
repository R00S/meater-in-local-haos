package c6;

import M9.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\f\u0010\u0007R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0014\u001a\u0004\b\u0011\u0010\u0004¨\u0006\u0016"}, d2 = {"Lc6/a;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "c", "()Z", "status", "b", "I", "errorCode", "Ljava/lang/String;", "message", "network_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: c6.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes2.dex */
public final /* data */ class CommonResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @c("status")
    private final boolean status;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @c("errorCode")
    private final int errorCode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @c("message")
    private final String message;

    /* renamed from: a, reason: from getter */
    public final int getErrorCode() {
        return this.errorCode;
    }

    /* renamed from: b, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getStatus() {
        return this.status;
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
