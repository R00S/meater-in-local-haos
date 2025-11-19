package q2;

import U1.H;
import X1.C1804a;
import X1.L;
import android.os.SystemClock;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* compiled from: BaseTrackSelection.java */
/* renamed from: q2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4274c implements x {

    /* renamed from: a, reason: collision with root package name */
    protected final H f47836a;

    /* renamed from: b, reason: collision with root package name */
    protected final int f47837b;

    /* renamed from: c, reason: collision with root package name */
    protected final int[] f47838c;

    /* renamed from: d, reason: collision with root package name */
    private final int f47839d;

    /* renamed from: e, reason: collision with root package name */
    private final U1.s[] f47840e;

    /* renamed from: f, reason: collision with root package name */
    private final long[] f47841f;

    /* renamed from: g, reason: collision with root package name */
    private int f47842g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f47843h;

    public AbstractC4274c(H h10, int[] iArr, int i10) {
        C1804a.g(iArr.length > 0);
        this.f47839d = i10;
        this.f47836a = (H) C1804a.e(h10);
        int length = iArr.length;
        this.f47837b = length;
        this.f47840e = new U1.s[length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.f47840e[i11] = h10.a(iArr[i11]);
        }
        Arrays.sort(this.f47840e, new Comparator() { // from class: q2.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC4274c.w((U1.s) obj, (U1.s) obj2);
            }
        });
        this.f47838c = new int[this.f47837b];
        int i12 = 0;
        while (true) {
            int i13 = this.f47837b;
            if (i12 >= i13) {
                this.f47841f = new long[i13];
                this.f47843h = false;
                return;
            } else {
                this.f47838c[i12] = h10.b(this.f47840e[i12]);
                i12++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int w(U1.s sVar, U1.s sVar2) {
        return sVar2.f17157j - sVar.f17157j;
    }

    @Override // q2.x
    public boolean a(int i10, long j10) {
        return this.f47841f[i10] > j10;
    }

    @Override // q2.InterfaceC4268A
    public final H b() {
        return this.f47836a;
    }

    @Override // q2.x
    public void e(boolean z10) {
        this.f47843h = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC4274c abstractC4274c = (AbstractC4274c) obj;
        return this.f47836a.equals(abstractC4274c.f47836a) && Arrays.equals(this.f47838c, abstractC4274c.f47838c);
    }

    @Override // q2.InterfaceC4268A
    public final U1.s f(int i10) {
        return this.f47840e[i10];
    }

    public int hashCode() {
        if (this.f47842g == 0) {
            this.f47842g = (System.identityHashCode(this.f47836a) * 31) + Arrays.hashCode(this.f47838c);
        }
        return this.f47842g;
    }

    @Override // q2.InterfaceC4268A
    public final int i(int i10) {
        return this.f47838c[i10];
    }

    @Override // q2.x
    public int j(long j10, List<? extends o2.l> list) {
        return list.size();
    }

    @Override // q2.InterfaceC4268A
    public final int l(U1.s sVar) {
        for (int i10 = 0; i10 < this.f47837b; i10++) {
            if (this.f47840e[i10] == sVar) {
                return i10;
            }
        }
        return -1;
    }

    @Override // q2.InterfaceC4268A
    public final int length() {
        return this.f47838c.length;
    }

    @Override // q2.x
    public final int m() {
        return this.f47838c[c()];
    }

    @Override // q2.x
    public final U1.s n() {
        return this.f47840e[c()];
    }

    @Override // q2.x
    public boolean p(int i10, long j10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zA = a(i10, jElapsedRealtime);
        int i11 = 0;
        while (i11 < this.f47837b && !zA) {
            zA = (i11 == i10 || a(i11, jElapsedRealtime)) ? false : true;
            i11++;
        }
        if (!zA) {
            return false;
        }
        long[] jArr = this.f47841f;
        jArr[i10] = Math.max(jArr[i10], L.c(jElapsedRealtime, j10, Long.MAX_VALUE));
        return true;
    }

    @Override // q2.InterfaceC4268A
    public final int u(int i10) {
        for (int i11 = 0; i11 < this.f47837b; i11++) {
            if (this.f47838c[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override // q2.x
    public void g() {
    }

    @Override // q2.x
    public void h() {
    }

    @Override // q2.x
    public void q(float f10) {
    }
}
