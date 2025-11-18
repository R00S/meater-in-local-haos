package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@zzard
/* loaded from: classes2.dex */
public final class zzbex implements zzrv {

    /* renamed from: a */
    private InputStream f22935a;

    /* renamed from: b */
    private boolean f22936b;

    /* renamed from: c */
    private final Context f22937c;

    /* renamed from: d */
    private final zzrv f22938d;

    /* renamed from: e */
    private final zzsj<zzrv> f22939e;

    /* renamed from: f */
    private final zzbey f22940f;

    /* renamed from: g */
    private Uri f22941g;

    public zzbex(Context context, zzrv zzrvVar, zzsj<zzrv> zzsjVar, zzbey zzbeyVar) {
        this.f22937c = context;
        this.f22938d = zzrvVar;
        this.f22939e = zzsjVar;
        this.f22940f = zzbeyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzrv
    /* renamed from: I0 */
    public final Uri mo15548I0() {
        return this.f22941g;
    }

    @Override // com.google.android.gms.internal.ads.zzrv
    /* renamed from: a */
    public final long mo15549a(zzry zzryVar) throws IOException {
        Long l;
        zzry zzryVar2 = zzryVar;
        if (this.f22936b) {
            throw new IOException("Attempt to open an already open CacheDataSource.");
        }
        this.f22936b = true;
        this.f22941g = zzryVar2.f26947a;
        zzsj<zzrv> zzsjVar = this.f22939e;
        if (zzsjVar != null) {
            zzsjVar.mo17603n(this, zzryVar2);
        }
        zzvv zzvvVarM20679z = zzvv.m20679z(zzryVar2.f26947a);
        if (!((Boolean) zzyt.m20848e().m16421c(zzacu.f21908z3)).booleanValue()) {
            zzvs zzvsVarM20672d = null;
            if (zzvvVarM20679z != null) {
                zzvvVarM20679z.f27237m = zzryVar2.f26950d;
                zzvsVarM20672d = zzk.zzlm().m20672d(zzvvVarM20679z);
            }
            if (zzvsVarM20672d != null && zzvsVarM20672d.m20675y()) {
                this.f22935a = zzvsVarM20672d.m20676z();
                return -1L;
            }
        } else if (zzvvVarM20679z != null) {
            zzvvVarM20679z.f27237m = zzryVar2.f26950d;
            if (zzvvVarM20679z.f27236l) {
                l = (Long) zzyt.m20848e().m16421c(zzacu.f21602B3);
            } else {
                l = (Long) zzyt.m20848e().m16421c(zzacu.f21596A3);
            }
            long jLongValue = l.longValue();
            long jMo14609b = zzk.zzln().mo14609b();
            zzk.zzma();
            Future<InputStream> futureM20690a = zzwi.m20690a(this.f22937c, zzvvVarM20679z);
            try {
                try {
                    this.f22935a = futureM20690a.get(jLongValue, TimeUnit.MILLISECONDS);
                    long jMo14609b2 = zzk.zzln().mo14609b() - jMo14609b;
                    this.f22940f.mo15925a(true, jMo14609b2);
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
                    this.f22940f.mo15925a(false, jMo14609b3);
                    StringBuilder sb2 = new StringBuilder(44);
                    sb2.append("Cache connection took ");
                    sb2.append(jMo14609b3);
                    sb2.append("ms");
                    zzawz.m17082m(sb2.toString());
                } catch (ExecutionException | TimeoutException unused2) {
                    futureM20690a.cancel(true);
                    long jMo14609b4 = zzk.zzln().mo14609b() - jMo14609b;
                    this.f22940f.mo15925a(false, jMo14609b4);
                    StringBuilder sb3 = new StringBuilder(44);
                    sb3.append("Cache connection took ");
                    sb3.append(jMo14609b4);
                    sb3.append("ms");
                    zzawz.m17082m(sb3.toString());
                }
            } catch (Throwable th) {
                long jMo14609b5 = zzk.zzln().mo14609b() - jMo14609b;
                this.f22940f.mo15925a(false, jMo14609b5);
                StringBuilder sb4 = new StringBuilder(44);
                sb4.append("Cache connection took ");
                sb4.append(jMo14609b5);
                sb4.append("ms");
                zzawz.m17082m(sb4.toString());
                throw th;
            }
        }
        if (zzvvVarM20679z != null) {
            zzryVar2 = new zzry(Uri.parse(zzvvVarM20679z.f27230f), zzryVar2.f26948b, zzryVar2.f26949c, zzryVar2.f26950d, zzryVar2.f26951e, zzryVar2.f26952f, zzryVar2.f26953g);
        }
        return this.f22938d.mo15549a(zzryVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzrv
    public final void close() throws IOException {
        if (!this.f22936b) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.f22936b = false;
        this.f22941g = null;
        InputStream inputStream = this.f22935a;
        if (inputStream != null) {
            IOUtils.m14630a(inputStream);
            this.f22935a = null;
        } else {
            this.f22938d.close();
        }
        zzsj<zzrv> zzsjVar = this.f22939e;
        if (zzsjVar != null) {
            zzsjVar.mo17593d(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrv
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        if (!this.f22936b) {
            throw new IOException("Attempt to read closed CacheDataSource.");
        }
        InputStream inputStream = this.f22935a;
        int i4 = inputStream != null ? inputStream.read(bArr, i2, i3) : this.f22938d.read(bArr, i2, i3);
        zzsj<zzrv> zzsjVar = this.f22939e;
        if (zzsjVar != null) {
            zzsjVar.mo17604o(this, i4);
        }
        return i4;
    }
}
