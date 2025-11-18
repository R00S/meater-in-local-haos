package f6;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0004R\u001a\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0016\u001a\u0004\b\u0015\u0010\u0004¨\u0006\u0019"}, d2 = {"Lf6/d;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lf6/c;", "a", "Lf6/c;", "()Lf6/c;", "data", "b", "I", "d", "statusCode", "c", "Ljava/lang/String;", "error", "message", "network_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: f6.d, reason: from toString */
/* loaded from: classes2.dex */
public final /* data */ class CurrentOffersResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("data")
    private final CurrentOfferDataRemote data;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("statusCode")
    private final int statusCode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("error")
    private final String error;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("message")
    private final String message;

    /* renamed from: a, reason: from getter */
    public final CurrentOfferDataRemote getData() {
        return this.data;
    }

    /* renamed from: b, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: c, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: d, reason: from getter */
    public final int getStatusCode() {
        return this.statusCode;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurrentOffersResponse)) {
            return false;
        }
        CurrentOffersResponse currentOffersResponse = (CurrentOffersResponse) other;
        return C3862t.b(this.data, currentOffersResponse.data) && this.statusCode == currentOffersResponse.statusCode && C3862t.b(this.error, currentOffersResponse.error) && C3862t.b(this.message, currentOffersResponse.message);
    }

    public int hashCode() {
        return (((((this.data.hashCode() * 31) + Integer.hashCode(this.statusCode)) * 31) + this.error.hashCode()) * 31) + this.message.hashCode();
    }

    public String toString() {
        return "CurrentOffersResponse(data=" + this.data + ", statusCode=" + this.statusCode + ", error=" + this.error + ", message=" + this.message + ")";
    }
}
