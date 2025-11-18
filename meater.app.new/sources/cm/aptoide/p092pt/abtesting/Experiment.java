package cm.aptoide.p092pt.abtesting;

import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class Experiment {
    public static final long MAX_CACHE_TIME_IN_MILLIS = 2592000000L;
    private static final long TWENTY_FOUR_HOURS = 86400000;
    private String assignment;
    private boolean experimentOver;
    private boolean partOfExperiment;
    private String payload;
    private long requestTime;

    public Experiment(long j2, String str, String str2, boolean z) {
        this.requestTime = j2;
        this.assignment = str2;
        this.payload = str;
        this.partOfExperiment = str2 != null;
        this.experimentOver = z;
    }

    public String getAssignment() {
        return this.assignment;
    }

    public String getPayload() {
        return this.payload;
    }

    public long getRequestTime() {
        return this.requestTime;
    }

    public boolean isExperimentOver() {
        return this.experimentOver;
    }

    public boolean isExpired() {
        return this.requestTime < System.currentTimeMillis() - MAX_CACHE_TIME_IN_MILLIS;
    }

    public boolean isPartOfExperiment() {
        return this.partOfExperiment;
    }

    public Experiment() {
        this.requestTime = -1L;
        this.assignment = HttpUrl.FRAGMENT_ENCODE_SET;
        this.payload = HttpUrl.FRAGMENT_ENCODE_SET;
        this.partOfExperiment = false;
    }

    public Experiment(long j2, String str, String str2, boolean z, boolean z2) {
        this.requestTime = j2;
        this.assignment = str;
        this.payload = str2;
        this.partOfExperiment = z;
        this.experimentOver = z2;
    }
}
