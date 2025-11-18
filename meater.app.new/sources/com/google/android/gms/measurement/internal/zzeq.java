package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzky;
import com.google.android.gms.internal.measurement.zzmo;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzeq extends AbstractC7833u2 {

    /* renamed from: c */
    private String f29196c;

    /* renamed from: d */
    private String f29197d;

    /* renamed from: e */
    private int f29198e;

    /* renamed from: f */
    private String f29199f;

    /* renamed from: g */
    private String f29200g;

    /* renamed from: h */
    private long f29201h;

    /* renamed from: i */
    private long f29202i;

    /* renamed from: j */
    private long f29203j;

    /* renamed from: k */
    private List<String> f29204k;

    /* renamed from: l */
    private int f29205l;

    /* renamed from: m */
    private String f29206m;

    /* renamed from: n */
    private String f29207n;

    /* renamed from: o */
    private String f29208o;

    zzeq(zzfx zzfxVar, long j2) {
        super(zzfxVar);
        this.f29203j = j2;
    }

    @VisibleForTesting
    /* renamed from: J */
    private final String m23108J() throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        if (zzmo.m22553b() && mo22841n().m23587r(zzap.f29114Q0)) {
            mo22836h().m23145P().m23147a("Disabled IID for tests.");
            return null;
        }
        try {
            Class<?> clsLoadClass = mo22834f().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
            if (clsLoadClass == null) {
                return null;
            }
            try {
                Object objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, mo22834f());
                if (objInvoke == null) {
                    return null;
                }
                try {
                    return (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(objInvoke, new Object[0]);
                } catch (Exception unused) {
                    mo22836h().m23142M().m23147a("Failed to retrieve Firebase Instance Id");
                    return null;
                }
            } catch (Exception unused2) {
                mo22836h().m23141L().m23147a("Failed to obtain Firebase Analytics instance");
                return null;
            }
        } catch (ClassNotFoundException unused3) {
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC7833u2
    /* renamed from: A */
    protected final boolean mo22854A() {
        return true;
    }

    /* renamed from: B */
    final zzm m23109B(String str) {
        String str2;
        Boolean boolM23589u;
        mo22792d();
        mo22790b();
        String strM23110C = m23110C();
        String strM23111D = m23111D();
        m22857x();
        String str3 = this.f29197d;
        long jM23113F = m23113F();
        m22857x();
        String str4 = this.f29199f;
        long jM23565C = mo22841n().m23565C();
        m22857x();
        mo22792d();
        if (this.f29201h == 0) {
            this.f29201h = this.f28874a.m23217I().m23551w(mo22834f(), mo22834f().getPackageName());
        }
        long j2 = this.f29201h;
        boolean zM23236p = this.f28874a.m23236p();
        boolean z = !mo22840m().f28872y;
        mo22792d();
        mo22790b();
        String strM23108J = !this.f28874a.m23236p() ? null : m23108J();
        m22857x();
        long j3 = this.f29202i;
        long jM23237q = this.f28874a.m23237q();
        int iM23114H = m23114H();
        boolean zBooleanValue = mo22841n().m23573L().booleanValue();
        zzx zzxVarMo22841n = mo22841n();
        zzxVarMo22841n.mo22790b();
        Boolean boolM23589u2 = zzxVarMo22841n.m23589u("google_analytics_ssaid_collection_enabled");
        boolean zBooleanValue2 = Boolean.valueOf(boolM23589u2 == null || boolM23589u2.booleanValue()).booleanValue();
        boolean zM22825L = mo22840m().m22825L();
        String strM23112E = m23112E();
        Boolean boolValueOf = (!mo22841n().m23564B(m23110C(), zzap.f29152k0) || (boolM23589u = mo22841n().m23589u("google_analytics_default_allow_ad_personalization_signals")) == null) ? null : Boolean.valueOf(!boolM23589u.booleanValue());
        long j4 = this.f29203j;
        List<String> list = mo22841n().m23564B(m23110C(), zzap.f29174v0) ? this.f29204k : null;
        if (zzky.m22475b() && mo22841n().m23564B(m23110C(), zzap.f29108N0)) {
            m22857x();
            str2 = this.f29208o;
        } else {
            str2 = null;
        }
        return new zzm(strM23110C, strM23111D, str3, jM23113F, str4, jM23565C, j2, str, zM23236p, z, strM23108J, j3, jM23237q, iM23114H, zBooleanValue, zBooleanValue2, zM22825L, strM23112E, boolValueOf, j4, list, str2);
    }

    /* renamed from: C */
    final String m23110C() {
        m22857x();
        return this.f29196c;
    }

    /* renamed from: D */
    final String m23111D() {
        m22857x();
        return this.f29206m;
    }

    /* renamed from: E */
    final String m23112E() {
        m22857x();
        return this.f29207n;
    }

    /* renamed from: F */
    final int m23113F() {
        m22857x();
        return this.f29198e;
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4, com.google.android.gms.measurement.internal.InterfaceC7817s4
    /* renamed from: G */
    public final /* bridge */ /* synthetic */ zzw mo22832G() {
        return super.mo22832G();
    }

    /* renamed from: H */
    final int m23114H() {
        m22857x();
        return this.f29205l;
    }

    /* renamed from: I */
    final List<String> m23115I() {
        return this.f29204k;
    }

    @Override // com.google.android.gms.measurement.internal.C7744k3, com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo22789a() {
        super.mo22789a();
    }

    @Override // com.google.android.gms.measurement.internal.C7744k3, com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo22790b() {
        super.mo22790b();
    }

    @Override // com.google.android.gms.measurement.internal.C7744k3, com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo22791c() {
        super.mo22791c();
    }

    @Override // com.google.android.gms.measurement.internal.C7744k3, com.google.android.gms.measurement.internal.C7808r4
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

    @Override // com.google.android.gms.measurement.internal.C7744k3
    /* renamed from: o */
    public final /* bridge */ /* synthetic */ zzb mo22793o() {
        return super.mo22793o();
    }

    @Override // com.google.android.gms.measurement.internal.C7744k3
    /* renamed from: p */
    public final /* bridge */ /* synthetic */ zzhc mo22794p() {
        return super.mo22794p();
    }

    @Override // com.google.android.gms.measurement.internal.C7744k3
    /* renamed from: q */
    public final /* bridge */ /* synthetic */ zzeq mo22795q() {
        return super.mo22795q();
    }

    @Override // com.google.android.gms.measurement.internal.C7744k3
    /* renamed from: r */
    public final /* bridge */ /* synthetic */ zzik mo22796r() {
        return super.mo22796r();
    }

    @Override // com.google.android.gms.measurement.internal.C7744k3
    /* renamed from: s */
    public final /* bridge */ /* synthetic */ zzif mo22797s() {
        return super.mo22797s();
    }

    @Override // com.google.android.gms.measurement.internal.C7744k3
    /* renamed from: t */
    public final /* bridge */ /* synthetic */ zzep mo22798t() {
        return super.mo22798t();
    }

    @Override // com.google.android.gms.measurement.internal.C7744k3
    /* renamed from: u */
    public final /* bridge */ /* synthetic */ zzjl mo22799u() {
        return super.mo22799u();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(23:0|2|(1:4)(26:119|6|(1:10)(2:11|(1:13))|117|14|(4:16|(1:18)(1:20)|121|21)|26|(1:31)(1:30)|32|(1:37)(1:36)|38|(1:(1:41)(1:42))|(3:44|(2:46|(1:48))(1:(1:(1:59)(1:58))(2:52|(1:54)))|60)(1:60)|61|(1:65)|123|66|(1:68)(1:69)|70|71|(2:84|(1:86))(4:75|(1:77)(1:78)|79|(1:83))|(1:88)|92|(3:94|(3:96|(1:98)(3:100|(3:103|(1:126)(1:127)|101)|125)|99)(0)|(1:107))|108|(1:(2:111|112)(2:113|114))(2:115|116))|5|26|(2:28|31)(0)|32|(2:34|37)(0)|38|(0)|(0)(0)|61|(2:63|65)|123|66|(0)(0)|70|71|(4:73|84|(0)|(0))(0)|92|(0)|108|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x020d, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x020e, code lost:
    
        mo22836h().m23137H().m23149c("getGoogleAppId or isMeasurementEnabled failed with exception. appId", com.google.android.gms.measurement.internal.zzet.m23131x(r0), r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ac A[Catch: IllegalStateException -> 0x020d, TRY_ENTER, TryCatch #3 {IllegalStateException -> 0x020d, blocks: (B:66:0x0195, B:70:0x01a2, B:73:0x01ac, B:75:0x01b8, B:79:0x01cf, B:81:0x01d7, B:88:0x01fb, B:83:0x01dd, B:84:0x01e4, B:86:0x01ea), top: B:123:0x0195 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e4 A[Catch: IllegalStateException -> 0x020d, TryCatch #3 {IllegalStateException -> 0x020d, blocks: (B:66:0x0195, B:70:0x01a2, B:73:0x01ac, B:75:0x01b8, B:79:0x01cf, B:81:0x01d7, B:88:0x01fb, B:83:0x01dd, B:84:0x01e4, B:86:0x01ea), top: B:123:0x0195 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ea A[Catch: IllegalStateException -> 0x020d, TryCatch #3 {IllegalStateException -> 0x020d, blocks: (B:66:0x0195, B:70:0x01a2, B:73:0x01ac, B:75:0x01b8, B:79:0x01cf, B:81:0x01d7, B:88:0x01fb, B:83:0x01dd, B:84:0x01e4, B:86:0x01ea), top: B:123:0x0195 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01fb A[Catch: IllegalStateException -> 0x020d, TRY_LEAVE, TryCatch #3 {IllegalStateException -> 0x020d, blocks: (B:66:0x0195, B:70:0x01a2, B:73:0x01ac, B:75:0x01b8, B:79:0x01cf, B:81:0x01d7, B:88:0x01fb, B:83:0x01dd, B:84:0x01e4, B:86:0x01ea), top: B:123:0x0195 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0230  */
    @Override // com.google.android.gms.measurement.internal.AbstractC7833u2
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void mo22855v() throws java.lang.IllegalStateException, android.content.res.Resources.NotFoundException, android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 654
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzeq.mo22855v():void");
    }
}
