package cm.aptoide.p092pt.notification;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import androidx.core.app.C0245i;
import androidx.core.app.C0248l;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import cm.aptoide.p092pt.app.aptoideinstall.AptoideInstallManager;
import cm.aptoide.p092pt.database.room.RoomUpdate;
import cm.aptoide.p092pt.home.apps.AppMapper;
import cm.aptoide.p092pt.home.apps.model.UpdateApp;
import cm.aptoide.p092pt.preferences.managed.ManagerPreferences;
import cm.aptoide.p092pt.updates.UpdateRepository;
import cm.aptoide.p092pt.utils.AptoideUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;
import p456rx.C11234e;
import p456rx.Single;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;
import p456rx.p460m.InterfaceC11257f;

/* compiled from: UpdatesNotificationWorker.kt */
@Metadata(m32266d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J&\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0016\u0010\u001a\u001a\u00020\u001b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0013\u001a\u00020\u001eH\u0002R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m32267d2 = {"Lcm/aptoide/pt/notification/UpdatesNotificationWorker;", "Landroidx/work/Worker;", "context", "Landroid/content/Context;", "workerParameters", "Landroidx/work/WorkerParameters;", "updateRepository", "Lcm/aptoide/pt/updates/UpdateRepository;", "sharedPreferences", "Landroid/content/SharedPreferences;", "aptoideInstallManager", "Lcm/aptoide/pt/app/aptoideinstall/AptoideInstallManager;", "appMapper", "Lcm/aptoide/pt/home/apps/AppMapper;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcm/aptoide/pt/updates/UpdateRepository;Landroid/content/SharedPreferences;Lcm/aptoide/pt/app/aptoideinstall/AptoideInstallManager;Lcm/aptoide/pt/home/apps/AppMapper;)V", "doWork", "Landroidx/work/ListenableWorker$Result;", "getNotificationDefaultDesign", "Landroid/app/Notification;", "updates", HttpUrl.FRAGMENT_ENCODE_SET, "Lcm/aptoide/pt/home/apps/model/UpdateApp;", "resultPendingIntent", "Landroid/app/PendingIntent;", "tickerText", HttpUrl.FRAGMENT_ENCODE_SET, "handleNotification", HttpUrl.FRAGMENT_ENCODE_SET, "shouldShowNotification", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class UpdatesNotificationWorker extends Worker {
    private final AppMapper appMapper;
    private final AptoideInstallManager aptoideInstallManager;
    private final Context context;
    private final SharedPreferences sharedPreferences;
    private final UpdateRepository updateRepository;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdatesNotificationWorker(Context context, WorkerParameters workerParameters, UpdateRepository updateRepository, SharedPreferences sharedPreferences, AptoideInstallManager aptoideInstallManager, AppMapper appMapper) {
        super(context, workerParameters);
        C9801m.m32346f(context, "context");
        C9801m.m32346f(workerParameters, "workerParameters");
        C9801m.m32346f(updateRepository, "updateRepository");
        C9801m.m32346f(sharedPreferences, "sharedPreferences");
        C9801m.m32346f(aptoideInstallManager, "aptoideInstallManager");
        C9801m.m32346f(appMapper, "appMapper");
        this.context = context;
        this.updateRepository = updateRepository;
        this.sharedPreferences = sharedPreferences;
        this.aptoideInstallManager = aptoideInstallManager;
        this.appMapper = appMapper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: doWork$lambda-4, reason: not valid java name */
    public static final C11234e m40962doWork$lambda4(final UpdatesNotificationWorker updatesNotificationWorker, List list) {
        C9801m.m32346f(updatesNotificationWorker, "this$0");
        return C11234e.m40020N(list).m40072M(new InterfaceC11256e() { // from class: cm.aptoide.pt.notification.l2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return UpdatesNotificationWorker.m40963doWork$lambda4$lambda1(this.f10418f, (RoomUpdate) obj);
            }
        }, false, 1).m40087a1(new InterfaceC11257f() { // from class: cm.aptoide.pt.notification.o2
            @Override // p456rx.p460m.InterfaceC11257f
            /* renamed from: a */
            public final Object mo6865a(Object obj, Object obj2) {
                return UpdatesNotificationWorker.m40965doWork$lambda4$lambda2((UpdateApp) obj, (UpdateApp) obj2);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.notification.n2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) throws Resources.NotFoundException {
                UpdatesNotificationWorker.m40966doWork$lambda4$lambda3(this.f10433f, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: doWork$lambda-4$lambda-1, reason: not valid java name */
    public static final Single m40963doWork$lambda4$lambda1(final UpdatesNotificationWorker updatesNotificationWorker, final RoomUpdate roomUpdate) {
        C9801m.m32346f(updatesNotificationWorker, "this$0");
        AptoideInstallManager aptoideInstallManager = updatesNotificationWorker.aptoideInstallManager;
        String packageName = roomUpdate.getPackageName();
        C9801m.m32345e(packageName, "update.packageName");
        return aptoideInstallManager.isInstalledWithAptoide(packageName).m39923n(new InterfaceC11256e() { // from class: cm.aptoide.pt.notification.m2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return UpdatesNotificationWorker.m40964doWork$lambda4$lambda1$lambda0(this.f10427f, roomUpdate, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: doWork$lambda-4$lambda-1$lambda-0, reason: not valid java name */
    public static final UpdateApp m40964doWork$lambda4$lambda1$lambda0(UpdatesNotificationWorker updatesNotificationWorker, RoomUpdate roomUpdate, Boolean bool) {
        C9801m.m32346f(updatesNotificationWorker, "this$0");
        AppMapper appMapper = updatesNotificationWorker.appMapper;
        C9801m.m32345e(bool, "isAptoideInstalled");
        return appMapper.mapUpdateToUpdateApp(roomUpdate, bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: doWork$lambda-4$lambda-2, reason: not valid java name */
    public static final Integer m40965doWork$lambda4$lambda2(UpdateApp updateApp, UpdateApp updateApp2) {
        if (!updateApp.isInstalledWithAptoide() || updateApp2.isInstalledWithAptoide()) {
            return (updateApp.isInstalledWithAptoide() || !updateApp2.isInstalledWithAptoide()) ? 0 : 1;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: doWork$lambda-4$lambda-3, reason: not valid java name */
    public static final void m40966doWork$lambda4$lambda3(UpdatesNotificationWorker updatesNotificationWorker, List list) throws Resources.NotFoundException {
        C9801m.m32346f(updatesNotificationWorker, "this$0");
        C9801m.m32345e(list, "updates");
        updatesNotificationWorker.handleNotification(list);
    }

    private final Notification getNotificationDefaultDesign(List<UpdateApp> updates, PendingIntent resultPendingIntent, String tickerText) throws Resources.NotFoundException {
        String string = getApplicationContext().getString(C1146R.string.app_name);
        C9801m.m32345e(string, "applicationContext.getString(R.string.app_name)");
        String formattedString = AptoideUtils.StringU.getFormattedString(C1146R.string.new_updates, getApplicationContext().getResources(), Integer.valueOf(updates.size()));
        if (updates.size() == 1) {
            formattedString = AptoideUtils.StringU.getFormattedString(C1146R.string.one_new_update, getApplicationContext().getResources(), Integer.valueOf(updates.size()));
        }
        C0245i.e eVarM1592g = new C0245i.e(this.context, UpdatesNotificationManager.CHANNEL_ID).m1595j(resultPendingIntent).m1604t(false).m1609y(C1146R.drawable.ic_stat_aptoide_notification).m1597l(string).m1596k(formattedString).m1584B(tickerText).m1592g(true);
        C9801m.m32345e(eVarM1592g, "Builder(context, Updates…     .setAutoCancel(true)");
        Notification notificationM1590c = eVarM1592g.m1590c();
        C9801m.m32345e(notificationM1590c, "builder.build()");
        return notificationM1590c;
    }

    private final void handleNotification(List<UpdateApp> updates) throws Resources.NotFoundException {
        if (shouldShowNotification(updates.size())) {
            Intent intent = new Intent(getApplicationContext(), AptoideApplication.getActivityProvider().getMainActivityFragmentClass());
            intent.putExtra(DeepLinkIntentReceiver.DeepLinksTargets.NEW_UPDATES, true);
            PendingIntent activity = PendingIntent.getActivity(getApplicationContext(), 0, intent, 67108864);
            String formattedString = AptoideUtils.StringU.getFormattedString(C1146R.string.has_updates, getApplicationContext().getResources(), getApplicationContext().getString(C1146R.string.app_name));
            C9801m.m32345e(activity, "resultPendingIntent");
            C9801m.m32345e(formattedString, "tickerText");
            C0248l.m1628b(this.context).m1633d(123, getNotificationDefaultDesign(updates, activity, formattedString));
            ManagerPreferences.setLastUpdates(updates.size(), this.sharedPreferences);
        }
    }

    private final boolean shouldShowNotification(int updates) {
        return ManagerPreferences.isUpdateNotificationEnable(this.sharedPreferences) && updates > 0 && updates != ManagerPreferences.getLastUpdates(this.sharedPreferences);
    }

    @Override // androidx.work.Worker
    public ListenableWorker.AbstractC0698a doWork() {
        this.updateRepository.sync(true, false, false).m39974b(this.updateRepository.getAll(false)).m40057E().m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.notification.p2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return UpdatesNotificationWorker.m40962doWork$lambda4(this.f10441f, (List) obj);
            }
        }).m40081W0().m40551b();
        ListenableWorker.AbstractC0698a abstractC0698aM4766c = ListenableWorker.AbstractC0698a.m4766c();
        C9801m.m32345e(abstractC0698aM4766c, "success()");
        return abstractC0698aM4766c;
    }
}
