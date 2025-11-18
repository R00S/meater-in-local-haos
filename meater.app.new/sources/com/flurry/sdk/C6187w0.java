package com.flurry.sdk;

import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.flurry.sdk.w0 */
/* loaded from: classes2.dex */
public final class C6187w0 {
    /* renamed from: a */
    public static Map<String, List<String>> m13364a(String str) {
        C6021d1.m13030c(3, "InstallParser", "Parsing referrer map");
        if (str == null) {
            return Collections.emptyMap();
        }
        HashMap map = new HashMap();
        for (String str2 : str.split("&")) {
            String[] strArrSplit = str2.split("=");
            if (strArrSplit.length != 2) {
                C6021d1.m13030c(5, "InstallParser", "Invalid referrer Element: " + str2 + " in referrer tag " + str);
            } else {
                String strDecode = URLDecoder.decode(strArrSplit[0]);
                String strDecode2 = URLDecoder.decode(strArrSplit[1]);
                if (map.get(strDecode) == null) {
                    map.put(strDecode, new ArrayList());
                }
                ((List) map.get(strDecode)).add(strDecode2);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            C6021d1.m13030c(3, "InstallParser", "entry: " + ((String) entry.getKey()) + "=" + entry.getValue());
        }
        StringBuilder sb = new StringBuilder();
        if (map.get("utm_source") == null) {
            sb.append("Campaign Source is missing.\n");
        }
        if (map.get("utm_medium") == null) {
            sb.append("Campaign Medium is missing.\n");
        }
        if (map.get("utm_campaign") == null) {
            sb.append("Campaign Name is missing.\n");
        }
        if (sb.length() > 0) {
            C6021d1.m13030c(5, "InstallParser", "Detected missing referrer keys : " + sb.toString());
        }
        return map;
    }
}
