package cm.aptoide.p092pt.home.more.appcoins;

import cm.aptoide.p092pt.download.DownloadAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: EarnAppcListAnalytics.kt */
@Metadata(m32266d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m32267d2 = {"Lcm/aptoide/pt/home/more/appcoins/EarnAppcListAnalytics;", HttpUrl.FRAGMENT_ENCODE_SET, "downloadAnalytics", "Lcm/aptoide/pt/download/DownloadAnalytics;", "(Lcm/aptoide/pt/download/DownloadAnalytics;)V", "sendNotEnoughSpaceErrorEvent", HttpUrl.FRAGMENT_ENCODE_SET, "md5", HttpUrl.FRAGMENT_ENCODE_SET, "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class EarnAppcListAnalytics {
    private final DownloadAnalytics downloadAnalytics;

    public EarnAppcListAnalytics(DownloadAnalytics downloadAnalytics) {
        C9801m.m32346f(downloadAnalytics, "downloadAnalytics");
        this.downloadAnalytics = downloadAnalytics;
    }

    public final void sendNotEnoughSpaceErrorEvent(String md5) {
        this.downloadAnalytics.sendNotEnoughSpaceError(md5);
    }
}
