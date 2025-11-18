package kotlin.ranges;

import kotlin.Metadata;
import kotlin.jvm.internal.C9789g;
import okhttp3.HttpUrl;

/* compiled from: Ranges.kt */
@Metadata(m32266d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0014B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\u0011\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0096\u0002J\u0013\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0003H\u0016J\b\u0010\u0011\u001a\u00020\u000bH\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0014\u0010\u0005\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, m32267d2 = {"Lkotlin/ranges/IntRange;", "Lkotlin/ranges/IntProgression;", "Lkotlin/ranges/ClosedRange;", HttpUrl.FRAGMENT_ENCODE_SET, "start", "endInclusive", "(II)V", "getEndInclusive", "()Ljava/lang/Integer;", "getStart", "contains", HttpUrl.FRAGMENT_ENCODE_SET, "value", "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "isEmpty", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "Companion", "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.e0.f, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class IntRange extends IntProgression {

    /* renamed from: j */
    public static final a f37222j = new a(null);

    /* renamed from: k */
    private static final IntRange f37223k = new IntRange(1, 0);

    /* compiled from: Ranges.kt */
    @Metadata(m32266d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m32267d2 = {"Lkotlin/ranges/IntRange$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "EMPTY", "Lkotlin/ranges/IntRange;", "getEMPTY", "()Lkotlin/ranges/IntRange;", "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.e0.f$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* renamed from: a */
        public final IntRange m32402a() {
            return IntRange.f37223k;
        }
    }

    public IntRange(int i2, int i3) {
        super(i2, i3, 1);
    }

    @Override // kotlin.ranges.IntProgression
    public boolean equals(Object other) {
        if (other instanceof IntRange) {
            if (!isEmpty() || !((IntRange) other).isEmpty()) {
                IntRange intRange = (IntRange) other;
                if (getF37215g() != intRange.getF37215g() || getF37216h() != intRange.getF37216h()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.IntProgression
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (getF37215g() * 31) + getF37216h();
    }

    @Override // kotlin.ranges.IntProgression
    public boolean isEmpty() {
        return getF37215g() > getF37216h();
    }

    /* renamed from: o */
    public boolean m32399o(int i2) {
        return getF37215g() <= i2 && i2 <= getF37216h();
    }

    /* renamed from: q */
    public Integer m32400q() {
        return Integer.valueOf(getF37216h());
    }

    /* renamed from: r */
    public Integer m32401r() {
        return Integer.valueOf(getF37215g());
    }

    @Override // kotlin.ranges.IntProgression
    public String toString() {
        return getF37215g() + ".." + getF37216h();
    }
}
