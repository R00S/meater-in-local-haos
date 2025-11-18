package com.squareup.moshi;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: JsonValueWriter.java */
/* renamed from: com.squareup.moshi.n */
/* loaded from: classes2.dex */
final class C8724n extends AbstractC8725o {

    /* renamed from: o */
    Object[] f33141o = new Object[32];

    /* renamed from: p */
    private String f33142p;

    C8724n() {
        m27781z(6);
    }

    /* renamed from: T */
    private C8724n m27768T(Object obj) {
        String str;
        Object objPut;
        int iM27779x = m27779x();
        int i2 = this.f33143f;
        if (i2 == 1) {
            if (iM27779x != 6) {
                throw new IllegalStateException("JSON must have only one top-level value.");
            }
            this.f33144g[i2 - 1] = 7;
            this.f33141o[i2 - 1] = obj;
        } else if (iM27779x != 3 || (str = this.f33142p) == null) {
            if (iM27779x != 1) {
                if (iM27779x == 9) {
                    throw new IllegalStateException("Sink from valueSink() was not closed");
                }
                throw new IllegalStateException("Nesting problem.");
            }
            ((List) this.f33141o[i2 - 1]).add(obj);
        } else {
            if ((obj != null || this.f33149l) && (objPut = ((Map) this.f33141o[i2 - 1]).put(str, obj)) != null) {
                throw new IllegalArgumentException("Map key '" + this.f33142p + "' has multiple values at path " + m27776g() + ": " + objPut + " and " + obj);
            }
            this.f33142p = null;
        }
        return this;
    }

    @Override // com.squareup.moshi.AbstractC8725o
    /* renamed from: I */
    public AbstractC8725o mo27751I(double d2) throws IOException {
        if (!this.f33148k && (Double.isNaN(d2) || d2 == Double.NEGATIVE_INFINITY || d2 == Double.POSITIVE_INFINITY)) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d2);
        }
        if (this.f33150m) {
            this.f33150m = false;
            return mo27760l(Double.toString(d2));
        }
        m27768T(Double.valueOf(d2));
        int[] iArr = this.f33146i;
        int i2 = this.f33143f - 1;
        iArr[i2] = iArr[i2] + 1;
        return this;
    }

    @Override // com.squareup.moshi.AbstractC8725o
    /* renamed from: J */
    public AbstractC8725o mo27752J(long j2) throws IOException {
        if (this.f33150m) {
            this.f33150m = false;
            return mo27760l(Long.toString(j2));
        }
        m27768T(Long.valueOf(j2));
        int[] iArr = this.f33146i;
        int i2 = this.f33143f - 1;
        iArr[i2] = iArr[i2] + 1;
        return this;
    }

    @Override // com.squareup.moshi.AbstractC8725o
    /* renamed from: K */
    public AbstractC8725o mo27753K(Number number) throws IOException {
        if ((number instanceof Byte) || (number instanceof Short) || (number instanceof Integer) || (number instanceof Long)) {
            return mo27752J(number.longValue());
        }
        if ((number instanceof Float) || (number instanceof Double)) {
            return mo27751I(number.doubleValue());
        }
        if (number == null) {
            return mo27761m();
        }
        BigDecimal bigDecimal = number instanceof BigDecimal ? (BigDecimal) number : new BigDecimal(number.toString());
        if (this.f33150m) {
            this.f33150m = false;
            return mo27760l(bigDecimal.toString());
        }
        m27768T(bigDecimal);
        int[] iArr = this.f33146i;
        int i2 = this.f33143f - 1;
        iArr[i2] = iArr[i2] + 1;
        return this;
    }

    @Override // com.squareup.moshi.AbstractC8725o
    /* renamed from: N */
    public AbstractC8725o mo27754N(String str) throws IOException {
        if (this.f33150m) {
            this.f33150m = false;
            return mo27760l(str);
        }
        m27768T(str);
        int[] iArr = this.f33146i;
        int i2 = this.f33143f - 1;
        iArr[i2] = iArr[i2] + 1;
        return this;
    }

    @Override // com.squareup.moshi.AbstractC8725o
    /* renamed from: Q */
    public AbstractC8725o mo27755Q(boolean z) throws IOException {
        if (this.f33150m) {
            throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + m27776g());
        }
        m27768T(Boolean.valueOf(z));
        int[] iArr = this.f33146i;
        int i2 = this.f33143f - 1;
        iArr[i2] = iArr[i2] + 1;
        return this;
    }

    /* renamed from: W */
    public Object m27769W() {
        int i2 = this.f33143f;
        if (i2 > 1 || (i2 == 1 && this.f33144g[i2 - 1] != 7)) {
            throw new IllegalStateException("Incomplete document");
        }
        return this.f33141o[0];
    }

    @Override // com.squareup.moshi.AbstractC8725o
    /* renamed from: a */
    public AbstractC8725o mo27756a() throws IOException {
        if (this.f33150m) {
            throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + m27776g());
        }
        int i2 = this.f33143f;
        int i3 = this.f33151n;
        if (i2 == i3 && this.f33144g[i2 - 1] == 1) {
            this.f33151n = i3 ^ (-1);
            return this;
        }
        m27774c();
        ArrayList arrayList = new ArrayList();
        m27768T(arrayList);
        Object[] objArr = this.f33141o;
        int i4 = this.f33143f;
        objArr[i4] = arrayList;
        this.f33146i[i4] = 0;
        m27781z(1);
        return this;
    }

    @Override // com.squareup.moshi.AbstractC8725o
    /* renamed from: b */
    public AbstractC8725o mo27757b() throws IOException {
        if (this.f33150m) {
            throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + m27776g());
        }
        int i2 = this.f33143f;
        int i3 = this.f33151n;
        if (i2 == i3 && this.f33144g[i2 - 1] == 3) {
            this.f33151n = i3 ^ (-1);
            return this;
        }
        m27774c();
        C8726p c8726p = new C8726p();
        m27768T(c8726p);
        this.f33141o[this.f33143f] = c8726p;
        m27781z(3);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        int i2 = this.f33143f;
        if (i2 > 1 || (i2 == 1 && this.f33144g[i2 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f33143f = 0;
    }

    @Override // com.squareup.moshi.AbstractC8725o
    /* renamed from: d */
    public AbstractC8725o mo27758d() throws IOException {
        if (m27779x() != 1) {
            throw new IllegalStateException("Nesting problem.");
        }
        int i2 = this.f33143f;
        int i3 = this.f33151n;
        if (i2 == (i3 ^ (-1))) {
            this.f33151n = i3 ^ (-1);
            return this;
        }
        int i4 = i2 - 1;
        this.f33143f = i4;
        this.f33141o[i4] = null;
        int[] iArr = this.f33146i;
        int i5 = i4 - 1;
        iArr[i5] = iArr[i5] + 1;
        return this;
    }

    @Override // com.squareup.moshi.AbstractC8725o
    /* renamed from: e */
    public AbstractC8725o mo27759e() throws IOException {
        if (m27779x() != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f33142p != null) {
            throw new IllegalStateException("Dangling name: " + this.f33142p);
        }
        int i2 = this.f33143f;
        int i3 = this.f33151n;
        if (i2 == (i3 ^ (-1))) {
            this.f33151n = i3 ^ (-1);
            return this;
        }
        this.f33150m = false;
        int i4 = i2 - 1;
        this.f33143f = i4;
        this.f33141o[i4] = null;
        this.f33145h[i4] = null;
        int[] iArr = this.f33146i;
        int i5 = i4 - 1;
        iArr[i5] = iArr[i5] + 1;
        return this;
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f33143f == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    @Override // com.squareup.moshi.AbstractC8725o
    /* renamed from: l */
    public AbstractC8725o mo27760l(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f33143f == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        if (m27779x() != 3 || this.f33142p != null || this.f33150m) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.f33142p = str;
        this.f33145h[this.f33143f - 1] = str;
        return this;
    }

    @Override // com.squareup.moshi.AbstractC8725o
    /* renamed from: m */
    public AbstractC8725o mo27761m() throws IOException {
        if (this.f33150m) {
            throw new IllegalStateException("null cannot be used as a map key in JSON at path " + m27776g());
        }
        m27768T(null);
        int[] iArr = this.f33146i;
        int i2 = this.f33143f - 1;
        iArr[i2] = iArr[i2] + 1;
        return this;
    }
}
