package n4;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import m4.AbstractC3950b;
import p4.DeviceInput;

/* compiled from: SafetyManualRequestInput.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, d2 = {"Ln4/d;", "Lm4/b;", "", "webPageUrl", "Lp4/e;", "device", "<init>", "(Ljava/lang/String;Lp4/e;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lp4/e;", "()Lp4/e;", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: n4.d, reason: case insensitive filesystem and from toString */
/* loaded from: classes.dex */
public final /* data */ class SafetyManualRequestInput extends AbstractC3950b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String webPageUrl;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final DeviceInput device;

    public SafetyManualRequestInput(String webPageUrl, DeviceInput device) {
        C3862t.g(webPageUrl, "webPageUrl");
        C3862t.g(device, "device");
        this.webPageUrl = webPageUrl;
        this.device = device;
    }

    /* renamed from: a, reason: from getter */
    public DeviceInput getDevice() {
        return this.device;
    }

    /* renamed from: b, reason: from getter */
    public final String getWebPageUrl() {
        return this.webPageUrl;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SafetyManualRequestInput)) {
            return false;
        }
        SafetyManualRequestInput safetyManualRequestInput = (SafetyManualRequestInput) other;
        return C3862t.b(this.webPageUrl, safetyManualRequestInput.webPageUrl) && C3862t.b(this.device, safetyManualRequestInput.device);
    }

    public int hashCode() {
        return (this.webPageUrl.hashCode() * 31) + this.device.hashCode();
    }

    public String toString() {
        return "SafetyManualRequestInput(webPageUrl=" + this.webPageUrl + ", device=" + this.device + ")";
    }
}
