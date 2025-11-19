package f3;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
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

/* compiled from: MultiDexExtractor.java */
/* renamed from: f3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3329c implements Closeable {

    /* renamed from: B, reason: collision with root package name */
    private final File f41269B;

    /* renamed from: C, reason: collision with root package name */
    private final long f41270C;

    /* renamed from: D, reason: collision with root package name */
    private final File f41271D;

    /* renamed from: E, reason: collision with root package name */
    private final RandomAccessFile f41272E;

    /* renamed from: F, reason: collision with root package name */
    private final FileChannel f41273F;

    /* renamed from: G, reason: collision with root package name */
    private final FileLock f41274G;

    /* compiled from: MultiDexExtractor.java */
    /* renamed from: f3.c$a */
    class a implements FileFilter {
        a() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return !file.getName().equals("MultiDex.lock");
        }
    }

    /* compiled from: MultiDexExtractor.java */
    /* renamed from: f3.c$b */
    private static class b extends File {

        /* renamed from: B, reason: collision with root package name */
        public long f41276B;

        public b(File file, String str) {
            super(file, str);
            this.f41276B = -1L;
        }
    }

    C3329c(File file, File file2) throws Throwable {
        Log.i("MultiDex", "MultiDexExtractor(" + file.getPath() + ", " + file2.getPath() + ")");
        this.f41269B = file;
        this.f41271D = file2;
        this.f41270C = f(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.f41272E = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.f41273F = channel;
            try {
                Log.i("MultiDex", "Blocking on lock " + file3.getPath());
                this.f41274G = channel.lock();
                Log.i("MultiDex", file3.getPath() + " locked");
            } catch (IOException e10) {
                e = e10;
                b(this.f41273F);
                throw e;
            } catch (Error e11) {
                e = e11;
                b(this.f41273F);
                throw e;
            } catch (RuntimeException e12) {
                e = e12;
                b(this.f41273F);
                throw e;
            }
        } catch (IOException e13) {
            e = e13;
            b(this.f41272E);
            throw e;
        } catch (Error e14) {
            e = e14;
            b(this.f41272E);
            throw e;
        } catch (RuntimeException e15) {
            e = e15;
            b(this.f41272E);
            throw e;
        }
    }

    private void a() {
        File[] fileArrListFiles = this.f41271D.listFiles(new a());
        if (fileArrListFiles == null) {
            Log.w("MultiDex", "Failed to list secondary dex dir content (" + this.f41271D.getPath() + ").");
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

    private static void b(Closeable closeable) throws IOException {
        try {
            closeable.close();
        } catch (IOException e10) {
            Log.w("MultiDex", "Failed to close resource", e10);
        }
    }

    private static void c(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File fileCreateTempFile = File.createTempFile("tmp-" + str, ".zip", file.getParentFile());
        Log.i("MultiDex", "Extracting " + fileCreateTempFile.getPath());
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(fileCreateTempFile)));
            try {
                ZipEntry zipEntry2 = new ZipEntry("classes.dex");
                zipEntry2.setTime(zipEntry.getTime());
                zipOutputStream.putNextEntry(zipEntry2);
                byte[] bArr = new byte[16384];
                for (int i10 = inputStream.read(bArr); i10 != -1; i10 = inputStream.read(bArr)) {
                    zipOutputStream.write(bArr, 0, i10);
                }
                zipOutputStream.closeEntry();
                zipOutputStream.close();
                if (!fileCreateTempFile.setReadOnly()) {
                    throw new IOException("Failed to mark readonly \"" + fileCreateTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
                }
                Log.i("MultiDex", "Renaming to " + file.getPath());
                if (fileCreateTempFile.renameTo(file)) {
                    b(inputStream);
                    fileCreateTempFile.delete();
                    return;
                }
                throw new IOException("Failed to rename \"" + fileCreateTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
            } catch (Throwable th) {
                zipOutputStream.close();
                throw th;
            }
        } catch (Throwable th2) {
            b(inputStream);
            fileCreateTempFile.delete();
            throw th2;
        }
    }

    private static SharedPreferences d(Context context) {
        return context.getSharedPreferences("multidex.version", 4);
    }

    private static long e(File file) {
        long jLastModified = file.lastModified();
        return jLastModified == -1 ? jLastModified - 1 : jLastModified;
    }

    private static long f(File file) throws IOException {
        long jC = C3330d.c(file);
        return jC == -1 ? jC - 1 : jC;
    }

    private static boolean g(Context context, File file, long j10, String str) {
        SharedPreferences sharedPreferencesD = d(context);
        if (sharedPreferencesD.getLong(str + "timestamp", -1L) == e(file)) {
            if (sharedPreferencesD.getLong(str + "crc", -1L) == j10) {
                return false;
            }
        }
        return true;
    }

    private List<b> k(Context context, String str) throws IOException {
        Log.i("MultiDex", "loading existing secondary dex files");
        String str2 = this.f41269B.getName() + ".classes";
        SharedPreferences sharedPreferencesD = d(context);
        int i10 = sharedPreferencesD.getInt(str + "dex.number", 1);
        ArrayList arrayList = new ArrayList(i10 + (-1));
        int i11 = 2;
        while (i11 <= i10) {
            b bVar = new b(this.f41271D, str2 + i11 + ".zip");
            if (!bVar.isFile()) {
                throw new IOException("Missing extracted secondary dex file '" + bVar.getPath() + "'");
            }
            bVar.f41276B = f(bVar);
            long j10 = sharedPreferencesD.getLong(str + "dex.crc." + i11, -1L);
            long j11 = sharedPreferencesD.getLong(str + "dex.time." + i11, -1L);
            long jLastModified = bVar.lastModified();
            if (j11 == jLastModified) {
                String str3 = str2;
                SharedPreferences sharedPreferences = sharedPreferencesD;
                if (j10 == bVar.f41276B) {
                    arrayList.add(bVar);
                    i11++;
                    sharedPreferencesD = sharedPreferences;
                    str2 = str3;
                }
            }
            throw new IOException("Invalid extracted dex: " + bVar + " (key \"" + str + "\"), expected modification time: " + j11 + ", modification time: " + jLastModified + ", expected crc: " + j10 + ", file crc: " + bVar.f41276B);
        }
        return arrayList;
    }

    private List<b> l() throws IOException {
        boolean z10;
        String str = this.f41269B.getName() + ".classes";
        a();
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.f41269B);
        try {
            int i10 = 2;
            ZipEntry entry = zipFile.getEntry("classes2.dex");
            while (entry != null) {
                b bVar = new b(this.f41271D, str + i10 + ".zip");
                arrayList.add(bVar);
                Log.i("MultiDex", "Extraction is needed for file " + bVar);
                int i11 = 0;
                boolean z11 = false;
                while (i11 < 3 && !z11) {
                    int i12 = i11 + 1;
                    c(zipFile, entry, bVar, str);
                    try {
                        bVar.f41276B = f(bVar);
                        z10 = true;
                    } catch (IOException e10) {
                        Log.w("MultiDex", "Failed to read crc from " + bVar.getAbsolutePath(), e10);
                        z10 = false;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Extraction ");
                    sb2.append(z10 ? "succeeded" : "failed");
                    sb2.append(" '");
                    sb2.append(bVar.getAbsolutePath());
                    sb2.append("': length ");
                    sb2.append(bVar.length());
                    sb2.append(" - crc: ");
                    sb2.append(bVar.f41276B);
                    Log.i("MultiDex", sb2.toString());
                    if (!z10) {
                        bVar.delete();
                        if (bVar.exists()) {
                            Log.w("MultiDex", "Failed to delete corrupted secondary dex '" + bVar.getPath() + "'");
                        }
                    }
                    z11 = z10;
                    i11 = i12;
                }
                if (!z11) {
                    throw new IOException("Could not create zip file " + bVar.getAbsolutePath() + " for secondary dex (" + i10 + ")");
                }
                i10++;
                entry = zipFile.getEntry("classes" + i10 + ".dex");
            }
            try {
                zipFile.close();
            } catch (IOException e11) {
                Log.w("MultiDex", "Failed to close resource", e11);
            }
            return arrayList;
        } finally {
        }
    }

    private static void m(Context context, String str, long j10, long j11, List<b> list) {
        SharedPreferences.Editor editorEdit = d(context).edit();
        editorEdit.putLong(str + "timestamp", j10);
        editorEdit.putLong(str + "crc", j11);
        editorEdit.putInt(str + "dex.number", list.size() + 1);
        int i10 = 2;
        for (b bVar : list) {
            editorEdit.putLong(str + "dex.crc." + i10, bVar.f41276B);
            editorEdit.putLong(str + "dex.time." + i10, bVar.lastModified());
            i10++;
        }
        editorEdit.commit();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f41274G.release();
        this.f41273F.close();
        this.f41272E.close();
    }

    List<? extends File> j(Context context, String str, boolean z10) throws IOException {
        List<b> listL;
        List<b> listK;
        Log.i("MultiDex", "MultiDexExtractor.load(" + this.f41269B.getPath() + ", " + z10 + ", " + str + ")");
        if (!this.f41274G.isValid()) {
            throw new IllegalStateException("MultiDexExtractor was closed");
        }
        if (!z10 && !g(context, this.f41269B, this.f41270C, str)) {
            try {
                listK = k(context, str);
            } catch (IOException e10) {
                Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e10);
                listL = l();
                m(context, str, e(this.f41269B), this.f41270C, listL);
            }
            Log.i("MultiDex", "load found " + listK.size() + " secondary dex files");
            return listK;
        }
        if (z10) {
            Log.i("MultiDex", "Forced extraction must be performed.");
        } else {
            Log.i("MultiDex", "Detected that extraction must be performed.");
        }
        listL = l();
        m(context, str, e(this.f41269B), this.f41270C, listL);
        listK = listL;
        Log.i("MultiDex", "load found " + listK.size() + " secondary dex files");
        return listK;
    }
}
