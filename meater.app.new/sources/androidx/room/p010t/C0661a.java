package androidx.room.p010t;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: CopyLock.java */
/* renamed from: androidx.room.t.a */
/* loaded from: classes.dex */
public class C0661a {

    /* renamed from: a */
    private static final Map<String, Lock> f4361a = new HashMap();

    /* renamed from: b */
    private final File f4362b;

    /* renamed from: c */
    private final Lock f4363c;

    /* renamed from: d */
    private final boolean f4364d;

    /* renamed from: e */
    private FileChannel f4365e;

    public C0661a(String str, File file, boolean z) {
        File file2 = new File(file, str + ".lck");
        this.f4362b = file2;
        this.f4363c = m4669a(file2.getAbsolutePath());
        this.f4364d = z;
    }

    /* renamed from: a */
    private static Lock m4669a(String str) {
        Lock reentrantLock;
        Map<String, Lock> map = f4361a;
        synchronized (map) {
            reentrantLock = map.get(str);
            if (reentrantLock == null) {
                reentrantLock = new ReentrantLock();
                map.put(str, reentrantLock);
            }
        }
        return reentrantLock;
    }

    /* renamed from: b */
    public void m4670b() throws IOException {
        this.f4363c.lock();
        if (this.f4364d) {
            try {
                FileChannel channel = new FileOutputStream(this.f4362b).getChannel();
                this.f4365e = channel;
                channel.lock();
            } catch (IOException e2) {
                throw new IllegalStateException("Unable to grab copy lock.", e2);
            }
        }
    }

    /* renamed from: c */
    public void m4671c() {
        FileChannel fileChannel = this.f4365e;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.f4363c.unlock();
    }
}
