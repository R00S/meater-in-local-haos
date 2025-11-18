package kotlin;

import i0.C3602t0;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;

/* compiled from: ColorScheme.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u000e\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B§\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0006\u0010 \u001a\u00020\u0002\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\u0006\u0010\"\u001a\u00020\u0002\u0012\u0006\u0010#\u001a\u00020\u0002\u0012\u0006\u0010$\u001a\u00020\u0002\u0012\u0006\u0010%\u001a\u00020\u0002\u0012\u0006\u0010&\u001a\u00020\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b1\u0010/R\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b2\u0010-\u001a\u0004\b3\u0010/R\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b4\u0010-\u001a\u0004\b5\u0010/R\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b6\u0010-\u001a\u0004\b7\u0010/R\u001d\u0010\b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b8\u0010-\u001a\u0004\b9\u0010/R\u001d\u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b:\u0010-\u001a\u0004\b;\u0010/R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b<\u0010-\u001a\u0004\b=\u0010/R\u001d\u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b>\u0010-\u001a\u0004\b?\u0010/R\u001d\u0010\f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b@\u0010-\u001a\u0004\bA\u0010/R\u001d\u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b7\u0010-\u001a\u0004\bB\u0010/R\u001d\u0010\u000e\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bC\u0010-\u001a\u0004\bD\u0010/R\u001d\u0010\u000f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bE\u0010-\u001a\u0004\bF\u0010/R\u001d\u0010\u0010\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bG\u0010-\u001a\u0004\b,\u0010/R\u001d\u0010\u0011\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bH\u0010-\u001a\u0004\bE\u0010/R\u001d\u0010\u0012\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\bI\u0010/R\u001d\u0010\u0013\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b5\u0010-\u001a\u0004\bJ\u0010/R\u001d\u0010\u0014\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b;\u0010-\u001a\u0004\bK\u0010/R\u001d\u0010\u0015\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b?\u0010-\u001a\u0004\bL\u0010/R\u001d\u0010\u0016\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bJ\u0010-\u001a\u0004\bM\u0010/R\u001d\u0010\u0017\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bL\u0010-\u001a\u0004\bC\u0010/R\u001d\u0010\u0018\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bB\u0010-\u001a\u0004\b@\u0010/R\u001d\u0010\u0019\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bF\u0010-\u001a\u0004\b<\u0010/R\u001d\u0010\u001a\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bN\u0010-\u001a\u0004\bG\u0010/R\u001d\u0010\u001b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bO\u0010-\u001a\u0004\b>\u0010/R\u001d\u0010\u001c\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b.\u0010-\u001a\u0004\bH\u0010/R\u001d\u0010\u001d\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b3\u0010-\u001a\u0004\bN\u0010/R\u001d\u0010\u001e\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bP\u0010-\u001a\u0004\bO\u0010/R\u001d\u0010\u001f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b9\u0010-\u001a\u0004\bP\u0010/R\u001d\u0010 \u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b=\u0010-\u001a\u0004\bQ\u0010/R\u001d\u0010!\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bI\u0010-\u001a\u0004\bR\u0010/R\u001d\u0010\"\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bQ\u0010-\u001a\u0004\bS\u0010/R\u001d\u0010#\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bS\u0010-\u001a\u0004\bT\u0010/R\u001d\u0010$\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bT\u0010-\u001a\u0004\bU\u0010/R\u001d\u0010%\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bU\u0010-\u001a\u0004\b-\u0010/R\u001d\u0010&\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b-\u0010-\u001a\u0004\bV\u0010/R$\u0010\\\u001a\u0004\u0018\u00010W8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bV\u0010X\u001a\u0004\b0\u0010Y\"\u0004\bZ\u0010[R$\u0010^\u001a\u0004\u0018\u00010W8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bR\u0010X\u001a\u0004\b8\u0010Y\"\u0004\b]\u0010[R$\u0010d\u001a\u0004\u0018\u00010_8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bM\u0010`\u001a\u0004\b2\u0010a\"\u0004\bb\u0010cR*\u0010l\u001a\u0004\u0018\u00010e8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0004\bK\u0010f\u0012\u0004\bj\u0010k\u001a\u0004\b:\u0010g\"\u0004\bh\u0010iR$\u0010r\u001a\u0004\u0018\u00010m8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bA\u0010n\u001a\u0004\b4\u0010o\"\u0004\bp\u0010qR$\u0010x\u001a\u0004\u0018\u00010s8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bD\u0010t\u001a\u0004\b6\u0010u\"\u0004\bv\u0010w\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006y"}, d2 = {"LK/o;", "", "Li0/t0;", "primary", "onPrimary", "primaryContainer", "onPrimaryContainer", "inversePrimary", "secondary", "onSecondary", "secondaryContainer", "onSecondaryContainer", "tertiary", "onTertiary", "tertiaryContainer", "onTertiaryContainer", "background", "onBackground", "surface", "onSurface", "surfaceVariant", "onSurfaceVariant", "surfaceTint", "inverseSurface", "inverseOnSurface", "error", "onError", "errorContainer", "onErrorContainer", "outline", "outlineVariant", "scrim", "surfaceBright", "surfaceDim", "surfaceContainer", "surfaceContainerHigh", "surfaceContainerHighest", "surfaceContainerLow", "surfaceContainerLowest", "<init>", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/k;)V", "", "toString", "()Ljava/lang/String;", "a", "J", "z", "()J", "b", "p", "c", "A", "d", "q", "e", "k", "f", "C", "g", "r", "h", "D", "i", "s", "j", "O", "v", "l", "P", "m", "w", "n", "o", "E", "t", "N", "u", "M", "x", "y", "B", "F", "L", "G", "H", "I", "K", "LK/g;", "LK/g;", "()LK/g;", "Q", "(LK/g;)V", "defaultButtonColorsCached", "U", "defaultTextButtonColorsCached", "LK/k;", "LK/k;", "()LK/k;", "R", "(LK/k;)V", "defaultCardColorsCached", "LK/a0;", "LK/a0;", "()LK/a0;", "V", "(LK/a0;)V", "getDefaultTopAppBarColorsCached$material3_release$annotations", "()V", "defaultTopAppBarColorsCached", "LK/y;", "LK/y;", "()LK/y;", "S", "(LK/y;)V", "defaultIconButtonColorsCached", "LK/F;", "LK/F;", "()LK/F;", "T", "(LK/F;)V", "defaultMenuItemColorsCached", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: K.o, reason: case insensitive filesystem and from toString */
/* loaded from: classes.dex */
public final class ColorScheme {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata and from toString */
    private final long outline;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata and from toString */
    private final long outlineVariant;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata and from toString */
    private final long scrim;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata and from toString */
    private final long surfaceBright;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata and from toString */
    private final long surfaceDim;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata and from toString */
    private final long surfaceContainer;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata and from toString */
    private final long surfaceContainerHigh;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata and from toString */
    private final long surfaceContainerHighest;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata and from toString */
    private final long surfaceContainerLow;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata and from toString */
    private final long surfaceContainerLowest;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private C1286g defaultButtonColorsCached;

    /* renamed from: L, reason: collision with root package name and from kotlin metadata */
    private C1286g defaultTextButtonColorsCached;

    /* renamed from: M, reason: collision with root package name and from kotlin metadata */
    private C1290k defaultCardColorsCached;

    /* renamed from: N, reason: collision with root package name and from kotlin metadata */
    private C1275a0 defaultTopAppBarColorsCached;

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private C1304y defaultIconButtonColorsCached;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private C1254F defaultMenuItemColorsCached;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long primary;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long onPrimary;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long primaryContainer;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final long onPrimaryContainer;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final long inversePrimary;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final long secondary;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final long onSecondary;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final long secondaryContainer;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final long onSecondaryContainer;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final long tertiary;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final long onTertiary;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final long tertiaryContainer;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final long onTertiaryContainer;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final long background;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final long onBackground;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final long surface;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final long onSurface;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final long surfaceVariant;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final long onSurfaceVariant;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final long surfaceTint;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    private final long inverseSurface;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
    private final long inverseOnSurface;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
    private final long error;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
    private final long onError;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
    private final long errorContainer;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
    private final long onErrorContainer;

    public /* synthetic */ ColorScheme(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, C3854k c3854k) {
        this(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j39, j40, j41, j42, j43, j44, j45);
    }

    /* renamed from: A, reason: from getter */
    public final long getPrimaryContainer() {
        return this.primaryContainer;
    }

    /* renamed from: B, reason: from getter */
    public final long getScrim() {
        return this.scrim;
    }

    /* renamed from: C, reason: from getter */
    public final long getSecondary() {
        return this.secondary;
    }

    /* renamed from: D, reason: from getter */
    public final long getSecondaryContainer() {
        return this.secondaryContainer;
    }

    /* renamed from: E, reason: from getter */
    public final long getSurface() {
        return this.surface;
    }

    /* renamed from: F, reason: from getter */
    public final long getSurfaceBright() {
        return this.surfaceBright;
    }

    /* renamed from: G, reason: from getter */
    public final long getSurfaceContainer() {
        return this.surfaceContainer;
    }

    /* renamed from: H, reason: from getter */
    public final long getSurfaceContainerHigh() {
        return this.surfaceContainerHigh;
    }

    /* renamed from: I, reason: from getter */
    public final long getSurfaceContainerHighest() {
        return this.surfaceContainerHighest;
    }

    /* renamed from: J, reason: from getter */
    public final long getSurfaceContainerLow() {
        return this.surfaceContainerLow;
    }

    /* renamed from: K, reason: from getter */
    public final long getSurfaceContainerLowest() {
        return this.surfaceContainerLowest;
    }

    /* renamed from: L, reason: from getter */
    public final long getSurfaceDim() {
        return this.surfaceDim;
    }

    /* renamed from: M, reason: from getter */
    public final long getSurfaceTint() {
        return this.surfaceTint;
    }

    /* renamed from: N, reason: from getter */
    public final long getSurfaceVariant() {
        return this.surfaceVariant;
    }

    /* renamed from: O, reason: from getter */
    public final long getTertiary() {
        return this.tertiary;
    }

    /* renamed from: P, reason: from getter */
    public final long getTertiaryContainer() {
        return this.tertiaryContainer;
    }

    public final void Q(C1286g c1286g) {
        this.defaultButtonColorsCached = c1286g;
    }

    public final void R(C1290k c1290k) {
        this.defaultCardColorsCached = c1290k;
    }

    public final void S(C1304y c1304y) {
        this.defaultIconButtonColorsCached = c1304y;
    }

    public final void T(C1254F c1254f) {
        this.defaultMenuItemColorsCached = c1254f;
    }

    public final void U(C1286g c1286g) {
        this.defaultTextButtonColorsCached = c1286g;
    }

    public final void V(C1275a0 c1275a0) {
        this.defaultTopAppBarColorsCached = c1275a0;
    }

    /* renamed from: a, reason: from getter */
    public final long getBackground() {
        return this.background;
    }

    /* renamed from: b, reason: from getter */
    public final C1286g getDefaultButtonColorsCached() {
        return this.defaultButtonColorsCached;
    }

    /* renamed from: c, reason: from getter */
    public final C1290k getDefaultCardColorsCached() {
        return this.defaultCardColorsCached;
    }

    /* renamed from: d, reason: from getter */
    public final C1304y getDefaultIconButtonColorsCached() {
        return this.defaultIconButtonColorsCached;
    }

    /* renamed from: e, reason: from getter */
    public final C1254F getDefaultMenuItemColorsCached() {
        return this.defaultMenuItemColorsCached;
    }

    /* renamed from: f, reason: from getter */
    public final C1286g getDefaultTextButtonColorsCached() {
        return this.defaultTextButtonColorsCached;
    }

    /* renamed from: g, reason: from getter */
    public final C1275a0 getDefaultTopAppBarColorsCached() {
        return this.defaultTopAppBarColorsCached;
    }

    /* renamed from: h, reason: from getter */
    public final long getError() {
        return this.error;
    }

    /* renamed from: i, reason: from getter */
    public final long getErrorContainer() {
        return this.errorContainer;
    }

    /* renamed from: j, reason: from getter */
    public final long getInverseOnSurface() {
        return this.inverseOnSurface;
    }

    /* renamed from: k, reason: from getter */
    public final long getInversePrimary() {
        return this.inversePrimary;
    }

    /* renamed from: l, reason: from getter */
    public final long getInverseSurface() {
        return this.inverseSurface;
    }

    /* renamed from: m, reason: from getter */
    public final long getOnBackground() {
        return this.onBackground;
    }

    /* renamed from: n, reason: from getter */
    public final long getOnError() {
        return this.onError;
    }

    /* renamed from: o, reason: from getter */
    public final long getOnErrorContainer() {
        return this.onErrorContainer;
    }

    /* renamed from: p, reason: from getter */
    public final long getOnPrimary() {
        return this.onPrimary;
    }

    /* renamed from: q, reason: from getter */
    public final long getOnPrimaryContainer() {
        return this.onPrimaryContainer;
    }

    /* renamed from: r, reason: from getter */
    public final long getOnSecondary() {
        return this.onSecondary;
    }

    /* renamed from: s, reason: from getter */
    public final long getOnSecondaryContainer() {
        return this.onSecondaryContainer;
    }

    /* renamed from: t, reason: from getter */
    public final long getOnSurface() {
        return this.onSurface;
    }

    public String toString() {
        return "ColorScheme(primary=" + ((Object) C3602t0.t(this.primary)) + "onPrimary=" + ((Object) C3602t0.t(this.onPrimary)) + "primaryContainer=" + ((Object) C3602t0.t(this.primaryContainer)) + "onPrimaryContainer=" + ((Object) C3602t0.t(this.onPrimaryContainer)) + "inversePrimary=" + ((Object) C3602t0.t(this.inversePrimary)) + "secondary=" + ((Object) C3602t0.t(this.secondary)) + "onSecondary=" + ((Object) C3602t0.t(this.onSecondary)) + "secondaryContainer=" + ((Object) C3602t0.t(this.secondaryContainer)) + "onSecondaryContainer=" + ((Object) C3602t0.t(this.onSecondaryContainer)) + "tertiary=" + ((Object) C3602t0.t(this.tertiary)) + "onTertiary=" + ((Object) C3602t0.t(this.onTertiary)) + "tertiaryContainer=" + ((Object) C3602t0.t(this.tertiaryContainer)) + "onTertiaryContainer=" + ((Object) C3602t0.t(this.onTertiaryContainer)) + "background=" + ((Object) C3602t0.t(this.background)) + "onBackground=" + ((Object) C3602t0.t(this.onBackground)) + "surface=" + ((Object) C3602t0.t(this.surface)) + "onSurface=" + ((Object) C3602t0.t(this.onSurface)) + "surfaceVariant=" + ((Object) C3602t0.t(this.surfaceVariant)) + "onSurfaceVariant=" + ((Object) C3602t0.t(this.onSurfaceVariant)) + "surfaceTint=" + ((Object) C3602t0.t(this.surfaceTint)) + "inverseSurface=" + ((Object) C3602t0.t(this.inverseSurface)) + "inverseOnSurface=" + ((Object) C3602t0.t(this.inverseOnSurface)) + "error=" + ((Object) C3602t0.t(this.error)) + "onError=" + ((Object) C3602t0.t(this.onError)) + "errorContainer=" + ((Object) C3602t0.t(this.errorContainer)) + "onErrorContainer=" + ((Object) C3602t0.t(this.onErrorContainer)) + "outline=" + ((Object) C3602t0.t(this.outline)) + "outlineVariant=" + ((Object) C3602t0.t(this.outlineVariant)) + "scrim=" + ((Object) C3602t0.t(this.scrim)) + "surfaceBright=" + ((Object) C3602t0.t(this.surfaceBright)) + "surfaceDim=" + ((Object) C3602t0.t(this.surfaceDim)) + "surfaceContainer=" + ((Object) C3602t0.t(this.surfaceContainer)) + "surfaceContainerHigh=" + ((Object) C3602t0.t(this.surfaceContainerHigh)) + "surfaceContainerHighest=" + ((Object) C3602t0.t(this.surfaceContainerHighest)) + "surfaceContainerLow=" + ((Object) C3602t0.t(this.surfaceContainerLow)) + "surfaceContainerLowest=" + ((Object) C3602t0.t(this.surfaceContainerLowest)) + ')';
    }

    /* renamed from: u, reason: from getter */
    public final long getOnSurfaceVariant() {
        return this.onSurfaceVariant;
    }

    /* renamed from: v, reason: from getter */
    public final long getOnTertiary() {
        return this.onTertiary;
    }

    /* renamed from: w, reason: from getter */
    public final long getOnTertiaryContainer() {
        return this.onTertiaryContainer;
    }

    /* renamed from: x, reason: from getter */
    public final long getOutline() {
        return this.outline;
    }

    /* renamed from: y, reason: from getter */
    public final long getOutlineVariant() {
        return this.outlineVariant;
    }

    /* renamed from: z, reason: from getter */
    public final long getPrimary() {
        return this.primary;
    }

    private ColorScheme(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45) {
        this.primary = j10;
        this.onPrimary = j11;
        this.primaryContainer = j12;
        this.onPrimaryContainer = j13;
        this.inversePrimary = j14;
        this.secondary = j15;
        this.onSecondary = j16;
        this.secondaryContainer = j17;
        this.onSecondaryContainer = j18;
        this.tertiary = j19;
        this.onTertiary = j20;
        this.tertiaryContainer = j21;
        this.onTertiaryContainer = j22;
        this.background = j23;
        this.onBackground = j24;
        this.surface = j25;
        this.onSurface = j26;
        this.surfaceVariant = j27;
        this.onSurfaceVariant = j28;
        this.surfaceTint = j29;
        this.inverseSurface = j30;
        this.inverseOnSurface = j31;
        this.error = j32;
        this.onError = j33;
        this.errorContainer = j34;
        this.onErrorContainer = j35;
        this.outline = j36;
        this.outlineVariant = j37;
        this.scrim = j38;
        this.surfaceBright = j39;
        this.surfaceDim = j40;
        this.surfaceContainer = j41;
        this.surfaceContainerHigh = j42;
        this.surfaceContainerHighest = j43;
        this.surfaceContainerLow = j44;
        this.surfaceContainerLowest = j45;
    }
}
