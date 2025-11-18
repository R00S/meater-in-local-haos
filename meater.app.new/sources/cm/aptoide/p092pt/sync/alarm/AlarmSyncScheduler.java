package cm.aptoide.p092pt.sync.alarm;

import android.content.Context;
import androidx.work.AbstractC0818y;
import androidx.work.C0706e;
import androidx.work.C0809p;
import androidx.work.C0812s;
import androidx.work.EnumC0707f;
import androidx.work.EnumC0708g;
import cm.aptoide.p092pt.notification.NotificationWorker;
import cm.aptoide.p092pt.sync.Sync;
import cm.aptoide.p092pt.sync.SyncScheduler;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class AlarmSyncScheduler implements SyncScheduler {
    public static final String ACTION_SYNC = "cm.aptoide.pt.sync.alarm.action.SYNC";
    public static final String EXTRA_RESCHEDULE = "cm.aptoide.pt.sync.alarm.extra.RESCHEDULE";
    private final Context context;
    private final SyncStorage syncStorage;

    public AlarmSyncScheduler(Context context, SyncStorage syncStorage) {
        this.context = context;
        this.syncStorage = syncStorage;
    }

    private void scheduleOneOffSync(Sync sync) throws Throwable {
        this.syncStorage.save(sync);
        setOneOffWorker(sync);
    }

    private void schedulePeriodicSync(Sync sync) throws Throwable {
        this.syncStorage.save(sync);
        setPeriodicWorker(sync);
    }

    private void setOneOffWorker(Sync sync) throws Throwable {
        AbstractC0818y.m5238h(this.context).m5241f(sync.getId(), EnumC0708g.REPLACE, new C0809p.a(NotificationWorker.class).m5249g(new C0706e.a().m4840f("sync_id", sync.getId()).m4840f("action", ACTION_SYNC).m4839e(EXTRA_RESCHEDULE, false).m4835a()).m5246b());
    }

    private void setPeriodicWorker(Sync sync) throws Throwable {
        C0706e c0706eM4835a = new C0706e.a().m4840f("sync_id", sync.getId()).m4840f("action", ACTION_SYNC).m4839e(EXTRA_RESCHEDULE, false).m4835a();
        long interval = sync.getInterval();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        AbstractC0818y.m5238h(this.context).mo4987e(sync.getId(), EnumC0707f.KEEP, new C0812s.a(NotificationWorker.class, interval, timeUnit).m5249g(c0706eM4835a).m5248f(sync.getInterval(), timeUnit).m5246b());
    }

    @Override // cm.aptoide.p092pt.sync.SyncScheduler
    public void cancel(String str) {
        AbstractC0818y.m5238h(this.context).mo4985b(str);
        this.syncStorage.remove(str);
    }

    @Override // cm.aptoide.p092pt.sync.SyncScheduler
    public void reschedule(Sync sync) throws Throwable {
        schedule(sync);
    }

    @Override // cm.aptoide.p092pt.sync.SyncScheduler
    public void schedule(Sync sync) throws Throwable {
        if (sync.isPeriodic()) {
            schedulePeriodicSync(sync);
        } else {
            scheduleOneOffSync(sync);
        }
    }
}
