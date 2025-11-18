package cm.aptoide.p092pt.install;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.crashreports.CrashReport;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p460m.InterfaceC11253b;

/* loaded from: classes.dex */
public class RootInstallNotificationEventReceiver extends BroadcastReceiver {
    public static final String ROOT_INSTALL_DISMISS_ACTION = "cm.aptoide.pt.ROOT_INSTALL_DISMISS_ACTION";
    public static final String ROOT_INSTALL_RETRY_ACTION = "cm.aptoide.pt.ROOT_INSTALL_RETRY_ACTION";
    private static final String TAG = RootInstallNotificationEventReceiver.class.getSimpleName();
    private CrashReport crashReport;
    private InstallManager installManager;

    static /* synthetic */ void lambda$onReceive$0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onReceive$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8247a(Throwable th) {
        this.crashReport.log(th);
    }

    static /* synthetic */ void lambda$onReceive$2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onReceive$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8248b(Throwable th) {
        this.crashReport.log(th);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        this.installManager = ((AptoideApplication) context.getApplicationContext()).getInstallManager();
        this.crashReport = CrashReport.getInstance();
        if (intent == null || intent.getAction() == null) {
            return;
        }
        String action = intent.getAction();
        action.hashCode();
        if (!action.equals(ROOT_INSTALL_DISMISS_ACTION)) {
            if (!action.equals(ROOT_INSTALL_RETRY_ACTION)) {
                return;
            } else {
                this.installManager.retryTimedOutInstallations().m39965I(new InterfaceC11252a() { // from class: cm.aptoide.pt.install.h3
                    @Override // p456rx.p460m.InterfaceC11252a
                    public final void call() {
                        RootInstallNotificationEventReceiver.lambda$onReceive$0();
                    }
                }, new InterfaceC11253b() { // from class: cm.aptoide.pt.install.e3
                    @Override // p456rx.p460m.InterfaceC11253b
                    public final void call(Object obj) {
                        this.f10098f.m8247a((Throwable) obj);
                    }
                });
            }
        }
        this.installManager.cleanTimedOutInstalls().m39965I(new InterfaceC11252a() { // from class: cm.aptoide.pt.install.g3
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                RootInstallNotificationEventReceiver.lambda$onReceive$2();
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.install.f3
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10103f.m8248b((Throwable) obj);
            }
        });
    }
}
