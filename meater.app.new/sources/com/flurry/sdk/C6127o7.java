package com.flurry.sdk;

import android.os.Build;
import android.os.Debug;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.flurry.sdk.o7 */
/* loaded from: classes2.dex */
public final class C6127o7 {
    /* renamed from: a */
    public static Map<String, String> m13230a() {
        HashMap map = new HashMap();
        m13231b(map);
        m13232c(map);
        m13234e(map);
        m13237h(map);
        m13238i(map);
        m13233d(map);
        m13235f(map);
        m13236g(map);
        return map;
    }

    /* renamed from: b */
    private static void m13231b(Map<String, String> map) {
        try {
            map.put("mem.java.max", Long.toString(Runtime.getRuntime().maxMemory()));
        } catch (RuntimeException e2) {
            C6021d1.m13031d(6, "CrashParameterCollector", "Error retrieving max memory", e2);
        }
    }

    /* renamed from: c */
    private static void m13232c(Map<String, String> map) {
        try {
            Debug.getMemoryInfo(new Debug.MemoryInfo());
            map.put("mem.pss", Long.toString(r0.getTotalPss() * 1024));
        } catch (RuntimeException e2) {
            C6021d1.m13031d(6, "CrashParameterCollector", "Error retrieving pss memory", e2);
        }
    }

    /* renamed from: d */
    private static void m13233d(Map<String, String> map) throws Throwable {
        BufferedReader bufferedReader;
        Pattern patternCompile = Pattern.compile("^Vm(RSS|Size|Peak):\\s+(\\d+)\\s+kB$");
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(new File(new File("/proc/" + Integer.toString(Process.myPid())), "status"));
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream2));
            } catch (IOException e2) {
                e = e2;
                bufferedReader = null;
            } catch (Throwable th) {
                th = th;
                bufferedReader = null;
            }
            try {
                for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                    Matcher matcher = patternCompile.matcher(line);
                    if (matcher.find()) {
                        String strGroup = matcher.group(1);
                        String strGroup2 = matcher.group(2);
                        if (!TextUtils.isEmpty(strGroup) && !TextUtils.isEmpty(strGroup2)) {
                            char c2 = 65535;
                            int iHashCode = strGroup.hashCode();
                            if (iHashCode != 81458) {
                                if (iHashCode != 2483455) {
                                    if (iHashCode == 2577441 && strGroup.equals("Size")) {
                                        c2 = 1;
                                    }
                                } else if (strGroup.equals("Peak")) {
                                    c2 = 2;
                                }
                            } else if (strGroup.equals("RSS")) {
                                c2 = 0;
                            }
                            if (c2 == 0) {
                                map.put("mem.rss", strGroup2);
                            } else if (c2 == 1) {
                                map.put("mem.virt", strGroup2);
                            } else if (c2 == 2) {
                                map.put("mem.virt.max", strGroup2);
                            }
                        }
                    }
                }
                C6013c2.m12990f(fileInputStream2);
            } catch (IOException e3) {
                e = e3;
                fileInputStream = fileInputStream2;
                try {
                    C6021d1.m13031d(6, "CrashParameterCollector", "Error getting proc file Info", e);
                    C6013c2.m12990f(fileInputStream);
                    C6013c2.m12990f(bufferedReader);
                } catch (Throwable th2) {
                    th = th2;
                    C6013c2.m12990f(fileInputStream);
                    C6013c2.m12990f(bufferedReader);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = fileInputStream2;
                C6013c2.m12990f(fileInputStream);
                C6013c2.m12990f(bufferedReader);
                throw th;
            }
        } catch (IOException e4) {
            e = e4;
            bufferedReader = null;
        } catch (Throwable th4) {
            th = th4;
            bufferedReader = null;
        }
        C6013c2.m12990f(bufferedReader);
    }

    /* renamed from: e */
    private static void m13234e(Map<String, String> map) {
        map.put("application.state", Integer.toString(C6037e7.m13055a().f15830j.m13094y().f15931j));
    }

    /* renamed from: f */
    private static void m13235f(Map<String, String> map) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int i2 = Build.VERSION.SDK_INT;
        map.put("disk.size.free", Long.toString((i2 >= 18 ? statFs.getAvailableBlocksLong() : statFs.getAvailableBlocks()) * (i2 >= 18 ? statFs.getBlockSizeLong() : statFs.getBlockSize())));
    }

    /* renamed from: g */
    private static void m13236g(Map<String, String> map) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int i2 = Build.VERSION.SDK_INT;
        map.put("disk.size.total", Long.toString((i2 >= 18 ? statFs.getBlockCountLong() : statFs.getBlockCount()) * (i2 >= 18 ? statFs.getBlockSizeLong() : statFs.getBlockSize())));
    }

    /* renamed from: h */
    private static void m13237h(Map<String, String> map) {
        map.put("net.status", Integer.toString(C6037e7.m13055a().f15823c.m13358T().ordinal()));
    }

    /* renamed from: i */
    private static void m13238i(Map<String, String> map) {
        map.put("orientation", Integer.toString(C6037e7.m13055a().f15824d.f16270q));
    }
}
