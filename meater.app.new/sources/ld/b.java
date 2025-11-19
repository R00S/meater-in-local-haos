package ld;

import Ia.d;
import android.view.Y;
import android.view.a0;
import android.view.b0;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: GetViewModel.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001ao\u0010\u0012\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000ej\u0004\u0018\u0001`\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a5\u0010\u0015\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/lifecycle/Y;", "T", "LIa/d;", "vmClass", "Landroidx/lifecycle/b0;", "viewModelStore", "", "key", "LQ1/a;", "extras", "Ldd/a;", "qualifier", "Lfd/a;", "scope", "Lkotlin/Function0;", "Lcd/a;", "Lorg/koin/core/parameter/ParametersDefinition;", "parameters", "b", "(LIa/d;Landroidx/lifecycle/b0;Ljava/lang/String;LQ1/a;Ldd/a;Lfd/a;LBa/a;)Landroidx/lifecycle/Y;", "className", "a", "(Ldd/a;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "koin-core-viewmodel"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b {
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String a(dd.a r1, java.lang.String r2, java.lang.String r3) {
        /*
            if (r2 != 0) goto L30
            if (r1 == 0) goto L2f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = r1.getValue()
            r2.append(r1)
            if (r3 == 0) goto L25
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r0 = 95
            r1.append(r0)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            if (r1 != 0) goto L27
        L25:
            java.lang.String r1 = ""
        L27:
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            goto L30
        L2f:
            r2 = 0
        L30:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ld.b.a(dd.a, java.lang.String, java.lang.String):java.lang.String");
    }

    public static final <T extends Y> T b(d<T> vmClass, b0 viewModelStore, String str, Q1.a extras, dd.a aVar, fd.a scope, Ba.a<? extends cd.a> aVar2) {
        C3862t.g(vmClass, "vmClass");
        C3862t.g(viewModelStore, "viewModelStore");
        C3862t.g(extras, "extras");
        C3862t.g(scope, "scope");
        a0 a0VarA = a0.INSTANCE.a(viewModelStore, new md.d(vmClass, scope, aVar, aVar2), extras);
        kd.a aVar3 = kd.a.f43922a;
        String strC = aVar3.c(vmClass);
        if (strC == null) {
            strC = kd.b.b(aVar3, vmClass);
        }
        String strA = a(aVar, str, strC);
        return strA != null ? (T) a0VarA.c(strA, vmClass) : (T) a0VarA.a(vmClass);
    }
}
