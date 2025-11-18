package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p435a;

import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10159b;
import kotlin.text.C10546u;

/* compiled from: ReflectKotlinClassFinder.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.a.h */
/* loaded from: classes2.dex */
public final class C10691h {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final String m38029b(C10159b c10159b) {
        String strM35420b = c10159b.m35414i().m35420b();
        C9801m.m32345e(strM35420b, "relativeClassName.asString()");
        String strM37524z = C10546u.m37524z(strM35420b, '.', '$', false, 4, null);
        if (c10159b.m35413h().m35422d()) {
            return strM37524z;
        }
        return c10159b.m35413h() + '.' + strM37524z;
    }
}
