package androidx.work;

/* compiled from: InputMergerFactory.java */
/* renamed from: androidx.work.l */
/* loaded from: classes.dex */
public abstract class AbstractC0805l {

    /* compiled from: InputMergerFactory.java */
    /* renamed from: androidx.work.l$a */
    class a extends AbstractC0805l {
        a() {
        }

        @Override // androidx.work.AbstractC0805l
        /* renamed from: a */
        public AbstractC0804k mo5217a(String str) {
            return null;
        }
    }

    /* renamed from: c */
    public static AbstractC0805l m5216c() {
        return new a();
    }

    /* renamed from: a */
    public abstract AbstractC0804k mo5217a(String str);

    /* renamed from: b */
    public final AbstractC0804k m5218b(String str) {
        AbstractC0804k abstractC0804kMo5217a = mo5217a(str);
        return abstractC0804kMo5217a == null ? AbstractC0804k.m5215a(str) : abstractC0804kMo5217a;
    }
}
