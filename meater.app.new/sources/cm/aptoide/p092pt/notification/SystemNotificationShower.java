package cm.aptoide.p092pt.notification;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.app.C0245i;
import androidx.core.content.C0255a;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.NotificationApplicationView;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.database.room.RoomNotification;
import cm.aptoide.p092pt.install.installer.RootInstallErrorNotification;
import cm.aptoide.p092pt.networking.image.ImageLoader;
import cm.aptoide.p092pt.presenter.Presenter;
import cm.aptoide.p092pt.themes.NewFeatureManager;
import cm.aptoide.p092pt.themes.ThemeAnalytics;
import cm.aptoide.p092pt.view.MainActivity;
import com.bumptech.glide.ComponentCallbacks2C5349c;
import java.util.Arrays;
import java.util.concurrent.Callable;
import p456rx.C11231b;
import p456rx.Single;
import p456rx.p457l.p459c.C11250a;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;
import p456rx.p460m.InterfaceCallableC11255d;
import p456rx.p474t.C11426b;
import p456rx.schedulers.Schedulers;

/* loaded from: classes.dex */
public class SystemNotificationShower implements Presenter {
    public static final String ANDROID_NOTIFICATION_CHANNEL_ID = "AndroidNotification";
    public static final String LOCAL_NOTIFICATION_CHANNEL_ID = "LocalNotification";
    public static final String NEW_FEATURE_NOTIFICATION_CHANNEL_ID = "NewFeatureNotification";
    public static final String NOTIFICATION_DISMISSED_ACTION = "PUSH_NOTIFICATION_DISMISSED";
    public static final String NOTIFICATION_NOTIFICATION_ID = "PUSH_NOTIFICATION_NOTIFICATION_ID";
    public static final String NOTIFICATION_PRESSED_ACTION = "NOTIFICATION_PRESSED_ACTION";
    public static final String NOTIFICATION_TARGET_URL = "PUSH_NOTIFICATION_TARGET_URL";
    public static final String NOTIFICATION_TRACK_URL = "PUSH_NOTIFICATION_TRACK_URL";
    private Context context;
    private CrashReport crashReport;
    private final NavigationTracker navigationTracker;
    private NewFeatureManager newFeatureManager;
    private NotificationAnalytics notificationAnalytics;
    private NotificationCenter notificationCenter;
    private NotificationIdsMapper notificationIdsMapper;
    private NotificationManager notificationManager;
    private NotificationProvider notificationProvider;
    private ReadyToInstallNotificationManager readyToInstallNotificationManager;
    private C11426b subscriptions;
    private ThemeAnalytics themeAnalytics;
    private NotificationApplicationView view;

    public SystemNotificationShower(Context context, NotificationManager notificationManager, NotificationIdsMapper notificationIdsMapper, NotificationCenter notificationCenter, NotificationAnalytics notificationAnalytics, CrashReport crashReport, NotificationProvider notificationProvider, NotificationApplicationView notificationApplicationView, C11426b c11426b, NavigationTracker navigationTracker, NewFeatureManager newFeatureManager, ThemeAnalytics themeAnalytics, ReadyToInstallNotificationManager readyToInstallNotificationManager) {
        this.context = context;
        this.notificationManager = notificationManager;
        this.notificationIdsMapper = notificationIdsMapper;
        this.notificationCenter = notificationCenter;
        this.notificationAnalytics = notificationAnalytics;
        this.crashReport = crashReport;
        this.notificationProvider = notificationProvider;
        this.subscriptions = c11426b;
        this.view = notificationApplicationView;
        this.navigationTracker = navigationTracker;
        this.newFeatureManager = newFeatureManager;
        this.themeAnalytics = themeAnalytics;
        this.readyToInstallNotificationManager = readyToInstallNotificationManager;
    }

    private Single<Notification> buildLocalNotification(final Context context, final String str, final String str2, final String str3, final PendingIntent pendingIntent, final PendingIntent pendingIntent2) {
        return Single.m39912l(new Callable() { // from class: cm.aptoide.pt.notification.m1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Context context2 = context;
                String str4 = str;
                String str5 = str2;
                return new C0245i.e(context2, SystemNotificationShower.LOCAL_NOTIFICATION_CHANNEL_ID).m1609y(C1146R.drawable.ic_stat_aptoide_notification).m1594i(C0255a.m1675d(context2, C1146R.color.default_orange_gradient_end)).m1597l(str4).m1596k(str5).m1588a(0, context2.getResources().getString(C1146R.string.promo_update2appc_notification_dismiss_button), pendingIntent2).m1588a(0, context2.getResources().getString(C1146R.string.promo_update2appc_notification_claim_button), pendingIntent).m1600p(ComponentCallbacks2C5349c.m9978t(context2).m10033b().m10022K0(str3).m10023O0().get()).m1590c();
            }
        }).m39930v(Schedulers.computation()).m39924p(C11250a.m40156b());
    }

    private Single<Notification> buildNewFeatureNotification(final Context context, final String str, final String str2, final int i2, final PendingIntent pendingIntent, final PendingIntent pendingIntent2) {
        return Single.m39912l(new Callable() { // from class: cm.aptoide.pt.notification.l1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Context context2 = context;
                PendingIntent pendingIntent3 = pendingIntent;
                String str3 = str;
                return new C0245i.e(context2, SystemNotificationShower.NEW_FEATURE_NOTIFICATION_CHANNEL_ID).m1595j(pendingIntent3).m1609y(C1146R.drawable.ic_stat_aptoide_notification).m1594i(C0255a.m1675d(context2, C1146R.color.default_orange_gradient_end)).m1597l(str3).m1596k(str2).m1588a(0, context2.getResources().getString(C1146R.string.updates_notification_dismiss_button), pendingIntent2).m1588a(0, context2.getResources().getString(i2), pendingIntent3).m1590c();
            }
        }).m39930v(Schedulers.computation()).m39924p(C11250a.m40156b());
    }

    private Single<Notification> buildNotification(final Context context, final String str, final String str2, final String str3, final PendingIntent pendingIntent, final PendingIntent pendingIntent2) {
        return Single.m39912l(new Callable() { // from class: cm.aptoide.pt.notification.j2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Context context2 = context;
                PendingIntent pendingIntent3 = pendingIntent;
                String str4 = str3;
                String str5 = str;
                String str6 = str2;
                return new C0245i.e(context2, SystemNotificationShower.ANDROID_NOTIFICATION_CHANNEL_ID).m1595j(pendingIntent3).m1604t(false).m1605u(true).m1609y(C1146R.drawable.ic_stat_aptoide_notification).m1600p(ImageLoader.with(context2).loadBitmap(str4)).m1597l(str5).m1596k(str6).m1599n(pendingIntent2).m1583A(new C0245i.c().m1576h(str6)).m1590c();
            }
        }).m39930v(Schedulers.computation()).m39924p(C11250a.m40156b());
    }

    private void callDeepLink(Context context, NotificationInfo notificationInfo) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(notificationInfo.getNotificationUrl()));
        intent.setFlags(268435456);
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e2) {
            this.crashReport.log(e2);
        }
    }

    private C11231b dismissNotificationAfterAction(final int i2) {
        return C11231b.m39949i(new InterfaceCallableC11255d() { // from class: cm.aptoide.pt.notification.g1
            @Override // p456rx.p460m.InterfaceCallableC11255d, java.util.concurrent.Callable
            public final Object call() {
                return this.f10383f.m8348a(i2);
            }
        });
    }

    private NotificationChannel getAndroidNotificationChannel() {
        NotificationChannel notificationChannel = new NotificationChannel(ANDROID_NOTIFICATION_CHANNEL_ID, "Aptoide Android System notifications", 3);
        notificationChannel.setDescription("Aptoide android notifications");
        return notificationChannel;
    }

    private NotificationChannel getLocalNotificationChannel() {
        NotificationChannel notificationChannel = new NotificationChannel(LOCAL_NOTIFICATION_CHANNEL_ID, "Local Aptoide System notifications", 3);
        notificationChannel.setDescription("Aptoide notifications");
        return notificationChannel;
    }

    private NotificationChannel getNewFeatureNotificationChannel() {
        NotificationChannel notificationChannel = new NotificationChannel(NEW_FEATURE_NOTIFICATION_CHANNEL_ID, "Aptoide New Feature System notifications", 3);
        notificationChannel.setDescription("Aptoide new feature notifications");
        return notificationChannel;
    }

    private Single<PendingIntent> getPressIntentAction(final String str, final String str2, final int i2, final Context context) {
        return Single.m39912l(new Callable() { // from class: cm.aptoide.pt.notification.i2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return SystemNotificationShower.lambda$getPressIntentAction$8(context, i2, str, str2);
            }
        }).m39930v(Schedulers.computation());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$dismissNotificationAfterAction$12, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m8348a(int i2) {
        try {
            return this.notificationCenter.notificationDismissed(this.notificationIdsMapper.getNotificationType(i2));
        } catch (RuntimeException e2) {
            return C11231b.m39951s(e2);
        }
    }

    static /* synthetic */ PendingIntent lambda$getPressIntentAction$8(Context context, int i2, String str, String str2) throws Exception {
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.setAction(NOTIFICATION_PRESSED_ACTION);
        intent.setFlags(0);
        intent.putExtra(NOTIFICATION_NOTIFICATION_ID, i2);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra(NOTIFICATION_TRACK_URL, str);
        }
        if (!TextUtils.isEmpty(str2)) {
            intent.putExtra(NOTIFICATION_TARGET_URL, str2);
        }
        return PendingIntent.getActivity(context, i2, intent, 167772160);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$mapLocalToAndroidNotification$6, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8349b(Notification notification) {
        this.readyToInstallNotificationManager.setIsNotificationDisplayed(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$mapLocalToAndroidNotification$7, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m8350c(AptoideNotification aptoideNotification, int i2, PendingIntent pendingIntent) {
        if (aptoideNotification.getType() != 8) {
            return aptoideNotification.getType() == 9 ? this.readyToInstallNotificationManager.buildNotification(aptoideNotification, this.context).m39919g(new InterfaceC11253b() { // from class: cm.aptoide.pt.notification.q1
                @Override // p456rx.p460m.InterfaceC11253b
                public final void call(Object obj) {
                    this.f10449f.m8349b((Notification) obj);
                }
            }) : buildLocalNotification(this.context, aptoideNotification.getTitle(), aptoideNotification.getBody(), aptoideNotification.getImg(), pendingIntent, getOnDismissAction(i2));
        }
        this.newFeatureManager.setFeatureAsShown();
        return buildNewFeatureNotification(this.context, aptoideNotification.getTitle(), aptoideNotification.getBody(), aptoideNotification.getActionStringRes(), pendingIntent, getOnDismissAction(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$mapToAndroidNotification$5, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m8351d(AptoideNotification aptoideNotification, int i2, PendingIntent pendingIntent) {
        return buildNotification(this.context, aptoideNotification.getTitle(), aptoideNotification.getBody(), aptoideNotification.getImg(), pendingIntent, getOnDismissAction(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setNotificationBootCompletedSubscribe$13, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8352e(NotificationInfo notificationInfo) {
        this.notificationCenter.setup();
    }

    static /* synthetic */ void lambda$setNotificationBootCompletedSubscribe$14(NotificationInfo notificationInfo) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setNotificationBootCompletedSubscribe$15, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8353f(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setNotificationDismissSubscribe$17, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8354g(NotificationInfo notificationInfo) {
        if (this.notificationIdsMapper.getNotificationType(notificationInfo.getNotificationType())[0].equals(8)) {
            this.themeAnalytics.sendDarkThemeDismissClickEvent("Notification");
        }
        if (this.notificationIdsMapper.getNotificationType(notificationInfo.getNotificationType())[0].equals(9)) {
            this.readyToInstallNotificationManager.setIsNotificationDisplayed(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setNotificationDismissSubscribe$18, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m8355h(NotificationInfo notificationInfo) {
        return dismissNotificationAfterAction(notificationInfo.getNotificationType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setNotificationDismissSubscribe$19, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Boolean m8356i(NotificationInfo notificationInfo) {
        return Boolean.valueOf(this.notificationIdsMapper.getNotificationType(notificationInfo.getNotificationType())[0].equals(7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setNotificationDismissSubscribe$20, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m8357j(NotificationInfo notificationInfo) {
        return this.notificationProvider.deleteAllForType(7);
    }

    static /* synthetic */ void lambda$setNotificationDismissSubscribe$21() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setNotificationDismissSubscribe$22, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8358k(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setNotificationPressSubscribe$23, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8359l(NotificationInfo notificationInfo, RoomNotification roomNotification) {
        if (roomNotification.getType() != 7 && roomNotification.getType() != 8 && roomNotification.getType() != 9) {
            this.notificationAnalytics.sendPushNotificationPressedEvent(roomNotification.getType(), roomNotification.getAbTestingGroup(), roomNotification.getCampaignId(), roomNotification.getUrl());
            this.notificationAnalytics.sendNotificationTouchEvent(notificationInfo.getNotificationTrackUrl(), notificationInfo.getNotificationType(), notificationInfo.getNotificationUrl(), roomNotification.getCampaignId(), roomNotification.getAbTestingGroup());
        }
        if (roomNotification.getType() == 8) {
            this.themeAnalytics.sendDarkThemeDialogTurnItOnClickEvent("Notification");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setNotificationPressSubscribe$24, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8360m(RoomNotification roomNotification) {
        this.navigationTracker.registerScreen(ScreenTagHistory.Builder.build("Notification"));
    }

    static /* synthetic */ NotificationInfo lambda$setNotificationPressSubscribe$25(NotificationInfo notificationInfo, RoomNotification roomNotification) {
        return notificationInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setNotificationPressSubscribe$26, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m8361n(final NotificationInfo notificationInfo) {
        return this.notificationProvider.getLastShowed(this.notificationIdsMapper.getNotificationType(notificationInfo.getNotificationType())).m39919g(new InterfaceC11253b() { // from class: cm.aptoide.pt.notification.w1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10487f.m8359l(notificationInfo, (RoomNotification) obj);
            }
        }).m39919g(new InterfaceC11253b() { // from class: cm.aptoide.pt.notification.b2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10358f.m8360m((RoomNotification) obj);
            }
        }).m39923n(new InterfaceC11256e() { // from class: cm.aptoide.pt.notification.y1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                NotificationInfo notificationInfo2 = notificationInfo;
                SystemNotificationShower.lambda$setNotificationPressSubscribe$25(notificationInfo2, (RoomNotification) obj);
                return notificationInfo2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setNotificationPressSubscribe$27, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m8362o(NotificationInfo notificationInfo) {
        callDeepLink(this.context, notificationInfo);
        return dismissNotificationAfterAction(notificationInfo.getNotificationType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setNotificationPressSubscribe$28, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Boolean m8363p(NotificationInfo notificationInfo) {
        return Boolean.valueOf(this.notificationIdsMapper.getNotificationType(notificationInfo.getNotificationType())[0].equals(7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setNotificationPressSubscribe$29, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m8364q(NotificationInfo notificationInfo) {
        return this.notificationProvider.deleteAllForType(7);
    }

    static /* synthetic */ void lambda$setNotificationPressSubscribe$30() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setNotificationPressSubscribe$31, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8365r(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showNewNotification$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8366s(int i2, Notification notification) {
        this.notificationManager.notify(i2, notification);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showNewNotification$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8367t(int i2, Notification notification) {
        this.notificationManager.notify(i2, notification);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showNewNotification$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m8368u(AptoideNotification aptoideNotification) throws RuntimeException {
        setupChannels();
        final int notificationId = this.notificationIdsMapper.getNotificationId(aptoideNotification.getType());
        if (aptoideNotification.getType() == 7 || aptoideNotification.getType() == 8 || aptoideNotification.getType() == 9) {
            return mapLocalToAndroidNotification(aptoideNotification, notificationId).m39919g(new InterfaceC11253b() { // from class: cm.aptoide.pt.notification.d2
                @Override // p456rx.p460m.InterfaceC11253b
                public final void call(Object obj) {
                    this.f10369f.m8367t(notificationId, (Notification) obj);
                }
            }).m39934z();
        }
        this.notificationAnalytics.sendPushNotficationImpressionEvent(aptoideNotification.getType(), aptoideNotification.getAbTestingGroup(), aptoideNotification.getCampaignId(), aptoideNotification.getUrl());
        return mapToAndroidNotification(aptoideNotification, notificationId).m39919g(new InterfaceC11253b() { // from class: cm.aptoide.pt.notification.f2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10379f.m8366s(notificationId, (Notification) obj);
            }
        }).m39934z();
    }

    static /* synthetic */ void lambda$showNewNotification$3(AptoideNotification aptoideNotification) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showNewNotification$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8369v(Throwable th) {
        this.crashReport.log(th);
    }

    private Single<Notification> mapLocalToAndroidNotification(final AptoideNotification aptoideNotification, final int i2) {
        return getPressIntentAction(aptoideNotification.getUrlTrack(), aptoideNotification.getUrl(), i2, this.context).m39920i(new InterfaceC11256e() { // from class: cm.aptoide.pt.notification.a2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10347f.m8350c(aptoideNotification, i2, (PendingIntent) obj);
            }
        });
    }

    private Single<Notification> mapToAndroidNotification(final AptoideNotification aptoideNotification, final int i2) {
        return getPressIntentAction(aptoideNotification.getUrlTrack(), aptoideNotification.getUrl(), i2, this.context).m39920i(new InterfaceC11256e() { // from class: cm.aptoide.pt.notification.c2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10363f.m8351d(aptoideNotification, i2, (PendingIntent) obj);
            }
        });
    }

    private void setNotificationBootCompletedSubscribe() {
        this.view.getActionBootCompleted().m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.notification.e2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10374f.m8352e((NotificationInfo) obj);
            }
        }).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.notification.i1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                SystemNotificationShower.lambda$setNotificationBootCompletedSubscribe$14((NotificationInfo) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.notification.r1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10453f.m8353f((Throwable) obj);
            }
        });
    }

    private void setNotificationDismissSubscribe() {
        this.view.getNotificationDismissed().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.notification.t1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((NotificationInfo) obj).getNotificationType() < 9);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.notification.h2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10389f.m8354g((NotificationInfo) obj);
            }
        }).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.notification.g2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10385f.m8355h((NotificationInfo) obj);
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.notification.u1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10464f.m8356i((NotificationInfo) obj);
            }
        }).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.notification.z1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10501f.m8357j((NotificationInfo) obj);
            }
        }).m40083X0().m39965I(new InterfaceC11252a() { // from class: cm.aptoide.pt.notification.n1
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                SystemNotificationShower.lambda$setNotificationDismissSubscribe$21();
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.notification.j1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10399f.m8358k((Throwable) obj);
            }
        });
    }

    private void setNotificationPressSubscribe() {
        this.view.getNotificationClick().m40070L(new InterfaceC11256e() { // from class: cm.aptoide.pt.notification.f1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10378f.m8361n((NotificationInfo) obj);
            }
        }).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.notification.o1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10436f.m8362o((NotificationInfo) obj);
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.notification.k1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10408f.m8363p((NotificationInfo) obj);
            }
        }).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.notification.s1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10456f.m8364q((NotificationInfo) obj);
            }
        }).m40083X0().m39965I(new InterfaceC11252a() { // from class: cm.aptoide.pt.notification.x1
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                SystemNotificationShower.lambda$setNotificationPressSubscribe$30();
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.notification.h1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10388f.m8365r((Throwable) obj);
            }
        });
    }

    private void setupChannels() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.notificationManager.createNotificationChannels(Arrays.asList(getLocalNotificationChannel(), getAndroidNotificationChannel(), getNewFeatureNotificationChannel(), this.readyToInstallNotificationManager.getNotificationChannel()));
        }
    }

    private void showNewNotification() {
        this.subscriptions.m40667a(this.notificationCenter.getNewNotifications().m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.notification.p1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10440f.m8368u((AptoideNotification) obj);
            }
        }).m40110s0().m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.notification.e1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                SystemNotificationShower.lambda$showNewNotification$3((AptoideNotification) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.notification.v1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10468f.m8369v((Throwable) obj);
            }
        }));
    }

    public void dismissNotification(int i2) {
        this.notificationManager.cancel(i2);
    }

    public PendingIntent getOnDismissAction(int i2) {
        Intent intent = new Intent(this.context, (Class<?>) MainActivity.class);
        intent.setAction(NOTIFICATION_DISMISSED_ACTION);
        intent.putExtra(NOTIFICATION_NOTIFICATION_ID, i2);
        return PendingIntent.getActivity(this.context, i2, intent, 167772160);
    }

    @Override // cm.aptoide.p092pt.presenter.Presenter
    public void present() {
        setNotificationPressSubscribe();
        setNotificationDismissSubscribe();
        setNotificationBootCompletedSubscribe();
        showNewNotification();
    }

    public void showNotification(Context context, RootInstallErrorNotification rootInstallErrorNotification) {
        this.notificationManager.notify(rootInstallErrorNotification.getNotificationId(), mapToAndroidNotification(context, rootInstallErrorNotification));
    }

    private Notification mapToAndroidNotification(Context context, RootInstallErrorNotification rootInstallErrorNotification) {
        Notification notificationM1590c = new C0245i.e(context).m1597l(rootInstallErrorNotification.getMessage()).m1609y(C1146R.drawable.ic_stat_aptoide_notification).m1600p(rootInstallErrorNotification.getIcon()).m1592g(true).m1589b(rootInstallErrorNotification.getAction()).m1599n(rootInstallErrorNotification.getDeleteAction()).m1590c();
        notificationM1590c.flags = 20;
        return notificationM1590c;
    }
}
