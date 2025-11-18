package S0;

import Tb.h;
import Tb.k;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;

/* compiled from: PreviewUtils.android.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0003\u001a\u0010\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u0002\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a5\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0014\u0010\u0005\u001a\u0010\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u0002\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\r\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a+\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b*\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000f2\u0006\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"", "Ljava/lang/Class;", "LT0/a;", "a", "(Ljava/lang/String;)Ljava/lang/Class;", "parameterProviderClass", "", "parameterProviderIndex", "", "", "b", "(Ljava/lang/Class;I)[Ljava/lang/Object;", "classToCheck", "d", "(Ljava/lang/Object;)Ljava/lang/Object;", "LTb/h;", "size", "c", "(LTb/h;I)[Ljava/lang/Object;", "ui-tooling_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d {
    public static final Class<? extends T0.a<?>> a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e10) {
            c.INSTANCE.a("Unable to find PreviewProvider '" + str + '\'', e10);
            return null;
        }
    }

    public static final Object[] b(Class<? extends T0.a<?>> cls, int i10) throws IllegalAccessException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (cls == null) {
            return new Object[0];
        }
        try {
            Constructor<?>[] constructors = cls.getConstructors();
            int length = constructors.length;
            int i11 = 0;
            boolean z10 = false;
            Constructor<?> constructor = null;
            while (true) {
                if (i11 < length) {
                    Constructor<?> constructor2 = constructors[i11];
                    if (constructor2.getParameterTypes().length == 0) {
                        if (z10) {
                            break;
                        }
                        z10 = true;
                        constructor = constructor2;
                    }
                    i11++;
                } else if (!z10) {
                }
            }
            constructor = null;
            if (constructor == null) {
                throw new IllegalArgumentException("PreviewParameterProvider constructor can not have parameters");
            }
            constructor.setAccessible(true);
            Object objNewInstance = constructor.newInstance(null);
            C3862t.e(objNewInstance, "null cannot be cast to non-null type androidx.compose.ui.tooling.preview.PreviewParameterProvider<*>");
            T0.a aVar = (T0.a) objNewInstance;
            if (i10 < 0) {
                return c(aVar.a(), aVar.getCount());
            }
            List listE = r.e(k.o(aVar.a(), i10));
            ArrayList arrayList = new ArrayList(r.x(listE, 10));
            Iterator it = listE.iterator();
            while (it.hasNext()) {
                arrayList.add(d(it.next()));
            }
            return arrayList.toArray(new Object[0]);
        } catch (Aa.c unused) {
            throw new IllegalStateException("Deploying Compose Previews with PreviewParameterProvider arguments requires adding a dependency to the kotlin-reflect library.\nConsider adding 'debugImplementation \"org.jetbrains.kotlin:kotlin-reflect:$kotlin_version\"' to the module's build.gradle.");
        }
    }

    private static final Object[] c(h<? extends Object> hVar, int i10) {
        Iterator<? extends Object> it = hVar.iterator();
        Object[] objArr = new Object[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = it.next();
        }
        return objArr;
    }

    private static final Object d(Object obj) throws NoSuchFieldException, SecurityException {
        if (obj != null) {
            for (Annotation annotation : obj.getClass().getAnnotations()) {
                if (annotation instanceof Aa.b) {
                    for (Field field : obj.getClass().getDeclaredFields()) {
                        if (field.getType().isPrimitive()) {
                            Field declaredField = obj.getClass().getDeclaredField(field.getName());
                            declaredField.setAccessible(true);
                            return declaredField.get(obj);
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                }
            }
        }
        return obj;
    }
}
