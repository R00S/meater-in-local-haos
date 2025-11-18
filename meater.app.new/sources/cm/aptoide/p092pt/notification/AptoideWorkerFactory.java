package cm.aptoide.p092pt.notification;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.AbstractC0702a0;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import cm.aptoide.p092pt.app.aptoideinstall.AptoideInstallManager;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.home.apps.AppMapper;
import cm.aptoide.p092pt.sync.SyncScheduler;
import cm.aptoide.p092pt.sync.alarm.SyncStorage;
import cm.aptoide.p092pt.updates.UpdateRepository;
import cm.aptoide.p092pt.view.app.AppCenter;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: AptoideWorkerFactory.kt */
@Metadata(m32266d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\"\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m32267d2 = {"Lcm/aptoide/pt/notification/AptoideWorkerFactory;", "Landroidx/work/WorkerFactory;", "updateRepository", "Lcm/aptoide/pt/updates/UpdateRepository;", "sharedPreferences", "Landroid/content/SharedPreferences;", "aptoideInstallManager", "Lcm/aptoide/pt/app/aptoideinstall/AptoideInstallManager;", "appMapper", "Lcm/aptoide/pt/home/apps/AppMapper;", "syncScheduler", "Lcm/aptoide/pt/sync/SyncScheduler;", "syncStorage", "Lcm/aptoide/pt/sync/alarm/SyncStorage;", "crashReport", "Lcm/aptoide/pt/crashreports/CrashReport;", "appCenter", "Lcm/aptoide/pt/view/app/AppCenter;", "(Lcm/aptoide/pt/updates/UpdateRepository;Landroid/content/SharedPreferences;Lcm/aptoide/pt/app/aptoideinstall/AptoideInstallManager;Lcm/aptoide/pt/home/apps/AppMapper;Lcm/aptoide/pt/sync/SyncScheduler;Lcm/aptoide/pt/sync/alarm/SyncStorage;Lcm/aptoide/pt/crashreports/CrashReport;Lcm/aptoide/pt/view/app/AppCenter;)V", "createWorker", "Landroidx/work/ListenableWorker;", "appContext", "Landroid/content/Context;", "workerClassName", HttpUrl.FRAGMENT_ENCODE_SET, "workerParameters", "Landroidx/work/WorkerParameters;", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class AptoideWorkerFactory extends AbstractC0702a0 {
    private final AppCenter appCenter;
    private final AppMapper appMapper;
    private final AptoideInstallManager aptoideInstallManager;
    private final CrashReport crashReport;
    private final SharedPreferences sharedPreferences;
    private final SyncScheduler syncScheduler;
    private final SyncStorage syncStorage;
    private final UpdateRepository updateRepository;

    public AptoideWorkerFactory(UpdateRepository updateRepository, SharedPreferences sharedPreferences, AptoideInstallManager aptoideInstallManager, AppMapper appMapper, SyncScheduler syncScheduler, SyncStorage syncStorage, CrashReport crashReport, AppCenter appCenter) {
        C9801m.m32346f(updateRepository, "updateRepository");
        C9801m.m32346f(sharedPreferences, "sharedPreferences");
        C9801m.m32346f(aptoideInstallManager, "aptoideInstallManager");
        C9801m.m32346f(appMapper, "appMapper");
        C9801m.m32346f(syncScheduler, "syncScheduler");
        C9801m.m32346f(syncStorage, "syncStorage");
        C9801m.m32346f(crashReport, "crashReport");
        C9801m.m32346f(appCenter, "appCenter");
        this.updateRepository = updateRepository;
        this.sharedPreferences = sharedPreferences;
        this.aptoideInstallManager = aptoideInstallManager;
        this.appMapper = appMapper;
        this.syncScheduler = syncScheduler;
        this.syncStorage = syncStorage;
        this.crashReport = crashReport;
        this.appCenter = appCenter;
    }

    @Override // androidx.work.AbstractC0702a0
    public ListenableWorker createWorker(Context appContext, String workerClassName, WorkerParameters workerParameters) {
        C9801m.m32346f(appContext, "appContext");
        C9801m.m32346f(workerClassName, "workerClassName");
        C9801m.m32346f(workerParameters, "workerParameters");
        if (C9801m.m32341a(workerClassName, UpdatesNotificationWorker.class.getName())) {
            return new UpdatesNotificationWorker(appContext, workerParameters, this.updateRepository, this.sharedPreferences, this.aptoideInstallManager, this.appMapper);
        }
        if (C9801m.m32341a(workerClassName, NotificationWorker.class.getName())) {
            return new NotificationWorker(appContext, workerParameters, this.syncScheduler, this.syncStorage, this.crashReport);
        }
        if (C9801m.m32341a(workerClassName, ComingSoonNotificationWorker.class.getName())) {
            return new ComingSoonNotificationWorker(appContext, workerParameters, this.appCenter);
        }
        return null;
    }
}
