package o0;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: ImageVector.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002By\b\u0000\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0013H\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b,\u0010(R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b&\u0010&\u001a\u0004\b-\u0010(R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b.\u0010&\u001a\u0004\b/\u0010(R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b0\u0010&\u001a\u0004\b)\u0010(R\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b1\u0010&\u001a\u0004\b+\u0010(R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00103R\u0011\u00107\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b!\u0010 ¨\u00068"}, d2 = {"Lo0/m;", "Lo0/o;", "", "", "name", "", "rotation", "pivotX", "pivotY", "scaleX", "scaleY", "translationX", "translationY", "", "Lo0/g;", "clipPathData", "children", "<init>", "(Ljava/lang/String;FFFFFFFLjava/util/List;Ljava/util/List;)V", "", "index", "h", "(I)Lo0/o;", "", "iterator", "()Ljava/util/Iterator;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "B", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "C", "F", "y", "()F", "D", "w", "E", "x", "z", "G", "A", "H", "I", "J", "Ljava/util/List;", "i", "()Ljava/util/List;", "K", "size", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: o0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4092m extends AbstractC4094o implements Iterable<AbstractC4094o>, Ca.a {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final float rotation;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final float pivotX;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final float pivotY;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final float scaleX;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private final float scaleY;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private final float translationX;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private final float translationY;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private final List<AbstractC4086g> clipPathData;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private final List<AbstractC4094o> children;

    /* compiled from: ImageVector.kt */
    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"o0/m$a", "", "Lo0/o;", "", "hasNext", "()Z", "b", "()Lo0/o;", "B", "Ljava/util/Iterator;", "getIt", "()Ljava/util/Iterator;", "it", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: o0.m$a */
    public static final class a implements Iterator<AbstractC4094o>, Ca.a {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private final Iterator<AbstractC4094o> it;

        a(C4092m c4092m) {
            this.it = c4092m.children.iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC4094o next() {
            return this.it.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.it.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C4092m() {
        this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
    }

    /* renamed from: A, reason: from getter */
    public final float getScaleY() {
        return this.scaleY;
    }

    public final int B() {
        return this.children.size();
    }

    /* renamed from: D, reason: from getter */
    public final float getTranslationX() {
        return this.translationX;
    }

    /* renamed from: E, reason: from getter */
    public final float getTranslationY() {
        return this.translationY;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && (other instanceof C4092m)) {
            C4092m c4092m = (C4092m) other;
            return C3862t.b(this.name, c4092m.name) && this.rotation == c4092m.rotation && this.pivotX == c4092m.pivotX && this.pivotY == c4092m.pivotY && this.scaleX == c4092m.scaleX && this.scaleY == c4092m.scaleY && this.translationX == c4092m.translationX && this.translationY == c4092m.translationY && C3862t.b(this.clipPathData, c4092m.clipPathData) && C3862t.b(this.children, c4092m.children);
        }
        return false;
    }

    public final AbstractC4094o h(int index) {
        return this.children.get(index);
    }

    public int hashCode() {
        return (((((((((((((((((this.name.hashCode() * 31) + Float.hashCode(this.rotation)) * 31) + Float.hashCode(this.pivotX)) * 31) + Float.hashCode(this.pivotY)) * 31) + Float.hashCode(this.scaleX)) * 31) + Float.hashCode(this.scaleY)) * 31) + Float.hashCode(this.translationX)) * 31) + Float.hashCode(this.translationY)) * 31) + this.clipPathData.hashCode()) * 31) + this.children.hashCode();
    }

    public final List<AbstractC4086g> i() {
        return this.clipPathData;
    }

    @Override // java.lang.Iterable
    public Iterator<AbstractC4094o> iterator() {
        return new a(this);
    }

    /* renamed from: j, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: w, reason: from getter */
    public final float getPivotX() {
        return this.pivotX;
    }

    /* renamed from: x, reason: from getter */
    public final float getPivotY() {
        return this.pivotY;
    }

    /* renamed from: y, reason: from getter */
    public final float getRotation() {
        return this.rotation;
    }

    /* renamed from: z, reason: from getter */
    public final float getScaleX() {
        return this.scaleX;
    }

    public /* synthetic */ C4092m(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list, List list2, int i10, C3854k c3854k) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? 0.0f : f10, (i10 & 4) != 0 ? 0.0f : f11, (i10 & 8) != 0 ? 0.0f : f12, (i10 & 16) != 0 ? 1.0f : f13, (i10 & 32) == 0 ? f14 : 1.0f, (i10 & 64) != 0 ? 0.0f : f15, (i10 & 128) == 0 ? f16 : 0.0f, (i10 & 256) != 0 ? C4093n.d() : list, (i10 & 512) != 0 ? kotlin.collections.r.m() : list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4092m(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List<? extends AbstractC4086g> list, List<? extends AbstractC4094o> list2) {
        super(null);
        this.name = str;
        this.rotation = f10;
        this.pivotX = f11;
        this.pivotY = f12;
        this.scaleX = f13;
        this.scaleY = f14;
        this.translationX = f15;
        this.translationY = f16;
        this.clipPathData = list;
        this.children = list2;
    }
}
