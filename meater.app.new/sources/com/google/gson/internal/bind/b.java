package com.google.gson.internal.bind;

import Q9.c;
import com.google.gson.g;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.n;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: JsonTreeWriter.java */
/* loaded from: classes2.dex */
public final class b extends c {

    /* renamed from: Q, reason: collision with root package name */
    private static final Writer f39037Q = new a();

    /* renamed from: R, reason: collision with root package name */
    private static final n f39038R = new n("closed");

    /* renamed from: N, reason: collision with root package name */
    private final List<j> f39039N;

    /* renamed from: O, reason: collision with root package name */
    private String f39040O;

    /* renamed from: P, reason: collision with root package name */
    private j f39041P;

    /* compiled from: JsonTreeWriter.java */
    class a extends Writer {
        a() {
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i10, int i11) {
            throw new AssertionError();
        }
    }

    public b() {
        super(f39037Q);
        this.f39039N = new ArrayList();
        this.f39041P = k.f39117B;
    }

    private j f0() {
        return this.f39039N.get(r0.size() - 1);
    }

    private void h0(j jVar) {
        if (this.f39040O != null) {
            if (!jVar.x() || j()) {
                ((l) f0()).A(this.f39040O, jVar);
            }
            this.f39040O = null;
            return;
        }
        if (this.f39039N.isEmpty()) {
            this.f39041P = jVar;
            return;
        }
        j jVarF0 = f0();
        if (!(jVarF0 instanceof g)) {
            throw new IllegalStateException();
        }
        ((g) jVarF0).A(jVar);
    }

    @Override // Q9.c
    public c L(double d10) {
        if (l() || !(Double.isNaN(d10) || Double.isInfinite(d10))) {
            h0(new n(Double.valueOf(d10)));
            return this;
        }
        throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d10);
    }

    @Override // Q9.c
    public c N(long j10) {
        h0(new n(Long.valueOf(j10)));
        return this;
    }

    @Override // Q9.c
    public c P(Boolean bool) {
        if (bool == null) {
            return p();
        }
        h0(new n(bool));
        return this;
    }

    @Override // Q9.c
    public c Q(Number number) {
        if (number == null) {
            return p();
        }
        if (!l()) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        h0(new n(number));
        return this;
    }

    @Override // Q9.c
    public c W(String str) {
        if (str == null) {
            return p();
        }
        h0(new n(str));
        return this;
    }

    @Override // Q9.c
    public c X(boolean z10) {
        h0(new n(Boolean.valueOf(z10)));
        return this;
    }

    @Override // Q9.c
    public c c() {
        g gVar = new g();
        h0(gVar);
        this.f39039N.add(gVar);
        return this;
    }

    @Override // Q9.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.f39039N.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.f39039N.add(f39038R);
    }

    @Override // Q9.c
    public c d() {
        l lVar = new l();
        h0(lVar);
        this.f39039N.add(lVar);
        return this;
    }

    public j e0() {
        if (this.f39039N.isEmpty()) {
            return this.f39041P;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f39039N);
    }

    @Override // Q9.c
    public c f() {
        if (this.f39039N.isEmpty() || this.f39040O != null) {
            throw new IllegalStateException();
        }
        if (!(f0() instanceof g)) {
            throw new IllegalStateException();
        }
        this.f39039N.remove(r0.size() - 1);
        return this;
    }

    @Override // Q9.c
    public c g() {
        if (this.f39039N.isEmpty() || this.f39040O != null) {
            throw new IllegalStateException();
        }
        if (!(f0() instanceof l)) {
            throw new IllegalStateException();
        }
        this.f39039N.remove(r0.size() - 1);
        return this;
    }

    @Override // Q9.c
    public c n(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f39039N.isEmpty() || this.f39040O != null) {
            throw new IllegalStateException();
        }
        if (!(f0() instanceof l)) {
            throw new IllegalStateException();
        }
        this.f39040O = str;
        return this;
    }

    @Override // Q9.c
    public c p() {
        h0(k.f39117B);
        return this;
    }

    @Override // Q9.c, java.io.Flushable
    public void flush() {
    }
}
