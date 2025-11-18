package kotlin.ranges;

import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.internal.C10869c;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.markers.KMappedMarker;
import okhttp3.HttpUrl;

/* compiled from: Progressions.kt */
@Metadata(m32266d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u001f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0002\u0010\u0006J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0016J\b\u0010\u0012\u001a\u00020\u000eH\u0016J\t\u0010\u0013\u001a\u00020\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0011\u0010\u0007\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m32267d2 = {"Lkotlin/ranges/IntProgression;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "start", "endInclusive", "step", "(III)V", "first", "getFirst", "()I", "last", "getLast", "getStep", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "isEmpty", "iterator", "Lkotlin/collections/IntIterator;", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "Companion", "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.e0.d, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public class IntProgression implements Iterable<Integer>, KMappedMarker {

    /* renamed from: f */
    public static final a f37214f = new a(null);

    /* renamed from: g */
    private final int f37215g;

    /* renamed from: h */
    private final int f37216h;

    /* renamed from: i */
    private final int f37217i;

    /* compiled from: Progressions.kt */
    @Metadata(m32266d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¨\u0006\t"}, m32267d2 = {"Lkotlin/ranges/IntProgression$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "fromClosedRange", "Lkotlin/ranges/IntProgression;", "rangeStart", HttpUrl.FRAGMENT_ENCODE_SET, "rangeEnd", "step", "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.e0.d$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* renamed from: a */
        public final IntProgression m32396a(int i2, int i3, int i4) {
            return new IntProgression(i2, i3, i4);
        }
    }

    public IntProgression(int i2, int i3, int i4) {
        if (i4 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i4 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f37215g = i2;
        this.f37216h = C10869c.m39068c(i2, i3, i4);
        this.f37217i = i4;
    }

    /* renamed from: c, reason: from getter */
    public final int getF37215g() {
        return this.f37215g;
    }

    public boolean equals(Object other) {
        if (other instanceof IntProgression) {
            if (!isEmpty() || !((IntProgression) other).isEmpty()) {
                IntProgression intProgression = (IntProgression) other;
                if (this.f37215g != intProgression.f37215g || this.f37216h != intProgression.f37216h || this.f37217i != intProgression.f37217i) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f, reason: from getter */
    public final int getF37216h() {
        return this.f37216h;
    }

    /* renamed from: h, reason: from getter */
    public final int getF37217i() {
        return this.f37217i;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f37215g * 31) + this.f37216h) * 31) + this.f37217i;
    }

    @Override // java.lang.Iterable
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public IntIterator iterator() {
        return new IntProgressionIterator(this.f37215g, this.f37216h, this.f37217i);
    }

    public boolean isEmpty() {
        if (this.f37217i > 0) {
            if (this.f37215g > this.f37216h) {
                return true;
            }
        } else if (this.f37215g < this.f37216h) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb;
        int i2;
        if (this.f37217i > 0) {
            sb = new StringBuilder();
            sb.append(this.f37215g);
            sb.append("..");
            sb.append(this.f37216h);
            sb.append(" step ");
            i2 = this.f37217i;
        } else {
            sb = new StringBuilder();
            sb.append(this.f37215g);
            sb.append(" downTo ");
            sb.append(this.f37216h);
            sb.append(" step ");
            i2 = -this.f37217i;
        }
        sb.append(i2);
        return sb.toString();
    }
}
