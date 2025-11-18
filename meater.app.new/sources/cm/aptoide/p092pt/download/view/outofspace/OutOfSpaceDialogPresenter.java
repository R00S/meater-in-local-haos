package cm.aptoide.p092pt.download.view.outofspace;

import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.presenter.Presenter;
import cm.aptoide.p092pt.presenter.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;
import p456rx.AbstractC11243h;
import p456rx.C11234e;
import p456rx.Single;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;

/* compiled from: OutOfSpaceDialogPresenter.kt */
@Metadata(m32266d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0011\u001a\u00020\u000fH\u0002J\b\u0010\u0012\u001a\u00020\u000fH\u0002J\b\u0010\u0013\u001a\u00020\u000fH\u0016J\b\u0010\u0014\u001a\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m32267d2 = {"Lcm/aptoide/pt/download/view/outofspace/OutOfSpaceDialogPresenter;", "Lcm/aptoide/pt/presenter/Presenter;", "view", "Lcm/aptoide/pt/download/view/outofspace/OutOfSpaceDialogView;", "crashReporter", "Lcm/aptoide/pt/crashreports/CrashReport;", "viewScheduler", "Lrx/Scheduler;", "ioScheduler", "outOfSpaceManager", "Lcm/aptoide/pt/download/view/outofspace/OutOfSpaceManager;", "outOfSpaceNavigator", "Lcm/aptoide/pt/download/view/outofspace/OutOfSpaceNavigator;", "(Lcm/aptoide/pt/download/view/outofspace/OutOfSpaceDialogView;Lcm/aptoide/pt/crashreports/CrashReport;Lrx/Scheduler;Lrx/Scheduler;Lcm/aptoide/pt/download/view/outofspace/OutOfSpaceManager;Lcm/aptoide/pt/download/view/outofspace/OutOfSpaceNavigator;)V", "handleDismissDialogButtonClick", HttpUrl.FRAGMENT_ENCODE_SET, "handleUninstalledEnoughApps", "loadAppsToUninstall", "loadRequiredStorageSize", "present", "uninstallApp", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class OutOfSpaceDialogPresenter implements Presenter {
    private final CrashReport crashReporter;
    private final AbstractC11243h ioScheduler;
    private final OutOfSpaceManager outOfSpaceManager;
    private final OutOfSpaceNavigator outOfSpaceNavigator;
    private final OutOfSpaceDialogView view;
    private final AbstractC11243h viewScheduler;

    public OutOfSpaceDialogPresenter(OutOfSpaceDialogView outOfSpaceDialogView, CrashReport crashReport, AbstractC11243h abstractC11243h, AbstractC11243h abstractC11243h2, OutOfSpaceManager outOfSpaceManager, OutOfSpaceNavigator outOfSpaceNavigator) {
        C9801m.m32346f(outOfSpaceDialogView, "view");
        C9801m.m32346f(crashReport, "crashReporter");
        C9801m.m32346f(abstractC11243h, "viewScheduler");
        C9801m.m32346f(abstractC11243h2, "ioScheduler");
        C9801m.m32346f(outOfSpaceManager, "outOfSpaceManager");
        C9801m.m32346f(outOfSpaceNavigator, "outOfSpaceNavigator");
        this.view = outOfSpaceDialogView;
        this.crashReporter = crashReport;
        this.viewScheduler = abstractC11243h;
        this.ioScheduler = abstractC11243h2;
        this.outOfSpaceManager = outOfSpaceManager;
        this.outOfSpaceNavigator = outOfSpaceNavigator;
    }

    private final void handleDismissDialogButtonClick() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.download.view.outofspace.g
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return OutOfSpaceDialogPresenter.m40789handleDismissDialogButtonClick$lambda10((View.LifecycleEvent) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.download.view.outofspace.k
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return OutOfSpaceDialogPresenter.m40790handleDismissDialogButtonClick$lambda11(this.f8731f, (View.LifecycleEvent) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.download.view.outofspace.d
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                OutOfSpaceDialogPresenter.m40791handleDismissDialogButtonClick$lambda12(this.f8717f, (Void) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.download.view.outofspace.z
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                OutOfSpaceDialogPresenter.m40792handleDismissDialogButtonClick$lambda13((Void) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.download.view.outofspace.m
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                OutOfSpaceDialogPresenter.m40793handleDismissDialogButtonClick$lambda14(this.f8733f, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleDismissDialogButtonClick$lambda-10, reason: not valid java name */
    public static final Boolean m40789handleDismissDialogButtonClick$lambda10(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleDismissDialogButtonClick$lambda-11, reason: not valid java name */
    public static final C11234e m40790handleDismissDialogButtonClick$lambda11(OutOfSpaceDialogPresenter outOfSpaceDialogPresenter, View.LifecycleEvent lifecycleEvent) {
        C9801m.m32346f(outOfSpaceDialogPresenter, "this$0");
        return outOfSpaceDialogPresenter.view.dismissDialogClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleDismissDialogButtonClick$lambda-12, reason: not valid java name */
    public static final void m40791handleDismissDialogButtonClick$lambda12(OutOfSpaceDialogPresenter outOfSpaceDialogPresenter, Void r1) {
        C9801m.m32346f(outOfSpaceDialogPresenter, "this$0");
        outOfSpaceDialogPresenter.view.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleDismissDialogButtonClick$lambda-13, reason: not valid java name */
    public static final void m40792handleDismissDialogButtonClick$lambda13(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleDismissDialogButtonClick$lambda-14, reason: not valid java name */
    public static final void m40793handleDismissDialogButtonClick$lambda14(OutOfSpaceDialogPresenter outOfSpaceDialogPresenter, Throwable th) {
        C9801m.m32346f(outOfSpaceDialogPresenter, "this$0");
        outOfSpaceDialogPresenter.crashReporter.log(th);
    }

    private final void handleUninstalledEnoughApps() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.download.view.outofspace.b
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return OutOfSpaceDialogPresenter.m40794handleUninstalledEnoughApps$lambda5((View.LifecycleEvent) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.download.view.outofspace.f
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return OutOfSpaceDialogPresenter.m40795handleUninstalledEnoughApps$lambda6(this.f8722f, (View.LifecycleEvent) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.download.view.outofspace.t
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                OutOfSpaceDialogPresenter.m40796handleUninstalledEnoughApps$lambda7(this.f8740f, (Void) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.download.view.outofspace.a0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                OutOfSpaceDialogPresenter.m40797handleUninstalledEnoughApps$lambda8((Void) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.download.view.outofspace.n
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                OutOfSpaceDialogPresenter.m40798handleUninstalledEnoughApps$lambda9(this.f8734f, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleUninstalledEnoughApps$lambda-5, reason: not valid java name */
    public static final Boolean m40794handleUninstalledEnoughApps$lambda5(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleUninstalledEnoughApps$lambda-6, reason: not valid java name */
    public static final C11234e m40795handleUninstalledEnoughApps$lambda6(OutOfSpaceDialogPresenter outOfSpaceDialogPresenter, View.LifecycleEvent lifecycleEvent) {
        C9801m.m32346f(outOfSpaceDialogPresenter, "this$0");
        return outOfSpaceDialogPresenter.outOfSpaceManager.uninstalledEnoughApps();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleUninstalledEnoughApps$lambda-7, reason: not valid java name */
    public static final void m40796handleUninstalledEnoughApps$lambda7(OutOfSpaceDialogPresenter outOfSpaceDialogPresenter, Void r1) {
        C9801m.m32346f(outOfSpaceDialogPresenter, "this$0");
        outOfSpaceDialogPresenter.outOfSpaceNavigator.clearedEnoughSpace();
        outOfSpaceDialogPresenter.view.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleUninstalledEnoughApps$lambda-8, reason: not valid java name */
    public static final void m40797handleUninstalledEnoughApps$lambda8(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleUninstalledEnoughApps$lambda-9, reason: not valid java name */
    public static final void m40798handleUninstalledEnoughApps$lambda9(OutOfSpaceDialogPresenter outOfSpaceDialogPresenter, Throwable th) {
        C9801m.m32346f(outOfSpaceDialogPresenter, "this$0");
        outOfSpaceDialogPresenter.crashReporter.log(th);
    }

    private final void loadAppsToUninstall() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.download.view.outofspace.h
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return OutOfSpaceDialogPresenter.m40799loadAppsToUninstall$lambda21((View.LifecycleEvent) obj);
            }
        }).m40095j0(this.ioScheduler).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.download.view.outofspace.p
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return OutOfSpaceDialogPresenter.m40800loadAppsToUninstall$lambda22(this.f8736f, (View.LifecycleEvent) obj);
            }
        }).m40095j0(this.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.download.view.outofspace.e
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                OutOfSpaceDialogPresenter.m40801loadAppsToUninstall$lambda23(this.f8719f, (List) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.download.view.outofspace.u
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                OutOfSpaceDialogPresenter.m40802loadAppsToUninstall$lambda24((List) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.download.view.outofspace.s
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                OutOfSpaceDialogPresenter.m40803loadAppsToUninstall$lambda25(this.f8739f, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadAppsToUninstall$lambda-21, reason: not valid java name */
    public static final Boolean m40799loadAppsToUninstall$lambda21(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadAppsToUninstall$lambda-22, reason: not valid java name */
    public static final C11234e m40800loadAppsToUninstall$lambda22(OutOfSpaceDialogPresenter outOfSpaceDialogPresenter, View.LifecycleEvent lifecycleEvent) {
        C9801m.m32346f(outOfSpaceDialogPresenter, "this$0");
        return outOfSpaceDialogPresenter.outOfSpaceManager.getInstalledApps();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadAppsToUninstall$lambda-23, reason: not valid java name */
    public static final void m40801loadAppsToUninstall$lambda23(OutOfSpaceDialogPresenter outOfSpaceDialogPresenter, List list) {
        C9801m.m32346f(outOfSpaceDialogPresenter, "this$0");
        C9801m.m32345e(list, "appsList");
        if (!list.isEmpty()) {
            outOfSpaceDialogPresenter.view.showInstalledApps(list);
        } else {
            outOfSpaceDialogPresenter.view.showGeneralOutOfSpaceError();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadAppsToUninstall$lambda-24, reason: not valid java name */
    public static final void m40802loadAppsToUninstall$lambda24(List list) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadAppsToUninstall$lambda-25, reason: not valid java name */
    public static final void m40803loadAppsToUninstall$lambda25(OutOfSpaceDialogPresenter outOfSpaceDialogPresenter, Throwable th) {
        C9801m.m32346f(outOfSpaceDialogPresenter, "this$0");
        outOfSpaceDialogPresenter.crashReporter.log(th);
    }

    private final void loadRequiredStorageSize() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.download.view.outofspace.x
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return OutOfSpaceDialogPresenter.m40804loadRequiredStorageSize$lambda0((View.LifecycleEvent) obj);
            }
        }).m40070L(new InterfaceC11256e() { // from class: cm.aptoide.pt.download.view.outofspace.j
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return OutOfSpaceDialogPresenter.m40805loadRequiredStorageSize$lambda1(this.f8730f, (View.LifecycleEvent) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.download.view.outofspace.y
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                OutOfSpaceDialogPresenter.m40806loadRequiredStorageSize$lambda2(this.f8745f, (Long) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.download.view.outofspace.v
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                OutOfSpaceDialogPresenter.m40807loadRequiredStorageSize$lambda3((Long) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.download.view.outofspace.r
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                OutOfSpaceDialogPresenter.m40808loadRequiredStorageSize$lambda4(this.f8738f, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadRequiredStorageSize$lambda-0, reason: not valid java name */
    public static final Boolean m40804loadRequiredStorageSize$lambda0(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadRequiredStorageSize$lambda-1, reason: not valid java name */
    public static final Single m40805loadRequiredStorageSize$lambda1(OutOfSpaceDialogPresenter outOfSpaceDialogPresenter, View.LifecycleEvent lifecycleEvent) {
        C9801m.m32346f(outOfSpaceDialogPresenter, "this$0");
        return outOfSpaceDialogPresenter.outOfSpaceManager.getRequiredStorageSize();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadRequiredStorageSize$lambda-2, reason: not valid java name */
    public static final void m40806loadRequiredStorageSize$lambda2(OutOfSpaceDialogPresenter outOfSpaceDialogPresenter, Long l) {
        C9801m.m32346f(outOfSpaceDialogPresenter, "this$0");
        OutOfSpaceDialogView outOfSpaceDialogView = outOfSpaceDialogPresenter.view;
        C9801m.m32345e(l, "it");
        outOfSpaceDialogView.requiredSpaceToInstall(l.longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadRequiredStorageSize$lambda-3, reason: not valid java name */
    public static final void m40807loadRequiredStorageSize$lambda3(Long l) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadRequiredStorageSize$lambda-4, reason: not valid java name */
    public static final void m40808loadRequiredStorageSize$lambda4(OutOfSpaceDialogPresenter outOfSpaceDialogPresenter, Throwable th) {
        C9801m.m32346f(outOfSpaceDialogPresenter, "this$0");
        outOfSpaceDialogPresenter.crashReporter.log(th);
    }

    private final void uninstallApp() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.download.view.outofspace.l
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return OutOfSpaceDialogPresenter.m40809uninstallApp$lambda15((View.LifecycleEvent) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.download.view.outofspace.c
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return OutOfSpaceDialogPresenter.m40810uninstallApp$lambda16(this.f8715f, (View.LifecycleEvent) obj);
            }
        }).m40070L(new InterfaceC11256e() { // from class: cm.aptoide.pt.download.view.outofspace.i
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return OutOfSpaceDialogPresenter.m40811uninstallApp$lambda17(this.f8729f, (String) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.download.view.outofspace.o
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                OutOfSpaceDialogPresenter.m40812uninstallApp$lambda18(this.f8735f, (Long) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.download.view.outofspace.q
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                OutOfSpaceDialogPresenter.m40813uninstallApp$lambda19((Long) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.download.view.outofspace.w
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                OutOfSpaceDialogPresenter.m40814uninstallApp$lambda20(this.f8743f, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uninstallApp$lambda-15, reason: not valid java name */
    public static final Boolean m40809uninstallApp$lambda15(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uninstallApp$lambda-16, reason: not valid java name */
    public static final C11234e m40810uninstallApp$lambda16(OutOfSpaceDialogPresenter outOfSpaceDialogPresenter, View.LifecycleEvent lifecycleEvent) {
        C9801m.m32346f(outOfSpaceDialogPresenter, "this$0");
        return outOfSpaceDialogPresenter.view.uninstallClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uninstallApp$lambda-17, reason: not valid java name */
    public static final Single m40811uninstallApp$lambda17(OutOfSpaceDialogPresenter outOfSpaceDialogPresenter, String str) {
        C9801m.m32346f(outOfSpaceDialogPresenter, "this$0");
        return outOfSpaceDialogPresenter.outOfSpaceManager.uninstallApp(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uninstallApp$lambda-18, reason: not valid java name */
    public static final void m40812uninstallApp$lambda18(OutOfSpaceDialogPresenter outOfSpaceDialogPresenter, Long l) {
        C9801m.m32346f(outOfSpaceDialogPresenter, "this$0");
        OutOfSpaceDialogView outOfSpaceDialogView = outOfSpaceDialogPresenter.view;
        C9801m.m32345e(l, "removedAppSize");
        outOfSpaceDialogView.requiredSpaceToInstall(l.longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uninstallApp$lambda-19, reason: not valid java name */
    public static final void m40813uninstallApp$lambda19(Long l) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uninstallApp$lambda-20, reason: not valid java name */
    public static final void m40814uninstallApp$lambda20(OutOfSpaceDialogPresenter outOfSpaceDialogPresenter, Throwable th) {
        C9801m.m32346f(outOfSpaceDialogPresenter, "this$0");
        outOfSpaceDialogPresenter.crashReporter.log(th);
    }

    @Override // cm.aptoide.p092pt.presenter.Presenter
    public void present() {
        loadAppsToUninstall();
        loadRequiredStorageSize();
        uninstallApp();
        handleDismissDialogButtonClick();
        handleUninstalledEnoughApps();
    }
}
