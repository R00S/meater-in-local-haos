package cm.aptoide.p092pt.link;

import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import cm.aptoide.p092pt.account.AccountAnalytics;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.downloadmanager.Constants;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class AptoideInstallParser {
    public AptoideInstall parse(String str) {
        String[] strArrSplit = str.replace("\"", HttpUrl.FRAGMENT_ENCODE_SET).split("&");
        String str2 = "open_only";
        String str3 = "no_origin";
        String str4 = null;
        String str5 = null;
        boolean zEquals = false;
        for (String str6 : strArrSplit) {
            if (str6.toLowerCase().contains(Constants.PACKAGE)) {
                str5 = str6.split("=")[1];
            } else if (str6.toLowerCase().contains(AccountAnalytics.STORE)) {
                str4 = str6.split("=")[1];
            } else if (str6.toLowerCase().contains("show_install_popup")) {
                zEquals = str6.split("=")[1].equals("true");
            } else if (str6.toLowerCase().contains(DeepLinkIntentReceiver.DeepLinksKeys.OPEN_TYPE)) {
                str2 = str6.split("=")[1];
            } else if (str6.toLowerCase().contains("origin")) {
                str3 = str6.split("=")[1];
            } else {
                if (str6.toLowerCase().contains(DeepLinkIntentReceiver.DeepLinksKeys.UNAME)) {
                    return new AptoideInstall(str6.split("=")[1], str5);
                }
                try {
                    return new AptoideInstall(Long.parseLong(strArrSplit[0]), str5, null);
                } catch (NumberFormatException e2) {
                    CrashReport.getInstance().log(e2);
                }
            }
        }
        if (zEquals) {
            str2 = "open_with_install_popup";
        }
        return new AptoideInstall(str4, str5, str2, str3);
    }
}
