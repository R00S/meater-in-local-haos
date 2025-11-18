package com.google.crypto.tink.shaded.protobuf;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* compiled from: ByteString.java */
/* renamed from: com.google.crypto.tink.shaded.protobuf.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2898h implements Iterable<Byte>, Serializable {

    /* renamed from: C, reason: collision with root package name */
    public static final AbstractC2898h f37801C = new j(C2915z.f38063d);

    /* renamed from: D, reason: collision with root package name */
    private static final f f37802D;

    /* renamed from: E, reason: collision with root package name */
    private static final Comparator<AbstractC2898h> f37803E;

    /* renamed from: B, reason: collision with root package name */
    private int f37804B = 0;

    /* compiled from: ByteString.java */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$a */
    class a extends c {

        /* renamed from: B, reason: collision with root package name */
        private int f37805B = 0;

        /* renamed from: C, reason: collision with root package name */
        private final int f37806C;

        a() {
            this.f37806C = AbstractC2898h.this.size();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2898h.g
        public byte c() {
            int i10 = this.f37805B;
            if (i10 >= this.f37806C) {
                throw new NoSuchElementException();
            }
            this.f37805B = i10 + 1;
            return AbstractC2898h.this.x(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f37805B < this.f37806C;
        }
    }

    /* compiled from: ByteString.java */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$b */
    class b implements Comparator<AbstractC2898h> {
        b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC2898h abstractC2898h, AbstractC2898h abstractC2898h2) {
            g it = abstractC2898h.iterator();
            g it2 = abstractC2898h2.iterator();
            while (it.hasNext() && it2.hasNext()) {
                int iCompareTo = Integer.valueOf(AbstractC2898h.H(it.c())).compareTo(Integer.valueOf(AbstractC2898h.H(it2.c())));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            return Integer.valueOf(abstractC2898h.size()).compareTo(Integer.valueOf(abstractC2898h2.size()));
        }
    }

    /* compiled from: ByteString.java */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$c */
    static abstract class c implements g {
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
    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$d */
    private static final class d implements f {
        private d() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2898h.f
        public byte[] a(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* compiled from: ByteString.java */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$e */
    private static final class e extends j {

        /* renamed from: G, reason: collision with root package name */
        private final int f37808G;

        /* renamed from: H, reason: collision with root package name */
        private final int f37809H;

        e(byte[] bArr, int i10, int i11) {
            super(bArr);
            AbstractC2898h.i(i10, i10 + i11, bArr.length);
            this.f37808G = i10;
            this.f37809H = i11;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2898h.j
        protected int S() {
            return this.f37808G;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2898h.j, com.google.crypto.tink.shaded.protobuf.AbstractC2898h
        public byte f(int i10) {
            AbstractC2898h.h(i10, size());
            return this.f37812F[this.f37808G + i10];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2898h.j, com.google.crypto.tink.shaded.protobuf.AbstractC2898h
        public int size() {
            return this.f37809H;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2898h.j, com.google.crypto.tink.shaded.protobuf.AbstractC2898h
        protected void w(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f37812F, S() + i10, bArr, i11, i12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2898h.j, com.google.crypto.tink.shaded.protobuf.AbstractC2898h
        byte x(int i10) {
            return this.f37812F[this.f37808G + i10];
        }
    }

    /* compiled from: ByteString.java */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$f */
    private interface f {
        byte[] a(byte[] bArr, int i10, int i11);
    }

    /* compiled from: ByteString.java */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$g */
    public interface g extends Iterator<Byte> {
        byte c();
    }

    /* compiled from: ByteString.java */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$h, reason: collision with other inner class name */
    static final class C0486h {

        /* renamed from: a, reason: collision with root package name */
        private final CodedOutputStream f37810a;

        /* renamed from: b, reason: collision with root package name */
        private final byte[] f37811b;

        /* synthetic */ C0486h(int i10, a aVar) {
            this(i10);
        }

        public AbstractC2898h a() {
            this.f37810a.c();
            return new j(this.f37811b);
        }

        public CodedOutputStream b() {
            return this.f37810a;
        }

        private C0486h(int i10) {
            byte[] bArr = new byte[i10];
            this.f37811b = bArr;
            this.f37810a = CodedOutputStream.c0(bArr);
        }
    }

    /* compiled from: ByteString.java */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$i */
    static abstract class i extends AbstractC2898h {
        i() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2898h, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
            return super.iterator();
        }
    }

    /* compiled from: ByteString.java */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$j */
    private static class j extends i {

        /* renamed from: F, reason: collision with root package name */
        protected final byte[] f37812F;

        j(byte[] bArr) {
            bArr.getClass();
            this.f37812F = bArr;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2898h
        public final AbstractC2899i B() {
            return AbstractC2899i.j(this.f37812F, S(), size(), true);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2898h
        protected final int D(int i10, int i11, int i12) {
            return C2915z.i(i10, this.f37812F, S() + i11, i12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2898h
        public final AbstractC2898h F(int i10, int i11) {
            int i12 = AbstractC2898h.i(i10, i11, size());
            return i12 == 0 ? AbstractC2898h.f37801C : new e(this.f37812F, S() + i10, i12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2898h
        protected final String J(Charset charset) {
            return new String(this.f37812F, S(), size(), charset);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2898h
        final void Q(AbstractC2897g abstractC2897g) {
            abstractC2897g.a(this.f37812F, S(), size());
        }

        final boolean R(AbstractC2898h abstractC2898h, int i10, int i11) {
            if (i11 > abstractC2898h.size()) {
                throw new IllegalArgumentException("Length too large: " + i11 + size());
            }
            int i12 = i10 + i11;
            if (i12 > abstractC2898h.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + abstractC2898h.size());
            }
            if (!(abstractC2898h instanceof j)) {
                return abstractC2898h.F(i10, i12).equals(F(0, i11));
            }
            j jVar = (j) abstractC2898h;
            byte[] bArr = this.f37812F;
            byte[] bArr2 = jVar.f37812F;
            int iS = S() + i11;
            int iS2 = S();
            int iS3 = jVar.S() + i10;
            while (iS2 < iS) {
                if (bArr[iS2] != bArr2[iS3]) {
                    return false;
                }
                iS2++;
                iS3++;
            }
            return true;
        }

        protected int S() {
            return 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2898h
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC2898h) || size() != ((AbstractC2898h) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof j)) {
                return obj.equals(this);
            }
            j jVar = (j) obj;
            int iE = E();
            int iE2 = jVar.E();
            if (iE == 0 || iE2 == 0 || iE == iE2) {
                return R(jVar, 0, size());
            }
            return false;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2898h
        public byte f(int i10) {
            return this.f37812F[i10];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2898h
        public int size() {
            return this.f37812F.length;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2898h
        protected void w(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f37812F, i10, bArr, i11, i12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2898h
        byte x(int i10) {
            return this.f37812F[i10];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2898h
        public final boolean y() {
            int iS = S();
            return q0.n(this.f37812F, iS, size() + iS);
        }
    }

    /* compiled from: ByteString.java */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$k */
    private static final class k implements f {
        private k() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2898h.f
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
        f37802D = C2894d.c() ? new k(aVar) : new d(aVar);
        f37803E = new b();
    }

    AbstractC2898h() {
    }

    static C0486h A(int i10) {
        return new C0486h(i10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int H(byte b10) {
        return b10 & 255;
    }

    private String L() {
        if (size() <= 50) {
            return k0.a(this);
        }
        return k0.a(F(0, 47)) + "...";
    }

    static AbstractC2898h M(byte[] bArr) {
        return new j(bArr);
    }

    static AbstractC2898h O(byte[] bArr, int i10, int i11) {
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

    public static AbstractC2898h j(byte[] bArr) {
        return r(bArr, 0, bArr.length);
    }

    public static AbstractC2898h r(byte[] bArr, int i10, int i11) {
        i(i10, i10 + i11, bArr.length);
        return new j(f37802D.a(bArr, i10, i11));
    }

    public static AbstractC2898h v(String str) {
        return new j(str.getBytes(C2915z.f38061b));
    }

    public abstract AbstractC2899i B();

    protected abstract int D(int i10, int i11, int i12);

    protected final int E() {
        return this.f37804B;
    }

    public abstract AbstractC2898h F(int i10, int i11);

    public final byte[] G() {
        int size = size();
        if (size == 0) {
            return C2915z.f38063d;
        }
        byte[] bArr = new byte[size];
        w(bArr, 0, 0, size);
        return bArr;
    }

    public final String I(Charset charset) {
        return size() == 0 ? "" : J(charset);
    }

    protected abstract String J(Charset charset);

    public final String K() {
        return I(C2915z.f38061b);
    }

    abstract void Q(AbstractC2897g abstractC2897g);

    public abstract boolean equals(Object obj);

    public abstract byte f(int i10);

    public final int hashCode() {
        int iD = this.f37804B;
        if (iD == 0) {
            int size = size();
            iD = D(size, 0, size);
            if (iD == 0) {
                iD = 1;
            }
            this.f37804B = iD;
        }
        return iD;
    }

    public abstract int size();

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), L());
    }

    protected abstract void w(byte[] bArr, int i10, int i11, int i12);

    abstract byte x(int i10);

    public abstract boolean y();

    @Override // java.lang.Iterable
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public g iterator() {
        return new a();
    }
}
