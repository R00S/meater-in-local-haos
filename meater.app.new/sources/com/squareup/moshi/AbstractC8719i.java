package com.squareup.moshi;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import p353j.C9703f;
import p353j.C9710i;
import p353j.C9721t;
import p353j.InterfaceC9709h;

/* compiled from: JsonReader.java */
/* renamed from: com.squareup.moshi.i */
/* loaded from: classes2.dex */
public abstract class AbstractC8719i implements Closeable {

    /* renamed from: f */
    int f33102f;

    /* renamed from: g */
    int[] f33103g = new int[32];

    /* renamed from: h */
    String[] f33104h = new String[32];

    /* renamed from: i */
    int[] f33105i = new int[32];

    /* renamed from: j */
    boolean f33106j;

    /* renamed from: k */
    boolean f33107k;

    /* compiled from: JsonReader.java */
    /* renamed from: com.squareup.moshi.i$a */
    public static final class a {

        /* renamed from: a */
        final String[] f33108a;

        /* renamed from: b */
        final C9721t f33109b;

        private a(String[] strArr, C9721t c9721t) {
            this.f33108a = strArr;
            this.f33109b = c9721t;
        }

        /* renamed from: a */
        public static a m27724a(String... strArr) {
            try {
                C9710i[] c9710iArr = new C9710i[strArr.length];
                C9703f c9703f = new C9703f();
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    C8722l.m27748e0(c9703f, strArr[i2]);
                    c9703f.readByte();
                    c9710iArr[i2] = c9703f.mo32003D0();
                }
                return new a((String[]) strArr.clone(), C9721t.m32142r(c9710iArr));
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    /* compiled from: JsonReader.java */
    /* renamed from: com.squareup.moshi.i$b */
    public enum b {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    AbstractC8719i() {
    }

    /* renamed from: z */
    public static AbstractC8719i m27698z(InterfaceC9709h interfaceC9709h) {
        return new C8721k(interfaceC9709h);
    }

    /* renamed from: A */
    public abstract b mo27699A() throws IOException;

    /* renamed from: B */
    public abstract void mo27700B() throws IOException;

    /* renamed from: D */
    final void m27701D(int i2) {
        int i3 = this.f33102f;
        int[] iArr = this.f33103g;
        if (i3 == iArr.length) {
            if (i3 == 256) {
                throw new JsonDataException("Nesting too deep at " + m27716g());
            }
            this.f33103g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f33104h;
            this.f33104h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f33105i;
            this.f33105i = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f33103g;
        int i4 = this.f33102f;
        this.f33102f = i4 + 1;
        iArr3[i4] = i2;
    }

    /* renamed from: H */
    public abstract int mo27702H(a aVar) throws IOException;

    /* renamed from: I */
    public abstract int mo27703I(a aVar) throws IOException;

    /* renamed from: J */
    public final void m27704J(boolean z) {
        this.f33107k = z;
    }

    /* renamed from: K */
    public final void m27705K(boolean z) {
        this.f33106j = z;
    }

    /* renamed from: N */
    public abstract void mo27706N() throws IOException;

    /* renamed from: Q */
    public abstract void mo27707Q() throws IOException;

    /* renamed from: T */
    final JsonEncodingException m27708T(String str) throws JsonEncodingException {
        throw new JsonEncodingException(str + " at path " + m27716g());
    }

    /* renamed from: W */
    final JsonDataException m27709W(Object obj, Object obj2) {
        if (obj == null) {
            return new JsonDataException("Expected " + obj2 + " but was null at path " + m27716g());
        }
        return new JsonDataException("Expected " + obj2 + " but was " + obj + ", a " + obj.getClass().getName() + ", at path " + m27716g());
    }

    /* renamed from: a */
    public abstract void mo27710a() throws IOException;

    /* renamed from: b */
    public abstract void mo27711b() throws IOException;

    /* renamed from: c */
    public abstract void mo27712c() throws IOException;

    /* renamed from: d */
    public abstract void mo27713d() throws IOException;

    /* renamed from: e */
    public final boolean m27714e() {
        return this.f33107k;
    }

    /* renamed from: f */
    public abstract boolean mo27715f() throws IOException;

    /* renamed from: g */
    public final String m27716g() {
        return C8720j.m27726a(this.f33102f, this.f33103g, this.f33104h, this.f33105i);
    }

    /* renamed from: j */
    public final boolean m27717j() {
        return this.f33106j;
    }

    /* renamed from: k */
    public abstract boolean mo27718k() throws IOException;

    /* renamed from: l */
    public abstract double mo27719l() throws IOException;

    /* renamed from: m */
    public abstract int mo27720m() throws IOException;

    /* renamed from: p */
    public abstract long mo27721p() throws IOException;

    /* renamed from: x */
    public abstract <T> T mo27722x() throws IOException;

    /* renamed from: y */
    public abstract String mo27723y() throws IOException;
}
