package com.google.android.gms.measurement.internal;

import android.os.Binder;
import android.text.TextUtils;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzgc extends zzeo {

    /* renamed from: f */
    private final zzkc f29304f;

    /* renamed from: g */
    private Boolean f29305g;

    /* renamed from: h */
    private String f29306h;

    public zzgc(zzkc zzkcVar) {
        this(zzkcVar, null);
    }

    /* renamed from: E0 */
    private final void m23244E0(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            this.f29304f.mo22836h().m23137H().m23147a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z) {
            try {
                if (this.f29305g == null) {
                    this.f29305g = Boolean.valueOf("com.google.android.gms".equals(this.f29306h) || UidVerifier.m14656a(this.f29304f.mo22834f(), Binder.getCallingUid()) || GoogleSignatureVerifier.m13830a(this.f29304f.mo22834f()).m13835c(Binder.getCallingUid()));
                }
                if (this.f29305g.booleanValue()) {
                    return;
                }
            } catch (SecurityException e2) {
                this.f29304f.mo22836h().m23137H().m23148b("Measurement Service called with invalid calling package. appId", zzet.m23131x(str));
                throw e2;
            }
        }
        if (this.f29306h == null && GooglePlayServicesUtilLight.uidHasPackageName(this.f29304f.mo22834f(), Binder.getCallingUid(), str)) {
            this.f29306h = str;
        }
        if (str.equals(this.f29306h)) {
        } else {
            throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
        }
    }

    /* renamed from: V3 */
    private final void m23246V3(zzm zzmVar, boolean z) {
        Preconditions.m14372k(zzmVar);
        m23244E0(zzmVar.f29401f, false);
        this.f29304f.m23450b0().m23547r0(zzmVar.f29402g, zzmVar.f29418w);
    }

    @VisibleForTesting
    /* renamed from: k0 */
    private final void m23247k0(Runnable runnable) throws IllegalStateException {
        Preconditions.m14372k(runnable);
        if (this.f29304f.mo22835g().m23198I()) {
            runnable.run();
        } else {
            this.f29304f.mo22835g().m23201z(runnable);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzel
    /* renamed from: A2 */
    public final List<zzv> mo23079A2(String str, String str2, zzm zzmVar) {
        m23246V3(zzmVar, false);
        try {
            return (List) this.f29304f.mo22835g().m23200w(new CallableC7691e4(this, zzmVar, str, str2)).get();
        } catch (InterruptedException | ExecutionException e2) {
            this.f29304f.mo22836h().m23137H().m23148b("Failed to get conditional user properties", e2);
            return Collections.emptyList();
        }
    }

    @VisibleForTesting
    /* renamed from: E3 */
    final zzan m23248E3(zzan zzanVar, zzm zzmVar) {
        zzam zzamVar;
        boolean z = false;
        if ("_cmp".equals(zzanVar.f29077f) && (zzamVar = zzanVar.f29078g) != null && zzamVar.m22964y() != 0) {
            String strM22963p0 = zzanVar.f29078g.m22963p0("_cis");
            if (!TextUtils.isEmpty(strM22963p0) && (("referrer broadcast".equals(strM22963p0) || "referrer API".equals(strM22963p0)) && this.f29304f.m23436J().m23574M(zzmVar.f29401f))) {
                z = true;
            }
        }
        if (!z) {
            return zzanVar;
        }
        this.f29304f.mo22836h().m23143N().m23148b("Event has been filtered ", zzanVar.toString());
        return new zzan("_cmpx", zzanVar.f29078g, zzanVar.f29079h, zzanVar.f29080i);
    }

    @Override // com.google.android.gms.measurement.internal.zzel
    /* renamed from: I1 */
    public final List<zzkj> mo23080I1(zzm zzmVar, boolean z) throws IllegalStateException {
        m23246V3(zzmVar, false);
        try {
            List<C7766m7> list = (List) this.f29304f.mo22835g().m23200w(new CallableC7772n4(this, zzmVar)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C7766m7 c7766m7 : list) {
                if (z || !zzkk.m23515u0(c7766m7.f28779c)) {
                    arrayList.add(new zzkj(c7766m7));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e2) {
            this.f29304f.mo22836h().m23137H().m23149c("Failed to get user attributes. appId", zzet.m23131x(zzmVar.f29401f), e2);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzel
    /* renamed from: K1 */
    public final List<zzkj> mo23081K1(String str, String str2, String str3, boolean z) throws IllegalStateException {
        m23244E0(str, true);
        try {
            List<C7766m7> list = (List) this.f29304f.mo22835g().m23200w(new CallableC7700f4(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C7766m7 c7766m7 : list) {
                if (z || !zzkk.m23515u0(c7766m7.f28779c)) {
                    arrayList.add(new zzkj(c7766m7));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e2) {
            this.f29304f.mo22836h().m23137H().m23149c("Failed to get user attributes. appId", zzet.m23131x(str), e2);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzel
    /* renamed from: P4 */
    public final String mo23082P4(zzm zzmVar) {
        m23246V3(zzmVar, false);
        return this.f29304f.m23444V(zzmVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzel
    /* renamed from: R6 */
    public final void mo23083R6(zzv zzvVar) throws IllegalStateException {
        Preconditions.m14372k(zzvVar);
        Preconditions.m14372k(zzvVar.f29424h);
        m23244E0(zzvVar.f29422f, true);
        m23247k0(new RunnableC7682d4(this, new zzv(zzvVar)));
    }

    @Override // com.google.android.gms.measurement.internal.zzel
    /* renamed from: T1 */
    public final byte[] mo23084T1(zzan zzanVar, String str) throws IllegalStateException {
        Preconditions.m14368g(str);
        Preconditions.m14372k(zzanVar);
        m23244E0(str, true);
        this.f29304f.mo22836h().m23144O().m23148b("Log and bundle. event", this.f29304f.m23449a0().m23124y(zzanVar.f29077f));
        long jNanoTime = this.f29304f.mo22837j().nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f29304f.mo22835g().m23196B(new CallableC7754l4(this, zzanVar, str)).get();
            if (bArr == null) {
                this.f29304f.mo22836h().m23137H().m23148b("Log and bundle returned null. appId", zzet.m23131x(str));
                bArr = new byte[0];
            }
            this.f29304f.mo22836h().m23144O().m23150d("Log and bundle processed. event, size, time_ms", this.f29304f.m23449a0().m23124y(zzanVar.f29077f), Integer.valueOf(bArr.length), Long.valueOf((this.f29304f.mo22837j().nanoTime() / 1000000) - jNanoTime));
            return bArr;
        } catch (InterruptedException | ExecutionException e2) {
            this.f29304f.mo22836h().m23137H().m23150d("Failed to log and bundle. appId, event, error", zzet.m23131x(str), this.f29304f.m23449a0().m23124y(zzanVar.f29077f), e2);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzel
    /* renamed from: U3 */
    public final void mo23085U3(zzm zzmVar) throws IllegalStateException {
        m23246V3(zzmVar, false);
        m23247k0(new RunnableC7664b4(this, zzmVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzel
    /* renamed from: Z5 */
    public final void mo23086Z5(zzan zzanVar, zzm zzmVar) throws IllegalStateException {
        Preconditions.m14372k(zzanVar);
        m23246V3(zzmVar, false);
        m23247k0(new RunnableC7736j4(this, zzanVar, zzmVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzel
    /* renamed from: b4 */
    public final void mo23087b4(zzkj zzkjVar, zzm zzmVar) throws IllegalStateException {
        Preconditions.m14372k(zzkjVar);
        m23246V3(zzmVar, false);
        m23247k0(new RunnableC7745k4(this, zzkjVar, zzmVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzel
    /* renamed from: f3 */
    public final List<zzkj> mo23088f3(String str, String str2, boolean z, zzm zzmVar) throws IllegalStateException {
        m23246V3(zzmVar, false);
        try {
            List<C7766m7> list = (List) this.f29304f.mo22835g().m23200w(new CallableC7673c4(this, zzmVar, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C7766m7 c7766m7 : list) {
                if (z || !zzkk.m23515u0(c7766m7.f28779c)) {
                    arrayList.add(new zzkj(c7766m7));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e2) {
            this.f29304f.mo22836h().m23137H().m23149c("Failed to get user attributes. appId", zzet.m23131x(zzmVar.f29401f), e2);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzel
    /* renamed from: h2 */
    public final void mo23089h2(zzv zzvVar, zzm zzmVar) throws IllegalStateException {
        Preconditions.m14372k(zzvVar);
        Preconditions.m14372k(zzvVar.f29424h);
        m23246V3(zzmVar, false);
        zzv zzvVar2 = new zzv(zzvVar);
        zzvVar2.f29422f = zzmVar.f29401f;
        m23247k0(new RunnableC7781o4(this, zzvVar2, zzmVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzel
    /* renamed from: j3 */
    public final void mo23090j3(long j2, String str, String str2, String str3) throws IllegalStateException {
        m23247k0(new RunnableC7790p4(this, str2, str3, str, j2));
    }

    @Override // com.google.android.gms.measurement.internal.zzel
    /* renamed from: j6 */
    public final void mo23091j6(zzan zzanVar, String str, String str2) throws IllegalStateException {
        Preconditions.m14372k(zzanVar);
        Preconditions.m14368g(str);
        m23244E0(str, true);
        m23247k0(new RunnableC7727i4(this, zzanVar, str));
    }

    @Override // com.google.android.gms.measurement.internal.zzel
    /* renamed from: r2 */
    public final void mo23092r2(zzm zzmVar) throws IllegalStateException {
        m23244E0(zzmVar.f29401f, false);
        m23247k0(new RunnableC7709g4(this, zzmVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzel
    /* renamed from: r3 */
    public final List<zzv> mo23093r3(String str, String str2, String str3) {
        m23244E0(str, true);
        try {
            return (List) this.f29304f.mo22835g().m23200w(new CallableC7718h4(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e2) {
            this.f29304f.mo22836h().m23137H().m23148b("Failed to get conditional user properties", e2);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzel
    /* renamed from: s6 */
    public final void mo23094s6(zzm zzmVar) throws IllegalStateException {
        m23246V3(zzmVar, false);
        m23247k0(new RunnableC7763m4(this, zzmVar));
    }

    private zzgc(zzkc zzkcVar, String str) {
        Preconditions.m14372k(zzkcVar);
        this.f29304f = zzkcVar;
        this.f29306h = null;
    }
}
