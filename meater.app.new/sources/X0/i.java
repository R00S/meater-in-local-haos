package X0;

import java.util.Arrays;
import java.util.HashSet;

/* compiled from: SolverVariable.java */
/* loaded from: classes.dex */
public class i implements Comparable<i> {

    /* renamed from: S, reason: collision with root package name */
    private static int f18570S = 1;

    /* renamed from: B, reason: collision with root package name */
    public boolean f18571B;

    /* renamed from: C, reason: collision with root package name */
    private String f18572C;

    /* renamed from: G, reason: collision with root package name */
    public float f18576G;

    /* renamed from: K, reason: collision with root package name */
    a f18580K;

    /* renamed from: D, reason: collision with root package name */
    public int f18573D = -1;

    /* renamed from: E, reason: collision with root package name */
    int f18574E = -1;

    /* renamed from: F, reason: collision with root package name */
    public int f18575F = 0;

    /* renamed from: H, reason: collision with root package name */
    public boolean f18577H = false;

    /* renamed from: I, reason: collision with root package name */
    float[] f18578I = new float[9];

    /* renamed from: J, reason: collision with root package name */
    float[] f18579J = new float[9];

    /* renamed from: L, reason: collision with root package name */
    b[] f18581L = new b[16];

    /* renamed from: M, reason: collision with root package name */
    int f18582M = 0;

    /* renamed from: N, reason: collision with root package name */
    public int f18583N = 0;

    /* renamed from: O, reason: collision with root package name */
    boolean f18584O = false;

    /* renamed from: P, reason: collision with root package name */
    int f18585P = -1;

    /* renamed from: Q, reason: collision with root package name */
    float f18586Q = 0.0f;

    /* renamed from: R, reason: collision with root package name */
    HashSet<b> f18587R = null;

    /* compiled from: SolverVariable.java */
    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public i(a aVar, String str) {
        this.f18580K = aVar;
    }

    static void n() {
        f18570S++;
    }

    public final void c(b bVar) {
        int i10 = 0;
        while (true) {
            int i11 = this.f18582M;
            if (i10 >= i11) {
                b[] bVarArr = this.f18581L;
                if (i11 >= bVarArr.length) {
                    this.f18581L = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f18581L;
                int i12 = this.f18582M;
                bVarArr2[i12] = bVar;
                this.f18582M = i12 + 1;
                return;
            }
            if (this.f18581L[i10] == bVar) {
                return;
            } else {
                i10++;
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public int compareTo(i iVar) {
        return this.f18573D - iVar.f18573D;
    }

    public final void p(b bVar) {
        int i10 = this.f18582M;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f18581L[i11] == bVar) {
                while (i11 < i10 - 1) {
                    b[] bVarArr = this.f18581L;
                    int i12 = i11 + 1;
                    bVarArr[i11] = bVarArr[i12];
                    i11 = i12;
                }
                this.f18582M--;
                return;
            }
            i11++;
        }
    }

    public void s() {
        this.f18572C = null;
        this.f18580K = a.UNKNOWN;
        this.f18575F = 0;
        this.f18573D = -1;
        this.f18574E = -1;
        this.f18576G = 0.0f;
        this.f18577H = false;
        this.f18584O = false;
        this.f18585P = -1;
        this.f18586Q = 0.0f;
        int i10 = this.f18582M;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f18581L[i11] = null;
        }
        this.f18582M = 0;
        this.f18583N = 0;
        this.f18571B = false;
        Arrays.fill(this.f18579J, 0.0f);
    }

    public void t(d dVar, float f10) {
        this.f18576G = f10;
        this.f18577H = true;
        this.f18584O = false;
        this.f18585P = -1;
        this.f18586Q = 0.0f;
        int i10 = this.f18582M;
        this.f18574E = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f18581L[i11].A(dVar, this, false);
        }
        this.f18582M = 0;
    }

    public String toString() {
        if (this.f18572C != null) {
            return "" + this.f18572C;
        }
        return "" + this.f18573D;
    }

    public void u(a aVar, String str) {
        this.f18580K = aVar;
    }

    public final void v(d dVar, b bVar) {
        int i10 = this.f18582M;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f18581L[i11].B(dVar, bVar, false);
        }
        this.f18582M = 0;
    }
}
