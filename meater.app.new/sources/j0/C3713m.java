package j0;

import i0.C3606v0;
import kotlin.Metadata;

/* compiled from: Oklab.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0017\u0010\u0018J=\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u0001H\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b!\u0010\u0010\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Lj0/m;", "Lj0/c;", "", "name", "", "id", "<init>", "(Ljava/lang/String;I)V", "component", "", "f", "(I)F", "e", "", "v", "l", "([F)[F", "v0", "v1", "v2", "", "j", "(FFF)J", "m", "(FFF)F", "x", "y", "z", "a", "colorSpace", "Li0/t0;", "n", "(FFFFLj0/c;)J", "b", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: j0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3713m extends AbstractC3703c {

    /* renamed from: f, reason: collision with root package name */
    private static final float[] f43372f;

    /* renamed from: g, reason: collision with root package name */
    private static final float[] f43373g;

    /* renamed from: h, reason: collision with root package name */
    private static final float[] f43374h;

    /* renamed from: i, reason: collision with root package name */
    private static final float[] f43375i;

    static {
        float[] transform = AbstractC3701a.INSTANCE.a().getTransform();
        C3711k c3711k = C3711k.f43359a;
        float[] fArrL = C3704d.l(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, C3704d.e(transform, c3711k.b().c(), c3711k.e().c()));
        f43372f = fArrL;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f43373g = fArr;
        f43374h = C3704d.k(fArrL);
        f43375i = C3704d.k(fArr);
    }

    public C3713m(String str, int i10) {
        super(str, C3702b.INSTANCE.a(), i10, null);
    }

    @Override // j0.AbstractC3703c
    public float[] b(float[] v10) {
        C3704d.n(f43372f, v10);
        v10[0] = W0.b.a(v10[0]);
        v10[1] = W0.b.a(v10[1]);
        v10[2] = W0.b.a(v10[2]);
        C3704d.n(f43373g, v10);
        return v10;
    }

    @Override // j0.AbstractC3703c
    public float e(int component) {
        return component == 0 ? 1.0f : 0.5f;
    }

    @Override // j0.AbstractC3703c
    public float f(int component) {
        return component == 0 ? 0.0f : -0.5f;
    }

    @Override // j0.AbstractC3703c
    public long j(float v02, float v12, float v22) {
        if (v02 < 0.0f) {
            v02 = 0.0f;
        }
        if (v02 > 1.0f) {
            v02 = 1.0f;
        }
        if (v12 < -0.5f) {
            v12 = -0.5f;
        }
        if (v12 > 0.5f) {
            v12 = 0.5f;
        }
        if (v22 < -0.5f) {
            v22 = -0.5f;
        }
        float f10 = v22 <= 0.5f ? v22 : 0.5f;
        float[] fArr = f43375i;
        float f11 = (fArr[0] * v02) + (fArr[3] * v12) + (fArr[6] * f10);
        float f12 = (fArr[1] * v02) + (fArr[4] * v12) + (fArr[7] * f10);
        float f13 = (fArr[2] * v02) + (fArr[5] * v12) + (fArr[8] * f10);
        float f14 = f11 * f11 * f11;
        float f15 = f12 * f12 * f12;
        float f16 = f13 * f13 * f13;
        float[] fArr2 = f43374h;
        return (Float.floatToRawIntBits(((fArr2[0] * f14) + (fArr2[3] * f15)) + (fArr2[6] * f16)) << 32) | (Float.floatToRawIntBits((fArr2[1] * f14) + (fArr2[4] * f15) + (fArr2[7] * f16)) & 4294967295L);
    }

    @Override // j0.AbstractC3703c
    public float[] l(float[] v10) {
        float f10 = v10[0];
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        v10[0] = f10;
        float f11 = v10[1];
        if (f11 < -0.5f) {
            f11 = -0.5f;
        }
        if (f11 > 0.5f) {
            f11 = 0.5f;
        }
        v10[1] = f11;
        float f12 = v10[2];
        float f13 = f12 >= -0.5f ? f12 : -0.5f;
        v10[2] = f13 <= 0.5f ? f13 : 0.5f;
        C3704d.n(f43375i, v10);
        float f14 = v10[0];
        v10[0] = f14 * f14 * f14;
        float f15 = v10[1];
        v10[1] = f15 * f15 * f15;
        float f16 = v10[2];
        v10[2] = f16 * f16 * f16;
        C3704d.n(f43374h, v10);
        return v10;
    }

    @Override // j0.AbstractC3703c
    public float m(float v02, float v12, float v22) {
        if (v02 < 0.0f) {
            v02 = 0.0f;
        }
        if (v02 > 1.0f) {
            v02 = 1.0f;
        }
        if (v12 < -0.5f) {
            v12 = -0.5f;
        }
        if (v12 > 0.5f) {
            v12 = 0.5f;
        }
        if (v22 < -0.5f) {
            v22 = -0.5f;
        }
        float f10 = v22 <= 0.5f ? v22 : 0.5f;
        float[] fArr = f43375i;
        float f11 = (fArr[0] * v02) + (fArr[3] * v12) + (fArr[6] * f10);
        float f12 = (fArr[1] * v02) + (fArr[4] * v12) + (fArr[7] * f10);
        float f13 = (fArr[2] * v02) + (fArr[5] * v12) + (fArr[8] * f10);
        float f14 = f11 * f11 * f11;
        float f15 = f12 * f12 * f12;
        float[] fArr2 = f43374h;
        return (fArr2[2] * f14) + (fArr2[5] * f15) + (fArr2[8] * f13 * f13 * f13);
    }

    @Override // j0.AbstractC3703c
    public long n(float x10, float y10, float z10, float a10, AbstractC3703c colorSpace) {
        float[] fArr = f43372f;
        float f10 = (fArr[0] * x10) + (fArr[3] * y10) + (fArr[6] * z10);
        float f11 = (fArr[1] * x10) + (fArr[4] * y10) + (fArr[7] * z10);
        float f12 = (fArr[2] * x10) + (fArr[5] * y10) + (fArr[8] * z10);
        float fA = W0.b.a(f10);
        float fA2 = W0.b.a(f11);
        float fA3 = W0.b.a(f12);
        float[] fArr2 = f43373g;
        return C3606v0.a((fArr2[0] * fA) + (fArr2[3] * fA2) + (fArr2[6] * fA3), (fArr2[1] * fA) + (fArr2[4] * fA2) + (fArr2[7] * fA3), (fArr2[2] * fA) + (fArr2[5] * fA2) + (fArr2[8] * fA3), a10, colorSpace);
    }
}
