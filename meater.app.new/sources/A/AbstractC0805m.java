package A;

import b0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: RowColumnImpl.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u000b2\u00020\u0001:\u0006\u000b\r\u0010\u0013\u0014\u0015B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H ¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\bH\u0010¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0001\u0005\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b"}, d2 = {"LA/m;", "", "<init>", "()V", "", "size", "LU0/t;", "layoutDirection", "Ly0/Z;", "placeable", "beforeCrossAxisAlignmentLine", "a", "(ILU0/t;Ly0/Z;I)I", "b", "(Ly0/Z;)Ljava/lang/Integer;", "", "c", "()Z", "isRelative", "d", "e", "f", "LA/m$a;", "LA/m$c;", "LA/m$d;", "LA/m$e;", "LA/m$f;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: A.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0805m {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC0805m f158b = a.f161e;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC0805m f159c = e.f164e;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC0805m f160d = c.f162e;

    /* compiled from: RowColumnImpl.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LA/m$a;", "LA/m;", "<init>", "()V", "", "size", "LU0/t;", "layoutDirection", "Ly0/Z;", "placeable", "beforeCrossAxisAlignmentLine", "a", "(ILU0/t;Ly0/Z;I)I", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: A.m$a */
    private static final class a extends AbstractC0805m {

        /* renamed from: e, reason: collision with root package name */
        public static final a f161e = new a();

        private a() {
            super(null);
        }

        @Override // A.AbstractC0805m
        public int a(int size, U0.t layoutDirection, y0.Z placeable, int beforeCrossAxisAlignmentLine) {
            return size / 2;
        }
    }

    /* compiled from: RowColumnImpl.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LA/m$b;", "", "<init>", "()V", "Lb0/c$c;", "vertical", "LA/m;", "b", "(Lb0/c$c;)LA/m;", "Lb0/c$b;", "horizontal", "a", "(Lb0/c$b;)LA/m;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: A.m$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final AbstractC0805m a(c.b horizontal) {
            return new HorizontalCrossAxisAlignment(horizontal);
        }

        public final AbstractC0805m b(c.InterfaceC0420c vertical) {
            return new VerticalCrossAxisAlignment(vertical);
        }

        private Companion() {
        }
    }

    /* compiled from: RowColumnImpl.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LA/m$c;", "LA/m;", "<init>", "()V", "", "size", "LU0/t;", "layoutDirection", "Ly0/Z;", "placeable", "beforeCrossAxisAlignmentLine", "a", "(ILU0/t;Ly0/Z;I)I", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: A.m$c */
    private static final class c extends AbstractC0805m {

        /* renamed from: e, reason: collision with root package name */
        public static final c f162e = new c();

        private c() {
            super(null);
        }

        @Override // A.AbstractC0805m
        public int a(int size, U0.t layoutDirection, y0.Z placeable, int beforeCrossAxisAlignmentLine) {
            if (layoutDirection == U0.t.Ltr) {
                return size;
            }
            return 0;
        }
    }

    /* compiled from: RowColumnImpl.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"LA/m$d;", "LA/m;", "Lb0/c$b;", "horizontal", "<init>", "(Lb0/c$b;)V", "", "size", "LU0/t;", "layoutDirection", "Ly0/Z;", "placeable", "beforeCrossAxisAlignmentLine", "a", "(ILU0/t;Ly0/Z;I)I", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Lb0/c$b;", "getHorizontal", "()Lb0/c$b;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: A.m$d, reason: from toString */
    private static final /* data */ class HorizontalCrossAxisAlignment extends AbstractC0805m {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final c.b horizontal;

        public HorizontalCrossAxisAlignment(c.b bVar) {
            super(null);
            this.horizontal = bVar;
        }

        @Override // A.AbstractC0805m
        public int a(int size, U0.t layoutDirection, y0.Z placeable, int beforeCrossAxisAlignmentLine) {
            return this.horizontal.a(0, size, layoutDirection);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof HorizontalCrossAxisAlignment) && C3862t.b(this.horizontal, ((HorizontalCrossAxisAlignment) other).horizontal);
        }

        public int hashCode() {
            return this.horizontal.hashCode();
        }

        public String toString() {
            return "HorizontalCrossAxisAlignment(horizontal=" + this.horizontal + ')';
        }
    }

    /* compiled from: RowColumnImpl.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LA/m$e;", "LA/m;", "<init>", "()V", "", "size", "LU0/t;", "layoutDirection", "Ly0/Z;", "placeable", "beforeCrossAxisAlignmentLine", "a", "(ILU0/t;Ly0/Z;I)I", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: A.m$e */
    private static final class e extends AbstractC0805m {

        /* renamed from: e, reason: collision with root package name */
        public static final e f164e = new e();

        private e() {
            super(null);
        }

        @Override // A.AbstractC0805m
        public int a(int size, U0.t layoutDirection, y0.Z placeable, int beforeCrossAxisAlignmentLine) {
            if (layoutDirection == U0.t.Ltr) {
                return 0;
            }
            return size;
        }
    }

    /* compiled from: RowColumnImpl.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"LA/m$f;", "LA/m;", "Lb0/c$c;", "vertical", "<init>", "(Lb0/c$c;)V", "", "size", "LU0/t;", "layoutDirection", "Ly0/Z;", "placeable", "beforeCrossAxisAlignmentLine", "a", "(ILU0/t;Ly0/Z;I)I", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Lb0/c$c;", "getVertical", "()Lb0/c$c;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: A.m$f, reason: from toString */
    private static final /* data */ class VerticalCrossAxisAlignment extends AbstractC0805m {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final c.InterfaceC0420c vertical;

        public VerticalCrossAxisAlignment(c.InterfaceC0420c interfaceC0420c) {
            super(null);
            this.vertical = interfaceC0420c;
        }

        @Override // A.AbstractC0805m
        public int a(int size, U0.t layoutDirection, y0.Z placeable, int beforeCrossAxisAlignmentLine) {
            return this.vertical.a(0, size);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof VerticalCrossAxisAlignment) && C3862t.b(this.vertical, ((VerticalCrossAxisAlignment) other).vertical);
        }

        public int hashCode() {
            return this.vertical.hashCode();
        }

        public String toString() {
            return "VerticalCrossAxisAlignment(vertical=" + this.vertical + ')';
        }
    }

    public /* synthetic */ AbstractC0805m(C3854k c3854k) {
        this();
    }

    public abstract int a(int size, U0.t layoutDirection, y0.Z placeable, int beforeCrossAxisAlignmentLine);

    public Integer b(y0.Z placeable) {
        return null;
    }

    public boolean c() {
        return false;
    }

    private AbstractC0805m() {
    }
}
