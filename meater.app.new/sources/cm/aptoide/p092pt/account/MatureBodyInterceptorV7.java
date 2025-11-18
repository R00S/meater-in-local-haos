package cm.aptoide.p092pt.account;

import cm.aptoide.accountmanager.AdultContent;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBody;
import p456rx.Single;
import p456rx.p460m.InterfaceC11257f;

/* loaded from: classes.dex */
public class MatureBodyInterceptorV7 implements BodyInterceptor<BaseBody> {
    private final AdultContent adultContent;
    private final BodyInterceptor<BaseBody> bodyInterceptorV7;

    public MatureBodyInterceptorV7(BodyInterceptor<BaseBody> bodyInterceptor, AdultContent adultContent) {
        this.bodyInterceptorV7 = bodyInterceptor;
        this.adultContent = adultContent;
    }

    static /* synthetic */ BaseBody lambda$intercept$0(BaseBody baseBody, Boolean bool) {
        baseBody.setMature(bool.booleanValue());
        return baseBody;
    }

    @Override // cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor
    public Single<BaseBody> intercept(BaseBody baseBody) {
        return Single.m39907C(this.bodyInterceptorV7.intercept(baseBody), this.adultContent.enabled().m40057E().m40085Z0(), new InterfaceC11257f() { // from class: cm.aptoide.pt.account.t0
            @Override // p456rx.p460m.InterfaceC11257f
            /* renamed from: a */
            public final Object mo6865a(Object obj, Object obj2) {
                BaseBody baseBody2 = (BaseBody) obj;
                MatureBodyInterceptorV7.lambda$intercept$0(baseBody2, (Boolean) obj2);
                return baseBody2;
            }
        });
    }
}
