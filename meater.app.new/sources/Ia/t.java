package Ia;

import kotlin.Metadata;
import va.C4929b;
import va.InterfaceC4928a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: KVariance.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"LIa/t;", "", "<init>", "(Ljava/lang/String;I)V", "B", "C", "D", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class t {

    /* renamed from: B, reason: collision with root package name */
    public static final t f6946B = new t("INVARIANT", 0);

    /* renamed from: C, reason: collision with root package name */
    public static final t f6947C = new t("IN", 1);

    /* renamed from: D, reason: collision with root package name */
    public static final t f6948D = new t("OUT", 2);

    /* renamed from: E, reason: collision with root package name */
    private static final /* synthetic */ t[] f6949E;

    /* renamed from: F, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4928a f6950F;

    static {
        t[] tVarArrC = c();
        f6949E = tVarArrC;
        f6950F = C4929b.a(tVarArrC);
    }

    private t(String str, int i10) {
    }

    private static final /* synthetic */ t[] c() {
        return new t[]{f6946B, f6947C, f6948D};
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) f6949E.clone();
    }
}
