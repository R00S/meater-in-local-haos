package e6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u001a\u0010\u001c\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001c\u0010!\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010%\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0007¨\u0006&"}, d2 = {"Le6/r;", "", "Lo4/x;", "a", "()Lo4/x;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "Le6/c;", "Ljava/util/List;", "getComplete", "()Ljava/util/List;", "complete", "Le6/d;", "b", "getContent", "content", "c", "I", "getEstimatedDurationMinutes", "estimatedDurationMinutes", "d", "Ljava/lang/Boolean;", "getOptional", "()Ljava/lang/Boolean;", "optional", "e", "Ljava/lang/String;", "getTitle", "title", "network_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: e6.r, reason: from toString */
/* loaded from: classes2.dex */
public final /* data */ class Step {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("complete")
    private final List<Complete> complete;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("content")
    private final List<Content> content;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("estimated_duration_minutes")
    private final int estimatedDurationMinutes;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("optional")
    private final Boolean optional;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("title")
    private final String title;

    public final o4.Step a() {
        ArrayList arrayList;
        String str = this.title;
        Boolean bool = this.optional;
        int i10 = this.estimatedDurationMinutes;
        List<Complete> list = this.complete;
        if (list != null) {
            arrayList = new ArrayList(kotlin.collections.r.x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((Complete) it.next()).a());
            }
        } else {
            arrayList = null;
        }
        List<Content> list2 = this.content;
        ArrayList arrayList2 = new ArrayList(kotlin.collections.r.x(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((Content) it2.next()).a());
        }
        return new o4.Step(str, Integer.valueOf(i10), arrayList, arrayList2, bool);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Step)) {
            return false;
        }
        Step step = (Step) other;
        return C3862t.b(this.complete, step.complete) && C3862t.b(this.content, step.content) && this.estimatedDurationMinutes == step.estimatedDurationMinutes && C3862t.b(this.optional, step.optional) && C3862t.b(this.title, step.title);
    }

    public int hashCode() {
        List<Complete> list = this.complete;
        int iHashCode = (((((list == null ? 0 : list.hashCode()) * 31) + this.content.hashCode()) * 31) + Integer.hashCode(this.estimatedDurationMinutes)) * 31;
        Boolean bool = this.optional;
        return ((iHashCode + (bool != null ? bool.hashCode() : 0)) * 31) + this.title.hashCode();
    }

    public String toString() {
        return "Step(complete=" + this.complete + ", content=" + this.content + ", estimatedDurationMinutes=" + this.estimatedDurationMinutes + ", optional=" + this.optional + ", title=" + this.title + ")";
    }
}
