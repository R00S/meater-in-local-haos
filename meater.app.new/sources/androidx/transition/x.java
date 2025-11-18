package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: TransitionValues.java */
/* loaded from: classes.dex */
public class x {

    /* renamed from: b, reason: collision with root package name */
    @SuppressLint({"UnknownNullness"})
    public View f29592b;

    /* renamed from: a, reason: collision with root package name */
    public final Map<String, Object> f29591a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    final ArrayList<AbstractC2190k> f29593c = new ArrayList<>();

    @Deprecated
    public x() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f29592b == xVar.f29592b && this.f29591a.equals(xVar.f29591a);
    }

    public int hashCode() {
        return (this.f29592b.hashCode() * 31) + this.f29591a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f29592b + "\n") + "    values:";
        for (String str2 : this.f29591a.keySet()) {
            str = str + "    " + str2 + ": " + this.f29591a.get(str2) + "\n";
        }
        return str;
    }

    public x(View view) {
        this.f29592b = view;
    }
}
