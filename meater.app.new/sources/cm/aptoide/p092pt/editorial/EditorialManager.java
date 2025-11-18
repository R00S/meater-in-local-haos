package cm.aptoide.p092pt.editorial;

import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.p092pt.aab.DynamicSplitsManager;
import cm.aptoide.p092pt.aab.DynamicSplitsModel;
import cm.aptoide.p092pt.ads.MoPubAdsManager;
import cm.aptoide.p092pt.app.DownloadStateParser;
import cm.aptoide.p092pt.app.mmpcampaigns.CampaignManager;
import cm.aptoide.p092pt.database.room.RoomDownload;
import cm.aptoide.p092pt.download.DownloadAnalytics;
import cm.aptoide.p092pt.download.DownloadFactory;
import cm.aptoide.p092pt.download.SplitAnalyticsMapper;
import cm.aptoide.p092pt.install.Install;
import cm.aptoide.p092pt.install.InstallAnalytics;
import cm.aptoide.p092pt.install.InstallManager;
import cm.aptoide.p092pt.notification.NotificationAnalytics;
import cm.aptoide.p092pt.reactions.ReactionsManager;
import cm.aptoide.p092pt.reactions.network.LoadReactionModel;
import cm.aptoide.p092pt.reactions.network.ReactionsResponse;
import cm.aptoide.p092pt.view.EditorialConfiguration;
import java.util.List;
import okhttp3.HttpUrl;
import p319g.p320a.p321a.p322a.C9059d;
import p456rx.C11231b;
import p456rx.C11234e;
import p456rx.Single;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public class EditorialManager {
    private final CampaignManager campaignManager;
    private final DownloadFactory downloadFactory;
    private final DownloadStateParser downloadStateParser;
    private final DynamicSplitsManager dynamicSplitsManager;
    private final EditorialAnalytics editorialAnalytics;
    private final EditorialConfiguration editorialConfiguration;
    private final EditorialRepository editorialRepository;
    private final InstallAnalytics installAnalytics;
    private final InstallManager installManager;
    private final MoPubAdsManager moPubAdsManager;
    private final NotificationAnalytics notificationAnalytics;
    private final ReactionsManager reactionsManager;
    private final SplitAnalyticsMapper splitAnalyticsMapper;

    public EditorialManager(EditorialRepository editorialRepository, EditorialConfiguration editorialConfiguration, InstallManager installManager, DownloadFactory downloadFactory, DownloadStateParser downloadStateParser, NotificationAnalytics notificationAnalytics, InstallAnalytics installAnalytics, EditorialAnalytics editorialAnalytics, ReactionsManager reactionsManager, MoPubAdsManager moPubAdsManager, DynamicSplitsManager dynamicSplitsManager, SplitAnalyticsMapper splitAnalyticsMapper, CampaignManager campaignManager) {
        this.editorialRepository = editorialRepository;
        this.editorialConfiguration = editorialConfiguration;
        this.installManager = installManager;
        this.downloadFactory = downloadFactory;
        this.downloadStateParser = downloadStateParser;
        this.notificationAnalytics = notificationAnalytics;
        this.installAnalytics = installAnalytics;
        this.editorialAnalytics = editorialAnalytics;
        this.reactionsManager = reactionsManager;
        this.moPubAdsManager = moPubAdsManager;
        this.dynamicSplitsManager = dynamicSplitsManager;
        this.splitAnalyticsMapper = splitAnalyticsMapper;
        this.campaignManager = campaignManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$downloadApp$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7633a(EditorialDownloadEvent editorialDownloadEvent, DynamicSplitsModel dynamicSplitsModel) {
        return C11234e.m40025S(this.downloadFactory.create(this.downloadStateParser.parseDownloadAction(editorialDownloadEvent.getAction()), editorialDownloadEvent.getAppName(), editorialDownloadEvent.getPackageName(), editorialDownloadEvent.getMd5(), editorialDownloadEvent.getIcon(), editorialDownloadEvent.getVerName(), editorialDownloadEvent.getVerCode(), editorialDownloadEvent.getPath(), editorialDownloadEvent.getPathAlt(), editorialDownloadEvent.getObb(), false, editorialDownloadEvent.getSize(), editorialDownloadEvent.getSplits(), editorialDownloadEvent.getRequiredSplits(), editorialDownloadEvent.getTrustedBadge(), editorialDownloadEvent.getTrustedBadge(), dynamicSplitsModel.getDynamicSplitsList()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$downloadApp$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7634b(EditorialDownloadEvent editorialDownloadEvent, RoomDownload roomDownload) {
        setupDownloadEvents(roomDownload, editorialDownloadEvent.getPackageName(), editorialDownloadEvent.getAppId(), editorialDownloadEvent.getTrustedBadge(), editorialDownloadEvent.getStoreName(), editorialDownloadEvent.getAction().toString(), editorialDownloadEvent.getBdsFlags().contains("STORE_BDS"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$downloadApp$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m7635c(RoomDownload roomDownload) {
        return this.installManager.m8236x(roomDownload);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadDownloadModel$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ EditorialDownloadModel m7636d(int i2, Install install) {
        return new EditorialDownloadModel(this.downloadStateParser.parseDownloadType(install.getType(), false), install.getProgress(), this.downloadStateParser.parseDownloadState(install.getState(), install.isIndeterminate()), i2, install.getAppSize());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$resumeDownload$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7637e(String str, long j2, String str2, List list, RoomDownload roomDownload) {
        setupDownloadEvents(roomDownload, str, j2, roomDownload.getTrustedBadge(), roomDownload.getStoreName(), str2, list.contains("STORE_BDS"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$resumeDownload$5, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m7638f(RoomDownload roomDownload) {
        return this.installManager.m8236x(roomDownload);
    }

    private void setupDownloadEvents(RoomDownload roomDownload, String str, long j2, String str2, String str3, String str4, boolean z) {
        int campaignId = this.notificationAnalytics.getCampaignId(str, j2);
        String abTestingGroup = this.notificationAnalytics.getAbTestingGroup(str, j2);
        this.editorialAnalytics.setupDownloadEvents(roomDownload, campaignId, abTestingGroup, AnalyticsManager.Action.CLICK, str2, str3, str4, z);
        this.installAnalytics.installStarted(roomDownload.getPackageName(), roomDownload.getVersionCode(), AnalyticsManager.Action.INSTALL, DownloadAnalytics.AppContext.EDITORIAL, this.downloadStateParser.getOrigin(roomDownload.getAction()), campaignId, abTestingGroup, false, roomDownload.hasAppc(), roomDownload.hasSplits(), roomDownload.getTrustedBadge(), roomDownload.getStoreName(), false, roomDownload.hasObbs(), this.splitAnalyticsMapper.getSplitTypesAsString(roomDownload.getSplits()), z, HttpUrl.FRAGMENT_ENCODE_SET, roomDownload.getSize());
    }

    public void allowRootInstall(Boolean bool) {
        this.installManager.rootInstallAllowed(bool.booleanValue());
    }

    public C11231b cancelDownload(String str, String str2, int i2) {
        return this.installManager.cancelInstall(str, str2, i2);
    }

    public C11231b convertCampaign(EditorialDownloadEvent editorialDownloadEvent) {
        return C9059d.m29123a(this.campaignManager.convertCampaign(editorialDownloadEvent.getCampaign(), "Editorial"));
    }

    public Single<ReactionsResponse> deleteReaction(String str, String str2) {
        return this.reactionsManager.deleteReaction(str, str2);
    }

    public C11231b downloadApp(final EditorialDownloadEvent editorialDownloadEvent) {
        return C9059d.m29126d(this.dynamicSplitsManager.getAppSplitsByMd5(editorialDownloadEvent.getMd5())).m39922k(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.i0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8991f.m7633a(editorialDownloadEvent, (DynamicSplitsModel) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.editorial.f0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8961f.m7634b(editorialDownloadEvent, (RoomDownload) obj);
            }
        }).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.k0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9016f.m7635c((RoomDownload) obj);
            }
        }).m40083X0();
    }

    public Single<Boolean> isFirstReaction(String str, String str2) {
        return this.reactionsManager.isFirstReaction(str, str2);
    }

    public C11234e<EditorialDownloadModel> loadDownloadModel(String str, String str2, int i2, final int i3) {
        return this.installManager.getInstall(str, str2, i2).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.j0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9006f.m7636d(i3, (Install) obj);
            }
        });
    }

    public Single<EditorialViewModel> loadEditorialViewModel() {
        return this.editorialRepository.loadEditorialViewModel(this.editorialConfiguration.getLoadSource());
    }

    public Single<LoadReactionModel> loadReactionModel(String str, String str2) {
        return this.reactionsManager.loadReactionModel(str, str2);
    }

    public C11231b pauseDownload(String str) {
        return this.installManager.pauseInstall(str);
    }

    public C11231b resumeDownload(String str, final String str2, final long j2, final String str3, final List<String> list) {
        return this.installManager.getDownload(str).m39919g(new InterfaceC11253b() { // from class: cm.aptoide.pt.editorial.g0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8970f.m7637e(str2, j2, str3, list, (RoomDownload) obj);
            }
        }).m39921j(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.h0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8982f.m7638f((RoomDownload) obj);
            }
        });
    }

    public Single<ReactionsResponse> setReaction(String str, String str2, String str3) {
        return this.reactionsManager.setReaction(str, str2, str3);
    }

    public boolean shouldShowRootInstallWarningPopup() {
        return this.installManager.showWarning();
    }
}
