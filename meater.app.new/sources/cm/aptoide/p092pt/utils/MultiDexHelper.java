package cm.aptoide.p092pt.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class MultiDexHelper {
    private static final String EXTRACTED_NAME_EXT = ".classes";
    public static final String EXTRACTED_SUFFIX = ".zip";
    private static final String KEY_DEX_NUMBER = "dex.number";
    private static final String PREFS_FILE = "multidex.version";
    private static final String SECONDARY_FOLDER_NAME = "code_cache" + File.separator + "secondary-dexes";

    public static List<Map.Entry<String, String>> getAllClasses(Context context) throws PackageManager.NameNotFoundException, IOException {
        ArrayList arrayList = new ArrayList();
        for (String str : getSourcePaths(context)) {
            DexFile dexFile = null;
            try {
                try {
                    DexFile dexFileLoadDex = str.endsWith(EXTRACTED_SUFFIX) ? DexFile.loadDex(str, str + ".tmp", 0) : new DexFile(str);
                    Enumeration<String> enumerationEntries = dexFileLoadDex.entries();
                    while (enumerationEntries.hasMoreElements()) {
                        arrayList.add(new AbstractMap.SimpleImmutableEntry(enumerationEntries.nextElement(), str));
                    }
                    dexFileLoadDex.close();
                } catch (IOException unused) {
                    throw new IOException("Error at loading dex file '" + str + "'");
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    dexFile.close();
                }
                throw th;
            }
        }
        return arrayList;
    }

    private static SharedPreferences getMultiDexPreferences(Context context) {
        return context.getSharedPreferences(PREFS_FILE, Build.VERSION.SDK_INT < 11 ? 0 : 4);
    }

    public static List<String> getSourcePaths(Context context) throws PackageManager.NameNotFoundException, IOException {
        ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0);
        File file = new File(applicationInfo.sourceDir);
        File file2 = new File(applicationInfo.dataDir, SECONDARY_FOLDER_NAME);
        ArrayList arrayList = new ArrayList();
        arrayList.add(applicationInfo.sourceDir);
        String str = file.getName() + EXTRACTED_NAME_EXT;
        int i2 = getMultiDexPreferences(context).getInt(KEY_DEX_NUMBER, 1);
        for (int i3 = 2; i3 <= i2; i3++) {
            File file3 = new File(file2, str + i3 + EXTRACTED_SUFFIX);
            if (!file3.isFile()) {
                throw new IOException("Missing extracted secondary dex file '" + file3.getPath() + "'");
            }
            arrayList.add(file3.getAbsolutePath());
        }
        return arrayList;
    }
}
