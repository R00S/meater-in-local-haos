package cm.aptoide.p092pt.feature;

import cm.aptoide.p092pt.presenter.Presenter;
import cm.aptoide.p092pt.presenter.View;
import cm.aptoide.p092pt.themes.NewFeatureDialogView;
import cm.aptoide.p092pt.themes.NewFeatureManager;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;

/* compiled from: NewFeatureDialogPresenter.kt */
@Metadata(m32266d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000e\u001a\u00020\fH\u0002J\b\u0010\u000f\u001a\u00020\fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, m32267d2 = {"Lcm/aptoide/pt/feature/NewFeatureDialogPresenter;", "Lcm/aptoide/pt/presenter/Presenter;", "view", "Lcm/aptoide/pt/themes/NewFeatureDialogView;", "newFeatureManager", "Lcm/aptoide/pt/themes/NewFeatureManager;", "newFeatureListener", "Lcm/aptoide/pt/feature/NewFeatureListener;", "(Lcm/aptoide/pt/themes/NewFeatureDialogView;Lcm/aptoide/pt/themes/NewFeatureManager;Lcm/aptoide/pt/feature/NewFeatureListener;)V", "getView", "()Lcm/aptoide/pt/themes/NewFeatureDialogView;", "handleDialogShown", HttpUrl.FRAGMENT_ENCODE_SET, "handleDismissClick", "handleTurnItOnClick", "present", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class NewFeatureDialogPresenter implements Presenter {
    private final NewFeatureListener newFeatureListener;
    private final NewFeatureManager newFeatureManager;
    private final NewFeatureDialogView view;

    public NewFeatureDialogPresenter(NewFeatureDialogView newFeatureDialogView, NewFeatureManager newFeatureManager, NewFeatureListener newFeatureListener) {
        C9801m.m32346f(newFeatureDialogView, "view");
        C9801m.m32346f(newFeatureManager, "newFeatureManager");
        C9801m.m32346f(newFeatureListener, "newFeatureListener");
        this.view = newFeatureDialogView;
        this.newFeatureManager = newFeatureManager;
        this.newFeatureListener = newFeatureListener;
    }

    private final void handleDialogShown() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.feature.i
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return NewFeatureDialogPresenter.m40824handleDialogShown$lambda0((View.LifecycleEvent) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.feature.c
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                NewFeatureDialogPresenter.m40825handleDialogShown$lambda1(this.f9308f, (View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.feature.k
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                NewFeatureDialogPresenter.m40826handleDialogShown$lambda2((View.LifecycleEvent) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.feature.n
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                NewFeatureDialogPresenter.m40827handleDialogShown$lambda3((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleDialogShown$lambda-0, reason: not valid java name */
    public static final Boolean m40824handleDialogShown$lambda0(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.RESUME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleDialogShown$lambda-1, reason: not valid java name */
    public static final void m40825handleDialogShown$lambda1(NewFeatureDialogPresenter newFeatureDialogPresenter, View.LifecycleEvent lifecycleEvent) {
        C9801m.m32346f(newFeatureDialogPresenter, "this$0");
        newFeatureDialogPresenter.newFeatureManager.setFeatureAsShown();
        newFeatureDialogPresenter.newFeatureManager.unscheduleNotification();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleDialogShown$lambda-2, reason: not valid java name */
    public static final void m40826handleDialogShown$lambda2(View.LifecycleEvent lifecycleEvent) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleDialogShown$lambda-3, reason: not valid java name */
    public static final void m40827handleDialogShown$lambda3(Throwable th) {
    }

    private final void handleDismissClick() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.feature.e
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return NewFeatureDialogPresenter.m40832handleDismissClick$lambda9((View.LifecycleEvent) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.feature.l
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return NewFeatureDialogPresenter.m40828handleDismissClick$lambda10(this.f9317f, (View.LifecycleEvent) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.feature.a
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                NewFeatureDialogPresenter.m40829handleDismissClick$lambda11(this.f9306f, (Void) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.feature.m
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                NewFeatureDialogPresenter.m40830handleDismissClick$lambda12((Void) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.feature.d
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                NewFeatureDialogPresenter.m40831handleDismissClick$lambda13((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleDismissClick$lambda-10, reason: not valid java name */
    public static final C11234e m40828handleDismissClick$lambda10(NewFeatureDialogPresenter newFeatureDialogPresenter, View.LifecycleEvent lifecycleEvent) {
        C9801m.m32346f(newFeatureDialogPresenter, "this$0");
        return newFeatureDialogPresenter.view.clickDismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleDismissClick$lambda-11, reason: not valid java name */
    public static final void m40829handleDismissClick$lambda11(NewFeatureDialogPresenter newFeatureDialogPresenter, Void r1) {
        C9801m.m32346f(newFeatureDialogPresenter, "this$0");
        newFeatureDialogPresenter.view.dismissView();
        newFeatureDialogPresenter.newFeatureListener.onDismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleDismissClick$lambda-12, reason: not valid java name */
    public static final void m40830handleDismissClick$lambda12(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleDismissClick$lambda-13, reason: not valid java name */
    public static final void m40831handleDismissClick$lambda13(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleDismissClick$lambda-9, reason: not valid java name */
    public static final Boolean m40832handleDismissClick$lambda9(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    private final void handleTurnItOnClick() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.feature.h
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return NewFeatureDialogPresenter.m40833handleTurnItOnClick$lambda4((View.LifecycleEvent) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.feature.j
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return NewFeatureDialogPresenter.m40834handleTurnItOnClick$lambda5(this.f9315f, (View.LifecycleEvent) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.feature.g
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                NewFeatureDialogPresenter.m40835handleTurnItOnClick$lambda6(this.f9312f, (Void) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.feature.f
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                NewFeatureDialogPresenter.m40836handleTurnItOnClick$lambda7((Void) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.feature.b
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                NewFeatureDialogPresenter.m40837handleTurnItOnClick$lambda8((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleTurnItOnClick$lambda-4, reason: not valid java name */
    public static final Boolean m40833handleTurnItOnClick$lambda4(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleTurnItOnClick$lambda-5, reason: not valid java name */
    public static final C11234e m40834handleTurnItOnClick$lambda5(NewFeatureDialogPresenter newFeatureDialogPresenter, View.LifecycleEvent lifecycleEvent) {
        C9801m.m32346f(newFeatureDialogPresenter, "this$0");
        return newFeatureDialogPresenter.view.clickTurnItOn();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleTurnItOnClick$lambda-6, reason: not valid java name */
    public static final void m40835handleTurnItOnClick$lambda6(NewFeatureDialogPresenter newFeatureDialogPresenter, Void r1) {
        C9801m.m32346f(newFeatureDialogPresenter, "this$0");
        newFeatureDialogPresenter.view.dismissView();
        newFeatureDialogPresenter.newFeatureListener.onActivateFeature();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleTurnItOnClick$lambda-7, reason: not valid java name */
    public static final void m40836handleTurnItOnClick$lambda7(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleTurnItOnClick$lambda-8, reason: not valid java name */
    public static final void m40837handleTurnItOnClick$lambda8(Throwable th) {
    }

    public final NewFeatureDialogView getView() {
        return this.view;
    }

    @Override // cm.aptoide.p092pt.presenter.Presenter
    public void present() {
        handleDialogShown();
        handleDismissClick();
        handleTurnItOnClick();
    }
}
