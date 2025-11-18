package i4;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import l4.AbstractC3900b;
import o4.AnalyticsResponse;
import o4.RecipeAnalyticsRequestInput;
import q4.InterfaceC4288d;
import ta.InterfaceC4588d;

/* compiled from: RecipeBulkAnalyticsUseCaseImpl.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Li4/c;", "Ls4/c;", "Lq4/d;", "recipeRepository", "<init>", "(Lq4/d;)V", "", "Lo4/q;", "input", "Ll4/b;", "Lo4/c;", "a", "(Ljava/util/List;Lta/d;)Ljava/lang/Object;", "Lq4/d;", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c implements s4.c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4288d recipeRepository;

    public c(InterfaceC4288d recipeRepository) {
        C3862t.g(recipeRepository, "recipeRepository");
        this.recipeRepository = recipeRepository;
    }

    @Override // s4.c
    public Object a(List<RecipeAnalyticsRequestInput> list, InterfaceC4588d<? super AbstractC3900b<AnalyticsResponse>> interfaceC4588d) {
        return this.recipeRepository.a(list, interfaceC4588d);
    }
}
