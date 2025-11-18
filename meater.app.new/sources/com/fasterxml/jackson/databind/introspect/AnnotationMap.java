package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.util.Annotations;
import java.lang.annotation.Annotation;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class AnnotationMap implements Annotations {
    protected HashMap<Class<?>, Annotation> _annotations;

    public AnnotationMap() {
    }

    public static AnnotationMap merge(AnnotationMap annotationMap, AnnotationMap annotationMap2) {
        HashMap<Class<?>, Annotation> map;
        HashMap<Class<?>, Annotation> map2;
        if (annotationMap == null || (map = annotationMap._annotations) == null || map.isEmpty()) {
            return annotationMap2;
        }
        if (annotationMap2 == null || (map2 = annotationMap2._annotations) == null || map2.isEmpty()) {
            return annotationMap;
        }
        HashMap map3 = new HashMap();
        for (Annotation annotation : annotationMap2._annotations.values()) {
            map3.put(annotation.annotationType(), annotation);
        }
        for (Annotation annotation2 : annotationMap._annotations.values()) {
            map3.put(annotation2.annotationType(), annotation2);
        }
        return new AnnotationMap(map3);
    }

    protected final boolean _add(Annotation annotation) {
        if (this._annotations == null) {
            this._annotations = new HashMap<>();
        }
        Annotation annotationPut = this._annotations.put(annotation.annotationType(), annotation);
        return annotationPut == null || !annotationPut.equals(annotation);
    }

    public boolean add(Annotation annotation) {
        return _add(annotation);
    }

    public boolean addIfNotPresent(Annotation annotation) {
        HashMap<Class<?>, Annotation> map = this._annotations;
        if (map != null && map.containsKey(annotation.annotationType())) {
            return false;
        }
        _add(annotation);
        return true;
    }

    public <A extends Annotation> A get(Class<A> cls) {
        HashMap<Class<?>, Annotation> map = this._annotations;
        if (map == null) {
            return null;
        }
        return (A) map.get(cls);
    }

    public boolean has(Class<?> cls) {
        HashMap<Class<?>, Annotation> map = this._annotations;
        if (map == null) {
            return false;
        }
        return map.containsKey(cls);
    }

    public boolean hasOneOf(Class<? extends Annotation>[] clsArr) {
        if (this._annotations != null) {
            for (Class<? extends Annotation> cls : clsArr) {
                if (this._annotations.containsKey(cls)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int size() {
        HashMap<Class<?>, Annotation> map = this._annotations;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    public String toString() {
        HashMap<Class<?>, Annotation> map = this._annotations;
        return map == null ? "[null]" : map.toString();
    }

    private AnnotationMap(HashMap<Class<?>, Annotation> map) {
        this._annotations = map;
    }
}
