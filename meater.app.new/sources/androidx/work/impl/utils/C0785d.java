package androidx.work.impl.utils;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.AbstractC0807n;

/* compiled from: PackageManagerHelper.java */
/* renamed from: androidx.work.impl.utils.d */
/* loaded from: classes.dex */
public class C0785d {

    /* renamed from: a */
    private static final String f4871a = AbstractC0807n.m5223f("PackageManagerHelper");

    /* renamed from: a */
    public static void m5162a(Context context, Class<?> cls, boolean z) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            AbstractC0807n abstractC0807nM5221c = AbstractC0807n.m5221c();
            String str = f4871a;
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            objArr[1] = z ? "enabled" : "disabled";
            abstractC0807nM5221c.mo5224a(str, String.format("%s %s", objArr), new Throwable[0]);
        } catch (Exception e2) {
            AbstractC0807n abstractC0807nM5221c2 = AbstractC0807n.m5221c();
            String str2 = f4871a;
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            objArr2[1] = z ? "enabled" : "disabled";
            abstractC0807nM5221c2.mo5224a(str2, String.format("%s could not be %s", objArr2), e2);
        }
    }
}
