package i0;

import h0.C3476g;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;

/* compiled from: Shadow.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0014B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R&\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R&\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001a\u0010\u0015\u0012\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001b\u0010\u0017R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u001d\u0012\u0004\b\u001f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Li0/b1;", "", "Li0/t0;", "color", "Lh0/g;", "offset", "", "blurRadius", "<init>", "(JJFLkotlin/jvm/internal/k;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "J", "c", "()J", "getColor-0d7_KjU$annotations", "()V", "b", "d", "getOffset-F1C5BW0$annotations", "F", "()F", "getBlurRadius$annotations", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: i0.b1, reason: from toString */
/* loaded from: classes.dex */
public final class Shadow {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: e, reason: collision with root package name */
    private static final Shadow f42931e = new Shadow(0, 0, 0.0f, 7, null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long color;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long offset;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final float blurRadius;

    /* compiled from: Shadow.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Li0/b1$a;", "", "<init>", "()V", "Li0/b1;", "None", "Li0/b1;", "a", "()Li0/b1;", "getNone$annotations", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: i0.b1$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final Shadow a() {
            return Shadow.f42931e;
        }

        private Companion() {
        }
    }

    public /* synthetic */ Shadow(long j10, long j11, float f10, C3854k c3854k) {
        this(j10, j11, f10);
    }

    /* renamed from: b, reason: from getter */
    public final float getBlurRadius() {
        return this.blurRadius;
    }

    /* renamed from: c, reason: from getter */
    public final long getColor() {
        return this.color;
    }

    /* renamed from: d, reason: from getter */
    public final long getOffset() {
        return this.offset;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Shadow)) {
            return false;
        }
        Shadow shadow = (Shadow) other;
        return C3602t0.m(this.color, shadow.color) && C3476g.j(this.offset, shadow.offset) && this.blurRadius == shadow.blurRadius;
    }

    public int hashCode() {
        return (((C3602t0.s(this.color) * 31) + C3476g.o(this.offset)) * 31) + Float.hashCode(this.blurRadius);
    }

    public String toString() {
        return "Shadow(color=" + ((Object) C3602t0.t(this.color)) + ", offset=" + ((Object) C3476g.t(this.offset)) + ", blurRadius=" + this.blurRadius + ')';
    }

    private Shadow(long j10, long j11, float f10) {
        this.color = j10;
        this.offset = j11;
        this.blurRadius = f10;
    }

    public /* synthetic */ Shadow(long j10, long j11, float f10, int i10, C3854k c3854k) {
        this((i10 & 1) != 0 ? C3606v0.d(4278190080L) : j10, (i10 & 2) != 0 ? C3476g.INSTANCE.c() : j11, (i10 & 4) != 0 ? 0.0f : f10, null);
    }
}
