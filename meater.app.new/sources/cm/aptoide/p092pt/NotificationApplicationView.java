package cm.aptoide.p092pt;

import android.app.NotificationManager;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.notification.NotificationIdsMapper;
import cm.aptoide.p092pt.notification.NotificationInfo;
import cm.aptoide.p092pt.notification.SystemNotificationShower;
import cm.aptoide.p092pt.presenter.NotificationView;
import cm.aptoide.p092pt.presenter.Presenter;
import cm.aptoide.p092pt.presenter.View;
import com.trello.rxlifecycle.C8757c;
import com.trello.rxlifecycle.InterfaceC8756b;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11256e;
import p456rx.p473s.C11417a;
import p456rx.p474t.C11426b;

/* loaded from: classes.dex */
public class NotificationApplicationView extends AptoideApplication implements NotificationView {
    private C11417a<View.LifecycleEvent> lifecycleEventBehaviorSubject;
    private SystemNotificationShower systemNotificationShower;

    @Override // cm.aptoide.p092pt.presenter.View
    public void attachPresenter(Presenter presenter) {
        presenter.present();
    }

    @Override // cm.aptoide.p092pt.presenter.View
    public <T> InterfaceC8756b<T> bindUntilEvent(View.LifecycleEvent lifecycleEvent) {
        return C8757c.m27898b(getLifecycleEvent(), lifecycleEvent);
    }

    @Override // cm.aptoide.p092pt.presenter.NotificationView
    public C11234e<NotificationInfo> getActionBootCompleted() {
        return getNotificationsPublishRelay().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.n0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((NotificationInfo) obj).getAction().equals("android.intent.action.BOOT_COMPLETED"));
            }
        });
    }

    @Override // cm.aptoide.p092pt.presenter.View
    public C11234e<View.LifecycleEvent> getLifecycleEvent() {
        return this.lifecycleEventBehaviorSubject;
    }

    @Override // cm.aptoide.p092pt.presenter.NotificationView
    public C11234e<NotificationInfo> getNotificationClick() {
        return getNotificationsPublishRelay().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.m0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((NotificationInfo) obj).getAction().equals(SystemNotificationShower.NOTIFICATION_PRESSED_ACTION));
            }
        });
    }

    @Override // cm.aptoide.p092pt.presenter.NotificationView
    public C11234e<NotificationInfo> getNotificationDismissed() {
        return getNotificationsPublishRelay().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.o0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((NotificationInfo) obj).getAction().equals(SystemNotificationShower.NOTIFICATION_DISMISSED_ACTION));
            }
        });
    }

    @Override // cm.aptoide.p092pt.AptoideApplication
    protected SystemNotificationShower getSystemNotificationShower() {
        if (this.systemNotificationShower == null) {
            this.systemNotificationShower = new SystemNotificationShower(this, (NotificationManager) getSystemService("notification"), new NotificationIdsMapper(), getNotificationCenter(), getNotificationAnalytics(), CrashReport.getInstance(), getNotificationProvider(), this, new C11426b(), getNavigationTracker(), getNewFeatureManager(), getThemeAnalytics(), getReadyToInstallNotificationManager());
        }
        return this.systemNotificationShower;
    }

    @Override // cm.aptoide.p092pt.AptoideApplication, android.app.Application
    public void onCreate() {
        super.onCreate();
        C11417a<View.LifecycleEvent> c11417aM40634g1 = C11417a.m40634g1();
        this.lifecycleEventBehaviorSubject = c11417aM40634g1;
        c11417aM40634g1.onNext(View.LifecycleEvent.CREATE);
        attachPresenter(getSystemNotificationShower());
    }
}
