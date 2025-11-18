package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.NoSuchElementException;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10745d;

/* compiled from: BoundedByteString.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.c */
/* loaded from: classes3.dex */
class C10744c extends C10755n {

    /* renamed from: i */
    private final int f41258i;

    /* renamed from: j */
    private final int f41259j;

    /* compiled from: BoundedByteString.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.c$b */
    private class b implements AbstractC10745d.a {

        /* renamed from: f */
        private int f41260f;

        /* renamed from: g */
        private final int f41261g;

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(mo38274f());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10745d.a
        /* renamed from: f */
        public byte mo38274f() {
            int i2 = this.f41260f;
            if (i2 >= this.f41261g) {
                throw new NoSuchElementException();
            }
            byte[] bArr = C10744c.this.f41325g;
            this.f41260f = i2 + 1;
            return bArr[i2];
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f41260f < this.f41261g;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private b() {
            int iMo38270M = C10744c.this.mo38270M();
            this.f41260f = iMo38270M;
            this.f41261g = iMo38270M + C10744c.this.size();
        }
    }

    C10744c(byte[] bArr, int i2, int i3) {
        super(bArr);
        if (i2 < 0) {
            StringBuilder sb = new StringBuilder(29);
            sb.append("Offset too small: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i3 < 0) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append("Length too small: ");
            sb2.append(i2);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (i2 + i3 <= bArr.length) {
            this.f41258i = i2;
            this.f41259j = i3;
            return;
        }
        StringBuilder sb3 = new StringBuilder(48);
        sb3.append("Offset+Length too large: ");
        sb3.append(i2);
        sb3.append("+");
        sb3.append(i3);
        throw new IllegalArgumentException(sb3.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.C10755n
    /* renamed from: G */
    public byte mo38269G(int i2) {
        if (i2 < 0) {
            StringBuilder sb = new StringBuilder(28);
            sb.append("Index too small: ");
            sb.append(i2);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        if (i2 < size()) {
            return this.f41325g[this.f41258i + i2];
        }
        int size = size();
        StringBuilder sb2 = new StringBuilder(41);
        sb2.append("Index too large: ");
        sb2.append(i2);
        sb2.append(", ");
        sb2.append(size);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.C10755n
    /* renamed from: M */
    protected int mo38270M() {
        return this.f41258i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.C10755n, kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10745d
    /* renamed from: q */
    protected void mo38271q(byte[] bArr, int i2, int i3, int i4) {
        System.arraycopy(this.f41325g, mo38270M() + i2, bArr, i3, i4);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.C10755n, kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10745d
    public int size() {
        return this.f41259j;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.C10755n, kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10745d, java.lang.Iterable
    /* renamed from: u */
    public AbstractC10745d.a iterator() {
        return new b();
    }
}
