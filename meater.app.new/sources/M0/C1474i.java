package M0;

import H0.TextLayoutResult;
import android.view.inputmethod.CursorAnchorInfo;
import h0.C3478i;
import kotlin.Metadata;

/* compiled from: CursorAnchorInfoBuilder.android.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LM0/i;", "", "<init>", "()V", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "builder", "LH0/F;", "textLayoutResult", "Lh0/i;", "innerTextFieldBounds", "a", "(Landroid/view/inputmethod/CursorAnchorInfo$Builder;LH0/F;Lh0/i;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: M0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1474i {

    /* renamed from: a, reason: collision with root package name */
    public static final C1474i f11904a = new C1474i();

    private C1474i() {
    }

    public static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, TextLayoutResult textLayoutResult, C3478i innerTextFieldBounds) {
        int iQ;
        int iQ2;
        if (!innerTextFieldBounds.n() && (iQ = textLayoutResult.q(innerTextFieldBounds.getTop())) <= (iQ2 = textLayoutResult.q(innerTextFieldBounds.getBottom()))) {
            while (true) {
                builder.addVisibleLineBounds(textLayoutResult.r(iQ), textLayoutResult.u(iQ), textLayoutResult.s(iQ), textLayoutResult.l(iQ));
                if (iQ == iQ2) {
                    break;
                }
                iQ++;
            }
        }
        return builder;
    }
}
