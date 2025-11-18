package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2511k implements InterfaceC2574s {

    /* renamed from: B, reason: collision with root package name */
    private final Double f34174B;

    public C2511k(Double d10) {
        if (d10 == null) {
            this.f34174B = Double.valueOf(Double.NaN);
        } else {
            this.f34174B = d10;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2574s
    public final InterfaceC2574s d() {
        return new C2511k(this.f34174B);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2511k) {
            return this.f34174B.equals(((C2511k) obj).f34174B);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2574s
    public final Boolean f() {
        return Boolean.valueOf((Double.isNaN(this.f34174B.doubleValue()) || this.f34174B.doubleValue() == 0.0d) ? false : true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2574s
    public final Double h() {
        return this.f34174B;
    }

    public final int hashCode() {
        return this.f34174B.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2574s
    public final String i() throws NumberFormatException {
        if (Double.isNaN(this.f34174B.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(this.f34174B.doubleValue())) {
            return this.f34174B.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(this.f34174B.doubleValue());
        BigDecimal bigDecimal = bigDecimalValueOf.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : C2503j.a(bigDecimalValueOf);
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((bigDecimal.scale() > 0 ? bigDecimal.precision() : bigDecimal.scale()) - 1);
        String str = decimalFormat.format(bigDecimal);
        int iIndexOf = str.indexOf("E");
        if (iIndexOf <= 0) {
            return str;
        }
        int i10 = Integer.parseInt(str.substring(iIndexOf + 1));
        return ((i10 >= 0 || i10 <= -7) && (i10 < 0 || i10 >= 21)) ? str.replace("E-", "e-").replace("E", "e+") : bigDecimal.toPlainString();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2574s
    public final Iterator<InterfaceC2574s> j() {
        return null;
    }

    public final String toString() {
        return i();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2574s
    public final InterfaceC2574s v(String str, Z2 z22, List<InterfaceC2574s> list) {
        if ("toString".equals(str)) {
            return new C2590u(i());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", i(), str));
    }
}
