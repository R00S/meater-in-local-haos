package p241e.p307h.p308a;

import android.os.SystemClock;

/* compiled from: DownloadSpeedMonitor.java */
/* renamed from: e.h.a.b */
/* loaded from: classes2.dex */
public class C8993b implements InterfaceC9044s, InterfaceC9043r {

    /* renamed from: a */
    private long f34577a;

    /* renamed from: b */
    private long f34578b;

    /* renamed from: c */
    private long f34579c;

    /* renamed from: d */
    private long f34580d;

    /* renamed from: e */
    private int f34581e;

    /* renamed from: f */
    private int f34582f = 1000;

    @Override // p241e.p307h.p308a.InterfaceC9044s
    /* renamed from: a */
    public void mo28659a() {
        this.f34581e = 0;
        this.f34577a = 0L;
    }

    @Override // p241e.p307h.p308a.InterfaceC9043r
    /* renamed from: c */
    public int mo28660c() {
        return this.f34581e;
    }

    @Override // p241e.p307h.p308a.InterfaceC9044s
    /* renamed from: f */
    public void mo28661f(long j2) {
        if (this.f34580d <= 0) {
            return;
        }
        long j3 = j2 - this.f34579c;
        this.f34577a = 0L;
        long jUptimeMillis = SystemClock.uptimeMillis() - this.f34580d;
        if (jUptimeMillis <= 0) {
            this.f34581e = (int) j3;
        } else {
            this.f34581e = (int) (j3 / jUptimeMillis);
        }
    }

    @Override // p241e.p307h.p308a.InterfaceC9044s
    /* renamed from: g */
    public void mo28662g(long j2) {
        this.f34580d = SystemClock.uptimeMillis();
        this.f34579c = j2;
    }

    @Override // p241e.p307h.p308a.InterfaceC9044s
    /* renamed from: i */
    public void mo28663i(long j2) {
        if (this.f34582f <= 0) {
            return;
        }
        boolean z = true;
        if (this.f34577a != 0) {
            long jUptimeMillis = SystemClock.uptimeMillis() - this.f34577a;
            if (jUptimeMillis >= this.f34582f || (this.f34581e == 0 && jUptimeMillis > 0)) {
                int i2 = (int) ((j2 - this.f34578b) / jUptimeMillis);
                this.f34581e = i2;
                this.f34581e = Math.max(0, i2);
            } else {
                z = false;
            }
        }
        if (z) {
            this.f34578b = j2;
            this.f34577a = SystemClock.uptimeMillis();
        }
    }
}
