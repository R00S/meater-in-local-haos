package o4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: Preparation.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\fR$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lo4/k;", "", "", "Lo4/l;", "preparationItems", "", "video", "", "ingredientsCount", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Ljava/lang/String;", "c", "Ljava/lang/Integer;", "getIngredientsCount", "()Ljava/lang/Integer;", "setIngredientsCount", "(Ljava/lang/Integer;)V", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: o4.k, reason: from toString */
/* loaded from: classes.dex */
public final /* data */ class Preparation {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<PreparationItem> preparationItems;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String video;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private Integer ingredientsCount;

    public Preparation(List<PreparationItem> list, String str, Integer num) {
        this.preparationItems = list;
        this.video = str;
        this.ingredientsCount = num;
    }

    public final List<PreparationItem> a() {
        return this.preparationItems;
    }

    /* renamed from: b, reason: from getter */
    public final String getVideo() {
        return this.video;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Preparation)) {
            return false;
        }
        Preparation preparation = (Preparation) other;
        return C3862t.b(this.preparationItems, preparation.preparationItems) && C3862t.b(this.video, preparation.video) && C3862t.b(this.ingredientsCount, preparation.ingredientsCount);
    }

    public int hashCode() {
        List<PreparationItem> list = this.preparationItems;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.video;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.ingredientsCount;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "Preparation(preparationItems=" + this.preparationItems + ", video=" + this.video + ", ingredientsCount=" + this.ingredientsCount + ")";
    }

    public /* synthetic */ Preparation(List list, String str, Integer num, int i10, C3854k c3854k) {
        if ((i10 & 4) != 0) {
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((PreparationItem) obj).getType() == m.f46462E) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    kotlin.collections.r.D(arrayList2, ((PreparationItem) it.next()).a());
                }
                num = Integer.valueOf(arrayList2.size());
            } else {
                num = null;
            }
        }
        this(list, str, num);
    }
}
