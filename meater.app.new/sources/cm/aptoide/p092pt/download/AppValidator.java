package cm.aptoide.p092pt.download;

import cm.aptoide.p092pt.aab.Split;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Obb;
import cm.aptoide.p092pt.root.execution.Command;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: AppValidator.kt */
@Metadata(m32266d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0017B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002Jb\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\b2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m32267d2 = {"Lcm/aptoide/pt/download/AppValidator;", HttpUrl.FRAGMENT_ENCODE_SET, "appValidationAnalytics", "Lcm/aptoide/pt/download/AppValidationAnalytics;", "(Lcm/aptoide/pt/download/AppValidationAnalytics;)V", "isStringEmptyOrNull", HttpUrl.FRAGMENT_ENCODE_SET, Command.CommandHandler.TEXT, HttpUrl.FRAGMENT_ENCODE_SET, "validateApp", "Lcm/aptoide/pt/download/AppValidator$AppValidationResult;", "md5", "appObb", "Lcm/aptoide/pt/dataprovider/model/v7/Obb;", "packageName", "appName", "filePath", "filePathAlt", "splits", HttpUrl.FRAGMENT_ENCODE_SET, "Lcm/aptoide/pt/aab/Split;", "requiredSplits", HttpUrl.FRAGMENT_ENCODE_SET, "AppValidationResult", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class AppValidator {
    private final AppValidationAnalytics appValidationAnalytics;

    /* compiled from: AppValidator.kt */
    @Metadata(m32266d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, m32267d2 = {"Lcm/aptoide/pt/download/AppValidator$AppValidationResult;", HttpUrl.FRAGMENT_ENCODE_SET, "message", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;ILjava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "INVALID_MD5", "NO_MAIN_DOWNLOAD_LINK", "NO_ALTERNATIVE_DOWNLOAD_LINK", "NO_MAIN_OBB_DOWNLOAD_LINK", "NO_PATCH_OBB_DOWNLOAD_LINK", "NO_PACKAGE_NAME_SPECIFIED", "NO_APP_NAME_SPECIFIED", "REQUIRED_SPLITS_NOT_FOUND", "VALID_APP", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    public enum AppValidationResult {
        INVALID_MD5("Invalid App md5"),
        NO_MAIN_DOWNLOAD_LINK("No main download link provided"),
        NO_ALTERNATIVE_DOWNLOAD_LINK("No alternative download link provided"),
        NO_MAIN_OBB_DOWNLOAD_LINK("No main obb download link provided"),
        NO_PATCH_OBB_DOWNLOAD_LINK("No patch obb download link provided"),
        NO_PACKAGE_NAME_SPECIFIED("This app has an OBB and doesn't have the package name specified"),
        NO_APP_NAME_SPECIFIED("This app has an OBB and doesn't have the App name specified"),
        REQUIRED_SPLITS_NOT_FOUND("Not all required App bundle Splits are being provided"),
        VALID_APP("This is a valid app");

        private final String message;

        AppValidationResult(String str) {
            this.message = str;
        }

        public final String getMessage() {
            return this.message;
        }
    }

    public AppValidator(AppValidationAnalytics appValidationAnalytics) {
        C9801m.m32346f(appValidationAnalytics, "appValidationAnalytics");
        this.appValidationAnalytics = appValidationAnalytics;
    }

    private final boolean isStringEmptyOrNull(String text) {
        if (text != null) {
            if (!(text.length() == 0)) {
                return false;
            }
        }
        return true;
    }

    public final AppValidationResult validateApp(String md5, Obb appObb, String packageName, String appName, String filePath, String filePathAlt, List<Split> splits, List<String> requiredSplits) {
        boolean z;
        AppValidationResult appValidationResult = AppValidationResult.VALID_APP;
        if (isStringEmptyOrNull(md5)) {
            appValidationResult = AppValidationResult.INVALID_MD5;
        }
        if (isStringEmptyOrNull(filePath)) {
            this.appValidationAnalytics.sendInvalidDownloadMainPath(packageName);
            appValidationResult = AppValidationResult.NO_MAIN_DOWNLOAD_LINK;
        } else if (isStringEmptyOrNull(filePathAlt)) {
            this.appValidationAnalytics.sendInvalidDownloadAlternativePath(packageName);
            appValidationResult = AppValidationResult.NO_ALTERNATIVE_DOWNLOAD_LINK;
        } else if (appObb != null && appObb.getMain() != null && isStringEmptyOrNull(appObb.getMain().getPath())) {
            this.appValidationAnalytics.sendInvalidDownloadObbMainPath(packageName);
            appValidationResult = AppValidationResult.NO_MAIN_OBB_DOWNLOAD_LINK;
        } else if (appObb != null && appObb.getPatch() != null && isStringEmptyOrNull(appObb.getPatch().getPath())) {
            this.appValidationAnalytics.sendInvalidDownloadObbPatchPath(packageName);
            appValidationResult = AppValidationResult.NO_PATCH_OBB_DOWNLOAD_LINK;
        } else if (appObb != null && isStringEmptyOrNull(packageName)) {
            appValidationResult = AppValidationResult.NO_PACKAGE_NAME_SPECIFIED;
        } else if (isStringEmptyOrNull(appName)) {
            appValidationResult = AppValidationResult.NO_APP_NAME_SPECIFIED;
        }
        if (requiredSplits == null || !(!requiredSplits.isEmpty())) {
            return appValidationResult;
        }
        for (String str : requiredSplits) {
            C9801m.m32343c(splits);
            if ((splits instanceof Collection) && splits.isEmpty()) {
                z = true;
            } else {
                Iterator<T> it = splits.iterator();
                while (it.hasNext()) {
                    if (C9801m.m32341a(((Split) it.next()).getType(), str)) {
                        z = false;
                        break;
                    }
                }
                z = true;
            }
            if (z) {
                return AppValidationResult.REQUIRED_SPLITS_NOT_FOUND;
            }
        }
        return appValidationResult;
    }
}
