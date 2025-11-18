package M;

import kotlin.AbstractC1341l;
import kotlin.C1312E;
import kotlin.FontWeight;
import kotlin.Metadata;

/* compiled from: TypefaceTokens.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0013\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\n\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\r\u0010\u0010¨\u0006\u0016"}, d2 = {"LM/t;", "", "<init>", "()V", "LL0/E;", "b", "LL0/E;", "a", "()LL0/E;", "Brand", "c", "Plain", "LL0/B;", "d", "LL0/B;", "getWeightBold", "()LL0/B;", "WeightBold", "e", "WeightMedium", "f", "WeightRegular", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final t f11815a = new t();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final C1312E Brand;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final C1312E Plain;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final FontWeight WeightBold;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final FontWeight WeightMedium;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final FontWeight WeightRegular;

    static {
        AbstractC1341l.Companion companion = AbstractC1341l.INSTANCE;
        Brand = companion.b();
        Plain = companion.b();
        FontWeight.Companion companion2 = FontWeight.INSTANCE;
        WeightBold = companion2.a();
        WeightMedium = companion2.c();
        WeightRegular = companion2.d();
    }

    private t() {
    }

    public final C1312E a() {
        return Brand;
    }

    public final C1312E b() {
        return Plain;
    }

    public final FontWeight c() {
        return WeightMedium;
    }

    public final FontWeight d() {
        return WeightRegular;
    }
}
