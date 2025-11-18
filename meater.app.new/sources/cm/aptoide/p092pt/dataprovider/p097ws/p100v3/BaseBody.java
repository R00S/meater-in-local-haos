package cm.aptoide.p092pt.dataprovider.p097ws.p100v3;

import cm.aptoide.p092pt.dataprovider.util.HashMapNotNull;

/* loaded from: classes.dex */
public class BaseBody extends HashMapNotNull<String, Object> {
    public void setAccessToken(String str) {
        put("access_token", str);
        put("oauthToken", str);
    }

    public void setAndroidVersion(int i2) {
        put("android_version", Integer.valueOf(i2));
    }

    public void setAptoideMd5sum(String str) {
        put("aptoide_md5sum", str);
    }

    public void setAptoidePackage(String str) {
        put("aptoide_package", str);
    }

    public void setAptoideUid(String str) {
        put("aptoide_uid", str);
    }

    public void setAuthMode(String str) {
        put("authMode", str);
    }

    public void setMobileCountryCode(String str) {
        put("mcc", str);
    }

    public void setMobileNetworkCode(String str) {
        put("mnc", str);
    }

    public void setQ(String str) {
        put("q", str);
    }

    public void setResponseMode(String str) {
        put("mode", str);
    }

    public void setSimCountryISOCode(String str) {
        put("simcc", str);
    }
}
