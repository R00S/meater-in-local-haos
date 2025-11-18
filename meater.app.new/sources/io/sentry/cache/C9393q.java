package io.sentry.cache;

import io.sentry.C9244a1;
import io.sentry.C9422d5;
import io.sentry.C9428e4;
import io.sentry.C9449h4;
import io.sentry.C9492j4;
import io.sentry.C9517n1;
import io.sentry.C9680x4;
import io.sentry.EnumC9580r4;
import io.sentry.EnumC9587s4;
import io.sentry.InterfaceC9670w1;
import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.hints.InterfaceC9452b;
import io.sentry.hints.InterfaceC9462l;
import io.sentry.hints.InterfaceC9464n;
import io.sentry.transport.C9616t;
import io.sentry.util.C9642m;
import io.sentry.util.C9646q;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: EnvelopeCache.java */
@ApiStatus.Internal
/* renamed from: io.sentry.cache.q */
/* loaded from: classes2.dex */
public class C9393q extends AbstractC9391o implements InterfaceC9394r {

    /* renamed from: k */
    private final CountDownLatch f36235k;

    /* renamed from: l */
    private final Map<C9449h4, String> f36236l;

    public C9393q(C9680x4 c9680x4, String str, int i2) {
        super(c9680x4, str, i2);
        this.f36236l = new WeakHashMap();
        this.f36235k = new CountDownLatch(1);
    }

    /* renamed from: A */
    private synchronized File m30624A(C9449h4 c9449h4) {
        String str;
        if (this.f36236l.containsKey(c9449h4)) {
            str = this.f36236l.get(c9449h4);
        } else {
            String str2 = (c9449h4.m30831b().m30849a() != null ? c9449h4.m30831b().m30849a().toString() : UUID.randomUUID().toString()) + ".envelope";
            this.f36236l.put(c9449h4, str2);
            str = str2;
        }
        return new File(this.f36232i.getAbsolutePath(), str);
    }

    /* renamed from: C */
    public static File m30625C(String str) {
        return new File(str, "previous_session.json");
    }

    /* renamed from: E */
    private void m30627E(C9517n1 c9517n1) {
        Date dateM30009d;
        Object objM31780c = C9642m.m31780c(c9517n1);
        if (objM31780c instanceof InterfaceC9452b) {
            File fileM30625C = m30625C(this.f36232i.getAbsolutePath());
            if (!fileM30625C.exists()) {
                this.f36230g.getLogger().mo30214c(EnumC9587s4.DEBUG, "No previous session file to end.", new Object[0]);
                return;
            }
            InterfaceC9670w1 logger = this.f36230g.getLogger();
            EnumC9587s4 enumC9587s4 = EnumC9587s4.WARNING;
            logger.mo30214c(enumC9587s4, "Previous session is not ended, we'd need to end it.", new Object[0]);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileM30625C), AbstractC9391o.f36229f));
                try {
                    C9422d5 c9422d5 = (C9422d5) this.f36231h.mo30489c(bufferedReader, C9422d5.class);
                    if (c9422d5 != null) {
                        InterfaceC9452b interfaceC9452b = (InterfaceC9452b) objM31780c;
                        Long lMo30102c = interfaceC9452b.mo30102c();
                        if (lMo30102c != null) {
                            dateM30009d = C9244a1.m30009d(lMo30102c.longValue());
                            Date dateM30747k = c9422d5.m30747k();
                            if (dateM30747k == null || dateM30009d.before(dateM30747k)) {
                                this.f36230g.getLogger().mo30214c(enumC9587s4, "Abnormal exit happened before previous session start, not ending the session.", new Object[0]);
                                bufferedReader.close();
                                return;
                            }
                        } else {
                            dateM30009d = null;
                        }
                        c9422d5.m30753q(C9422d5.b.Abnormal, null, true, interfaceC9452b.mo30104f());
                        c9422d5.m30741d(dateM30009d);
                        m30631O(fileM30625C, c9422d5);
                    }
                    bufferedReader.close();
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                this.f36230g.getLogger().mo30213b(EnumC9587s4.ERROR, "Error processing previous session.", th2);
            }
        }
    }

    /* renamed from: F */
    private void m30628F(File file, C9449h4 c9449h4) {
        Iterable<C9492j4> iterableM30832c = c9449h4.m30832c();
        if (!iterableM30832c.iterator().hasNext()) {
            this.f36230g.getLogger().mo30214c(EnumC9587s4.INFO, "Current envelope %s is empty", file.getAbsolutePath());
            return;
        }
        C9492j4 next = iterableM30832c.iterator().next();
        if (!EnumC9580r4.Session.equals(next.m30910i().m30919b())) {
            this.f36230g.getLogger().mo30214c(EnumC9587s4.INFO, "Current envelope has a different envelope type %s", next.m30910i().m30919b());
            return;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(next.m30909h()), AbstractC9391o.f36229f));
            try {
                C9422d5 c9422d5 = (C9422d5) this.f36231h.mo30489c(bufferedReader, C9422d5.class);
                if (c9422d5 == null) {
                    this.f36230g.getLogger().mo30214c(EnumC9587s4.ERROR, "Item of type %s returned null by the parser.", next.m30910i().m30919b());
                } else {
                    m30631O(file, c9422d5);
                }
                bufferedReader.close();
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (Throwable th2) {
            this.f36230g.getLogger().mo30213b(EnumC9587s4.ERROR, "Item failed to process.", th2);
        }
    }

    /* renamed from: L */
    private void m30629L() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(this.f36230g.getCacheDirPath(), "last_crash"));
            try {
                fileOutputStream.write(C9244a1.m30012g(C9244a1.m30008c()).getBytes(AbstractC9391o.f36229f));
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (Throwable th2) {
            this.f36230g.getLogger().mo30213b(EnumC9587s4.ERROR, "Error writing the crash marker file to the disk", th2);
        }
    }

    /* renamed from: M */
    private void m30630M(File file, C9449h4 c9449h4) {
        if (file.exists()) {
            this.f36230g.getLogger().mo30214c(EnumC9587s4.DEBUG, "Overwriting envelope to offline storage: %s", file.getAbsolutePath());
            if (!file.delete()) {
                this.f36230g.getLogger().mo30214c(EnumC9587s4.ERROR, "Failed to delete: %s", file.getAbsolutePath());
            }
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                this.f36231h.mo30488b(c9449h4, fileOutputStream);
                fileOutputStream.close();
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (Throwable th2) {
            this.f36230g.getLogger().mo30212a(EnumC9587s4.ERROR, th2, "Error writing Envelope %s to offline storage", file.getAbsolutePath());
        }
    }

    /* renamed from: O */
    private void m30631O(File file, C9422d5 c9422d5) {
        if (file.exists()) {
            this.f36230g.getLogger().mo30214c(EnumC9587s4.DEBUG, "Overwriting session to offline storage: %s", c9422d5.m30746j());
            if (!file.delete()) {
                this.f36230g.getLogger().mo30214c(EnumC9587s4.ERROR, "Failed to delete: %s", file.getAbsolutePath());
            }
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, AbstractC9391o.f36229f));
                try {
                    this.f36231h.mo30487a(c9422d5, bufferedWriter);
                    bufferedWriter.close();
                    fileOutputStream.close();
                } catch (Throwable th) {
                    try {
                        bufferedWriter.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    fileOutputStream.close();
                } catch (Throwable unused2) {
                }
                throw th2;
            }
        } catch (Throwable th3) {
            this.f36230g.getLogger().mo30212a(EnumC9587s4.ERROR, th3, "Error writing Session to offline storage: %s", c9422d5.m30746j());
        }
    }

    /* renamed from: w */
    private File[] m30632w() {
        File[] fileArrListFiles;
        return (!m30618g() || (fileArrListFiles = this.f36232i.listFiles(new FilenameFilter() { // from class: io.sentry.cache.b
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return str.endsWith(".envelope");
            }
        })) == null) ? new File[0] : fileArrListFiles;
    }

    /* renamed from: x */
    public static InterfaceC9394r m30633x(C9680x4 c9680x4) {
        String cacheDirPath = c9680x4.getCacheDirPath();
        int maxCacheItems = c9680x4.getMaxCacheItems();
        if (cacheDirPath != null) {
            return new C9393q(c9680x4, cacheDirPath, maxCacheItems);
        }
        c9680x4.getLogger().mo30214c(EnumC9587s4.WARNING, "cacheDirPath is null, returning NoOpEnvelopeCache", new Object[0]);
        return C9616t.m31704c();
    }

    /* renamed from: z */
    public static File m30634z(String str) {
        return new File(str, "session.json");
    }

    /* renamed from: G */
    public boolean m30635G() {
        try {
            return this.f36235k.await(this.f36230g.getFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            this.f36230g.getLogger().mo30214c(EnumC9587s4.DEBUG, "Timed out waiting for previous session to flush.", new Object[0]);
            return false;
        }
    }

    /* renamed from: Z */
    public void mo30163Z(C9449h4 c9449h4, C9517n1 c9517n1) {
        C9646q.m31802c(c9449h4, "Envelope is required.");
        m30619t(m30632w());
        File fileM30634z = m30634z(this.f36232i.getAbsolutePath());
        File fileM30625C = m30625C(this.f36232i.getAbsolutePath());
        if (C9642m.m31781d(c9517n1, InterfaceC9462l.class) && !fileM30634z.delete()) {
            this.f36230g.getLogger().mo30214c(EnumC9587s4.WARNING, "Current envelope doesn't exist.", new Object[0]);
        }
        if (C9642m.m31781d(c9517n1, InterfaceC9452b.class)) {
            m30627E(c9517n1);
        }
        if (C9642m.m31781d(c9517n1, InterfaceC9464n.class)) {
            if (fileM30634z.exists()) {
                this.f36230g.getLogger().mo30214c(EnumC9587s4.WARNING, "Current session is not ended, we'd need to end it.", new Object[0]);
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileM30634z), AbstractC9391o.f36229f));
                    try {
                        C9422d5 c9422d5 = (C9422d5) this.f36231h.mo30489c(bufferedReader, C9422d5.class);
                        if (c9422d5 != null) {
                            m30631O(fileM30625C, c9422d5);
                        }
                        bufferedReader.close();
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable unused) {
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    this.f36230g.getLogger().mo30213b(EnumC9587s4.ERROR, "Error processing session.", th2);
                }
            }
            m30628F(fileM30634z, c9449h4);
            boolean zExists = new File(this.f36230g.getCacheDirPath(), ".sentry-native/last_crash").exists();
            if (!zExists) {
                File file = new File(this.f36230g.getCacheDirPath(), "last_crash");
                if (file.exists()) {
                    this.f36230g.getLogger().mo30214c(EnumC9587s4.INFO, "Crash marker file exists, crashedLastRun will return true.", new Object[0]);
                    if (!file.delete()) {
                        this.f36230g.getLogger().mo30214c(EnumC9587s4.ERROR, "Failed to delete the crash marker file. %s.", file.getAbsolutePath());
                    }
                    zExists = true;
                }
            }
            C9428e4.m30762a().m30763b(zExists);
            m30637y();
        }
        File fileM30624A = m30624A(c9449h4);
        if (fileM30624A.exists()) {
            this.f36230g.getLogger().mo30214c(EnumC9587s4.WARNING, "Not adding Envelope to offline storage because it already exists: %s", fileM30624A.getAbsolutePath());
            return;
        }
        this.f36230g.getLogger().mo30214c(EnumC9587s4.DEBUG, "Adding Envelope to offline storage: %s", fileM30624A.getAbsolutePath());
        m30630M(fileM30624A, c9449h4);
        if (C9642m.m31781d(c9517n1, UncaughtExceptionHandlerIntegration.C9241a.class)) {
            m30629L();
        }
    }

    @Override // java.lang.Iterable
    public Iterator<C9449h4> iterator() throws IOException {
        BufferedInputStream bufferedInputStream;
        File[] fileArrM30632w = m30632w();
        ArrayList arrayList = new ArrayList(fileArrM30632w.length);
        for (File file : fileArrM30632w) {
            try {
                bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            } catch (FileNotFoundException unused) {
                this.f36230g.getLogger().mo30214c(EnumC9587s4.DEBUG, "Envelope file '%s' disappeared while converting all cached files to envelopes.", file.getAbsolutePath());
            } catch (IOException e2) {
                this.f36230g.getLogger().mo30213b(EnumC9587s4.ERROR, String.format("Error while reading cached envelope from file %s", file.getAbsolutePath()), e2);
            }
            try {
                arrayList.add(this.f36231h.mo30490d(bufferedInputStream));
                bufferedInputStream.close();
            } catch (Throwable th) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable unused2) {
                }
                throw th;
            }
        }
        return arrayList.iterator();
    }

    @Override // io.sentry.cache.InterfaceC9394r
    /* renamed from: p */
    public void mo30636p(C9449h4 c9449h4) {
        C9646q.m31802c(c9449h4, "Envelope is required.");
        File fileM30624A = m30624A(c9449h4);
        if (!fileM30624A.exists()) {
            this.f36230g.getLogger().mo30214c(EnumC9587s4.DEBUG, "Envelope was not cached: %s", fileM30624A.getAbsolutePath());
            return;
        }
        this.f36230g.getLogger().mo30214c(EnumC9587s4.DEBUG, "Discarding envelope from cache: %s", fileM30624A.getAbsolutePath());
        if (fileM30624A.delete()) {
            return;
        }
        this.f36230g.getLogger().mo30214c(EnumC9587s4.ERROR, "Failed to delete envelope: %s", fileM30624A.getAbsolutePath());
    }

    /* renamed from: y */
    public void m30637y() {
        this.f36235k.countDown();
    }
}
