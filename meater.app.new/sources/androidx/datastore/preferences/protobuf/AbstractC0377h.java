package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import okhttp3.HttpUrl;

/* compiled from: ByteString.java */
/* renamed from: androidx.datastore.preferences.protobuf.h */
/* loaded from: classes.dex */
public abstract class AbstractC0377h implements Iterable<Byte>, Serializable {

    /* renamed from: f */
    public static final AbstractC0377h f2734f = new j(C0357a0.f2675c);

    /* renamed from: g */
    private static final f f2735g;

    /* renamed from: h */
    private static final Comparator<AbstractC0377h> f2736h;

    /* renamed from: i */
    private int f2737i = 0;

    /* compiled from: ByteString.java */
    /* renamed from: androidx.datastore.preferences.protobuf.h$a */
    class a extends c {

        /* renamed from: f */
        private int f2738f = 0;

        /* renamed from: g */
        private final int f2739g;

        a() {
            this.f2739g = AbstractC0377h.this.size();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0377h.g
        /* renamed from: f */
        public byte mo2734f() {
            int i2 = this.f2738f;
            if (i2 >= this.f2739g) {
                throw new NoSuchElementException();
            }
            this.f2738f = i2 + 1;
            return AbstractC0377h.this.mo2726r(i2);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f2738f < this.f2739g;
        }
    }

    /* compiled from: ByteString.java */
    /* renamed from: androidx.datastore.preferences.protobuf.h$b */
    static class b implements Comparator<AbstractC0377h> {
        b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC0377h abstractC0377h, AbstractC0377h abstractC0377h2) {
            g it = abstractC0377h.iterator();
            g it2 = abstractC0377h2.iterator();
            while (it.hasNext() && it2.hasNext()) {
                int iM2811a = C0380i.m2811a(AbstractC0377h.m2710A(it.mo2734f()), AbstractC0377h.m2710A(it2.mo2734f()));
                if (iM2811a != 0) {
                    return iM2811a;
                }
            }
            return C0380i.m2811a(abstractC0377h.size(), abstractC0377h2.size());
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
            return Byte.valueOf(mo2734f());
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

        @Override // androidx.datastore.preferences.protobuf.AbstractC0377h.f
        /* renamed from: a */
        public byte[] mo2737a(byte[] bArr, int i2, int i3) {
            return Arrays.copyOfRange(bArr, i2, i3 + i2);
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* compiled from: ByteString.java */
    /* renamed from: androidx.datastore.preferences.protobuf.h$e */
    private static final class e extends j {

        /* renamed from: k */
        private final int f2741k;

        /* renamed from: l */
        private final int f2742l;

        e(byte[] bArr, int i2, int i3) {
            super(bArr);
            AbstractC0377h.m2715h(i2, i2 + i3, bArr.length);
            this.f2741k = i2;
            this.f2742l = i3;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0377h.j
        /* renamed from: O */
        protected int mo2738O() {
            return this.f2741k;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0377h.j, androidx.datastore.preferences.protobuf.AbstractC0377h
        /* renamed from: f */
        public byte mo2724f(int i2) {
            AbstractC0377h.m2714g(i2, size());
            return this.f2745j[this.f2741k + i2];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0377h.j, androidx.datastore.preferences.protobuf.AbstractC0377h
        /* renamed from: q */
        protected void mo2725q(byte[] bArr, int i2, int i3, int i4) {
            System.arraycopy(this.f2745j, mo2738O() + i2, bArr, i3, i4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0377h.j, androidx.datastore.preferences.protobuf.AbstractC0377h
        /* renamed from: r */
        byte mo2726r(int i2) {
            return this.f2745j[this.f2741k + i2];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0377h.j, androidx.datastore.preferences.protobuf.AbstractC0377h
        public int size() {
            return this.f2742l;
        }

        Object writeReplace() {
            return AbstractC0377h.m2711F(m2733z());
        }
    }

    /* compiled from: ByteString.java */
    /* renamed from: androidx.datastore.preferences.protobuf.h$f */
    private interface f {
        /* renamed from: a */
        byte[] mo2737a(byte[] bArr, int i2, int i3);
    }

    /* compiled from: ByteString.java */
    /* renamed from: androidx.datastore.preferences.protobuf.h$g */
    public interface g extends Iterator<Byte> {
        /* renamed from: f */
        byte mo2734f();
    }

    /* compiled from: ByteString.java */
    /* renamed from: androidx.datastore.preferences.protobuf.h$h */
    static final class h {

        /* renamed from: a */
        private final CodedOutputStream f2743a;

        /* renamed from: b */
        private final byte[] f2744b;

        /* synthetic */ h(int i2, a aVar) {
            this(i2);
        }

        /* renamed from: a */
        public AbstractC0377h m2739a() {
            this.f2743a.m2493c();
            return new j(this.f2744b);
        }

        /* renamed from: b */
        public CodedOutputStream m2740b() {
            return this.f2743a;
        }

        private h(int i2) {
            byte[] bArr = new byte[i2];
            this.f2744b = bArr;
            this.f2743a = CodedOutputStream.m2445g0(bArr);
        }
    }

    /* compiled from: ByteString.java */
    /* renamed from: androidx.datastore.preferences.protobuf.h$i */
    static abstract class i extends AbstractC0377h {
        i() {
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0377h, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
            return super.iterator();
        }
    }

    /* compiled from: ByteString.java */
    /* renamed from: androidx.datastore.preferences.protobuf.h$j */
    private static class j extends i {

        /* renamed from: j */
        protected final byte[] f2745j;

        j(byte[] bArr) {
            bArr.getClass();
            this.f2745j = bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0377h
        /* renamed from: D */
        protected final String mo2721D(Charset charset) {
            return new String(this.f2745j, mo2738O(), size(), charset);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0377h
        /* renamed from: L */
        final void mo2723L(AbstractC0374g abstractC0374g) throws IOException {
            abstractC0374g.mo2522a(this.f2745j, mo2738O(), size());
        }

        /* renamed from: M */
        final boolean m2741M(AbstractC0377h abstractC0377h, int i2, int i3) {
            if (i3 > abstractC0377h.size()) {
                throw new IllegalArgumentException("Length too large: " + i3 + size());
            }
            int i4 = i2 + i3;
            if (i4 > abstractC0377h.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i2 + ", " + i3 + ", " + abstractC0377h.size());
            }
            if (!(abstractC0377h instanceof j)) {
                return abstractC0377h.mo2732y(i2, i4).equals(mo2732y(0, i3));
            }
            j jVar = (j) abstractC0377h;
            byte[] bArr = this.f2745j;
            byte[] bArr2 = jVar.f2745j;
            int iMo2738O = mo2738O() + i3;
            int iMo2738O2 = mo2738O();
            int iMo2738O3 = jVar.mo2738O() + i2;
            while (iMo2738O2 < iMo2738O) {
                if (bArr[iMo2738O2] != bArr2[iMo2738O3]) {
                    return false;
                }
                iMo2738O2++;
                iMo2738O3++;
            }
            return true;
        }

        /* renamed from: O */
        protected int mo2738O() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0377h
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC0377h) || size() != ((AbstractC0377h) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof j)) {
                return obj.equals(this);
            }
            j jVar = (j) obj;
            int iM2731x = m2731x();
            int iM2731x2 = jVar.m2731x();
            if (iM2731x == 0 || iM2731x2 == 0 || iM2731x == iM2731x2) {
                return m2741M(jVar, 0, size());
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0377h
        /* renamed from: f */
        public byte mo2724f(int i2) {
            return this.f2745j[i2];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0377h
        /* renamed from: q */
        protected void mo2725q(byte[] bArr, int i2, int i3, int i4) {
            System.arraycopy(this.f2745j, i2, bArr, i3, i4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0377h
        /* renamed from: r */
        byte mo2726r(int i2) {
            return this.f2745j[i2];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0377h
        /* renamed from: s */
        public final boolean mo2727s() {
            int iMo2738O = mo2738O();
            return C0406q1.m3172n(this.f2745j, iMo2738O, size() + iMo2738O);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0377h
        public int size() {
            return this.f2745j.length;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0377h
        /* renamed from: v */
        public final AbstractC0383j mo2729v() {
            return AbstractC0383j.m2853j(this.f2745j, mo2738O(), size(), true);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0377h
        /* renamed from: w */
        protected final int mo2730w(int i2, int i3, int i4) {
            return C0357a0.m2564i(i2, this.f2745j, mo2738O() + i3, i4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0377h
        /* renamed from: y */
        public final AbstractC0377h mo2732y(int i2, int i3) {
            int iM2715h = AbstractC0377h.m2715h(i2, i3, size());
            return iM2715h == 0 ? AbstractC0377h.f2734f : new e(this.f2745j, mo2738O() + i2, iM2715h);
        }
    }

    /* compiled from: ByteString.java */
    /* renamed from: androidx.datastore.preferences.protobuf.h$k */
    private static final class k implements f {
        private k() {
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0377h.f
        /* renamed from: a */
        public byte[] mo2737a(byte[] bArr, int i2, int i3) {
            byte[] bArr2 = new byte[i3];
            System.arraycopy(bArr, i2, bArr2, 0, i3);
            return bArr2;
        }

        /* synthetic */ k(a aVar) {
            this();
        }
    }

    static {
        a aVar = null;
        f2735g = C0365d.m2594c() ? new k(aVar) : new d(aVar);
        f2736h = new b();
    }

    AbstractC0377h() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public static int m2710A(byte b2) {
        return b2 & 255;
    }

    /* renamed from: F */
    static AbstractC0377h m2711F(byte[] bArr) {
        return new j(bArr);
    }

    /* renamed from: G */
    static AbstractC0377h m2712G(byte[] bArr, int i2, int i3) {
        return new e(bArr, i2, i3);
    }

    /* renamed from: g */
    static void m2714g(int i2, int i3) {
        if (((i3 - (i2 + 1)) | i2) < 0) {
            if (i2 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i2);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i2 + ", " + i3);
        }
    }

    /* renamed from: h */
    static int m2715h(int i2, int i3, int i4) {
        int i5 = i3 - i2;
        if ((i2 | i3 | i5 | (i4 - i3)) >= 0) {
            return i5;
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i2 + " < 0");
        }
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i2 + ", " + i3);
        }
        throw new IndexOutOfBoundsException("End index: " + i3 + " >= " + i4);
    }

    /* renamed from: i */
    public static AbstractC0377h m2716i(byte[] bArr) {
        return m2717n(bArr, 0, bArr.length);
    }

    /* renamed from: n */
    public static AbstractC0377h m2717n(byte[] bArr, int i2, int i3) {
        m2715h(i2, i2 + i3, bArr.length);
        return new j(f2735g.mo2737a(bArr, i2, i3));
    }

    /* renamed from: o */
    public static AbstractC0377h m2718o(String str) {
        return new j(str.getBytes(C0357a0.f2673a));
    }

    /* renamed from: u */
    static h m2719u(int i2) {
        return new h(i2, null);
    }

    /* renamed from: C */
    public final String m2720C(Charset charset) {
        return size() == 0 ? HttpUrl.FRAGMENT_ENCODE_SET : mo2721D(charset);
    }

    /* renamed from: D */
    protected abstract String mo2721D(Charset charset);

    /* renamed from: E */
    public final String m2722E() {
        return m2720C(C0357a0.f2673a);
    }

    /* renamed from: L */
    abstract void mo2723L(AbstractC0374g abstractC0374g) throws IOException;

    public abstract boolean equals(Object obj);

    /* renamed from: f */
    public abstract byte mo2724f(int i2);

    public final int hashCode() {
        int iMo2730w = this.f2737i;
        if (iMo2730w == 0) {
            int size = size();
            iMo2730w = mo2730w(size, 0, size);
            if (iMo2730w == 0) {
                iMo2730w = 1;
            }
            this.f2737i = iMo2730w;
        }
        return iMo2730w;
    }

    /* renamed from: q */
    protected abstract void mo2725q(byte[] bArr, int i2, int i3, int i4);

    /* renamed from: r */
    abstract byte mo2726r(int i2);

    /* renamed from: s */
    public abstract boolean mo2727s();

    public abstract int size();

    @Override // java.lang.Iterable
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public g iterator() {
        return new a();
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    /* renamed from: v */
    public abstract AbstractC0383j mo2729v();

    /* renamed from: w */
    protected abstract int mo2730w(int i2, int i3, int i4);

    /* renamed from: x */
    protected final int m2731x() {
        return this.f2737i;
    }

    /* renamed from: y */
    public abstract AbstractC0377h mo2732y(int i2, int i3);

    /* renamed from: z */
    public final byte[] m2733z() {
        int size = size();
        if (size == 0) {
            return C0357a0.f2675c;
        }
        byte[] bArr = new byte[size];
        mo2725q(bArr, 0, 0, size);
        return bArr;
    }
}
