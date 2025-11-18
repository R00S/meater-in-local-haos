package Gc;

/* compiled from: MqttPersistentData.java */
/* loaded from: classes3.dex */
public class l implements Fc.n {

    /* renamed from: a, reason: collision with root package name */
    private String f5142a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f5143b;

    /* renamed from: c, reason: collision with root package name */
    private int f5144c;

    /* renamed from: d, reason: collision with root package name */
    private int f5145d;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f5146e;

    /* renamed from: f, reason: collision with root package name */
    private int f5147f;

    /* renamed from: g, reason: collision with root package name */
    private int f5148g;

    public l(String str, byte[] bArr, int i10, int i11, byte[] bArr2, int i12, int i13) {
        this.f5142a = str;
        this.f5143b = bArr;
        this.f5144c = i10;
        this.f5145d = i11;
        this.f5146e = bArr2;
        this.f5147f = i12;
        this.f5148g = i13;
    }

    @Override // Fc.n
    public int a() {
        if (this.f5146e == null) {
            return 0;
        }
        return this.f5148g;
    }

    @Override // Fc.n
    public byte[] b() {
        return this.f5143b;
    }

    @Override // Fc.n
    public int c() {
        return this.f5144c;
    }

    @Override // Fc.n
    public byte[] d() {
        return this.f5146e;
    }

    @Override // Fc.n
    public int e() {
        return this.f5147f;
    }

    @Override // Fc.n
    public int f() {
        return this.f5145d;
    }
}
