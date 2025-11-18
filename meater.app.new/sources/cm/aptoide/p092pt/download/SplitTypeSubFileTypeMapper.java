package cm.aptoide.p092pt.download;

import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: SplitTypeSubFileTypeMapper.kt */
@Metadata(m32266d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m32267d2 = {"Lcm/aptoide/pt/download/SplitTypeSubFileTypeMapper;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "mapSplitToSubFileType", HttpUrl.FRAGMENT_ENCODE_SET, "splitType", HttpUrl.FRAGMENT_ENCODE_SET, "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class SplitTypeSubFileTypeMapper {
    public final int mapSplitToSubFileType(String splitType) {
        C9801m.m32346f(splitType, "splitType");
        if (C9801m.m32341a(splitType, "FEATURE")) {
            return 11;
        }
        return C9801m.m32341a(splitType, "ASSET") ? 12 : 15;
    }
}
