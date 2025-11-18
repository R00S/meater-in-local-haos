package o4;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: StepContent.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0018\u001a\u0004\b\u0012\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lo4/y;", "", "Lo4/A;", "type", "Lo4/z;", "meta", "<init>", "(Lo4/A;Lo4/z;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lo4/A;", "b", "()Lo4/A;", "setType", "(Lo4/A;)V", "Lo4/z;", "()Lo4/z;", "c", "(Lo4/z;)V", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: o4.y, reason: from toString */
/* loaded from: classes.dex */
public final /* data */ class StepContent {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private EnumC4125A type;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private StepContentMeta meta;

    public StepContent(EnumC4125A type, StepContentMeta stepContentMeta) {
        C3862t.g(type, "type");
        this.type = type;
        this.meta = stepContentMeta;
    }

    /* renamed from: a, reason: from getter */
    public final StepContentMeta getMeta() {
        return this.meta;
    }

    /* renamed from: b, reason: from getter */
    public final EnumC4125A getType() {
        return this.type;
    }

    public final void c(StepContentMeta stepContentMeta) {
        this.meta = stepContentMeta;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StepContent)) {
            return false;
        }
        StepContent stepContent = (StepContent) other;
        return this.type == stepContent.type && C3862t.b(this.meta, stepContent.meta);
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        StepContentMeta stepContentMeta = this.meta;
        return iHashCode + (stepContentMeta == null ? 0 : stepContentMeta.hashCode());
    }

    public String toString() {
        return "StepContent(type=" + this.type + ", meta=" + this.meta + ")";
    }
}
