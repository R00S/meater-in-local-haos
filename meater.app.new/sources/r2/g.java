package r2;

import X1.C1804a;
import X1.L;
import java.util.Arrays;
import r2.b;

/* compiled from: DefaultAllocator.java */
/* loaded from: classes.dex */
public final class g implements b {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f48355a;

    /* renamed from: b, reason: collision with root package name */
    private final int f48356b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f48357c;

    /* renamed from: d, reason: collision with root package name */
    private int f48358d;

    /* renamed from: e, reason: collision with root package name */
    private int f48359e;

    /* renamed from: f, reason: collision with root package name */
    private int f48360f;

    /* renamed from: g, reason: collision with root package name */
    private C4342a[] f48361g;

    public g(boolean z10, int i10) {
        this(z10, i10, 0);
    }

    @Override // r2.b
    public synchronized void a(C4342a c4342a) {
        C4342a[] c4342aArr = this.f48361g;
        int i10 = this.f48360f;
        this.f48360f = i10 + 1;
        c4342aArr[i10] = c4342a;
        this.f48359e--;
        notifyAll();
    }

    @Override // r2.b
    public synchronized C4342a b() {
        C4342a c4342a;
        try {
            this.f48359e++;
            int i10 = this.f48360f;
            if (i10 > 0) {
                C4342a[] c4342aArr = this.f48361g;
                int i11 = i10 - 1;
                this.f48360f = i11;
                c4342a = (C4342a) C1804a.e(c4342aArr[i11]);
                this.f48361g[this.f48360f] = null;
            } else {
                c4342a = new C4342a(new byte[this.f48356b], 0);
                int i12 = this.f48359e;
                C4342a[] c4342aArr2 = this.f48361g;
                if (i12 > c4342aArr2.length) {
                    this.f48361g = (C4342a[]) Arrays.copyOf(c4342aArr2, c4342aArr2.length * 2);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return c4342a;
    }

    @Override // r2.b
    public synchronized void c() {
        try {
            int i10 = 0;
            int iMax = Math.max(0, L.k(this.f48358d, this.f48356b) - this.f48359e);
            int i11 = this.f48360f;
            if (iMax >= i11) {
                return;
            }
            if (this.f48357c != null) {
                int i12 = i11 - 1;
                while (i10 <= i12) {
                    C4342a c4342a = (C4342a) C1804a.e(this.f48361g[i10]);
                    if (c4342a.f48344a == this.f48357c) {
                        i10++;
                    } else {
                        C4342a c4342a2 = (C4342a) C1804a.e(this.f48361g[i12]);
                        if (c4342a2.f48344a != this.f48357c) {
                            i12--;
                        } else {
                            C4342a[] c4342aArr = this.f48361g;
                            c4342aArr[i10] = c4342a2;
                            c4342aArr[i12] = c4342a;
                            i12--;
                            i10++;
                        }
                    }
                }
                iMax = Math.max(iMax, i10);
                if (iMax >= this.f48360f) {
                    return;
                }
            }
            Arrays.fill(this.f48361g, iMax, this.f48360f, (Object) null);
            this.f48360f = iMax;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // r2.b
    public synchronized void d(b.a aVar) {
        while (aVar != null) {
            try {
                C4342a[] c4342aArr = this.f48361g;
                int i10 = this.f48360f;
                this.f48360f = i10 + 1;
                c4342aArr[i10] = aVar.a();
                this.f48359e--;
                aVar = aVar.next();
            } catch (Throwable th) {
                throw th;
            }
        }
        notifyAll();
    }

    @Override // r2.b
    public int e() {
        return this.f48356b;
    }

    public synchronized int f() {
        return this.f48359e * this.f48356b;
    }

    public synchronized void g() {
        if (this.f48355a) {
            h(0);
        }
    }

    public synchronized void h(int i10) {
        boolean z10 = i10 < this.f48358d;
        this.f48358d = i10;
        if (z10) {
            c();
        }
    }

    public g(boolean z10, int i10, int i11) {
        C1804a.a(i10 > 0);
        C1804a.a(i11 >= 0);
        this.f48355a = z10;
        this.f48356b = i10;
        this.f48360f = i11;
        this.f48361g = new C4342a[i11 + 100];
        if (i11 <= 0) {
            this.f48357c = null;
            return;
        }
        this.f48357c = new byte[i11 * i10];
        for (int i12 = 0; i12 < i11; i12++) {
            this.f48361g[i12] = new C4342a(this.f48357c, i12 * i10);
        }
    }
}
