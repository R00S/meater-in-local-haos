package cm.aptoide.p092pt.utils.p106q;

import android.app.ActivityManager;
import android.app.UiModeManager;
import android.content.res.Resources;
import android.util.Base64;
import android.view.WindowManager;
import cm.aptoide.p092pt.utils.AptoideUtils;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class QManager {
    private final ActivityManager activityManager;
    private String cachedFilters;
    private String cpuAbi;
    private Integer densityDpi;
    private String glEs;
    private Integer minSdk;
    private final Resources resources;
    private String screenSize;
    private UiModeManager uiModeManager;
    private final WindowManager windowManager;

    public QManager(Resources resources, ActivityManager activityManager, WindowManager windowManager, UiModeManager uiModeManager) {
        this.resources = resources;
        this.activityManager = activityManager;
        this.windowManager = windowManager;
        this.uiModeManager = uiModeManager;
    }

    private String computeCpuAbi() {
        return AptoideUtils.SystemU.getAbis();
    }

    private int computeDensityDpi() {
        return AptoideUtils.ScreenU.getDensityDpi(this.windowManager);
    }

    private String computeFilters() {
        return Base64.encodeToString(("maxSdk=" + getMinSdk() + "&maxScreen=" + getScreenSize() + "&maxGles=" + getGlEs() + "&myCPU=" + getCpuAbi() + "&leanback=" + hasLeanback() + "&myDensity=" + getDensityDpi()).getBytes(), 0).replace("=", HttpUrl.FRAGMENT_ENCODE_SET).replace("/", "*").replace("+", "_").replace("\n", HttpUrl.FRAGMENT_ENCODE_SET);
    }

    private String computeGlEs() {
        return AptoideUtils.SystemU.getGlEsVer(this.activityManager);
    }

    private int computeMinSdk() {
        return AptoideUtils.SystemU.getSdkVer();
    }

    private String computeScreenSize() {
        return AptoideUtils.ScreenU.getScreenSize(this.resources);
    }

    private String getCpuAbi() {
        if (this.cpuAbi == null) {
            this.cpuAbi = computeCpuAbi();
        }
        return this.cpuAbi;
    }

    private Integer getDensityDpi() {
        if (this.densityDpi == null) {
            this.densityDpi = Integer.valueOf(computeDensityDpi());
        }
        return this.densityDpi;
    }

    private String getGlEs() {
        if (this.glEs == null) {
            this.glEs = computeGlEs();
        }
        return this.glEs;
    }

    private Integer getMinSdk() {
        if (this.minSdk == null) {
            this.minSdk = Integer.valueOf(computeMinSdk());
        }
        return this.minSdk;
    }

    private String getScreenSize() {
        if (this.screenSize == null) {
            this.screenSize = computeScreenSize();
        }
        return this.screenSize;
    }

    private String hasLeanback() {
        return this.uiModeManager.getCurrentModeType() == 4 ? "1" : "0";
    }

    public String getFilters(boolean z) {
        if (!z) {
            return null;
        }
        if (this.cachedFilters == null) {
            this.cachedFilters = computeFilters();
        }
        return this.cachedFilters;
    }
}
