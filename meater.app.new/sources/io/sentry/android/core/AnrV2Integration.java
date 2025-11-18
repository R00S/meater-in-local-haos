package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import io.sentry.C9244a1;
import io.sentry.C9471i2;
import io.sentry.C9506l4;
import io.sentry.C9517n1;
import io.sentry.C9583s0;
import io.sentry.C9680x4;
import io.sentry.EnumC9587s4;
import io.sentry.Integration;
import io.sentry.InterfaceC9658v1;
import io.sentry.InterfaceC9670w1;
import io.sentry.android.core.cache.C9270b;
import io.sentry.android.core.internal.threaddump.C9302b;
import io.sentry.android.core.internal.threaddump.C9303c;
import io.sentry.cache.C9393q;
import io.sentry.cache.InterfaceC9394r;
import io.sentry.hints.AbstractC9455e;
import io.sentry.hints.C9451a;
import io.sentry.hints.InterfaceC9452b;
import io.sentry.hints.InterfaceC9454d;
import io.sentry.protocol.C9551j;
import io.sentry.protocol.C9558q;
import io.sentry.protocol.C9564w;
import io.sentry.transport.C9611o;
import io.sentry.transport.InterfaceC9613q;
import io.sentry.util.C9642m;
import io.sentry.util.C9646q;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.ApiStatus;

@SuppressLint({"NewApi"})
/* loaded from: classes2.dex */
public class AnrV2Integration implements Integration, Closeable {

    /* renamed from: f */
    static final long f35774f = TimeUnit.DAYS.toMillis(91);

    /* renamed from: g */
    private final Context f35775g;

    /* renamed from: h */
    private final InterfaceC9613q f35776h;

    /* renamed from: i */
    private SentryAndroidOptions f35777i;

    /* renamed from: io.sentry.android.core.AnrV2Integration$a */
    static class RunnableC9250a implements Runnable {

        /* renamed from: f */
        private final Context f35778f;

        /* renamed from: g */
        private final InterfaceC9658v1 f35779g;

        /* renamed from: h */
        private final SentryAndroidOptions f35780h;

        /* renamed from: i */
        private final long f35781i;

        RunnableC9250a(Context context, InterfaceC9658v1 interfaceC9658v1, SentryAndroidOptions sentryAndroidOptions, InterfaceC9613q interfaceC9613q) {
            this.f35778f = context;
            this.f35779g = interfaceC9658v1;
            this.f35780h = sentryAndroidOptions;
            this.f35781i = interfaceC9613q.mo30147a() - AnrV2Integration.f35774f;
        }

        /* renamed from: a */
        private byte[] m30105a(InputStream inputStream) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i2 = inputStream.read(bArr, 0, 1024);
                    if (i2 == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        return byteArray;
                    }
                    byteArrayOutputStream.write(bArr, 0, i2);
                }
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        }

        /* renamed from: b */
        private C9252c m30106b(ApplicationExitInfo applicationExitInfo, boolean z) {
            try {
                InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
                try {
                    if (traceInputStream == null) {
                        C9252c c9252c = new C9252c(C9252c.a.NO_DUMP);
                        if (traceInputStream != null) {
                            traceInputStream.close();
                        }
                        return c9252c;
                    }
                    byte[] bArrM30105a = m30105a(traceInputStream);
                    traceInputStream.close();
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArrM30105a)));
                        try {
                            List<C9564w> listM30271f = new C9303c(this.f35780h, z).m30271f(C9302b.m30260c(bufferedReader));
                            if (listM30271f.isEmpty()) {
                                C9252c c9252c2 = new C9252c(C9252c.a.ERROR, bArrM30105a);
                                bufferedReader.close();
                                return c9252c2;
                            }
                            C9252c c9252c3 = new C9252c(C9252c.a.DUMP, bArrM30105a, listM30271f);
                            bufferedReader.close();
                            return c9252c3;
                        } catch (Throwable th) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable unused) {
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        this.f35780h.getLogger().mo30213b(EnumC9587s4.WARNING, "Failed to parse ANR thread dump", th2);
                        return new C9252c(C9252c.a.ERROR, bArrM30105a);
                    }
                } catch (Throwable th3) {
                    if (traceInputStream != null) {
                        try {
                            traceInputStream.close();
                        } catch (Throwable unused2) {
                        }
                    }
                    throw th3;
                }
            } catch (Throwable th4) {
                this.f35780h.getLogger().mo30213b(EnumC9587s4.WARNING, "Failed to read ANR thread dump", th4);
                return new C9252c(C9252c.a.NO_DUMP);
            }
        }

        /* renamed from: c */
        private void m30107c(ApplicationExitInfo applicationExitInfo, boolean z) {
            byte[] bArr;
            long timestamp = applicationExitInfo.getTimestamp();
            boolean z2 = applicationExitInfo.getImportance() != 100;
            C9252c c9252cM30106b = m30106b(applicationExitInfo, z2);
            if (c9252cM30106b.f35785a == C9252c.a.NO_DUMP) {
                this.f35780h.getLogger().mo30214c(EnumC9587s4.WARNING, "Not reporting ANR event as there was no thread dump for the ANR %s", applicationExitInfo.toString());
                return;
            }
            C9251b c9251b = new C9251b(this.f35780h.getFlushTimeoutMillis(), this.f35780h.getLogger(), timestamp, z, z2);
            C9517n1 c9517n1M31778a = C9642m.m31778a(c9251b);
            C9506l4 c9506l4 = new C9506l4();
            C9252c.a aVar = c9252cM30106b.f35785a;
            if (aVar == C9252c.a.ERROR) {
                C9551j c9551j = new C9551j();
                c9551j.m31378d("Sentry Android SDK failed to parse system thread dump for this ANR. We recommend enabling [SentryOptions.isAttachAnrThreadDump] option to attach the thread dump as plain text and report this issue on GitHub.");
                c9506l4.m30994A0(c9551j);
            } else if (aVar == C9252c.a.DUMP) {
                c9506l4.m30996C0(c9252cM30106b.f35787c);
            }
            c9506l4.m31011z0(EnumC9587s4.FATAL);
            c9506l4.m30997D0(C9244a1.m30009d(timestamp));
            if (this.f35780h.isAttachAnrThreadDump() && (bArr = c9252cM30106b.f35786b) != null) {
                c9517n1M31778a.m31081l(C9583s0.m31573b(bArr));
            }
            if (this.f35779g.mo31159t(c9506l4, c9517n1M31778a).equals(C9558q.f36725f) || c9251b.mo30477e()) {
                return;
            }
            this.f35780h.getLogger().mo30214c(EnumC9587s4.WARNING, "Timed out waiting to flush ANR event to disk. Event: %s", c9506l4.m30579G());
        }

        /* renamed from: d */
        private void m30108d(List<ApplicationExitInfo> list, Long l) {
            Collections.reverse(list);
            for (ApplicationExitInfo applicationExitInfo : list) {
                if (applicationExitInfo.getReason() == 6) {
                    if (applicationExitInfo.getTimestamp() < this.f35781i) {
                        this.f35780h.getLogger().mo30214c(EnumC9587s4.DEBUG, "ANR happened too long ago %s.", applicationExitInfo);
                    } else if (l == null || applicationExitInfo.getTimestamp() > l.longValue()) {
                        m30107c(applicationExitInfo, false);
                    } else {
                        this.f35780h.getLogger().mo30214c(EnumC9587s4.DEBUG, "ANR has already been reported %s.", applicationExitInfo);
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        @SuppressLint({"NewApi"})
        public void run() {
            ApplicationExitInfo applicationExitInfo = null;
            List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.f35778f.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
            if (historicalProcessExitReasons.size() == 0) {
                this.f35780h.getLogger().mo30214c(EnumC9587s4.DEBUG, "No records in historical exit reasons.", new Object[0]);
                return;
            }
            InterfaceC9394r envelopeDiskCache = this.f35780h.getEnvelopeDiskCache();
            if ((envelopeDiskCache instanceof C9393q) && this.f35780h.isEnableAutoSessionTracking()) {
                C9393q c9393q = (C9393q) envelopeDiskCache;
                if (!c9393q.m30635G()) {
                    this.f35780h.getLogger().mo30214c(EnumC9587s4.WARNING, "Timed out waiting to flush previous session to its own file.", new Object[0]);
                    c9393q.m30637y();
                }
            }
            ArrayList arrayList = new ArrayList(historicalProcessExitReasons);
            Long lM30159U = C9270b.m30159U(this.f35780h);
            Iterator<ApplicationExitInfo> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ApplicationExitInfo next = it.next();
                if (next.getReason() == 6) {
                    arrayList.remove(next);
                    applicationExitInfo = next;
                    break;
                }
            }
            if (applicationExitInfo == null) {
                this.f35780h.getLogger().mo30214c(EnumC9587s4.DEBUG, "No ANRs have been found in the historical exit reasons list.", new Object[0]);
                return;
            }
            if (applicationExitInfo.getTimestamp() < this.f35781i) {
                this.f35780h.getLogger().mo30214c(EnumC9587s4.DEBUG, "Latest ANR happened too long ago, returning early.", new Object[0]);
                return;
            }
            if (lM30159U != null && applicationExitInfo.getTimestamp() <= lM30159U.longValue()) {
                this.f35780h.getLogger().mo30214c(EnumC9587s4.DEBUG, "Latest ANR has already been reported, returning early.", new Object[0]);
                return;
            }
            if (this.f35780h.isReportHistoricalAnrs()) {
                m30108d(arrayList, lM30159U);
            }
            m30107c(applicationExitInfo, true);
        }
    }

    @ApiStatus.Internal
    /* renamed from: io.sentry.android.core.AnrV2Integration$b */
    public static final class C9251b extends AbstractC9455e implements InterfaceC9454d, InterfaceC9452b {

        /* renamed from: d */
        private final long f35782d;

        /* renamed from: e */
        private final boolean f35783e;

        /* renamed from: f */
        private final boolean f35784f;

        public C9251b(long j2, InterfaceC9670w1 interfaceC9670w1, long j3, boolean z, boolean z2) {
            super(j2, interfaceC9670w1);
            this.f35782d = j3;
            this.f35783e = z;
            this.f35784f = z2;
        }

        @Override // io.sentry.hints.InterfaceC9454d
        /* renamed from: a */
        public boolean mo30109a() {
            return this.f35783e;
        }

        @Override // io.sentry.hints.InterfaceC9452b
        /* renamed from: c */
        public Long mo30102c() {
            return Long.valueOf(this.f35782d);
        }

        @Override // io.sentry.hints.InterfaceC9452b
        /* renamed from: d */
        public /* synthetic */ boolean mo30103d() {
            return C9451a.m30834a(this);
        }

        @Override // io.sentry.hints.InterfaceC9452b
        /* renamed from: f */
        public String mo30104f() {
            return this.f35784f ? "anr_background" : "anr_foreground";
        }
    }

    public AnrV2Integration(Context context) {
        this(context, C9611o.m31694b());
    }

    @Override // io.sentry.InterfaceC9490j2
    /* renamed from: a */
    public /* synthetic */ void mo30003a() {
        C9471i2.m30845a(this);
    }

    @Override // io.sentry.Integration
    @SuppressLint({"NewApi"})
    /* renamed from: c */
    public void mo30001c(InterfaceC9658v1 interfaceC9658v1, C9680x4 c9680x4) {
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) C9646q.m31802c(c9680x4 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c9680x4 : null, "SentryAndroidOptions is required");
        this.f35777i = sentryAndroidOptions;
        sentryAndroidOptions.getLogger().mo30214c(EnumC9587s4.DEBUG, "AnrIntegration enabled: %s", Boolean.valueOf(this.f35777i.isAnrEnabled()));
        if (this.f35777i.getCacheDirPath() == null) {
            this.f35777i.getLogger().mo30214c(EnumC9587s4.INFO, "Cache dir is not set, unable to process ANRs", new Object[0]);
            return;
        }
        if (this.f35777i.isAnrEnabled()) {
            try {
                c9680x4.getExecutorService().submit(new RunnableC9250a(this.f35775g, interfaceC9658v1, this.f35777i, this.f35776h));
            } catch (Throwable th) {
                c9680x4.getLogger().mo30213b(EnumC9587s4.DEBUG, "Failed to start AnrProcessor.", th);
            }
            c9680x4.getLogger().mo30214c(EnumC9587s4.DEBUG, "AnrV2Integration installed.", new Object[0]);
            mo30003a();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        SentryAndroidOptions sentryAndroidOptions = this.f35777i;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().mo30214c(EnumC9587s4.DEBUG, "AnrV2Integration removed.", new Object[0]);
        }
    }

    @Override // io.sentry.InterfaceC9490j2
    /* renamed from: d */
    public /* synthetic */ String mo30004d() {
        return C9471i2.m30846b(this);
    }

    AnrV2Integration(Context context, InterfaceC9613q interfaceC9613q) {
        this.f35775g = context;
        this.f35776h = interfaceC9613q;
    }

    /* renamed from: io.sentry.android.core.AnrV2Integration$c */
    static final class C9252c {

        /* renamed from: a */
        final a f35785a;

        /* renamed from: b */
        final byte[] f35786b;

        /* renamed from: c */
        final List<C9564w> f35787c;

        /* renamed from: io.sentry.android.core.AnrV2Integration$c$a */
        enum a {
            DUMP,
            NO_DUMP,
            ERROR
        }

        C9252c(a aVar) {
            this.f35785a = aVar;
            this.f35786b = null;
            this.f35787c = null;
        }

        C9252c(a aVar, byte[] bArr) {
            this.f35785a = aVar;
            this.f35786b = bArr;
            this.f35787c = null;
        }

        C9252c(a aVar, byte[] bArr, List<C9564w> list) {
            this.f35785a = aVar;
            this.f35786b = bArr;
            this.f35787c = list;
        }
    }
}
