package j0;

import i0.C3606v0;
import kotlin.Metadata;

/* compiled from: Lab.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0017\u0010\u0018J=\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u0001H\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b!\u0010\u0010\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Lj0/l;", "Lj0/c;", "", "name", "", "id", "<init>", "(Ljava/lang/String;I)V", "component", "", "f", "(I)F", "e", "", "v", "l", "([F)[F", "v0", "v1", "v2", "", "j", "(FFF)J", "m", "(FFF)F", "x", "y", "z", "a", "colorSpace", "Li0/t0;", "n", "(FFFFLj0/c;)J", "b", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: j0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3712l extends AbstractC3703c {
    public C3712l(String str, int i10) {
        super(str, C3702b.INSTANCE.a(), i10, null);
    }

    @Override // j0.AbstractC3703c
    public float[] b(float[] v10) {
        float f10 = v10[0];
        C3711k c3711k = C3711k.f43359a;
        float f11 = f10 / c3711k.c()[0];
        float f12 = v10[1] / c3711k.c()[1];
        float f13 = v10[2] / c3711k.c()[2];
        float fCbrt = f11 > 0.008856452f ? (float) Math.cbrt(f11) : (f11 * 7.787037f) + 0.13793103f;
        float fCbrt2 = f12 > 0.008856452f ? (float) Math.cbrt(f12) : (f12 * 7.787037f) + 0.13793103f;
        float fCbrt3 = f13 > 0.008856452f ? (float) Math.cbrt(f13) : (f13 * 7.787037f) + 0.13793103f;
        float f14 = (116.0f * fCbrt2) - 16.0f;
        float f15 = (fCbrt - fCbrt2) * 500.0f;
        float f16 = (fCbrt2 - fCbrt3) * 200.0f;
        if (f14 < 0.0f) {
            f14 = 0.0f;
        }
        if (f14 > 100.0f) {
            f14 = 100.0f;
        }
        v10[0] = f14;
        if (f15 < -128.0f) {
            f15 = -128.0f;
        }
        if (f15 > 128.0f) {
            f15 = 128.0f;
        }
        v10[1] = f15;
        if (f16 < -128.0f) {
            f16 = -128.0f;
        }
        v10[2] = f16 <= 128.0f ? f16 : 128.0f;
        return v10;
    }

    @Override // j0.AbstractC3703c
    public float e(int component) {
        return component == 0 ? 100.0f : 128.0f;
    }

    @Override // j0.AbstractC3703c
    public float f(int component) {
        return component == 0 ? 0.0f : -128.0f;
    }

    @Override // j0.AbstractC3703c
    public long j(float v02, float v12, float v22) {
        if (v02 < 0.0f) {
            v02 = 0.0f;
        }
        if (v02 > 100.0f) {
            v02 = 100.0f;
        }
        if (v12 < -128.0f) {
            v12 = -128.0f;
        }
        if (v12 > 128.0f) {
            v12 = 128.0f;
        }
        float f10 = (v02 + 16.0f) / 116.0f;
        float f11 = (v12 * 0.002f) + f10;
        float f12 = f11 > 0.20689656f ? f11 * f11 * f11 : (f11 - 0.13793103f) * 0.12841855f;
        float f13 = f10 > 0.20689656f ? f10 * f10 * f10 : (f10 - 0.13793103f) * 0.12841855f;
        float f14 = f12 * C3711k.f43359a.c()[0];
        return (Float.floatToRawIntBits(f13 * r5.c()[1]) & 4294967295L) | (Float.floatToRawIntBits(f14) << 32);
    }

    @Override // j0.AbstractC3703c
    public float[] l(float[] v10) {
        float f10 = v10[0];
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 100.0f) {
            f10 = 100.0f;
        }
        v10[0] = f10;
        float f11 = v10[1];
        if (f11 < -128.0f) {
            f11 = -128.0f;
        }
        if (f11 > 128.0f) {
            f11 = 128.0f;
        }
        v10[1] = f11;
        float f12 = v10[2];
        float f13 = f12 >= -128.0f ? f12 : -128.0f;
        float f14 = f13 <= 128.0f ? f13 : 128.0f;
        v10[2] = f14;
        float f15 = (f10 + 16.0f) / 116.0f;
        float f16 = (f11 * 0.002f) + f15;
        float f17 = f15 - (f14 * 0.005f);
        float f18 = f16 > 0.20689656f ? f16 * f16 * f16 : (f16 - 0.13793103f) * 0.12841855f;
        float f19 = f15 > 0.20689656f ? f15 * f15 * f15 : (f15 - 0.13793103f) * 0.12841855f;
        float f20 = f17 > 0.20689656f ? f17 * f17 * f17 : (f17 - 0.13793103f) * 0.12841855f;
        C3711k c3711k = C3711k.f43359a;
        v10[0] = f18 * c3711k.c()[0];
        v10[1] = f19 * c3711k.c()[1];
        v10[2] = f20 * c3711k.c()[2];
        return v10;
    }

    @Override // j0.AbstractC3703c
    public float m(float v02, float v12, float v22) {
        if (v02 < 0.0f) {
            v02 = 0.0f;
        }
        if (v02 > 100.0f) {
            v02 = 100.0f;
        }
        if (v22 < -128.0f) {
            v22 = -128.0f;
        }
        if (v22 > 128.0f) {
            v22 = 128.0f;
        }
        float f10 = ((v02 + 16.0f) / 116.0f) - (v22 * 0.005f);
        return (f10 > 0.20689656f ? f10 * f10 * f10 : 0.12841855f * (f10 - 0.13793103f)) * C3711k.f43359a.c()[2];
    }

    @Override // j0.AbstractC3703c
    public long n(float x10, float y10, float z10, float a10, AbstractC3703c colorSpace) {
        C3711k c3711k = C3711k.f43359a;
        float f10 = x10 / c3711k.c()[0];
        float f11 = y10 / c3711k.c()[1];
        float f12 = z10 / c3711k.c()[2];
        float fCbrt = f10 > 0.008856452f ? (float) Math.cbrt(f10) : (f10 * 7.787037f) + 0.13793103f;
        float fCbrt2 = f11 > 0.008856452f ? (float) Math.cbrt(f11) : (f11 * 7.787037f) + 0.13793103f;
        float f13 = (116.0f * fCbrt2) - 16.0f;
        float f14 = (fCbrt - fCbrt2) * 500.0f;
        float fCbrt3 = (fCbrt2 - (f12 > 0.008856452f ? (float) Math.cbrt(f12) : (f12 * 7.787037f) + 0.13793103f)) * 200.0f;
        if (f13 < 0.0f) {
            f13 = 0.0f;
        }
        if (f13 > 100.0f) {
            f13 = 100.0f;
        }
        if (f14 < -128.0f) {
            f14 = -128.0f;
        }
        if (f14 > 128.0f) {
            f14 = 128.0f;
        }
        if (fCbrt3 < -128.0f) {
            fCbrt3 = -128.0f;
        }
        return C3606v0.a(f13, f14, fCbrt3 <= 128.0f ? fCbrt3 : 128.0f, a10, colorSpace);
    }
}
