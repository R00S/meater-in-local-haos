package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzbtb extends zzbts<zzbtf> {

    /* renamed from: g */
    private final ScheduledExecutorService f23542g;

    /* renamed from: h */
    private final Clock f23543h;

    /* renamed from: i */
    private long f23544i;

    /* renamed from: j */
    private long f23545j;

    /* renamed from: k */
    private boolean f23546k;

    /* renamed from: l */
    private ScheduledFuture<?> f23547l;

    public zzbtb(ScheduledExecutorService scheduledExecutorService, Clock clock) {
        super(Collections.emptySet());
        this.f23544i = -1L;
        this.f23545j = -1L;
        this.f23546k = false;
        this.f23542g = scheduledExecutorService;
        this.f23543h = clock;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g0 */
    public final void m18321g0() {
        m18330T(C6929me.f19913a);
    }

    /* renamed from: o0 */
    private final synchronized void m18322o0(long j2) {
        ScheduledFuture<?> scheduledFuture = this.f23547l;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            this.f23547l.cancel(true);
        }
        this.f23544i = this.f23543h.mo14609b() + j2;
        this.f23547l = this.f23542g.schedule(new RunnableC7003oe(this), j2, TimeUnit.MILLISECONDS);
    }

    /* renamed from: f0 */
    public final synchronized void m18323f0() {
        this.f23546k = false;
        m18322o0(0L);
    }

    /* renamed from: i0 */
    public final synchronized void m18324i0(int i2) {
        if (i2 <= 0) {
            return;
        }
        long millis = TimeUnit.SECONDS.toMillis(i2);
        if (this.f23546k) {
            long j2 = this.f23545j;
            if (j2 <= 0 || millis >= j2) {
                millis = j2;
            }
            this.f23545j = millis;
            return;
        }
        long jMo14609b = this.f23543h.mo14609b();
        long j3 = this.f23544i;
        if (jMo14609b > j3 || j3 - this.f23543h.mo14609b() > millis) {
            m18322o0(millis);
        }
    }

    public final synchronized void onPause() {
        if (!this.f23546k) {
            ScheduledFuture<?> scheduledFuture = this.f23547l;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                this.f23545j = -1L;
            } else {
                this.f23547l.cancel(true);
                this.f23545j = this.f23544i - this.f23543h.mo14609b();
            }
            this.f23546k = true;
        }
    }

    public final synchronized void onResume() {
        if (this.f23546k) {
            if (this.f23545j > 0 && this.f23547l.isCancelled()) {
                m18322o0(this.f23545j);
            }
            this.f23546k = false;
        }
    }
}
