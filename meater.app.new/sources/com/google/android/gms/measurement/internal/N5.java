package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.apptionlabs.meater_app.data.Config;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.measurement.B2;
import com.google.android.gms.internal.measurement.C2463e;
import com.google.android.gms.internal.measurement.C2530m2;
import com.google.android.gms.internal.measurement.C2546o2;
import com.google.android.gms.internal.measurement.C2554p2;
import com.google.android.gms.internal.measurement.C2562q2;
import com.google.android.gms.internal.measurement.C2569r2;
import com.google.android.gms.internal.measurement.C2571r4;
import com.google.android.gms.internal.measurement.C2585t2;
import com.google.android.gms.internal.measurement.C2601v2;
import com.google.android.gms.internal.measurement.C2609w2;
import com.google.android.gms.internal.measurement.C2625y2;
import com.google.android.gms.internal.measurement.C2633z2;
import com.google.android.gms.internal.measurement.InterfaceC2541n5;
import com.google.android.gms.internal.measurement.W6;
import com.google.android.gms.internal.measurement.e7;
import g7.C3445p;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
public final class N5 extends AbstractC2873x5 {
    N5(C2880y5 c2880y5) {
        super(c2880y5);
    }

    static Bundle C(List<C2585t2> list) {
        Bundle bundle = new Bundle();
        for (C2585t2 c2585t2 : list) {
            String strB0 = c2585t2.b0();
            if (c2585t2.e0()) {
                bundle.putDouble(strB0, c2585t2.K());
            } else if (c2585t2.f0()) {
                bundle.putFloat(strB0, c2585t2.R());
            } else if (c2585t2.i0()) {
                bundle.putString(strB0, c2585t2.c0());
            } else if (c2585t2.g0()) {
                bundle.putLong(strB0, c2585t2.W());
            }
        }
        return bundle;
    }

    private final Bundle D(Map<String, Object> map, boolean z10) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z10) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    arrayList2.add(D((Map) obj2, false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    static C2585t2 G(C2569r2 c2569r2, String str) {
        for (C2585t2 c2585t2 : c2569r2.Z()) {
            if (c2585t2.b0().equals(str)) {
                return c2585t2;
            }
        }
        return null;
    }

    static <BuilderT extends InterfaceC2541n5> BuilderT H(BuilderT buildert, byte[] bArr) {
        C2571r4 c2571r4A = C2571r4.a();
        return c2571r4A != null ? (BuilderT) buildert.a0(bArr, c2571r4A) : (BuilderT) buildert.r0(bArr);
    }

    static Object K(C2569r2 c2569r2, String str, Object obj) {
        Object objG0 = g0(c2569r2, str);
        return objG0 == null ? obj : objG0;
    }

    private static String O(boolean z10, boolean z11, boolean z12) {
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append("Dynamic ");
        }
        if (z11) {
            sb2.append("Sequence ");
        }
        if (z12) {
            sb2.append("Session-Scoped ");
        }
        return sb2.toString();
    }

    static List<Long> P(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            long j10 = 0;
            for (int i11 = 0; i11 < 64; i11++) {
                int i12 = (i10 << 6) + i11;
                if (i12 < bitSet.length()) {
                    if (bitSet.get(i12)) {
                        j10 |= 1 << i11;
                    }
                }
            }
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    private static void S(Uri.Builder builder, String str, String str2, Set<String> set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    private static void T(Uri.Builder builder, String[] strArr, Bundle bundle, Set<String> set) {
        for (String str : strArr) {
            String[] strArrSplit = str.split(",");
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[strArrSplit.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                S(builder, str3, string, set);
            }
        }
    }

    static void U(C2569r2.a aVar, String str, Object obj) {
        List<C2585t2> listO = aVar.O();
        int i10 = 0;
        while (true) {
            if (i10 >= listO.size()) {
                i10 = -1;
                break;
            } else if (str.equals(listO.get(i10).b0())) {
                break;
            } else {
                i10++;
            }
        }
        C2585t2.a aVarD = C2585t2.Y().D(str);
        if (obj instanceof Long) {
            aVarD.A(((Long) obj).longValue());
        } else if (obj instanceof String) {
            aVarD.F((String) obj);
        } else if (obj instanceof Double) {
            aVarD.w(((Double) obj).doubleValue());
        }
        if (i10 >= 0) {
            aVar.A(i10, aVarD);
        } else {
            aVar.D(aVarD);
        }
    }

    private static void X(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("  ");
        }
    }

    private final void Y(StringBuilder sb2, int i10, com.google.android.gms.internal.measurement.R1 r12) {
        if (r12 == null) {
            return;
        }
        X(sb2, i10);
        sb2.append("filter {\n");
        if (r12.R()) {
            b0(sb2, i10, "complement", Boolean.valueOf(r12.Q()));
        }
        if (r12.T()) {
            b0(sb2, i10, "param_name", g().f(r12.P()));
        }
        if (r12.U()) {
            int i11 = i10 + 1;
            com.google.android.gms.internal.measurement.U1 u1O = r12.O();
            if (u1O != null) {
                X(sb2, i11);
                sb2.append("string_filter");
                sb2.append(" {\n");
                if (u1O.S()) {
                    b0(sb2, i11, "match_type", u1O.K().name());
                }
                if (u1O.R()) {
                    b0(sb2, i11, "expression", u1O.N());
                }
                if (u1O.Q()) {
                    b0(sb2, i11, "case_sensitive", Boolean.valueOf(u1O.P()));
                }
                if (u1O.n() > 0) {
                    X(sb2, i10 + 2);
                    sb2.append("expression_list {\n");
                    for (String str : u1O.O()) {
                        X(sb2, i10 + 3);
                        sb2.append(str);
                        sb2.append("\n");
                    }
                    sb2.append("}\n");
                }
                X(sb2, i11);
                sb2.append("}\n");
            }
        }
        if (r12.S()) {
            Z(sb2, i10 + 1, "number_filter", r12.N());
        }
        X(sb2, i10);
        sb2.append("}\n");
    }

    private static void Z(StringBuilder sb2, int i10, String str, com.google.android.gms.internal.measurement.S1 s12) {
        if (s12 == null) {
            return;
        }
        X(sb2, i10);
        sb2.append(str);
        sb2.append(" {\n");
        if (s12.R()) {
            b0(sb2, i10, "comparison_type", s12.K().name());
        }
        if (s12.T()) {
            b0(sb2, i10, "match_as_float", Boolean.valueOf(s12.Q()));
        }
        if (s12.S()) {
            b0(sb2, i10, "comparison_value", s12.N());
        }
        if (s12.V()) {
            b0(sb2, i10, "min_comparison_value", s12.P());
        }
        if (s12.U()) {
            b0(sb2, i10, "max_comparison_value", s12.O());
        }
        X(sb2, i10);
        sb2.append("}\n");
    }

    private static void a0(StringBuilder sb2, int i10, String str, C2625y2 c2625y2) {
        if (c2625y2 == null) {
            return;
        }
        X(sb2, 3);
        sb2.append(str);
        sb2.append(" {\n");
        if (c2625y2.M() != 0) {
            X(sb2, 4);
            sb2.append("results: ");
            int i11 = 0;
            for (Long l10 : c2625y2.Z()) {
                int i12 = i11 + 1;
                if (i11 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l10);
                i11 = i12;
            }
            sb2.append('\n');
        }
        if (c2625y2.S() != 0) {
            X(sb2, 4);
            sb2.append("status: ");
            int i13 = 0;
            for (Long l11 : c2625y2.c0()) {
                int i14 = i13 + 1;
                if (i13 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l11);
                i13 = i14;
            }
            sb2.append('\n');
        }
        if (c2625y2.n() != 0) {
            X(sb2, 4);
            sb2.append("dynamic_filter_timestamps: {");
            int i15 = 0;
            for (C2562q2 c2562q2 : c2625y2.Y()) {
                int i16 = i15 + 1;
                if (i15 != 0) {
                    sb2.append(", ");
                }
                sb2.append(c2562q2.Q() ? Integer.valueOf(c2562q2.n()) : null);
                sb2.append(":");
                sb2.append(c2562q2.P() ? Long.valueOf(c2562q2.M()) : null);
                i15 = i16;
            }
            sb2.append("}\n");
        }
        if (c2625y2.P() != 0) {
            X(sb2, 4);
            sb2.append("sequence_filter_timestamps: {");
            int i17 = 0;
            for (C2633z2 c2633z2 : c2625y2.b0()) {
                int i18 = i17 + 1;
                if (i17 != 0) {
                    sb2.append(", ");
                }
                sb2.append(c2633z2.R() ? Integer.valueOf(c2633z2.N()) : null);
                sb2.append(": [");
                Iterator<Long> it = c2633z2.Q().iterator();
                int i19 = 0;
                while (it.hasNext()) {
                    long jLongValue = it.next().longValue();
                    int i20 = i19 + 1;
                    if (i19 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(jLongValue);
                    i19 = i20;
                }
                sb2.append("]");
                i17 = i18;
            }
            sb2.append("}\n");
        }
        X(sb2, 3);
        sb2.append("}\n");
    }

    private static void b0(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj == null) {
            return;
        }
        X(sb2, i10 + 1);
        sb2.append(str);
        sb2.append(": ");
        sb2.append(obj);
        sb2.append('\n');
    }

    private final void c0(StringBuilder sb2, int i10, List<C2585t2> list) {
        if (list == null) {
            return;
        }
        int i11 = i10 + 1;
        for (C2585t2 c2585t2 : list) {
            if (c2585t2 != null) {
                X(sb2, i11);
                sb2.append("param {\n");
                b0(sb2, i11, "name", c2585t2.h0() ? g().f(c2585t2.b0()) : null);
                b0(sb2, i11, "string_value", c2585t2.i0() ? c2585t2.c0() : null);
                b0(sb2, i11, "int_value", c2585t2.g0() ? Long.valueOf(c2585t2.W()) : null);
                b0(sb2, i11, "double_value", c2585t2.e0() ? Double.valueOf(c2585t2.K()) : null);
                if (c2585t2.U() > 0) {
                    c0(sb2, i11, c2585t2.d0());
                }
                X(sb2, i11);
                sb2.append("}\n");
            }
        }
    }

    static boolean e0(J j10, E5 e52) {
        C3445p.k(j10);
        C3445p.k(e52);
        return (TextUtils.isEmpty(e52.f34807C) && TextUtils.isEmpty(e52.f34821Q)) ? false : true;
    }

    static boolean f0(List<Long> list, int i10) {
        if (i10 < (list.size() << 6)) {
            return ((1 << (i10 % 64)) & list.get(i10 / 64).longValue()) != 0;
        }
        return false;
    }

    static Object g0(C2569r2 c2569r2, String str) {
        C2585t2 c2585t2G = G(c2569r2, str);
        if (c2585t2G == null) {
            return null;
        }
        if (c2585t2G.i0()) {
            return c2585t2G.c0();
        }
        if (c2585t2G.g0()) {
            return Long.valueOf(c2585t2G.W());
        }
        if (c2585t2G.e0()) {
            return Double.valueOf(c2585t2G.K());
        }
        if (c2585t2G.U() > 0) {
            return j0(c2585t2G.d0());
        }
        return null;
    }

    static boolean h0(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    static Bundle[] j0(List<C2585t2> list) {
        ArrayList arrayList = new ArrayList();
        for (C2585t2 c2585t2 : list) {
            if (c2585t2 != null) {
                Bundle bundle = new Bundle();
                for (C2585t2 c2585t22 : c2585t2.d0()) {
                    if (c2585t22.i0()) {
                        bundle.putString(c2585t22.b0(), c2585t22.c0());
                    } else if (c2585t22.g0()) {
                        bundle.putLong(c2585t22.b0(), c2585t22.W());
                    } else if (c2585t22.e0()) {
                        bundle.putDouble(c2585t22.b0(), c2585t22.K());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    static int z(C2609w2.a aVar, String str) {
        if (aVar == null) {
            return -1;
        }
        for (int i10 = 0; i10 < aVar.k0(); i10++) {
            if (str.equals(aVar.X0(i10).Y())) {
                return i10;
            }
        }
        return -1;
    }

    final long A(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        return B(str.getBytes(Charset.forName("UTF-8")));
    }

    final long B(byte[] bArr) throws NoSuchAlgorithmException {
        C3445p.k(bArr);
        j().n();
        MessageDigest messageDigestT0 = Q5.T0();
        if (messageDigestT0 != null) {
            return Q5.C(messageDigestT0.digest(bArr));
        }
        k().H().a("Failed to get MD5");
        return 0L;
    }

    final <T extends Parcelable> T E(byte[] bArr, Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            return creator.createFromParcel(parcelObtain);
        } catch (SafeParcelReader.ParseException unused) {
            k().H().a("Failed to load parcelable from buffer");
            return null;
        } finally {
            parcelObtain.recycle();
        }
    }

    final C2569r2 F(D d10) {
        C2569r2.a aVarC = C2569r2.W().C(d10.f34787e);
        Iterator<String> it = d10.f34788f.iterator();
        while (it.hasNext()) {
            String next = it.next();
            C2585t2.a aVarD = C2585t2.Y().D(next);
            Object objO0 = d10.f34788f.O0(next);
            C3445p.k(objO0);
            V(aVarD, objO0);
            aVarC.D(aVarD);
        }
        if (!TextUtils.isEmpty(d10.f34785c) && d10.f34788f.O0("_o") == null) {
            aVarC.E((C2585t2) ((com.google.android.gms.internal.measurement.F4) C2585t2.Y().D("_o").F(d10.f34785c).x()));
        }
        return (C2569r2) ((com.google.android.gms.internal.measurement.F4) aVarC.x());
    }

    final J I(C2463e c2463e) {
        Object obj;
        Bundle bundleD = D(c2463e.g(), true);
        String string = (!bundleD.containsKey("_o") || (obj = bundleD.get("_o")) == null) ? "app" : obj.toString();
        String strB = v7.H.b(c2463e.e());
        if (strB == null) {
            strB = c2463e.e();
        }
        return new J(strB, new F(bundleD), string, c2463e.a());
    }

    @TargetApi(Config.NEED_HELP_PROBE_TOTAL_DISCONNECTIONS_THRESHOLD)
    final C2797m5 J(String str, C2609w2.a aVar, C2569r2.a aVar2, String str2) {
        int iIndexOf;
        if (!W6.a() || !c().I(str, K.f34940Q0)) {
            return null;
        }
        long jA = b().a();
        String[] strArrSplit = c().G(str, K.f34996p0).split(",");
        HashSet hashSet = new HashSet(strArrSplit.length);
        for (String str3 : strArrSplit) {
            Objects.requireNonNull(str3);
            if (!hashSet.add(str3)) {
                throw new IllegalArgumentException("duplicate element: " + ((Object) str3));
            }
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        C2866w5 c2866w5U = u();
        String strT = c2866w5U.s().T(str);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(c2866w5U.c().G(str, K.f34982i0));
        if (TextUtils.isEmpty(strT)) {
            builder.authority(c2866w5U.c().G(str, K.f34984j0));
        } else {
            builder.authority(strT + "." + c2866w5U.c().G(str, K.f34984j0));
        }
        builder.path(c2866w5U.c().G(str, K.f34986k0));
        S(builder, "gmp_app_id", aVar.v1(), setUnmodifiableSet);
        S(builder, "gmp_version", "114010", setUnmodifiableSet);
        String strS1 = aVar.s1();
        C2763i c2763iC = c();
        Y1<Boolean> y12 = K.f34946T0;
        if (c2763iC.I(str, y12) && s().c0(str)) {
            strS1 = "";
        }
        S(builder, "app_instance_id", strS1, setUnmodifiableSet);
        S(builder, "rdid", aVar.P(), setUnmodifiableSet);
        S(builder, "bundle_id", aVar.r1(), setUnmodifiableSet);
        String strN = aVar2.N();
        String strA = v7.H.a(strN);
        if (!TextUtils.isEmpty(strA)) {
            strN = strA;
        }
        S(builder, "app_event_name", strN, setUnmodifiableSet);
        S(builder, "app_version", String.valueOf(aVar.V()), setUnmodifiableSet);
        String strW1 = aVar.w1();
        if (c().I(str, y12) && s().g0(str) && !TextUtils.isEmpty(strW1) && (iIndexOf = strW1.indexOf(".")) != -1) {
            strW1 = strW1.substring(0, iIndexOf);
        }
        S(builder, "os_version", strW1, setUnmodifiableSet);
        S(builder, "timestamp", String.valueOf(aVar2.L()), setUnmodifiableSet);
        if (aVar.T()) {
            S(builder, "lat", "1", setUnmodifiableSet);
        }
        S(builder, "privacy_sandbox_version", String.valueOf(aVar.v()), setUnmodifiableSet);
        S(builder, "trigger_uri_source", "1", setUnmodifiableSet);
        S(builder, "trigger_uri_timestamp", String.valueOf(jA), setUnmodifiableSet);
        S(builder, "request_uuid", str2, setUnmodifiableSet);
        List<C2585t2> listO = aVar2.O();
        Bundle bundle = new Bundle();
        for (C2585t2 c2585t2 : listO) {
            String strB0 = c2585t2.b0();
            if (c2585t2.e0()) {
                bundle.putString(strB0, String.valueOf(c2585t2.K()));
            } else if (c2585t2.f0()) {
                bundle.putString(strB0, String.valueOf(c2585t2.R()));
            } else if (c2585t2.i0()) {
                bundle.putString(strB0, c2585t2.c0());
            } else if (c2585t2.g0()) {
                bundle.putString(strB0, String.valueOf(c2585t2.W()));
            }
        }
        T(builder, c().G(str, K.f34994o0).split("\\|"), bundle, setUnmodifiableSet);
        List<com.google.android.gms.internal.measurement.B2> listR = aVar.R();
        Bundle bundle2 = new Bundle();
        for (com.google.android.gms.internal.measurement.B2 b22 : listR) {
            String strY = b22.Y();
            if (b22.b0()) {
                bundle2.putString(strY, String.valueOf(b22.K()));
            } else if (b22.c0()) {
                bundle2.putString(strY, String.valueOf(b22.P()));
            } else if (b22.f0()) {
                bundle2.putString(strY, b22.Z());
            } else if (b22.d0()) {
                bundle2.putString(strY, String.valueOf(b22.T()));
            }
        }
        T(builder, c().G(str, K.f34992n0).split("\\|"), bundle2, setUnmodifiableSet);
        S(builder, "dma", aVar.S() ? "1" : "0", setUnmodifiableSet);
        if (!aVar.u1().isEmpty()) {
            S(builder, "dma_cps", aVar.u1(), setUnmodifiableSet);
        }
        if (c().u(K.f34950V0) && aVar.U()) {
            C2530m2 c2530m2B0 = aVar.B0();
            if (!c2530m2B0.g0().isEmpty()) {
                S(builder, "dl_gclid", c2530m2B0.g0(), setUnmodifiableSet);
            }
            if (!c2530m2B0.f0().isEmpty()) {
                S(builder, "dl_gbraid", c2530m2B0.f0(), setUnmodifiableSet);
            }
            if (!c2530m2B0.c0().isEmpty()) {
                S(builder, "dl_gs", c2530m2B0.c0(), setUnmodifiableSet);
            }
            if (c2530m2B0.K() > 0) {
                S(builder, "dl_ss_ts", String.valueOf(c2530m2B0.K()), setUnmodifiableSet);
            }
            if (!c2530m2B0.j0().isEmpty()) {
                S(builder, "mr_gclid", c2530m2B0.j0(), setUnmodifiableSet);
            }
            if (!c2530m2B0.i0().isEmpty()) {
                S(builder, "mr_gbraid", c2530m2B0.i0(), setUnmodifiableSet);
            }
            if (!c2530m2B0.h0().isEmpty()) {
                S(builder, "mr_gs", c2530m2B0.h0(), setUnmodifiableSet);
            }
            if (c2530m2B0.O() > 0) {
                S(builder, "mr_click_ts", String.valueOf(c2530m2B0.O()), setUnmodifiableSet);
            }
        }
        return new C2797m5(builder.build().toString(), jA, 1);
    }

    final String L(com.google.android.gms.internal.measurement.Q1 q12) {
        if (q12 == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nevent_filter {\n");
        if (q12.X()) {
            b0(sb2, 0, "filter_id", Integer.valueOf(q12.N()));
        }
        b0(sb2, 0, "event_name", g().c(q12.R()));
        String strO = O(q12.T(), q12.U(), q12.V());
        if (!strO.isEmpty()) {
            b0(sb2, 0, "filter_type", strO);
        }
        if (q12.W()) {
            Z(sb2, 1, "event_count_filter", q12.Q());
        }
        if (q12.n() > 0) {
            sb2.append("  filters {\n");
            Iterator<com.google.android.gms.internal.measurement.R1> it = q12.S().iterator();
            while (it.hasNext()) {
                Y(sb2, 2, it.next());
            }
        }
        X(sb2, 1);
        sb2.append("}\n}\n");
        return sb2.toString();
    }

    final String M(com.google.android.gms.internal.measurement.T1 t12) {
        if (t12 == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nproperty_filter {\n");
        if (t12.S()) {
            b0(sb2, 0, "filter_id", Integer.valueOf(t12.n()));
        }
        b0(sb2, 0, "property_name", g().g(t12.O()));
        String strO = O(t12.P(), t12.Q(), t12.R());
        if (!strO.isEmpty()) {
            b0(sb2, 0, "filter_type", strO);
        }
        Y(sb2, 1, t12.L());
        sb2.append("}\n");
        return sb2.toString();
    }

    final String N(C2601v2 c2601v2) {
        C2546o2 c2546o2H2;
        if (c2601v2 == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nbatch {\n");
        if (c2601v2.Y()) {
            b0(sb2, 0, "upload_subdomain", c2601v2.V());
        }
        if (c2601v2.X()) {
            b0(sb2, 0, "sgtm_join_id", c2601v2.U());
        }
        for (C2609w2 c2609w2 : c2601v2.W()) {
            if (c2609w2 != null) {
                X(sb2, 1);
                sb2.append("bundle {\n");
                if (c2609w2.b1()) {
                    b0(sb2, 1, "protocol_version", Integer.valueOf(c2609w2.H1()));
                }
                if (e7.a() && c().I(c2609w2.c0(), K.f34922H0) && c2609w2.e1()) {
                    b0(sb2, 1, "session_stitching_token", c2609w2.q0());
                }
                b0(sb2, 1, "platform", c2609w2.o0());
                if (c2609w2.W0()) {
                    b0(sb2, 1, "gmp_version", Long.valueOf(c2609w2.u2()));
                }
                if (c2609w2.r1()) {
                    b0(sb2, 1, "uploading_gmp_version", Long.valueOf(c2609w2.F2()));
                }
                if (c2609w2.U0()) {
                    b0(sb2, 1, "dynamite_version", Long.valueOf(c2609w2.n2()));
                }
                if (c2609w2.N0()) {
                    b0(sb2, 1, "config_version", Long.valueOf(c2609w2.f2()));
                }
                b0(sb2, 1, "gmp_app_id", c2609w2.K());
                b0(sb2, 1, "admob_app_id", c2609w2.b0());
                b0(sb2, 1, "app_id", c2609w2.c0());
                b0(sb2, 1, "app_version", c2609w2.f0());
                if (c2609w2.J0()) {
                    b0(sb2, 1, "app_version_major", Integer.valueOf(c2609w2.B0()));
                }
                b0(sb2, 1, "firebase_instance_id", c2609w2.l0());
                if (c2609w2.S0()) {
                    b0(sb2, 1, "dev_cert_hash", Long.valueOf(c2609w2.j2()));
                }
                b0(sb2, 1, "app_store", c2609w2.e0());
                if (c2609w2.q1()) {
                    b0(sb2, 1, "upload_timestamp_millis", Long.valueOf(c2609w2.E2()));
                }
                if (c2609w2.g1()) {
                    b0(sb2, 1, "start_timestamp_millis", Long.valueOf(c2609w2.A2()));
                }
                if (c2609w2.V0()) {
                    b0(sb2, 1, "end_timestamp_millis", Long.valueOf(c2609w2.r2()));
                }
                if (c2609w2.a1()) {
                    b0(sb2, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(c2609w2.y2()));
                }
                if (c2609w2.Z0()) {
                    b0(sb2, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(c2609w2.w2()));
                }
                b0(sb2, 1, "app_instance_id", c2609w2.d0());
                b0(sb2, 1, "resettable_device_id", c2609w2.p0());
                b0(sb2, 1, "ds_id", c2609w2.k0());
                if (c2609w2.Y0()) {
                    b0(sb2, 1, "limited_ad_tracking", Boolean.valueOf(c2609w2.y0()));
                }
                b0(sb2, 1, "os_version", c2609w2.n0());
                b0(sb2, 1, "device_model", c2609w2.j0());
                b0(sb2, 1, "user_default_language", c2609w2.s0());
                if (c2609w2.i1()) {
                    b0(sb2, 1, "time_zone_offset_minutes", Integer.valueOf(c2609w2.R1()));
                }
                if (c2609w2.M0()) {
                    b0(sb2, 1, "bundle_sequential_index", Integer.valueOf(c2609w2.j1()));
                }
                if (c2609w2.R0()) {
                    b0(sb2, 1, "delivery_index", Integer.valueOf(c2609w2.u1()));
                }
                if (c2609w2.d1()) {
                    b0(sb2, 1, "service_upload", Boolean.valueOf(c2609w2.z0()));
                }
                b0(sb2, 1, "health_monitor", c2609w2.m0());
                if (c2609w2.c1()) {
                    b0(sb2, 1, "retry_counter", Integer.valueOf(c2609w2.M1()));
                }
                if (c2609w2.P0()) {
                    b0(sb2, 1, "consent_signals", c2609w2.h0());
                }
                if (c2609w2.X0()) {
                    b0(sb2, 1, "is_dma_region", Boolean.valueOf(c2609w2.x0()));
                }
                if (c2609w2.Q0()) {
                    b0(sb2, 1, "core_platform_services", c2609w2.i0());
                }
                if (c2609w2.O0()) {
                    b0(sb2, 1, "consent_diagnostics", c2609w2.g0());
                }
                if (c2609w2.h1()) {
                    b0(sb2, 1, "target_os_version", Long.valueOf(c2609w2.C2()));
                }
                if (W6.a() && c().I(c2609w2.c0(), K.f34940Q0)) {
                    b0(sb2, 1, "ad_services_version", Integer.valueOf(c2609w2.n()));
                    if (c2609w2.K0() && (c2546o2H2 = c2609w2.H2()) != null) {
                        X(sb2, 2);
                        sb2.append("attribution_eligibility_status {\n");
                        b0(sb2, 2, "eligible", Boolean.valueOf(c2546o2H2.V()));
                        b0(sb2, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(c2546o2H2.Y()));
                        b0(sb2, 2, "pre_r", Boolean.valueOf(c2546o2H2.Z()));
                        b0(sb2, 2, "r_extensions_too_old", Boolean.valueOf(c2546o2H2.b0()));
                        b0(sb2, 2, "adservices_extension_too_old", Boolean.valueOf(c2546o2H2.T()));
                        b0(sb2, 2, "ad_storage_not_allowed", Boolean.valueOf(c2546o2H2.R()));
                        b0(sb2, 2, "measurement_manager_disabled", Boolean.valueOf(c2546o2H2.X()));
                        X(sb2, 2);
                        sb2.append("}\n");
                    }
                }
                if (c2609w2.A0()) {
                    C2530m2 c2530m2G2 = c2609w2.G2();
                    X(sb2, 2);
                    sb2.append("ad_campaign_info {\n");
                    if (c2530m2G2.m0()) {
                        b0(sb2, 2, "deep_link_gclid", c2530m2G2.g0());
                    }
                    if (c2530m2G2.l0()) {
                        b0(sb2, 2, "deep_link_gbraid", c2530m2G2.f0());
                    }
                    if (c2530m2G2.k0()) {
                        b0(sb2, 2, "deep_link_gad_source", c2530m2G2.c0());
                    }
                    if (c2530m2G2.n0()) {
                        b0(sb2, 2, "deep_link_session_millis", Long.valueOf(c2530m2G2.K()));
                    }
                    if (c2530m2G2.s0()) {
                        b0(sb2, 2, "market_referrer_gclid", c2530m2G2.j0());
                    }
                    if (c2530m2G2.q0()) {
                        b0(sb2, 2, "market_referrer_gbraid", c2530m2G2.i0());
                    }
                    if (c2530m2G2.p0()) {
                        b0(sb2, 2, "market_referrer_gad_source", c2530m2G2.h0());
                    }
                    if (c2530m2G2.o0()) {
                        b0(sb2, 2, "market_referrer_click_millis", Long.valueOf(c2530m2G2.O()));
                    }
                    X(sb2, 2);
                    sb2.append("}\n");
                }
                if (c2609w2.L0()) {
                    b0(sb2, 1, "batching_timestamp_millis", Long.valueOf(c2609w2.b2()));
                }
                if (c2609w2.f1()) {
                    com.google.android.gms.internal.measurement.A2 a2K2 = c2609w2.K2();
                    X(sb2, 2);
                    sb2.append("sgtm_diagnostics {\n");
                    b0(sb2, 2, "upload_type", a2K2.Q().name());
                    b0(sb2, 2, "client_upload_eligibility", a2K2.O().name());
                    b0(sb2, 2, "service_upload_eligibility", a2K2.P().name());
                    X(sb2, 2);
                    sb2.append("}\n");
                }
                List<com.google.android.gms.internal.measurement.B2> listV0 = c2609w2.v0();
                if (listV0 != null) {
                    for (com.google.android.gms.internal.measurement.B2 b22 : listV0) {
                        if (b22 != null) {
                            X(sb2, 2);
                            sb2.append("user_property {\n");
                            b0(sb2, 2, "set_timestamp_millis", b22.e0() ? Long.valueOf(b22.V()) : null);
                            b0(sb2, 2, "name", g().g(b22.Y()));
                            b0(sb2, 2, "string_value", b22.Z());
                            b0(sb2, 2, "int_value", b22.d0() ? Long.valueOf(b22.T()) : null);
                            b0(sb2, 2, "double_value", b22.b0() ? Double.valueOf(b22.K()) : null);
                            X(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                List<C2554p2> listT0 = c2609w2.t0();
                c2609w2.c0();
                if (listT0 != null) {
                    for (C2554p2 c2554p2 : listT0) {
                        if (c2554p2 != null) {
                            X(sb2, 2);
                            sb2.append("audience_membership {\n");
                            if (c2554p2.T()) {
                                b0(sb2, 2, "audience_id", Integer.valueOf(c2554p2.n()));
                            }
                            if (c2554p2.U()) {
                                b0(sb2, 2, "new_audience", Boolean.valueOf(c2554p2.S()));
                            }
                            a0(sb2, 2, "current_data", c2554p2.Q());
                            if (c2554p2.V()) {
                                a0(sb2, 2, "previous_data", c2554p2.R());
                            }
                            X(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                List<C2569r2> listU0 = c2609w2.u0();
                if (listU0 != null) {
                    for (C2569r2 c2569r2 : listU0) {
                        if (c2569r2 != null) {
                            X(sb2, 2);
                            sb2.append("event {\n");
                            b0(sb2, 2, "name", g().c(c2569r2.Y()));
                            if (c2569r2.d0()) {
                                b0(sb2, 2, "timestamp_millis", Long.valueOf(c2569r2.V()));
                            }
                            if (c2569r2.c0()) {
                                b0(sb2, 2, "previous_timestamp_millis", Long.valueOf(c2569r2.U()));
                            }
                            if (c2569r2.b0()) {
                                b0(sb2, 2, "count", Integer.valueOf(c2569r2.n()));
                            }
                            if (c2569r2.S() != 0) {
                                c0(sb2, 2, c2569r2.Z());
                            }
                            X(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                X(sb2, 1);
                sb2.append("}\n");
            }
        }
        sb2.append("} // End-of-batch\n");
        return sb2.toString();
    }

    final List<Long> Q(List<Long> list, List<Integer> list2) {
        int i10;
        ArrayList arrayList = new ArrayList(list);
        for (Integer num : list2) {
            if (num.intValue() < 0) {
                k().M().b("Ignoring negative bit index to be cleared", num);
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    k().M().c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(iIntValue, Long.valueOf(((Long) arrayList.get(iIntValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i11 = size2;
            i10 = size;
            size = i11;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i10);
    }

    final Map<String, Object> R(Bundle bundle, boolean z10) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z11 = obj instanceof Parcelable[];
            if (z11 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z10) {
                    ArrayList arrayList = new ArrayList();
                    if (z11) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(R((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj2 = arrayList2.get(i10);
                            i10++;
                            if (obj2 instanceof Bundle) {
                                arrayList.add(R((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(R((Bundle) obj, false));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }

    final void V(C2585t2.a aVar, Object obj) {
        C3445p.k(obj);
        aVar.I().G().E().H();
        if (obj instanceof String) {
            aVar.F((String) obj);
            return;
        }
        if (obj instanceof Long) {
            aVar.A(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            aVar.w(((Double) obj).doubleValue());
            return;
        }
        if (!(obj instanceof Bundle[])) {
            k().H().b("Ignoring invalid (type) event param value", obj);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                C2585t2.a aVarY = C2585t2.Y();
                for (String str : bundle.keySet()) {
                    C2585t2.a aVarD = C2585t2.Y().D(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        aVarD.A(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        aVarD.F((String) obj2);
                    } else if (obj2 instanceof Double) {
                        aVarD.w(((Double) obj2).doubleValue());
                    }
                    aVarY.B(aVarD);
                }
                if (aVarY.v() > 0) {
                    arrayList.add((C2585t2) ((com.google.android.gms.internal.measurement.F4) aVarY.x()));
                }
            }
        }
        aVar.C(arrayList);
    }

    final void W(B2.a aVar, Object obj) {
        C3445p.k(obj);
        aVar.F().C().v();
        if (obj instanceof String) {
            aVar.E((String) obj);
            return;
        }
        if (obj instanceof Long) {
            aVar.A(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            aVar.w(((Double) obj).doubleValue());
        } else {
            k().H().b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3, com.google.android.gms.measurement.internal.InterfaceC2809o3
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3, com.google.android.gms.measurement.internal.InterfaceC2809o3
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.util.e b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ C2763i c() {
        return super.c();
    }

    final boolean d0(long j10, long j11) {
        return j10 == 0 || j11 <= 0 || Math.abs(b().a() - j10) > j11;
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ E e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3, com.google.android.gms.measurement.internal.InterfaceC2809o3
    public final /* bridge */ /* synthetic */ C2742f f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ C2738e2 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ C2835s2 h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ C2747f4 i() {
        return super.i();
    }

    final byte[] i0(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            k().H().b("Failed to gzip content", e10);
            throw e10;
        }
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ Q5 j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3, com.google.android.gms.measurement.internal.InterfaceC2809o3
    public final /* bridge */ /* synthetic */ C2759h2 k() {
        return super.k();
    }

    final byte[] k0(byte[] bArr) throws IOException {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int i10 = gZIPInputStream.read(bArr2);
                if (i10 <= 0) {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr2, 0, i10);
            }
        } catch (IOException e10) {
            k().H().b("Failed to ungzip content", e10);
            throw e10;
        }
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    final List<Integer> l0() throws NumberFormatException {
        Map<String, String> mapE = K.e(this.f35538b.a());
        if (mapE == null || mapE.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int iIntValue = K.f34960a0.a(null).intValue();
        for (Map.Entry<String, String> entry : mapE.entrySet()) {
            if (entry.getKey().startsWith("measurement.id.")) {
                try {
                    int i10 = Integer.parseInt(entry.getValue());
                    if (i10 != 0) {
                        arrayList.add(Integer.valueOf(i10));
                        if (arrayList.size() >= iIntValue) {
                            k().M().b("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                            break;
                        }
                        continue;
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e10) {
                    k().M().b("Experiment ID NumberFormatException", e10);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3, com.google.android.gms.measurement.internal.InterfaceC2809o3
    public final /* bridge */ /* synthetic */ J2 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.C2825q5
    public final /* bridge */ /* synthetic */ N5 p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.C2825q5
    public final /* bridge */ /* synthetic */ Y5 q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.C2825q5
    public final /* bridge */ /* synthetic */ C2812p r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.C2825q5
    public final /* bridge */ /* synthetic */ C2 s() {
        return super.s();
    }

    @Override // com.google.android.gms.measurement.internal.C2825q5
    public final /* bridge */ /* synthetic */ Y4 t() {
        return super.t();
    }

    @Override // com.google.android.gms.measurement.internal.C2825q5
    public final /* bridge */ /* synthetic */ C2866w5 u() {
        return super.u();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2873x5
    protected final boolean y() {
        return false;
    }
}
