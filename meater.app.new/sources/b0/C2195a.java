package b0;

import b0.BiasAbsoluteAlignment;
import b0.c;
import kotlin.Metadata;

/* compiled from: Alignment.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR \u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u0012\u0004\b\r\u0010\u0003\u001a\u0004\b\f\u0010\bR \u0010\u0012\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0006\u0012\u0004\b\u0011\u0010\u0003\u001a\u0004\b\u0010\u0010\bR \u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0006\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0014\u0010\bR \u0010\u001a\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u0006\u0012\u0004\b\u0019\u0010\u0003\u001a\u0004\b\u0018\u0010\bR \u0010\u001e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u0006\u0012\u0004\b\u001d\u0010\u0003\u001a\u0004\b\u001c\u0010\bR \u0010%\u001a\u00020\u001f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010!\u0012\u0004\b$\u0010\u0003\u001a\u0004\b\"\u0010#R \u0010(\u001a\u00020\u001f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010!\u0012\u0004\b'\u0010\u0003\u001a\u0004\b\u0005\u0010#¨\u0006)"}, d2 = {"Lb0/a;", "", "<init>", "()V", "Lb0/c;", "b", "Lb0/c;", "getTopLeft", "()Lb0/c;", "getTopLeft$annotations", "TopLeft", "c", "getTopRight", "getTopRight$annotations", "TopRight", "d", "getCenterLeft", "getCenterLeft$annotations", "CenterLeft", "e", "getCenterRight", "getCenterRight$annotations", "CenterRight", "f", "getBottomLeft", "getBottomLeft$annotations", "BottomLeft", "g", "getBottomRight", "getBottomRight$annotations", "BottomRight", "Lb0/c$b;", "h", "Lb0/c$b;", "a", "()Lb0/c$b;", "getLeft$annotations", "Left", "i", "getRight$annotations", "Right", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: b0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2195a {

    /* renamed from: a, reason: collision with root package name */
    public static final C2195a f29878a = new C2195a();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final c TopLeft = new BiasAbsoluteAlignment(-1.0f, -1.0f);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final c TopRight = new BiasAbsoluteAlignment(1.0f, -1.0f);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final c CenterLeft = new BiasAbsoluteAlignment(-1.0f, 0.0f);

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final c CenterRight = new BiasAbsoluteAlignment(1.0f, 0.0f);

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final c BottomLeft = new BiasAbsoluteAlignment(-1.0f, 1.0f);

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final c BottomRight = new BiasAbsoluteAlignment(1.0f, 1.0f);

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final c.b Left = new BiasAbsoluteAlignment.Horizontal(-1.0f);

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final c.b Right = new BiasAbsoluteAlignment.Horizontal(1.0f);

    private C2195a() {
    }

    public final c.b a() {
        return Left;
    }

    public final c.b b() {
        return Right;
    }
}
