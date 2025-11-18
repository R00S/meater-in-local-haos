package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import java.io.Serializable;

/* loaded from: classes2.dex */
public abstract class NopAnnotationIntrospector extends AnnotationIntrospector implements Serializable {
    public static final NopAnnotationIntrospector instance = new NopAnnotationIntrospector() { // from class: com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector.1
    };
}
