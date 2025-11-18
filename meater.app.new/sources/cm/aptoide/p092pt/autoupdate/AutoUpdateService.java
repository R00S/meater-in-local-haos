package cm.aptoide.p092pt.autoupdate;

import cm.aptoide.p092pt.dataprovider.exception.NoNetworkConnectionException;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;
import p456rx.C11234e;
import p456rx.Single;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p460m.InterfaceC11256e;

/* compiled from: AutoUpdateService.kt */
@Metadata(m32266d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002J\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m32267d2 = {"Lcm/aptoide/pt/autoupdate/AutoUpdateService;", HttpUrl.FRAGMENT_ENCODE_SET, "service", "Lcm/aptoide/pt/autoupdate/Service;", "packageName", HttpUrl.FRAGMENT_ENCODE_SET, "clientSdkVersion", HttpUrl.FRAGMENT_ENCODE_SET, "(Lcm/aptoide/pt/autoupdate/Service;Ljava/lang/String;I)V", "loading", HttpUrl.FRAGMENT_ENCODE_SET, "createErrorAutoUpdateModel", "Lcm/aptoide/pt/autoupdate/AutoUpdateModel;", "throwable", HttpUrl.FRAGMENT_ENCODE_SET, "loadAutoUpdateModel", "Lrx/Single;", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class AutoUpdateService {
    private final int clientSdkVersion;
    private boolean loading;
    private final String packageName;
    private final Service service;

    public AutoUpdateService(Service service, String str, int i2) {
        C9801m.m32346f(service, "service");
        C9801m.m32346f(str, "packageName");
        this.service = service;
        this.packageName = str;
        this.clientSdkVersion = i2;
    }

    private final AutoUpdateModel createErrorAutoUpdateModel(Throwable throwable) {
        return throwable instanceof NoNetworkConnectionException ? new AutoUpdateModel(Status.ERROR_NETWORK) : new AutoUpdateModel(Status.ERROR_GENERIC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadAutoUpdateModel$lambda-0, reason: not valid java name */
    public static final void m40747loadAutoUpdateModel$lambda0(AutoUpdateService autoUpdateService) {
        C9801m.m32346f(autoUpdateService, "this$0");
        autoUpdateService.loading = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadAutoUpdateModel$lambda-1, reason: not valid java name */
    public static final void m40748loadAutoUpdateModel$lambda1(AutoUpdateService autoUpdateService) {
        C9801m.m32346f(autoUpdateService, "this$0");
        autoUpdateService.loading = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadAutoUpdateModel$lambda-2, reason: not valid java name */
    public static final void m40749loadAutoUpdateModel$lambda2(AutoUpdateService autoUpdateService) {
        C9801m.m32346f(autoUpdateService, "this$0");
        autoUpdateService.loading = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadAutoUpdateModel$lambda-3, reason: not valid java name */
    public static final C11234e m40750loadAutoUpdateModel$lambda3(AutoUpdateService autoUpdateService, AutoUpdateJsonResponse autoUpdateJsonResponse) {
        C9801m.m32346f(autoUpdateService, "this$0");
        int versioncode = autoUpdateJsonResponse.getVersioncode();
        String uri = autoUpdateJsonResponse.getUri();
        C9801m.m32345e(uri, "it.uri");
        String md5 = autoUpdateJsonResponse.getMd5();
        C9801m.m32345e(md5, "it.md5");
        String minSdk = autoUpdateJsonResponse.getMinSdk();
        C9801m.m32345e(minSdk, "it.minSdk");
        return C11234e.m40025S(new AutoUpdateModel(versioncode, uri, md5, minSdk, autoUpdateService.packageName, false, null, false, 224, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadAutoUpdateModel$lambda-4, reason: not valid java name */
    public static final AutoUpdateModel m40751loadAutoUpdateModel$lambda4(AutoUpdateService autoUpdateService, Throwable th) {
        C9801m.m32346f(autoUpdateService, "this$0");
        return autoUpdateService.createErrorAutoUpdateModel(th);
    }

    public final Single<AutoUpdateModel> loadAutoUpdateModel() {
        if (this.loading) {
            Single<AutoUpdateModel> singleM39913m = Single.m39913m(new AutoUpdateModel(true));
            C9801m.m32345e(singleM39913m, "just(AutoUpdateModel(loading = true))");
            return singleM39913m;
        }
        Single<AutoUpdateModel> singleM40085Z0 = this.service.getAutoUpdateResponse(this.packageName, this.clientSdkVersion).m40121y(new InterfaceC11252a() { // from class: cm.aptoide.pt.autoupdate.y
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                AutoUpdateService.m40747loadAutoUpdateModel$lambda0(this.f8241f);
            }
        }).m40051A(new InterfaceC11252a() { // from class: cm.aptoide.pt.autoupdate.x
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                AutoUpdateService.m40748loadAutoUpdateModel$lambda1(this.f8240f);
            }
        }).m40123z(new InterfaceC11252a() { // from class: cm.aptoide.pt.autoupdate.w
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                AutoUpdateService.m40749loadAutoUpdateModel$lambda2(this.f8239f);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.autoupdate.u
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return AutoUpdateService.m40750loadAutoUpdateModel$lambda3(this.f8237f, (AutoUpdateJsonResponse) obj);
            }
        }).m40105p0(new InterfaceC11256e() { // from class: cm.aptoide.pt.autoupdate.v
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return AutoUpdateService.m40751loadAutoUpdateModel$lambda4(this.f8238f, (Throwable) obj);
            }
        }).m40085Z0();
        C9801m.m32345e(singleM40085Z0, "service.getAutoUpdateRes…it) }\n        .toSingle()");
        return singleM40085Z0;
    }
}
