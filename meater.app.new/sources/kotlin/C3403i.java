package kotlin;

import Ba.a;
import Ia.d;
import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.InterfaceC3402h;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.InterfaceC4164i;

/* compiled from: NavArgsLazy.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B#\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0014\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lg3/i;", "Lg3/h;", "Args", "Loa/i;", "LIa/d;", "navArgsClass", "Lkotlin/Function0;", "Landroid/os/Bundle;", "argumentProducer", "<init>", "(LIa/d;LBa/a;)V", "", "b", "()Z", "B", "LIa/d;", "C", "LBa/a;", "D", "Lg3/h;", "cached", "a", "()Lg3/h;", "value", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: g3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3403i<Args extends InterfaceC3402h> implements InterfaceC4164i<Args> {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final d<Args> navArgsClass;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final a<Bundle> argumentProducer;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private Args cached;

    public C3403i(d<Args> navArgsClass, a<Bundle> argumentProducer) {
        C3862t.g(navArgsClass, "navArgsClass");
        C3862t.g(argumentProducer, "argumentProducer");
        this.navArgsClass = navArgsClass;
        this.argumentProducer = argumentProducer;
    }

    @Override // oa.InterfaceC4164i
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Args getValue() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Args args = this.cached;
        if (args != null) {
            return args;
        }
        Bundle bundleInvoke = this.argumentProducer.invoke();
        Method method = C3404j.a().get(this.navArgsClass);
        if (method == null) {
            Class clsB = Aa.a.b(this.navArgsClass);
            Class<Bundle>[] clsArrB = C3404j.b();
            method = clsB.getMethod("fromBundle", (Class[]) Arrays.copyOf(clsArrB, clsArrB.length));
            C3404j.a().put(this.navArgsClass, method);
            C3862t.f(method, "navArgsClass.java.getMet…                        }");
        }
        Object objInvoke = method.invoke(null, bundleInvoke);
        C3862t.e(objInvoke, "null cannot be cast to non-null type Args of androidx.navigation.NavArgsLazy");
        Args args2 = (Args) objInvoke;
        this.cached = args2;
        return args2;
    }

    @Override // oa.InterfaceC4164i
    public boolean b() {
        return this.cached != null;
    }
}
