package K3;

import Ia.d;
import android.util.Log;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: ReflectionUtils.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0001¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u00020\u00072\u0010\u0010\f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\u0006H\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u0007*\u00020\u000f2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u0007*\u00020\u000f2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0018\u001a\u00020\u0007*\u00020\u000f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"LK3/a;", "", "<init>", "()V", "", "errorMessage", "Lkotlin/Function0;", "", "block", "e", "(Ljava/lang/String;LBa/a;)Z", "Ljava/lang/Class;", "classLoader", "a", "(LBa/a;)Z", "Ljava/lang/reflect/Method;", "LIa/d;", "clazz", "b", "(Ljava/lang/reflect/Method;LIa/d;)Z", "c", "(Ljava/lang/reflect/Method;Ljava/lang/Class;)Z", "d", "(Ljava/lang/reflect/Method;)Z", "isPublic", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f8677a = new a();

    private a() {
    }

    public static final boolean e(String errorMessage, Ba.a<Boolean> block) {
        C3862t.g(block, "block");
        try {
            boolean zBooleanValue = block.invoke().booleanValue();
            if (!zBooleanValue && errorMessage != null) {
                Log.e("ReflectionGuard", errorMessage);
            }
            return zBooleanValue;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ClassNotFound: ");
            if (errorMessage == null) {
                errorMessage = "";
            }
            sb2.append(errorMessage);
            Log.e("ReflectionGuard", sb2.toString());
            return false;
        } catch (NoSuchMethodException unused2) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("NoSuchMethod: ");
            if (errorMessage == null) {
                errorMessage = "";
            }
            sb3.append(errorMessage);
            Log.e("ReflectionGuard", sb3.toString());
            return false;
        }
    }

    public final boolean a(Ba.a<? extends Class<?>> classLoader) {
        C3862t.g(classLoader, "classLoader");
        try {
            classLoader.invoke();
            return true;
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
            return false;
        }
    }

    public final boolean b(Method method, d<?> clazz) {
        C3862t.g(method, "<this>");
        C3862t.g(clazz, "clazz");
        return c(method, Aa.a.b(clazz));
    }

    public final boolean c(Method method, Class<?> clazz) {
        C3862t.g(method, "<this>");
        C3862t.g(clazz, "clazz");
        return method.getReturnType().equals(clazz);
    }

    public final boolean d(Method method) {
        C3862t.g(method, "<this>");
        return Modifier.isPublic(method.getModifiers());
    }
}
