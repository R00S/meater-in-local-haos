package e6;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import o4.PreparationSubItem;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0007R\u001a\u0010\u0014\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0007R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0018"}, d2 = {"Le6/g;", "", "Lo4/n;", "a", "()Lo4/n;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getInformation", "information", "b", "getName", "name", "c", "getLink", "link", "network_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: e6.g, reason: case insensitive filesystem and from toString */
/* loaded from: classes2.dex */
public final /* data */ class ItemX {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("information")
    private final String information;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("name")
    private final String name;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("link")
    private final String link;

    public final PreparationSubItem a() {
        return new PreparationSubItem(this.information, this.name, this.link);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ItemX)) {
            return false;
        }
        ItemX itemX = (ItemX) other;
        return C3862t.b(this.information, itemX.information) && C3862t.b(this.name, itemX.name) && C3862t.b(this.link, itemX.link);
    }

    public int hashCode() {
        String str = this.information;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.name.hashCode()) * 31;
        String str2 = this.link;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "ItemX(information=" + this.information + ", name=" + this.name + ", link=" + this.link + ")";
    }
}
