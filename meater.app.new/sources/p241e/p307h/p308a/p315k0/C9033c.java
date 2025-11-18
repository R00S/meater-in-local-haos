package p241e.p307h.p308a.p315k0;

import android.annotation.SuppressLint;
import android.content.Context;
import com.liulishuo.filedownloader.exception.PathConflictException;
import com.liulishuo.filedownloader.message.C8694b;
import com.liulishuo.filedownloader.message.C8695c;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import java.io.File;
import java.io.IOException;
import p241e.p307h.p308a.InterfaceC9050y;
import p241e.p307h.p308a.p309e0.InterfaceC9001b;
import p241e.p307h.p308a.p310f0.InterfaceC9005a;
import p241e.p307h.p308a.p314j0.InterfaceC9028a;

/* compiled from: FileDownloadHelper.java */
/* renamed from: e.h.a.k0.c */
/* loaded from: classes2.dex */
public class C9033c {

    /* renamed from: a */
    @SuppressLint({"StaticFieldLeak"})
    private static Context f34818a;

    /* compiled from: FileDownloadHelper.java */
    /* renamed from: e.h.a.k0.c$a */
    public interface a {
        /* renamed from: a */
        int mo28717a(int i2, String str, String str2, long j2);
    }

    /* compiled from: FileDownloadHelper.java */
    /* renamed from: e.h.a.k0.c$b */
    public interface b {
        /* renamed from: a */
        InterfaceC9001b mo27919a(String str) throws IOException;
    }

    /* compiled from: FileDownloadHelper.java */
    /* renamed from: e.h.a.k0.c$c */
    public interface c {
        /* renamed from: a */
        InterfaceC9005a m28961a();
    }

    /* compiled from: FileDownloadHelper.java */
    /* renamed from: e.h.a.k0.c$d */
    public interface d {
        /* renamed from: a */
        int mo27612a(String str, String str2, boolean z);

        /* renamed from: b */
        int mo27613b(int i2, String str, String str2, boolean z);
    }

    /* compiled from: FileDownloadHelper.java */
    /* renamed from: e.h.a.k0.c$e */
    public interface e {
        /* renamed from: a */
        InterfaceC9028a mo28928a(File file) throws IOException;

        /* renamed from: b */
        boolean mo28929b();
    }

    /* renamed from: a */
    public static Context m28956a() {
        return f34818a;
    }

    /* renamed from: b */
    public static void m28957b(Context context) {
        f34818a = context;
    }

    /* renamed from: c */
    public static boolean m28958c(int i2, long j2, String str, String str2, InterfaceC9050y interfaceC9050y) {
        int iMo27650b;
        if (str2 == null || str == null || (iMo27650b = interfaceC9050y.mo27650b(str, i2)) == 0) {
            return false;
        }
        C8694b.m27535a().m27536b(C8695c.m27541b(i2, j2, new PathConflictException(iMo27650b, str, str2)));
        return true;
    }

    /* renamed from: d */
    public static boolean m28959d(int i2, String str, boolean z, boolean z2) {
        if (!z && str != null) {
            File file = new File(str);
            if (file.exists()) {
                C8694b.m27535a().m27536b(C8695c.m27540a(i2, file, z2));
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m28960e(int i2, FileDownloadModel fileDownloadModel, InterfaceC9050y interfaceC9050y, boolean z) {
        if (!interfaceC9050y.mo27649a(fileDownloadModel)) {
            return false;
        }
        C8694b.m27535a().m27536b(C8695c.m27543d(i2, fileDownloadModel.m27563g(), fileDownloadModel.m27567k(), z));
        return true;
    }
}
