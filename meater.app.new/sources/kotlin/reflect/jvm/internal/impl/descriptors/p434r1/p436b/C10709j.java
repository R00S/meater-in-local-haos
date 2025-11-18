package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.AbstractC10705f;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10027e;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;

/* compiled from: ReflectJavaAnnotationArguments.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.j */
/* loaded from: classes2.dex */
public final class C10709j extends AbstractC10705f implements InterfaceC10027e {

    /* renamed from: c */
    private final Object[] f41188c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10709j(C10163f c10163f, Object[] objArr) {
        super(c10163f, null);
        C9801m.m32346f(objArr, "values");
        this.f41188c = objArr;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10027e
    /* renamed from: e */
    public List<AbstractC10705f> mo33585e() {
        Object[] objArr = this.f41188c;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            AbstractC10705f.a aVar = AbstractC10705f.f41185a;
            C9801m.m32343c(obj);
            arrayList.add(aVar.m38080a(obj, null));
        }
        return arrayList;
    }
}
