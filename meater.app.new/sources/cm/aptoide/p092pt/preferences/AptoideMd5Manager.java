package cm.aptoide.p092pt.preferences;

import android.content.pm.PackageManager;
import cm.aptoide.p092pt.appview.PreferencesPersister;
import cm.aptoide.p092pt.preferences.managed.ManagedKeys;
import cm.aptoide.p092pt.utils.AptoideUtils;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class AptoideMd5Manager {
    private String cachedMd5;
    private PackageManager packageManager;
    private String packageName;
    private PreferencesPersister preferencesPersister;
    private int vercode;

    public AptoideMd5Manager(PreferencesPersister preferencesPersister, PackageManager packageManager, String str, int i2) {
        this.preferencesPersister = preferencesPersister;
        this.packageManager = packageManager;
        this.packageName = str;
        this.vercode = i2;
    }

    private String parseMd5(String str, int i2) {
        if (str == null || str.isEmpty()) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String[] strArrSplit = str.split("_", 2);
        try {
            return (strArrSplit.length == 2 && Integer.parseInt(strArrSplit[0]) == i2) ? strArrSplit[1] : HttpUrl.FRAGMENT_ENCODE_SET;
        } catch (NumberFormatException unused) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    private void persistAptoideMd5(int i2, String str) {
        this.preferencesPersister.save(ManagedKeys.APTOIDE_MD5, i2 + "_" + str);
    }

    public Void calculateMd5Sum() {
        if (this.cachedMd5 != null) {
            return null;
        }
        String md5 = parseMd5(this.preferencesPersister.get(ManagedKeys.APTOIDE_MD5, HttpUrl.FRAGMENT_ENCODE_SET), this.vercode);
        if (!md5.isEmpty()) {
            this.cachedMd5 = md5;
            return null;
        }
        try {
            String strComputeMd5 = AptoideUtils.AlgorithmU.computeMd5(this.packageManager.getPackageInfo(this.packageName, 0));
            this.cachedMd5 = strComputeMd5;
            persistAptoideMd5(this.vercode, strComputeMd5);
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
        }
        return null;
    }

    public String getAptoideMd5() {
        String str = this.cachedMd5;
        return str != null ? str : parseMd5(this.preferencesPersister.get(ManagedKeys.APTOIDE_MD5, HttpUrl.FRAGMENT_ENCODE_SET), this.vercode);
    }
}
