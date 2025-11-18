package kotlin.comparisons;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: Comparisons.kt */
@Metadata(m32266d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002`\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0005J$\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\"\u0010\n\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002`\u0004¨\u0006\u000b"}, m32267d2 = {"Lkotlin/comparisons/ReverseOrderComparator;", "Ljava/util/Comparator;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/Comparator;", "()V", "compare", HttpUrl.FRAGMENT_ENCODE_SET, "a", "b", "reversed", "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.x.f, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
final class ReverseOrderComparator implements Comparator<Comparable<? super Object>> {

    /* renamed from: f */
    public static final ReverseOrderComparator f41518f = new ReverseOrderComparator();

    private ReverseOrderComparator() {
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable<Object> comparable, Comparable<Object> comparable2) {
        C9801m.m32346f(comparable, "a");
        C9801m.m32346f(comparable2, "b");
        return comparable2.compareTo(comparable);
    }

    @Override // java.util.Comparator
    public final Comparator<Comparable<? super Object>> reversed() {
        return NaturalOrderComparator.f41517f;
    }
}
