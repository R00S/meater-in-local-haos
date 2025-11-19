package com.google.gson.internal;

import java.math.BigDecimal;

/* compiled from: LazilyParsedNumber.java */
/* loaded from: classes2.dex */
public final class f extends Number {

    /* renamed from: B, reason: collision with root package name */
    private final String f39066B;

    public f(String str) {
        this.f39066B = str;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.f39066B);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        String str = this.f39066B;
        String str2 = ((f) obj).f39066B;
        return str == str2 || str.equals(str2);
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.f39066B);
    }

    public int hashCode() {
        return this.f39066B.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.f39066B);
            } catch (NumberFormatException unused) {
                return new BigDecimal(this.f39066B).intValue();
            }
        } catch (NumberFormatException unused2) {
            return (int) Long.parseLong(this.f39066B);
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.f39066B);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f39066B).longValue();
        }
    }

    public String toString() {
        return this.f39066B;
    }
}
