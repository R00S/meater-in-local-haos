package com.google.gson;

import com.google.gson.p215t.C8588a;
import com.google.gson.p215t.C8594g;
import java.math.BigInteger;

/* compiled from: JsonPrimitive.java */
/* renamed from: com.google.gson.m */
/* loaded from: classes2.dex */
public final class C8574m extends AbstractC8571j {

    /* renamed from: a */
    private static final Class<?>[] f32451a = {Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};

    /* renamed from: b */
    private Object f32452b;

    public C8574m(Boolean bool) {
        m26966D(bool);
    }

    /* renamed from: A */
    private static boolean m26963A(Object obj) {
        if (obj instanceof String) {
            return true;
        }
        Class<?> cls = obj.getClass();
        for (Class<?> cls2 : f32451a) {
            if (cls2.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: y */
    private static boolean m26964y(C8574m c8574m) {
        Object obj = c8574m.f32452b;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    /* renamed from: C */
    public boolean m26965C() {
        return this.f32452b instanceof String;
    }

    /* renamed from: D */
    void m26966D(Object obj) {
        if (obj instanceof Character) {
            this.f32452b = String.valueOf(((Character) obj).charValue());
        } else {
            C8588a.m27044a((obj instanceof Number) || m26963A(obj));
            this.f32452b = obj;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8574m.class != obj.getClass()) {
            return false;
        }
        C8574m c8574m = (C8574m) obj;
        if (this.f32452b == null) {
            return c8574m.f32452b == null;
        }
        if (m26964y(this) && m26964y(c8574m)) {
            return m26972v().longValue() == c8574m.m26972v().longValue();
        }
        Object obj2 = this.f32452b;
        if (!(obj2 instanceof Number) || !(c8574m.f32452b instanceof Number)) {
            return obj2.equals(c8574m.f32452b);
        }
        double dDoubleValue = m26972v().doubleValue();
        double dDoubleValue2 = c8574m.m26972v().doubleValue();
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    public int hashCode() {
        long jDoubleToLongBits;
        if (this.f32452b == null) {
            return 31;
        }
        if (m26964y(this)) {
            jDoubleToLongBits = m26972v().longValue();
        } else {
            Object obj = this.f32452b;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(m26972v().doubleValue());
        }
        return (int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits);
    }

    /* renamed from: q */
    public boolean m26967q() {
        return m26974x() ? m26968r().booleanValue() : Boolean.parseBoolean(m26973w());
    }

    /* renamed from: r */
    Boolean m26968r() {
        return (Boolean) this.f32452b;
    }

    /* renamed from: s */
    public double m26969s() {
        return m26975z() ? m26972v().doubleValue() : Double.parseDouble(m26973w());
    }

    /* renamed from: t */
    public int m26970t() {
        return m26975z() ? m26972v().intValue() : Integer.parseInt(m26973w());
    }

    /* renamed from: u */
    public long m26971u() {
        return m26975z() ? m26972v().longValue() : Long.parseLong(m26973w());
    }

    /* renamed from: v */
    public Number m26972v() {
        Object obj = this.f32452b;
        return obj instanceof String ? new C8594g((String) this.f32452b) : (Number) obj;
    }

    /* renamed from: w */
    public String m26973w() {
        return m26975z() ? m26972v().toString() : m26974x() ? m26968r().toString() : (String) this.f32452b;
    }

    /* renamed from: x */
    public boolean m26974x() {
        return this.f32452b instanceof Boolean;
    }

    /* renamed from: z */
    public boolean m26975z() {
        return this.f32452b instanceof Number;
    }

    public C8574m(Number number) {
        m26966D(number);
    }

    public C8574m(String str) {
        m26966D(str);
    }
}
