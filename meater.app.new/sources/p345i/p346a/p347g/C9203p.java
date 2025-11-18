package p345i.p346a.p347g;

import p345i.p346a.AbstractC9182a;
import p345i.p346a.AbstractC9184c;
import p345i.p346a.AbstractC9185d;

/* compiled from: ServiceEventImpl.java */
/* renamed from: i.a.g.p */
/* loaded from: classes2.dex */
public class C9203p extends AbstractC9184c {

    /* renamed from: f */
    private final String f35442f;

    /* renamed from: g */
    private final String f35443g;

    /* renamed from: h */
    private final AbstractC9185d f35444h;

    public C9203p(C9199l c9199l, String str, String str2, AbstractC9185d abstractC9185d) {
        super(c9199l);
        this.f35442f = str;
        this.f35443g = str2;
        this.f35444h = abstractC9185d;
    }

    @Override // p345i.p346a.AbstractC9184c
    /* renamed from: d */
    public AbstractC9182a mo29411d() {
        return (AbstractC9182a) getSource();
    }

    @Override // p345i.p346a.AbstractC9184c
    /* renamed from: e */
    public AbstractC9185d mo29412e() {
        return this.f35444h;
    }

    @Override // p345i.p346a.AbstractC9184c
    /* renamed from: f */
    public String mo29413f() {
        return this.f35443g;
    }

    @Override // p345i.p346a.AbstractC9184c
    /* renamed from: g */
    public String mo29414g() {
        return this.f35442f;
    }

    @Override // p345i.p346a.AbstractC9184c
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C9203p clone() {
        return new C9203p((C9199l) mo29411d(), mo29414g(), mo29413f(), new C9204q(mo29412e()));
    }

    @Override // java.util.EventObject
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[" + C9203p.class.getSimpleName() + "@" + System.identityHashCode(this) + " ");
        sb.append("\n\tname: '");
        sb.append(mo29413f());
        sb.append("' type: '");
        sb.append(mo29414g());
        sb.append("' info: '");
        sb.append(mo29412e());
        sb.append("']");
        return sb.toString();
    }
}
