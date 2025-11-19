package O0;

import H0.C1066j;
import H0.ParagraphInfo;
import android.graphics.Matrix;
import android.graphics.Shader;
import h0.C3483n;
import i0.AbstractC3582j0;
import i0.C3584k0;
import i0.InterfaceC3586l0;
import i0.Shadow;
import i0.SolidColor;
import i0.a1;
import java.util.List;
import kotlin.Metadata;

/* compiled from: AndroidMultiParagraphDraw.android.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a^\u0010\u0010\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001aT\u0010\u0012\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"LH0/j;", "Li0/l0;", "canvas", "Li0/j0;", "brush", "", "alpha", "Li0/b1;", "shadow", "LR0/j;", "decoration", "Lk0/g;", "drawStyle", "Li0/b0;", "blendMode", "Loa/F;", "a", "(LH0/j;Li0/l0;Li0/j0;FLi0/b1;LR0/j;Lk0/g;I)V", "b", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b {
    public static final void a(C1066j c1066j, InterfaceC3586l0 interfaceC3586l0, AbstractC3582j0 abstractC3582j0, float f10, Shadow shadow, R0.j jVar, k0.g gVar, int i10) {
        interfaceC3586l0.h();
        if (c1066j.u().size() <= 1 || (abstractC3582j0 instanceof SolidColor)) {
            b(c1066j, interfaceC3586l0, abstractC3582j0, f10, shadow, jVar, gVar, i10);
        } else if (abstractC3582j0 instanceof a1) {
            List<ParagraphInfo> listU = c1066j.u();
            int size = listU.size();
            float fMax = 0.0f;
            float fA = 0.0f;
            for (int i11 = 0; i11 < size; i11++) {
                ParagraphInfo paragraphInfo = listU.get(i11);
                fA += paragraphInfo.getParagraph().a();
                fMax = Math.max(fMax, paragraphInfo.getParagraph().b());
            }
            Shader shaderB = ((a1) abstractC3582j0).b(C3483n.a(fMax, fA));
            Matrix matrix = new Matrix();
            shaderB.getLocalMatrix(matrix);
            List<ParagraphInfo> listU2 = c1066j.u();
            int size2 = listU2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                ParagraphInfo paragraphInfo2 = listU2.get(i12);
                paragraphInfo2.getParagraph().k(interfaceC3586l0, C3584k0.a(shaderB), f10, shadow, jVar, gVar, i10);
                interfaceC3586l0.b(0.0f, paragraphInfo2.getParagraph().a());
                matrix.setTranslate(0.0f, -paragraphInfo2.getParagraph().a());
                shaderB.setLocalMatrix(matrix);
            }
        }
        interfaceC3586l0.t();
    }

    private static final void b(C1066j c1066j, InterfaceC3586l0 interfaceC3586l0, AbstractC3582j0 abstractC3582j0, float f10, Shadow shadow, R0.j jVar, k0.g gVar, int i10) {
        List<ParagraphInfo> listU = c1066j.u();
        int size = listU.size();
        for (int i11 = 0; i11 < size; i11++) {
            ParagraphInfo paragraphInfo = listU.get(i11);
            paragraphInfo.getParagraph().k(interfaceC3586l0, abstractC3582j0, f10, shadow, jVar, gVar, i10);
            interfaceC3586l0.b(0.0f, paragraphInfo.getParagraph().a());
        }
    }
}
