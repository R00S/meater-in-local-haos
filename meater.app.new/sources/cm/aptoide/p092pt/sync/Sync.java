package cm.aptoide.p092pt.sync;

import p456rx.C11231b;

/* loaded from: classes.dex */
public abstract class Sync {
    private final boolean exact;

    /* renamed from: id */
    private final String f11500id;
    private final long interval;
    private final boolean periodic;
    private final long trigger;

    public Sync(String str, boolean z, boolean z2, long j2, long j3) {
        this.f11500id = str;
        this.periodic = z;
        this.exact = z2;
        this.trigger = j2;
        this.interval = j3;
    }

    public abstract C11231b execute();

    public String getId() {
        return this.f11500id;
    }

    public long getInterval() {
        return this.interval;
    }

    public long getTrigger() {
        return this.trigger;
    }

    public boolean isExact() {
        return this.exact;
    }

    public boolean isPeriodic() {
        return this.periodic;
    }
}
