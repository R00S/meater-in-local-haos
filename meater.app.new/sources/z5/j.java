package z5;

import Ba.p;
import Ub.n;
import Xb.C1841i;
import Xb.F;
import Xb.I;
import Xb.InterfaceC1867v0;
import android.view.B;
import android.view.D;
import android.view.Y;
import android.view.Z;
import androidx.media3.datasource.cache.a;
import e5.C3197a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C3862t;
import l4.AbstractC3900b;
import l4.InterfaceC3899a;
import o4.FiltersData;
import o4.Recipe;
import o4.RecipeFilter;
import o4.RecipesData;
import oa.C4153F;
import oa.C4173r;
import s4.InterfaceC4479a;
import ta.AbstractC4585a;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: RecipeBrowseViewModel.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0012\u001a\u00020\u00112\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0011¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u001e\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R*\u0010-\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020)0(j\b\u0012\u0004\u0012\u00020)`*0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00140'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010,R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020/0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010,R\u0018\u00105\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R'\u0010=\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020)0(j\b\u0012\u0004\u0012\u00020)`*0:8F¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0017\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00140:8F¢\u0006\u0006\u001a\u0004\b>\u0010<R\u0017\u0010A\u001a\b\u0012\u0004\u0012\u00020/0:8F¢\u0006\u0006\u001a\u0004\b@\u0010<¨\u0006B"}, d2 = {"Lz5/j;", "Landroidx/lifecycle/Y;", "Ls4/d;", "recipeFilters", "Ls4/a;", "allRecipe", "LG5/a;", "prefs", "LI5/a;", "cacheManager", "<init>", "(Ls4/d;Ls4/a;LG5/a;LI5/a;)V", "Ll4/b;", "Lo4/f;", "filterResponse", "Lo4/v;", "recipeResponse", "Loa/F;", "r", "(Ll4/b;Ll4/b;)V", "", "recipeSlug", "", "q", "(Ljava/lang/String;)I", "l", "()V", "Landroidx/media3/datasource/cache/a$c;", "m", "()Landroidx/media3/datasource/cache/a$c;", "g", "b", "Ls4/d;", "c", "Ls4/a;", "d", "LG5/a;", "e", "LI5/a;", "Landroidx/lifecycle/D;", "Ljava/util/ArrayList;", "Lo4/o;", "Lkotlin/collections/ArrayList;", "f", "Landroidx/lifecycle/D;", "_recipeData", "_error", "", "h", "_loading", "LXb/v0;", "i", "LXb/v0;", "recipeJob", "LXb/F;", "j", "LXb/F;", "coroutineExceptionHandler", "Landroidx/lifecycle/B;", "p", "()Landroidx/lifecycle/B;", "recipeData", "n", "error", "o", "loading", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class j extends Y {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final s4.d recipeFilters;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4479a allRecipe;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final G5.a prefs;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final I5.a cacheManager;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final D<ArrayList<Recipe>> _recipeData;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final D<String> _error;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final D<Boolean> _loading;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private InterfaceC1867v0 recipeJob;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final F coroutineExceptionHandler;

    /* compiled from: RecipeBrowseViewModel.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.recipe.ui.browse.RecipeBrowseViewModel$fetchFilterAndRecipes$1", f = "RecipeBrowseViewModel.kt", l = {75, 77, 79}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
    static final class a extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        Object f53764B;

        /* renamed from: C, reason: collision with root package name */
        Object f53765C;

        /* renamed from: D, reason: collision with root package name */
        int f53766D;

        /* renamed from: E, reason: collision with root package name */
        private /* synthetic */ Object f53767E;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ String f53769G;

        /* compiled from: RecipeBrowseViewModel.kt */
        @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.recipe.ui.browse.RecipeBrowseViewModel$fetchFilterAndRecipes$1$2$2$1", f = "RecipeBrowseViewModel.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
        /* renamed from: z5.j$a$a, reason: collision with other inner class name */
        static final class C0789a extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f53770B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ j f53771C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ AbstractC3900b<FiltersData> f53772D;

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ AbstractC3900b<RecipesData> f53773E;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0789a(j jVar, AbstractC3900b<FiltersData> abstractC3900b, AbstractC3900b<RecipesData> abstractC3900b2, InterfaceC4588d<? super C0789a> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f53771C = jVar;
                this.f53772D = abstractC3900b;
                this.f53773E = abstractC3900b2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                return new C0789a(this.f53771C, this.f53772D, this.f53773E, interfaceC4588d);
            }

            @Override // Ba.p
            public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((C0789a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                C4696b.e();
                if (this.f53770B != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
                this.f53771C.r(this.f53772D, this.f53773E);
                return C4153F.f46609a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, InterfaceC4588d<? super a> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f53769G = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            a aVar = j.this.new a(this.f53769G, interfaceC4588d);
            aVar.f53767E = obj;
            return aVar;
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x00cd  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 245
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: z5.j.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"z5/j$b", "Lta/a;", "LXb/F;", "Lta/g;", "context", "", "exception", "Loa/F;", "y", "(Lta/g;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends AbstractC4585a implements F {
        public b(F.Companion companion) {
            super(companion);
        }

        @Override // Xb.F
        public void y(ta.g context, Throwable exception) {
            exception.printStackTrace();
        }
    }

    public j(s4.d recipeFilters, InterfaceC4479a allRecipe, G5.a prefs, I5.a cacheManager) {
        C3862t.g(recipeFilters, "recipeFilters");
        C3862t.g(allRecipe, "allRecipe");
        C3862t.g(prefs, "prefs");
        C3862t.g(cacheManager, "cacheManager");
        this.recipeFilters = recipeFilters;
        this.allRecipe = allRecipe;
        this.prefs = prefs;
        this.cacheManager = cacheManager;
        this._recipeData = new D<>();
        this._error = new D<>();
        this._loading = new D<>();
        this.coroutineExceptionHandler = new b(F.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void r(AbstractC3900b<FiltersData> filterResponse, AbstractC3900b<RecipesData> recipeResponse) {
        ArrayList<Recipe> arrayListA;
        List<RecipeFilter> listA;
        if (recipeResponse instanceof AbstractC3900b.a) {
            this._loading.l(Boolean.FALSE);
            D<String> d10 = this._error;
            InterfaceC3899a error = ((AbstractC3900b.a) recipeResponse).getError();
            C3862t.d(error);
            d10.l(C3197a.c(error));
            return;
        }
        if (!(recipeResponse instanceof AbstractC3900b.C0590b)) {
            throw new NoWhenBranchMatchedException();
        }
        FiltersData filtersDataA = filterResponse.a();
        if (filtersDataA != null && (listA = filtersDataA.a()) != null) {
            x5.g.f52863a.l(listA);
        }
        RecipesData recipesData = (RecipesData) ((AbstractC3900b.C0590b) recipeResponse).a();
        if (recipesData != null && (arrayListA = recipesData.a()) != null) {
            x5.g.f52863a.m(arrayListA);
            this._recipeData.l(arrayListA);
        }
        this._loading.l(Boolean.FALSE);
    }

    @Override // android.view.Y
    protected void g() {
        super.g();
        InterfaceC1867v0 interfaceC1867v0 = this.recipeJob;
        if (interfaceC1867v0 != null) {
            InterfaceC1867v0.a.a(interfaceC1867v0, null, 1, null);
        }
    }

    public final void l() {
        U4.b.t("(RecipeBrowseViewModel) Start Fetching Filters and Recipes", new Object[0]);
        String strS = x4.g.s();
        U4.b.t("(RecipeBrowseViewModel) Locale Selected: " + strS, new Object[0]);
        this.recipeJob = C1841i.d(Z.a(this), Xb.Z.b().s(this.coroutineExceptionHandler), null, new a(strS, null), 2, null);
    }

    public final a.c m() {
        return this.cacheManager.getCacheDataSourceFactory();
    }

    public final B<String> n() {
        return this._error;
    }

    public final B<Boolean> o() {
        return this._loading;
    }

    public final B<ArrayList<Recipe>> p() {
        return this._recipeData;
    }

    public final int q(String recipeSlug) {
        Iterator<Recipe> it = x5.g.f52863a.h().iterator();
        C3862t.f(it, "iterator(...)");
        while (it.hasNext()) {
            Recipe next = it.next();
            C3862t.f(next, "next(...)");
            Recipe recipe = next;
            if (recipe.getSlug() != null && n.u(recipe.getSlug(), recipeSlug, false, 2, null)) {
                return recipe.getId();
            }
        }
        return -1;
    }
}
