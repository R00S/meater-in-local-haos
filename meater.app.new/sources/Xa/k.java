package Xa;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C3862t;

/* compiled from: ReflectJavaAnnotationOwner.kt */
/* loaded from: classes3.dex */
public final class k {
    public static final C1823g a(Annotation[] annotationArr, qb.c fqName) {
        Annotation annotation;
        C3862t.g(annotationArr, "<this>");
        C3862t.g(fqName, "fqName");
        int length = annotationArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                annotation = null;
                break;
            }
            annotation = annotationArr[i10];
            if (C3862t.b(C1822f.e(Aa.a.b(Aa.a.a(annotation))).a(), fqName)) {
                break;
            }
            i10++;
        }
        if (annotation != null) {
            return new C1823g(annotation);
        }
        return null;
    }

    public static final List<C1823g> b(Annotation[] annotationArr) {
        C3862t.g(annotationArr, "<this>");
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation annotation : annotationArr) {
            arrayList.add(new C1823g(annotation));
        }
        return arrayList;
    }
}
