package d6;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0011\u0010\u0004R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019¨\u0006\u001b"}, d2 = {"Ld6/b;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", "statusCode", "b", "Ljava/lang/String;", "error", "c", "message", "", "Ld6/a;", "Ljava/util/List;", "()Ljava/util/List;", "pairedDevices", "network_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: d6.b, reason: case insensitive filesystem and from toString */
/* loaded from: classes2.dex */
public final /* data */ class PairedDeviceResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("statusCode")
    private final Integer statusCode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("error")
    private final String error;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("message")
    private final String message;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("devices")
    private final List<DeviceRemote> pairedDevices;

    /* renamed from: a, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: b, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final List<DeviceRemote> c() {
        return this.pairedDevices;
    }

    /* renamed from: d, reason: from getter */
    public final Integer getStatusCode() {
        return this.statusCode;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PairedDeviceResponse)) {
            return false;
        }
        PairedDeviceResponse pairedDeviceResponse = (PairedDeviceResponse) other;
        return C3862t.b(this.statusCode, pairedDeviceResponse.statusCode) && C3862t.b(this.error, pairedDeviceResponse.error) && C3862t.b(this.message, pairedDeviceResponse.message) && C3862t.b(this.pairedDevices, pairedDeviceResponse.pairedDevices);
    }

    public int hashCode() {
        Integer num = this.statusCode;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.error;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.message;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.pairedDevices.hashCode();
    }

    public String toString() {
        return "PairedDeviceResponse(statusCode=" + this.statusCode + ", error=" + this.error + ", message=" + this.message + ", pairedDevices=" + this.pairedDevices + ")";
    }
}
