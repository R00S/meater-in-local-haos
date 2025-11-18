package K9;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: SettingsCache.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0080\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u0015\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010 \u001a\u0004\b\u0019\u0010!¨\u0006\""}, d2 = {"LK9/e;", "", "", "sessionEnabled", "", "sessionSamplingRate", "", "sessionRestartTimeout", "cacheDuration", "", "cacheUpdatedTime", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Boolean;", "c", "()Ljava/lang/Boolean;", "b", "Ljava/lang/Double;", "e", "()Ljava/lang/Double;", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", "Ljava/lang/Long;", "()Ljava/lang/Long;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: K9.e, reason: from toString */
/* loaded from: classes2.dex */
public final /* data */ class SessionConfigs {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean sessionEnabled;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double sessionSamplingRate;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer sessionRestartTimeout;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer cacheDuration;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Long cacheUpdatedTime;

    public SessionConfigs(Boolean bool, Double d10, Integer num, Integer num2, Long l10) {
        this.sessionEnabled = bool;
        this.sessionSamplingRate = d10;
        this.sessionRestartTimeout = num;
        this.cacheDuration = num2;
        this.cacheUpdatedTime = l10;
    }

    /* renamed from: a, reason: from getter */
    public final Integer getCacheDuration() {
        return this.cacheDuration;
    }

    /* renamed from: b, reason: from getter */
    public final Long getCacheUpdatedTime() {
        return this.cacheUpdatedTime;
    }

    /* renamed from: c, reason: from getter */
    public final Boolean getSessionEnabled() {
        return this.sessionEnabled;
    }

    /* renamed from: d, reason: from getter */
    public final Integer getSessionRestartTimeout() {
        return this.sessionRestartTimeout;
    }

    /* renamed from: e, reason: from getter */
    public final Double getSessionSamplingRate() {
        return this.sessionSamplingRate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionConfigs)) {
            return false;
        }
        SessionConfigs sessionConfigs = (SessionConfigs) other;
        return C3862t.b(this.sessionEnabled, sessionConfigs.sessionEnabled) && C3862t.b(this.sessionSamplingRate, sessionConfigs.sessionSamplingRate) && C3862t.b(this.sessionRestartTimeout, sessionConfigs.sessionRestartTimeout) && C3862t.b(this.cacheDuration, sessionConfigs.cacheDuration) && C3862t.b(this.cacheUpdatedTime, sessionConfigs.cacheUpdatedTime);
    }

    public int hashCode() {
        Boolean bool = this.sessionEnabled;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d10 = this.sessionSamplingRate;
        int iHashCode2 = (iHashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        Integer num = this.sessionRestartTimeout;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.cacheDuration;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l10 = this.cacheUpdatedTime;
        return iHashCode4 + (l10 != null ? l10.hashCode() : 0);
    }

    public String toString() {
        return "SessionConfigs(sessionEnabled=" + this.sessionEnabled + ", sessionSamplingRate=" + this.sessionSamplingRate + ", sessionRestartTimeout=" + this.sessionRestartTimeout + ", cacheDuration=" + this.cacheDuration + ", cacheUpdatedTime=" + this.cacheUpdatedTime + ')';
    }
}
