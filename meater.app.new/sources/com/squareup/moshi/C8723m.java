package com.squareup.moshi;

import com.squareup.moshi.AbstractC8719i;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: JsonValueReader.java */
/* renamed from: com.squareup.moshi.m */
/* loaded from: classes2.dex */
final class C8723m extends AbstractC8719i {

    /* renamed from: l */
    private static final Object f33136l = new Object();

    /* renamed from: m */
    private Object[] f33137m;

    /* compiled from: JsonValueReader.java */
    /* renamed from: com.squareup.moshi.m$a */
    static final class a implements Iterator<Object>, Cloneable {

        /* renamed from: f */
        final AbstractC8719i.b f33138f;

        /* renamed from: g */
        final Object[] f33139g;

        /* renamed from: h */
        int f33140h;

        a(AbstractC8719i.b bVar, Object[] objArr, int i2) {
            this.f33138f = bVar;
            this.f33139g = objArr;
            this.f33140h = i2;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a clone() {
            return new a(this.f33138f, this.f33139g, this.f33140h);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f33140h < this.f33139g.length;
        }

        @Override // java.util.Iterator
        public Object next() {
            Object[] objArr = this.f33139g;
            int i2 = this.f33140h;
            this.f33140h = i2 + 1;
            return objArr[i2];
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    C8723m(Object obj) {
        int[] iArr = this.f33103g;
        int i2 = this.f33102f;
        iArr[i2] = 7;
        Object[] objArr = new Object[32];
        this.f33137m = objArr;
        this.f33102f = i2 + 1;
        objArr[i2] = obj;
    }

    /* renamed from: Z */
    private void m27762Z(Object obj) {
        int i2 = this.f33102f;
        if (i2 == this.f33137m.length) {
            if (i2 == 256) {
                throw new JsonDataException("Nesting too deep at " + m27716g());
            }
            int[] iArr = this.f33103g;
            this.f33103g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f33104h;
            this.f33104h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f33105i;
            this.f33105i = Arrays.copyOf(iArr2, iArr2.length * 2);
            Object[] objArr = this.f33137m;
            this.f33137m = Arrays.copyOf(objArr, objArr.length * 2);
        }
        Object[] objArr2 = this.f33137m;
        int i3 = this.f33102f;
        this.f33102f = i3 + 1;
        objArr2[i3] = obj;
    }

    /* renamed from: a0 */
    private void m27763a0() {
        int i2 = this.f33102f - 1;
        this.f33102f = i2;
        Object[] objArr = this.f33137m;
        objArr[i2] = null;
        this.f33103g[i2] = 0;
        if (i2 > 0) {
            int[] iArr = this.f33105i;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            Object obj = objArr[i2 - 1];
            if (obj instanceof Iterator) {
                Iterator it = (Iterator) obj;
                if (it.hasNext()) {
                    m27762Z(it.next());
                }
            }
        }
    }

    /* renamed from: e0 */
    private <T> T m27764e0(Class<T> cls, AbstractC8719i.b bVar) throws IOException {
        int i2 = this.f33102f;
        Object obj = i2 != 0 ? this.f33137m[i2 - 1] : null;
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        if (obj == null && bVar == AbstractC8719i.b.NULL) {
            return null;
        }
        if (obj == f33136l) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw m27709W(obj, bVar);
    }

    /* renamed from: f0 */
    private String m27765f0(Map.Entry<?, ?> entry) {
        Object key = entry.getKey();
        if (key instanceof String) {
            return (String) key;
        }
        throw m27709W(key, AbstractC8719i.b.NAME);
    }

    @Override // com.squareup.moshi.AbstractC8719i
    /* renamed from: A */
    public AbstractC8719i.b mo27699A() throws IOException {
        int i2 = this.f33102f;
        if (i2 == 0) {
            return AbstractC8719i.b.END_DOCUMENT;
        }
        Object obj = this.f33137m[i2 - 1];
        if (obj instanceof a) {
            return ((a) obj).f33138f;
        }
        if (obj instanceof List) {
            return AbstractC8719i.b.BEGIN_ARRAY;
        }
        if (obj instanceof Map) {
            return AbstractC8719i.b.BEGIN_OBJECT;
        }
        if (obj instanceof Map.Entry) {
            return AbstractC8719i.b.NAME;
        }
        if (obj instanceof String) {
            return AbstractC8719i.b.STRING;
        }
        if (obj instanceof Boolean) {
            return AbstractC8719i.b.BOOLEAN;
        }
        if (obj instanceof Number) {
            return AbstractC8719i.b.NUMBER;
        }
        if (obj == null) {
            return AbstractC8719i.b.NULL;
        }
        if (obj == f33136l) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw m27709W(obj, "a JSON value");
    }

    @Override // com.squareup.moshi.AbstractC8719i
    /* renamed from: B */
    public void mo27700B() throws IOException {
        if (mo27715f()) {
            m27762Z(m27766Y());
        }
    }

    @Override // com.squareup.moshi.AbstractC8719i
    /* renamed from: H */
    public int mo27702H(AbstractC8719i.a aVar) throws IOException {
        Map.Entry<?, ?> entry = (Map.Entry) m27764e0(Map.Entry.class, AbstractC8719i.b.NAME);
        String strM27765f0 = m27765f0(entry);
        int length = aVar.f33108a.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (aVar.f33108a[i2].equals(strM27765f0)) {
                this.f33137m[this.f33102f - 1] = entry.getValue();
                this.f33104h[this.f33102f - 2] = strM27765f0;
                return i2;
            }
        }
        return -1;
    }

    @Override // com.squareup.moshi.AbstractC8719i
    /* renamed from: I */
    public int mo27703I(AbstractC8719i.a aVar) throws IOException {
        int i2 = this.f33102f;
        Object obj = i2 != 0 ? this.f33137m[i2 - 1] : null;
        if (!(obj instanceof String)) {
            if (obj != f33136l) {
                return -1;
            }
            throw new IllegalStateException("JsonReader is closed");
        }
        String str = (String) obj;
        int length = aVar.f33108a.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (aVar.f33108a[i3].equals(str)) {
                m27763a0();
                return i3;
            }
        }
        return -1;
    }

    @Override // com.squareup.moshi.AbstractC8719i
    /* renamed from: N */
    public void mo27706N() throws IOException {
        if (!this.f33107k) {
            this.f33137m[this.f33102f - 1] = ((Map.Entry) m27764e0(Map.Entry.class, AbstractC8719i.b.NAME)).getValue();
            this.f33104h[this.f33102f - 2] = "null";
            return;
        }
        AbstractC8719i.b bVarMo27699A = mo27699A();
        m27766Y();
        throw new JsonDataException("Cannot skip unexpected " + bVarMo27699A + " at " + m27716g());
    }

    @Override // com.squareup.moshi.AbstractC8719i
    /* renamed from: Q */
    public void mo27707Q() throws IOException {
        if (this.f33107k) {
            throw new JsonDataException("Cannot skip unexpected " + mo27699A() + " at " + m27716g());
        }
        int i2 = this.f33102f;
        if (i2 > 1) {
            this.f33104h[i2 - 2] = "null";
        }
        Object obj = i2 != 0 ? this.f33137m[i2 - 1] : null;
        if (obj instanceof a) {
            throw new JsonDataException("Expected a value but was " + mo27699A() + " at path " + m27716g());
        }
        if (obj instanceof Map.Entry) {
            Object[] objArr = this.f33137m;
            objArr[i2 - 1] = ((Map.Entry) objArr[i2 - 1]).getValue();
        } else {
            if (i2 > 0) {
                m27763a0();
                return;
            }
            throw new JsonDataException("Expected a value but was " + mo27699A() + " at path " + m27716g());
        }
    }

    /* renamed from: Y */
    public String m27766Y() throws IOException {
        Map.Entry<?, ?> entry = (Map.Entry) m27764e0(Map.Entry.class, AbstractC8719i.b.NAME);
        String strM27765f0 = m27765f0(entry);
        this.f33137m[this.f33102f - 1] = entry.getValue();
        this.f33104h[this.f33102f - 2] = strM27765f0;
        return strM27765f0;
    }

    @Override // com.squareup.moshi.AbstractC8719i
    /* renamed from: a */
    public void mo27710a() throws IOException {
        List list = (List) m27764e0(List.class, AbstractC8719i.b.BEGIN_ARRAY);
        a aVar = new a(AbstractC8719i.b.END_ARRAY, list.toArray(new Object[list.size()]), 0);
        Object[] objArr = this.f33137m;
        int i2 = this.f33102f;
        objArr[i2 - 1] = aVar;
        this.f33103g[i2 - 1] = 1;
        this.f33105i[i2 - 1] = 0;
        if (aVar.hasNext()) {
            m27762Z(aVar.next());
        }
    }

    @Override // com.squareup.moshi.AbstractC8719i
    /* renamed from: b */
    public void mo27711b() throws IOException {
        Map map = (Map) m27764e0(Map.class, AbstractC8719i.b.BEGIN_OBJECT);
        a aVar = new a(AbstractC8719i.b.END_OBJECT, map.entrySet().toArray(new Object[map.size()]), 0);
        Object[] objArr = this.f33137m;
        int i2 = this.f33102f;
        objArr[i2 - 1] = aVar;
        this.f33103g[i2 - 1] = 3;
        if (aVar.hasNext()) {
            m27762Z(aVar.next());
        }
    }

    @Override // com.squareup.moshi.AbstractC8719i
    /* renamed from: c */
    public void mo27712c() throws IOException {
        AbstractC8719i.b bVar = AbstractC8719i.b.END_ARRAY;
        a aVar = (a) m27764e0(a.class, bVar);
        if (aVar.f33138f != bVar || aVar.hasNext()) {
            throw m27709W(aVar, bVar);
        }
        m27763a0();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Arrays.fill(this.f33137m, 0, this.f33102f, (Object) null);
        this.f33137m[0] = f33136l;
        this.f33103g[0] = 8;
        this.f33102f = 1;
    }

    @Override // com.squareup.moshi.AbstractC8719i
    /* renamed from: d */
    public void mo27713d() throws IOException {
        AbstractC8719i.b bVar = AbstractC8719i.b.END_OBJECT;
        a aVar = (a) m27764e0(a.class, bVar);
        if (aVar.f33138f != bVar || aVar.hasNext()) {
            throw m27709W(aVar, bVar);
        }
        this.f33104h[this.f33102f - 1] = null;
        m27763a0();
    }

    @Override // com.squareup.moshi.AbstractC8719i
    /* renamed from: f */
    public boolean mo27715f() throws IOException {
        int i2 = this.f33102f;
        if (i2 == 0) {
            return false;
        }
        Object obj = this.f33137m[i2 - 1];
        return !(obj instanceof Iterator) || ((Iterator) obj).hasNext();
    }

    @Override // com.squareup.moshi.AbstractC8719i
    /* renamed from: k */
    public boolean mo27718k() throws IOException {
        Boolean bool = (Boolean) m27764e0(Boolean.class, AbstractC8719i.b.BOOLEAN);
        m27763a0();
        return bool.booleanValue();
    }

    @Override // com.squareup.moshi.AbstractC8719i
    /* renamed from: l */
    public double mo27719l() throws IOException, NumberFormatException {
        double dDoubleValue;
        AbstractC8719i.b bVar = AbstractC8719i.b.NUMBER;
        Object objM27764e0 = m27764e0(Object.class, bVar);
        if (objM27764e0 instanceof Number) {
            dDoubleValue = ((Number) objM27764e0).doubleValue();
        } else {
            if (!(objM27764e0 instanceof String)) {
                throw m27709W(objM27764e0, bVar);
            }
            try {
                dDoubleValue = Double.parseDouble((String) objM27764e0);
            } catch (NumberFormatException unused) {
                throw m27709W(objM27764e0, AbstractC8719i.b.NUMBER);
            }
        }
        if (this.f33106j || !(Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue))) {
            m27763a0();
            return dDoubleValue;
        }
        throw new JsonEncodingException("JSON forbids NaN and infinities: " + dDoubleValue + " at path " + m27716g());
    }

    @Override // com.squareup.moshi.AbstractC8719i
    /* renamed from: m */
    public int mo27720m() throws IOException, NumberFormatException {
        int iIntValueExact;
        AbstractC8719i.b bVar = AbstractC8719i.b.NUMBER;
        Object objM27764e0 = m27764e0(Object.class, bVar);
        if (objM27764e0 instanceof Number) {
            iIntValueExact = ((Number) objM27764e0).intValue();
        } else {
            if (!(objM27764e0 instanceof String)) {
                throw m27709W(objM27764e0, bVar);
            }
            try {
                try {
                    iIntValueExact = Integer.parseInt((String) objM27764e0);
                } catch (NumberFormatException unused) {
                    iIntValueExact = new BigDecimal((String) objM27764e0).intValueExact();
                }
            } catch (NumberFormatException unused2) {
                throw m27709W(objM27764e0, AbstractC8719i.b.NUMBER);
            }
        }
        m27763a0();
        return iIntValueExact;
    }

    @Override // com.squareup.moshi.AbstractC8719i
    /* renamed from: p */
    public long mo27721p() throws IOException, NumberFormatException {
        long jLongValueExact;
        AbstractC8719i.b bVar = AbstractC8719i.b.NUMBER;
        Object objM27764e0 = m27764e0(Object.class, bVar);
        if (objM27764e0 instanceof Number) {
            jLongValueExact = ((Number) objM27764e0).longValue();
        } else {
            if (!(objM27764e0 instanceof String)) {
                throw m27709W(objM27764e0, bVar);
            }
            try {
                try {
                    jLongValueExact = Long.parseLong((String) objM27764e0);
                } catch (NumberFormatException unused) {
                    jLongValueExact = new BigDecimal((String) objM27764e0).longValueExact();
                }
            } catch (NumberFormatException unused2) {
                throw m27709W(objM27764e0, AbstractC8719i.b.NUMBER);
            }
        }
        m27763a0();
        return jLongValueExact;
    }

    @Override // com.squareup.moshi.AbstractC8719i
    /* renamed from: x */
    public <T> T mo27722x() throws IOException {
        m27764e0(Void.class, AbstractC8719i.b.NULL);
        m27763a0();
        return null;
    }

    @Override // com.squareup.moshi.AbstractC8719i
    /* renamed from: y */
    public String mo27723y() throws IOException {
        int i2 = this.f33102f;
        Object obj = i2 != 0 ? this.f33137m[i2 - 1] : null;
        if (obj instanceof String) {
            m27763a0();
            return (String) obj;
        }
        if (obj instanceof Number) {
            m27763a0();
            return obj.toString();
        }
        if (obj == f33136l) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw m27709W(obj, AbstractC8719i.b.STRING);
    }
}
