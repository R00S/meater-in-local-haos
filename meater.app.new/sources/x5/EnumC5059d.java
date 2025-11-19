package x5;

import kotlin.Metadata;
import va.C4929b;
import va.InterfaceC4928a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PreparationItem.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lx5/d;", "", "", "type", "<init>", "(Ljava/lang/String;II)V", "B", "I", "getType", "()I", "C", "a", "D", "E", "F", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: x5.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC5059d {

    /* renamed from: D, reason: collision with root package name */
    public static final EnumC5059d f52830D = new EnumC5059d("TITLE", 0, 0);

    /* renamed from: E, reason: collision with root package name */
    public static final EnumC5059d f52831E = new EnumC5059d("INGREDIENT", 1, 1);

    /* renamed from: F, reason: collision with root package name */
    public static final EnumC5059d f52832F = new EnumC5059d("TOOL", 2, 2);

    /* renamed from: G, reason: collision with root package name */
    private static final /* synthetic */ EnumC5059d[] f52833G;

    /* renamed from: H, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4928a f52834H;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final int type;

    static {
        EnumC5059d[] enumC5059dArrC = c();
        f52833G = enumC5059dArrC;
        f52834H = C4929b.a(enumC5059dArrC);
        INSTANCE = new Companion(null);
    }

    private EnumC5059d(String str, int i10, int i11) {
        this.type = i11;
    }

    private static final /* synthetic */ EnumC5059d[] c() {
        return new EnumC5059d[]{f52830D, f52831E, f52832F};
    }

    public static EnumC5059d valueOf(String str) {
        return (EnumC5059d) Enum.valueOf(EnumC5059d.class, str);
    }

    public static EnumC5059d[] values() {
        return (EnumC5059d[]) f52833G.clone();
    }
}
