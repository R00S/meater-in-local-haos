package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: ByteString.java */
/* renamed from: androidx.datastore.preferences.protobuf.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2062h implements Iterable<Byte>, Serializable {

    /* renamed from: C, reason: collision with root package name */
    public static final AbstractC2062h f24923C = new j(C2079z.f25186c);

    /* renamed from: D, reason: collision with root package name */
    private static final f f24924D;

    /* renamed from: E, reason: collision with root package name */
    private static final Comparator<AbstractC2062h> f24925E;

    /* renamed from: B, reason: collision with root package name */
    private int f24926B = 0;

    /* compiled from: ByteString.java */
    /* renamed from: androidx.datastore.preferences.protobuf.h$a */
    class a extends c {

        /* renamed from: B, reason: collision with root package name */
        private int f24927B = 0;

        /* renamed from: C, reason: collision with root package name */
        private final int f24928C;

        a() {
            this.f24928C = AbstractC2062h.this.size();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2062h.g
        public byte c() {
            int i10 = this.f24927B;
            if (i10 >= this.f24928C) {
                throw new NoSuchElementException();
            }
            this.f24927B = i10 + 1;
            return AbstractC2062h.this.x(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f24927B < this.f24928C;
        }
    }

    /* compiled from: ByteString.java */
    /* renamed from: androidx.datastore.preferences.protobuf.h$b */
    static class b implements Comparator<AbstractC2062h> {
        b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC2062h abstractC2062h, AbstractC2062h abstractC2062h2) {
            g it = abstractC2062h.iterator();
            g it2 = abstractC2062h2.iterator();
            while (it.hasNext() && it2.hasNext()) {
                int iCompare = Integer.compare(AbstractC2062h.H(it.c()), AbstractC2062h.H(it2.c()));
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return Integer.compare(abstractC2062h.size(), abstractC2062h2.size());
        }
    }

    /* compiled from: ByteString.java */
    /* renamed from: androidx.datastore.preferences.protobuf.h$c */
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
    /* renamed from: androidx.datastore.preferences.protobuf.h$d */
    private static final class d implements f {
        private d() {
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2062h.f
        public byte[] a(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* compiled from: ByteString.java */
    /* renamed from: androidx.datastore.preferences.protobuf.h$e */
    private static final class e extends j {

        /* renamed from: G, reason: collision with root package name */
        private final int f24930G;

        /* renamed from: H, reason: collision with root package name */
        private final int f24931H;

        e(byte[] bArr, int i10, int i11) {
            super(bArr);
            AbstractC2062h.i(i10, i10 + i11, bArr.length);
            this.f24930G = i10;
            this.f24931H = i11;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2062h.j
        protected int R() {
            return this.f24930G;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2062h.j, androidx.datastore.preferences.protobuf.AbstractC2062h
        public byte f(int i10) {
            AbstractC2062h.h(i10, size());
            return this.f24934F[this.f24930G + i10];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2062h.j, androidx.datastore.preferences.protobuf.AbstractC2062h
        public int size() {
            return this.f24931H;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2062h.j, androidx.datastore.preferences.protobuf.AbstractC2062h
        protected void w(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f24934F, R() + i10, bArr, i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2062h.j, androidx.datastore.preferences.protobuf.AbstractC2062h
        byte x(int i10) {
            return this.f24934F[this.f24930G + i10];
        }
    }

    /* compiled from: ByteString.java */
    /* renamed from: androidx.datastore.preferences.protobuf.h$f */
    private interface f {
        byte[] a(byte[] bArr, int i10, int i11);
    }

    /* compiled from: ByteString.java */
    /* renamed from: androidx.datastore.preferences.protobuf.h$g */
    public interface g extends Iterator<Byte> {
        byte c();
    }

    /* compiled from: ByteString.java */
    /* renamed from: androidx.datastore.preferences.protobuf.h$h, reason: collision with other inner class name */
    static final class C0351h {

        /* renamed from: a, reason: collision with root package name */
        private final CodedOutputStream f24932a;

        /* renamed from: b, reason: collision with root package name */
        private final byte[] f24933b;

        /* synthetic */ C0351h(int i10, a aVar) {
            this(i10);
        }

        public AbstractC2062h a() {
            this.f24932a.c();
            return new j(this.f24933b);
        }

        public CodedOutputStream b() {
            return this.f24932a;
        }

        private C0351h(int i10) {
            byte[] bArr = new byte[i10];
            this.f24933b = bArr;
            this.f24932a = CodedOutputStream.g0(bArr);
        }
    }

    /* compiled from: ByteString.java */
    /* renamed from: androidx.datastore.preferences.protobuf.h$i */
    static abstract class i extends AbstractC2062h {
        i() {
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2062h, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
            return super.iterator();
        }
    }

    /* compiled from: ByteString.java */
    /* renamed from: androidx.datastore.preferences.protobuf.h$j */
    private static class j extends i {

        /* renamed from: F, reason: collision with root package name */
        protected final byte[] f24934F;

        j(byte[] bArr) {
            bArr.getClass();
            this.f24934F = bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2062h
        public final AbstractC2063i B() {
            return AbstractC2063i.j(this.f24934F, R(), size(), true);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2062h
        protected final int D(int i10, int i11, int i12) {
            return C2079z.i(i10, this.f24934F, R() + i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2062h
        public final AbstractC2062h F(int i10, int i11) {
            int i12 = AbstractC2062h.i(i10, i11, size());
            return i12 == 0 ? AbstractC2062h.f24923C : new e(this.f24934F, R() + i10, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2062h
        protected final String J(Charset charset) {
            return new String(this.f24934F, R(), size(), charset);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2062h
        final void O(AbstractC2061g abstractC2061g) {
            abstractC2061g.a(this.f24934F, R(), size());
        }

        final boolean Q(AbstractC2062h abstractC2062h, int i10, int i11) {
            if (i11 > abstractC2062h.size()) {
                throw new IllegalArgumentException("Length too large: " + i11 + size());
            }
            int i12 = i10 + i11;
            if (i12 > abstractC2062h.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + abstractC2062h.size());
            }
            if (!(abstractC2062h instanceof j)) {
                return abstractC2062h.F(i10, i12).equals(F(0, i11));
            }
            j jVar = (j) abstractC2062h;
            byte[] bArr = this.f24934F;
            byte[] bArr2 = jVar.f24934F;
            int iR = R() + i11;
            int iR2 = R();
            int iR3 = jVar.R() + i10;
            while (iR2 < iR) {
                if (bArr[iR2] != bArr2[iR3]) {
                    return false;
                }
                iR2++;
                iR3++;
            }
            return true;
        }

        protected int R() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2062h
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC2062h) || size() != ((AbstractC2062h) obj).size()) {
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
                return Q(jVar, 0, size());
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2062h
        public byte f(int i10) {
            return this.f24934F[i10];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2062h
        public int size() {
            return this.f24934F.length;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2062h
        protected void w(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f24934F, i10, bArr, i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2062h
        byte x(int i10) {
            return this.f24934F[i10];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2062h
        public final boolean y() {
            int iR = R();
            return q0.n(this.f24934F, iR, size() + iR);
        }
    }

    /* compiled from: ByteString.java */
    /* renamed from: androidx.datastore.preferences.protobuf.h$k */
    private static final class k implements f {
        private k() {
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2062h.f
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
        f24924D = C2058d.c() ? new k(aVar) : new d(aVar);
        f24925E = new b();
    }

    AbstractC2062h() {
    }

    static C0351h A(int i10) {
        return new C0351h(i10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int H(byte b10) {
        return b10 & 255;
    }

    static AbstractC2062h L(byte[] bArr) {
        return new j(bArr);
    }

    static AbstractC2062h M(byte[] bArr, int i10, int i11) {
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

    public static AbstractC2062h j(byte[] bArr) {
        return r(bArr, 0, bArr.length);
    }

    public static AbstractC2062h r(byte[] bArr, int i10, int i11) {
        i(i10, i10 + i11, bArr.length);
        return new j(f24924D.a(bArr, i10, i11));
    }

    public static AbstractC2062h v(String str) {
        return new j(str.getBytes(C2079z.f25184a));
    }

    public abstract AbstractC2063i B();

    protected abstract int D(int i10, int i11, int i12);

    protected final int E() {
        return this.f24926B;
    }

    public abstract AbstractC2062h F(int i10, int i11);

    public final byte[] G() {
        int size = size();
        if (size == 0) {
            return C2079z.f25186c;
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
        return I(C2079z.f25184a);
    }

    abstract void O(AbstractC2061g abstractC2061g);

    public abstract boolean equals(Object obj);

    public abstract byte f(int i10);

    public final int hashCode() {
        int iD = this.f24926B;
        if (iD == 0) {
            int size = size();
            iD = D(size, 0, size);
            if (iD == 0) {
                iD = 1;
            }
            this.f24926B = iD;
        }
        return iD;
    }

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
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
