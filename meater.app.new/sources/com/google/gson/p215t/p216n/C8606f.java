package com.google.gson.p215t.p216n;

import com.google.gson.AbstractC8571j;
import com.google.gson.C8568g;
import com.google.gson.C8572k;
import com.google.gson.C8573l;
import com.google.gson.C8574m;
import com.google.gson.stream.C8587c;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: JsonTreeWriter.java */
/* renamed from: com.google.gson.t.n.f */
/* loaded from: classes2.dex */
public final class C8606f extends C8587c {

    /* renamed from: q */
    private static final Writer f32592q = new a();

    /* renamed from: r */
    private static final C8574m f32593r = new C8574m("closed");

    /* renamed from: s */
    private final List<AbstractC8571j> f32594s;

    /* renamed from: t */
    private String f32595t;

    /* renamed from: u */
    private AbstractC8571j f32596u;

    /* compiled from: JsonTreeWriter.java */
    /* renamed from: com.google.gson.t.n.f$a */
    static class a extends Writer {
        a() {
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i2, int i3) {
            throw new AssertionError();
        }
    }

    public C8606f() {
        super(f32592q);
        this.f32594s = new ArrayList();
        this.f32596u = C8572k.f32449a;
    }

    /* renamed from: f0 */
    private AbstractC8571j m27128f0() {
        return this.f32594s.get(r0.size() - 1);
    }

    /* renamed from: i0 */
    private void m27129i0(AbstractC8571j abstractC8571j) {
        if (this.f32595t != null) {
            if (!abstractC8571j.m26958i() || m27039k()) {
                ((C8573l) m27128f0()).m26961q(this.f32595t, abstractC8571j);
            }
            this.f32595t = null;
            return;
        }
        if (this.f32594s.isEmpty()) {
            this.f32596u = abstractC8571j;
            return;
        }
        AbstractC8571j abstractC8571jM27128f0 = m27128f0();
        if (!(abstractC8571jM27128f0 instanceof C8568g)) {
            throw new IllegalStateException();
        }
        ((C8568g) abstractC8571jM27128f0).m26952q(abstractC8571j);
    }

    @Override // com.google.gson.stream.C8587c
    /* renamed from: Q */
    public C8587c mo27030Q(long j2) throws IOException {
        m27129i0(new C8574m(Long.valueOf(j2)));
        return this;
    }

    @Override // com.google.gson.stream.C8587c
    /* renamed from: T */
    public C8587c mo27031T(Boolean bool) throws IOException {
        if (bool == null) {
            return mo27043y();
        }
        m27129i0(new C8574m(bool));
        return this;
    }

    @Override // com.google.gson.stream.C8587c
    /* renamed from: W */
    public C8587c mo27032W(Number number) throws IOException {
        if (number == null) {
            return mo27043y();
        }
        if (!m27041m()) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        m27129i0(new C8574m(number));
        return this;
    }

    @Override // com.google.gson.stream.C8587c
    /* renamed from: Y */
    public C8587c mo27033Y(String str) throws IOException {
        if (str == null) {
            return mo27043y();
        }
        m27129i0(new C8574m(str));
        return this;
    }

    @Override // com.google.gson.stream.C8587c
    /* renamed from: Z */
    public C8587c mo27034Z(boolean z) throws IOException {
        m27129i0(new C8574m(Boolean.valueOf(z)));
        return this;
    }

    @Override // com.google.gson.stream.C8587c
    /* renamed from: c */
    public C8587c mo27035c() throws IOException {
        C8568g c8568g = new C8568g();
        m27129i0(c8568g);
        this.f32594s.add(c8568g);
        return this;
    }

    @Override // com.google.gson.stream.C8587c, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.f32594s.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.f32594s.add(f32593r);
    }

    @Override // com.google.gson.stream.C8587c
    /* renamed from: d */
    public C8587c mo27036d() throws IOException {
        C8573l c8573l = new C8573l();
        m27129i0(c8573l);
        this.f32594s.add(c8573l);
        return this;
    }

    /* renamed from: e0 */
    public AbstractC8571j m27130e0() {
        if (this.f32594s.isEmpty()) {
            return this.f32596u;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f32594s);
    }

    @Override // com.google.gson.stream.C8587c
    /* renamed from: f */
    public C8587c mo27037f() throws IOException {
        if (this.f32594s.isEmpty() || this.f32595t != null) {
            throw new IllegalStateException();
        }
        if (!(m27128f0() instanceof C8568g)) {
            throw new IllegalStateException();
        }
        this.f32594s.remove(r0.size() - 1);
        return this;
    }

    @Override // com.google.gson.stream.C8587c, java.io.Flushable
    public void flush() throws IOException {
    }

    @Override // com.google.gson.stream.C8587c
    /* renamed from: j */
    public C8587c mo27038j() throws IOException {
        if (this.f32594s.isEmpty() || this.f32595t != null) {
            throw new IllegalStateException();
        }
        if (!(m27128f0() instanceof C8573l)) {
            throw new IllegalStateException();
        }
        this.f32594s.remove(r0.size() - 1);
        return this;
    }

    @Override // com.google.gson.stream.C8587c
    /* renamed from: p */
    public C8587c mo27042p(String str) throws IOException {
        if (this.f32594s.isEmpty() || this.f32595t != null) {
            throw new IllegalStateException();
        }
        if (!(m27128f0() instanceof C8573l)) {
            throw new IllegalStateException();
        }
        this.f32595t = str;
        return this;
    }

    @Override // com.google.gson.stream.C8587c
    /* renamed from: y */
    public C8587c mo27043y() throws IOException {
        m27129i0(C8572k.f32449a);
        return this;
    }
}
