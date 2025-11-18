package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.net.Uri;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.Clock;
import java.io.IOException;

@zzard
@TargetApi(16)
/* loaded from: classes2.dex */
public final class zzbgp extends zzbft implements zzbfi {

    /* renamed from: i */
    private zzbfa f23013i;

    /* renamed from: j */
    private String f23014j;

    /* renamed from: k */
    private boolean f23015k;

    /* renamed from: l */
    private Exception f23016l;

    /* renamed from: m */
    private boolean f23017m;

    public zzbgp(zzbdf zzbdfVar, zzbde zzbdeVar) {
        super(zzbdfVar);
        zzbfa zzbfaVar = new zzbfa(zzbdfVar.getContext(), zzbdeVar);
        this.f23013i = zzbfaVar;
        zzbfaVar.m17612x(this);
    }

    /* renamed from: C */
    private static String m17660C(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(canonicalName).length() + String.valueOf(message).length());
        sb.append(str);
        sb.append("/");
        sb.append(canonicalName);
        sb.append(":");
        sb.append(message);
        return sb.toString();
    }

    /* renamed from: D */
    private final void m17661D(String str) {
        synchronized (this) {
            this.f23015k = true;
            notify();
            mo13849c();
        }
        String str2 = this.f23014j;
        if (str2 != null) {
            String strMo17641z = mo17641z(str2);
            Exception exc = this.f23016l;
            if (exc != null) {
                m17633q(this.f23014j, strMo17641z, "badUrl", m17660C(str, exc));
            } else {
                m17633q(this.f23014j, strMo17641z, "externalAbort", "Programmatic precache abort.");
            }
        }
    }

    /* renamed from: B */
    public final zzbfa m17662B() {
        synchronized (this) {
            this.f23017m = true;
            notify();
        }
        this.f23013i.m17612x(null);
        zzbfa zzbfaVar = this.f23013i;
        this.f23013i = null;
        return zzbfaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfi
    /* renamed from: a */
    public final void mo17559a(final boolean z, final long j2) {
        final zzbdf zzbdfVar = this.f22972h.get();
        if (zzbdfVar != null) {
            zzbbm.f22757a.execute(new Runnable(zzbdfVar, z, j2) { // from class: com.google.android.gms.internal.ads.la

                /* renamed from: f */
                private final zzbdf f19757f;

                /* renamed from: g */
                private final boolean f19758g;

                /* renamed from: h */
                private final long f19759h;

                {
                    this.f19757f = zzbdfVar;
                    this.f19758g = z;
                    this.f19759h = j2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f19757f.mo14890R(this.f19758g, this.f19759h);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    /* renamed from: b */
    public final void mo17627b() {
        m17661D(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbft, com.google.android.gms.common.api.Releasable
    /* renamed from: c */
    public final void mo13849c() {
        zzbfa zzbfaVar = this.f23013i;
        if (zzbfaVar != null) {
            zzbfaVar.m17612x(null);
            this.f23013i.m17609t();
        }
        super.mo13849c();
    }

    @Override // com.google.android.gms.internal.ads.zzbfi
    /* renamed from: e */
    public final void mo17560e(int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzbfi
    /* renamed from: f */
    public final void mo17561f(String str, Exception exc) {
        this.f23016l = exc;
        zzbad.m17348d("Precache error", exc);
        m17661D(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbfi
    /* renamed from: g */
    public final void mo17562g(int i2, int i3) {
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    /* renamed from: t */
    public final void mo17635t(int i2) {
        this.f23013i.m17589J().m17577j(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    /* renamed from: u */
    public final void mo17636u(int i2) {
        this.f23013i.m17589J().m17578k(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    /* renamed from: v */
    public final void mo17637v(int i2) {
        this.f23013i.m17589J().m17575h(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    /* renamed from: w */
    public final void mo17638w(int i2) {
        this.f23013i.m17589J().m17576i(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    /* renamed from: x */
    public final boolean mo17639x(String str, String[] strArr) throws Throwable {
        String str2;
        long j2;
        long j3;
        long j4;
        String str3;
        long j5;
        long j6;
        this.f23014j = str;
        String strMo17641z = mo17641z(str);
        String str4 = "error";
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i2 = 0; i2 < strArr.length; i2++) {
                try {
                    uriArr[i2] = Uri.parse(strArr[i2]);
                } catch (Exception e2) {
                    e = e2;
                    String message = e.getMessage();
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length());
                    sb.append("Failed to preload url ");
                    sb.append(str);
                    sb.append(" Exception: ");
                    sb.append(message);
                    zzbad.m17353i(sb.toString());
                    mo13849c();
                    m17633q(str, strMo17641z, str4, m17660C(str4, e));
                    return false;
                }
            }
            this.f23013i.m17613y(uriArr, this.f22971g);
            zzbdf zzbdfVar = this.f22972h.get();
            if (zzbdfVar != null) {
                zzbdfVar.mo14909g(strMo17641z, this);
            }
            Clock clockZzln = zzk.zzln();
            long jMo14608a = clockZzln.mo14608a();
            long jLongValue = ((Long) zzyt.m20848e().m16421c(zzacu.f21622F)).longValue();
            long jLongValue2 = ((Long) zzyt.m20848e().m16421c(zzacu.f21616E)).longValue() * 1000;
            long jIntValue = ((Integer) zzyt.m20848e().m16421c(zzacu.f21610D)).intValue();
            long j7 = -1;
            while (true) {
                try {
                    synchronized (this) {
                        try {
                            if (clockZzln.mo14608a() - jMo14608a > jLongValue2) {
                                long j8 = jLongValue2;
                                StringBuilder sb2 = new StringBuilder(47);
                                sb2.append("Timeout reached. Limit: ");
                                sb2.append(j8);
                                sb2.append(" ms");
                                throw new IOException(sb2.toString());
                            }
                            if (this.f23015k) {
                                Exception exc = this.f23016l;
                                if (exc != null) {
                                    throw exc;
                                }
                                throw new IOException("Abort requested before buffering finished. ");
                            }
                            if (!this.f23017m) {
                                zzkv zzkvVarM17588I = this.f23013i.m17588I();
                                if (zzkvVarM17588I == null) {
                                    throw new IOException("ExoPlayer was released during preloading.");
                                }
                                str2 = str4;
                                try {
                                    long jMo15583g = zzkvVarM17588I.mo15583g();
                                    if (jMo15583g > 0) {
                                        long jMo15580d = zzkvVarM17588I.mo15580d();
                                        if (jMo15580d != j7) {
                                            j2 = jIntValue;
                                            j3 = jLongValue2;
                                            j5 = jLongValue;
                                            m17632p(str, strMo17641z, jMo15580d, jMo15583g, jMo15580d > 0, zzbfa.m17579G(), zzbfa.m17580H());
                                            j6 = jMo15580d;
                                        } else {
                                            j2 = jIntValue;
                                            j3 = jLongValue2;
                                            j5 = jLongValue;
                                            j6 = j7;
                                        }
                                        if (jMo15580d >= jMo15583g) {
                                            m17634s(str, strMo17641z, jMo15583g);
                                        } else if (this.f23013i.m17608s() < j2 || jMo15580d <= 0) {
                                            j4 = j5;
                                            str3 = j6;
                                        }
                                    } else {
                                        j2 = jIntValue;
                                        j3 = jLongValue2;
                                        j4 = jLongValue;
                                        str3 = j7;
                                    }
                                    try {
                                        try {
                                            wait(j4);
                                        } catch (Throwable th) {
                                            th = th;
                                            str4 = str3;
                                            throw th;
                                        }
                                    } catch (InterruptedException unused) {
                                        throw new IOException("Wait interrupted.");
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    str4 = str2;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                    jLongValue = j4;
                    str4 = str2;
                    jIntValue = j2;
                    jLongValue2 = j3;
                    j7 = str3;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
            return true;
        } catch (Exception e3) {
            e = e3;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    /* renamed from: y */
    public final boolean mo17640y(String str) {
        return mo17639x(str, new String[]{str});
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    /* renamed from: z */
    protected final String mo17641z(String str) {
        String strValueOf = String.valueOf(super.mo17641z(str));
        return strValueOf.length() != 0 ? "cache:".concat(strValueOf) : new String("cache:");
    }
}
