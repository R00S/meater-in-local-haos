package o4;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: Recipe.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b'\b\u0086\b\u0018\u00002\u00020\u0001B¡\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0011¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010 \u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0005¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b&\u0010#J\u0010\u0010'\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b'\u0010#J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010%J\u001a\u0010*\u001a\u00020\u001f2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010,\u001a\u0004\b-\u0010%R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010,\u001a\u0004\b.\u0010%R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010#R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b2\u00100\u001a\u0004\b3\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b4\u00100\u001a\u0004\b2\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b5\u00100\u001a\u0004\b5\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b-\u00100\u001a\u0004\b6\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b7\u00100\u001a\u0004\b8\u0010#R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010,\u001a\u0004\b9\u0010%R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b:\u00100\u001a\u0004\b7\u0010#R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b3\u00100\u001a\u0004\b;\u0010#R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\"\u0010<\u001a\u0004\b/\u0010=R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118\u0006¢\u0006\f\n\u0004\b6\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\b4\u0010CR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b8\u0010D\u001a\u0004\b:\u0010ER\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00118\u0006¢\u0006\f\n\u0004\b?\u0010>\u001a\u0004\bA\u0010@¨\u0006F"}, d2 = {"Lo4/o;", "", "", "id", "schemaVersion", "", "title", "shortTitle", "cookName", "firstPublishedAt", "slug", "subtitle", "likes", "image", "video", "Lo4/r;", "appliance", "", "tags", "Lo4/d;", "description", "Lo4/k;", "preparation", "Lo4/x;", "steps", "<init>", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lo4/r;Ljava/util/List;Lo4/d;Lo4/k;Ljava/util/List;)V", "Lo4/A;", "contentType", "i", "(Lo4/A;)I", "", "s", "()Z", "l", "()Ljava/lang/String;", "a", "()I", "b", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "I", "g", "getSchemaVersion", "c", "Ljava/lang/String;", "q", "d", "k", "e", "f", "m", "h", "o", "getLikes", "j", "r", "Lo4/r;", "()Lo4/r;", "Ljava/util/List;", "p", "()Ljava/util/List;", "n", "Lo4/d;", "()Lo4/d;", "Lo4/k;", "()Lo4/k;", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: o4.o, reason: from toString */
/* loaded from: classes.dex */
public final /* data */ class Recipe {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int schemaVersion;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String shortTitle;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cookName;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String firstPublishedAt;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String slug;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String subtitle;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final int likes;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String image;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final String video;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final r appliance;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> tags;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final Description description;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final Preparation preparation;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Step> steps;

    public Recipe(int i10, int i11, String title, String shortTitle, String str, String str2, String str3, String str4, int i12, String str5, String str6, r appliance, List<String> tags, Description description, Preparation preparation, List<Step> steps) {
        C3862t.g(title, "title");
        C3862t.g(shortTitle, "shortTitle");
        C3862t.g(appliance, "appliance");
        C3862t.g(tags, "tags");
        C3862t.g(description, "description");
        C3862t.g(steps, "steps");
        this.id = i10;
        this.schemaVersion = i11;
        this.title = title;
        this.shortTitle = shortTitle;
        this.cookName = str;
        this.firstPublishedAt = str2;
        this.slug = str3;
        this.subtitle = str4;
        this.likes = i12;
        this.image = str5;
        this.video = str6;
        this.appliance = appliance;
        this.tags = tags;
        this.description = description;
        this.preparation = preparation;
        this.steps = steps;
    }

    private final int i(EnumC4125A contentType) {
        int i10 = 0;
        for (Object obj : this.steps) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                kotlin.collections.r.w();
            }
            List<StepContent> listD = ((Step) obj).d();
            if (listD != null) {
                Iterator<T> it = listD.iterator();
                while (it.hasNext()) {
                    if (((StepContent) it.next()).getType() == contentType) {
                        return i10;
                    }
                }
            }
            i10 = i11;
        }
        return -1;
    }

    /* renamed from: a, reason: from getter */
    public final int getSchemaVersion() {
        return this.schemaVersion;
    }

    /* renamed from: b, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: c, reason: from getter */
    public final r getAppliance() {
        return this.appliance;
    }

    /* renamed from: d, reason: from getter */
    public final String getCookName() {
        return this.cookName;
    }

    /* renamed from: e, reason: from getter */
    public final Description getDescription() {
        return this.description;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Recipe)) {
            return false;
        }
        Recipe recipe = (Recipe) other;
        return this.id == recipe.id && this.schemaVersion == recipe.schemaVersion && C3862t.b(this.title, recipe.title) && C3862t.b(this.shortTitle, recipe.shortTitle) && C3862t.b(this.cookName, recipe.cookName) && C3862t.b(this.firstPublishedAt, recipe.firstPublishedAt) && C3862t.b(this.slug, recipe.slug) && C3862t.b(this.subtitle, recipe.subtitle) && this.likes == recipe.likes && C3862t.b(this.image, recipe.image) && C3862t.b(this.video, recipe.video) && this.appliance == recipe.appliance && C3862t.b(this.tags, recipe.tags) && C3862t.b(this.description, recipe.description) && C3862t.b(this.preparation, recipe.preparation) && C3862t.b(this.steps, recipe.steps);
    }

    /* renamed from: f, reason: from getter */
    public final String getFirstPublishedAt() {
        return this.firstPublishedAt;
    }

    /* renamed from: g, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: h, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    public int hashCode() {
        int iHashCode = ((((((Integer.hashCode(this.id) * 31) + Integer.hashCode(this.schemaVersion)) * 31) + this.title.hashCode()) * 31) + this.shortTitle.hashCode()) * 31;
        String str = this.cookName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.firstPublishedAt;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.slug;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.subtitle;
        int iHashCode5 = (((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + Integer.hashCode(this.likes)) * 31;
        String str5 = this.image;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.video;
        int iHashCode7 = (((((((iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.appliance.hashCode()) * 31) + this.tags.hashCode()) * 31) + this.description.hashCode()) * 31;
        Preparation preparation = this.preparation;
        return ((iHashCode7 + (preparation != null ? preparation.hashCode() : 0)) * 31) + this.steps.hashCode();
    }

    /* renamed from: j, reason: from getter */
    public final Preparation getPreparation() {
        return this.preparation;
    }

    /* renamed from: k, reason: from getter */
    public final String getShortTitle() {
        return this.shortTitle;
    }

    public final String l() {
        if (this.shortTitle.length() <= 30) {
            return this.shortTitle;
        }
        String strSubstring = this.shortTitle.substring(0, 30);
        C3862t.f(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: m, reason: from getter */
    public final String getSlug() {
        return this.slug;
    }

    public final List<Step> n() {
        return this.steps;
    }

    /* renamed from: o, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public final List<String> p() {
        return this.tags;
    }

    public final String q() {
        return this.title;
    }

    /* renamed from: r, reason: from getter */
    public final String getVideo() {
        return this.video;
    }

    public final boolean s() {
        Object next;
        Setup setup;
        boolean zH = true;
        for (Step step : this.steps) {
            if (step.d() != null) {
                Iterator<T> it = step.d().iterator();
                while (it.hasNext()) {
                    StepContentMeta meta = ((StepContent) it.next()).getMeta();
                    if (meta != null && (setup = meta.getSetup()) != null) {
                        zH = setup.h();
                    }
                }
            }
        }
        if (!zH) {
            return false;
        }
        Iterator<T> it2 = this.tags.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (C3862t.b((String) next, "sauce")) {
                break;
            }
        }
        if (((String) next) != null) {
            return zH;
        }
        int i10 = i(EnumC4125A.f46416M);
        int i11 = i(EnumC4125A.f46417N);
        if ((i10 != -1 || i11 <= -1) && ((i10 <= -1 || i11 != -1) && this.appliance != r.f46513D)) {
            return zH;
        }
        return false;
    }

    public String toString() {
        return "Recipe(id=" + this.id + ", schemaVersion=" + this.schemaVersion + ", title=" + this.title + ", shortTitle=" + this.shortTitle + ", cookName=" + this.cookName + ", firstPublishedAt=" + this.firstPublishedAt + ", slug=" + this.slug + ", subtitle=" + this.subtitle + ", likes=" + this.likes + ", image=" + this.image + ", video=" + this.video + ", appliance=" + this.appliance + ", tags=" + this.tags + ", description=" + this.description + ", preparation=" + this.preparation + ", steps=" + this.steps + ")";
    }
}
