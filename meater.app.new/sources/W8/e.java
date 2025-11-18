package W8;

import Q8.C1626n;
import Q8.D;
import S8.p;
import T8.F;
import U8.j;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: CrashlyticsReportPersistence.java */
/* loaded from: classes2.dex */
public class e {

    /* renamed from: e, reason: collision with root package name */
    private static final Charset f18455e = Charset.forName("UTF-8");

    /* renamed from: f, reason: collision with root package name */
    private static final int f18456f = 15;

    /* renamed from: g, reason: collision with root package name */
    private static final j f18457g = new j();

    /* renamed from: h, reason: collision with root package name */
    private static final Comparator<? super File> f18458h = new Comparator() { // from class: W8.a
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return e.u((File) obj, (File) obj2);
        }
    };

    /* renamed from: i, reason: collision with root package name */
    private static final FilenameFilter f18459i = new FilenameFilter() { // from class: W8.b
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return e.v(file, str);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f18460a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    private final g f18461b;

    /* renamed from: c, reason: collision with root package name */
    private final Y8.j f18462c;

    /* renamed from: d, reason: collision with root package name */
    private final C1626n f18463d;

    public e(g gVar, Y8.j jVar, C1626n c1626n) {
        this.f18461b = gVar;
        this.f18462c = jVar;
        this.f18463d = c1626n;
    }

    private static String A(File file) throws IOException {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i10 = fileInputStream.read(bArr);
                if (i10 <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), f18455e);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    private void B(File file, F.d dVar, String str, F.a aVar) {
        String strD = this.f18463d.d(str);
        try {
            j jVar = f18457g;
            F(this.f18461b.i(str), jVar.M(jVar.L(A(file)).u(dVar).q(aVar).p(strD)));
        } catch (IOException e10) {
            N8.g.f().l("Could not synthesize final native report file for " + file, e10);
        }
    }

    private void C(String str, long j10) {
        boolean z10;
        List<File> listR = this.f18461b.r(str, f18459i);
        if (listR.isEmpty()) {
            N8.g.f().i("Session " + str + " has no events.");
            return;
        }
        Collections.sort(listR);
        ArrayList arrayList = new ArrayList();
        loop0: while (true) {
            z10 = false;
            for (File file : listR) {
                try {
                    arrayList.add(f18457g.j(A(file)));
                } catch (IOException e10) {
                    N8.g.f().l("Could not add event to report for " + file, e10);
                }
                if (z10 || s(file.getName())) {
                    z10 = true;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            D(this.f18461b.q(str, "report"), arrayList, j10, z10, p.n(str, this.f18461b), this.f18463d.d(str));
        } else {
            N8.g.f().k("Could not parse event files for session " + str);
        }
    }

    private void D(File file, List<F.e.d> list, long j10, boolean z10, String str, String str2) {
        try {
            j jVar = f18457g;
            F fR = jVar.L(A(file)).v(j10, z10, str).p(str2).r(list);
            F.e eVarN = fR.n();
            if (eVarN == null) {
                return;
            }
            N8.g.f().b("appQualitySessionId: " + str2);
            F(z10 ? this.f18461b.l(eVarN.i()) : this.f18461b.n(eVarN.i()), jVar.M(fR));
        } catch (IOException e10) {
            N8.g.f().l("Could not synthesize final report file for " + file, e10);
        }
    }

    private int E(String str, int i10) {
        List<File> listR = this.f18461b.r(str, new FilenameFilter() { // from class: W8.c
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return e.t(file, str2);
            }
        });
        Collections.sort(listR, new Comparator() { // from class: W8.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return e.x((File) obj, (File) obj2);
            }
        });
        return f(listR, i10);
    }

    private static void F(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f18455e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static void G(File file, String str, long j10) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f18455e);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(h(j10));
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private SortedSet<String> e(String str) {
        this.f18461b.d();
        SortedSet<String> sortedSetP = p();
        if (str != null) {
            sortedSetP.remove(str);
        }
        if (sortedSetP.size() <= 8) {
            return sortedSetP;
        }
        while (sortedSetP.size() > 8) {
            String strLast = sortedSetP.last();
            N8.g.f().b("Removing session over cap: " + strLast);
            this.f18461b.e(strLast);
            sortedSetP.remove(strLast);
        }
        return sortedSetP;
    }

    private static int f(List<File> list, int i10) {
        int size = list.size();
        for (File file : list) {
            if (size <= i10) {
                return size;
            }
            g.v(file);
            size--;
        }
        return size;
    }

    private void g() {
        int i10 = this.f18462c.b().f19462a.f19474b;
        List<File> listN = n();
        int size = listN.size();
        if (size <= i10) {
            return;
        }
        Iterator<File> it = listN.subList(i10, size).iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    private static long h(long j10) {
        return j10 * 1000;
    }

    private void j(List<File> list) {
        Iterator<File> it = list.iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    private static String m(int i10, boolean z10) {
        return "event" + String.format(Locale.US, "%010d", Integer.valueOf(i10)) + (z10 ? "_" : "");
    }

    private List<File> n() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f18461b.m());
        arrayList.addAll(this.f18461b.j());
        Comparator<? super File> comparator = f18458h;
        Collections.sort(arrayList, comparator);
        List<File> listO = this.f18461b.o();
        Collections.sort(listO, comparator);
        arrayList.addAll(listO);
        return arrayList;
    }

    private static String o(String str) {
        return str.substring(0, f18456f);
    }

    private static boolean s(String str) {
        return str.startsWith("event") && str.endsWith("_");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean t(File file, String str) {
        return str.startsWith("event") && !str.endsWith("_");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int u(File file, File file2) {
        return file2.getName().compareTo(file.getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean v(File file, String str) {
        return str.startsWith("event");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int x(File file, File file2) {
        return o(file.getName()).compareTo(o(file2.getName()));
    }

    public void i() {
        j(this.f18461b.o());
        j(this.f18461b.m());
        j(this.f18461b.j());
    }

    public void k(String str, long j10) {
        for (String str2 : e(str)) {
            N8.g.f().i("Finalizing report for session " + str2);
            C(str2, j10);
            this.f18461b.e(str2);
        }
        g();
    }

    public void l(String str, F.d dVar, F.a aVar) {
        File fileQ = this.f18461b.q(str, "report");
        N8.g.f().b("Writing native session report for " + str + " to file: " + fileQ);
        B(fileQ, dVar, str, aVar);
    }

    public SortedSet<String> p() {
        return new TreeSet(this.f18461b.f()).descendingSet();
    }

    public long q(String str) {
        return this.f18461b.q(str, "start-time").lastModified();
    }

    public boolean r() {
        return (this.f18461b.o().isEmpty() && this.f18461b.m().isEmpty() && this.f18461b.j().isEmpty()) ? false : true;
    }

    public List<D> w() {
        List<File> listN = n();
        ArrayList arrayList = new ArrayList();
        for (File file : listN) {
            try {
                arrayList.add(D.a(f18457g.L(A(file)), file.getName(), file));
            } catch (IOException e10) {
                N8.g.f().l("Could not load report file " + file + "; deleting", e10);
                file.delete();
            }
        }
        return arrayList;
    }

    public void y(F.e.d dVar, String str, boolean z10) {
        int i10 = this.f18462c.b().f19462a.f19473a;
        try {
            F(this.f18461b.q(str, m(this.f18460a.getAndIncrement(), z10)), f18457g.k(dVar));
        } catch (IOException e10) {
            N8.g.f().l("Could not persist event for session " + str, e10);
        }
        E(str, i10);
    }

    public void z(F f10) {
        F.e eVarN = f10.n();
        if (eVarN == null) {
            N8.g.f().b("Could not get session for report");
            return;
        }
        String strI = eVarN.i();
        try {
            F(this.f18461b.q(strI, "report"), f18457g.M(f10));
            G(this.f18461b.q(strI, "start-time"), "", eVarN.l());
        } catch (IOException e10) {
            N8.g.f().c("Could not persist report for session " + strI, e10);
        }
    }
}
