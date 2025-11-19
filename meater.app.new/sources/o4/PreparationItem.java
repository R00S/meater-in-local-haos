package o4;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: PreparationItem.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, d2 = {"Lo4/l;", "", "", "Lo4/n;", "preparationSubItems", "", "title", "Lo4/m;", "type", "<init>", "(Ljava/util/List;Ljava/lang/String;Lo4/m;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Ljava/lang/String;", "c", "Lo4/m;", "()Lo4/m;", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: o4.l, reason: from toString */
/* loaded from: classes.dex */
public final /* data */ class PreparationItem {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<PreparationSubItem> preparationSubItems;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final m type;

    public PreparationItem(List<PreparationSubItem> preparationSubItems, String title, m type) {
        C3862t.g(preparationSubItems, "preparationSubItems");
        C3862t.g(title, "title");
        C3862t.g(type, "type");
        this.preparationSubItems = preparationSubItems;
        this.title = title;
        this.type = type;
    }

    public final List<PreparationSubItem> a() {
        return this.preparationSubItems;
    }

    /* renamed from: b, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: c, reason: from getter */
    public final m getType() {
        return this.type;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreparationItem)) {
            return false;
        }
        PreparationItem preparationItem = (PreparationItem) other;
        return C3862t.b(this.preparationSubItems, preparationItem.preparationSubItems) && C3862t.b(this.title, preparationItem.title) && this.type == preparationItem.type;
    }

    public int hashCode() {
        return (((this.preparationSubItems.hashCode() * 31) + this.title.hashCode()) * 31) + this.type.hashCode();
    }

    public String toString() {
        return "PreparationItem(preparationSubItems=" + this.preparationSubItems + ", title=" + this.title + ", type=" + this.type + ")";
    }
}
