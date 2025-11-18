package cm.aptoide.p092pt.store.view.p104my;

import cm.aptoide.accountmanager.Account;
import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.p092pt.presenter.Presenter;
import cm.aptoide.p092pt.presenter.View;
import p456rx.AbstractC11243h;
import p456rx.C11234e;
import p456rx.exceptions.OnErrorNotImplementedException;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public class MyStoresPresenter implements Presenter {
    private final AptoideAccountManager accountManager;
    private final MyStoresNavigator myStoresNavigator;
    private final MyStoresView view;
    private final AbstractC11243h viewScheduler;

    public MyStoresPresenter(MyStoresView myStoresView, AbstractC11243h abstractC11243h, AptoideAccountManager aptoideAccountManager, MyStoresNavigator myStoresNavigator) {
        this.view = myStoresView;
        this.viewScheduler = abstractC11243h;
        this.accountManager = aptoideAccountManager;
        this.myStoresNavigator = myStoresNavigator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getUserAvatar, reason: merged with bridge method [inline-methods] */
    public C11234e<String> m8839f(Account account) {
        return C11234e.m40025S((account == null || !account.isLoggedIn()) ? null : account.getAvatar());
    }

    private void handleBottomNavigationEvent() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.store.view.my.h
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.store.view.my.k
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11380f.m8835b((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.store.view.my.j
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                MyStoresPresenter.lambda$handleBottomNavigationEvent$14((Integer) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.store.view.my.w
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                MyStoresPresenter.lambda$handleBottomNavigationEvent$15((Throwable) obj);
                throw null;
            }
        });
    }

    private void handleUserImageClick() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.store.view.my.o
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.store.view.my.p
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11385f.m8837d((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.store.view.my.i
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                MyStoresPresenter.lambda$handleUserImageClick$3((Void) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.store.view.my.u
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                MyStoresPresenter.lambda$handleUserImageClick$4((Throwable) obj);
                throw null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleBottomNavigationEvent$12, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8834a(Integer num) {
        this.view.scrollToTop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleBottomNavigationEvent$13, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8835b(View.LifecycleEvent lifecycleEvent) {
        return this.myStoresNavigator.bottomNavigationEvent().m40095j0(this.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.store.view.my.r
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11387f.m8834a((Integer) obj);
            }
        }).m40110s0();
    }

    static /* synthetic */ void lambda$handleBottomNavigationEvent$14(Integer num) {
    }

    static /* synthetic */ void lambda$handleBottomNavigationEvent$15(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleUserImageClick$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8836c(Void r1) {
        this.myStoresNavigator.navigateToMyAccount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleUserImageClick$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8837d(View.LifecycleEvent lifecycleEvent) {
        return this.view.imageClick().m40095j0(this.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.store.view.my.s
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11388f.m8836c((Void) obj);
            }
        }).m40110s0();
    }

    static /* synthetic */ void lambda$handleUserImageClick$3(Void r0) {
    }

    static /* synthetic */ void lambda$handleUserImageClick$4(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    static /* synthetic */ void lambda$loadUserImage$10(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadUserImage$6, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8838e(View.LifecycleEvent lifecycleEvent) {
        return this.accountManager.accountStatus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadUserImage$8, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8840g(String str) {
        if (str != null) {
            this.view.setUserImage(str);
        } else {
            this.view.setDefaultUserImage();
        }
        this.view.showAvatar();
    }

    static /* synthetic */ void lambda$loadUserImage$9(String str) {
    }

    private void loadUserImage() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.store.view.my.n
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.store.view.my.q
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11386f.m8838e((View.LifecycleEvent) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.store.view.my.l
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11381f.m8839f((Account) obj);
            }
        }).m40095j0(this.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.store.view.my.m
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11382f.m8840g((String) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.store.view.my.t
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                MyStoresPresenter.lambda$loadUserImage$9((String) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.store.view.my.v
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                MyStoresPresenter.lambda$loadUserImage$10((Throwable) obj);
                throw null;
            }
        });
    }

    @Override // cm.aptoide.p092pt.presenter.Presenter
    public void present() {
        loadUserImage();
        handleBottomNavigationEvent();
        handleUserImageClick();
    }
}
