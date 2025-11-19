package I0;

import android.text.Layout;
import kotlin.Metadata;

/* compiled from: LayoutCompat.android.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroid/text/Layout;", "", "offset", "", "upstream", "a", "(Landroid/text/Layout;IZ)I", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: I0.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1188z {
    public static final int a(Layout layout, int i10, boolean z10) {
        if (i10 <= 0) {
            return 0;
        }
        if (i10 >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i10);
        int lineStart = layout.getLineStart(lineForOffset);
        return (lineStart == i10 || layout.getLineEnd(lineForOffset) == i10) ? lineStart == i10 ? z10 ? lineForOffset - 1 : lineForOffset : z10 ? lineForOffset : lineForOffset + 1 : lineForOffset;
    }
}
