package com.google.firebase.crashlytics.internal.p183n;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.C8179h;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import okhttp3.HttpUrl;

/* compiled from: CommonUtils.java */
/* renamed from: com.google.firebase.crashlytics.h.n.t */
/* loaded from: classes2.dex */
public class C8228t {

    /* renamed from: a */
    private static final char[] f30965a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* compiled from: CommonUtils.java */
    /* renamed from: com.google.firebase.crashlytics.h.n.t$a */
    enum a {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;


        /* renamed from: p */
        private static final Map<String, a> f30976p;

        static {
            a aVar = X86_32;
            a aVar2 = ARMV6;
            a aVar3 = ARMV7;
            a aVar4 = ARM64;
            HashMap map = new HashMap(4);
            f30976p = map;
            map.put("armeabi-v7a", aVar3);
            map.put("armeabi", aVar2);
            map.put("arm64-v8a", aVar4);
            map.put("x86", aVar);
        }

        /* renamed from: g */
        static a m25356g() {
            String str = Build.CPU_ABI;
            if (TextUtils.isEmpty(str)) {
                C8179h.m25176f().m25183i("Architecture#getValue()::Build.CPU_ABI returned null or empty");
                return UNKNOWN;
            }
            a aVar = f30976p.get(str.toLowerCase(Locale.US));
            return aVar == null ? UNKNOWN : aVar;
        }
    }

    /* renamed from: A */
    public static String m25329A(InputStream inputStream) {
        Scanner scannerUseDelimiter = new Scanner(inputStream).useDelimiter("\\A");
        return scannerUseDelimiter.hasNext() ? scannerUseDelimiter.next() : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* renamed from: a */
    public static long m25330a(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    /* renamed from: b */
    public static synchronized long m25331b(Context context) {
        ActivityManager.MemoryInfo memoryInfo;
        memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    /* renamed from: c */
    public static long m25332c(String str) {
        long blockSize = new StatFs(str).getBlockSize();
        return (r0.getBlockCount() * blockSize) - (blockSize * r0.getAvailableBlocks());
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: d */
    public static boolean m25333d(Context context) {
        if (!m25334e(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return true;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    /* renamed from: e */
    public static boolean m25334e(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    /* renamed from: f */
    public static void m25335f(Closeable closeable, String str) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e2) {
                C8179h.m25176f().m25180e(str, e2);
            }
        }
    }

    /* renamed from: g */
    public static void m25336g(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: h */
    public static String m25337h(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str != null) {
                arrayList.add(str.replace("-", HttpUrl.FRAGMENT_ENCODE_SET).toLowerCase(Locale.US));
            }
        }
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
        }
        String string = sb.toString();
        if (string.length() > 0) {
            return m25355z(string);
        }
        return null;
    }

    /* renamed from: i */
    public static boolean m25338i(Context context, String str, boolean z) {
        Resources resources;
        if (context != null && (resources = context.getResources()) != null) {
            int iM25345p = m25345p(context, str, "bool");
            if (iM25345p > 0) {
                return resources.getBoolean(iM25345p);
            }
            int iM25345p2 = m25345p(context, str, "string");
            if (iM25345p2 > 0) {
                return Boolean.parseBoolean(context.getString(iM25345p2));
            }
        }
        return z;
    }

    /* renamed from: j */
    public static List<C8224q> m25339j(Context context) throws Resources.NotFoundException {
        ArrayList arrayList = new ArrayList();
        int iM25345p = m25345p(context, "com.google.firebase.crashlytics.build_ids_lib", "array");
        int iM25345p2 = m25345p(context, "com.google.firebase.crashlytics.build_ids_arch", "array");
        int iM25345p3 = m25345p(context, "com.google.firebase.crashlytics.build_ids_build_id", "array");
        if (iM25345p == 0 || iM25345p2 == 0 || iM25345p3 == 0) {
            C8179h.m25176f().m25177b(String.format("Could not find resources: %d %d %d", Integer.valueOf(iM25345p), Integer.valueOf(iM25345p2), Integer.valueOf(iM25345p3)));
            return arrayList;
        }
        String[] stringArray = context.getResources().getStringArray(iM25345p);
        String[] stringArray2 = context.getResources().getStringArray(iM25345p2);
        String[] stringArray3 = context.getResources().getStringArray(iM25345p3);
        if (stringArray.length != stringArray3.length || stringArray2.length != stringArray3.length) {
            C8179h.m25176f().m25177b(String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length)));
            return arrayList;
        }
        for (int i2 = 0; i2 < stringArray3.length; i2++) {
            arrayList.add(new C8224q(stringArray[i2], stringArray2[i2], stringArray3[i2]));
        }
        return arrayList;
    }

    /* renamed from: k */
    public static int m25340k() {
        return a.m25356g().ordinal();
    }

    /* renamed from: l */
    public static int m25341l() {
        int i2 = m25352w() ? 1 : 0;
        if (m25353x()) {
            i2 |= 2;
        }
        return m25351v() ? i2 | 4 : i2;
    }

    /* renamed from: m */
    public static String m25342m(Context context) {
        int iM25345p = m25345p(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (iM25345p == 0) {
            iM25345p = m25345p(context, "com.crashlytics.android.build_id", "string");
        }
        if (iM25345p != 0) {
            return context.getResources().getString(iM25345p);
        }
        return null;
    }

    /* renamed from: n */
    public static boolean m25343n(Context context) {
        return (m25352w() || ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) == null) ? false : true;
    }

    /* renamed from: o */
    public static String m25344o(Context context) throws Resources.NotFoundException {
        int i2 = context.getApplicationContext().getApplicationInfo().icon;
        if (i2 <= 0) {
            return context.getPackageName();
        }
        try {
            String resourcePackageName = context.getResources().getResourcePackageName(i2);
            return "android".equals(resourcePackageName) ? context.getPackageName() : resourcePackageName;
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    /* renamed from: p */
    public static int m25345p(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, m25344o(context));
    }

    /* renamed from: q */
    public static SharedPreferences m25346q(Context context) {
        return context.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    /* renamed from: r */
    private static String m25347r(String str, String str2) {
        return m25348s(str.getBytes(), str2);
    }

    /* renamed from: s */
    private static String m25348s(byte[] bArr, String str) throws NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            messageDigest.update(bArr);
            return m25349t(messageDigest.digest());
        } catch (NoSuchAlgorithmException e2) {
            C8179h.m25176f().m25180e("Could not create hashing algorithm: " + str + ", returning empty string.", e2);
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    /* renamed from: t */
    public static String m25349t(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            int i3 = bArr[i2] & 255;
            int i4 = i2 * 2;
            char[] cArr2 = f30965a;
            cArr[i4] = cArr2[i3 >>> 4];
            cArr[i4 + 1] = cArr2[i3 & 15];
        }
        return new String(cArr);
    }

    /* renamed from: u */
    public static boolean m25350u(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    /* renamed from: v */
    public static boolean m25351v() {
        return Debug.isDebuggerConnected() || Debug.waitingForDebugger();
    }

    /* renamed from: w */
    public static boolean m25352w() {
        if (!Build.PRODUCT.contains("sdk")) {
            String str = Build.HARDWARE;
            if (!str.contains("goldfish") && !str.contains("ranchu")) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: x */
    public static boolean m25353x() {
        boolean zM25352w = m25352w();
        String str = Build.TAGS;
        if ((zM25352w || str == null || !str.contains("test-keys")) && !new File("/system/app/Superuser.apk").exists()) {
            return !zM25352w && new File("/system/xbin/su").exists();
        }
        return true;
    }

    /* renamed from: y */
    public static boolean m25354y(String str, String str2) {
        return str == null ? str2 == null : str.equals(str2);
    }

    /* renamed from: z */
    public static String m25355z(String str) {
        return m25347r(str, "SHA-1");
    }
}
