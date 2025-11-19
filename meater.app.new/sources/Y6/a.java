package Y6;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import c7.C2337f;
import c7.ServiceConnectionC2332a;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.util.VisibleForTesting;
import g7.C3445p;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import o7.e;
import o7.f;

/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    ServiceConnectionC2332a f19436a;

    /* renamed from: b, reason: collision with root package name */
    f f19437b;

    /* renamed from: c, reason: collision with root package name */
    boolean f19438c;

    /* renamed from: d, reason: collision with root package name */
    final Object f19439d = new Object();

    /* renamed from: e, reason: collision with root package name */
    c f19440e;

    /* renamed from: f, reason: collision with root package name */
    private final Context f19441f;

    /* renamed from: g, reason: collision with root package name */
    final long f19442g;

    /* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
    /* renamed from: Y6.a$a, reason: collision with other inner class name */
    public static final class C0284a {

        /* renamed from: a, reason: collision with root package name */
        private final String f19443a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f19444b;

        @Deprecated
        public C0284a(String str, boolean z10) {
            this.f19443a = str;
            this.f19444b = z10;
        }

        public String a() {
            return this.f19443a;
        }

        public boolean b() {
            return this.f19444b;
        }

        public String toString() {
            String str = this.f19443a;
            boolean z10 = this.f19444b;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 7);
            sb2.append("{");
            sb2.append(str);
            sb2.append("}");
            sb2.append(z10);
            return sb2.toString();
        }
    }

    @VisibleForTesting
    public a(Context context, long j10, boolean z10, boolean z11) {
        Context applicationContext;
        C3445p.k(context);
        if (z10 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f19441f = context;
        this.f19438c = false;
        this.f19442g = j10;
    }

    public static C0284a a(Context context) {
        a aVar = new a(context, -1L, true, false);
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            aVar.d(false);
            C0284a c0284aF = aVar.f(-1);
            aVar.e(c0284aF, true, 0.0f, SystemClock.elapsedRealtime() - jElapsedRealtime, "", null);
            return c0284aF;
        } finally {
        }
    }

    private final C0284a f(int i10) {
        C0284a c0284a;
        C3445p.j("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.f19438c) {
                    synchronized (this.f19439d) {
                        c cVar = this.f19440e;
                        if (cVar == null || !cVar.f19449E) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        d(false);
                        if (!this.f19438c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e10) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e10);
                    }
                }
                C3445p.k(this.f19436a);
                C3445p.k(this.f19437b);
                try {
                    c0284a = new C0284a(this.f19437b.d(), this.f19437b.F(true));
                } catch (RemoteException e11) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e11);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        g();
        return c0284a;
    }

    private final void g() {
        synchronized (this.f19439d) {
            c cVar = this.f19440e;
            if (cVar != null) {
                cVar.f19448D.countDown();
                try {
                    this.f19440e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j10 = this.f19442g;
            if (j10 > 0) {
                this.f19440e = new c(this, j10);
            }
        }
    }

    public final void c() {
        C3445p.j("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f19441f == null || this.f19436a == null) {
                    return;
                }
                try {
                    if (this.f19438c) {
                        j7.b.b().c(this.f19441f, this.f19436a);
                    }
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.f19438c = false;
                this.f19437b = null;
                this.f19436a = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @VisibleForTesting
    protected final void d(boolean z10) {
        C3445p.j("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f19438c) {
                    c();
                }
                Context context = this.f19441f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int iH = C2337f.f().h(context, 12451000);
                    if (iH != 0 && iH != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    ServiceConnectionC2332a serviceConnectionC2332a = new ServiceConnectionC2332a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!j7.b.b().a(context, intent, serviceConnectionC2332a, 1)) {
                            throw new IOException("Connection failure");
                        }
                        this.f19436a = serviceConnectionC2332a;
                        try {
                            this.f19437b = e.c(serviceConnectionC2332a.a(10000L, TimeUnit.MILLISECONDS));
                            this.f19438c = true;
                            if (z10) {
                                g();
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } finally {
                        IOException iOException = new IOException(th);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new GooglePlayServicesNotAvailableException(9);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @VisibleForTesting
    final boolean e(C0284a c0284a, boolean z10, float f10, long j10, String str, Throwable th) {
        if (Math.random() > 0.0d) {
            return false;
        }
        HashMap map = new HashMap();
        map.put("app_context", "1");
        if (c0284a != null) {
            map.put("limit_ad_tracking", true != c0284a.b() ? "0" : "1");
            String strA = c0284a.a();
            if (strA != null) {
                map.put("ad_id_size", Integer.toString(strA.length()));
            }
        }
        if (th != null) {
            map.put("error", th.getClass().getName());
        }
        map.put("tag", "AdvertisingIdClient");
        map.put("time_spent", Long.toString(j10));
        new b(this, map).start();
        return true;
    }

    protected final void finalize() throws Throwable {
        c();
        super.finalize();
    }

    public static void b(boolean z10) {
    }
}
