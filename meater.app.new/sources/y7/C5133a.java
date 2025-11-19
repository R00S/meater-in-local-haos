package y7;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.util.h;
import com.google.android.gms.common.util.p;
import com.google.android.gms.common.util.r;
import com.google.android.gms.internal.stats.zzi;
import g7.C3445p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-stats@@17.0.1 */
/* renamed from: y7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5133a {

    /* renamed from: r, reason: collision with root package name */
    private static final long f53194r = TimeUnit.DAYS.toMillis(366);

    /* renamed from: s, reason: collision with root package name */
    private static volatile ScheduledExecutorService f53195s = null;

    /* renamed from: t, reason: collision with root package name */
    private static final Object f53196t = new Object();

    /* renamed from: u, reason: collision with root package name */
    private static volatile e f53197u = new C5135c();

    /* renamed from: a, reason: collision with root package name */
    private final Object f53198a;

    /* renamed from: b, reason: collision with root package name */
    private final PowerManager.WakeLock f53199b;

    /* renamed from: c, reason: collision with root package name */
    private int f53200c;

    /* renamed from: d, reason: collision with root package name */
    private Future<?> f53201d;

    /* renamed from: e, reason: collision with root package name */
    private long f53202e;

    /* renamed from: f, reason: collision with root package name */
    private final Set<f> f53203f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f53204g;

    /* renamed from: h, reason: collision with root package name */
    private int f53205h;

    /* renamed from: i, reason: collision with root package name */
    s7.b f53206i;

    /* renamed from: j, reason: collision with root package name */
    private com.google.android.gms.common.util.e f53207j;

    /* renamed from: k, reason: collision with root package name */
    private WorkSource f53208k;

    /* renamed from: l, reason: collision with root package name */
    private final String f53209l;

    /* renamed from: m, reason: collision with root package name */
    private final String f53210m;

    /* renamed from: n, reason: collision with root package name */
    private final Context f53211n;

    /* renamed from: o, reason: collision with root package name */
    private final Map<String, d> f53212o;

    /* renamed from: p, reason: collision with root package name */
    private AtomicInteger f53213p;

    /* renamed from: q, reason: collision with root package name */
    private final ScheduledExecutorService f53214q;

    public C5133a(Context context, int i10, String str) {
        String packageName = context.getPackageName();
        this.f53198a = new Object();
        this.f53200c = 0;
        this.f53203f = new HashSet();
        this.f53204g = true;
        this.f53207j = h.d();
        this.f53212o = new HashMap();
        this.f53213p = new AtomicInteger(0);
        C3445p.l(context, "WakeLock: context must not be null");
        C3445p.f(str, "WakeLock: wakeLockName must not be empty");
        this.f53211n = context.getApplicationContext();
        this.f53210m = str;
        this.f53206i = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f53209l = str;
        } else {
            String strValueOf = String.valueOf(str);
            this.f53209l = strValueOf.length() != 0 ? "*gcore*:".concat(strValueOf) : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new zzi(sb2.toString());
        }
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(i10, str);
        this.f53199b = wakeLockNewWakeLock;
        if (r.c(context)) {
            WorkSource workSourceB = r.b(context, p.a(packageName) ? context.getPackageName() : packageName);
            this.f53208k = workSourceB;
            if (workSourceB != null) {
                i(wakeLockNewWakeLock, workSourceB);
            }
        }
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = f53195s;
        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
            synchronized (f53196t) {
                try {
                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = f53195s;
                    if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                        s7.h.a();
                        scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f53195s = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                    }
                } finally {
                }
            }
        }
        this.f53214q = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }

    public static /* synthetic */ void e(C5133a c5133a) {
        synchronized (c5133a.f53198a) {
            try {
                if (c5133a.b()) {
                    Log.e("WakeLock", String.valueOf(c5133a.f53209l).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                    c5133a.g();
                    if (c5133a.b()) {
                        c5133a.f53200c = 1;
                        c5133a.h(0);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final String f(String str) {
        if (this.f53204g) {
            TextUtils.isEmpty(null);
        }
        return null;
    }

    private final void g() {
        if (this.f53203f.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f53203f);
        this.f53203f.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        throw null;
    }

    private final void h(int i10) {
        synchronized (this.f53198a) {
            try {
                if (b()) {
                    if (this.f53204g) {
                        int i11 = this.f53200c - 1;
                        this.f53200c = i11;
                        if (i11 > 0) {
                            return;
                        }
                    } else {
                        this.f53200c = 0;
                    }
                    g();
                    Iterator<d> it = this.f53212o.values().iterator();
                    while (it.hasNext()) {
                        it.next().f53216a = 0;
                    }
                    this.f53212o.clear();
                    Future<?> future = this.f53201d;
                    if (future != null) {
                        future.cancel(false);
                        this.f53201d = null;
                        this.f53202e = 0L;
                    }
                    this.f53205h = 0;
                    if (this.f53199b.isHeld()) {
                        try {
                            try {
                                this.f53199b.release();
                                if (this.f53206i != null) {
                                    this.f53206i = null;
                                }
                            } catch (RuntimeException e10) {
                                if (!e10.getClass().equals(RuntimeException.class)) {
                                    throw e10;
                                }
                                Log.e("WakeLock", String.valueOf(this.f53209l).concat(" failed to release!"), e10);
                                if (this.f53206i != null) {
                                    this.f53206i = null;
                                }
                            }
                        } catch (Throwable th) {
                            if (this.f53206i != null) {
                                this.f53206i = null;
                            }
                            throw th;
                        }
                    } else {
                        Log.e("WakeLock", String.valueOf(this.f53209l).concat(" should be held!"));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static void i(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e10) {
            Log.wtf("WakeLock", e10.toString());
        }
    }

    public void a(long j10) {
        this.f53213p.incrementAndGet();
        long jMax = Math.max(Math.min(Long.MAX_VALUE, f53194r), 1L);
        if (j10 > 0) {
            jMax = Math.min(j10, jMax);
        }
        synchronized (this.f53198a) {
            try {
                if (!b()) {
                    this.f53206i = s7.b.a(false, null);
                    this.f53199b.acquire();
                    this.f53207j.c();
                }
                this.f53200c++;
                this.f53205h++;
                f(null);
                d dVar = this.f53212o.get(null);
                if (dVar == null) {
                    dVar = new d(null);
                    this.f53212o.put(null, dVar);
                }
                dVar.f53216a++;
                long jC = this.f53207j.c();
                long j11 = Long.MAX_VALUE - jC > jMax ? jC + jMax : Long.MAX_VALUE;
                if (j11 > this.f53202e) {
                    this.f53202e = j11;
                    Future<?> future = this.f53201d;
                    if (future != null) {
                        future.cancel(false);
                    }
                    this.f53201d = this.f53214q.schedule(new Runnable() { // from class: y7.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            C5133a.e(this.f53215B);
                        }
                    }, jMax, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean b() {
        boolean z10;
        synchronized (this.f53198a) {
            z10 = this.f53200c > 0;
        }
        return z10;
    }

    public void c() {
        if (this.f53213p.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f53209l).concat(" release without a matched acquire!"));
        }
        synchronized (this.f53198a) {
            try {
                f(null);
                if (this.f53212o.containsKey(null)) {
                    d dVar = this.f53212o.get(null);
                    if (dVar != null) {
                        int i10 = dVar.f53216a - 1;
                        dVar.f53216a = i10;
                        if (i10 == 0) {
                            this.f53212o.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f53209l).concat(" counter does not exist"));
                }
                h(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(boolean z10) {
        synchronized (this.f53198a) {
            this.f53204g = z10;
        }
    }
}
