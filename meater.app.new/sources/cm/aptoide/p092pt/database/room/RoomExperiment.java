package cm.aptoide.p092pt.database.room;

/* loaded from: classes.dex */
public class RoomExperiment {
    private String assignment;
    private String experimentName;
    private boolean experimentOver;
    private boolean partOfExperiment;
    private String payload;
    private long requestTime;

    public RoomExperiment(String str, long j2, String str2, String str3, boolean z, boolean z2) {
        this.experimentName = str;
        this.requestTime = j2;
        this.assignment = str2;
        this.payload = str3;
        this.partOfExperiment = z;
        this.experimentOver = z2;
    }

    public String getAssignment() {
        return this.assignment;
    }

    public String getExperimentName() {
        return this.experimentName;
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

    public boolean isPartOfExperiment() {
        return this.partOfExperiment;
    }
}
