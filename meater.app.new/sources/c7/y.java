package c7;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import g7.C3445p;
import g7.W;
import g7.X;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes2.dex */
final class y {

    /* renamed from: e, reason: collision with root package name */
    private static volatile X f31111e;

    /* renamed from: g, reason: collision with root package name */
    private static Context f31113g;

    /* renamed from: a, reason: collision with root package name */
    static final w f31107a = new q(u.k("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));

    /* renamed from: b, reason: collision with root package name */
    static final w f31108b = new r(u.k("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));

    /* renamed from: c, reason: collision with root package name */
    static final w f31109c = new s(u.k("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));

    /* renamed from: d, reason: collision with root package name */
    static final w f31110d = new t(u.k("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));

    /* renamed from: f, reason: collision with root package name */
    private static final Object f31112f = new Object();

    static C2330H a(String str, u uVar, boolean z10, boolean z11) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return f(str, uVar, z10, z11);
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    static C2330H b(String str, boolean z10, boolean z11, boolean z12) {
        return g(str, z10, false, false, true);
    }

    static /* synthetic */ String c(boolean z10, String str, u uVar) throws NoSuchAlgorithmException {
        String str2 = (z10 || !f(str, uVar, true, false).f31061a) ? "not allowed" : "debug cert rejected";
        MessageDigest messageDigestB = com.google.android.gms.common.util.a.b("SHA-256");
        C3445p.k(messageDigestB);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str2, str, com.google.android.gms.common.util.j.a(messageDigestB.digest(uVar.u1())), Boolean.valueOf(z10), "12451000.false");
    }

    static synchronized void d(Context context) {
        if (f31113g != null) {
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        } else if (context != null) {
            f31113g = context.getApplicationContext();
        }
    }

    static boolean e() {
        boolean zE;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                h();
                zE = f31111e.e();
            } catch (RemoteException | DynamiteModule.LoadingException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                zE = false;
            }
            return zE;
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    private static C2330H f(final String str, final u uVar, final boolean z10, boolean z11) {
        try {
            h();
            C3445p.k(f31113g);
            try {
                return f31111e.E(new C2326D(str, uVar, z10, z11), m7.b.u1(f31113g.getPackageManager())) ? C2330H.b() : new C2328F(new Callable() { // from class: c7.p
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return y.c(z10, str, uVar);
                    }
                }, null);
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                return C2330H.d("module call", e10);
            }
        } catch (DynamiteModule.LoadingException e11) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
            return C2330H.d("module init: ".concat(String.valueOf(e11.getMessage())), e11);
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder, m7.a] */
    private static C2330H g(String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        C2330H c2330hD;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            C3445p.k(f31113g);
            try {
                h();
                z zVar = new z(str, z10, false, m7.b.u1(f31113g), false, true);
                try {
                    C2324B c2324bM0 = z13 ? f31111e.m0(zVar) : f31111e.C0(zVar);
                    if (c2324bM0.h0()) {
                        c2330hD = C2330H.f(c2324bM0.r0());
                    } else {
                        String strF0 = c2324bM0.f0();
                        PackageManager.NameNotFoundException nameNotFoundException = c2324bM0.v0() == 4 ? new PackageManager.NameNotFoundException() : null;
                        if (strF0 == null) {
                            strF0 = "error checking package certificate";
                        }
                        c2330hD = C2330H.g(c2324bM0.r0(), c2324bM0.v0(), strF0, nameNotFoundException);
                    }
                } catch (RemoteException e10) {
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                    c2330hD = C2330H.d("module call", e10);
                }
            } catch (DynamiteModule.LoadingException e11) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
                c2330hD = C2330H.d("module init: ".concat(String.valueOf(e11.getMessage())), e11);
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            return c2330hD;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th;
        }
    }

    private static void h() {
        if (f31111e != null) {
            return;
        }
        C3445p.k(f31113g);
        synchronized (f31112f) {
            try {
                if (f31111e == null) {
                    f31111e = W.g(DynamiteModule.d(f31113g, DynamiteModule.f33545f, "com.google.android.gms.googlecertificates").c("com.google.android.gms.common.GoogleCertificatesImpl"));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
