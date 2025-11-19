package nd;

import java.lang.annotation.Annotation;

/* compiled from: SkipCallbackExecutorImpl.java */
/* loaded from: classes3.dex */
final class w implements v {

    /* renamed from: a, reason: collision with root package name */
    private static final v f46043a = new w();

    w() {
    }

    static Annotation[] a(Annotation[] annotationArr) {
        if (x.l(annotationArr, v.class)) {
            return annotationArr;
        }
        Annotation[] annotationArr2 = new Annotation[annotationArr.length + 1];
        annotationArr2[0] = f46043a;
        System.arraycopy(annotationArr, 0, annotationArr2, 1, annotationArr.length);
        return annotationArr2;
    }

    @Override // java.lang.annotation.Annotation
    public Class<? extends Annotation> annotationType() {
        return v.class;
    }

    @Override // java.lang.annotation.Annotation
    public boolean equals(Object obj) {
        return obj instanceof v;
    }

    @Override // java.lang.annotation.Annotation
    public int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation
    public String toString() {
        return "@" + v.class.getName() + "()";
    }
}
