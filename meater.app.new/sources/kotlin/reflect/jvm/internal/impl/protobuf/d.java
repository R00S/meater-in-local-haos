package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: ByteString.java */
/* loaded from: classes3.dex */
public abstract class d implements Iterable<Byte> {

    /* renamed from: B, reason: collision with root package name */
    public static final d f44026B = new n(new byte[0]);

    /* compiled from: ByteString.java */
    public interface a extends Iterator<Byte> {
        byte c();
    }

    d() {
    }

    public static b D() {
        return new b(128);
    }

    private static d c(Iterator<d> it, int i10) {
        if (i10 == 1) {
            return it.next();
        }
        int i11 = i10 >>> 1;
        return c(it, i11).f(c(it, i10 - i11));
    }

    public static d h(Iterable<d> iterable) {
        Collection arrayList;
        if (iterable instanceof Collection) {
            arrayList = (Collection) iterable;
        } else {
            arrayList = new ArrayList();
            Iterator<d> it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        return arrayList.isEmpty() ? f44026B : c(arrayList.iterator(), arrayList.size());
    }

    public static d i(byte[] bArr) {
        return j(bArr, 0, bArr.length);
    }

    public static d j(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new n(bArr2);
    }

    public static d r(String str) {
        try {
            return new n(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UTF-8 not supported?", e10);
        }
    }

    @Override // java.lang.Iterable
    /* renamed from: A */
    public abstract a iterator();

    public abstract e B();

    protected abstract int E(int i10, int i11, int i12);

    protected abstract int F(int i10, int i11, int i12);

    protected abstract int G();

    public byte[] H() {
        int size = size();
        if (size == 0) {
            return i.f44076a;
        }
        byte[] bArr = new byte[size];
        w(bArr, 0, 0, size);
        return bArr;
    }

    public abstract String I(String str);

    public String J() {
        try {
            return I("UTF-8");
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UTF-8 not supported?", e10);
        }
    }

    void K(OutputStream outputStream, int i10, int i11) {
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Source offset < 0: ");
            sb2.append(i10);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i11 < 0) {
            StringBuilder sb3 = new StringBuilder(23);
            sb3.append("Length < 0: ");
            sb3.append(i11);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        int i12 = i10 + i11;
        if (i12 <= size()) {
            if (i11 > 0) {
                L(outputStream, i10, i11);
            }
        } else {
            StringBuilder sb4 = new StringBuilder(39);
            sb4.append("Source end offset exceeded: ");
            sb4.append(i12);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
    }

    abstract void L(OutputStream outputStream, int i10, int i11);

    public d f(d dVar) {
        int size = size();
        int size2 = dVar.size();
        if (size + size2 < 2147483647L) {
            return s.R(this, dVar);
        }
        StringBuilder sb2 = new StringBuilder(53);
        sb2.append("ByteString would be too long: ");
        sb2.append(size);
        sb2.append("+");
        sb2.append(size2);
        throw new IllegalArgumentException(sb2.toString());
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public abstract int size();

    public String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public void v(byte[] bArr, int i10, int i11, int i12) {
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Source offset < 0: ");
            sb2.append(i10);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i11 < 0) {
            StringBuilder sb3 = new StringBuilder(30);
            sb3.append("Target offset < 0: ");
            sb3.append(i11);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        if (i12 < 0) {
            StringBuilder sb4 = new StringBuilder(23);
            sb4.append("Length < 0: ");
            sb4.append(i12);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
        int i13 = i10 + i12;
        if (i13 > size()) {
            StringBuilder sb5 = new StringBuilder(34);
            sb5.append("Source end offset < 0: ");
            sb5.append(i13);
            throw new IndexOutOfBoundsException(sb5.toString());
        }
        int i14 = i11 + i12;
        if (i14 <= bArr.length) {
            if (i12 > 0) {
                w(bArr, i10, i11, i12);
            }
        } else {
            StringBuilder sb6 = new StringBuilder(34);
            sb6.append("Target end offset < 0: ");
            sb6.append(i14);
            throw new IndexOutOfBoundsException(sb6.toString());
        }
    }

    protected abstract void w(byte[] bArr, int i10, int i11, int i12);

    protected abstract int x();

    protected abstract boolean y();

    public abstract boolean z();

    /* compiled from: ByteString.java */
    public static final class b extends OutputStream {

        /* renamed from: G, reason: collision with root package name */
        private static final byte[] f44027G = new byte[0];

        /* renamed from: B, reason: collision with root package name */
        private final int f44028B;

        /* renamed from: C, reason: collision with root package name */
        private final ArrayList<d> f44029C;

        /* renamed from: D, reason: collision with root package name */
        private int f44030D;

        /* renamed from: E, reason: collision with root package name */
        private byte[] f44031E;

        /* renamed from: F, reason: collision with root package name */
        private int f44032F;

        b(int i10) {
            if (i10 < 0) {
                throw new IllegalArgumentException("Buffer size < 0");
            }
            this.f44028B = i10;
            this.f44029C = new ArrayList<>();
            this.f44031E = new byte[i10];
        }

        private byte[] a(byte[] bArr, int i10) {
            byte[] bArr2 = new byte[i10];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i10));
            return bArr2;
        }

        private void b(int i10) {
            this.f44029C.add(new n(this.f44031E));
            int length = this.f44030D + this.f44031E.length;
            this.f44030D = length;
            this.f44031E = new byte[Math.max(this.f44028B, Math.max(i10, length >>> 1))];
            this.f44032F = 0;
        }

        private void c() {
            int i10 = this.f44032F;
            byte[] bArr = this.f44031E;
            if (i10 >= bArr.length) {
                this.f44029C.add(new n(this.f44031E));
                this.f44031E = f44027G;
            } else if (i10 > 0) {
                this.f44029C.add(new n(a(bArr, i10)));
            }
            this.f44030D += this.f44032F;
            this.f44032F = 0;
        }

        public synchronized int d() {
            return this.f44030D + this.f44032F;
        }

        public synchronized d e() {
            c();
            return d.h(this.f44029C);
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(d()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i10) {
            try {
                if (this.f44032F == this.f44031E.length) {
                    b(1);
                }
                byte[] bArr = this.f44031E;
                int i11 = this.f44032F;
                this.f44032F = i11 + 1;
                bArr[i11] = (byte) i10;
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i10, int i11) {
            try {
                byte[] bArr2 = this.f44031E;
                int length = bArr2.length;
                int i12 = this.f44032F;
                if (i11 <= length - i12) {
                    System.arraycopy(bArr, i10, bArr2, i12, i11);
                    this.f44032F += i11;
                } else {
                    int length2 = bArr2.length - i12;
                    System.arraycopy(bArr, i10, bArr2, i12, length2);
                    int i13 = i11 - length2;
                    b(i13);
                    System.arraycopy(bArr, i10 + length2, this.f44031E, 0, i13);
                    this.f44032F = i13;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
