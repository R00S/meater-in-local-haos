package e6;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import o4.RecipeFilter;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0007R\u001a\u0010\u0014\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0007¨\u0006\u0015"}, d2 = {"Le6/n;", "", "Lo4/s;", "a", "()Lo4/s;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTag", "tag", "b", "getLocalizedName", "localizedName", "network_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: e6.n, reason: from toString */
/* loaded from: classes2.dex */
public final /* data */ class RecipeFilterRemote {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("tag")
    private final String tag;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("localizedName")
    private final String localizedName;

    public final RecipeFilter a() {
        return new RecipeFilter(this.tag, this.localizedName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecipeFilterRemote)) {
            return false;
        }
        RecipeFilterRemote recipeFilterRemote = (RecipeFilterRemote) other;
        return C3862t.b(this.tag, recipeFilterRemote.tag) && C3862t.b(this.localizedName, recipeFilterRemote.localizedName);
    }

    public int hashCode() {
        return (this.tag.hashCode() * 31) + this.localizedName.hashCode();
    }

    public String toString() {
        return "RecipeFilterRemote(tag=" + this.tag + ", localizedName=" + this.localizedName + ")";
    }
}
