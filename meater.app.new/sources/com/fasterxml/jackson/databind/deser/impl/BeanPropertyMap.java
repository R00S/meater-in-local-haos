package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public class BeanPropertyMap implements Iterable<SettableBeanProperty>, Serializable {
    protected final boolean _caseInsensitive;
    private Object[] _hashArea;
    private int _hashMask;
    private SettableBeanProperty[] _propsInOrder;
    private int _size;
    private int _spillCount;

    public BeanPropertyMap(boolean z, Collection<SettableBeanProperty> collection) {
        this._caseInsensitive = z;
        this._propsInOrder = (SettableBeanProperty[]) collection.toArray(new SettableBeanProperty[collection.size()]);
        init(collection);
    }

    private final SettableBeanProperty _find2(String str, int i2, Object obj) {
        if (obj == null) {
            return null;
        }
        int i3 = this._hashMask + 1;
        int i4 = ((i2 >> 1) + i3) << 1;
        Object obj2 = this._hashArea[i4];
        if (str.equals(obj2)) {
            return (SettableBeanProperty) this._hashArea[i4 + 1];
        }
        if (obj2 != null) {
            int i5 = (i3 + (i3 >> 1)) << 1;
            int i6 = this._spillCount + i5;
            while (i5 < i6) {
                Object obj3 = this._hashArea[i5];
                if (obj3 == str || str.equals(obj3)) {
                    return (SettableBeanProperty) this._hashArea[i5 + 1];
                }
                i5 += 2;
            }
        }
        return null;
    }

    private final int _findFromOrdered(SettableBeanProperty settableBeanProperty) {
        int length = this._propsInOrder.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (this._propsInOrder[i2] == settableBeanProperty) {
                return i2;
            }
        }
        throw new IllegalStateException("Illegal state: property '" + settableBeanProperty.getName() + "' missing from _propsInOrder");
    }

    private final int _findIndexInHash(String str) {
        int i_hashCode = _hashCode(str);
        int i2 = i_hashCode << 1;
        if (str.equals(this._hashArea[i2])) {
            return i2 + 1;
        }
        int i3 = this._hashMask + 1;
        int i4 = ((i_hashCode >> 1) + i3) << 1;
        if (str.equals(this._hashArea[i4])) {
            return i4 + 1;
        }
        int i5 = (i3 + (i3 >> 1)) << 1;
        int i6 = this._spillCount + i5;
        while (i5 < i6) {
            if (str.equals(this._hashArea[i5])) {
                return i5 + 1;
            }
            i5 += 2;
        }
        return -1;
    }

    private final int _hashCode(String str) {
        return str.hashCode() & this._hashMask;
    }

    public static BeanPropertyMap construct(Collection<SettableBeanProperty> collection, boolean z) {
        return new BeanPropertyMap(z, collection);
    }

    private static final int findSize(int i2) {
        if (i2 <= 5) {
            return 8;
        }
        if (i2 <= 12) {
            return 16;
        }
        int i3 = 32;
        while (i3 < i2 + (i2 >> 2)) {
            i3 += i3;
        }
        return i3;
    }

    private List<SettableBeanProperty> properties() {
        ArrayList arrayList = new ArrayList(this._size);
        int length = this._hashArea.length;
        for (int i2 = 1; i2 < length; i2 += 2) {
            SettableBeanProperty settableBeanProperty = (SettableBeanProperty) this._hashArea[i2];
            if (settableBeanProperty != null) {
                arrayList.add(settableBeanProperty);
            }
        }
        return arrayList;
    }

    protected SettableBeanProperty _rename(SettableBeanProperty settableBeanProperty, NameTransformer nameTransformer) {
        JsonDeserializer<Object> jsonDeserializerUnwrappingDeserializer;
        if (settableBeanProperty == null) {
            return settableBeanProperty;
        }
        SettableBeanProperty settableBeanPropertyWithSimpleName = settableBeanProperty.withSimpleName(nameTransformer.transform(settableBeanProperty.getName()));
        JsonDeserializer<Object> valueDeserializer = settableBeanPropertyWithSimpleName.getValueDeserializer();
        return (valueDeserializer == null || (jsonDeserializerUnwrappingDeserializer = valueDeserializer.unwrappingDeserializer(nameTransformer)) == valueDeserializer) ? settableBeanPropertyWithSimpleName : settableBeanPropertyWithSimpleName.withValueDeserializer(jsonDeserializerUnwrappingDeserializer);
    }

    public BeanPropertyMap assignIndexes() {
        int length = this._hashArea.length;
        int i2 = 0;
        for (int i3 = 1; i3 < length; i3 += 2) {
            SettableBeanProperty settableBeanProperty = (SettableBeanProperty) this._hashArea[i3];
            if (settableBeanProperty != null) {
                settableBeanProperty.assignIndex(i2);
                i2++;
            }
        }
        return this;
    }

    public SettableBeanProperty find(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Can not pass null property name");
        }
        if (this._caseInsensitive) {
            str = str.toLowerCase();
        }
        int iHashCode = str.hashCode() & this._hashMask;
        int i2 = iHashCode << 1;
        Object obj = this._hashArea[i2];
        return (obj == str || str.equals(obj)) ? (SettableBeanProperty) this._hashArea[i2 + 1] : _find2(str, iHashCode, obj);
    }

    public SettableBeanProperty[] getPropertiesInInsertionOrder() {
        return this._propsInOrder;
    }

    protected final String getPropertyName(SettableBeanProperty settableBeanProperty) {
        boolean z = this._caseInsensitive;
        String name = settableBeanProperty.getName();
        return z ? name.toLowerCase() : name;
    }

    protected void init(Collection<SettableBeanProperty> collection) {
        int size = collection.size();
        this._size = size;
        int iFindSize = findSize(size);
        this._hashMask = iFindSize - 1;
        int i2 = (iFindSize >> 1) + iFindSize;
        Object[] objArrCopyOf = new Object[i2 * 2];
        int i3 = 0;
        for (SettableBeanProperty settableBeanProperty : collection) {
            if (settableBeanProperty != null) {
                String propertyName = getPropertyName(settableBeanProperty);
                int i_hashCode = _hashCode(propertyName);
                int i4 = i_hashCode << 1;
                if (objArrCopyOf[i4] != null) {
                    i4 = ((i_hashCode >> 1) + iFindSize) << 1;
                    if (objArrCopyOf[i4] != null) {
                        i4 = (i2 << 1) + i3;
                        i3 += 2;
                        if (i4 >= objArrCopyOf.length) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, objArrCopyOf.length + 4);
                        }
                    }
                }
                objArrCopyOf[i4] = propertyName;
                objArrCopyOf[i4 + 1] = settableBeanProperty;
            }
        }
        this._hashArea = objArrCopyOf;
        this._spillCount = i3;
    }

    @Override // java.lang.Iterable
    public Iterator<SettableBeanProperty> iterator() {
        return properties().iterator();
    }

    public void remove(SettableBeanProperty settableBeanProperty) {
        ArrayList arrayList = new ArrayList(this._size);
        String propertyName = getPropertyName(settableBeanProperty);
        int length = this._hashArea.length;
        boolean zEquals = false;
        for (int i2 = 1; i2 < length; i2 += 2) {
            SettableBeanProperty settableBeanProperty2 = (SettableBeanProperty) this._hashArea[i2];
            if (settableBeanProperty2 != null) {
                if (zEquals || !(zEquals = propertyName.equals(settableBeanProperty2.getName()))) {
                    arrayList.add(settableBeanProperty2);
                } else {
                    this._propsInOrder[_findFromOrdered(settableBeanProperty2)] = null;
                }
            }
        }
        if (zEquals) {
            init(arrayList);
            return;
        }
        throw new NoSuchElementException("No entry '" + settableBeanProperty.getName() + "' found, can't remove");
    }

    public BeanPropertyMap renameAll(NameTransformer nameTransformer) {
        if (nameTransformer == null || nameTransformer == NameTransformer.NOP) {
            return this;
        }
        int length = this._propsInOrder.length;
        ArrayList arrayList = new ArrayList(length);
        for (int i2 = 0; i2 < length; i2++) {
            SettableBeanProperty settableBeanProperty = this._propsInOrder[i2];
            if (settableBeanProperty == null) {
                arrayList.add(settableBeanProperty);
            } else {
                arrayList.add(_rename(settableBeanProperty, nameTransformer));
            }
        }
        return new BeanPropertyMap(this._caseInsensitive, arrayList);
    }

    public void replace(SettableBeanProperty settableBeanProperty) {
        String propertyName = getPropertyName(settableBeanProperty);
        int i_findIndexInHash = _findIndexInHash(propertyName);
        if (i_findIndexInHash >= 0) {
            Object[] objArr = this._hashArea;
            SettableBeanProperty settableBeanProperty2 = (SettableBeanProperty) objArr[i_findIndexInHash];
            objArr[i_findIndexInHash] = settableBeanProperty;
            this._propsInOrder[_findFromOrdered(settableBeanProperty2)] = settableBeanProperty;
            return;
        }
        throw new NoSuchElementException("No entry '" + propertyName + "' found, can't replace");
    }

    public int size() {
        return this._size;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Properties=[");
        Iterator<SettableBeanProperty> it = iterator();
        int i2 = 0;
        while (it.hasNext()) {
            SettableBeanProperty next = it.next();
            int i3 = i2 + 1;
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(next.getName());
            sb.append('(');
            sb.append(next.getType());
            sb.append(')');
            i2 = i3;
        }
        sb.append(']');
        return sb.toString();
    }

    public BeanPropertyMap withCaseInsensitivity(boolean z) {
        return this._caseInsensitive == z ? this : new BeanPropertyMap(this, z);
    }

    public BeanPropertyMap withProperty(SettableBeanProperty settableBeanProperty) {
        String propertyName = getPropertyName(settableBeanProperty);
        int length = this._hashArea.length;
        for (int i2 = 1; i2 < length; i2 += 2) {
            SettableBeanProperty settableBeanProperty2 = (SettableBeanProperty) this._hashArea[i2];
            if (settableBeanProperty2 != null && settableBeanProperty2.getName().equals(propertyName)) {
                this._hashArea[i2] = settableBeanProperty;
                this._propsInOrder[_findFromOrdered(settableBeanProperty2)] = settableBeanProperty;
                return this;
            }
        }
        int i_hashCode = _hashCode(propertyName);
        int i3 = this._hashMask + 1;
        int i4 = i_hashCode << 1;
        Object[] objArr = this._hashArea;
        if (objArr[i4] != null) {
            i4 = ((i_hashCode >> 1) + i3) << 1;
            if (objArr[i4] != null) {
                int i5 = (i3 + (i3 >> 1)) << 1;
                int i6 = this._spillCount;
                i4 = i5 + i6;
                this._spillCount = i6 + 2;
                if (i4 >= objArr.length) {
                    this._hashArea = Arrays.copyOf(objArr, objArr.length + 4);
                }
            }
        }
        Object[] objArr2 = this._hashArea;
        objArr2[i4] = propertyName;
        objArr2[i4 + 1] = settableBeanProperty;
        SettableBeanProperty[] settableBeanPropertyArr = this._propsInOrder;
        int length2 = settableBeanPropertyArr.length;
        SettableBeanProperty[] settableBeanPropertyArr2 = (SettableBeanProperty[]) Arrays.copyOf(settableBeanPropertyArr, length2 + 1);
        this._propsInOrder = settableBeanPropertyArr2;
        settableBeanPropertyArr2[length2] = settableBeanProperty;
        return this;
    }

    public BeanPropertyMap withoutProperties(Collection<String> collection) {
        if (collection.isEmpty()) {
            return this;
        }
        int length = this._propsInOrder.length;
        ArrayList arrayList = new ArrayList(length);
        for (int i2 = 0; i2 < length; i2++) {
            SettableBeanProperty settableBeanProperty = this._propsInOrder[i2];
            if (settableBeanProperty != null && !collection.contains(settableBeanProperty.getName())) {
                arrayList.add(settableBeanProperty);
            }
        }
        return new BeanPropertyMap(this._caseInsensitive, arrayList);
    }

    protected BeanPropertyMap(BeanPropertyMap beanPropertyMap, boolean z) {
        this._caseInsensitive = z;
        SettableBeanProperty[] settableBeanPropertyArr = beanPropertyMap._propsInOrder;
        SettableBeanProperty[] settableBeanPropertyArr2 = (SettableBeanProperty[]) Arrays.copyOf(settableBeanPropertyArr, settableBeanPropertyArr.length);
        this._propsInOrder = settableBeanPropertyArr2;
        init(Arrays.asList(settableBeanPropertyArr2));
    }
}
