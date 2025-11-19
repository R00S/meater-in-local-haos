package ab;

import kotlin.jvm.internal.C3854k;
import va.C4929b;
import va.InterfaceC4928a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ReportLevel.kt */
/* renamed from: ab.O, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC1934O {

    /* renamed from: C, reason: collision with root package name */
    public static final a f20194C;

    /* renamed from: D, reason: collision with root package name */
    public static final EnumC1934O f20195D = new EnumC1934O("IGNORE", 0, "ignore");

    /* renamed from: E, reason: collision with root package name */
    public static final EnumC1934O f20196E = new EnumC1934O("WARN", 1, "warn");

    /* renamed from: F, reason: collision with root package name */
    public static final EnumC1934O f20197F = new EnumC1934O("STRICT", 2, "strict");

    /* renamed from: G, reason: collision with root package name */
    private static final /* synthetic */ EnumC1934O[] f20198G;

    /* renamed from: H, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4928a f20199H;

    /* renamed from: B, reason: collision with root package name */
    private final String f20200B;

    /* compiled from: ReportLevel.kt */
    /* renamed from: ab.O$a */
    public static final class a {
        public /* synthetic */ a(C3854k c3854k) {
            this();
        }

        private a() {
        }
    }

    static {
        EnumC1934O[] enumC1934OArrC = c();
        f20198G = enumC1934OArrC;
        f20199H = C4929b.a(enumC1934OArrC);
        f20194C = new a(null);
    }

    private EnumC1934O(String str, int i10, String str2) {
        this.f20200B = str2;
    }

    private static final /* synthetic */ EnumC1934O[] c() {
        return new EnumC1934O[]{f20195D, f20196E, f20197F};
    }

    public static EnumC1934O valueOf(String str) {
        return (EnumC1934O) Enum.valueOf(EnumC1934O.class, str);
    }

    public static EnumC1934O[] values() {
        return (EnumC1934O[]) f20198G.clone();
    }

    public final String j() {
        return this.f20200B;
    }

    public final boolean n() {
        return this == f20195D;
    }

    public final boolean p() {
        return this == f20196E;
    }
}
