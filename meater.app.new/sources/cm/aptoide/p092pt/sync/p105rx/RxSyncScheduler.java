package cm.aptoide.p092pt.sync.p105rx;

import cm.aptoide.analytics.implementation.CrashLogger;
import cm.aptoide.p092pt.sync.Sync;
import cm.aptoide.p092pt.sync.SyncScheduler;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p456rx.C11234e;
import p456rx.InterfaceC11246k;
import p456rx.exceptions.OnErrorNotImplementedException;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public class RxSyncScheduler implements SyncScheduler {
    private final CrashLogger consoleLogger;
    private final Map<String, InterfaceC11246k> subscriptionStorage;

    public RxSyncScheduler(Map<String, InterfaceC11246k> map, CrashLogger crashLogger) {
        this.subscriptionStorage = map;
        this.consoleLogger = crashLogger;
    }

    private boolean isSyncScheduled(String str) {
        return this.subscriptionStorage.containsKey(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$scheduleOneOffSync$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8859a(Sync sync) {
        this.subscriptionStorage.remove(sync.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$scheduleOneOffSync$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8860b(Throwable th) {
        this.consoleLogger.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$schedulePeriodicSync$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8861c(Throwable th) {
        this.consoleLogger.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$schedulePeriodicSync$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8862d(Sync sync, Long l) {
        return sync.execute().m39981n(new InterfaceC11253b() { // from class: cm.aptoide.pt.sync.rx.a
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11505f.m8861c((Throwable) obj);
            }
        }).m39958A().m39968M();
    }

    static /* synthetic */ void lambda$schedulePeriodicSync$4(Object obj) {
    }

    static /* synthetic */ void lambda$schedulePeriodicSync$5(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    private void scheduleOneOffSync(final Sync sync) {
        this.subscriptionStorage.put(sync.getId(), sync.execute().m39965I(new InterfaceC11252a() { // from class: cm.aptoide.pt.sync.rx.c
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f11507f.m8859a(sync);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.sync.rx.b
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11506f.m8860b((Throwable) obj);
            }
        }));
    }

    private void schedulePeriodicSync(final Sync sync) {
        if (isSyncScheduled(sync.getId())) {
            return;
        }
        this.subscriptionStorage.put(sync.getId(), C11234e.m40023Q(sync.getTrigger(), sync.getInterval(), TimeUnit.MILLISECONDS).m40071L0(new InterfaceC11256e() { // from class: cm.aptoide.pt.sync.rx.f
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11511f.m8862d(sync, (Long) obj);
            }
        }).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.sync.rx.d
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                RxSyncScheduler.lambda$schedulePeriodicSync$4(obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.sync.rx.e
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                RxSyncScheduler.lambda$schedulePeriodicSync$5((Throwable) obj);
                throw null;
            }
        }));
    }

    @Override // cm.aptoide.p092pt.sync.SyncScheduler
    public synchronized void cancel(String str) {
        InterfaceC11246k interfaceC11246kRemove = this.subscriptionStorage.remove(str);
        if (interfaceC11246kRemove != null) {
            interfaceC11246kRemove.unsubscribe();
        }
    }

    @Override // cm.aptoide.p092pt.sync.SyncScheduler
    public synchronized void reschedule(Sync sync) {
        if (isSyncScheduled(sync.getId())) {
            cancel(sync.getId());
            schedule(sync);
        }
    }

    @Override // cm.aptoide.p092pt.sync.SyncScheduler
    public synchronized void schedule(Sync sync) {
        if (sync.isPeriodic()) {
            schedulePeriodicSync(sync);
        } else {
            scheduleOneOffSync(sync);
        }
    }
}
