package p024c.p078r;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Log;
import cm.aptoide.p092pt.utils.MultiDexHelper;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
import okhttp3.internal.http2.Http2;

/* compiled from: MultiDexExtractor.java */
/* renamed from: c.r.b */
/* loaded from: classes.dex */
final class C0999b implements Closeable {

    /* renamed from: f */
    private final File f6603f;

    /* renamed from: g */
    private final long f6604g;

    /* renamed from: h */
    private final File f6605h;

    /* renamed from: i */
    private final RandomAccessFile f6606i;

    /* renamed from: j */
    private final FileChannel f6607j;

    /* renamed from: k */
    private final FileLock f6608k;

    /* compiled from: MultiDexExtractor.java */
    /* renamed from: c.r.b$a */
    class a implements FileFilter {
        a() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return !file.getName().equals("MultiDex.lock");
        }
    }

    /* compiled from: MultiDexExtractor.java */
    /* renamed from: c.r.b$b */
    private static class b extends File {

        /* renamed from: f */
        public long f6610f;

        public b(File file, String str) {
            super(file, str);
            this.f6610f = -1L;
        }
    }

    C0999b(File file, File file2) throws Throwable {
        Log.i("MultiDex", "MultiDexExtractor(" + file.getPath() + ", " + file2.getPath() + ")");
        this.f6603f = file;
        this.f6605h = file2;
        this.f6604g = m6372f(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.f6606i = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.f6607j = channel;
            try {
                Log.i("MultiDex", "Blocking on lock " + file3.getPath());
                this.f6608k = channel.lock();
                Log.i("MultiDex", file3.getPath() + " locked");
            } catch (IOException e2) {
                e = e2;
                m6368b(this.f6607j);
                throw e;
            } catch (Error e3) {
                e = e3;
                m6368b(this.f6607j);
                throw e;
            } catch (RuntimeException e4) {
                e = e4;
                m6368b(this.f6607j);
                throw e;
            }
        } catch (IOException | Error | RuntimeException e5) {
            m6368b(this.f6606i);
            throw e5;
        }
    }

    /* renamed from: a */
    private void m6367a() {
        File[] fileArrListFiles = this.f6605h.listFiles(new a());
        if (fileArrListFiles == null) {
            Log.w("MultiDex", "Failed to list secondary dex dir content (" + this.f6605h.getPath() + ").");
            return;
        }
        for (File file : fileArrListFiles) {
            Log.i("MultiDex", "Trying to delete old file " + file.getPath() + " of size " + file.length());
            if (file.delete()) {
                Log.i("MultiDex", "Deleted old file " + file.getPath());
            } else {
                Log.w("MultiDex", "Failed to delete old file " + file.getPath());
            }
        }
    }

    /* renamed from: b */
    private static void m6368b(Closeable closeable) throws IOException {
        try {
            closeable.close();
        } catch (IOException e2) {
            Log.w("MultiDex", "Failed to close resource", e2);
        }
    }

    /* renamed from: c */
    private static void m6369c(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File fileCreateTempFile = File.createTempFile("tmp-" + str, MultiDexHelper.EXTRACTED_SUFFIX, file.getParentFile());
        Log.i("MultiDex", "Extracting " + fileCreateTempFile.getPath());
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(fileCreateTempFile)));
            try {
                ZipEntry zipEntry2 = new ZipEntry("classes.dex");
                zipEntry2.setTime(zipEntry.getTime());
                zipOutputStream.putNextEntry(zipEntry2);
                byte[] bArr = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
                for (int i2 = inputStream.read(bArr); i2 != -1; i2 = inputStream.read(bArr)) {
                    zipOutputStream.write(bArr, 0, i2);
                }
                zipOutputStream.closeEntry();
                zipOutputStream.close();
                if (!fileCreateTempFile.setReadOnly()) {
                    throw new IOException("Failed to mark readonly \"" + fileCreateTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
                }
                Log.i("MultiDex", "Renaming to " + file.getPath());
                if (fileCreateTempFile.renameTo(file)) {
                    return;
                }
                throw new IOException("Failed to rename \"" + fileCreateTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
            } catch (Throwable th) {
                zipOutputStream.close();
                throw th;
            }
        } finally {
            m6368b(inputStream);
            fileCreateTempFile.delete();
        }
    }

    /* renamed from: d */
    private static SharedPreferences m6370d(Context context) {
        return context.getSharedPreferences("multidex.version", Build.VERSION.SDK_INT < 11 ? 0 : 4);
    }

    /* renamed from: e */
    private static long m6371e(File file) {
        long jLastModified = file.lastModified();
        return jLastModified == -1 ? jLastModified - 1 : jLastModified;
    }

    /* renamed from: f */
    private static long m6372f(File file) throws IOException {
        long jM6380c = C1000c.m6380c(file);
        return jM6380c == -1 ? jM6380c - 1 : jM6380c;
    }

    /* renamed from: j */
    private static boolean m6373j(Context context, File file, long j2, String str) {
        SharedPreferences sharedPreferencesM6370d = m6370d(context);
        if (sharedPreferencesM6370d.getLong(str + "timestamp", -1L) == m6371e(file)) {
            if (sharedPreferencesM6370d.getLong(str + "crc", -1L) == j2) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: l */
    private List<b> m6374l(Context context, String str) throws IOException {
        Log.i("MultiDex", "loading existing secondary dex files");
        String str2 = this.f6603f.getName() + ".classes";
        SharedPreferences sharedPreferencesM6370d = m6370d(context);
        int i2 = sharedPreferencesM6370d.getInt(str + "dex.number", 1);
        ArrayList arrayList = new ArrayList(i2 + (-1));
        int i3 = 2;
        while (i3 <= i2) {
            b bVar = new b(this.f6605h, str2 + i3 + MultiDexHelper.EXTRACTED_SUFFIX);
            if (!bVar.isFile()) {
                throw new IOException("Missing extracted secondary dex file '" + bVar.getPath() + "'");
            }
            bVar.f6610f = m6372f(bVar);
            long j2 = sharedPreferencesM6370d.getLong(str + "dex.crc." + i3, -1L);
            long j3 = sharedPreferencesM6370d.getLong(str + "dex.time." + i3, -1L);
            long jLastModified = bVar.lastModified();
            if (j3 == jLastModified) {
                String str3 = str2;
                SharedPreferences sharedPreferences = sharedPreferencesM6370d;
                if (j2 == bVar.f6610f) {
                    arrayList.add(bVar);
                    i3++;
                    sharedPreferencesM6370d = sharedPreferences;
                    str2 = str3;
                }
            }
            throw new IOException("Invalid extracted dex: " + bVar + " (key \"" + str + "\"), expected modification time: " + j3 + ", modification time: " + jLastModified + ", expected crc: " + j2 + ", file crc: " + bVar.f6610f);
        }
        return arrayList;
    }

    /* renamed from: m */
    private List<b> m6375m() throws IOException {
        boolean z;
        String str = this.f6603f.getName() + ".classes";
        m6367a();
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.f6603f);
        try {
            ZipEntry entry = zipFile.getEntry("classes2.dex");
            int i2 = 2;
            while (entry != null) {
                b bVar = new b(this.f6605h, str + i2 + MultiDexHelper.EXTRACTED_SUFFIX);
                arrayList.add(bVar);
                Log.i("MultiDex", "Extraction is needed for file " + bVar);
                int i3 = 0;
                boolean z2 = false;
                while (i3 < 3 && !z2) {
                    int i4 = i3 + 1;
                    m6369c(zipFile, entry, bVar, str);
                    try {
                        bVar.f6610f = m6372f(bVar);
                        z = true;
                    } catch (IOException e2) {
                        Log.w("MultiDex", "Failed to read crc from " + bVar.getAbsolutePath(), e2);
                        z = false;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Extraction ");
                    sb.append(z ? "succeeded" : "failed");
                    sb.append(" '");
                    sb.append(bVar.getAbsolutePath());
                    sb.append("': length ");
                    sb.append(bVar.length());
                    sb.append(" - crc: ");
                    sb.append(bVar.f6610f);
                    Log.i("MultiDex", sb.toString());
                    if (!z) {
                        bVar.delete();
                        if (bVar.exists()) {
                            Log.w("MultiDex", "Failed to delete corrupted secondary dex '" + bVar.getPath() + "'");
                        }
                    }
                    z2 = z;
                    i3 = i4;
                }
                if (!z2) {
                    throw new IOException("Could not create zip file " + bVar.getAbsolutePath() + " for secondary dex (" + i2 + ")");
                }
                i2++;
                entry = zipFile.getEntry("classes" + i2 + ".dex");
            }
            try {
                zipFile.close();
            } catch (IOException e3) {
                Log.w("MultiDex", "Failed to close resource", e3);
            }
            return arrayList;
        } finally {
        }
    }

    /* renamed from: p */
    private static void m6376p(Context context, String str, long j2, long j3, List<b> list) {
        SharedPreferences.Editor editorEdit = m6370d(context).edit();
        editorEdit.putLong(str + "timestamp", j2);
        editorEdit.putLong(str + "crc", j3);
        editorEdit.putInt(str + "dex.number", list.size() + 1);
        int i2 = 2;
        for (b bVar : list) {
            editorEdit.putLong(str + "dex.crc." + i2, bVar.f6610f);
            editorEdit.putLong(str + "dex.time." + i2, bVar.lastModified());
            i2++;
        }
        editorEdit.commit();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f6608k.release();
        this.f6607j.close();
        this.f6606i.close();
    }

    /* renamed from: k */
    List<? extends File> m6377k(Context context, String str, boolean z) throws IOException {
        List<b> listM6375m;
        List<b> listM6374l;
        Log.i("MultiDex", "MultiDexExtractor.load(" + this.f6603f.getPath() + ", " + z + ", " + str + ")");
        if (!this.f6608k.isValid()) {
            throw new IllegalStateException("MultiDexExtractor was closed");
        }
        if (!z && !m6373j(context, this.f6603f, this.f6604g, str)) {
            try {
                listM6374l = m6374l(context, str);
            } catch (IOException e2) {
                Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e2);
                listM6375m = m6375m();
                m6376p(context, str, m6371e(this.f6603f), this.f6604g, listM6375m);
            }
            Log.i("MultiDex", "load found " + listM6374l.size() + " secondary dex files");
            return listM6374l;
        }
        if (z) {
            Log.i("MultiDex", "Forced extraction must be performed.");
        } else {
            Log.i("MultiDex", "Detected that extraction must be performed.");
        }
        listM6375m = m6375m();
        m6376p(context, str, m6371e(this.f6603f), this.f6604g, listM6375m);
        listM6374l = listM6375m;
        Log.i("MultiDex", "load found " + listM6374l.size() + " secondary dex files");
        return listM6374l;
    }
}
