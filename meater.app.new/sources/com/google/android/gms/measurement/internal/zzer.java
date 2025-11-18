package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzer extends AbstractC7799q4 {

    /* renamed from: c */
    private static final AtomicReference<String[]> f29209c = new AtomicReference<>();

    /* renamed from: d */
    private static final AtomicReference<String[]> f29210d = new AtomicReference<>();

    /* renamed from: e */
    private static final AtomicReference<String[]> f29211e = new AtomicReference<>();

    zzer(zzfx zzfxVar) {
        super(zzfxVar);
    }

    /* renamed from: C */
    private final boolean m23116C() {
        mo22832G();
        return this.f28874a.m23220L() && this.f28874a.mo22836h().m23136C(3);
    }

    /* renamed from: w */
    private final String m23117w(zzam zzamVar) {
        if (zzamVar == null) {
            return null;
        }
        return !m23116C() ? zzamVar.toString() : m23121u(zzamVar.m22960Y());
    }

    /* renamed from: z */
    private static String m23118z(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        Preconditions.m14372k(strArr);
        Preconditions.m14372k(strArr2);
        Preconditions.m14372k(atomicReference);
        Preconditions.m14362a(strArr.length == strArr2.length);
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (zzkk.m23514t0(str, strArr[i2])) {
                synchronized (atomicReference) {
                    String[] strArr3 = atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    if (strArr3[i2] == null) {
                        strArr3[i2] = strArr2[i2] + "(" + strArr[i2] + ")";
                    }
                    str2 = strArr3[i2];
                }
                return str2;
            }
        }
        return str;
    }

    /* renamed from: A */
    protected final String m23119A(String str) {
        if (str == null) {
            return null;
        }
        return !m23116C() ? str : m23118z(str, zzgv.f29308b, zzgv.f29307a, f29210d);
    }

    /* renamed from: B */
    protected final String m23120B(String str) {
        if (str == null) {
            return null;
        }
        if (!m23116C()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return m23118z(str, zzgy.f29312b, zzgy.f29311a, f29211e);
        }
        return "experiment_id(" + str + ")";
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4, com.google.android.gms.measurement.internal.InterfaceC7817s4
    /* renamed from: G */
    public final /* bridge */ /* synthetic */ zzw mo22832G() {
        return super.mo22832G();
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

    @Override // com.google.android.gms.measurement.internal.AbstractC7799q4
    /* renamed from: s */
    protected final boolean mo22810s() {
        return false;
    }

    /* renamed from: u */
    protected final String m23121u(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!m23116C()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        for (String str : bundle.keySet()) {
            if (sb.length() != 0) {
                sb.append(", ");
            } else {
                sb.append("Bundle[{");
            }
            sb.append(m23119A(str));
            sb.append("=");
            sb.append(bundle.get(str));
        }
        sb.append("}]");
        return sb.toString();
    }

    /* renamed from: v */
    protected final String m23122v(zzak zzakVar) {
        if (zzakVar == null) {
            return null;
        }
        if (!m23116C()) {
            return zzakVar.toString();
        }
        return "Event{appId='" + zzakVar.f29070a + "', name='" + m23124y(zzakVar.f29071b) + "', params=" + m23117w(zzakVar.f29075f) + "}";
    }

    /* renamed from: x */
    protected final String m23123x(zzan zzanVar) {
        if (zzanVar == null) {
            return null;
        }
        if (!m23116C()) {
            return zzanVar.toString();
        }
        return "origin=" + zzanVar.f29079h + ",name=" + m23124y(zzanVar.f29077f) + ",params=" + m23117w(zzanVar.f29078g);
    }

    /* renamed from: y */
    protected final String m23124y(String str) {
        if (str == null) {
            return null;
        }
        return !m23116C() ? str : m23118z(str, zzgw.f29310b, zzgw.f29309a, f29209c);
    }
}
