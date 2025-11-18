package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzbj;
import com.google.android.gms.internal.measurement.zzbo;
import com.google.android.gms.internal.measurement.zzfd;
import com.google.android.gms.internal.measurement.zzfo;
import java.util.ArrayList;
import java.util.Map;
import p024c.p041e.C0867a;

/* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzfr extends AbstractC7703f7 implements InterfaceC7865x7 {

    /* renamed from: d */
    @VisibleForTesting
    private static int f29253d = 65535;

    /* renamed from: e */
    @VisibleForTesting
    private static int f29254e = 2;

    /* renamed from: f */
    private final Map<String, Map<String, String>> f29255f;

    /* renamed from: g */
    private final Map<String, Map<String, Boolean>> f29256g;

    /* renamed from: h */
    private final Map<String, Map<String, Boolean>> f29257h;

    /* renamed from: i */
    private final Map<String, zzbo.zzb> f29258i;

    /* renamed from: j */
    private final Map<String, Map<String, Integer>> f29259j;

    /* renamed from: k */
    private final Map<String, String> f29260k;

    zzfr(zzkc zzkcVar) {
        super(zzkcVar);
        this.f29255f = new C0867a();
        this.f29256g = new C0867a();
        this.f29257h = new C0867a();
        this.f29258i = new C0867a();
        this.f29260k = new C0867a();
        this.f29259j = new C0867a();
    }

    /* renamed from: M */
    private final void m23171M(String str) throws Throwable {
        m22778t();
        mo22792d();
        Preconditions.m14368g(str);
        if (this.f29258i.get(str) == null) {
            byte[] bArrM22753r0 = mo22785q().m22753r0(str);
            if (bArrM22753r0 != null) {
                zzbo.zzb.zza zzaVarM22274v = m23172x(str, bArrM22753r0).m22274v();
                m23174z(str, zzaVarM22274v);
                this.f29255f.put(str, m23173y((zzbo.zzb) ((zzfd) zzaVarM22274v.mo22283y())));
                this.f29258i.put(str, (zzbo.zzb) ((zzfd) zzaVarM22274v.mo22283y()));
                this.f29260k.put(str, null);
                return;
            }
            this.f29255f.put(str, null);
            this.f29256g.put(str, null);
            this.f29257h.put(str, null);
            this.f29258i.put(str, null);
            this.f29260k.put(str, null);
            this.f29259j.put(str, null);
        }
    }

    /* renamed from: x */
    private final zzbo.zzb m23172x(String str, byte[] bArr) throws IllegalStateException {
        if (bArr == null) {
            return zzbo.zzb.m21610O();
        }
        try {
            zzbo.zzb zzbVar = (zzbo.zzb) ((zzfd) ((zzbo.zzb.zza) zzkg.m23467A(zzbo.zzb.m21609N(), bArr)).mo22283y());
            mo22836h().m23145P().m23149c("Parsed config. version, gmp_app_id", zzbVar.m21614F() ? Long.valueOf(zzbVar.m21615G()) : null, zzbVar.m21616H() ? zzbVar.m21617I() : null);
            return zzbVar;
        } catch (zzfo e2) {
            mo22836h().m23140K().m23149c("Unable to merge remote config. appId", zzet.m23131x(str), e2);
            return zzbo.zzb.m21610O();
        } catch (RuntimeException e3) {
            mo22836h().m23140K().m23149c("Unable to merge remote config. appId", zzet.m23131x(str), e3);
            return zzbo.zzb.m21610O();
        }
    }

    /* renamed from: y */
    private static Map<String, String> m23173y(zzbo.zzb zzbVar) {
        C0867a c0867a = new C0867a();
        if (zzbVar != null) {
            for (zzbo.zzc zzcVar : zzbVar.m21618J()) {
                c0867a.put(zzcVar.m21628B(), zzcVar.m21629C());
            }
        }
        return c0867a;
    }

    /* renamed from: z */
    private final void m23174z(String str, zzbo.zzb.zza zzaVar) throws IllegalStateException {
        C0867a c0867a = new C0867a();
        C0867a c0867a2 = new C0867a();
        C0867a c0867a3 = new C0867a();
        if (zzaVar != null) {
            for (int i2 = 0; i2 < zzaVar.m21626w(); i2++) {
                zzbo.zza.C11493zza c11493zzaM22274v = zzaVar.m21622A(i2).m22274v();
                if (TextUtils.isEmpty(c11493zzaM22274v.m21600A())) {
                    mo22836h().m23140K().m23147a("EventConfig contained null event name");
                } else {
                    String strM23253b = zzgw.m23253b(c11493zzaM22274v.m21600A());
                    if (!TextUtils.isEmpty(strM23253b)) {
                        c11493zzaM22274v = c11493zzaM22274v.m21605w(strM23253b);
                        zzaVar.m21623B(i2, c11493zzaM22274v);
                    }
                    c0867a.put(c11493zzaM22274v.m21600A(), Boolean.valueOf(c11493zzaM22274v.m21601B()));
                    c0867a2.put(c11493zzaM22274v.m21600A(), Boolean.valueOf(c11493zzaM22274v.m21602C()));
                    if (c11493zzaM22274v.m21603D()) {
                        if (c11493zzaM22274v.m21604E() < f29254e || c11493zzaM22274v.m21604E() > f29253d) {
                            mo22836h().m23140K().m23149c("Invalid sampling rate. Event name, sample rate", c11493zzaM22274v.m21600A(), Integer.valueOf(c11493zzaM22274v.m21604E()));
                        } else {
                            c0867a3.put(c11493zzaM22274v.m21600A(), Integer.valueOf(c11493zzaM22274v.m21604E()));
                        }
                    }
                }
            }
        }
        this.f29256g.put(str, c0867a);
        this.f29257h.put(str, c0867a2);
        this.f29259j.put(str, c0867a3);
    }

    /* renamed from: A */
    protected final boolean m23175A(String str, byte[] bArr, String str2) throws IllegalStateException {
        byte[] bArrM22136j;
        boolean z;
        m22778t();
        mo22792d();
        Preconditions.m14368g(str);
        zzbo.zzb.zza zzaVarM22274v = m23172x(str, bArr).m22274v();
        if (zzaVarM22274v == null) {
            return false;
        }
        m23174z(str, zzaVarM22274v);
        this.f29258i.put(str, (zzbo.zzb) ((zzfd) zzaVarM22274v.mo22283y()));
        this.f29260k.put(str, str2);
        this.f29255f.put(str, m23173y((zzbo.zzb) ((zzfd) zzaVarM22274v.mo22283y())));
        C7802q7 c7802q7Mo22783o = mo22783o();
        ArrayList arrayList = new ArrayList(zzaVarM22274v.m21624C());
        Preconditions.m14372k(arrayList);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            zzbj.zza.C11492zza c11492zzaM22274v = arrayList.get(i2).m22274v();
            if (c11492zzaM22274v.m21514D() != 0) {
                for (int i3 = 0; i3 < c11492zzaM22274v.m21514D(); i3++) {
                    zzbj.zzb.zza zzaVarM22274v2 = c11492zzaM22274v.m21515E(i3).m22274v();
                    zzbj.zzb.zza zzaVar = (zzbj.zzb.zza) ((zzfd.zzb) zzaVarM22274v2.clone());
                    String strM23253b = zzgw.m23253b(zzaVarM22274v2.m21537C());
                    if (strM23253b != null) {
                        zzaVar.m21535A(strM23253b);
                        z = true;
                    } else {
                        z = false;
                    }
                    for (int i4 = 0; i4 < zzaVarM22274v2.m21538D(); i4++) {
                        zzbj.zzc zzcVarM21536B = zzaVarM22274v2.m21536B(i4);
                        String strM23251a = zzgv.m23251a(zzcVarM21536B.m21550J());
                        if (strM23251a != null) {
                            zzaVar.m21539w(i4, (zzbj.zzc) ((zzfd) zzcVarM21536B.m22274v().m21551w(strM23251a).mo22283y()));
                            z = true;
                        }
                    }
                    if (z) {
                        c11492zzaM22274v = c11492zzaM22274v.m21511A(i3, zzaVar);
                        arrayList.set(i2, (zzbj.zza) ((zzfd) c11492zzaM22274v.mo22283y()));
                    }
                }
            }
            if (c11492zzaM22274v.m21516w() != 0) {
                for (int i5 = 0; i5 < c11492zzaM22274v.m21516w(); i5++) {
                    zzbj.zze zzeVarM21513C = c11492zzaM22274v.m21513C(i5);
                    String strM23254a = zzgy.m23254a(zzeVarM21513C.m21573F());
                    if (strM23254a != null) {
                        c11492zzaM22274v = c11492zzaM22274v.m21512B(i5, zzeVarM21513C.m22274v().m21579w(strM23254a));
                        arrayList.set(i2, (zzbj.zza) ((zzfd) c11492zzaM22274v.mo22283y()));
                    }
                }
            }
        }
        c7802q7Mo22783o.mo22785q().m22738P(str, arrayList);
        try {
            zzaVarM22274v.m21625D();
            bArrM22136j = ((zzbo.zzb) ((zzfd) zzaVarM22274v.mo22283y())).m22136j();
        } catch (RuntimeException e2) {
            mo22836h().m23140K().m23149c("Unable to serialize reduced-size config. Storing full config instead. appId", zzet.m23131x(str), e2);
            bArrM22136j = bArr;
        }
        C7668c c7668cMo22785q = mo22785q();
        Preconditions.m14368g(str);
        c7668cMo22785q.mo22792d();
        c7668cMo22785q.m22778t();
        new ContentValues().put("remote_config", bArrM22136j);
        try {
            if (c7668cMo22785q.m22761x().update(DeepLinkIntentReceiver.DeepLinksTargets.APPS, r6, "app_id = ?", new String[]{str}) == 0) {
                c7668cMo22785q.mo22836h().m23137H().m23148b("Failed to update remote config (got 0). appId", zzet.m23131x(str));
            }
        } catch (SQLiteException e3) {
            c7668cMo22785q.mo22836h().m23137H().m23149c("Error storing remote config. appId", zzet.m23131x(str), e3);
        }
        this.f29258i.put(str, (zzbo.zzb) ((zzfd) zzaVarM22274v.mo22283y()));
        return true;
    }

    /* renamed from: B */
    protected final String m23176B(String str) {
        mo22792d();
        return this.f29260k.get(str);
    }

    /* renamed from: C */
    final boolean m23177C(String str, String str2) throws Throwable {
        Boolean bool;
        mo22792d();
        m23171M(str);
        if (m23184K(str) && zzkk.m23515u0(str2)) {
            return true;
        }
        if (m23185L(str) && zzkk.m23504Y(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.f29256g.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: D */
    protected final void m23178D(String str) {
        mo22792d();
        this.f29260k.put(str, null);
    }

    /* renamed from: E */
    final boolean m23179E(String str, String str2) throws Throwable {
        Boolean bool;
        mo22792d();
        m23171M(str);
        if ("ecommerce_purchase".equals(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.f29257h.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: F */
    final int m23180F(String str, String str2) throws Throwable {
        Integer num;
        mo22792d();
        m23171M(str);
        Map<String, Integer> map = this.f29259j.get(str);
        if (map == null || (num = map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4, com.google.android.gms.measurement.internal.InterfaceC7817s4
    /* renamed from: G */
    public final /* bridge */ /* synthetic */ zzw mo22832G() {
        return super.mo22832G();
    }

    /* renamed from: H */
    final void m23181H(String str) {
        mo22792d();
        this.f29258i.remove(str);
    }

    /* renamed from: I */
    final boolean m23182I(String str) {
        mo22792d();
        zzbo.zzb zzbVarM23186w = m23186w(str);
        if (zzbVarM23186w == null) {
            return false;
        }
        return zzbVarM23186w.m21621M();
    }

    /* renamed from: J */
    final long m23183J(String str) throws Throwable {
        String strMo22702i = mo22702i(str, "measurement.account.time_zone_offset_minutes");
        if (TextUtils.isEmpty(strMo22702i)) {
            return 0L;
        }
        try {
            return Long.parseLong(strMo22702i);
        } catch (NumberFormatException e2) {
            mo22836h().m23140K().m23149c("Unable to parse timezone offset. appId", zzet.m23131x(str), e2);
            return 0L;
        }
    }

    /* renamed from: K */
    final boolean m23184K(String str) {
        return "1".equals(mo22702i(str, "measurement.upload.blacklist_internal"));
    }

    /* renamed from: L */
    final boolean m23185L(String str) {
        return "1".equals(mo22702i(str, "measurement.upload.blacklist_public"));
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo22789a() {
        super.mo22789a();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo22790b() {
        super.mo22790b();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo22791c() {
        super.mo22791c();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo22792d() {
        super.mo22792d();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ zzah mo22833e() {
        return super.mo22833e();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4, com.google.android.gms.measurement.internal.InterfaceC7817s4
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ Context mo22834f() {
        return super.mo22834f();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4, com.google.android.gms.measurement.internal.InterfaceC7817s4
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ zzfu mo22835g() {
        return super.mo22835g();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4, com.google.android.gms.measurement.internal.InterfaceC7817s4
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ zzet mo22836h() {
        return super.mo22836h();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC7865x7
    /* renamed from: i */
    public final String mo22702i(String str, String str2) throws Throwable {
        mo22792d();
        m23171M(str);
        Map<String, String> map = this.f29255f.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4, com.google.android.gms.measurement.internal.InterfaceC7817s4
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ Clock mo22837j() {
        return super.mo22837j();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: k */
    public final /* bridge */ /* synthetic */ zzer mo22838k() {
        return super.mo22838k();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: l */
    public final /* bridge */ /* synthetic */ zzkk mo22839l() {
        return super.mo22839l();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C7807r3 mo22840m() {
        return super.mo22840m();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: n */
    public final /* bridge */ /* synthetic */ zzx mo22841n() {
        return super.mo22841n();
    }

    @Override // com.google.android.gms.measurement.internal.C7721h7
    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C7802q7 mo22783o() {
        return super.mo22783o();
    }

    @Override // com.google.android.gms.measurement.internal.C7721h7
    /* renamed from: p */
    public final /* bridge */ /* synthetic */ zzkg mo22784p() {
        return super.mo22784p();
    }

    @Override // com.google.android.gms.measurement.internal.C7721h7
    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C7668c mo22785q() {
        return super.mo22785q();
    }

    @Override // com.google.android.gms.measurement.internal.C7721h7
    /* renamed from: r */
    public final /* bridge */ /* synthetic */ zzfr mo22786r() {
        return super.mo22786r();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC7703f7
    /* renamed from: v */
    protected final boolean mo22757v() {
        return false;
    }

    /* renamed from: w */
    protected final zzbo.zzb m23186w(String str) {
        m22778t();
        mo22792d();
        Preconditions.m14368g(str);
        m23171M(str);
        return this.f29258i.get(str);
    }
}
