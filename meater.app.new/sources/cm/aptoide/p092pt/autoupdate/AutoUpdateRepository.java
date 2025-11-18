package cm.aptoide.p092pt.autoupdate;

import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;
import p456rx.Single;
import p456rx.p460m.InterfaceC11253b;

/* compiled from: AutoUpdateRepository.kt */
@Metadata(m32266d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0002J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bJ\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m32267d2 = {"Lcm/aptoide/pt/autoupdate/AutoUpdateRepository;", HttpUrl.FRAGMENT_ENCODE_SET, "autoUpdateService", "Lcm/aptoide/pt/autoupdate/AutoUpdateService;", "(Lcm/aptoide/pt/autoupdate/AutoUpdateService;)V", "autoUpdateModel", "Lcm/aptoide/pt/autoupdate/AutoUpdateModel;", "loadAndSaveAutoUpdateModel", "Lrx/Single;", "loadAutoUpdateModel", "loadFreshAutoUpdateModel", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class AutoUpdateRepository {
    private AutoUpdateModel autoUpdateModel;
    private final AutoUpdateService autoUpdateService;

    public AutoUpdateRepository(AutoUpdateService autoUpdateService) {
        C9801m.m32346f(autoUpdateService, "autoUpdateService");
        this.autoUpdateService = autoUpdateService;
    }

    private final Single<AutoUpdateModel> loadAndSaveAutoUpdateModel() {
        Single<AutoUpdateModel> singleM39919g = this.autoUpdateService.loadAutoUpdateModel().m39919g(new InterfaceC11253b() { // from class: cm.aptoide.pt.autoupdate.t
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AutoUpdateRepository.m40746loadAndSaveAutoUpdateModel$lambda0(this.f8236f, (AutoUpdateModel) obj);
            }
        });
        C9801m.m32345e(singleM39919g, "autoUpdateService.loadAu… { autoUpdateModel = it }");
        return singleM39919g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadAndSaveAutoUpdateModel$lambda-0, reason: not valid java name */
    public static final void m40746loadAndSaveAutoUpdateModel$lambda0(AutoUpdateRepository autoUpdateRepository, AutoUpdateModel autoUpdateModel) {
        C9801m.m32346f(autoUpdateRepository, "this$0");
        C9801m.m32345e(autoUpdateModel, "it");
        autoUpdateRepository.autoUpdateModel = autoUpdateModel;
    }

    public final Single<AutoUpdateModel> loadAutoUpdateModel() {
        AutoUpdateModel autoUpdateModel = this.autoUpdateModel;
        if (autoUpdateModel == null) {
            return loadAndSaveAutoUpdateModel();
        }
        if (autoUpdateModel == null) {
            C9801m.m32363w("autoUpdateModel");
            autoUpdateModel = null;
        }
        Single<AutoUpdateModel> singleM39913m = Single.m39913m(autoUpdateModel);
        C9801m.m32345e(singleM39913m, "{\n      Single.just(autoUpdateModel)\n    }");
        return singleM39913m;
    }

    public final Single<AutoUpdateModel> loadFreshAutoUpdateModel() {
        return loadAndSaveAutoUpdateModel();
    }
}
