package cm.aptoide.p092pt.networking;

import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store.RequestBodyFactory;
import cm.aptoide.p092pt.dataprovider.util.HashMapNotNull;
import okhttp3.RequestBody;
import p456rx.Single;
import p456rx.p460m.InterfaceC11256e;
import p456rx.schedulers.Schedulers;

/* loaded from: classes.dex */
public class MultipartBodyInterceptor implements BodyInterceptor<HashMapNotNull<String, RequestBody>> {
    private final AuthenticationPersistence authenticationPersistence;
    private final IdsRepository idsRepository;
    private final RequestBodyFactory requestBodyFactory;

    public MultipartBodyInterceptor(IdsRepository idsRepository, RequestBodyFactory requestBodyFactory, AuthenticationPersistence authenticationPersistence) {
        this.idsRepository = idsRepository;
        this.authenticationPersistence = authenticationPersistence;
        this.requestBodyFactory = requestBodyFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$intercept$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m8300a(Authentication authentication, HashMapNotNull hashMapNotNull, String str) {
        if (authentication.isAuthenticated()) {
            hashMapNotNull.put("access_token", this.requestBodyFactory.createBodyPartFromString(authentication.getAccessToken()));
        }
        hashMapNotNull.put("aptoide_uid", this.requestBodyFactory.createBodyPartFromString(str));
        return Single.m39913m(hashMapNotNull);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$intercept$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m8301b(final HashMapNotNull hashMapNotNull, final Authentication authentication) {
        return this.idsRepository.getUniqueIdentifier().m39920i(new InterfaceC11256e() { // from class: cm.aptoide.pt.networking.o
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10331f.m8300a(authentication, hashMapNotNull, (String) obj);
            }
        });
    }

    @Override // cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor
    public Single<HashMapNotNull<String, RequestBody>> intercept(final HashMapNotNull<String, RequestBody> hashMapNotNull) {
        return this.authenticationPersistence.getAuthentication().m39920i(new InterfaceC11256e() { // from class: cm.aptoide.pt.networking.p
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10334f.m8301b(hashMapNotNull, (Authentication) obj);
            }
        }).m39930v(Schedulers.computation());
    }
}
