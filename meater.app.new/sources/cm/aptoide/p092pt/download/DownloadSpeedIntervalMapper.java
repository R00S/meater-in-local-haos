package cm.aptoide.p092pt.download;

import kotlin.Metadata;
import kotlin.Pair;
import okhttp3.HttpUrl;

/* compiled from: DownloadSpeedIntervalMapper.kt */
@Metadata(m32266d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m32267d2 = {"Lcm/aptoide/pt/download/DownloadSpeedIntervalMapper;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "getDownloadSpeedInterval", "Lkotlin/Pair;", HttpUrl.FRAGMENT_ENCODE_SET, "kilobytesPerSecond", HttpUrl.FRAGMENT_ENCODE_SET, "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class DownloadSpeedIntervalMapper {
    public final Pair<String, String> getDownloadSpeedInterval(long j2) {
        String str;
        double d2 = j2 * 1024;
        if (d2 >= 1024.0d) {
            double d3 = 1024;
            Double.isNaN(d2);
            Double.isNaN(d3);
            d2 /= d3;
            str = "KBPS";
        } else {
            str = "BPS";
        }
        if (d2 >= 1024.0d) {
            double d4 = 1024;
            Double.isNaN(d4);
            d2 /= d4;
            str = "MBPS";
        }
        if (d2 >= 1024.0d) {
            double d5 = 1024;
            Double.isNaN(d5);
            d2 /= d5;
            str = "GBPS";
        }
        return new Pair<>((d2 > 0.0d ? 1 : (d2 == 0.0d ? 0 : -1)) == 0 ? "0" : d2 <= 2.0d ? "1-2" : d2 <= 5.0d ? "3-5" : d2 <= 10.0d ? "6-10" : d2 <= 20.0d ? "11-20" : d2 <= 50.0d ? "21-50" : d2 <= 100.0d ? "51-100" : d2 <= 200.0d ? "101-200" : d2 <= 500.0d ? "201-500" : d2 <= 1000.0d ? "501-1000" : ">1000", str);
    }
}
