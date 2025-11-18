package cm.aptoide.p092pt.toolbox;

import android.content.pm.PackageManager;
import android.content.pm.Signature;

/* loaded from: classes.dex */
public class ToolboxSecurityManager {
    private final PackageManager packageManager;

    public ToolboxSecurityManager(PackageManager packageManager) {
        this.packageManager = packageManager;
    }

    private String getPackageName(int i2) {
        String[] packagesForUid = this.packageManager.getPackagesForUid(i2);
        if (packagesForUid != null) {
            return packagesForUid[0];
        }
        return null;
    }

    private String getSignature(String str) {
        try {
            Signature[] signatureArr = this.packageManager.getPackageInfo(str, 64).signatures;
            if (signatureArr != null) {
                return signatureArr[0].toCharsString();
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public boolean checkSignature(int i2, String str, String str2) {
        String packageName = getPackageName(i2);
        return str.equals(getSignature(packageName)) && str2.equals(packageName);
    }
}
