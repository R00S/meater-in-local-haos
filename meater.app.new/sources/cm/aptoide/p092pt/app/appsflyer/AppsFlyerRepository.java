package cm.aptoide.p092pt.app.appsflyer;

import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;
import p456rx.Single;
import p456rx.p460m.InterfaceC11256e;
import retrofit2.Response;

/* compiled from: AppsFlyerRepository.kt */
@Metadata(m32266d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m32267d2 = {"Lcm/aptoide/pt/app/appsflyer/AppsFlyerRepository;", HttpUrl.FRAGMENT_ENCODE_SET, "appsFlyerService", "Lcm/aptoide/pt/app/appsflyer/AppsFlyerService;", "(Lcm/aptoide/pt/app/appsflyer/AppsFlyerService;)V", "registerImpression", "Lrx/Single;", HttpUrl.FRAGMENT_ENCODE_SET, "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class AppsFlyerRepository {
    private final AppsFlyerService appsFlyerService;

    public AppsFlyerRepository(AppsFlyerService appsFlyerService) {
        C9801m.m32346f(appsFlyerService, "appsFlyerService");
        this.appsFlyerService = appsFlyerService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: registerImpression$lambda-0, reason: not valid java name */
    public static final Boolean m40726registerImpression$lambda0(Response response) {
        return Boolean.valueOf(response.isSuccessful());
    }

    public final Single<Boolean> registerImpression() {
        Single singleM39923n = this.appsFlyerService.registerImpression().m39923n(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.appsflyer.a
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return AppsFlyerRepository.m40726registerImpression$lambda0((Response) obj);
            }
        });
        C9801m.m32345e(singleM39923n, "appsFlyerService.registe…sponse.isSuccessful\n    }");
        return singleM39923n;
    }
}
