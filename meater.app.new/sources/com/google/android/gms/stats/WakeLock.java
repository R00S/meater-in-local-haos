package com.google.android.gms.stats;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.providers.PooledExecutorsProvider;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.common.util.WorkSourceUtil;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

@ShowFirstParty
@KeepForSdk
/* loaded from: classes2.dex */
public class WakeLock {

    /* renamed from: a */
    private static ScheduledExecutorService f29496a;

    /* renamed from: b */
    private static volatile zza f29497b = new C7892a();

    /* renamed from: c */
    private final Object f29498c;

    /* renamed from: d */
    private final PowerManager.WakeLock f29499d;

    /* renamed from: e */
    private WorkSource f29500e;

    /* renamed from: f */
    private final int f29501f;

    /* renamed from: g */
    private final String f29502g;

    /* renamed from: h */
    private final String f29503h;

    /* renamed from: i */
    private final String f29504i;

    /* renamed from: j */
    private final Context f29505j;

    /* renamed from: k */
    private boolean f29506k;

    /* renamed from: l */
    private final Map<String, Integer[]> f29507l;

    /* renamed from: m */
    private final Set<Future<?>> f29508m;

    /* renamed from: n */
    private int f29509n;

    /* renamed from: o */
    private AtomicInteger f29510o;

    public interface zza {
    }

    @KeepForSdk
    public WakeLock(Context context, int i2, String str) {
        this(context, i2, str, null, context == null ? null : context.getPackageName());
    }

    /* renamed from: d */
    private final String m23627d(String str) {
        return (!this.f29506k || TextUtils.isEmpty(str)) ? this.f29503h : str;
    }

    /* renamed from: e */
    private final List<String> m23628e() {
        return WorkSourceUtil.m14661d(this.f29500e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public final void m23629f(int i2) {
        if (this.f29499d.isHeld()) {
            try {
                this.f29499d.release();
            } catch (RuntimeException e2) {
                if (!e2.getClass().equals(RuntimeException.class)) {
                    throw e2;
                }
                Log.e("WakeLock", String.valueOf(this.f29502g).concat(" was already released!"), e2);
            }
            this.f29499d.isHeld();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0056 A[Catch: all -> 0x0096, TryCatch #0 {, blocks: (B:4:0x000d, B:6:0x0016, B:11:0x0029, B:13:0x002e, B:15:0x0038, B:22:0x005e, B:23:0x007d, B:16:0x0047, B:18:0x0056, B:20:0x005a, B:8:0x001a, B:10:0x0022), top: B:31:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e A[Catch: all -> 0x0096, TryCatch #0 {, blocks: (B:4:0x000d, B:6:0x0016, B:11:0x0029, B:13:0x002e, B:15:0x0038, B:22:0x005e, B:23:0x007d, B:16:0x0047, B:18:0x0056, B:20:0x005a, B:8:0x001a, B:10:0x0022), top: B:31:0x000d }] */
    @com.google.android.gms.common.annotation.KeepForSdk
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m23631a(long r14) {
        /*
            r13 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r13.f29510o
            r0.incrementAndGet()
            r0 = 0
            java.lang.String r6 = r13.m23627d(r0)
            java.lang.Object r0 = r13.f29498c
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.f29507l     // Catch: java.lang.Throwable -> L96
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L96
            r2 = 0
            if (r1 == 0) goto L1a
            int r1 = r13.f29509n     // Catch: java.lang.Throwable -> L96
            if (r1 <= 0) goto L29
        L1a:
            android.os.PowerManager$WakeLock r1 = r13.f29499d     // Catch: java.lang.Throwable -> L96
            boolean r1 = r1.isHeld()     // Catch: java.lang.Throwable -> L96
            if (r1 != 0) goto L29
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.f29507l     // Catch: java.lang.Throwable -> L96
            r1.clear()     // Catch: java.lang.Throwable -> L96
            r13.f29509n = r2     // Catch: java.lang.Throwable -> L96
        L29:
            boolean r1 = r13.f29506k     // Catch: java.lang.Throwable -> L96
            r12 = 1
            if (r1 == 0) goto L56
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.f29507l     // Catch: java.lang.Throwable -> L96
            java.lang.Object r1 = r1.get(r6)     // Catch: java.lang.Throwable -> L96
            java.lang.Integer[] r1 = (java.lang.Integer[]) r1     // Catch: java.lang.Throwable -> L96
            if (r1 != 0) goto L47
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.f29507l     // Catch: java.lang.Throwable -> L96
            java.lang.Integer[] r3 = new java.lang.Integer[r12]     // Catch: java.lang.Throwable -> L96
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> L96
            r3[r2] = r4     // Catch: java.lang.Throwable -> L96
            r1.put(r6, r3)     // Catch: java.lang.Throwable -> L96
            r2 = 1
            goto L54
        L47:
            r3 = r1[r2]     // Catch: java.lang.Throwable -> L96
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L96
            int r3 = r3 + r12
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L96
            r1[r2] = r3     // Catch: java.lang.Throwable -> L96
        L54:
            if (r2 != 0) goto L5e
        L56:
            boolean r1 = r13.f29506k     // Catch: java.lang.Throwable -> L96
            if (r1 != 0) goto L7d
            int r1 = r13.f29509n     // Catch: java.lang.Throwable -> L96
            if (r1 != 0) goto L7d
        L5e:
            com.google.android.gms.common.stats.WakeLockTracker r1 = com.google.android.gms.common.stats.WakeLockTracker.m14588a()     // Catch: java.lang.Throwable -> L96
            android.content.Context r2 = r13.f29505j     // Catch: java.lang.Throwable -> L96
            android.os.PowerManager$WakeLock r3 = r13.f29499d     // Catch: java.lang.Throwable -> L96
            java.lang.String r3 = com.google.android.gms.common.stats.StatsUtils.m14587a(r3, r6)     // Catch: java.lang.Throwable -> L96
            r4 = 7
            java.lang.String r5 = r13.f29502g     // Catch: java.lang.Throwable -> L96
            r7 = 0
            int r8 = r13.f29501f     // Catch: java.lang.Throwable -> L96
            java.util.List r9 = r13.m23628e()     // Catch: java.lang.Throwable -> L96
            r10 = r14
            r1.m14590c(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L96
            int r1 = r13.f29509n     // Catch: java.lang.Throwable -> L96
            int r1 = r1 + r12
            r13.f29509n = r1     // Catch: java.lang.Throwable -> L96
        L7d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L96
            android.os.PowerManager$WakeLock r0 = r13.f29499d
            r0.acquire()
            r0 = 0
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r2 <= 0) goto L95
            java.util.concurrent.ScheduledExecutorService r0 = com.google.android.gms.stats.WakeLock.f29496a
            com.google.android.gms.stats.b r1 = new com.google.android.gms.stats.b
            r1.<init>(r13)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.schedule(r1, r14, r2)
        L95:
            return
        L96:
            r14 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L96
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.stats.WakeLock.m23631a(long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0052 A[Catch: all -> 0x007e, TryCatch #0 {, blocks: (B:7:0x0021, B:9:0x0027, B:21:0x005a, B:22:0x0079, B:12:0x0033, B:14:0x003b, B:15:0x0042, B:17:0x0052, B:19:0x0056), top: B:30:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a A[Catch: all -> 0x007e, TryCatch #0 {, blocks: (B:7:0x0021, B:9:0x0027, B:21:0x005a, B:22:0x0079, B:12:0x0033, B:14:0x003b, B:15:0x0042, B:17:0x0052, B:19:0x0056), top: B:30:0x0021 }] */
    @com.google.android.gms.common.annotation.KeepForSdk
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m23632b() {
        /*
            r12 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r12.f29510o
            int r0 = r0.decrementAndGet()
            if (r0 >= 0) goto L19
            java.lang.String r0 = "WakeLock"
            java.lang.String r1 = r12.f29502g
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = " release without a matched acquire!"
            java.lang.String r1 = r1.concat(r2)
            android.util.Log.e(r0, r1)
        L19:
            r0 = 0
            java.lang.String r6 = r12.m23627d(r0)
            java.lang.Object r0 = r12.f29498c
            monitor-enter(r0)
            boolean r1 = r12.f29506k     // Catch: java.lang.Throwable -> L7e
            r10 = 1
            r11 = 0
            if (r1 == 0) goto L52
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r12.f29507l     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r1 = r1.get(r6)     // Catch: java.lang.Throwable -> L7e
            java.lang.Integer[] r1 = (java.lang.Integer[]) r1     // Catch: java.lang.Throwable -> L7e
            if (r1 != 0) goto L33
        L31:
            r1 = 0
            goto L50
        L33:
            r2 = r1[r11]     // Catch: java.lang.Throwable -> L7e
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L7e
            if (r2 != r10) goto L42
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r12.f29507l     // Catch: java.lang.Throwable -> L7e
            r1.remove(r6)     // Catch: java.lang.Throwable -> L7e
            r1 = 1
            goto L50
        L42:
            r2 = r1[r11]     // Catch: java.lang.Throwable -> L7e
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L7e
            int r2 = r2 - r10
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L7e
            r1[r11] = r2     // Catch: java.lang.Throwable -> L7e
            goto L31
        L50:
            if (r1 != 0) goto L5a
        L52:
            boolean r1 = r12.f29506k     // Catch: java.lang.Throwable -> L7e
            if (r1 != 0) goto L79
            int r1 = r12.f29509n     // Catch: java.lang.Throwable -> L7e
            if (r1 != r10) goto L79
        L5a:
            com.google.android.gms.common.stats.WakeLockTracker r1 = com.google.android.gms.common.stats.WakeLockTracker.m14588a()     // Catch: java.lang.Throwable -> L7e
            android.content.Context r2 = r12.f29505j     // Catch: java.lang.Throwable -> L7e
            android.os.PowerManager$WakeLock r3 = r12.f29499d     // Catch: java.lang.Throwable -> L7e
            java.lang.String r3 = com.google.android.gms.common.stats.StatsUtils.m14587a(r3, r6)     // Catch: java.lang.Throwable -> L7e
            r4 = 8
            java.lang.String r5 = r12.f29502g     // Catch: java.lang.Throwable -> L7e
            r7 = 0
            int r8 = r12.f29501f     // Catch: java.lang.Throwable -> L7e
            java.util.List r9 = r12.m23628e()     // Catch: java.lang.Throwable -> L7e
            r1.m14589b(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L7e
            int r1 = r12.f29509n     // Catch: java.lang.Throwable -> L7e
            int r1 = r1 - r10
            r12.f29509n = r1     // Catch: java.lang.Throwable -> L7e
        L79:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7e
            r12.m23629f(r11)
            return
        L7e:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7e
            goto L82
        L81:
            throw r1
        L82:
            goto L81
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.stats.WakeLock.m23632b():void");
    }

    @KeepForSdk
    /* renamed from: c */
    public void m23633c(boolean z) {
        this.f29499d.setReferenceCounted(z);
        this.f29506k = z;
    }

    private WakeLock(Context context, int i2, String str, String str2, String str3) {
        this(context, i2, str, null, str3, null);
    }

    @SuppressLint({"UnwrappedWakeLock"})
    private WakeLock(Context context, int i2, String str, String str2, String str3, String str4) {
        this.f29498c = this;
        this.f29506k = true;
        this.f29507l = new HashMap();
        this.f29508m = Collections.synchronizedSet(new HashSet());
        this.f29510o = new AtomicInteger(0);
        Preconditions.m14373l(context, "WakeLock: context must not be null");
        Preconditions.m14369h(str, "WakeLock: wakeLockName must not be empty");
        this.f29501f = i2;
        this.f29503h = null;
        this.f29504i = null;
        Context applicationContext = context.getApplicationContext();
        this.f29505j = applicationContext;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            String strValueOf = String.valueOf(str);
            this.f29502g = strValueOf.length() != 0 ? "*gcore*:".concat(strValueOf) : new String("*gcore*:");
        } else {
            this.f29502g = str;
        }
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(i2, str);
        this.f29499d = wakeLockNewWakeLock;
        if (WorkSourceUtil.m14662e(context)) {
            WorkSource workSourceM14659b = WorkSourceUtil.m14659b(context, Strings.m14655a(str3) ? context.getPackageName() : str3);
            this.f29500e = workSourceM14659b;
            if (workSourceM14659b != null && WorkSourceUtil.m14662e(applicationContext)) {
                WorkSource workSource = this.f29500e;
                if (workSource != null) {
                    workSource.add(workSourceM14659b);
                } else {
                    this.f29500e = workSourceM14659b;
                }
                try {
                    wakeLockNewWakeLock.setWorkSource(this.f29500e);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e2) {
                    Log.wtf("WakeLock", e2.toString());
                }
            }
        }
        if (f29496a == null) {
            f29496a = PooledExecutorsProvider.m14544a().mo14545a();
        }
    }
}
