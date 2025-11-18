package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9790g0;
import kotlin.jvm.internal.C9793i;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10159b;
import kotlin.sequences.C10520l;
import kotlin.sequences.C10522n;

/* compiled from: findClassInModule.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.x */
/* loaded from: classes2.dex */
public final class C10736x {

    /* compiled from: findClassInModule.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.x$a */
    /* synthetic */ class a extends C9793i implements Function1<C10159b, C10159b> {

        /* renamed from: h */
        public static final a f41234h = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.internal.AbstractC9781c, kotlin.reflect.KCallable
        /* renamed from: getName */
        public final String getF40571m() {
            return "getOuterClassId";
        }

        @Override // kotlin.jvm.internal.AbstractC9781c
        public final KDeclarationContainer getOwner() {
            return C9790g0.m32298b(C10159b.class);
        }

        @Override // kotlin.jvm.internal.AbstractC9781c
        public final String getSignature() {
            return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public final C10159b invoke(C10159b c10159b) {
            C9801m.m32346f(c10159b, "p0");
            return c10159b.m35412g();
        }
    }

    /* compiled from: findClassInModule.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.x$b */
    static final class b extends Lambda implements Function1<C10159b, Integer> {

        /* renamed from: f */
        public static final b f41235f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(C10159b c10159b) {
            C9801m.m32346f(c10159b, "it");
            return 0;
        }
    }

    /* renamed from: a */
    public static final InterfaceC10585e m38149a(InterfaceC10592g0 interfaceC10592g0, C10159b c10159b) {
        C9801m.m32346f(interfaceC10592g0, "<this>");
        C9801m.m32346f(c10159b, "classId");
        InterfaceC10594h interfaceC10594hM38150b = m38150b(interfaceC10592g0, c10159b);
        if (interfaceC10594hM38150b instanceof InterfaceC10585e) {
            return (InterfaceC10585e) interfaceC10594hM38150b;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014b  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h m38150b(kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10592g0 r10, kotlin.reflect.p371y.internal.p374j0.p397f.C10159b r11) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.C10736x.m38150b(kotlin.reflect.jvm.internal.impl.descriptors.g0, kotlin.f0.y.e.j0.f.b):kotlin.reflect.jvm.internal.impl.descriptors.h");
    }

    /* renamed from: c */
    public static final InterfaceC10585e m38151c(InterfaceC10592g0 interfaceC10592g0, C10159b c10159b, C10601j0 c10601j0) {
        C9801m.m32346f(interfaceC10592g0, "<this>");
        C9801m.m32346f(c10159b, "classId");
        C9801m.m32346f(c10601j0, "notFoundClasses");
        InterfaceC10585e interfaceC10585eM38149a = m38149a(interfaceC10592g0, c10159b);
        return interfaceC10585eM38149a != null ? interfaceC10585eM38149a : c10601j0.m37703d(c10159b, C10522n.m37377A(C10522n.m37391u(C10520l.m37373f(c10159b, a.f41234h), b.f41235f)));
    }

    /* renamed from: d */
    public static final InterfaceC10584d1 m38152d(InterfaceC10592g0 interfaceC10592g0, C10159b c10159b) {
        C9801m.m32346f(interfaceC10592g0, "<this>");
        C9801m.m32346f(c10159b, "classId");
        InterfaceC10594h interfaceC10594hM38150b = m38150b(interfaceC10592g0, c10159b);
        if (interfaceC10594hM38150b instanceof InterfaceC10584d1) {
            return (InterfaceC10584d1) interfaceC10594hM38150b;
        }
        return null;
    }
}
