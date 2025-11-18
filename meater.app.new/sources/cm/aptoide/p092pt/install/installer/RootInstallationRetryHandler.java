package cm.aptoide.p092pt.install.installer;

import android.content.Context;
import cm.aptoide.p092pt.install.Install;
import cm.aptoide.p092pt.install.InstallManager;
import cm.aptoide.p092pt.logger.Logger;
import cm.aptoide.p092pt.notification.SystemNotificationShower;
import java.util.Collections;
import java.util.List;
import p241e.p294g.p306b.C8988c;
import p456rx.C11234e;
import p456rx.InterfaceC11246k;
import p456rx.p457l.p459c.C11250a;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p460m.InterfaceC11253b;

/* loaded from: classes.dex */
public class RootInstallationRetryHandler {
    private static final String TAG = "RootInstallationRetryHandler";
    private Context context;
    private int count;
    private final C8988c<List<Install>> handler;
    private final InstallManager installManager;
    private final int notificationId;
    private RootInstallErrorNotificationFactory rootInstallErrorNotificationFactory;
    private InterfaceC11246k subscription;
    private final SystemNotificationShower systemNotificationShower;

    public RootInstallationRetryHandler(int i2, SystemNotificationShower systemNotificationShower, InstallManager installManager, C8988c<List<Install>> c8988c, int i3, Context context, RootInstallErrorNotificationFactory rootInstallErrorNotificationFactory) {
        this.notificationId = i2;
        this.systemNotificationShower = systemNotificationShower;
        this.installManager = installManager;
        this.handler = c8988c;
        this.count = i3;
        this.context = context;
        this.rootInstallErrorNotificationFactory = rootInstallErrorNotificationFactory;
    }

    private void dismissNotifications() {
        this.systemNotificationShower.dismissNotification(this.notificationId);
        this.handler.call(Collections.emptyList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$retries$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8268a() {
        this.count++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$retries$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8269b() {
        this.count--;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$start$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8270c(List list) {
        if (list.isEmpty()) {
            dismissNotifications();
        } else {
            showNotification(list);
        }
    }

    static /* synthetic */ void lambda$start$1(List list) {
    }

    private void showNotification(List<Install> list) {
        if (this.count == 0) {
            showSystemNotification(list);
        } else {
            this.handler.call(list);
        }
    }

    private void showSystemNotification(List<Install> list) {
        SystemNotificationShower systemNotificationShower = this.systemNotificationShower;
        Context context = this.context;
        systemNotificationShower.showNotification(context, this.rootInstallErrorNotificationFactory.create(context, list));
    }

    public C11234e<List<Install>> retries() {
        return this.handler.m40121y(new InterfaceC11252a() { // from class: cm.aptoide.pt.install.installer.r0
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f10172f.m8268a();
            }
        }).m40051A(new InterfaceC11252a() { // from class: cm.aptoide.pt.install.installer.s0
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f10174f.m8269b();
            }
        });
    }

    public void start() {
        this.subscription = this.installManager.getTimedOutInstallations().m40095j0(C11250a.m40156b()).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.install.installer.p0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10167f.m8270c((List) obj);
            }
        }).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.install.installer.o0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                RootInstallationRetryHandler.lambda$start$1((List) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.install.installer.q0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                Logger.getInstance().m8277e(RootInstallationRetryHandler.TAG, "start: " + ((Throwable) obj));
            }
        });
    }

    public void stop() {
        if (this.subscription.isUnsubscribed()) {
            return;
        }
        this.subscription.unsubscribe();
    }
}
