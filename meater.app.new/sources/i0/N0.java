package i0;

import h0.C3478i;
import h0.C3480k;
import h0.C3481l;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: Outline.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0005\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"Li0/N0;", "", "<init>", "()V", "Lh0/i;", "a", "()Lh0/i;", "bounds", "b", "c", "Li0/N0$a;", "Li0/N0$b;", "Li0/N0$c;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class N0 {

    /* compiled from: Outline.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u000b¨\u0006\r"}, d2 = {"Li0/N0$a;", "Li0/N0;", "Li0/R0;", "path", "<init>", "(Li0/R0;)V", "a", "Li0/R0;", "b", "()Li0/R0;", "Lh0/i;", "()Lh0/i;", "bounds", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends N0 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final R0 path;

        public a(R0 r02) {
            super(null);
            this.path = r02;
        }

        @Override // i0.N0
        /* renamed from: a */
        public C3478i getRect() {
            return this.path.getBounds();
        }

        /* renamed from: b, reason: from getter */
        public final R0 getPath() {
            return this.path;
        }
    }

    /* compiled from: Outline.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0011¨\u0006\u0013"}, d2 = {"Li0/N0$b;", "Li0/N0;", "Lh0/i;", "rect", "<init>", "(Lh0/i;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Lh0/i;", "b", "()Lh0/i;", "bounds", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends N0 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final C3478i rect;

        public b(C3478i c3478i) {
            super(null);
            this.rect = c3478i;
        }

        @Override // i0.N0
        /* renamed from: a, reason: from getter */
        public C3478i getRect() {
            return this.rect;
        }

        public final C3478i b() {
            return this.rect;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && C3862t.b(this.rect, ((b) other).rect);
        }

        public int hashCode() {
            return this.rect.hashCode();
        }
    }

    /* compiled from: Outline.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0018¨\u0006\u001a"}, d2 = {"Li0/N0$c;", "Li0/N0;", "Lh0/k;", "roundRect", "<init>", "(Lh0/k;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Lh0/k;", "b", "()Lh0/k;", "Li0/R0;", "Li0/R0;", "c", "()Li0/R0;", "roundRectPath", "Lh0/i;", "()Lh0/i;", "bounds", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c extends N0 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final C3480k roundRect;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final R0 roundRectPath;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C3480k c3480k) {
            super(0 == true ? 1 : 0);
            R0 r02 = null;
            this.roundRect = c3480k;
            if (!C3481l.e(c3480k)) {
                R0 r0A = C3561Y.a();
                R0.c(r0A, c3480k, null, 2, null);
                r02 = r0A;
            }
            this.roundRectPath = r02;
        }

        @Override // i0.N0
        /* renamed from: a */
        public C3478i getRect() {
            return C3481l.d(this.roundRect);
        }

        /* renamed from: b, reason: from getter */
        public final C3480k getRoundRect() {
            return this.roundRect;
        }

        /* renamed from: c, reason: from getter */
        public final R0 getRoundRectPath() {
            return this.roundRectPath;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && C3862t.b(this.roundRect, ((c) other).roundRect);
        }

        public int hashCode() {
            return this.roundRect.hashCode();
        }
    }

    public /* synthetic */ N0(C3854k c3854k) {
        this();
    }

    /* renamed from: a */
    public abstract C3478i getRect();

    private N0() {
    }
}
