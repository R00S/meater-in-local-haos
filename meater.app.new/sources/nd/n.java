package nd;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import nd.f;
import oc.E;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: OptionalConverterFactory.java */
@IgnoreJRERequirement
/* loaded from: classes3.dex */
final class n extends f.a {

    /* renamed from: a, reason: collision with root package name */
    static final f.a f45920a = new n();

    /* compiled from: OptionalConverterFactory.java */
    @IgnoreJRERequirement
    static final class a<T> implements f<E, Optional<T>> {

        /* renamed from: a, reason: collision with root package name */
        final f<E, T> f45921a;

        a(f<E, T> fVar) {
            this.f45921a = fVar;
        }

        @Override // nd.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Optional<T> a(E e10) {
            return Optional.ofNullable(this.f45921a.a(e10));
        }
    }

    n() {
    }

    @Override // nd.f.a
    public f<E, ?> d(Type type, Annotation[] annotationArr, t tVar) {
        if (f.a.b(type) != Optional.class) {
            return null;
        }
        return new a(tVar.h(f.a.a(0, (ParameterizedType) type), annotationArr));
    }
}
