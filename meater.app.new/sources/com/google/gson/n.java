package com.google.gson;

import java.math.BigInteger;
import java.util.Objects;

/* compiled from: JsonPrimitive.java */
/* loaded from: classes2.dex */
public final class n extends j {

    /* renamed from: B, reason: collision with root package name */
    private final Object f39119B;

    public n(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f39119B = bool;
    }

    private static boolean E(n nVar) {
        Object obj = nVar.f39119B;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public long A() {
        return F() ? B().longValue() : Long.parseLong(v());
    }

    public Number B() {
        Object obj = this.f39119B;
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            return new com.google.gson.internal.f((String) obj);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public boolean D() {
        return this.f39119B instanceof Boolean;
    }

    public boolean F() {
        return this.f39119B instanceof Number;
    }

    public boolean G() {
        return this.f39119B instanceof String;
    }

    @Override // com.google.gson.j
    public boolean c() {
        return D() ? ((Boolean) this.f39119B).booleanValue() : Boolean.parseBoolean(v());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f39119B == null) {
            return nVar.f39119B == null;
        }
        if (E(this) && E(nVar)) {
            return B().longValue() == nVar.B().longValue();
        }
        Object obj2 = this.f39119B;
        if (!(obj2 instanceof Number) || !(nVar.f39119B instanceof Number)) {
            return obj2.equals(nVar.f39119B);
        }
        double dDoubleValue = B().doubleValue();
        double dDoubleValue2 = nVar.B().doubleValue();
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    @Override // com.google.gson.j
    public double f() {
        return F() ? B().doubleValue() : Double.parseDouble(v());
    }

    @Override // com.google.gson.j
    public int h() {
        return F() ? B().intValue() : Integer.parseInt(v());
    }

    public int hashCode() {
        long jDoubleToLongBits;
        if (this.f39119B == null) {
            return 31;
        }
        if (E(this)) {
            jDoubleToLongBits = B().longValue();
        } else {
            Object obj = this.f39119B;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(B().doubleValue());
        }
        return (int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits);
    }

    @Override // com.google.gson.j
    public String v() {
        Object obj = this.f39119B;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (F()) {
            return B().toString();
        }
        if (D()) {
            return ((Boolean) this.f39119B).toString();
        }
        throw new AssertionError("Unexpected value type: " + this.f39119B.getClass());
    }

    public n(Number number) {
        Objects.requireNonNull(number);
        this.f39119B = number;
    }

    public n(String str) {
        Objects.requireNonNull(str);
        this.f39119B = str;
    }
}
