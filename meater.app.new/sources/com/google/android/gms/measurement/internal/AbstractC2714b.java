package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.S1;
import com.google.android.gms.internal.measurement.U1;
import g7.C3445p;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.PatternSyntaxException;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2714b {

    /* renamed from: a, reason: collision with root package name */
    String f35272a;

    /* renamed from: b, reason: collision with root package name */
    int f35273b;

    /* renamed from: c, reason: collision with root package name */
    Boolean f35274c;

    /* renamed from: d, reason: collision with root package name */
    Boolean f35275d;

    /* renamed from: e, reason: collision with root package name */
    Long f35276e;

    /* renamed from: f, reason: collision with root package name */
    Long f35277f;

    AbstractC2714b(String str, int i10) {
        this.f35272a = str;
        this.f35273b = i10;
    }

    static Boolean b(double d10, com.google.android.gms.internal.measurement.S1 s12) {
        try {
            return h(new BigDecimal(d10), s12, Math.ulp(d10));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean c(long j10, com.google.android.gms.internal.measurement.S1 s12) {
        try {
            return h(new BigDecimal(j10), s12, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean d(Boolean bool, boolean z10) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z10);
    }

    static Boolean e(String str, com.google.android.gms.internal.measurement.S1 s12) {
        if (!N5.h0(str)) {
            return null;
        }
        try {
            return h(new BigDecimal(str), s12, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static Boolean f(String str, U1.a aVar, boolean z10, String str2, List<String> list, String str3, C2759h2 c2759h2) {
        if (str == null) {
            return null;
        }
        if (aVar == U1.a.IN_LIST) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z10 && aVar != U1.a.REGEXP) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (X5.f35211a[aVar.ordinal()]) {
            case 1:
                if (str3 != null) {
                    try {
                        break;
                    } catch (PatternSyntaxException unused) {
                        if (c2759h2 != null) {
                            c2759h2.M().b("Invalid regular expression in REGEXP audience filter. expression", str3);
                        }
                        return null;
                    }
                }
                break;
            case 6:
                if (list != null) {
                    break;
                }
                break;
        }
        return null;
    }

    static Boolean g(String str, com.google.android.gms.internal.measurement.U1 u12, C2759h2 c2759h2) {
        List<String> list;
        C3445p.k(u12);
        if (str == null || !u12.S() || u12.K() == U1.a.UNKNOWN_MATCH_TYPE) {
            return null;
        }
        U1.a aVarK = u12.K();
        U1.a aVar = U1.a.IN_LIST;
        if (aVarK == aVar) {
            if (u12.n() == 0) {
                return null;
            }
        } else if (!u12.R()) {
            return null;
        }
        U1.a aVarK2 = u12.K();
        boolean zP = u12.P();
        String strN = (zP || aVarK2 == U1.a.REGEXP || aVarK2 == aVar) ? u12.N() : u12.N().toUpperCase(Locale.ENGLISH);
        if (u12.n() == 0) {
            list = null;
        } else {
            List<String> listO = u12.O();
            if (!zP) {
                ArrayList arrayList = new ArrayList(listO.size());
                Iterator<String> it = listO.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().toUpperCase(Locale.ENGLISH));
                }
                listO = Collections.unmodifiableList(arrayList);
            }
            list = listO;
        }
        return f(str, aVarK2, zP, strN, list, aVarK2 == U1.a.REGEXP ? strN : null, c2759h2);
    }

    private static Boolean h(BigDecimal bigDecimal, com.google.android.gms.internal.measurement.S1 s12, double d10) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        C3445p.k(s12);
        if (s12.R() && s12.K() != S1.a.UNKNOWN_COMPARISON_TYPE) {
            S1.a aVarK = s12.K();
            S1.a aVar = S1.a.BETWEEN;
            if (aVarK == aVar) {
                if (!s12.V() || !s12.U()) {
                    return null;
                }
            } else if (!s12.S()) {
                return null;
            }
            S1.a aVarK2 = s12.K();
            if (s12.K() == aVar) {
                if (N5.h0(s12.P()) && N5.h0(s12.O())) {
                    try {
                        BigDecimal bigDecimal5 = new BigDecimal(s12.P());
                        bigDecimal4 = new BigDecimal(s12.O());
                        bigDecimal3 = bigDecimal5;
                        bigDecimal2 = null;
                    } catch (NumberFormatException unused) {
                    }
                }
                return null;
            }
            if (!N5.h0(s12.N())) {
                return null;
            }
            try {
                bigDecimal2 = new BigDecimal(s12.N());
                bigDecimal3 = null;
                bigDecimal4 = null;
            } catch (NumberFormatException unused2) {
            }
            if (aVarK2 == aVar) {
                if (bigDecimal3 == null) {
                    return null;
                }
            } else if (bigDecimal2 != null) {
            }
            int i10 = X5.f35212b[aVarK2.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4 || bigDecimal3 == null) {
                            return null;
                        }
                        if (bigDecimal.compareTo(bigDecimal3) >= 0 && bigDecimal.compareTo(bigDecimal4) <= 0) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    }
                    if (bigDecimal2 != null) {
                        if (d10 == 0.0d) {
                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                        }
                        if (bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d10).multiply(new BigDecimal(2)))) > 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d10).multiply(new BigDecimal(2)))) < 0) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    }
                } else if (bigDecimal2 != null) {
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                }
            } else if (bigDecimal2 != null) {
                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
            }
        }
        return null;
    }

    abstract int a();

    abstract boolean i();

    abstract boolean j();
}
