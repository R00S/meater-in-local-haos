package cm.aptoide.p092pt.view.app;

import p456rx.Single;

/* loaded from: classes.dex */
public class AppCenter {
    private final AppCenterRepository appCenterRepository;

    public AppCenter(AppCenterRepository appCenterRepository) {
        this.appCenterRepository = appCenterRepository;
    }

    public Single<AppsList> getApps(long j2, int i2) {
        return this.appCenterRepository.getApplications(j2, i2);
    }

    public Single<AppsList> loadAppcRecommendedApps(int i2, String str) {
        return this.appCenterRepository.loadAppcRecommendedApps(i2, str);
    }

    public Single<DetailedAppRequestResult> loadDetailedApp(long j2, String str, String str2) {
        return this.appCenterRepository.loadDetailedApp(j2, str, str2);
    }

    public Single<DetailedAppRequestResult> loadDetailedAppFromMd5(String str) {
        return this.appCenterRepository.loadDetailedAppFromMd5(str);
    }

    public Single<DetailedAppRequestResult> loadDetailedAppFromUniqueName(String str) {
        return this.appCenterRepository.loadDetailedAppFromUniqueName(str);
    }

    public Single<AppsList> loadFreshApps(long j2, int i2) {
        return this.appCenterRepository.loadFreshApps(j2, i2);
    }

    public Single<AppsList> loadNextApps(long j2, int i2) {
        return this.appCenterRepository.loadNextApps(j2, i2);
    }

    public Single<AppsList> loadRecommendedApps(int i2, String str) {
        return this.appCenterRepository.loadRecommendedApps(i2, str);
    }

    public Single<DetailedAppRequestResult> unsafeLoadDetailedApp(long j2, String str, String str2) {
        return this.appCenterRepository.unsafeLoadDetailedApp(j2, str, str2);
    }

    public Single<DetailedAppRequestResult> loadDetailedApp(String str, String str2) {
        return this.appCenterRepository.loadDetailedApp(str, str2);
    }
}
