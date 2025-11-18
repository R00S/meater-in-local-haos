package y0;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: MeasurePolicy.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bç\u0080\u0001\u0018\u00002\u00020\u0001J)\u0010\b\u001a\u00020\u0006*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ)\u0010\u000b\u001a\u00020\u0006*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\tJ)\u0010\f\u001a\u00020\u0006*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\tJ)\u0010\r\u001a\u00020\u0006*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\tJ,\u0010\u0013\u001a\u00020\u0012*\u00020\u000e2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\u0006\u0010\u0011\u001a\u00020\u0010H&ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0003"}, d2 = {"Ly0/I;", "", "Ly0/r;", "", "Ly0/q;", "measurables", "", "height", "c", "(Ly0/r;Ljava/util/List;I)I", "width", "h", "d", "i", "Ly0/K;", "Ly0/H;", "LU0/b;", "constraints", "Ly0/J;", "measure", "(Ly0/K;Ljava/util/List;LU0/b;)Ly0/J;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface I {
    default int c(r rVar, List<? extends InterfaceC5112q> list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new C5108m(list.get(i11), EnumC5113s.Min, EnumC5114t.Width));
        }
        return e(new C5115u(rVar, rVar.getLayoutDirection()), arrayList, U0.c.b(0, 0, 0, i10, 7, null)).getF53095a();
    }

    default int d(r rVar, List<? extends InterfaceC5112q> list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new C5108m(list.get(i11), EnumC5113s.Max, EnumC5114t.Width));
        }
        return e(new C5115u(rVar, rVar.getLayoutDirection()), arrayList, U0.c.b(0, 0, 0, i10, 7, null)).getF53095a();
    }

    J e(K k10, List<? extends H> list, long j10);

    default int h(r rVar, List<? extends InterfaceC5112q> list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new C5108m(list.get(i11), EnumC5113s.Min, EnumC5114t.Height));
        }
        return e(new C5115u(rVar, rVar.getLayoutDirection()), arrayList, U0.c.b(0, i10, 0, 0, 13, null)).getF53096b();
    }

    default int i(r rVar, List<? extends InterfaceC5112q> list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new C5108m(list.get(i11), EnumC5113s.Max, EnumC5114t.Height));
        }
        return e(new C5115u(rVar, rVar.getLayoutDirection()), arrayList, U0.c.b(0, i10, 0, 0, 13, null)).getF53096b();
    }
}
