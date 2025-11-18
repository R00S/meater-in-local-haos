package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.NoSuchElementException;
import kotlin.reflect.jvm.internal.impl.protobuf.d;

/* compiled from: BoundedByteString.java */
/* loaded from: classes3.dex */
class c extends n {

    /* renamed from: E, reason: collision with root package name */
    private final int f44021E;

    /* renamed from: F, reason: collision with root package name */
    private final int f44022F;

    /* compiled from: BoundedByteString.java */
    private class b implements d.a {

        /* renamed from: B, reason: collision with root package name */
        private int f44023B;

        /* renamed from: C, reason: collision with root package name */
        private final int f44024C;

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(c());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.d.a
        public byte c() {
            int i10 = this.f44023B;
            if (i10 >= this.f44024C) {
                throw new NoSuchElementException();
            }
            byte[] bArr = c.this.f44087C;
            this.f44023B = i10 + 1;
            return bArr[i10];
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f44023B < this.f44024C;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private b() {
            int iQ = c.this.Q();
            this.f44023B = iQ;
            this.f44024C = iQ + c.this.size();
        }
    }

    c(byte[] bArr, int i10, int i11) {
        super(bArr);
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append("Offset too small: ");
            sb2.append(i10);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (i11 < 0) {
            StringBuilder sb3 = new StringBuilder(29);
            sb3.append("Length too small: ");
            sb3.append(i10);
            throw new IllegalArgumentException(sb3.toString());
        }
        if (i10 + i11 <= bArr.length) {
            this.f44021E = i10;
            this.f44022F = i11;
            return;
        }
        StringBuilder sb4 = new StringBuilder(48);
        sb4.append("Offset+Length too large: ");
        sb4.append(i10);
        sb4.append("+");
        sb4.append(i11);
        throw new IllegalArgumentException(sb4.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n, kotlin.reflect.jvm.internal.impl.protobuf.d, java.lang.Iterable
    /* renamed from: A */
    public d.a iterator() {
        return new b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    public byte M(int i10) {
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(28);
            sb2.append("Index too small: ");
            sb2.append(i10);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        if (i10 < size()) {
            return this.f44087C[this.f44021E + i10];
        }
        int size = size();
        StringBuilder sb3 = new StringBuilder(41);
        sb3.append("Index too large: ");
        sb3.append(i10);
        sb3.append(", ");
        sb3.append(size);
        throw new ArrayIndexOutOfBoundsException(sb3.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    protected int Q() {
        return this.f44021E;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n, kotlin.reflect.jvm.internal.impl.protobuf.d
    public int size() {
        return this.f44022F;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n, kotlin.reflect.jvm.internal.impl.protobuf.d
    protected void w(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f44087C, Q() + i10, bArr, i11, i12);
    }
}
