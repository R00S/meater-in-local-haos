package q4;

import java.util.List;
import kotlin.Metadata;
import l4.AbstractC3900b;
import o4.AnalyticsResponse;
import o4.FiltersData;
import o4.RecipeAnalyticsRequestInput;
import o4.RecipeFiltersRequestInput;
import o4.RecipeRequestInput;
import o4.RecipesData;
import ta.InterfaceC4588d;

/* compiled from: RecipeRepository.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\u0003\u001a\u00020\bH¦@¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\r0\fH¦@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lq4/d;", "", "Lo4/t;", "input", "Ll4/b;", "Lo4/f;", "c", "(Lo4/t;Lta/d;)Ljava/lang/Object;", "Lo4/u;", "Lo4/v;", "b", "(Lo4/u;Lta/d;)Ljava/lang/Object;", "", "Lo4/q;", "Lo4/c;", "a", "(Ljava/util/List;Lta/d;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: q4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC4288d {
    Object a(List<RecipeAnalyticsRequestInput> list, InterfaceC4588d<? super AbstractC3900b<AnalyticsResponse>> interfaceC4588d);

    Object b(RecipeRequestInput recipeRequestInput, InterfaceC4588d<? super AbstractC3900b<RecipesData>> interfaceC4588d);

    Object c(RecipeFiltersRequestInput recipeFiltersRequestInput, InterfaceC4588d<? super AbstractC3900b<FiltersData>> interfaceC4588d);
}
