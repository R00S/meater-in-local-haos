package kotlin.ranges;

import kotlin.Metadata;
import kotlin.jvm.internal.C9789g;
import okhttp3.HttpUrl;

/* compiled from: Ranges.kt */
@Metadata(m32266d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0015B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\u0011\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0096\u0002J\u0013\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u000bH\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0014\u0010\u0005\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\b¨\u0006\u0016"}, m32267d2 = {"Lkotlin/ranges/LongRange;", "Lkotlin/ranges/LongProgression;", "Lkotlin/ranges/ClosedRange;", HttpUrl.FRAGMENT_ENCODE_SET, "start", "endInclusive", "(JJ)V", "getEndInclusive", "()Ljava/lang/Long;", "getStart", "contains", HttpUrl.FRAGMENT_ENCODE_SET, "value", "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "isEmpty", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "Companion", "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.e0.i, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class LongRange extends LongProgression {

    /* renamed from: j */
    public static final a f37232j = new a(null);

    /* renamed from: k */
    private static final LongRange f37233k = new LongRange(1, 0);

    /* compiled from: Ranges.kt */
    @Metadata(m32266d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m32267d2 = {"Lkotlin/ranges/LongRange$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "EMPTY", "Lkotlin/ranges/LongRange;", "getEMPTY", "()Lkotlin/ranges/LongRange;", "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.e0.i$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }
    }

    public LongRange(long j2, long j3) {
        super(j2, j3, 1L);
    }

    public boolean equals(Object other) {
        if (other instanceof LongRange) {
            if (!isEmpty() || !((LongRange) other).isEmpty()) {
                LongRange longRange = (LongRange) other;
                if (getF37225g() != longRange.getF37225g() || getF37226h() != longRange.getF37226h()) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (int) ((31 * (getF37225g() ^ (getF37225g() >>> 32))) + (getF37226h() ^ (getF37226h() >>> 32)));
    }

    /* renamed from: i */
    public boolean m32407i(long j2) {
        return getF37225g() <= j2 && j2 <= getF37226h();
    }

    public boolean isEmpty() {
        return getF37225g() > getF37226h();
    }

    public String toString() {
        return getF37225g() + ".." + getF37226h();
    }
}
