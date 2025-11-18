package cm.aptoide.p092pt.database.room;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.os.Environment;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.utils.AptoideUtils;
import cm.aptoide.p092pt.utils.FileUtils;
import java.io.File;

/* loaded from: classes.dex */
public class RoomInstalled {
    public static final String ICON = "icon";
    public static final String NAME = "name";
    public static final String PACKAGE_NAME = "packageName";
    public static final String SIGNATURE = "signature";
    public static final int STATUS_COMPLETED = 4;
    public static final int STATUS_INSTALLING = 3;
    public static final int STATUS_PRE_INSTALL = 2;
    public static final int STATUS_ROOT_TIMEOUT = 5;
    public static final int STATUS_UNINSTALLED = 1;
    public static final int STATUS_WAITING_INSTALL_FEEDBACK = 6;
    public static final String STORE_NAME = "storeName";
    public static final int TYPE_DEFAULT = 0;
    public static final int TYPE_PACKAGE_INSTALLER = 3;
    public static final int TYPE_ROOT = 1;
    public static final int TYPE_SYSTEM = 2;
    public static final int TYPE_UNKNOWN = -1;
    public static final String VERSION_CODE = "versionCode";
    public static final String VERSION_NAME = "versionName";
    private long appSize;
    private boolean enabled;
    private String icon;
    private String name;
    private String packageAndVersionCode;
    private String packageName;
    private String signature;
    private int status;
    private String storeName;
    private boolean systemApp;
    private int type;
    private int versionCode;
    private String versionName;

    public RoomInstalled() {
    }

    private String getAppSignature(PackageInfo packageInfo) {
        byte[] byteArray;
        if (Build.VERSION.SDK_INT >= 28) {
            SigningInfo signingInfo = packageInfo.signingInfo;
            if (signingInfo == null) {
                return null;
            }
            Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
            byteArray = (signingCertificateHistory == null || signingCertificateHistory.length <= 0) ? packageInfo.signingInfo.getApkContentsSigners()[0].toByteArray() : signingCertificateHistory[signingCertificateHistory.length - 1].toByteArray();
        } else {
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr == null || signatureArr.length <= 0) {
                return null;
            }
            byteArray = signatureArr[0].toByteArray();
        }
        return AptoideUtils.AlgorithmU.computeSha1WithColon(byteArray);
    }

    private long getObbSize(String str, FileUtils fileUtils) {
        File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/obb/" + str);
        if (!file.exists() || !file.isDirectory() || file.listFiles() == null || file.listFiles().length <= 0) {
            return 0L;
        }
        return fileUtils.dirSize(file);
    }

    public long calculateAppSize(PackageInfo packageInfo, FileUtils fileUtils) {
        return new File(packageInfo.applicationInfo.publicSourceDir).length() + getObbSize(packageInfo.packageName, fileUtils);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RoomInstalled roomInstalled = (RoomInstalled) obj;
        if (this.versionCode == roomInstalled.getVersionCode() && this.packageAndVersionCode.equals(roomInstalled.getPackageAndVersionCode())) {
            return this.packageName.equals(roomInstalled.getPackageName());
        }
        return false;
    }

    public Long getAppSize() {
        return Long.valueOf(this.appSize);
    }

    public String getIcon() {
        return this.icon;
    }

    public String getName() {
        return this.name;
    }

    public String getPackageAndVersionCode() {
        return this.packageAndVersionCode;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getSignature() {
        return this.signature;
    }

    public int getStatus() {
        return this.status;
    }

    public String getStoreName() {
        return this.storeName;
    }

    public int getType() {
        return this.type;
    }

    public int getVersionCode() {
        return this.versionCode;
    }

    public String getVersionName() {
        return this.versionName;
    }

    public int hashCode() {
        return (((this.packageAndVersionCode.hashCode() * 31) + this.packageName.hashCode()) * 31) + this.versionCode;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public boolean isSystemApp() {
        return this.systemApp;
    }

    public void setAppSize(Long l) {
        this.appSize = l.longValue();
    }

    public void setEnabled(boolean z) {
        this.enabled = z;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPackageAndVersionCode(String str) {
        this.packageAndVersionCode = str;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setSignature(String str) {
        this.signature = str;
    }

    public void setStatus(int i2) {
        this.status = i2;
    }

    public void setStoreName(String str) {
        this.storeName = str;
    }

    public void setSystemApp(boolean z) {
        this.systemApp = z;
    }

    public void setType(int i2) {
        this.type = i2;
    }

    public void setVersionCode(int i2) {
        this.versionCode = i2;
    }

    public void setVersionName(String str) {
        this.versionName = str;
    }

    public RoomInstalled(PackageInfo packageInfo, PackageManager packageManager, FileUtils fileUtils) {
        this(packageInfo, null, packageManager, fileUtils);
    }

    public RoomInstalled(PackageInfo packageInfo, String str, PackageManager packageManager, FileUtils fileUtils) {
        boolean z;
        setIcon(AptoideUtils.SystemU.getApkIconPath(packageInfo));
        setName(AptoideUtils.SystemU.getApkLabel(packageInfo, packageManager));
        setAppSize(Long.valueOf(calculateAppSize(packageInfo, fileUtils)));
        setPackageName(packageInfo.packageName);
        setVersionCode(packageInfo.versionCode);
        setVersionName(packageInfo.versionName);
        try {
            z = packageManager.getApplicationInfo(packageInfo.packageName, 0).enabled;
        } catch (PackageManager.NameNotFoundException e2) {
            CrashReport.getInstance().log(e2);
            z = true;
        }
        setEnabled(z);
        setStoreName(str);
        this.packageAndVersionCode = packageInfo.packageName + packageInfo.versionCode;
        setSystemApp((packageInfo.applicationInfo.flags & 1) != 0);
        String appSignature = getAppSignature(packageInfo);
        if (appSignature != null) {
            setSignature(appSignature);
        }
        setStatus(4);
        setType(-1);
    }
}
