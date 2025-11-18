package com.google.protobuf;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* compiled from: ByteString.java */
/* renamed from: com.google.protobuf.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2947g implements Iterable<Byte>, Serializable {

    /* renamed from: C, reason: collision with root package name */
    public static final AbstractC2947g f39238C = new j(C2964y.f39493d);

    /* renamed from: D, reason: collision with root package name */
    private static final f f39239D;

    /* renamed from: E, reason: collision with root package name */
    private static final Comparator<AbstractC2947g> f39240E;

    /* renamed from: B, reason: collision with root package name */
    private int f39241B = 0;

    /* compiled from: ByteString.java */
    /* renamed from: com.google.protobuf.g$a */
    class a extends c {

        /* renamed from: B, reason: collision with root package name */
        private int f39242B = 0;

        /* renamed from: C, reason: collision with root package name */
        private final int f39243C;

        a() {
            this.f39243C = AbstractC2947g.this.size();
        }

        @Override // com.google.protobuf.AbstractC2947g.InterfaceC0500g
        public byte c() {
            int i10 = this.f39242B;
            if (i10 >= this.f39243C) {
                throw new NoSuchElementException();
            }
            this.f39242B = i10 + 1;
            return AbstractC2947g.this.v(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f39242B < this.f39243C;
        }
    }

    /* compiled from: ByteString.java */
    /* renamed from: com.google.protobuf.g$b */
    class b implements Comparator<AbstractC2947g> {
        b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC2947g abstractC2947g, AbstractC2947g abstractC2947g2) {
            InterfaceC0500g it = abstractC2947g.iterator();
            InterfaceC0500g it2 = abstractC2947g2.iterator();
            while (it.hasNext() && it2.hasNext()) {
                int iCompareTo = Integer.valueOf(AbstractC2947g.E(it.c())).compareTo(Integer.valueOf(AbstractC2947g.E(it2.c())));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            return Integer.valueOf(abstractC2947g.size()).compareTo(Integer.valueOf(abstractC2947g2.size()));
        }
    }

    /* compiled from: ByteString.java */
    /* renamed from: com.google.protobuf.g$c */
    static abstract class c implements InterfaceC0500g {
        c() {
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Byte next() {
            return Byte.valueOf(c());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: ByteString.java */
    /* renamed from: com.google.protobuf.g$d */
    private static final class d implements f {
        private d() {
        }

        @Override // com.google.protobuf.AbstractC2947g.f
        public byte[] a(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* compiled from: ByteString.java */
    /* renamed from: com.google.protobuf.g$e */
    private static final class e extends j {

        /* renamed from: G, reason: collision with root package name */
        private final int f39245G;

        /* renamed from: H, reason: collision with root package name */
        private final int f39246H;

        e(byte[] bArr, int i10, int i11) {
            super(bArr);
            AbstractC2947g.i(i10, i10 + i11, bArr.length);
            this.f39245G = i10;
            this.f39246H = i11;
        }

        @Override // com.google.protobuf.AbstractC2947g.j
        protected int O() {
            return this.f39245G;
        }

        @Override // com.google.protobuf.AbstractC2947g.j, com.google.protobuf.AbstractC2947g
        public byte f(int i10) {
            AbstractC2947g.h(i10, size());
            return this.f39249F[this.f39245G + i10];
        }

        @Override // com.google.protobuf.AbstractC2947g.j, com.google.protobuf.AbstractC2947g
        public int size() {
            return this.f39246H;
        }

        @Override // com.google.protobuf.AbstractC2947g.j, com.google.protobuf.AbstractC2947g
        byte v(int i10) {
            return this.f39249F[this.f39245G + i10];
        }
    }

    /* compiled from: ByteString.java */
    /* renamed from: com.google.protobuf.g$f */
    private interface f {
        byte[] a(byte[] bArr, int i10, int i11);
    }

    /* compiled from: ByteString.java */
    /* renamed from: com.google.protobuf.g$g, reason: collision with other inner class name */
    public interface InterfaceC0500g extends Iterator<Byte> {
        byte c();
    }

    /* compiled from: ByteString.java */
    /* renamed from: com.google.protobuf.g$h */
    static final class h {

        /* renamed from: a, reason: collision with root package name */
        private final CodedOutputStream f39247a;

        /* renamed from: b, reason: collision with root package name */
        private final byte[] f39248b;

        /* synthetic */ h(int i10, a aVar) {
            this(i10);
        }

        public AbstractC2947g a() {
            this.f39247a.c();
            return new j(this.f39248b);
        }

        public CodedOutputStream b() {
            return this.f39247a;
        }

        private h(int i10) {
            byte[] bArr = new byte[i10];
            this.f39248b = bArr;
            this.f39247a = CodedOutputStream.c0(bArr);
        }
    }

    /* compiled from: ByteString.java */
    /* renamed from: com.google.protobuf.g$i */
    static abstract class i extends AbstractC2947g {
        i() {
        }

        @Override // com.google.protobuf.AbstractC2947g, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
            return super.iterator();
        }
    }

    /* compiled from: ByteString.java */
    /* renamed from: com.google.protobuf.g$j */
    private static class j extends i {

        /* renamed from: F, reason: collision with root package name */
        protected final byte[] f39249F;

        j(byte[] bArr) {
            bArr.getClass();
            this.f39249F = bArr;
        }

        @Override // com.google.protobuf.AbstractC2947g
        protected final int A(int i10, int i11, int i12) {
            return C2964y.i(i10, this.f39249F, O() + i11, i12);
        }

        @Override // com.google.protobuf.AbstractC2947g
        public final AbstractC2947g D(int i10, int i11) {
            int i12 = AbstractC2947g.i(i10, i11, size());
            return i12 == 0 ? AbstractC2947g.f39238C : new e(this.f39249F, O() + i10, i12);
        }

        @Override // com.google.protobuf.AbstractC2947g
        protected final String G(Charset charset) {
            return new String(this.f39249F, O(), size(), charset);
        }

        @Override // com.google.protobuf.AbstractC2947g
        final void L(AbstractC2946f abstractC2946f) {
            abstractC2946f.a(this.f39249F, O(), size());
        }

        final boolean M(AbstractC2947g abstractC2947g, int i10, int i11) {
            if (i11 > abstractC2947g.size()) {
                throw new IllegalArgumentException("Length too large: " + i11 + size());
            }
            int i12 = i10 + i11;
            if (i12 > abstractC2947g.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + abstractC2947g.size());
            }
            if (!(abstractC2947g instanceof j)) {
                return abstractC2947g.D(i10, i12).equals(D(0, i11));
            }
            j jVar = (j) abstractC2947g;
            byte[] bArr = this.f39249F;
            byte[] bArr2 = jVar.f39249F;
            int iO = O() + i11;
            int iO2 = O();
            int iO3 = jVar.O() + i10;
            while (iO2 < iO) {
                if (bArr[iO2] != bArr2[iO3]) {
                    return false;
                }
                iO2++;
                iO3++;
            }
            return true;
        }

        protected int O() {
            return 0;
        }

        @Override // com.google.protobuf.AbstractC2947g
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC2947g) || size() != ((AbstractC2947g) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof j)) {
                return obj.equals(this);
            }
            j jVar = (j) obj;
            int iB = B();
            int iB2 = jVar.B();
            if (iB == 0 || iB2 == 0 || iB == iB2) {
                return M(jVar, 0, size());
            }
            return false;
        }

        @Override // com.google.protobuf.AbstractC2947g
        public byte f(int i10) {
            return this.f39249F[i10];
        }

        @Override // com.google.protobuf.AbstractC2947g
        public int size() {
            return this.f39249F.length;
        }

        @Override // com.google.protobuf.AbstractC2947g
        byte v(int i10) {
            return this.f39249F[i10];
        }

        @Override // com.google.protobuf.AbstractC2947g
        public final boolean w() {
            int iO = O();
            return q0.n(this.f39249F, iO, size() + iO);
        }

        @Override // com.google.protobuf.AbstractC2947g
        public final AbstractC2948h z() {
            return AbstractC2948h.i(this.f39249F, O(), size(), true);
        }
    }

    /* compiled from: ByteString.java */
    /* renamed from: com.google.protobuf.g$k */
    private static final class k implements f {
        private k() {
        }

        @Override // com.google.protobuf.AbstractC2947g.f
        public byte[] a(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return bArr2;
        }

        /* synthetic */ k(a aVar) {
            this();
        }
    }

    static {
        a aVar = null;
        f39239D = C2944d.c() ? new k(aVar) : new d(aVar);
        f39240E = new b();
    }

    AbstractC2947g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int E(byte b10) {
        return b10 & 255;
    }

    private String I() {
        if (size() <= 50) {
            return k0.a(this);
        }
        return k0.a(D(0, 47)) + "...";
    }

    static AbstractC2947g J(byte[] bArr) {
        return new j(bArr);
    }

    static AbstractC2947g K(byte[] bArr, int i10, int i11) {
        return new e(bArr, i10, i11);
    }

    static void h(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
        }
    }

    static int i(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i10 + " < 0");
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i10 + ", " + i11);
        }
        throw new IndexOutOfBoundsException("End index: " + i11 + " >= " + i12);
    }

    public static AbstractC2947g j(byte[] bArr, int i10, int i11) {
        i(i10, i10 + i11, bArr.length);
        return new j(f39239D.a(bArr, i10, i11));
    }

    public static AbstractC2947g r(String str) {
        return new j(str.getBytes(C2964y.f39491b));
    }

    static h y(int i10) {
        return new h(i10, null);
    }

    protected abstract int A(int i10, int i11, int i12);

    protected final int B() {
        return this.f39241B;
    }

    public abstract AbstractC2947g D(int i10, int i11);

    public final String F(Charset charset) {
        return size() == 0 ? "" : G(charset);
    }

    protected abstract String G(Charset charset);

    public final String H() {
        return F(C2964y.f39491b);
    }

    abstract void L(AbstractC2946f abstractC2946f);

    public abstract boolean equals(Object obj);

    public abstract byte f(int i10);

    public final int hashCode() {
        int iA = this.f39241B;
        if (iA == 0) {
            int size = size();
            iA = A(size, 0, size);
            if (iA == 0) {
                iA = 1;
            }
            this.f39241B = iA;
        }
        return iA;
    }

    public abstract int size();

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), I());
    }

    abstract byte v(int i10);

    public abstract boolean w();

    @Override // java.lang.Iterable
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public InterfaceC0500g iterator() {
        return new a();
    }

    public abstract AbstractC2948h z();
}
