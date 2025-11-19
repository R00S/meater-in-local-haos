package m6;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 m6.b, still in use, count: 1, list:
  (r0v0 m6.b) from 0x001a: SPUT (r0v0 m6.b) (LINE:27) m6.b.D m6.b
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: DecodeFormat.java */
/* renamed from: m6.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC3967b {
    PREFER_ARGB_8888,
    PREFER_RGB_565;


    /* renamed from: D, reason: collision with root package name */
    public static final EnumC3967b f45111D = new EnumC3967b();

    static {
    }

    private EnumC3967b() {
    }

    public static EnumC3967b valueOf(String str) {
        return (EnumC3967b) Enum.valueOf(EnumC3967b.class, str);
    }

    public static EnumC3967b[] values() {
        return (EnumC3967b[]) f45112E.clone();
    }
}
