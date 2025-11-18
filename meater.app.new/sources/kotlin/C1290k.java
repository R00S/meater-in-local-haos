package kotlin;

import i0.C3602t0;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;

/* compiled from: Card.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\fJ\u001a\u0010\u000f\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"LK/k;", "", "Li0/t0;", "containerColor", "contentColor", "disabledContainerColor", "disabledContentColor", "<init>", "(JJJJLkotlin/jvm/internal/k;)V", "", "enabled", "a", "(Z)J", "b", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getContainerColor-0d7_KjU", "()J", "getContentColor-0d7_KjU", "c", "getDisabledContainerColor-0d7_KjU", "d", "getDisabledContentColor-0d7_KjU", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: K.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1290k {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long containerColor;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long contentColor;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long disabledContainerColor;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long disabledContentColor;

    public /* synthetic */ C1290k(long j10, long j11, long j12, long j13, C3854k c3854k) {
        this(j10, j11, j12, j13);
    }

    public final long a(boolean enabled) {
        return enabled ? this.containerColor : this.disabledContainerColor;
    }

    public final long b(boolean enabled) {
        return enabled ? this.contentColor : this.disabledContentColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof C1290k)) {
            return false;
        }
        C1290k c1290k = (C1290k) other;
        return C3602t0.m(this.containerColor, c1290k.containerColor) && C3602t0.m(this.contentColor, c1290k.contentColor) && C3602t0.m(this.disabledContainerColor, c1290k.disabledContainerColor) && C3602t0.m(this.disabledContentColor, c1290k.disabledContentColor);
    }

    public int hashCode() {
        return (((((C3602t0.s(this.containerColor) * 31) + C3602t0.s(this.contentColor)) * 31) + C3602t0.s(this.disabledContainerColor)) * 31) + C3602t0.s(this.disabledContentColor);
    }

    private C1290k(long j10, long j11, long j12, long j13) {
        this.containerColor = j10;
        this.contentColor = j11;
        this.disabledContainerColor = j12;
        this.disabledContentColor = j13;
    }
}
