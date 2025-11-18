package kotlin.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Sets.kt */
@Metadata(m32266d1 = {"\u0000J\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\u001aN\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u001f\b\u0001\u0010\u0005\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001\u001aF\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u001f\b\u0001\u0010\u0005\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001a\u0012\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0001\"\u0004\b\u0000\u0010\u000b\u001a\u001f\u0010\f\u001a\u0012\u0012\u0004\u0012\u0002H\u000b0\rj\b\u0012\u0004\u0012\u0002H\u000b`\u000e\"\u0004\b\u0000\u0010\u000bH\u0087\b\u001a5\u0010\f\u001a\u0012\u0012\u0004\u0012\u0002H\u000b0\rj\b\u0012\u0004\u0012\u0002H\u000b`\u000e\"\u0004\b\u0000\u0010\u000b2\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u000b0\u0010\"\u0002H\u000b¢\u0006\u0002\u0010\u0011\u001a\u001f\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u0002H\u000b0\u0013j\b\u0012\u0004\u0012\u0002H\u000b`\u0014\"\u0004\b\u0000\u0010\u000bH\u0087\b\u001a5\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u0002H\u000b0\u0013j\b\u0012\u0004\u0012\u0002H\u000b`\u0014\"\u0004\b\u0000\u0010\u000b2\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u000b0\u0010\"\u0002H\u000b¢\u0006\u0002\u0010\u0015\u001a\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0007\"\u0004\b\u0000\u0010\u000bH\u0087\b\u001a+\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0007\"\u0004\b\u0000\u0010\u000b2\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u000b0\u0010\"\u0002H\u000b¢\u0006\u0002\u0010\u0017\u001a\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0001\"\u0004\b\u0000\u0010\u000bH\u0087\b\u001a+\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0001\"\u0004\b\u0000\u0010\u000b2\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u000b0\u0010\"\u0002H\u000b¢\u0006\u0002\u0010\u0017\u001a'\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0001\"\b\b\u0000\u0010\u000b*\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u0001H\u000bH\u0007¢\u0006\u0002\u0010\u001c\u001a5\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0001\"\b\b\u0000\u0010\u000b*\u00020\u001a2\u0016\u0010\u000f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u0001H\u000b0\u0010\"\u0004\u0018\u0001H\u000bH\u0007¢\u0006\u0002\u0010\u0017\u001a\u001e\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0001\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\u0001H\u0000\u001a!\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0001\"\u0004\b\u0000\u0010\u000b*\n\u0012\u0004\u0012\u0002H\u000b\u0018\u00010\u0001H\u0087\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001f"}, m32267d2 = {"buildSet", HttpUrl.FRAGMENT_ENCODE_SET, "E", "capacity", HttpUrl.FRAGMENT_ENCODE_SET, "builderAction", "Lkotlin/Function1;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/ExtensionFunctionType;", "emptySet", "T", "hashSetOf", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "elements", HttpUrl.FRAGMENT_ENCODE_SET, "([Ljava/lang/Object;)Ljava/util/HashSet;", "linkedSetOf", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "([Ljava/lang/Object;)Ljava/util/LinkedHashSet;", "mutableSetOf", "([Ljava/lang/Object;)Ljava/util/Set;", "setOf", "setOfNotNull", HttpUrl.FRAGMENT_ENCODE_SET, "element", "(Ljava/lang/Object;)Ljava/util/Set;", "optimizeReadOnlySet", "orEmpty", "kotlin-stdlib"}, m32268k = 5, m32269mv = {1, 7, 1}, m32271xi = 49, m32272xs = "kotlin/collections/SetsKt")
/* renamed from: kotlin.w.w0 */
/* loaded from: classes2.dex */
public class C10822w0 extends C10820v0 {
    /* renamed from: d */
    public static <T> Set<T> m38917d() {
        return EmptySet.f41459f;
    }

    /* renamed from: e */
    public static <T> HashSet<T> m38918e(T... tArr) {
        C9801m.m32346f(tArr, "elements");
        return (HashSet) C10803n.m38738R(tArr, new HashSet(C10808p0.m38793e(tArr.length)));
    }

    /* renamed from: f */
    public static <T> LinkedHashSet<T> m38919f(T... tArr) {
        C9801m.m32346f(tArr, "elements");
        return (LinkedHashSet) C10803n.m38738R(tArr, new LinkedHashSet(C10808p0.m38793e(tArr.length)));
    }

    /* renamed from: g */
    public static <T> Set<T> m38920g(T... tArr) {
        C9801m.m32346f(tArr, "elements");
        return (Set) C10803n.m38738R(tArr, new LinkedHashSet(C10808p0.m38793e(tArr.length)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    public static final <T> Set<T> m38921h(Set<? extends T> set) {
        C9801m.m32346f(set, "<this>");
        int size = set.size();
        return size != 0 ? size != 1 ? set : C10820v0.m38916c(set.iterator().next()) : m38917d();
    }

    /* renamed from: i */
    public static <T> Set<T> m38922i(T... tArr) {
        C9801m.m32346f(tArr, "elements");
        return tArr.length > 0 ? C10803n.m38758l0(tArr) : m38917d();
    }
}
