package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10022b0;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import okhttp3.HttpUrl;

/* compiled from: ReflectJavaValueParameter.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.b0 */
/* loaded from: classes2.dex */
public final class C10700b0 extends AbstractC10715p implements InterfaceC10022b0 {

    /* renamed from: a */
    private final AbstractC10725z f41167a;

    /* renamed from: b */
    private final Annotation[] f41168b;

    /* renamed from: c */
    private final String f41169c;

    /* renamed from: d */
    private final boolean f41170d;

    public C10700b0(AbstractC10725z abstractC10725z, Annotation[] annotationArr, String str, boolean z) {
        C9801m.m32346f(abstractC10725z, "type");
        C9801m.m32346f(annotationArr, "reflectAnnotations");
        this.f41167a = abstractC10725z;
        this.f41168b = annotationArr;
        this.f41169c = str;
        this.f41170d = z;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10025d
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public C10704e mo33582l(C10160c c10160c) {
        C9801m.m32346f(c10160c, "fqName");
        return C10708i.m38084a(this.f41168b, c10160c);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10025d
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public List<C10704e> getAnnotations() {
        return C10708i.m38085b(this.f41168b);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10022b0
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public AbstractC10725z getType() {
        return this.f41167a;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10022b0
    public C10163f getName() {
        String str = this.f41169c;
        if (str != null) {
            return C10163f.m35453v(str);
        }
        return null;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10022b0
    /* renamed from: h */
    public boolean mo33578h() {
        return this.f41170d;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10025d
    /* renamed from: m */
    public boolean mo33583m() {
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C10700b0.class.getName());
        sb.append(": ");
        sb.append(mo33578h() ? "vararg " : HttpUrl.FRAGMENT_ENCODE_SET);
        sb.append(getName());
        sb.append(": ");
        sb.append(getType());
        return sb.toString();
    }
}
