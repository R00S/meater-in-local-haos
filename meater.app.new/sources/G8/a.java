package G8;

import I8.a;
import android.text.TextUtils;
import com.google.firebase.abt.AbtException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* compiled from: AbtExperimentInfo.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: g, reason: collision with root package name */
    private static final String[] f4982g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* renamed from: h, reason: collision with root package name */
    static final DateFormat f4983h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* renamed from: a, reason: collision with root package name */
    private final String f4984a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4985b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4986c;

    /* renamed from: d, reason: collision with root package name */
    private final Date f4987d;

    /* renamed from: e, reason: collision with root package name */
    private final long f4988e;

    /* renamed from: f, reason: collision with root package name */
    private final long f4989f;

    public a(String str, String str2, String str3, Date date, long j10, long j11) {
        this.f4984a = str;
        this.f4985b = str2;
        this.f4986c = str3;
        this.f4987d = date;
        this.f4988e = j10;
        this.f4989f = j11;
    }

    static a a(a.c cVar) {
        String str = cVar.f6738d;
        if (str == null) {
            str = "";
        }
        return new a(cVar.f6736b, String.valueOf(cVar.f6737c), str, new Date(cVar.f6747m), cVar.f6739e, cVar.f6744j);
    }

    static a b(Map<String, String> map) throws AbtException, NumberFormatException, ParseException {
        g(map);
        try {
            return new a(map.get("experimentId"), map.get("variantId"), map.containsKey("triggerEvent") ? map.get("triggerEvent") : "", f4983h.parse(map.get("experimentStartTime")), Long.parseLong(map.get("triggerTimeoutMillis")), Long.parseLong(map.get("timeToLiveMillis")));
        } catch (NumberFormatException e10) {
            throw new AbtException("Could not process experiment: one of the durations could not be converted into a long.", e10);
        } catch (ParseException e11) {
            throw new AbtException("Could not process experiment: parsing experiment start time failed.", e11);
        }
    }

    private static void g(Map<String, String> map) throws AbtException {
        ArrayList arrayList = new ArrayList();
        for (String str : f4982g) {
            if (!map.containsKey(str)) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new AbtException(String.format("The following keys are missing from the experiment info map: %s", arrayList));
        }
    }

    String c() {
        return this.f4984a;
    }

    long d() {
        return this.f4987d.getTime();
    }

    String e() {
        return this.f4985b;
    }

    a.c f(String str) {
        a.c cVar = new a.c();
        cVar.f6735a = str;
        cVar.f6747m = d();
        cVar.f6736b = this.f4984a;
        cVar.f6737c = this.f4985b;
        cVar.f6738d = TextUtils.isEmpty(this.f4986c) ? null : this.f4986c;
        cVar.f6739e = this.f4988e;
        cVar.f6744j = this.f4989f;
        return cVar;
    }
}
