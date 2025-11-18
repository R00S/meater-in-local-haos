package cm.aptoide.p092pt.app;

import cm.aptoide.p092pt.ads.data.ApplicationAd;
import cm.aptoide.p092pt.ads.data.ApplicationAdError;

/* loaded from: classes.dex */
public interface ApplicationAdResult {
    ApplicationAd getAd();

    ApplicationAdError getError();
}
