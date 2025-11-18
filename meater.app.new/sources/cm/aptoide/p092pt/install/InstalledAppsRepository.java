package cm.aptoide.p092pt.install;

import java.util.List;
import kotlin.Metadata;
import okhttp3.HttpUrl;
import p323h.p324a.AbstractC9082s;

/* compiled from: InstalledAppsRepository.kt */
@Metadata(m32266d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&¨\u0006\u0006"}, m32267d2 = {"Lcm/aptoide/pt/install/InstalledAppsRepository;", HttpUrl.FRAGMENT_ENCODE_SET, "getInstalledAppsNames", "Lio/reactivex/Single;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public interface InstalledAppsRepository {
    AbstractC9082s<List<String>> getInstalledAppsNames();
}
