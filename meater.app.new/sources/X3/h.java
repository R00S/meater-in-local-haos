package X3;

/* compiled from: MeanCalculator.java */
/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private float f18738a;

    /* renamed from: b, reason: collision with root package name */
    private int f18739b;

    public void a(float f10) {
        float f11 = this.f18738a + f10;
        this.f18738a = f11;
        int i10 = this.f18739b + 1;
        this.f18739b = i10;
        if (i10 == Integer.MAX_VALUE) {
            this.f18738a = f11 / 2.0f;
            this.f18739b = i10 / 2;
        }
    }
}
