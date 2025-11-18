package Xa;

import java.lang.reflect.Method;

/* loaded from: classes3.dex */
class p implements Ba.l {

    /* renamed from: B, reason: collision with root package name */
    private final q f18973B;

    public p(q qVar) {
        this.f18973B = qVar;
    }

    @Override // Ba.l
    public Object invoke(Object obj) {
        return Boolean.valueOf(q.S(this.f18973B, (Method) obj));
    }
}
