package U0;

import kotlin.Metadata;

/* compiled from: TextUnit.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u001a \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u001a\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\"\u001e\u0010\u0013\u001a\u00020\u000f*\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0010\u0010\u0011\"\u001e\u0010\u0018\u001a\u00020\u0004*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015\"\u001e\u0010\u0018\u001a\u00020\u0004*\u00020\u00198FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u001c\u001a\u0004\b\u001a\u0010\u001b\"\u001e\u0010\u0018\u001a\u00020\u0004*\u00020\u001d8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010 \u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"", "value", "LU0/x;", "type", "LU0/v;", "a", "(FJ)J", "", "unitType", "v", "g", "(JF)J", "Loa/F;", "b", "(J)V", "", "f", "(J)Z", "isUnspecified--R2X_6o$annotations", "isUnspecified", "d", "(F)J", "getSp$annotations", "(F)V", "sp", "", "c", "(D)J", "(D)V", "", "e", "(I)J", "(I)V", "ui-unit_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class w {
    public static final long a(float f10, long j10) {
        return g(j10, f10);
    }

    public static final void b(long j10) {
        if (f(j10)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
    }

    public static final long c(double d10) {
        return g(4294967296L, (float) d10);
    }

    public static final long d(float f10) {
        return g(4294967296L, f10);
    }

    public static final long e(int i10) {
        return g(4294967296L, i10);
    }

    public static final boolean f(long j10) {
        return v.f(j10) == 0;
    }

    public static final long g(long j10, float f10) {
        return v.c(j10 | (Float.floatToIntBits(f10) & 4294967295L));
    }
}
