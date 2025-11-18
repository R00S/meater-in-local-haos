package i0;

import kotlin.Metadata;

/* compiled from: Float16.kt */
@Aa.b
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0006\b\u0081@\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u0088\u0001\u0007\u0092\u0001\u00020\u0006¨\u0006\f"}, d2 = {"Li0/D0;", "", "", "value", "c", "(F)S", "", "halfValue", "j", "(S)S", "B", "a", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class D0 implements Comparable<D0> {

    /* renamed from: C, reason: collision with root package name */
    private static final short f42822C = j(5120);

    /* renamed from: D, reason: collision with root package name */
    private static final short f42823D = j(-1025);

    /* renamed from: E, reason: collision with root package name */
    private static final short f42824E = j(31743);

    /* renamed from: F, reason: collision with root package name */
    private static final short f42825F = j(1024);

    /* renamed from: G, reason: collision with root package name */
    private static final short f42826G = j(1);

    /* renamed from: H, reason: collision with root package name */
    private static final short f42827H = j(32256);

    /* renamed from: I, reason: collision with root package name */
    private static final short f42828I = j(-1024);

    /* renamed from: J, reason: collision with root package name */
    private static final short f42829J = j(Short.MIN_VALUE);

    /* renamed from: K, reason: collision with root package name */
    private static final short f42830K = j(31744);

    /* renamed from: L, reason: collision with root package name */
    private static final short f42831L = j(0);

    public static short c(float f10) {
        int i10;
        int iFloatToRawIntBits = Float.floatToRawIntBits(f10);
        int i11 = iFloatToRawIntBits >>> 31;
        int i12 = (iFloatToRawIntBits >>> 23) & 255;
        int i13 = 8388607 & iFloatToRawIntBits;
        int i14 = 31;
        int i15 = 0;
        if (i12 != 255) {
            int i16 = i12 - 112;
            if (i16 >= 31) {
                i14 = 49;
            } else if (i16 > 0) {
                i15 = i13 >> 13;
                if ((iFloatToRawIntBits & 4096) != 0) {
                    i10 = (((i16 << 10) | i15) + 1) | (i11 << 15);
                    return j((short) i10);
                }
                i14 = i16;
            } else if (i16 >= -10) {
                int i17 = (8388608 | i13) >> (1 - i16);
                if ((i17 & 4096) != 0) {
                    i17 += 8192;
                }
                i14 = 0;
                i15 = i17 >> 13;
            } else {
                i14 = 0;
            }
        } else if (i13 != 0) {
            i15 = 512;
        }
        i10 = (i11 << 15) | (i14 << 10) | i15;
        return j((short) i10);
    }

    public static short j(short s10) {
        return s10;
    }
}
