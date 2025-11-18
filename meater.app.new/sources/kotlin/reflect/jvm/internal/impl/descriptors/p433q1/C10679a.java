package kotlin.reflect.jvm.internal.impl.descriptors.p433q1;

import cm.aptoide.p092pt.downloadmanager.Constants;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10611m1;
import kotlin.reflect.jvm.internal.impl.descriptors.C10608l1;

/* compiled from: JavaVisibilities.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.q1.a */
/* loaded from: classes2.dex */
public final class C10679a extends AbstractC10611m1 {

    /* renamed from: c */
    public static final C10679a f41130c = new C10679a();

    private C10679a() {
        super(Constants.PACKAGE, false);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10611m1
    /* renamed from: a */
    public Integer mo37720a(AbstractC10611m1 abstractC10611m1) {
        C9801m.m32346f(abstractC10611m1, "visibility");
        if (this == abstractC10611m1) {
            return 0;
        }
        return C10608l1.f40770a.m37716b(abstractC10611m1) ? 1 : -1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10611m1
    /* renamed from: b */
    public String mo37717b() {
        return "public/*package*/";
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10611m1
    /* renamed from: d */
    public AbstractC10611m1 mo37722d() {
        return C10608l1.g.f40779c;
    }
}
