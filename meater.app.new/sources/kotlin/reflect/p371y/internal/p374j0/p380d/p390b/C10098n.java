package kotlin.reflect.p371y.internal.p374j0.p380d.p390b;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p375b.EnumC9915i;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.AbstractC10096l;
import kotlin.reflect.p371y.internal.p374j0.p400i.p406u.C10239d;
import kotlin.reflect.p371y.internal.p374j0.p400i.p406u.EnumC10240e;
import kotlin.text.C10547v;

/* compiled from: methodSignatureMapping.kt */
/* renamed from: kotlin.f0.y.e.j0.d.b.n */
/* loaded from: classes3.dex */
final class C10098n implements InterfaceC10097m<AbstractC10096l> {

    /* renamed from: a */
    public static final C10098n f38475a = new C10098n();

    /* compiled from: methodSignatureMapping.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.b.n$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f38476a;

        static {
            int[] iArr = new int[EnumC9915i.values().length];
            iArr[EnumC9915i.BOOLEAN.ordinal()] = 1;
            iArr[EnumC9915i.CHAR.ordinal()] = 2;
            iArr[EnumC9915i.BYTE.ordinal()] = 3;
            iArr[EnumC9915i.SHORT.ordinal()] = 4;
            iArr[EnumC9915i.INT.ordinal()] = 5;
            iArr[EnumC9915i.FLOAT.ordinal()] = 6;
            iArr[EnumC9915i.LONG.ordinal()] = 7;
            iArr[EnumC9915i.DOUBLE.ordinal()] = 8;
            f38476a = iArr;
        }
    }

    private C10098n() {
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10097m
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public AbstractC10096l mo34009d(AbstractC10096l abstractC10096l) {
        C9801m.m32346f(abstractC10096l, "possiblyPrimitiveType");
        if (!(abstractC10096l instanceof AbstractC10096l.d)) {
            return abstractC10096l;
        }
        AbstractC10096l.d dVar = (AbstractC10096l.d) abstractC10096l;
        if (dVar.m34005i() == null) {
            return abstractC10096l;
        }
        String strM36111f = C10239d.m36108c(dVar.m34005i().m36119y()).m36111f();
        C9801m.m32345e(strM36111f, "byFqNameWithoutInnerClas…apperFqName).internalName");
        return mo34008c(strM36111f);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10097m
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public AbstractC10096l mo34007b(String str) {
        EnumC10240e enumC10240e;
        AbstractC10096l cVar;
        C9801m.m32346f(str, "representation");
        str.length();
        char cCharAt = str.charAt(0);
        EnumC10240e[] enumC10240eArrValues = EnumC10240e.values();
        int length = enumC10240eArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                enumC10240e = null;
                break;
            }
            enumC10240e = enumC10240eArrValues[i2];
            if (enumC10240e.m36116u().charAt(0) == cCharAt) {
                break;
            }
            i2++;
        }
        if (enumC10240e != null) {
            return new AbstractC10096l.d(enumC10240e);
        }
        if (cCharAt == 'V') {
            return new AbstractC10096l.d(null);
        }
        if (cCharAt == '[') {
            String strSubstring = str.substring(1);
            C9801m.m32345e(strSubstring, "this as java.lang.String).substring(startIndex)");
            cVar = new AbstractC10096l.a(mo34007b(strSubstring));
        } else {
            if (cCharAt == 'L') {
                C10547v.m37544M(str, ';', false, 2, null);
            }
            String strSubstring2 = str.substring(1, str.length() - 1);
            C9801m.m32345e(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
            cVar = new AbstractC10096l.c(strSubstring2);
        }
        return cVar;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10097m
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public AbstractC10096l.c mo34008c(String str) {
        C9801m.m32346f(str, "internalName");
        return new AbstractC10096l.c(str);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10097m
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public AbstractC10096l mo34011f(EnumC9915i enumC9915i) {
        C9801m.m32346f(enumC9915i, "primitiveType");
        switch (a.f38476a[enumC9915i.ordinal()]) {
            case 1:
                return AbstractC10096l.f38463a.m33996a();
            case 2:
                return AbstractC10096l.f38463a.m33998c();
            case 3:
                return AbstractC10096l.f38463a.m33997b();
            case 4:
                return AbstractC10096l.f38463a.m34003h();
            case 5:
                return AbstractC10096l.f38463a.m34001f();
            case 6:
                return AbstractC10096l.f38463a.m34000e();
            case 7:
                return AbstractC10096l.f38463a.m34002g();
            case 8:
                return AbstractC10096l.f38463a.m33999d();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10097m
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public AbstractC10096l mo34010e() {
        return mo34008c("java/lang/Class");
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10097m
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public String mo34006a(AbstractC10096l abstractC10096l) {
        String strM36116u;
        C9801m.m32346f(abstractC10096l, "type");
        if (abstractC10096l instanceof AbstractC10096l.a) {
            return '[' + mo34006a(((AbstractC10096l.a) abstractC10096l).m33995i());
        }
        if (abstractC10096l instanceof AbstractC10096l.d) {
            EnumC10240e enumC10240eM34005i = ((AbstractC10096l.d) abstractC10096l).m34005i();
            return (enumC10240eM34005i == null || (strM36116u = enumC10240eM34005i.m36116u()) == null) ? "V" : strM36116u;
        }
        if (!(abstractC10096l instanceof AbstractC10096l.c)) {
            throw new NoWhenBranchMatchedException();
        }
        return 'L' + ((AbstractC10096l.c) abstractC10096l).m34004i() + ';';
    }
}
