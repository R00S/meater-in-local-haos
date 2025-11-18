package cm.aptoide.p092pt.app.mmpcampaigns;

import cm.aptoide.p092pt.dataprovider.model.p096v7.listapp.Urls;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C10817u;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: CampaignMapper.kt */
@Metadata(m32266d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u0002¨\u0006\f"}, m32267d2 = {"Lcm/aptoide/pt/app/mmpcampaigns/CampaignMapper;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "mapCampaign", "Lcm/aptoide/pt/app/mmpcampaigns/Campaign;", "urls", "Lcm/aptoide/pt/dataprovider/model/v7/listapp/Urls;", "mapCampaignUrlList", HttpUrl.FRAGMENT_ENCODE_SET, "Lcm/aptoide/pt/app/mmpcampaigns/CampaignUrl;", "urlList", "Lcm/aptoide/pt/dataprovider/model/v7/listapp/Urls$Url;", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class CampaignMapper {
    private final List<CampaignUrl> mapCampaignUrlList(List<? extends Urls.Url> urlList) {
        ArrayList arrayList = new ArrayList();
        for (Urls.Url url : urlList) {
            String name = url.getName();
            C9801m.m32345e(name, "url.name");
            String url2 = url.getUrl();
            C9801m.m32345e(url2, "url.url");
            arrayList.add(new CampaignUrl(name, url2));
        }
        return arrayList;
    }

    public final Campaign mapCampaign(Urls urls) {
        if (urls == null) {
            return new Campaign(C10817u.m38888j(), C10817u.m38888j(), C10817u.m38888j());
        }
        List<Urls.Url> impression = urls.getImpression();
        if (impression == null) {
            impression = C10817u.m38888j();
        }
        List<CampaignUrl> listMapCampaignUrlList = mapCampaignUrlList(impression);
        List<Urls.Url> click = urls.getClick();
        if (click == null) {
            click = C10817u.m38888j();
        }
        List<CampaignUrl> listMapCampaignUrlList2 = mapCampaignUrlList(click);
        List<Urls.Url> download = urls.getDownload();
        if (download == null) {
            download = C10817u.m38888j();
        }
        return new Campaign(listMapCampaignUrlList, listMapCampaignUrlList2, mapCampaignUrlList(download));
    }
}
