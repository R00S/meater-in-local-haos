package cm.aptoide.p092pt.analytics;

import cm.aptoide.p092pt.file.CacheHelper;
import kotlin.Metadata;
import okhttp3.HttpUrl;

/* compiled from: AppSizeAnalyticsStringMapper.kt */
@Metadata(m32266d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u0006"}, m32267d2 = {"Lcm/aptoide/pt/analytics/AppSizeAnalyticsStringMapper;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "mapAppSizeToMBBucketValue", HttpUrl.FRAGMENT_ENCODE_SET, "appSize", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class AppSizeAnalyticsStringMapper {
    public final long mapAppSizeToMBBucketValue(long appSize) {
        long j2 = 100;
        return (((appSize / CacheHelper.VALUE_TO_CONVERT_MB_TO_BYTES) / j2) * j2) + j2;
    }
}
