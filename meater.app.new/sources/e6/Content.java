package e6;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import o4.EnumC4125A;
import o4.StepContent;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0018"}, d2 = {"Le6/d;", "", "Lo4/y;", "a", "()Lo4/y;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Le6/i;", "Le6/i;", "getMeta", "()Le6/i;", "meta", "b", "Ljava/lang/String;", "getType", "type", "network_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: e6.d, reason: case insensitive filesystem and from toString */
/* loaded from: classes2.dex */
public final /* data */ class Content {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("meta")
    private final MetaX meta;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("type")
    private final String type;

    public final StepContent a() {
        EnumC4125A enumC4125AA = EnumC4125A.INSTANCE.a(this.type);
        MetaX metaX = this.meta;
        return new StepContent(enumC4125AA, metaX != null ? metaX.a() : null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Content)) {
            return false;
        }
        Content content = (Content) other;
        return C3862t.b(this.meta, content.meta) && C3862t.b(this.type, content.type);
    }

    public int hashCode() {
        MetaX metaX = this.meta;
        return ((metaX == null ? 0 : metaX.hashCode()) * 31) + this.type.hashCode();
    }

    public String toString() {
        return "Content(meta=" + this.meta + ", type=" + this.type + ")";
    }
}
