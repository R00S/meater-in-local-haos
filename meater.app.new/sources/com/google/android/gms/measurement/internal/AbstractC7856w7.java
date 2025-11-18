package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzbj;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.PatternSyntaxException;

/* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.w7 */
/* loaded from: classes2.dex */
abstract class AbstractC7856w7 {

    /* renamed from: a */
    String f28979a;

    /* renamed from: b */
    int f28980b;

    /* renamed from: c */
    Boolean f28981c;

    /* renamed from: d */
    Boolean f28982d;

    /* renamed from: e */
    Long f28983e;

    /* renamed from: f */
    Long f28984f;

    AbstractC7856w7(String str, int i2) {
        this.f28979a = str;
        this.f28980b = i2;
    }

    /* renamed from: b */
    static Boolean m22864b(double d2, zzbj.zzd zzdVar) {
        try {
            return m22870h(new BigDecimal(d2), zzdVar, Math.ulp(d2));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: c */
    static Boolean m22865c(long j2, zzbj.zzd zzdVar) {
        try {
            return m22870h(new BigDecimal(j2), zzdVar, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @VisibleForTesting
    /* renamed from: d */
    static Boolean m22866d(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    /* renamed from: e */
    static Boolean m22867e(String str, zzbj.zzd zzdVar) {
        if (!zzkg.m23476S(str)) {
            return null;
        }
        try {
            return m22870h(new BigDecimal(str), zzdVar, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: f */
    private static Boolean m22868f(String str, zzbj.zzf.zzb zzbVar, boolean z, String str2, List<String> list, String str3, zzet zzetVar) {
        if (str == null) {
            return null;
        }
        if (zzbVar == zzbj.zzf.zzb.IN_LIST) {
            if (list == null || list.size() == 0) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && zzbVar != zzbj.zzf.zzb.REGEXP) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (C7820s7.f28902a[zzbVar.ordinal()]) {
            case 1:
                try {
                    break;
                } catch (PatternSyntaxException unused) {
                    if (zzetVar != null) {
                        zzetVar.m23140K().m23148b("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
        }
        return null;
    }

    @VisibleForTesting
    /* renamed from: g */
    static Boolean m22869g(String str, zzbj.zzf zzfVar, zzet zzetVar) {
        List<String> list;
        Preconditions.m14372k(zzfVar);
        if (str == null || !zzfVar.m21582B() || zzfVar.m21583C() == zzbj.zzf.zzb.UNKNOWN_MATCH_TYPE) {
            return null;
        }
        zzbj.zzf.zzb zzbVarM21583C = zzfVar.m21583C();
        zzbj.zzf.zzb zzbVar = zzbj.zzf.zzb.IN_LIST;
        if (zzbVarM21583C == zzbVar) {
            if (zzfVar.m21589I() == 0) {
                return null;
            }
        } else if (!zzfVar.m21584D()) {
            return null;
        }
        zzbj.zzf.zzb zzbVarM21583C2 = zzfVar.m21583C();
        boolean zM21587G = zzfVar.m21587G();
        String strM21585E = (zM21587G || zzbVarM21583C2 == zzbj.zzf.zzb.REGEXP || zzbVarM21583C2 == zzbVar) ? zzfVar.m21585E() : zzfVar.m21585E().toUpperCase(Locale.ENGLISH);
        if (zzfVar.m21589I() == 0) {
            list = null;
        } else {
            List<String> listM21588H = zzfVar.m21588H();
            if (!zM21587G) {
                ArrayList arrayList = new ArrayList(listM21588H.size());
                Iterator<String> it = listM21588H.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().toUpperCase(Locale.ENGLISH));
                }
                listM21588H = Collections.unmodifiableList(arrayList);
            }
            list = listM21588H;
        }
        return m22868f(str, zzbVarM21583C2, zM21587G, strM21585E, list, zzbVarM21583C2 == zzbj.zzf.zzb.REGEXP ? strM21585E : null, zzetVar);
    }

    @VisibleForTesting
    /* renamed from: h */
    private static Boolean m22870h(BigDecimal bigDecimal, zzbj.zzd zzdVar, double d2) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        Preconditions.m14372k(zzdVar);
        if (zzdVar.m21554B() && zzdVar.m21555C() != zzbj.zzd.zza.UNKNOWN_COMPARISON_TYPE) {
            zzbj.zzd.zza zzaVarM21555C = zzdVar.m21555C();
            zzbj.zzd.zza zzaVar = zzbj.zzd.zza.BETWEEN;
            if (zzaVarM21555C == zzaVar) {
                if (!zzdVar.m21560H() || !zzdVar.m21562J()) {
                    return null;
                }
            } else if (!zzdVar.m21558F()) {
                return null;
            }
            zzbj.zzd.zza zzaVarM21555C2 = zzdVar.m21555C();
            if (zzdVar.m21555C() == zzaVar) {
                if (zzkg.m23476S(zzdVar.m21561I()) && zzkg.m23476S(zzdVar.m21563K())) {
                    try {
                        BigDecimal bigDecimal5 = new BigDecimal(zzdVar.m21561I());
                        bigDecimal4 = new BigDecimal(zzdVar.m21563K());
                        bigDecimal3 = bigDecimal5;
                        bigDecimal2 = null;
                    } catch (NumberFormatException unused) {
                    }
                }
                return null;
            }
            if (!zzkg.m23476S(zzdVar.m21559G())) {
                return null;
            }
            try {
                bigDecimal2 = new BigDecimal(zzdVar.m21559G());
                bigDecimal3 = null;
                bigDecimal4 = null;
            } catch (NumberFormatException unused2) {
            }
            if (zzaVarM21555C2 == zzaVar) {
                if (bigDecimal3 == null) {
                    return null;
                }
            } else if (bigDecimal2 != null) {
            }
            int i2 = C7820s7.f28903b[zzaVarM21555C2.ordinal()];
            if (i2 == 1) {
                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == -1);
            }
            if (i2 == 2) {
                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 1);
            }
            if (i2 == 3) {
                if (d2 == 0.0d) {
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                }
                if (bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d2).multiply(new BigDecimal(2)))) == 1 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d2).multiply(new BigDecimal(2)))) == -1) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
            if (i2 == 4) {
                if (bigDecimal.compareTo(bigDecimal3) != -1 && bigDecimal.compareTo(bigDecimal4) != 1) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }
        return null;
    }

    /* renamed from: a */
    abstract int mo22852a();
}
