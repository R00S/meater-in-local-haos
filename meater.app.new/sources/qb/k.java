package qb;

import va.C4929b;
import va.InterfaceC4928a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FqNamesUtil.kt */
/* loaded from: classes3.dex */
final class k {

    /* renamed from: B, reason: collision with root package name */
    public static final k f48306B = new k("BEGINNING", 0);

    /* renamed from: C, reason: collision with root package name */
    public static final k f48307C = new k("MIDDLE", 1);

    /* renamed from: D, reason: collision with root package name */
    public static final k f48308D = new k("AFTER_DOT", 2);

    /* renamed from: E, reason: collision with root package name */
    private static final /* synthetic */ k[] f48309E;

    /* renamed from: F, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4928a f48310F;

    static {
        k[] kVarArrC = c();
        f48309E = kVarArrC;
        f48310F = C4929b.a(kVarArrC);
    }

    private k(String str, int i10) {
    }

    private static final /* synthetic */ k[] c() {
        return new k[]{f48306B, f48307C, f48308D};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f48309E.clone();
    }
}
