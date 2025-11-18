package kotlin.jvm.internal;

/* compiled from: PropertyReference2Impl.java */
/* renamed from: kotlin.a0.d.a0 */
/* loaded from: classes2.dex */
public class C9778a0 extends AbstractC9820z {
    public C9778a0(Class cls, String str, String str2, int i2) {
        super(cls, str, str2, i2);
    }

    @Override // kotlin.reflect.KProperty2
    /* renamed from: t */
    public Object mo32280t(Object obj, Object obj2) {
        return getGetter().call(obj, obj2);
    }
}
