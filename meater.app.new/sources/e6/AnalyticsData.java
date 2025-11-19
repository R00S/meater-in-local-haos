package e6;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Le6/b;", "", "Lo4/b;", "a", "()Lo4/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getId", "()Ljava/lang/Integer;", "id", "network_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: e6.b, reason: case insensitive filesystem and from toString */
/* loaded from: classes2.dex */
public final /* data */ class AnalyticsData {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("id")
    private final Integer id;

    public final o4.AnalyticsData a() {
        return new o4.AnalyticsData(this.id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AnalyticsData) && C3862t.b(this.id, ((AnalyticsData) other).id);
    }

    public int hashCode() {
        Integer num = this.id;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public String toString() {
        return "AnalyticsData(id=" + this.id + ")";
    }
}
