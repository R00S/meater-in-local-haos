package o4;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: PreparationSubItem.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0014\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0013\u0010\t¨\u0006\u0015"}, d2 = {"Lo4/n;", "", "", "information", "name", "link", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: o4.n, reason: from toString */
/* loaded from: classes.dex */
public final /* data */ class PreparationSubItem {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String information;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String link;

    public PreparationSubItem(String str, String name, String str2) {
        C3862t.g(name, "name");
        this.information = str;
        this.name = name;
        this.link = str2;
    }

    /* renamed from: a, reason: from getter */
    public final String getInformation() {
        return this.information;
    }

    /* renamed from: b, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    /* renamed from: c, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreparationSubItem)) {
            return false;
        }
        PreparationSubItem preparationSubItem = (PreparationSubItem) other;
        return C3862t.b(this.information, preparationSubItem.information) && C3862t.b(this.name, preparationSubItem.name) && C3862t.b(this.link, preparationSubItem.link);
    }

    public int hashCode() {
        String str = this.information;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.name.hashCode()) * 31;
        String str2 = this.link;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "PreparationSubItem(information=" + this.information + ", name=" + this.name + ", link=" + this.link + ")";
    }
}
