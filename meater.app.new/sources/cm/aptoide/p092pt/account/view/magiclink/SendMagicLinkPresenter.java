package cm.aptoide.p092pt.account.view.magiclink;

import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.p092pt.account.AgentPersistence;
import cm.aptoide.p092pt.presenter.Presenter;
import cm.aptoide.p092pt.presenter.View;
import com.aptoide.authentication.model.CodeAuth;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;
import p456rx.AbstractC11243h;
import p456rx.C11234e;
import p456rx.Single;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;

/* compiled from: SendMagicLinkPresenter.kt */
@Metadata(m32266d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0010\u001a\u00020\u000eH\u0002J\b\u0010\u0011\u001a\u00020\u000eH\u0016J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m32267d2 = {"Lcm/aptoide/pt/account/view/magiclink/SendMagicLinkPresenter;", "Lcm/aptoide/pt/presenter/Presenter;", "view", "Lcm/aptoide/pt/account/view/magiclink/MagicLinkView;", "accountManager", "Lcm/aptoide/accountmanager/AptoideAccountManager;", "navigator", "Lcm/aptoide/pt/account/view/magiclink/SendMagicLinkNavigator;", "viewScheduler", "Lrx/Scheduler;", "agentPersistence", "Lcm/aptoide/pt/account/AgentPersistence;", "(Lcm/aptoide/pt/account/view/magiclink/MagicLinkView;Lcm/aptoide/accountmanager/AptoideAccountManager;Lcm/aptoide/pt/account/view/magiclink/SendMagicLinkNavigator;Lrx/Scheduler;Lcm/aptoide/pt/account/AgentPersistence;)V", "handleEmailChangeEvents", HttpUrl.FRAGMENT_ENCODE_SET, "handleSecureLoginTextClick", "handleSendMagicLinkClick", "present", "validateEmail", "Lrx/Observable;", HttpUrl.FRAGMENT_ENCODE_SET, "email", HttpUrl.FRAGMENT_ENCODE_SET, "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class SendMagicLinkPresenter implements Presenter {
    private final AptoideAccountManager accountManager;
    private final AgentPersistence agentPersistence;
    private final SendMagicLinkNavigator navigator;
    private final MagicLinkView view;
    private final AbstractC11243h viewScheduler;

    public SendMagicLinkPresenter(MagicLinkView magicLinkView, AptoideAccountManager aptoideAccountManager, SendMagicLinkNavigator sendMagicLinkNavigator, AbstractC11243h abstractC11243h, AgentPersistence agentPersistence) {
        C9801m.m32346f(magicLinkView, "view");
        C9801m.m32346f(aptoideAccountManager, "accountManager");
        C9801m.m32346f(sendMagicLinkNavigator, "navigator");
        C9801m.m32346f(abstractC11243h, "viewScheduler");
        C9801m.m32346f(agentPersistence, "agentPersistence");
        this.view = magicLinkView;
        this.accountManager = aptoideAccountManager;
        this.navigator = sendMagicLinkNavigator;
        this.viewScheduler = abstractC11243h;
        this.agentPersistence = agentPersistence;
    }

    private final void handleEmailChangeEvents() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.magiclink.v
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return SendMagicLinkPresenter.m40705handleEmailChangeEvents$lambda5((View.LifecycleEvent) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.magiclink.w
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return SendMagicLinkPresenter.m40706handleEmailChangeEvents$lambda7(this.f7345f, (View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.account.view.magiclink.u
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                SendMagicLinkPresenter.m40708handleEmailChangeEvents$lambda8((String) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.account.view.magiclink.n
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ((Throwable) obj).printStackTrace();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleEmailChangeEvents$lambda-5, reason: not valid java name */
    public static final Boolean m40705handleEmailChangeEvents$lambda5(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(View.LifecycleEvent.CREATE == lifecycleEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleEmailChangeEvents$lambda-7, reason: not valid java name */
    public static final C11234e m40706handleEmailChangeEvents$lambda7(final SendMagicLinkPresenter sendMagicLinkPresenter, View.LifecycleEvent lifecycleEvent) {
        C9801m.m32346f(sendMagicLinkPresenter, "this$0");
        return sendMagicLinkPresenter.view.getEmailTextChangeEvent().m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.account.view.magiclink.t
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                SendMagicLinkPresenter.m40707handleEmailChangeEvents$lambda7$lambda6(this.f7342f, (String) obj);
            }
        }).m40110s0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleEmailChangeEvents$lambda-7$lambda-6, reason: not valid java name */
    public static final void m40707handleEmailChangeEvents$lambda7$lambda6(SendMagicLinkPresenter sendMagicLinkPresenter, String str) {
        C9801m.m32346f(sendMagicLinkPresenter, "this$0");
        sendMagicLinkPresenter.view.removeTextFieldError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleEmailChangeEvents$lambda-8, reason: not valid java name */
    public static final void m40708handleEmailChangeEvents$lambda8(String str) {
    }

    private final void handleSecureLoginTextClick() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.magiclink.j
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return SendMagicLinkPresenter.m40710handleSecureLoginTextClick$lambda0((View.LifecycleEvent) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.magiclink.m
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return SendMagicLinkPresenter.m40711handleSecureLoginTextClick$lambda2(this.f7333f, (View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.account.view.magiclink.s
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                SendMagicLinkPresenter.m40713handleSecureLoginTextClick$lambda3((Void) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.account.view.magiclink.h
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ((Throwable) obj).printStackTrace();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleSecureLoginTextClick$lambda-0, reason: not valid java name */
    public static final Boolean m40710handleSecureLoginTextClick$lambda0(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(View.LifecycleEvent.CREATE == lifecycleEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleSecureLoginTextClick$lambda-2, reason: not valid java name */
    public static final C11234e m40711handleSecureLoginTextClick$lambda2(final SendMagicLinkPresenter sendMagicLinkPresenter, View.LifecycleEvent lifecycleEvent) {
        C9801m.m32346f(sendMagicLinkPresenter, "this$0");
        return sendMagicLinkPresenter.view.getSecureLoginTextClick().m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.account.view.magiclink.f
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                SendMagicLinkPresenter.m40712handleSecureLoginTextClick$lambda2$lambda1(this.f7326f, (Void) obj);
            }
        }).m40110s0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleSecureLoginTextClick$lambda-2$lambda-1, reason: not valid java name */
    public static final void m40712handleSecureLoginTextClick$lambda2$lambda1(SendMagicLinkPresenter sendMagicLinkPresenter, Void r1) {
        C9801m.m32346f(sendMagicLinkPresenter, "this$0");
        sendMagicLinkPresenter.navigator.navigateToBlog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleSecureLoginTextClick$lambda-3, reason: not valid java name */
    public static final void m40713handleSecureLoginTextClick$lambda3(Void r0) {
    }

    private final void handleSendMagicLinkClick() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.magiclink.g
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return SendMagicLinkPresenter.m40715handleSendMagicLinkClick$lambda10((View.LifecycleEvent) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.magiclink.l
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return SendMagicLinkPresenter.m40716handleSendMagicLinkClick$lambda17(this.f7332f, (View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.account.view.magiclink.x
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                SendMagicLinkPresenter.m40723handleSendMagicLinkClick$lambda18((CodeAuth) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.account.view.magiclink.z
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ((Throwable) obj).printStackTrace();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleSendMagicLinkClick$lambda-10, reason: not valid java name */
    public static final Boolean m40715handleSendMagicLinkClick$lambda10(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(View.LifecycleEvent.CREATE == lifecycleEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleSendMagicLinkClick$lambda-17, reason: not valid java name */
    public static final C11234e m40716handleSendMagicLinkClick$lambda17(final SendMagicLinkPresenter sendMagicLinkPresenter, View.LifecycleEvent lifecycleEvent) {
        C9801m.m32346f(sendMagicLinkPresenter, "this$0");
        return sendMagicLinkPresenter.view.getMagicLinkClick().m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.magiclink.p
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return SendMagicLinkPresenter.m40717handleSendMagicLinkClick$lambda17$lambda16(this.f7336f, (String) obj);
            }
        }).m40110s0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleSendMagicLinkClick$lambda-17$lambda-16, reason: not valid java name */
    public static final C11234e m40717handleSendMagicLinkClick$lambda17$lambda16(final SendMagicLinkPresenter sendMagicLinkPresenter, final String str) {
        C9801m.m32346f(sendMagicLinkPresenter, "this$0");
        C9801m.m32345e(str, "email");
        return sendMagicLinkPresenter.validateEmail(str).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.magiclink.y
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return SendMagicLinkPresenter.m40718handleSendMagicLinkClick$lambda17$lambda16$lambda11((Boolean) obj);
            }
        }).m40095j0(sendMagicLinkPresenter.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.account.view.magiclink.i
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                SendMagicLinkPresenter.m40719handleSendMagicLinkClick$lambda17$lambda16$lambda12(this.f7329f, (Boolean) obj);
            }
        }).m40070L(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.magiclink.r
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return SendMagicLinkPresenter.m40720handleSendMagicLinkClick$lambda17$lambda16$lambda14(this.f7339f, str, (Boolean) obj);
            }
        }).m40095j0(sendMagicLinkPresenter.viewScheduler).m40117w(new InterfaceC11253b() { // from class: cm.aptoide.pt.account.view.magiclink.k
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                SendMagicLinkPresenter.m40722handleSendMagicLinkClick$lambda17$lambda16$lambda15(this.f7331f, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleSendMagicLinkClick$lambda-17$lambda-16$lambda-11, reason: not valid java name */
    public static final Boolean m40718handleSendMagicLinkClick$lambda17$lambda16$lambda11(Boolean bool) {
        return bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleSendMagicLinkClick$lambda-17$lambda-16$lambda-12, reason: not valid java name */
    public static final void m40719handleSendMagicLinkClick$lambda17$lambda16$lambda12(SendMagicLinkPresenter sendMagicLinkPresenter, Boolean bool) {
        C9801m.m32346f(sendMagicLinkPresenter, "this$0");
        sendMagicLinkPresenter.view.setLoadingScreen();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleSendMagicLinkClick$lambda-17$lambda-16$lambda-14, reason: not valid java name */
    public static final Single m40720handleSendMagicLinkClick$lambda17$lambda16$lambda14(final SendMagicLinkPresenter sendMagicLinkPresenter, final String str, Boolean bool) {
        C9801m.m32346f(sendMagicLinkPresenter, "this$0");
        return sendMagicLinkPresenter.accountManager.sendMagicLink(str).m39924p(sendMagicLinkPresenter.viewScheduler).m39919g(new InterfaceC11253b() { // from class: cm.aptoide.pt.account.view.magiclink.q
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                SendMagicLinkPresenter.m40721handleSendMagicLinkClick$lambda17$lambda16$lambda14$lambda13(this.f7337f, str, (CodeAuth) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleSendMagicLinkClick$lambda-17$lambda-16$lambda-14$lambda-13, reason: not valid java name */
    public static final void m40721handleSendMagicLinkClick$lambda17$lambda16$lambda14$lambda13(SendMagicLinkPresenter sendMagicLinkPresenter, String str, CodeAuth codeAuth) {
        C9801m.m32346f(sendMagicLinkPresenter, "this$0");
        sendMagicLinkPresenter.agentPersistence.persistAgent(codeAuth.getAgent(), codeAuth.getState(), codeAuth.getEmail());
        sendMagicLinkPresenter.view.removeLoadingScreen();
        SendMagicLinkNavigator sendMagicLinkNavigator = sendMagicLinkPresenter.navigator;
        C9801m.m32345e(str, "email");
        sendMagicLinkNavigator.navigateToCheckYourEmail(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleSendMagicLinkClick$lambda-17$lambda-16$lambda-15, reason: not valid java name */
    public static final void m40722handleSendMagicLinkClick$lambda17$lambda16$lambda15(SendMagicLinkPresenter sendMagicLinkPresenter, Throwable th) {
        C9801m.m32346f(sendMagicLinkPresenter, "this$0");
        sendMagicLinkPresenter.view.removeLoadingScreen();
        sendMagicLinkPresenter.view.showUnknownError();
        th.printStackTrace();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleSendMagicLinkClick$lambda-18, reason: not valid java name */
    public static final void m40723handleSendMagicLinkClick$lambda18(CodeAuth codeAuth) {
    }

    private final C11234e<Boolean> validateEmail(String str) {
        C11234e<Boolean> c11234eM40119x = this.accountManager.isEmailValid(str).m39915A().m40095j0(this.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.account.view.magiclink.o
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                SendMagicLinkPresenter.m40725validateEmail$lambda20(this.f7335f, (Boolean) obj);
            }
        });
        C9801m.m32345e(c11234eM40119x, "accountManager.isEmailVa…r()\n          }\n        }");
        return c11234eM40119x;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: validateEmail$lambda-20, reason: not valid java name */
    public static final void m40725validateEmail$lambda20(SendMagicLinkPresenter sendMagicLinkPresenter, Boolean bool) {
        C9801m.m32346f(sendMagicLinkPresenter, "this$0");
        if (bool.booleanValue()) {
            return;
        }
        sendMagicLinkPresenter.view.setEmailInvalidError();
    }

    @Override // cm.aptoide.p092pt.presenter.Presenter
    public void present() {
        handleSendMagicLinkClick();
        handleEmailChangeEvents();
        handleSecureLoginTextClick();
    }
}
