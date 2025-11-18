package cm.aptoide.p092pt.home.more.base;

import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.dataprovider.util.ErrorUtils;
import cm.aptoide.p092pt.presenter.Presenter;
import cm.aptoide.p092pt.presenter.View;
import cm.aptoide.p092pt.view.app.Application;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;
import p456rx.AbstractC11243h;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;

/* compiled from: ListAppsPresenter.kt */
@Metadata(m32266d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u0016\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H&J\b\u0010\u0016\u001a\u00020\u0013H\u0002J\b\u0010\u0017\u001a\u00020\u0013H\u0002J\b\u0010\u0018\u001a\u00020\u0013H\u0002J\b\u0010\u0019\u001a\u00020\u0013H\u0002J\u001c\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0014\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\fH\u0016J\b\u0010\u001c\u001a\u00020\u0013H\u0016J\b\u0010\u001d\u001a\u00020\u0013H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m32267d2 = {"Lcm/aptoide/pt/home/more/base/ListAppsPresenter;", "T", "Lcm/aptoide/pt/view/app/Application;", "Lcm/aptoide/pt/presenter/Presenter;", "view", "Lcm/aptoide/pt/home/more/base/ListAppsView;", "viewScheduler", "Lrx/Scheduler;", "crashReporter", "Lcm/aptoide/pt/crashreports/CrashReport;", "(Lcm/aptoide/pt/home/more/base/ListAppsView;Lrx/Scheduler;Lcm/aptoide/pt/crashreports/CrashReport;)V", "getApps", "Lrx/Observable;", HttpUrl.FRAGMENT_ENCODE_SET, "refresh", HttpUrl.FRAGMENT_ENCODE_SET, "getTitle", HttpUrl.FRAGMENT_ENCODE_SET, "handleAppClick", HttpUrl.FRAGMENT_ENCODE_SET, "appClickEvent", "Lcm/aptoide/pt/home/more/base/ListAppsClickEvent;", "handleBottomReached", "handleRefreshSwipe", "handleRetryClick", "loadAppList", "loadApps", "loadMoreApps", "present", "setupToolbar", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public abstract class ListAppsPresenter<T extends Application> implements Presenter {
    private final CrashReport crashReporter;
    private final ListAppsView<T> view;
    private final AbstractC11243h viewScheduler;

    public ListAppsPresenter(ListAppsView<T> listAppsView, AbstractC11243h abstractC11243h, CrashReport crashReport) {
        C9801m.m32346f(listAppsView, "view");
        C9801m.m32346f(abstractC11243h, "viewScheduler");
        C9801m.m32346f(crashReport, "crashReporter");
        this.view = listAppsView;
        this.viewScheduler = abstractC11243h;
        this.crashReporter = crashReport;
    }

    private final void handleAppClick() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.more.base.q
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return ListAppsPresenter.m40920handleAppClick$lambda22((View.LifecycleEvent) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.more.base.x
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return ListAppsPresenter.m40921handleAppClick$lambda24(this.f9912f, (View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.more.base.l
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ListAppsPresenter.m40923handleAppClick$lambda25((ListAppsClickEvent) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.home.more.base.g
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ListAppsPresenter.m40924handleAppClick$lambda26(this.f9890f, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleAppClick$lambda-22, reason: not valid java name */
    public static final Boolean m40920handleAppClick$lambda22(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleAppClick$lambda-24, reason: not valid java name */
    public static final C11234e m40921handleAppClick$lambda24(final ListAppsPresenter listAppsPresenter, View.LifecycleEvent lifecycleEvent) {
        C9801m.m32346f(listAppsPresenter, "this$0");
        return listAppsPresenter.view.getItemClickEvents().m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.more.base.r
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ListAppsPresenter.m40922handleAppClick$lambda24$lambda23(this.f9906f, (ListAppsClickEvent) obj);
            }
        }).m40110s0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleAppClick$lambda-24$lambda-23, reason: not valid java name */
    public static final void m40922handleAppClick$lambda24$lambda23(ListAppsPresenter listAppsPresenter, ListAppsClickEvent listAppsClickEvent) {
        C9801m.m32346f(listAppsPresenter, "this$0");
        C9801m.m32345e(listAppsClickEvent, "e");
        listAppsPresenter.handleAppClick(listAppsClickEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleAppClick$lambda-25, reason: not valid java name */
    public static final void m40923handleAppClick$lambda25(ListAppsClickEvent listAppsClickEvent) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleAppClick$lambda-26, reason: not valid java name */
    public static final void m40924handleAppClick$lambda26(ListAppsPresenter listAppsPresenter, Throwable th) {
        C9801m.m32346f(listAppsPresenter, "this$0");
        listAppsPresenter.crashReporter.log(th);
    }

    private final void handleBottomReached() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.more.base.f
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return ListAppsPresenter.m40925handleBottomReached$lambda27((View.LifecycleEvent) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.more.base.z
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return ListAppsPresenter.m40926handleBottomReached$lambda30(this.f9914f, (View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.more.base.i0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ListAppsPresenter.m40929handleBottomReached$lambda31((List) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.home.more.base.p
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ListAppsPresenter.m40930handleBottomReached$lambda32(this.f9904f, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleBottomReached$lambda-27, reason: not valid java name */
    public static final Boolean m40925handleBottomReached$lambda27(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleBottomReached$lambda-30, reason: not valid java name */
    public static final C11234e m40926handleBottomReached$lambda30(final ListAppsPresenter listAppsPresenter, View.LifecycleEvent lifecycleEvent) {
        C9801m.m32346f(listAppsPresenter, "this$0");
        return listAppsPresenter.view.onBottomReached().m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.more.base.d0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return ListAppsPresenter.m40927handleBottomReached$lambda30$lambda28(this.f9885f, (Void) obj);
            }
        }).m40095j0(listAppsPresenter.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.more.base.b0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ListAppsPresenter.m40928handleBottomReached$lambda30$lambda29(this.f9881f, (List) obj);
            }
        }).m40110s0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleBottomReached$lambda-30$lambda-28, reason: not valid java name */
    public static final C11234e m40927handleBottomReached$lambda30$lambda28(ListAppsPresenter listAppsPresenter, Void r1) {
        C9801m.m32346f(listAppsPresenter, "this$0");
        return listAppsPresenter.loadMoreApps();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleBottomReached$lambda-30$lambda-29, reason: not valid java name */
    public static final void m40928handleBottomReached$lambda30$lambda29(ListAppsPresenter listAppsPresenter, List list) {
        C9801m.m32346f(listAppsPresenter, "this$0");
        if (list == null || !(!list.isEmpty())) {
            return;
        }
        listAppsPresenter.view.addApps(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleBottomReached$lambda-31, reason: not valid java name */
    public static final void m40929handleBottomReached$lambda31(List list) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleBottomReached$lambda-32, reason: not valid java name */
    public static final void m40930handleBottomReached$lambda32(ListAppsPresenter listAppsPresenter, Throwable th) {
        C9801m.m32346f(listAppsPresenter, "this$0");
        listAppsPresenter.crashReporter.log(th);
    }

    private final void handleRefreshSwipe() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.more.base.f0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return ListAppsPresenter.m40932handleRefreshSwipe$lambda6((View.LifecycleEvent) obj);
            }
        }).m40095j0(this.viewScheduler).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.more.base.e0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return ListAppsPresenter.m40933handleRefreshSwipe$lambda8(this.f9887f, (View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.more.base.a0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ListAppsPresenter.m40935handleRefreshSwipe$lambda9((List) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.home.more.base.h0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ListAppsPresenter.m40931handleRefreshSwipe$lambda10(this.f9893f, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleRefreshSwipe$lambda-10, reason: not valid java name */
    public static final void m40931handleRefreshSwipe$lambda10(ListAppsPresenter listAppsPresenter, Throwable th) {
        C9801m.m32346f(listAppsPresenter, "this$0");
        listAppsPresenter.crashReporter.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleRefreshSwipe$lambda-6, reason: not valid java name */
    public static final Boolean m40932handleRefreshSwipe$lambda6(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleRefreshSwipe$lambda-8, reason: not valid java name */
    public static final C11234e m40933handleRefreshSwipe$lambda8(final ListAppsPresenter listAppsPresenter, View.LifecycleEvent lifecycleEvent) {
        C9801m.m32346f(listAppsPresenter, "this$0");
        return listAppsPresenter.view.refreshEvents().m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.more.base.k
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return ListAppsPresenter.m40934handleRefreshSwipe$lambda8$lambda7(this.f9898f, (Void) obj);
            }
        }).m40110s0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleRefreshSwipe$lambda-8$lambda-7, reason: not valid java name */
    public static final C11234e m40934handleRefreshSwipe$lambda8$lambda7(ListAppsPresenter listAppsPresenter, Void r1) {
        C9801m.m32346f(listAppsPresenter, "this$0");
        return listAppsPresenter.loadApps(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleRefreshSwipe$lambda-9, reason: not valid java name */
    public static final void m40935handleRefreshSwipe$lambda9(List list) {
    }

    private final void handleRetryClick() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.more.base.t
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return ListAppsPresenter.m40936handleRetryClick$lambda0((View.LifecycleEvent) obj);
            }
        }).m40095j0(this.viewScheduler).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.more.base.j
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return ListAppsPresenter.m40937handleRetryClick$lambda3(this.f9896f, (View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.more.base.n
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ListAppsPresenter.m40940handleRetryClick$lambda4((List) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.home.more.base.c0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ListAppsPresenter.m40941handleRetryClick$lambda5(this.f9883f, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleRetryClick$lambda-0, reason: not valid java name */
    public static final Boolean m40936handleRetryClick$lambda0(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleRetryClick$lambda-3, reason: not valid java name */
    public static final C11234e m40937handleRetryClick$lambda3(final ListAppsPresenter listAppsPresenter, View.LifecycleEvent lifecycleEvent) {
        C9801m.m32346f(listAppsPresenter, "this$0");
        return listAppsPresenter.view.errorRetryClick().m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.more.base.h
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ListAppsPresenter.m40938handleRetryClick$lambda3$lambda1(this.f9892f, (Void) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.more.base.e
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return ListAppsPresenter.m40939handleRetryClick$lambda3$lambda2(this.f9886f, (Void) obj);
            }
        }).m40110s0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleRetryClick$lambda-3$lambda-1, reason: not valid java name */
    public static final void m40938handleRetryClick$lambda3$lambda1(ListAppsPresenter listAppsPresenter, Void r1) {
        C9801m.m32346f(listAppsPresenter, "this$0");
        listAppsPresenter.view.showLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleRetryClick$lambda-3$lambda-2, reason: not valid java name */
    public static final C11234e m40939handleRetryClick$lambda3$lambda2(ListAppsPresenter listAppsPresenter, Void r1) {
        C9801m.m32346f(listAppsPresenter, "this$0");
        return listAppsPresenter.loadApps(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleRetryClick$lambda-4, reason: not valid java name */
    public static final void m40940handleRetryClick$lambda4(List list) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleRetryClick$lambda-5, reason: not valid java name */
    public static final void m40941handleRetryClick$lambda5(ListAppsPresenter listAppsPresenter, Throwable th) {
        C9801m.m32346f(listAppsPresenter, "this$0");
        listAppsPresenter.crashReporter.log(th);
    }

    private final void loadAppList() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.more.base.w
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return ListAppsPresenter.m40942loadAppList$lambda15((View.LifecycleEvent) obj);
            }
        }).m40095j0(this.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.more.base.o
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ListAppsPresenter.m40943loadAppList$lambda16(this.f9903f, (View.LifecycleEvent) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.more.base.u
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return ListAppsPresenter.m40944loadAppList$lambda17(this.f9909f, (View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.more.base.k0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ListAppsPresenter.m40945loadAppList$lambda18((List) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.home.more.base.i
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ListAppsPresenter.m40946loadAppList$lambda19(this.f9894f, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadAppList$lambda-15, reason: not valid java name */
    public static final Boolean m40942loadAppList$lambda15(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadAppList$lambda-16, reason: not valid java name */
    public static final void m40943loadAppList$lambda16(ListAppsPresenter listAppsPresenter, View.LifecycleEvent lifecycleEvent) {
        C9801m.m32346f(listAppsPresenter, "this$0");
        listAppsPresenter.view.showLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadAppList$lambda-17, reason: not valid java name */
    public static final C11234e m40944loadAppList$lambda17(ListAppsPresenter listAppsPresenter, View.LifecycleEvent lifecycleEvent) {
        C9801m.m32346f(listAppsPresenter, "this$0");
        return listAppsPresenter.loadApps(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadAppList$lambda-18, reason: not valid java name */
    public static final void m40945loadAppList$lambda18(List list) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadAppList$lambda-19, reason: not valid java name */
    public static final void m40946loadAppList$lambda19(ListAppsPresenter listAppsPresenter, Throwable th) {
        C9801m.m32346f(listAppsPresenter, "this$0");
        listAppsPresenter.crashReporter.log(th);
    }

    private final C11234e<List<T>> loadApps(boolean z) {
        C11234e<List<T>> c11234eM40117w = getApps(z).m40095j0(this.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.more.base.v
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ListAppsPresenter.m40947loadApps$lambda20(this.f9910f, (List) obj);
            }
        }).m40117w(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.more.base.y
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ListAppsPresenter.m40948loadApps$lambda21(this.f9913f, (Throwable) obj);
            }
        });
        C9801m.m32345e(c11234eM40117w, "getApps(refresh)\n       …r()\n          }\n        }");
        return c11234eM40117w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadApps$lambda-20, reason: not valid java name */
    public static final void m40947loadApps$lambda20(ListAppsPresenter listAppsPresenter, List list) {
        C9801m.m32346f(listAppsPresenter, "this$0");
        ListAppsView<T> listAppsView = listAppsPresenter.view;
        C9801m.m32345e(list, DeepLinkIntentReceiver.DeepLinksTargets.APPS);
        listAppsView.showApps(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadApps$lambda-21, reason: not valid java name */
    public static final void m40948loadApps$lambda21(ListAppsPresenter listAppsPresenter, Throwable th) {
        C9801m.m32346f(listAppsPresenter, "this$0");
        if (ErrorUtils.isNoNetworkConnection(th)) {
            listAppsPresenter.view.showNoNetworkError();
        } else {
            listAppsPresenter.view.showGenericError();
        }
    }

    private final void setupToolbar() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.more.base.m
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return ListAppsPresenter.m40949setupToolbar$lambda11((View.LifecycleEvent) obj);
            }
        }).m40095j0(this.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.more.base.s
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ListAppsPresenter.m40950setupToolbar$lambda12(this.f9907f, (View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.more.base.j0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ListAppsPresenter.m40951setupToolbar$lambda13((View.LifecycleEvent) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.home.more.base.g0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ListAppsPresenter.m40952setupToolbar$lambda14(this.f9891f, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupToolbar$lambda-11, reason: not valid java name */
    public static final Boolean m40949setupToolbar$lambda11(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupToolbar$lambda-12, reason: not valid java name */
    public static final void m40950setupToolbar$lambda12(ListAppsPresenter listAppsPresenter, View.LifecycleEvent lifecycleEvent) {
        C9801m.m32346f(listAppsPresenter, "this$0");
        listAppsPresenter.view.setToolbarInfo(listAppsPresenter.getTitle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupToolbar$lambda-13, reason: not valid java name */
    public static final void m40951setupToolbar$lambda13(View.LifecycleEvent lifecycleEvent) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupToolbar$lambda-14, reason: not valid java name */
    public static final void m40952setupToolbar$lambda14(ListAppsPresenter listAppsPresenter, Throwable th) {
        C9801m.m32346f(listAppsPresenter, "this$0");
        listAppsPresenter.crashReporter.log(th);
    }

    public abstract C11234e<List<T>> getApps(boolean z);

    public abstract String getTitle();

    public abstract void handleAppClick(ListAppsClickEvent<T> appClickEvent);

    public C11234e<List<T>> loadMoreApps() {
        C11234e<List<T>> c11234eM40025S = C11234e.m40025S(null);
        C9801m.m32345e(c11234eM40025S, "just(null)");
        return c11234eM40025S;
    }

    @Override // cm.aptoide.p092pt.presenter.Presenter
    public void present() {
        loadAppList();
        setupToolbar();
        handleAppClick();
        handleRetryClick();
        handleRefreshSwipe();
        handleBottomReached();
    }
}
