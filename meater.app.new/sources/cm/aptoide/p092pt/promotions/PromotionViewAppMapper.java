package cm.aptoide.p092pt.promotions;

import cm.aptoide.p092pt.app.DownloadModel;
import cm.aptoide.p092pt.app.DownloadStateParser;
import cm.aptoide.p092pt.install.Install;

/* loaded from: classes.dex */
public class PromotionViewAppMapper {
    private final DownloadStateParser downloadStateParser;

    public PromotionViewAppMapper(DownloadStateParser downloadStateParser) {
        this.downloadStateParser = downloadStateParser;
    }

    private DownloadModel getDownloadModel(Install.InstallationType installationType, int i2, Install.InstallationStatus installationStatus, boolean z, long j2) {
        return new DownloadModel(this.downloadStateParser.parseDownloadType(installationType, false), i2, this.downloadStateParser.parseDownloadState(installationStatus, z), j2);
    }

    public PromotionViewApp mapInstallToPromotionApp(Install install, PromotionApp promotionApp) {
        return new PromotionViewApp(getDownloadModel(install.getType(), install.getProgress(), install.getState(), install.isIndeterminate(), install.getAppSize()), promotionApp.getName(), promotionApp.getPackageName(), promotionApp.getAppId(), promotionApp.getDownloadPath(), promotionApp.getAlternativePath(), promotionApp.getAppIcon(), promotionApp.isClaimed(), promotionApp.getDescription(), promotionApp.getSize(), promotionApp.getRating(), promotionApp.getNumberOfDownloads(), promotionApp.getMd5(), promotionApp.getVersionCode(), promotionApp.getVersionName(), promotionApp.getObb(), promotionApp.getAppcValue(), promotionApp.getSignature(), promotionApp.hasAppc(), promotionApp.getSplits(), promotionApp.getRequiredSplits(), promotionApp.getRank(), promotionApp.getStoreName(), promotionApp.getFiatValue(), promotionApp.getFiatSymbol(), promotionApp.getBdsFlags());
    }
}
