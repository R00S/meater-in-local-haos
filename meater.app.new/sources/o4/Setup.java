package o4;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: Setup.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u0013R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u001e\u0010\u0013R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b\u001f\u0010\u0013R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b \u0010\u0013R$\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001d\u001a\u0004\b!\u0010\u0013\"\u0004\b\"\u0010#R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&¨\u0006'"}, d2 = {"Lo4/w;", "", "", "Lo4/a;", "alerts", "", "animal", "category", "cut", "cutType", "recommendedTemperature", "", "secondsDelayBeforeReady", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "", "h", "()Z", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Ljava/lang/String;", "c", "d", "e", "f", "setRecommendedTemperature", "(Ljava/lang/String;)V", "g", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: o4.w, reason: from toString */
/* loaded from: classes.dex */
public final /* data */ class Setup {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Alert> alerts;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String animal;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String category;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cut;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cutType;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private String recommendedTemperature;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer secondsDelayBeforeReady;

    public Setup(List<Alert> list, String str, String str2, String str3, String str4, String str5, Integer num) {
        this.alerts = list;
        this.animal = str;
        this.category = str2;
        this.cut = str3;
        this.cutType = str4;
        this.recommendedTemperature = str5;
        this.secondsDelayBeforeReady = num;
    }

    public final List<Alert> a() {
        return this.alerts;
    }

    /* renamed from: b, reason: from getter */
    public final String getAnimal() {
        return this.animal;
    }

    /* renamed from: c, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* renamed from: d, reason: from getter */
    public final String getCut() {
        return this.cut;
    }

    /* renamed from: e, reason: from getter */
    public final String getCutType() {
        return this.cutType;
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

    /* renamed from: f, reason: from getter */
    public final String getRecommendedTemperature() {
        return this.recommendedTemperature;
    }

    /* renamed from: g, reason: from getter */
    public final Integer getSecondsDelayBeforeReady() {
        return this.secondsDelayBeforeReady;
    }

    public final boolean h() {
        return (this.animal == null || this.category == null || this.cut == null || this.cutType == null || this.recommendedTemperature == null) ? false : true;
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
