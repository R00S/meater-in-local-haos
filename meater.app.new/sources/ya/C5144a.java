package ya;

import Fa.c;
import kotlin.Metadata;
import xa.C5082a;

/* compiled from: JDK8PlatformImplementations.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lya/a;", "Lxa/a;", "<init>", "()V", "", "version", "", "c", "(I)Z", "LFa/c;", "b", "()LFa/c;", "a", "kotlin-stdlib-jdk8"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ya.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5144a extends C5082a {

    /* compiled from: JDK8PlatformImplementations.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lya/a$a;", "", "<init>", "()V", "", "b", "Ljava/lang/Integer;", "sdkVersion", "kotlin-stdlib-jdk8"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ya.a$a, reason: collision with other inner class name */
    private static final class C0782a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0782a f53254a = new C0782a();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final Integer sdkVersion;

        static {
            Object obj;
            Integer num = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            Integer num2 = obj instanceof Integer ? (Integer) obj : null;
            if (num2 != null && num2.intValue() > 0) {
                num = num2;
            }
            sdkVersion = num;
        }

        private C0782a() {
        }
    }

    private final boolean c(int version) {
        Integer num = C0782a.sdkVersion;
        return num == null || num.intValue() >= version;
    }

    @Override // wa.C5011a
    public c b() {
        return c(34) ? new Ga.a() : super.b();
    }
}
