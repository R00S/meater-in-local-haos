package io.sentry.android.core.cache;

import io.sentry.C9449h4;
import io.sentry.C9517n1;
import io.sentry.C9680x4;
import io.sentry.EnumC9587s4;
import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.android.core.AnrV2Integration;
import io.sentry.android.core.C9340q0;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.internal.util.C9310g;
import io.sentry.cache.C9393q;
import io.sentry.transport.InterfaceC9613q;
import io.sentry.util.C9641l;
import io.sentry.util.C9642m;
import io.sentry.util.C9646q;
import java.io.File;
import java.io.FileOutputStream;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: AndroidEnvelopeCache.java */
@ApiStatus.Internal
/* renamed from: io.sentry.android.core.cache.b */
/* loaded from: classes2.dex */
public final class C9270b extends C9393q {

    /* renamed from: m */
    private final InterfaceC9613q f35870m;

    public C9270b(SentryAndroidOptions sentryAndroidOptions) {
        this(sentryAndroidOptions, C9310g.m30272b());
    }

    /* renamed from: P */
    public static boolean m30157P(C9680x4 c9680x4) {
        String outboxPath = c9680x4.getOutboxPath();
        if (outboxPath == null) {
            c9680x4.getLogger().mo30214c(EnumC9587s4.DEBUG, "Outbox path is null, the startup crash marker file does not exist", new Object[0]);
            return false;
        }
        File file = new File(outboxPath, "startup_crash");
        try {
            boolean zExists = file.exists();
            if (zExists && !file.delete()) {
                c9680x4.getLogger().mo30214c(EnumC9587s4.ERROR, "Failed to delete the startup crash marker file. %s.", file.getAbsolutePath());
            }
            return zExists;
        } catch (Throwable th) {
            c9680x4.getLogger().mo30213b(EnumC9587s4.ERROR, "Error reading/deleting the startup crash marker file on the disk", th);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m30162S(SentryAndroidOptions sentryAndroidOptions, AnrV2Integration.C9251b c9251b) {
        Long lMo30102c = c9251b.mo30102c();
        sentryAndroidOptions.getLogger().mo30214c(EnumC9587s4.DEBUG, "Writing last reported ANR marker with timestamp %d", lMo30102c);
        m30160V(lMo30102c);
    }

    /* renamed from: U */
    public static Long m30159U(C9680x4 c9680x4) {
        File file = new File((String) C9646q.m31802c(c9680x4.getCacheDirPath(), "Cache dir path should be set for getting ANRs reported"), "last_anr_report");
        try {
        } catch (Throwable th) {
            c9680x4.getLogger().mo30213b(EnumC9587s4.ERROR, "Error reading last ANR marker", th);
        }
        if (!file.exists() || !file.canRead()) {
            c9680x4.getLogger().mo30214c(EnumC9587s4.DEBUG, "Last ANR marker does not exist. %s.", file.getAbsolutePath());
            return null;
        }
        String strM31777c = C9641l.m31777c(file);
        if (strM31777c.equals("null")) {
            return null;
        }
        return Long.valueOf(Long.parseLong(strM31777c.trim()));
    }

    /* renamed from: V */
    private void m30160V(Long l) {
        String cacheDirPath = this.f36230g.getCacheDirPath();
        if (cacheDirPath == null) {
            this.f36230g.getLogger().mo30214c(EnumC9587s4.DEBUG, "Cache dir path is null, the ANR marker will not be written", new Object[0]);
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(cacheDirPath, "last_anr_report"));
            try {
                fileOutputStream.write(String.valueOf(l).getBytes(f36229f));
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
            this.f36230g.getLogger().mo30213b(EnumC9587s4.ERROR, "Error writing the ANR marker to the disk", th2);
        }
    }

    /* renamed from: W */
    private void m30161W() {
        String outboxPath = this.f36230g.getOutboxPath();
        if (outboxPath == null) {
            this.f36230g.getLogger().mo30214c(EnumC9587s4.DEBUG, "Outbox path is null, the startup crash marker file will not be written", new Object[0]);
            return;
        }
        try {
            new File(outboxPath, "startup_crash").createNewFile();
        } catch (Throwable th) {
            this.f36230g.getLogger().mo30213b(EnumC9587s4.ERROR, "Error writing the startup crash marker file to the disk", th);
        }
    }

    @Override // io.sentry.cache.C9393q, io.sentry.cache.InterfaceC9394r
    /* renamed from: Z */
    public void mo30163Z(C9449h4 c9449h4, C9517n1 c9517n1) {
        super.mo30163Z(c9449h4, c9517n1);
        final SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f36230g;
        Long lM30392c = C9340q0.m30389e().m30392c();
        if (C9642m.m31781d(c9517n1, UncaughtExceptionHandlerIntegration.C9241a.class) && lM30392c != null) {
            long jMo30147a = this.f35870m.mo30147a() - lM30392c.longValue();
            if (jMo30147a <= sentryAndroidOptions.getStartupCrashDurationThresholdMillis()) {
                sentryAndroidOptions.getLogger().mo30214c(EnumC9587s4.DEBUG, "Startup Crash detected %d milliseconds after SDK init. Writing a startup crash marker file to disk.", Long.valueOf(jMo30147a));
                m30161W();
            }
        }
        C9642m.m31788k(c9517n1, AnrV2Integration.C9251b.class, new C9642m.a() { // from class: io.sentry.android.core.cache.a
            @Override // io.sentry.util.C9642m.a
            /* renamed from: a */
            public final void mo30156a(Object obj) {
                this.f35868a.m30162S(sentryAndroidOptions, (AnrV2Integration.C9251b) obj);
            }
        });
    }

    C9270b(SentryAndroidOptions sentryAndroidOptions, InterfaceC9613q interfaceC9613q) {
        super(sentryAndroidOptions, (String) C9646q.m31802c(sentryAndroidOptions.getCacheDirPath(), "cacheDirPath must not be null"), sentryAndroidOptions.getMaxCacheItems());
        this.f35870m = interfaceC9613q;
    }
}
