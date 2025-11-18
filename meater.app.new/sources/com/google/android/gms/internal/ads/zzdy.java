package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.internal.ads.zzbp;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public class zzdy {

    /* renamed from: a */
    private static final String f26007a = "zzdy";

    /* renamed from: b */
    protected Context f26008b;

    /* renamed from: c */
    private ExecutorService f26009c;

    /* renamed from: d */
    private DexClassLoader f26010d;

    /* renamed from: e */
    private zzdj f26011e;

    /* renamed from: f */
    private byte[] f26012f;

    /* renamed from: j */
    private boolean f26016j;

    /* renamed from: m */
    private zzda f26019m;

    /* renamed from: p */
    private Map<Pair<String, String>, zzfi> f26022p;

    /* renamed from: g */
    private volatile AdvertisingIdClient f26013g = null;

    /* renamed from: h */
    private volatile boolean f26014h = false;

    /* renamed from: i */
    private Future f26015i = null;

    /* renamed from: k */
    private volatile zzbp.zza f26017k = null;

    /* renamed from: l */
    private Future f26018l = null;

    /* renamed from: n */
    protected boolean f26020n = false;

    /* renamed from: o */
    private boolean f26021o = false;

    /* renamed from: q */
    private boolean f26023q = false;

    /* renamed from: r */
    private boolean f26024r = true;

    /* renamed from: s */
    private boolean f26025s = false;

    /* renamed from: com.google.android.gms.internal.ads.zzdy$a */
    final class C7442a extends BroadcastReceiver {
        private C7442a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                zzdy.this.f26024r = true;
            } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                zzdy.this.f26024r = false;
            }
        }

        /* synthetic */ C7442a(zzdy zzdyVar, ThreadFactoryC6912ly threadFactoryC6912ly) {
            this();
        }
    }

    private zzdy(Context context) {
        Context applicationContext = context.getApplicationContext();
        boolean z = applicationContext != null;
        this.f26016j = z;
        this.f26008b = z ? applicationContext : context;
        this.f26022p = new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public final void m19887B() {
        try {
            if (this.f26013g == null && this.f26016j) {
                AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(this.f26008b);
                advertisingIdClient.start();
                this.f26013g = advertisingIdClient;
            }
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException unused) {
            this.f26013g = null;
        }
    }

    /* renamed from: C */
    private final zzbp.zza m19888C() {
        try {
            PackageInfo packageInfo = this.f26008b.getPackageManager().getPackageInfo(this.f26008b.getPackageName(), 0);
            Context context = this.f26008b;
            return zzdal.m19146a(context, context.getPackageName(), Integer.toString(packageInfo.versionCode));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static zzdy m19890d(Context context, String str, String str2, boolean z) throws Throwable {
        zzdy zzdyVar = new zzdy(context);
        try {
            zzdyVar.f26009c = Executors.newCachedThreadPool(new ThreadFactoryC6912ly());
            zzdyVar.f26014h = z;
            if (z) {
                zzdyVar.f26015i = zzdyVar.f26009c.submit(new RunnableC6986ny(zzdyVar));
            }
            zzdyVar.f26009c.execute(new RunnableC7060py(zzdyVar));
            try {
                GoogleApiAvailabilityLight googleApiAvailabilityLightM13823h = GoogleApiAvailabilityLight.m13823h();
                zzdyVar.f26020n = googleApiAvailabilityLightM13823h.m13825b(zzdyVar.f26008b) > 0;
                zzdyVar.f26021o = googleApiAvailabilityLightM13823h.mo13812i(zzdyVar.f26008b) == 0;
            } catch (Throwable unused) {
            }
            zzdyVar.m19903e(0, true);
            if (zzef.m19917a() && ((Boolean) zzyt.m20848e().m16421c(zzacu.f21877u2)).booleanValue()) {
                throw new IllegalStateException("Task Context initialization must not be called from the UI thread.");
            }
            ThreadFactoryC6912ly threadFactoryC6912ly = null;
            zzdj zzdjVar = new zzdj(null);
            zzdyVar.f26011e = zzdjVar;
            try {
                zzdyVar.f26012f = zzdjVar.m19544c(str);
                try {
                    try {
                        try {
                            File cacheDir = zzdyVar.f26008b.getCacheDir();
                            if (cacheDir == null && (cacheDir = zzdyVar.f26008b.getDir("dex", 0)) == null) {
                                throw new zzdv();
                            }
                            File file = new File(String.format("%s/%s.jar", cacheDir, "1542658731108"));
                            if (!file.exists()) {
                                byte[] bArrM19543b = zzdyVar.f26011e.m19543b(zzdyVar.f26012f, str2);
                                file.createNewFile();
                                FileOutputStream fileOutputStream = new FileOutputStream(file);
                                fileOutputStream.write(bArrM19543b, 0, bArrM19543b.length);
                                fileOutputStream.close();
                            }
                            zzdyVar.m19898o(cacheDir, "1542658731108");
                            try {
                                zzdyVar.f26010d = new DexClassLoader(file.getAbsolutePath(), cacheDir.getAbsolutePath(), null, zzdyVar.f26008b.getClassLoader());
                                m19896m(file);
                                zzdyVar.m19892g(cacheDir, "1542658731108");
                                m19895k(String.format("%s/%s.dex", cacheDir, "1542658731108"));
                                if (!zzdyVar.f26025s) {
                                    IntentFilter intentFilter = new IntentFilter();
                                    intentFilter.addAction("android.intent.action.USER_PRESENT");
                                    intentFilter.addAction("android.intent.action.SCREEN_OFF");
                                    zzdyVar.f26008b.registerReceiver(new C7442a(zzdyVar, threadFactoryC6912ly), intentFilter);
                                    zzdyVar.f26025s = true;
                                }
                                zzdyVar.f26019m = new zzda(zzdyVar);
                                zzdyVar.f26023q = true;
                            } catch (Throwable th) {
                                m19896m(file);
                                zzdyVar.m19892g(cacheDir, "1542658731108");
                                m19895k(String.format("%s/%s.dex", cacheDir, "1542658731108"));
                                throw th;
                            }
                        } catch (zzdk e2) {
                            throw new zzdv(e2);
                        } catch (NullPointerException e3) {
                            throw new zzdv(e3);
                        }
                    } catch (IOException e4) {
                        throw new zzdv(e4);
                    }
                } catch (FileNotFoundException e5) {
                    throw new zzdv(e5);
                }
            } catch (zzdk e6) {
                throw new zzdv(e6);
            }
        } catch (zzdv unused2) {
        }
        return zzdyVar;
    }

    /* renamed from: g */
    private final void m19892g(File file, String str) throws Throwable {
        FileOutputStream fileOutputStream;
        File file2 = new File(String.format("%s/%s.tmp", file, str));
        if (file2.exists()) {
            return;
        }
        File file3 = new File(String.format("%s/%s.dex", file, str));
        if (!file3.exists()) {
            return;
        }
        long length = file3.length();
        if (length <= 0) {
            return;
        }
        byte[] bArr = new byte[(int) length];
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file3);
            try {
                try {
                    if (fileInputStream2.read(bArr) <= 0) {
                        try {
                            fileInputStream2.close();
                        } catch (IOException unused) {
                        }
                        m19896m(file3);
                        return;
                    }
                    System.out.print("test");
                    System.out.print("test");
                    System.out.print("test");
                    zzbp.zzd.zza zzaVarM18204w = zzbp.zzd.m18187D().m18201A(zzdmr.m19596D(Build.VERSION.SDK.getBytes())).m18204w(zzdmr.m19596D(str.getBytes()));
                    byte[] bytes = this.f26011e.m19545d(this.f26012f, bArr).getBytes();
                    zzaVarM18204w.m18202u(zzdmr.m19596D(bytes)).m18203v(zzdmr.m19596D(C6786ij.m15347e(bytes)));
                    file2.createNewFile();
                    fileOutputStream = new FileOutputStream(file2);
                    try {
                        byte[] bArrMo19587g = ((zzbp.zzd) ((zzdob) zzaVarM18204w.mo19736p0())).mo19587g();
                        fileOutputStream.write(bArrMo19587g, 0, bArrMo19587g.length);
                        fileOutputStream.close();
                        try {
                            fileInputStream2.close();
                        } catch (IOException unused2) {
                        }
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused3) {
                        }
                        m19896m(file3);
                    } catch (zzdk | IOException | NoSuchAlgorithmException unused4) {
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException unused5) {
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused6) {
                            }
                        }
                        m19896m(file3);
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException unused7) {
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused8) {
                            }
                        }
                        m19896m(file3);
                        throw th;
                    }
                } catch (zzdk | IOException | NoSuchAlgorithmException unused9) {
                    fileOutputStream = null;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (zzdk | IOException | NoSuchAlgorithmException unused10) {
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static boolean m19893h(int i2, zzbp.zza zzaVar) {
        if (i2 < 4) {
            return zzaVar == null || !zzaVar.m18048d0() || zzaVar.m18047U().equals("0000000000000000000000000000000000000000000000000000000000000000") || !zzaVar.m18049i0() || !zzaVar.m18050j0().m18207x() || zzaVar.m18050j0().m18208y() == -2;
        }
        return false;
    }

    /* renamed from: k */
    private static void m19895k(String str) {
        m19896m(new File(str));
    }

    /* renamed from: m */
    private static void m19896m(File file) {
        if (file.exists()) {
            file.delete();
        } else {
            Log.d(f26007a, String.format("File %s not found. No need for deletion", file.getAbsolutePath()));
        }
    }

    /* renamed from: o */
    private final boolean m19898o(File file, String str) throws Throwable {
        FileOutputStream fileOutputStream;
        File file2 = new File(String.format("%s/%s.tmp", file, str));
        if (!file2.exists()) {
            return false;
        }
        File file3 = new File(String.format("%s/%s.dex", file, str));
        if (file3.exists()) {
            return false;
        }
        FileInputStream fileInputStream = null;
        try {
            long length = file2.length();
            if (length <= 0) {
                m19896m(file2);
                return false;
            }
            byte[] bArr = new byte[(int) length];
            FileInputStream fileInputStream2 = new FileInputStream(file2);
            try {
                try {
                    if (fileInputStream2.read(bArr) <= 0) {
                        Log.d(f26007a, "Cannot read the cache data.");
                        m19896m(file2);
                        try {
                            fileInputStream2.close();
                        } catch (IOException unused) {
                        }
                        return false;
                    }
                    zzbp.zzd zzdVarM18189F = zzbp.zzd.m18189F(bArr, zzdno.m19703e());
                    if (str.equals(new String(zzdVarM18189F.m18197B().m19603c())) && Arrays.equals(zzdVarM18189F.m18200z().m19603c(), C6786ij.m15347e(zzdVarM18189F.m18199y().m19603c())) && Arrays.equals(zzdVarM18189F.m18198C().m19603c(), Build.VERSION.SDK.getBytes())) {
                        byte[] bArrM19543b = this.f26011e.m19543b(this.f26012f, new String(zzdVarM18189F.m18199y().m19603c()));
                        file3.createNewFile();
                        fileOutputStream = new FileOutputStream(file3);
                        try {
                            fileOutputStream.write(bArrM19543b, 0, bArrM19543b.length);
                            try {
                                fileInputStream2.close();
                            } catch (IOException unused2) {
                            }
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused3) {
                            }
                            return true;
                        } catch (zzdk | IOException | NoSuchAlgorithmException unused4) {
                            fileInputStream = fileInputStream2;
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (IOException unused5) {
                                }
                            }
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException unused6) {
                                }
                            }
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            fileInputStream = fileInputStream2;
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (IOException unused7) {
                                }
                            }
                            if (fileOutputStream == null) {
                                throw th;
                            }
                            try {
                                fileOutputStream.close();
                                throw th;
                            } catch (IOException unused8) {
                                throw th;
                            }
                        }
                    }
                    m19896m(file2);
                    try {
                        fileInputStream2.close();
                    } catch (IOException unused9) {
                    }
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = null;
                }
            } catch (zzdk | IOException | NoSuchAlgorithmException unused10) {
                fileOutputStream = null;
            }
        } catch (zzdk | IOException | NoSuchAlgorithmException unused11) {
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    /* renamed from: A */
    public final Future m19899A() {
        return this.f26018l;
    }

    /* renamed from: D */
    public final AdvertisingIdClient m19900D() throws ExecutionException, InterruptedException, TimeoutException {
        if (!this.f26014h) {
            return null;
        }
        if (this.f26013g != null) {
            return this.f26013g;
        }
        Future future = this.f26015i;
        if (future != null) {
            try {
                future.get(2000L, TimeUnit.MILLISECONDS);
                this.f26015i = null;
            } catch (InterruptedException | ExecutionException unused) {
            } catch (TimeoutException unused2) {
                this.f26015i.cancel(true);
            }
        }
        return this.f26013g;
    }

    /* renamed from: a */
    public final Context m19901a() {
        return this.f26008b;
    }

    /* renamed from: b */
    public final boolean m19902b() {
        return this.f26023q;
    }

    /* renamed from: e */
    final void m19903e(int i2, boolean z) {
        if (this.f26021o) {
            Future<?> futureSubmit = this.f26009c.submit(new RunnableC7023oy(this, i2, z));
            if (i2 == 0) {
                this.f26018l = futureSubmit;
            }
        }
    }

    /* renamed from: j */
    public final boolean m19904j(String str, String str2, Class<?>... clsArr) {
        if (this.f26022p.containsKey(new Pair(str, str2))) {
            return false;
        }
        this.f26022p.put(new Pair<>(str, str2), new zzfi(this, str, str2, clsArr));
        return true;
    }

    /* renamed from: l */
    final zzbp.zza m19905l(int i2, boolean z) throws InterruptedException {
        if (i2 > 0 && z) {
            try {
                Thread.sleep(i2 * 1000);
            } catch (InterruptedException unused) {
            }
        }
        return m19888C();
    }

    /* renamed from: p */
    public final Method m19906p(String str, String str2) {
        zzfi zzfiVar = this.f26022p.get(new Pair(str, str2));
        if (zzfiVar == null) {
            return null;
        }
        return zzfiVar.m19941d();
    }

    /* renamed from: q */
    public final int m19907q() {
        if (this.f26019m != null) {
            return zzda.m19123d();
        }
        return Integer.MIN_VALUE;
    }

    /* renamed from: r */
    public final ExecutorService m19908r() {
        return this.f26009c;
    }

    /* renamed from: s */
    public final DexClassLoader m19909s() {
        return this.f26010d;
    }

    /* renamed from: t */
    public final zzdj m19910t() {
        return this.f26011e;
    }

    /* renamed from: u */
    public final byte[] m19911u() {
        return this.f26012f;
    }

    /* renamed from: v */
    public final boolean m19912v() {
        return this.f26020n;
    }

    /* renamed from: w */
    public final zzda m19913w() {
        return this.f26019m;
    }

    /* renamed from: x */
    public final boolean m19914x() {
        return this.f26021o;
    }

    /* renamed from: y */
    public final boolean m19915y() {
        return this.f26024r;
    }

    /* renamed from: z */
    public final zzbp.zza m19916z() {
        return this.f26017k;
    }
}
