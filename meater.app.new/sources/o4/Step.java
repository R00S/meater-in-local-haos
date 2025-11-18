package o4;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: Step.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0016\u0010\u001bR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0019\u0010\u001eR\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b\u001f\u0010\u001eR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010 \u001a\u0004\b\u001c\u0010!¨\u0006\""}, d2 = {"Lo4/x;", "", "", "title", "", "estimatedDurationMinutes", "", "Lo4/h;", "onCompleteAction", "Lo4/y;", "stepContent", "", "optional", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "c", "Ljava/util/List;", "()Ljava/util/List;", "d", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: o4.x, reason: from toString */
/* loaded from: classes.dex */
public final /* data */ class Step {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer estimatedDurationMinutes;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<OnCompleteAction> onCompleteAction;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<StepContent> stepContent;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean optional;

    public Step(String str, Integer num, List<OnCompleteAction> list, List<StepContent> list2, Boolean bool) {
        this.title = str;
        this.estimatedDurationMinutes = num;
        this.onCompleteAction = list;
        this.stepContent = list2;
        this.optional = bool;
    }

    /* renamed from: a, reason: from getter */
    public final Integer getEstimatedDurationMinutes() {
        return this.estimatedDurationMinutes;
    }

    public final List<OnCompleteAction> b() {
        return this.onCompleteAction;
    }

    /* renamed from: c, reason: from getter */
    public final Boolean getOptional() {
        return this.optional;
    }

    public final List<StepContent> d() {
        return this.stepContent;
    }

    /* renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Step)) {
            return false;
        }
        Step step = (Step) other;
        return C3862t.b(this.title, step.title) && C3862t.b(this.estimatedDurationMinutes, step.estimatedDurationMinutes) && C3862t.b(this.onCompleteAction, step.onCompleteAction) && C3862t.b(this.stepContent, step.stepContent) && C3862t.b(this.optional, step.optional);
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.estimatedDurationMinutes;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<OnCompleteAction> list = this.onCompleteAction;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<StepContent> list2 = this.stepContent;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.optional;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "Step(title=" + this.title + ", estimatedDurationMinutes=" + this.estimatedDurationMinutes + ", onCompleteAction=" + this.onCompleteAction + ", stepContent=" + this.stepContent + ", optional=" + this.optional + ")";
    }
}
