package androidx.work;

import java.util.List;

/* compiled from: InputMerger.java */
/* renamed from: androidx.work.k */
/* loaded from: classes.dex */
public abstract class AbstractC0804k {

    /* renamed from: a */
    private static final String f4969a = AbstractC0807n.m5223f("InputMerger");

    /* renamed from: a */
    public static AbstractC0804k m5215a(String str) {
        try {
            return (AbstractC0804k) Class.forName(str).newInstance();
        } catch (Exception e2) {
            AbstractC0807n.m5221c().mo5225b(f4969a, "Trouble instantiating + " + str, e2);
            return null;
        }
    }

    /* renamed from: b */
    public abstract C0706e mo4757b(List<C0706e> list);
}
