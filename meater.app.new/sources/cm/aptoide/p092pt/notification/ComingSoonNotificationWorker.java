package cm.aptoide.p092pt.notification;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.C0245i;
import androidx.core.app.C0248l;
import androidx.work.AbstractC0818y;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import cm.aptoide.p092pt.app.aptoideinstall.ComingSoonApp;
import cm.aptoide.p092pt.networking.image.ImageLoader;
import cm.aptoide.p092pt.view.app.AppCenter;
import cm.aptoide.p092pt.view.app.DetailedAppRequestResult;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;
import p456rx.p460m.InterfaceC11253b;

/* compiled from: ComingSoonNotificationWorker.kt */
@Metadata(m32266d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m32267d2 = {"Lcm/aptoide/pt/notification/ComingSoonNotificationWorker;", "Landroidx/work/Worker;", "context", "Landroid/content/Context;", "workerParameters", "Landroidx/work/WorkerParameters;", "appCenter", "Lcm/aptoide/pt/view/app/AppCenter;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcm/aptoide/pt/view/app/AppCenter;)V", "cancelComingSoonVerification", HttpUrl.FRAGMENT_ENCODE_SET, "packageName", HttpUrl.FRAGMENT_ENCODE_SET, "doWork", "Landroidx/work/ListenableWorker$Result;", "handleAppArrived", "comingSoonApp", "Lcm/aptoide/pt/app/aptoideinstall/ComingSoonApp;", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class ComingSoonNotificationWorker extends Worker {
    private final AppCenter appCenter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComingSoonNotificationWorker(Context context, WorkerParameters workerParameters, AppCenter appCenter) {
        super(context, workerParameters);
        C9801m.m32346f(context, "context");
        C9801m.m32346f(workerParameters, "workerParameters");
        C9801m.m32346f(appCenter, "appCenter");
        this.appCenter = appCenter;
    }

    private final void cancelComingSoonVerification(String packageName) {
        if (packageName != null) {
            AbstractC0818y.m5238h(getApplicationContext()).mo4984a(ComingSoonNotificationManager.WORKER_TAG + packageName);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: doWork$lambda-1, reason: not valid java name */
    public static final void m40955doWork$lambda1(ComingSoonNotificationWorker comingSoonNotificationWorker, String str, DetailedAppRequestResult detailedAppRequestResult) {
        C9801m.m32346f(comingSoonNotificationWorker, "this$0");
        if (detailedAppRequestResult == null || detailedAppRequestResult.getDetailedApp() == null) {
            return;
        }
        comingSoonNotificationWorker.cancelComingSoonVerification(str);
        String name = detailedAppRequestResult.getDetailedApp().getName();
        C9801m.m32345e(name, "detailedAppResult.detailedApp.name");
        String icon = detailedAppRequestResult.getDetailedApp().getIcon();
        C9801m.m32345e(icon, "detailedAppResult.detailedApp.icon");
        String md5 = detailedAppRequestResult.getDetailedApp().getMd5();
        C9801m.m32345e(md5, "detailedAppResult.detailedApp.md5");
        String name2 = detailedAppRequestResult.getDetailedApp().getStore().getName();
        C9801m.m32345e(name2, "detailedAppResult.detailedApp.store.name");
        String packageName = detailedAppRequestResult.getDetailedApp().getPackageName();
        C9801m.m32345e(packageName, "detailedAppResult.detailedApp.packageName");
        comingSoonNotificationWorker.handleAppArrived(new ComingSoonApp(name, icon, md5, name2, packageName));
    }

    private final void handleAppArrived(ComingSoonApp comingSoonApp) {
        Intent intent = new Intent(getApplicationContext(), AptoideApplication.getActivityProvider().getMainActivityFragmentClass());
        intent.putExtra(DeepLinkIntentReceiver.DeepLinksTargets.APP_VIEW_FRAGMENT, true);
        intent.putExtra("md5", comingSoonApp.getMd5());
        PendingIntent activity = PendingIntent.getActivity(getApplicationContext(), 0, intent, 67108864);
        String string = getApplicationContext().getString(C1146R.string.promotional_new_notification_body, comingSoonApp.getAppName());
        C9801m.m32345e(string, "applicationContext.getSt…   comingSoonApp.appName)");
        Notification notificationM1590c = new C0245i.e(getApplicationContext(), ComingSoonNotificationManager.CHANNEL_ID).m1595j(activity).m1604t(false).m1609y(C1146R.drawable.ic_stat_aptoide_notification).m1600p(ImageLoader.with(getApplicationContext()).loadBitmap(comingSoonApp.getAppIcon())).m1597l(getApplicationContext().getString(C1146R.string.promotional_new_notification_title)).m1596k(string).m1592g(true).m1590c();
        C9801m.m32345e(notificationM1590c, "Builder(applicationConte…tAutoCancel(true).build()");
        C0248l.m1628b(getApplicationContext()).m1633d(1994, notificationM1590c);
    }

    @Override // androidx.work.Worker
    public ListenableWorker.AbstractC0698a doWork() throws InterruptedException {
        final String strM4833j = getInputData().m4833j("package_name");
        this.appCenter.loadDetailedApp(strM4833j, "catappult").m39919g(new InterfaceC11253b() { // from class: cm.aptoide.pt.notification.c
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ComingSoonNotificationWorker.m40955doWork$lambda1(this.f10359f, strM4833j, (DetailedAppRequestResult) obj);
            }
        }).m39933y().m40633b();
        ListenableWorker.AbstractC0698a abstractC0698aM4766c = ListenableWorker.AbstractC0698a.m4766c();
        C9801m.m32345e(abstractC0698aM4766c, "success()");
        return abstractC0698aM4766c;
    }
}
