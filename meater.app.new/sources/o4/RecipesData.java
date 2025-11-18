package o4;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: RecipesData.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u001c\b\u0002\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R6\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lo4/v;", "", "Ljava/util/ArrayList;", "Lo4/o;", "Lkotlin/collections/ArrayList;", "recipes", "<init>", "(Ljava/util/ArrayList;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/ArrayList;", "()Ljava/util/ArrayList;", "b", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: o4.v, reason: from toString */
/* loaded from: classes.dex */
public final /* data */ class RecipesData {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private ArrayList<Recipe> recipes;

    public RecipesData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final ArrayList<Recipe> a() {
        return this.recipes;
    }

    public final void b(ArrayList<Recipe> arrayList) {
        this.recipes = arrayList;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RecipesData) && C3862t.b(this.recipes, ((RecipesData) other).recipes);
    }

    public int hashCode() {
        ArrayList<Recipe> arrayList = this.recipes;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.hashCode();
    }

    public String toString() {
        return "RecipesData(recipes=" + this.recipes + ")";
    }

    public RecipesData(ArrayList<Recipe> arrayList) {
        this.recipes = arrayList;
    }

    public /* synthetic */ RecipesData(ArrayList arrayList, int i10, C3854k c3854k) {
        this((i10 & 1) != 0 ? null : arrayList);
    }
}
