package kotlin;

import i0.C3602t0;
import i0.C3606v0;
import kotlin.C4716F;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;

/* compiled from: AppBar.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJB\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000e\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"LK/a0;", "", "Li0/t0;", "containerColor", "scrolledContainerColor", "navigationIconContentColor", "titleContentColor", "actionIconContentColor", "<init>", "(JJJJJLkotlin/jvm/internal/k;)V", "b", "(JJJJJ)LK/a0;", "", "colorTransitionFraction", "a", "(F)J", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getContainerColor-0d7_KjU", "()J", "getScrolledContainerColor-0d7_KjU", "c", "d", "e", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: K.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1275a0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long containerColor;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long scrolledContainerColor;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long navigationIconContentColor;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long titleContentColor;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long actionIconContentColor;

    public /* synthetic */ C1275a0(long j10, long j11, long j12, long j13, long j14, C3854k c3854k) {
        this(j10, j11, j12, j13, j14);
    }

    public final long a(float colorTransitionFraction) {
        return C3606v0.h(this.containerColor, this.scrolledContainerColor, C4716F.c().a(colorTransitionFraction));
    }

    public final C1275a0 b(long containerColor, long scrolledContainerColor, long navigationIconContentColor, long titleContentColor, long actionIconContentColor) {
        return new C1275a0(containerColor != 16 ? containerColor : this.containerColor, scrolledContainerColor != 16 ? scrolledContainerColor : this.scrolledContainerColor, navigationIconContentColor != 16 ? navigationIconContentColor : this.navigationIconContentColor, titleContentColor != 16 ? titleContentColor : this.titleContentColor, actionIconContentColor != 16 ? actionIconContentColor : this.actionIconContentColor, null);
    }

    /* renamed from: c, reason: from getter */
    public final long getActionIconContentColor() {
        return this.actionIconContentColor;
    }

    /* renamed from: d, reason: from getter */
    public final long getNavigationIconContentColor() {
        return this.navigationIconContentColor;
    }

    /* renamed from: e, reason: from getter */
    public final long getTitleContentColor() {
        return this.titleContentColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof C1275a0)) {
            return false;
        }
        C1275a0 c1275a0 = (C1275a0) other;
        return C3602t0.m(this.containerColor, c1275a0.containerColor) && C3602t0.m(this.scrolledContainerColor, c1275a0.scrolledContainerColor) && C3602t0.m(this.navigationIconContentColor, c1275a0.navigationIconContentColor) && C3602t0.m(this.titleContentColor, c1275a0.titleContentColor) && C3602t0.m(this.actionIconContentColor, c1275a0.actionIconContentColor);
    }

    public int hashCode() {
        return (((((((C3602t0.s(this.containerColor) * 31) + C3602t0.s(this.scrolledContainerColor)) * 31) + C3602t0.s(this.navigationIconContentColor)) * 31) + C3602t0.s(this.titleContentColor)) * 31) + C3602t0.s(this.actionIconContentColor);
    }

    private C1275a0(long j10, long j11, long j12, long j13, long j14) {
        this.containerColor = j10;
        this.scrolledContainerColor = j11;
        this.navigationIconContentColor = j12;
        this.titleContentColor = j13;
        this.actionIconContentColor = j14;
    }
}
