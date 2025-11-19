package kotlin.collections;

import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _CollectionsJvm.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"T", "", "Loa/F;", "X", "(Ljava/util/List;)V", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
/* loaded from: classes2.dex */
public class A extends z {
    public static <T> void X(List<T> list) {
        C3862t.g(list, "<this>");
        Collections.reverse(list);
    }
}
