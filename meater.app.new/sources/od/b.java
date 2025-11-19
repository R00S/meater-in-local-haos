package od;

import Cc.C0982e;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import nd.f;
import oc.AbstractC4179C;
import oc.x;

/* compiled from: GsonRequestBodyConverter.java */
/* loaded from: classes3.dex */
final class b<T> implements f<T, AbstractC4179C> {

    /* renamed from: c, reason: collision with root package name */
    private static final x f47204c = x.e("application/json; charset=UTF-8");

    /* renamed from: d, reason: collision with root package name */
    private static final Charset f47205d = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    private final Gson f47206a;

    /* renamed from: b, reason: collision with root package name */
    private final TypeAdapter<T> f47207b;

    b(Gson gson, TypeAdapter<T> typeAdapter) {
        this.f47206a = gson;
        this.f47207b = typeAdapter;
    }

    @Override // nd.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC4179C a(T t10) throws IOException {
        C0982e c0982e = new C0982e();
        Q9.c cVarR = this.f47206a.r(new OutputStreamWriter(c0982e.q(), f47205d));
        this.f47207b.write(cVarR, t10);
        cVarR.close();
        return AbstractC4179C.d(f47204c, c0982e.u());
    }
}
