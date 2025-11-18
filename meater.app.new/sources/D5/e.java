package D5;

import android.view.Y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import o4.Recipe;
import x5.EnumC5059d;
import x5.PreparationItem;

/* compiled from: RecipeSummaryFragmentViewModel.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0012J\u001b\u0010\u0016\u001a\u00020\u00152\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001f\u0010\u001eJ\u0015\u0010 \u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b \u0010!J!\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020\u00182\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"LD5/e;", "Landroidx/lifecycle/Y;", "LG5/a;", "preferences", "LI5/a;", "cacheManager", "<init>", "(LG5/a;LI5/a;)V", "Lo4/o;", "recipe", "", "Lx5/c;", "list", "h", "(Lo4/o;Ljava/util/List;)Ljava/util/List;", "k", "()LI5/a;", "l", "(Lo4/o;)Ljava/util/List;", "m", "preparationItems", "", "i", "(Ljava/util/List;)Z", "", "groupId", "", "title", "Loa/F;", "o", "(Lo4/o;ILjava/lang/String;)V", "n", "j", "(Lo4/o;)V", "recipeId", "LK4/b;", "p", "(ILo4/o;)LK4/b;", "b", "LG5/a;", "getPreferences", "()LG5/a;", "c", "LI5/a;", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class e extends Y {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final G5.a preferences;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final I5.a cacheManager;

    public e(G5.a preferences, I5.a cacheManager) {
        C3862t.g(preferences, "preferences");
        C3862t.g(cacheManager, "cacheManager");
        this.preferences = preferences;
        this.cacheManager = cacheManager;
    }

    private final List<PreparationItem> h(Recipe recipe, List<PreparationItem> list) {
        HashMap<Integer, ArrayList<String>> mapG = this.preferences.G(recipe.getId());
        for (Integer num : mapG.keySet()) {
            ArrayList<String> arrayList = mapG.get(num);
            C3862t.d(arrayList);
            Iterator<String> it = arrayList.iterator();
            C3862t.f(it, "iterator(...)");
            while (it.hasNext()) {
                String next = it.next();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list) {
                    int groupIndex = ((PreparationItem) obj).getGroupIndex();
                    if (num != null && groupIndex == num.intValue()) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : arrayList2) {
                    if (C3862t.b(((PreparationItem) obj2).getTitle(), next)) {
                        arrayList3.add(obj2);
                    }
                }
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    ((PreparationItem) it2.next()).i(true);
                }
            }
        }
        return list;
    }

    public final boolean i(List<PreparationItem> preparationItems) {
        C3862t.g(preparationItems, "preparationItems");
        ArrayList arrayList = new ArrayList();
        for (Object obj : preparationItems) {
            String information = ((PreparationItem) obj).getInformation();
            if (information == null || information.length() == 0) {
                arrayList.add(obj);
            }
        }
        return arrayList.size() == preparationItems.size();
    }

    public final void j(Recipe recipe) {
        C3862t.g(recipe, "recipe");
        this.preferences.b0(recipe.getId());
    }

    /* renamed from: k, reason: from getter */
    public final I5.a getCacheManager() {
        return this.cacheManager;
    }

    public final List<PreparationItem> l(Recipe recipe) {
        C3862t.g(recipe, "recipe");
        return h(recipe, x5.g.f52863a.a(recipe, EnumC5059d.f52831E));
    }

    public final List<PreparationItem> m(Recipe recipe) {
        C3862t.g(recipe, "recipe");
        return h(recipe, x5.g.f52863a.a(recipe, EnumC5059d.f52832F));
    }

    public final void n(Recipe recipe, int groupId, String title) {
        C3862t.g(recipe, "recipe");
        C3862t.g(title, "title");
        this.preferences.c0(recipe.getId(), groupId, title);
    }

    public final void o(Recipe recipe, int groupId, String title) {
        C3862t.g(recipe, "recipe");
        C3862t.g(title, "title");
        this.preferences.q0(recipe.getId(), groupId, title);
    }

    public final K4.b p(int recipeId, Recipe recipe) {
        K4.b bVarI = K4.a.f8678a.i(recipeId, recipe);
        U4.b.t("(RecipeSummaryFragmentViewModel) Recipe started : " + recipeId + " ID", new Object[0]);
        return bVarI;
    }
}
