package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;
import kotlin.reflect.jvm.internal.impl.protobuf.d;

/* compiled from: RopeByteString.java */
/* loaded from: classes3.dex */
class s extends kotlin.reflect.jvm.internal.impl.protobuf.d {

    /* renamed from: I, reason: collision with root package name */
    private static final int[] f44092I;

    /* renamed from: C, reason: collision with root package name */
    private final int f44093C;

    /* renamed from: D, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f44094D;

    /* renamed from: E, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f44095E;

    /* renamed from: F, reason: collision with root package name */
    private final int f44096F;

    /* renamed from: G, reason: collision with root package name */
    private final int f44097G;

    /* renamed from: H, reason: collision with root package name */
    private int f44098H;

    /* compiled from: RopeByteString.java */
    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Stack<kotlin.reflect.jvm.internal.impl.protobuf.d> f44099a;

        private b() {
            this.f44099a = new Stack<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public kotlin.reflect.jvm.internal.impl.protobuf.d b(kotlin.reflect.jvm.internal.impl.protobuf.d dVar, kotlin.reflect.jvm.internal.impl.protobuf.d dVar2) {
            c(dVar);
            c(dVar2);
            kotlin.reflect.jvm.internal.impl.protobuf.d dVarPop = this.f44099a.pop();
            while (!this.f44099a.isEmpty()) {
                dVarPop = new s(this.f44099a.pop(), dVarPop);
            }
            return dVarPop;
        }

        private void c(kotlin.reflect.jvm.internal.impl.protobuf.d dVar) {
            if (dVar.y()) {
                e(dVar);
                return;
            }
            if (dVar instanceof s) {
                s sVar = (s) dVar;
                c(sVar.f44094D);
                c(sVar.f44095E);
            } else {
                String strValueOf = String.valueOf(dVar.getClass());
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 49);
                sb2.append("Has a new type of ByteString been created? Found ");
                sb2.append(strValueOf);
                throw new IllegalArgumentException(sb2.toString());
            }
        }

        private int d(int i10) {
            int iBinarySearch = Arrays.binarySearch(s.f44092I, i10);
            return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
        }

        private void e(kotlin.reflect.jvm.internal.impl.protobuf.d dVar) {
            int iD = d(dVar.size());
            int i10 = s.f44092I[iD + 1];
            if (this.f44099a.isEmpty() || this.f44099a.peek().size() >= i10) {
                this.f44099a.push(dVar);
                return;
            }
            int i11 = s.f44092I[iD];
            kotlin.reflect.jvm.internal.impl.protobuf.d dVarPop = this.f44099a.pop();
            while (true) {
                if (this.f44099a.isEmpty() || this.f44099a.peek().size() >= i11) {
                    break;
                } else {
                    dVarPop = new s(this.f44099a.pop(), dVarPop);
                }
            }
            s sVar = new s(dVarPop, dVar);
            while (!this.f44099a.isEmpty()) {
                if (this.f44099a.peek().size() >= s.f44092I[d(sVar.size()) + 1]) {
                    break;
                } else {
                    sVar = new s(this.f44099a.pop(), sVar);
                }
            }
            this.f44099a.push(sVar);
        }
    }

    /* compiled from: RopeByteString.java */
    private static class c implements Iterator<n> {

        /* renamed from: B, reason: collision with root package name */
        private final Stack<s> f44100B;

        /* renamed from: C, reason: collision with root package name */
        private n f44101C;

        private n b(kotlin.reflect.jvm.internal.impl.protobuf.d dVar) {
            while (dVar instanceof s) {
                s sVar = (s) dVar;
                this.f44100B.push(sVar);
                dVar = sVar.f44094D;
            }
            return (n) dVar;
        }

        private n d() {
            while (!this.f44100B.isEmpty()) {
                n nVarB = b(this.f44100B.pop().f44095E);
                if (!nVarB.isEmpty()) {
                    return nVarB;
                }
            }
            return null;
        }

        @Override // java.util.Iterator
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public n next() {
            n nVar = this.f44101C;
            if (nVar == null) {
                throw new NoSuchElementException();
            }
            this.f44101C = d();
            return nVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f44101C != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private c(kotlin.reflect.jvm.internal.impl.protobuf.d dVar) {
            this.f44100B = new Stack<>();
            this.f44101C = b(dVar);
        }
    }

    /* compiled from: RopeByteString.java */
    private class d implements d.a {

        /* renamed from: B, reason: collision with root package name */
        private final c f44102B;

        /* renamed from: C, reason: collision with root package name */
        private d.a f44103C;

        /* renamed from: D, reason: collision with root package name */
        int f44104D;

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(c());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.d.a
        public byte c() {
            if (!this.f44103C.hasNext()) {
                this.f44103C = this.f44102B.next().iterator();
            }
            this.f44104D--;
            return this.f44103C.c();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f44104D > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private d() {
            c cVar = new c(s.this);
            this.f44102B = cVar;
            this.f44103C = cVar.next().iterator();
            this.f44104D = s.this.size();
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        int i10 = 1;
        int i11 = 1;
        while (i10 > 0) {
            arrayList.add(Integer.valueOf(i10));
            int i12 = i11 + i10;
            i11 = i10;
            i10 = i12;
        }
        arrayList.add(Integer.MAX_VALUE);
        f44092I = new int[arrayList.size()];
        int i13 = 0;
        while (true) {
            int[] iArr = f44092I;
            if (i13 >= iArr.length) {
                return;
            }
            iArr[i13] = ((Integer) arrayList.get(i13)).intValue();
            i13++;
        }
    }

    static kotlin.reflect.jvm.internal.impl.protobuf.d R(kotlin.reflect.jvm.internal.impl.protobuf.d dVar, kotlin.reflect.jvm.internal.impl.protobuf.d dVar2) {
        s sVar = dVar instanceof s ? (s) dVar : null;
        if (dVar2.size() == 0) {
            return dVar;
        }
        if (dVar.size() != 0) {
            int size = dVar.size() + dVar2.size();
            if (size < 128) {
                return S(dVar, dVar2);
            }
            if (sVar != null && sVar.f44095E.size() + dVar2.size() < 128) {
                dVar2 = new s(sVar.f44094D, S(sVar.f44095E, dVar2));
            } else {
                if (sVar == null || sVar.f44094D.x() <= sVar.f44095E.x() || sVar.x() <= dVar2.x()) {
                    return size >= f44092I[Math.max(dVar.x(), dVar2.x()) + 1] ? new s(dVar, dVar2) : new b().b(dVar, dVar2);
                }
                dVar2 = new s(sVar.f44094D, new s(sVar.f44095E, dVar2));
            }
        }
        return dVar2;
    }

    private static n S(kotlin.reflect.jvm.internal.impl.protobuf.d dVar, kotlin.reflect.jvm.internal.impl.protobuf.d dVar2) {
        int size = dVar.size();
        int size2 = dVar2.size();
        byte[] bArr = new byte[size + size2];
        dVar.v(bArr, 0, 0, size);
        dVar2.v(bArr, 0, size, size2);
        return new n(bArr);
    }

    private boolean T(kotlin.reflect.jvm.internal.impl.protobuf.d dVar) {
        c cVar = new c(this);
        n next = cVar.next();
        c cVar2 = new c(dVar);
        n next2 = cVar2.next();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int size = next.size() - i10;
            int size2 = next2.size() - i11;
            int iMin = Math.min(size, size2);
            if (!(i10 == 0 ? next.O(next2, i11, iMin) : next2.O(next, i10, iMin))) {
                return false;
            }
            i12 += iMin;
            int i13 = this.f44093C;
            if (i12 >= i13) {
                if (i12 == i13) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == size) {
                next = cVar.next();
                i10 = 0;
            } else {
                i10 += iMin;
            }
            if (iMin == size2) {
                next2 = cVar2.next();
                i11 = 0;
            } else {
                i11 += iMin;
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d, java.lang.Iterable
    /* renamed from: A */
    public d.a iterator() {
        return new d();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public kotlin.reflect.jvm.internal.impl.protobuf.e B() {
        return kotlin.reflect.jvm.internal.impl.protobuf.e.g(new e());
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected int E(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.f44096F;
        if (i13 <= i14) {
            return this.f44094D.E(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.f44095E.E(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.f44095E.E(this.f44094D.E(i10, i11, i15), 0, i12 - i15);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected int F(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.f44096F;
        if (i13 <= i14) {
            return this.f44094D.F(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.f44095E.F(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.f44095E.F(this.f44094D.F(i10, i11, i15), 0, i12 - i15);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected int G() {
        return this.f44098H;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public String I(String str) {
        return new String(H(), str);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    void L(OutputStream outputStream, int i10, int i11) {
        int i12 = i10 + i11;
        int i13 = this.f44096F;
        if (i12 <= i13) {
            this.f44094D.L(outputStream, i10, i11);
        } else {
            if (i10 >= i13) {
                this.f44095E.L(outputStream, i10 - i13, i11);
                return;
            }
            int i14 = i13 - i10;
            this.f44094D.L(outputStream, i10, i14);
            this.f44095E.L(outputStream, 0, i11 - i14);
        }
    }

    public boolean equals(Object obj) {
        int iG;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kotlin.reflect.jvm.internal.impl.protobuf.d)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.protobuf.d dVar = (kotlin.reflect.jvm.internal.impl.protobuf.d) obj;
        if (this.f44093C != dVar.size()) {
            return false;
        }
        if (this.f44093C == 0) {
            return true;
        }
        if (this.f44098H == 0 || (iG = dVar.G()) == 0 || this.f44098H == iG) {
            return T(dVar);
        }
        return false;
    }

    public int hashCode() {
        int iE = this.f44098H;
        if (iE == 0) {
            int i10 = this.f44093C;
            iE = E(i10, 0, i10);
            if (iE == 0) {
                iE = 1;
            }
            this.f44098H = iE;
        }
        return iE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public int size() {
        return this.f44093C;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected void w(byte[] bArr, int i10, int i11, int i12) {
        int i13 = i10 + i12;
        int i14 = this.f44096F;
        if (i13 <= i14) {
            this.f44094D.w(bArr, i10, i11, i12);
        } else {
            if (i10 >= i14) {
                this.f44095E.w(bArr, i10 - i14, i11, i12);
                return;
            }
            int i15 = i14 - i10;
            this.f44094D.w(bArr, i10, i11, i15);
            this.f44095E.w(bArr, 0, i11 + i15, i12 - i15);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected int x() {
        return this.f44097G;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected boolean y() {
        return this.f44093C >= f44092I[this.f44097G];
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public boolean z() {
        int iF = this.f44094D.F(0, 0, this.f44096F);
        kotlin.reflect.jvm.internal.impl.protobuf.d dVar = this.f44095E;
        return dVar.F(iF, 0, dVar.size()) == 0;
    }

    private s(kotlin.reflect.jvm.internal.impl.protobuf.d dVar, kotlin.reflect.jvm.internal.impl.protobuf.d dVar2) {
        this.f44098H = 0;
        this.f44094D = dVar;
        this.f44095E = dVar2;
        int size = dVar.size();
        this.f44096F = size;
        this.f44093C = size + dVar2.size();
        this.f44097G = Math.max(dVar.x(), dVar2.x()) + 1;
    }

    /* compiled from: RopeByteString.java */
    private class e extends InputStream {

        /* renamed from: B, reason: collision with root package name */
        private c f44106B;

        /* renamed from: C, reason: collision with root package name */
        private n f44107C;

        /* renamed from: D, reason: collision with root package name */
        private int f44108D;

        /* renamed from: E, reason: collision with root package name */
        private int f44109E;

        /* renamed from: F, reason: collision with root package name */
        private int f44110F;

        /* renamed from: G, reason: collision with root package name */
        private int f44111G;

        public e() {
            b();
        }

        private void a() {
            if (this.f44107C != null) {
                int i10 = this.f44109E;
                int i11 = this.f44108D;
                if (i10 == i11) {
                    this.f44110F += i11;
                    this.f44109E = 0;
                    if (!this.f44106B.hasNext()) {
                        this.f44107C = null;
                        this.f44108D = 0;
                    } else {
                        n next = this.f44106B.next();
                        this.f44107C = next;
                        this.f44108D = next.size();
                    }
                }
            }
        }

        private void b() {
            c cVar = new c(s.this);
            this.f44106B = cVar;
            n next = cVar.next();
            this.f44107C = next;
            this.f44108D = next.size();
            this.f44109E = 0;
            this.f44110F = 0;
        }

        private int c(byte[] bArr, int i10, int i11) {
            int i12 = i11;
            while (true) {
                if (i12 <= 0) {
                    break;
                }
                a();
                if (this.f44107C != null) {
                    int iMin = Math.min(this.f44108D - this.f44109E, i12);
                    if (bArr != null) {
                        this.f44107C.v(bArr, this.f44109E, i10, iMin);
                        i10 += iMin;
                    }
                    this.f44109E += iMin;
                    i12 -= iMin;
                } else if (i12 == i11) {
                    return -1;
                }
            }
            return i11 - i12;
        }

        @Override // java.io.InputStream
        public int available() {
            return s.this.size() - (this.f44110F + this.f44109E);
        }

        @Override // java.io.InputStream
        public void mark(int i10) {
            this.f44111G = this.f44110F + this.f44109E;
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            bArr.getClass();
            if (i10 < 0 || i11 < 0 || i11 > bArr.length - i10) {
                throw new IndexOutOfBoundsException();
            }
            return c(bArr, i10, i11);
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            b();
            c(null, 0, this.f44111G);
        }

        @Override // java.io.InputStream
        public long skip(long j10) {
            if (j10 < 0) {
                throw new IndexOutOfBoundsException();
            }
            if (j10 > 2147483647L) {
                j10 = 2147483647L;
            }
            return c(null, 0, (int) j10);
        }

        @Override // java.io.InputStream
        public int read() {
            a();
            n nVar = this.f44107C;
            if (nVar == null) {
                return -1;
            }
            int i10 = this.f44109E;
            this.f44109E = i10 + 1;
            return nVar.M(i10) & 255;
        }
    }
}
