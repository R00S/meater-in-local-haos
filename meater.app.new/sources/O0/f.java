package O0;

import H0.C1057a;
import H0.C1060d;
import H0.Placeholder;
import H0.SpanStyle;
import H0.TextStyle;
import java.util.List;
import kotlin.AbstractC1341l;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: ActualParagraph.android.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ar\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a2\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"", "text", "LH0/J;", "style", "", "LH0/d$c;", "LH0/C;", "spanStyles", "LH0/w;", "placeholders", "", "maxLines", "", "ellipsis", "LU0/b;", "constraints", "LU0/d;", "density", "LL0/l$b;", "fontFamilyResolver", "LH0/o;", "b", "(Ljava/lang/String;LH0/J;Ljava/util/List;Ljava/util/List;IZJLU0/d;LL0/l$b;)LH0/o;", "LH0/r;", "paragraphIntrinsics", "a", "(LH0/r;IZJ)LH0/o;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f {
    public static final H0.o a(H0.r rVar, int i10, boolean z10, long j10) {
        C3862t.e(rVar, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidParagraphIntrinsics");
        return new C1057a((d) rVar, i10, z10, j10, null);
    }

    public static final H0.o b(String str, TextStyle textStyle, List<C1060d.Range<SpanStyle>> list, List<C1060d.Range<Placeholder>> list2, int i10, boolean z10, long j10, U0.d dVar, AbstractC1341l.b bVar) {
        return new C1057a(new d(str, textStyle, list, list2, bVar, dVar), i10, z10, j10, null);
    }
}
