package cm.aptoide.p092pt.account.view.magiclink;

import cm.aptoide.p092pt.presenter.Presenter;
import cm.aptoide.p092pt.presenter.View;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;

/* compiled from: CheckYourEmailPresenter.kt */
@Metadata(m32266d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m32267d2 = {"Lcm/aptoide/pt/account/view/magiclink/CheckYourEmailPresenter;", "Lcm/aptoide/pt/presenter/Presenter;", "view", "Lcm/aptoide/pt/account/view/magiclink/CheckYourEmailView;", "navigator", "Lcm/aptoide/pt/account/view/magiclink/CheckYourEmailNavigator;", "(Lcm/aptoide/pt/account/view/magiclink/CheckYourEmailView;Lcm/aptoide/pt/account/view/magiclink/CheckYourEmailNavigator;)V", "handleCheckEmailAppClick", HttpUrl.FRAGMENT_ENCODE_SET, "present", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class CheckYourEmailPresenter implements Presenter {
    private final CheckYourEmailNavigator navigator;
    private final CheckYourEmailView view;

    public CheckYourEmailPresenter(CheckYourEmailView checkYourEmailView, CheckYourEmailNavigator checkYourEmailNavigator) {
        C9801m.m32346f(checkYourEmailView, "view");
        C9801m.m32346f(checkYourEmailNavigator, "navigator");
        this.view = checkYourEmailView;
        this.navigator = checkYourEmailNavigator;
    }

    private final void handleCheckEmailAppClick() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.magiclink.e
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return CheckYourEmailPresenter.m40700handleCheckEmailAppClick$lambda0((View.LifecycleEvent) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.magiclink.d
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return CheckYourEmailPresenter.m40701handleCheckEmailAppClick$lambda2(this.f7324f, (View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.account.view.magiclink.b
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                CheckYourEmailPresenter.m40703handleCheckEmailAppClick$lambda3((Void) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.account.view.magiclink.a
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ((Throwable) obj).printStackTrace();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleCheckEmailAppClick$lambda-0, reason: not valid java name */
    public static final Boolean m40700handleCheckEmailAppClick$lambda0(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(View.LifecycleEvent.CREATE == lifecycleEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleCheckEmailAppClick$lambda-2, reason: not valid java name */
    public static final C11234e m40701handleCheckEmailAppClick$lambda2(final CheckYourEmailPresenter checkYourEmailPresenter, View.LifecycleEvent lifecycleEvent) {
        C9801m.m32346f(checkYourEmailPresenter, "this$0");
        return checkYourEmailPresenter.view.getCheckYourEmailClick().m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.account.view.magiclink.c
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                CheckYourEmailPresenter.m40702handleCheckEmailAppClick$lambda2$lambda1(this.f7323f, (Void) obj);
            }
        }).m40110s0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleCheckEmailAppClick$lambda-2$lambda-1, reason: not valid java name */
    public static final void m40702handleCheckEmailAppClick$lambda2$lambda1(CheckYourEmailPresenter checkYourEmailPresenter, Void r1) {
        C9801m.m32346f(checkYourEmailPresenter, "this$0");
        checkYourEmailPresenter.navigator.navigateToEmailApp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleCheckEmailAppClick$lambda-3, reason: not valid java name */
    public static final void m40703handleCheckEmailAppClick$lambda3(Void r0) {
    }

    @Override // cm.aptoide.p092pt.presenter.Presenter
    public void present() {
        handleCheckEmailAppClick();
    }
}
