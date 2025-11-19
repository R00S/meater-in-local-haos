package s4;

import java.util.List;
import kotlin.Metadata;
import l4.AbstractC3900b;
import o4.AnalyticsResponse;
import o4.RecipeAnalyticsRequestInput;
import ta.InterfaceC4588d;

/* compiled from: RecipeBulkAnalyticsUseCase.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H¦B¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ls4/c;", "", "", "Lo4/q;", "input", "Ll4/b;", "Lo4/c;", "a", "(Ljava/util/List;Lta/d;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface c {
    Object a(List<RecipeAnalyticsRequestInput> list, InterfaceC4588d<? super AbstractC3900b<AnalyticsResponse>> interfaceC4588d);
}
