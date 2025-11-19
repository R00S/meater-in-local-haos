package V0;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: FontScaleConverterTable.android.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001\tB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\nJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u001d\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\u0018\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR \u0010 \u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0018\u0012\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u001e\u0010\u001a¨\u0006\""}, d2 = {"LV0/c;", "LV0/a;", "", "fromSp", "toDp", "<init>", "([F[F)V", "", "dp", "a", "(F)F", "sp", "b", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "[F", "getMFromSpValues", "()[F", "getMFromSpValues$annotations", "()V", "mFromSpValues", "getMToDpValues", "getMToDpValues$annotations", "mToDpValues", "c", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c implements a {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f17997d = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float[] mFromSpValues;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final float[] toDpValues;

    /* compiled from: FontScaleConverterTable.android.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LV0/c$a;", "", "<init>", "()V", "", "sourceValue", "", "sourceValues", "targetValues", "b", "(F[F[F)F", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: V0.c$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float b(float sourceValue, float[] sourceValues, float[] targetValues) {
            float f10;
            float f11;
            float f12;
            float fA;
            float fAbs = Math.abs(sourceValue);
            float fSignum = Math.signum(sourceValue);
            int iBinarySearch = Arrays.binarySearch(sourceValues, fAbs);
            if (iBinarySearch >= 0) {
                fA = targetValues[iBinarySearch];
            } else {
                int i10 = -(iBinarySearch + 1);
                int i11 = i10 - 1;
                float f13 = 0.0f;
                if (i11 >= sourceValues.length - 1) {
                    float f14 = sourceValues[sourceValues.length - 1];
                    float f15 = targetValues[sourceValues.length - 1];
                    if (f14 == 0.0f) {
                        return 0.0f;
                    }
                    return sourceValue * (f15 / f14);
                }
                if (i11 == -1) {
                    float f16 = sourceValues[0];
                    f12 = targetValues[0];
                    f11 = f16;
                    f10 = 0.0f;
                } else {
                    float f17 = sourceValues[i11];
                    float f18 = sourceValues[i10];
                    f10 = targetValues[i11];
                    f13 = f17;
                    f11 = f18;
                    f12 = targetValues[i10];
                }
                fA = d.f18000a.a(f10, f12, f13, f11, fAbs);
            }
            return fSignum * fA;
        }

        private Companion() {
        }
    }

    public c(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.mFromSpValues = fArr;
        this.toDpValues = fArr2;
    }

    @Override // V0.a
    public float a(float dp) {
        return INSTANCE.b(dp, this.toDpValues, this.mFromSpValues);
    }

    @Override // V0.a
    public float b(float sp) {
        return INSTANCE.b(sp, this.mFromSpValues, this.toDpValues);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof c)) {
            return false;
        }
        c cVar = (c) other;
        return Arrays.equals(this.mFromSpValues, cVar.mFromSpValues) && Arrays.equals(this.toDpValues, cVar.toDpValues);
    }

    public int hashCode() {
        return (Arrays.hashCode(this.mFromSpValues) * 31) + Arrays.hashCode(this.toDpValues);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontScaleConverter{fromSpValues=");
        String string = Arrays.toString(this.mFromSpValues);
        C3862t.f(string, "toString(this)");
        sb2.append(string);
        sb2.append(", toDpValues=");
        String string2 = Arrays.toString(this.toDpValues);
        C3862t.f(string2, "toString(this)");
        sb2.append(string2);
        sb2.append('}');
        return sb2.toString();
    }
}
