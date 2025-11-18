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
/* renamed from: kotlin.f0.y.e.j0.b.n */
/* loaded from: classes2.dex */
public final class EnumC9920n {

    /* renamed from: f */
    public static final EnumC9920n f37620f;

    /* renamed from: g */
    public static final EnumC9920n f37621g;

    /* renamed from: h */
    public static final EnumC9920n f37622h;

    /* renamed from: i */
    public static final EnumC9920n f37623i;

    /* renamed from: j */
    private static final /* synthetic */ EnumC9920n[] f37624j;

    /* renamed from: k */
    private final C10159b f37625k;

    /* renamed from: l */
    private final C10163f f37626l;

    /* renamed from: m */
    private final C10159b f37627m;

    static {
        C10159b c10159bM35406e = C10159b.m35406e("kotlin/UByte");
        C9801m.m32345e(c10159bM35406e, "fromString(\"kotlin/UByte\")");
        f37620f = new EnumC9920n("UBYTE", 0, c10159bM35406e);
        C10159b c10159bM35406e2 = C10159b.m35406e("kotlin/UShort");
        C9801m.m32345e(c10159bM35406e2, "fromString(\"kotlin/UShort\")");
        f37621g = new EnumC9920n("USHORT", 1, c10159bM35406e2);
        C10159b c10159bM35406e3 = C10159b.m35406e("kotlin/UInt");
        C9801m.m32345e(c10159bM35406e3, "fromString(\"kotlin/UInt\")");
        f37622h = new EnumC9920n("UINT", 2, c10159bM35406e3);
        C10159b c10159bM35406e4 = C10159b.m35406e("kotlin/ULong");
        C9801m.m32345e(c10159bM35406e4, "fromString(\"kotlin/ULong\")");
        f37623i = new EnumC9920n("ULONG", 3, c10159bM35406e4);
        f37624j = m32840g();
    }

    private EnumC9920n(String str, int i2, C10159b c10159b) {
        this.f37625k = c10159b;
        C10163f c10163fM35415j = c10159b.m35415j();
        C9801m.m32345e(c10163fM35415j, "classId.shortClassName");
        this.f37626l = c10163fM35415j;
        this.f37627m = new C10159b(c10159b.m35413h(), C10163f.m35454x(c10163fM35415j.m35455k() + "Array"));
    }

    /* renamed from: g */
    private static final /* synthetic */ EnumC9920n[] m32840g() {
        return new EnumC9920n[]{f37620f, f37621g, f37622h, f37623i};
    }

    public static EnumC9920n valueOf(String str) {
        return (EnumC9920n) Enum.valueOf(EnumC9920n.class, str);
    }

    public static EnumC9920n[] values() {
        return (EnumC9920n[]) f37624j.clone();
    }

    /* renamed from: k */
    public final C10159b m32841k() {
        return this.f37627m;
    }

    /* renamed from: q */
    public final C10159b m32842q() {
        return this.f37625k;
    }

    /* renamed from: u */
    public final C10163f m32843u() {
        return this.f37626l;
    }
}
