package p241e.p252d.p253a;

import java.util.Map;

/* renamed from: e.d.a.a */
/* loaded from: classes2.dex */
public abstract class AbstractC8775a {

    /* renamed from: a */
    protected boolean f33366a;

    /* renamed from: b */
    protected Map<String, String> f33367b;

    /* renamed from: a */
    public Map<String, String> m27924a() {
        return this.f33367b;
    }

    /* renamed from: b */
    public boolean m27925b() {
        return this.f33366a;
    }

    public boolean equals(Object obj) {
        Map<String, String> map;
        if (this == obj) {
            return true;
        }
        if (obj != null && AbstractC8775a.class == obj.getClass()) {
            AbstractC8775a abstractC8775a = (AbstractC8775a) obj;
            if (this.f33366a == abstractC8775a.m27925b() && ((map = this.f33367b) == null ? abstractC8775a.m27924a() == null : map.equals(abstractC8775a.m27924a()))) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i2 = (this.f33366a ? 1 : 0) * 31;
        Map<String, String> map = this.f33367b;
        return i2 + (map != null ? map.hashCode() : 0);
    }
}
