package io.sentry;

import io.sentry.C9422d5;
import io.sentry.cache.C9393q;
import io.sentry.cache.InterfaceC9394r;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Date;

/* compiled from: PreviousSessionFinalizer.java */
/* renamed from: io.sentry.l3 */
/* loaded from: classes2.dex */
final class RunnableC9505l3 implements Runnable {

    /* renamed from: f */
    private static final Charset f36448f = Charset.forName("UTF-8");

    /* renamed from: g */
    private final C9680x4 f36449g;

    /* renamed from: h */
    private final InterfaceC9658v1 f36450h;

    RunnableC9505l3(C9680x4 c9680x4, InterfaceC9658v1 interfaceC9658v1) {
        this.f36449g = c9680x4;
        this.f36450h = interfaceC9658v1;
    }

    /* renamed from: a */
    private Date m30984a(File file) throws IOException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), f36448f));
            try {
                String line = bufferedReader.readLine();
                this.f36449g.getLogger().mo30214c(EnumC9587s4.DEBUG, "Crash marker file has %s timestamp.", line);
                Date dateM30010e = C9244a1.m30010e(line);
                bufferedReader.close();
                return dateM30010e;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (IOException e2) {
            this.f36449g.getLogger().mo30213b(EnumC9587s4.ERROR, "Error reading the crash marker file.", e2);
            return null;
        } catch (IllegalArgumentException e3) {
            this.f36449g.getLogger().mo30212a(EnumC9587s4.ERROR, e3, "Error converting the crash timestamp.", new Object[0]);
            return null;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        BufferedReader bufferedReader;
        String cacheDirPath = this.f36449g.getCacheDirPath();
        if (cacheDirPath == null) {
            this.f36449g.getLogger().mo30214c(EnumC9587s4.INFO, "Cache dir is not set, not finalizing the previous session.", new Object[0]);
            return;
        }
        if (!this.f36449g.isEnableAutoSessionTracking()) {
            this.f36449g.getLogger().mo30214c(EnumC9587s4.DEBUG, "Session tracking is disabled, bailing from previous session finalizer.", new Object[0]);
            return;
        }
        InterfaceC9394r envelopeDiskCache = this.f36449g.getEnvelopeDiskCache();
        if ((envelopeDiskCache instanceof C9393q) && !((C9393q) envelopeDiskCache).m30635G()) {
            this.f36449g.getLogger().mo30214c(EnumC9587s4.WARNING, "Timed out waiting to flush previous session to its own file in session finalizer.", new Object[0]);
            return;
        }
        File fileM30625C = C9393q.m30625C(cacheDirPath);
        InterfaceC9373c2 serializer = this.f36449g.getSerializer();
        if (fileM30625C.exists()) {
            this.f36449g.getLogger().mo30214c(EnumC9587s4.WARNING, "Current session is not ended, we'd need to end it.", new Object[0]);
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileM30625C), f36448f));
            } catch (Throwable th) {
                this.f36449g.getLogger().mo30213b(EnumC9587s4.ERROR, "Error processing previous session.", th);
            }
            try {
                C9422d5 c9422d5 = (C9422d5) serializer.mo30489c(bufferedReader, C9422d5.class);
                if (c9422d5 == null) {
                    this.f36449g.getLogger().mo30214c(EnumC9587s4.ERROR, "Stream from path %s resulted in a null envelope.", fileM30625C.getAbsolutePath());
                } else {
                    File file = new File(this.f36449g.getCacheDirPath(), ".sentry-native/last_crash");
                    Date date = null;
                    if (file.exists()) {
                        this.f36449g.getLogger().mo30214c(EnumC9587s4.INFO, "Crash marker file exists, last Session is gonna be Crashed.", new Object[0]);
                        Date dateM30984a = m30984a(file);
                        if (!file.delete()) {
                            this.f36449g.getLogger().mo30214c(EnumC9587s4.ERROR, "Failed to delete the crash marker file. %s.", file.getAbsolutePath());
                        }
                        c9422d5.m30752p(C9422d5.b.Crashed, null, true);
                        date = dateM30984a;
                    }
                    if (c9422d5.m30743f() == null) {
                        c9422d5.m30741d(date);
                    }
                    this.f36450h.mo31158s(C9449h4.m30830a(serializer, c9422d5, this.f36449g.getSdkVersion()));
                }
                bufferedReader.close();
                if (fileM30625C.delete()) {
                    return;
                }
                this.f36449g.getLogger().mo30214c(EnumC9587s4.WARNING, "Failed to delete the previous session file.", new Object[0]);
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }
}
