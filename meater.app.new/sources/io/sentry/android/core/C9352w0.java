package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.StatFs;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import io.sentry.C9244a1;
import io.sentry.EnumC9587s4;
import io.sentry.android.core.C9346t0;
import io.sentry.android.core.internal.util.C9314k;
import io.sentry.android.core.internal.util.C9316m;
import io.sentry.android.core.internal.util.C9318o;
import io.sentry.android.core.internal.util.C9321r;
import io.sentry.protocol.C9546e;
import io.sentry.protocol.C9552k;
import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: DeviceInfoUtil.java */
@ApiStatus.Internal
/* renamed from: io.sentry.android.core.w0 */
/* loaded from: classes2.dex */
public final class C9352w0 {

    /* renamed from: a */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile C9352w0 f36115a;

    /* renamed from: b */
    private final Context f36116b;

    /* renamed from: c */
    private final SentryAndroidOptions f36117c;

    /* renamed from: d */
    private final C9344s0 f36118d;

    /* renamed from: e */
    private final Boolean f36119e;

    /* renamed from: f */
    private final C9346t0.a f36120f;

    /* renamed from: g */
    private final C9552k f36121g;

    /* renamed from: h */
    private final Long f36122h;

    /* compiled from: DeviceInfoUtil.java */
    /* renamed from: io.sentry.android.core.w0$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f36123a;

        static {
            int[] iArr = new int[C9314k.a.values().length];
            f36123a = iArr;
            try {
                iArr[C9314k.a.NOT_CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36123a[C9314k.a.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C9352w0(Context context, SentryAndroidOptions sentryAndroidOptions) {
        this.f36116b = context;
        this.f36117c = sentryAndroidOptions;
        C9344s0 c9344s0 = new C9344s0(sentryAndroidOptions.getLogger());
        this.f36118d = c9344s0;
        C9316m.m30288a().m30290c();
        this.f36121g = m30469B();
        this.f36119e = c9344s0.m30408f();
        this.f36120f = C9346t0.m30424p(context, sentryAndroidOptions.getLogger(), c9344s0);
        ActivityManager.MemoryInfo memoryInfoM30416h = C9346t0.m30416h(context, sentryAndroidOptions.getLogger());
        if (memoryInfoM30416h != null) {
            this.f36122h = m30461q(memoryInfoM30416h);
        } else {
            this.f36122h = null;
        }
    }

    /* renamed from: A */
    private boolean m30444A() {
        String externalStorageState = Environment.getExternalStorageState();
        return ("mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState)) && !Environment.isExternalStorageEmulated();
    }

    /* renamed from: C */
    private void m30445C(C9546e c9546e, boolean z) {
        Intent intentM30448d = m30448d();
        if (intentM30448d != null) {
            c9546e.m31311N(m30449e(intentM30448d));
            c9546e.m31315R(m30468z(intentM30448d));
            c9546e.m31312O(m30450f(intentM30448d));
        }
        int i2 = a.f36123a[C9314k.m30281b(this.f36116b, this.f36117c.getLogger()).ordinal()];
        c9546e.m31331h0(i2 != 1 ? i2 != 2 ? null : Boolean.TRUE : Boolean.FALSE);
        ActivityManager.MemoryInfo memoryInfoM30416h = C9346t0.m30416h(this.f36116b, this.f36117c.getLogger());
        if (memoryInfoM30416h != null && z) {
            c9546e.m31320W(Long.valueOf(memoryInfoM30416h.availMem));
            c9546e.m31325b0(Boolean.valueOf(memoryInfoM30416h.lowMemory));
        }
        File externalFilesDir = this.f36116b.getExternalFilesDir(null);
        if (externalFilesDir != null) {
            StatFs statFs = new StatFs(externalFilesDir.getPath());
            c9546e.m31340q0(m30465w(statFs));
            c9546e.m31321X(m30467y(statFs));
        }
        StatFs statFsM30459o = m30459o(externalFilesDir);
        if (statFsM30459o != null) {
            c9546e.m31318U(m30464v(statFsM30459o));
            c9546e.m31317T(m30466x(statFsM30459o));
        }
        if (c9546e.m31306I() == null) {
            c9546e.m31316S(C9314k.m30282c(this.f36116b, this.f36117c.getLogger(), this.f36118d));
        }
    }

    /* renamed from: b */
    private int m30446b(StatFs statFs) {
        return statFs.getAvailableBlocks();
    }

    /* renamed from: c */
    private long m30447c(StatFs statFs) {
        return this.f36118d.m30406d() >= 18 ? statFs.getAvailableBlocksLong() : m30446b(statFs);
    }

    /* renamed from: d */
    private Intent m30448d() {
        return C9346t0.m30423o(this.f36116b, this.f36118d, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    }

    /* renamed from: e */
    private Float m30449e(Intent intent) {
        try {
            int intExtra = intent.getIntExtra("level", -1);
            int intExtra2 = intent.getIntExtra("scale", -1);
            if (intExtra != -1 && intExtra2 != -1) {
                return Float.valueOf((intExtra / intExtra2) * 100.0f);
            }
            return null;
        } catch (Throwable th) {
            this.f36117c.getLogger().mo30213b(EnumC9587s4.ERROR, "Error getting device battery level.", th);
            return null;
        }
    }

    /* renamed from: f */
    private Float m30450f(Intent intent) {
        try {
            int intExtra = intent.getIntExtra("temperature", -1);
            if (intExtra != -1) {
                return Float.valueOf(intExtra / 10.0f);
            }
            return null;
        } catch (Throwable th) {
            this.f36117c.getLogger().mo30213b(EnumC9587s4.ERROR, "Error getting battery temperature.", th);
            return null;
        }
    }

    /* renamed from: g */
    private int m30451g(StatFs statFs) {
        return statFs.getBlockCount();
    }

    /* renamed from: h */
    private long m30452h(StatFs statFs) {
        return this.f36118d.m30406d() >= 18 ? statFs.getBlockCountLong() : m30451g(statFs);
    }

    /* renamed from: i */
    private int m30453i(StatFs statFs) {
        return statFs.getBlockSize();
    }

    /* renamed from: j */
    private long m30454j(StatFs statFs) {
        return this.f36118d.m30406d() >= 18 ? statFs.getBlockSizeLong() : m30453i(statFs);
    }

    /* renamed from: k */
    private Date m30455k() {
        try {
            return C9244a1.m30009d(System.currentTimeMillis() - SystemClock.elapsedRealtime());
        } catch (IllegalArgumentException e2) {
            this.f36117c.getLogger().mo30212a(EnumC9587s4.ERROR, e2, "Error getting the device's boot time.", new Object[0]);
            return null;
        }
    }

    /* renamed from: l */
    private String m30456l() {
        try {
            return C9262a1.m30148a(this.f36116b);
        } catch (Throwable th) {
            this.f36117c.getLogger().mo30213b(EnumC9587s4.ERROR, "Error getting installationId.", th);
            return null;
        }
    }

    /* renamed from: m */
    private File[] m30457m() {
        if (this.f36118d.m30406d() >= 19) {
            return this.f36116b.getExternalFilesDirs(null);
        }
        File externalFilesDir = this.f36116b.getExternalFilesDir(null);
        if (externalFilesDir != null) {
            return new File[]{externalFilesDir};
        }
        return null;
    }

    /* renamed from: n */
    private File m30458n(File file) {
        File[] fileArrM30457m = m30457m();
        if (fileArrM30457m != null) {
            String absolutePath = file != null ? file.getAbsolutePath() : null;
            for (File file2 : fileArrM30457m) {
                if (file2 != null && (absolutePath == null || absolutePath.isEmpty() || !file2.getAbsolutePath().contains(absolutePath))) {
                    return file2;
                }
            }
        } else {
            this.f36117c.getLogger().mo30214c(EnumC9587s4.INFO, "Not possible to read getExternalFilesDirs", new Object[0]);
        }
        return null;
    }

    /* renamed from: o */
    private StatFs m30459o(File file) {
        if (m30444A()) {
            this.f36117c.getLogger().mo30214c(EnumC9587s4.INFO, "External storage is not mounted or emulated.", new Object[0]);
            return null;
        }
        File fileM30458n = m30458n(file);
        if (fileM30458n != null) {
            return new StatFs(fileM30458n.getPath());
        }
        this.f36117c.getLogger().mo30214c(EnumC9587s4.INFO, "Not possible to read external files directory", new Object[0]);
        return null;
    }

    /* renamed from: p */
    public static C9352w0 m30460p(Context context, SentryAndroidOptions sentryAndroidOptions) {
        if (f36115a == null) {
            synchronized (C9352w0.class) {
                if (f36115a == null) {
                    f36115a = new C9352w0(context.getApplicationContext(), sentryAndroidOptions);
                }
            }
        }
        return f36115a;
    }

    /* renamed from: q */
    private Long m30461q(ActivityManager.MemoryInfo memoryInfo) {
        return this.f36118d.m30406d() >= 16 ? Long.valueOf(memoryInfo.totalMem) : Long.valueOf(Runtime.getRuntime().totalMemory());
    }

    /* renamed from: s */
    private C9546e.b m30462s() {
        C9546e.b bVarM30292a;
        Throwable th;
        try {
            bVarM30292a = C9318o.m30292a(this.f36116b.getResources().getConfiguration().orientation);
            if (bVarM30292a == null) {
                try {
                    this.f36117c.getLogger().mo30214c(EnumC9587s4.INFO, "No device orientation available (ORIENTATION_SQUARE|ORIENTATION_UNDEFINED)", new Object[0]);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    this.f36117c.getLogger().mo30213b(EnumC9587s4.ERROR, "Error getting device orientation.", th);
                    return bVarM30292a;
                }
            }
        } catch (Throwable th3) {
            bVarM30292a = null;
            th = th3;
        }
        return bVarM30292a;
    }

    /* renamed from: u */
    private TimeZone m30463u() {
        if (this.f36118d.m30406d() >= 24) {
            LocaleList locales = this.f36116b.getResources().getConfiguration().getLocales();
            if (!locales.isEmpty()) {
                return Calendar.getInstance(locales.get(0)).getTimeZone();
            }
        }
        return Calendar.getInstance().getTimeZone();
    }

    /* renamed from: v */
    private Long m30464v(StatFs statFs) {
        try {
            return Long.valueOf(m30452h(statFs) * m30454j(statFs));
        } catch (Throwable th) {
            this.f36117c.getLogger().mo30213b(EnumC9587s4.ERROR, "Error getting total external storage amount.", th);
            return null;
        }
    }

    /* renamed from: w */
    private Long m30465w(StatFs statFs) {
        try {
            return Long.valueOf(m30452h(statFs) * m30454j(statFs));
        } catch (Throwable th) {
            this.f36117c.getLogger().mo30213b(EnumC9587s4.ERROR, "Error getting total internal storage amount.", th);
            return null;
        }
    }

    /* renamed from: x */
    private Long m30466x(StatFs statFs) {
        try {
            return Long.valueOf(m30447c(statFs) * m30454j(statFs));
        } catch (Throwable th) {
            this.f36117c.getLogger().mo30213b(EnumC9587s4.ERROR, "Error getting unused external storage amount.", th);
            return null;
        }
    }

    /* renamed from: y */
    private Long m30467y(StatFs statFs) {
        try {
            return Long.valueOf(m30447c(statFs) * m30454j(statFs));
        } catch (Throwable th) {
            this.f36117c.getLogger().mo30213b(EnumC9587s4.ERROR, "Error getting unused internal storage amount.", th);
            return null;
        }
    }

    /* renamed from: z */
    private Boolean m30468z(Intent intent) {
        try {
            int intExtra = intent.getIntExtra("plugged", -1);
            boolean z = true;
            if (intExtra != 1 && intExtra != 2) {
                z = false;
            }
            return Boolean.valueOf(z);
        } catch (Throwable th) {
            this.f36117c.getLogger().mo30213b(EnumC9587s4.ERROR, "Error getting device charging state.", th);
            return null;
        }
    }

    /* renamed from: B */
    protected C9552k m30469B() throws IOException {
        C9552k c9552k = new C9552k();
        c9552k.m31391j("Android");
        c9552k.m31394m(Build.VERSION.RELEASE);
        c9552k.m31389h(Build.DISPLAY);
        String strM30415g = C9346t0.m30415g(this.f36117c.getLogger());
        if (strM30415g != null) {
            c9552k.m31390i(strM30415g);
        }
        if (this.f36117c.isEnableRootCheck()) {
            c9552k.m31392k(Boolean.valueOf(new C9321r(this.f36116b, this.f36118d, this.f36117c.getLogger()).m30303e()));
        }
        return c9552k;
    }

    /* renamed from: a */
    public C9546e m30470a(boolean z, boolean z2) {
        C9546e c9546e = new C9546e();
        if (this.f36117c.isSendDefaultPii()) {
            c9546e.m31330g0(C9346t0.m30412d(this.f36116b, this.f36118d));
        }
        c9546e.m31326c0(Build.MANUFACTURER);
        c9546e.m31314Q(Build.BRAND);
        c9546e.m31319V(C9346t0.m30414f(this.f36117c.getLogger()));
        c9546e.m31328e0(Build.MODEL);
        c9546e.m31329f0(Build.ID);
        c9546e.m31310M(C9346t0.m30411c(this.f36118d));
        c9546e.m31332i0(m30462s());
        Boolean bool = this.f36119e;
        if (bool != null) {
            c9546e.m31339p0(bool);
        }
        DisplayMetrics displayMetricsM30413e = C9346t0.m30413e(this.f36116b, this.f36117c.getLogger());
        if (displayMetricsM30413e != null) {
            c9546e.m31338o0(Integer.valueOf(displayMetricsM30413e.widthPixels));
            c9546e.m31337n0(Integer.valueOf(displayMetricsM30413e.heightPixels));
            c9546e.m31335l0(Float.valueOf(displayMetricsM30413e.density));
            c9546e.m31336m0(Integer.valueOf(displayMetricsM30413e.densityDpi));
        }
        c9546e.m31313P(m30455k());
        c9546e.m31341r0(m30463u());
        if (c9546e.m31307J() == null) {
            c9546e.m31322Y(m30456l());
        }
        Locale locale = Locale.getDefault();
        if (c9546e.m31308K() == null) {
            c9546e.m31323Z(locale.getLanguage());
        }
        if (c9546e.m31309L() == null) {
            c9546e.m31324a0(locale.toString());
        }
        List<Integer> listM30290c = C9316m.m30288a().m30290c();
        if (!listM30290c.isEmpty()) {
            c9546e.m31334k0(Double.valueOf(((Integer) Collections.max(listM30290c)).doubleValue()));
            c9546e.m31333j0(Integer.valueOf(listM30290c.size()));
        }
        c9546e.m31327d0(this.f36122h);
        if (z && this.f36117c.isCollectAdditionalContext()) {
            m30445C(c9546e, z2);
        }
        return c9546e;
    }

    /* renamed from: r */
    public C9552k m30471r() {
        return this.f36121g;
    }

    /* renamed from: t */
    public C9346t0.a m30472t() {
        return this.f36120f;
    }
}
