package p345i.p346a.p347g;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p345i.p346a.p347g.p348s.EnumC9209d;
import p345i.p346a.p347g.p348s.EnumC9210e;

/* compiled from: DNSCache.java */
/* renamed from: i.a.g.a */
/* loaded from: classes2.dex */
public class C9188a extends ConcurrentHashMap<String, List<AbstractC9189b>> {
    public C9188a(C9188a c9188a) {
        this(c9188a != null ? c9188a.size() : 1024);
        if (c9188a != null) {
            putAll(c9188a);
        }
    }

    /* renamed from: a */
    private Collection<? extends AbstractC9189b> m29436a(String str) {
        return get(str != null ? str.toLowerCase() : null);
    }

    /* renamed from: b */
    public boolean m29437b(AbstractC9189b abstractC9189b) {
        if (abstractC9189b == null) {
            return false;
        }
        List<AbstractC9189b> list = get(abstractC9189b.m29446b());
        if (list == null) {
            putIfAbsent(abstractC9189b.m29446b(), new ArrayList());
            list = get(abstractC9189b.m29446b());
        }
        synchronized (list) {
            list.add(abstractC9189b);
        }
        return true;
    }

    /* renamed from: c */
    public Collection<AbstractC9189b> m29438c() {
        ArrayList arrayList = new ArrayList();
        for (List<AbstractC9189b> list : values()) {
            if (list != null) {
                arrayList.addAll(list);
            }
        }
        return arrayList;
    }

    @Override // java.util.AbstractMap
    protected Object clone() throws CloneNotSupportedException {
        return new C9188a(this);
    }

    /* renamed from: d */
    public AbstractC9189b m29439d(String str, EnumC9210e enumC9210e, EnumC9209d enumC9209d) {
        Collection<? extends AbstractC9189b> collectionM29436a = m29436a(str);
        AbstractC9189b abstractC9189b = null;
        if (collectionM29436a != null) {
            synchronized (collectionM29436a) {
                Iterator<? extends AbstractC9189b> it = collectionM29436a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    AbstractC9189b next = it.next();
                    if (next.m29464t(enumC9210e) && next.m29463s(enumC9209d)) {
                        abstractC9189b = next;
                        break;
                    }
                }
            }
        }
        return abstractC9189b;
    }

    /* renamed from: e */
    public AbstractC9189b m29440e(AbstractC9189b abstractC9189b) {
        Collection<? extends AbstractC9189b> collectionM29436a;
        AbstractC9189b abstractC9189b2 = null;
        if (abstractC9189b != null && (collectionM29436a = m29436a(abstractC9189b.m29446b())) != null) {
            synchronized (collectionM29436a) {
                Iterator<? extends AbstractC9189b> it = collectionM29436a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    AbstractC9189b next = it.next();
                    if (next.mo29456l(abstractC9189b)) {
                        abstractC9189b2 = next;
                        break;
                    }
                }
            }
        }
        return abstractC9189b2;
    }

    /* renamed from: f */
    public Collection<? extends AbstractC9189b> m29441f(String str) {
        ArrayList arrayList;
        Collection<? extends AbstractC9189b> collectionM29436a = m29436a(str);
        if (collectionM29436a == null) {
            return Collections.emptyList();
        }
        synchronized (collectionM29436a) {
            arrayList = new ArrayList(collectionM29436a);
        }
        return arrayList;
    }

    /* renamed from: h */
    public Collection<? extends AbstractC9189b> m29442h(String str, EnumC9210e enumC9210e, EnumC9209d enumC9209d) {
        ArrayList arrayList;
        Collection<? extends AbstractC9189b> collectionM29436a = m29436a(str);
        if (collectionM29436a == null) {
            return Collections.emptyList();
        }
        synchronized (collectionM29436a) {
            arrayList = new ArrayList(collectionM29436a);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC9189b abstractC9189b = (AbstractC9189b) it.next();
                if (!abstractC9189b.m29464t(enumC9210e) || !abstractC9189b.m29463s(enumC9209d)) {
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    public boolean m29443i(AbstractC9189b abstractC9189b) {
        List<AbstractC9189b> list;
        if (abstractC9189b == null || (list = get(abstractC9189b.m29446b())) == null) {
            return false;
        }
        synchronized (list) {
            list.remove(abstractC9189b);
        }
        return false;
    }

    /* renamed from: j */
    public boolean m29444j(AbstractC9189b abstractC9189b, AbstractC9189b abstractC9189b2) {
        if (abstractC9189b == null || abstractC9189b2 == null || !abstractC9189b.m29446b().equals(abstractC9189b2.m29446b())) {
            return false;
        }
        List<AbstractC9189b> list = get(abstractC9189b.m29446b());
        if (list == null) {
            putIfAbsent(abstractC9189b.m29446b(), new ArrayList());
            list = get(abstractC9189b.m29446b());
        }
        synchronized (list) {
            list.remove(abstractC9189b2);
            list.add(abstractC9189b);
        }
        return true;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap
    public synchronized String toString() {
        StringBuffer stringBuffer;
        stringBuffer = new StringBuffer(2000);
        stringBuffer.append("\t---- cache ----");
        Enumeration enumerationKeys = keys();
        while (enumerationKeys.hasMoreElements()) {
            String str = (String) enumerationKeys.nextElement();
            stringBuffer.append("\n\t\t");
            stringBuffer.append("\n\t\tname '");
            stringBuffer.append(str);
            stringBuffer.append("' ");
            List<AbstractC9189b> list = (List) get(str);
            if (list == null || list.isEmpty()) {
                stringBuffer.append(" no entries");
            } else {
                synchronized (list) {
                    for (AbstractC9189b abstractC9189b : list) {
                        stringBuffer.append("\n\t\t\t");
                        stringBuffer.append(abstractC9189b.toString());
                    }
                }
            }
        }
        return stringBuffer.toString();
    }

    public C9188a(int i2) {
        super(i2);
    }
}
