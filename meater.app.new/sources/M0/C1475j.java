package M0;

import H0.TextLayoutResult;
import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import h0.C3478i;
import kotlin.Metadata;
import oa.InterfaceC4156a;

/* compiled from: CursorAnchorInfoBuilder.android.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0005\u001ak\u0010\u0012\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a3\u0010\u0016\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a;\u0010\u001a\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a#\u0010\u001f\u001a\u00020\f*\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "LM0/E;", "textFieldValue", "LM0/x;", "offsetMapping", "LH0/F;", "textLayoutResult", "Landroid/graphics/Matrix;", "matrix", "Lh0/i;", "innerTextFieldBounds", "decorationBoxBounds", "", "includeInsertionMarker", "includeCharacterBounds", "includeEditorBounds", "includeLineBounds", "Landroid/view/inputmethod/CursorAnchorInfo;", "b", "(Landroid/view/inputmethod/CursorAnchorInfo$Builder;LM0/E;LM0/x;LH0/F;Landroid/graphics/Matrix;Lh0/i;Lh0/i;ZZZZ)Landroid/view/inputmethod/CursorAnchorInfo;", "", "selectionStart", "d", "(Landroid/view/inputmethod/CursorAnchorInfo$Builder;ILM0/x;LH0/F;Lh0/i;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "startOffset", "endOffset", "a", "(Landroid/view/inputmethod/CursorAnchorInfo$Builder;IILM0/x;LH0/F;Lh0/i;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "", "x", "y", "c", "(Lh0/i;FF)Z", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: M0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1475j {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final android.view.inputmethod.CursorAnchorInfo.Builder a(android.view.inputmethod.CursorAnchorInfo.Builder r17, int r18, int r19, M0.x r20, H0.TextLayoutResult r21, h0.C3478i r22) {
        /*
            r0 = r19
            r1 = r20
            r2 = r18
            r3 = r22
            int r4 = r1.a(r2)
            int r5 = r1.a(r0)
            int r6 = r5 - r4
            int r6 = r6 * 4
            float[] r6 = new float[r6]
            H0.j r7 = r21.getMultiParagraph()
            long r8 = H0.I.b(r4, r5)
            r5 = 0
            r7.a(r8, r6, r5)
        L22:
            if (r2 >= r0) goto L8e
            int r5 = r1.a(r2)
            int r7 = r5 - r4
            int r7 = r7 * 4
            h0.i r8 = new h0.i
            r9 = r6[r7]
            int r10 = r7 + 1
            r10 = r6[r10]
            int r11 = r7 + 2
            r11 = r6[r11]
            int r7 = r7 + 3
            r7 = r6[r7]
            r8.<init>(r9, r10, r11, r7)
            boolean r7 = r3.o(r8)
            float r9 = r8.getLeft()
            float r10 = r8.getTop()
            boolean r9 = c(r3, r9, r10)
            if (r9 == 0) goto L63
            float r9 = r8.getRight()
            float r10 = r8.getBottom()
            boolean r9 = c(r3, r9, r10)
            if (r9 != 0) goto L60
            goto L63
        L60:
            r9 = r21
            goto L66
        L63:
            r7 = r7 | 2
            goto L60
        L66:
            R0.h r5 = r9.c(r5)
            R0.h r10 = R0.h.Rtl
            if (r5 != r10) goto L73
            r5 = r7 | 4
            r16 = r5
            goto L75
        L73:
            r16 = r7
        L75:
            float r12 = r8.getLeft()
            float r13 = r8.getTop()
            float r14 = r8.getRight()
            float r15 = r8.getBottom()
            r10 = r17
            r11 = r2
            r10.addCharacterBounds(r11, r12, r13, r14, r15, r16)
            int r2 = r2 + 1
            goto L22
        L8e:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: M0.C1475j.a(android.view.inputmethod.CursorAnchorInfo$Builder, int, int, M0.x, H0.F, h0.i):android.view.inputmethod.CursorAnchorInfo$Builder");
    }

    @InterfaceC4156a
    public static final CursorAnchorInfo b(CursorAnchorInfo.Builder builder, TextFieldValue textFieldValue, x xVar, TextLayoutResult textLayoutResult, Matrix matrix, C3478i c3478i, C3478i c3478i2, boolean z10, boolean z11, boolean z12, boolean z13) {
        builder.reset();
        builder.setMatrix(matrix);
        int iJ = H0.H.j(textFieldValue.getSelection());
        builder.setSelectionRange(iJ, H0.H.i(textFieldValue.getSelection()));
        if (z10) {
            d(builder, iJ, xVar, textLayoutResult, c3478i);
        }
        if (z11) {
            H0.H composition = textFieldValue.getComposition();
            int iJ2 = composition != null ? H0.H.j(composition.getPackedValue()) : -1;
            H0.H composition2 = textFieldValue.getComposition();
            int i10 = composition2 != null ? H0.H.i(composition2.getPackedValue()) : -1;
            if (iJ2 >= 0 && iJ2 < i10) {
                builder.setComposingText(iJ2, textFieldValue.d().subSequence(iJ2, i10));
                a(builder, iJ2, i10, xVar, textLayoutResult, c3478i);
            }
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33 && z12) {
            C1472g.a(builder, c3478i2);
        }
        if (i11 >= 34 && z13) {
            C1474i.a(builder, textLayoutResult, c3478i);
        }
        return builder.build();
    }

    private static final boolean c(C3478i c3478i, float f10, float f11) {
        float left = c3478i.getLeft();
        if (f10 <= c3478i.getRight() && left <= f10) {
            float top = c3478i.getTop();
            if (f11 <= c3478i.getBottom() && top <= f11) {
                return true;
            }
        }
        return false;
    }

    private static final CursorAnchorInfo.Builder d(CursorAnchorInfo.Builder builder, int i10, x xVar, TextLayoutResult textLayoutResult, C3478i c3478i) {
        if (i10 < 0) {
            return builder;
        }
        int iA = xVar.a(i10);
        C3478i c3478iE = textLayoutResult.e(iA);
        float fJ = Ha.g.j(c3478iE.getLeft(), 0.0f, U0.r.g(textLayoutResult.getSize()));
        boolean zC = c(c3478i, fJ, c3478iE.getTop());
        boolean zC2 = c(c3478i, fJ, c3478iE.getBottom());
        boolean z10 = textLayoutResult.c(iA) == R0.h.Rtl;
        int i11 = (zC || zC2) ? 1 : 0;
        if (!zC || !zC2) {
            i11 |= 2;
        }
        builder.setInsertionMarkerLocation(fJ, c3478iE.getTop(), c3478iE.getBottom(), c3478iE.getBottom(), z10 ? i11 | 4 : i11);
        return builder;
    }
}
