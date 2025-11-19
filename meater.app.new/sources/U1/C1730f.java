package U1;

/* compiled from: AuxEffectInfo.java */
/* renamed from: U1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1730f {

    /* renamed from: a, reason: collision with root package name */
    public final int f17044a;

    /* renamed from: b, reason: collision with root package name */
    public final float f17045b;

    public C1730f(int i10, float f10) {
        this.f17044a = i10;
        this.f17045b = f10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1730f.class != obj.getClass()) {
            return false;
        }
        C1730f c1730f = (C1730f) obj;
        return this.f17044a == c1730f.f17044a && Float.compare(c1730f.f17045b, this.f17045b) == 0;
    }

    public int hashCode() {
        return ((527 + this.f17044a) * 31) + Float.floatToIntBits(this.f17045b);
    }
}
