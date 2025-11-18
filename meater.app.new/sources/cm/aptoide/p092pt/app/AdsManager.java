package cm.aptoide.p092pt.app;

import cm.aptoide.p092pt.ads.AdsRepository;
import cm.aptoide.p092pt.ads.MinimalAd;
import cm.aptoide.p092pt.ads.MinimalAdMapper;
import cm.aptoide.p092pt.database.RoomStoredMinimalAdPersistence;
import cm.aptoide.p092pt.dataprovider.ads.AdNetworkUtils;
import cm.aptoide.p092pt.dataprovider.exception.NoNetworkConnectionException;
import cm.aptoide.p092pt.search.model.SearchAdResult;
import cm.aptoide.p092pt.view.app.AppsList;
import java.util.List;
import p456rx.C11234e;
import p456rx.Single;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public class AdsManager {
    private final MinimalAdMapper adMapper;
    private final AdsRepository adsRepository;
    private final RoomStoredMinimalAdPersistence storedMinimalAdPersistence;

    public AdsManager(AdsRepository adsRepository, RoomStoredMinimalAdPersistence roomStoredMinimalAdPersistence, MinimalAdMapper minimalAdMapper) {
        this.adsRepository = adsRepository;
        this.storedMinimalAdPersistence = roomStoredMinimalAdPersistence;
        this.adMapper = minimalAdMapper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createMinimalAdRequestResultError, reason: merged with bridge method [inline-methods] */
    public MinimalAdRequestResult m7020a(Throwable th) {
        return th instanceof NoNetworkConnectionException ? new MinimalAdRequestResult(AppsList.Error.NETWORK) : new MinimalAdRequestResult(AppsList.Error.GENERIC);
    }

    public void handleAdsLogic(SearchAdResult searchAdResult) {
        this.storedMinimalAdPersistence.insert(this.adMapper.map(searchAdResult, null));
        AdNetworkUtils.knockCpc(this.adMapper.map(searchAdResult));
    }

    public Single<MinimalAdRequestResult> loadAd(String str, List<String> list) {
        return this.adsRepository.loadAdsFromAppviewSuggested(str, list).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.a
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return C11234e.m40025S(new MinimalAdRequestResult((MinimalAd) ((List) obj).get(0)));
            }
        }).m40085Z0().m39926r(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.b
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7575f.m7020a((Throwable) obj);
            }
        });
    }

    public Single<MinimalAd> loadAds(String str, String str2) {
        return this.adsRepository.loadAdsFromAppView(str, str2).m40085Z0();
    }
}
