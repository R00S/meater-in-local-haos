package kotlin.ranges;

import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: Ranges.kt */
@Metadata(m32266d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a@\u0010\u0006\u001a\u00020\u0003\"\b\b\u0000\u0010\u0007*\u00020\b\"\u0018\b\u0001\u0010\t*\b\u0012\u0004\u0012\u0002H\u00070\n*\b\u0012\u0004\u0012\u0002H\u00070\u000b*\u0002H\t2\b\u0010\f\u001a\u0004\u0018\u0001H\u0007H\u0087\n¢\u0006\u0002\u0010\r\u001a0\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00070\u000b\"\u000e\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u000f*\u0002H\u00072\u0006\u0010\u0010\u001a\u0002H\u0007H\u0086\u0002¢\u0006\u0002\u0010\u0011\u001a\u001b\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012*\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0013H\u0087\u0002\u001a\u001b\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00140\u0012*\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0014H\u0087\u0002¨\u0006\u0015"}, m32267d2 = {"checkStepIsPositive", HttpUrl.FRAGMENT_ENCODE_SET, "isPositive", HttpUrl.FRAGMENT_ENCODE_SET, "step", HttpUrl.FRAGMENT_ENCODE_SET, "contains", "T", HttpUrl.FRAGMENT_ENCODE_SET, "R", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/ranges/ClosedRange;", "element", "(Ljava/lang/Iterable;Ljava/lang/Object;)Z", "rangeTo", HttpUrl.FRAGMENT_ENCODE_SET, "that", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Lkotlin/ranges/ClosedRange;", "Lkotlin/ranges/ClosedFloatingPointRange;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "kotlin-stdlib"}, m32268k = 5, m32269mv = {1, 7, 1}, m32271xi = 49, m32272xs = "kotlin/ranges/RangesKt")
/* renamed from: kotlin.e0.k */
/* loaded from: classes2.dex */
class C9847k {
    /* renamed from: a */
    public static final void m32418a(boolean z, Number number) {
        C9801m.m32346f(number, "step");
        if (z) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + number + '.');
    }
}
