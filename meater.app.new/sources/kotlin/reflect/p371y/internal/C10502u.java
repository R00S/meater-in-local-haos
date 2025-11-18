package kotlin.reflect.p371y.internal;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10729t0;
import kotlin.reflect.p371y.internal.KPropertyImpl;
import kotlin.reflect.p371y.internal.calls.CallerImpl;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b.C10121i;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10187d;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.C10293j;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10372n1;
import okhttp3.HttpUrl;

/* compiled from: KPropertyImpl.kt */
@Metadata(m32266d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a\f\u0010\t\u001a\u00020\b*\u00020\nH\u0002\"\"\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u000b"}, m32267d2 = {"boundReceiver", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;", "getBoundReceiver", "(Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;)Ljava/lang/Object;", "computeCallerForAccessor", "Lkotlin/reflect/jvm/internal/calls/Caller;", "isGetter", HttpUrl.FRAGMENT_ENCODE_SET, "isJvmFieldPropertyInCompanionObject", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "kotlin-reflection"}, m32268k = 2, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.f0.y.e.u */
/* loaded from: classes2.dex */
public final class C10502u {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0118  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.reflect.p371y.internal.calls.Caller<?> m37314b(kotlin.reflect.p371y.internal.KPropertyImpl.a<?, ?> r6, boolean r7) throws java.lang.NoSuchMethodException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 589
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.C10502u.m37314b(kotlin.f0.y.e.t$a, boolean):kotlin.f0.y.e.i0.d");
    }

    /* renamed from: c */
    private static final CallerImpl<Field> m37315c(KPropertyImpl.a<?, ?> aVar, boolean z, Field field) {
        CallerImpl<Field> aVar2;
        if (m37319g(aVar.mo32435n().mo37304F()) || !Modifier.isStatic(field.getModifiers())) {
            if (!z) {
                aVar2 = aVar.mo32545E() ? new CallerImpl.g.a(field, m37317e(aVar), m37318f(aVar)) : new CallerImpl.g.c(field, m37317e(aVar));
            } else {
                if (!aVar.mo32545E()) {
                    return new CallerImpl.f.c(field);
                }
                aVar2 = new CallerImpl.f.a(field, m37318f(aVar));
            }
        } else if (m37316d(aVar)) {
            if (z) {
                return aVar.mo32545E() ? new CallerImpl.f.b(field) : new CallerImpl.f.d(field);
            }
            aVar2 = aVar.mo32545E() ? new CallerImpl.g.b(field, m37317e(aVar)) : new CallerImpl.g.d(field, m37317e(aVar));
        } else {
            if (z) {
                return new CallerImpl.f.e(field);
            }
            aVar2 = new CallerImpl.g.e(field, m37317e(aVar));
        }
        return aVar2;
    }

    /* renamed from: d */
    private static final boolean m37316d(KPropertyImpl.a<?, ?> aVar) {
        return aVar.mo32435n().mo37304F().getAnnotations().mo33270R0(C9891g0.m32565j());
    }

    /* renamed from: e */
    private static final boolean m37317e(KPropertyImpl.a<?, ?> aVar) {
        return !C10372n1.m36779l(aVar.mo32435n().mo37304F().getType());
    }

    /* renamed from: f */
    public static final Object m37318f(KPropertyImpl.a<?, ?> aVar) {
        C9801m.m32346f(aVar, "<this>");
        return aVar.mo32435n().m37299G();
    }

    /* renamed from: g */
    private static final boolean m37319g(InterfaceC10729t0 interfaceC10729t0) {
        InterfaceC10609m interfaceC10609mMo32876b = interfaceC10729t0.mo32876b();
        C9801m.m32345e(interfaceC10609mMo32876b, "containingDeclaration");
        if (!C10187d.m35836x(interfaceC10609mMo32876b)) {
            return false;
        }
        InterfaceC10609m interfaceC10609mMo32876b2 = interfaceC10609mMo32876b.mo32876b();
        return !(C10187d.m35802C(interfaceC10609mMo32876b2) || C10187d.m35832t(interfaceC10609mMo32876b2)) || ((interfaceC10729t0 instanceof C10293j) && C10121i.m34257f(((C10293j) interfaceC10729t0).mo36257E()));
    }
}
