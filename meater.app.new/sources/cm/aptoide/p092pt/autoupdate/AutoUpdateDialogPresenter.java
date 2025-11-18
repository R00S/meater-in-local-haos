package cm.aptoide.p092pt.autoupdate;

import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.install.Install;
import cm.aptoide.p092pt.presenter.Presenter;
import cm.aptoide.p092pt.presenter.View;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;
import p456rx.schedulers.Schedulers;

/* compiled from: AutoUpdateDialogPresenter.kt */
@Metadata(m32266d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\f\u001a\u00020\nH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m32267d2 = {"Lcm/aptoide/pt/autoupdate/AutoUpdateDialogPresenter;", "Lcm/aptoide/pt/presenter/Presenter;", "view", "Lcm/aptoide/pt/autoupdate/AutoUpdateDialogView;", "crashReporter", "Lcm/aptoide/pt/crashreports/CrashReport;", "autoUpdateManager", "Lcm/aptoide/pt/autoupdate/AutoUpdateManager;", "(Lcm/aptoide/pt/autoupdate/AutoUpdateDialogView;Lcm/aptoide/pt/crashreports/CrashReport;Lcm/aptoide/pt/autoupdate/AutoUpdateManager;)V", "handleNotNowClick", HttpUrl.FRAGMENT_ENCODE_SET, "handleUpdateClick", "present", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class AutoUpdateDialogPresenter implements Presenter {
    private final AutoUpdateManager autoUpdateManager;
    private final CrashReport crashReporter;
    private final AutoUpdateDialogView view;

    public AutoUpdateDialogPresenter(AutoUpdateDialogView autoUpdateDialogView, CrashReport crashReport, AutoUpdateManager autoUpdateManager) {
        C9801m.m32346f(autoUpdateDialogView, "view");
        C9801m.m32346f(crashReport, "crashReporter");
        C9801m.m32346f(autoUpdateManager, "autoUpdateManager");
        this.view = autoUpdateDialogView;
        this.crashReporter = crashReport;
        this.autoUpdateManager = autoUpdateManager;
    }

    private final void handleNotNowClick() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.autoupdate.k
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return AutoUpdateDialogPresenter.m40728handleNotNowClick$lambda6((View.LifecycleEvent) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.autoupdate.d
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return AutoUpdateDialogPresenter.m40729handleNotNowClick$lambda7(this.f8218f, (View.LifecycleEvent) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.autoupdate.c
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AutoUpdateDialogPresenter.m40730handleNotNowClick$lambda8(this.f8217f, (Void) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.autoupdate.f
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AutoUpdateDialogPresenter.m40731handleNotNowClick$lambda9((Void) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.autoupdate.e
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AutoUpdateDialogPresenter.m40727handleNotNowClick$lambda10(this.f8219f, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleNotNowClick$lambda-10, reason: not valid java name */
    public static final void m40727handleNotNowClick$lambda10(AutoUpdateDialogPresenter autoUpdateDialogPresenter, Throwable th) {
        C9801m.m32346f(autoUpdateDialogPresenter, "this$0");
        autoUpdateDialogPresenter.crashReporter.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleNotNowClick$lambda-6, reason: not valid java name */
    public static final Boolean m40728handleNotNowClick$lambda6(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleNotNowClick$lambda-7, reason: not valid java name */
    public static final C11234e m40729handleNotNowClick$lambda7(AutoUpdateDialogPresenter autoUpdateDialogPresenter, View.LifecycleEvent lifecycleEvent) {
        C9801m.m32346f(autoUpdateDialogPresenter, "this$0");
        return autoUpdateDialogPresenter.view.notNowClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleNotNowClick$lambda-8, reason: not valid java name */
    public static final void m40730handleNotNowClick$lambda8(AutoUpdateDialogPresenter autoUpdateDialogPresenter, Void r1) {
        C9801m.m32346f(autoUpdateDialogPresenter, "this$0");
        autoUpdateDialogPresenter.view.dismissDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleNotNowClick$lambda-9, reason: not valid java name */
    public static final void m40731handleNotNowClick$lambda9(Void r0) {
    }

    private final void handleUpdateClick() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.autoupdate.i
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return AutoUpdateDialogPresenter.m40732handleUpdateClick$lambda0((View.LifecycleEvent) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.autoupdate.h
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return AutoUpdateDialogPresenter.m40733handleUpdateClick$lambda1(this.f8222f, (View.LifecycleEvent) obj);
            }
        }).m40095j0(Schedulers.m40658io()).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.autoupdate.j
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return AutoUpdateDialogPresenter.m40734handleUpdateClick$lambda2(this.f8224f, (Void) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.autoupdate.g
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AutoUpdateDialogPresenter.m40735handleUpdateClick$lambda3(this.f8221f, (Install) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.autoupdate.a
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AutoUpdateDialogPresenter.m40736handleUpdateClick$lambda4((Install) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.autoupdate.b
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AutoUpdateDialogPresenter.m40737handleUpdateClick$lambda5(this.f8216f, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleUpdateClick$lambda-0, reason: not valid java name */
    public static final Boolean m40732handleUpdateClick$lambda0(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleUpdateClick$lambda-1, reason: not valid java name */
    public static final C11234e m40733handleUpdateClick$lambda1(AutoUpdateDialogPresenter autoUpdateDialogPresenter, View.LifecycleEvent lifecycleEvent) {
        C9801m.m32346f(autoUpdateDialogPresenter, "this$0");
        return autoUpdateDialogPresenter.view.updateClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleUpdateClick$lambda-2, reason: not valid java name */
    public static final C11234e m40734handleUpdateClick$lambda2(AutoUpdateDialogPresenter autoUpdateDialogPresenter, Void r1) {
        C9801m.m32346f(autoUpdateDialogPresenter, "this$0");
        return autoUpdateDialogPresenter.autoUpdateManager.startUpdate(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleUpdateClick$lambda-3, reason: not valid java name */
    public static final void m40735handleUpdateClick$lambda3(AutoUpdateDialogPresenter autoUpdateDialogPresenter, Install install) {
        C9801m.m32346f(autoUpdateDialogPresenter, "this$0");
        autoUpdateDialogPresenter.view.dismissDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleUpdateClick$lambda-4, reason: not valid java name */
    public static final void m40736handleUpdateClick$lambda4(Install install) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleUpdateClick$lambda-5, reason: not valid java name */
    public static final void m40737handleUpdateClick$lambda5(AutoUpdateDialogPresenter autoUpdateDialogPresenter, Throwable th) {
        C9801m.m32346f(autoUpdateDialogPresenter, "this$0");
        autoUpdateDialogPresenter.crashReporter.log(th);
    }

    @Override // cm.aptoide.p092pt.presenter.Presenter
    public void present() {
        handleUpdateClick();
        handleNotNowClick();
    }
}
