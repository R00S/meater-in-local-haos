package o0;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import o0.AbstractC4086g;

/* compiled from: PathNode.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0010\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\u001a;\u0010\n\u001a\u00020\t*\u00020\u00002\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a-\u0010\r\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a-\u0010\u000f\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"", "Ljava/util/ArrayList;", "Lo0/g;", "Lkotlin/collections/ArrayList;", "nodes", "", "args", "", "count", "Loa/F;", "a", "(CLjava/util/ArrayList;[FI)V", "", "b", "(Ljava/util/List;[FI)V", "c", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: o0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4087h {
    public static final void a(char c10, ArrayList<AbstractC4086g> arrayList, float[] fArr, int i10) {
        if (c10 == 'z' || c10 == 'Z') {
            arrayList.add(AbstractC4086g.b.f46153c);
            return;
        }
        if (c10 == 'm') {
            c(arrayList, fArr, i10);
            return;
        }
        if (c10 == 'M') {
            b(arrayList, fArr, i10);
            return;
        }
        int i11 = 0;
        if (c10 == 'l') {
            int i12 = i10 - 2;
            while (i11 <= i12) {
                arrayList.add(new AbstractC4086g.RelativeLineTo(fArr[i11], fArr[i11 + 1]));
                i11 += 2;
            }
            return;
        }
        if (c10 == 'L') {
            int i13 = i10 - 2;
            while (i11 <= i13) {
                arrayList.add(new AbstractC4086g.LineTo(fArr[i11], fArr[i11 + 1]));
                i11 += 2;
            }
            return;
        }
        if (c10 == 'h') {
            int i14 = i10 - 1;
            while (i11 <= i14) {
                arrayList.add(new AbstractC4086g.RelativeHorizontalTo(fArr[i11]));
                i11++;
            }
            return;
        }
        if (c10 == 'H') {
            int i15 = i10 - 1;
            while (i11 <= i15) {
                arrayList.add(new AbstractC4086g.HorizontalTo(fArr[i11]));
                i11++;
            }
            return;
        }
        if (c10 == 'v') {
            int i16 = i10 - 1;
            while (i11 <= i16) {
                arrayList.add(new AbstractC4086g.RelativeVerticalTo(fArr[i11]));
                i11++;
            }
            return;
        }
        if (c10 == 'V') {
            int i17 = i10 - 1;
            while (i11 <= i17) {
                arrayList.add(new AbstractC4086g.VerticalTo(fArr[i11]));
                i11++;
            }
            return;
        }
        if (c10 == 'c') {
            int i18 = i10 - 6;
            while (i11 <= i18) {
                arrayList.add(new AbstractC4086g.RelativeCurveTo(fArr[i11], fArr[i11 + 1], fArr[i11 + 2], fArr[i11 + 3], fArr[i11 + 4], fArr[i11 + 5]));
                i11 += 6;
            }
            return;
        }
        if (c10 == 'C') {
            int i19 = i10 - 6;
            while (i11 <= i19) {
                arrayList.add(new AbstractC4086g.CurveTo(fArr[i11], fArr[i11 + 1], fArr[i11 + 2], fArr[i11 + 3], fArr[i11 + 4], fArr[i11 + 5]));
                i11 += 6;
            }
            return;
        }
        if (c10 == 's') {
            int i20 = i10 - 4;
            while (i11 <= i20) {
                arrayList.add(new AbstractC4086g.RelativeReflectiveCurveTo(fArr[i11], fArr[i11 + 1], fArr[i11 + 2], fArr[i11 + 3]));
                i11 += 4;
            }
            return;
        }
        if (c10 == 'S') {
            int i21 = i10 - 4;
            while (i11 <= i21) {
                arrayList.add(new AbstractC4086g.ReflectiveCurveTo(fArr[i11], fArr[i11 + 1], fArr[i11 + 2], fArr[i11 + 3]));
                i11 += 4;
            }
            return;
        }
        if (c10 == 'q') {
            int i22 = i10 - 4;
            while (i11 <= i22) {
                arrayList.add(new AbstractC4086g.RelativeQuadTo(fArr[i11], fArr[i11 + 1], fArr[i11 + 2], fArr[i11 + 3]));
                i11 += 4;
            }
            return;
        }
        if (c10 == 'Q') {
            int i23 = i10 - 4;
            while (i11 <= i23) {
                arrayList.add(new AbstractC4086g.QuadTo(fArr[i11], fArr[i11 + 1], fArr[i11 + 2], fArr[i11 + 3]));
                i11 += 4;
            }
            return;
        }
        if (c10 == 't') {
            int i24 = i10 - 2;
            while (i11 <= i24) {
                arrayList.add(new AbstractC4086g.RelativeReflectiveQuadTo(fArr[i11], fArr[i11 + 1]));
                i11 += 2;
            }
            return;
        }
        if (c10 == 'T') {
            int i25 = i10 - 2;
            while (i11 <= i25) {
                arrayList.add(new AbstractC4086g.ReflectiveQuadTo(fArr[i11], fArr[i11 + 1]));
                i11 += 2;
            }
            return;
        }
        if (c10 == 'a') {
            int i26 = i10 - 7;
            for (int i27 = 0; i27 <= i26; i27 += 7) {
                arrayList.add(new AbstractC4086g.RelativeArcTo(fArr[i27], fArr[i27 + 1], fArr[i27 + 2], Float.compare(fArr[i27 + 3], 0.0f) != 0, Float.compare(fArr[i27 + 4], 0.0f) != 0, fArr[i27 + 5], fArr[i27 + 6]));
            }
            return;
        }
        if (c10 != 'A') {
            throw new IllegalArgumentException("Unknown command for: " + c10);
        }
        int i28 = i10 - 7;
        for (int i29 = 0; i29 <= i28; i29 += 7) {
            arrayList.add(new AbstractC4086g.ArcTo(fArr[i29], fArr[i29 + 1], fArr[i29 + 2], Float.compare(fArr[i29 + 3], 0.0f) != 0, Float.compare(fArr[i29 + 4], 0.0f) != 0, fArr[i29 + 5], fArr[i29 + 6]));
        }
    }

    private static final void b(List<AbstractC4086g> list, float[] fArr, int i10) {
        int i11 = i10 - 2;
        if (i11 >= 0) {
            list.add(new AbstractC4086g.MoveTo(fArr[0], fArr[1]));
            for (int i12 = 2; i12 <= i11; i12 += 2) {
                list.add(new AbstractC4086g.LineTo(fArr[i12], fArr[i12 + 1]));
            }
        }
    }

    private static final void c(List<AbstractC4086g> list, float[] fArr, int i10) {
        int i11 = i10 - 2;
        if (i11 >= 0) {
            list.add(new AbstractC4086g.RelativeMoveTo(fArr[0], fArr[1]));
            for (int i12 = 2; i12 <= i11; i12 += 2) {
                list.add(new AbstractC4086g.RelativeLineTo(fArr[i12], fArr[i12 + 1]));
            }
        }
    }
}
