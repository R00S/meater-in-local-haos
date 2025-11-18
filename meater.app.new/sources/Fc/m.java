package Fc;

/* compiled from: MqttMessage.java */
/* loaded from: classes3.dex */
public class m {

    /* renamed from: C, reason: collision with root package name */
    private byte[] f4749C;

    /* renamed from: G, reason: collision with root package name */
    private int f4753G;

    /* renamed from: B, reason: collision with root package name */
    private boolean f4748B = true;

    /* renamed from: D, reason: collision with root package name */
    private int f4750D = 1;

    /* renamed from: E, reason: collision with root package name */
    private boolean f4751E = false;

    /* renamed from: F, reason: collision with root package name */
    private boolean f4752F = false;

    public m() {
        i(new byte[0]);
    }

    public static void l(int i10) {
        if (i10 < 0 || i10 > 2) {
            throw new IllegalArgumentException();
        }
    }

    protected void a() {
        if (!this.f4748B) {
            throw new IllegalStateException();
        }
    }

    public byte[] b() {
        return this.f4749C;
    }

    public int c() {
        return this.f4750D;
    }

    public boolean d() {
        return this.f4752F;
    }

    public boolean e() {
        return this.f4751E;
    }

    protected void f(boolean z10) {
        this.f4752F = z10;
    }

    public void g(int i10) {
        this.f4753G = i10;
    }

    protected void h(boolean z10) {
        this.f4748B = z10;
    }

    public void i(byte[] bArr) {
        a();
        bArr.getClass();
        this.f4749C = bArr;
    }

    public void j(int i10) {
        a();
        l(i10);
        this.f4750D = i10;
    }

    public void k(boolean z10) {
        a();
        this.f4751E = z10;
    }

    public String toString() {
        return new String(this.f4749C);
    }

    public m(byte[] bArr) {
        i(bArr);
    }
}
