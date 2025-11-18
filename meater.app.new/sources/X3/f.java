package X3;

import n1.o;

/* compiled from: LottieTrace.java */
/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final String[] f18723a = new String[5];

    /* renamed from: b, reason: collision with root package name */
    private final long[] f18724b = new long[5];

    /* renamed from: c, reason: collision with root package name */
    private int f18725c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f18726d = 0;

    public void a(String str) {
        int i10 = this.f18725c;
        if (i10 == 5) {
            this.f18726d++;
            return;
        }
        this.f18723a[i10] = str;
        this.f18724b[i10] = System.nanoTime();
        o.a(str);
        this.f18725c++;
    }

    public float b(String str) {
        int i10 = this.f18726d;
        if (i10 > 0) {
            this.f18726d = i10 - 1;
            return 0.0f;
        }
        int i11 = this.f18725c - 1;
        this.f18725c = i11;
        if (i11 == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
        if (str.equals(this.f18723a[i11])) {
            o.b();
            return (System.nanoTime() - this.f18724b[this.f18725c]) / 1000000.0f;
        }
        throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + this.f18723a[this.f18725c] + ".");
    }
}
