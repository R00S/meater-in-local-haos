package cm.aptoide.p092pt.utils;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PermissionGroupInfo;
import android.content.pm.PermissionInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.Html;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import cm.aptoide.p092pt.file.CacheHelper;
import cm.aptoide.p092pt.logger.Logger;
import cm.aptoide.p092pt.permissions.ApkPermission;
import cm.aptoide.p092pt.utils.AptoideUtils;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URI;
import java.net.URLDecoder;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.UnknownFormatConversionException;
import java.util.regex.Pattern;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import okhttp3.HttpUrl;
import p456rx.C11234e;
import p456rx.p457l.p459c.C11250a;
import p456rx.p460m.InterfaceC11253b;
import p456rx.schedulers.Schedulers;

/* loaded from: classes.dex */
public class AptoideUtils {

    @Deprecated
    public static class Benchmarking {
        private static final String TAG = "Benchmarking";
        private String methodName;
        private long startTime;

        public static Benchmarking start(String str) {
            Benchmarking benchmarking = new Benchmarking();
            benchmarking.methodName = str;
            benchmarking.startTime = System.currentTimeMillis();
            return benchmarking;
        }

        public void end() {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Logger.getInstance().m8273d(TAG, "Thread: " + Thread.currentThread().getId() + " Method:" + this.methodName + " - Total execution time: " + (jCurrentTimeMillis - this.startTime) + "ms");
        }
    }

    public static class Core {
        private static final String TAG = "Core";

        public static String getDefaultVername(Context context) {
            String str;
            try {
                str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            } catch (PackageManager.NameNotFoundException e2) {
                e2.printStackTrace();
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            return "aptoide-" + str;
        }

        public static int getVerCode(Context context) {
            try {
                return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e2) {
                Logger.getInstance().m8279e(TAG, (Throwable) e2);
                return -1;
            }
        }
    }

    public static class HtmlU {
        public static CharSequence parse(String str) {
            return Html.fromHtml(str.replace("\n", "<br/>").replace("&", "&amp;"));
        }
    }

    public static class IconSizeU {
        private static final String AVATAR_STRING = "_avatar";
        public static final int DEFAULT_SCREEN_DENSITY = -1;
        public static final int ICONS_SIZE_TYPE = 0;
        public static final int STORE_ICONS_SIZE_TYPE = 1;
        private static final String TAG = "cm.aptoide.pt.utils.AptoideUtils$IconSizeU";
        private static final int baseLine = 96;
        private static final int baseLineAvatar = 150;
        private static final int baseLineXNotification = 320;
        private static final int baseLineYNotification = 180;
        public static final HashMap<Integer, String> mIconSizes;
        public static final HashMap<Integer, String> mStoreIconSizes;
        private static final Pattern urlWithDimensionPattern = Pattern.compile("_{1}[1-9]{3}(x|X){1}[1-9]{3}.{1}.{3,4}\\b");
        private static int baseLineScreenshotLand = 256;
        private static int baseLineScreenshotPort = 96;

        static {
            HashMap<Integer, String> map = new HashMap<>();
            mStoreIconSizes = map;
            map.put(480, "450x450");
            Integer numValueOf = Integer.valueOf(baseLineXNotification);
            map.put(numValueOf, "300x300");
            map.put(240, "225x225");
            map.put(160, "150x150");
            map.put(120, "113x113");
            HashMap<Integer, String> map2 = new HashMap<>();
            mIconSizes = map2;
            map2.put(640, "384x384");
            map2.put(480, "288x288");
            map2.put(numValueOf, "192x192");
            map2.put(240, "144x144");
            map2.put(160, "127x127");
            map2.put(120, "96x96");
        }

        public static String cleanImageUrl(String str) {
            int iLastIndexOf = str.lastIndexOf(95);
            if (iLastIndexOf == -1) {
                return str;
            }
            if (!urlWithDimensionPattern.matcher(str.substring(iLastIndexOf)).matches()) {
                return str;
            }
            return str.substring(0, iLastIndexOf) + str.substring(str.lastIndexOf(46));
        }

        private static Float densityMultiplier(Resources resources) {
            float f2 = resources.getDisplayMetrics().density;
            float f3 = 3.0f;
            if (f2 <= 0.75f) {
                f3 = 0.75f;
            } else if (f2 <= 1.0f) {
                f3 = 1.0f;
            } else if (f2 <= 1.333f) {
                f3 = 1.33125f;
            } else if (f2 <= 1.5f) {
                f3 = 1.5f;
            } else if (f2 <= 2.0f) {
                f3 = 2.0f;
            } else if (f2 > 3.0f) {
                f3 = 4.0f;
            }
            return Float.valueOf(f3);
        }

        public static String generateSizeStoreString(String str, Resources resources, WindowManager windowManager) {
            if (str == null) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            String defaultSize = mStoreIconSizes.get(Integer.valueOf(resources.getDisplayMetrics().densityDpi));
            if (TextUtils.isEmpty(defaultSize)) {
                defaultSize = getDefaultSize(1, windowManager);
            }
            if (TextUtils.isEmpty(defaultSize)) {
                return str;
            }
            String[] strArrSplitUrlExtension = splitUrlExtension(str);
            return strArrSplitUrlExtension[0] + "_" + defaultSize + "." + strArrSplitUrlExtension[1];
        }

        private static String generateSizeString(Resources resources, WindowManager windowManager) {
            String str = mIconSizes.get(Integer.valueOf(resources.getDisplayMetrics().densityDpi));
            return str != null ? str : getDefaultSize(0, windowManager);
        }

        private static String generateSizeStringScreenshotsdd(String str, WindowManager windowManager, Resources resources) {
            return (((str == null || !str.equals("portrait")) ? baseLineScreenshotLand : baseLineScreenshotPort) * ((int) densityMultiplier(resources).floatValue())) + "x" + ScreenU.getDensityDpi(windowManager);
        }

        public static String generateStringAvatar(String str, Resources resources, WindowManager windowManager) {
            if (str == null) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            Math.round(densityMultiplier(resources).floatValue() * 150.0f);
            String[] strArrSplitUrlExtension = splitUrlExtension(str);
            return strArrSplitUrlExtension[0] + "_" + getUserAvatarIconSize(windowManager) + "." + strArrSplitUrlExtension[1];
        }

        @Deprecated
        public static String generateStringNotification(String str, Resources resources) {
            if (str == null) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            float fFloatValue = densityMultiplier(resources).floatValue();
            String[] strArrSplitUrlExtension = splitUrlExtension(str);
            return strArrSplitUrlExtension[0] + "_" + ((int) (320.0f * fFloatValue)) + "x" + ((int) (fFloatValue * 180.0f)) + "." + strArrSplitUrlExtension[1];
        }

        private static String getDefaultSize(int i2, WindowManager windowManager) {
            if (i2 == 0) {
                return ScreenU.getDensityDpi(windowManager) < 240 ? mIconSizes.get(120) : mIconSizes.get(640);
            }
            if (i2 != 1) {
                return null;
            }
            return ScreenU.getDensityDpi(windowManager) < 240 ? mStoreIconSizes.get(120) : mStoreIconSizes.get(480);
        }

        public static String getNewImageUrl(String str, Resources resources, WindowManager windowManager) {
            return TextUtils.isEmpty(str) ? str : str.contains("portrait") ? parseScreenshots(str, windowManager) : str.contains("_icon") ? parseIcon(str, resources, windowManager) : str;
        }

        private static String getThumbnailSize(int i2, boolean z) {
            return !z ? i2 >= 640 ? "1024x640" : i2 >= 480 ? "768x480" : i2 >= baseLineXNotification ? "512x320" : i2 >= 240 ? "384x240" : i2 >= 213 ? "340x213" : i2 >= 160 ? "256x160" : "192x120" : i2 >= 640 ? "384x640" : i2 >= 480 ? "288x480" : i2 >= baseLineXNotification ? "192x320" : i2 >= 240 ? "144x240" : i2 >= 213 ? "127x213" : i2 >= 160 ? "96x160" : "72x120";
        }

        private static String getUserAvatarIconSize(WindowManager windowManager) {
            return ScreenU.getDensityDpi(windowManager) <= 240 ? "50x50" : "150x150";
        }

        private static String parseIcon(String str, Resources resources, WindowManager windowManager) throws Exception {
            String strGenerateSizeString;
            if (str == null) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            try {
                if (!str.contains("_icon") || (strGenerateSizeString = generateSizeString(resources, windowManager)) == null || strGenerateSizeString.isEmpty()) {
                    return str;
                }
                String[] strArrSplitUrlExtension = splitUrlExtension(str);
                return strArrSplitUrlExtension[0] + "_" + strGenerateSizeString + "." + strArrSplitUrlExtension[1];
            } catch (Exception e2) {
                Logger.getInstance().m8279e(TAG, (Throwable) e2);
                throw e2;
            }
        }

        private static String parseScreenshotUrl(String str, String str2, WindowManager windowManager, Resources resources) {
            String strGenerateSizeStringScreenshotsdd = generateSizeStringScreenshotsdd(str2, windowManager, resources);
            String[] strArrSplitUrlExtension = splitUrlExtension(str);
            return strArrSplitUrlExtension[0] + "_" + strGenerateSizeStringScreenshotsdd + "." + strArrSplitUrlExtension[1];
        }

        private static String parseScreenshots(String str, WindowManager windowManager) {
            if (str == null) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            boolean z = str.equals("portrait");
            int densityDpi = ScreenU.getDensityDpi(windowManager);
            String[] strArrSplitUrlExtension = splitUrlExtension(str);
            return strArrSplitUrlExtension[0] + "_" + getThumbnailSize(densityDpi, z) + "." + strArrSplitUrlExtension[1];
        }

        public static String screenshotToThumb(String str, String str2, WindowManager windowManager, Resources resources) throws Exception {
            try {
                if (str.contains("_screen")) {
                    return parseScreenshotUrl(str, str2, windowManager, resources);
                }
                String[] strArrSplit = str.split("/");
                StringBuilder sb = new StringBuilder();
                for (int i2 = 0; i2 != strArrSplit.length - 1; i2++) {
                    sb.append(strArrSplit[i2]);
                    sb.append("/");
                }
                sb.append("thumbs/mobile/");
                sb.append(strArrSplit[strArrSplit.length - 1]);
                return sb.toString();
            } catch (Exception e2) {
                Logger.getInstance().m8279e(TAG, (Throwable) e2);
                throw e2;
            }
        }

        private static String[] splitUrlExtension(String str) {
            return str.split("\\.(?=[^\\.]+$)");
        }
    }

    @Deprecated
    public static final class LocaleU {
        public static final Locale DEFAULT = Locale.getDefault();
    }

    @Deprecated
    public static class ObservableU {
        public static <T> C11234e.c<T, T> applySchedulers() {
            return new C11234e.c() { // from class: cm.aptoide.pt.utils.a
                @Override // p456rx.p460m.InterfaceC11256e
                public final Object call(Object obj) {
                    return ((C11234e) obj).m40065I0(Schedulers.m40658io()).m40095j0(C11250a.m40156b());
                }
            };
        }
    }

    public static class RegexU {
        private static final String SPLIT_URL_EXTENSION = "\\.(?=[^\\.]+$)";
        private static final String STORE_ID_FROM_GET_URL = "store_id\\=(\\d+)";
        private static Pattern STORE_ID_FROM_GET_URL_PATTERN = null;
        private static final String STORE_NAME_FROM_GET_URL = "store_name\\/(.*?)\\/";
        private static Pattern STORE_NAME_FROM_GET_URL_PATTERN;

        public static Pattern getStoreIdFromGetUrlPattern() {
            if (STORE_ID_FROM_GET_URL_PATTERN == null) {
                STORE_ID_FROM_GET_URL_PATTERN = Pattern.compile(STORE_ID_FROM_GET_URL);
            }
            return STORE_ID_FROM_GET_URL_PATTERN;
        }

        public static Pattern getStoreNameFromGetUrlPattern() {
            if (STORE_NAME_FROM_GET_URL_PATTERN == null) {
                STORE_NAME_FROM_GET_URL_PATTERN = Pattern.compile(STORE_NAME_FROM_GET_URL);
            }
            return STORE_NAME_FROM_GET_URL_PATTERN;
        }
    }

    public static class ResourseU {
        public static Drawable getDrawable(int i2, Resources resources) {
            return resources.getDrawable(i2);
        }

        public static int getInt(int i2, Resources resources) {
            return resources.getInteger(i2);
        }

        public static String getString(int i2, Resources resources) {
            return StringU.getResString(i2, resources);
        }
    }

    public static final class ScreenU {
        public static final float REFERENCE_WIDTH_DPI = 360.0f;
        private static ScreenUtilsCache screenWidthInDipCache = new ScreenUtilsCache();
        private static int displayWidthCacheLandscape = -1;
        private static int displayWidthCachePortrait = -1;

        private static class ScreenUtilsCache {
            private int orientation;
            private float value;

            private ScreenUtilsCache() {
                this.orientation = -1;
            }

            public void set(int i2, float f2) {
                this.orientation = i2;
                this.value = f2;
            }
        }

        @Deprecated
        public enum Size {
            notfound,
            small,
            normal,
            large,
            xlarge;

            private static final String TAG = Size.class.getSimpleName();

            public static Size lookup(String str) {
                try {
                    return valueOf(str);
                } catch (Exception e2) {
                    Logger.getInstance().m8279e(TAG, (Throwable) e2);
                    return notfound;
                }
            }
        }

        public static int getCachedDisplayWidth(int i2, WindowManager windowManager) {
            if (i2 == 2) {
                if (displayWidthCacheLandscape == -1) {
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    if (Build.VERSION.SDK_INT >= 13) {
                        Point point = new Point();
                        defaultDisplay.getSize(point);
                        displayWidthCacheLandscape = point.x;
                    } else {
                        displayWidthCacheLandscape = defaultDisplay.getWidth();
                    }
                }
                return displayWidthCacheLandscape;
            }
            if (displayWidthCachePortrait == -1) {
                Display defaultDisplay2 = windowManager.getDefaultDisplay();
                if (Build.VERSION.SDK_INT >= 13) {
                    Point point2 = new Point();
                    defaultDisplay2.getSize(point2);
                    displayWidthCachePortrait = point2.y;
                } else {
                    displayWidthCachePortrait = defaultDisplay2.getHeight();
                }
            }
            return displayWidthCachePortrait;
        }

        public static int getCurrentOrientation(Resources resources) {
            return resources.getConfiguration().orientation;
        }

        public static int getDensityDpi(WindowManager windowManager) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            int i2 = displayMetrics.densityDpi;
            if (i2 <= 120) {
                return 120;
            }
            if (i2 <= 160) {
                return 160;
            }
            if (i2 <= 213) {
                return 213;
            }
            if (i2 <= 240) {
                return 240;
            }
            if (i2 <= 320) {
                return 320;
            }
            return i2 <= 480 ? 480 : 640;
        }

        public static int getNumericScreenSize(Resources resources) {
            return (getScreenSizeInt(resources) + 1) * 100;
        }

        public static int getPixelsForDip(int i2, Resources resources) {
            return (int) TypedValue.applyDimension(1, i2, resources.getDisplayMetrics());
        }

        public static String getScreenSize(Resources resources) {
            return Size.values()[getScreenSizeInt(resources)].name().toLowerCase(Locale.ENGLISH);
        }

        private static int getScreenSizeInt(Resources resources) {
            return resources.getConfiguration().screenLayout & 15;
        }

        @Deprecated
        public static String getScreenSizePixels(Resources resources) {
            Configuration configuration = resources.getConfiguration();
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            double d2 = configuration.screenWidthDp;
            double d3 = displayMetrics.density;
            Double.isNaN(d2);
            Double.isNaN(d3);
            double d4 = d2 * d3;
            double d5 = displayMetrics.heightPixels;
            Double.isNaN(d5);
            double d6 = displayMetrics.widthPixels;
            Double.isNaN(d6);
            return ((int) (d4 + 0.5d)) + "x" + ((int) (((d5 * d4) / d6) + 0.5d));
        }

        public static float getScreenWidthInDip(WindowManager windowManager, Resources resources) {
            if (getCurrentOrientation(resources) != screenWidthInDipCache.orientation) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                screenWidthInDipCache.set(getCurrentOrientation(resources), displayMetrics.widthPixels / displayMetrics.density);
            }
            return screenWidthInDipCache.value;
        }

        public static File takeScreenshot(Activity activity, String str, String str2) throws IOException {
            FileUtils.createDir(str);
            View rootView = activity.getWindow().getDecorView().getRootView();
            rootView.setDrawingCacheEnabled(true);
            try {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(rootView.getDrawingCache());
                rootView.setDrawingCacheEnabled(false);
                File file = new File(str, str2);
                try {
                    file.createNewFile();
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    return file;
                } catch (FileNotFoundException e2) {
                    Logger.getInstance().m8277e("FeedBackActivity-screenshot", "FileNotFoundException: " + e2.getMessage());
                    return null;
                } catch (IOException e3) {
                    Logger.getInstance().m8277e("FeedBackActivity-screenshot", "IOException: " + e3.getMessage());
                    return null;
                }
            } catch (Exception e4) {
                Logger.getInstance().m8277e("FeedBackActivity-screenshot", "Exception: " + e4.getMessage());
                return null;
            }
        }
    }

    public static final class SocialLinksU {
        public static String getFacebookPageURL(int i2, String str) {
            if (i2 < 3002850) {
                return str;
            }
            return "fb://facewebmodal/f?href=" + str;
        }
    }

    public static final class StringU {
        public static String commaSeparatedValues(List<?> list) {
            if (list.size() <= 0) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            String string = list.get(0).toString();
            for (int i2 = 1; i2 < list.size(); i2++) {
                string = string + "," + list.get(i2).toString();
            }
            return string;
        }

        public static String formatBytes(long j2, boolean z) {
            if (j2 < 1024) {
                return j2 + " B";
            }
            double d2 = j2;
            double d3 = 1024;
            int iLog = (int) (Math.log(d2) / Math.log(d3));
            String str = "KMGTPE".charAt(iLog - 1) + HttpUrl.FRAGMENT_ENCODE_SET;
            Locale locale = Locale.ENGLISH;
            double dPow = Math.pow(d3, iLog);
            Double.isNaN(d2);
            String str2 = String.format(locale, "%.1f %sB", Double.valueOf(d2 / dPow), str);
            if (!z) {
                return str2;
            }
            return str2 + "/s";
        }

        public static String formatBytesToBits(long j2, boolean z) {
            long j3 = j2 * 8;
            if (j3 < 1024) {
                return j3 + " B";
            }
            double d2 = j3;
            double d3 = 1024;
            int iLog = (int) (Math.log(d2) / Math.log(d3));
            String str = "KMGTPE".charAt(iLog - 1) + HttpUrl.FRAGMENT_ENCODE_SET;
            Locale locale = Locale.ENGLISH;
            double dPow = Math.pow(d3, iLog);
            Double.isNaN(d2);
            String str2 = String.format(locale, "%.1f %sb", Double.valueOf(d2 / dPow), str);
            if (!z) {
                return str2;
            }
            return str2 + "ps";
        }

        public static String getFormattedString(int i2, Resources resources, Object... objArr) throws Resources.NotFoundException {
            try {
                return resources.getString(i2, objArr);
            } catch (UnknownFormatConversionException unused) {
                String resourceEntryName = resources.getResourceEntryName(i2);
                String displayLanguage = Locale.getDefault().getDisplayLanguage();
                Logger.getInstance().m8277e("UnknownFormatConversion", "String: " + resourceEntryName + " Locale: " + displayLanguage);
                return ResourseU.getString(i2, resources);
            }
        }

        public static String getResString(int i2, Resources resources) {
            return resources.getString(i2);
        }

        public static String join(Iterable<?> iterable, String str) {
            if (iterable == null) {
                return null;
            }
            return join(iterable.iterator(), str);
        }

        public static Map<String, String> splitQuery(URI uri) throws UnsupportedEncodingException {
            String[] strArrSplit;
            int i2;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String query = uri.getQuery();
            if (query != null && (strArrSplit = query.split("&")) != null) {
                for (String str : strArrSplit) {
                    int iIndexOf = str.indexOf("=");
                    if (iIndexOf > 0 && (i2 = iIndexOf + 1) < str.length()) {
                        linkedHashMap.put(URLDecoder.decode(str.substring(0, iIndexOf), "UTF-8"), URLDecoder.decode(str.substring(i2), "UTF-8"));
                    }
                }
            }
            return linkedHashMap;
        }

        public static String toString(Object obj) {
            return obj == null ? HttpUrl.FRAGMENT_ENCODE_SET : obj.toString();
        }

        public static String withSuffix(long j2) {
            if (j2 < 1000) {
                return String.valueOf(j2);
            }
            double d2 = j2;
            int iLog = (int) (Math.log(d2) / Math.log(1000.0d));
            Locale locale = Locale.ENGLISH;
            double dPow = Math.pow(1000.0d, iLog);
            Double.isNaN(d2);
            return String.format(locale, "%d %c", Integer.valueOf((int) (d2 / dPow)), Character.valueOf("kMBTPE".charAt(iLog - 1)));
        }

        public static String join(Iterator<?> it, String str) {
            if (it == null) {
                return null;
            }
            if (!it.hasNext()) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            Object next = it.next();
            if (!it.hasNext()) {
                return toString(next);
            }
            StringBuilder sb = new StringBuilder(256);
            if (next != null) {
                sb.append(next);
            }
            while (it.hasNext()) {
                if (str != null) {
                    sb.append(str);
                }
                Object next2 = it.next();
                if (next2 != null) {
                    sb.append(next2);
                }
            }
            return sb.toString();
        }
    }

    public static class SystemU {
        private static final String TAG = "SystemU";
        public static final String TERMINAL_INFO = getModel() + "(" + getProduct() + ");v" + getRelease() + ";" + System.getProperty("os.arch");

        public static void clearApplicationData(Context context) {
            File file = new File(context.getCacheDir().getParent());
            if (file.exists()) {
                for (String str : file.list()) {
                    if (!str.equals("lib")) {
                        deleteDir(new File(file, str));
                    }
                }
            }
        }

        public static boolean deleteDir(File file) {
            String[] list;
            if (file != null && file.isDirectory() && (list = file.list()) != null) {
                for (String str : list) {
                    if (!deleteDir(new File(file, str))) {
                        return false;
                    }
                }
            }
            return file != null && file.delete();
        }

        @TargetApi(21)
        public static String getAbis() {
            String[] strArr = getSdkVer() >= 21 ? Build.SUPPORTED_ABIS : new String[]{Build.CPU_ABI, Build.CPU_ABI2};
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < strArr.length; i2++) {
                sb.append(strArr[i2]);
                if (i2 < strArr.length - 1) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }

        public static List<PackageInfo> getAllInstalledApps(PackageManager packageManager) {
            return Build.VERSION.SDK_INT >= 28 ? packageManager.getInstalledPackages(134217857) : packageManager.getInstalledPackages(64);
        }

        public static String getApkIconPath(PackageInfo packageInfo) {
            return "android.resource://" + packageInfo.packageName + "/" + packageInfo.applicationInfo.icon;
        }

        public static String getApkLabel(PackageInfo packageInfo, PackageManager packageManager) {
            return packageInfo.applicationInfo.loadLabel(packageManager).toString();
        }

        public static String getCarrierName(TelephonyManager telephonyManager) {
            return telephonyManager.getNetworkOperatorName();
        }

        public static String getConnectionType(ConnectivityManager connectivityManager) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || activeNetworkInfo.getTypeName() == null) {
                return "unknown";
            }
            int type = activeNetworkInfo.getType();
            return type != 0 ? type != 1 ? type != 9 ? "unknown" : "ethernet" : "wifi" : "mobile";
        }

        public static String getCountryCode(Resources resources) {
            return resources.getConfiguration().locale.getLanguage() + "_" + resources.getConfiguration().locale.getCountry();
        }

        public static String getGlEsVer(ActivityManager activityManager) {
            return activityManager.getDeviceConfigurationInfo().getGlEsVersion();
        }

        public static String getModel() {
            return Build.MODEL.replaceAll(";", " ");
        }

        public static PackageInfo getPackageInfo(String str, PackageManager packageManager) {
            try {
                return Build.VERSION.SDK_INT >= 28 ? packageManager.getPackageInfo(str, 134217857) : packageManager.getPackageInfo(str, 64);
            } catch (PackageManager.NameNotFoundException e2) {
                e2.printStackTrace();
                return null;
            }
        }

        public static String getProduct() {
            return Build.PRODUCT.replace(";", " ");
        }

        public static String getRelease() {
            return Build.VERSION.RELEASE.replaceAll(";", " ");
        }

        public static int getSdkVer() {
            return Build.VERSION.SDK_INT;
        }

        @Deprecated
        public static List<PackageInfo> getUserInstalledApps(PackageManager packageManager) {
            LinkedList linkedList = new LinkedList();
            for (PackageInfo packageInfo : getAllInstalledApps(packageManager)) {
                if ((packageInfo.applicationInfo.flags & 1) == 0) {
                    linkedList.add(packageInfo);
                }
            }
            return linkedList;
        }

        @Deprecated
        public static boolean hasRoot() throws IOException {
            boolean z;
            try {
                Process processExec = Runtime.getRuntime().exec("su");
                DataOutputStream dataOutputStream = new DataOutputStream(processExec.getOutputStream());
                DataInputStream dataInputStream = new DataInputStream(processExec.getInputStream());
                dataOutputStream.writeBytes("id\n");
                dataOutputStream.flush();
                String line = dataInputStream.readLine();
                boolean z2 = true;
                if (line == null) {
                    Logger.getInstance().m8273d("ROOT", "Can't get root access or denied by user");
                    z = false;
                    z2 = false;
                } else if (line.contains("uid=0")) {
                    Logger.getInstance().m8273d("ROOT", "Root access granted");
                    z = true;
                } else {
                    Logger.getInstance().m8273d("ROOT", "Root access rejected: " + line);
                    z = false;
                }
                if (z2) {
                    dataOutputStream.writeBytes("exit\n");
                    dataOutputStream.flush();
                }
                return z;
            } catch (Exception e2) {
                Logger.getInstance().m8273d("ROOT", "Root access rejected [" + e2.getClass().getName() + "] : " + e2.getMessage());
                return false;
            }
        }

        @Deprecated
        public static void hideKeyboard(Activity activity) {
            View currentFocus = activity.getCurrentFocus();
            if (currentFocus != null) {
                ((InputMethodManager) activity.getSystemService("input_method")).hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
            }
        }

        public static void openApp(String str, PackageManager packageManager, Context context) {
            Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
            if (launchIntentForPackage != null) {
                context.startActivity(launchIntentForPackage);
            }
        }

        public static List<ApkPermission> parsePermissions(Context context, List<String> list) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            List<PermissionGroupInfo> allPermissionGroups = packageManager.getAllPermissionGroups(0);
            for (String str : list) {
                for (PermissionGroupInfo permissionGroupInfo : allPermissionGroups) {
                    try {
                        for (PermissionInfo permissionInfo : packageManager.queryPermissionsByGroup(permissionGroupInfo.name, 0)) {
                            if (permissionInfo.name.equals(str)) {
                                arrayList.add(new ApkPermission(permissionGroupInfo.loadLabel(packageManager).toString(), permissionInfo.loadLabel(packageManager).toString()));
                            }
                        }
                    } catch (Exception e2) {
                        Logger.getInstance().m8279e(TAG, (Throwable) e2);
                        throw new RuntimeException(e2);
                    }
                }
            }
            Collections.sort(arrayList, new Comparator() { // from class: cm.aptoide.pt.utils.b
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ((ApkPermission) obj).getName().compareTo(((ApkPermission) obj2).getName());
                }
            });
            return arrayList;
        }

        public static File readLogs(String str, String str2, String str3) throws IOException {
            String line;
            try {
                Process processExec = Runtime.getRuntime().exec("logcat -d");
                FileUtils.createDir(str);
                File file = new File(str, str2);
                StringBuilder sb = new StringBuilder();
                sb.append("Android Build Version: " + Build.VERSION.SDK_INT + "\n");
                sb.append("Build Model: " + Build.MODEL + "\n");
                sb.append("Device: " + Build.DEVICE + "\n");
                sb.append("Brand: " + Build.BRAND + "\n");
                sb.append("CPU: " + Build.CPU_ABI + "\n");
                if (str3 != null) {
                    sb.append("Extra: " + str3 + "\n");
                }
                sb.append("\nLogs:\n");
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
                    for (int i2 = 0; i2 < 100 && (line = bufferedReader.readLine()) != null; i2++) {
                        sb.append(line + "\n");
                    }
                    fileOutputStream.write(sb.toString().getBytes());
                    return file;
                } catch (IOException e2) {
                    Logger.getInstance().m8279e(TAG, (Throwable) e2);
                    return file;
                }
            } catch (IOException e3) {
                Logger.getInstance().m8277e("FeedBackActivity-readLogs", "IOException: " + e3.getMessage());
                return null;
            }
        }
    }

    public static final class ThreadU {
        private static final String TAG = "cm.aptoide.pt.utils.AptoideUtils$ThreadU";

        public static String getStack() {
            StringBuilder sb = new StringBuilder();
            for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
                sb.append(stackTraceElement);
                sb.append("\n");
            }
            return sb.toString();
        }

        public static boolean isUiThread() {
            return Looper.getMainLooper().getThread() == Thread.currentThread();
        }

        static /* synthetic */ void lambda$runOnIoThread$1(Throwable th) {
            Logger.getInstance().m8279e(TAG, th);
            throw new RuntimeException(th);
        }

        public static void runOnIoThread(final Runnable runnable) {
            C11234e.m40025S(null).m40095j0(Schedulers.m40658io()).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.utils.c
                @Override // p456rx.p460m.InterfaceC11253b
                public final void call(Object obj) {
                    runnable.run();
                }
            }, new InterfaceC11253b() { // from class: cm.aptoide.pt.utils.f
                @Override // p456rx.p460m.InterfaceC11253b
                public final void call(Object obj) {
                    AptoideUtils.ThreadU.lambda$runOnIoThread$1((Throwable) obj);
                    throw null;
                }
            });
        }

        public static void runOnUiThread(final Runnable runnable) {
            if (isUiThread()) {
                runnable.run();
            } else {
                C11234e.m40025S(null).m40095j0(C11250a.m40156b()).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.utils.d
                    @Override // p456rx.p460m.InterfaceC11253b
                    public final void call(Object obj) {
                        runnable.run();
                    }
                }, new InterfaceC11253b() { // from class: cm.aptoide.pt.utils.e
                    @Override // p456rx.p460m.InterfaceC11253b
                    public final void call(Object obj) {
                        ((Throwable) obj).printStackTrace();
                    }
                });
            }
        }
    }

    public static class AlgorithmU {
        private static final String TAG = "cm.aptoide.pt.utils.AptoideUtils$AlgorithmU";

        public static String computeHmacSha1(String str, String str2) throws NoSuchAlgorithmException, InvalidKeyException {
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes("UTF-8"), "HmacSHA1");
                Mac mac = Mac.getInstance("HmacSHA1");
                mac.init(secretKeySpec);
                return convToHex(mac.doFinal(str.getBytes("UTF-8")));
            } catch (UnsupportedEncodingException e2) {
                Logger.getInstance().m8279e(TAG, (Throwable) e2);
                return HttpUrl.FRAGMENT_ENCODE_SET;
            } catch (InvalidKeyException e3) {
                Logger.getInstance().m8279e(TAG, (Throwable) e3);
                return HttpUrl.FRAGMENT_ENCODE_SET;
            } catch (NoSuchAlgorithmException e4) {
                Logger.getInstance().m8279e(TAG, (Throwable) e4);
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
        }

        public static String computeMd5(PackageInfo packageInfo) {
            return computeMd5(new File(packageInfo.applicationInfo.sourceDir));
        }

        public static String computeSha1(String str) {
            try {
                return convToHex(computeSha1(str.getBytes("iso-8859-1")));
            } catch (UnsupportedEncodingException e2) {
                Logger.getInstance().m8278e(TAG, "computeSha1(String)", e2);
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
        }

        public static String computeSha1WithColon(byte[] bArr) {
            return convToHexWithColon(computeSha1(bArr)).toUpperCase(Locale.ENGLISH);
        }

        private static String convToHex(byte[] bArr) {
            StringBuilder sb = new StringBuilder();
            for (byte b2 : bArr) {
                sb.append(Integer.toString((b2 & 255) + 256, 16).substring(1));
            }
            return sb.toString();
        }

        private static String convToHexWithColon(byte[] bArr) {
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < bArr.length; i2++) {
                int i3 = (bArr[i2] >>> 4) & 15;
                int i4 = 0;
                while (true) {
                    if (i3 < 0 || i3 > 9) {
                        sb.append((char) ((i3 - 10) + 97));
                    } else {
                        sb.append((char) (i3 + 48));
                    }
                    i3 = bArr[i2] & 15;
                    int i5 = i4 + 1;
                    if (i4 >= 1) {
                        break;
                    }
                    i4 = i5;
                }
                if (i2 < bArr.length - 1) {
                    sb.append(":");
                }
            }
            return sb.toString();
        }

        @Deprecated
        public static int randomBetween(int i2, int i3) {
            int i4 = i3 - i2;
            if (i4 > 0) {
                return new Random().nextInt(i4 + 1) + i2;
            }
            throw new IllegalStateException("Minimum < maximum");
        }

        public static String computeMd5(File file) throws NoSuchAlgorithmException, IOException {
            long jCurrentTimeMillis = System.currentTimeMillis();
            byte[] bArr = new byte[CacheHelper.VALUE_TO_CONVERT_MB_TO_BYTES];
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                FileInputStream fileInputStream = new FileInputStream(file);
                while (true) {
                    int i2 = fileInputStream.read(bArr);
                    if (i2 <= 0) {
                        break;
                    }
                    messageDigest.update(bArr, 0, i2);
                }
                byte[] bArrDigest = messageDigest.digest();
                String string = new BigInteger(1, bArrDigest).toString(16);
                fileInputStream.close();
                if (string.length() != 33) {
                    String strConcat = HttpUrl.FRAGMENT_ENCODE_SET;
                    for (int i3 = 1; i3 < 33 - string.length(); i3++) {
                        strConcat = strConcat.concat("0");
                    }
                    string = strConcat.concat(string);
                }
                Logger.getInstance().m8283v(TAG, "computeMd5: duration: " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
                return string;
            } catch (Exception e2) {
                e2.printStackTrace();
                return null;
            }
        }

        private static byte[] computeSha1(byte[] bArr) throws NoSuchAlgorithmException {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                messageDigest.update(bArr, 0, bArr.length);
                return messageDigest.digest();
            } catch (NoSuchAlgorithmException e2) {
                Logger.getInstance().m8279e(TAG, (Throwable) e2);
                return new byte[0];
            }
        }
    }

    public static final class MathU {
        public static double clamp(double d2, double d3, double d4) {
            return Math.min(Math.max(d2, d3), d4);
        }

        private static int greatestCommonDivisor(int i2, int i3) {
            while (true) {
                int i4 = i3;
                int i5 = i2;
                i2 = i4;
                if (i2 <= 0) {
                    return i5;
                }
                i3 = i5 % i2;
            }
        }

        public static int leastCommonMultiple(int[] iArr) {
            int iLeastCommonMultiple = iArr[0];
            for (int i2 = 1; i2 < iArr.length; i2++) {
                iLeastCommonMultiple = leastCommonMultiple(iLeastCommonMultiple, iArr[i2]);
            }
            return iLeastCommonMultiple;
        }

        public static double mapValueFromRangeToRange(double d2, double d3, double d4, double d5, double d6) {
            return d5 + (((d2 - d3) / (d4 - d3)) * (d6 - d5));
        }

        private static int leastCommonMultiple(int i2, int i3) {
            if (i2 == 0 && i3 == 0) {
                return 0;
            }
            return (Math.abs(i2) / greatestCommonDivisor(i2, i3)) * Math.abs(i3);
        }
    }

    public static class DateTimeU extends DateUtils {
        private static DateTimeU instance = null;
        private static String mTimestampLabelDaysAgo = null;
        private static String mTimestampLabelHourAgo = null;
        private static String mTimestampLabelHoursAgo = null;
        private static String mTimestampLabelJustNow = null;
        private static String mTimestampLabelMinutesAgo = null;
        private static String mTimestampLabelMonthAgo = null;
        private static String mTimestampLabelMonthsAgo = null;
        private static String mTimestampLabelToday = null;
        private static String mTimestampLabelWeekAgo = null;
        private static String mTimestampLabelWeeksAgo = null;
        private static String mTimestampLabelYearAgo = null;
        private static String mTimestampLabelYearsAgo = null;
        private static String mTimestampLabelYesterday = null;
        private static final long millisInADay = 86400000;
        private static String[] weekdays = new DateFormatSymbols().getWeekdays();
        private final Context context;

        private DateTimeU(Context context) {
            this.context = context;
        }

        public static DateTimeU getInstance(Context context) {
            if (instance == null) {
                instance = new DateTimeU(context);
                mTimestampLabelYesterday = ResourseU.getString(C4641R.string.WidgetProvider_timestamp_yesterday, context.getResources());
                mTimestampLabelToday = ResourseU.getString(C4641R.string.WidgetProvider_timestamp_today, context.getResources());
                mTimestampLabelJustNow = ResourseU.getString(C4641R.string.WidgetProvider_timestamp_just_now, context.getResources());
                mTimestampLabelMinutesAgo = ResourseU.getString(C4641R.string.WidgetProvider_timestamp_minutes_ago, context.getResources());
                mTimestampLabelHoursAgo = ResourseU.getString(C4641R.string.WidgetProvider_timestamp_hours_ago, context.getResources());
                mTimestampLabelHourAgo = ResourseU.getString(C4641R.string.WidgetProvider_timestamp_hour_ago, context.getResources());
                mTimestampLabelDaysAgo = ResourseU.getString(C4641R.string.WidgetProvider_timestamp_days_ago, context.getResources());
                mTimestampLabelWeekAgo = ResourseU.getString(C4641R.string.WidgetProvider_timestamp_week_ago2, context.getResources());
                mTimestampLabelWeeksAgo = ResourseU.getString(C4641R.string.WidgetProvider_timestamp_weeks_ago, context.getResources());
                mTimestampLabelMonthAgo = ResourseU.getString(C4641R.string.WidgetProvider_timestamp_month_ago, context.getResources());
                mTimestampLabelMonthsAgo = ResourseU.getString(C4641R.string.WidgetProvider_timestamp_months_ago, context.getResources());
                mTimestampLabelYearAgo = ResourseU.getString(C4641R.string.WidgetProvider_timestamp_year_ago, context.getResources());
                mTimestampLabelYearsAgo = ResourseU.getString(C4641R.string.WidgetProvider_timestamp_years_ago, context.getResources());
            }
            return instance;
        }

        private static boolean isYesterday(long j2) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j2);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(5, -1);
            return calendar2.get(1) == calendar.get(1) && calendar2.get(6) == calendar.get(6);
        }

        public String getTimeDiffAll(Context context, long j2, Resources resources) {
            long time = new Date().getTime() - j2;
            if (isYesterday(j2) || DateUtils.isToday(j2)) {
                getTimeDiffString(j2, context, resources);
                return getTimeDiffString(j2, context, resources);
            }
            if (time < 604800000) {
                int iIntValue = Double.valueOf(Math.ceil(time / 86400000)).intValue();
                return iIntValue == 1 ? mTimestampLabelYesterday : StringU.getFormattedString(C4641R.string.WidgetProvider_timestamp_days_ago, resources, Integer.valueOf(iIntValue));
            }
            if (time < 2419200000L) {
                int iIntValue2 = Double.valueOf(Math.ceil(time / 604800000)).intValue();
                return iIntValue2 == 1 ? mTimestampLabelWeekAgo : StringU.getFormattedString(C4641R.string.WidgetProvider_timestamp_weeks_ago, resources, Integer.valueOf(iIntValue2));
            }
            if (time < 29030400000L) {
                int iIntValue3 = Double.valueOf(Math.ceil(time / 2419200000L)).intValue();
                return iIntValue3 == 1 ? mTimestampLabelMonthAgo : StringU.getFormattedString(C4641R.string.WidgetProvider_timestamp_months_ago, resources, Integer.valueOf(iIntValue3));
            }
            int iIntValue4 = Double.valueOf(Math.ceil(time / 29030400000L)).intValue();
            return iIntValue4 == 1 ? mTimestampLabelYearAgo : StringU.getFormattedString(C4641R.string.WidgetProvider_timestamp_years_ago, resources, Integer.valueOf(iIntValue4));
        }

        public String getTimeDiffString(Context context, long j2, Resources resources) {
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(j2);
            long timeInMillis = calendar.getTimeInMillis() - calendar2.getTimeInMillis();
            long j3 = timeInMillis / 3600000;
            long j4 = (timeInMillis / 60000) - (60 * j3);
            long j5 = timeInMillis / 1000;
            return (j3 <= 0 || j3 >= 12) ? j3 <= 0 ? j4 > 0 ? StringU.getFormattedString(C4641R.string.WidgetProvider_timestamp_minutes_ago, resources, Long.valueOf(j4)) : mTimestampLabelJustNow : DateUtils.isToday(j2) ? mTimestampLabelToday : isYesterday(j2) ? mTimestampLabelYesterday : calendar.getTimeInMillis() - j2 < 518400000 ? weekdays[calendar2.get(7)] : DateUtils.formatDateTime(context, j2, 131072) : j3 == 1 ? StringU.getFormattedString(C4641R.string.WidgetProvider_timestamp_hour_ago, resources, Long.valueOf(j3)) : StringU.getFormattedString(C4641R.string.WidgetProvider_timestamp_hours_ago, resources, Long.valueOf(j3));
        }

        public String getTimeDiffString(long j2, Context context, Resources resources) {
            return getTimeDiffString(context, j2, resources);
        }
    }
}
