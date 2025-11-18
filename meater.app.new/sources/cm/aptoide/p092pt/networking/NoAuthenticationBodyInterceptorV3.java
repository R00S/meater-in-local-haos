package cm.aptoide.p092pt.networking;

import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p100v3.BaseBody;
import cm.aptoide.p092pt.preferences.AptoideMd5Manager;
import p456rx.Single;
import p456rx.p460m.InterfaceC11256e;
import p456rx.schedulers.Schedulers;

/* loaded from: classes.dex */
public class NoAuthenticationBodyInterceptorV3 implements BodyInterceptor<BaseBody> {
    private final AptoideMd5Manager aptoideMd5Manager;
    private final String aptoidePackage;
    private final IdsRepository idsRepository;

    public NoAuthenticationBodyInterceptorV3(IdsRepository idsRepository, AptoideMd5Manager aptoideMd5Manager, String str) {
        this.aptoideMd5Manager = aptoideMd5Manager;
        this.aptoidePackage = str;
        this.idsRepository = idsRepository;
    }

    private /* synthetic */ BaseBody lambda$intercept$0(BaseBody baseBody, String str) {
        String aptoideMd5 = this.aptoideMd5Manager.getAptoideMd5();
        if (!aptoideMd5.isEmpty()) {
            baseBody.setAptoideMd5sum(aptoideMd5);
        }
        baseBody.setAptoidePackage(this.aptoidePackage);
        baseBody.setAptoideUid(str);
        return baseBody;
    }

    /* renamed from: a */
    public /* synthetic */ BaseBody m8302a(BaseBody baseBody, String str) {
        lambda$intercept$0(baseBody, str);
        return baseBody;
    }

    @Override // cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor
    public Single<BaseBody> intercept(final BaseBody baseBody) {
        return this.idsRepository.getUniqueIdentifier().m39923n(new InterfaceC11256e() { // from class: cm.aptoide.pt.networking.q
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                NoAuthenticationBodyInterceptorV3 noAuthenticationBodyInterceptorV3 = this.f10336f;
                BaseBody baseBody2 = baseBody;
                noAuthenticationBodyInterceptorV3.m8302a(baseBody2, (String) obj);
                return baseBody2;
            }
        }).m39930v(Schedulers.computation());
    }
}
