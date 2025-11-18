package androidx.work.impl;

import android.content.Context;
import android.os.Build;
import androidx.work.AbstractC0807n;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* compiled from: WorkDatabasePathHelper.java */
/* renamed from: androidx.work.impl.i */
/* loaded from: classes.dex */
public class C0736i {

    /* renamed from: a */
    private static final String f4662a = AbstractC0807n.m5223f("WrkDbPathHelper");

    /* renamed from: b */
    private static final String[] f4663b = {"-journal", "-shm", "-wal"};

    /* renamed from: a */
    public static File m4971a(Context context) {
        return Build.VERSION.SDK_INT < 23 ? m4972b(context) : m4973c(context, "androidx.work.workdb");
    }

    /* renamed from: b */
    public static File m4972b(Context context) {
        return context.getDatabasePath("androidx.work.workdb");
    }

    /* renamed from: c */
    private static File m4973c(Context context, String str) {
        return new File(context.getNoBackupFilesDir(), str);
    }

    /* renamed from: d */
    public static String m4974d() {
        return "androidx.work.workdb";
    }

    /* renamed from: e */
    public static void m4975e(Context context) {
        File fileM4972b = m4972b(context);
        if (Build.VERSION.SDK_INT < 23 || !fileM4972b.exists()) {
            return;
        }
        AbstractC0807n.m5221c().mo5224a(f4662a, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
        Map<File, File> mapM4976f = m4976f(context);
        for (File file : mapM4976f.keySet()) {
            File file2 = mapM4976f.get(file);
            if (file.exists() && file2 != null) {
                if (file2.exists()) {
                    AbstractC0807n.m5221c().mo5228h(f4662a, String.format("Over-writing contents of %s", file2), new Throwable[0]);
                }
                AbstractC0807n.m5221c().mo5224a(f4662a, file.renameTo(file2) ? String.format("Migrated %s to %s", file, file2) : String.format("Renaming %s to %s failed", file, file2), new Throwable[0]);
            }
        }
    }

    /* renamed from: f */
    public static Map<File, File> m4976f(Context context) {
        HashMap map = new HashMap();
        if (Build.VERSION.SDK_INT >= 23) {
            File fileM4972b = m4972b(context);
            File fileM4971a = m4971a(context);
            map.put(fileM4972b, fileM4971a);
            for (String str : f4663b) {
                map.put(new File(fileM4972b.getPath() + str), new File(fileM4971a.getPath() + str));
            }
        }
        return map;
    }
}
