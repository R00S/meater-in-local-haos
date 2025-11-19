package U0;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: AndroidDensity.android.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u000b\u001a\u00020\n*\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\u00020\t*\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"LU0/g;", "LU0/d;", "", "density", "fontScale", "LV0/a;", "converter", "<init>", "(FFLV0/a;)V", "LU0/h;", "LU0/v;", "s", "(F)J", "i0", "(J)F", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "B", "F", "getDensity", "()F", "C", "R0", "D", "LV0/a;", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: U0.g, reason: from toString */
/* loaded from: classes.dex */
final /* data */ class DensityWithConverter implements d {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata and from toString */
    private final float density;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata and from toString */
    private final float fontScale;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata and from toString */
    private final V0.a converter;

    public DensityWithConverter(float f10, float f11, V0.a aVar) {
        this.density = f10;
        this.fontScale = f11;
        this.converter = aVar;
    }

    @Override // U0.l
    /* renamed from: R0, reason: from getter */
    public float getFontScale() {
        return this.fontScale;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DensityWithConverter)) {
            return false;
        }
        DensityWithConverter densityWithConverter = (DensityWithConverter) other;
        return Float.compare(this.density, densityWithConverter.density) == 0 && Float.compare(this.fontScale, densityWithConverter.fontScale) == 0 && C3862t.b(this.converter, densityWithConverter.converter);
    }

    @Override // U0.d
    public float getDensity() {
        return this.density;
    }

    public int hashCode() {
        return (((Float.hashCode(this.density) * 31) + Float.hashCode(this.fontScale)) * 31) + this.converter.hashCode();
    }

    @Override // U0.l
    public float i0(long j10) {
        if (x.g(v.g(j10), x.INSTANCE.b())) {
            return h.u(this.converter.b(v.h(j10)));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    @Override // U0.l
    public long s(float f10) {
        return w.d(this.converter.a(f10));
    }

    public String toString() {
        return "DensityWithConverter(density=" + this.density + ", fontScale=" + this.fontScale + ", converter=" + this.converter + ')';
    }
}
