package H0;

import H0.C1060d;
import java.util.List;
import kotlin.AbstractC1341l;
import kotlin.Metadata;

/* compiled from: ParagraphIntrinsics.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aY\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"", "text", "LH0/J;", "style", "", "LH0/d$c;", "LH0/C;", "spanStyles", "LH0/w;", "placeholders", "LU0/d;", "density", "LL0/l$b;", "fontFamilyResolver", "LH0/r;", "a", "(Ljava/lang/String;LH0/J;Ljava/util/List;Ljava/util/List;LU0/d;LL0/l$b;)LH0/r;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class s {
    public static final r a(String str, TextStyle textStyle, List<C1060d.Range<SpanStyle>> list, List<C1060d.Range<Placeholder>> list2, U0.d dVar, AbstractC1341l.b bVar) {
        return O0.e.a(str, textStyle, list, list2, dVar, bVar);
    }

    public static /* synthetic */ r b(String str, TextStyle textStyle, List list, List list2, U0.d dVar, AbstractC1341l.b bVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            list = kotlin.collections.r.m();
        }
        List list3 = list;
        if ((i10 & 8) != 0) {
            list2 = kotlin.collections.r.m();
        }
        return a(str, textStyle, list3, list2, dVar, bVar);
    }
}
