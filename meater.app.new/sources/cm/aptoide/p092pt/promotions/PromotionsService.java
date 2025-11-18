package cm.aptoide.p092pt.promotions;

import android.content.SharedPreferences;
import cm.aptoide.p092pt.aab.Split;
import cm.aptoide.p092pt.aab.SplitsMapper;
import cm.aptoide.p092pt.dataprovider.exception.AptoideWsV7Exception;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Obb;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBody;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.promotions.ClaimPromotionRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.promotions.GetPackagePromotionsRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.promotions.GetPackagePromotionsResponse;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.promotions.GetPromotionAppsRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.promotions.GetPromotionAppsResponse;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.promotions.GetPromotionsRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.promotions.GetPromotionsResponse;
import cm.aptoide.p092pt.promotions.ClaimStatusWrapper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import okhttp3.OkHttpClient;
import p456rx.Single;
import p456rx.p460m.InterfaceC11256e;
import retrofit2.Converter;

/* loaded from: classes.dex */
public class PromotionsService {
    private static final String ALREADY_CLAIMED = "PROMOTION-3";
    private static final String WALLET_NOT_VERIFIED = "PROMOTION-5";
    private static final String WRONG_ADDRESS = "PROMOTION-2";
    private final BodyInterceptor<BaseBody> bodyInterceptorPoolV7;
    private final Converter.Factory converterFactory;
    private final OkHttpClient okHttpClient;
    private final SharedPreferences sharedPreferences;
    private final SplitsMapper splitsMapper;
    private final TokenInvalidator tokenInvalidator;
    private String walletAddress;

    public PromotionsService(BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, TokenInvalidator tokenInvalidator, Converter.Factory factory, SharedPreferences sharedPreferences, SplitsMapper splitsMapper) {
        this.bodyInterceptorPoolV7 = bodyInterceptor;
        this.okHttpClient = okHttpClient;
        this.tokenInvalidator = tokenInvalidator;
        this.converterFactory = factory;
        this.sharedPreferences = sharedPreferences;
        this.splitsMapper = splitsMapper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$claimPromotion$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ ClaimStatusWrapper m8585a(Throwable th) {
        if (th instanceof AptoideWsV7Exception) {
            return mapClaim(((AptoideWsV7Exception) th).getBaseResponse());
        }
        throw new RuntimeException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: map, reason: merged with bridge method [inline-methods] */
    public List<PromotionMeta> m8586b(GetPromotionsResponse getPromotionsResponse) {
        ArrayList arrayList = new ArrayList();
        if (getPromotionsResponse.getDataList() != null && getPromotionsResponse.getDataList().getList() != null) {
            for (GetPromotionsResponse.PromotionModel promotionModel : getPromotionsResponse.getDataList().getList()) {
                arrayList.add(new PromotionMeta(promotionModel.getTitle(), promotionModel.getPromotionId(), promotionModel.getType(), promotionModel.getBackground(), promotionModel.getDialogDescription(), promotionModel.getDescription()));
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ClaimStatusWrapper mapClaim(BaseV7Response baseV7Response) {
        return new ClaimStatusWrapper(mapStatus(baseV7Response.getInfo().getStatus()), mapError(baseV7Response.getErrors()));
    }

    private List<ClaimStatusWrapper.Error> mapError(List<BaseV7Response.Error> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (BaseV7Response.Error error : list) {
                if (error.getCode().equals(WRONG_ADDRESS)) {
                    arrayList.add(ClaimStatusWrapper.Error.WRONG_ADDRESS);
                } else if (error.getCode().equals(ALREADY_CLAIMED)) {
                    arrayList.add(ClaimStatusWrapper.Error.PROMOTION_CLAIMED);
                } else if (error.getCode().equals(WALLET_NOT_VERIFIED)) {
                    arrayList.add(ClaimStatusWrapper.Error.WALLET_NOT_VERIFIED);
                } else {
                    arrayList.add(ClaimStatusWrapper.Error.GENERIC);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<PromotionApp> mapPromotionsResponse(GetPromotionAppsResponse getPromotionAppsResponse) {
        Iterator<GetPromotionAppsResponse.PromotionAppModel> it;
        List<Split> listEmptyList;
        ArrayList arrayList = new ArrayList();
        if (getPromotionAppsResponse != null && getPromotionAppsResponse.getDataList() != null && getPromotionAppsResponse.getDataList().getList() != null) {
            for (Iterator<GetPromotionAppsResponse.PromotionAppModel> it2 = getPromotionAppsResponse.getDataList().getList().iterator(); it2.hasNext(); it2 = it) {
                GetPromotionAppsResponse.PromotionAppModel next = it2.next();
                String name = next.getApp().getName();
                String packageName = next.getApp().getPackageName();
                long id = next.getApp().getId();
                String path = next.getApp().getFile().getPath();
                String pathAlt = next.getApp().getFile().getPathAlt();
                String icon = next.getApp().getIcon();
                String promotionDescription = next.getPromotionDescription();
                long size = next.getApp().getSize();
                float avg = next.getApp().getStats().getRating().getAvg();
                int downloads = next.getApp().getStats().getDownloads();
                String md5sum = next.getApp().getFile().getMd5sum();
                int vercode = next.getApp().getFile().getVercode();
                boolean zIsClaimed = next.isClaimed();
                String vername = next.getApp().getFile().getVername();
                Obb obb = next.getApp().getObb();
                float appc = next.getAppc();
                String sha1 = next.getApp().getFile().getSignature().getSha1();
                boolean z = next.getApp().hasAdvertising() || next.getApp().hasBilling();
                if (next.getApp().hasSplits()) {
                    it = it2;
                    listEmptyList = this.splitsMapper.mapSplits(next.getApp().getAab().getSplits());
                } else {
                    it = it2;
                    listEmptyList = Collections.emptyList();
                }
                arrayList.add(new PromotionApp(name, packageName, id, path, pathAlt, icon, promotionDescription, size, avg, downloads, md5sum, vercode, zIsClaimed, vername, obb, appc, sha1, z, listEmptyList, next.getApp().hasSplits() ? next.getApp().getAab().getRequiredSplits() : Collections.emptyList(), next.getApp().getFile().getMalware().getRank().toString(), next.getApp().getStore().getName(), next.getFiat().getAmount(), next.getFiat().getSymbol(), next.getApp().getBdsFlags()));
            }
        }
        return arrayList;
    }

    private ClaimStatusWrapper.Status mapStatus(BaseV7Response.Info.Status status) {
        return status.equals(BaseV7Response.Info.Status.OK) ? ClaimStatusWrapper.Status.OK : ClaimStatusWrapper.Status.FAIL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<Promotion> mapToPromotion(GetPackagePromotionsResponse getPackagePromotionsResponse) {
        ArrayList arrayList = new ArrayList();
        if (getPackagePromotionsResponse != null && getPackagePromotionsResponse.getDataList() != null && getPackagePromotionsResponse.getDataList().getList() != null) {
            for (GetPackagePromotionsResponse.PromotionAppModel promotionAppModel : getPackagePromotionsResponse.getDataList().getList()) {
                arrayList.add(new Promotion(promotionAppModel.isClaimed(), promotionAppModel.getAppc(), promotionAppModel.getPackageName(), promotionAppModel.getPromotionId(), Collections.emptyList()));
            }
        }
        return arrayList;
    }

    public Single<ClaimStatusWrapper> claimPromotion(String str, String str2, String str3) {
        return ClaimPromotionRequest.m7480of(str, str2, str3, this.bodyInterceptorPoolV7, this.okHttpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences).observe(true).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.promotions.w6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10907f.mapClaim((BaseV7Response) obj);
            }
        }).m40105p0(new InterfaceC11256e() { // from class: cm.aptoide.pt.promotions.t6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10881f.m8585a((Throwable) obj);
            }
        }).m40085Z0();
    }

    public Single<List<PromotionApp>> getPromotionApps(String str) {
        return GetPromotionAppsRequest.m7482of(str, this.bodyInterceptorPoolV7, this.okHttpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences).observe(false, false).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.promotions.v6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10899f.mapPromotionsResponse((GetPromotionAppsResponse) obj);
            }
        }).m40085Z0();
    }

    public Single<List<PromotionMeta>> getPromotions(String str) {
        return GetPromotionsRequest.m7483of(str, this.bodyInterceptorPoolV7, this.okHttpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences).observe().m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.promotions.s6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10873f.m8586b((GetPromotionsResponse) obj);
            }
        }).m40085Z0();
    }

    public Single<List<Promotion>> getPromotionsForPackage(String str) {
        return GetPackagePromotionsRequest.m7481of(str, this.bodyInterceptorPoolV7, this.okHttpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences).observe(false, false).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.promotions.u6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10890f.mapToPromotion((GetPackagePromotionsResponse) obj);
            }
        }).m40085Z0();
    }

    public String getWalletAddress() {
        return this.walletAddress;
    }

    public void saveWalletAddress(String str) {
        this.walletAddress = str;
    }

    private List<Split> map(List<cm.aptoide.p092pt.dataprovider.model.p096v7.Split> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (cm.aptoide.p092pt.dataprovider.model.p096v7.Split split : list) {
            arrayList.add(new Split(split.getName(), split.getType(), split.getPath(), split.getFilesize(), split.getMd5sum()));
        }
        return arrayList;
    }
}
