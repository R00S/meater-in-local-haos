package p241e.p307h.p308a.p315k0;

/* compiled from: DownloadServiceNotConnectedHelper.java */
/* renamed from: e.h.a.k0.a */
/* loaded from: classes2.dex */
public class C9031a {
    /* renamed from: a */
    public static boolean m28947a(int i2) {
        m28949c("request clear the task[%d] data in the database", Integer.valueOf(i2));
        return false;
    }

    /* renamed from: b */
    public static byte m28948b(int i2) {
        m28949c("request get the status for the task[%d] in the download service", Integer.valueOf(i2));
        return (byte) 0;
    }

    /* renamed from: c */
    private static void m28949c(String str, Object... objArr) {
        C9034d.m28970i(C9031a.class, str + ", but the download service isn't connected yet.\nYou can use FileDownloader#isServiceConnected() to check whether the service has been connected, \nbesides you can use following functions easier to control your code invoke after the service has been connected: \n1. FileDownloader#bindService(Runnable)\n2. FileDownloader#insureServiceBind()\n3. FileDownloader#insureServiceBindAsync()", objArr);
    }

    /* renamed from: d */
    public static boolean m28950d(int i2) {
        m28949c("request pause the task[%d] in the download service", Integer.valueOf(i2));
        return false;
    }

    /* renamed from: e */
    public static boolean m28951e(String str, String str2, boolean z) {
        m28949c("request start the task([%s], [%s], [%B]) in the download service", str, str2, Boolean.valueOf(z));
        return false;
    }

    /* renamed from: f */
    public static void m28952f(boolean z) {
        m28949c("request cancel the foreground status[%B] for the download service", Boolean.valueOf(z));
    }
}
