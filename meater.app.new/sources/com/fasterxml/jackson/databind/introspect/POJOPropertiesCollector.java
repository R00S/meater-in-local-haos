package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.util.BeanUtil;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public class POJOPropertiesCollector {
    protected final AnnotationIntrospector _annotationIntrospector;
    protected LinkedList<AnnotatedMember> _anyGetters;
    protected LinkedList<AnnotatedMember> _anySetterField;
    protected LinkedList<AnnotatedMethod> _anySetters;
    protected final AnnotatedClass _classDef;
    protected boolean _collected;
    protected final MapperConfig<?> _config;
    protected LinkedList<POJOPropertyBuilder> _creatorProperties;
    protected final boolean _forSerialization;
    protected HashSet<String> _ignoredPropertyNames;
    protected LinkedHashMap<Object, AnnotatedMember> _injectables;
    protected LinkedList<AnnotatedMethod> _jsonValueGetters;
    protected final String _mutatorPrefix;
    protected LinkedHashMap<String, POJOPropertyBuilder> _properties;
    protected final boolean _stdBeanNaming;
    protected final JavaType _type;
    protected final VisibilityChecker<?> _visibilityChecker;

    protected POJOPropertiesCollector(MapperConfig<?> mapperConfig, boolean z, JavaType javaType, AnnotatedClass annotatedClass, String str) {
        this._config = mapperConfig;
        this._stdBeanNaming = mapperConfig.isEnabled(MapperFeature.USE_STD_BEAN_NAMING);
        this._forSerialization = z;
        this._type = javaType;
        this._classDef = annotatedClass;
        this._mutatorPrefix = str == null ? "set" : str;
        AnnotationIntrospector annotationIntrospector = mapperConfig.isAnnotationProcessingEnabled() ? mapperConfig.getAnnotationIntrospector() : null;
        this._annotationIntrospector = annotationIntrospector;
        if (annotationIntrospector == null) {
            this._visibilityChecker = mapperConfig.getDefaultVisibilityChecker();
        } else {
            this._visibilityChecker = annotationIntrospector.findAutoDetectVisibility(annotatedClass, mapperConfig.getDefaultVisibilityChecker());
        }
    }

    private void _collectIgnorals(String str) {
        if (this._forSerialization) {
            return;
        }
        if (this._ignoredPropertyNames == null) {
            this._ignoredPropertyNames = new HashSet<>();
        }
        this._ignoredPropertyNames.add(str);
    }

    private PropertyNamingStrategy _findNamingStrategy() {
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        Object objFindNamingStrategy = annotationIntrospector == null ? null : annotationIntrospector.findNamingStrategy(this._classDef);
        if (objFindNamingStrategy == null) {
            return this._config.getPropertyNamingStrategy();
        }
        if (objFindNamingStrategy instanceof PropertyNamingStrategy) {
            return (PropertyNamingStrategy) objFindNamingStrategy;
        }
        if (!(objFindNamingStrategy instanceof Class)) {
            throw new IllegalStateException("AnnotationIntrospector returned PropertyNamingStrategy definition of type " + objFindNamingStrategy.getClass().getName() + "; expected type PropertyNamingStrategy or Class<PropertyNamingStrategy> instead");
        }
        Class cls = (Class) objFindNamingStrategy;
        if (cls == PropertyNamingStrategy.class) {
            return null;
        }
        if (PropertyNamingStrategy.class.isAssignableFrom(cls)) {
            if (this._config.getHandlerInstantiator() == null) {
                return (PropertyNamingStrategy) ClassUtil.createInstance(cls, this._config.canOverrideAccessModifiers());
            }
            throw null;
        }
        throw new IllegalStateException("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<PropertyNamingStrategy>");
    }

    private PropertyName _propNameFromSimple(String str) {
        return PropertyName.construct(str, null);
    }

    protected void _addCreatorParam(Map<String, POJOPropertyBuilder> map, AnnotatedParameter annotatedParameter) {
        String strFindImplicitPropertyName = this._annotationIntrospector.findImplicitPropertyName(annotatedParameter);
        if (strFindImplicitPropertyName == null) {
            strFindImplicitPropertyName = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        PropertyName propertyNameFindNameForDeserialization = this._annotationIntrospector.findNameForDeserialization(annotatedParameter);
        boolean z = (propertyNameFindNameForDeserialization == null || propertyNameFindNameForDeserialization.isEmpty()) ? false : true;
        if (!z) {
            if (strFindImplicitPropertyName.isEmpty() || !this._annotationIntrospector.hasCreatorAnnotation(annotatedParameter.getOwner())) {
                return;
            } else {
                propertyNameFindNameForDeserialization = PropertyName.construct(strFindImplicitPropertyName);
            }
        }
        PropertyName propertyName = propertyNameFindNameForDeserialization;
        POJOPropertyBuilder pOJOPropertyBuilder_property = (z && strFindImplicitPropertyName.isEmpty()) ? _property(map, propertyName) : _property(map, strFindImplicitPropertyName);
        pOJOPropertyBuilder_property.addCtor(annotatedParameter, propertyName, z, true, false);
        this._creatorProperties.add(pOJOPropertyBuilder_property);
    }

    protected void _addCreators(Map<String, POJOPropertyBuilder> map) {
        if (this._annotationIntrospector == null) {
            return;
        }
        Iterator<AnnotatedConstructor> it = this._classDef.getConstructors().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AnnotatedConstructor next = it.next();
            if (this._creatorProperties == null) {
                this._creatorProperties = new LinkedList<>();
            }
            int parameterCount = next.getParameterCount();
            for (int i2 = 0; i2 < parameterCount; i2++) {
                _addCreatorParam(map, next.getParameter(i2));
            }
        }
        for (AnnotatedMethod annotatedMethod : this._classDef.getStaticMethods()) {
            if (this._creatorProperties == null) {
                this._creatorProperties = new LinkedList<>();
            }
            int parameterCount2 = annotatedMethod.getParameterCount();
            for (int i3 = 0; i3 < parameterCount2; i3++) {
                _addCreatorParam(map, annotatedMethod.getParameter(i3));
            }
        }
    }

    protected void _addFields(Map<String, POJOPropertyBuilder> map) {
        boolean z;
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        boolean z2 = (this._forSerialization || this._config.isEnabled(MapperFeature.ALLOW_FINAL_FIELDS_AS_MUTATORS)) ? false : true;
        boolean zIsEnabled = this._config.isEnabled(MapperFeature.PROPAGATE_TRANSIENT_MARKER);
        for (AnnotatedField annotatedField : this._classDef.fields()) {
            String strFindImplicitPropertyName = annotationIntrospector == null ? null : annotationIntrospector.findImplicitPropertyName(annotatedField);
            if (strFindImplicitPropertyName == null) {
                strFindImplicitPropertyName = annotatedField.getName();
            }
            PropertyName propertyNameFindNameForSerialization = annotationIntrospector != null ? this._forSerialization ? annotationIntrospector.findNameForSerialization(annotatedField) : annotationIntrospector.findNameForDeserialization(annotatedField) : null;
            boolean z3 = propertyNameFindNameForSerialization != null;
            if (z3 && propertyNameFindNameForSerialization.isEmpty()) {
                propertyNameFindNameForSerialization = _propNameFromSimple(strFindImplicitPropertyName);
                z = false;
            } else {
                z = z3;
            }
            boolean zIsFieldVisible = propertyNameFindNameForSerialization != null;
            if (!zIsFieldVisible) {
                zIsFieldVisible = this._visibilityChecker.isFieldVisible(annotatedField);
            }
            boolean z4 = annotationIntrospector != null && annotationIntrospector.hasIgnoreMarker(annotatedField);
            if (annotatedField.isTransient() && !z3) {
                zIsFieldVisible = false;
                if (zIsEnabled) {
                    z4 = true;
                }
            }
            if (!z2 || propertyNameFindNameForSerialization != null || z4 || !Modifier.isFinal(annotatedField.getModifiers())) {
                if (annotatedField.hasAnnotation(JsonAnySetter.class)) {
                    if (this._anySetterField == null) {
                        this._anySetterField = new LinkedList<>();
                    }
                    this._anySetterField.add(annotatedField);
                }
                _property(map, strFindImplicitPropertyName).addField(annotatedField, propertyNameFindNameForSerialization, z, zIsFieldVisible, z4);
            }
        }
    }

    protected void _addGetterMethod(Map<String, POJOPropertyBuilder> map, AnnotatedMethod annotatedMethod, AnnotationIntrospector annotationIntrospector) {
        String strFindImplicitPropertyName;
        PropertyName propertyName;
        boolean z;
        boolean z2;
        boolean zIsGetterVisible;
        if (annotatedMethod.hasReturnType()) {
            if (annotationIntrospector != null) {
                if (annotationIntrospector.hasAnyGetterAnnotation(annotatedMethod)) {
                    if (this._anyGetters == null) {
                        this._anyGetters = new LinkedList<>();
                    }
                    this._anyGetters.add(annotatedMethod);
                    return;
                } else if (annotationIntrospector.hasAsValueAnnotation(annotatedMethod)) {
                    if (this._jsonValueGetters == null) {
                        this._jsonValueGetters = new LinkedList<>();
                    }
                    this._jsonValueGetters.add(annotatedMethod);
                    return;
                }
            }
            PropertyName propertyNameFindNameForSerialization = annotationIntrospector == null ? null : annotationIntrospector.findNameForSerialization(annotatedMethod);
            boolean z3 = propertyNameFindNameForSerialization != null;
            if (z3) {
                strFindImplicitPropertyName = annotationIntrospector != null ? annotationIntrospector.findImplicitPropertyName(annotatedMethod) : null;
                if (strFindImplicitPropertyName == null) {
                    strFindImplicitPropertyName = BeanUtil.okNameForGetter(annotatedMethod, this._stdBeanNaming);
                }
                if (strFindImplicitPropertyName == null) {
                    strFindImplicitPropertyName = annotatedMethod.getName();
                }
                if (propertyNameFindNameForSerialization.isEmpty()) {
                    propertyNameFindNameForSerialization = _propNameFromSimple(strFindImplicitPropertyName);
                    z3 = false;
                }
                propertyName = propertyNameFindNameForSerialization;
                z = z3;
                z2 = true;
            } else {
                strFindImplicitPropertyName = annotationIntrospector != null ? annotationIntrospector.findImplicitPropertyName(annotatedMethod) : null;
                if (strFindImplicitPropertyName == null) {
                    strFindImplicitPropertyName = BeanUtil.okNameForRegularGetter(annotatedMethod, annotatedMethod.getName(), this._stdBeanNaming);
                }
                if (strFindImplicitPropertyName == null) {
                    strFindImplicitPropertyName = BeanUtil.okNameForIsGetter(annotatedMethod, annotatedMethod.getName(), this._stdBeanNaming);
                    if (strFindImplicitPropertyName == null) {
                        return;
                    } else {
                        zIsGetterVisible = this._visibilityChecker.isIsGetterVisible(annotatedMethod);
                    }
                } else {
                    zIsGetterVisible = this._visibilityChecker.isGetterVisible(annotatedMethod);
                }
                propertyName = propertyNameFindNameForSerialization;
                z2 = zIsGetterVisible;
                z = z3;
            }
            _property(map, strFindImplicitPropertyName).addGetter(annotatedMethod, propertyName, z, z2, annotationIntrospector == null ? false : annotationIntrospector.hasIgnoreMarker(annotatedMethod));
        }
    }

    protected void _addInjectables(Map<String, POJOPropertyBuilder> map) {
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        if (annotationIntrospector == null) {
            return;
        }
        for (AnnotatedMember annotatedMember : this._classDef.fields()) {
            _doAddInjectable(annotationIntrospector.findInjectableValueId(annotatedMember), annotatedMember);
        }
        for (AnnotatedMethod annotatedMethod : this._classDef.memberMethods()) {
            if (annotatedMethod.getParameterCount() == 1) {
                _doAddInjectable(annotationIntrospector.findInjectableValueId(annotatedMethod), annotatedMethod);
            }
        }
    }

    protected void _addMethods(Map<String, POJOPropertyBuilder> map) {
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        for (AnnotatedMethod annotatedMethod : this._classDef.memberMethods()) {
            int parameterCount = annotatedMethod.getParameterCount();
            if (parameterCount == 0) {
                _addGetterMethod(map, annotatedMethod, annotationIntrospector);
            } else if (parameterCount == 1) {
                _addSetterMethod(map, annotatedMethod, annotationIntrospector);
            } else if (parameterCount == 2 && annotationIntrospector != null && annotationIntrospector.hasAnySetterAnnotation(annotatedMethod)) {
                if (this._anySetters == null) {
                    this._anySetters = new LinkedList<>();
                }
                this._anySetters.add(annotatedMethod);
            }
        }
    }

    protected void _addSetterMethod(Map<String, POJOPropertyBuilder> map, AnnotatedMethod annotatedMethod, AnnotationIntrospector annotationIntrospector) {
        String strFindImplicitPropertyName;
        PropertyName propertyName;
        boolean z;
        boolean zIsSetterVisible;
        PropertyName propertyNameFindNameForDeserialization = annotationIntrospector == null ? null : annotationIntrospector.findNameForDeserialization(annotatedMethod);
        boolean z2 = propertyNameFindNameForDeserialization != null;
        if (z2) {
            strFindImplicitPropertyName = annotationIntrospector != null ? annotationIntrospector.findImplicitPropertyName(annotatedMethod) : null;
            if (strFindImplicitPropertyName == null) {
                strFindImplicitPropertyName = BeanUtil.okNameForMutator(annotatedMethod, this._mutatorPrefix, this._stdBeanNaming);
            }
            if (strFindImplicitPropertyName == null) {
                strFindImplicitPropertyName = annotatedMethod.getName();
            }
            if (propertyNameFindNameForDeserialization.isEmpty()) {
                propertyNameFindNameForDeserialization = _propNameFromSimple(strFindImplicitPropertyName);
                z2 = false;
            }
            propertyName = propertyNameFindNameForDeserialization;
            z = z2;
            zIsSetterVisible = true;
        } else {
            strFindImplicitPropertyName = annotationIntrospector != null ? annotationIntrospector.findImplicitPropertyName(annotatedMethod) : null;
            if (strFindImplicitPropertyName == null) {
                strFindImplicitPropertyName = BeanUtil.okNameForMutator(annotatedMethod, this._mutatorPrefix, this._stdBeanNaming);
            }
            if (strFindImplicitPropertyName == null) {
                return;
            }
            propertyName = propertyNameFindNameForDeserialization;
            zIsSetterVisible = this._visibilityChecker.isSetterVisible(annotatedMethod);
            z = z2;
        }
        _property(map, strFindImplicitPropertyName).addSetter(annotatedMethod, propertyName, z, zIsSetterVisible, annotationIntrospector == null ? false : annotationIntrospector.hasIgnoreMarker(annotatedMethod));
    }

    protected void _doAddInjectable(Object obj, AnnotatedMember annotatedMember) {
        if (obj == null) {
            return;
        }
        if (this._injectables == null) {
            this._injectables = new LinkedHashMap<>();
        }
        if (this._injectables.put(obj, annotatedMember) == null) {
            return;
        }
        throw new IllegalArgumentException("Duplicate injectable value with id '" + String.valueOf(obj) + "' (of type " + obj.getClass().getName() + ")");
    }

    protected POJOPropertyBuilder _property(Map<String, POJOPropertyBuilder> map, PropertyName propertyName) {
        return _property(map, propertyName.getSimpleName());
    }

    protected void _removeUnwantedAccessor(Map<String, POJOPropertyBuilder> map) {
        boolean zIsEnabled = this._config.isEnabled(MapperFeature.INFER_PROPERTY_MUTATORS);
        Iterator<POJOPropertyBuilder> it = map.values().iterator();
        while (it.hasNext()) {
            it.next().removeNonVisible(zIsEnabled);
        }
    }

    protected void _removeUnwantedProperties(Map<String, POJOPropertyBuilder> map) {
        Iterator<POJOPropertyBuilder> it = map.values().iterator();
        while (it.hasNext()) {
            POJOPropertyBuilder next = it.next();
            if (!next.anyVisible()) {
                it.remove();
            } else if (next.anyIgnorals()) {
                if (next.isExplicitlyIncluded()) {
                    next.removeIgnored();
                    if (!this._forSerialization && !next.couldDeserialize()) {
                        _collectIgnorals(next.getName());
                    }
                } else {
                    it.remove();
                    _collectIgnorals(next.getName());
                }
            }
        }
    }

    protected void _renameProperties(Map<String, POJOPropertyBuilder> map) {
        Iterator<Map.Entry<String, POJOPropertyBuilder>> it = map.entrySet().iterator();
        LinkedList linkedList = null;
        while (it.hasNext()) {
            POJOPropertyBuilder value = it.next().getValue();
            Set<PropertyName> setFindExplicitNames = value.findExplicitNames();
            if (!setFindExplicitNames.isEmpty()) {
                it.remove();
                if (linkedList == null) {
                    linkedList = new LinkedList();
                }
                if (setFindExplicitNames.size() == 1) {
                    linkedList.add(value.withName(setFindExplicitNames.iterator().next()));
                } else {
                    linkedList.addAll(value.explode(setFindExplicitNames));
                }
            }
        }
        if (linkedList != null) {
            Iterator it2 = linkedList.iterator();
            while (it2.hasNext()) {
                POJOPropertyBuilder pOJOPropertyBuilder = (POJOPropertyBuilder) it2.next();
                String name = pOJOPropertyBuilder.getName();
                POJOPropertyBuilder pOJOPropertyBuilder2 = map.get(name);
                if (pOJOPropertyBuilder2 == null) {
                    map.put(name, pOJOPropertyBuilder);
                } else {
                    pOJOPropertyBuilder2.addAll(pOJOPropertyBuilder);
                }
                _updateCreatorProperty(pOJOPropertyBuilder, this._creatorProperties);
            }
        }
    }

    protected void _renameUsing(Map<String, POJOPropertyBuilder> map, PropertyNamingStrategy propertyNamingStrategy) {
        POJOPropertyBuilder[] pOJOPropertyBuilderArr = (POJOPropertyBuilder[]) map.values().toArray(new POJOPropertyBuilder[map.size()]);
        map.clear();
        for (POJOPropertyBuilder pOJOPropertyBuilderWithSimpleName : pOJOPropertyBuilderArr) {
            PropertyName fullName = pOJOPropertyBuilderWithSimpleName.getFullName();
            String strNameForGetterMethod = null;
            if (!pOJOPropertyBuilderWithSimpleName.isExplicitlyNamed() || this._config.isEnabled(MapperFeature.ALLOW_EXPLICIT_PROPERTY_RENAMING)) {
                if (this._forSerialization) {
                    if (pOJOPropertyBuilderWithSimpleName.hasGetter()) {
                        strNameForGetterMethod = propertyNamingStrategy.nameForGetterMethod(this._config, pOJOPropertyBuilderWithSimpleName.getGetter(), fullName.getSimpleName());
                    } else if (pOJOPropertyBuilderWithSimpleName.hasField()) {
                        strNameForGetterMethod = propertyNamingStrategy.nameForField(this._config, pOJOPropertyBuilderWithSimpleName.getField(), fullName.getSimpleName());
                    }
                } else if (pOJOPropertyBuilderWithSimpleName.hasSetter()) {
                    strNameForGetterMethod = propertyNamingStrategy.nameForSetterMethod(this._config, pOJOPropertyBuilderWithSimpleName.getSetter(), fullName.getSimpleName());
                } else if (pOJOPropertyBuilderWithSimpleName.hasConstructorParameter()) {
                    strNameForGetterMethod = propertyNamingStrategy.nameForConstructorParameter(this._config, pOJOPropertyBuilderWithSimpleName.getConstructorParameter(), fullName.getSimpleName());
                } else if (pOJOPropertyBuilderWithSimpleName.hasField()) {
                    strNameForGetterMethod = propertyNamingStrategy.nameForField(this._config, pOJOPropertyBuilderWithSimpleName.getField(), fullName.getSimpleName());
                } else if (pOJOPropertyBuilderWithSimpleName.hasGetter()) {
                    strNameForGetterMethod = propertyNamingStrategy.nameForGetterMethod(this._config, pOJOPropertyBuilderWithSimpleName.getGetter(), fullName.getSimpleName());
                }
            }
            if (strNameForGetterMethod == null || fullName.hasSimpleName(strNameForGetterMethod)) {
                strNameForGetterMethod = fullName.getSimpleName();
            } else {
                pOJOPropertyBuilderWithSimpleName = pOJOPropertyBuilderWithSimpleName.withSimpleName(strNameForGetterMethod);
            }
            POJOPropertyBuilder pOJOPropertyBuilder = map.get(strNameForGetterMethod);
            if (pOJOPropertyBuilder == null) {
                map.put(strNameForGetterMethod, pOJOPropertyBuilderWithSimpleName);
            } else {
                pOJOPropertyBuilder.addAll(pOJOPropertyBuilderWithSimpleName);
            }
            _updateCreatorProperty(pOJOPropertyBuilderWithSimpleName, this._creatorProperties);
        }
    }

    protected void _renameWithWrappers(Map<String, POJOPropertyBuilder> map) {
        PropertyName propertyNameFindWrapperName;
        Iterator<Map.Entry<String, POJOPropertyBuilder>> it = map.entrySet().iterator();
        LinkedList linkedList = null;
        while (it.hasNext()) {
            POJOPropertyBuilder value = it.next().getValue();
            AnnotatedMember primaryMember = value.getPrimaryMember();
            if (primaryMember != null && (propertyNameFindWrapperName = this._annotationIntrospector.findWrapperName(primaryMember)) != null && propertyNameFindWrapperName.hasSimpleName() && !propertyNameFindWrapperName.equals(value.getFullName())) {
                if (linkedList == null) {
                    linkedList = new LinkedList();
                }
                linkedList.add(value.withName(propertyNameFindWrapperName));
                it.remove();
            }
        }
        if (linkedList != null) {
            Iterator it2 = linkedList.iterator();
            while (it2.hasNext()) {
                POJOPropertyBuilder pOJOPropertyBuilder = (POJOPropertyBuilder) it2.next();
                String name = pOJOPropertyBuilder.getName();
                POJOPropertyBuilder pOJOPropertyBuilder2 = map.get(name);
                if (pOJOPropertyBuilder2 == null) {
                    map.put(name, pOJOPropertyBuilder);
                } else {
                    pOJOPropertyBuilder2.addAll(pOJOPropertyBuilder);
                }
            }
        }
    }

    protected void _sortProperties(Map<String, POJOPropertyBuilder> map) {
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        Boolean boolFindSerializationSortAlphabetically = annotationIntrospector == null ? null : annotationIntrospector.findSerializationSortAlphabetically(this._classDef);
        boolean zShouldSortPropertiesAlphabetically = boolFindSerializationSortAlphabetically == null ? this._config.shouldSortPropertiesAlphabetically() : boolFindSerializationSortAlphabetically.booleanValue();
        String[] strArrFindSerializationPropertyOrder = annotationIntrospector != null ? annotationIntrospector.findSerializationPropertyOrder(this._classDef) : null;
        if (!zShouldSortPropertiesAlphabetically && this._creatorProperties == null && strArrFindSerializationPropertyOrder == null) {
            return;
        }
        int size = map.size();
        Map<? extends Object, ? extends Object> treeMap = zShouldSortPropertiesAlphabetically ? new TreeMap<>() : new LinkedHashMap<>(size + size);
        for (POJOPropertyBuilder pOJOPropertyBuilder : map.values()) {
            treeMap.put(pOJOPropertyBuilder.getName(), pOJOPropertyBuilder);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(size + size);
        if (strArrFindSerializationPropertyOrder != null) {
            for (String name : strArrFindSerializationPropertyOrder) {
                POJOPropertyBuilder pOJOPropertyBuilder2 = (POJOPropertyBuilder) treeMap.get(name);
                if (pOJOPropertyBuilder2 == null) {
                    Iterator<POJOPropertyBuilder> it = map.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        POJOPropertyBuilder next = it.next();
                        if (name.equals(next.getInternalName())) {
                            name = next.getName();
                            pOJOPropertyBuilder2 = next;
                            break;
                        }
                    }
                }
                if (pOJOPropertyBuilder2 != null) {
                    linkedHashMap.put(name, pOJOPropertyBuilder2);
                }
            }
        }
        Collection<POJOPropertyBuilder> collectionValues = this._creatorProperties;
        if (collectionValues != null) {
            if (zShouldSortPropertiesAlphabetically) {
                TreeMap treeMap2 = new TreeMap();
                Iterator<POJOPropertyBuilder> it2 = this._creatorProperties.iterator();
                while (it2.hasNext()) {
                    POJOPropertyBuilder next2 = it2.next();
                    treeMap2.put(next2.getName(), next2);
                }
                collectionValues = treeMap2.values();
            }
            for (POJOPropertyBuilder pOJOPropertyBuilder3 : collectionValues) {
                linkedHashMap.put(pOJOPropertyBuilder3.getName(), pOJOPropertyBuilder3);
            }
        }
        linkedHashMap.putAll(treeMap);
        map.clear();
        map.putAll(linkedHashMap);
    }

    protected void _updateCreatorProperty(POJOPropertyBuilder pOJOPropertyBuilder, List<POJOPropertyBuilder> list) {
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (list.get(i2).getInternalName().equals(pOJOPropertyBuilder.getInternalName())) {
                    list.set(i2, pOJOPropertyBuilder);
                    return;
                }
            }
        }
    }

    protected void collectAll() {
        LinkedHashMap<String, POJOPropertyBuilder> linkedHashMap = new LinkedHashMap<>();
        _addFields(linkedHashMap);
        _addMethods(linkedHashMap);
        _addCreators(linkedHashMap);
        _addInjectables(linkedHashMap);
        _removeUnwantedProperties(linkedHashMap);
        Iterator<POJOPropertyBuilder> it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            it.next().mergeAnnotations(this._forSerialization);
        }
        _removeUnwantedAccessor(linkedHashMap);
        _renameProperties(linkedHashMap);
        PropertyNamingStrategy propertyNamingStrategy_findNamingStrategy = _findNamingStrategy();
        if (propertyNamingStrategy_findNamingStrategy != null) {
            _renameUsing(linkedHashMap, propertyNamingStrategy_findNamingStrategy);
        }
        Iterator<POJOPropertyBuilder> it2 = linkedHashMap.values().iterator();
        while (it2.hasNext()) {
            it2.next().trimByVisibility();
        }
        if (this._config.isEnabled(MapperFeature.USE_WRAPPER_NAME_AS_PROPERTY_NAME)) {
            _renameWithWrappers(linkedHashMap);
        }
        _sortProperties(linkedHashMap);
        this._properties = linkedHashMap;
        this._collected = true;
    }

    public AnnotatedMember getAnyGetter() {
        if (!this._collected) {
            collectAll();
        }
        LinkedList<AnnotatedMember> linkedList = this._anyGetters;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            reportProblem("Multiple 'any-getters' defined (" + this._anyGetters.get(0) + " vs " + this._anyGetters.get(1) + ")");
        }
        return this._anyGetters.getFirst();
    }

    public AnnotatedMember getAnySetterField() {
        if (!this._collected) {
            collectAll();
        }
        LinkedList<AnnotatedMember> linkedList = this._anySetterField;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            reportProblem("Multiple 'any-Setters' defined (" + this._anySetters.get(0) + " vs " + this._anySetterField.get(1) + ")");
        }
        return this._anySetterField.getFirst();
    }

    public AnnotatedMethod getAnySetterMethod() {
        if (!this._collected) {
            collectAll();
        }
        LinkedList<AnnotatedMethod> linkedList = this._anySetters;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            reportProblem("Multiple 'any-setters' defined (" + this._anySetters.get(0) + " vs " + this._anySetters.get(1) + ")");
        }
        return this._anySetters.getFirst();
    }

    public AnnotatedClass getClassDef() {
        return this._classDef;
    }

    public MapperConfig<?> getConfig() {
        return this._config;
    }

    public Set<String> getIgnoredPropertyNames() {
        return this._ignoredPropertyNames;
    }

    public Map<Object, AnnotatedMember> getInjectables() {
        if (!this._collected) {
            collectAll();
        }
        return this._injectables;
    }

    public AnnotatedMethod getJsonValueMethod() {
        if (!this._collected) {
            collectAll();
        }
        LinkedList<AnnotatedMethod> linkedList = this._jsonValueGetters;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            reportProblem("Multiple value properties defined (" + this._jsonValueGetters.get(0) + " vs " + this._jsonValueGetters.get(1) + ")");
        }
        return this._jsonValueGetters.get(0);
    }

    public ObjectIdInfo getObjectIdInfo() {
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        if (annotationIntrospector == null) {
            return null;
        }
        ObjectIdInfo objectIdInfoFindObjectIdInfo = annotationIntrospector.findObjectIdInfo(this._classDef);
        return objectIdInfoFindObjectIdInfo != null ? this._annotationIntrospector.findObjectReferenceInfo(this._classDef, objectIdInfoFindObjectIdInfo) : objectIdInfoFindObjectIdInfo;
    }

    public List<BeanPropertyDefinition> getProperties() {
        return new ArrayList(getPropertyMap().values());
    }

    protected Map<String, POJOPropertyBuilder> getPropertyMap() {
        if (!this._collected) {
            collectAll();
        }
        return this._properties;
    }

    public JavaType getType() {
        return this._type;
    }

    protected void reportProblem(String str) {
        throw new IllegalArgumentException("Problem with definition of " + this._classDef + ": " + str);
    }

    protected POJOPropertyBuilder _property(Map<String, POJOPropertyBuilder> map, String str) {
        POJOPropertyBuilder pOJOPropertyBuilder = map.get(str);
        if (pOJOPropertyBuilder != null) {
            return pOJOPropertyBuilder;
        }
        POJOPropertyBuilder pOJOPropertyBuilder2 = new POJOPropertyBuilder(this._config, this._annotationIntrospector, this._forSerialization, PropertyName.construct(str));
        map.put(str, pOJOPropertyBuilder2);
        return pOJOPropertyBuilder2;
    }
}
