package od;

import com.google.gson.Gson;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import nd.f;
import nd.t;
import oc.AbstractC4179C;
import oc.E;

/* compiled from: GsonConverterFactory.java */
/* loaded from: classes3.dex */
public final class a extends f.a {

    /* renamed from: a, reason: collision with root package name */
    private final Gson f47203a;

    private a(Gson gson) {
        this.f47203a = gson;
    }

    public static a f() {
        return g(new Gson());
    }

    public static a g(Gson gson) {
        if (gson != null) {
            return new a(gson);
        }
        throw new NullPointerException("gson == null");
    }

    @Override // nd.f.a
    public f<?, AbstractC4179C> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, t tVar) {
        return new b(this.f47203a, this.f47203a.m(P9.a.b(type)));
    }

    @Override // nd.f.a
    public f<E, ?> d(Type type, Annotation[] annotationArr, t tVar) {
        return new c(this.f47203a, this.f47203a.m(P9.a.b(type)));
    }
}
