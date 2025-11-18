package fc;

import kotlin.Metadata;
import va.C4929b;
import va.InterfaceC4928a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Select.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lfc/d;", "", "<init>", "(Ljava/lang/String;I)V", "B", "C", "D", "E", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: fc.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC3368d {

    /* renamed from: B, reason: collision with root package name */
    public static final EnumC3368d f41471B = new EnumC3368d("SUCCESSFUL", 0);

    /* renamed from: C, reason: collision with root package name */
    public static final EnumC3368d f41472C = new EnumC3368d("REREGISTER", 1);

    /* renamed from: D, reason: collision with root package name */
    public static final EnumC3368d f41473D = new EnumC3368d("CANCELLED", 2);

    /* renamed from: E, reason: collision with root package name */
    public static final EnumC3368d f41474E = new EnumC3368d("ALREADY_SELECTED", 3);

    /* renamed from: F, reason: collision with root package name */
    private static final /* synthetic */ EnumC3368d[] f41475F;

    /* renamed from: G, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4928a f41476G;

    static {
        EnumC3368d[] enumC3368dArrC = c();
        f41475F = enumC3368dArrC;
        f41476G = C4929b.a(enumC3368dArrC);
    }

    private EnumC3368d(String str, int i10) {
    }

    private static final /* synthetic */ EnumC3368d[] c() {
        return new EnumC3368d[]{f41471B, f41472C, f41473D, f41474E};
    }

    public static EnumC3368d valueOf(String str) {
        return (EnumC3368d) Enum.valueOf(EnumC3368d.class, str);
    }

    public static EnumC3368d[] values() {
        return (EnumC3368d[]) f41475F.clone();
    }
}
