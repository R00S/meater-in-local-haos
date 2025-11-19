package e6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import o4.Description;
import o4.Preparation;
import o4.Recipe;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b'\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\nR\u001a\u0010\u0014\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\nR\u001a\u0010\u0018\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007R\u001a\u0010\u001b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0007R\u001a\u0010\u001e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0007R\u001a\u0010!\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u0007R\u001c\u0010$\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0016\u001a\u0004\b#\u0010\u0007R\u001c\u0010'\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010\u0007R\u001a\u0010*\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u000f\u001a\u0004\b)\u0010\nR\u001a\u0010-\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u0016\u001a\u0004\b,\u0010\u0007R\u001a\u00100\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010\u0016\u001a\u0004\b/\u0010\u0007R\u001a\u00103\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\u0016\u001a\u0004\b2\u0010\u0007R \u00109\u001a\b\u0012\u0004\u0012\u00020\u0005048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001a\u0010?\u001a\u00020:8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010E\u001a\u00020@8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR \u0010I\u001a\b\u0012\u0004\u0012\u00020F048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bG\u00106\u001a\u0004\bH\u00108¨\u0006J"}, d2 = {"Le6/o;", "", "Lo4/o;", "a", "()Lo4/o;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "id", "b", "getSchemaVersion", "schemaVersion", "c", "Ljava/lang/String;", "getTitle", "title", "d", "getFirstPublishedAt", "firstPublishedAt", "e", "getSlug", "slug", "f", "getShortTitle", "shortTitle", "g", "getSubtitle", "subtitle", "h", "getCookName", "cookName", "i", "getLikes", "likes", "j", "getImage", "image", "k", "getVideo", "video", "l", "getAppliance", "appliance", "", "m", "Ljava/util/List;", "getTags", "()Ljava/util/List;", "tags", "Le6/e;", "n", "Le6/e;", "getDescription", "()Le6/e;", "description", "Le6/k;", "o", "Le6/k;", "getPreparation", "()Le6/k;", "preparation", "Le6/r;", "p", "getSteps", "steps", "network_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: e6.o, reason: from toString */
/* loaded from: classes2.dex */
public final /* data */ class RecipeItem {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("id")
    private final int id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("schema_version")
    private final int schemaVersion;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("title")
    private final String title;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("first_published_at")
    private final String firstPublishedAt;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("slug")
    private final String slug;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("short_title")
    private final String shortTitle;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("subtitle")
    private final String subtitle;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("cook_name")
    private final String cookName;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("likes")
    private final int likes;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("image")
    private final String image;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("video")
    private final String video;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("appliance")
    private final String appliance;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("tags")
    private final List<String> tags;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("description")
    private final Description description;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("preparation")
    private final Preparation preparation;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("steps")
    private final List<Step> steps;

    public final Recipe a() {
        int i10 = this.id;
        int i11 = this.schemaVersion;
        String str = this.title;
        String str2 = this.firstPublishedAt;
        String str3 = this.slug;
        String str4 = this.shortTitle;
        String str5 = this.subtitle;
        String str6 = this.cookName;
        int i12 = this.likes;
        String str7 = this.image;
        String str8 = this.video;
        o4.r rVarA = o4.r.INSTANCE.a(this.appliance);
        List<String> list = this.tags;
        Description descriptionA = this.description.a();
        Preparation preparationA = this.preparation.a();
        List<Step> list2 = this.steps;
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((Step) it.next()).a());
        }
        return new Recipe(i10, i11, str, str4, str6, str2, str3, str5, i12, str7, str8, rVarA, list, descriptionA, preparationA, arrayList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecipeItem)) {
            return false;
        }
        RecipeItem recipeItem = (RecipeItem) other;
        return this.id == recipeItem.id && this.schemaVersion == recipeItem.schemaVersion && C3862t.b(this.title, recipeItem.title) && C3862t.b(this.firstPublishedAt, recipeItem.firstPublishedAt) && C3862t.b(this.slug, recipeItem.slug) && C3862t.b(this.shortTitle, recipeItem.shortTitle) && C3862t.b(this.subtitle, recipeItem.subtitle) && C3862t.b(this.cookName, recipeItem.cookName) && this.likes == recipeItem.likes && C3862t.b(this.image, recipeItem.image) && C3862t.b(this.video, recipeItem.video) && C3862t.b(this.appliance, recipeItem.appliance) && C3862t.b(this.tags, recipeItem.tags) && C3862t.b(this.description, recipeItem.description) && C3862t.b(this.preparation, recipeItem.preparation) && C3862t.b(this.steps, recipeItem.steps);
    }

    public int hashCode() {
        int iHashCode = ((((((((((Integer.hashCode(this.id) * 31) + Integer.hashCode(this.schemaVersion)) * 31) + this.title.hashCode()) * 31) + this.firstPublishedAt.hashCode()) * 31) + this.slug.hashCode()) * 31) + this.shortTitle.hashCode()) * 31;
        String str = this.subtitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.cookName;
        return ((((((((((((((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.likes)) * 31) + this.image.hashCode()) * 31) + this.video.hashCode()) * 31) + this.appliance.hashCode()) * 31) + this.tags.hashCode()) * 31) + this.description.hashCode()) * 31) + this.preparation.hashCode()) * 31) + this.steps.hashCode();
    }

    public String toString() {
        return "RecipeItem(id=" + this.id + ", schemaVersion=" + this.schemaVersion + ", title=" + this.title + ", firstPublishedAt=" + this.firstPublishedAt + ", slug=" + this.slug + ", shortTitle=" + this.shortTitle + ", subtitle=" + this.subtitle + ", cookName=" + this.cookName + ", likes=" + this.likes + ", image=" + this.image + ", video=" + this.video + ", appliance=" + this.appliance + ", tags=" + this.tags + ", description=" + this.description + ", preparation=" + this.preparation + ", steps=" + this.steps + ")";
    }
}
