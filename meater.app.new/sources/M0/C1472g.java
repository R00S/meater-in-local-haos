package M0;

import android.view.inputmethod.CursorAnchorInfo;
import h0.C3478i;
import i0.X0;
import kotlin.Metadata;

/* compiled from: CursorAnchorInfoBuilder.android.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LM0/g;", "", "<init>", "()V", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "builder", "Lh0/i;", "decorationBoxBounds", "a", "(Landroid/view/inputmethod/CursorAnchorInfo$Builder;Lh0/i;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: M0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1472g {

    /* renamed from: a, reason: collision with root package name */
    public static final C1472g f11903a = new C1472g();

    private C1472g() {
    }

    public static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, C3478i decorationBoxBounds) {
        return builder.setEditorBoundsInfo(C1467b.a().setEditorBounds(X0.c(decorationBoxBounds)).setHandwritingBounds(X0.c(decorationBoxBounds)).build());
    }
}
