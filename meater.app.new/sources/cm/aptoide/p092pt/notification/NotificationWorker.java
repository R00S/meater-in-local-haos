package cm.aptoide.p092pt.notification;

import android.content.Context;
import android.util.Log;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.sync.Sync;
import cm.aptoide.p092pt.sync.SyncScheduler;
import cm.aptoide.p092pt.sync.alarm.AlarmSyncScheduler;
import cm.aptoide.p092pt.sync.alarm.SyncStorage;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p460m.InterfaceC11253b;

/* compiled from: NotificationWorker.kt */
@Metadata(m32266d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m32267d2 = {"Lcm/aptoide/pt/notification/NotificationWorker;", "Landroidx/work/Worker;", "context", "Landroid/content/Context;", "workerParameters", "Landroidx/work/WorkerParameters;", "scheduler", "Lcm/aptoide/pt/sync/SyncScheduler;", "storage", "Lcm/aptoide/pt/sync/alarm/SyncStorage;", "crashReport", "Lcm/aptoide/pt/crashreports/CrashReport;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcm/aptoide/pt/sync/SyncScheduler;Lcm/aptoide/pt/sync/alarm/SyncStorage;Lcm/aptoide/pt/crashreports/CrashReport;)V", "doWork", "Landroidx/work/ListenableWorker$Result;", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class NotificationWorker extends Worker {
    private final CrashReport crashReport;
    private final SyncScheduler scheduler;
    private final SyncStorage storage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationWorker(Context context, WorkerParameters workerParameters, SyncScheduler syncScheduler, SyncStorage syncStorage, CrashReport crashReport) {
        super(context, workerParameters);
        C9801m.m32346f(context, "context");
        C9801m.m32346f(workerParameters, "workerParameters");
        C9801m.m32346f(syncScheduler, "scheduler");
        C9801m.m32346f(syncStorage, "storage");
        C9801m.m32346f(crashReport, "crashReport");
        this.scheduler = syncScheduler;
        this.storage = syncStorage;
        this.crashReport = crashReport;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: doWork$lambda-0, reason: not valid java name */
    public static final void m40956doWork$lambda0(String str, boolean z, NotificationWorker notificationWorker, Sync sync) {
        C9801m.m32346f(notificationWorker, "this$0");
        C9801m.m32346f(sync, "$sync");
        Log.d("CampaignWorker", "Got notification from " + str);
        if (z) {
            notificationWorker.scheduler.reschedule(sync);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: doWork$lambda-1, reason: not valid java name */
    public static final void m40957doWork$lambda1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: doWork$lambda-2, reason: not valid java name */
    public static final void m40958doWork$lambda2(NotificationWorker notificationWorker, Throwable th) {
        C9801m.m32346f(notificationWorker, "this$0");
        notificationWorker.crashReport.log(th);
    }

    @Override // androidx.work.Worker
    public ListenableWorker.AbstractC0698a doWork() {
        if (C9801m.m32341a(AlarmSyncScheduler.ACTION_SYNC, getInputData().m4833j("action"))) {
            final String strM4833j = getInputData().m4833j("sync_id");
            final Sync sync = this.storage.get(strM4833j);
            C9801m.m32345e(sync, "storage.get(syncId)");
            final boolean zM4831h = getInputData().m4831h(AlarmSyncScheduler.EXTRA_RESCHEDULE, false);
            sync.execute().m39984q(new InterfaceC11252a() { // from class: cm.aptoide.pt.notification.z
                @Override // p456rx.p460m.InterfaceC11252a
                public final void call() {
                    NotificationWorker.m40956doWork$lambda0(strM4833j, zM4831h, this, sync);
                }
            }).m39965I(new InterfaceC11252a() { // from class: cm.aptoide.pt.notification.a0
                @Override // p456rx.p460m.InterfaceC11252a
                public final void call() {
                    NotificationWorker.m40957doWork$lambda1();
                }
            }, new InterfaceC11253b() { // from class: cm.aptoide.pt.notification.y
                @Override // p456rx.p460m.InterfaceC11253b
                public final void call(Object obj) {
                    NotificationWorker.m40958doWork$lambda2(this.f10493f, (Throwable) obj);
                }
            });
        }
        ListenableWorker.AbstractC0698a abstractC0698aM4766c = ListenableWorker.AbstractC0698a.m4766c();
        C9801m.m32345e(abstractC0698aM4766c, "success()");
        return abstractC0698aM4766c;
    }
}
