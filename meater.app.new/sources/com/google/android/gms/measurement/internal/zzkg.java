package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import cm.aptoide.p092pt.reviews.RateAndReviewsFragment;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzbj;
import com.google.android.gms.internal.measurement.zzbr;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzgn;
import com.google.android.gms.internal.measurement.zzjj;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import okhttp3.HttpUrl;

/* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzkg extends AbstractC7703f7 {
    zzkg(zzkc zzkcVar) {
        super(zzkcVar);
    }

    /* renamed from: A */
    static <Builder extends zzgn> Builder m23467A(Builder builder, byte[] bArr) throws zzfo {
        com.google.android.gms.internal.measurement.zzeq zzeqVarM22246c = com.google.android.gms.internal.measurement.zzeq.m22246c();
        return zzeqVarM22246c != null ? (Builder) builder.mo22142Y(bArr, zzeqVarM22246c) : (Builder) builder.mo22143i0(bArr);
    }

    /* renamed from: E */
    private static String m23468E(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* renamed from: F */
    static List<Long> m23469F(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i2 = 0; i2 < length; i2++) {
            long j2 = 0;
            for (int i3 = 0; i3 < 64; i3++) {
                int i4 = (i2 << 6) + i3;
                if (i4 < bitSet.length()) {
                    if (bitSet.get(i4)) {
                        j2 |= 1 << i3;
                    }
                }
            }
            arrayList.add(Long.valueOf(j2));
        }
        return arrayList;
    }

    /* renamed from: I */
    static void m23470I(zzbr.zzc.zza zzaVar, String str, Object obj) {
        List<zzbr.zze> listM21700G = zzaVar.m21700G();
        int i2 = 0;
        while (true) {
            if (i2 >= listM21700G.size()) {
                i2 = -1;
                break;
            } else if (str.equals(listM21700G.get(i2).m21733B())) {
                break;
            } else {
                i2++;
            }
        }
        zzbr.zze.zza zzaVarM21742C = zzbr.zze.m21728T().m21742C(str);
        if (obj instanceof Long) {
            zzaVarM21742C.m21741B(((Long) obj).longValue());
        } else if (obj instanceof String) {
            zzaVarM21742C.m21744E((String) obj);
        } else if (obj instanceof Double) {
            zzaVarM21742C.m21740A(((Double) obj).doubleValue());
        }
        if (i2 >= 0) {
            zzaVar.m21708w(i2, zzaVarM21742C);
        } else {
            zzaVar.m21696C(zzaVarM21742C);
        }
    }

    /* renamed from: L */
    private static void m23471L(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append("  ");
        }
    }

    /* renamed from: M */
    private final void m23472M(StringBuilder sb, int i2, zzbj.zzc zzcVar) {
        if (zzcVar == null) {
            return;
        }
        m23471L(sb, i2);
        sb.append("filter {\n");
        if (zzcVar.m21548H()) {
            m23475P(sb, i2, "complement", Boolean.valueOf(zzcVar.m21549I()));
        }
        m23475P(sb, i2, "param_name", mo22838k().m23119A(zzcVar.m21550J()));
        int i3 = i2 + 1;
        zzbj.zzf zzfVarM21545E = zzcVar.m21545E();
        if (zzfVarM21545E != null) {
            m23471L(sb, i3);
            sb.append("string_filter");
            sb.append(" {\n");
            if (zzfVarM21545E.m21582B()) {
                m23475P(sb, i3, "match_type", zzfVarM21545E.m21583C().name());
            }
            m23475P(sb, i3, "expression", zzfVarM21545E.m21585E());
            if (zzfVarM21545E.m21586F()) {
                m23475P(sb, i3, "case_sensitive", Boolean.valueOf(zzfVarM21545E.m21587G()));
            }
            if (zzfVarM21545E.m21589I() > 0) {
                m23471L(sb, i3 + 1);
                sb.append("expression_list {\n");
                for (String str : zzfVarM21545E.m21588H()) {
                    m23471L(sb, i3 + 2);
                    sb.append(str);
                    sb.append("\n");
                }
                sb.append("}\n");
            }
            m23471L(sb, i3);
            sb.append("}\n");
        }
        m23473N(sb, i3, "number_filter", zzcVar.m21547G());
        m23471L(sb, i2);
        sb.append("}\n");
    }

    /* renamed from: N */
    private final void m23473N(StringBuilder sb, int i2, String str, zzbj.zzd zzdVar) {
        if (zzdVar == null) {
            return;
        }
        m23471L(sb, i2);
        sb.append(str);
        sb.append(" {\n");
        if (zzdVar.m21554B()) {
            m23475P(sb, i2, "comparison_type", zzdVar.m21555C().name());
        }
        if (zzdVar.m21556D()) {
            m23475P(sb, i2, "match_as_float", Boolean.valueOf(zzdVar.m21557E()));
        }
        m23475P(sb, i2, "comparison_value", zzdVar.m21559G());
        m23475P(sb, i2, "min_comparison_value", zzdVar.m21561I());
        m23475P(sb, i2, "max_comparison_value", zzdVar.m21563K());
        m23471L(sb, i2);
        sb.append("}\n");
    }

    /* renamed from: O */
    private static void m23474O(StringBuilder sb, int i2, String str, zzbr.zzi zziVar, String str2) {
        if (zziVar == null) {
            return;
        }
        m23471L(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (zziVar.m22016Q() != 0) {
            m23471L(sb, 4);
            sb.append("results: ");
            int i3 = 0;
            for (Long l : zziVar.m22015N()) {
                int i4 = i3 + 1;
                if (i3 != 0) {
                    sb.append(", ");
                }
                sb.append(l);
                i3 = i4;
            }
            sb.append('\n');
        }
        if (zziVar.m22013H() != 0) {
            m23471L(sb, 4);
            sb.append("status: ");
            int i5 = 0;
            for (Long l2 : zziVar.m22012C()) {
                int i6 = i5 + 1;
                if (i5 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i5 = i6;
            }
            sb.append('\n');
        }
        if (zziVar.m22018W() != 0) {
            m23471L(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            int i7 = 0;
            for (zzbr.zzb zzbVar : zziVar.m22017U()) {
                int i8 = i7 + 1;
                if (i7 != 0) {
                    sb.append(", ");
                }
                sb.append(zzbVar.m21659F() ? Integer.valueOf(zzbVar.m21660G()) : null);
                sb.append(":");
                sb.append(zzbVar.m21661H() ? Long.valueOf(zzbVar.m21662I()) : null);
                i7 = i8;
            }
            sb.append("}\n");
        }
        if (zziVar.m22020Z() != 0) {
            m23471L(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            int i9 = 0;
            for (zzbr.zzj zzjVar : zziVar.m22019X()) {
                int i10 = i9 + 1;
                if (i9 != 0) {
                    sb.append(", ");
                }
                sb.append(zzjVar.m22041I() ? Integer.valueOf(zzjVar.m22042J()) : null);
                sb.append(": [");
                Iterator<Long> it = zzjVar.m22043L().iterator();
                int i11 = 0;
                while (it.hasNext()) {
                    long jLongValue = it.next().longValue();
                    int i12 = i11 + 1;
                    if (i11 != 0) {
                        sb.append(", ");
                    }
                    sb.append(jLongValue);
                    i11 = i12;
                }
                sb.append("]");
                i9 = i10;
            }
            sb.append("}\n");
        }
        m23471L(sb, 3);
        sb.append("}\n");
    }

    /* renamed from: P */
    private static void m23475P(StringBuilder sb, int i2, String str, Object obj) {
        if (obj == null) {
            return;
        }
        m23471L(sb, i2 + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    /* renamed from: S */
    static boolean m23476S(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* renamed from: T */
    static boolean m23477T(List<Long> list, int i2) {
        if (i2 < (list.size() << 6)) {
            return ((1 << (i2 % 64)) & list.get(i2 / 64).longValue()) != 0;
        }
        return false;
    }

    /* renamed from: U */
    static Object m23478U(zzbr.zzc zzcVar, String str) {
        zzbr.zze zzeVarM23480z = m23480z(zzcVar, str);
        if (zzeVarM23480z == null) {
            return null;
        }
        if (zzeVarM23480z.m21734M()) {
            return zzeVarM23480z.m21735N();
        }
        if (zzeVarM23480z.m21736P()) {
            return Long.valueOf(zzeVarM23480z.m21737Q());
        }
        if (zzeVarM23480z.m21738R()) {
            return Double.valueOf(zzeVarM23480z.m21739S());
        }
        return null;
    }

    /* renamed from: w */
    static int m23479w(zzbr.zzg.zza zzaVar, String str) {
        if (zzaVar == null) {
            return -1;
        }
        for (int i2 = 0; i2 < zzaVar.m21962d0(); i2++) {
            if (str.equals(zzaVar.m21960b0(i2).m22069P())) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: z */
    static zzbr.zze m23480z(zzbr.zzc zzcVar, String str) {
        for (zzbr.zze zzeVar : zzcVar.m21685C()) {
            if (zzeVar.m21733B().equals(str)) {
                return zzeVar;
            }
        }
        return null;
    }

    /* renamed from: B */
    final String m23481B(zzbj.zzb zzbVar) {
        if (zzbVar == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (zzbVar.m21524G()) {
            m23475P(sb, 0, "filter_id", Integer.valueOf(zzbVar.m21525H()));
        }
        m23475P(sb, 0, "event_name", mo22838k().m23124y(zzbVar.m21526I()));
        String strM23468E = m23468E(zzbVar.m21531N(), zzbVar.m21532O(), zzbVar.m21534Q());
        if (!strM23468E.isEmpty()) {
            m23475P(sb, 0, "filter_type", strM23468E);
        }
        m23473N(sb, 1, "event_count_filter", zzbVar.m21530M());
        sb.append("  filters {\n");
        Iterator<zzbj.zzc> it = zzbVar.m21527J().iterator();
        while (it.hasNext()) {
            m23472M(sb, 2, it.next());
        }
        m23471L(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    /* renamed from: C */
    final String m23482C(zzbj.zze zzeVar) {
        if (zzeVar == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (zzeVar.m21571D()) {
            m23475P(sb, 0, "filter_id", Integer.valueOf(zzeVar.m21572E()));
        }
        m23475P(sb, 0, "property_name", mo22838k().m23120B(zzeVar.m21573F()));
        String strM23468E = m23468E(zzeVar.m21575H(), zzeVar.m21576I(), zzeVar.m21578K());
        if (!strM23468E.isEmpty()) {
            m23475P(sb, 0, "filter_type", strM23468E);
        }
        m23472M(sb, 1, zzeVar.m21574G());
        sb.append("}\n");
        return sb.toString();
    }

    /* renamed from: D */
    final String m23483D(zzbr.zzf zzfVar) {
        List<zzbr.zze> listM21685C;
        if (zzfVar == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        for (zzbr.zzg zzgVar : zzfVar.m21752C()) {
            if (zzgVar != null) {
                m23471L(sb, 1);
                sb.append("bundle {\n");
                if (zzgVar.m21886Z()) {
                    m23475P(sb, 1, "protocol_version", Integer.valueOf(zzgVar.m21865B0()));
                }
                m23475P(sb, 1, "platform", zzgVar.m21870E2());
                if (zzgVar.m21880N2()) {
                    m23475P(sb, 1, "gmp_version", Long.valueOf(zzgVar.m21887a0()));
                }
                if (zzgVar.m21888b0()) {
                    m23475P(sb, 1, "uploading_gmp_version", Long.valueOf(zzgVar.m21890c0()));
                }
                if (zzgVar.m21882P0()) {
                    m23475P(sb, 1, "dynamite_version", Long.valueOf(zzgVar.m21883Q0()));
                }
                if (zzgVar.m21913v0()) {
                    m23475P(sb, 1, "config_version", Long.valueOf(zzgVar.m21915w0()));
                }
                m23475P(sb, 1, "gmp_app_id", zzgVar.m21903n0());
                m23475P(sb, 1, "admob_app_id", zzgVar.m21881O0());
                m23475P(sb, 1, RateAndReviewsFragment.BundleCons.APP_ID, zzgVar.m21877L2());
                m23475P(sb, 1, "app_version", zzgVar.m21878M2());
                if (zzgVar.m21910s0()) {
                    m23475P(sb, 1, "app_version_major", Integer.valueOf(zzgVar.m21911t0()));
                }
                m23475P(sb, 1, "firebase_instance_id", zzgVar.m21909r0());
                if (zzgVar.m21897h0()) {
                    m23475P(sb, 1, "dev_cert_hash", Long.valueOf(zzgVar.m21898j0()));
                }
                m23475P(sb, 1, "app_store", zzgVar.m21876K2());
                if (zzgVar.m21884R1()) {
                    m23475P(sb, 1, "upload_timestamp_millis", Long.valueOf(zzgVar.m21885S1()));
                }
                if (zzgVar.m21892d2()) {
                    m23475P(sb, 1, "start_timestamp_millis", Long.valueOf(zzgVar.m21894e2()));
                }
                if (zzgVar.m21905o2()) {
                    m23475P(sb, 1, "end_timestamp_millis", Long.valueOf(zzgVar.m21907p2()));
                }
                if (zzgVar.m21916w2()) {
                    m23475P(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(zzgVar.m21918x2()));
                }
                if (zzgVar.m21867C2()) {
                    m23475P(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(zzgVar.m21869D2()));
                }
                m23475P(sb, 1, "app_instance_id", zzgVar.m21896g0());
                m23475P(sb, 1, "resettable_device_id", zzgVar.m21891d0());
                m23475P(sb, 1, "device_id", zzgVar.m21912u0());
                m23475P(sb, 1, "ds_id", zzgVar.m21920z0());
                if (zzgVar.m21893e0()) {
                    m23475P(sb, 1, "limited_ad_tracking", Boolean.valueOf(zzgVar.m21895f0()));
                }
                m23475P(sb, 1, "os_version", zzgVar.m21871F2());
                m23475P(sb, 1, "device_model", zzgVar.m21872G2());
                m23475P(sb, 1, "user_default_language", zzgVar.m21873H2());
                if (zzgVar.m21874I2()) {
                    m23475P(sb, 1, "time_zone_offset_minutes", Integer.valueOf(zzgVar.m21875J2()));
                }
                if (zzgVar.m21899k0()) {
                    m23475P(sb, 1, "bundle_sequential_index", Integer.valueOf(zzgVar.m21900l0()));
                }
                if (zzgVar.m21904o0()) {
                    m23475P(sb, 1, "service_upload", Boolean.valueOf(zzgVar.m21906p0()));
                }
                m23475P(sb, 1, "health_monitor", zzgVar.m21902m0());
                if (zzgVar.m21917x0() && zzgVar.m21919y0() != 0) {
                    m23475P(sb, 1, "android_id", Long.valueOf(zzgVar.m21919y0()));
                }
                if (zzgVar.m21863A0()) {
                    m23475P(sb, 1, "retry_counter", Integer.valueOf(zzgVar.m21879N0()));
                }
                List<zzbr.zzk> listM21914v1 = zzgVar.m21914v1();
                if (listM21914v1 != null) {
                    for (zzbr.zzk zzkVar : listM21914v1) {
                        if (zzkVar != null) {
                            m23471L(sb, 2);
                            sb.append("user_property {\n");
                            m23475P(sb, 2, "set_timestamp_millis", zzkVar.m22067I() ? Long.valueOf(zzkVar.m22068J()) : null);
                            m23475P(sb, 2, "name", mo22838k().m23120B(zzkVar.m22069P()));
                            m23475P(sb, 2, "string_value", zzkVar.m22071S());
                            m23475P(sb, 2, "int_value", zzkVar.m22072T() ? Long.valueOf(zzkVar.m22073U()) : null);
                            m23475P(sb, 2, "double_value", zzkVar.m22074V() ? Double.valueOf(zzkVar.m22075W()) : null);
                            m23471L(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<zzbr.zza> listM21908q0 = zzgVar.m21908q0();
                String strM21877L2 = zzgVar.m21877L2();
                if (listM21908q0 != null) {
                    for (zzbr.zza zzaVar : listM21908q0) {
                        if (zzaVar != null) {
                            m23471L(sb, 2);
                            sb.append("audience_membership {\n");
                            if (zzaVar.m21640J()) {
                                m23475P(sb, 2, "audience_id", Integer.valueOf(zzaVar.m21641K()));
                            }
                            if (zzaVar.m21645O()) {
                                m23475P(sb, 2, "new_audience", Boolean.valueOf(zzaVar.m21646P()));
                            }
                            m23474O(sb, 2, "current_data", zzaVar.m21642L(), strM21877L2);
                            m23474O(sb, 2, "previous_data", zzaVar.m21644N(), strM21877L2);
                            m23471L(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<zzbr.zzc> listM21889b1 = zzgVar.m21889b1();
                if (listM21889b1 != null) {
                    for (zzbr.zzc zzcVar : listM21889b1) {
                        if (zzcVar != null) {
                            m23471L(sb, 2);
                            sb.append("event {\n");
                            m23475P(sb, 2, "name", mo22838k().m23124y(zzcVar.m21687U()));
                            if (zzcVar.m21688V()) {
                                m23475P(sb, 2, "timestamp_millis", Long.valueOf(zzcVar.m21689W()));
                            }
                            if (zzcVar.m21690X()) {
                                m23475P(sb, 2, "previous_timestamp_millis", Long.valueOf(zzcVar.m21691Z()));
                            }
                            if (zzcVar.m21692a0()) {
                                m23475P(sb, 2, "count", Integer.valueOf(zzcVar.m21693b0()));
                            }
                            if (zzcVar.m21686Q() != 0 && (listM21685C = zzcVar.m21685C()) != null) {
                                for (zzbr.zze zzeVar : listM21685C) {
                                    if (zzeVar != null) {
                                        m23471L(sb, 3);
                                        sb.append("param {\n");
                                        m23475P(sb, 3, "name", mo22838k().m23119A(zzeVar.m21733B()));
                                        m23475P(sb, 3, "string_value", zzeVar.m21735N());
                                        m23475P(sb, 3, "int_value", zzeVar.m21736P() ? Long.valueOf(zzeVar.m21737Q()) : null);
                                        m23475P(sb, 3, "double_value", zzeVar.m21738R() ? Double.valueOf(zzeVar.m21739S()) : null);
                                        m23471L(sb, 3);
                                        sb.append("}\n");
                                    }
                                }
                            }
                            m23471L(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                m23471L(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4, com.google.android.gms.measurement.internal.InterfaceC7817s4
    /* renamed from: G */
    public final /* bridge */ /* synthetic */ zzw mo22832G() {
        return super.mo22832G();
    }

    /* renamed from: H */
    final List<Long> m23484H(List<Long> list, List<Integer> list2) throws IllegalStateException {
        int i2;
        ArrayList arrayList = new ArrayList(list);
        for (Integer num : list2) {
            if (num.intValue() < 0) {
                mo22836h().m23140K().m23148b("Ignoring negative bit index to be cleared", num);
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    mo22836h().m23140K().m23149c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(iIntValue, Long.valueOf(((Long) arrayList.get(iIntValue)).longValue() & ((1 << (num.intValue() % 64)) ^ (-1))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i3 = size2;
            i2 = size;
            size = i3;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i2);
    }

    /* renamed from: J */
    final void m23485J(zzbr.zze.zza zzaVar, Object obj) {
        Preconditions.m14372k(obj);
        zzaVar.m21746w().m21743D().m21745F();
        if (obj instanceof String) {
            zzaVar.m21744E((String) obj);
            return;
        }
        if (obj instanceof Long) {
            zzaVar.m21741B(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zzaVar.m21740A(((Double) obj).doubleValue());
        } else {
            mo22836h().m23137H().m23148b("Ignoring invalid (type) event param value", obj);
        }
    }

    /* renamed from: K */
    final void m23486K(zzbr.zzk.zza zzaVar, Object obj) {
        Preconditions.m14372k(obj);
        zzaVar.m22083w().m22079D().m22082G();
        if (obj instanceof String) {
            zzaVar.m22081F((String) obj);
            return;
        }
        if (obj instanceof Long) {
            zzaVar.m22080E(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zzaVar.m22076A(((Double) obj).doubleValue());
        } else {
            mo22836h().m23137H().m23148b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* renamed from: Q */
    final boolean m23487Q(long j2, long j3) {
        return j2 == 0 || j3 <= 0 || Math.abs(mo22837j().mo14608a() - j2) > j3;
    }

    /* renamed from: R */
    final boolean m23488R(zzan zzanVar, zzm zzmVar) {
        Preconditions.m14372k(zzanVar);
        Preconditions.m14372k(zzmVar);
        if (zzjj.m22425b() && mo22841n().m23587r(zzap.f29122U0)) {
            return (TextUtils.isEmpty(zzmVar.f29402g) && TextUtils.isEmpty(zzmVar.f29418w)) ? false : true;
        }
        if (!TextUtils.isEmpty(zzmVar.f29402g) || !TextUtils.isEmpty(zzmVar.f29418w)) {
            return true;
        }
        mo22832G();
        return false;
    }

    /* renamed from: V */
    final byte[] m23489V(byte[] bArr) throws IOException {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int i2 = gZIPInputStream.read(bArr2);
                if (i2 <= 0) {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr2, 0, i2);
            }
        } catch (IOException e2) {
            mo22836h().m23137H().m23148b("Failed to ungzip content", e2);
            throw e2;
        }
    }

    /* renamed from: W */
    final byte[] m23490W(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e2) {
            mo22836h().m23137H().m23148b("Failed to gzip content", e2);
            throw e2;
        }
    }

    /* renamed from: X */
    final List<Integer> m23491X() throws NumberFormatException {
        Map<String, String> mapM23020c = zzap.m23020c(this.f28693b.mo22834f());
        if (mapM23020c == null || mapM23020c.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int iIntValue = zzap.f29119T.m23095a(null).intValue();
        for (Map.Entry<String, String> entry : mapM23020c.entrySet()) {
            if (entry.getKey().startsWith("measurement.id.")) {
                try {
                    int i2 = Integer.parseInt(entry.getValue());
                    if (i2 != 0) {
                        arrayList.add(Integer.valueOf(i2));
                        if (arrayList.size() >= iIntValue) {
                            mo22836h().m23140K().m23148b("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                            break;
                        }
                        continue;
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e2) {
                    mo22836h().m23140K().m23148b("Experiment ID NumberFormatException", e2);
                }
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return arrayList;
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

    /* renamed from: x */
    final long m23492x(byte[] bArr) {
        Preconditions.m14372k(bArr);
        mo22839l().mo22792d();
        MessageDigest messageDigestM23495A0 = zzkk.m23495A0();
        if (messageDigestM23495A0 != null) {
            return zzkk.m23517x(messageDigestM23495A0.digest(bArr));
        }
        mo22836h().m23137H().m23147a("Failed to get MD5");
        return 0L;
    }

    /* renamed from: y */
    final <T extends Parcelable> T m23493y(byte[] bArr, Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            return creator.createFromParcel(parcelObtain);
        } catch (SafeParcelReader.ParseException unused) {
            mo22836h().m23137H().m23147a("Failed to load parcelable from buffer");
            return null;
        } finally {
            parcelObtain.recycle();
        }
    }
}
