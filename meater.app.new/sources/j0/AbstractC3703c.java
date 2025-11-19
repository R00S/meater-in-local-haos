package j0;

import i0.C3606v0;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: ColorSpace.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\b&\u0018\u0000 62\u00020\u0001:\u0001#B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u0006H&¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u0006H&¢\u0006\u0004\b\u000e\u0010\rJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\u00122\b\b\u0001\u0010\u0015\u001a\u00020\u0012H'¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ=\u0010&\u001a\u00020%2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u0000H\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'J'\u0010#\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000bH\u0007¢\u0006\u0004\b#\u0010\u0014J\u0019\u0010\u0011\u001a\u00020\u00122\b\b\u0001\u0010\u0015\u001a\u00020\u0012H'¢\u0006\u0004\b\u0011\u0010\u0017J\u000f\u0010(\u001a\u00020\u0002H\u0016¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0006H\u0016¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u00100\u001a\u0004\b1\u0010)R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0011\u00102\u001a\u0004\b\u0010\u00103R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u0010/R\u0011\u00107\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b4\u0010/R\u0014\u0010:\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006;"}, d2 = {"Lj0/c;", "", "", "name", "Lj0/b;", "model", "", "id", "<init>", "(Ljava/lang/String;JILkotlin/jvm/internal/k;)V", "component", "", "f", "(I)F", "e", "r", "g", "b", "", "k", "(FFF)[F", "v", "l", "([F)[F", "v0", "v1", "v2", "", "j", "(FFF)J", "m", "(FFF)F", "x", "y", "z", "a", "colorSpace", "Li0/t0;", "n", "(FFFFLj0/c;)J", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Ljava/lang/String;", "h", "J", "()J", "c", "I", "d", "componentCount", "i", "()Z", "isSrgb", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: j0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3703c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long model;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int id;

    public /* synthetic */ AbstractC3703c(String str, long j10, int i10, C3854k c3854k) {
        this(str, j10, i10);
    }

    public final float[] a(float x10, float y10, float z10) {
        float[] fArr = new float[C3702b.f(this.model)];
        fArr[0] = x10;
        fArr[1] = y10;
        fArr[2] = z10;
        return b(fArr);
    }

    public abstract float[] b(float[] v10);

    public final int c() {
        return C3702b.f(this.model);
    }

    /* renamed from: d, reason: from getter */
    public final int getId() {
        return this.id;
    }

    public abstract float e(int component);

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        AbstractC3703c abstractC3703c = (AbstractC3703c) other;
        if (this.id == abstractC3703c.id && C3862t.b(this.name, abstractC3703c.name)) {
            return C3702b.e(this.model, abstractC3703c.model);
        }
        return false;
    }

    public abstract float f(int component);

    /* renamed from: g, reason: from getter */
    public final long getModel() {
        return this.model;
    }

    /* renamed from: h, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + C3702b.g(this.model)) * 31) + this.id;
    }

    /* renamed from: i */
    public boolean getIsSrgb() {
        return false;
    }

    public long j(float v02, float v12, float v22) {
        float[] fArrK = k(v02, v12, v22);
        float f10 = fArrK[0];
        float f11 = fArrK[1];
        return (Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L);
    }

    public final float[] k(float r10, float g10, float b10) {
        return l(new float[]{r10, g10, b10});
    }

    public abstract float[] l(float[] v10);

    public float m(float v02, float v12, float v22) {
        return k(v02, v12, v22)[2];
    }

    public long n(float x10, float y10, float z10, float a10, AbstractC3703c colorSpace) {
        float[] fArrA = a(x10, y10, z10);
        return C3606v0.a(fArrA[0], fArrA[1], fArrA[2], a10, colorSpace);
    }

    public String toString() {
        return this.name + " (id=" + this.id + ", model=" + ((Object) C3702b.h(this.model)) + ')';
    }

    private AbstractC3703c(String str, long j10, int i10) {
        this.name = str;
        this.model = j10;
        this.id = i10;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i10 < -1 || i10 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }
}
