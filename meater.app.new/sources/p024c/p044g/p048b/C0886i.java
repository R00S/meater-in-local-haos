package p024c.p044g.p048b;

import java.util.Arrays;
import java.util.HashSet;
import okhttp3.HttpUrl;

/* compiled from: SolverVariable.java */
/* renamed from: c.g.b.i */
/* loaded from: classes.dex */
public class C0886i {

    /* renamed from: a */
    private static int f5855a = 1;

    /* renamed from: b */
    public boolean f5856b;

    /* renamed from: c */
    private String f5857c;

    /* renamed from: g */
    public float f5861g;

    /* renamed from: k */
    a f5865k;

    /* renamed from: d */
    public int f5858d = -1;

    /* renamed from: e */
    int f5859e = -1;

    /* renamed from: f */
    public int f5860f = 0;

    /* renamed from: h */
    public boolean f5862h = false;

    /* renamed from: i */
    float[] f5863i = new float[9];

    /* renamed from: j */
    float[] f5864j = new float[9];

    /* renamed from: l */
    C0879b[] f5866l = new C0879b[16];

    /* renamed from: m */
    int f5867m = 0;

    /* renamed from: n */
    public int f5868n = 0;

    /* renamed from: o */
    boolean f5869o = false;

    /* renamed from: p */
    int f5870p = -1;

    /* renamed from: q */
    float f5871q = 0.0f;

    /* renamed from: r */
    HashSet<C0879b> f5872r = null;

    /* compiled from: SolverVariable.java */
    /* renamed from: c.g.b.i$a */
    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public C0886i(a aVar, String str) {
        this.f5865k = aVar;
    }

    /* renamed from: b */
    static void m5598b() {
        f5855a++;
    }

    /* renamed from: a */
    public final void m5599a(C0879b c0879b) {
        int i2 = 0;
        while (true) {
            int i3 = this.f5867m;
            if (i2 >= i3) {
                C0879b[] c0879bArr = this.f5866l;
                if (i3 >= c0879bArr.length) {
                    this.f5866l = (C0879b[]) Arrays.copyOf(c0879bArr, c0879bArr.length * 2);
                }
                C0879b[] c0879bArr2 = this.f5866l;
                int i4 = this.f5867m;
                c0879bArr2[i4] = c0879b;
                this.f5867m = i4 + 1;
                return;
            }
            if (this.f5866l[i2] == c0879b) {
                return;
            } else {
                i2++;
            }
        }
    }

    /* renamed from: c */
    public final void m5600c(C0879b c0879b) {
        int i2 = this.f5867m;
        int i3 = 0;
        while (i3 < i2) {
            if (this.f5866l[i3] == c0879b) {
                while (i3 < i2 - 1) {
                    C0879b[] c0879bArr = this.f5866l;
                    int i4 = i3 + 1;
                    c0879bArr[i3] = c0879bArr[i4];
                    i3 = i4;
                }
                this.f5867m--;
                return;
            }
            i3++;
        }
    }

    /* renamed from: d */
    public void m5601d() {
        this.f5857c = null;
        this.f5865k = a.UNKNOWN;
        this.f5860f = 0;
        this.f5858d = -1;
        this.f5859e = -1;
        this.f5861g = 0.0f;
        this.f5862h = false;
        this.f5869o = false;
        this.f5870p = -1;
        this.f5871q = 0.0f;
        int i2 = this.f5867m;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f5866l[i3] = null;
        }
        this.f5867m = 0;
        this.f5868n = 0;
        this.f5856b = false;
        Arrays.fill(this.f5864j, 0.0f);
    }

    /* renamed from: e */
    public void m5602e(C0881d c0881d, float f2) {
        this.f5861g = f2;
        this.f5862h = true;
        this.f5869o = false;
        this.f5870p = -1;
        this.f5871q = 0.0f;
        int i2 = this.f5867m;
        this.f5859e = -1;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f5866l[i3].m5528A(c0881d, this, false);
        }
        this.f5867m = 0;
    }

    /* renamed from: f */
    public void m5603f(a aVar, String str) {
        this.f5865k = aVar;
    }

    /* renamed from: g */
    public final void m5604g(C0881d c0881d, C0879b c0879b) {
        int i2 = this.f5867m;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f5866l[i3].mo5529B(c0881d, c0879b, false);
        }
        this.f5867m = 0;
    }

    public String toString() {
        if (this.f5857c != null) {
            return HttpUrl.FRAGMENT_ENCODE_SET + this.f5857c;
        }
        return HttpUrl.FRAGMENT_ENCODE_SET + this.f5858d;
    }
}
