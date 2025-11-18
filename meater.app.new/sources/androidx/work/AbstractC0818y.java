package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.impl.C0737j;
import java.util.Collections;
import java.util.List;

/* compiled from: WorkManager.java */
@SuppressLint({"AddedAbstractMethod"})
/* renamed from: androidx.work.y */
/* loaded from: classes.dex */
public abstract class AbstractC0818y {
    protected AbstractC0818y() {
    }

    /* renamed from: h */
    public static AbstractC0818y m5238h(Context context) {
        return C0737j.m4979p(context);
    }

    /* renamed from: i */
    public static void m5239i(Context context, C0703b c0703b) {
        C0737j.m4977i(context, c0703b);
    }

    /* renamed from: a */
    public abstract InterfaceC0810q mo4984a(String str);

    /* renamed from: b */
    public abstract InterfaceC0810q mo4985b(String str);

    /* renamed from: c */
    public final InterfaceC0810q m5240c(AbstractC0819z abstractC0819z) {
        return mo4986d(Collections.singletonList(abstractC0819z));
    }

    /* renamed from: d */
    public abstract InterfaceC0810q mo4986d(List<? extends AbstractC0819z> list);

    /* renamed from: e */
    public abstract InterfaceC0810q mo4987e(String str, EnumC0707f enumC0707f, C0812s c0812s);

    /* renamed from: f */
    public InterfaceC0810q m5241f(String str, EnumC0708g enumC0708g, C0809p c0809p) {
        return mo4988g(str, enumC0708g, Collections.singletonList(c0809p));
    }

    /* renamed from: g */
    public abstract InterfaceC0810q mo4988g(String str, EnumC0708g enumC0708g, List<C0809p> list);
}
