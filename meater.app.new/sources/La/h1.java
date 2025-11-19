package La;

import Xa.C1822f;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.collections.C3831l;
import kotlin.jvm.internal.C3862t;

/* compiled from: RuntimeTypeMapper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ljava/lang/reflect/Method;", "", "d", "(Ljava/lang/reflect/Method;)Ljava/lang/String;", "signature", "kotlin-reflection"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h1 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence a(Class cls) {
        C3862t.d(cls);
        return C1822f.f(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String d(Method method) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        C3862t.f(parameterTypes, "getParameterTypes(...)");
        sb2.append(C3831l.n0(parameterTypes, "", "(", ")", 0, null, g1.f11211B, 24, null));
        Class<?> returnType = method.getReturnType();
        C3862t.f(returnType, "getReturnType(...)");
        sb2.append(C1822f.f(returnType));
        return sb2.toString();
    }
}
