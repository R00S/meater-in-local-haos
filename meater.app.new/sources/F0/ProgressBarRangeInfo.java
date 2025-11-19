package F0;

import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: SemanticsProperties.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0013B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u000f¨\u0006\u001c"}, d2 = {"LF0/h;", "", "", "current", "LHa/b;", "range", "", "steps", "<init>", "(FLHa/b;I)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "F", "b", "()F", "LHa/b;", "c", "()LHa/b;", "I", "d", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: F0.h, reason: from toString */
/* loaded from: classes.dex */
public final class ProgressBarRangeInfo {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: e, reason: collision with root package name */
    private static final ProgressBarRangeInfo f4294e = new ProgressBarRangeInfo(0.0f, Ha.g.b(0.0f, 0.0f), 0, 4, null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final float current;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Ha.b<Float> range;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int steps;

    /* compiled from: SemanticsProperties.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LF0/h$a;", "", "<init>", "()V", "LF0/h;", "Indeterminate", "LF0/h;", "a", "()LF0/h;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: F0.h$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final ProgressBarRangeInfo a() {
            return ProgressBarRangeInfo.f4294e;
        }

        private Companion() {
        }
    }

    public ProgressBarRangeInfo(float f10, Ha.b<Float> bVar, int i10) {
        this.current = f10;
        this.range = bVar;
        this.steps = i10;
        if (Float.isNaN(f10)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    /* renamed from: b, reason: from getter */
    public final float getCurrent() {
        return this.current;
    }

    public final Ha.b<Float> c() {
        return this.range;
    }

    /* renamed from: d, reason: from getter */
    public final int getSteps() {
        return this.steps;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProgressBarRangeInfo)) {
            return false;
        }
        ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) other;
        return this.current == progressBarRangeInfo.current && C3862t.b(this.range, progressBarRangeInfo.range) && this.steps == progressBarRangeInfo.steps;
    }

    public int hashCode() {
        return (((Float.hashCode(this.current) * 31) + this.range.hashCode()) * 31) + this.steps;
    }

    public String toString() {
        return "ProgressBarRangeInfo(current=" + this.current + ", range=" + this.range + ", steps=" + this.steps + ')';
    }

    public /* synthetic */ ProgressBarRangeInfo(float f10, Ha.b bVar, int i10, int i11, C3854k c3854k) {
        this(f10, bVar, (i11 & 4) != 0 ? 0 : i10);
    }
}
