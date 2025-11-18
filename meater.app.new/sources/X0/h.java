package X0;

import X0.b;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: PriorityGoalRow.java */
/* loaded from: classes.dex */
public class h extends X0.b {

    /* renamed from: g, reason: collision with root package name */
    private int f18560g;

    /* renamed from: h, reason: collision with root package name */
    private i[] f18561h;

    /* renamed from: i, reason: collision with root package name */
    private i[] f18562i;

    /* renamed from: j, reason: collision with root package name */
    private int f18563j;

    /* renamed from: k, reason: collision with root package name */
    b f18564k;

    /* renamed from: l, reason: collision with root package name */
    c f18565l;

    /* compiled from: PriorityGoalRow.java */
    class a implements Comparator<i> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(i iVar, i iVar2) {
            return iVar.f18573D - iVar2.f18573D;
        }
    }

    /* compiled from: PriorityGoalRow.java */
    class b {

        /* renamed from: a, reason: collision with root package name */
        i f18567a;

        /* renamed from: b, reason: collision with root package name */
        h f18568b;

        b(h hVar) {
            this.f18568b = hVar;
        }

        public boolean a(i iVar, float f10) {
            boolean z10 = true;
            if (!this.f18567a.f18571B) {
                for (int i10 = 0; i10 < 9; i10++) {
                    float f11 = iVar.f18579J[i10];
                    if (f11 != 0.0f) {
                        float f12 = f11 * f10;
                        if (Math.abs(f12) < 1.0E-4f) {
                            f12 = 0.0f;
                        }
                        this.f18567a.f18579J[i10] = f12;
                    } else {
                        this.f18567a.f18579J[i10] = 0.0f;
                    }
                }
                return true;
            }
            for (int i11 = 0; i11 < 9; i11++) {
                float[] fArr = this.f18567a.f18579J;
                float f13 = fArr[i11] + (iVar.f18579J[i11] * f10);
                fArr[i11] = f13;
                if (Math.abs(f13) < 1.0E-4f) {
                    this.f18567a.f18579J[i11] = 0.0f;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                h.this.G(this.f18567a);
            }
            return false;
        }

        public void b(i iVar) {
            this.f18567a = iVar;
        }

        public final boolean c() {
            for (int i10 = 8; i10 >= 0; i10--) {
                float f10 = this.f18567a.f18579J[i10];
                if (f10 > 0.0f) {
                    return false;
                }
                if (f10 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean d(i iVar) {
            for (int i10 = 8; i10 >= 0; i10--) {
                float f10 = iVar.f18579J[i10];
                float f11 = this.f18567a.f18579J[i10];
                if (f11 != f10) {
                    return f11 < f10;
                }
            }
            return false;
        }

        public void e() {
            Arrays.fill(this.f18567a.f18579J, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f18567a != null) {
                for (int i10 = 0; i10 < 9; i10++) {
                    str = str + this.f18567a.f18579J[i10] + " ";
                }
            }
            return str + "] " + this.f18567a;
        }
    }

    public h(c cVar) {
        super(cVar);
        this.f18560g = 128;
        this.f18561h = new i[128];
        this.f18562i = new i[128];
        this.f18563j = 0;
        this.f18564k = new b(this);
        this.f18565l = cVar;
    }

    private void F(i iVar) {
        int i10;
        int i11 = this.f18563j + 1;
        i[] iVarArr = this.f18561h;
        if (i11 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f18561h = iVarArr2;
            this.f18562i = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.f18561h;
        int i12 = this.f18563j;
        iVarArr3[i12] = iVar;
        int i13 = i12 + 1;
        this.f18563j = i13;
        if (i13 > 1 && iVarArr3[i12].f18573D > iVar.f18573D) {
            int i14 = 0;
            while (true) {
                i10 = this.f18563j;
                if (i14 >= i10) {
                    break;
                }
                this.f18562i[i14] = this.f18561h[i14];
                i14++;
            }
            Arrays.sort(this.f18562i, 0, i10, new a());
            for (int i15 = 0; i15 < this.f18563j; i15++) {
                this.f18561h[i15] = this.f18562i[i15];
            }
        }
        iVar.f18571B = true;
        iVar.c(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G(i iVar) {
        int i10 = 0;
        while (i10 < this.f18563j) {
            if (this.f18561h[i10] == iVar) {
                while (true) {
                    int i11 = this.f18563j;
                    if (i10 >= i11 - 1) {
                        this.f18563j = i11 - 1;
                        iVar.f18571B = false;
                        return;
                    } else {
                        i[] iVarArr = this.f18561h;
                        int i12 = i10 + 1;
                        iVarArr[i10] = iVarArr[i12];
                        i10 = i12;
                    }
                }
            } else {
                i10++;
            }
        }
    }

    @Override // X0.b
    public void B(d dVar, X0.b bVar, boolean z10) {
        i iVar = bVar.f18523a;
        if (iVar == null) {
            return;
        }
        b.a aVar = bVar.f18527e;
        int iC = aVar.c();
        for (int i10 = 0; i10 < iC; i10++) {
            i iVarF = aVar.f(i10);
            float fH = aVar.h(i10);
            this.f18564k.b(iVarF);
            if (this.f18564k.a(iVar, fH)) {
                F(iVarF);
            }
            this.f18524b += bVar.f18524b * fH;
        }
        G(iVar);
    }

    @Override // X0.b, X0.d.a
    public void b(i iVar) {
        this.f18564k.b(iVar);
        this.f18564k.e();
        iVar.f18579J[iVar.f18575F] = 1.0f;
        F(iVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    @Override // X0.b, X0.d.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X0.i c(X0.d r5, boolean[] r6) {
        /*
            r4 = this;
            r5 = -1
            r0 = 0
            r1 = r5
        L3:
            int r2 = r4.f18563j
            if (r0 >= r2) goto L32
            X0.i[] r2 = r4.f18561h
            r2 = r2[r0]
            int r3 = r2.f18573D
            boolean r3 = r6[r3]
            if (r3 == 0) goto L12
            goto L2f
        L12:
            X0.h$b r3 = r4.f18564k
            r3.b(r2)
            if (r1 != r5) goto L22
            X0.h$b r2 = r4.f18564k
            boolean r2 = r2.c()
            if (r2 == 0) goto L2f
            goto L2e
        L22:
            X0.h$b r2 = r4.f18564k
            X0.i[] r3 = r4.f18561h
            r3 = r3[r1]
            boolean r2 = r2.d(r3)
            if (r2 == 0) goto L2f
        L2e:
            r1 = r0
        L2f:
            int r0 = r0 + 1
            goto L3
        L32:
            if (r1 != r5) goto L36
            r5 = 0
            return r5
        L36:
            X0.i[] r5 = r4.f18561h
            r5 = r5[r1]
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X0.h.c(X0.d, boolean[]):X0.i");
    }

    @Override // X0.b, X0.d.a
    public void clear() {
        this.f18563j = 0;
        this.f18524b = 0.0f;
    }

    @Override // X0.b, X0.d.a
    public boolean isEmpty() {
        return this.f18563j == 0;
    }

    @Override // X0.b
    public String toString() {
        String str = " goal -> (" + this.f18524b + ") : ";
        for (int i10 = 0; i10 < this.f18563j; i10++) {
            this.f18564k.b(this.f18561h[i10]);
            str = str + this.f18564k + " ";
        }
        return str;
    }
}
