package Jb;

import va.C4929b;
import va.InterfaceC4928a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ErrorEntity.kt */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: C, reason: collision with root package name */
    public static final b f7659C = new b("ERROR_CLASS", 0, "<Error class: %s>");

    /* renamed from: D, reason: collision with root package name */
    public static final b f7660D = new b("ERROR_FUNCTION", 1, "<Error function>");

    /* renamed from: E, reason: collision with root package name */
    public static final b f7661E = new b("ERROR_SCOPE", 2, "<Error scope>");

    /* renamed from: F, reason: collision with root package name */
    public static final b f7662F = new b("ERROR_MODULE", 3, "<Error module>");

    /* renamed from: G, reason: collision with root package name */
    public static final b f7663G = new b("ERROR_PROPERTY", 4, "<Error property>");

    /* renamed from: H, reason: collision with root package name */
    public static final b f7664H = new b("ERROR_TYPE", 5, "[Error type: %s]");

    /* renamed from: I, reason: collision with root package name */
    public static final b f7665I = new b("PARENT_OF_ERROR_SCOPE", 6, "<Fake parent for error lexical scope>");

    /* renamed from: J, reason: collision with root package name */
    private static final /* synthetic */ b[] f7666J;

    /* renamed from: K, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4928a f7667K;

    /* renamed from: B, reason: collision with root package name */
    private final String f7668B;

    static {
        b[] bVarArrC = c();
        f7666J = bVarArrC;
        f7667K = C4929b.a(bVarArrC);
    }

    private b(String str, int i10, String str2) {
        this.f7668B = str2;
    }

    private static final /* synthetic */ b[] c() {
        return new b[]{f7659C, f7660D, f7661E, f7662F, f7663G, f7664H, f7665I};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f7666J.clone();
    }

    public final String j() {
        return this.f7668B;
    }
}
