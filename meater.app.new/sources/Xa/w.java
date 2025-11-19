package Xa;

import Xa.E;
import hb.InterfaceC3521n;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import kotlin.jvm.internal.C3862t;

/* compiled from: ReflectJavaField.kt */
/* loaded from: classes3.dex */
public final class w extends y implements InterfaceC3521n {

    /* renamed from: a, reason: collision with root package name */
    private final Field f18985a;

    public w(Field member) {
        C3862t.g(member, "member");
        this.f18985a = member;
    }

    @Override // hb.InterfaceC3521n
    public boolean G() {
        return R().isEnumConstant();
    }

    @Override // hb.InterfaceC3521n
    public boolean O() {
        return false;
    }

    @Override // Xa.y
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public Field R() {
        return this.f18985a;
    }

    @Override // hb.InterfaceC3521n
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public E a() {
        E.a aVar = E.f18933a;
        Type genericType = R().getGenericType();
        C3862t.f(genericType, "getGenericType(...)");
        return aVar.a(genericType);
    }
}
