package cm.aptoide.p092pt.app.mmpcampaigns;

import cm.aptoide.p092pt.BuildConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C10782c0;
import kotlin.jvm.internal.C9801m;
import kotlin.text.C10546u;
import kotlin.text.C10547v;
import okhttp3.HttpUrl;

/* compiled from: CampaignManager.kt */
@Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001¨\u0006\u0004"}, m32267d2 = {"injectCampaignAttributes", HttpUrl.FRAGMENT_ENCODE_SET, "medium", "guestUID", "app_vanillaProdRelease"}, m32268k = 2, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class CampaignManagerKt {
    public static final String injectCampaignAttributes(String str, String str2, String str3) {
        C9801m.m32346f(str, "<this>");
        C9801m.m32346f(str2, "medium");
        String strM37507A = C10546u.m37507A(str, "{{OEMID}}", BuildConfig.OEMID, false, 4, null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("utm_source", "Vanilla");
        linkedHashMap.put("utm_medium", str2);
        String string = null;
        if (str3 != null) {
            if (!(str3.length() > 0)) {
                str3 = null;
            }
            if (str3 != null) {
                linkedHashMap.put("guest_uid", str3);
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(((String) entry.getKey()) + '=' + ((String) entry.getValue()));
        }
        String strM38599e0 = C10782c0.m38599e0(arrayList, "&", null, null, 0, null, null, 62, null);
        if (!(strM38599e0.length() > 0)) {
            strM38599e0 = null;
        }
        if (strM38599e0 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(C10547v.m37538J(strM37507A, "?", false, 2, null) ? "&" : "?");
            sb.append(strM38599e0);
            string = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strM37507A);
        if (string == null) {
            string = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        sb2.append(string);
        return sb2.toString();
    }
}
