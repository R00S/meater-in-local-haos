package kotlin.reflect.p371y.internal.p374j0.p380d.p381a;

import java.util.List;
import java.util.Map;
import kotlin.C10550i;
import kotlin.Lazy;
import kotlin.collections.C10810q0;
import kotlin.collections.C10815t;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;

/* compiled from: Jsr305Settings.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.y */
/* loaded from: classes2.dex */
public final class C10079y {

    /* renamed from: a */
    private final EnumC9955f0 f38323a;

    /* renamed from: b */
    private final EnumC9955f0 f38324b;

    /* renamed from: c */
    private final Map<C10160c, EnumC9955f0> f38325c;

    /* renamed from: d */
    private final Lazy f38326d;

    /* renamed from: e */
    private final boolean f38327e;

    /* compiled from: Jsr305Settings.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.y$a */
    static final class a extends Lambda implements Function0<String[]> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String[] invoke() {
            C10079y c10079y = C10079y.this;
            List listM38881c = C10815t.m38881c();
            listM38881c.add(c10079y.m33824a().m33093k());
            EnumC9955f0 enumC9955f0M33825b = c10079y.m33825b();
            if (enumC9955f0M33825b != null) {
                listM38881c.add("under-migration:" + enumC9955f0M33825b.m33093k());
            }
            for (Map.Entry<C10160c, EnumC9955f0> entry : c10079y.m33826c().entrySet()) {
                listM38881c.add('@' + entry.getKey() + ':' + entry.getValue().m33093k());
            }
            Object[] array = C10815t.m38879a(listM38881c).toArray(new String[0]);
            C9801m.m32344d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            return (String[]) array;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C10079y(EnumC9955f0 enumC9955f0, EnumC9955f0 enumC9955f02, Map<C10160c, ? extends EnumC9955f0> map) {
        C9801m.m32346f(enumC9955f0, "globalLevel");
        C9801m.m32346f(map, "userDefinedLevelForSpecificAnnotation");
        this.f38323a = enumC9955f0;
        this.f38324b = enumC9955f02;
        this.f38325c = map;
        this.f38326d = C10550i.m37594b(new a());
        EnumC9955f0 enumC9955f03 = EnumC9955f0.IGNORE;
        this.f38327e = enumC9955f0 == enumC9955f03 && enumC9955f02 == enumC9955f03 && map.isEmpty();
    }

    /* renamed from: a */
    public final EnumC9955f0 m33824a() {
        return this.f38323a;
    }

    /* renamed from: b */
    public final EnumC9955f0 m33825b() {
        return this.f38324b;
    }

    /* renamed from: c */
    public final Map<C10160c, EnumC9955f0> m33826c() {
        return this.f38325c;
    }

    /* renamed from: d */
    public final boolean m33827d() {
        return this.f38327e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10079y)) {
            return false;
        }
        C10079y c10079y = (C10079y) obj;
        return this.f38323a == c10079y.f38323a && this.f38324b == c10079y.f38324b && C9801m.m32341a(this.f38325c, c10079y.f38325c);
    }

    public int hashCode() {
        int iHashCode = this.f38323a.hashCode() * 31;
        EnumC9955f0 enumC9955f0 = this.f38324b;
        return ((iHashCode + (enumC9955f0 == null ? 0 : enumC9955f0.hashCode())) * 31) + this.f38325c.hashCode();
    }

    public String toString() {
        return "Jsr305Settings(globalLevel=" + this.f38323a + ", migrationLevel=" + this.f38324b + ", userDefinedLevelForSpecificAnnotation=" + this.f38325c + ')';
    }

    public /* synthetic */ C10079y(EnumC9955f0 enumC9955f0, EnumC9955f0 enumC9955f02, Map map, int i2, C9789g c9789g) {
        this(enumC9955f0, (i2 & 2) != 0 ? null : enumC9955f02, (i2 & 4) != 0 ? C10810q0.m38797i() : map);
    }
}
