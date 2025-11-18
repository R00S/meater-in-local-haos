package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class StdSubtypeResolver extends SubtypeResolver implements Serializable {
    protected LinkedHashSet<NamedType> _registeredSubtypes;

    protected void _collectAndResolve(AnnotatedClass annotatedClass, NamedType namedType, MapperConfig<?> mapperConfig, AnnotationIntrospector annotationIntrospector, HashMap<NamedType, NamedType> map) {
        String strFindTypeName;
        if (!namedType.hasName() && (strFindTypeName = annotationIntrospector.findTypeName(annotatedClass)) != null) {
            namedType = new NamedType(namedType.getType(), strFindTypeName);
        }
        if (map.containsKey(namedType)) {
            if (!namedType.hasName() || map.get(namedType).hasName()) {
                return;
            }
            map.put(namedType, namedType);
            return;
        }
        map.put(namedType, namedType);
        List<NamedType> listFindSubtypes = annotationIntrospector.findSubtypes(annotatedClass);
        if (listFindSubtypes == null || listFindSubtypes.isEmpty()) {
            return;
        }
        for (NamedType namedType2 : listFindSubtypes) {
            _collectAndResolve(AnnotatedClass.constructWithoutSuperTypes(namedType2.getType(), mapperConfig), namedType2, mapperConfig, annotationIntrospector, map);
        }
    }

    protected void _collectAndResolveByTypeId(AnnotatedClass annotatedClass, NamedType namedType, MapperConfig<?> mapperConfig, Set<Class<?>> set, Map<String, NamedType> map) {
        List<NamedType> listFindSubtypes;
        String strFindTypeName;
        AnnotationIntrospector annotationIntrospector = mapperConfig.getAnnotationIntrospector();
        if (!namedType.hasName() && (strFindTypeName = annotationIntrospector.findTypeName(annotatedClass)) != null) {
            namedType = new NamedType(namedType.getType(), strFindTypeName);
        }
        if (namedType.hasName()) {
            map.put(namedType.getName(), namedType);
        }
        if (!set.add(namedType.getType()) || (listFindSubtypes = annotationIntrospector.findSubtypes(annotatedClass)) == null || listFindSubtypes.isEmpty()) {
            return;
        }
        for (NamedType namedType2 : listFindSubtypes) {
            _collectAndResolveByTypeId(AnnotatedClass.constructWithoutSuperTypes(namedType2.getType(), mapperConfig), namedType2, mapperConfig, set, map);
        }
    }

    protected Collection<NamedType> _combineNamedAndUnnamed(Set<Class<?>> set, Map<String, NamedType> map) {
        ArrayList arrayList = new ArrayList(map.values());
        Iterator<NamedType> it = map.values().iterator();
        while (it.hasNext()) {
            set.remove(it.next().getType());
        }
        Iterator<Class<?>> it2 = set.iterator();
        while (it2.hasNext()) {
            arrayList.add(new NamedType(it2.next()));
        }
        return arrayList;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.SubtypeResolver
    public Collection<NamedType> collectAndResolveSubtypesByClass(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        AnnotationIntrospector annotationIntrospector = mapperConfig.getAnnotationIntrospector();
        Class<?> rawType = javaType == null ? annotatedMember.getRawType() : javaType.getRawClass();
        HashMap<NamedType, NamedType> map = new HashMap<>();
        LinkedHashSet<NamedType> linkedHashSet = this._registeredSubtypes;
        if (linkedHashSet != null) {
            Iterator<NamedType> it = linkedHashSet.iterator();
            while (it.hasNext()) {
                NamedType next = it.next();
                if (rawType.isAssignableFrom(next.getType())) {
                    _collectAndResolve(AnnotatedClass.constructWithoutSuperTypes(next.getType(), mapperConfig), next, mapperConfig, annotationIntrospector, map);
                }
            }
        }
        List<NamedType> listFindSubtypes = annotationIntrospector.findSubtypes(annotatedMember);
        if (listFindSubtypes != null) {
            for (NamedType namedType : listFindSubtypes) {
                _collectAndResolve(AnnotatedClass.constructWithoutSuperTypes(namedType.getType(), mapperConfig), namedType, mapperConfig, annotationIntrospector, map);
            }
        }
        _collectAndResolve(AnnotatedClass.constructWithoutSuperTypes(rawType, mapperConfig), new NamedType(rawType, null), mapperConfig, annotationIntrospector, map);
        return new ArrayList(map.values());
    }

    @Override // com.fasterxml.jackson.databind.jsontype.SubtypeResolver
    public Collection<NamedType> collectAndResolveSubtypesByTypeId(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        AnnotationIntrospector annotationIntrospector = mapperConfig.getAnnotationIntrospector();
        Class<?> rawType = javaType == null ? annotatedMember.getRawType() : javaType.getRawClass();
        HashSet hashSet = new HashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        _collectAndResolveByTypeId(AnnotatedClass.constructWithoutSuperTypes(rawType, mapperConfig), new NamedType(rawType, null), mapperConfig, hashSet, linkedHashMap);
        List<NamedType> listFindSubtypes = annotationIntrospector.findSubtypes(annotatedMember);
        if (listFindSubtypes != null) {
            for (NamedType namedType : listFindSubtypes) {
                _collectAndResolveByTypeId(AnnotatedClass.constructWithoutSuperTypes(namedType.getType(), mapperConfig), namedType, mapperConfig, hashSet, linkedHashMap);
            }
        }
        LinkedHashSet<NamedType> linkedHashSet = this._registeredSubtypes;
        if (linkedHashSet != null) {
            Iterator<NamedType> it = linkedHashSet.iterator();
            while (it.hasNext()) {
                NamedType next = it.next();
                if (rawType.isAssignableFrom(next.getType())) {
                    _collectAndResolveByTypeId(AnnotatedClass.constructWithoutSuperTypes(next.getType(), mapperConfig), next, mapperConfig, hashSet, linkedHashMap);
                }
            }
        }
        return _combineNamedAndUnnamed(hashSet, linkedHashMap);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.SubtypeResolver
    public Collection<NamedType> collectAndResolveSubtypesByClass(MapperConfig<?> mapperConfig, AnnotatedClass annotatedClass) {
        AnnotationIntrospector annotationIntrospector = mapperConfig.getAnnotationIntrospector();
        HashMap<NamedType, NamedType> map = new HashMap<>();
        if (this._registeredSubtypes != null) {
            Class<?> rawType = annotatedClass.getRawType();
            Iterator<NamedType> it = this._registeredSubtypes.iterator();
            while (it.hasNext()) {
                NamedType next = it.next();
                if (rawType.isAssignableFrom(next.getType())) {
                    _collectAndResolve(AnnotatedClass.constructWithoutSuperTypes(next.getType(), mapperConfig), next, mapperConfig, annotationIntrospector, map);
                }
            }
        }
        _collectAndResolve(annotatedClass, new NamedType(annotatedClass.getRawType(), null), mapperConfig, annotationIntrospector, map);
        return new ArrayList(map.values());
    }

    @Override // com.fasterxml.jackson.databind.jsontype.SubtypeResolver
    public Collection<NamedType> collectAndResolveSubtypesByTypeId(MapperConfig<?> mapperConfig, AnnotatedClass annotatedClass) {
        HashSet hashSet = new HashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        _collectAndResolveByTypeId(annotatedClass, new NamedType(annotatedClass.getRawType(), null), mapperConfig, hashSet, linkedHashMap);
        if (this._registeredSubtypes != null) {
            Class<?> rawType = annotatedClass.getRawType();
            Iterator<NamedType> it = this._registeredSubtypes.iterator();
            while (it.hasNext()) {
                NamedType next = it.next();
                if (rawType.isAssignableFrom(next.getType())) {
                    _collectAndResolveByTypeId(AnnotatedClass.constructWithoutSuperTypes(next.getType(), mapperConfig), next, mapperConfig, hashSet, linkedHashMap);
                }
            }
        }
        return _combineNamedAndUnnamed(hashSet, linkedHashMap);
    }
}
