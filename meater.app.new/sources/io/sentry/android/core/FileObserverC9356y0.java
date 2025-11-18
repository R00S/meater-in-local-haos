package io.sentry.android.core;

import android.os.FileObserver;
import io.sentry.C9517n1;
import io.sentry.EnumC9587s4;
import io.sentry.InterfaceC9591t1;
import io.sentry.InterfaceC9670w1;
import io.sentry.hints.InterfaceC9453c;
import io.sentry.hints.InterfaceC9456f;
import io.sentry.hints.InterfaceC9459i;
import io.sentry.hints.InterfaceC9460j;
import io.sentry.hints.InterfaceC9461k;
import io.sentry.hints.InterfaceC9466p;
import io.sentry.util.C9642m;
import io.sentry.util.C9646q;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: EnvelopeFileObserver.java */
/* renamed from: io.sentry.android.core.y0 */
/* loaded from: classes2.dex */
final class FileObserverC9356y0 extends FileObserver {

    /* renamed from: a */
    private final String f36129a;

    /* renamed from: b */
    private final InterfaceC9591t1 f36130b;

    /* renamed from: c */
    private final InterfaceC9670w1 f36131c;

    /* renamed from: d */
    private final long f36132d;

    /* compiled from: EnvelopeFileObserver.java */
    /* renamed from: io.sentry.android.core.y0$a */
    private static final class a implements InterfaceC9456f, InterfaceC9461k, InterfaceC9466p, InterfaceC9459i, InterfaceC9453c, InterfaceC9460j {

        /* renamed from: a */
        boolean f36133a;

        /* renamed from: b */
        boolean f36134b;

        /* renamed from: c */
        private CountDownLatch f36135c;

        /* renamed from: d */
        private final long f36136d;

        /* renamed from: e */
        private final InterfaceC9670w1 f36137e;

        public a(long j2, InterfaceC9670w1 interfaceC9670w1) {
            mo30473a();
            this.f36136d = j2;
            this.f36137e = (InterfaceC9670w1) C9646q.m31802c(interfaceC9670w1, "ILogger is required.");
        }

        @Override // io.sentry.hints.InterfaceC9460j
        /* renamed from: a */
        public void mo30473a() {
            this.f36135c = new CountDownLatch(1);
            this.f36133a = false;
            this.f36134b = false;
        }

        @Override // io.sentry.hints.InterfaceC9461k
        /* renamed from: b */
        public boolean mo30474b() {
            return this.f36133a;
        }

        @Override // io.sentry.hints.InterfaceC9466p
        /* renamed from: c */
        public void mo30475c(boolean z) {
            this.f36134b = z;
            this.f36135c.countDown();
        }

        @Override // io.sentry.hints.InterfaceC9461k
        /* renamed from: d */
        public void mo30476d(boolean z) {
            this.f36133a = z;
        }

        @Override // io.sentry.hints.InterfaceC9459i
        /* renamed from: e */
        public boolean mo30477e() {
            try {
                return this.f36135c.await(this.f36136d, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                this.f36137e.mo30213b(EnumC9587s4.ERROR, "Exception while awaiting on lock.", e2);
                return false;
            }
        }

        @Override // io.sentry.hints.InterfaceC9466p
        /* renamed from: f */
        public boolean mo30478f() {
            return this.f36134b;
        }
    }

    FileObserverC9356y0(String str, InterfaceC9591t1 interfaceC9591t1, InterfaceC9670w1 interfaceC9670w1, long j2) {
        super(str);
        this.f36129a = str;
        this.f36130b = (InterfaceC9591t1) C9646q.m31802c(interfaceC9591t1, "Envelope sender is required.");
        this.f36131c = (InterfaceC9670w1) C9646q.m31802c(interfaceC9670w1, "Logger is required.");
        this.f36132d = j2;
    }

    @Override // android.os.FileObserver
    public void onEvent(int i2, String str) {
        if (str == null || i2 != 8) {
            return;
        }
        this.f36131c.mo30214c(EnumC9587s4.DEBUG, "onEvent fired for EnvelopeFileObserver with event type %d on path: %s for file %s.", Integer.valueOf(i2), this.f36129a, str);
        C9517n1 c9517n1M31778a = C9642m.m31778a(new a(this.f36132d, this.f36131c));
        this.f36130b.mo30841a(this.f36129a + File.separator + str, c9517n1M31778a);
    }
}
