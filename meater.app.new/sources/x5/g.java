package x5;

import Ub.n;
import android.view.B;
import android.view.D;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.meatCutStructure.Meat;
import com.apptionlabs.meater_app.meatCutStructure.MeatCategory;
import com.apptionlabs.meater_app.meatCutStructure.MeatCutType;
import com.apptionlabs.meater_app.meatCutStructure.MeatCutsHelper;
import com.apptionlabs.meater_app.meatCutStructure.MeatModel;
import com.apptionlabs.meater_app.meatCutStructure.SearchableMeatCut;
import com.apptionlabs.meater_app.v3protobuf.DeviceCookState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;
import o4.Preparation;
import o4.PreparationItem;
import o4.PreparationSubItem;
import o4.Recipe;
import o4.RecipeFilter;
import o4.Setup;
import o4.m;
import o6.AbstractC4137a;

/* compiled from: RecipeManager.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t¢\u0006\u0004\b\u0010\u0010\rJ\u001d\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\u0011j\b\u0012\u0004\u0012\u00020\u000e`\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u0018J#\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\t2\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b#\u0010$J%\u0010*\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u001d\u0010,\u001a\u0012\u0012\u0004\u0012\u00020\n0\u0011j\b\u0012\u0004\u0012\u00020\n`\u0012¢\u0006\u0004\b,\u0010\u0014J\u001f\u00100\u001a\u0004\u0018\u00010/2\u0006\u0010-\u001a\u00020\u00152\u0006\u0010.\u001a\u00020\u0015¢\u0006\u0004\b0\u00101R$\u00103\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\u0011j\b\u0012\u0004\u0012\u00020\u000e`\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u00102R$\u00105\u001a\u0012\u0012\u0004\u0012\u00020\n0\u0011j\b\u0012\u0004\u0012\u00020\n`\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00102R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u0006068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u00107R\u001d\u0010=\u001a\b\u0012\u0004\u0012\u00020\u0006098\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b:\u0010<R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020(068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u00107R\u0017\u0010?\u001a\b\u0012\u0004\u0012\u00020(098F¢\u0006\u0006\u001a\u0004\b4\u0010<¨\u0006@"}, d2 = {"Lx5/g;", "", "<init>", "()V", "Loa/F;", "k", "", "j", "()Z", "", "Lo4/s;", "filtersList", "l", "(Ljava/util/List;)V", "Lo4/o;", "recipeList", "m", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "h", "()Ljava/util/ArrayList;", "", "id", "g", "(I)Lo4/o;", "b", "recipe", "Lx5/d;", "ingredientType", "Lx5/c;", "a", "(Lo4/o;Lx5/d;)Ljava/util/List;", "Lo4/w;", "setup", "Lcom/apptionlabs/meater_app/meatCutStructure/MeatModel;", "f", "(Lo4/w;)Lcom/apptionlabs/meater_app/meatCutStructure/MeatModel;", "", "onGoingRecipeId", "deviceId", "Lcom/apptionlabs/meater_app/v3protobuf/DeviceCookState;", "newState", "n", "(JJLcom/apptionlabs/meater_app/v3protobuf/DeviceCookState;)V", "d", "recipeId", "stepNumber", "", "i", "(II)Ljava/lang/String;", "Ljava/util/ArrayList;", "recipes", "c", "filters", "Landroidx/lifecycle/D;", "Landroidx/lifecycle/D;", "_flagRecipeListUpdated", "Landroidx/lifecycle/B;", "e", "Landroidx/lifecycle/B;", "()Landroidx/lifecycle/B;", "flagRecipeListUpdated", "_cookState", "cookState", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f52863a = new g();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final ArrayList<Recipe> recipes = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final ArrayList<RecipeFilter> filters = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final D<Boolean> _flagRecipeListUpdated;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final B<Boolean> flagRecipeListUpdated;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final D<DeviceCookState> _cookState;

    /* renamed from: g, reason: collision with root package name */
    public static final int f52869g;

    /* compiled from: RecipeManager.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f52870a;

        static {
            int[] iArr = new int[m.values().length];
            try {
                iArr[m.f46462E.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m.f46463F.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f52870a = iArr;
        }
    }

    static {
        D<Boolean> d10 = new D<>();
        _flagRecipeListUpdated = d10;
        flagRecipeListUpdated = d10;
        _cookState = new D<>();
        f52869g = 8;
    }

    private g() {
    }

    private final boolean j() {
        return x4.g.h().getResources().getBoolean(R.bool.is_tablet);
    }

    private final void k() {
        Iterator it = r.P0(recipes, j() ? 6 : 3).iterator();
        while (it.hasNext()) {
            String image = ((Recipe) it.next()).getImage();
            if (image != null) {
                com.bumptech.glide.b.t(x4.g.h()).v(image).g(AbstractC4137a.f46570c).S0();
            }
        }
    }

    public final List<PreparationItem> a(Recipe recipe, EnumC5059d ingredientType) {
        C3862t.g(recipe, "recipe");
        C3862t.g(ingredientType, "ingredientType");
        ArrayList arrayList = new ArrayList();
        if (recipe.getPreparation() != null) {
            Preparation preparation = recipe.getPreparation();
            C3862t.d(preparation);
            if (preparation.a() != null) {
                Preparation preparation2 = recipe.getPreparation();
                List<PreparationItem> listA = preparation2 != null ? preparation2.a() : null;
                C3862t.d(listA);
                int i10 = 0;
                int i11 = 100;
                for (PreparationItem preparationItem : listA) {
                    EnumC5059d enumC5059d = EnumC5059d.f52830D;
                    int i12 = a.f52870a[preparationItem.getType().ordinal()];
                    EnumC5059d enumC5059d2 = i12 != 1 ? i12 != 2 ? enumC5059d : EnumC5059d.f52832F : EnumC5059d.f52831E;
                    if (enumC5059d2 == ingredientType) {
                        int i13 = i11 + 1;
                        arrayList.add(new PreparationItem(enumC5059d, preparationItem.getTitle(), null, null, null, false, false, i10, i11, preparationItem.a().size(), 124, null));
                        int i14 = i10 + 1;
                        for (PreparationSubItem preparationSubItem : preparationItem.a()) {
                            arrayList.add(new PreparationItem(enumC5059d2, preparationSubItem.getName(), preparationSubItem.getInformation(), preparationSubItem.getLink(), null, false, false, i14, i13, preparationItem.a().size(), 112, null));
                            i14++;
                        }
                        i10 = i14;
                        i11 = i13;
                    }
                }
            }
        }
        return arrayList;
    }

    public final Recipe b(int id2) {
        Object next;
        Iterator<T> it = recipes.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (id2 == ((Recipe) next).getId()) {
                break;
            }
        }
        return (Recipe) next;
    }

    public final B<DeviceCookState> c() {
        return _cookState;
    }

    public final ArrayList<RecipeFilter> d() {
        return filters;
    }

    public final B<Boolean> e() {
        return flagRecipeListUpdated;
    }

    public final MeatModel f(Setup setup) {
        Object obj;
        Object next;
        ArrayList<Meat> arrayList;
        Object next2;
        ArrayList<MeatCutType> arrayList2;
        Object next3;
        ArrayList<SearchableMeatCut> arrayList3;
        C3862t.g(setup, "setup");
        ArrayList<MeatCategory> categories = MeatCutsHelper.getInstance().getMeatCuts().categories;
        C3862t.f(categories, "categories");
        Iterator<T> it = categories.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (n.t(((MeatCategory) next).name, setup.getCategory(), true)) {
                break;
            }
        }
        MeatCategory meatCategory = (MeatCategory) next;
        if (meatCategory == null || (arrayList = meatCategory.meats) == null) {
            return null;
        }
        Iterator<T> it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (n.t(((Meat) next2).name, setup.getAnimal(), true)) {
                break;
            }
        }
        Meat meat = (Meat) next2;
        if (meat == null || (arrayList2 = meat.cutTypes) == null) {
            return null;
        }
        Iterator<T> it3 = arrayList2.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it3.next();
            if (n.t(((MeatCutType) next3).name, setup.getCutType(), true)) {
                break;
            }
        }
        MeatCutType meatCutType = (MeatCutType) next3;
        if (meatCutType == null || (arrayList3 = meatCutType.cuts) == null) {
            return null;
        }
        Iterator<T> it4 = arrayList3.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            Object next4 = it4.next();
            if (n.t(((SearchableMeatCut) next4).name, setup.getCut(), true)) {
                obj = next4;
                break;
            }
        }
        return (SearchableMeatCut) obj;
    }

    public final Recipe g(int id2) {
        Object next;
        Iterator<T> it = recipes.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (id2 == ((Recipe) next).getId()) {
                break;
            }
        }
        return (Recipe) next;
    }

    public final ArrayList<Recipe> h() {
        return recipes;
    }

    public final String i(int recipeId, int stepNumber) {
        Recipe recipeB = b(recipeId);
        if (recipeB != null) {
            return stepNumber < recipeB.n().size() ? recipeB.n().get(stepNumber).getTitle() : "";
        }
        return null;
    }

    public final void l(List<RecipeFilter> filtersList) {
        C3862t.g(filtersList, "filtersList");
        ArrayList<RecipeFilter> arrayList = filters;
        arrayList.clear();
        String string = x4.g.h().getString(R.string.all);
        C3862t.f(string, "getString(...)");
        arrayList.add(new RecipeFilter("all", string));
        Iterator<RecipeFilter> it = filtersList.iterator();
        while (it.hasNext()) {
            filters.add(it.next());
        }
    }

    public final void m(List<Recipe> recipeList) {
        C3862t.g(recipeList, "recipeList");
        recipes.clear();
        for (Recipe recipe : recipeList) {
            ArrayList<Recipe> arrayList = recipes;
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator<T> it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((Recipe) it.next()).getId() == recipe.getId()) {
                        break;
                    }
                }
            }
            recipes.add(recipe);
        }
        k();
        _flagRecipeListUpdated.l(Boolean.TRUE);
    }

    public final void n(long onGoingRecipeId, long deviceId, DeviceCookState newState) {
        C3862t.g(newState, "newState");
        K4.b bVarE = K4.a.f8678a.e(onGoingRecipeId);
        if (bVarE == null || bVarE.getProbeId() != deviceId) {
            return;
        }
        D<DeviceCookState> d10 = _cookState;
        if (d10.e() != newState) {
            U4.b.t("(RecipeManager) Cook State Change | " + d10.e() + " to -> " + newState, new Object[0]);
            d10.l(newState);
        }
    }
}
