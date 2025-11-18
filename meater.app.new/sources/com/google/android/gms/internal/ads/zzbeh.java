package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@zzard
/* loaded from: classes2.dex */
public final class zzbeh implements zzjp {

    /* renamed from: a */
    private InputStream f22910a;

    /* renamed from: b */
    private boolean f22911b;

    /* renamed from: c */
    private final Context f22912c;

    /* renamed from: d */
    private final zzjp f22913d;

    /* renamed from: e */
    private final WeakReference<zzbei> f22914e;

    public zzbeh(Context context, zzjp zzjpVar, zzbei zzbeiVar) {
        this.f22912c = context;
        this.f22913d = zzjpVar;
        this.f22914e = new WeakReference<>(zzbeiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    /* renamed from: a */
    public final long mo14852a(zzjq zzjqVar) throws IOException {
        Long l;
        zzjq zzjqVar2 = zzjqVar;
        if (this.f22911b) {
            throw new IOException("Attempt to open an already open CacheDataSource.");
        }
        this.f22911b = true;
        zzvv zzvvVarM20679z = zzvv.m20679z(zzjqVar2.f26371a);
        if (!((Boolean) zzyt.m20848e().m16421c(zzacu.f21908z3)).booleanValue()) {
            zzvs zzvsVarM20672d = null;
            if (zzvvVarM20679z != null) {
                zzvvVarM20679z.f27237m = zzjqVar2.f26373c;
                zzvsVarM20672d = zzk.zzlm().m20672d(zzvvVarM20679z);
            }
            if (zzvsVarM20672d != null && zzvsVarM20672d.m20675y()) {
                this.f22910a = zzvsVarM20672d.m20676z();
                return -1L;
            }
        } else if (zzvvVarM20679z != null) {
            zzvvVarM20679z.f27237m = zzjqVar2.f26373c;
            if (zzvvVarM20679z.f27236l) {
                l = (Long) zzyt.m20848e().m16421c(zzacu.f21602B3);
            } else {
                l = (Long) zzyt.m20848e().m16421c(zzacu.f21596A3);
            }
            long jLongValue = l.longValue();
            long jMo14609b = zzk.zzln().mo14609b();
            zzk.zzma();
            Future<InputStream> futureM20690a = zzwi.m20690a(this.f22912c, zzvvVarM20679z);
            try {
                try {
                    this.f22910a = futureM20690a.get(jLongValue, TimeUnit.MILLISECONDS);
                    long jMo14609b2 = zzk.zzln().mo14609b() - jMo14609b;
                    zzbei zzbeiVar = this.f22914e.get();
                    if (zzbeiVar != null) {
                        zzbeiVar.mo15265a(true, jMo14609b2);
                    }
                    StringBuilder sb = new StringBuilder(44);
                    sb.append("Cache connection took ");
                    sb.append(jMo14609b2);
                    sb.append("ms");
                    zzawz.m17082m(sb.toString());
                    return -1L;
                } catch (InterruptedException unused) {
                    futureM20690a.cancel(true);
                    Thread.currentThread().interrupt();
                    long jMo14609b3 = zzk.zzln().mo14609b() - jMo14609b;
                    zzbei zzbeiVar2 = this.f22914e.get();
                    if (zzbeiVar2 != null) {
                        zzbeiVar2.mo15265a(false, jMo14609b3);
                    }
                    StringBuilder sb2 = new StringBuilder(44);
                    sb2.append("Cache connection took ");
                    sb2.append(jMo14609b3);
                    sb2.append("ms");
                    zzawz.m17082m(sb2.toString());
                } catch (ExecutionException | TimeoutException unused2) {
                    futureM20690a.cancel(true);
                    long jMo14609b4 = zzk.zzln().mo14609b() - jMo14609b;
                    zzbei zzbeiVar3 = this.f22914e.get();
                    if (zzbeiVar3 != null) {
                        zzbeiVar3.mo15265a(false, jMo14609b4);
                    }
                    StringBuilder sb3 = new StringBuilder(44);
                    sb3.append("Cache connection took ");
                    sb3.append(jMo14609b4);
                    sb3.append("ms");
                    zzawz.m17082m(sb3.toString());
                }
            } catch (Throwable th) {
                long jMo14609b5 = zzk.zzln().mo14609b() - jMo14609b;
                zzbei zzbeiVar4 = this.f22914e.get();
                if (zzbeiVar4 != null) {
                    zzbeiVar4.mo15265a(false, jMo14609b5);
                }
                StringBuilder sb4 = new StringBuilder(44);
                sb4.append("Cache connection took ");
                sb4.append(jMo14609b5);
                sb4.append("ms");
                zzawz.m17082m(sb4.toString());
                throw th;
            }
        }
        if (zzvvVarM20679z != null) {
            zzjqVar2 = new zzjq(Uri.parse(zzvvVarM20679z.f27230f), zzjqVar2.f26372b, zzjqVar2.f26373c, zzjqVar2.f26374d, zzjqVar2.f26375e, zzjqVar2.f26376f);
        }
        return this.f22913d.mo14852a(zzjqVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    public final void close() throws IOException {
        if (!this.f22911b) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.f22911b = false;
        InputStream inputStream = this.f22910a;
        if (inputStream == null) {
            this.f22913d.close();
        } else {
            IOUtils.m14630a(inputStream);
            this.f22910a = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        if (!this.f22911b) {
            throw new IOException("Attempt to read closed CacheDataSource.");
        }
        InputStream inputStream = this.f22910a;
        return inputStream != null ? inputStream.read(bArr, i2, i3) : this.f22913d.read(bArr, i2, i3);
    }
}
