package J4;

import kotlin.Metadata;
import va.C4929b;
import va.InterfaceC4928a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CloudPopupWindow.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"LJ4/c;", "", "<init>", "(Ljava/lang/String;I)V", "B", "C", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: J4.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC1207c {

    /* renamed from: B, reason: collision with root package name */
    public static final EnumC1207c f7462B = new EnumC1207c("ACTION", 0);

    /* renamed from: C, reason: collision with root package name */
    public static final EnumC1207c f7463C = new EnumC1207c("INFO", 1);

    /* renamed from: D, reason: collision with root package name */
    private static final /* synthetic */ EnumC1207c[] f7464D;

    /* renamed from: E, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4928a f7465E;

    static {
        EnumC1207c[] enumC1207cArrC = c();
        f7464D = enumC1207cArrC;
        f7465E = C4929b.a(enumC1207cArrC);
    }

    private EnumC1207c(String str, int i10) {
    }

    private static final /* synthetic */ EnumC1207c[] c() {
        return new EnumC1207c[]{f7462B, f7463C};
    }

    public static EnumC1207c valueOf(String str) {
        return (EnumC1207c) Enum.valueOf(EnumC1207c.class, str);
    }

    public static EnumC1207c[] values() {
        return (EnumC1207c[]) f7464D.clone();
    }
}
