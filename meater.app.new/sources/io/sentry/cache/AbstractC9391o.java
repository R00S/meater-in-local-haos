package io.sentry.cache;

import io.sentry.C9422d5;
import io.sentry.C9449h4;
import io.sentry.C9492j4;
import io.sentry.C9680x4;
import io.sentry.EnumC9580r4;
import io.sentry.EnumC9587s4;
import io.sentry.InterfaceC9373c2;
import io.sentry.clientreport.EnumC9401e;
import io.sentry.util.C9646q;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CacheStrategy.java */
/* renamed from: io.sentry.cache.o */
/* loaded from: classes2.dex */
public abstract class AbstractC9391o {

    /* renamed from: f */
    protected static final Charset f36229f = Charset.forName("UTF-8");

    /* renamed from: g */
    protected final C9680x4 f36230g;

    /* renamed from: h */
    protected final InterfaceC9373c2 f36231h;

    /* renamed from: i */
    protected final File f36232i;

    /* renamed from: j */
    private final int f36233j;

    AbstractC9391o(C9680x4 c9680x4, String str, int i2) {
        C9646q.m31802c(str, "Directory is required.");
        this.f36230g = (C9680x4) C9646q.m31802c(c9680x4, "SentryOptions is required.");
        this.f36231h = c9680x4.getSerializer();
        this.f36232i = new File(str);
        this.f36233j = i2;
    }

    /* renamed from: c */
    private C9449h4 m30607c(C9449h4 c9449h4, C9492j4 c9492j4) {
        ArrayList arrayList = new ArrayList();
        Iterator<C9492j4> it = c9449h4.m30832c().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        arrayList.add(c9492j4);
        return new C9449h4(c9449h4.m30831b(), arrayList);
    }

    /* renamed from: f */
    private C9422d5 m30608f(C9449h4 c9449h4) {
        for (C9492j4 c9492j4 : c9449h4.m30832c()) {
            if (m30609h(c9492j4)) {
                return m30615s(c9492j4);
            }
        }
        return null;
    }

    /* renamed from: h */
    private boolean m30609h(C9492j4 c9492j4) {
        if (c9492j4 == null) {
            return false;
        }
        return c9492j4.m30910i().m30919b().equals(EnumC9580r4.Session);
    }

    /* renamed from: i */
    private boolean m30610i(C9449h4 c9449h4) {
        return c9449h4.m30832c().iterator().hasNext();
    }

    /* renamed from: n */
    private boolean m30611n(C9422d5 c9422d5) {
        return c9422d5.m30748l().equals(C9422d5.b.Ok) && c9422d5.m30746j() != null;
    }

    /* renamed from: o */
    static /* synthetic */ int m30612o(File file, File file2) {
        return (file.lastModified() > file2.lastModified() ? 1 : (file.lastModified() == file2.lastModified() ? 0 : -1));
    }

    /* renamed from: q */
    private void m30613q(File file, File[] fileArr) throws IOException {
        Boolean boolM30744g;
        C9422d5 c9422d5M30615s;
        C9449h4 c9449h4M30614r = m30614r(file);
        if (c9449h4M30614r == null || !m30610i(c9449h4M30614r)) {
            return;
        }
        this.f36230g.getClientReportRecorder().mo30691b(EnumC9401e.CACHE_OVERFLOW, c9449h4M30614r);
        C9422d5 c9422d5M30608f = m30608f(c9449h4M30614r);
        if (c9422d5M30608f == null || !m30611n(c9422d5M30608f) || (boolM30744g = c9422d5M30608f.m30744g()) == null || !boolM30744g.booleanValue()) {
            return;
        }
        for (File file2 : fileArr) {
            C9449h4 c9449h4M30614r2 = m30614r(file2);
            if (c9449h4M30614r2 != null && m30610i(c9449h4M30614r2)) {
                C9492j4 c9492j4M30892f = null;
                Iterator<C9492j4> it = c9449h4M30614r2.m30832c().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C9492j4 next = it.next();
                    if (m30609h(next) && (c9422d5M30615s = m30615s(next)) != null && m30611n(c9422d5M30615s)) {
                        Boolean boolM30744g2 = c9422d5M30615s.m30744g();
                        if (boolM30744g2 != null && boolM30744g2.booleanValue()) {
                            this.f36230g.getLogger().mo30214c(EnumC9587s4.ERROR, "Session %s has 2 times the init flag.", c9422d5M30608f.m30746j());
                            return;
                        }
                        if (c9422d5M30608f.m30746j() != null && c9422d5M30608f.m30746j().equals(c9422d5M30615s.m30746j())) {
                            c9422d5M30615s.m30750n();
                            try {
                                c9492j4M30892f = C9492j4.m30892f(this.f36231h, c9422d5M30615s);
                                it.remove();
                                break;
                            } catch (IOException e2) {
                                this.f36230g.getLogger().mo30212a(EnumC9587s4.ERROR, e2, "Failed to create new envelope item for the session %s", c9422d5M30608f.m30746j());
                            }
                        }
                    }
                }
                if (c9492j4M30892f != null) {
                    C9449h4 c9449h4M30607c = m30607c(c9449h4M30614r2, c9492j4M30892f);
                    long jLastModified = file2.lastModified();
                    if (!file2.delete()) {
                        this.f36230g.getLogger().mo30214c(EnumC9587s4.WARNING, "File can't be deleted: %s", file2.getAbsolutePath());
                    }
                    m30616u(c9449h4M30607c, file2, jLastModified);
                    return;
                }
            }
        }
    }

    /* renamed from: r */
    private C9449h4 m30614r(File file) throws IOException {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                C9449h4 c9449h4Mo30490d = this.f36231h.mo30490d(bufferedInputStream);
                bufferedInputStream.close();
                return c9449h4Mo30490d;
            } catch (Throwable th) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (IOException e2) {
            this.f36230g.getLogger().mo30213b(EnumC9587s4.ERROR, "Failed to deserialize the envelope.", e2);
            return null;
        }
    }

    /* renamed from: s */
    private C9422d5 m30615s(C9492j4 c9492j4) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(c9492j4.m30909h()), f36229f));
            try {
                C9422d5 c9422d5 = (C9422d5) this.f36231h.mo30489c(bufferedReader, C9422d5.class);
                bufferedReader.close();
                return c9422d5;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (Throwable th2) {
            this.f36230g.getLogger().mo30213b(EnumC9587s4.ERROR, "Failed to deserialize the session.", th2);
            return null;
        }
    }

    /* renamed from: u */
    private void m30616u(C9449h4 c9449h4, File file, long j2) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                this.f36231h.mo30488b(c9449h4, fileOutputStream);
                file.setLastModified(j2);
                fileOutputStream.close();
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (Throwable th2) {
            this.f36230g.getLogger().mo30213b(EnumC9587s4.ERROR, "Failed to serialize the new envelope to the disk.", th2);
        }
    }

    /* renamed from: v */
    private void m30617v(File[] fileArr) {
        if (fileArr.length > 1) {
            Arrays.sort(fileArr, new Comparator() { // from class: io.sentry.cache.a
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return AbstractC9391o.m30612o((File) obj, (File) obj2);
                }
            });
        }
    }

    /* renamed from: g */
    protected boolean m30618g() {
        if (this.f36232i.isDirectory() && this.f36232i.canWrite() && this.f36232i.canRead()) {
            return true;
        }
        this.f36230g.getLogger().mo30214c(EnumC9587s4.ERROR, "The directory for caching files is inaccessible.: %s", this.f36232i.getAbsolutePath());
        return false;
    }

    /* renamed from: t */
    protected void m30619t(File[] fileArr) throws IOException {
        int length = fileArr.length;
        if (length >= this.f36233j) {
            this.f36230g.getLogger().mo30214c(EnumC9587s4.WARNING, "Cache folder if full (respecting maxSize). Rotating files", new Object[0]);
            int i2 = (length - this.f36233j) + 1;
            m30617v(fileArr);
            File[] fileArr2 = (File[]) Arrays.copyOfRange(fileArr, i2, length);
            for (int i3 = 0; i3 < i2; i3++) {
                File file = fileArr[i3];
                m30613q(file, fileArr2);
                if (!file.delete()) {
                    this.f36230g.getLogger().mo30214c(EnumC9587s4.WARNING, "File can't be deleted: %s", file.getAbsolutePath());
                }
            }
        }
    }
}
