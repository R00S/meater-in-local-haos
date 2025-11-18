package p345i.p346a.p347g.p348s;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'f' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: DNSState.java */
/* renamed from: i.a.g.s.g */
/* loaded from: classes2.dex */
public final class EnumC9212g {

    /* renamed from: f */
    public static final EnumC9212g f35572f;

    /* renamed from: g */
    public static final EnumC9212g f35573g;

    /* renamed from: h */
    public static final EnumC9212g f35574h;

    /* renamed from: i */
    public static final EnumC9212g f35575i;

    /* renamed from: j */
    public static final EnumC9212g f35576j;

    /* renamed from: k */
    public static final EnumC9212g f35577k;

    /* renamed from: l */
    public static final EnumC9212g f35578l;

    /* renamed from: m */
    public static final EnumC9212g f35579m;

    /* renamed from: n */
    public static final EnumC9212g f35580n;

    /* renamed from: o */
    public static final EnumC9212g f35581o;

    /* renamed from: p */
    public static final EnumC9212g f35582p;

    /* renamed from: q */
    public static final EnumC9212g f35583q;

    /* renamed from: r */
    private static final /* synthetic */ EnumC9212g[] f35584r;

    /* renamed from: s */
    private final String f35585s;

    /* renamed from: t */
    private final b f35586t;

    /* compiled from: DNSState.java */
    /* renamed from: i.a.g.s.g$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f35587a;

        static {
            int[] iArr = new int[EnumC9212g.values().length];
            f35587a = iArr;
            try {
                iArr[EnumC9212g.f35572f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35587a[EnumC9212g.f35573g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35587a[EnumC9212g.f35574h.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35587a[EnumC9212g.f35575i.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35587a[EnumC9212g.f35576j.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f35587a[EnumC9212g.f35577k.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f35587a[EnumC9212g.f35578l.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f35587a[EnumC9212g.f35579m.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f35587a[EnumC9212g.f35580n.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f35587a[EnumC9212g.f35581o.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f35587a[EnumC9212g.f35582p.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f35587a[EnumC9212g.f35583q.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* compiled from: DNSState.java */
    /* renamed from: i.a.g.s.g$b */
    private enum b {
        probing,
        announcing,
        announced,
        canceling,
        canceled,
        closing,
        closed
    }

    static {
        b bVar = b.probing;
        EnumC9212g enumC9212g = new EnumC9212g("PROBING_1", 0, "probing 1", bVar);
        f35572f = enumC9212g;
        EnumC9212g enumC9212g2 = new EnumC9212g("PROBING_2", 1, "probing 2", bVar);
        f35573g = enumC9212g2;
        EnumC9212g enumC9212g3 = new EnumC9212g("PROBING_3", 2, "probing 3", bVar);
        f35574h = enumC9212g3;
        b bVar2 = b.announcing;
        EnumC9212g enumC9212g4 = new EnumC9212g("ANNOUNCING_1", 3, "announcing 1", bVar2);
        f35575i = enumC9212g4;
        EnumC9212g enumC9212g5 = new EnumC9212g("ANNOUNCING_2", 4, "announcing 2", bVar2);
        f35576j = enumC9212g5;
        EnumC9212g enumC9212g6 = new EnumC9212g("ANNOUNCED", 5, "announced", b.announced);
        f35577k = enumC9212g6;
        b bVar3 = b.canceling;
        EnumC9212g enumC9212g7 = new EnumC9212g("CANCELING_1", 6, "canceling 1", bVar3);
        f35578l = enumC9212g7;
        EnumC9212g enumC9212g8 = new EnumC9212g("CANCELING_2", 7, "canceling 2", bVar3);
        f35579m = enumC9212g8;
        EnumC9212g enumC9212g9 = new EnumC9212g("CANCELING_3", 8, "canceling 3", bVar3);
        f35580n = enumC9212g9;
        EnumC9212g enumC9212g10 = new EnumC9212g("CANCELED", 9, "canceled", b.canceled);
        f35581o = enumC9212g10;
        EnumC9212g enumC9212g11 = new EnumC9212g("CLOSING", 10, "closing", b.closing);
        f35582p = enumC9212g11;
        EnumC9212g enumC9212g12 = new EnumC9212g("CLOSED", 11, "closed", b.closed);
        f35583q = enumC9212g12;
        f35584r = new EnumC9212g[]{enumC9212g, enumC9212g2, enumC9212g3, enumC9212g4, enumC9212g5, enumC9212g6, enumC9212g7, enumC9212g8, enumC9212g9, enumC9212g10, enumC9212g11, enumC9212g12};
    }

    private EnumC9212g(String str, int i2, String str2, b bVar) {
        this.f35585s = str2;
        this.f35586t = bVar;
    }

    public static EnumC9212g valueOf(String str) {
        return (EnumC9212g) Enum.valueOf(EnumC9212g.class, str);
    }

    public static EnumC9212g[] values() {
        return (EnumC9212g[]) f35584r.clone();
    }

    /* renamed from: A */
    public final boolean m29758A() {
        return this.f35586t == b.probing;
    }

    /* renamed from: D */
    public final EnumC9212g m29759D() {
        switch (a.f35587a[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return f35572f;
            case 7:
            case 8:
            case 9:
                return f35578l;
            case 10:
                return f35581o;
            case 11:
                return f35582p;
            case 12:
                return f35583q;
            default:
                return this;
        }
    }

    /* renamed from: g */
    public final EnumC9212g m29760g() {
        switch (a.f35587a[ordinal()]) {
            case 1:
                return f35573g;
            case 2:
                return f35574h;
            case 3:
                return f35575i;
            case 4:
                return f35576j;
            case 5:
                return f35577k;
            case 6:
                return f35577k;
            case 7:
                return f35579m;
            case 8:
                return f35580n;
            case 9:
                return f35581o;
            case 10:
                return f35581o;
            case 11:
                return f35583q;
            case 12:
                return f35583q;
            default:
                return this;
        }
    }

    /* renamed from: k */
    public final boolean m29761k() {
        return this.f35586t == b.announced;
    }

    /* renamed from: q */
    public final boolean m29762q() {
        return this.f35586t == b.announcing;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f35585s;
    }

    /* renamed from: u */
    public final boolean m29763u() {
        return this.f35586t == b.canceled;
    }

    /* renamed from: v */
    public final boolean m29764v() {
        return this.f35586t == b.canceling;
    }

    /* renamed from: x */
    public final boolean m29765x() {
        return this.f35586t == b.closed;
    }

    /* renamed from: y */
    public final boolean m29766y() {
        return this.f35586t == b.closing;
    }
}
