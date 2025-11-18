package com.google.gson.p215t.p216n;

import com.google.gson.C8568g;
import com.google.gson.C8572k;
import com.google.gson.C8573l;
import com.google.gson.C8574m;
import com.google.gson.stream.C8585a;
import com.google.gson.stream.EnumC8586b;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map;

/* compiled from: JsonTreeReader.java */
/* renamed from: com.google.gson.t.n.e */
/* loaded from: classes2.dex */
public final class C8605e extends C8585a {

    /* renamed from: v */
    private static final Reader f32586v = new a();

    /* renamed from: w */
    private static final Object f32587w = new Object();

    /* renamed from: A */
    private int[] f32588A;

    /* renamed from: x */
    private Object[] f32589x;

    /* renamed from: y */
    private int f32590y;

    /* renamed from: z */
    private String[] f32591z;

    /* compiled from: JsonTreeReader.java */
    /* renamed from: com.google.gson.t.n.e$a */
    static class a extends Reader {
        a() {
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i2, int i3) throws IOException {
            throw new AssertionError();
        }
    }

    /* renamed from: E0 */
    private void m27122E0(Object obj) {
        int i2 = this.f32590y;
        Object[] objArr = this.f32589x;
        if (i2 == objArr.length) {
            Object[] objArr2 = new Object[i2 * 2];
            int[] iArr = new int[i2 * 2];
            String[] strArr = new String[i2 * 2];
            System.arraycopy(objArr, 0, objArr2, 0, i2);
            System.arraycopy(this.f32588A, 0, iArr, 0, this.f32590y);
            System.arraycopy(this.f32591z, 0, strArr, 0, this.f32590y);
            this.f32589x = objArr2;
            this.f32588A = iArr;
            this.f32591z = strArr;
        }
        Object[] objArr3 = this.f32589x;
        int i3 = this.f32590y;
        this.f32590y = i3 + 1;
        objArr3[i3] = obj;
    }

    /* renamed from: q0 */
    private void m27123q0(EnumC8586b enumC8586b) throws IOException {
        if (mo27001Q() == enumC8586b) {
            return;
        }
        throw new IllegalStateException("Expected " + enumC8586b + " but was " + mo27001Q() + m27125x());
    }

    /* renamed from: t0 */
    private Object m27124t0() {
        return this.f32589x[this.f32590y - 1];
    }

    /* renamed from: x */
    private String m27125x() {
        return " at path " + mo27007g();
    }

    /* renamed from: x0 */
    private Object m27126x0() {
        Object[] objArr = this.f32589x;
        int i2 = this.f32590y - 1;
        this.f32590y = i2;
        Object obj = objArr[i2];
        objArr[i2] = null;
        return obj;
    }

    @Override // com.google.gson.stream.C8585a
    /* renamed from: A */
    public int mo26996A() throws IOException {
        EnumC8586b enumC8586bMo27001Q = mo27001Q();
        EnumC8586b enumC8586b = EnumC8586b.NUMBER;
        if (enumC8586bMo27001Q != enumC8586b && enumC8586bMo27001Q != EnumC8586b.STRING) {
            throw new IllegalStateException("Expected " + enumC8586b + " but was " + enumC8586bMo27001Q + m27125x());
        }
        int iM26970t = ((C8574m) m27124t0()).m26970t();
        m27126x0();
        int i2 = this.f32590y;
        if (i2 > 0) {
            int[] iArr = this.f32588A;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return iM26970t;
    }

    @Override // com.google.gson.stream.C8585a
    /* renamed from: B */
    public long mo26997B() throws IOException {
        EnumC8586b enumC8586bMo27001Q = mo27001Q();
        EnumC8586b enumC8586b = EnumC8586b.NUMBER;
        if (enumC8586bMo27001Q != enumC8586b && enumC8586bMo27001Q != EnumC8586b.STRING) {
            throw new IllegalStateException("Expected " + enumC8586b + " but was " + enumC8586bMo27001Q + m27125x());
        }
        long jM26971u = ((C8574m) m27124t0()).m26971u();
        m27126x0();
        int i2 = this.f32590y;
        if (i2 > 0) {
            int[] iArr = this.f32588A;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return jM26971u;
    }

    @Override // com.google.gson.stream.C8585a
    /* renamed from: D */
    public String mo26998D() throws IOException {
        m27123q0(EnumC8586b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) m27124t0()).next();
        String str = (String) entry.getKey();
        this.f32591z[this.f32590y - 1] = str;
        m27122E0(entry.getValue());
        return str;
    }

    @Override // com.google.gson.stream.C8585a
    /* renamed from: I */
    public void mo26999I() throws IOException {
        m27123q0(EnumC8586b.NULL);
        m27126x0();
        int i2 = this.f32590y;
        if (i2 > 0) {
            int[] iArr = this.f32588A;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // com.google.gson.stream.C8585a
    /* renamed from: K */
    public String mo27000K() throws IOException {
        EnumC8586b enumC8586bMo27001Q = mo27001Q();
        EnumC8586b enumC8586b = EnumC8586b.STRING;
        if (enumC8586bMo27001Q == enumC8586b || enumC8586bMo27001Q == EnumC8586b.NUMBER) {
            String strM26973w = ((C8574m) m27126x0()).m26973w();
            int i2 = this.f32590y;
            if (i2 > 0) {
                int[] iArr = this.f32588A;
                int i3 = i2 - 1;
                iArr[i3] = iArr[i3] + 1;
            }
            return strM26973w;
        }
        throw new IllegalStateException("Expected " + enumC8586b + " but was " + enumC8586bMo27001Q + m27125x());
    }

    @Override // com.google.gson.stream.C8585a
    /* renamed from: Q */
    public EnumC8586b mo27001Q() throws IOException {
        if (this.f32590y == 0) {
            return EnumC8586b.END_DOCUMENT;
        }
        Object objM27124t0 = m27124t0();
        if (objM27124t0 instanceof Iterator) {
            boolean z = this.f32589x[this.f32590y - 2] instanceof C8573l;
            Iterator it = (Iterator) objM27124t0;
            if (!it.hasNext()) {
                return z ? EnumC8586b.END_OBJECT : EnumC8586b.END_ARRAY;
            }
            if (z) {
                return EnumC8586b.NAME;
            }
            m27122E0(it.next());
            return mo27001Q();
        }
        if (objM27124t0 instanceof C8573l) {
            return EnumC8586b.BEGIN_OBJECT;
        }
        if (objM27124t0 instanceof C8568g) {
            return EnumC8586b.BEGIN_ARRAY;
        }
        if (!(objM27124t0 instanceof C8574m)) {
            if (objM27124t0 instanceof C8572k) {
                return EnumC8586b.NULL;
            }
            if (objM27124t0 == f32587w) {
                throw new IllegalStateException("JsonReader is closed");
            }
            throw new AssertionError();
        }
        C8574m c8574m = (C8574m) objM27124t0;
        if (c8574m.m26965C()) {
            return EnumC8586b.STRING;
        }
        if (c8574m.m26974x()) {
            return EnumC8586b.BOOLEAN;
        }
        if (c8574m.m26975z()) {
            return EnumC8586b.NUMBER;
        }
        throw new AssertionError();
    }

    @Override // com.google.gson.stream.C8585a
    /* renamed from: a */
    public void mo27002a() throws IOException {
        m27123q0(EnumC8586b.BEGIN_ARRAY);
        m27122E0(((C8568g) m27124t0()).iterator());
        this.f32588A[this.f32590y - 1] = 0;
    }

    @Override // com.google.gson.stream.C8585a
    /* renamed from: b */
    public void mo27004b() throws IOException {
        m27123q0(EnumC8586b.BEGIN_OBJECT);
        m27122E0(((C8573l) m27124t0()).m26962r().iterator());
    }

    @Override // com.google.gson.stream.C8585a, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f32589x = new Object[]{f32587w};
        this.f32590y = 1;
    }

    @Override // com.google.gson.stream.C8585a
    /* renamed from: f */
    public void mo27006f() throws IOException {
        m27123q0(EnumC8586b.END_ARRAY);
        m27126x0();
        m27126x0();
        int i2 = this.f32590y;
        if (i2 > 0) {
            int[] iArr = this.f32588A;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // com.google.gson.stream.C8585a
    /* renamed from: g */
    public String mo27007g() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i2 = 0;
        while (i2 < this.f32590y) {
            Object[] objArr = this.f32589x;
            if (objArr[i2] instanceof C8568g) {
                i2++;
                if (objArr[i2] instanceof Iterator) {
                    sb.append('[');
                    sb.append(this.f32588A[i2]);
                    sb.append(']');
                }
            } else if (objArr[i2] instanceof C8573l) {
                i2++;
                if (objArr[i2] instanceof Iterator) {
                    sb.append('.');
                    String[] strArr = this.f32591z;
                    if (strArr[i2] != null) {
                        sb.append(strArr[i2]);
                    }
                }
            }
            i2++;
        }
        return sb.toString();
    }

    @Override // com.google.gson.stream.C8585a
    /* renamed from: j */
    public void mo27008j() throws IOException {
        m27123q0(EnumC8586b.END_OBJECT);
        m27126x0();
        m27126x0();
        int i2 = this.f32590y;
        if (i2 > 0) {
            int[] iArr = this.f32588A;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // com.google.gson.stream.C8585a
    /* renamed from: l */
    public boolean mo27009l() throws IOException {
        EnumC8586b enumC8586bMo27001Q = mo27001Q();
        return (enumC8586bMo27001Q == EnumC8586b.END_OBJECT || enumC8586bMo27001Q == EnumC8586b.END_ARRAY) ? false : true;
    }

    @Override // com.google.gson.stream.C8585a
    /* renamed from: n0 */
    public void mo27011n0() throws IOException {
        if (mo27001Q() == EnumC8586b.NAME) {
            mo26998D();
            this.f32591z[this.f32590y - 2] = "null";
        } else {
            m27126x0();
            int i2 = this.f32590y;
            if (i2 > 0) {
                this.f32591z[i2 - 1] = "null";
            }
        }
        int i3 = this.f32590y;
        if (i3 > 0) {
            int[] iArr = this.f32588A;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
        }
    }

    @Override // com.google.gson.stream.C8585a
    public String toString() {
        return C8605e.class.getSimpleName();
    }

    @Override // com.google.gson.stream.C8585a
    /* renamed from: y */
    public boolean mo27013y() throws IOException {
        m27123q0(EnumC8586b.BOOLEAN);
        boolean zM26967q = ((C8574m) m27126x0()).m26967q();
        int i2 = this.f32590y;
        if (i2 > 0) {
            int[] iArr = this.f32588A;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return zM26967q;
    }

    /* renamed from: y0 */
    public void m27127y0() throws IOException {
        m27123q0(EnumC8586b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) m27124t0()).next();
        m27122E0(entry.getValue());
        m27122E0(new C8574m((String) entry.getKey()));
    }

    @Override // com.google.gson.stream.C8585a
    /* renamed from: z */
    public double mo27014z() throws IOException {
        EnumC8586b enumC8586bMo27001Q = mo27001Q();
        EnumC8586b enumC8586b = EnumC8586b.NUMBER;
        if (enumC8586bMo27001Q != enumC8586b && enumC8586bMo27001Q != EnumC8586b.STRING) {
            throw new IllegalStateException("Expected " + enumC8586b + " but was " + enumC8586bMo27001Q + m27125x());
        }
        double dM26969s = ((C8574m) m27124t0()).m26969s();
        if (!m27010m() && (Double.isNaN(dM26969s) || Double.isInfinite(dM26969s))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: " + dM26969s);
        }
        m27126x0();
        int i2 = this.f32590y;
        if (i2 > 0) {
            int[] iArr = this.f32588A;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return dM26969s;
    }
}
