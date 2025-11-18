package kotlin;

import Ha.f;
import java.util.ArrayList;
import java.util.List;
import kotlin.B;
import kotlin.Metadata;
import kotlin.collections.r;

/* compiled from: LazyLayoutBeyondBoundsState.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\u001a)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LC/q;", "LC/B;", "pinnedItemList", "LC/g;", "beyondBoundsInfo", "", "", "a", "(LC/q;LC/B;LC/g;)Ljava/util/List;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: C.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0972k {
    public static final List<Integer> a(q qVar, B b10, C0968g c0968g) {
        if (!c0968g.d() && b10.isEmpty()) {
            return r.m();
        }
        ArrayList arrayList = new ArrayList();
        f fVar = c0968g.d() ? new f(c0968g.c(), Math.min(c0968g.b(), qVar.a() - 1)) : f.INSTANCE.a();
        int size = b10.size();
        for (int i10 = 0; i10 < size; i10++) {
            B.a aVar = b10.get(i10);
            int iA = r.a(qVar, aVar.getKey(), aVar.getIndex());
            int first = fVar.getFirst();
            if ((iA > fVar.getLast() || first > iA) && iA >= 0 && iA < qVar.a()) {
                arrayList.add(Integer.valueOf(iA));
            }
        }
        int first2 = fVar.getFirst();
        int last = fVar.getLast();
        if (first2 <= last) {
            while (true) {
                arrayList.add(Integer.valueOf(first2));
                if (first2 == last) {
                    break;
                }
                first2++;
            }
        }
        return arrayList;
    }
}
