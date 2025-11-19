package o4;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: AnalyticsResponse.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lo4/c;", "", "Lo4/b;", "data", "<init>", "(Lo4/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lo4/b;", "getData", "()Lo4/b;", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: o4.c, reason: case insensitive filesystem and from toString */
/* loaded from: classes.dex */
public final /* data */ class AnalyticsResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final AnalyticsData data;

    public AnalyticsResponse(AnalyticsData analyticsData) {
        this.data = analyticsData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AnalyticsResponse) && C3862t.b(this.data, ((AnalyticsResponse) other).data);
    }

    public int hashCode() {
        AnalyticsData analyticsData = this.data;
        if (analyticsData == null) {
            return 0;
        }
        return analyticsData.hashCode();
    }

    public String toString() {
        return "AnalyticsResponse(data=" + this.data + ")";
    }
}
