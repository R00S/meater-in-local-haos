package p024c.p088x;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: TransitionValues.java */
/* renamed from: c.x.s */
/* loaded from: classes.dex */
public class C1054s {

    /* renamed from: b */
    public View f6934b;

    /* renamed from: a */
    public final Map<String, Object> f6933a = new HashMap();

    /* renamed from: c */
    final ArrayList<AbstractC1047m> f6935c = new ArrayList<>();

    @Deprecated
    public C1054s() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1054s)) {
            return false;
        }
        C1054s c1054s = (C1054s) obj;
        return this.f6934b == c1054s.f6934b && this.f6933a.equals(c1054s.f6933a);
    }

    public int hashCode() {
        return (this.f6934b.hashCode() * 31) + this.f6933a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f6934b + "\n") + "    values:";
        for (String str2 : this.f6933a.keySet()) {
            str = str + "    " + str2 + ": " + this.f6933a.get(str2) + "\n";
        }
        return str;
    }

    public C1054s(View view) {
        this.f6934b = view;
    }
}
