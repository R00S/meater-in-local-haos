package d6;

import f6.LoginDeviceRemote;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Ld6/c;", "", "Lf6/f;", "device", "<init>", "(Lf6/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lf6/f;", "getDevice", "()Lf6/f;", "network_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: d6.c, reason: case insensitive filesystem and from toString */
/* loaded from: classes2.dex */
public final /* data */ class SafetyManualRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("device")
    private final LoginDeviceRemote device;

    public SafetyManualRequest(LoginDeviceRemote device) {
        C3862t.g(device, "device");
        this.device = device;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SafetyManualRequest) && C3862t.b(this.device, ((SafetyManualRequest) other).device);
    }

    public int hashCode() {
        return this.device.hashCode();
    }

    public String toString() {
        return "SafetyManualRequest(device=" + this.device + ")";
    }
}
