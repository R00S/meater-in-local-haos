package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Iterators.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"T", "", "Lkotlin/collections/G;", "A", "(Ljava/util/Iterator;)Ljava/util/Iterator;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
/* renamed from: kotlin.collections.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3841w extends C3840v {
    public static <T> Iterator<IndexedValue<T>> A(Iterator<? extends T> it) {
        C3862t.g(it, "<this>");
        return new I(it);
    }
}
