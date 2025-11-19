package od;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import nd.f;
import oc.E;

/* compiled from: GsonResponseBodyConverter.java */
/* loaded from: classes3.dex */
final class c<T> implements f<E, T> {

    /* renamed from: a, reason: collision with root package name */
    private final Gson f47208a;

    /* renamed from: b, reason: collision with root package name */
    private final TypeAdapter<T> f47209b;

    c(Gson gson, TypeAdapter<T> typeAdapter) {
        this.f47208a = gson;
        this.f47209b = typeAdapter;
    }

    @Override // nd.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public T a(E e10) throws IOException {
        Q9.a aVarQ = this.f47208a.q(e10.b());
        try {
            T t10 = this.f47209b.read(aVarQ);
            if (aVarQ.N() == Q9.b.END_DOCUMENT) {
                return t10;
            }
            throw new JsonIOException("JSON document was not fully consumed.");
        } finally {
            e10.close();
        }
    }
}
