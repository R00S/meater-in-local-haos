package g6;

import Ba.p;
import com.google.gson.Gson;
import d4.InterfaceC3041a;
import e6.AnalyticsData;
import e6.RecipeAnalyticsRequest;
import e6.RecipeAnalyticsResponse;
import e6.RecipeFilterRemote;
import e6.RecipeItem;
import h6.InterfaceC3491a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C3862t;
import nd.s;
import o4.AnalyticsResponse;
import o4.FiltersData;
import o4.Recipe;
import o4.RecipeAnalyticsRequestInput;
import o4.RecipeFiltersRequestInput;
import o4.RecipeRequestInput;
import o4.RecipesData;
import oa.C4153F;
import oa.C4173r;
import oc.E;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ta.InterfaceC4588d;
import ua.C4696b;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b2\u0006\u0010\u0007\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"Lg6/a;", "Ld4/a;", "Lh6/a;", "service", "<init>", "(Lh6/a;)V", "Lo4/t;", "input", "LZ3/a;", "Lo4/f;", "c", "(Lo4/t;Lta/d;)Ljava/lang/Object;", "Lo4/u;", "Lo4/v;", "b", "(Lo4/u;Lta/d;)Ljava/lang/Object;", "", "Lo4/q;", "Lo4/c;", "a", "(Ljava/util/List;Lta/d;)Ljava/lang/Object;", "Lh6/a;", "network_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: g6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3428a implements InterfaceC3041a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC3491a service;

    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.network.recipe.RecipeRESTDataSource$allRecipe$2", f = "RecipeRESTDataSource.kt", l = {27}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lnd/s;", "Loc/E;", "<anonymous>", "()Lnd/s;"}, k = 3, mv = {2, 0, 0})
    /* renamed from: g6.a$a, reason: collision with other inner class name */
    static final class C0533a extends l implements Ba.l<InterfaceC4588d<? super s<E>>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f41925B;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ RecipeRequestInput f41927D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0533a(RecipeRequestInput recipeRequestInput, InterfaceC4588d<? super C0533a> interfaceC4588d) {
            super(1, interfaceC4588d);
            this.f41927D = recipeRequestInput;
        }

        @Override // Ba.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC4588d<? super s<E>> interfaceC4588d) {
            return ((C0533a) create(interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(InterfaceC4588d<?> interfaceC4588d) {
            return C3428a.this.new C0533a(this.f41927D, interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f41925B;
            if (i10 == 0) {
                C4173r.b(obj);
                InterfaceC3491a interfaceC3491a = C3428a.this.service;
                String locale = this.f41927D.getLocale();
                this.f41925B = 1;
                obj = interfaceC3491a.c(locale, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
            }
            return obj;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.network.recipe.RecipeRESTDataSource$allRecipe$3", f = "RecipeRESTDataSource.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Loc/E;", "it", "Lo4/v;", "<anonymous>", "(Loc/E;)Lo4/v;"}, k = 3, mv = {2, 0, 0})
    /* renamed from: g6.a$b */
    static final class b extends l implements p<E, InterfaceC4588d<? super RecipesData>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f41928B;

        /* renamed from: C, reason: collision with root package name */
        /* synthetic */ Object f41929C;

        b(InterfaceC4588d<? super b> interfaceC4588d) {
            super(2, interfaceC4588d);
        }

        @Override // Ba.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(E e10, InterfaceC4588d<? super RecipesData> interfaceC4588d) {
            return ((b) create(e10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            b bVar = new b(interfaceC4588d);
            bVar.f41929C = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws JSONException {
            C4696b.e();
            if (this.f41928B != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4173r.b(obj);
            E e10 = (E) this.f41929C;
            RecipesData recipesData = new RecipesData(null, 1, null);
            ArrayList<Recipe> arrayList = new ArrayList<>();
            JSONArray jSONArray = new JSONArray(e10.j());
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                jSONObject.getInt("id");
                if (jSONObject.getInt("schema_version") <= 2) {
                    try {
                        Object objK = new Gson().k(jSONArray.get(i10).toString(), RecipeItem.class);
                        C3862t.f(objK, "fromJson(...)");
                        Recipe recipeA = ((RecipeItem) objK).a();
                        if (recipeA.s()) {
                            kotlin.coroutines.jvm.internal.b.a(arrayList.add(recipeA));
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            recipesData.b(arrayList);
            return recipesData;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.network.recipe.RecipeRESTDataSource$bulkAnalytics$2", f = "RecipeRESTDataSource.kt", l = {98}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lnd/s;", "Le6/m;", "<anonymous>", "()Lnd/s;"}, k = 3, mv = {2, 0, 0})
    /* renamed from: g6.a$c */
    static final class c extends l implements Ba.l<InterfaceC4588d<? super s<RecipeAnalyticsResponse>>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f41930B;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ List<RecipeAnalyticsRequestInput> f41932D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List<RecipeAnalyticsRequestInput> list, InterfaceC4588d<? super c> interfaceC4588d) {
            super(1, interfaceC4588d);
            this.f41932D = list;
        }

        @Override // Ba.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC4588d<? super s<RecipeAnalyticsResponse>> interfaceC4588d) {
            return ((c) create(interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(InterfaceC4588d<?> interfaceC4588d) {
            return C3428a.this.new c(this.f41932D, interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f41930B;
            int i11 = 1;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
                return obj;
            }
            C4173r.b(obj);
            InterfaceC3491a interfaceC3491a = C3428a.this.service;
            List<RecipeAnalyticsRequestInput> list = this.f41932D;
            ArrayList arrayList = new ArrayList(r.x(list, 10));
            for (RecipeAnalyticsRequestInput recipeAnalyticsRequestInput : list) {
                arrayList.add(new RecipeAnalyticsRequest(recipeAnalyticsRequestInput.getRecipeId(), recipeAnalyticsRequestInput.getRecommendedTemperature(), recipeAnalyticsRequestInput.getEstimatedDuration(), recipeAnalyticsRequestInput.getNumberOfSteps(), recipeAnalyticsRequestInput.getLocation(), recipeAnalyticsRequestInput.getLocale(), recipeAnalyticsRequestInput.getDeviceId(), recipeAnalyticsRequestInput.getProductNumber(), recipeAnalyticsRequestInput.getCookId(), recipeAnalyticsRequestInput.getOngoingRecipeId(), recipeAnalyticsRequestInput.getTargetTemp(), recipeAnalyticsRequestInput.getStepOrder(), recipeAnalyticsRequestInput.getStepKey(), recipeAnalyticsRequestInput.getStepEstimatedDuration(), recipeAnalyticsRequestInput.getStartedAt(), recipeAnalyticsRequestInput.getFinishedAt(), recipeAnalyticsRequestInput.getCancelledAt(), recipeAnalyticsRequestInput.getPeakTemp()));
                i11 = 1;
            }
            this.f41930B = i11;
            Object objA = interfaceC3491a.a(arrayList, this);
            return objA == objE ? objE : objA;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.network.recipe.RecipeRESTDataSource$bulkAnalytics$3", f = "RecipeRESTDataSource.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Le6/m;", "it", "Lo4/c;", "<anonymous>", "(Le6/m;)Lo4/c;"}, k = 3, mv = {2, 0, 0})
    /* renamed from: g6.a$d */
    static final class d extends l implements p<RecipeAnalyticsResponse, InterfaceC4588d<? super AnalyticsResponse>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f41933B;

        /* renamed from: C, reason: collision with root package name */
        /* synthetic */ Object f41934C;

        d(InterfaceC4588d<? super d> interfaceC4588d) {
            super(2, interfaceC4588d);
        }

        @Override // Ba.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(RecipeAnalyticsResponse recipeAnalyticsResponse, InterfaceC4588d<? super AnalyticsResponse> interfaceC4588d) {
            return ((d) create(recipeAnalyticsResponse, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            d dVar = new d(interfaceC4588d);
            dVar.f41934C = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C4696b.e();
            if (this.f41933B != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4173r.b(obj);
            AnalyticsData data = ((RecipeAnalyticsResponse) this.f41934C).getData();
            return new AnalyticsResponse(data != null ? data.a() : null);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.network.recipe.RecipeRESTDataSource$recipeFilters$2", f = "RecipeRESTDataSource.kt", l = {20}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00030\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lnd/s;", "Ljava/util/ArrayList;", "Le6/n;", "Lkotlin/collections/ArrayList;", "<anonymous>", "()Lnd/s;"}, k = 3, mv = {2, 0, 0})
    /* renamed from: g6.a$e */
    static final class e extends l implements Ba.l<InterfaceC4588d<? super s<ArrayList<RecipeFilterRemote>>>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f41935B;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ RecipeFiltersRequestInput f41937D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(RecipeFiltersRequestInput recipeFiltersRequestInput, InterfaceC4588d<? super e> interfaceC4588d) {
            super(1, interfaceC4588d);
            this.f41937D = recipeFiltersRequestInput;
        }

        @Override // Ba.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC4588d<? super s<ArrayList<RecipeFilterRemote>>> interfaceC4588d) {
            return ((e) create(interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(InterfaceC4588d<?> interfaceC4588d) {
            return C3428a.this.new e(this.f41937D, interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f41935B;
            if (i10 == 0) {
                C4173r.b(obj);
                InterfaceC3491a interfaceC3491a = C3428a.this.service;
                String locale = this.f41937D.getLocale();
                this.f41935B = 1;
                obj = interfaceC3491a.b(locale, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
            }
            return obj;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.network.recipe.RecipeRESTDataSource$recipeFilters$3", f = "RecipeRESTDataSource.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0000j\b\u0012\u0004\u0012\u00020\u0001`\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljava/util/ArrayList;", "Le6/n;", "Lkotlin/collections/ArrayList;", "it", "Lo4/f;", "<anonymous>", "(Ljava/util/ArrayList;)Lo4/f;"}, k = 3, mv = {2, 0, 0})
    /* renamed from: g6.a$f */
    static final class f extends l implements p<ArrayList<RecipeFilterRemote>, InterfaceC4588d<? super FiltersData>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f41938B;

        /* renamed from: C, reason: collision with root package name */
        /* synthetic */ Object f41939C;

        f(InterfaceC4588d<? super f> interfaceC4588d) {
            super(2, interfaceC4588d);
        }

        @Override // Ba.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ArrayList<RecipeFilterRemote> arrayList, InterfaceC4588d<? super FiltersData> interfaceC4588d) {
            return ((f) create(arrayList, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            f fVar = new f(interfaceC4588d);
            fVar.f41939C = obj;
            return fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C4696b.e();
            if (this.f41938B != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4173r.b(obj);
            ArrayList arrayList = (ArrayList) this.f41939C;
            ArrayList arrayList2 = new ArrayList(r.x(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((RecipeFilterRemote) it.next()).a());
            }
            return new FiltersData(arrayList2);
        }
    }

    public C3428a(InterfaceC3491a service) {
        C3862t.g(service, "service");
        this.service = service;
    }

    @Override // d4.InterfaceC3041a
    public Object a(List<RecipeAnalyticsRequestInput> list, InterfaceC4588d<? super Z3.a<AnalyticsResponse>> interfaceC4588d) {
        return X5.e.d(new c(list, null), new d(null), interfaceC4588d);
    }

    @Override // d4.InterfaceC3041a
    public Object b(RecipeRequestInput recipeRequestInput, InterfaceC4588d<? super Z3.a<RecipesData>> interfaceC4588d) {
        return X5.e.d(new C0533a(recipeRequestInput, null), new b(null), interfaceC4588d);
    }

    @Override // d4.InterfaceC3041a
    public Object c(RecipeFiltersRequestInput recipeFiltersRequestInput, InterfaceC4588d<? super Z3.a<FiltersData>> interfaceC4588d) {
        return X5.e.d(new e(recipeFiltersRequestInput, null), new f(null), interfaceC4588d);
    }
}
