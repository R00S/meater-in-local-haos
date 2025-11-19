package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.util.NoSuchElementException;
import kotlin.reflect.jvm.internal.impl.protobuf.d;

/* compiled from: LiteralByteString.java */
/* loaded from: classes3.dex */
class n extends d {

    /* renamed from: C, reason: collision with root package name */
    protected final byte[] f44087C;

    /* renamed from: D, reason: collision with root package name */
    private int f44088D = 0;

    /* compiled from: LiteralByteString.java */
    private class b implements d.a {

        /* renamed from: B, reason: collision with root package name */
        private int f44089B;

        /* renamed from: C, reason: collision with root package name */
        private final int f44090C;

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(c());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.d.a
        public byte c() {
            try {
                byte[] bArr = n.this.f44087C;
                int i10 = this.f44089B;
                this.f44089B = i10 + 1;
                return bArr[i10];
            } catch (ArrayIndexOutOfBoundsException e10) {
                throw new NoSuchElementException(e10.getMessage());
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f44089B < this.f44090C;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private b() {
            this.f44089B = 0;
            this.f44090C = n.this.size();
        }
    }

    n(byte[] bArr) {
        this.f44087C = bArr;
    }

    static int R(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d, java.lang.Iterable
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public d.a iterator() {
        return new b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public e B() {
        return e.h(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected int E(int i10, int i11, int i12) {
        return R(i10, this.f44087C, Q() + i11, i12);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected int F(int i10, int i11, int i12) {
        int iQ = Q() + i11;
        return v.g(i10, this.f44087C, iQ, i12 + iQ);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected int G() {
        return this.f44088D;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public String I(String str) {
        return new String(this.f44087C, Q(), size(), str);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    void L(OutputStream outputStream, int i10, int i11) throws IOException {
        outputStream.write(this.f44087C, Q() + i10, i11);
    }

    public byte M(int i10) {
        return this.f44087C[i10];
    }

    boolean O(n nVar, int i10, int i11) {
        if (i11 > nVar.size()) {
            int size = size();
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Length too large: ");
            sb2.append(i11);
            sb2.append(size);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (i10 + i11 > nVar.size()) {
            int size2 = nVar.size();
            StringBuilder sb3 = new StringBuilder(59);
            sb3.append("Ran off end of other: ");
            sb3.append(i10);
            sb3.append(", ");
            sb3.append(i11);
            sb3.append(", ");
            sb3.append(size2);
            throw new IllegalArgumentException(sb3.toString());
        }
        byte[] bArr = this.f44087C;
        byte[] bArr2 = nVar.f44087C;
        int iQ = Q() + i11;
        int iQ2 = Q();
        int iQ3 = nVar.Q() + i10;
        while (iQ2 < iQ) {
            if (bArr[iQ2] != bArr2[iQ3]) {
                return false;
            }
            iQ2++;
            iQ3++;
        }
        return true;
    }

    protected int Q() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d) || size() != ((d) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof n) {
            return O((n) obj, 0, size());
        }
        if (obj instanceof s) {
            return obj.equals(this);
        }
        String strValueOf = String.valueOf(obj.getClass());
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 49);
        sb2.append("Has a new type of ByteString been created? Found ");
        sb2.append(strValueOf);
        throw new IllegalArgumentException(sb2.toString());
    }

    public int hashCode() {
        int iE = this.f44088D;
        if (iE == 0) {
            int size = size();
            iE = E(size, 0, size);
            if (iE == 0) {
                iE = 1;
            }
            this.f44088D = iE;
        }
        return iE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public int size() {
        return this.f44087C.length;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected void w(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f44087C, i10, bArr, i11, i12);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected int x() {
        return 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected boolean y() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public boolean z() {
        int iQ = Q();
        return v.f(this.f44087C, iQ, size() + iQ);
    }
}
