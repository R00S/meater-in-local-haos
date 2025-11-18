package cm.aptoide.p092pt.view.app;

import android.content.SharedPreferences;
import cm.aptoide.p092pt.aab.SplitsMapper;
import cm.aptoide.p092pt.app.mmpcampaigns.CampaignMapper;
import cm.aptoide.p092pt.dataprovider.exception.NoNetworkConnectionException;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.model.p096v7.GetApp;
import cm.aptoide.p092pt.dataprovider.model.p096v7.GetAppMeta;
import cm.aptoide.p092pt.dataprovider.model.p096v7.ListApps;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Malware;
import cm.aptoide.p092pt.dataprovider.model.p096v7.listapp.App;
import cm.aptoide.p092pt.dataprovider.model.p096v7.listapp.File;
import cm.aptoide.p092pt.dataprovider.model.p096v7.listapp.ListAppVersions;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBody;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.GetAppRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.GetRecommendedRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.ListAppsRequest;
import cm.aptoide.p092pt.preferences.managed.ManagerPreferences;
import cm.aptoide.p092pt.store.StoreCredentialsProvider;
import cm.aptoide.p092pt.store.StoreUtils;
import cm.aptoide.p092pt.view.app.AppsList;
import cm.aptoide.p092pt.view.app.DetailedAppRequestResult;
import cm.aptoide.p092pt.view.app.FlagsVote;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import p456rx.C11234e;
import p456rx.Single;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p460m.InterfaceC11256e;
import retrofit2.Converter;

/* loaded from: classes.dex */
public class AppService {
    private static final int MATURE_APP_RATING = 18;
    private final BodyInterceptor<BaseBody> bodyInterceptorV7;
    private final CampaignMapper campaignMapper;
    private final Converter.Factory converterFactory;
    private final OkHttpClient httpClient;
    private boolean loadingAppcSimilarApps;
    private boolean loadingApps;
    private boolean loadingSimilarApps;
    private final SharedPreferences sharedPreferences;
    private final SplitsMapper splitsMapper;
    private final StoreCredentialsProvider storeCredentialsProvider;
    private final TokenInvalidator tokenInvalidator;

    /* renamed from: cm.aptoide.pt.view.app.AppService$1 */
    static /* synthetic */ class C46871 {

        /* renamed from: $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$GetAppMeta$GetAppMetaFile$Flags$Vote$Type */
        static final /* synthetic */ int[] f11689xb9b5ac52;

        static {
            int[] iArr = new int[GetAppMeta.GetAppMetaFile.Flags.Vote.Type.values().length];
            f11689xb9b5ac52 = iArr;
            try {
                iArr[GetAppMeta.GetAppMetaFile.Flags.Vote.Type.FAKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11689xb9b5ac52[GetAppMeta.GetAppMetaFile.Flags.Vote.Type.GOOD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11689xb9b5ac52[GetAppMeta.GetAppMetaFile.Flags.Vote.Type.VIRUS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11689xb9b5ac52[GetAppMeta.GetAppMetaFile.Flags.Vote.Type.FREEZE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11689xb9b5ac52[GetAppMeta.GetAppMetaFile.Flags.Vote.Type.LICENSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public AppService(StoreCredentialsProvider storeCredentialsProvider, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, SplitsMapper splitsMapper, CampaignMapper campaignMapper) {
        this.storeCredentialsProvider = storeCredentialsProvider;
        this.bodyInterceptorV7 = bodyInterceptor;
        this.httpClient = okHttpClient;
        this.converterFactory = factory;
        this.tokenInvalidator = tokenInvalidator;
        this.sharedPreferences = sharedPreferences;
        this.splitsMapper = splitsMapper;
        this.campaignMapper = campaignMapper;
    }

    private boolean canCompare(ListAppVersions listAppVersions) {
        return (listAppVersions == null || listAppVersions.getList() == null || listAppVersions.getList().isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createDetailedAppRequestResultError, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public DetailedAppRequestResult m8926N(Throwable th) {
        return th instanceof NoNetworkConnectionException ? new DetailedAppRequestResult(DetailedAppRequestResult.Error.NETWORK) : new DetailedAppRequestResult(DetailedAppRequestResult.Error.GENERIC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createErrorAppsList, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AppsList m8921I(Throwable th) {
        return th instanceof NoNetworkConnectionException ? new AppsList(AppsList.Error.NETWORK) : new AppsList(AppsList.Error.GENERIC);
    }

    private String getCategory(GetApp.Nodes nodes) {
        try {
            return !nodes.getGroups().getDataList().getList().isEmpty() ? nodes.getGroups().getDataList().getList().get(0).getParent().getName() : HttpUrl.FRAGMENT_ENCODE_SET;
        } catch (Exception e2) {
            e2.printStackTrace();
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    private boolean isBeta(List<String> list, String str) {
        for (String str2 : list) {
            if ("beta".equals(str2) || "alpha".equals(str2)) {
                return true;
            }
        }
        return str.contains("alpha") || str.contains("beta");
    }

    private boolean isLatestTrustedVersion(ListAppVersions listAppVersions, File file) {
        return canCompare(listAppVersions) && file.getMd5sum().equals(listAppVersions.getList().get(0).getFile().getMd5sum()) && file.getMalware().getRank() == Malware.Rank.TRUSTED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadAppcRecommendedApps$35, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8927a() {
        this.loadingAppcSimilarApps = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadAppcRecommendedApps$36, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8928b() {
        this.loadingAppcSimilarApps = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadAppcRecommendedApps$37, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8929c() {
        this.loadingAppcSimilarApps = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadApps$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8932f() {
        this.loadingApps = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadApps$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8933g() {
        this.loadingApps = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadApps$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8934h() {
        this.loadingApps = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadDetailedApp$15, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8937k() {
        this.loadingApps = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadDetailedApp$16, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8938l() {
        this.loadingApps = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadDetailedApp$17, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8939m() {
        this.loadingApps = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadDetailedApp$18, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8940n(GetApp getApp) {
        return lambda$loadDetailedAppFromUniqueName$28(getApp, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadDetailedApp$5, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8942p() {
        this.loadingApps = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadDetailedApp$6, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8943q() {
        this.loadingApps = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadDetailedApp$7, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8944r() {
        this.loadingApps = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadDetailedApp$8, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8945s(GetApp getApp) {
        return lambda$loadDetailedAppFromUniqueName$28(getApp, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadDetailedApp$9, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ DetailedAppRequestResult m8946t(Throwable th) {
        th.printStackTrace();
        return lambda$unsafeLoadDetailedApp$14(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadDetailedAppFromMd5$20, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8947u() {
        this.loadingApps = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadDetailedAppFromMd5$21, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8948v() {
        this.loadingApps = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadDetailedAppFromMd5$22, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8949w() {
        this.loadingApps = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadDetailedAppFromMd5$23, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8950x(GetApp getApp) {
        return lambda$loadDetailedAppFromUniqueName$28(getApp, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadDetailedAppFromUniqueName$25, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8952z() {
        this.loadingApps = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadDetailedAppFromUniqueName$26, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8913A() {
        this.loadingApps = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadDetailedAppFromUniqueName$27, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8914B() {
        this.loadingApps = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadRecommendedApps$30, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8917E() {
        this.loadingSimilarApps = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadRecommendedApps$31, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8918F() {
        this.loadingSimilarApps = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadRecommendedApps$32, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8919G() {
        this.loadingSimilarApps = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$unsafeLoadDetailedApp$10, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8922J() {
        this.loadingApps = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$unsafeLoadDetailedApp$11, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8923K() {
        this.loadingApps = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$unsafeLoadDetailedApp$12, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8924L() {
        this.loadingApps = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$unsafeLoadDetailedApp$13, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8925M(GetApp getApp) {
        return lambda$loadDetailedAppFromUniqueName$28(getApp, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    private Single<AppsList> loadApps(long j2, boolean z, int i2, int i3) {
        if (this.loadingApps) {
            return Single.m39913m(new AppsList(true));
        }
        ListAppsRequest.Body body = new ListAppsRequest.Body(this.storeCredentialsProvider.get(j2), i3, this.sharedPreferences);
        body.setOffset(i2);
        body.setStoreId(j2);
        return new ListAppsRequest(body, this.bodyInterceptorV7, this.httpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences).observe(z, false).m40121y(new InterfaceC11252a() { // from class: cm.aptoide.pt.view.app.v0
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f11764f.m8932f();
            }
        }).m40051A(new InterfaceC11252a() { // from class: cm.aptoide.pt.view.app.n0
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f11740f.m8933g();
            }
        }).m40123z(new InterfaceC11252a() { // from class: cm.aptoide.pt.view.app.a0
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f11692f.m8934h();
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.app.l0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11733f.m8935i((ListApps) obj);
            }
        }).m40085Z0().m39926r(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.app.d0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11705f.m8936j((Throwable) obj);
            }
        });
    }

    private FlagsVote.VoteType map(GetAppMeta.GetAppMetaFile.Flags.Vote.Type type) {
        int i2 = C46871.f11689xb9b5ac52[type.ordinal()];
        if (i2 == 1) {
            return FlagsVote.VoteType.FAKE;
        }
        if (i2 == 2) {
            return FlagsVote.VoteType.GOOD;
        }
        if (i2 == 3) {
            return FlagsVote.VoteType.VIRUS;
        }
        if (i2 == 4) {
            return FlagsVote.VoteType.FREEZE;
        }
        if (i2 != 5) {
            return null;
        }
        return FlagsVote.VoteType.LICENSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mapApp, reason: merged with bridge method [inline-methods] */
    public C11234e<DetailedAppRequestResult> m8915C(GetApp getApp, String str) {
        if (!getApp.isOk()) {
            return C11234e.m40017C(new IllegalStateException("Could not obtain request from server."));
        }
        GetAppMeta.App data = getApp.getNodes().getMeta().getData();
        ListAppVersions versions = getApp.getNodes().getVersions();
        GetAppMeta.GetAppMetaFile file = data.getFile();
        GetAppMeta.GetAppMetaFile.Flags flags = data.getFile().getFlags();
        GetAppMeta.Developer developer = data.getDeveloper();
        GetAppMeta.Stats stats = data.getStats();
        GetAppMeta.Stats.Rating rating = stats.getRating();
        GetAppMeta.Stats.Rating globalRating = stats.getGlobalRating();
        GetAppMeta.Media media = data.getMedia();
        AppFlags appFlags = new AppFlags(flags.getReview(), mapToFlagsVote(flags.getVotes()));
        AppDeveloper appDeveloper = new AppDeveloper(developer.getName(), developer.getEmail(), developer.getPrivacy(), developer.getWebsite());
        AppStats appStats = new AppStats(new AppRating(rating.getAvg(), rating.getTotal(), mapToRatingsVote(rating.getVotes())), new AppRating(globalRating.getAvg(), globalRating.getTotal(), mapToRatingsVote(globalRating.getVotes())), stats.getDownloads(), stats.getPdownloads());
        return C11234e.m40025S(new DetailedAppRequestResult(new DetailedApp(data.getId(), data.getName(), data.getPackageName(), data.getSize(), data.getIcon(), data.getGraphic(), data.getAdded(), data.getModified(), file.isGoodApp(), file.getMalware(), appFlags, file.getTags(), file.getUsedFeatures(), file.getUsedPermissions(), file.getFilesize(), data.getMd5(), file.getPath(), file.getPathAlt(), file.getVercode(), file.getVername(), appDeveloper, data.getStore(), new AppMedia(media.getDescription(), media.getKeywords(), media.getNews(), mapToScreenShots(media.getScreenshots()), mapToVideo(media.getVideos())), appStats, data.getObb(), isLatestTrustedVersion(versions, file), data.getUname(), data.hasBilling(), data.hasAdvertising(), data.getBdsFlags(), data.getAge().getRating() == 18, data.getFile().getSignature().getSha1(), data.hasSplits() ? this.splitsMapper.mapSplits(data.getAab().getSplits()) : Collections.emptyList(), data.hasSplits() ? data.getAab().getRequiredSplits() : Collections.emptyList(), isBeta(file.getTags(), file.getVername()), getCategory(getApp.getNodes()), this.campaignMapper.mapCampaign(data.getUrls()))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mapListApps, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C11234e<AppsList> m8920H(ListApps listApps) {
        if (!listApps.isOk()) {
            return C11234e.m40017C(new IllegalStateException("Could not obtain request from server."));
        }
        ArrayList arrayList = new ArrayList();
        for (App app : listApps.getDataList().getList()) {
            arrayList.add(new Application(app.getName(), app.getIcon(), app.getStats().getRating().getAvg(), app.getStats().getDownloads(), app.getPackageName(), app.getId(), HttpUrl.FRAGMENT_ENCODE_SET, app.getAppcoins() != null && app.getAppcoins().hasBilling()));
        }
        return C11234e.m40025S(new AppsList(arrayList, false, listApps.getDataList().getNext()));
    }

    private List<FlagsVote> mapToFlagsVote(List<GetAppMeta.GetAppMetaFile.Flags.Vote> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (GetAppMeta.GetAppMetaFile.Flags.Vote vote : list) {
                arrayList.add(new FlagsVote(vote.getCount(), map(vote.getType())));
            }
        }
        return arrayList;
    }

    private List<RatingVote> mapToRatingsVote(List<GetAppMeta.Stats.Rating.Vote> list) {
        ArrayList arrayList = new ArrayList();
        for (GetAppMeta.Stats.Rating.Vote vote : list) {
            arrayList.add(new RatingVote(vote.getCount(), vote.getValue()));
        }
        return arrayList;
    }

    private List<AppScreenshot> mapToScreenShots(List<GetAppMeta.Media.Screenshot> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (GetAppMeta.Media.Screenshot screenshot : list) {
                arrayList.add(new AppScreenshot(screenshot.getHeight(), screenshot.getWidth(), screenshot.getOrientation(), screenshot.getUrl()));
            }
        }
        return arrayList;
    }

    private List<AppVideo> mapToVideo(List<GetAppMeta.Media.Video> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (GetAppMeta.Media.Video video : list) {
                arrayList.add(new AppVideo(video.getThumbnail(), video.getType(), video.getUrl()));
            }
        }
        return arrayList;
    }

    public Single<AppsList> loadAppcRecommendedApps(int i2, String str) {
        return this.loadingAppcSimilarApps ? Single.m39913m(new AppsList(true)) : new GetRecommendedRequest(new GetRecommendedRequest.Body(i2, str, "appc"), this.bodyInterceptorV7, this.httpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences).observe(true, false).m40121y(new InterfaceC11252a() { // from class: cm.aptoide.pt.view.app.k0
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f11730f.m8927a();
            }
        }).m40051A(new InterfaceC11252a() { // from class: cm.aptoide.pt.view.app.p0
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f11746f.m8928b();
            }
        }).m40123z(new InterfaceC11252a() { // from class: cm.aptoide.pt.view.app.x
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f11769f.m8929c();
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.app.h0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11720f.m8930d((ListApps) obj);
            }
        }).m40085Z0().m39926r(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.app.t
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11757f.m8931e((Throwable) obj);
            }
        });
    }

    public Single<DetailedAppRequestResult> loadDetailedApp(long j2, String str, String str2) {
        return this.loadingApps ? Single.m39913m(new DetailedAppRequestResult(true)) : GetAppRequest.m7440of(j2, null, StoreUtils.getStoreCredentials(str, this.storeCredentialsProvider), str2, this.bodyInterceptorV7, this.httpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences).observe(false, false).m40121y(new InterfaceC11252a() { // from class: cm.aptoide.pt.view.app.g0
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f11717f.m8942p();
            }
        }).m40051A(new InterfaceC11252a() { // from class: cm.aptoide.pt.view.app.t0
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f11758f.m8943q();
            }
        }).m40123z(new InterfaceC11252a() { // from class: cm.aptoide.pt.view.app.q0
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f11749f.m8944r();
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.app.u0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11761f.m8945s((GetApp) obj);
            }
        }).m40085Z0().m39926r(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.app.w0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11767f.m8946t((Throwable) obj);
            }
        });
    }

    public Single<DetailedAppRequestResult> loadDetailedAppFromMd5(String str) {
        return this.loadingApps ? Single.m39913m(new DetailedAppRequestResult(true)) : GetAppRequest.ofMd5(str, this.bodyInterceptorV7, this.httpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences).observe(false, ManagerPreferences.getAndResetForceServerRefresh(this.sharedPreferences)).m40121y(new InterfaceC11252a() { // from class: cm.aptoide.pt.view.app.s0
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f11755f.m8947u();
            }
        }).m40051A(new InterfaceC11252a() { // from class: cm.aptoide.pt.view.app.v
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f11763f.m8948v();
            }
        }).m40123z(new InterfaceC11252a() { // from class: cm.aptoide.pt.view.app.l
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f11732f.m8949w();
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.app.s
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11754f.m8950x((GetApp) obj);
            }
        }).m40085Z0().m39926r(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.app.z
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11775f.m8951y((Throwable) obj);
            }
        });
    }

    public Single<DetailedAppRequestResult> loadDetailedAppFromUniqueName(final String str) {
        return this.loadingApps ? Single.m39913m(new DetailedAppRequestResult(true)) : GetAppRequest.ofUname(str, this.bodyInterceptorV7, this.httpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences).observe(false, false).m40121y(new InterfaceC11252a() { // from class: cm.aptoide.pt.view.app.m0
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f11736f.m8952z();
            }
        }).m40051A(new InterfaceC11252a() { // from class: cm.aptoide.pt.view.app.y0
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f11773f.m8913A();
            }
        }).m40123z(new InterfaceC11252a() { // from class: cm.aptoide.pt.view.app.u
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f11760f.m8914B();
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.app.n
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11738f.m8915C(str, (GetApp) obj);
            }
        }).m40085Z0().m39926r(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.app.e0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11709f.m8916D((Throwable) obj);
            }
        });
    }

    public Single<AppsList> loadFreshApps(long j2, int i2) {
        return loadApps(j2, true, 0, i2);
    }

    public Single<AppsList> loadRecommendedApps(int i2, String str) {
        return this.loadingSimilarApps ? Single.m39913m(new AppsList(true)) : new GetRecommendedRequest(new GetRecommendedRequest.Body(i2, str), this.bodyInterceptorV7, this.httpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences).observe(true, false).m40121y(new InterfaceC11252a() { // from class: cm.aptoide.pt.view.app.w
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f11766f.m8917E();
            }
        }).m40051A(new InterfaceC11252a() { // from class: cm.aptoide.pt.view.app.r
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f11751f.m8918F();
            }
        }).m40123z(new InterfaceC11252a() { // from class: cm.aptoide.pt.view.app.y
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f11772f.m8919G();
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.app.b0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11696f.m8920H((ListApps) obj);
            }
        }).m40085Z0().m39926r(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.app.r0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11752f.m8921I((Throwable) obj);
            }
        });
    }

    public Single<DetailedAppRequestResult> unsafeLoadDetailedApp(long j2, String str, String str2) {
        return GetAppRequest.m7440of(j2, null, StoreUtils.getStoreCredentials(str, this.storeCredentialsProvider), str2, this.bodyInterceptorV7, this.httpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences).observe(false, false).m40121y(new InterfaceC11252a() { // from class: cm.aptoide.pt.view.app.o0
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f11743f.m8922J();
            }
        }).m40051A(new InterfaceC11252a() { // from class: cm.aptoide.pt.view.app.m
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f11735f.m8923K();
            }
        }).m40123z(new InterfaceC11252a() { // from class: cm.aptoide.pt.view.app.x0
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f11770f.m8924L();
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.app.f0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11713f.m8925M((GetApp) obj);
            }
        }).m40085Z0().m39926r(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.app.p
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11745f.m8926N((Throwable) obj);
            }
        });
    }

    public Single<DetailedAppRequestResult> loadDetailedApp(String str, String str2) {
        if (this.loadingApps) {
            return Single.m39913m(new DetailedAppRequestResult(true));
        }
        return GetAppRequest.m7443of(str, str2, this.bodyInterceptorV7, this.httpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences).observe(false, false).m40121y(new InterfaceC11252a() { // from class: cm.aptoide.pt.view.app.q
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f11748f.m8937k();
            }
        }).m40051A(new InterfaceC11252a() { // from class: cm.aptoide.pt.view.app.j0
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f11727f.m8938l();
            }
        }).m40123z(new InterfaceC11252a() { // from class: cm.aptoide.pt.view.app.c0
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f11700f.m8939m();
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.app.o
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11742f.m8940n((GetApp) obj);
            }
        }).m40085Z0().m39926r(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.app.i0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11724f.m8941o((Throwable) obj);
            }
        });
    }

    public Single<AppsList> loadApps(long j2, int i2, int i3) {
        return loadApps(j2, false, i2, i3);
    }
}
