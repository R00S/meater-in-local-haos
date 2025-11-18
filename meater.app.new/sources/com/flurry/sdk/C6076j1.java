package com.flurry.sdk;

import com.flurry.sdk.C6085k1.a;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.flurry.sdk.j1 */
/* loaded from: classes2.dex */
public final class C6076j1 {

    /* renamed from: a */
    private Timer f16010a;

    /* renamed from: b */
    private a f16011b;

    /* renamed from: c */
    C6085k1 f16012c;

    /* renamed from: com.flurry.sdk.j1$a */
    class a extends TimerTask {
        private a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            C6021d1.m13030c(3, "HttpRequestTimeoutTimer", "HttpRequest timed out. Cancelling.");
            C6085k1 c6085k1 = C6076j1.this.f16012c;
            C6021d1.m13030c(3, "HttpStreamRequest", "Timeout (" + (System.currentTimeMillis() - c6085k1.f16064x) + "MS) for url: " + c6085k1.f16052l);
            c6085k1.f16043A = 629;
            c6085k1.f16048F = true;
            c6085k1.m13148c();
            C6021d1.m13030c(3, "HttpStreamRequest", "Cancelling http request: " + c6085k1.f16052l);
            synchronized (c6085k1.f16051k) {
                c6085k1.f16062v = true;
            }
            if (c6085k1.f16061u) {
                return;
            }
            c6085k1.f16061u = true;
            if (c6085k1.f16060t != null) {
                c6085k1.new a().start();
            }
        }

        /* synthetic */ a(C6076j1 c6076j1, byte b2) {
            this();
        }
    }

    public C6076j1(C6085k1 c6085k1) {
        this.f16012c = c6085k1;
    }

    /* renamed from: a */
    public final synchronized void m13124a() {
        Timer timer = this.f16010a;
        if (timer != null) {
            timer.cancel();
            this.f16010a = null;
            C6021d1.m13030c(3, "HttpRequestTimeoutTimer", "HttpRequestTimeoutTimer stopped.");
        }
        this.f16011b = null;
    }

    /* renamed from: b */
    public final synchronized void m13125b(long j2) {
        byte b2 = 0;
        if (this.f16010a != null) {
            m13124a();
        }
        this.f16010a = new Timer("HttpRequestTimeoutTimer");
        a aVar = new a(this, b2);
        this.f16011b = aVar;
        this.f16010a.schedule(aVar, j2);
        C6021d1.m13030c(3, "HttpRequestTimeoutTimer", "HttpRequestTimeoutTimer started: " + j2 + "MS");
    }
}
