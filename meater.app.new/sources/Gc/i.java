package Gc;

import com.apptionlabs.di.BuildConfig;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.InvocationTargetException;

/* compiled from: FileLock.java */
/* loaded from: classes3.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private File f5135a;

    /* renamed from: b, reason: collision with root package name */
    private RandomAccessFile f5136b;

    /* renamed from: c, reason: collision with root package name */
    private Object f5137c;

    public i(File file, String str) throws Exception {
        this.f5135a = new File(file, str);
        if (h.c("java.nio.channels.FileLock")) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(this.f5135a, "rw");
                this.f5136b = randomAccessFile;
                Object objInvoke = randomAccessFile.getClass().getMethod("getChannel", null).invoke(this.f5136b, null);
                this.f5137c = objInvoke.getClass().getMethod("tryLock", null).invoke(objInvoke, null);
            } catch (IllegalAccessException unused) {
                this.f5137c = null;
            } catch (IllegalArgumentException unused2) {
                this.f5137c = null;
            } catch (NoSuchMethodException unused3) {
                this.f5137c = null;
            }
            if (this.f5137c != null) {
                return;
            }
            a();
            throw new Exception("Problem obtaining file lock");
        }
    }

    public void a() throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        try {
            Object obj = this.f5137c;
            if (obj != null) {
                obj.getClass().getMethod(BuildConfig.BUILD_TYPE, null).invoke(this.f5137c, null);
                this.f5137c = null;
            }
        } catch (Exception unused) {
        }
        RandomAccessFile randomAccessFile = this.f5136b;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (IOException unused2) {
            }
            this.f5136b = null;
        }
        File file = this.f5135a;
        if (file != null && file.exists()) {
            this.f5135a.delete();
        }
        this.f5135a = null;
    }
}
