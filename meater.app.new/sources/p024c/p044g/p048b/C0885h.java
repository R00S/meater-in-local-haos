package p024c.p044g.p048b;

import java.util.Arrays;
import java.util.Comparator;
import okhttp3.HttpUrl;
import p024c.p044g.p048b.C0879b;

/* compiled from: PriorityGoalRow.java */
/* renamed from: c.g.b.h */
/* loaded from: classes.dex */
public class C0885h extends C0879b {

    /* renamed from: g */
    private int f5845g;

    /* renamed from: h */
    private C0886i[] f5846h;

    /* renamed from: i */
    private C0886i[] f5847i;

    /* renamed from: j */
    private int f5848j;

    /* renamed from: k */
    b f5849k;

    /* renamed from: l */
    C0880c f5850l;

    /* compiled from: PriorityGoalRow.java */
    /* renamed from: c.g.b.h$a */
    class a implements Comparator<C0886i> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C0886i c0886i, C0886i c0886i2) {
            return c0886i.f5858d - c0886i2.f5858d;
        }
    }

    /* compiled from: PriorityGoalRow.java */
    /* renamed from: c.g.b.h$b */
    class b implements Comparable {

        /* renamed from: f */
        C0886i f5852f;

        /* renamed from: g */
        C0885h f5853g;

        public b(C0885h c0885h) {
            this.f5853g = c0885h;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.f5852f.f5858d - ((C0886i) obj).f5858d;
        }

        /* renamed from: g */
        public boolean m5593g(C0886i c0886i, float f2) {
            boolean z = true;
            if (!this.f5852f.f5856b) {
                for (int i2 = 0; i2 < 9; i2++) {
                    float f3 = c0886i.f5864j[i2];
                    if (f3 != 0.0f) {
                        float f4 = f3 * f2;
                        if (Math.abs(f4) < 1.0E-4f) {
                            f4 = 0.0f;
                        }
                        this.f5852f.f5864j[i2] = f4;
                    } else {
                        this.f5852f.f5864j[i2] = 0.0f;
                    }
                }
                return true;
            }
            for (int i3 = 0; i3 < 9; i3++) {
                float[] fArr = this.f5852f.f5864j;
                fArr[i3] = fArr[i3] + (c0886i.f5864j[i3] * f2);
                if (Math.abs(fArr[i3]) < 1.0E-4f) {
                    this.f5852f.f5864j[i3] = 0.0f;
                } else {
                    z = false;
                }
            }
            if (z) {
                C0885h.this.m5591G(this.f5852f);
            }
            return false;
        }

        /* renamed from: k */
        public void m5594k(C0886i c0886i) {
            this.f5852f = c0886i;
        }

        /* renamed from: q */
        public final boolean m5595q() {
            for (int i2 = 8; i2 >= 0; i2--) {
                float f2 = this.f5852f.f5864j[i2];
                if (f2 > 0.0f) {
                    return false;
                }
                if (f2 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            String str = "[ ";
            if (this.f5852f != null) {
                for (int i2 = 0; i2 < 9; i2++) {
                    str = str + this.f5852f.f5864j[i2] + " ";
                }
            }
            return str + "] " + this.f5852f;
        }

        /* renamed from: u */
        public final boolean m5596u(C0886i c0886i) {
            int i2 = 8;
            while (true) {
                if (i2 < 0) {
                    break;
                }
                float f2 = c0886i.f5864j[i2];
                float f3 = this.f5852f.f5864j[i2];
                if (f3 == f2) {
                    i2--;
                } else if (f3 < f2) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: v */
        public void m5597v() {
            Arrays.fill(this.f5852f.f5864j, 0.0f);
        }
    }

    public C0885h(C0880c c0880c) {
        super(c0880c);
        this.f5845g = 128;
        this.f5846h = new C0886i[128];
        this.f5847i = new C0886i[128];
        this.f5848j = 0;
        this.f5849k = new b(this);
        this.f5850l = c0880c;
    }

    /* renamed from: F */
    private final void m5590F(C0886i c0886i) {
        int i2;
        int i3 = this.f5848j + 1;
        C0886i[] c0886iArr = this.f5846h;
        if (i3 > c0886iArr.length) {
            C0886i[] c0886iArr2 = (C0886i[]) Arrays.copyOf(c0886iArr, c0886iArr.length * 2);
            this.f5846h = c0886iArr2;
            this.f5847i = (C0886i[]) Arrays.copyOf(c0886iArr2, c0886iArr2.length * 2);
        }
        C0886i[] c0886iArr3 = this.f5846h;
        int i4 = this.f5848j;
        c0886iArr3[i4] = c0886i;
        int i5 = i4 + 1;
        this.f5848j = i5;
        if (i5 > 1 && c0886iArr3[i5 - 1].f5858d > c0886i.f5858d) {
            int i6 = 0;
            while (true) {
                i2 = this.f5848j;
                if (i6 >= i2) {
                    break;
                }
                this.f5847i[i6] = this.f5846h[i6];
                i6++;
            }
            Arrays.sort(this.f5847i, 0, i2, new a());
            for (int i7 = 0; i7 < this.f5848j; i7++) {
                this.f5846h[i7] = this.f5847i[i7];
            }
        }
        c0886i.f5856b = true;
        c0886i.m5599a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public final void m5591G(C0886i c0886i) {
        int i2 = 0;
        while (i2 < this.f5848j) {
            if (this.f5846h[i2] == c0886i) {
                while (true) {
                    int i3 = this.f5848j;
                    if (i2 >= i3 - 1) {
                        this.f5848j = i3 - 1;
                        c0886i.f5856b = false;
                        return;
                    } else {
                        C0886i[] c0886iArr = this.f5846h;
                        int i4 = i2 + 1;
                        c0886iArr[i2] = c0886iArr[i4];
                        i2 = i4;
                    }
                }
            } else {
                i2++;
            }
        }
    }

    @Override // p024c.p044g.p048b.C0879b
    /* renamed from: B */
    public void mo5529B(C0881d c0881d, C0879b c0879b, boolean z) {
        C0886i c0886i = c0879b.f5806a;
        if (c0886i == null) {
            return;
        }
        C0879b.a aVar = c0879b.f5810e;
        int iMo5515a = aVar.mo5515a();
        for (int i2 = 0; i2 < iMo5515a; i2++) {
            C0886i c0886iMo5516b = aVar.mo5516b(i2);
            float fMo5518d = aVar.mo5518d(i2);
            this.f5849k.m5594k(c0886iMo5516b);
            if (this.f5849k.m5593g(c0886i, fMo5518d)) {
                m5590F(c0886iMo5516b);
            }
            this.f5807b += c0879b.f5807b * fMo5518d;
        }
        m5591G(c0886i);
    }

    @Override // p024c.p044g.p048b.C0879b, p024c.p044g.p048b.C0881d.a
    /* renamed from: a */
    public void mo5532a(C0886i c0886i) {
        this.f5849k.m5594k(c0886i);
        this.f5849k.m5597v();
        c0886i.f5864j[c0886i.f5860f] = 1.0f;
        m5590F(c0886i);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    @Override // p024c.p044g.p048b.C0879b, p024c.p044g.p048b.C0881d.a
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p024c.p044g.p048b.C0886i mo5533b(p024c.p044g.p048b.C0881d r5, boolean[] r6) {
        /*
            r4 = this;
            r5 = -1
            r0 = 0
            r1 = -1
        L3:
            int r2 = r4.f5848j
            if (r0 >= r2) goto L32
            c.g.b.i[] r2 = r4.f5846h
            r2 = r2[r0]
            int r3 = r2.f5858d
            boolean r3 = r6[r3]
            if (r3 == 0) goto L12
            goto L2f
        L12:
            c.g.b.h$b r3 = r4.f5849k
            r3.m5594k(r2)
            if (r1 != r5) goto L22
            c.g.b.h$b r2 = r4.f5849k
            boolean r2 = r2.m5595q()
            if (r2 == 0) goto L2f
            goto L2e
        L22:
            c.g.b.h$b r2 = r4.f5849k
            c.g.b.i[] r3 = r4.f5846h
            r3 = r3[r1]
            boolean r2 = r2.m5596u(r3)
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
            c.g.b.i[] r5 = r4.f5846h
            r5 = r5[r1]
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p024c.p044g.p048b.C0885h.mo5533b(c.g.b.d, boolean[]):c.g.b.i");
    }

    @Override // p024c.p044g.p048b.C0879b, p024c.p044g.p048b.C0881d.a
    public void clear() {
        this.f5848j = 0;
        this.f5807b = 0.0f;
    }

    @Override // p024c.p044g.p048b.C0879b, p024c.p044g.p048b.C0881d.a
    public boolean isEmpty() {
        return this.f5848j == 0;
    }

    @Override // p024c.p044g.p048b.C0879b
    public String toString() {
        String str = HttpUrl.FRAGMENT_ENCODE_SET + " goal -> (" + this.f5807b + ") : ";
        for (int i2 = 0; i2 < this.f5848j; i2++) {
            this.f5849k.m5594k(this.f5846h[i2]);
            str = str + this.f5849k + " ";
        }
        return str;
    }
}
