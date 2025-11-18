package mc;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import kotlinx.serialization.SerializationException;

/* compiled from: AbstractPolymorphicSerializer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0006\u001a%\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\b\u001a\u00020\u00042\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00022\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "subClassName", "LIa/d;", "baseClass", "", "b", "(Ljava/lang/String;LIa/d;)Ljava/lang/Void;", "subClass", "a", "(LIa/d;LIa/d;)Ljava/lang/Void;", "kotlinx-serialization-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: mc.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4023c {
    public static final Void a(Ia.d<?> subClass, Ia.d<?> baseClass) {
        C3862t.g(subClass, "subClass");
        C3862t.g(baseClass, "baseClass");
        String strR = subClass.r();
        if (strR == null) {
            strR = String.valueOf(subClass);
        }
        b(strR, baseClass);
        throw new KotlinNothingValueException();
    }

    public static final Void b(String str, Ia.d<?> baseClass) {
        String str2;
        C3862t.g(baseClass, "baseClass");
        String str3 = "in the polymorphic scope of '" + baseClass.r() + '\'';
        if (str == null) {
            str2 = "Class discriminator was missing and no default serializers were registered " + str3 + '.';
        } else {
            str2 = "Serializer for subclass '" + str + "' is not found " + str3 + ".\nCheck if class with serial name '" + str + "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '" + str + "' has to be '@Serializable', and the base class '" + baseClass.r() + "' has to be sealed and '@Serializable'.";
        }
        throw new SerializationException(str2);
    }
}
