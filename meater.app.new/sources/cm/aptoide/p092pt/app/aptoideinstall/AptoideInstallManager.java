package cm.aptoide.p092pt.app.aptoideinstall;

import cm.aptoide.p092pt.install.AptoideInstalledAppsRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;
import p456rx.Single;

/* compiled from: AptoideInstallManager.kt */
@Metadata(m32266d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u000e\u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m32267d2 = {"Lcm/aptoide/pt/app/aptoideinstall/AptoideInstallManager;", HttpUrl.FRAGMENT_ENCODE_SET, "aptoideInstalledAppsRepository", "Lcm/aptoide/pt/install/AptoideInstalledAppsRepository;", "aptoideInstallRepository", "Lcm/aptoide/pt/app/aptoideinstall/AptoideInstallRepository;", "(Lcm/aptoide/pt/install/AptoideInstalledAppsRepository;Lcm/aptoide/pt/app/aptoideinstall/AptoideInstallRepository;)V", "getAptoideInstallRepository", "()Lcm/aptoide/pt/app/aptoideinstall/AptoideInstallRepository;", "getAptoideInstalledAppsRepository", "()Lcm/aptoide/pt/install/AptoideInstalledAppsRepository;", "addAptoideInstallCandidate", HttpUrl.FRAGMENT_ENCODE_SET, "packageName", HttpUrl.FRAGMENT_ENCODE_SET, "isInstalledWithAptoide", "Lrx/Single;", HttpUrl.FRAGMENT_ENCODE_SET, "isSplitInstalledWithAptoide", "persistCandidate", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class AptoideInstallManager {
    private final AptoideInstallRepository aptoideInstallRepository;
    private final AptoideInstalledAppsRepository aptoideInstalledAppsRepository;

    public AptoideInstallManager(AptoideInstalledAppsRepository aptoideInstalledAppsRepository, AptoideInstallRepository aptoideInstallRepository) {
        C9801m.m32346f(aptoideInstalledAppsRepository, "aptoideInstalledAppsRepository");
        C9801m.m32346f(aptoideInstallRepository, "aptoideInstallRepository");
        this.aptoideInstalledAppsRepository = aptoideInstalledAppsRepository;
        this.aptoideInstallRepository = aptoideInstallRepository;
    }

    private final boolean isSplitInstalledWithAptoide(String packageName) {
        return false;
    }

    public final void addAptoideInstallCandidate(String packageName) {
        C9801m.m32346f(packageName, "packageName");
        this.aptoideInstallRepository.addAptoideInstallCandidate(packageName);
    }

    public final AptoideInstallRepository getAptoideInstallRepository() {
        return this.aptoideInstallRepository;
    }

    public final AptoideInstalledAppsRepository getAptoideInstalledAppsRepository() {
        return this.aptoideInstalledAppsRepository;
    }

    public final Single<Boolean> isInstalledWithAptoide(String packageName) {
        C9801m.m32346f(packageName, "packageName");
        if (!isSplitInstalledWithAptoide(packageName)) {
            return this.aptoideInstallRepository.isInstalledWithAptoide(packageName);
        }
        Single<Boolean> singleM39913m = Single.m39913m(Boolean.TRUE);
        C9801m.m32345e(singleM39913m, "just(true)");
        return singleM39913m;
    }

    public final void persistCandidate(String packageName) {
        C9801m.m32346f(packageName, "packageName");
        this.aptoideInstallRepository.persistCandidate(packageName);
    }
}
