package A;

import kotlin.Metadata;
import kotlin.collections.C3831l;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: Arrangement.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0016\bÇ\u0002\u0018\u00002\u00020\u0001:\u0004$\u001c\u0011\u0016B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0015\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0015\u0010\u0012J/\u0010\u0016\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0016\u0010\u0012J/\u0010\u0017\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0017\u0010\u0012J/\u0010\u0018\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0018\u0010\u0012R \u0010\u001f\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u001c\u0010\u001dR \u0010\"\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010\u001b\u0012\u0004\b!\u0010\u0003\u001a\u0004\b \u0010\u001dR \u0010)\u001a\u00020#8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b(\u0010\u0003\u001a\u0004\b&\u0010'R \u0010,\u001a\u00020#8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010%\u0012\u0004\b+\u0010\u0003\u001a\u0004\b*\u0010'R \u00100\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010-\u0012\u0004\b/\u0010\u0003\u001a\u0004\b\u001a\u0010.R \u00103\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010-\u0012\u0004\b2\u0010\u0003\u001a\u0004\b1\u0010.R \u00105\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010-\u0012\u0004\b4\u0010\u0003\u001a\u0004\b$\u0010.R \u00108\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010-\u0012\u0004\b7\u0010\u0003\u001a\u0004\b6\u0010.\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00069"}, d2 = {"LA/b;", "", "<init>", "()V", "LU0/h;", "space", "LA/b$e;", "m", "(F)LA/b$e;", "", "totalSize", "", "size", "outPosition", "", "reverseInput", "Loa/F;", "i", "(I[I[IZ)V", "h", "([I[IZ)V", "g", "l", "k", "j", "LA/b$d;", "b", "LA/b$d;", "e", "()LA/b$d;", "getStart$annotations", "Start", "c", "getEnd$annotations", "End", "LA/b$l;", "d", "LA/b$l;", "f", "()LA/b$l;", "getTop$annotations", "Top", "a", "getBottom$annotations", "Bottom", "LA/b$e;", "()LA/b$e;", "getCenter$annotations", "Center", "getSpaceEvenly", "getSpaceEvenly$annotations", "SpaceEvenly", "getSpaceBetween$annotations", "SpaceBetween", "getSpaceAround", "getSpaceAround$annotations", "SpaceAround", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: A.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0794b {

    /* renamed from: a, reason: collision with root package name */
    public static final C0794b f54a = new C0794b();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final d Start = new j();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final d End = new c();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final l Top = new k();

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final l Bottom = new a();

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final e Center = new C0000b();

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final e SpaceEvenly = new h();

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final e SpaceBetween = new g();

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final e SpaceAround = new f();

    /* compiled from: Arrangement.kt */
    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"A/b$a", "LA/b$l;", "LU0/d;", "", "totalSize", "", "sizes", "outPositions", "Loa/F;", "b", "(LU0/d;I[I[I)V", "", "toString", "()Ljava/lang/String;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: A.b$a */
    public static final class a implements l {
        a() {
        }

        @Override // A.C0794b.l
        public void b(U0.d dVar, int i10, int[] iArr, int[] iArr2) {
            C0794b.f54a.i(i10, iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#Bottom";
        }
    }

    /* compiled from: Arrangement.kt */
    @Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\r\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0016\u001a\u00020\u00128\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"A/b$b", "LA/b$e;", "LU0/d;", "", "totalSize", "", "sizes", "LU0/t;", "layoutDirection", "outPositions", "Loa/F;", "c", "(LU0/d;I[ILU0/t;[I)V", "b", "(LU0/d;I[I[I)V", "", "toString", "()Ljava/lang/String;", "LU0/h;", "a", "F", "()F", "spacing", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: A.b$b, reason: collision with other inner class name */
    public static final class C0000b implements e {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final float spacing = U0.h.u(0);

        C0000b() {
        }

        @Override // A.C0794b.d, A.C0794b.l
        /* renamed from: a, reason: from getter */
        public float getSpacing() {
            return this.spacing;
        }

        @Override // A.C0794b.l
        public void b(U0.d dVar, int i10, int[] iArr, int[] iArr2) {
            C0794b.f54a.g(i10, iArr, iArr2, false);
        }

        @Override // A.C0794b.d
        public void c(U0.d dVar, int i10, int[] iArr, U0.t tVar, int[] iArr2) {
            if (tVar == U0.t.Ltr) {
                C0794b.f54a.g(i10, iArr, iArr2, false);
            } else {
                C0794b.f54a.g(i10, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#Center";
        }
    }

    /* compiled from: Arrangement.kt */
    @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"A/b$c", "LA/b$d;", "LU0/d;", "", "totalSize", "", "sizes", "LU0/t;", "layoutDirection", "outPositions", "Loa/F;", "c", "(LU0/d;I[ILU0/t;[I)V", "", "toString", "()Ljava/lang/String;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: A.b$c */
    public static final class c implements d {
        c() {
        }

        @Override // A.C0794b.d
        public void c(U0.d dVar, int i10, int[] iArr, U0.t tVar, int[] iArr2) {
            if (tVar == U0.t.Ltr) {
                C0794b.f54a.i(i10, iArr, iArr2, false);
            } else {
                C0794b.f54a.h(iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#End";
        }
    }

    /* compiled from: Arrangement.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H&¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\r8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0003"}, d2 = {"LA/b$d;", "", "LU0/d;", "", "totalSize", "", "sizes", "LU0/t;", "layoutDirection", "outPositions", "Loa/F;", "c", "(LU0/d;I[ILU0/t;[I)V", "LU0/h;", "a", "()F", "spacing", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: A.b$d */
    public interface d {
        /* renamed from: a */
        default float getSpacing() {
            return U0.h.u(0);
        }

        void c(U0.d dVar, int i10, int[] iArr, U0.t tVar, int[] iArr2);
    }

    /* compiled from: Arrangement.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u00012\u00020\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0003"}, d2 = {"LA/b$e;", "LA/b$d;", "LA/b$l;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: A.b$e */
    public interface e extends d, l {
    }

    /* compiled from: Arrangement.kt */
    @Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\r\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0016\u001a\u00020\u00128\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"A/b$f", "LA/b$e;", "LU0/d;", "", "totalSize", "", "sizes", "LU0/t;", "layoutDirection", "outPositions", "Loa/F;", "c", "(LU0/d;I[ILU0/t;[I)V", "b", "(LU0/d;I[I[I)V", "", "toString", "()Ljava/lang/String;", "LU0/h;", "a", "F", "()F", "spacing", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: A.b$f */
    public static final class f implements e {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final float spacing = U0.h.u(0);

        f() {
        }

        @Override // A.C0794b.d, A.C0794b.l
        /* renamed from: a, reason: from getter */
        public float getSpacing() {
            return this.spacing;
        }

        @Override // A.C0794b.l
        public void b(U0.d dVar, int i10, int[] iArr, int[] iArr2) {
            C0794b.f54a.j(i10, iArr, iArr2, false);
        }

        @Override // A.C0794b.d
        public void c(U0.d dVar, int i10, int[] iArr, U0.t tVar, int[] iArr2) {
            if (tVar == U0.t.Ltr) {
                C0794b.f54a.j(i10, iArr, iArr2, false);
            } else {
                C0794b.f54a.j(i10, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#SpaceAround";
        }
    }

    /* compiled from: Arrangement.kt */
    @Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\r\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0016\u001a\u00020\u00128\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"A/b$g", "LA/b$e;", "LU0/d;", "", "totalSize", "", "sizes", "LU0/t;", "layoutDirection", "outPositions", "Loa/F;", "c", "(LU0/d;I[ILU0/t;[I)V", "b", "(LU0/d;I[I[I)V", "", "toString", "()Ljava/lang/String;", "LU0/h;", "a", "F", "()F", "spacing", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: A.b$g */
    public static final class g implements e {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final float spacing = U0.h.u(0);

        g() {
        }

        @Override // A.C0794b.d, A.C0794b.l
        /* renamed from: a, reason: from getter */
        public float getSpacing() {
            return this.spacing;
        }

        @Override // A.C0794b.l
        public void b(U0.d dVar, int i10, int[] iArr, int[] iArr2) {
            C0794b.f54a.k(i10, iArr, iArr2, false);
        }

        @Override // A.C0794b.d
        public void c(U0.d dVar, int i10, int[] iArr, U0.t tVar, int[] iArr2) {
            if (tVar == U0.t.Ltr) {
                C0794b.f54a.k(i10, iArr, iArr2, false);
            } else {
                C0794b.f54a.k(i10, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#SpaceBetween";
        }
    }

    /* compiled from: Arrangement.kt */
    @Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\r\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0016\u001a\u00020\u00128\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"A/b$h", "LA/b$e;", "LU0/d;", "", "totalSize", "", "sizes", "LU0/t;", "layoutDirection", "outPositions", "Loa/F;", "c", "(LU0/d;I[ILU0/t;[I)V", "b", "(LU0/d;I[I[I)V", "", "toString", "()Ljava/lang/String;", "LU0/h;", "a", "F", "()F", "spacing", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: A.b$h */
    public static final class h implements e {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final float spacing = U0.h.u(0);

        h() {
        }

        @Override // A.C0794b.d, A.C0794b.l
        /* renamed from: a, reason: from getter */
        public float getSpacing() {
            return this.spacing;
        }

        @Override // A.C0794b.l
        public void b(U0.d dVar, int i10, int[] iArr, int[] iArr2) {
            C0794b.f54a.l(i10, iArr, iArr2, false);
        }

        @Override // A.C0794b.d
        public void c(U0.d dVar, int i10, int[] iArr, U0.t tVar, int[] iArr2) {
            if (tVar == U0.t.Ltr) {
                C0794b.f54a.l(i10, iArr, iArr2, false);
            } else {
                C0794b.f54a.l(i10, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#SpaceEvenly";
        }
    }

    /* compiled from: Arrangement.kt */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\u0013\u001a\u00020\u0012*\u00020\f2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0015\u001a\u00020\u0012*\u00020\f2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010$\u001a\u0004\b%\u0010&R+\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010'\u001a\u0004\b(\u0010)R \u0010+\u001a\u00020\u00028\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b*\u0010!\u001a\u0004\b \u0010#\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006,"}, d2 = {"LA/b$i;", "LA/b$e;", "LU0/h;", "space", "", "rtlMirror", "Lkotlin/Function2;", "", "LU0/t;", "alignment", "<init>", "(FZLBa/p;Lkotlin/jvm/internal/k;)V", "LU0/d;", "totalSize", "", "sizes", "layoutDirection", "outPositions", "Loa/F;", "c", "(LU0/d;I[ILU0/t;[I)V", "b", "(LU0/d;I[I[I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "F", "getSpace-D9Ej5fM", "()F", "Z", "getRtlMirror", "()Z", "LBa/p;", "getAlignment", "()LBa/p;", "d", "spacing", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: A.b$i */
    public static final /* data */ class i implements e {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final float space;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean rtlMirror;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Ba.p<Integer, U0.t, Integer> alignment;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final float spacing;

        public /* synthetic */ i(float f10, boolean z10, Ba.p pVar, C3854k c3854k) {
            this(f10, z10, pVar);
        }

        @Override // A.C0794b.d, A.C0794b.l
        /* renamed from: a, reason: from getter */
        public float getSpacing() {
            return this.spacing;
        }

        @Override // A.C0794b.l
        public void b(U0.d dVar, int i10, int[] iArr, int[] iArr2) {
            c(dVar, i10, iArr, U0.t.Ltr, iArr2);
        }

        @Override // A.C0794b.d
        public void c(U0.d dVar, int i10, int[] iArr, U0.t tVar, int[] iArr2) {
            int i11;
            int i12;
            if (iArr.length == 0) {
                return;
            }
            int iI1 = dVar.i1(this.space);
            boolean z10 = this.rtlMirror && tVar == U0.t.Rtl;
            C0794b c0794b = C0794b.f54a;
            if (z10) {
                int length = iArr.length - 1;
                i11 = 0;
                i12 = 0;
                while (-1 < length) {
                    int i13 = iArr[length];
                    int iMin = Math.min(i11, i10 - i13);
                    iArr2[length] = iMin;
                    int iMin2 = Math.min(iI1, (i10 - iMin) - i13);
                    int i14 = iArr2[length] + i13 + iMin2;
                    length--;
                    i12 = iMin2;
                    i11 = i14;
                }
            } else {
                int length2 = iArr.length;
                int i15 = 0;
                i11 = 0;
                i12 = 0;
                int i16 = 0;
                while (i15 < length2) {
                    int i17 = iArr[i15];
                    int iMin3 = Math.min(i11, i10 - i17);
                    iArr2[i16] = iMin3;
                    int iMin4 = Math.min(iI1, (i10 - iMin3) - i17);
                    int i18 = iArr2[i16] + i17 + iMin4;
                    i15++;
                    i16++;
                    i12 = iMin4;
                    i11 = i18;
                }
            }
            int i19 = i11 - i12;
            Ba.p<Integer, U0.t, Integer> pVar = this.alignment;
            if (pVar == null || i19 >= i10) {
                return;
            }
            int iIntValue = pVar.invoke(Integer.valueOf(i10 - i19), tVar).intValue();
            int length3 = iArr2.length;
            for (int i20 = 0; i20 < length3; i20++) {
                iArr2[i20] = iArr2[i20] + iIntValue;
            }
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof i)) {
                return false;
            }
            i iVar = (i) other;
            return U0.h.w(this.space, iVar.space) && this.rtlMirror == iVar.rtlMirror && C3862t.b(this.alignment, iVar.alignment);
        }

        public int hashCode() {
            int iX = ((U0.h.x(this.space) * 31) + Boolean.hashCode(this.rtlMirror)) * 31;
            Ba.p<Integer, U0.t, Integer> pVar = this.alignment;
            return iX + (pVar == null ? 0 : pVar.hashCode());
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.rtlMirror ? "" : "Absolute");
            sb2.append("Arrangement#spacedAligned(");
            sb2.append((Object) U0.h.y(this.space));
            sb2.append(", ");
            sb2.append(this.alignment);
            sb2.append(')');
            return sb2.toString();
        }

        /* JADX WARN: Multi-variable type inference failed */
        private i(float f10, boolean z10, Ba.p<? super Integer, ? super U0.t, Integer> pVar) {
            this.space = f10;
            this.rtlMirror = z10;
            this.alignment = pVar;
            this.spacing = f10;
        }
    }

    /* compiled from: Arrangement.kt */
    @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"A/b$j", "LA/b$d;", "LU0/d;", "", "totalSize", "", "sizes", "LU0/t;", "layoutDirection", "outPositions", "Loa/F;", "c", "(LU0/d;I[ILU0/t;[I)V", "", "toString", "()Ljava/lang/String;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: A.b$j */
    public static final class j implements d {
        j() {
        }

        @Override // A.C0794b.d
        public void c(U0.d dVar, int i10, int[] iArr, U0.t tVar, int[] iArr2) {
            if (tVar == U0.t.Ltr) {
                C0794b.f54a.h(iArr, iArr2, false);
            } else {
                C0794b.f54a.i(i10, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#Start";
        }
    }

    /* compiled from: Arrangement.kt */
    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"A/b$k", "LA/b$l;", "LU0/d;", "", "totalSize", "", "sizes", "outPositions", "Loa/F;", "b", "(LU0/d;I[I[I)V", "", "toString", "()Ljava/lang/String;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: A.b$k */
    public static final class k implements l {
        k() {
        }

        @Override // A.C0794b.l
        public void b(U0.d dVar, int i10, int[] iArr, int[] iArr2) {
            C0794b.f54a.h(iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#Top";
        }
    }

    /* compiled from: Arrangement.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\f\u0010\rø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"LA/b$l;", "", "LU0/d;", "", "totalSize", "", "sizes", "outPositions", "Loa/F;", "b", "(LU0/d;I[I[I)V", "LU0/h;", "a", "()F", "spacing", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: A.b$l */
    public interface l {
        /* renamed from: a */
        default float getSpacing() {
            return U0.h.u(0);
        }

        void b(U0.d dVar, int i10, int[] iArr, int[] iArr2);
    }

    /* compiled from: Arrangement.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "size", "LU0/t;", "layoutDirection", "a", "(ILU0/t;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: A.b$m */
    static final class m extends AbstractC3864v implements Ba.p<Integer, U0.t, Integer> {

        /* renamed from: B, reason: collision with root package name */
        public static final m f71B = new m();

        m() {
            super(2);
        }

        public final Integer a(int i10, U0.t tVar) {
            return Integer.valueOf(b0.c.INSTANCE.k().a(0, i10, tVar));
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, U0.t tVar) {
            return a(num.intValue(), tVar);
        }
    }

    private C0794b() {
    }

    public final l a() {
        return Bottom;
    }

    public final e b() {
        return Center;
    }

    public final d c() {
        return End;
    }

    public final e d() {
        return SpaceBetween;
    }

    public final d e() {
        return Start;
    }

    public final l f() {
        return Top;
    }

    public final void g(int totalSize, int[] size, int[] outPosition, boolean reverseInput) {
        int i10 = 0;
        int i11 = 0;
        for (int i12 : size) {
            i11 += i12;
        }
        float f10 = (totalSize - i11) / 2;
        if (!reverseInput) {
            int length = size.length;
            int i13 = 0;
            while (i10 < length) {
                int i14 = size[i10];
                outPosition[i13] = Math.round(f10);
                f10 += i14;
                i10++;
                i13++;
            }
            return;
        }
        int length2 = size.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i15 = size[length2];
            outPosition[length2] = Math.round(f10);
            f10 += i15;
        }
    }

    public final void h(int[] size, int[] outPosition, boolean reverseInput) {
        int i10 = 0;
        if (!reverseInput) {
            int length = size.length;
            int i11 = 0;
            int i12 = 0;
            while (i10 < length) {
                int i13 = size[i10];
                outPosition[i11] = i12;
                i12 += i13;
                i10++;
                i11++;
            }
            return;
        }
        int length2 = size.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i14 = size[length2];
            outPosition[length2] = i10;
            i10 += i14;
        }
    }

    public final void i(int totalSize, int[] size, int[] outPosition, boolean reverseInput) {
        int i10 = 0;
        int i11 = 0;
        for (int i12 : size) {
            i11 += i12;
        }
        int i13 = totalSize - i11;
        if (!reverseInput) {
            int length = size.length;
            int i14 = 0;
            while (i10 < length) {
                int i15 = size[i10];
                outPosition[i14] = i13;
                i13 += i15;
                i10++;
                i14++;
            }
            return;
        }
        int length2 = size.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i16 = size[length2];
            outPosition[length2] = i13;
            i13 += i16;
        }
    }

    public final void j(int totalSize, int[] size, int[] outPosition, boolean reverseInput) {
        int i10 = 0;
        int i11 = 0;
        for (int i12 : size) {
            i11 += i12;
        }
        float length = !(size.length == 0) ? (totalSize - i11) / size.length : 0.0f;
        float f10 = length / 2;
        if (reverseInput) {
            for (int length2 = size.length - 1; -1 < length2; length2--) {
                int i13 = size[length2];
                outPosition[length2] = Math.round(f10);
                f10 += i13 + length;
            }
            return;
        }
        int length3 = size.length;
        int i14 = 0;
        while (i10 < length3) {
            int i15 = size[i10];
            outPosition[i14] = Math.round(f10);
            f10 += i15 + length;
            i10++;
            i14++;
        }
    }

    public final void k(int totalSize, int[] size, int[] outPosition, boolean reverseInput) {
        if (size.length == 0) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        for (int i12 : size) {
            i11 += i12;
        }
        float fMax = (totalSize - i11) / Math.max(C3831l.a0(size), 1);
        float f10 = (reverseInput && size.length == 1) ? fMax : 0.0f;
        if (reverseInput) {
            for (int length = size.length - 1; -1 < length; length--) {
                int i13 = size[length];
                outPosition[length] = Math.round(f10);
                f10 += i13 + fMax;
            }
            return;
        }
        int length2 = size.length;
        int i14 = 0;
        while (i10 < length2) {
            int i15 = size[i10];
            outPosition[i14] = Math.round(f10);
            f10 += i15 + fMax;
            i10++;
            i14++;
        }
    }

    public final void l(int totalSize, int[] size, int[] outPosition, boolean reverseInput) {
        int i10 = 0;
        int i11 = 0;
        for (int i12 : size) {
            i11 += i12;
        }
        float length = (totalSize - i11) / (size.length + 1);
        if (reverseInput) {
            float f10 = length;
            for (int length2 = size.length - 1; -1 < length2; length2--) {
                int i13 = size[length2];
                outPosition[length2] = Math.round(f10);
                f10 += i13 + length;
            }
            return;
        }
        int length3 = size.length;
        float f11 = length;
        int i14 = 0;
        while (i10 < length3) {
            int i15 = size[i10];
            outPosition[i14] = Math.round(f11);
            f11 += i15 + length;
            i10++;
            i14++;
        }
    }

    public final e m(float space) {
        return new i(space, true, m.f71B, null);
    }
}
