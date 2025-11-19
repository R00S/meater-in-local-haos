package Wa;

import Ra.h0;
import Ra.i0;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.C3862t;

/* compiled from: ReflectAnnotationSource.kt */
/* loaded from: classes3.dex */
public final class b implements h0 {

    /* renamed from: b, reason: collision with root package name */
    private final Annotation f18479b;

    public b(Annotation annotation) {
        C3862t.g(annotation, "annotation");
        this.f18479b = annotation;
    }

    @Override // Ra.h0
    public i0 a() {
        i0 NO_SOURCE_FILE = i0.f15159a;
        C3862t.f(NO_SOURCE_FILE, "NO_SOURCE_FILE");
        return NO_SOURCE_FILE;
    }

    public final Annotation d() {
        return this.f18479b;
    }
}
