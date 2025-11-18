package kotlin.reflect.p371y.internal.p374j0.p375b;

import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10159b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'f' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: UnsignedType.kt */
/* renamed from: kotlin.f0.y.e.j0.b.m */
/* loaded from: classes2.dex */
public final class EnumC9919m {

    /* renamed from: f */
    public static final EnumC9919m f37613f;

    /* renamed from: g */
    public static final EnumC9919m f37614g;

    /* renamed from: h */
    public static final EnumC9919m f37615h;

    /* renamed from: i */
    public static final EnumC9919m f37616i;

    /* renamed from: j */
    private static final /* synthetic */ EnumC9919m[] f37617j;

    /* renamed from: k */
    private final C10159b f37618k;

    /* renamed from: l */
    private final C10163f f37619l;

    static {
        C10159b c10159bM35406e = C10159b.m35406e("kotlin/UByteArray");
        C9801m.m32345e(c10159bM35406e, "fromString(\"kotlin/UByteArray\")");
        f37613f = new EnumC9919m("UBYTEARRAY", 0, c10159bM35406e);
        C10159b c10159bM35406e2 = C10159b.m35406e("kotlin/UShortArray");
        C9801m.m32345e(c10159bM35406e2, "fromString(\"kotlin/UShortArray\")");
        f37614g = new EnumC9919m("USHORTARRAY", 1, c10159bM35406e2);
        C10159b c10159bM35406e3 = C10159b.m35406e("kotlin/UIntArray");
        C9801m.m32345e(c10159bM35406e3, "fromString(\"kotlin/UIntArray\")");
        f37615h = new EnumC9919m("UINTARRAY", 2, c10159bM35406e3);
        C10159b c10159bM35406e4 = C10159b.m35406e("kotlin/ULongArray");
        C9801m.m32345e(c10159bM35406e4, "fromString(\"kotlin/ULongArray\")");
        f37616i = new EnumC9919m("ULONGARRAY", 3, c10159bM35406e4);
        f37617j = m32838g();
    }

    private EnumC9919m(String str, int i2, C10159b c10159b) {
        this.f37618k = c10159b;
        C10163f c10163fM35415j = c10159b.m35415j();
        C9801m.m32345e(c10163fM35415j, "classId.shortClassName");
        this.f37619l = c10163fM35415j;
    }

    /* renamed from: g */
    private static final /* synthetic */ EnumC9919m[] m32838g() {
        return new EnumC9919m[]{f37613f, f37614g, f37615h, f37616i};
    }

    public static EnumC9919m valueOf(String str) {
        return (EnumC9919m) Enum.valueOf(EnumC9919m.class, str);
    }

    public static EnumC9919m[] values() {
        return (EnumC9919m[]) f37617j.clone();
    }

    /* renamed from: k */
    public final C10163f m32839k() {
        return this.f37619l;
    }
}
