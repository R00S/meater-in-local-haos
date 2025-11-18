package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzaf;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: com.google.android.gms.common.k */
/* loaded from: classes2.dex */
final class C6439k {

    /* renamed from: e */
    private static volatile zzaf f17878e;

    /* renamed from: g */
    private static Context f17880g;

    /* renamed from: a */
    static final AbstractBinderC6416i f17874a = new BinderC6409c(AbstractBinderC6414g.m14274k0("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));

    /* renamed from: b */
    static final AbstractBinderC6416i f17875b = new BinderC6410d(AbstractBinderC6414g.m14274k0("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));

    /* renamed from: c */
    static final AbstractBinderC6416i f17876c = new BinderC6412e(AbstractBinderC6414g.m14274k0("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));

    /* renamed from: d */
    static final AbstractBinderC6416i f17877d = new BinderC6413f(AbstractBinderC6414g.m14274k0("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));

    /* renamed from: f */
    private static final Object f17879f = new Object();

    /* renamed from: a */
    static C6441m m14519a(String str, AbstractBinderC6414g abstractBinderC6414g, boolean z, boolean z2) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return m14524f(str, abstractBinderC6414g, z, z2);
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    /* renamed from: b */
    static C6441m m14520b(String str, boolean z, boolean z2, boolean z3) {
        return m14525g(str, z, false, false, true);
    }

    /* renamed from: c */
    static /* synthetic */ String m14521c(boolean z, String str, AbstractBinderC6414g abstractBinderC6414g) throws Exception {
        String str2 = true != (!z && m14524f(str, abstractBinderC6414g, true, false).f17887b) ? "not allowed" : "debug cert rejected";
        MessageDigest messageDigestM14592b = AndroidUtilsLight.m14592b("SHA-256");
        Preconditions.m14372k(messageDigestM14592b);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str2, str, Hex.m14628a(messageDigestM14592b.digest(abstractBinderC6414g.mo14275E0())), Boolean.valueOf(z), "12451000.false");
    }

    /* renamed from: d */
    static synchronized void m14522d(Context context) {
        if (f17880g != null) {
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        } else if (context != null) {
            f17880g = context.getApplicationContext();
        }
    }

    /* renamed from: e */
    static boolean m14523e() {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                m14526h();
                return f17878e.mo14497l();
            } catch (RemoteException | DynamiteModule.LoadingException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                return false;
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    /* renamed from: f */
    private static C6441m m14524f(final String str, final AbstractBinderC6414g abstractBinderC6414g, final boolean z, boolean z2) {
        try {
            m14526h();
            Preconditions.m14372k(f17880g);
            try {
                return f17878e.mo14495C1(new zzs(str, abstractBinderC6414g, z, z2), ObjectWrapper.m14708E0(f17880g.getPackageManager())) ? C6441m.m14532b() : new C6440l(new Callable() { // from class: com.google.android.gms.common.zze
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return C6439k.m14521c(z, str, abstractBinderC6414g);
                    }
                }, null);
            } catch (RemoteException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                return C6441m.m14534d("module call", e2);
            }
        } catch (DynamiteModule.LoadingException e3) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
            return C6441m.m14534d("module init: ".concat(String.valueOf(e3.getMessage())), e3);
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder, com.google.android.gms.dynamic.IObjectWrapper] */
    /* renamed from: g */
    private static C6441m m14525g(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        C6441m c6441mM14534d;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            Preconditions.m14372k(f17880g);
            try {
                m14526h();
                zzo zzoVar = new zzo(str, z, false, ObjectWrapper.m14708E0(f17880g), false);
                try {
                    zzq zzqVarMo14498q3 = z4 ? f17878e.mo14498q3(zzoVar) : f17878e.mo14496c4(zzoVar);
                    if (zzqVarMo14498q3.m14679z()) {
                        c6441mM14534d = C6441m.m14535f(zzqVarMo14498q3.m14676W());
                    } else {
                        String strM14678y = zzqVarMo14498q3.m14678y();
                        PackageManager.NameNotFoundException nameNotFoundException = zzqVarMo14498q3.m14677Y() == 4 ? new PackageManager.NameNotFoundException() : null;
                        if (strM14678y == null) {
                            strM14678y = "error checking package certificate";
                        }
                        c6441mM14534d = C6441m.m14536g(zzqVarMo14498q3.m14676W(), zzqVarMo14498q3.m14677Y(), strM14678y, nameNotFoundException);
                    }
                } catch (RemoteException e2) {
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                    c6441mM14534d = C6441m.m14534d("module call", e2);
                }
            } catch (DynamiteModule.LoadingException e3) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
                c6441mM14534d = C6441m.m14534d("module init: ".concat(String.valueOf(e3.getMessage())), e3);
            }
            return c6441mM14534d;
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    /* renamed from: h */
    private static void m14526h() throws DynamiteModule.LoadingException {
        if (f17878e != null) {
            return;
        }
        Preconditions.m14372k(f17880g);
        synchronized (f17879f) {
            if (f17878e == null) {
                f17878e = com.google.android.gms.common.internal.zzae.m14499P(DynamiteModule.m14714e(f17880g, DynamiteModule.f18042e, "com.google.android.gms.googlecertificates").m14723d("com.google.android.gms.common.GoogleCertificatesImpl"));
            }
        }
    }
}
