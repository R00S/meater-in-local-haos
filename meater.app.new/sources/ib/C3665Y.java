package ib;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: predefinedEnhancementInfo.kt */
/* renamed from: ib.Y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3665Y {

    /* renamed from: a, reason: collision with root package name */
    private final j0 f43220a;

    /* renamed from: b, reason: collision with root package name */
    private final List<j0> f43221b;

    /* renamed from: c, reason: collision with root package name */
    private final String f43222c;

    /* renamed from: d, reason: collision with root package name */
    private final C3665Y f43223d;

    public C3665Y() {
        this(null, null, null, 7, null);
    }

    public final String a() {
        return this.f43222c;
    }

    public final List<j0> b() {
        return this.f43221b;
    }

    public final j0 c() {
        return this.f43220a;
    }

    public final C3665Y d() {
        return this.f43223d;
    }

    public C3665Y(j0 j0Var, List<j0> parametersInfo, String str) {
        C3862t.g(parametersInfo, "parametersInfo");
        this.f43220a = j0Var;
        this.f43221b = parametersInfo;
        this.f43222c = str;
        C3665Y c3665y = null;
        if (str != null) {
            j0 j0VarA = j0Var != null ? j0Var.a() : null;
            List<j0> list = parametersInfo;
            ArrayList arrayList = new ArrayList(kotlin.collections.r.x(list, 10));
            for (j0 j0Var2 : list) {
                arrayList.add(j0Var2 != null ? j0Var2.a() : null);
            }
            c3665y = new C3665Y(j0VarA, arrayList, null);
        }
        this.f43223d = c3665y;
    }

    public /* synthetic */ C3665Y(j0 j0Var, List list, String str, int i10, C3854k c3854k) {
        this((i10 & 1) != 0 ? null : j0Var, (i10 & 2) != 0 ? kotlin.collections.r.m() : list, (i10 & 4) != 0 ? null : str);
    }
}
