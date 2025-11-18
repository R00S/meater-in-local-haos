package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: ByteString.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.d */
/* loaded from: classes3.dex */
public abstract class AbstractC10745d implements Iterable<Byte> {

    /* renamed from: f */
    public static final AbstractC10745d f41263f = new C10755n(new byte[0]);

    /* compiled from: ByteString.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.d$a */
    public interface a extends Iterator<Byte> {
        /* renamed from: f */
        byte mo38274f();
    }

    AbstractC10745d() {
    }

    /* renamed from: c */
    private static AbstractC10745d m38275c(Iterator<AbstractC10745d> it, int i2) {
        if (i2 == 1) {
            return it.next();
        }
        int i3 = i2 >>> 1;
        return m38275c(it, i3).m38286f(m38275c(it, i2 - i3));
    }

    /* renamed from: g */
    public static AbstractC10745d m38276g(Iterable<AbstractC10745d> iterable) {
        Collection arrayList;
        if (iterable instanceof Collection) {
            arrayList = (Collection) iterable;
        } else {
            arrayList = new ArrayList();
            Iterator<AbstractC10745d> it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        return arrayList.isEmpty() ? f41263f : m38275c(arrayList.iterator(), arrayList.size());
    }

    /* renamed from: h */
    public static AbstractC10745d m38277h(byte[] bArr) {
        return m38278i(bArr, 0, bArr.length);
    }

    /* renamed from: i */
    public static AbstractC10745d m38278i(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        return new C10755n(bArr2);
    }

    /* renamed from: n */
    public static AbstractC10745d m38279n(String str) {
        try {
            return new C10755n(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("UTF-8 not supported?", e2);
        }
    }

    /* renamed from: w */
    public static b m38280w() {
        return new b(128);
    }

    /* renamed from: A */
    public byte[] m38281A() {
        int size = size();
        if (size == 0) {
            return C10750i.f41314a;
        }
        byte[] bArr = new byte[size];
        mo38271q(bArr, 0, 0, size);
        return bArr;
    }

    /* renamed from: C */
    public abstract String mo38282C(String str) throws UnsupportedEncodingException;

    /* renamed from: D */
    public String m38283D() {
        try {
            return mo38282C("UTF-8");
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("UTF-8 not supported?", e2);
        }
    }

    /* renamed from: E */
    void m38284E(OutputStream outputStream, int i2, int i3) throws IOException {
        if (i2 < 0) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i2);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i3 < 0) {
            StringBuilder sb2 = new StringBuilder(23);
            sb2.append("Length < 0: ");
            sb2.append(i3);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        int i4 = i2 + i3;
        if (i4 <= size()) {
            if (i3 > 0) {
                mo38285F(outputStream, i2, i3);
            }
        } else {
            StringBuilder sb3 = new StringBuilder(39);
            sb3.append("Source end offset exceeded: ");
            sb3.append(i4);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    /* renamed from: F */
    abstract void mo38285F(OutputStream outputStream, int i2, int i3) throws IOException;

    /* renamed from: f */
    public AbstractC10745d m38286f(AbstractC10745d abstractC10745d) {
        int size = size();
        int size2 = abstractC10745d.size();
        if (size + size2 < 2147483647L) {
            return C10760s.m38439O(this, abstractC10745d);
        }
        StringBuilder sb = new StringBuilder(53);
        sb.append("ByteString would be too long: ");
        sb.append(size);
        sb.append("+");
        sb.append(size2);
        throw new IllegalArgumentException(sb.toString());
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    /* renamed from: o */
    public void m38287o(byte[] bArr, int i2, int i3, int i4) {
        if (i2 < 0) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i2);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i3 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Target offset < 0: ");
            sb2.append(i3);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i4 < 0) {
            StringBuilder sb3 = new StringBuilder(23);
            sb3.append("Length < 0: ");
            sb3.append(i4);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        int i5 = i2 + i4;
        if (i5 > size()) {
            StringBuilder sb4 = new StringBuilder(34);
            sb4.append("Source end offset < 0: ");
            sb4.append(i5);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
        int i6 = i3 + i4;
        if (i6 <= bArr.length) {
            if (i4 > 0) {
                mo38271q(bArr, i2, i3, i4);
            }
        } else {
            StringBuilder sb5 = new StringBuilder(34);
            sb5.append("Target end offset < 0: ");
            sb5.append(i6);
            throw new IndexOutOfBoundsException(sb5.toString());
        }
    }

    /* renamed from: q */
    protected abstract void mo38271q(byte[] bArr, int i2, int i3, int i4);

    /* renamed from: r */
    protected abstract int mo38288r();

    /* renamed from: s */
    protected abstract boolean mo38289s();

    public abstract int size();

    /* renamed from: t */
    public abstract boolean mo38290t();

    public String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    @Override // java.lang.Iterable
    /* renamed from: u */
    public abstract a iterator();

    /* renamed from: v */
    public abstract C10746e mo38291v();

    /* renamed from: x */
    protected abstract int mo38292x(int i2, int i3, int i4);

    /* renamed from: y */
    protected abstract int mo38293y(int i2, int i3, int i4);

    /* renamed from: z */
    protected abstract int mo38294z();

    /* compiled from: ByteString.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.d$b */
    public static final class b extends OutputStream {

        /* renamed from: f */
        private static final byte[] f41264f = new byte[0];

        /* renamed from: g */
        private final int f41265g;

        /* renamed from: h */
        private final ArrayList<AbstractC10745d> f41266h;

        /* renamed from: i */
        private int f41267i;

        /* renamed from: j */
        private byte[] f41268j;

        /* renamed from: k */
        private int f41269k;

        b(int i2) {
            if (i2 < 0) {
                throw new IllegalArgumentException("Buffer size < 0");
            }
            this.f41265g = i2;
            this.f41266h = new ArrayList<>();
            this.f41268j = new byte[i2];
        }

        /* renamed from: a */
        private byte[] m38295a(byte[] bArr, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i2));
            return bArr2;
        }

        /* renamed from: b */
        private void m38296b(int i2) {
            this.f41266h.add(new C10755n(this.f41268j));
            int length = this.f41267i + this.f41268j.length;
            this.f41267i = length;
            this.f41268j = new byte[Math.max(this.f41265g, Math.max(i2, length >>> 1))];
            this.f41269k = 0;
        }

        /* renamed from: c */
        private void m38297c() {
            int i2 = this.f41269k;
            byte[] bArr = this.f41268j;
            if (i2 >= bArr.length) {
                this.f41266h.add(new C10755n(this.f41268j));
                this.f41268j = f41264f;
            } else if (i2 > 0) {
                this.f41266h.add(new C10755n(m38295a(bArr, i2)));
            }
            this.f41267i += this.f41269k;
            this.f41269k = 0;
        }

        /* renamed from: d */
        public synchronized int m38298d() {
            return this.f41267i + this.f41269k;
        }

        /* renamed from: e */
        public synchronized AbstractC10745d m38299e() {
            m38297c();
            return AbstractC10745d.m38276g(this.f41266h);
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(m38298d()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i2) {
            if (this.f41269k == this.f41268j.length) {
                m38296b(1);
            }
            byte[] bArr = this.f41268j;
            int i3 = this.f41269k;
            this.f41269k = i3 + 1;
            bArr[i3] = (byte) i2;
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i2, int i3) {
            byte[] bArr2 = this.f41268j;
            int length = bArr2.length;
            int i4 = this.f41269k;
            if (i3 <= length - i4) {
                System.arraycopy(bArr, i2, bArr2, i4, i3);
                this.f41269k += i3;
            } else {
                int length2 = bArr2.length - i4;
                System.arraycopy(bArr, i2, bArr2, i4, length2);
                int i5 = i3 - length2;
                m38296b(i5);
                System.arraycopy(bArr, i2 + length2, this.f41268j, 0, i5);
                this.f41269k = i5;
            }
        }
    }
}
