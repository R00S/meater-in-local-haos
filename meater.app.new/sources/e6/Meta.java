package e6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Le6/h;", "", "Lo4/g;", "a", "()Lo4/g;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "isWrapped", "()Ljava/lang/Boolean;", "", "Le6/q;", "b", "Ljava/util/List;", "getSetupAlerts", "()Ljava/util/List;", "setupAlerts", "network_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: e6.h, reason: case insensitive filesystem and from toString */
/* loaded from: classes2.dex */
public final /* data */ class Meta {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("is_wrapped")
    private final Boolean isWrapped;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("setup_alerts")
    private final List<SetupAlert> setupAlerts;

    public final o4.Meta a() {
        ArrayList arrayList;
        Boolean bool = this.isWrapped;
        List<SetupAlert> list = this.setupAlerts;
        if (list != null) {
            arrayList = new ArrayList(kotlin.collections.r.x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((SetupAlert) it.next()).a());
            }
        } else {
            arrayList = null;
        }
        return new o4.Meta(bool, arrayList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Meta)) {
            return false;
        }
        Meta meta = (Meta) other;
        return C3862t.b(this.isWrapped, meta.isWrapped) && C3862t.b(this.setupAlerts, meta.setupAlerts);
    }

    public int hashCode() {
        Boolean bool = this.isWrapped;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        List<SetupAlert> list = this.setupAlerts;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "Meta(isWrapped=" + this.isWrapped + ", setupAlerts=" + this.setupAlerts + ")";
    }
}
