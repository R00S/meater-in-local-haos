package oa;

import kotlin.Metadata;
import va.C4929b;
import va.InterfaceC4928a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Annotations.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Loa/b;", "", "<init>", "(Ljava/lang/String;I)V", "B", "C", "D", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: oa.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC4157b {

    /* renamed from: B, reason: collision with root package name */
    public static final EnumC4157b f46612B = new EnumC4157b("WARNING", 0);

    /* renamed from: C, reason: collision with root package name */
    public static final EnumC4157b f46613C = new EnumC4157b("ERROR", 1);

    /* renamed from: D, reason: collision with root package name */
    public static final EnumC4157b f46614D = new EnumC4157b("HIDDEN", 2);

    /* renamed from: E, reason: collision with root package name */
    private static final /* synthetic */ EnumC4157b[] f46615E;

    /* renamed from: F, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4928a f46616F;

    static {
        EnumC4157b[] enumC4157bArrC = c();
        f46615E = enumC4157bArrC;
        f46616F = C4929b.a(enumC4157bArrC);
    }

    private EnumC4157b(String str, int i10) {
    }

    private static final /* synthetic */ EnumC4157b[] c() {
        return new EnumC4157b[]{f46612B, f46613C, f46614D};
    }

    public static EnumC4157b valueOf(String str) {
        return (EnumC4157b) Enum.valueOf(EnumC4157b.class, str);
    }

    public static EnumC4157b[] values() {
        return (EnumC4157b[]) f46615E.clone();
    }
}
