package cm.aptoide.p092pt.aab;

import cm.aptoide.p092pt.dataprovider.model.p096v7.Split;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: SplitsMapper.kt */
@Metadata(m32266d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004¨\u0006\b"}, m32267d2 = {"Lcm/aptoide/pt/aab/SplitsMapper;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "mapSplits", HttpUrl.FRAGMENT_ENCODE_SET, "Lcm/aptoide/pt/aab/Split;", "splits", "Lcm/aptoide/pt/dataprovider/model/v7/Split;", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class SplitsMapper {
    public final List<Split> mapSplits(List<? extends Split> splits) {
        ArrayList arrayList = new ArrayList();
        if (splits == null) {
            return arrayList;
        }
        for (Split split : splits) {
            String name = split.getName();
            C9801m.m32345e(name, "split.name");
            String type = split.getType();
            C9801m.m32345e(type, "split.type");
            String path = split.getPath();
            C9801m.m32345e(path, "split.path");
            long filesize = split.getFilesize();
            String md5sum = split.getMd5sum();
            C9801m.m32345e(md5sum, "split.md5sum");
            arrayList.add(new Split(name, type, path, filesize, md5sum));
        }
        return arrayList;
    }
}
