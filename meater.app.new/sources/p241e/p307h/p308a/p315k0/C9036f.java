package p241e.p307h.p308a.p315k0;

import android.app.ActivityManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.Process;
import android.os.StatFs;
import android.text.TextUtils;
import com.liulishuo.filedownloader.exception.FileDownloadGiveUpRetryException;
import com.liulishuo.filedownloader.exception.FileDownloadSecurityException;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p241e.p307h.p308a.p309e0.InterfaceC9001b;
import p241e.p307h.p308a.p311g0.C9013c;
import p241e.p307h.p308a.p314j0.InterfaceC9028a;

/* compiled from: FileDownloadUtils.java */
/* renamed from: e.h.a.k0.f */
/* loaded from: classes2.dex */
public class C9036f {

    /* renamed from: a */
    private static int f34829a = 65536;

    /* renamed from: b */
    private static long f34830b = 2000;

    /* renamed from: c */
    private static String f34831c;

    /* renamed from: d */
    private static Boolean f34832d;

    /* renamed from: e */
    private static final Pattern f34833e = Pattern.compile("attachment;\\s*filename\\*\\s*=\\s*\"*([^\"]*)'\\S*'([^\"]*)\"*");

    /* renamed from: f */
    private static final Pattern f34834f = Pattern.compile("attachment;\\s*filename\\s*=\\s*\"*([^\"\\n]*)\"*");

    /* renamed from: A */
    public static String m28974A(String str) {
        int length = str.length();
        int i2 = (File.separatorChar == '\\' && length > 2 && str.charAt(1) == ':') ? 2 : 0;
        int iLastIndexOf = str.lastIndexOf(File.separatorChar);
        int i3 = (iLastIndexOf != -1 || i2 <= 0) ? iLastIndexOf : 2;
        if (i3 == -1) {
            return null;
        }
        char cCharAt = str.charAt(length - 1);
        char c2 = File.separatorChar;
        if (cCharAt == c2) {
            return null;
        }
        return (str.indexOf(c2) == i3 && str.charAt(i2) == File.separatorChar) ? str.substring(0, i3 + 1) : str.substring(0, i3);
    }

    /* renamed from: B */
    public static String m28975B(String str, boolean z, String str2) {
        if (str == null) {
            return null;
        }
        if (!z) {
            return str;
        }
        if (str2 == null) {
            return null;
        }
        return m29011q(str, str2);
    }

    /* renamed from: C */
    public static String m28976C(String str) {
        return m29009o("%s.temp", str);
    }

    /* renamed from: D */
    public static String m28977D(String str) {
        return "FileDownloader-" + str;
    }

    /* renamed from: E */
    public static boolean m28978E(int i2, InterfaceC9001b interfaceC9001b) {
        if (i2 == 206 || i2 == 1) {
            return true;
        }
        return "bytes".equals(interfaceC9001b.mo27914e("Accept-Ranges"));
    }

    /* renamed from: F */
    private static boolean m28979F(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        ActivityManager activityManager = (ActivityManager) context.getApplicationContext().getSystemService("activity");
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null || (powerManager = (PowerManager) context.getSystemService("power")) == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT > 19) {
            if (!powerManager.isInteractive()) {
                return false;
            }
        } else if (!powerManager.isScreenOn()) {
            return false;
        }
        String packageName = context.getApplicationContext().getPackageName();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.processName.equals(packageName) && runningAppProcessInfo.importance == 100) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: G */
    public static boolean m28980G(int i2, FileDownloadModel fileDownloadModel) {
        return m28981H(i2, fileDownloadModel, null);
    }

    /* renamed from: H */
    public static boolean m28981H(int i2, FileDownloadModel fileDownloadModel, Boolean bool) {
        if (fileDownloadModel == null) {
            if (C9034d.f34819a) {
                C9034d.m28962a(C9036f.class, "can't continue %d model == null", Integer.valueOf(i2));
            }
            return false;
        }
        if (fileDownloadModel.m27566j() != null) {
            return m28982I(i2, fileDownloadModel, fileDownloadModel.m27566j(), bool);
        }
        if (C9034d.f34819a) {
            C9034d.m28962a(C9036f.class, "can't continue %d temp path == null", Integer.valueOf(i2));
        }
        return false;
    }

    /* renamed from: I */
    public static boolean m28982I(int i2, FileDownloadModel fileDownloadModel, String str, Boolean bool) {
        if (str == null) {
            if (!C9034d.f34819a) {
                return false;
            }
            C9034d.m28962a(C9036f.class, "can't continue %d path = null", Integer.valueOf(i2));
            return false;
        }
        File file = new File(str);
        boolean zExists = file.exists();
        boolean zIsDirectory = file.isDirectory();
        if (!zExists || zIsDirectory) {
            if (!C9034d.f34819a) {
                return false;
            }
            C9034d.m28962a(C9036f.class, "can't continue %d file not suit, exists[%B], directory[%B]", Integer.valueOf(i2), Boolean.valueOf(zExists), Boolean.valueOf(zIsDirectory));
            return false;
        }
        long length = file.length();
        long jM27563g = fileDownloadModel.m27563g();
        if (fileDownloadModel.m27557a() <= 1 && jM27563g == 0) {
            if (!C9034d.f34819a) {
                return false;
            }
            C9034d.m28962a(C9036f.class, "can't continue %d the downloaded-record is zero.", Integer.valueOf(i2));
            return false;
        }
        long jM27567k = fileDownloadModel.m27567k();
        if (length < jM27563g || (jM27567k != -1 && (length > jM27567k || jM27563g >= jM27567k))) {
            if (!C9034d.f34819a) {
                return false;
            }
            C9034d.m28962a(C9036f.class, "can't continue %d dirty data fileLength[%d] sofar[%d] total[%d]", Integer.valueOf(i2), Long.valueOf(length), Long.valueOf(jM27563g), Long.valueOf(jM27567k));
            return false;
        }
        if (bool == null || bool.booleanValue() || jM27567k != length) {
            return true;
        }
        if (!C9034d.f34819a) {
            return false;
        }
        C9034d.m28962a(C9036f.class, "can't continue %d, because of the output stream doesn't support seek, but the task has already pre-allocated, so we only can download it from the very beginning.", Integer.valueOf(i2));
        return false;
    }

    /* renamed from: J */
    public static boolean m28983J(Context context) {
        Boolean bool = f34832d;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean zEndsWith = false;
        if (!C9035e.m28971a().f34823d) {
            int iMyPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
                if (runningAppProcesses != null && !runningAppProcesses.isEmpty()) {
                    Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        ActivityManager.RunningAppProcessInfo next = it.next();
                        if (next.pid == iMyPid) {
                            zEndsWith = next.processName.endsWith(":filedownloader");
                            break;
                        }
                    }
                } else {
                    C9034d.m28970i(C9036f.class, "The running app process info list from ActivityManager is null or empty, maybe current App is not running.", new Object[0]);
                    return false;
                }
            } else {
                C9034d.m28970i(C9036f.class, "fail to get the activity manager!", new Object[0]);
                return false;
            }
        } else {
            zEndsWith = true;
        }
        Boolean boolValueOf = Boolean.valueOf(zEndsWith);
        f34832d = boolValueOf;
        return boolValueOf.booleanValue();
    }

    /* renamed from: K */
    public static boolean m28984K(String str) {
        return true;
    }

    /* renamed from: L */
    public static boolean m28985L(long j2, long j3) {
        return j2 > ((long) m29019y()) && j3 > m29020z();
    }

    /* renamed from: M */
    public static boolean m28986M() {
        ConnectivityManager connectivityManager = (ConnectivityManager) C9033c.m28956a().getSystemService("connectivity");
        if (connectivityManager == null) {
            C9034d.m28970i(C9036f.class, "failed to get connectivity manager!", new Object[0]);
            return true;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo == null || activeNetworkInfo.getType() != 1;
    }

    /* renamed from: N */
    public static void m28987N(Context context) throws IOException {
        File fileM29015u = m29015u(context);
        try {
            fileM29015u.getParentFile().mkdirs();
            fileM29015u.createNewFile();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: O */
    public static String m28988O(String str) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder(bArrDigest.length * 2);
            for (byte b2 : bArrDigest) {
                int i2 = b2 & 255;
                if (i2 < 16) {
                    sb.append("0");
                }
                sb.append(Integer.toHexString(i2));
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("Huh, UTF-8 should be supported?", e2);
        } catch (NoSuchAlgorithmException e3) {
            throw new RuntimeException("Huh, MD5 should be supported?", e3);
        }
    }

    /* renamed from: P */
    public static boolean m28989P(Context context) {
        return Build.VERSION.SDK_INT >= 26 && !m28979F(context);
    }

    /* renamed from: Q */
    public static String m28990Q(String str) {
        Matcher matcher;
        if (str == null) {
            return null;
        }
        try {
            matcher = f34833e.matcher(str);
        } catch (UnsupportedEncodingException | IllegalStateException unused) {
        }
        if (matcher.find()) {
            return URLDecoder.decode(matcher.group(2), matcher.group(1));
        }
        Matcher matcher2 = f34834f.matcher(str);
        if (matcher2.find()) {
            return matcher2.group(1);
        }
        return null;
    }

    /* renamed from: R */
    public static long m28991R(String str) throws NumberFormatException {
        if (str != null && str.length() != 0) {
            try {
                Matcher matcher = Pattern.compile("bytes (\\d+)-(\\d+)/\\d+").matcher(str);
                if (matcher.find()) {
                    return (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                }
            } catch (Exception e2) {
                C9034d.m28964c(C9036f.class, e2, "parse content length from content range error", new Object[0]);
            }
        }
        return -1L;
    }

    /* renamed from: S */
    public static long m28992S(String str) {
        if (str == null) {
            return -1L;
        }
        String[] strArrSplit = str.split("/");
        if (strArrSplit.length >= 2) {
            try {
                return Long.parseLong(strArrSplit[1]);
            } catch (NumberFormatException unused) {
                C9034d.m28970i(C9036f.class, "parse instance length failed with %s", str);
            }
        }
        return -1L;
    }

    /* renamed from: T */
    public static void m28993T(int i2) throws IllegalAccessException {
        if (!m28983J(C9033c.m28956a())) {
            throw new IllegalAccessException("This value is used in the :filedownloader process, so set this value in your process is without effect. You can add 'process.non-separate=true' in 'filedownloader.properties' to share the main process to FileDownloadService. Or you can configure this value in 'filedownloader.properties' by 'download.min-progress-step'.");
        }
        f34829a = i2;
    }

    /* renamed from: U */
    public static void m28994U(long j2) throws IllegalAccessException {
        if (!m28983J(C9033c.m28956a())) {
            throw new IllegalAccessException("This value is used in the :filedownloader process, so set this value in your process is without effect. You can add 'process.non-separate=true' in 'filedownloader.properties' to share the main process to FileDownloadService. Or you can configure this value in 'filedownloader.properties' by 'download.min-progress-time'.");
        }
        f34830b = j2;
    }

    /* renamed from: a */
    public static boolean m28995a(String str) {
        return C9033c.m28956a().checkCallingOrSelfPermission(str) == 0;
    }

    /* renamed from: b */
    public static long m28996b(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    /* renamed from: c */
    public static InterfaceC9028a m28997c(String str) throws IOException {
        if (TextUtils.isEmpty(str)) {
            throw new RuntimeException("found invalid internal destination path, empty");
        }
        if (!m28984K(str)) {
            throw new RuntimeException(m29009o("found invalid internal destination filename %s", str));
        }
        File file = new File(str);
        if (file.exists() && file.isDirectory()) {
            throw new RuntimeException(m29009o("found invalid internal destination path[%s], & path is directory[%B]", str, Boolean.valueOf(file.isDirectory())));
        }
        if (file.exists() || file.createNewFile()) {
            return C9013c.m28789j().m28793b(file);
        }
        throw new IOException(m29009o("create new file error  %s", file.getAbsolutePath()));
    }

    /* renamed from: d */
    public static String m28998d() {
        return m29009o("FileDownloader/%s", "1.7.7");
    }

    /* renamed from: e */
    public static void m28999e(String str) {
        if (str != null) {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
        }
    }

    /* renamed from: f */
    public static void m29000f(String str, String str2) {
        m29001g(str2);
        m28999e(str);
    }

    /* renamed from: g */
    public static void m29001g(String str) {
        if (str != null) {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
        }
    }

    /* renamed from: h */
    public static long m29002h(int i2, InterfaceC9001b interfaceC9001b) {
        long jM28996b = m28996b(interfaceC9001b.mo27914e("Content-Length"));
        String strMo27914e = interfaceC9001b.mo27914e("Transfer-Encoding");
        if (jM28996b >= 0) {
            return jM28996b;
        }
        if (!(strMo27914e != null && strMo27914e.equals("chunked"))) {
            if (!C9035e.m28971a().f34822c) {
                throw new FileDownloadGiveUpRetryException("can't know the size of the download file, and its Transfer-Encoding is not Chunked either.\nyou can ignore such exception by add http.lenient=true to the filedownloader.properties");
            }
            if (C9034d.f34819a) {
                C9034d.m28962a(C9036f.class, "%d response header is not legal but HTTP lenient is true, so handle as the case of transfer encoding chunk", Integer.valueOf(i2));
            }
        }
        return -1L;
    }

    /* renamed from: i */
    public static long m29003i(InterfaceC9001b interfaceC9001b) throws NumberFormatException {
        long jM28991R = m28991R(m29014t(interfaceC9001b));
        if (jM28991R < 0) {
            return -1L;
        }
        return jM28991R;
    }

    /* renamed from: j */
    public static String m29004j(int i2, InterfaceC9001b interfaceC9001b) {
        if (interfaceC9001b == null) {
            throw new RuntimeException("connection is null when findEtag");
        }
        String strMo27914e = interfaceC9001b.mo27914e("Etag");
        if (C9034d.f34819a) {
            C9034d.m28962a(C9036f.class, "etag find %s for task(%d)", strMo27914e, Integer.valueOf(i2));
        }
        return strMo27914e;
    }

    /* renamed from: k */
    static String m29005k(String str) {
        if (str != null && !str.isEmpty()) {
            try {
                String path = new URL(str).getPath();
                String strSubstring = path.substring(path.lastIndexOf(47) + 1);
                if (strSubstring.isEmpty()) {
                    return null;
                }
                return strSubstring;
            } catch (MalformedURLException unused) {
            }
        }
        return null;
    }

    /* renamed from: l */
    public static String m29006l(InterfaceC9001b interfaceC9001b, String str) throws FileDownloadSecurityException {
        String strM28990Q = m28990Q(interfaceC9001b.mo27914e("Content-Disposition"));
        if (TextUtils.isEmpty(strM28990Q)) {
            strM28990Q = m29005k(str);
        }
        if (TextUtils.isEmpty(strM28990Q)) {
            return m29010p(str);
        }
        if (strM28990Q.contains("../")) {
            throw new FileDownloadSecurityException(m29009o("The filename [%s] from the response is not allowable, because it contains '../', which can raise the directory traversal vulnerability", strM28990Q));
        }
        return strM28990Q;
    }

    /* renamed from: m */
    public static long m29007m(InterfaceC9001b interfaceC9001b) {
        long jM29008n = m29008n(interfaceC9001b);
        if (jM29008n < 0) {
            C9034d.m28970i(C9036f.class, "don't get instance length fromContent-Range header", new Object[0]);
            jM29008n = -1;
        }
        if (jM29008n == 0 && C9035e.m28971a().f34827h) {
            return -1L;
        }
        return jM29008n;
    }

    /* renamed from: n */
    public static long m29008n(InterfaceC9001b interfaceC9001b) {
        return m28992S(m29014t(interfaceC9001b));
    }

    /* renamed from: o */
    public static String m29009o(String str, Object... objArr) {
        return String.format(Locale.ENGLISH, str, objArr);
    }

    /* renamed from: p */
    public static String m29010p(String str) {
        return m28988O(str);
    }

    /* renamed from: q */
    public static String m29011q(String str, String str2) {
        if (str2 == null) {
            throw new IllegalStateException("can't generate real path, the file name is null");
        }
        if (str != null) {
            return m29009o("%s%s%s", str, File.separator, str2);
        }
        throw new IllegalStateException("can't generate real path, the directory is null");
    }

    /* renamed from: r */
    public static int m29012r(String str, String str2) {
        return C9013c.m28789j().m28797i().mo27612a(str, str2, false);
    }

    /* renamed from: s */
    public static int m29013s(String str, String str2, boolean z) {
        return C9013c.m28789j().m28797i().mo27612a(str, str2, z);
    }

    /* renamed from: t */
    private static String m29014t(InterfaceC9001b interfaceC9001b) {
        return interfaceC9001b.mo27914e("Content-Range");
    }

    /* renamed from: u */
    public static File m29015u(Context context) {
        return new File(context.getFilesDir().getAbsolutePath() + File.separator + "filedownloader", ".old_file_converted");
    }

    /* renamed from: v */
    public static String m29016v(String str) {
        return m29011q(m29017w(), m29010p(str));
    }

    /* renamed from: w */
    public static String m29017w() {
        if (!TextUtils.isEmpty(f34831c)) {
            return f34831c;
        }
        boolean z = false;
        if (C9033c.m28956a().getExternalCacheDir() != null && Environment.getExternalStorageState().equals("mounted") && Environment.getExternalStorageDirectory().getFreeSpace() > 0) {
            z = true;
        }
        return z ? C9033c.m28956a().getExternalCacheDir().getAbsolutePath() : C9033c.m28956a().getCacheDir().getAbsolutePath();
    }

    /* renamed from: x */
    public static long m29018x(String str) {
        return Build.VERSION.SDK_INT >= 18 ? new StatFs(str).getAvailableBytes() : r0.getAvailableBlocks() * r0.getBlockSize();
    }

    /* renamed from: y */
    public static int m29019y() {
        return f34829a;
    }

    /* renamed from: z */
    public static long m29020z() {
        return f34830b;
    }
}
