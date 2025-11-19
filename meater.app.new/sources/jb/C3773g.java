package jb;

import java.util.List;
import java.util.Map;
import jb.AbstractC3771e;
import kotlin.jvm.internal.C3862t;

/* compiled from: AbstractBinaryClassAnnotationLoader.kt */
/* renamed from: jb.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3773g<A, C> extends AbstractC3771e.a<A> {

    /* renamed from: a, reason: collision with root package name */
    private final Map<C3757A, List<A>> f43619a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<C3757A, C> f43620b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<C3757A, C> f43621c;

    /* JADX WARN: Multi-variable type inference failed */
    public C3773g(Map<C3757A, ? extends List<? extends A>> memberAnnotations, Map<C3757A, ? extends C> propertyConstants, Map<C3757A, ? extends C> annotationParametersDefaultValues) {
        C3862t.g(memberAnnotations, "memberAnnotations");
        C3862t.g(propertyConstants, "propertyConstants");
        C3862t.g(annotationParametersDefaultValues, "annotationParametersDefaultValues");
        this.f43619a = memberAnnotations;
        this.f43620b = propertyConstants;
        this.f43621c = annotationParametersDefaultValues;
    }

    @Override // jb.AbstractC3771e.a
    public Map<C3757A, List<A>> a() {
        return this.f43619a;
    }

    public final Map<C3757A, C> b() {
        return this.f43621c;
    }

    public final Map<C3757A, C> c() {
        return this.f43620b;
    }
}
