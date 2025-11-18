package cm.aptoide.aptoideviews.skeleton.mask;

import kotlin.Metadata;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: Size.kt */
@Metadata(m32266d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, m32267d2 = {"Lcm/aptoide/aptoideviews/skeleton/mask/SizeDimension;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "OriginalValue", "PercentValue", "SpecificValue", "Lcm/aptoide/aptoideviews/skeleton/mask/SizeDimension$OriginalValue;", "Lcm/aptoide/aptoideviews/skeleton/mask/SizeDimension$PercentValue;", "Lcm/aptoide/aptoideviews/skeleton/mask/SizeDimension$SpecificValue;", "aptoide-views_prodRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public abstract class SizeDimension {

    /* compiled from: Size.kt */
    @Metadata(m32266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m32267d2 = {"Lcm/aptoide/aptoideviews/skeleton/mask/SizeDimension$OriginalValue;", "Lcm/aptoide/aptoideviews/skeleton/mask/SizeDimension;", "()V", "aptoide-views_prodRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    public static final class OriginalValue extends SizeDimension {
        public static final OriginalValue INSTANCE = new OriginalValue();

        private OriginalValue() {
            super(null);
        }
    }

    /* compiled from: Size.kt */
    @Metadata(m32266d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m32267d2 = {"Lcm/aptoide/aptoideviews/skeleton/mask/SizeDimension$PercentValue;", "Lcm/aptoide/aptoideviews/skeleton/mask/SizeDimension;", "fraction", HttpUrl.FRAGMENT_ENCODE_SET, "(F)V", "getFraction", "()F", "component1", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "aptoide-views_prodRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    public static final /* data */ class PercentValue extends SizeDimension {
        private final float fraction;

        public PercentValue(float f2) {
            super(null);
            this.fraction = f2;
        }

        public static /* synthetic */ PercentValue copy$default(PercentValue percentValue, float f2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                f2 = percentValue.fraction;
            }
            return percentValue.copy(f2);
        }

        /* renamed from: component1, reason: from getter */
        public final float getFraction() {
            return this.fraction;
        }

        public final PercentValue copy(float fraction) {
            return new PercentValue(fraction);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PercentValue) && C9801m.m32341a(Float.valueOf(this.fraction), Float.valueOf(((PercentValue) other).fraction));
        }

        public final float getFraction() {
            return this.fraction;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.fraction);
        }

        public String toString() {
            return "PercentValue(fraction=" + this.fraction + ')';
        }
    }

    /* compiled from: Size.kt */
    @Metadata(m32266d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m32267d2 = {"Lcm/aptoide/aptoideviews/skeleton/mask/SizeDimension$SpecificValue;", "Lcm/aptoide/aptoideviews/skeleton/mask/SizeDimension;", "value", HttpUrl.FRAGMENT_ENCODE_SET, "(F)V", "getValue", "()F", "component1", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "aptoide-views_prodRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    public static final /* data */ class SpecificValue extends SizeDimension {
        private final float value;

        public SpecificValue(float f2) {
            super(null);
            this.value = f2;
        }

        public static /* synthetic */ SpecificValue copy$default(SpecificValue specificValue, float f2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                f2 = specificValue.value;
            }
            return specificValue.copy(f2);
        }

        /* renamed from: component1, reason: from getter */
        public final float getValue() {
            return this.value;
        }

        public final SpecificValue copy(float value) {
            return new SpecificValue(value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SpecificValue) && C9801m.m32341a(Float.valueOf(this.value), Float.valueOf(((SpecificValue) other).value));
        }

        public final float getValue() {
            return this.value;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.value);
        }

        public String toString() {
            return "SpecificValue(value=" + this.value + ')';
        }
    }

    private SizeDimension() {
    }

    public /* synthetic */ SizeDimension(C9789g c9789g) {
        this();
    }
}
