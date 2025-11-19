package kotlin;

import i0.C3602t0;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;

/* compiled from: Menu.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u000eJ\u001d\u0010\u0010\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u000f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0010\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u001d\u0010\b\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u0019\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"LK/F;", "", "Li0/t0;", "textColor", "leadingIconColor", "trailingIconColor", "disabledTextColor", "disabledLeadingIconColor", "disabledTrailingIconColor", "<init>", "(JJJJJJLkotlin/jvm/internal/k;)V", "", "enabled", "b", "(Z)J", "a", "c", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getTextColor-0d7_KjU", "()J", "getLeadingIconColor-0d7_KjU", "getTrailingIconColor-0d7_KjU", "d", "getDisabledTextColor-0d7_KjU", "e", "getDisabledLeadingIconColor-0d7_KjU", "f", "getDisabledTrailingIconColor-0d7_KjU", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: K.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1254F {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long textColor;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long leadingIconColor;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long trailingIconColor;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long disabledTextColor;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long disabledLeadingIconColor;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long disabledTrailingIconColor;

    public /* synthetic */ C1254F(long j10, long j11, long j12, long j13, long j14, long j15, C3854k c3854k) {
        this(j10, j11, j12, j13, j14, j15);
    }

    public final long a(boolean enabled) {
        return enabled ? this.leadingIconColor : this.disabledLeadingIconColor;
    }

    public final long b(boolean enabled) {
        return enabled ? this.textColor : this.disabledTextColor;
    }

    public final long c(boolean enabled) {
        return enabled ? this.trailingIconColor : this.disabledTrailingIconColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof C1254F)) {
            return false;
        }
        C1254F c1254f = (C1254F) other;
        return C3602t0.m(this.textColor, c1254f.textColor) && C3602t0.m(this.leadingIconColor, c1254f.leadingIconColor) && C3602t0.m(this.trailingIconColor, c1254f.trailingIconColor) && C3602t0.m(this.disabledTextColor, c1254f.disabledTextColor) && C3602t0.m(this.disabledLeadingIconColor, c1254f.disabledLeadingIconColor) && C3602t0.m(this.disabledTrailingIconColor, c1254f.disabledTrailingIconColor);
    }

    public int hashCode() {
        return (((((((((C3602t0.s(this.textColor) * 31) + C3602t0.s(this.leadingIconColor)) * 31) + C3602t0.s(this.trailingIconColor)) * 31) + C3602t0.s(this.disabledTextColor)) * 31) + C3602t0.s(this.disabledLeadingIconColor)) * 31) + C3602t0.s(this.disabledTrailingIconColor);
    }

    private C1254F(long j10, long j11, long j12, long j13, long j14, long j15) {
        this.textColor = j10;
        this.leadingIconColor = j11;
        this.trailingIconColor = j12;
        this.disabledTextColor = j13;
        this.disabledLeadingIconColor = j14;
        this.disabledTrailingIconColor = j15;
    }
}
