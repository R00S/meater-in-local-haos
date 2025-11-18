package cm.aptoide.p092pt.util.schedulers;

import p456rx.AbstractC11243h;
import p456rx.p457l.p459c.C11250a;
import p456rx.schedulers.Schedulers;

/* loaded from: classes.dex */
public class ConcreteSchedulerProvider implements SchedulerProvider {
    private static ConcreteSchedulerProvider INSTANCE;

    private ConcreteSchedulerProvider() {
    }

    public static synchronized ConcreteSchedulerProvider getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ConcreteSchedulerProvider();
        }
        return INSTANCE;
    }

    @Override // cm.aptoide.p092pt.util.schedulers.SchedulerProvider
    public AbstractC11243h computation() {
        return Schedulers.computation();
    }

    @Override // cm.aptoide.p092pt.util.schedulers.SchedulerProvider
    /* renamed from: io */
    public AbstractC11243h mo8879io() {
        return Schedulers.m40658io();
    }

    @Override // cm.aptoide.p092pt.util.schedulers.SchedulerProvider
    /* renamed from: ui */
    public AbstractC11243h mo8880ui() {
        return C11250a.m40156b();
    }
}
