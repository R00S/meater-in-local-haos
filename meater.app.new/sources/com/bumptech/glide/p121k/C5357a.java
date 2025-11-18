package com.bumptech.glide.p121k;

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
import okhttp3.HttpUrl;

/* compiled from: DiskLruCache.java */
/* renamed from: com.bumptech.glide.k.a */
/* loaded from: classes.dex */
public final class C5357a implements Closeable {

    /* renamed from: f */
    private final File f13126f;

    /* renamed from: g */
    private final File f13127g;

    /* renamed from: h */
    private final File f13128h;

    /* renamed from: i */
    private final File f13129i;

    /* renamed from: j */
    private final int f13130j;

    /* renamed from: k */
    private long f13131k;

    /* renamed from: l */
    private final int f13132l;

    /* renamed from: n */
    private Writer f13134n;

    /* renamed from: p */
    private int f13136p;

    /* renamed from: m */
    private long f13133m = 0;

    /* renamed from: o */
    private final LinkedHashMap<String, d> f13135o = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: q */
    private long f13137q = 0;

    /* renamed from: r */
    final ThreadPoolExecutor f13138r = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b(null));

    /* renamed from: s */
    private final Callable<Void> f13139s = new a();

    /* compiled from: DiskLruCache.java */
    /* renamed from: com.bumptech.glide.k.a$a */
    class a implements Callable<Void> {
        a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            synchronized (C5357a.this) {
                if (C5357a.this.f13134n == null) {
                    return null;
                }
                C5357a.this.m10060T();
                if (C5357a.this.m10053B()) {
                    C5357a.this.m10058K();
                    C5357a.this.f13136p = 0;
                }
                return null;
            }
        }
    }

    /* compiled from: DiskLruCache.java */
    /* renamed from: com.bumptech.glide.k.a$b */
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

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    /* compiled from: DiskLruCache.java */
    /* renamed from: com.bumptech.glide.k.a$c */
    public final class c {

        /* renamed from: a */
        private final d f13141a;

        /* renamed from: b */
        private final boolean[] f13142b;

        /* renamed from: c */
        private boolean f13143c;

        /* synthetic */ c(C5357a c5357a, d dVar, a aVar) {
            this(dVar);
        }

        /* renamed from: a */
        public void m10080a() throws IOException {
            C5357a.this.m10070m(this, false);
        }

        /* renamed from: b */
        public void m10081b() {
            if (this.f13143c) {
                return;
            }
            try {
                m10080a();
            } catch (IOException unused) {
            }
        }

        /* renamed from: e */
        public void m10082e() throws IOException {
            C5357a.this.m10070m(this, true);
            this.f13143c = true;
        }

        /* renamed from: f */
        public File m10083f(int i2) throws IOException {
            File fileM10096k;
            synchronized (C5357a.this) {
                if (this.f13141a.f13150f != this) {
                    throw new IllegalStateException();
                }
                if (!this.f13141a.f13149e) {
                    this.f13142b[i2] = true;
                }
                fileM10096k = this.f13141a.m10096k(i2);
                if (!C5357a.this.f13126f.exists()) {
                    C5357a.this.f13126f.mkdirs();
                }
            }
            return fileM10096k;
        }

        private c(d dVar) {
            this.f13141a = dVar;
            this.f13142b = dVar.f13149e ? null : new boolean[C5357a.this.f13132l];
        }
    }

    /* compiled from: DiskLruCache.java */
    /* renamed from: com.bumptech.glide.k.a$d */
    private final class d {

        /* renamed from: a */
        private final String f13145a;

        /* renamed from: b */
        private final long[] f13146b;

        /* renamed from: c */
        File[] f13147c;

        /* renamed from: d */
        File[] f13148d;

        /* renamed from: e */
        private boolean f13149e;

        /* renamed from: f */
        private c f13150f;

        /* renamed from: g */
        private long f13151g;

        /* synthetic */ d(C5357a c5357a, String str, a aVar) {
            this(str);
        }

        /* renamed from: m */
        private IOException m10093m(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public void m10094n(String[] strArr) throws IOException {
            if (strArr.length != C5357a.this.f13132l) {
                throw m10093m(strArr);
            }
            for (int i2 = 0; i2 < strArr.length; i2++) {
                try {
                    this.f13146b[i2] = Long.parseLong(strArr[i2]);
                } catch (NumberFormatException unused) {
                    throw m10093m(strArr);
                }
            }
        }

        /* renamed from: j */
        public File m10095j(int i2) {
            return this.f13147c[i2];
        }

        /* renamed from: k */
        public File m10096k(int i2) {
            return this.f13148d[i2];
        }

        /* renamed from: l */
        public String m10097l() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long j2 : this.f13146b) {
                sb.append(' ');
                sb.append(j2);
            }
            return sb.toString();
        }

        private d(String str) {
            this.f13145a = str;
            this.f13146b = new long[C5357a.this.f13132l];
            this.f13147c = new File[C5357a.this.f13132l];
            this.f13148d = new File[C5357a.this.f13132l];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i2 = 0; i2 < C5357a.this.f13132l; i2++) {
                sb.append(i2);
                this.f13147c[i2] = new File(C5357a.this.f13126f, sb.toString());
                sb.append(".tmp");
                this.f13148d[i2] = new File(C5357a.this.f13126f, sb.toString());
                sb.setLength(length);
            }
        }
    }

    /* compiled from: DiskLruCache.java */
    /* renamed from: com.bumptech.glide.k.a$e */
    public final class e {

        /* renamed from: a */
        private final String f13153a;

        /* renamed from: b */
        private final long f13154b;

        /* renamed from: c */
        private final long[] f13155c;

        /* renamed from: d */
        private final File[] f13156d;

        /* synthetic */ e(C5357a c5357a, String str, long j2, File[] fileArr, long[] jArr, a aVar) {
            this(str, j2, fileArr, jArr);
        }

        /* renamed from: a */
        public File m10098a(int i2) {
            return this.f13156d[i2];
        }

        private e(String str, long j2, File[] fileArr, long[] jArr) {
            this.f13153a = str;
            this.f13154b = j2;
            this.f13156d = fileArr;
            this.f13155c = jArr;
        }
    }

    private C5357a(File file, int i2, int i3, long j2) {
        this.f13126f = file;
        this.f13130j = i2;
        this.f13127g = new File(file, "journal");
        this.f13128h = new File(file, "journal.tmp");
        this.f13129i = new File(file, "journal.bkp");
        this.f13132l = i3;
        this.f13131k = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public boolean m10053B() {
        int i2 = this.f13136p;
        return i2 >= 2000 && i2 >= this.f13135o.size();
    }

    /* renamed from: D */
    public static C5357a m10054D(File file, int i2, int i3, long j2) throws IOException {
        if (j2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i3 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                m10059Q(file2, file3, false);
            }
        }
        C5357a c5357a = new C5357a(file, i2, i3, j2);
        if (c5357a.f13127g.exists()) {
            try {
                c5357a.m10056I();
                c5357a.m10055H();
                return c5357a;
            } catch (IOException e2) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e2.getMessage() + ", removing");
                c5357a.m10075p();
            }
        }
        file.mkdirs();
        C5357a c5357a2 = new C5357a(file, i2, i3, j2);
        c5357a2.m10058K();
        return c5357a2;
    }

    /* renamed from: H */
    private void m10055H() throws IOException {
        m10071x(this.f13128h);
        Iterator<d> it = this.f13135o.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i2 = 0;
            if (next.f13150f == null) {
                while (i2 < this.f13132l) {
                    this.f13133m += next.f13146b[i2];
                    i2++;
                }
            } else {
                next.f13150f = null;
                while (i2 < this.f13132l) {
                    m10071x(next.m10095j(i2));
                    m10071x(next.m10096k(i2));
                    i2++;
                }
                it.remove();
            }
        }
    }

    /* renamed from: I */
    private void m10056I() throws IOException {
        C5358b c5358b = new C5358b(new FileInputStream(this.f13127g), C5359c.f13164a);
        try {
            String strM10102d = c5358b.m10102d();
            String strM10102d2 = c5358b.m10102d();
            String strM10102d3 = c5358b.m10102d();
            String strM10102d4 = c5358b.m10102d();
            String strM10102d5 = c5358b.m10102d();
            if (!"libcore.io.DiskLruCache".equals(strM10102d) || !"1".equals(strM10102d2) || !Integer.toString(this.f13130j).equals(strM10102d3) || !Integer.toString(this.f13132l).equals(strM10102d4) || !HttpUrl.FRAGMENT_ENCODE_SET.equals(strM10102d5)) {
                throw new IOException("unexpected journal header: [" + strM10102d + ", " + strM10102d2 + ", " + strM10102d4 + ", " + strM10102d5 + "]");
            }
            int i2 = 0;
            while (true) {
                try {
                    m10057J(c5358b.m10102d());
                    i2++;
                } catch (EOFException unused) {
                    this.f13136p = i2 - this.f13135o.size();
                    if (c5358b.m10101c()) {
                        m10058K();
                    } else {
                        this.f13134n = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f13127g, true), C5359c.f13164a));
                    }
                    C5359c.m10103a(c5358b);
                    return;
                }
            }
        } catch (Throwable th) {
            C5359c.m10103a(c5358b);
            throw th;
        }
    }

    /* renamed from: J */
    private void m10057J(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i2 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i2);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i2);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                this.f13135o.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i2, iIndexOf2);
        }
        d dVar = this.f13135o.get(strSubstring);
        a aVar = null;
        if (dVar == null) {
            dVar = new d(this, strSubstring, aVar);
            this.f13135o.put(strSubstring, dVar);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
            dVar.f13149e = true;
            dVar.f13150f = null;
            dVar.m10094n(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
            dVar.f13150f = new c(this, dVar, aVar);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith("READ")) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public synchronized void m10058K() throws IOException {
        Writer writer = this.f13134n;
        if (writer != null) {
            writer.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f13128h), C5359c.f13164a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f13130j));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f13132l));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (d dVar : this.f13135o.values()) {
                if (dVar.f13150f != null) {
                    bufferedWriter.write("DIRTY " + dVar.f13145a + '\n');
                } else {
                    bufferedWriter.write("CLEAN " + dVar.f13145a + dVar.m10097l() + '\n');
                }
            }
            bufferedWriter.close();
            if (this.f13127g.exists()) {
                m10059Q(this.f13127g, this.f13129i, true);
            }
            m10059Q(this.f13128h, this.f13127g, false);
            this.f13129i.delete();
            this.f13134n = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f13127g, true), C5359c.f13164a));
        } catch (Throwable th) {
            bufferedWriter.close();
            throw th;
        }
    }

    /* renamed from: Q */
    private static void m10059Q(File file, File file2, boolean z) throws IOException {
        if (z) {
            m10071x(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public void m10060T() throws IOException {
        while (this.f13133m > this.f13131k) {
            m10074N(this.f13135o.entrySet().iterator().next().getKey());
        }
    }

    /* renamed from: l */
    private void m10069l() {
        if (this.f13134n == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public synchronized void m10070m(c cVar, boolean z) throws IOException {
        d dVar = cVar.f13141a;
        if (dVar.f13150f != cVar) {
            throw new IllegalStateException();
        }
        if (z && !dVar.f13149e) {
            for (int i2 = 0; i2 < this.f13132l; i2++) {
                if (!cVar.f13142b[i2]) {
                    cVar.m10080a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i2);
                }
                if (!dVar.m10096k(i2).exists()) {
                    cVar.m10080a();
                    return;
                }
            }
        }
        for (int i3 = 0; i3 < this.f13132l; i3++) {
            File fileM10096k = dVar.m10096k(i3);
            if (!z) {
                m10071x(fileM10096k);
            } else if (fileM10096k.exists()) {
                File fileM10095j = dVar.m10095j(i3);
                fileM10096k.renameTo(fileM10095j);
                long j2 = dVar.f13146b[i3];
                long length = fileM10095j.length();
                dVar.f13146b[i3] = length;
                this.f13133m = (this.f13133m - j2) + length;
            }
        }
        this.f13136p++;
        dVar.f13150f = null;
        if (dVar.f13149e || z) {
            dVar.f13149e = true;
            this.f13134n.append((CharSequence) "CLEAN");
            this.f13134n.append(' ');
            this.f13134n.append((CharSequence) dVar.f13145a);
            this.f13134n.append((CharSequence) dVar.m10097l());
            this.f13134n.append('\n');
            if (z) {
                long j3 = this.f13137q;
                this.f13137q = 1 + j3;
                dVar.f13151g = j3;
            }
        } else {
            this.f13135o.remove(dVar.f13145a);
            this.f13134n.append((CharSequence) "REMOVE");
            this.f13134n.append(' ');
            this.f13134n.append((CharSequence) dVar.f13145a);
            this.f13134n.append('\n');
        }
        this.f13134n.flush();
        if (this.f13133m > this.f13131k || m10053B()) {
            this.f13138r.submit(this.f13139s);
        }
    }

    /* renamed from: x */
    private static void m10071x(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: z */
    private synchronized c m10072z(String str, long j2) throws IOException {
        m10069l();
        d dVar = this.f13135o.get(str);
        a aVar = null;
        if (j2 != -1 && (dVar == null || dVar.f13151g != j2)) {
            return null;
        }
        if (dVar == null) {
            dVar = new d(this, str, aVar);
            this.f13135o.put(str, dVar);
        } else if (dVar.f13150f != null) {
            return null;
        }
        c cVar = new c(this, dVar, aVar);
        dVar.f13150f = cVar;
        this.f13134n.append((CharSequence) "DIRTY");
        this.f13134n.append(' ');
        this.f13134n.append((CharSequence) str);
        this.f13134n.append('\n');
        this.f13134n.flush();
        return cVar;
    }

    /* renamed from: A */
    public synchronized e m10073A(String str) throws IOException {
        m10069l();
        d dVar = this.f13135o.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f13149e) {
            return null;
        }
        for (File file : dVar.f13147c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f13136p++;
        this.f13134n.append((CharSequence) "READ");
        this.f13134n.append(' ');
        this.f13134n.append((CharSequence) str);
        this.f13134n.append('\n');
        if (m10053B()) {
            this.f13138r.submit(this.f13139s);
        }
        return new e(this, str, dVar.f13151g, dVar.f13147c, dVar.f13146b, null);
    }

    /* renamed from: N */
    public synchronized boolean m10074N(String str) throws IOException {
        m10069l();
        d dVar = this.f13135o.get(str);
        if (dVar != null && dVar.f13150f == null) {
            for (int i2 = 0; i2 < this.f13132l; i2++) {
                File fileM10095j = dVar.m10095j(i2);
                if (fileM10095j.exists() && !fileM10095j.delete()) {
                    throw new IOException("failed to delete " + fileM10095j);
                }
                this.f13133m -= dVar.f13146b[i2];
                dVar.f13146b[i2] = 0;
            }
            this.f13136p++;
            this.f13134n.append((CharSequence) "REMOVE");
            this.f13134n.append(' ');
            this.f13134n.append((CharSequence) str);
            this.f13134n.append('\n');
            this.f13135o.remove(str);
            if (m10053B()) {
                this.f13138r.submit(this.f13139s);
            }
            return true;
        }
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        if (this.f13134n == null) {
            return;
        }
        Iterator it = new ArrayList(this.f13135o.values()).iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (dVar.f13150f != null) {
                dVar.f13150f.m10080a();
            }
        }
        m10060T();
        this.f13134n.close();
        this.f13134n = null;
    }

    /* renamed from: p */
    public void m10075p() throws IOException {
        close();
        C5359c.m10104b(this.f13126f);
    }

    /* renamed from: y */
    public c m10076y(String str) throws IOException {
        return m10072z(str, -1L);
    }
}
