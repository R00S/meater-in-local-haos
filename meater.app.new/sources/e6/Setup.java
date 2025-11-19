package e6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0007R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0007R\u001c\u0010!\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u0007R\u001c\u0010$\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0016\u001a\u0004\b#\u0010\u0007R\u001c\u0010)\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Le6/p;", "", "Lo4/w;", "a", "()Lo4/w;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "Le6/a;", "Ljava/util/List;", "getAlerts", "()Ljava/util/List;", "alerts", "b", "Ljava/lang/String;", "getAnimal", "animal", "c", "getCategory", "category", "d", "getCut", "cut", "e", "getCutType", "cutType", "f", "getRecommendedTemperature", "recommendedTemperature", "g", "Ljava/lang/Integer;", "getSecondsDelayBeforeReady", "()Ljava/lang/Integer;", "secondsDelayBeforeReady", "network_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: e6.p, reason: from toString */
/* loaded from: classes2.dex */
public final /* data */ class Setup {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("alerts")
    private final List<Alert> alerts;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("animal")
    private final String animal;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("category")
    private final String category;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("cut")
    private final String cut;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("cut_type")
    private final String cutType;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("recommended_temperature")
    private final String recommendedTemperature;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("seconds_delay_before_ready")
    private final Integer secondsDelayBeforeReady;

    public final o4.Setup a() {
        ArrayList arrayList;
        List<Alert> list = this.alerts;
        if (list != null) {
            arrayList = new ArrayList(kotlin.collections.r.x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((Alert) it.next()).a());
            }
        } else {
            arrayList = null;
        }
        return new o4.Setup(arrayList, this.animal, this.category, this.cut, this.cutType, this.recommendedTemperature, this.secondsDelayBeforeReady);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Setup)) {
            return false;
        }
        Setup setup = (Setup) other;
        return C3862t.b(this.alerts, setup.alerts) && C3862t.b(this.animal, setup.animal) && C3862t.b(this.category, setup.category) && C3862t.b(this.cut, setup.cut) && C3862t.b(this.cutType, setup.cutType) && C3862t.b(this.recommendedTemperature, setup.recommendedTemperature) && C3862t.b(this.secondsDelayBeforeReady, setup.secondsDelayBeforeReady);
    }

    public int hashCode() {
        List<Alert> list = this.alerts;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.animal;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.category;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cut;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.cutType;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.recommendedTemperature;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.secondsDelayBeforeReady;
        return iHashCode6 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "Setup(alerts=" + this.alerts + ", animal=" + this.animal + ", category=" + this.category + ", cut=" + this.cut + ", cutType=" + this.cutType + ", recommendedTemperature=" + this.recommendedTemperature + ", secondsDelayBeforeReady=" + this.secondsDelayBeforeReady + ")";
    }
}
