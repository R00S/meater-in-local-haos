package cm.aptoide.p092pt.sync.alarm;

import cm.aptoide.p092pt.sync.Sync;
import p456rx.C11231b;

/* loaded from: classes.dex */
public class OneOffSyncWrapper extends Sync {
    private final Sync sync;

    public OneOffSyncWrapper(Sync sync, long j2) {
        super(sync.getId(), sync.isPeriodic(), sync.isExact(), j2, 0L);
        this.sync = sync;
    }

    @Override // cm.aptoide.p092pt.sync.Sync
    public C11231b execute() {
        return this.sync.execute();
    }
}
