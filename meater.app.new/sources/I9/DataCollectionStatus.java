package I9;

import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: SessionEvent.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"LI9/e;", "", "LI9/d;", "performance", "crashlytics", "", "sessionSamplingRate", "<init>", "(LI9/d;LI9/d;D)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LI9/d;", "b", "()LI9/d;", "c", "D", "()D", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: I9.e, reason: case insensitive filesystem and from toString */
/* loaded from: classes2.dex */
public final /* data */ class DataCollectionStatus {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final EnumC1192d performance;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final EnumC1192d crashlytics;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final double sessionSamplingRate;

    public DataCollectionStatus() {
        this(null, null, 0.0d, 7, null);
    }

    /* renamed from: a, reason: from getter */
    public final EnumC1192d getCrashlytics() {
        return this.crashlytics;
    }

    /* renamed from: b, reason: from getter */
    public final EnumC1192d getPerformance() {
        return this.performance;
    }

    /* renamed from: c, reason: from getter */
    public final double getSessionSamplingRate() {
        return this.sessionSamplingRate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataCollectionStatus)) {
            return false;
        }
        DataCollectionStatus dataCollectionStatus = (DataCollectionStatus) other;
        return this.performance == dataCollectionStatus.performance && this.crashlytics == dataCollectionStatus.crashlytics && Double.compare(this.sessionSamplingRate, dataCollectionStatus.sessionSamplingRate) == 0;
    }

    public int hashCode() {
        return (((this.performance.hashCode() * 31) + this.crashlytics.hashCode()) * 31) + Double.hashCode(this.sessionSamplingRate);
    }

    public String toString() {
        return "DataCollectionStatus(performance=" + this.performance + ", crashlytics=" + this.crashlytics + ", sessionSamplingRate=" + this.sessionSamplingRate + ')';
    }

    public DataCollectionStatus(EnumC1192d performance, EnumC1192d crashlytics, double d10) {
        C3862t.g(performance, "performance");
        C3862t.g(crashlytics, "crashlytics");
        this.performance = performance;
        this.crashlytics = crashlytics;
        this.sessionSamplingRate = d10;
    }

    public /* synthetic */ DataCollectionStatus(EnumC1192d enumC1192d, EnumC1192d enumC1192d2, double d10, int i10, C3854k c3854k) {
        this((i10 & 1) != 0 ? EnumC1192d.COLLECTION_SDK_NOT_INSTALLED : enumC1192d, (i10 & 2) != 0 ? EnumC1192d.COLLECTION_SDK_NOT_INSTALLED : enumC1192d2, (i10 & 4) != 0 ? 1.0d : d10);
    }
}
