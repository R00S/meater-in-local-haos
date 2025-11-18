package H0;

import H0.C1060d;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: MultiParagraphIntrinsics.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001a;\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "LH0/d$c;", "LH0/w;", "", "start", "end", "b", "(Ljava/util/List;II)Ljava/util/List;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: H0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1068l {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List<C1060d.Range<Placeholder>> b(List<C1060d.Range<Placeholder>> list, int i10, int i11) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            C1060d.Range<Placeholder> range = list.get(i12);
            C1060d.Range<Placeholder> range2 = range;
            if (C1061e.k(i10, i11, range2.h(), range2.f())) {
                arrayList.add(range);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i13 = 0; i13 < size2; i13++) {
            C1060d.Range range3 = (C1060d.Range) arrayList.get(i13);
            if (i10 > range3.h() || range3.f() > i11) {
                throw new IllegalArgumentException("placeholder can not overlap with paragraph.");
            }
            arrayList2.add(new C1060d.Range(range3.g(), range3.h() - i10, range3.f() - i10));
        }
        return arrayList2;
    }
}
