package cm.aptoide.p092pt.util.schedulers;

import p456rx.AbstractC11243h;
import p456rx.schedulers.Schedulers;

/* loaded from: classes.dex */
public class ImmediateSchedulerProvider implements SchedulerProvider {
    @Override // cm.aptoide.p092pt.util.schedulers.SchedulerProvider
    public AbstractC11243h computation() {
        return Schedulers.immediate();
    }

    @Override // cm.aptoide.p092pt.util.schedulers.SchedulerProvider
    /* renamed from: io */
    public AbstractC11243h mo8879io() {
        return Schedulers.immediate();
    }

    @Override // cm.aptoide.p092pt.util.schedulers.SchedulerProvider
    /* renamed from: ui */
    public AbstractC11243h mo8880ui() {
        return Schedulers.immediate();
    }
}
