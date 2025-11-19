package i4;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import l4.AbstractC3900b;
import o4.RecipeRequestInput;
import o4.RecipesData;
import q4.InterfaceC4288d;
import s4.InterfaceC4479a;
import ta.InterfaceC4588d;

/* compiled from: AllRecipeUseCaseImpl.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\r"}, d2 = {"Li4/a;", "Ls4/a;", "Lq4/d;", "recipeRepository", "<init>", "(Lq4/d;)V", "Lo4/u;", "input", "Ll4/b;", "Lo4/v;", "a", "(Lo4/u;Lta/d;)Ljava/lang/Object;", "Lq4/d;", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: i4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3624a implements InterfaceC4479a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4288d recipeRepository;

    public C3624a(InterfaceC4288d recipeRepository) {
        C3862t.g(recipeRepository, "recipeRepository");
        this.recipeRepository = recipeRepository;
    }

    @Override // s4.InterfaceC4479a
    public Object a(RecipeRequestInput recipeRequestInput, InterfaceC4588d<? super AbstractC3900b<RecipesData>> interfaceC4588d) {
        return this.recipeRepository.b(recipeRequestInput, interfaceC4588d);
    }
}
