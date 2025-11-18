package a3;

import S2.k;
import X1.C1804a;
import X1.L;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: WebvttSubtitle.java */
/* loaded from: classes.dex */
final class j implements k {

    /* renamed from: B, reason: collision with root package name */
    private final List<d> f20071B;

    /* renamed from: C, reason: collision with root package name */
    private final long[] f20072C;

    /* renamed from: D, reason: collision with root package name */
    private final long[] f20073D;

    public j(List<d> list) {
        this.f20071B = Collections.unmodifiableList(new ArrayList(list));
        this.f20072C = new long[list.size() * 2];
        for (int i10 = 0; i10 < list.size(); i10++) {
            d dVar = list.get(i10);
            int i11 = i10 * 2;
            long[] jArr = this.f20072C;
            jArr[i11] = dVar.f20042b;
            jArr[i11 + 1] = dVar.f20043c;
        }
        long[] jArr2 = this.f20072C;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f20073D = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int b(d dVar, d dVar2) {
        return Long.compare(dVar.f20042b, dVar2.f20042b);
    }

    @Override // S2.k
    public int c(long j10) {
        int iE = L.e(this.f20073D, j10, false, false);
        if (iE < this.f20073D.length) {
            return iE;
        }
        return -1;
    }

    @Override // S2.k
    public long j(int i10) {
        C1804a.a(i10 >= 0);
        C1804a.a(i10 < this.f20073D.length);
        return this.f20073D[i10];
    }

    @Override // S2.k
    public List<W1.a> n(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < this.f20071B.size(); i10++) {
            long[] jArr = this.f20072C;
            int i11 = i10 * 2;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                d dVar = this.f20071B.get(i10);
                W1.a aVar = dVar.f20041a;
                if (aVar.f18303e == -3.4028235E38f) {
                    arrayList2.add(dVar);
                } else {
                    arrayList.add(aVar);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: a3.i
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return j.b((d) obj, (d) obj2);
            }
        });
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            arrayList.add(((d) arrayList2.get(i12)).f20041a.a().h((-1) - i12, 1).a());
        }
        return arrayList;
    }

    @Override // S2.k
    public int p() {
        return this.f20073D.length;
    }
}
