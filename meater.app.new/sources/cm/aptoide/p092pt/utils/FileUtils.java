package cm.aptoide.p092pt.utils;

import android.graphics.Bitmap;
import android.text.TextUtils;
import cm.aptoide.p092pt.logger.Logger;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Callable;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;
import p456rx.schedulers.Schedulers;

/* loaded from: classes.dex */
public class FileUtils {
    public static final String COPY = "Copy";
    public static final String MOVE = "Move";
    private static final String TAG = "FileUtils";
    private InterfaceC11253b<String> sendFileMoveEvent;

    public static void createDir(String str) {
        File file = new File(str);
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    public static boolean fileExists(String str) {
        return !TextUtils.isEmpty(str) && new File(str).exists();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$deleteFolder$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Long m8881a(File file) throws Exception {
        long jDeleteDir = deleteDir(file);
        Logger.getInstance().m8273d(TAG, "deleting folder " + file.getPath() + " size: " + jDeleteDir);
        return Long.valueOf(jDeleteDir);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$deleteFolder$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8882b(final File file) {
        return C11234e.m40022P(new Callable() { // from class: cm.aptoide.pt.utils.g
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f11646f.m8881a(file);
            }
        }).m40104o0(new InterfaceC11256e() { // from class: cm.aptoide.pt.utils.h
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return C11234e.m40016B();
            }
        });
    }

    static /* synthetic */ Long lambda$deleteFolder$3(List list) {
        long jLongValue = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            jLongValue += ((Long) list.get(i2)).longValue();
        }
        return Long.valueOf(jLongValue);
    }

    public static boolean removeFile(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).delete();
    }

    public static boolean saveBitmapToFile(File file, String str, Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i2) throws IOException {
        IOException e2;
        FileOutputStream fileOutputStream;
        File file2 = new File(file, str);
        try {
            file.mkdirs();
            fileOutputStream = new FileOutputStream(file2);
            try {
                bitmap.compress(compressFormat, i2, fileOutputStream);
                fileOutputStream.close();
                return true;
            } catch (IOException e3) {
                e2 = e3;
                Logger.getInstance().m8277e(TAG, e2.getMessage());
                if (fileOutputStream == null) {
                    return false;
                }
                try {
                    fileOutputStream.close();
                    return false;
                } catch (IOException e4) {
                    Logger.getInstance().m8277e(TAG, e4.getMessage());
                    return false;
                }
            }
        } catch (IOException e5) {
            e2 = e5;
            fileOutputStream = null;
        }
    }

    public void cloneFile(String str, String str2, String str3) {
        try {
            File file = new File(str2);
            if (!file.exists()) {
                file.mkdirs();
            }
            FileInputStream fileInputStream = new FileInputStream(str + "/" + str3);
            FileOutputStream fileOutputStream = new FileOutputStream(str2 + "/" + str3);
            byte[] bArr = new byte[1024];
            while (true) {
                int i2 = fileInputStream.read(bArr);
                if (i2 == -1) {
                    fileInputStream.close();
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    new File(str + str3).delete();
                    return;
                }
                fileOutputStream.write(bArr, 0, i2);
            }
        } catch (Exception e2) {
            File file2 = new File(str + "/" + str3);
            if (file2.exists()) {
                file2.delete();
            }
            File file3 = new File(str2 + "/" + str3);
            if (file3.exists()) {
                file3.delete();
            }
            Logger.getInstance().m8277e(TAG, e2.getMessage());
            throw new RuntimeException(e2);
        }
    }

    public void copyFile(String str, String str2, String str3) {
        if (str.equals(str2)) {
            return;
        }
        if (!fileExists(str + str3)) {
            throw new RuntimeException("Input file(" + str + str3 + ") doesn't exists");
        }
        if (new File(str + str3).renameTo(new File(str2 + str3))) {
            return;
        }
        cloneFile(str, str2, str3);
    }

    public long deleteDir(File file) {
        if (file == null) {
            throw new RuntimeException("The file to be deleted can't be null");
        }
        long jDeleteDir = 0;
        if (file.isDirectory()) {
            for (File file2 : file.listFiles() == null ? new File[0] : file.listFiles()) {
                jDeleteDir += deleteDir(file2);
            }
        }
        long length = jDeleteDir + file.length();
        if (!file.exists() || file.delete()) {
            return length;
        }
        throw new RuntimeException("Something went wrong while deleting the file " + file.getPath() + " (if the is the file a directory, is it empty?");
    }

    public C11234e<Long> deleteFolder(File... fileArr) {
        return C11234e.m40021O(fileArr).m40095j0(Schedulers.m40658io()).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.utils.i
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11651f.m8882b((File) obj);
            }
        }).m40084Y0().m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.utils.j
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return FileUtils.lambda$deleteFolder$3((List) obj);
            }
        });
    }

    public long dirSize(File file) {
        File[] fileArrListFiles;
        long jDirSize = 0;
        if (file.exists() && (fileArrListFiles = file.listFiles()) != null) {
            for (int i2 = 0; i2 < fileArrListFiles.length; i2++) {
                jDirSize += fileArrListFiles[i2].isDirectory() ? dirSize(fileArrListFiles[i2]) : fileArrListFiles[i2].length();
            }
        }
        return jDirSize;
    }

    public C11234e<Long> deleteFolder(String... strArr) {
        File[] fileArr = new File[strArr.length];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            fileArr[i2] = new File(strArr[i2]);
        }
        return deleteFolder(fileArr);
    }
}
