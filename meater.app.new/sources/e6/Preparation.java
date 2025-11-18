package e6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0019"}, d2 = {"Le6/k;", "", "Lo4/k;", "a", "()Lo4/k;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "Le6/f;", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "items", "b", "Ljava/lang/String;", "getVideo", "video", "network_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: e6.k, reason: from toString */
/* loaded from: classes2.dex */
public final /* data */ class Preparation {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("items")
    private final List<Item> items;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("video")
    private final String video;

    public final o4.Preparation a() {
        List<Item> list = this.items;
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Item) it.next()).a());
        }
        return new o4.Preparation(arrayList, this.video, null, 4, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Preparation)) {
            return false;
        }
        Preparation preparation = (Preparation) other;
        return C3862t.b(this.items, preparation.items) && C3862t.b(this.video, preparation.video);
    }

    public int hashCode() {
        return (this.items.hashCode() * 31) + this.video.hashCode();
    }

    public String toString() {
        return "Preparation(items=" + this.items + ", video=" + this.video + ")";
    }
}
