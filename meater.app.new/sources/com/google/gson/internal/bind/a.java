package com.google.gson.internal.bind;

import com.google.gson.g;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.n;
import com.google.gson.stream.MalformedJsonException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* compiled from: JsonTreeReader.java */
/* loaded from: classes2.dex */
public final class a extends Q9.a {

    /* renamed from: U, reason: collision with root package name */
    private static final Reader f39030U = new C0495a();

    /* renamed from: V, reason: collision with root package name */
    private static final Object f39031V = new Object();

    /* renamed from: Q, reason: collision with root package name */
    private Object[] f39032Q;

    /* renamed from: R, reason: collision with root package name */
    private int f39033R;

    /* renamed from: S, reason: collision with root package name */
    private String[] f39034S;

    /* renamed from: T, reason: collision with root package name */
    private int[] f39035T;

    /* compiled from: JsonTreeReader.java */
    /* renamed from: com.google.gson.internal.bind.a$a, reason: collision with other inner class name */
    class C0495a extends Reader {
        C0495a() {
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i10, int i11) {
            throw new AssertionError();
        }
    }

    /* compiled from: JsonTreeReader.java */
    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f39036a;

        static {
            int[] iArr = new int[Q9.b.values().length];
            f39036a = iArr;
            try {
                iArr[Q9.b.NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39036a[Q9.b.END_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39036a[Q9.b.END_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f39036a[Q9.b.END_DOCUMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public a(j jVar) {
        super(f39030U);
        this.f39032Q = new Object[32];
        this.f39033R = 0;
        this.f39034S = new String[32];
        this.f39035T = new int[32];
        O0(jVar);
    }

    private String C0(boolean z10) {
        r0(Q9.b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) G0()).next();
        String str = (String) entry.getKey();
        this.f39034S[this.f39033R - 1] = z10 ? "<skipped>" : str;
        O0(entry.getValue());
        return str;
    }

    private Object G0() {
        return this.f39032Q[this.f39033R - 1];
    }

    private Object L0() {
        Object[] objArr = this.f39032Q;
        int i10 = this.f39033R - 1;
        this.f39033R = i10;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    private void O0(Object obj) {
        int i10 = this.f39033R;
        Object[] objArr = this.f39032Q;
        if (i10 == objArr.length) {
            int i11 = i10 * 2;
            this.f39032Q = Arrays.copyOf(objArr, i11);
            this.f39035T = Arrays.copyOf(this.f39035T, i11);
            this.f39034S = (String[]) Arrays.copyOf(this.f39034S, i11);
        }
        Object[] objArr2 = this.f39032Q;
        int i12 = this.f39033R;
        this.f39033R = i12 + 1;
        objArr2[i12] = obj;
    }

    private String k(boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        int i10 = 0;
        while (true) {
            int i11 = this.f39033R;
            if (i10 >= i11) {
                return sb2.toString();
            }
            Object[] objArr = this.f39032Q;
            Object obj = objArr[i10];
            if (obj instanceof g) {
                i10++;
                if (i10 < i11 && (objArr[i10] instanceof Iterator)) {
                    int i12 = this.f39035T[i10];
                    if (z10 && i12 > 0 && (i10 == i11 - 1 || i10 == i11 - 2)) {
                        i12--;
                    }
                    sb2.append('[');
                    sb2.append(i12);
                    sb2.append(']');
                }
            } else if ((obj instanceof l) && (i10 = i10 + 1) < i11 && (objArr[i10] instanceof Iterator)) {
                sb2.append('.');
                String str = this.f39034S[i10];
                if (str != null) {
                    sb2.append(str);
                }
            }
            i10++;
        }
    }

    private String p() {
        return " at path " + h();
    }

    private void r0(Q9.b bVar) {
        if (N() == bVar) {
            return;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + N() + p());
    }

    @Override // Q9.a
    public String K() throws MalformedJsonException {
        Q9.b bVarN = N();
        Q9.b bVar = Q9.b.STRING;
        if (bVarN == bVar || bVarN == Q9.b.NUMBER) {
            String strV = ((n) L0()).v();
            int i10 = this.f39033R;
            if (i10 > 0) {
                int[] iArr = this.f39035T;
                int i11 = i10 - 1;
                iArr[i11] = iArr[i11] + 1;
            }
            return strV;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + bVarN + p());
    }

    public void M0() {
        r0(Q9.b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) G0()).next();
        O0(entry.getValue());
        O0(new n((String) entry.getKey()));
    }

    @Override // Q9.a
    public Q9.b N() throws MalformedJsonException {
        if (this.f39033R == 0) {
            return Q9.b.END_DOCUMENT;
        }
        Object objG0 = G0();
        if (objG0 instanceof Iterator) {
            boolean z10 = this.f39032Q[this.f39033R - 2] instanceof l;
            Iterator it = (Iterator) objG0;
            if (!it.hasNext()) {
                return z10 ? Q9.b.END_OBJECT : Q9.b.END_ARRAY;
            }
            if (z10) {
                return Q9.b.NAME;
            }
            O0(it.next());
            return N();
        }
        if (objG0 instanceof l) {
            return Q9.b.BEGIN_OBJECT;
        }
        if (objG0 instanceof g) {
            return Q9.b.BEGIN_ARRAY;
        }
        if (objG0 instanceof n) {
            n nVar = (n) objG0;
            if (nVar.G()) {
                return Q9.b.STRING;
            }
            if (nVar.D()) {
                return Q9.b.BOOLEAN;
            }
            if (nVar.F()) {
                return Q9.b.NUMBER;
            }
            throw new AssertionError();
        }
        if (objG0 instanceof k) {
            return Q9.b.NULL;
        }
        if (objG0 == f39031V) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw new MalformedJsonException("Custom JsonElement subclass " + objG0.getClass().getName() + " is not supported");
    }

    @Override // Q9.a
    public void a() {
        r0(Q9.b.BEGIN_ARRAY);
        O0(((g) G0()).iterator());
        this.f39035T[this.f39033R - 1] = 0;
    }

    @Override // Q9.a
    public void b() {
        r0(Q9.b.BEGIN_OBJECT);
        O0(((l) G0()).B().iterator());
    }

    @Override // Q9.a, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f39032Q = new Object[]{f39031V};
        this.f39033R = 1;
    }

    @Override // Q9.a
    public void f() {
        r0(Q9.b.END_ARRAY);
        L0();
        L0();
        int i10 = this.f39033R;
        if (i10 > 0) {
            int[] iArr = this.f39035T;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // Q9.a
    public void g() {
        r0(Q9.b.END_OBJECT);
        this.f39034S[this.f39033R - 1] = null;
        L0();
        L0();
        int i10 = this.f39033R;
        if (i10 > 0) {
            int[] iArr = this.f39035T;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // Q9.a
    public String h() {
        return k(false);
    }

    @Override // Q9.a
    public String l() {
        return k(true);
    }

    @Override // Q9.a
    public boolean m() throws MalformedJsonException {
        Q9.b bVarN = N();
        return (bVarN == Q9.b.END_OBJECT || bVarN == Q9.b.END_ARRAY || bVarN == Q9.b.END_DOCUMENT) ? false : true;
    }

    @Override // Q9.a
    public void o0() throws MalformedJsonException {
        int i10 = b.f39036a[N().ordinal()];
        if (i10 == 1) {
            C0(true);
            return;
        }
        if (i10 == 2) {
            f();
            return;
        }
        if (i10 == 3) {
            g();
            return;
        }
        if (i10 != 4) {
            L0();
            int i11 = this.f39033R;
            if (i11 > 0) {
                int[] iArr = this.f39035T;
                int i12 = i11 - 1;
                iArr[i12] = iArr[i12] + 1;
            }
        }
    }

    @Override // Q9.a
    public boolean q() {
        r0(Q9.b.BOOLEAN);
        boolean zC = ((n) L0()).c();
        int i10 = this.f39033R;
        if (i10 > 0) {
            int[] iArr = this.f39035T;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return zC;
    }

    @Override // Q9.a
    public double s() throws MalformedJsonException {
        Q9.b bVarN = N();
        Q9.b bVar = Q9.b.NUMBER;
        if (bVarN != bVar && bVarN != Q9.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + bVarN + p());
        }
        double dF = ((n) G0()).f();
        if (!n() && (Double.isNaN(dF) || Double.isInfinite(dF))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + dF);
        }
        L0();
        int i10 = this.f39033R;
        if (i10 > 0) {
            int[] iArr = this.f39035T;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return dF;
    }

    @Override // Q9.a
    public int t() throws MalformedJsonException {
        Q9.b bVarN = N();
        Q9.b bVar = Q9.b.NUMBER;
        if (bVarN != bVar && bVarN != Q9.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + bVarN + p());
        }
        int iH = ((n) G0()).h();
        L0();
        int i10 = this.f39033R;
        if (i10 > 0) {
            int[] iArr = this.f39035T;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return iH;
    }

    @Override // Q9.a
    public String toString() {
        return a.class.getSimpleName() + p();
    }

    @Override // Q9.a
    public long u() throws MalformedJsonException {
        Q9.b bVarN = N();
        Q9.b bVar = Q9.b.NUMBER;
        if (bVarN != bVar && bVarN != Q9.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + bVarN + p());
        }
        long jA = ((n) G0()).A();
        L0();
        int i10 = this.f39033R;
        if (i10 > 0) {
            int[] iArr = this.f39035T;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return jA;
    }

    j v0() throws MalformedJsonException {
        Q9.b bVarN = N();
        if (bVarN != Q9.b.NAME && bVarN != Q9.b.END_ARRAY && bVarN != Q9.b.END_OBJECT && bVarN != Q9.b.END_DOCUMENT) {
            j jVar = (j) G0();
            o0();
            return jVar;
        }
        throw new IllegalStateException("Unexpected " + bVarN + " when reading a JsonElement.");
    }

    @Override // Q9.a
    public String x() {
        return C0(false);
    }

    @Override // Q9.a
    public void z() {
        r0(Q9.b.NULL);
        L0();
        int i10 = this.f39033R;
        if (i10 > 0) {
            int[] iArr = this.f39035T;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }
}
