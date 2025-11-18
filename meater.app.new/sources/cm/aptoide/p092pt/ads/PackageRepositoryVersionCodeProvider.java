package cm.aptoide.p092pt.ads;

import cm.aptoide.p092pt.dataprovider.p097ws.p099v2.aptwords.AdsApplicationVersionCodeProvider;
import cm.aptoide.p092pt.install.PackageRepository;
import p456rx.Single;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public class PackageRepositoryVersionCodeProvider implements AdsApplicationVersionCodeProvider {
    private final String packageName;
    private final PackageRepository packageRepository;

    public PackageRepositoryVersionCodeProvider(PackageRepository packageRepository, String str) {
        this.packageName = str;
        this.packageRepository = packageRepository;
    }

    static /* synthetic */ Integer lambda$getApplicationVersionCode$0(Throwable th) {
        return -1;
    }

    @Override // cm.aptoide.p092pt.dataprovider.p097ws.p099v2.aptwords.AdsApplicationVersionCodeProvider
    public Single<Integer> getApplicationVersionCode() {
        return this.packageRepository.getPackageVersionCode(this.packageName).m39926r(new InterfaceC11256e() { // from class: cm.aptoide.pt.ads.y
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return PackageRepositoryVersionCodeProvider.lambda$getApplicationVersionCode$0((Throwable) obj);
            }
        });
    }
}
