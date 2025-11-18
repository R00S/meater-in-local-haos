package cm.aptoide.p092pt.download;

import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class DownloadApkPathsProvider {
    private static final String DOWNGRADE_ACTION = "?action=downgrade";
    private static final String INSTALL_ACTION = "?action=install";
    private static final String OEMID_QUERY = "&oemid=";
    private static final String UPDATE_ACTION = "?action=update";
    private final OemidProvider oemidProvider;

    public DownloadApkPathsProvider(OemidProvider oemidProvider) {
        this.oemidProvider = oemidProvider;
    }

    private String getOemidQueryString(String str) {
        String str2;
        String str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (str == null || str.isEmpty()) {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            str2 = OEMID_QUERY + str;
        }
        if (!str2.isEmpty()) {
            return str2;
        }
        String oemid = this.oemidProvider.getOemid();
        if (!oemid.isEmpty()) {
            str3 = OEMID_QUERY + oemid;
        }
        return str3;
    }

    public ApkPaths getDownloadPaths(int i2, String str, String str2, String str3) {
        String str4;
        String oemidQueryString = getOemidQueryString(str3);
        if (i2 == 0) {
            str4 = str + INSTALL_ACTION + oemidQueryString;
            str2 = str2 + INSTALL_ACTION + oemidQueryString;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    str4 = str + DOWNGRADE_ACTION + oemidQueryString;
                    str2 = str2 + DOWNGRADE_ACTION + oemidQueryString;
                }
                return new ApkPaths(str, str2);
            }
            str4 = str + UPDATE_ACTION + oemidQueryString;
            str2 = str2 + UPDATE_ACTION + oemidQueryString;
        }
        str = str4;
        return new ApkPaths(str, str2);
    }
}
