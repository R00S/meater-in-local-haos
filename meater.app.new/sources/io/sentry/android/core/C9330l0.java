package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import io.sentry.C9498k3;
import io.sentry.C9671w2;
import io.sentry.C9676x0;
import io.sentry.EnumC9587s4;
import io.sentry.InterfaceC9366b2;
import io.sentry.InterfaceC9670w1;
import io.sentry.android.core.internal.util.C9323t;
import io.sentry.profilemeasurements.C9536a;
import io.sentry.profilemeasurements.C9537b;
import io.sentry.util.C9646q;
import java.io.File;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: AndroidProfiler.java */
@ApiStatus.Internal
/* renamed from: io.sentry.android.core.l0 */
/* loaded from: classes2.dex */
public class C9330l0 {

    /* renamed from: b */
    private final File f36036b;

    /* renamed from: c */
    private final int f36037c;

    /* renamed from: f */
    private String f36040f;

    /* renamed from: h */
    private final C9323t f36042h;

    /* renamed from: m */
    private final C9344s0 f36047m;

    /* renamed from: n */
    private final InterfaceC9366b2 f36048n;

    /* renamed from: o */
    private final InterfaceC9670w1 f36049o;

    /* renamed from: a */
    private long f36035a = 0;

    /* renamed from: d */
    private Future<?> f36038d = null;

    /* renamed from: e */
    private File f36039e = null;

    /* renamed from: g */
    private volatile b f36041g = null;

    /* renamed from: i */
    private final ArrayDeque<C9537b> f36043i = new ArrayDeque<>();

    /* renamed from: j */
    private final ArrayDeque<C9537b> f36044j = new ArrayDeque<>();

    /* renamed from: k */
    private final ArrayDeque<C9537b> f36045k = new ArrayDeque<>();

    /* renamed from: l */
    private final Map<String, C9536a> f36046l = new HashMap();

    /* renamed from: p */
    private boolean f36050p = false;

    /* compiled from: AndroidProfiler.java */
    /* renamed from: io.sentry.android.core.l0$a */
    class a implements C9323t.b {

        /* renamed from: a */
        final long f36051a = TimeUnit.SECONDS.toNanos(1);

        /* renamed from: b */
        final long f36052b = TimeUnit.MILLISECONDS.toNanos(700);

        /* renamed from: c */
        float f36053c = 0.0f;

        a() {
        }

        @Override // io.sentry.android.core.internal.util.C9323t.b
        /* renamed from: a */
        public void mo30322a(long j2, long j3, float f2) {
            long jNanoTime = ((j2 - System.nanoTime()) + SystemClock.elapsedRealtimeNanos()) - C9330l0.this.f36035a;
            if (jNanoTime < 0) {
                return;
            }
            boolean z = ((float) j3) > ((float) this.f36051a) / (f2 - 1.0f);
            float f3 = ((int) (f2 * 100.0f)) / 100.0f;
            if (j3 > this.f36052b) {
                C9330l0.this.f36045k.addLast(new C9537b(Long.valueOf(jNanoTime), Long.valueOf(j3)));
            } else if (z) {
                C9330l0.this.f36044j.addLast(new C9537b(Long.valueOf(jNanoTime), Long.valueOf(j3)));
            }
            if (f3 != this.f36053c) {
                this.f36053c = f3;
                C9330l0.this.f36043i.addLast(new C9537b(Long.valueOf(jNanoTime), Float.valueOf(f3)));
            }
        }
    }

    /* compiled from: AndroidProfiler.java */
    /* renamed from: io.sentry.android.core.l0$b */
    public static class b {

        /* renamed from: a */
        public final long f36055a;

        /* renamed from: b */
        public final long f36056b;

        /* renamed from: c */
        public final File f36057c;

        /* renamed from: d */
        public final Map<String, C9536a> f36058d;

        /* renamed from: e */
        public final boolean f36059e;

        public b(long j2, long j3, boolean z, File file, Map<String, C9536a> map) {
            this.f36055a = j2;
            this.f36057c = file;
            this.f36056b = j3;
            this.f36058d = map;
            this.f36059e = z;
        }
    }

    /* compiled from: AndroidProfiler.java */
    /* renamed from: io.sentry.android.core.l0$c */
    public static class c {

        /* renamed from: a */
        public final long f36060a;

        /* renamed from: b */
        public final long f36061b;

        public c(long j2, long j3) {
            this.f36060a = j2;
            this.f36061b = j3;
        }
    }

    public C9330l0(String str, int i2, C9323t c9323t, InterfaceC9366b2 interfaceC9366b2, InterfaceC9670w1 interfaceC9670w1, C9344s0 c9344s0) {
        this.f36036b = new File((String) C9646q.m31802c(str, "TracesFilesDirPath is required"));
        this.f36037c = i2;
        this.f36049o = (InterfaceC9670w1) C9646q.m31802c(interfaceC9670w1, "Logger is required");
        this.f36048n = (InterfaceC9366b2) C9646q.m31802c(interfaceC9366b2, "ExecutorService is required.");
        this.f36042h = (C9323t) C9646q.m31802c(c9323t, "SentryFrameMetricsCollector is required");
        this.f36047m = (C9344s0) C9646q.m31802c(c9344s0, "The BuildInfoProvider is required.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m30343h() {
        this.f36041g = m30342f(true, null);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: i */
    private void m30340i(List<C9498k3> list) {
        if (this.f36047m.m30406d() < 21) {
            return;
        }
        long jElapsedRealtimeNanos = (SystemClock.elapsedRealtimeNanos() - this.f36035a) - TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        if (list != null) {
            ArrayDeque arrayDeque = new ArrayDeque(list.size());
            ArrayDeque arrayDeque2 = new ArrayDeque(list.size());
            ArrayDeque arrayDeque3 = new ArrayDeque(list.size());
            for (C9498k3 c9498k3 : list) {
                C9676x0 c9676x0M30916c = c9498k3.m30916c();
                C9671w2 c9671w2M30917d = c9498k3.m30917d();
                if (c9676x0M30916c != null) {
                    arrayDeque3.add(new C9537b(Long.valueOf(TimeUnit.MILLISECONDS.toNanos(c9676x0M30916c.m31938b()) + jElapsedRealtimeNanos), Double.valueOf(c9676x0M30916c.m31937a())));
                }
                if (c9671w2M30917d != null && c9671w2M30917d.m31930b() > -1) {
                    arrayDeque.add(new C9537b(Long.valueOf(TimeUnit.MILLISECONDS.toNanos(c9671w2M30917d.m31929a()) + jElapsedRealtimeNanos), Long.valueOf(c9671w2M30917d.m31930b())));
                }
                if (c9671w2M30917d != null && c9671w2M30917d.m31931c() > -1) {
                    arrayDeque2.add(new C9537b(Long.valueOf(TimeUnit.MILLISECONDS.toNanos(c9671w2M30917d.m31929a()) + jElapsedRealtimeNanos), Long.valueOf(c9671w2M30917d.m31931c())));
                }
            }
            if (!arrayDeque3.isEmpty()) {
                this.f36046l.put("cpu_usage", new C9536a("percent", arrayDeque3));
            }
            if (!arrayDeque.isEmpty()) {
                this.f36046l.put("memory_footprint", new C9536a("byte", arrayDeque));
            }
            if (arrayDeque2.isEmpty()) {
                return;
            }
            this.f36046l.put("memory_native_footprint", new C9536a("byte", arrayDeque2));
        }
    }

    /* renamed from: e */
    public synchronized void m30341e() {
        Future<?> future = this.f36038d;
        if (future != null) {
            future.cancel(true);
            this.f36038d = null;
        }
        if (this.f36050p) {
            m30342f(true, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004c A[Catch: all -> 0x00bf, TRY_LEAVE, TryCatch #2 {, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x0009, B:10:0x000f, B:13:0x001c, B:19:0x002b, B:24:0x0039, B:26:0x004c, B:29:0x0059, B:31:0x0061, B:32:0x0071, B:34:0x0079, B:35:0x0089, B:37:0x0091, B:38:0x00a1, B:40:0x00a8, B:41:0x00ae, B:45:0x00bc, B:46:0x00be, B:22:0x002f, B:18:0x0028), top: B:56:0x0001, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0059 A[Catch: all -> 0x00bf, TRY_ENTER, TryCatch #2 {, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x0009, B:10:0x000f, B:13:0x001c, B:19:0x002b, B:24:0x0039, B:26:0x004c, B:29:0x0059, B:31:0x0061, B:32:0x0071, B:34:0x0079, B:35:0x0089, B:37:0x0091, B:38:0x00a1, B:40:0x00a8, B:41:0x00ae, B:45:0x00bc, B:46:0x00be, B:22:0x002f, B:18:0x0028), top: B:56:0x0001, inners: #0, #1 }] */
    @android.annotation.SuppressLint({"NewApi"})
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized io.sentry.android.core.C9330l0.b m30342f(boolean r13, java.util.List<io.sentry.C9498k3> r14) {
        /*
            r12 = this;
            monitor-enter(r12)
            io.sentry.android.core.l0$b r0 = r12.f36041g     // Catch: java.lang.Throwable -> Lbf
            if (r0 == 0) goto L9
            io.sentry.android.core.l0$b r13 = r12.f36041g     // Catch: java.lang.Throwable -> Lbf
            monitor-exit(r12)
            return r13
        L9:
            boolean r0 = r12.f36050p     // Catch: java.lang.Throwable -> Lbf
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L1c
            io.sentry.w1 r13 = r12.f36049o     // Catch: java.lang.Throwable -> Lbf
            io.sentry.s4 r14 = io.sentry.EnumC9587s4.WARNING     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r0 = "Profiler not running"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> Lbf
            r13.mo30214c(r14, r0, r2)     // Catch: java.lang.Throwable -> Lbf
            monitor-exit(r12)
            return r1
        L1c:
            io.sentry.android.core.s0 r0 = r12.f36047m     // Catch: java.lang.Throwable -> Lbf
            int r0 = r0.m30406d()     // Catch: java.lang.Throwable -> Lbf
            r3 = 21
            if (r0 >= r3) goto L28
            monitor-exit(r12)
            return r1
        L28:
            android.os.Debug.stopMethodTracing()     // Catch: java.lang.Throwable -> L2e
        L2b:
            r12.f36050p = r2     // Catch: java.lang.Throwable -> Lbf
            goto L39
        L2e:
            r0 = move-exception
            io.sentry.w1 r3 = r12.f36049o     // Catch: java.lang.Throwable -> Lbb
            io.sentry.s4 r4 = io.sentry.EnumC9587s4.ERROR     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r5 = "Error while stopping profiling: "
            r3.mo30213b(r4, r5, r0)     // Catch: java.lang.Throwable -> Lbb
            goto L2b
        L39:
            io.sentry.android.core.internal.util.t r0 = r12.f36042h     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r3 = r12.f36040f     // Catch: java.lang.Throwable -> Lbf
            r0.m30319j(r3)     // Catch: java.lang.Throwable -> Lbf
            long r5 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch: java.lang.Throwable -> Lbf
            long r7 = android.os.Process.getElapsedCpuTime()     // Catch: java.lang.Throwable -> Lbf
            java.io.File r0 = r12.f36039e     // Catch: java.lang.Throwable -> Lbf
            if (r0 != 0) goto L59
            io.sentry.w1 r13 = r12.f36049o     // Catch: java.lang.Throwable -> Lbf
            io.sentry.s4 r14 = io.sentry.EnumC9587s4.ERROR     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r0 = "Trace file does not exists"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> Lbf
            r13.mo30214c(r14, r0, r2)     // Catch: java.lang.Throwable -> Lbf
            monitor-exit(r12)
            return r1
        L59:
            java.util.ArrayDeque<io.sentry.profilemeasurements.b> r0 = r12.f36044j     // Catch: java.lang.Throwable -> Lbf
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> Lbf
            if (r0 != 0) goto L71
            java.util.Map<java.lang.String, io.sentry.profilemeasurements.a> r0 = r12.f36046l     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r2 = "slow_frame_renders"
            io.sentry.profilemeasurements.a r3 = new io.sentry.profilemeasurements.a     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r4 = "nanosecond"
            java.util.ArrayDeque<io.sentry.profilemeasurements.b> r9 = r12.f36044j     // Catch: java.lang.Throwable -> Lbf
            r3.<init>(r4, r9)     // Catch: java.lang.Throwable -> Lbf
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> Lbf
        L71:
            java.util.ArrayDeque<io.sentry.profilemeasurements.b> r0 = r12.f36045k     // Catch: java.lang.Throwable -> Lbf
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> Lbf
            if (r0 != 0) goto L89
            java.util.Map<java.lang.String, io.sentry.profilemeasurements.a> r0 = r12.f36046l     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r2 = "frozen_frame_renders"
            io.sentry.profilemeasurements.a r3 = new io.sentry.profilemeasurements.a     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r4 = "nanosecond"
            java.util.ArrayDeque<io.sentry.profilemeasurements.b> r9 = r12.f36045k     // Catch: java.lang.Throwable -> Lbf
            r3.<init>(r4, r9)     // Catch: java.lang.Throwable -> Lbf
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> Lbf
        L89:
            java.util.ArrayDeque<io.sentry.profilemeasurements.b> r0 = r12.f36043i     // Catch: java.lang.Throwable -> Lbf
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> Lbf
            if (r0 != 0) goto La1
            java.util.Map<java.lang.String, io.sentry.profilemeasurements.a> r0 = r12.f36046l     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r2 = "screen_frame_rates"
            io.sentry.profilemeasurements.a r3 = new io.sentry.profilemeasurements.a     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r4 = "hz"
            java.util.ArrayDeque<io.sentry.profilemeasurements.b> r9 = r12.f36043i     // Catch: java.lang.Throwable -> Lbf
            r3.<init>(r4, r9)     // Catch: java.lang.Throwable -> Lbf
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> Lbf
        La1:
            r12.m30340i(r14)     // Catch: java.lang.Throwable -> Lbf
            java.util.concurrent.Future<?> r14 = r12.f36038d     // Catch: java.lang.Throwable -> Lbf
            if (r14 == 0) goto Lae
            r0 = 1
            r14.cancel(r0)     // Catch: java.lang.Throwable -> Lbf
            r12.f36038d = r1     // Catch: java.lang.Throwable -> Lbf
        Lae:
            io.sentry.android.core.l0$b r14 = new io.sentry.android.core.l0$b     // Catch: java.lang.Throwable -> Lbf
            java.io.File r10 = r12.f36039e     // Catch: java.lang.Throwable -> Lbf
            java.util.Map<java.lang.String, io.sentry.profilemeasurements.a> r11 = r12.f36046l     // Catch: java.lang.Throwable -> Lbf
            r4 = r14
            r9 = r13
            r4.<init>(r5, r7, r9, r10, r11)     // Catch: java.lang.Throwable -> Lbf
            monitor-exit(r12)
            return r14
        Lbb:
            r13 = move-exception
            r12.f36050p = r2     // Catch: java.lang.Throwable -> Lbf
            throw r13     // Catch: java.lang.Throwable -> Lbf
        Lbf:
            r13 = move-exception
            monitor-exit(r12)
            goto Lc3
        Lc2:
            throw r13
        Lc3:
            goto Lc2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.C9330l0.m30342f(boolean, java.util.List):io.sentry.android.core.l0$b");
    }

    @SuppressLint({"NewApi"})
    /* renamed from: j */
    public synchronized c m30344j() {
        int i2 = this.f36037c;
        if (i2 == 0) {
            this.f36049o.mo30214c(EnumC9587s4.WARNING, "Disabling profiling because intervaUs is set to %d", Integer.valueOf(i2));
            return null;
        }
        if (this.f36050p) {
            this.f36049o.mo30214c(EnumC9587s4.WARNING, "Profiling has already started...", new Object[0]);
            return null;
        }
        if (this.f36047m.m30406d() < 21) {
            return null;
        }
        this.f36039e = new File(this.f36036b, UUID.randomUUID() + ".trace");
        this.f36046l.clear();
        this.f36043i.clear();
        this.f36044j.clear();
        this.f36045k.clear();
        this.f36040f = this.f36042h.m30318i(new a());
        try {
            this.f36038d = this.f36048n.mo30030b(new Runnable() { // from class: io.sentry.android.core.t
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36101f.m30343h();
                }
            }, 30000L);
        } catch (RejectedExecutionException e2) {
            this.f36049o.mo30213b(EnumC9587s4.ERROR, "Failed to call the executor. Profiling will not be automatically finished. Did you call Sentry.close()?", e2);
        }
        this.f36035a = SystemClock.elapsedRealtimeNanos();
        long elapsedCpuTime = Process.getElapsedCpuTime();
        try {
            Debug.startMethodTracingSampling(this.f36039e.getPath(), 3000000, this.f36037c);
            this.f36050p = true;
            return new c(this.f36035a, elapsedCpuTime);
        } catch (Throwable th) {
            m30342f(false, null);
            this.f36049o.mo30213b(EnumC9587s4.ERROR, "Unable to start a profile: ", th);
            this.f36050p = false;
            return null;
        }
    }
}
