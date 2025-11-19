package ua;

import kotlin.Metadata;
import va.C4929b;
import va.InterfaceC4928a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Intrinsics.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0081\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lua/a;", "", "<init>", "(Ljava/lang/String;I)V", "B", "C", "D", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ua.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC4695a {

    /* renamed from: B, reason: collision with root package name */
    public static final EnumC4695a f50511B = new EnumC4695a("COROUTINE_SUSPENDED", 0);

    /* renamed from: C, reason: collision with root package name */
    public static final EnumC4695a f50512C = new EnumC4695a("UNDECIDED", 1);

    /* renamed from: D, reason: collision with root package name */
    public static final EnumC4695a f50513D = new EnumC4695a("RESUMED", 2);

    /* renamed from: E, reason: collision with root package name */
    private static final /* synthetic */ EnumC4695a[] f50514E;

    /* renamed from: F, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4928a f50515F;

    static {
        EnumC4695a[] enumC4695aArrC = c();
        f50514E = enumC4695aArrC;
        f50515F = C4929b.a(enumC4695aArrC);
    }

    private EnumC4695a(String str, int i10) {
    }

    private static final /* synthetic */ EnumC4695a[] c() {
        return new EnumC4695a[]{f50511B, f50512C, f50513D};
    }

    public static EnumC4695a valueOf(String str) {
        return (EnumC4695a) Enum.valueOf(EnumC4695a.class, str);
    }

    public static EnumC4695a[] values() {
        return (EnumC4695a[]) f50514E.clone();
    }
}
