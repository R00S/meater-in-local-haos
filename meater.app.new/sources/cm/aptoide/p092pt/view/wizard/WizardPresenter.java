package cm.aptoide.p092pt.view.wizard;

import androidx.viewpager.widget.ViewPager;
import cm.aptoide.accountmanager.Account;
import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.p092pt.account.AccountAnalytics;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.presenter.Presenter;
import cm.aptoide.p092pt.presenter.View;
import p456rx.C11231b;
import p456rx.C11234e;
import p456rx.p457l.p459c.C11250a;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public class WizardPresenter implements Presenter, ViewPager.InterfaceC0689j {
    private final AccountAnalytics accountAnalytics;
    private final AptoideAccountManager accountManager;
    private final CrashReport crashReport;
    private final WizardView view;

    public WizardPresenter(WizardView wizardView, AptoideAccountManager aptoideAccountManager, CrashReport crashReport, AccountAnalytics accountAnalytics) {
        this.view = wizardView;
        this.accountManager = aptoideAccountManager;
        this.crashReport = crashReport;
        this.accountAnalytics = accountAnalytics;
    }

    private C11231b createViewsAndButtons() {
        return this.accountManager.accountStatus().m40057E().m40085Z0().m39924p(C11250a.m40156b()).m39921j(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.wizard.i
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f12101f.m9118a((Account) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$createViewsAndButtons$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m9118a(Account account) {
        return this.view.createWizardAdapter(account.isLoggedIn());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$present$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m9119b(View.LifecycleEvent lifecycleEvent) {
        return createViewsAndButtons().m39974b(setupHandlers());
    }

    static /* synthetic */ void lambda$present$4(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$present$5, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9120c(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupHandlers$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9121d(Void r1) {
        this.view.skipWizard();
    }

    private C11234e<Void> setupHandlers() {
        return this.view.skipWizardClick().m40095j0(C11250a.m40156b()).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.view.wizard.h
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f12100f.m9121d((Void) obj);
            }
        });
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0689j
    public void onPageScrollStateChanged(int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0689j
    public void onPageScrolled(int i2, float f2, int i3) {
        this.view.handleColorTransitions(i2, f2, i3);
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0689j
    public void onPageSelected(int i2) {
        if (i2 == this.view.getCount() - 1) {
            this.accountAnalytics.enterAccountScreen(AccountAnalytics.AccountOrigins.WIZARD);
        }
        this.view.handleSelectedPage(i2);
    }

    @Override // cm.aptoide.p092pt.presenter.Presenter
    public void present() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.wizard.k
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj) == View.LifecycleEvent.CREATE);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.wizard.g
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f12099f.m9119b((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.view.wizard.f
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                WizardPresenter.lambda$present$4((Void) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.view.wizard.j
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f12102f.m9120c((Throwable) obj);
            }
        });
    }
}
