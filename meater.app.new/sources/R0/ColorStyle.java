package R0;

import i0.AbstractC3582j0;
import i0.C3602t0;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;

/* compiled from: TextForegroundStyle.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00028VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"LR0/c;", "LR0/m;", "Li0/t0;", "value", "<init>", "(JLkotlin/jvm/internal/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "J", "getValue-0d7_KjU", "()J", "e", "color", "Li0/j0;", "h", "()Li0/j0;", "brush", "", "d", "()F", "alpha", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: R0.c, reason: from toString */
/* loaded from: classes.dex */
final /* data */ class ColorStyle implements m {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long value;

    public /* synthetic */ ColorStyle(long j10, C3854k c3854k) {
        this(j10);
    }

    @Override // R0.m
    public float d() {
        return C3602t0.n(getValue());
    }

    @Override // R0.m
    /* renamed from: e, reason: from getter */
    public long getValue() {
        return this.value;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ColorStyle) && C3602t0.m(this.value, ((ColorStyle) other).value);
    }

    @Override // R0.m
    public AbstractC3582j0 h() {
        return null;
    }

    public int hashCode() {
        return C3602t0.s(this.value);
    }

    public String toString() {
        return "ColorStyle(value=" + ((Object) C3602t0.t(this.value)) + ')';
    }

    private ColorStyle(long j10) {
        this.value = j10;
        if (j10 == 16) {
            throw new IllegalArgumentException("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
        }
    }
}
