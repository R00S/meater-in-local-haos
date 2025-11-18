package com.google.gson.p215t;

import java.io.ObjectStreamException;
import java.math.BigDecimal;

/* compiled from: LazilyParsedNumber.java */
/* renamed from: com.google.gson.t.g */
/* loaded from: classes2.dex */
public final class C8594g extends Number {

    /* renamed from: f */
    private final String f32542f;

    public C8594g(String str) {
        this.f32542f = str;
    }

    private Object writeReplace() throws ObjectStreamException {
        return new BigDecimal(this.f32542f);
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.f32542f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8594g)) {
            return false;
        }
        String str = this.f32542f;
        String str2 = ((C8594g) obj).f32542f;
        return str == str2 || str.equals(str2);
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.f32542f);
    }

    public int hashCode() {
        return this.f32542f.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.f32542f);
            } catch (NumberFormatException unused) {
                return new BigDecimal(this.f32542f).intValue();
            }
        } catch (NumberFormatException unused2) {
            return (int) Long.parseLong(this.f32542f);
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.f32542f);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f32542f).longValue();
        }
    }

    public String toString() {
        return this.f32542f;
    }
}
