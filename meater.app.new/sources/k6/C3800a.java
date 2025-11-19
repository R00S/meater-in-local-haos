package k6;

import android.annotation.TargetApi;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: DiskLruCache.java */
/* renamed from: k6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3800a implements Closeable {

    /* renamed from: B, reason: collision with root package name */
    private final File f43778B;

    /* renamed from: C, reason: collision with root package name */
    private final File f43779C;

    /* renamed from: D, reason: collision with root package name */
    private final File f43780D;

    /* renamed from: E, reason: collision with root package name */
    private final File f43781E;

    /* renamed from: F, reason: collision with root package name */
    private final int f43782F;

    /* renamed from: G, reason: collision with root package name */
    private long f43783G;

    /* renamed from: H, reason: collision with root package name */
    private final int f43784H;

    /* renamed from: J, reason: collision with root package name */
    private Writer f43786J;

    /* renamed from: L, reason: collision with root package name */
    private int f43788L;

    /* renamed from: I, reason: collision with root package name */
    private long f43785I = 0;

    /* renamed from: K, reason: collision with root package name */
    private final LinkedHashMap<String, d> f43787K = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: M, reason: collision with root package name */
    private long f43789M = 0;

    /* renamed from: N, reason: collision with root package name */
    final ThreadPoolExecutor f43790N = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b(null));

    /* renamed from: O, reason: collision with root package name */
    private final Callable<Void> f43791O = new CallableC0571a();

    /* compiled from: DiskLruCache.java */
    /* renamed from: k6.a$a, reason: collision with other inner class name */
    class CallableC0571a implements Callable<Void> {
        CallableC0571a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            synchronized (C3800a.this) {
                try {
                    if (C3800a.this.f43786J == null) {
                        return null;
                    }
                    C3800a.this.P();
                    if (C3800a.this.u()) {
                        C3800a.this.K();
                        C3800a.this.f43788L = 0;
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* compiled from: DiskLruCache.java */
    /* renamed from: k6.a$b */
    private static final class b implements ThreadFactory {
        private b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }

        /* synthetic */ b(CallableC0571a callableC0571a) {
            this();
        }
    }

    /* compiled from: DiskLruCache.java */
    /* renamed from: k6.a$c */
    public final class c {

        /* renamed from: a, reason: collision with root package name */
        private final d f43793a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean[] f43794b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f43795c;

        /* synthetic */ c(C3800a c3800a, d dVar, CallableC0571a callableC0571a) {
            this(dVar);
        }

        public void a() {
            C3800a.this.m(this, false);
        }

        public void b() {
            if (this.f43795c) {
                return;
            }
            try {
                a();
            } catch (IOException unused) {
            }
        }

        public void e() {
            C3800a.this.m(this, true);
            this.f43795c = true;
        }

        public File f(int i10) {
            File fileK;
            synchronized (C3800a.this) {
                try {
                    if (this.f43793a.f43802f != this) {
                        throw new IllegalStateException();
                    }
                    if (!this.f43793a.f43801e) {
                        this.f43794b[i10] = true;
                    }
                    fileK = this.f43793a.k(i10);
                    C3800a.this.f43778B.mkdirs();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return fileK;
        }

        private c(d dVar) {
            this.f43793a = dVar;
            this.f43794b = dVar.f43801e ? null : new boolean[C3800a.this.f43784H];
        }
    }

    /* compiled from: DiskLruCache.java */
    /* renamed from: k6.a$d */
    private final class d {

        /* renamed from: a, reason: collision with root package name */
        private final String f43797a;

        /* renamed from: b, reason: collision with root package name */
        private final long[] f43798b;

        /* renamed from: c, reason: collision with root package name */
        File[] f43799c;

        /* renamed from: d, reason: collision with root package name */
        File[] f43800d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f43801e;

        /* renamed from: f, reason: collision with root package name */
        private c f43802f;

        /* renamed from: g, reason: collision with root package name */
        private long f43803g;

        /* synthetic */ d(C3800a c3800a, String str, CallableC0571a callableC0571a) {
            this(str);
        }

        private IOException m(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n(String[] strArr) throws IOException {
            if (strArr.length != C3800a.this.f43784H) {
                throw m(strArr);
            }
            for (int i10 = 0; i10 < strArr.length; i10++) {
                try {
                    this.f43798b[i10] = Long.parseLong(strArr[i10]);
                } catch (NumberFormatException unused) {
                    throw m(strArr);
                }
            }
        }

        public File j(int i10) {
            return this.f43799c[i10];
        }

        public File k(int i10) {
            return this.f43800d[i10];
        }

        public String l() {
            StringBuilder sb2 = new StringBuilder();
            for (long j10 : this.f43798b) {
                sb2.append(' ');
                sb2.append(j10);
            }
            return sb2.toString();
        }

        private d(String str) {
            this.f43797a = str;
            this.f43798b = new long[C3800a.this.f43784H];
            this.f43799c = new File[C3800a.this.f43784H];
            this.f43800d = new File[C3800a.this.f43784H];
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            for (int i10 = 0; i10 < C3800a.this.f43784H; i10++) {
                sb2.append(i10);
                this.f43799c[i10] = new File(C3800a.this.f43778B, sb2.toString());
                sb2.append(".tmp");
                this.f43800d[i10] = new File(C3800a.this.f43778B, sb2.toString());
                sb2.setLength(length);
            }
        }
    }

    /* compiled from: DiskLruCache.java */
    /* renamed from: k6.a$e */
    public final class e {

        /* renamed from: a, reason: collision with root package name */
        private final String f43805a;

        /* renamed from: b, reason: collision with root package name */
        private final long f43806b;

        /* renamed from: c, reason: collision with root package name */
        private final long[] f43807c;

        /* renamed from: d, reason: collision with root package name */
        private final File[] f43808d;

        /* synthetic */ e(C3800a c3800a, String str, long j10, File[] fileArr, long[] jArr, CallableC0571a callableC0571a) {
            this(str, j10, fileArr, jArr);
        }

        public File a(int i10) {
            return this.f43808d[i10];
        }

        private e(String str, long j10, File[] fileArr, long[] jArr) {
            this.f43805a = str;
            this.f43806b = j10;
            this.f43808d = fileArr;
            this.f43807c = jArr;
        }
    }

    private C3800a(File file, int i10, int i11, long j10) {
        this.f43778B = file;
        this.f43782F = i10;
        this.f43779C = new File(file, "journal");
        this.f43780D = new File(file, "journal.tmp");
        this.f43781E = new File(file, "journal.bkp");
        this.f43784H = i11;
        this.f43783G = j10;
    }

    private void C(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i10 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i10);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i10);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                this.f43787K.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iIndexOf2);
        }
        d dVar = this.f43787K.get(strSubstring);
        CallableC0571a callableC0571a = null;
        if (dVar == null) {
            dVar = new d(this, strSubstring, callableC0571a);
            this.f43787K.put(strSubstring, dVar);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
            dVar.f43801e = true;
            dVar.f43802f = null;
            dVar.n(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
            dVar.f43802f = new c(this, dVar, callableC0571a);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith("READ")) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void K() {
        try {
            Writer writer = this.f43786J;
            if (writer != null) {
                l(writer);
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f43780D), C3802c.f43816a));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write("\n");
                bufferedWriter.write("1");
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f43782F));
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f43784H));
                bufferedWriter.write("\n");
                bufferedWriter.write("\n");
                for (d dVar : this.f43787K.values()) {
                    if (dVar.f43802f != null) {
                        bufferedWriter.write("DIRTY " + dVar.f43797a + '\n');
                    } else {
                        bufferedWriter.write("CLEAN " + dVar.f43797a + dVar.l() + '\n');
                    }
                }
                l(bufferedWriter);
                if (this.f43779C.exists()) {
                    N(this.f43779C, this.f43781E, true);
                }
                N(this.f43780D, this.f43779C, false);
                this.f43781E.delete();
                this.f43786J = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f43779C, true), C3802c.f43816a));
            } catch (Throwable th) {
                l(bufferedWriter);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static void N(File file, File file2, boolean z10) throws IOException {
        if (z10) {
            o(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P() {
        while (this.f43785I > this.f43783G) {
            L(this.f43787K.entrySet().iterator().next().getKey());
        }
    }

    private void k() {
        if (this.f43786J == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    @TargetApi(26)
    private static void l(Writer writer) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void m(c cVar, boolean z10) {
        d dVar = cVar.f43793a;
        if (dVar.f43802f != cVar) {
            throw new IllegalStateException();
        }
        if (z10 && !dVar.f43801e) {
            for (int i10 = 0; i10 < this.f43784H; i10++) {
                if (!cVar.f43794b[i10]) {
                    cVar.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i10);
                }
                if (!dVar.k(i10).exists()) {
                    cVar.a();
                    return;
                }
            }
        }
        for (int i11 = 0; i11 < this.f43784H; i11++) {
            File fileK = dVar.k(i11);
            if (!z10) {
                o(fileK);
            } else if (fileK.exists()) {
                File fileJ = dVar.j(i11);
                fileK.renameTo(fileJ);
                long j10 = dVar.f43798b[i11];
                long length = fileJ.length();
                dVar.f43798b[i11] = length;
                this.f43785I = (this.f43785I - j10) + length;
            }
        }
        this.f43788L++;
        dVar.f43802f = null;
        if (dVar.f43801e || z10) {
            dVar.f43801e = true;
            this.f43786J.append((CharSequence) "CLEAN");
            this.f43786J.append(' ');
            this.f43786J.append((CharSequence) dVar.f43797a);
            this.f43786J.append((CharSequence) dVar.l());
            this.f43786J.append('\n');
            if (z10) {
                long j11 = this.f43789M;
                this.f43789M = 1 + j11;
                dVar.f43803g = j11;
            }
        } else {
            this.f43787K.remove(dVar.f43797a);
            this.f43786J.append((CharSequence) "REMOVE");
            this.f43786J.append(' ');
            this.f43786J.append((CharSequence) dVar.f43797a);
            this.f43786J.append('\n');
        }
        s(this.f43786J);
        if (this.f43785I > this.f43783G || u()) {
            this.f43790N.submit(this.f43791O);
        }
    }

    private static void o(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private synchronized c q(String str, long j10) {
        k();
        d dVar = this.f43787K.get(str);
        CallableC0571a callableC0571a = null;
        if (j10 != -1 && (dVar == null || dVar.f43803g != j10)) {
            return null;
        }
        if (dVar == null) {
            dVar = new d(this, str, callableC0571a);
            this.f43787K.put(str, dVar);
        } else if (dVar.f43802f != null) {
            return null;
        }
        c cVar = new c(this, dVar, callableC0571a);
        dVar.f43802f = cVar;
        this.f43786J.append((CharSequence) "DIRTY");
        this.f43786J.append(' ');
        this.f43786J.append((CharSequence) str);
        this.f43786J.append('\n');
        s(this.f43786J);
        return cVar;
    }

    @TargetApi(26)
    private static void s(Writer writer) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean u() {
        int i10 = this.f43788L;
        return i10 >= 2000 && i10 >= this.f43787K.size();
    }

    public static C3800a x(File file, int i10, int i11, long j10) throws IOException {
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                N(file2, file3, false);
            }
        }
        C3800a c3800a = new C3800a(file, i10, i11, j10);
        if (c3800a.f43779C.exists()) {
            try {
                c3800a.z();
                c3800a.y();
                return c3800a;
            } catch (IOException e10) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                c3800a.n();
            }
        }
        file.mkdirs();
        C3800a c3800a2 = new C3800a(file, i10, i11, j10);
        c3800a2.K();
        return c3800a2;
    }

    private void y() throws IOException {
        o(this.f43780D);
        Iterator<d> it = this.f43787K.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i10 = 0;
            if (next.f43802f == null) {
                while (i10 < this.f43784H) {
                    this.f43785I += next.f43798b[i10];
                    i10++;
                }
            } else {
                next.f43802f = null;
                while (i10 < this.f43784H) {
                    o(next.j(i10));
                    o(next.k(i10));
                    i10++;
                }
                it.remove();
            }
        }
    }

    private void z() throws IOException {
        C3801b c3801b = new C3801b(new FileInputStream(this.f43779C), C3802c.f43816a);
        try {
            String strD = c3801b.d();
            String strD2 = c3801b.d();
            String strD3 = c3801b.d();
            String strD4 = c3801b.d();
            String strD5 = c3801b.d();
            if (!"libcore.io.DiskLruCache".equals(strD) || !"1".equals(strD2) || !Integer.toString(this.f43782F).equals(strD3) || !Integer.toString(this.f43784H).equals(strD4) || !"".equals(strD5)) {
                throw new IOException("unexpected journal header: [" + strD + ", " + strD2 + ", " + strD4 + ", " + strD5 + "]");
            }
            int i10 = 0;
            while (true) {
                try {
                    C(c3801b.d());
                    i10++;
                } catch (EOFException unused) {
                    this.f43788L = i10 - this.f43787K.size();
                    if (c3801b.c()) {
                        K();
                    } else {
                        this.f43786J = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f43779C, true), C3802c.f43816a));
                    }
                    C3802c.a(c3801b);
                    return;
                }
            }
        } catch (Throwable th) {
            C3802c.a(c3801b);
            throw th;
        }
    }

    public synchronized boolean L(String str) {
        try {
            k();
            d dVar = this.f43787K.get(str);
            if (dVar != null && dVar.f43802f == null) {
                for (int i10 = 0; i10 < this.f43784H; i10++) {
                    File fileJ = dVar.j(i10);
                    if (fileJ.exists() && !fileJ.delete()) {
                        throw new IOException("failed to delete " + fileJ);
                    }
                    this.f43785I -= dVar.f43798b[i10];
                    dVar.f43798b[i10] = 0;
                }
                this.f43788L++;
                this.f43786J.append((CharSequence) "REMOVE");
                this.f43786J.append(' ');
                this.f43786J.append((CharSequence) str);
                this.f43786J.append('\n');
                this.f43787K.remove(str);
                if (u()) {
                    this.f43790N.submit(this.f43791O);
                }
                return true;
            }
            return false;
        } finally {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            if (this.f43786J == null) {
                return;
            }
            Iterator it = new ArrayList(this.f43787K.values()).iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                if (dVar.f43802f != null) {
                    dVar.f43802f.a();
                }
            }
            P();
            l(this.f43786J);
            this.f43786J = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void n() throws IOException {
        close();
        C3802c.b(this.f43778B);
    }

    public c p(String str) {
        return q(str, -1L);
    }

    public synchronized e t(String str) {
        k();
        d dVar = this.f43787K.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f43801e) {
            return null;
        }
        for (File file : dVar.f43799c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f43788L++;
        this.f43786J.append((CharSequence) "READ");
        this.f43786J.append(' ');
        this.f43786J.append((CharSequence) str);
        this.f43786J.append('\n');
        if (u()) {
            this.f43790N.submit(this.f43791O);
        }
        return new e(this, str, dVar.f43803g, dVar.f43799c, dVar.f43798b, null);
    }
}
