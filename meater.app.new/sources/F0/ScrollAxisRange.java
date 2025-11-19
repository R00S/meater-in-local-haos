package F0;

import kotlin.Metadata;

/* compiled from: SemanticsProperties.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\r\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LF0/j;", "", "Lkotlin/Function0;", "", "value", "maxValue", "", "reverseScrolling", "<init>", "(LBa/a;LBa/a;Z)V", "", "toString", "()Ljava/lang/String;", "a", "LBa/a;", "c", "()LBa/a;", "b", "Z", "()Z", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: F0.j, reason: from toString */
/* loaded from: classes.dex */
public final class ScrollAxisRange {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Ba.a<Float> value;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Ba.a<Float> maxValue;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean reverseScrolling;

    public ScrollAxisRange(Ba.a<Float> aVar, Ba.a<Float> aVar2, boolean z10) {
        this.value = aVar;
        this.maxValue = aVar2;
        this.reverseScrolling = z10;
    }

    public final Ba.a<Float> a() {
        return this.maxValue;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getReverseScrolling() {
        return this.reverseScrolling;
    }

    public final Ba.a<Float> c() {
        return this.value;
    }

    public String toString() {
        return "ScrollAxisRange(value=" + this.value.invoke().floatValue() + ", maxValue=" + this.maxValue.invoke().floatValue() + ", reverseScrolling=" + this.reverseScrolling + ')';
    }
}
