package cm.aptoide.p092pt.download;

import cm.aptoide.p092pt.aab.DynamicSplit;
import cm.aptoide.p092pt.account.AdultContentAnalytics;
import cm.aptoide.p092pt.database.room.RoomFileToDownload;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: SplitAnalyticsMapper.kt */
@Metadata(m32266d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002J\u001c\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u0014\u0010\t\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b¨\u0006\u000f"}, m32267d2 = {"Lcm/aptoide/pt/download/SplitAnalyticsMapper;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "buildSplitTypesAnalyticsString", HttpUrl.FRAGMENT_ENCODE_SET, "hasBase", HttpUrl.FRAGMENT_ENCODE_SET, "hasPFD", "hasPAD", "getSplitTypesAsString", "dynamicSplitsList", HttpUrl.FRAGMENT_ENCODE_SET, "Lcm/aptoide/pt/aab/DynamicSplit;", "splitsList", "Lcm/aptoide/pt/database/room/RoomFileToDownload;", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public class SplitAnalyticsMapper {
    private final String buildSplitTypesAnalyticsString(boolean hasBase, boolean hasPFD, boolean hasPAD) {
        return !hasBase ? AdultContentAnalytics.UNLOCK : (!hasBase || hasPAD || hasPFD) ? (hasBase && hasPAD && !hasPFD) ? "PAD" : (hasBase && !hasPAD && hasPFD) ? "PFD" : (hasBase && hasPAD && hasPFD) ? "PAD+PFD" : AdultContentAnalytics.UNLOCK : "base";
    }

    public final String getSplitTypesAsString(List<? extends RoomFileToDownload> splitsList) {
        C9801m.m32346f(splitsList, "splitsList");
        boolean z = !splitsList.isEmpty();
        boolean z2 = false;
        boolean z3 = false;
        for (RoomFileToDownload roomFileToDownload : splitsList) {
            if (roomFileToDownload.getSubFileType() == 11) {
                z2 = true;
            } else if (roomFileToDownload.getSubFileType() == 12) {
                z3 = true;
            }
        }
        return buildSplitTypesAnalyticsString(z, z2, z3);
    }

    public final String getSplitTypesAsString(boolean hasBase, List<DynamicSplit> dynamicSplitsList) {
        C9801m.m32346f(dynamicSplitsList, "dynamicSplitsList");
        boolean z = false;
        boolean z2 = false;
        for (DynamicSplit dynamicSplit : dynamicSplitsList) {
            if (C9801m.m32341a(dynamicSplit.getType(), "FEATURE")) {
                z = true;
            }
            if (C9801m.m32341a(dynamicSplit.getType(), "ASSET")) {
                z2 = true;
            }
        }
        return buildSplitTypesAnalyticsString(hasBase, z, z2);
    }
}
