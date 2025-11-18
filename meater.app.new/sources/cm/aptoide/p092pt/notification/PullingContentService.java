package cm.aptoide.p092pt.notification;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.IBinder;
import android.os.SystemClock;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.BaseService;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.database.room.RoomUpdate;
import cm.aptoide.p092pt.download.DownloadFactory;
import cm.aptoide.p092pt.install.InstallManager;
import cm.aptoide.p092pt.preferences.managed.ManagerPreferences;
import cm.aptoide.p092pt.updates.UpdateRepository;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;
import p456rx.p474t.C11426b;
import p456rx.schedulers.Schedulers;

/* loaded from: classes.dex */
public class PullingContentService extends BaseService {
    public static final String BOOT_COMPLETED_ACTION = "BOOT_COMPLETED_ACTION";
    public static final String PUSH_NOTIFICATIONS_ACTION = "PUSH_NOTIFICATIONS_ACTION";
    public static final String UPDATES_ACTION = "UPDATES_ACTION";
    public static final long UPDATES_INTERVAL = 86400000;
    private AptoideApplication application;

    @Inject
    DownloadFactory downloadFactory;
    private InstallManager installManager;

    @Inject
    @Named
    String marketName;
    private SharedPreferences sharedPreferences;
    private C11426b subscriptions;

    @Inject
    UpdateRepository updateRepository;

    private C11234e<Boolean> autoUpdate(final List<RoomUpdate> list) {
        return C11234e.m40025S(Boolean.valueOf(ManagerPreferences.isAutoUpdateEnable(this.sharedPreferences) && ManagerPreferences.allowRootInstallation(this.sharedPreferences))).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.notification.r0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10451f.m8341c(list, (Boolean) obj);
            }
        });
    }

    private long getElapsedRealtimeTrigger(long j2) {
        return SystemClock.elapsedRealtime() + j2;
    }

    private boolean isAlarmUp(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) PullingContentService.class);
        intent.setAction(str);
        return PendingIntent.getService(context, 0, intent, 67108864) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$autoUpdate$6, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ ArrayList m8339a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.downloadFactory.create((RoomUpdate) it.next(), false, Collections.emptyList()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$autoUpdate$7, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8340b(ArrayList arrayList) {
        return this.installManager.startInstalls(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$autoUpdate$8, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8341c(List list, Boolean bool) {
        return bool.booleanValue() ? C11234e.m40025S(list).m40095j0(Schedulers.m40658io()).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.notification.w0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10486f.m8339a((List) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.notification.y0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10494f.m8340b((ArrayList) obj);
            }
        }) : C11234e.m40025S(Boolean.FALSE);
    }

    static /* synthetic */ C11234e lambda$setUpdatesAction$0(List list, Boolean bool) {
        return bool.booleanValue() ? C11234e.m40016B() : C11234e.m40025S(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setUpdatesAction$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8342d(final List list) {
        return autoUpdate(list).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.notification.v0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return PullingContentService.lambda$setUpdatesAction$0(list, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setUpdatesAction$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Boolean m8343e(List list) {
        return Boolean.valueOf(ManagerPreferences.isUpdateNotificationEnable(this.sharedPreferences));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setUpdatesAction$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8344f(int i2, List list) {
        stopSelf(i2);
    }

    static /* synthetic */ void lambda$setUpdatesAction$4(List list) {
    }

    static /* synthetic */ void lambda$setUpdatesAction$5(Throwable th) {
        th.printStackTrace();
        CrashReport.getInstance().log(th);
    }

    private void setUpdatesAction(final int i2) {
        this.subscriptions.m40667a(this.updateRepository.getAll(false).m40057E().m40095j0(Schedulers.computation()).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.notification.u0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10463f.m8342d((List) obj);
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.notification.z0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10500f.m8343e((List) obj);
            }
        }).m40095j0(Schedulers.m40658io()).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.notification.x0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10490f.m8344f(i2, (List) obj);
            }
        }).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.notification.t0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                PullingContentService.lambda$setUpdatesAction$4((List) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.notification.s0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                PullingContentService.lambda$setUpdatesAction$5((Throwable) obj);
            }
        }));
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        getApplicationComponent().inject(this);
        AptoideApplication aptoideApplication = (AptoideApplication) getApplicationContext();
        this.application = aptoideApplication;
        this.sharedPreferences = aptoideApplication.getDefaultSharedPreferences();
        this.installManager = this.application.getInstallManager();
        this.subscriptions = new C11426b();
        AlarmManager alarmManager = (AlarmManager) getSystemService("alarm");
        if (isAlarmUp(this, UPDATES_ACTION)) {
            return;
        }
        setAlarm(alarmManager, this, UPDATES_ACTION, UPDATES_INTERVAL);
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.subscriptions.m40668b();
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        String action = intent == null ? null : intent.getAction();
        if (action == null) {
            return 2;
        }
        if (!action.equals(BOOT_COMPLETED_ACTION) && !action.equals(UPDATES_ACTION)) {
            return 2;
        }
        setUpdatesAction(i3);
        return 2;
    }

    public void setAlarm(AlarmManager alarmManager, Context context, String str, long j2) {
        Intent intent = new Intent(context, (Class<?>) PullingContentService.class);
        intent.setAction(str);
        alarmManager.setInexactRepeating(3, getElapsedRealtimeTrigger(j2), getElapsedRealtimeTrigger(j2), PendingIntent.getService(context, 0, intent, 67108864));
    }
}
