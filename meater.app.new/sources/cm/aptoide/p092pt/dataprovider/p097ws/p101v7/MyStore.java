package cm.aptoide.p092pt.dataprovider.p097ws.p101v7;

import cm.aptoide.p092pt.dataprovider.model.p096v7.TimelineStats;
import cm.aptoide.p092pt.dataprovider.model.p096v7.store.GetHomeMeta;

/* loaded from: classes.dex */
public class MyStore {
    private final GetHomeMeta getHomeMeta;
    private final TimelineStats timelineStats;

    public MyStore(TimelineStats timelineStats, GetHomeMeta getHomeMeta) {
        this.timelineStats = timelineStats;
        this.getHomeMeta = getHomeMeta;
    }

    public GetHomeMeta getGetHomeMeta() {
        return this.getHomeMeta;
    }

    public TimelineStats getTimelineStats() {
        return this.timelineStats;
    }

    public boolean isCreateStore() {
        return this.getHomeMeta == null;
    }
}
