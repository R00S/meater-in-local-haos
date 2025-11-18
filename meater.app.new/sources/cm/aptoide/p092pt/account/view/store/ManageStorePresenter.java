package cm.aptoide.p092pt.account.view.store;

import android.net.Uri;
import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.p092pt.account.AccountAnalytics;
import cm.aptoide.p092pt.account.view.UriToPathResolver;
import cm.aptoide.p092pt.account.view.exception.InvalidImageException;
import cm.aptoide.p092pt.account.view.exception.StoreCreationException;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.presenter.Presenter;
import cm.aptoide.p092pt.presenter.View;
import java.util.concurrent.Callable;
import okhttp3.HttpUrl;
import p456rx.C11231b;
import p456rx.C11234e;
import p456rx.Single;
import p456rx.p457l.p459c.C11250a;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;
import p456rx.schedulers.Schedulers;

/* loaded from: classes.dex */
public class ManageStorePresenter implements Presenter {
    private AccountAnalytics accountAnalytics;
    private final AptoideAccountManager accountManager;
    private final String applicationPackageName;
    private final CrashReport crashReport;
    private final ManageStoreErrorMapper errorMapper;
    private final boolean goBackToHome;
    private final ManageStoreNavigator navigator;
    private final int requestCode;
    private final UriToPathResolver uriToPathResolver;
    private final ManageStoreView view;

    public ManageStorePresenter(ManageStoreView manageStoreView, CrashReport crashReport, UriToPathResolver uriToPathResolver, String str, ManageStoreNavigator manageStoreNavigator, boolean z, ManageStoreErrorMapper manageStoreErrorMapper, AptoideAccountManager aptoideAccountManager, int i2, AccountAnalytics accountAnalytics) {
        this.view = manageStoreView;
        this.crashReport = crashReport;
        this.uriToPathResolver = uriToPathResolver;
        this.applicationPackageName = str;
        this.navigator = manageStoreNavigator;
        this.goBackToHome = z;
        this.errorMapper = manageStoreErrorMapper;
        this.accountManager = aptoideAccountManager;
        this.requestCode = i2;
        this.accountAnalytics = accountAnalytics;
    }

    private void handleCancel() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.store.u
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj) == View.LifecycleEvent.CREATE);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.store.l
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7385f.m6933c((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.account.view.store.m
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ManageStorePresenter.lambda$handleCancel$3((ManageStoreViewModel) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.account.view.store.p
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7390f.m6934d((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C11231b handleSaveClick(final ManageStoreViewModel manageStoreViewModel) {
        final ManageStoreView manageStoreView = this.view;
        manageStoreView.getClass();
        return C11231b.m39952t(new InterfaceC11252a() { // from class: cm.aptoide.pt.account.view.store.b
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                manageStoreView.showWaitProgressBar();
            }
        }).m39986z(Schedulers.m40658io()).m39973a(saveData(manageStoreViewModel)).m39986z(C11250a.m40156b()).m39980m(new InterfaceC11252a() { // from class: cm.aptoide.pt.account.view.store.o
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f7388f.m6938h(manageStoreViewModel);
            }
        }).m39980m(new InterfaceC11252a() { // from class: cm.aptoide.pt.account.view.store.j
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f7383f.m6939i();
            }
        }).m39980m(new InterfaceC11252a() { // from class: cm.aptoide.pt.account.view.store.s
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f7394f.m6940j();
            }
        }).m39980m(new InterfaceC11252a() { // from class: cm.aptoide.pt.account.view.store.x
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f7400f.m6935e();
            }
        }).m39960C(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.store.q
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7391f.m6937g((Throwable) obj);
            }
        });
    }

    private void handleSaveData() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.store.t
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj) == View.LifecycleEvent.CREATE);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.store.k
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7384f.m6941k((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40056D0();
    }

    private void handleStoreCreationErrors(Throwable th) {
        if (th instanceof InvalidImageException) {
            InvalidImageException invalidImageException = (InvalidImageException) th;
            if (invalidImageException.getImageErrors().contains(InvalidImageException.ImageError.API_ERROR)) {
                this.view.showError(this.errorMapper.getImageError());
                return;
            } else {
                this.view.showError(this.errorMapper.getNetworkError(invalidImageException.getErrorCode(), this.applicationPackageName));
                return;
            }
        }
        if (th instanceof StoreCreationException) {
            StoreCreationException storeCreationException = (StoreCreationException) th;
            if (storeCreationException.hasErrorCode()) {
                this.view.showError(this.errorMapper.getNetworkError(storeCreationException.getErrorCode(), this.applicationPackageName));
                return;
            } else {
                this.view.showError(this.errorMapper.getInvalidStoreError());
                return;
            }
        }
        if (th instanceof StoreValidationException) {
            StoreValidationException storeValidationException = (StoreValidationException) th;
            if (storeValidationException.getErrorCode() == 0) {
                this.view.showError(this.errorMapper.getInvalidStoreError());
                return;
            } else if (storeValidationException.getErrorCode() == 1) {
                this.view.showError(this.errorMapper.getImageError());
                return;
            }
        }
        this.crashReport.log(th);
        this.view.showError(this.errorMapper.getGenericError());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleCancel$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6932b(ManageStoreViewModel manageStoreViewModel) {
        if (this.goBackToHome) {
            this.accountAnalytics.createStore(manageStoreViewModel.hasPicture(), AccountAnalytics.CreateStoreAction.SKIP);
        }
        navigate(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleCancel$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m6933c(View.LifecycleEvent lifecycleEvent) {
        return this.view.cancelClick().m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.account.view.store.v
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7397f.m6932b((ManageStoreViewModel) obj);
            }
        });
    }

    static /* synthetic */ void lambda$handleCancel$3(ManageStoreViewModel manageStoreViewModel) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleCancel$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6934d(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleSaveClick$10, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6935e() {
        navigate(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleSaveClick$11, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6936f(Throwable th) {
        this.view.dismissWaitProgressBar();
        handleStoreCreationErrors(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleSaveClick$12, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m6937g(final Throwable th) {
        return C11231b.m39952t(new InterfaceC11252a() { // from class: cm.aptoide.pt.account.view.store.r
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f7392f.m6936f(th);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleSaveClick$7, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6938h(ManageStoreViewModel manageStoreViewModel) {
        if (this.goBackToHome) {
            this.accountAnalytics.createStore(manageStoreViewModel.hasPicture(), AccountAnalytics.CreateStoreAction.CREATE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleSaveClick$8, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6939i() {
        this.view.dismissWaitProgressBar();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleSaveClick$9, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6940j() {
        this.view.showSuccessMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleSaveData$6, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m6941k(View.LifecycleEvent lifecycleEvent) {
        C11234e<ManageStoreViewModel> c11234eM40062H = this.view.saveDataClick().m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.store.n
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7387f.handleSaveClick((ManageStoreViewModel) obj);
            }
        });
        final CrashReport crashReport = this.crashReport;
        crashReport.getClass();
        return c11234eM40062H.m40117w(new InterfaceC11253b() { // from class: cm.aptoide.pt.account.view.store.a
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                crashReport.log((Throwable) obj);
            }
        }).m40110s0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$saveData$13, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ String m6942l(ManageStoreViewModel manageStoreViewModel) throws Exception {
        return manageStoreViewModel.hasNewAvatar() ? this.uriToPathResolver.getMediaStoragePath(Uri.parse(manageStoreViewModel.getPictureUri())) : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$saveData$14, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m6943m(ManageStoreViewModel manageStoreViewModel, String str) {
        return this.accountManager.createOrUpdate(manageStoreViewModel.getStoreName(), manageStoreViewModel.getStoreDescription(), str, manageStoreViewModel.hasNewAvatar(), manageStoreViewModel.getStoreTheme().getThemeName(), manageStoreViewModel.storeExists());
    }

    private void navigate(boolean z) {
        if (this.goBackToHome) {
            this.navigator.goToHome();
        } else {
            this.navigator.popViewWithResult(this.requestCode, z);
        }
    }

    private C11231b saveData(final ManageStoreViewModel manageStoreViewModel) {
        return Single.m39912l(new Callable() { // from class: cm.aptoide.pt.account.view.store.w
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f7398f.m6942l(manageStoreViewModel);
            }
        }).m39921j(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.store.y
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7401f.m6943m(manageStoreViewModel, (String) obj);
            }
        });
    }

    @Override // cm.aptoide.p092pt.presenter.Presenter
    public void present() {
        handleSaveData();
        handleCancel();
    }
}
