package d6;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u0004¨\u0006\u0016"}, d2 = {"Ld6/a;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "id", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "probeNumber", "c", "getFirstSeenDate", "firstSeenDate", "network_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: d6.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes2.dex */
public final /* data */ class DeviceRemote {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("device_id")
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("probe_number")
    private final Integer probeNumber;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("date_first_seen")
    private final String firstSeenDate;

    /* renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: b, reason: from getter */
    public final Integer getProbeNumber() {
        return this.probeNumber;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceRemote)) {
            return false;
        }
        DeviceRemote deviceRemote = (DeviceRemote) other;
        return C3862t.b(this.id, deviceRemote.id) && C3862t.b(this.probeNumber, deviceRemote.probeNumber) && C3862t.b(this.firstSeenDate, deviceRemote.firstSeenDate);
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        Integer num = this.probeNumber;
        return ((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.firstSeenDate.hashCode();
    }

    public String toString() {
        return "DeviceRemote(id=" + this.id + ", probeNumber=" + this.probeNumber + ", firstSeenDate=" + this.firstSeenDate + ")";
    }
}
