package cm.aptoide.p092pt.view.app;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p456rx.C11234e;
import p456rx.Single;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public class AppCenterRepository {
    private final AppService appService;
    private final Map<Long, AbstractMap.SimpleEntry<Integer, List<Application>>> cachedStoreApplications;

    public AppCenterRepository(AppService appService, Map<Long, AbstractMap.SimpleEntry<Integer, List<Application>>> map) {
        this.appService = appService;
        this.cachedStoreApplications = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cloneList, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AppsList m8912d(AppsList appsList) {
        return (appsList.hasErrors() || appsList.isLoading()) ? appsList : new AppsList(new ArrayList(appsList.getList()), appsList.isLoading(), appsList.getOffset());
    }

    static /* synthetic */ AppsList lambda$getApplications$4(AbstractMap.SimpleEntry simpleEntry, AppsList appsList) {
        return new AppsList(new ArrayList((Collection) simpleEntry.getValue()), false, ((Integer) simpleEntry.getKey()).intValue());
    }

    static /* synthetic */ AppsList lambda$loadAppcRecommendedApps$9(AppsList appsList, List list) {
        return new AppsList(list, appsList.isLoading(), appsList.getOffset());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadFreshApps$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8909a(long j2, AppsList appsList) {
        updateCache(j2, appsList, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadNextApps$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8911c(long j2, AppsList appsList) {
        updateCache(j2, appsList, false);
    }

    static /* synthetic */ AppsList lambda$loadRecommendedApps$6(AppsList appsList, List list) {
        return new AppsList(list, appsList.isLoading(), appsList.getOffset());
    }

    private void updateCache(long j2, AppsList appsList, boolean z) {
        if (appsList.hasErrors() || appsList.isLoading()) {
            return;
        }
        AbstractMap.SimpleEntry<Integer, List<Application>> simpleEntry = this.cachedStoreApplications.get(Long.valueOf(j2));
        if (simpleEntry == null || z) {
            this.cachedStoreApplications.put(Long.valueOf(j2), new AbstractMap.SimpleEntry<>(Integer.valueOf(appsList.getOffset()), appsList.getList()));
            return;
        }
        List<Application> value = simpleEntry.getValue();
        value.addAll(appsList.getList());
        this.cachedStoreApplications.put(Long.valueOf(j2), new AbstractMap.SimpleEntry<>(Integer.valueOf(appsList.getOffset()), value));
    }

    public Single<AppsList> getApplications(long j2, int i2) {
        final AbstractMap.SimpleEntry<Integer, List<Application>> simpleEntry = this.cachedStoreApplications.get(Long.valueOf(j2));
        if (simpleEntry == null || simpleEntry.getValue().isEmpty()) {
            return loadNextApps(j2, i2);
        }
        int size = i2 - (simpleEntry.getValue().size() % i2);
        return size == 0 ? Single.m39913m(new AppsList(new ArrayList(simpleEntry.getValue()), false, simpleEntry.getKey().intValue())) : loadNextApps(j2, size).m39923n(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.app.e
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return AppCenterRepository.lambda$getApplications$4(simpleEntry, (AppsList) obj);
            }
        });
    }

    public Single<AppsList> loadAppcRecommendedApps(int i2, final String str) {
        return this.appService.loadAppcRecommendedApps(i2, str).m39922k(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.app.b
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                AppsList appsList = (AppsList) obj;
                return C11234e.m40025S(appsList).m40066J(C4714f2.f11715f).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.app.j
                    @Override // p456rx.p460m.InterfaceC11256e
                    public final Object call(Object obj2) {
                        String str2 = str;
                        Application application = (Application) obj2;
                        return Boolean.valueOf(!application.getPackageName().equals(str2));
                    }
                }).m40084Y0().m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.app.h
                    @Override // p456rx.p460m.InterfaceC11256e
                    public final Object call(Object obj2) {
                        return AppCenterRepository.lambda$loadAppcRecommendedApps$9(appsList, (List) obj2);
                    }
                });
            }
        }).m40085Z0();
    }

    public Single<DetailedAppRequestResult> loadDetailedApp(long j2, String str, String str2) {
        return this.appService.loadDetailedApp(j2, str, str2);
    }

    public Single<DetailedAppRequestResult> loadDetailedAppFromMd5(String str) {
        return this.appService.loadDetailedAppFromMd5(str);
    }

    public Single<DetailedAppRequestResult> loadDetailedAppFromUniqueName(String str) {
        return this.appService.loadDetailedAppFromUniqueName(str);
    }

    public Single<AppsList> loadFreshApps(final long j2, int i2) {
        return this.appService.loadFreshApps(j2, i2).m39919g(new InterfaceC11253b() { // from class: cm.aptoide.pt.view.app.d
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11703f.m8909a(j2, (AppsList) obj);
            }
        }).m39923n(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.app.a
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11691f.m8910b((AppsList) obj);
            }
        });
    }

    public Single<AppsList> loadNextApps(final long j2, int i2) {
        AbstractMap.SimpleEntry<Integer, List<Application>> simpleEntry = this.cachedStoreApplications.get(Long.valueOf(j2));
        return this.appService.loadApps(j2, simpleEntry != null ? simpleEntry.getKey().intValue() : 0, i2).m39919g(new InterfaceC11253b() { // from class: cm.aptoide.pt.view.app.i
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11722f.m8911c(j2, (AppsList) obj);
            }
        }).m39923n(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.app.f
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11712f.m8912d((AppsList) obj);
            }
        });
    }

    public Single<AppsList> loadRecommendedApps(int i2, final String str) {
        return this.appService.loadRecommendedApps(i2, str).m39922k(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.app.k
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                AppsList appsList = (AppsList) obj;
                return C11234e.m40025S(appsList).m40066J(C4714f2.f11715f).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.app.c
                    @Override // p456rx.p460m.InterfaceC11256e
                    public final Object call(Object obj2) {
                        String str2 = str;
                        Application application = (Application) obj2;
                        return Boolean.valueOf(!application.getPackageName().equals(str2));
                    }
                }).m40084Y0().m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.app.g
                    @Override // p456rx.p460m.InterfaceC11256e
                    public final Object call(Object obj2) {
                        return AppCenterRepository.lambda$loadRecommendedApps$6(appsList, (List) obj2);
                    }
                });
            }
        }).m40085Z0();
    }

    public Single<DetailedAppRequestResult> unsafeLoadDetailedApp(long j2, String str, String str2) {
        return this.appService.unsafeLoadDetailedApp(j2, str, str2);
    }

    public Single<DetailedAppRequestResult> loadDetailedApp(String str, String str2) {
        return this.appService.loadDetailedApp(str, str2);
    }
}
