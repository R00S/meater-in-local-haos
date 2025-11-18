package S8;

import T8.F;
import c9.InterfaceC2346a;
import com.google.auto.value.AutoValue;
import e9.C3260d;
import org.json.JSONObject;

/* compiled from: RolloutAssignment.java */
@AutoValue
/* loaded from: classes2.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC2346a f15569a = new C3260d().j(a.f15520a).i();

    static j a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        return b(jSONObject.getString("rolloutId"), jSONObject.getString("parameterKey"), jSONObject.getString("parameterValue"), jSONObject.getString("variantId"), jSONObject.getLong("templateVersion"));
    }

    public static j b(String str, String str2, String str3, String str4, long j10) {
        return new b(str, str2, i(str3), str4, j10);
    }

    private static String i(String str) {
        return str.length() > 256 ? str.substring(0, 256) : str;
    }

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract long f();

    public abstract String g();

    public F.e.d.AbstractC0251e h() {
        return F.e.d.AbstractC0251e.a().d(F.e.d.AbstractC0251e.b.a().c(g()).b(e()).a()).b(c()).c(d()).e(f()).a();
    }
}
