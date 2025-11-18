package Y3;

/* compiled from: ScaleXY.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private float f19412a;

    /* renamed from: b, reason: collision with root package name */
    private float f19413b;

    public d(float f10, float f11) {
        this.f19412a = f10;
        this.f19413b = f11;
    }

    public boolean a(float f10, float f11) {
        return this.f19412a == f10 && this.f19413b == f11;
    }

    public float b() {
        return this.f19412a;
    }

    public float c() {
        return this.f19413b;
    }

    public void d(float f10, float f11) {
        this.f19412a = f10;
        this.f19413b = f11;
    }

    public String toString() {
        return b() + "x" + c();
    }

    public d() {
        this(1.0f, 1.0f);
    }
}
